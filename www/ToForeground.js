var exec = require('cordova/exec');

toForeground = function(mainClassName, packageName, successFunction, errorFunction) {
    exec(successFunction, errorFunction, "ToForeground", mainClassName, [packageName]);
};

module.exports = toForeground;
