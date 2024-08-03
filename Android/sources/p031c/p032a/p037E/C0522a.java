package p031c.p032a.p037E;

import android.annotation.SuppressLint;
import android.app.ActivityManager;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.text.TextUtils;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONObject;
import p031c.p032a.p036D.C0520a;
import p031c.p032a.p036D.C0521b;
import p031c.p032a.p047O.C0554d;
import p031c.p032a.p066j.C0675a;

@SuppressLint({"PackageManagerGetSignatures"})
/* renamed from: c.a.E.a */
/* loaded from: classes.dex */
public final class C0522a {

    /* renamed from: a */
    private static String f2614a = "JAppHelper";

    /* renamed from: a */
    public static int m2736a(ApplicationInfo applicationInfo) {
        if (applicationInfo == null) {
            return -1;
        }
        try {
            if ((applicationInfo.flags & 1) != 0) {
                return (applicationInfo.flags & 128) != 0 ? 2 : 1;
            }
            String str = applicationInfo.sourceDir;
            if (TextUtils.isEmpty(str)) {
                return -1;
            }
            return (str.startsWith("/system/") || !str.contains(applicationInfo.packageName)) ? 3 : 0;
        } catch (Throwable th) {
            C0675a.m3475g(f2614a, "getAppInstalledType throwable:" + th.getMessage());
            return -1;
        }
    }

    /* renamed from: a */
    public static ApplicationInfo m2737a(Context context, String str) {
        try {
            return context.getPackageManager().getApplicationInfo(str, 0);
        } catch (Throwable th) {
            C0675a.m3475g(f2614a, "getApplicationInfo throwable:" + th.getMessage());
            return null;
        }
    }

