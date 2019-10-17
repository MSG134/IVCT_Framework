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
@Generated(value = "nato.ivct.gui.client.sut.SuTTcExecutionForm", comments = "This class is auto generated by the Scout SDK. No manual modifications recommended.")
public class SuTTcExecutionFormData extends AbstractFormData {

	private static final long serialVersionUID = 1L;

	/**
	 * access method for property BadgeId.
	 */
	public String getBadgeId() {
		return getBadgeIdProperty().getValue();
	}

	/**
	 * access method for property BadgeId.
	 */
	public void setBadgeId(String badgeId) {
		getBadgeIdProperty().setValue(badgeId);
	}

	public BadgeIdProperty getBadgeIdProperty() {
		return getPropertyByClass(BadgeIdProperty.class);
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

	public TcDescr getTcDescr() {
		return getFieldByClass(TcDescr.class);
	}

	public TcExecutionHistoryTable getTcExecutionHistoryTable() {
		return getFieldByClass(TcExecutionHistoryTable.class);
	}

	public TcExecutionStatus getTcExecutionStatus() {
		return getFieldByClass(TcExecutionStatus.class);
	}

	public TcLog getTcLog() {
		return getFieldByClass(TcLog.class);
	}

	public TcProgress getTcProgress() {
		return getFieldByClass(TcProgress.class);
	}

	/**
	 * access method for property TestCaseId.
	 */
	public String getTestCaseId() {
		return getTestCaseIdProperty().getValue();
	}

	/**
	 * access method for property TestCaseId.
	 */
	public void setTestCaseId(String testCaseId) {
		getTestCaseIdProperty().setValue(testCaseId);
	}

	public TestCaseIdProperty getTestCaseIdProperty() {
		return getPropertyByClass(TestCaseIdProperty.class);
	}

	/**
	 * access method for property TestCaseProgress.
	 */
	public int getTestCaseProgress() {
		return getTestCaseProgressProperty().getValue() == null ? 0 : getTestCaseProgressProperty().getValue();
	}

	/**
	 * access method for property TestCaseProgress.
	 */
	public void setTestCaseProgress(int testCaseProgress) {
		getTestCaseProgressProperty().setValue(testCaseProgress);
	}

	public TestCaseProgressProperty getTestCaseProgressProperty() {
		return getPropertyByClass(TestCaseProgressProperty.class);
	}

	/**
	 * access method for property TestCaseStatus.
	 */
	public String getTestCaseStatus() {
		return getTestCaseStatusProperty().getValue();
	}

	/**
	 * access method for property TestCaseStatus.
	 */
	public void setTestCaseStatus(String testCaseStatus) {
		getTestCaseStatusProperty().setValue(testCaseStatus);
	}

	public TestCaseStatusProperty getTestCaseStatusProperty() {
		return getPropertyByClass(TestCaseStatusProperty.class);
	}

	/**
	 * access method for property TestCaseVerdict.
	 */
	public String getTestCaseVerdict() {
		return getTestCaseVerdictProperty().getValue();
	}

	/**
	 * access method for property TestCaseVerdict.
	 */
	public void setTestCaseVerdict(String testCaseVerdict) {
		getTestCaseVerdictProperty().setValue(testCaseVerdict);
	}

	public TestCaseVerdictProperty getTestCaseVerdictProperty() {
		return getPropertyByClass(TestCaseVerdictProperty.class);
	}

	/**
	 * access method for property TestsuiteId.
	 */
	public String getTestsuiteId() {
		return getTestsuiteIdProperty().getValue();
	}

	/**
	 * access method for property TestsuiteId.
	 */
	public void setTestsuiteId(String testsuiteId) {
		getTestsuiteIdProperty().setValue(testsuiteId);
	}

	public TestsuiteIdProperty getTestsuiteIdProperty() {
		return getPropertyByClass(TestsuiteIdProperty.class);
	}

	public static class BadgeIdProperty extends AbstractPropertyData<String> {

		private static final long serialVersionUID = 1L;
	}

	public static class SutIdProperty extends AbstractPropertyData<String> {

		private static final long serialVersionUID = 1L;
	}

	public static class TcDescr extends AbstractValueFieldData<String> {

		private static final long serialVersionUID = 1L;
	}

	public static class TcExecutionHistoryTable extends AbstractTableFieldBeanData {

		private static final long serialVersionUID = 1L;

		@Override
		public TcExecutionHistoryTableRowData addRow() {
			return (TcExecutionHistoryTableRowData) super.addRow();
		}

		@Override
		public TcExecutionHistoryTableRowData addRow(int rowState) {
			return (TcExecutionHistoryTableRowData) super.addRow(rowState);
		}

		@Override
		public TcExecutionHistoryTableRowData createRow() {
			return new TcExecutionHistoryTableRowData();
		}

		@Override
		public Class<? extends AbstractTableRowData> getRowType() {
			return TcExecutionHistoryTableRowData.class;
		}

		@Override
		public TcExecutionHistoryTableRowData[] getRows() {
			return (TcExecutionHistoryTableRowData[]) super.getRows();
		}

		@Override
		public TcExecutionHistoryTableRowData rowAt(int index) {
			return (TcExecutionHistoryTableRowData) super.rowAt(index);
		}

		public void setRows(TcExecutionHistoryTableRowData[] rows) {
			super.setRows(rows);
		}

		public static class TcExecutionHistoryTableRowData extends AbstractTableRowData {

			private static final long serialVersionUID = 1L;
			public static final String fileName = "fileName";
			public static final String tcVerdict = "tcVerdict";
			private String m_fileName;
			private String m_tcVerdict;

			public String getFileName() {
				return m_fileName;
			}

			public void setFileName(String newFileName) {
				m_fileName = newFileName;
			}

			public String getTcVerdict() {
				return m_tcVerdict;
			}

			public void setTcVerdict(String newTcVerdict) {
				m_tcVerdict = newTcVerdict;
			}
		}
	}

	public static class TcExecutionStatus extends AbstractValueFieldData<String> {

		private static final long serialVersionUID = 1L;
	}

	public static class TcLog extends AbstractValueFieldData<String> {

		private static final long serialVersionUID = 1L;
	}

	public static class TcProgress extends AbstractValueFieldData<String> {

		private static final long serialVersionUID = 1L;
	}

	public static class TestCaseIdProperty extends AbstractPropertyData<String> {

		private static final long serialVersionUID = 1L;
	}

	public static class TestCaseProgressProperty extends AbstractPropertyData<Integer> {

		private static final long serialVersionUID = 1L;
	}

	public static class TestCaseStatusProperty extends AbstractPropertyData<String> {

		private static final long serialVersionUID = 1L;
	}

	public static class TestCaseVerdictProperty extends AbstractPropertyData<String> {

		private static final long serialVersionUID = 1L;
	}

	public static class TestsuiteIdProperty extends AbstractPropertyData<String> {

		private static final long serialVersionUID = 1L;
	}
}
