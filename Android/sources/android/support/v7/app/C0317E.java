package android.support.v7.app;

import android.annotation.SuppressLint;
import android.content.Context;
import android.location.Location;
import android.location.LocationManager;
import android.util.Log;
import java.util.Calendar;
import p000a.p005b.p009c.p010a.C0034d;

/* renamed from: android.support.v7.app.E */
/* loaded from: classes.dex */
class C0317E {

    /* renamed from: a */
    private static C0317E f1494a;

    /* renamed from: b */
    private final Context f1495b;

    /* renamed from: c */
    private final LocationManager f1496c;

    /* renamed from: d */
    private final a f1497d = new a();

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: android.support.v7.app.E$a */
    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a */
        boolean f1498a;

        /* renamed from: b */
        long f1499b;

        /* renamed from: c */
        long f1500c;

        /* renamed from: d */
        long f1501d;

        /* renamed from: e */
        long f1502e;

        /* renamed from: f */
        long f1503f;

        a() {
        }
    }

    C0317E(Context context, LocationManager locationManager) {
        this.f1495b = context;
        this.f1496c = locationManager;
    }

    /* renamed from: a */
    private Location m1759a(String str) {
        try {
            if (this.f1496c.isProviderEnabled(str)) {
                return this.f1496c.getLastKnownLocation(str);
            }
            return null;
        } catch (Exception e2) {
            Log.d("TwilightManager", "Failed to get last known location", e2);
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static C0317E m1760a(Context context) {
        if (f1494a == null) {
            Context applicationContext = context.getApplicationContext();
            f1494a = new C0317E(applicationContext, (LocationManager) applicationContext.getSystemService("location"));
        }
        return f1494a;
    }

    /* renamed from: a */
    private void m1761a(Location location) {
        long j;
        a aVar = this.f1497d;
        long currentTimeMillis = System.currentTimeMillis();
        C0316D m1757a = C0316D.m1757a();
        m1757a.m1758a(currentTimeMillis - 86400000, location.getLatitude(), location.getLongitude());
        long j2 = m1757a.f1491b;
        m1757a.m1758a(currentTimeMillis, location.getLatitude(), location.getLongitude());
        boolean z = m1757a.f1493d == 1;
        long j3 = m1757a.f1492c;
        long j4 = m1757a.f1491b;
        boolean z2 = z;
        m1757a.m1758a(86400000 + currentTimeMillis, location.getLatitude(), location.getLongitude());
        long j5 = m1757a.f1492c;
        if (j3 == -1 || j4 == -1) {
            j = 43200000 + currentTimeMillis;
        } else {
            j = (currentTimeMillis > j4 ? 0 + j5 : currentTimeMillis > j3 ? 0 + j4 : 0 + j3) + 60000;
        }
        aVar.f1498a = z2;
        aVar.f1499b = j2;
        aVar.f1500c = j3;
        aVar.f1501d = j4;
        aVar.f1502e = j5;
        aVar.f1503f = j;
    }

    @SuppressLint({"MissingPermission"})
    /* renamed from: b */
    private Location m1762b() {
        Location m1759a = C0034d.m168a(this.f1495b, "android.permission.ACCESS_COARSE_LOCATION") == 0 ? m1759a("network") : null;
        Location m1759a2 = C0034d.m168a(this.f1495b, "android.permission.ACCESS_FINE_LOCATION") == 0 ? m1759a("gps") : null;
        return (m1759a2 == null || m1759a == null) ? m1759a2 != null ? m1759a2 : m1759a : m1759a2.getTime() > m1759a.getTime() ? m1759a2 : m1759a;
    }

    /* renamed from: c */
    private boolean m1763c() {
        return this.f1497d.f1503f > System.currentTimeMillis();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public boolean m1764a() {
        a aVar = this.f1497d;
        if (m1763c()) {
            return aVar.f1498a;
        }
        Location m1762b = m1762b();
        if (m1762b != null) {
            m1761a(m1762b);
            return aVar.f1498a;
        }
        Log.i("TwilightManager", "Could not get last known location. This is probably because the app does not have any location permissions. Falling back to hardcoded sunrise/sunset values.");
        int i = Calendar.getInstance().get(11);
        return i < 6 || i >= 22;
    }
}
