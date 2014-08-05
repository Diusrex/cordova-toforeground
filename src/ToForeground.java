/*
       Licensed to the Apache Software Foundation (ASF) under one
       or more contributor license agreements.  See the NOTICE file
       distributed with this work for additional information
       regarding copyright ownership.  The ASF licenses this file
       to you under the Apache License, Version 2.0 (the
       "License"); you may not use this file except in compliance
       with the License.  You may obtain a copy of the License at

         http://www.apache.org/licenses/LICENSE-2.0

       Unless required by applicable law or agreed to in writing,
       software distributed under the License is distributed on an
       "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
       KIND, either express or implied.  See the License for the
       specific language governing permissions and limitations
       under the License.
*/

package com.diusrex.toforeground;

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
        try {
          Intent it = new Intent("android.intent.action.MAIN");

          String packageName = args.getString(0);
          it.setComponent(new ComponentName(packageName, packageName + "." + className));
	  it.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);

          Context context = this.cordova.getActivity().getApplicationContext();
          context.startActivity(it);
        }
        catch (Exception e) {
          return false;
        }
        return true;
    }
};
