
package nato.ivct.gui.shared.sut;

import javax.annotation.Generated;

import org.eclipse.scout.rt.shared.data.basic.table.AbstractTableRowData;
import org.eclipse.scout.rt.shared.data.page.AbstractTablePageData;

/**
 * <b>NOTE:</b><br>
 * This class is auto generated by the Scout SDK. No manual modifications
 * recommended.
 * 
 * @generated
 */
@Generated(value = "org.eclipse.scout.sdk.workspace.dto.pagedata.PageDataDtoUpdateOperation", comments = "This class is auto generated by the Scout SDK. No manual modifications recommended.")
public class CapabilityTablePageData extends AbstractTablePageData {

	private static final long serialVersionUID = 1L;

	public CapabilityTablePageData() {
	}

	@Override
	public CapabilityTableRowData addRow() {
		return (CapabilityTableRowData) super.addRow();
	}

	@Override
	public CapabilityTableRowData addRow(int rowState) {
		return (CapabilityTableRowData) super.addRow(rowState);
	}

	@Override
	public CapabilityTableRowData createRow() {
		return new CapabilityTableRowData();
	}

	@Override
	public Class<? extends AbstractTableRowData> getRowType() {
		return CapabilityTableRowData.class;
	}

	@Override
	public CapabilityTableRowData[] getRows() {
		return (CapabilityTableRowData[]) super.getRows();
	}

	@Override
	public CapabilityTableRowData rowAt(int index) {
		return (CapabilityTableRowData) super.rowAt(index);
	}

	public void setRows(CapabilityTableRowData[] rows) {
		super.setRows(rows);
	}

	public static class CapabilityTableRowData extends AbstractTableRowData {

		private static final long serialVersionUID = 1L;
		public static final String badgeId = "badgeId";
		public static final String requirementId = "requirementId";
		public static final String requirementDesc = "requirementDesc";
		public static final String abstractTC = "abstractTC";
		public static final String tCresult = "tCresult";
		private String m_badgeId;
		private String m_requirementId;
		private String m_requirementDesc;
		private String m_abstractTC;
		private String m_tCresult;

		public CapabilityTableRowData() {
		}

		public String getBadgeId() {
			return m_badgeId;
		}

		public void setBadgeId(String badgeId) {
			m_badgeId = badgeId;
		}

		public String getRequirementId() {
			return m_requirementId;
		}

		public void setRequirementId(String requirementId) {
			m_requirementId = requirementId;
		}

		public String getRequirementDesc() {
			return m_requirementDesc;
		}

		public void setRequirementDesc(String requirementDesc) {
			m_requirementDesc = requirementDesc;
		}

		public String getAbstractTC() {
			return m_abstractTC;
		}

		public void setAbstractTC(String abstractTC) {
			m_abstractTC = abstractTC;
		}

		public String getTCresult() {
			return m_tCresult;
		}

		public void setTCresult(String tCresult) {
			m_tCresult = tCresult;
		}
	}
}