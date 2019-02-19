package nato.ivct.gui.shared.sut;

import javax.annotation.Generated;

import org.eclipse.scout.rt.shared.data.basic.table.AbstractTableRowData;
import org.eclipse.scout.rt.shared.data.form.AbstractFormData;
import org.eclipse.scout.rt.shared.data.form.fields.AbstractValueFieldData;
import org.eclipse.scout.rt.shared.data.form.fields.tablefield.AbstractTableFieldBeanData;
import org.eclipse.scout.rt.shared.data.form.properties.AbstractPropertyData;

/**
 * <b>NOTE:</b><br>
 * This class is auto generated by the Scout SDK. No manual modifications
 * recommended.
 */
@Generated(value = "nato.ivct.gui.client.sut.SuTForm", comments = "This class is auto generated by the Scout SDK. No manual modifications recommended.")
public class SuTFormData extends AbstractFormData {

	private static final long serialVersionUID = 1L;

	public Descr getDescr() {
		return getFieldByClass(Descr.class);
	}

	public Name getName() {
		return getFieldByClass(Name.class);
	}

	public SutCapabilityStatusTable getSutCapabilityStatusTable() {
		return getFieldByClass(SutCapabilityStatusTable.class);
	}

	/**
	 * access method for property SutId.
	 */
	public String getSutId() {
		return getSutIdProperty().getValue();
	}

	/**
	 * access method for property SutId.
	 */
	public void setSutId(String sutId) {
		getSutIdProperty().setValue(sutId);
	}

	public SutIdProperty getSutIdProperty() {
		return getPropertyByClass(SutIdProperty.class);
	}

	public SutVendor getSutVendor() {
		return getFieldByClass(SutVendor.class);
	}

	public TestReportTable getTestReportTable() {
		return getFieldByClass(TestReportTable.class);
	}

	public Version getVersion() {
		return getFieldByClass(Version.class);
	}

	public static class Descr extends AbstractValueFieldData<String> {

		private static final long serialVersionUID = 1L;
	}

	public static class Name extends AbstractValueFieldData<String> {

		private static final long serialVersionUID = 1L;
	}

	public static class SutCapabilityStatusTable extends AbstractTableFieldBeanData {

		private static final long serialVersionUID = 1L;

		@Override
		public SutCapabilityStatusTableRowData addRow() {
			return (SutCapabilityStatusTableRowData) super.addRow();
		}

		@Override
		public SutCapabilityStatusTableRowData addRow(int rowState) {
			return (SutCapabilityStatusTableRowData) super.addRow(rowState);
		}

		@Override
		public SutCapabilityStatusTableRowData createRow() {
			return new SutCapabilityStatusTableRowData();
		}

		@Override
		public Class<? extends AbstractTableRowData> getRowType() {
			return SutCapabilityStatusTableRowData.class;
		}

		@Override
		public SutCapabilityStatusTableRowData[] getRows() {
			return (SutCapabilityStatusTableRowData[]) super.getRows();
		}

		@Override
		public SutCapabilityStatusTableRowData rowAt(int index) {
			return (SutCapabilityStatusTableRowData) super.rowAt(index);
		}

		public void setRows(SutCapabilityStatusTableRowData[] rows) {
			super.setRows(rows);
		}

		public static class SutCapabilityStatusTableRowData extends AbstractTableRowData {

			private static final long serialVersionUID = 1L;
			public static final String cbBadgeID = "cbBadgeID";
			public static final String cbBadgeStatus = "cbBadgeStatus";
			private String m_cbBadgeID;
			private String m_cbBadgeStatus;

			public String getCbBadgeID() {
				return m_cbBadgeID;
			}

			public void setCbBadgeID(String newCbBadgeID) {
				m_cbBadgeID = newCbBadgeID;
			}

			public String getCbBadgeStatus() {
				return m_cbBadgeStatus;
			}

			public void setCbBadgeStatus(String newCbBadgeStatus) {
				m_cbBadgeStatus = newCbBadgeStatus;
			}
		}
	}

	public static class SutIdProperty extends AbstractPropertyData<String> {

		private static final long serialVersionUID = 1L;
	}

	public static class SutVendor extends AbstractValueFieldData<String> {

		private static final long serialVersionUID = 1L;
	}

	public static class TestReportTable extends AbstractTableFieldBeanData {

		private static final long serialVersionUID = 1L;

		@Override
		public TestReportTableRowData addRow() {
			return (TestReportTableRowData) super.addRow();
		}

		@Override
		public TestReportTableRowData addRow(int rowState) {
			return (TestReportTableRowData) super.addRow(rowState);
		}

		@Override
		public TestReportTableRowData createRow() {
			return new TestReportTableRowData();
		}

		@Override
		public Class<? extends AbstractTableRowData> getRowType() {
			return TestReportTableRowData.class;
		}

		@Override
		public TestReportTableRowData[] getRows() {
			return (TestReportTableRowData[]) super.getRows();
		}

		@Override
		public TestReportTableRowData rowAt(int index) {
			return (TestReportTableRowData) super.rowAt(index);
		}

		public void setRows(TestReportTableRowData[] rows) {
			super.setRows(rows);
		}

		public static class TestReportTableRowData extends AbstractTableRowData {

			private static final long serialVersionUID = 1L;
			public static final String testReport = "testReport";
			private String m_testReport;

			public String getTestReport() {
				return m_testReport;
			}

			public void setTestReport(String newTestReport) {
				m_testReport = newTestReport;
			}
		}
	}

	public static class Version extends AbstractValueFieldData<String> {

		private static final long serialVersionUID = 1L;
	}
}
