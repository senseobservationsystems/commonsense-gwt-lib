package nl.sense_os.commonsense.lib.client.model.httpresponse;

import nl.sense_os.commonsense.lib.client.model.apiclass.Sensor;

import com.google.gwt.core.client.JavaScriptObject;

public class CreateSensorResponse extends JavaScriptObject {

	protected CreateSensorResponse() {
		// empty protected constructor
	}

	public final native Sensor getSensor() /*-{
        if (undefined != this.sensor) {
            return this.sensor;
        } else {
            return {};
        }
    }-*/;
}