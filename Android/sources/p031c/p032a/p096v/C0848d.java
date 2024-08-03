package p031c.p032a.p096v;

import android.content.Context;
import android.provider.Settings;
import android.text.TextUtils;
import java.io.File;
import p031c.p032a.p057a.C0583a;
import p031c.p032a.p060d.C0601d;
import p031c.p032a.p091r.C0812a;
import p031c.p032a.p100z.C0866a;
import p031c.p032a.p100z.C0867b;

/* renamed from: c.a.v.d */
/* loaded from: classes.dex */
public final class C0848d {

    /* renamed from: a */
    public static int f3597a = 1;

    /* JADX WARN: Removed duplicated region for block: B:24:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x009f  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.String m4128a(android.content.Context r7) {
        /*
            c.a.z.a r0 = p031c.p032a.p100z.C0866a.m4199a()
            java.lang.Object r0 = p031c.p032a.p100z.C0867b.m4225a(r7, r0)
            java.lang.String r0 = (java.lang.String) r0
            boolean r1 = p031c.p032a.p096v.C0854j.m4167g(r0)
            if (r1 == 0) goto L14
            r7 = 3
            p031c.p032a.p096v.C0848d.f3597a = r7
            return r0
        L14:
            java.lang.String r0 = m4130b(r7, r0)
            boolean r1 = p031c.p032a.p096v.C0854j.m4167g(r0)
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L34
            p031c.p032a.p096v.C0848d.f3597a = r3
            m4132d(r7, r0)
            c.a.z.a[] r1 = new p031c.p032a.p100z.C0866a[r3]
            c.a.z.a r3 = p031c.p032a.p100z.C0866a.m4199a()
            r3.m4224a(r0)
            r1[r2] = r3
            p031c.p032a.p100z.C0867b.m4229a(r7, r1)
            return r0
        L34:
            java.lang.String r0 = "do not get deviceId from SD"
            boolean r0 = p031c.p032a.p057a.C0583a.m2982a(r7, r3, r0)
            if (r0 != 0) goto L83
            java.lang.String r0 = "android.permission.READ_EXTERNAL_STORAGE"
            boolean r0 = p031c.p032a.p091r.C0812a.m3939a(r7, r0)
            if (r0 == 0) goto L83
            java.lang.String r0 = p031c.p032a.p091r.C0812a.m3942b()
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            if (r1 != 0) goto L7c
            java.io.File r1 = new java.io.File
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r0)
            java.lang.String r0 = ".push_deviceid"
            r4.append(r0)
            java.lang.String r0 = r4.toString()
            r1.<init>(r0)
            java.lang.String r0 = p031c.p032a.p096v.C0849e.m4140b(r1)
            if (r0 == 0) goto L83
            java.lang.String r1 = "\n"
            int r1 = r0.indexOf(r1)
            if (r1 >= 0) goto L73
            goto L77
        L73:
            java.lang.String r0 = r0.substring(r2, r1)
        L77:
            java.lang.String r0 = r0.trim()
            goto L84
        L7c:
            java.lang.String r0 = "DeviceIdUtils"
            java.lang.String r1 = "can't get sdcard data path"
            p031c.p032a.p060d.C0601d.m3079h(r0, r1)
        L83:
            r0 = 0
        L84:
            boolean r1 = p031c.p032a.p096v.C0854j.m4167g(r0)
            if (r1 == 0) goto L9f
            r1 = 2
            p031c.p032a.p096v.C0848d.f3597a = r1
            m4131c(r7, r0)
            c.a.z.a[] r1 = new p031c.p032a.p100z.C0866a[r3]
            c.a.z.a r3 = p031c.p032a.p100z.C0866a.m4199a()
            r3.m4224a(r0)
            r1[r2] = r3
            p031c.p032a.p100z.C0867b.m4229a(r7, r1)
            return r0
        L9f:
            int r1 = android.os.Build.VERSION.SDK_INT
            r4 = 23
            java.lang.String r5 = ""
            if (r1 >= r4) goto Lac
            java.lang.String r0 = p031c.p032a.p091r.C0812a.m3943b(r7, r0)
            goto Lad
        Lac:
            r0 = r5
        Lad:
            java.lang.String r1 = p031c.p032a.p091r.C0812a.m3952f(r7)
            java.lang.String r4 = p031c.p032a.p091r.C0812a.m3948d(r7, r5)
            java.util.UUID r5 = java.util.UUID.randomUUID()
            java.lang.String r5 = r5.toString()
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            r6.append(r0)
            r6.append(r1)
            r6.append(r4)
            r6.append(r5)
            java.lang.String r0 = r6.toString()
            java.lang.String r0 = p031c.p032a.p096v.C0854j.m4163c(r0)
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            if (r1 == 0) goto Ldd
            r0 = r5
        Ldd:
            c.a.z.a[] r1 = new p031c.p032a.p100z.C0866a[r3]
            c.a.z.a r3 = p031c.p032a.p100z.C0866a.m4199a()
            r3.m4224a(r0)
            r1[r2] = r3
            p031c.p032a.p100z.C0867b.m4229a(r7, r1)
            p031c.p032a.p096v.C0848d.f3597a = r2
            m4131c(r7, r0)
            m4132d(r7, r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p031c.p032a.p096v.C0848d.m4128a(android.content.Context):java.lang.String");
    }

    /* renamed from: a */
    public static void m4129a(Context context, String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        m4131c(context, str);
        m4132d(context, str);
        C0866a<String> m4199a = C0866a.m4199a();
        m4199a.m4224a((C0866a<String>) str);
        C0867b.m4229a(context, (C0866a<?>[]) new C0866a[]{m4199a});
    }

    /* renamed from: b */
    private static String m4130b(Context context, String str) {
        if (!C0812a.m3939a(context, "android.permission.WRITE_SETTINGS")) {
            return str;
        }
        try {
            return Settings.System.getString(context.getContentResolver(), "dig");
        } catch (Throwable unused) {
            C0601d.m3079h("DeviceIdUtils", "Can not read from settings");
            return str;
        }
    }

    /* renamed from: c */
    private static String m4131c(Context context, String str) {
        if (!C0812a.m3939a(context, "android.permission.WRITE_SETTINGS")) {
            return null;
        }
        try {
            if (Settings.System.putString(context.getContentResolver(), "dig", str)) {
                return str;
            }
            return null;
        } catch (Throwable unused) {
            C0601d.m3079h("DeviceIdUtils", "Can not write settings");
            return null;
        }
    }

    /* renamed from: d */
    private static String m4132d(Context context, String str) {
        if (C0583a.m2982a(context, true, "not write deviceId to SD")) {
            return str;
        }
        if (!C0812a.m3939a(context, "android.permission.WRITE_EXTERNAL_STORAGE")) {
            return null;
        }
        try {
            String m3942b = C0812a.m3942b();
            if (TextUtils.isEmpty(m3942b)) {
                C0601d.m3079h("DeviceIdUtils", "can't get sdcard data path");
                return null;
            }
            C0849e.m4136a(new File(m3942b + ".push_deviceid"), str);
            return str;
        } catch (Throwable unused) {
            return null;
        }
    }
}
