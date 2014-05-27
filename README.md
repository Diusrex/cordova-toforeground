Android Instructions:
    Requirements:
        Need to put the code:

        <intent-filter>
            <action android:name="android.intent.action.MAIN" />
            <category android:name="android.intent.category.LAUNCHER" />
        </intent-filter>

        inside of the main activity file (if it is not there already).

    To call inside of javascript code:
        toForeground(mainClassName, packageName, successFunction, errorFunction);
        
        mainClassName: Should be the main java class for the android code. Will usually be the java class that extends CordovaActivity. NOTE: This should only be the name of class, should not have the package names as well.

        packageName: Should be the name of the package that contains the mainClassName.

        success/errorFunction: The functions that will be called on error and success. I do not know how useful these are because the app is supposed to be in the background when called. 

    Warning: I do not know how the state within the app is effected by calling this function.