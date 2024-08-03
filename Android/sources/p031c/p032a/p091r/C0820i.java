package p031c.p032a.p091r;

import android.content.Context;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import java.lang.reflect.InvocationTargetException;
import p031c.p032a.p066j.C0675a;

/* renamed from: c.a.r.i */
/* loaded from: classes.dex */
public final class C0820i {
    /* renamed from: a */
    public static int m4002a(Context context) {
        String m4005c = m4005c(context);
        if (TextUtils.isEmpty(m4005c)) {
            return 0;
        }
        if ("wifi".equals(m4005c)) {
            return 1;
        }
        if ("2g".equals(m4005c)) {
            return 2;
        }
        if ("3g".equals(m4005c)) {
            return 3;
        }
        return "4g".equals(m4005c) ? 4 : 0;
    }

    /* renamed from: a */
    public static String m4003a(Context context, int i) {
        String m4005c = m4005c(context);
        C0675a.m3465a("TeleonyManagerUtils", "getCurrentNetType - type:" + m4005c);
        if (TextUtils.isEmpty(m4005c)) {
            try {
                Object m3983a = C0817f.m3983a((Class<?>) TelephonyManager.class, "getNetworkClass", new Object[]{Integer.valueOf(i)}, new Class[]{Integer.TYPE});
                if (((Integer) m3983a).intValue() == 0) {
                    m4005c = "unknown";
                } else if (((Integer) m3983a).intValue() == 1) {
                    m4005c = "2g";
                } else if (((Integer) m3983a).intValue() == 2) {
                    m4005c = "3g";
                } else if (((Integer) m3983a).intValue() == 3) {
                    m4005c = "4g";
                }
                C0675a.m3469c("TeleonyManagerUtils", "step2 - type:" + m4005c);
            } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException | Exception unused) {
            }
        }
        return TextUtils.isEmpty(m4005c) ? "unknown" : m4005c;
    }

    /* renamed from: b */
    public static String m4004b(Context context) {
        try {
            return ((TelephonyManager) context.getSystemService("phone")).getNetworkOperator();
        } catch (Exception unused) {
            return "";
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:14:0x003d. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0048  */
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.String m4005c(android.content.Context r4) {
        /*
            java.lang.String r0 = "unknown"
            java.lang.String r1 = "connectivity"
            java.lang.Object r4 = r4.getSystemService(r1)     // Catch: java.lang.Exception -> L4a
            android.net.ConnectivityManager r4 = (android.net.ConnectivityManager) r4     // Catch: java.lang.Exception -> L4a
            android.net.NetworkInfo r4 = r4.getActiveNetworkInfo()     // Catch: java.lang.Exception -> L4a
            if (r4 == 0) goto L4e
            int r1 = r4.getType()     // Catch: java.lang.Exception -> L4a
            r2 = 1
            if (r1 != r2) goto L1a
            java.lang.String r0 = "wifi"
            goto L4e
        L1a:
            int r1 = r4.getType()     // Catch: java.lang.Exception -> L4a
            if (r1 != 0) goto L4e
            int r4 = r4.getSubtype()     // Catch: java.lang.Exception -> L4a
            java.lang.String r1 = "TeleonyManagerUtils"
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L4a
            java.lang.String r3 = "getNetworkClass networkType:"
            r2.<init>(r3)     // Catch: java.lang.Exception -> L4a
            r2.append(r4)     // Catch: java.lang.Exception -> L4a
            java.lang.String r2 = r2.toString()     // Catch: java.lang.Exception -> L4a
            p031c.p032a.p066j.C0675a.m3465a(r1, r2)     // Catch: java.lang.Exception -> L4a
            java.lang.String r1 = "4g"
            java.lang.String r2 = "3g"
            java.lang.String r3 = "2g"
            switch(r4) {
                case 1: goto L48;
                case 2: goto L48;
                case 3: goto L46;
                case 4: goto L48;
                case 5: goto L46;
                case 6: goto L46;
                case 7: goto L48;
                case 8: goto L46;
                case 9: goto L46;
                case 10: goto L46;
                case 11: goto L48;
                case 12: goto L46;
                case 13: goto L44;
                case 14: goto L46;
                case 15: goto L46;
                default: goto L40;
            }
        L40:
            switch(r4) {
                case 16: goto L48;
                case 17: goto L46;
                case 18: goto L44;
                case 19: goto L44;
                default: goto L43;
            }
        L43:
            goto L4e
        L44:
            r0 = r1
            goto L4e
        L46:
            r0 = r2
            goto L4e
        L48:
            r0 = r3
            goto L4e
        L4a:
            r4 = move-exception
            r4.printStackTrace()
        L4e:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p031c.p032a.p091r.C0820i.m4005c(android.content.Context):java.lang.String");
    }
}
