package p031c.p032a.p059c;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Locale;
import p031c.p032a.p060d.C0601d;
import p031c.p032a.p091r.C0812a;
import p031c.p032a.p096v.C0854j;
import p031c.p032a.p100z.C0866a;
import p031c.p032a.p100z.C0867b;

/* renamed from: c.a.c.b */
/* loaded from: classes.dex */
public final class C0591b {

    /* renamed from: a */
    private static String f2819a = "";

    /* renamed from: b */
    private static String f2820b = null;

    /* renamed from: c */
    private static Pair<String, Integer> f2821c = null;

    /* renamed from: d */
    public static String f2822d = ".permission.JPUSH_MESSAGE";

    /* renamed from: e */
    private static final ArrayList<String> f2823e = new ArrayList<>();

    /* renamed from: f */
    private static final ArrayList<String> f2824f = new ArrayList<>();

    /* renamed from: g */
    private static final ArrayList<String> f2825g;

    static {
        f2823e.add("android.permission.INTERNET");
        f2823e.add("android.permission.ACCESS_NETWORK_STATE");
        f2824f.add("android.permission.WAKE_LOCK");
        f2824f.add("android.permission.VIBRATE");
        f2824f.add("android.permission.CHANGE_WIFI_STATE");
        ArrayList<String> arrayList = new ArrayList<>();
        f2825g = arrayList;
        arrayList.add("android.permission.ACCESS_FINE_LOCATION");
        f2825g.add("android.permission.ACCESS_COARSE_LOCATION");
        f2825g.add("android.permission.ACCESS_LOCATION_EXTRA_COMMANDS");
        f2825g.add("android.permission.ACCESS_WIFI_STATE");
    }

    /* renamed from: a */
    public static String m3019a(Context context) {
        if (TextUtils.isEmpty(f2819a)) {
            try {
                if (context != null) {
                    ApplicationInfo applicationInfo = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128);
                    if (applicationInfo != null && applicationInfo.metaData != null) {
                        String m3020a = m3020a(applicationInfo.metaData, "JPUSH_APPKEY");
                        f2819a = m3020a;
                        if (!TextUtils.isEmpty(m3020a)) {
                            f2819a = f2819a.toLowerCase(Locale.getDefault());
                        }
                    }
                } else {
                    C0601d.m3072b("CheckManifestHelper", "[getAppKey] context is null");
                }
            } catch (Throwable unused) {
            }
        }
        return f2819a;
    }

    /* renamed from: a */
    public static String m3020a(Bundle bundle, String str) {
        Object obj;
        if (bundle == null || (obj = bundle.get(str)) == null) {
            return null;
        }
        return obj.toString();
    }

    /* renamed from: a */
    public static void m3021a(Context context, String str) {
        f2820b = str;
        C0866a<String> m4211l = C0866a.m4211l();
        m4211l.m4224a((C0866a<String>) str);
        C0867b.m4229a(context, (C0866a<?>[]) new C0866a[]{m4211l});
        m3022b(context);
    }

    /* renamed from: b */
    public static String m3022b(Context context) {
        StringBuilder sb;
        if (f2820b == null && context != null) {
            try {
                String m3044a = C0595f.m3044a(context);
                f2820b = m3044a;
                if (m3044a != null) {
                    sb = new StringBuilder("get option channel - ");
                    sb.append(f2820b);
                } else {
                    ApplicationInfo applicationInfo = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128);
                    if (applicationInfo != null && applicationInfo.metaData != null) {
                        String m3020a = m3020a(applicationInfo.metaData, "JPUSH_CHANNEL");
                        f2820b = m3020a;
                        if (!TextUtils.isEmpty(m3020a)) {
                            f2820b = C0854j.m4162b(f2820b);
                        }
                    }
                    sb = new StringBuilder("manifest:channel - ");
                    sb.append(f2820b);
                }
                C0601d.m3074c("CheckManifestHelper", sb.toString());
            } catch (Throwable unused) {
            }
        }
        return f2820b;
    }

    /* renamed from: c */
    public static Pair<String, Integer> m3023c(Context context) {
        if (f2821c == null) {
            try {
                PackageInfo packageInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), 0);
                String str = packageInfo.versionName;
                if (str != null && str.length() > 30) {
                    str = str.substring(0, 30);
                }
                f2821c = new Pair<>(str, Integer.valueOf(packageInfo.versionCode));
            } catch (Throwable unused) {
                C0601d.m3074c("CheckManifestHelper", "NO versionCode or versionName defined in manifest.");
            }
        }
        return f2821c;
    }

    /* renamed from: d */
    public static boolean m3024d(Context context) {
        String m3019a = m3019a(context);
        if (TextUtils.isEmpty(m3019a)) {
            C0601d.m3080i("CheckManifestHelper", "errorcode:10001,metadata: JCore appKey - not defined in manifest");
            C0812a.m3936a(context, " 未在manifest中配置AppKey", -1);
            return false;
        }
        if (m3019a.length() != 24) {
            C0601d.m3080i("CheckManifestHelper", "errorcode:1008,Invalid appKey : " + m3019a + ", Please get your Appkey from JIGUANG web console!");
            C0812a.m3936a(context, " AppKey:" + m3019a + " 是无效的AppKey,请确认与JIGUANG web端的AppKey一致", -1);
            return false;
        }
        m3022b(context);
        if (C0592c.m3025a().m3035c() || C0592c.m3025a().m3034b()) {
            String str = context.getPackageName() + f2822d;
            if (!C0812a.m3953f(context, str)) {
                C0601d.m3080i("CheckManifestHelper", "The permission should be defined - " + str);
                return false;
            }
            f2823e.add(str);
        }
        Iterator<String> it = f2823e.iterator();
        while (it.hasNext()) {
            String next = it.next();
            if (!C0812a.m3939a(context, next)) {
                C0601d.m3080i("CheckManifestHelper", "The permissoin is required - " + next);
                return false;
            }
        }
        if (Build.VERSION.SDK_INT < 23 && !C0812a.m3939a(context, "android.permission.WRITE_EXTERNAL_STORAGE")) {
            C0601d.m3080i("CheckManifestHelper", "The permissoin is required - android.permission.WRITE_EXTERNAL_STORAGE");
            return false;
        }
        Iterator<String> it2 = f2824f.iterator();
        while (it2.hasNext()) {
            String next2 = it2.next();
            if (!C0812a.m3939a(context, next2)) {
                C0601d.m3077f("CheckManifestHelper", "We recommend you add the permission - " + next2);
            }
        }
        Iterator<String> it3 = f2825g.iterator();
        while (it3.hasNext()) {
            String next3 = it3.next();
            if (!C0812a.m3939a(context, next3)) {
                C0601d.m3077f("CheckManifestHelper", "We recommend you add the permission - " + next3 + ", otherwise you can not locate the devices.");
            }
        }
        return true;
    }
}
