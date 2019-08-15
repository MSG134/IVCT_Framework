package nato.ivct.gui.server.ts;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

import org.eclipse.scout.rt.platform.BEANS;
import org.eclipse.scout.rt.platform.job.IFuture;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import nato.ivct.commander.CmdListTestSuites;
import nato.ivct.commander.CmdListTestSuites.TestSuiteDescription;
import nato.ivct.commander.InteroperabilityRequirement;
import nato.ivct.gui.server.ServerSession;
import nato.ivct.gui.server.cb.CbService;
import nato.ivct.gui.shared.cb.ITsService;
import nato.ivct.gui.shared.sut.SuTCbFormData.CbRequirementsTable;
import nato.ivct.gui.shared.ts.TsFormData;
import nato.ivct.gui.shared.ts.TsFormData.TsRequirementsTable;
import nato.ivct.gui.shared.ts.TsFormData.TsRequirementsTable.TsRequirementsTableRowData;

public class TsService implements ITsService {

	private static final Logger LOG = LoggerFactory.getLogger(ServerSession.class);

	private CmdListTestSuites tsCmd = null;

	@Override
	public Set<String> loadTestSuites() {
		if (tsCmd == null)
			// load badge descriptions
			waitFortestSuiteLoading(); 

		return new TreeSet<>(tsCmd.testsuites.keySet());
	}

	public TestSuiteDescription getTsDescription(String tsId) {
		if (tsCmd == null)
			waitFortestSuiteLoading();
		return tsCmd.testsuites.get(tsId);
	}

	void waitFortestSuiteLoading () {
		// wait until load badges job is finished
		IFuture<CmdListTestSuites> future = ServerSession.get().getLoadTestSuitesJob();
		tsCmd = future.awaitDoneAndGet();
	}

	@Override
	public TsFormData load(TsFormData formData) {
		LOG.info("load testsuite description");
//		if (!ACCESS.check(new ReadTsPermission())) {
//			throw new VetoException(TEXTS.get("AuthorizationFailed"));
//		}
		TestSuiteDescription ts = tsCmd.testsuites.get(formData.getTsId());
		formData.getTsName().setValue(ts.name);
		formData.getTsVersion().setValue(ts.version);
		formData.getTsDescription().setValue(ts.description);

		// test case list is built in TsTestcaseLookupService class
		return formData;
	}
	


	@Override
	public TsRequirementsTable loadRequirementsForTc(final Set<String> testcases) {
		TsRequirementsTable tsRequirementTableRows = new TsRequirementsTable();
		Set<String> irIdList = new HashSet<>();
		
		testcases.forEach(tc->irIdList.addAll(tsCmd.getIrForTc(tc)));
			
		CbService cbService = BEANS.get(CbService.class);
		for (String irId:irIdList) {
			InteroperabilityRequirement ir = cbService.getIrDescription(irId);
			TsRequirementsTableRowData row = tsRequirementTableRows.addRow();
			row.setRequirementId(ir.ID);
			row.setRequirementDesc(ir.description);
		}

		return tsRequirementTableRows;
	}
}
