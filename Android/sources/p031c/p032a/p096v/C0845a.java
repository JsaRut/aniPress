package p031c.p032a.p096v;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.content.pm.ResolveInfo;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;
import p031c.p032a.p091r.C0812a;

/* renamed from: c.a.v.a */
/* loaded from: classes.dex */
public final class C0845a {

    /* renamed from: a */
    private static String f3592a;

    /* renamed from: a */
    public static ProviderInfo m4117a(Context context, String str, String str2) {
        if (context != null && !TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            try {
                PackageInfo packageInfo = context.getPackageManager().getPackageInfo(str, 8);
                if (packageInfo.providers != null && packageInfo.providers.length != 0) {
                    for (ProviderInfo providerInfo : packageInfo.providers) {
                        if (str2.equals(providerInfo.authority)) {
                            return providerInfo;
                        }
                    }
                }
            } catch (Throwable unused) {
            }
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0039, code lost:            p031c.p032a.p096v.C0845a.f3592a = r1.processName;     */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.String m4118a(android.content.Context r3) {
        /*
            java.lang.String r0 = p031c.p032a.p096v.C0845a.f3592a
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto Lb
            java.lang.String r3 = p031c.p032a.p096v.C0845a.f3592a
            return r3
        Lb:
            android.content.Context r3 = p031c.p032a.p057a.C0583a.m2978a(r3)     // Catch: java.lang.Throwable -> L3e
            r0 = 0
            if (r3 == 0) goto L1b
            java.lang.String r0 = "activity"
            java.lang.Object r3 = r3.getSystemService(r0)     // Catch: java.lang.Throwable -> L3e
            r0 = r3
            android.app.ActivityManager r0 = (android.app.ActivityManager) r0     // Catch: java.lang.Throwable -> L3e
        L1b:
            if (r0 == 0) goto L56
            int r3 = android.os.Process.myPid()     // Catch: java.lang.Throwable -> L3e
            java.util.List r0 = r0.getRunningAppProcesses()     // Catch: java.lang.Throwable -> L3e
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Throwable -> L3e
        L29:
            boolean r1 = r0.hasNext()     // Catch: java.lang.Throwable -> L3e
            if (r1 == 0) goto L56
            java.lang.Object r1 = r0.next()     // Catch: java.lang.Throwable -> L3e
            android.app.ActivityManager$RunningAppProcessInfo r1 = (android.app.ActivityManager.RunningAppProcessInfo) r1     // Catch: java.lang.Throwable -> L3e
            int r2 = r1.pid     // Catch: java.lang.Throwable -> L3e
            if (r2 != r3) goto L29
            java.lang.String r3 = r1.processName     // Catch: java.lang.Throwable -> L3e
            p031c.p032a.p096v.C0845a.f3592a = r3     // Catch: java.lang.Throwable -> L3e
            goto L56
        L3e:
            r3 = move-exception
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "#unexcepted - getCurProcessName failed:"
            r0.<init>(r1)
            java.lang.String r3 = r3.getMessage()
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            java.lang.String r0 = "AndroidUtil"
            p031c.p032a.p060d.C0601d.m3078g(r0, r3)
        L56:
            java.lang.String r3 = p031c.p032a.p096v.C0845a.f3592a
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: p031c.p032a.p096v.C0845a.m4118a(android.content.Context):java.lang.String");
    }

    /* renamed from: a */
    public static String m4119a(Context context, String str) {
        try {
            return context.getPackageManager().getServiceInfo(new ComponentName(context.getPackageName(), str), 128).processName;
        } catch (Throwable unused) {
            return "";
        }
    }

    /* renamed from: a */
    public static List<String> m4120a(Context context, Intent intent, String str) {
        ArrayList arrayList = new ArrayList();
        try {
            List<ResolveInfo> queryIntentServices = context.getPackageManager().queryIntentServices(intent, 0);
            PackageManager packageManager = context.getPackageManager();
            for (ResolveInfo resolveInfo : queryIntentServices) {
                if (resolveInfo.serviceInfo != null) {
                    String str2 = resolveInfo.serviceInfo.name;
                    if (!TextUtils.isEmpty(str2)) {
                        boolean z = true;
                        if (!TextUtils.isEmpty(str) && packageManager.checkPermission(str, resolveInfo.activityInfo.packageName) != 0) {
                            z = false;
                        }
                        if (z) {
                            arrayList.add(str2);
                        }
                    }
                }
            }
        } catch (Throwable unused) {
        }
        return arrayList;
    }

    /* renamed from: a */
    public static List<String> m4121a(Context context, List<String> list) {
        if (list.size() == 0) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (String str : list) {
            if (!C0812a.m3939a(context, str)) {
                arrayList.add(str);
            }
        }
        return arrayList;
    }

    /* renamed from: b */
    public static String m4122b(Context context, String str) {
        try {
            return context.getPackageManager().getReceiverInfo(new ComponentName(context.getPackageName(), str), 128).processName;
        } catch (Throwable unused) {
            return "";
        }
    }
}
