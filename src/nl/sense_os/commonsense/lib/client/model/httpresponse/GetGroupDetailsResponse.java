package nl.sense_os.commonsense.lib.client.model.httpresponse;

import nl.sense_os.commonsense.lib.client.model.apiclass.Group;

import com.google.gwt.core.client.JavaScriptObject;

public class GetGroupDetailsResponse extends JavaScriptObject {

	protected GetGroupDetailsResponse() {
		// empty protected constructor
	}

	public final native Group getGroup() /*-{
        if (undefined != this.group) {
            return this.group;
        } else {
            return {};
        }
    }-*/;
}
