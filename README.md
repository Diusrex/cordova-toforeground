Cordova plugin for Android to bring app to foreground
===================================================


Installation
---------------------------------------------------
Inside the cordova project:

```
cordova plugin add https://github.com/Diusrex/cordova-toforeground
```


Then, put the following code in your AndroidManifest file, within the main activity tag (if it is not there already).

```xml
<intent-filter>
    <action android:name="android.intent.action.MAIN" />
    <category android:name="android.intent.category.LAUNCHER" />
</intent-filter>
```

Usage
-----------------------------------------------------
To use inside of your javascript code, use the following line:

```javascript
toForeground(mainClassName, packageName, successFunction, errorFunction);
```

<b>mainClassName</b>: Should be the main java class for the android code. Will usually be the java class that extends CordovaActivity. NOTE: This should only be the name of class, should not have the package names as well.

<b>packageName</b>: Should be the name of the package that contains the mainClassName.

<b>success/errorFunction</b>: The functions that will be called on error and success.