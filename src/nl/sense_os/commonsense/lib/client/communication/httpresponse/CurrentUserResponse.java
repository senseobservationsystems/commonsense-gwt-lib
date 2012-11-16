package nl.sense_os.commonsense.lib.client.communication.httpresponse;

import nl.sense_os.commonsense.lib.client.model.User;

import com.google.gwt.core.client.JavaScriptObject;

/**
 * Overlay for response to request for current user from CommonSense.
 */
public class CurrentUserResponse extends JavaScriptObject {

	protected CurrentUserResponse() {
		// empty protected constructor
	}

	public final native User getUser() /*-{
        return this.user;
    }-*/;
}
