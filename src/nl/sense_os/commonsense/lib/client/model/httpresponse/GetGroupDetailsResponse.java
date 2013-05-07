package nl.sense_os.commonsense.lib.client.model.httpresponse;

import nl.sense_os.commonsense.lib.client.model.apiclass.Group;

public class GetGroupDetailsResponse extends SenseApiResponse {

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
