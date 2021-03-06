package nl.sense_os.commonsense.lib.client.model.apiclass;

import com.google.gwt.core.client.JavaScriptObject;

/**
 * Class to represent the "raw" data points that are in the data that CommonSense back end sends us.
 */
public class DataPoint extends JavaScriptObject {

    protected DataPoint() {
        // empty protected constructor
    }

    public final native String getId() /*-{
		return this.id;
    }-*/;

    public final native int getSensorId() /*-{
		return this.sensor_id;
    }-*/;

    /**
     * @return the date (in seconds!), formatted as String by CommonSense back end
     */
    public final native String getDate() /*-{
		return '' + this.date;
    }-*/;

    public final native Object getValue() /*-{
		return this.value;
    }-*/;

    public final native JavaScriptObject getJsoValue() /*-{
		if (typeof this.value == "object") {
			return this.value;
		} else {
			return {};
		}
    }-*/;

    public final native String getStringValue() /*-{
		if (typeof this.value == "string") {
			return this.value;
		} else {
			return null;
		}
    }-*/;

    public final native boolean getBooleanValue() /*-{
		if (typeof this.value == "boolean") {
			return this.value;
		} else {
			return false;
		}
    }-*/;

    public final native Double getNumberValue() /*-{
		if (typeof this.value == "number") {
			return this.value;
		} else {
			return -1;
		}
    }-*/;

    public final native int getWeek() /*-{
		return this.week;
    }-*/;

    public final native int getMonth() /*-{
		return this.month;
    }-*/;

    public final native int getYear() /*-{
		return this.year;
    }-*/;

}
