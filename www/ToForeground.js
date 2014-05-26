var exec = require('cordova/exec');

module.exports = function(arg0, success, error) {
    exec(success, error, "ToForeground", "exec", [arg0]);
};
