package nato.ivct.gui.shared.ts;

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
@Generated(value = "nato.ivct.gui.client.ts.TsForm", comments = "This class is auto generated by the Scout SDK. No manual modifications recommended.")
public class TsFormData extends AbstractFormData {

	private static final long serialVersionUID = 1L;

	public TcTable getTcTable() {
		return getFieldByClass(TcTable.class);
	}

	public TsDescription getTsDescription() {
		return getFieldByClass(TsDescription.class);
	}

	/**
	 * access method for property TsId.
	 */
	public String getTsId() {
		return getTsIdProperty().getValue();
	}

	/**
	 * access method for property TsId.
	 */
	public void setTsId(String tsId) {
		getTsIdProperty().setValue(tsId);
	}

	public TsIdProperty getTsIdProperty() {
		return getPropertyByClass(TsIdProperty.class);
	}

	public TsName getTsName() {
		return getFieldByClass(TsName.class);
	}

	public TsRequirementsTable getTsRequirementsTable() {
		return getFieldByClass(TsRequirementsTable.class);
	}

	public TsVersion getTsVersion() {
		return getFieldByClass(TsVersion.class);
	}

	public static class TcTable extends AbstractTableFieldBeanData {

		private static final long serialVersionUID = 1L;

		@Override
		public TcTableRowData addRow() {
			return (TcTableRowData) super.addRow();
		}

		@Override
		public TcTableRowData addRow(int rowState) {
			return (TcTableRowData) super.addRow(rowState);
		}

		@Override
		public TcTableRowData createRow() {
			return new TcTableRowData();
		}

		@Override
		public Class<? extends AbstractTableRowData> getRowType() {
			return TcTableRowData.class;
		}

		@Override
		public TcTableRowData[] getRows() {
			return (TcTableRowData[]) super.getRows();
		}

		@Override
		public TcTableRowData rowAt(int index) {
			return (TcTableRowData) super.rowAt(index);
		}

		public void setRows(TcTableRowData[] rows) {
			super.setRows(rows);
		}

		public static class TcTableRowData extends AbstractTableRowData {

			private static final long serialVersionUID = 1L;
			public static final String tcId = "tcId";
			public static final String tcName = "tcName";
			public static final String tcDesc = "tcDesc";
			private String m_tcId;
			private String m_tcName;
			private String m_tcDesc;

			public String getTcId() {
				return m_tcId;
			}

			public void setTcId(String newTcId) {
				m_tcId = newTcId;
			}

			public String getTcName() {
				return m_tcName;
			}

			public void setTcName(String newTcName) {
				m_tcName = newTcName;
			}

			public String getTcDesc() {
				return m_tcDesc;
			}

			public void setTcDesc(String newTcDesc) {
				m_tcDesc = newTcDesc;
			}
		}
	}

	public static class TsDescription extends AbstractValueFieldData<String> {

		private static final long serialVersionUID = 1L;
	}

	public static class TsIdProperty extends AbstractPropertyData<String> {

		private static final long serialVersionUID = 1L;
	}

	public static class TsName extends AbstractValueFieldData<String> {

		private static final long serialVersionUID = 1L;
	}

	public static class TsRequirementsTable extends AbstractTableFieldBeanData {

		private static final long serialVersionUID = 1L;

		@Override
		public TsRequirementsTableRowData addRow() {
			return (TsRequirementsTableRowData) super.addRow();
		}

		@Override
		public TsRequirementsTableRowData addRow(int rowState) {
			return (TsRequirementsTableRowData) super.addRow(rowState);
		}

		@Override
		public TsRequirementsTableRowData createRow() {
			return new TsRequirementsTableRowData();
		}

		@Override
		public Class<? extends AbstractTableRowData> getRowType() {
			return TsRequirementsTableRowData.class;
		}

		@Override
		public TsRequirementsTableRowData[] getRows() {
			return (TsRequirementsTableRowData[]) super.getRows();
		}

		@Override
		public TsRequirementsTableRowData rowAt(int index) {
			return (TsRequirementsTableRowData) super.rowAt(index);
		}

		public void setRows(TsRequirementsTableRowData[] rows) {
			super.setRows(rows);
		}

		public static class TsRequirementsTableRowData extends AbstractTableRowData {

			private static final long serialVersionUID = 1L;
			public static final String requirementId = "requirementId";
			public static final String requirementDesc = "requirementDesc";
			private String m_requirementId;
			private String m_requirementDesc;

			public String getRequirementId() {
				return m_requirementId;
			}

			public void setRequirementId(String newRequirementId) {
				m_requirementId = newRequirementId;
			}

			public String getRequirementDesc() {
				return m_requirementDesc;
			}

			public void setRequirementDesc(String newRequirementDesc) {
				m_requirementDesc = newRequirementDesc;
			}
		}
	}

	public static class TsVersion extends AbstractValueFieldData<String> {

		private static final long serialVersionUID = 1L;
	}
}