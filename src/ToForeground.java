package com.toforeground;

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

    /**
     * action should be the name of the main class. It can be usully found in
     * 
     */ 
    public boolean execute(String action, JSONArray args, CallbackContext callbackContext) throws JSONException {

        PluginResult.Status status = PluginResult.Status.Ok;
        
        //Intent it = new Intent("android.intent.action.MAIN");
        //it.setComponent(new ComponentName(cordova.getContext().getPackageName(), action));
        //it.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);

        // Is getApplicationContext necessary?
        //cordova.getContext().getApplicationContext().startActivity(it);
        callbackContext.sendPluginResult(new PluginResult(status, true));
        return true;

};
