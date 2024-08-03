package p031c.p032a.p051R;

import android.location.Location;
import android.location.LocationListener;
import android.os.Bundle;
import p031c.p032a.p066j.C0675a;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: c.a.R.g */
/* loaded from: classes.dex */
public final class C0565g implements LocationListener {

    /* renamed from: a */
    final /* synthetic */ C0564f f2729a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0565g(C0564f c0564f) {
        this.f2729a = c0564f;
    }

    @Override // android.location.LocationListener
    public final void onLocationChanged(Location location) {
        String str;
        try {
            StringBuilder sb = new StringBuilder("onLocationChanged:");
            sb.append(location);
            sb.append(",provider:");
            str = this.f2729a.f2727h;
            sb.append(str);
            C0675a.m3469c("JLocationGps", sb.toString());
            this.f2729a.m2945a(location);
            C0564f.m2948b(this.f2729a);
        } catch (Throwable th) {
            C0675a.m3475g("JLocationGps", "onLocationChanged failed:" + th.getMessage());
        }
    }

    @Override // android.location.LocationListener
    public final void onProviderDisabled(String str) {
        C0675a.m3469c("JLocationGps", "onProviderDisabled:" + str);
        C0564f.m2948b(this.f2729a);
    }

    @Override // android.location.LocationListener
    public final void onProviderEnabled(String str) {
        C0675a.m3469c("JLocationGps", "onProviderEnabled:" + str);
    }

    @Override // android.location.LocationListener
    public final void onStatusChanged(String str, int i, Bundle bundle) {
        C0675a.m3469c("JLocationGps", "onStatusChanged status:" + i);
        if (i == 0) {
            C0564f.m2948b(this.f2729a);
        }
    }
}
