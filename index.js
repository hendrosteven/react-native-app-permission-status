/**
 * @providesModule react-native-app-permission-status
 */

var ReactNative = require('react-native');

if (ReactNative.Platform.OS === "android") {
    module.exports = {
        getImei: function () {
            return ReactNative.NativeModules.getAppsStatus.getAppsStatus();
        }
    };
} else {
    module.exports = {
        getImei: function () {
            throw new Error("Not supported");
        }
    }
}
