package de.smava.example.client;

import org.apache.wss4j.common.ext.WSPasswordCallback;

import javax.security.auth.callback.Callback;
import javax.security.auth.callback.CallbackHandler;
import javax.security.auth.callback.UnsupportedCallbackException;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by aakhmerov on 26.08.14.
 */
public class SampleServiceKeystorePasswordCallback implements CallbackHandler {
    private Map<String, String> passwords =
            new HashMap<String, String>();

    public SampleServiceKeystorePasswordCallback() {
        passwords.put("sample_client_alias", "keypass");
        passwords.put("smava_service_alias", "keypass");
    }

    public void handle(Callback[] callbacks) throws IOException, UnsupportedCallbackException {
        for (int i = 0; i < callbacks.length; i++) {
            WSPasswordCallback pc = (WSPasswordCallback)callbacks[i];

            String pass = passwords.get(pc.getIdentifier());
            if (pass != null) {
                pc.setPassword(pass);
                return;
            }
        }
    }
}
