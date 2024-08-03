package p031c.p032a.p091r;

import android.content.Context;
import android.os.Build;
import com.facebook.react.modules.deviceinfo.DeviceInfoModule;
import java.util.concurrent.atomic.AtomicBoolean;
import p031c.p032a.p048P.p049a.C0557c;
import p031c.p032a.p065i.C0661d;
import p031c.p032a.p066j.C0675a;

/* renamed from: c.a.r.c */
/* loaded from: classes.dex */
public final class C0814c {

    /* renamed from: a */
    private static volatile C0814c f3530a;

    /* renamed from: b */
    private static final Object f3531b = new Object();

    /* renamed from: c */
    private static String f3532c;

    /* renamed from: d */
    private transient AtomicBoolean f3533d = new AtomicBoolean(false);

    /* renamed from: e */
    public String f3534e;

    /* renamed from: f */
    public String f3535f;

    /* renamed from: g */
    public String f3536g;

    /* renamed from: h */
    public String f3537h;

    /* renamed from: i */
    public String f3538i;

    /* renamed from: j */
    public String f3539j;

    /* renamed from: k */
    public int f3540k;

    /* renamed from: l */
    public String f3541l;

    /* renamed from: m */
    public String f3542m;

    /* renamed from: n */
    public String f3543n;

    /* renamed from: o */
    public String f3544o;

    /* renamed from: p */
    public String f3545p;

    /* renamed from: q */
    public String f3546q;

    /* renamed from: r */
    public String f3547r;

    /* renamed from: s */
    public String f3548s;

    /* renamed from: t */
    public String f3549t;

    /* renamed from: u */
    public String f3550u;

    private C0814c(Context context) {
        if (this.f3533d.get() || context == null) {
            return;
        }
        this.f3535f = m3963a(Build.VERSION.RELEASE) + "," + Build.VERSION.SDK_INT;
        this.f3536g = m3963a(Build.MODEL);
        this.f3537h = C0812a.m3933a(context, "gsm.version.baseband", "baseband");
        this.f3538i = m3963a(Build.DEVICE);
        this.f3544o = m3963a(Build.PRODUCT);
        this.f3545p = m3963a(Build.MANUFACTURER);
        this.f3546q = m3963a(Build.FINGERPRINT);
        this.f3547r = m3963a(Build.BRAND);
        this.f3534e = m3964b(context);
        this.f3548s = C0557c.m2915i(context);
        this.f3539j = C0557c.m2910d(context);
        this.f3540k = C0812a.m3949d(context) ? 1 : 0;
        this.f3541l = C0812a.m3950e(context);
        this.f3542m = C0812a.m3952f(context);
        this.f3543n = C0557c.m2903a(context, false, "won't get serial") ? " " : Build.SERIAL;
        this.f3549t = C0812a.m3946c(context, "");
        Object m3386a = C0661d.m3386a(context, "get_imei", null);
        if (m3386a instanceof String) {
            this.f3550u = (String) m3386a;
        }
        this.f3533d.set(true);
    }

    /* renamed from: a */
    public static C0814c m3962a(Context context) {
        if (f3530a == null) {
            synchronized (f3531b) {
                if (f3530a == null) {
                    f3530a = new C0814c(context);
                }
            }
        }
        return f3530a;
    }

    /* renamed from: a */
    private static String m3963a(String str) {
        if (str != null) {
            return str.trim();
        }
        return null;
    }

    /* renamed from: b */
    private static String m3964b(Context context) {
        if (f3532c == null) {
            try {
                String str = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionName;
                if (str.length() > 30) {
                    str = str.substring(0, 30);
                }
                f3532c = str;
            } catch (Throwable unused) {
                C0675a.m3471d(DeviceInfoModule.NAME, "NO versionName defined in manifest.");
            }
        }
        String str2 = f3532c;
        return str2 == null ? "" : str2;
    }
}
