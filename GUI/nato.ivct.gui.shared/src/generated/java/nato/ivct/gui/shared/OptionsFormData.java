package nato.ivct.gui.shared;

import javax.annotation.Generated;

import org.eclipse.scout.rt.shared.data.form.AbstractFormData;
import org.eclipse.scout.rt.shared.data.form.fields.AbstractValueFieldData;

/**
 * <b>NOTE:</b><br>
 * This class is auto generated by the Scout SDK. No manual modifications
 * recommended.
 */
@Generated(value = "nato.ivct.gui.client.OptionsForm", comments = "This class is auto generated by the Scout SDK. No manual modifications recommended.")
public class OptionsFormData extends AbstractFormData {

	private static final long serialVersionUID = 1L;

	public LogLevel getLogLevel() {
		return getFieldByClass(LogLevel.class);
	}

	public static class LogLevel extends AbstractValueFieldData<String> {

		private static final long serialVersionUID = 1L;
	}
}
