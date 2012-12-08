commonsense-gwt-lib
===================

Client library for using CommonSense in Google Web Toolkit apps.

Sample use:
```java
import com.google.gwt.http.client.Request;
import com.google.gwt.http.client.RequestCallback;
import com.google.gwt.http.client.Response;
import nl.sense_os.commonsense.lib.client.communication.CommonSenseClient;

public class Foo {

    public void login() {

        // create request callback
        RequestCallback callback = new RequestCallback() {

            @Override
            public void onError(Request request, Throwable exception) {
                // implement error handling
            }
            
            @Override
            public void onResponseReceived(Request request, Response response) {
                // implement response handling
            }
        };
        
        // login credentials
        String username = "foo";
        String password = "bar";
    
        // use commonsense client
        CommonSenseClient client = CommonSenseClient.getClient();
        client.login(callback, username, password);
    }
}
````