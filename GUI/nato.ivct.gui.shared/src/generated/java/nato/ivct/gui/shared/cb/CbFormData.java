package nato.ivct.gui.shared.cb;

import javax.annotation.Generated;

import org.eclipse.scout.rt.shared.data.form.AbstractFormData;
import org.eclipse.scout.rt.shared.data.form.fields.AbstractValueFieldData;
import org.eclipse.scout.rt.shared.data.form.fields.treefield.AbstractTreeFieldData;
import org.eclipse.scout.rt.shared.data.form.properties.AbstractPropertyData;

/**
 * <b>NOTE:</b><br>
 * This class is auto generated by the Scout SDK. No manual modifications
 * recommended.
 */
@Generated(value = "nato.ivct.gui.client.cb.CbForm", comments = "This class is auto generated by the Scout SDK. No manual modifications recommended.")
public class CbFormData extends AbstractFormData {

	private static final long serialVersionUID = 1L;

	public CbDependencies getCbDependencies() {
		return getFieldByClass(CbDependencies.class);
	}

	public CbDescription getCbDescription() {
		return getFieldByClass(CbDescription.class);
	}

	/**
	 * access method for property CbId.
	 */
	public String getCbId() {
		return getCbIdProperty().getValue();
	}

	/**
	 * access method for property CbId.
	 */
	public void setCbId(String cbId) {
		getCbIdProperty().setValue(cbId);
	}

	public CbIdProperty getCbIdProperty() {
		return getPropertyByClass(CbIdProperty.class);
	}

	public CbName getCbName() {
		return getFieldByClass(CbName.class);
	}

	public IncludedCb getIncludedCb() {
		return getFieldByClass(IncludedCb.class);
	}

	public static class CbDependencies extends AbstractValueFieldData<String> {

		private static final long serialVersionUID = 1L;
	}

	public static class CbDescription extends AbstractValueFieldData<String> {

		private static final long serialVersionUID = 1L;
	}

	public static class CbIdProperty extends AbstractPropertyData<String> {

		private static final long serialVersionUID = 1L;
	}

	public static class CbName extends AbstractValueFieldData<String> {

		private static final long serialVersionUID = 1L;
	}

	public static class IncludedCb extends AbstractTreeFieldData {

		private static final long serialVersionUID = 1L;
	}
}