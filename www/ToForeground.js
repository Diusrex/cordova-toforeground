var exec = require('cordova/exec');

ToForeground = function(mainClassName, success, error) {
    exec(success, error, "ToForeground", mainClassName, []);
};

module.exports = ToForeground;
