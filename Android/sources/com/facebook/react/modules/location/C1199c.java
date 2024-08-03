package com.facebook.react.modules.location;

import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.os.Bundle;
import android.os.Handler;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.modules.location.LocationModule;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.facebook.react.modules.location.c */
/* loaded from: classes.dex */
public class C1199c implements LocationListener {

    /* renamed from: a */
    final /* synthetic */ LocationModule.C1196b f4599a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C1199c(LocationModule.C1196b c1196b) {
        this.f4599a = c1196b;
    }

    @Override // android.location.LocationListener
    public void onLocationChanged(Location location) {
        boolean z;
        Location location2;
        boolean m5368a;
        Callback callback;
        WritableMap locationToMap;
        Handler handler;
        Runnable runnable;
        LocationManager locationManager;
        LocationListener locationListener;
        synchronized (this.f4599a) {
            z = this.f4599a.f4596j;
            if (!z) {
                LocationModule.C1196b c1196b = this.f4599a;
                location2 = this.f4599a.f4592f;
                m5368a = c1196b.m5368a(location, location2);
                if (m5368a) {
                    callback = this.f4599a.f4587a;
                    locationToMap = LocationModule.locationToMap(location);
                    callback.invoke(locationToMap);
                    handler = this.f4599a.f4593g;
                    runnable = this.f4599a.f4594h;
                    handler.removeCallbacks(runnable);
                    this.f4599a.f4596j = true;
                    locationManager = this.f4599a.f4589c;
                    locationListener = this.f4599a.f4595i;
                    locationManager.removeUpdates(locationListener);
                }
            }
            this.f4599a.f4592f = location;
        }
    }

    @Override // android.location.LocationListener
    public void onProviderDisabled(String str) {
    }

    @Override // android.location.LocationListener
    public void onProviderEnabled(String str) {
    }

    @Override // android.location.LocationListener
    public void onStatusChanged(String str, int i, Bundle bundle) {
    }
}
