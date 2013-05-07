package nl.sense_os.commonsense.lib.client.model.httpresponse;

import nl.sense_os.commonsense.lib.client.model.apiclass.Environment;

public class CreateEnvironmentResponse extends SenseApiResponse {

	protected CreateEnvironmentResponse() {
		// empty protected constructor
	}

	public final native Environment getEnvironment() /*-{
        if (undefined != this.environment) {
            return this.environment;
        } else {
            return {};
        }
    }-*/;
}
