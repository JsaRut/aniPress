package p031c.p032a.p072p.p073a.p080f.p084d;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.os.Build;
import android.provider.Settings;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import com.facebook.react.modules.deviceinfo.DeviceInfoModule;
import java.util.TimeZone;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;
import p031c.p032a.p072p.p073a.C0727d;
import p031c.p032a.p072p.p073a.p080f.p081a.C0732b;
import p031c.p032a.p072p.p073a.p080f.p087g.C0759a;

/* renamed from: c.a.p.a.f.d.a */
/* loaded from: classes.dex */
public final class C0744a {

    /* renamed from: a */
    private static C0744a f3343a;

    /* renamed from: b */
    private transient AtomicBoolean f3344b = new AtomicBoolean(false);

    /* renamed from: c */
    private SharedPreferences f3345c;

    /* renamed from: d */
    private String f3346d;

    /* renamed from: e */
    private String f3347e;

    /* renamed from: f */
    private String f3348f;

    /* renamed from: g */
    private String f3349g;

    /* renamed from: h */
    private String f3350h;

    /* renamed from: i */
    private String f3351i;

    /* renamed from: j */
    private String f3352j;

    /* renamed from: k */
    private int f3353k;

    /* renamed from: l */
    private int f3354l;

    /* renamed from: m */
    private String f3355m;

    /* renamed from: n */
    private String f3356n;

    /* renamed from: o */
    private String f3357o;

    /* renamed from: p */
    private String f3358p;

    /* renamed from: q */
    private int f3359q;

    /* renamed from: r */
    private String f3360r;

    /* renamed from: s */
    private String f3361s;

    /* renamed from: t */
    private String f3362t;

    /* renamed from: u */
    private String f3363u;

    /* renamed from: v */
    private String f3364v;

    /* renamed from: w */
    private String f3365w;

    /* renamed from: x */
    private String f3366x;

    /* renamed from: y */
    private String f3367y;

    /* renamed from: z */
    private String f3368z;

    private C0744a() {
    }

    /* renamed from: a */
    public static C0744a m3764a() {
        if (f3343a == null) {
            f3343a = new C0744a();
        }
        return f3343a;
    }

    /* renamed from: a */
    private void m3765a(String str, String str2) {
        SharedPreferences sharedPreferences = this.f3345c;
        if (sharedPreferences != null) {
            SharedPreferences.Editor edit = sharedPreferences.edit();
            edit.putString(str, str2);
            edit.apply();
        }
    }

    /* renamed from: b */
    private static ApplicationInfo m3766b(Context context) {
        try {
            return context.getPackageManager().getApplicationInfo(context.getPackageName(), 0);
        } catch (Throwable th) {
            C0732b.m3719b(DeviceInfoModule.NAME, "Unexpected: failed to get current application info", th);
            return null;
        }
    }

    /* renamed from: c */
    private static String m3767c(Context context) {
        try {
            for (PackageInfo packageInfo : context.getPackageManager().getInstalledPackages(64)) {
                if (packageInfo.packageName.equals(context.getPackageName())) {
                    return packageInfo.signatures[0].toCharsString();
                }
            }
            return null;
        } catch (Throwable th) {
            C0732b.m3720c(DeviceInfoModule.NAME, "getSign error:" + th.getMessage());
            return null;
        }
    }

    /* renamed from: a */
    public final void m3768a(Context context) {
        if (this.f3344b.get() || context == null) {
            return;
        }
        this.f3345c = context.getSharedPreferences(DeviceInfoModule.NAME, 0);
        this.f3361s = this.f3345c.getString("JANALYSIS_UUID", "");
        if (TextUtils.isEmpty(this.f3361s)) {
            this.f3361s = UUID.randomUUID().toString();
            m3765a("JANALYSIS_UUID", this.f3361s);
        }
        this.f3368z = this.f3345c.getString("firstStartTime", "");
        if (TextUtils.isEmpty(this.f3368z)) {
            StringBuilder sb = new StringBuilder();
            sb.append(System.currentTimeMillis());
            this.f3368z = sb.toString();
            m3765a("firstStartTime", this.f3368z);
        }
        ApplicationInfo m3766b = m3766b(context);
        if (m3766b != null) {
            try {
                this.f3346d = context.getPackageManager().getApplicationLabel(m3766b).toString();
            } catch (Throwable th) {
                C0732b.m3720c(DeviceInfoModule.NAME, "get appname error:" + th.getMessage());
            }
        }
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), 0);
            this.f3359q = packageInfo.versionCode;
            this.f3360r = packageInfo.versionName;
            StringBuilder sb2 = new StringBuilder();
            sb2.append(packageInfo.firstInstallTime);
            this.f3367y = sb2.toString();
            if (this.f3360r.length() > 30) {
                this.f3360r = this.f3360r.substring(0, 30);
            }
        } catch (Throwable unused) {
            C0732b.m3718b(DeviceInfoModule.NAME, "NO versionCode or versionName defined in manifest.");
        }
        this.f3356n = C0759a.m3801b(context);
        if (C0727d.f3306g) {
            this.f3357o = C0759a.m3798a(context, "");
        }
        String m3767c = m3767c(context);
        if (!TextUtils.isEmpty(m3767c)) {
            this.f3348f = C0759a.m3799a(m3767c);
        }
        this.f3347e = context.getPackageName();
        this.f3366x = context.getResources().getConfiguration().locale.getLanguage();
        this.f3365w = TimeZone.getDefault().getDisplayName(false, 0);
        this.f3349g = "1.0.0";
        StringBuilder sb3 = new StringBuilder();
        sb3.append(Build.VERSION.SDK_INT);
        this.f3364v = sb3.toString();
        this.f3363u = "Android";
        this.f3350h = Build.MODEL;
        this.f3352j = Build.DEVICE;
        this.f3351i = C0746c.m3771a(context, "gsm.version.baseband", "baseband");
        try {
            this.f3355m = Settings.Secure.getString(context.getContentResolver(), "android_id");
        } catch (Exception unused2) {
        }
        if (TextUtils.isEmpty(this.f3355m)) {
            this.f3355m = "";
        }
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        if (displayMetrics != null) {
            this.f3353k = displayMetrics.widthPixels;
            this.f3354l = displayMetrics.heightPixels;
        }
        this.f3362t = !TextUtils.isEmpty(this.f3357o) ? this.f3357o : !TextUtils.isEmpty(this.f3356n) ? this.f3356n : !TextUtils.isEmpty(this.f3355m) ? this.f3355m : this.f3361s;
        this.f3344b.set(true);
    }

    public final String toString() {
        return "DeviceInfo{appname='" + this.f3346d + "', pkgname='" + this.f3347e + "', signature='" + this.f3348f + "', sdkversion='" + this.f3349g + "', model='" + this.f3350h + "', baseband='" + this.f3351i + "', device='" + this.f3352j + "', width=" + this.f3353k + ", height=" + this.f3354l + ", android_id='" + this.f3355m + "', imei='" + this.f3356n + "', mac_address='" + this.f3357o + "', netType='" + this.f3358p + "', versionCode=" + this.f3359q + ", versionName='" + this.f3360r + "', uuid='" + this.f3361s + "', soleId='" + this.f3362t + "', os='" + this.f3363u + "', osVersion='" + this.f3364v + "', timezone='" + this.f3365w + "', language='" + this.f3366x + "', installTime='" + this.f3367y + "', firstStartTime='" + this.f3368z + "'}";
    }
}