    /* renamed from: a */
    public static String m2738a(List<C0520a> list) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < list.size(); i++) {
            sb.append(list.get(i).f2606b);
            if (i != list.size() - 1) {
                sb.append("&&");
            }
        }
        return sb.toString();
    }

    /* renamed from: a */
    public static String m2739a(Set<String> set) {
        StringBuilder sb = new StringBuilder();
        Iterator<String> it = set.iterator();
        while (it.hasNext()) {
            sb.append(it.next());
            sb.append("&&");
        }
        return sb.toString();
    }

    /* renamed from: a */
    public static ArrayList<JSONArray> m2740a(JSONArray jSONArray) {
        String str;
        StringBuilder sb;
        String message;
        if (jSONArray != null && jSONArray.length() != 0) {
            try {
                JSONArray jSONArray2 = new JSONArray();
                ArrayList<JSONArray> arrayList = new ArrayList<>();
                int i = 0;
                for (int i2 = 0; i2 < jSONArray.length(); i2++) {
                    JSONObject optJSONObject = jSONArray.optJSONObject(i2);
                    if (optJSONObject != null && optJSONObject.length() != 0) {
                        int length = optJSONObject.toString().getBytes("UTF-8").length;
                        i += length;
                        if (i > 102400) {
                            if (jSONArray2.length() > 0) {
                                arrayList.add(jSONArray2);
                            }
                            jSONArray2 = new JSONArray();
                            jSONArray2.put(optJSONObject);
                            i = length;
                        } else {
                            jSONArray2.put(optJSONObject);
                        }
                    }
                }
                if (jSONArray2.length() > 0) {
                    arrayList.add(jSONArray2);
                }
                return arrayList;
            } catch (UnsupportedEncodingException e2) {
                str = f2614a;
                sb = new StringBuilder("partition exception:");
                message = e2.getMessage();
                sb.append(message);
                C0675a.m3475g(str, sb.toString());
                return null;
            } catch (Throwable th) {
                str = f2614a;
                sb = new StringBuilder("partition throwable:");
                message = th.getMessage();
                sb.append(message);
                C0675a.m3475g(str, sb.toString());
                return null;
            }
        }
        return null;
    }

    /* renamed from: a */
    public static List<C0520a> m2741a(Context context) {
        if (Build.VERSION.SDK_INT < 21) {
            return m2748b(context);
        }
        HashMap hashMap = new HashMap();
        Iterator<C0521b> it = C0523b.m2752a(1).iterator();
        while (it.hasNext()) {
            C0520a m2746b = m2746b(context, it.next().f2613d);
            if (m2746b != null) {
                hashMap.put(m2746b.f2606b, m2746b);
            }
        }
        return new ArrayList(hashMap.values());
    }

    /* renamed from: a */
    public static List<C0520a> m2742a(Context context, boolean z) {
        List<PackageInfo> m2743a;
        PackageManager packageManager = context.getPackageManager();
        try {
            C0675a.m3469c(f2614a, "getInstalledApps by api");
            m2743a = packageManager.getInstalledPackages(0);
        } catch (Throwable unused) {
            C0675a.m3469c(f2614a, "getInstalledApps by shell");
            m2743a = m2743a(packageManager);
        }
        if (m2743a == null || m2743a.isEmpty()) {
            return null;
        }
        return m2744a(packageManager, m2743a, true);
    }

    /* renamed from: a */
    private static List<PackageInfo> m2743a(PackageManager packageManager) {
        try {
            List<String> m2883a = C0554d.m2883a(new String[]{"pm list package"}, 1);
            if (m2883a != null && !m2883a.isEmpty()) {
                ArrayList arrayList = new ArrayList();
                for (int i = 0; i < m2883a.size(); i++) {
                    String str = m2883a.get(i);
                    if (!TextUtils.isEmpty(str) && str.startsWith("package:")) {
                        String substring = str.substring(8);
                        C0675a.m3469c(f2614a, "execute command packageName:" + substring);
                        if (!TextUtils.isEmpty(substring)) {
                            PackageInfo packageInfo = new PackageInfo();
                            try {
                                packageInfo = packageManager.getPackageInfo(substring, 64);
                            } catch (PackageManager.NameNotFoundException unused) {
                                packageInfo.packageName = substring;
                            }
                            arrayList.add(packageInfo);
                        }
                    }
                }
                return arrayList;
            }
            C0675a.m3475g(f2614a, "execute command pm list package failed");
            return null;
        } catch (Throwable th) {
            C0675a.m3475g(f2614a, "getInstalledPackagesByShell throwable:" + th.getMessage());
            return null;
        }
    }

    /* renamed from: a */
    private static List<C0520a> m2744a(PackageManager packageManager, List<PackageInfo> list, boolean z) {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < list.size(); i++) {
            try {
                PackageInfo packageInfo = list.get(i);
                if (z || packageInfo.versionName != null) {
                    C0520a c0520a = new C0520a();
                    c0520a.f2605a = packageInfo.applicationInfo.loadLabel(packageManager).toString();
                    c0520a.f2606b = packageInfo.packageName;
                    c0520a.f2607c = packageInfo.versionName;
                    c0520a.f2608d = packageInfo.versionCode;
                    c0520a.f2609e = m2736a(packageInfo.applicationInfo);
                    arrayList.add(c0520a);
                }
            } catch (Throwable unused) {
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    public static Set<String> m2745a(String str) {
        String[] split = str.split("&&");
        HashSet hashSet = new HashSet();
        Collections.addAll(hashSet, split);
        return hashSet;
    }

    /* renamed from: b */
    private static C0520a m2746b(Context context, String str) {
        try {
            PackageInfo m2749c = m2749c(context, str);
            if (m2749c == null) {
                C0675a.m3475g(f2614a, "getAppInfoFromPackage failed because packageInfo is null");
                return null;
            }
            String charSequence = m2749c.applicationInfo.loadLabel(context.getPackageManager()).toString();
            C0520a c0520a = new C0520a();
            c0520a.f2605a = m2747b(charSequence);
            c0520a.f2606b = m2749c.packageName;
            c0520a.f2608d = m2749c.versionCode;
            c0520a.f2607c = m2749c.versionName;
            c0520a.f2609e = m2736a(m2749c.applicationInfo);
            return c0520a;
        } catch (Throwable th) {
            C0675a.m3475g(f2614a, "getAppInfoFromPackage throwable:" + th.getMessage());
            return null;
        }
    }

    /* renamed from: b */
    private static String m2747b(String str) {
        String str2;
        StringBuilder sb;
        String message;
        if (!TextUtils.isEmpty(str)) {
            String replaceAll = Pattern.compile("\n|\r|\r\n|\n\r|\t").matcher(str).replaceAll("");
            try {
                byte[] bytes = str.getBytes();
                if (bytes.length > 30) {
                    return replaceAll.substring(0, new String(bytes, 0, 30, "UTF-8").length());
                }
            } catch (UnsupportedEncodingException e2) {
                str2 = f2614a;
                sb = new StringBuilder("getAppName exception:");
                message = e2.getMessage();
                sb.append(message);
                C0675a.m3475g(str2, sb.toString());
                return str;
            } catch (Throwable th) {
                str2 = f2614a;
                sb = new StringBuilder("getAppName throwable:");
                message = th.getMessage();
                sb.append(message);
                C0675a.m3475g(str2, sb.toString());
                return str;
            }
        }
        return str;
    }

    /* renamed from: b */
    private static List<C0520a> m2748b(Context context) {
        try {
            List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = ((ActivityManager) context.getSystemService("activity")).getRunningAppProcesses();
            HashSet hashSet = new HashSet();
            Iterator<ActivityManager.RunningAppProcessInfo> it = runningAppProcesses.iterator();
            while (it.hasNext()) {
                String[] strArr = it.next().pkgList;
                if (strArr != null && strArr.length > 0) {
                    Collections.addAll(hashSet, strArr);
                }
            }
            ArrayList arrayList = new ArrayList();
            Iterator it2 = hashSet.iterator();
            while (it2.hasNext()) {
                C0520a m2746b = m2746b(context, (String) it2.next());
                if (m2746b != null) {
                    arrayList.add(m2746b);
                }
            }
            return arrayList;
        } catch (Throwable th) {
            C0675a.m3475g(f2614a, "getRunningAppInfoBelowL throwable:" + th.getMessage());
            return null;
        }
    }

    /* renamed from: c */
    private static PackageInfo m2749c(Context context, String str) {
        try {
            return context.getPackageManager().getPackageInfo(str, 0);
        } catch (Throwable unused) {
            try {
                int indexOf = str.indexOf(":");
                if (indexOf <= 0) {
                    return null;
                }
                return context.getPackageManager().getPackageInfo(str.substring(0, indexOf), 0);
            } catch (Throwable th) {
                C0675a.m3475g(f2614a, "getPackageInfo throwable:" + th.getMessage());
                return null;
            }
        }
    }
}
