var exec = require('cordova/exec');


// mainClassName should NOT contain the package information
toForeground = function(mainClassName, packageName, successFunction, errorFunction) {
    exec(successFunction, errorFunction, "ToForeground", mainClassName, [packageName]);
};

module.exports = toForeground;
