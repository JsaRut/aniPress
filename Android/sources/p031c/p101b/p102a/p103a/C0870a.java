package p031c.p101b.p102a.p103a;

import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.os.Bundle;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: c.b.a.a.a */
/* loaded from: classes.dex */
public class C0870a implements LocationListener {

    /* renamed from: a */
    final /* synthetic */ C0873d f3655a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0870a(C0873d c0873d) {
        this.f3655a = c0873d;
    }

    @Override // android.location.LocationListener
    public void onLocationChanged(Location location) {
        LocationManager locationManager;
        AtomicBoolean atomicBoolean;
        locationManager = this.f3655a.f3659e;
        locationManager.removeUpdates(this);
        atomicBoolean = this.f3655a.f3666l;
        atomicBoolean.set(false);
        this.f3655a.m4251a(location);
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
