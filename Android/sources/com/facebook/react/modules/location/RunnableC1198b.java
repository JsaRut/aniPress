package com.facebook.react.modules.location;

import android.location.LocationListener;
import android.location.LocationManager;
import com.facebook.react.bridge.Callback;
import com.facebook.react.modules.location.LocationModule;
import p139d.p143b.p148c.p153e.C1700a;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.facebook.react.modules.location.b */
/* loaded from: classes.dex */
public class RunnableC1198b implements Runnable {

    /* renamed from: a */
    final /* synthetic */ LocationModule.C1196b f4598a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC1198b(LocationModule.C1196b c1196b) {
        this.f4598a = c1196b;
    }

    @Override // java.lang.Runnable
    public void run() {
        boolean z;
        Callback callback;
        LocationManager locationManager;
        LocationListener locationListener;
        synchronized (this.f4598a) {
            z = this.f4598a.f4596j;
            if (!z) {
                callback = this.f4598a.f4588b;
                callback.invoke(C1200d.m5380a(C1200d.f4602c, "Location request timed out"));
                locationManager = this.f4598a.f4589c;
                locationListener = this.f4598a.f4595i;
                locationManager.removeUpdates(locationListener);
                C1700a.m7012c("ReactNative", "LocationModule: Location request timed out");
                this.f4598a.f4596j = true;
            }
        }
    }
}
