package com.hendro.AppPermissionStatus;

import android.Manifest;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import android.telephony.TelephonyManager;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;

public class RNAppPermissionStatusModule extends ReactContextBaseJavaModule {

    private final ReactApplicationContext reactContext;

    public RNAppPermissionStatusModule(ReactApplicationContext reactContext) {
        super(reactContext);
        this.reactContext = reactContext;
    }

    @Override
    public String getName() {
        return "RNAppPermissionStatusModule";
    }

    @ReactMethod
    public void getAppsStatus(Promise promise) {
      
        promise.resolve("Hello World!");
    }

}
