package p031c.p032a.p046N;

import android.content.Context;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import p031c.p032a.p048P.p049a.C0557c;
import p031c.p032a.p066j.C0675a;
import p031c.p032a.p091r.C0812a;

/* renamed from: c.a.N.c */
/* loaded from: classes.dex */
public final class C0547c {
    /* renamed from: a */
    public static String m2840a(Context context, String str) {
        try {
            Class<?> loadClass = context.getClassLoader().loadClass("android.os.SystemProperties");
            return (String) loadClass.getMethod("get", String.class).invoke(loadClass, new String(str));
        } catch (Throwable unused) {
            return "";
        }
    }

    /* renamed from: a */
    public static String m2841a(String str) {
        if (!TextUtils.isEmpty(str) && str.length() < 14) {
            return null;
        }
        return str;
    }

    /* JADX WARN: Code restructure failed: missing block: B:161:0x07ce, code lost:            if (android.text.TextUtils.isEmpty(r2.trim().replace(",", "")) == false) goto L894;     */
    /* JADX WARN: Code restructure failed: missing block: B:310:0x05dd, code lost:            if (android.text.TextUtils.isEmpty(r1.trim().replace(",", "")) == false) goto L741;     */
    /* JADX WARN: Removed duplicated region for block: B:195:0x01c0  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x025f  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x02df  */
    /* JADX WARN: Removed duplicated region for block: B:309:0x05d1  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.util.ArrayList<p031c.p032a.p045M.C0544b> m2842a(android.content.Context r17) {
        /*
            Method dump skipped, instructions count: 2371
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p031c.p032a.p046N.C0547c.m2842a(android.content.Context):java.util.ArrayList");
    }

    /* renamed from: b */
    public static String m2843b(Context context, String str) {
        try {
        } catch (Exception e2) {
            e2.printStackTrace();
        }
        if (C0557c.m2903a(context, false, "do not getIccid")) {
            return "";
        }
        if (C0812a.m3939a(context, "android.permission.READ_PHONE_STATE")) {
            str = ((TelephonyManager) context.getSystemService("phone")).getSimSerialNumber();
        } else {
            C0675a.m3475g("JIGUANG-JDeviceImeiHelper", "collect simSerialNumber failed because has no android.permission.READ_PHONE_STATE");
        }
        return str;
    }
}
