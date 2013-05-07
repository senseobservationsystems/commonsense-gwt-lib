package nl.sense_os.commonsense.lib.client.model.httpresponse;


public class ServiceMethodResponse extends SenseApiResponse {

    protected ServiceMethodResponse() {
        // empty protected constructor
    }

    public final native String getResult() /*-{
        if (undefined != this.result) {
            return this.result;
        } else {
            return null;
        }
    }-*/;
}
