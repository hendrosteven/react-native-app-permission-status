
import { NativeModules } from 'react-native';

const { RNAppPermissionStatusModule } = NativeModules;

export default {
    getAppsStatus : function(){
        RNAppPermissionStatusModule.getAppsStatus();
    }
}
