package nl.sense_os.commonsense.lib.client.model.httpresponse;


public class LoginResponse extends SenseApiResponse {

	protected LoginResponse() {
		// empty protected constructor
	}

	public final native String getSessionId() /*-{
		if (undefined != this.session_id) {
			return this.session_id;
		} else {
			return '';
		}
	}-*/;
}
