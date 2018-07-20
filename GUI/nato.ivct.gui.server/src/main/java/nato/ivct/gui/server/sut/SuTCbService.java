package nato.ivct.gui.server.sut;

import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.HashMap;

import org.eclipse.scout.rt.platform.BEANS;
import org.eclipse.scout.rt.platform.exception.VetoException;
import org.eclipse.scout.rt.shared.TEXTS;
import org.eclipse.scout.rt.shared.services.common.jdbc.SearchFilter;
import org.eclipse.scout.rt.shared.services.common.security.ACCESS;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import nato.ivct.commander.BadgeDescription;
import nato.ivct.commander.BadgeDescription.InteroperabilityRequirement;
import nato.ivct.commander.Factory;
import nato.ivct.gui.server.ServerSession;
import nato.ivct.gui.server.cb.CbService;
import nato.ivct.gui.shared.cb.CreateCbPermission;
import nato.ivct.gui.shared.cb.ReadCbPermission;
import nato.ivct.gui.shared.cb.UpdateCbPermission;
import nato.ivct.gui.shared.sut.ISuTCbService;
import nato.ivct.gui.shared.sut.SuTCbFormData;
import nato.ivct.gui.shared.sut.SuTCbFormData.CbRequirementsTable.CbRequirementsTableRowData;
import nato.ivct.gui.shared.sut.SuTCbFormData.SuTCbParameterTable.SuTCbParameterTableRowData;
import nato.ivct.gui.shared.sut.SuTCbTablePageData;
import nato.ivct.gui.shared.sut.SuTCbTablePageData.SuTCbTableRowData;

public class SuTCbService implements ISuTCbService {
	private static final Logger LOG = LoggerFactory.getLogger(ServerSession.class);
	private static HashMap<String, SuTCbTablePageData> cap_hm = new HashMap<String, SuTCbTablePageData>();

//	public static SuTCbTablePageData getCapabilityTablePageData (String sut) {
//		return cap_hm.get (sut);
//	}
	
	/*
	 * get CapapbilityTablePageData for a specific SuT id. Create new one or select existing
	 * 
	 * @see nato.ivct.gui.shared.sut.ICapabilityService#getCapabilityTableData(org.eclipse.scout.rt.shared.services.common.jdbc.SearchFilter)
	 */
	@Override
	public SuTCbTablePageData getSuTCbTableData(SearchFilter filter) {
		String[] searchText = filter.getDisplayTexts();
		SuTCbTablePageData pageData = cap_hm.get (searchText);
		if (pageData == null) {
			pageData = new SuTCbTablePageData();
		}

		LOG.info("getCapabilityTableData");
		CbService cbService = BEANS.get(CbService.class);
		BadgeDescription badge = cbService.getBadgeDescription(searchText[0]);
		for (int j = 0; j < badge.requirements.length; j++) {
			SuTCbTableRowData row = pageData.addRow();
			row.setRequirementId(badge.requirements[j].ID);
			row.setRequirementDesc(badge.requirements[j].description);
			row.setAbstractTC(badge.requirements[j].TC);
			row.setTCstatus("no result");
		}
		
		cap_hm.put(badge.ID, pageData);
		return pageData;
	}

	public void executeTestCase(String sutId, String tc, String badgeId) {
		// execute the CmdStartTc commands
		CbService cbService = BEANS.get(CbService.class);
		BadgeDescription b = cbService.getBadgeDescription(badgeId);
		ServerSession.get().execStartTc(sutId, tc, badgeId, b.tsRunTimeFolder);
		// mark test cases as being started
		SuTCbTablePageData capPage = cap_hm.get(badgeId);
		if (capPage == null) {
			LOG.error("no capability map found for badge: " + badgeId);
		} else {
			for (int i = 0; i < capPage.getRowCount(); i++) {
				SuTCbTableRowData row = capPage.rowAt(i);
				if (row.getAbstractTC().equals(tc)) {
					row.setTCstatus("starting");
				}
			}
		}
	}

	@Override
	public SuTCbFormData load(SuTCbFormData formData) {
		LOG.info("load");
		if (!ACCESS.check(new ReadCbPermission())) {
			throw new VetoException(TEXTS.get("AuthorizationFailed"));
		}

		CbService cbService = BEANS.get(CbService.class);
		BadgeDescription bd = cbService.getBadgeDescription(formData.getCbId());
		formData.getCbName().setValue(bd.name);
		formData.getCbDescription().setValue(bd.description);
		
		// TODO fill parameter table of this form
		Path paramFile = Paths.get(Factory.props.getProperty(Factory.IVCT_SUT_HOME_ID), formData.getSutId(), bd.ID, "TcParam.json");
		JSONParser parser = new JSONParser();
		try {
			JSONObject jsonObj = (JSONObject) parser.parse(new FileReader(paramFile.toString()));
			LOG.trace(jsonObj.toString());
			
			jsonObj.forEach((key, value) -> {
				SuTCbParameterTableRowData row = formData.getSuTCbParameterTable().addRow();
				row.setParameterName(key.toString());
				row.setParameterValue(value.toString());
			});
		} catch (IOException | ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		// fill requirement table of this form
		for (InteroperabilityRequirement requirement:bd.requirements) {
			CbRequirementsTableRowData row = formData.getCbRequirementsTable().addRow();
			row.setRequirementId(requirement.ID);
			row.setRequirementDesc(requirement.description);
			row.setAbstractTC(requirement.TC);
		}

		return formData;
	}

	@Override
	public SuTCbFormData store(SuTCbFormData formData) {
		LOG.info("store");
		if (!ACCESS.check(new UpdateCbPermission())) {
			throw new VetoException(TEXTS.get("AuthorizationFailed"));
		}
		return formData;
	}

	@Override
	public SuTCbFormData prepareCreate(SuTCbFormData formData) {
		LOG.info("prepareCreate");
		if (!ACCESS.check(new CreateCbPermission())) {
			throw new VetoException(TEXTS.get("AuthorizationFailed"));
		}
		return formData;
	}

	@Override
	public SuTCbFormData create(SuTCbFormData formData) {
		LOG.info("create");
		if (!ACCESS.check(new CreateCbPermission())) {
			throw new VetoException(TEXTS.get("AuthorizationFailed"));
		}
		return formData;
	}
}