var exec = require('cordova/exec');

exports.openWebview = function (data, success, error) {
    exec(success, error, 'PrintWebview', 'openWebview', [data]);
};
