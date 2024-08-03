package p031c.p032a.p058b;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import p031c.p032a.p056W.C0580a;
import p031c.p032a.p056W.C0582c;
import p031c.p032a.p066j.C0675a;

/* renamed from: c.a.b.c */
/* loaded from: classes.dex */
public final class C0588c {

    /* renamed from: a */
    private static Boolean f2814a;

    /* renamed from: a */
    public static Bundle m3000a(HashMap<String, String> hashMap) {
        if (hashMap.isEmpty()) {
            return null;
        }
        Bundle bundle = new Bundle();
        for (String str : hashMap.keySet()) {
            bundle.putString(str, hashMap.get(str));
        }
        return bundle;
    }

    /* renamed from: a */
    public static String m3001a(List<C0582c> list) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < list.size(); i++) {
            String str = list.get(i).f2789a;
            String str2 = list.get(i).f2790b;
            int i2 = list.get(i).f2791c;
            sb.append(str);
            sb.append("|");
            sb.append(str2);
            sb.append("|");
            sb.append(i2);
            sb.append("$");
        }
        return sb.toString();
    }

    /* renamed from: a */
    public static List<C0582c> m3002a(Context context) {
        C0582c m2989a;
        try {
            ArrayList arrayList = new ArrayList();
            PackageManager packageManager = context.getPackageManager();
            Intent intent = new Intent();
            intent.setAction("cn.jpush.android.intent.DaemonService");
            List<ResolveInfo> queryIntentServices = packageManager.queryIntentServices(intent, 0);
            if (queryIntentServices != null && queryIntentServices.size() != 0) {
                for (int i = 0; i < queryIntentServices.size(); i++) {
                    ServiceInfo serviceInfo = queryIntentServices.get(i).serviceInfo;
                    String str = serviceInfo.name;
                    String str2 = serviceInfo.packageName;
                    if (str != null && str2 != null && !TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2) && serviceInfo.exported && serviceInfo.enabled && !context.getPackageName().equals(str2) && (m2989a = C0586a.m2989a(context, packageManager, str2, str)) != null) {
                        C0675a.m3469c("JWakeHelper", "wakeTarget:" + m2989a.toString());
                        arrayList.add(m2989a);
                    }
                }
                return arrayList;
            }
            return null;
        } catch (Throwable th) {
            C0675a.m3475g("JWakeHelper", "getWakeTargetList throwable:" + th.getMessage());
            return null;
        }
    }

    /* renamed from: a */
    public static List<String> m3003a(C0580a c0580a, List<String> list) {
        if (c0580a == null) {
            return list;
        }
        if (!TextUtils.isEmpty(c0580a.f2784h) && !c0580a.f2784h.equals("disable")) {
            List<String> list2 = c0580a.f2785i;
            String str = c0580a.f2784h;
            char c2 = 65535;
            int hashCode = str.hashCode();
            if (hashCode != -1321148966) {
                if (hashCode == 1942574248 && str.equals("include")) {
                    c2 = 1;
                }
            } else if (str.equals("exclude")) {
                c2 = 0;
            }
            if (c2 == 0) {
                list = m3005a(list2, list, false);
            } else if (c2 == 1) {
                list = m3005a(list2, list, true);
            }
        }
        return m3005a(c0580a.f2786j, list, false);
    }

    /* renamed from: a */
    public static List<C0582c> m3004a(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        String[] split = str.split("\\$");
        ArrayList arrayList = new ArrayList();
        for (String str2 : split) {
            String[] split2 = str2.split("\\|");
            String str3 = split2[0];
            String str4 = split2[1];
            int intValue = Integer.valueOf(split2[2]).intValue();
            C0582c c0582c = new C0582c();
            c0582c.f2789a = str3;
            c0582c.f2790b = str4;
            c0582c.f2791c = intValue;
            arrayList.add(c0582c);
        }
        return arrayList;
    }

    /* renamed from: a */
    private static List<String> m3005a(List<String> list, List<String> list2, boolean z) {
        if (list == null || list.size() == 0) {
            return list2;
        }
        ArrayList arrayList = new ArrayList();
        for (String str : list2) {
            if (list.contains(str)) {
                if (z) {
                    C0675a.m3469c("JWakeHelper", str + " in the white list");
                    arrayList.add(str);
                } else {
                    C0675a.m3469c("JWakeHelper", str + " in the black list");
                }
            }
            if (!z) {
                C0675a.m3469c("JWakeHelper", str + " not in the global black list");
                arrayList.add(str);
            }
        }
        return arrayList;
    }

    /* renamed from: b */
    public static String m3006b(HashMap<String, String> hashMap) {
        if (hashMap.isEmpty()) {
            return null;
        }
        Uri.Builder builder = new Uri.Builder();
        for (String str : hashMap.keySet()) {
            builder.appendQueryParameter(str, hashMap.get(str));
        }
        return builder.toString();
    }

    /* renamed from: b */
    public static boolean m3007b(Context context) {
        try {
        } catch (Throwable th) {
            C0675a.m3475g("JWakeHelper", "isUserReportEnable throwable:" + th.getMessage());
        }
        if (f2814a != null) {
            return f2814a.booleanValue();
        }
        if (context == null) {
            return true;
        }
        Intent intent = new Intent();
        intent.setPackage(context.getPackageName());
        intent.setAction("cn.jpush.android.WAKED_NOT_REPORT");
        List<ResolveInfo> queryIntentServices = context.getPackageManager().queryIntentServices(intent, 0);
        f2814a = queryIntentServices == null || queryIntentServices.isEmpty();
        return f2814a.booleanValue();
    }
}
