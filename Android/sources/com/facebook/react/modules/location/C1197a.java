package com.facebook.react.modules.location;

import android.location.Location;
import android.location.LocationListener;
import android.os.Bundle;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.modules.core.DeviceEventManagerModule;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.facebook.react.modules.location.a */
/* loaded from: classes.dex */
public class C1197a implements LocationListener {

    /* renamed from: a */
    final /* synthetic */ LocationModule f4597a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C1197a(LocationModule locationModule) {
        this.f4597a = locationModule;
    }

    @Override // android.location.LocationListener
    public void onLocationChanged(Location location) {
        ReactApplicationContext reactApplicationContext;
        WritableMap locationToMap;
        reactApplicationContext = this.f4597a.getReactApplicationContext();
        DeviceEventManagerModule.RCTDeviceEventEmitter rCTDeviceEventEmitter = (DeviceEventManagerModule.RCTDeviceEventEmitter) reactApplicationContext.getJSModule(DeviceEventManagerModule.RCTDeviceEventEmitter.class);
        locationToMap = LocationModule.locationToMap(location);
        rCTDeviceEventEmitter.emit("geolocationDidChange", locationToMap);
    }

    @Override // android.location.LocationListener
    public void onProviderDisabled(String str) {
    }

    @Override // android.location.LocationListener
    public void onProviderEnabled(String str) {
    }

    @Override // android.location.LocationListener
    public void onStatusChanged(String str, int i, Bundle bundle) {
        LocationModule locationModule;
        int i2;
        StringBuilder sb;
        String str2;
        if (i == 0) {
            locationModule = this.f4597a;
            i2 = C1200d.f4601b;
            sb = new StringBuilder();
            sb.append("Provider ");
            sb.append(str);
            str2 = " is out of service.";
        } else {
            if (i != 1) {
                return;
            }
            locationModule = this.f4597a;
            i2 = C1200d.f4602c;
            sb = new StringBuilder();
            sb.append("Provider ");
            sb.append(str);
            str2 = " is temporarily unavailable.";
        }
        sb.append(str2);
        locationModule.emitError(i2, sb.toString());
    }
}
