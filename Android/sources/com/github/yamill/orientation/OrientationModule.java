package com.github.yamill.orientation;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.IntentFilter;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.LifecycleEventListener;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import java.util.HashMap;
import java.util.Map;
import p139d.p143b.p148c.p153e.C1700a;

/* loaded from: classes.dex */
public class OrientationModule extends ReactContextBaseJavaModule implements LifecycleEventListener {
    final BroadcastReceiver receiver;

    public OrientationModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        this.receiver = new C1557a(this, reactApplicationContext);
        reactApplicationContext.addLifecycleEventListener(this);
    }

    private String getOrientationString(int i) {
        return i == 2 ? "LANDSCAPE" : i == 1 ? "PORTRAIT" : i == 0 ? "UNKNOWN" : "null";
    }

    @Override // com.facebook.react.bridge.BaseJavaModule
    public Map<String, Object> getConstants() {
        HashMap hashMap = new HashMap();
        String orientationString = getOrientationString(getReactApplicationContext().getResources().getConfiguration().orientation);
        if (orientationString == "null") {
            orientationString = null;
        }
        hashMap.put("initialOrientation", orientationString);
        return hashMap;
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return "Orientation";
    }

    @ReactMethod
    public void getOrientation(Callback callback) {
        int i = getReactApplicationContext().getResources().getConfiguration().orientation;
        String orientationString = getOrientationString(i);
        if (orientationString == "null") {
            callback.invoke(Integer.valueOf(i), null);
        } else {
            callback.invoke(null, orientationString);
        }
    }

    @ReactMethod
    public void lockToLandscape() {
        Activity currentActivity = getCurrentActivity();
        if (currentActivity == null) {
            return;
        }
        currentActivity.setRequestedOrientation(6);
    }

    @ReactMethod
    public void lockToLandscapeLeft() {
        Activity currentActivity = getCurrentActivity();
        if (currentActivity == null) {
            return;
        }
        currentActivity.setRequestedOrientation(0);
    }

    @ReactMethod
    public void lockToLandscapeRight() {
        Activity currentActivity = getCurrentActivity();
        if (currentActivity == null) {
            return;
        }
        currentActivity.setRequestedOrientation(8);
    }

    @ReactMethod
    public void lockToPortrait() {
        Activity currentActivity = getCurrentActivity();
        if (currentActivity == null) {
            return;
        }
        currentActivity.setRequestedOrientation(1);
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostDestroy() {
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostPause() {
        Activity currentActivity = getCurrentActivity();
        if (currentActivity == null) {
            return;
        }
        try {
            currentActivity.unregisterReceiver(this.receiver);
        } catch (IllegalArgumentException e2) {
            C1700a.m6998a("ReactNative", "receiver already unregistered", e2);
        }
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostResume() {
        Activity currentActivity = getCurrentActivity();
        if (currentActivity == null) {
            C1700a.m7006b("ReactNative", "no activity to register receiver");
        } else {
            currentActivity.registerReceiver(this.receiver, new IntentFilter("onConfigurationChanged"));
        }
    }

    @ReactMethod
    public void unlockAllOrientations() {
        Activity currentActivity = getCurrentActivity();
        if (currentActivity == null) {
            return;
        }
        currentActivity.setRequestedOrientation(4);
    }
}
