package android.toforeground;

import org.apache.cordova.CallbackContext;
import org.apache.cordova.CordovaPlugin;
import org.apache.cordova.PluginResult;
import org.json.JSONArray;
import org.json.JSONException;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;

public class ToForeground extends CordovaPlugin {

    public static String TAG = "ToForeground";

    public boolean execute(String action, JSONArray args, CallbackContext callbackContext) throws JSONException {

        PluginResult.Status status = PluginResult.Status.Ok;
        
        return true;

};
