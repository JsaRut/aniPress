package com.github.yamill.orientation;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.util.Log;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.modules.core.DeviceEventManagerModule;

/* renamed from: com.github.yamill.orientation.a */
/* loaded from: classes.dex */
public class C1557a extends BroadcastReceiver {

    /* renamed from: a */
    final /* synthetic */ ReactApplicationContext f5826a;

    /* renamed from: b */
    final /* synthetic */ OrientationModule f5827b;

    public C1557a(OrientationModule orientationModule, ReactApplicationContext reactApplicationContext) {
        this.f5827b = orientationModule;
        this.f5826a = reactApplicationContext;
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        Configuration configuration = (Configuration) intent.getParcelableExtra("newConfig");
        Log.d("receiver", String.valueOf(configuration.orientation));
        String str = configuration.orientation == 1 ? "PORTRAIT" : "LANDSCAPE";
        WritableMap createMap = Arguments.createMap();
        createMap.putString("orientation", str);
        if (this.f5826a.hasActiveCatalystInstance()) {
            ((DeviceEventManagerModule.RCTDeviceEventEmitter) this.f5826a.getJSModule(DeviceEventManagerModule.RCTDeviceEventEmitter.class)).emit("orientationDidChange", createMap);
        }
    }
}
