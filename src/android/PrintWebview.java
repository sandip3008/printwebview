package com.print.webview.plugin;

import org.apache.cordova.CordovaPlugin;
import org.apache.cordova.CallbackContext;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/**
 * This class echoes a string called from JavaScript.
 */
public class PrintWebview extends CordovaPlugin {

    @Override
    public boolean execute(String action, JSONArray args, CallbackContext callbackContext) throws JSONException {
        Context context = cordova.getActivity().getApplicationContext()
        if (action.equals("openWebview")) {
            String content = args.getString(0);
            this.openNewActivity(context);
            //this.coolMethod(message, callbackContext);
            return true;
        }
        return false;
    }

    private void openNewActivity(Context context) {
        Intent intent = new Intent(context, MainActivity.class);
        this.cordova.getActivity().startActivity(intent);
    }

    // private void coolMethod(String message, CallbackContext callbackContext) {
    //     if (message != null && message.length() > 0) {
    //         callbackContext.success(message);
    //     } else {
    //         callbackContext.error("Expected one non-empty string argument.");
    //     }
    // }
}
