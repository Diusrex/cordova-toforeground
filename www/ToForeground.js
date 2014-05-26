var exec = require('cordova/exec');

ToForeground = function(arg0, success, error) {
    exec(success, error, "ToForeground", "exec", [arg0]);
};

module.exports = ToForeground;
