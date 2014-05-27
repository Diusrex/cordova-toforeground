package com.toforeground;

import org.apache.cordova.CallbackContext;
import org.apache.cordova.CordovaPlugin;
import org.apache.cordova.PluginResult;
import org.json.JSONArray;
import org.json.JSONException;

import android.app.Activity;
import android.content.Context;
import android.content.ComponentName;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;

public class ToForeground extends CordovaPlugin {

    public boolean execute(String className, JSONArray args, CallbackContext callbackContext) throws JSONException {

        Intent it = new Intent("android.intent.action.MAIN");

        String packageName = args.getString(0);
        it.setComponent(new ComponentName(packageName, packageName + "." + className));
	it.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);

        Context context = this.cordova.getActivity().getApplicationContext();
        context.startActivity(it);
        return true;
    }
};
