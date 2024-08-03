package p031c.p101b.p102a.p103a;

import android.annotation.SuppressLint;
import android.content.Context;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.os.Build;
import android.os.Handler;
import android.text.TextUtils;
import java.util.Date;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import p031c.p101b.p102a.C0869a;
import p031c.p101b.p102a.p107e.C0902c;
import p031c.p101b.p102a.p114l.C0923b;
import p031c.p101b.p102a.p115m.C0938a;
import p031c.p101b.p102a.p115m.C0943f;

/* renamed from: c.b.a.a.d */
/* loaded from: classes.dex */
public class C0873d extends AbstractC0876g {

    /* renamed from: d */
    private long f3658d;

    /* renamed from: e */
    private LocationManager f3659e;

    /* renamed from: f */
    private Handler f3660f;

    /* renamed from: g */
    private long f3661g;

    /* renamed from: h */
    private long f3662h;

    /* renamed from: i */
    private String f3663i;

    /* renamed from: j */
    private boolean f3664j;

    /* renamed from: k */
    @SuppressLint({"MissingPermission"})
    private LocationListener f3665k;

    /* renamed from: l */
    private final AtomicBoolean f3666l;

    public C0873d(Context context) {
        super(context);
        this.f3661g = 900000L;
        this.f3662h = 20000L;
        this.f3664j = false;
        this.f3665k = new C0870a(this);
        this.f3666l = new AtomicBoolean();
        this.f3659e = (LocationManager) context.getSystemService("location");
        this.f3661g = C0902c.m4455c(context, 900000L);
        this.f3658d = C0902c.m4455c(context, -1L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public void m4251a(Location location) {
        C0923b.m4644b("CustomGeofenAction", "current location:" + location);
        Handler handler = this.f3660f;
        if (handler != null && handler.hasMessages(1001)) {
            this.f3660f.removeMessages(1001);
        }
        if (location == null) {
            return;
        }
        double longitude = location.getLongitude();
        double latitude = location.getLatitude();
        boolean z = false;
        Iterator<Map.Entry<String, C0874e>> it = this.f3689b.entrySet().iterator();
        while (it.hasNext()) {
            C0874e value = it.next().getValue();
            if (value.f3671e * 1000 <= System.currentTimeMillis()) {
                C0923b.m4644b("CustomGeofenAction", "Out of date geofence " + value.f3667a);
                it.remove();
                mo4275b(value);
            } else {
                double d2 = latitude;
                double m4752a = C0943f.m4752a(longitude, latitude, value.f3672f, value.f3673g);
                C0923b.m4644b("CustomGeofenAction", value.f3667a + " distance to center:" + m4752a);
                String str = m4752a <= ((double) value.f3668b) ? "in" : "out";
                double d3 = value.f3668b;
                Double.isNaN(d3);
                if (Math.abs(m4752a - d3) < 1000.0d) {
                    z = true;
                }
                C0923b.m4642a("CustomGeofenAction", "lastStatus:" + value.f3674h + ",currentStatus:" + str);
                if (!str.equals(value.f3674h)) {
                    if (value.f3674h != null && str.equals(value.f3669c) && m4264f(value)) {
                        m4261e(value);
                        m4291d(value);
                        if (!value.f3670d) {
                            C0923b.m4644b("CustomGeofenAction", "No repeat geofence " + value.f3667a);
                            this.f3689b.remove(value.f3667a);
                            m4289c();
                            mo4275b(value);
                        }
                    }
                    value.f3674h = str;
                }
                latitude = d2;
            }
        }
        if (this.f3658d == -1) {
            this.f3661g = z ? 180000L : 900000L;
        }
        m4289c();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b */
    public void m4255b(long j) {
        C0923b.m4644b("CustomGeofenAction", "Scan geofence after " + j + "ms");
        Handler handler = this.f3660f;
        if (handler == null) {
            return;
        }
        if (handler.hasMessages(1000)) {
            this.f3660f.removeMessages(1000);
        }
        this.f3660f.sendEmptyMessageDelayed(1000, j);
    }

    /* renamed from: d */
    private void m4257d() {
        try {
            HandlerThreadC0871b handlerThreadC0871b = new HandlerThreadC0871b(this, "CustomGeofenAction");
            handlerThreadC0871b.start();
            this.f3660f = new HandlerC0872c(this, handlerThreadC0871b.getLooper());
        } catch (Throwable th) {
            C0923b.m4654j("CustomGeofenAction", "init geofence handler failed:" + th);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @SuppressLint({"MissingPermission"})
    /* renamed from: e */
    public void m4259e() {
        String str;
        try {
            if (this.f3665k == null) {
                str = "Location listener is null , do nothing!";
            } else {
                if (this.f3659e != null) {
                    this.f3659e.removeUpdates(this.f3665k);
                }
                str = "locationManager is null , do nothing!";
            }
            C0923b.m4653i("CustomGeofenAction", str);
        } catch (Throwable th) {
            C0923b.m4653i("CustomGeofenAction", "remove location listener failed  e:" + th.getMessage());
        }
    }

    /* renamed from: e */
    private void m4261e(C0874e c0874e) {
        long currentTimeMillis = System.currentTimeMillis();
        c0874e.f3681o = currentTimeMillis;
        Date date = new Date(currentTimeMillis);
        String format = C0943f.m4753a("yyyy-DDD").format(date);
        if (format.equals(c0874e.f3684r)) {
            c0874e.f3685s++;
        } else {
            c0874e.f3684r = format;
            c0874e.f3685s = 1;
        }
        String format2 = C0943f.m4753a("yyyy-ww").format(date);
        if (format2.equals(c0874e.f3682p)) {
            c0874e.f3683q++;
        } else {
            c0874e.f3682p = format2;
            c0874e.f3683q = 1;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: f */
    public void m4263f() {
        C0923b.m4642a("CustomGeofenAction", "try locate...");
        if (!C0938a.m4717a(this.f3688a, "android.permission.ACCESS_FINE_LOCATION")) {
            C0923b.m4653i("CustomGeofenAction", "Require the permissionandroid.permission.ACCESS_FINE_LOCATION");
            C0923b.m4644b("CustomGeofenAction", "No location permission!");
            return;
        }
        C0923b.m4642a("CustomGeofenAction", "sdk int:" + Build.VERSION.SDK_INT + ",targetSdkVersion:" + this.f3688a.getApplicationInfo().targetSdkVersion);
        if (C0869a.m4247e(this.f3688a)) {
            if (!m4268h()) {
                C0923b.m4644b("CustomGeofenAction", "No enabled provider");
                return;
            }
            if (this.f3689b.size() <= 0) {
                mo4270a();
            } else if (this.f3666l.get()) {
                C0923b.m4642a("CustomGeofenAction", "isLocating...");
            } else {
                m4266g();
            }
        }
    }

    /* renamed from: f */
    private boolean m4264f(C0874e c0874e) {
        StringBuilder sb;
        int i;
        String sb2;
        if (c0874e.f3681o <= 0) {
            return true;
        }
        if (c0874e.f3670d) {
            long currentTimeMillis = System.currentTimeMillis();
            if (c0874e.f3680n > 0) {
                long j = c0874e.f3681o;
                if (j > 0 && currentTimeMillis < j + (r0 * 1000)) {
                    sb = new StringBuilder();
                    sb.append("in ");
                    sb.append(c0874e.f3680n);
                    sb.append("s, can't repeat geofence");
                    sb2 = sb.toString();
                }
            }
            if (c0874e.f3679m > 0 && !TextUtils.isEmpty(c0874e.f3684r)) {
                if (c0874e.f3684r.equals(C0943f.m4753a("yyyy-DDD").format(new Date(currentTimeMillis))) && c0874e.f3685s >= c0874e.f3679m) {
                    sb = new StringBuilder();
                    sb.append("today already repeat enough:");
                    sb.append(c0874e.f3685s);
                    sb.append("/");
                    i = c0874e.f3679m;
                    sb.append(i);
                    sb2 = sb.toString();
                }
            }
            if (c0874e.f3678l > 0 && !TextUtils.isEmpty(c0874e.f3682p)) {
                if (c0874e.f3682p.equals(C0943f.m4753a("yyyy-ww").format(new Date(currentTimeMillis))) && c0874e.f3683q >= c0874e.f3678l) {
                    sb = new StringBuilder();
                    sb.append("this week already repeat enough:");
                    sb.append(c0874e.f3683q);
                    sb.append("/");
                    i = c0874e.f3678l;
                    sb.append(i);
                    sb2 = sb.toString();
                }
            }
            return true;
        }
        sb2 = "can't repeat geofence";
        C0923b.m4642a("CustomGeofenAction", sb2);
        return false;
    }

    @SuppressLint({"MissingPermission"})
    /* renamed from: g */
    private void m4266g() {
        String str;
        try {
            if (this.f3659e == null) {
                C0923b.m4654j("CustomGeofenAction", "locationManager is null");
                return;
            }
            Location lastKnownLocation = this.f3659e.getLastKnownLocation("gps");
            Location lastKnownLocation2 = this.f3659e.getLastKnownLocation("network");
            Location lastKnownLocation3 = this.f3659e.getLastKnownLocation("passive");
            C0923b.m4651g("CustomGeofenAction", "gpsLocation:" + lastKnownLocation);
            C0923b.m4651g("CustomGeofenAction", "netLocation:" + lastKnownLocation2);
            C0923b.m4651g("CustomGeofenAction", "passLocation:" + lastKnownLocation3);
            long time = lastKnownLocation == null ? 0L : lastKnownLocation.getTime();
            long time2 = lastKnownLocation2 == null ? 0L : lastKnownLocation2.getTime();
            long time3 = lastKnownLocation3 == null ? 0L : lastKnownLocation3.getTime();
            if (time > time2) {
                if (time > time3) {
                }
                lastKnownLocation = lastKnownLocation3;
            } else {
                if (time2 > time3) {
                    lastKnownLocation = lastKnownLocation2;
                }
                lastKnownLocation = lastKnownLocation3;
            }
            if (System.currentTimeMillis() - (lastKnownLocation != null ? lastKnownLocation.getTime() : 0L) < 30000) {
                StringBuilder sb = new StringBuilder();
                sb.append("need not restart gpslocation,the time with last:");
                sb.append(System.currentTimeMillis() - (lastKnownLocation != null ? lastKnownLocation.getTime() : 0L));
                C0923b.m4644b("CustomGeofenAction", sb.toString());
                m4251a(lastKnownLocation);
                return;
            }
            this.f3663i = null;
            if (this.f3659e.isProviderEnabled("gps")) {
                this.f3663i = "gps";
            } else if (this.f3659e.isProviderEnabled("network")) {
                this.f3663i = "network";
            }
            C0923b.m4642a("CustomGeofenAction", "provider " + this.f3663i);
            if (TextUtils.isEmpty(this.f3663i)) {
                C0923b.m4644b("CustomGeofenAction", "not gps nor network provider,stop scan geofence");
                return;
            }
            this.f3666l.set(true);
            this.f3659e.requestLocationUpdates(this.f3663i, 2000L, 0.0f, this.f3665k);
            this.f3660f.sendEmptyMessageDelayed(1001, this.f3662h);
        } catch (SecurityException unused) {
            str = "No suitable permission when get last known location!";
            C0923b.m4654j("CustomGeofenAction", str);
        } catch (Throwable th) {
            str = "The provider is illegal argument!" + th;
            C0923b.m4654j("CustomGeofenAction", str);
        }
    }

    /* renamed from: h */
    private boolean m4268h() {
        String str;
        try {
            if (this.f3659e == null) {
                return false;
            }
            if (!this.f3659e.isProviderEnabled("gps") && !this.f3659e.isProviderEnabled("network")) {
                if (!this.f3659e.isProviderEnabled("passive")) {
                    return false;
                }
            }
            return true;
        } catch (IllegalArgumentException unused) {
            str = "The provider [gps] is illegal argument!";
            C0923b.m4654j("CustomGeofenAction", str);
            return false;
        } catch (SecurityException unused2) {
            str = "No suitable permission is present when get GPS_PROVIDER!";
            C0923b.m4654j("CustomGeofenAction", str);
            return false;
        } catch (Throwable th) {
            str = "Check GPS enable failed:" + th;
            C0923b.m4654j("CustomGeofenAction", str);
            return false;
        }
    }

    @Override // p031c.p101b.p102a.p103a.AbstractC0876g
    /* renamed from: a */
    protected synchronized void mo4270a() {
        C0923b.m4644b("CustomGeofenAction", "geofence size:" + this.f3689b.size());
        C0923b.m4644b("CustomGeofenAction", "stop listen geofence");
        if (this.f3664j) {
            if (this.f3660f != null) {
                this.f3660f.removeMessages(1000);
            }
            this.f3664j = false;
        }
    }

    @Override // p031c.p101b.p102a.p103a.AbstractC0876g
    /* renamed from: a */
    public void mo4271a(long j) {
        C0923b.m4644b("CustomGeofenAction", "Set geofence interval " + j);
        this.f3661g = j;
        this.f3658d = j;
        C0902c.m4453b(this.f3688a, j);
    }

    @Override // p031c.p101b.p102a.p103a.AbstractC0876g
    /* renamed from: a */
    protected void mo4272a(C0874e c0874e) {
        Handler handler;
        C0923b.m4644b("CustomGeofenAction", "Geofence create success, id=" + c0874e.f3667a);
        if (!this.f3664j || (handler = this.f3660f) == null) {
            return;
        }
        handler.sendEmptyMessage(1002);
    }

    @Override // p031c.p101b.p102a.p103a.AbstractC0876g
    /* renamed from: a */
    protected void mo4273a(C0874e c0874e, C0874e c0874e2) {
        Handler handler;
        C0923b.m4644b("CustomGeofenAction", "Geofence update success, id=" + c0874e.f3667a);
        if (!this.f3664j || (handler = this.f3660f) == null) {
            return;
        }
        handler.sendEmptyMessage(1002);
    }

    @Override // p031c.p101b.p102a.p103a.AbstractC0876g
    /* renamed from: b */
    public synchronized void mo4274b() {
        C0923b.m4644b("CustomGeofenAction", "start listen geofence");
        if (this.f3664j) {
            C0923b.m4650f("CustomGeofenAction", "geofence is running!");
            return;
        }
        if (this.f3689b.size() == 0) {
            C0923b.m4644b("CustomGeofenAction", "No geofence,not need listen");
            return;
        }
        if (this.f3660f == null) {
            m4257d();
        }
        m4255b(0L);
        this.f3664j = true;
    }

    @Override // p031c.p101b.p102a.p103a.AbstractC0876g
    /* renamed from: b */
    protected void mo4275b(C0874e c0874e) {
        C0923b.m4644b("CustomGeofenAction", "Geofence delete success, id=" + c0874e.f3667a);
    }
}
