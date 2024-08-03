package p031c.p032a.p051R;

import android.annotation.SuppressLint;
import android.content.Context;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.os.Handler;
import android.os.HandlerThread;
import p031c.p032a.p048P.p049a.C0557c;
import p031c.p032a.p052S.C0570b;
import p031c.p032a.p066j.C0675a;

@SuppressLint({"MissingPermission"})
/* renamed from: c.a.R.f */
/* loaded from: classes.dex */
final class C0564f {

    /* renamed from: a */
    private static final Object f2720a = new Object();

    /* renamed from: b */
    private static C0564f f2721b = null;

    /* renamed from: c */
    private Context f2722c;

    /* renamed from: d */
    private LocationManager f2723d;

    /* renamed from: e */
    private C0570b f2724e;

    /* renamed from: f */
    protected Handler f2725f;

    /* renamed from: g */
    private boolean f2726g;

    /* renamed from: h */
    private String f2727h;

    /* renamed from: i */
    private LocationListener f2728i = new C0565g(this);

    private C0564f(Context context) {
        this.f2722c = context;
        this.f2723d = (LocationManager) context.getSystemService("location");
    }

    /* renamed from: a */
    public static C0564f m2942a(Context context) {
        if (f2721b == null) {
            synchronized (f2720a) {
                if (f2721b == null) {
                    f2721b = new C0564f(context);
                }
            }
        }
        return f2721b;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public void m2945a(Location location) {
        if (location == null) {
            this.f2724e = null;
            return;
        }
        C0675a.m3469c("JLocationGps", "updateGpsInfo location time:" + location.getTime());
        if (this.f2724e == null) {
            this.f2724e = new C0570b();
        }
        this.f2724e.f2742a = C0557c.m2886a(this.f2722c, location.getTime());
        this.f2724e.f2743b = location.getProvider();
        this.f2724e.f2744c = location.getLatitude();
        this.f2724e.f2745d = location.getLongitude();
        this.f2724e.f2747f = location.getBearing();
        this.f2724e.f2748g = location.getAccuracy();
    }

    /* renamed from: a */
    private boolean m2947a(Location location, Location location2) {
        if (location == null) {
            return false;
        }
        if (location2 == null) {
            return true;
        }
        long time = location.getTime() - location2.getTime();
        boolean z = time > 120000;
        boolean z2 = time < -120000;
        boolean z3 = time > 0;
        if (z) {
            return true;
        }
        if (z2) {
            return false;
        }
        int accuracy = (int) (location.getAccuracy() - location2.getAccuracy());
        boolean z4 = accuracy > 0;
        boolean z5 = accuracy < 0;
        boolean z6 = accuracy > 200;
        String provider = location.getProvider();
        String provider2 = location2.getProvider();
        boolean equals = provider == null ? provider2 == null : provider.equals(provider2);
        if (z5) {
            return true;
        }
        if (!z3 || z4) {
            return z3 && !z6 && equals;
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public static /* synthetic */ void m2948b(C0564f c0564f) {
        C0675a.m3469c("JLocationGps", "gps will done");
        c0564f.f2726g = true;
        c0564f.m2952f();
        Handler handler = c0564f.f2725f;
        if (handler == null) {
            C0675a.m3476h("JLocationGps", "cellLocationManager is null,please check it");
            return;
        }
        if (handler.hasMessages(1004)) {
            c0564f.f2725f.removeMessages(1004);
        }
        if (c0564f.f2725f.hasMessages(1003)) {
            c0564f.f2725f.removeMessages(1003);
        }
        if (c0564f.f2725f.hasMessages(1001)) {
            c0564f.f2725f.removeMessages(1001);
        }
        if (c0564f.f2725f.hasMessages(1005)) {
            c0564f.f2725f.removeMessages(1005);
        }
        try {
            try {
                c0564f.f2725f.getLooper().quit();
            } catch (Throwable th) {
                C0675a.m3477i("JLocationGps", "quit handler failed:" + th.getMessage());
            }
        } finally {
            c0564f.f2725f = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: f */
    public void m2952f() {
        try {
            if (this.f2728i == null) {
                C0675a.m3475g("JLocationGps", "Location listener is null , do nothing!");
            } else if (this.f2723d != null) {
                this.f2723d.removeUpdates(this.f2728i);
            } else {
                C0675a.m3475g("JLocationGps", "locationManager is null , do nothing!");
            }
        } catch (Throwable th) {
            C0675a.m3475g("JLocationGps", "remove location listener failed  e:" + th.getMessage());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public final C0570b m2953a() {
        return this.f2724e;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public final boolean m2954b() {
        return this.f2726g;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public final void m2955c() {
        this.f2726g = false;
        this.f2724e = null;
        if (this.f2723d == null) {
            C0675a.m3475g("JLocationGps", "get locationManager failed");
            this.f2726g = true;
            return;
        }
        try {
            if (this.f2725f == null) {
                HandlerThread handlerThread = new HandlerThread("location");
                handlerThread.start();
                this.f2725f = new HandlerC0566h(this, handlerThread.getLooper());
            }
        } catch (Throwable th) {
            C0675a.m3477i("JLocationGps", "start load loc-info failed - error:" + th);
        }
        if (this.f2725f == null) {
            C0675a.m3475g("JLocationGps", " mAsyncHandler is empty");
            this.f2726g = true;
        } else if (this.f2723d.isProviderEnabled("network")) {
            this.f2727h = "network";
            this.f2725f.sendEmptyMessage(1003);
        } else if (this.f2723d.isProviderEnabled("gps")) {
            this.f2727h = "gps";
            this.f2725f.sendEmptyMessage(1003);
        } else {
            this.f2727h = "network";
            this.f2725f.sendEmptyMessage(1004);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0032 A[Catch: Throwable -> 0x0066, TryCatch #0 {Throwable -> 0x0066, blocks: (B:3:0x0002, B:5:0x0020, B:9:0x0032, B:11:0x0041, B:18:0x0027), top: B:2:0x0002 }] */
    /* renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final p031c.p032a.p052S.C0570b m2956d() {
        /*
            r7 = this;
            java.lang.String r0 = "JLocationGps"
            android.location.LocationManager r1 = r7.f2723d     // Catch: java.lang.Throwable -> L66
            java.lang.String r2 = "gps"
            android.location.Location r1 = r1.getLastKnownLocation(r2)     // Catch: java.lang.Throwable -> L66
            android.location.LocationManager r2 = r7.f2723d     // Catch: java.lang.Throwable -> L66
            java.lang.String r3 = "network"
            android.location.Location r2 = r2.getLastKnownLocation(r3)     // Catch: java.lang.Throwable -> L66
            android.location.LocationManager r3 = r7.f2723d     // Catch: java.lang.Throwable -> L66
            java.lang.String r4 = "passive"
            android.location.Location r3 = r3.getLastKnownLocation(r4)     // Catch: java.lang.Throwable -> L66
            boolean r4 = r7.m2947a(r1, r2)     // Catch: java.lang.Throwable -> L66
            if (r4 == 0) goto L27
            boolean r2 = r7.m2947a(r1, r3)     // Catch: java.lang.Throwable -> L66
            if (r2 == 0) goto L2f
            goto L30
        L27:
            boolean r1 = r7.m2947a(r2, r3)     // Catch: java.lang.Throwable -> L66
            if (r1 == 0) goto L2f
            r1 = r2
            goto L30
        L2f:
            r1 = r3
        L30:
            if (r1 == 0) goto L7c
            long r2 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> L66
            long r4 = r1.getTime()     // Catch: java.lang.Throwable -> L66
            long r2 = r2 - r4
            r4 = 30000(0x7530, double:1.4822E-319)
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 >= 0) goto L7c
            r7.m2945a(r1)     // Catch: java.lang.Throwable -> L66
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L66
            java.lang.String r2 = "bestLocation:"
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L66
            c.a.S.b r2 = r7.f2724e     // Catch: java.lang.Throwable -> L66
            r1.append(r2)     // Catch: java.lang.Throwable -> L66
            java.lang.String r2 = ",curTime:"
            r1.append(r2)     // Catch: java.lang.Throwable -> L66
            long r2 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> L66
            r1.append(r2)     // Catch: java.lang.Throwable -> L66
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> L66
            p031c.p032a.p066j.C0675a.m3469c(r0, r1)     // Catch: java.lang.Throwable -> L66
            c.a.S.b r0 = r7.f2724e     // Catch: java.lang.Throwable -> L66
            return r0
        L66:
            r1 = move-exception
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "loadLastGpsInfo failed: "
            r2.<init>(r3)
            java.lang.String r1 = r1.getMessage()
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            p031c.p032a.p066j.C0675a.m3475g(r0, r1)
        L7c:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p031c.p032a.p051R.C0564f.m2956d():c.a.S.b");
    }

    /* renamed from: e */
    public final boolean m2957e() {
        String str;
        try {
            if (this.f2723d == null) {
                return false;
            }
            if (this.f2723d.isProviderEnabled("gps") || this.f2723d.isProviderEnabled("network")) {
                return true;
            }
            return this.f2723d.isProviderEnabled("passive");
        } catch (IllegalArgumentException unused) {
            str = "The provider [gps] is illegal argument!";
            C0675a.m3475g("JLocationGps", str);
            return false;
        } catch (SecurityException unused2) {
            str = "No suitable permission is present when get GPS_PROVIDER!";
            C0675a.m3475g("JLocationGps", str);
            return false;
        } catch (Exception unused3) {
            str = "The ILocationManager is null!";
            C0675a.m3475g("JLocationGps", str);
            return false;
        }
    }
}
