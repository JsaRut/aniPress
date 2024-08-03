package p031c.p101b.p102a.p115m;

import android.app.Activity;
import android.app.ActivityManager;
import android.app.AppOpsManager;
import android.app.Service;
import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.ContentProvider;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ComponentInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.os.Environment;
import android.text.TextUtils;
import android.webkit.WebSettings;
import android.webkit.WebView;
import cn.jpush.android.p121ui.PopWinActivity;
import cn.jpush.android.p121ui.PushActivity;
import cn.jpush.android.service.JNotifyActivity;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.List;
import p031c.p101b.p102a.C0869a;
import p031c.p101b.p102a.p114l.C0923b;

/* renamed from: c.b.a.m.a */
/* loaded from: classes.dex */
public class C0938a {

    /* renamed from: a */
    private static String f3970a = "";

    /* renamed from: b */
    private static String f3971b;

    /* renamed from: a */
    public static ComponentInfo m4708a(Context context, String str, Class<?> cls) {
        int i;
        ComponentInfo[] componentInfoArr;
        if (context == null || TextUtils.isEmpty(str) || cls == null) {
            C0923b.m4653i("AndroidUtil", "Action - hasComponent, invalide param, context:" + context + ",packageName:" + str + ",cls:" + cls);
            return null;
        }
        try {
            int i2 = Service.class.isAssignableFrom(cls) ? 4 : BroadcastReceiver.class.isAssignableFrom(cls) ? 2 : Activity.class.isAssignableFrom(cls) ? 1 : ContentProvider.class.isAssignableFrom(cls) ? 8 : 0;
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo(str, i2);
            componentInfoArr = i2 != 1 ? i2 != 2 ? i2 != 4 ? i2 != 8 ? null : packageInfo.providers : packageInfo.services : packageInfo.receivers : packageInfo.activities;
        } catch (Throwable th) {
            C0923b.m4654j("AndroidUtil", "hasComponent error:" + th.getMessage());
        }
        if (componentInfoArr == null) {
            return null;
        }
        for (ComponentInfo componentInfo : componentInfoArr) {
            if (cls.isAssignableFrom(Class.forName(componentInfo.name))) {
                return componentInfo;
            }
        }
        return null;
    }

    /* renamed from: a */
    public static String m4709a(byte[] bArr) {
        if (bArr == null) {
            return "";
        }
        StringBuffer stringBuffer = new StringBuffer(bArr.length * 2);
        for (byte b2 : bArr) {
            m4713a(stringBuffer, b2);
        }
        return stringBuffer.toString();
    }

    /* renamed from: a */
    public static void m4710a(Context context, Intent intent, String str) {
        if (intent == null) {
            return;
        }
        String action = intent.getAction();
        if ("cn.jpush.android.intent.NOTIFICATION_RECEIVED".equals(action) || "cn.jpush.android.intent.NOTIFICATION_OPENED".equals(action)) {
            List<String> m4721b = m4721b(context, intent, str);
            if (m4721b == null || m4721b.isEmpty()) {
                C0923b.m4654j("AndroidUtil", "sendBroadcast failed again: receiver not found, action:" + intent.getAction());
                return;
            }
            for (String str2 : m4721b) {
                try {
                    Intent intent2 = (Intent) intent.clone();
                    intent2.setComponent(new ComponentName(context.getPackageName(), str2));
                    if (TextUtils.isEmpty(str)) {
                        context.sendBroadcast(intent2);
                    } else {
                        context.sendBroadcast(intent2, str);
                    }
                } catch (Exception e2) {
                    C0923b.m4654j("AndroidUtil", "sendBroadcast failed again:" + e2.getMessage() + ", action:" + intent.getAction());
                }
            }
        }
    }

    /* renamed from: a */
    public static void m4711a(WebSettings webSettings) {
        webSettings.setUseWideViewPort(true);
        webSettings.setLoadWithOverviewMode(true);
        webSettings.setDomStorageEnabled(true);
        webSettings.setJavaScriptEnabled(true);
        webSettings.setDefaultTextEncodingName("UTF-8");
        webSettings.setSupportZoom(true);
        webSettings.setBuiltInZoomControls(true);
        if (Build.VERSION.SDK_INT >= 11) {
            webSettings.setDisplayZoomControls(false);
        }
        webSettings.setCacheMode(2);
        webSettings.setSaveFormData(false);
        webSettings.setSavePassword(false);
    }

    /* renamed from: a */
    public static void m4712a(WebView webView) {
        try {
            if (Build.VERSION.SDK_INT >= 11) {
                webView.removeJavascriptInterface("searchBoxJavaBridge_");
                webView.removeJavascriptInterface("accessibility");
                webView.removeJavascriptInterface("accessibilityTraversal");
            }
            if (Build.VERSION.SDK_INT >= 21) {
                webView.getSettings().setMixedContentMode(0);
            }
        } catch (Throwable th) {
            C0923b.m4646c("AndroidUtil", "fixSecure failed, error:" + th);
        }
    }

    /* renamed from: a */
    private static void m4713a(StringBuffer stringBuffer, byte b2) {
        stringBuffer.append("0123456789ABCDEF".charAt((b2 >> 4) & 15));
        stringBuffer.append("0123456789ABCDEF".charAt(b2 & 15));
    }

    /* renamed from: a */
    public static boolean m4714a() {
        boolean z;
        try {
            z = Environment.getExternalStorageState().equals("mounted");
        } catch (Throwable th) {
            C0923b.m4653i("AndroidUtil", "isSdcardExist exception: " + th);
            z = false;
        }
        if (!z) {
            C0923b.m4642a("AndroidUtil", "SDCard is not mounted");
        }
        return z;
    }

    /* renamed from: a */
    public static boolean m4715a(Context context) {
        try {
            NetworkInfo activeNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
            if (activeNetworkInfo != null) {
                return activeNetworkInfo.isConnected();
            }
            return false;
        } catch (Exception e2) {
            e2.printStackTrace();
            return false;
        }
    }

    /* renamed from: a */
    public static boolean m4716a(Context context, Class<?> cls) {
        try {
            return !context.getPackageManager().queryIntentActivities(new Intent(context, cls), 0).isEmpty();
        } catch (Throwable th) {
            C0923b.m4644b("AndroidUtil", "hasActivityResolves error:" + th.getMessage());
            return false;
        }
    }

    /* renamed from: a */
    public static boolean m4717a(Context context, String str) {
        try {
            boolean z = true;
            if (Build.VERSION.SDK_INT >= 23) {
                if (context.getApplicationInfo().targetSdkVersion < 23) {
                    String permissionToOp = AppOpsManager.permissionToOp(str);
                    if (permissionToOp != null && ((AppOpsManager) context.getSystemService("appops")).noteProxyOpNoThrow(permissionToOp, context.getPackageName()) != 0) {
                        z = false;
                    }
                    return z;
                }
                if (context.checkSelfPermission(str) != 0) {
                    return false;
                }
            }
            return true;
        } catch (Throwable th) {
            C0923b.m4653i("AndroidUtil", "checkPermission error:" + th.getMessage());
            return false;
        }
    }

    /* renamed from: a */
    public static boolean m4718a(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        String trim = str.trim();
        boolean matches = trim.matches("^[http|https]+://.*");
        if (!matches) {
            C0923b.m4653i("AndroidUtil", "Invalid url - " + trim);
        }
        return matches;
    }

    /* renamed from: b */
    public static String m4719b(Context context) {
        if (!TextUtils.isEmpty(f3970a)) {
            return f3970a;
        }
        try {
            f3970a = context.getPackageManager().getApplicationLabel(context.getPackageManager().getApplicationInfo(context.getPackageName(), 0)).toString();
        } catch (Throwable th) {
            th.printStackTrace();
        }
        return f3970a;
    }

    /* renamed from: b */
    public static String m4720b(String str) {
        if (str != null && !"".equals(str)) {
            try {
                MessageDigest messageDigest = MessageDigest.getInstance("MD5");
                messageDigest.update(str.getBytes());
                return m4709a(messageDigest.digest());
            } catch (NoSuchAlgorithmException unused) {
            }
        }
        return null;
    }

    /* renamed from: b */
    public static List<String> m4721b(Context context, Intent intent, String str) {
        ArrayList arrayList = new ArrayList();
        try {
            List<ResolveInfo> queryBroadcastReceivers = context.getPackageManager().queryBroadcastReceivers(intent, 0);
            PackageManager packageManager = context.getPackageManager();
            for (ResolveInfo resolveInfo : queryBroadcastReceivers) {
                if (resolveInfo.activityInfo != null) {
                    String str2 = resolveInfo.activityInfo.name;
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

    /* renamed from: b */
    public static void m4722b(Context context, String str) {
        try {
            Intent m4728f = m4728f(context);
            if (m4728f != null) {
                if (!TextUtils.isEmpty(str)) {
                    m4728f.putExtra("extra", str);
                }
                context.startActivity(m4728f);
            }
        } catch (Throwable th) {
            C0923b.m4644b("AndroidUtil", "startMainActivity error:" + th.getMessage());
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0039, code lost:            p031c.p101b.p102a.p115m.C0938a.f3971b = r1.processName;     */
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.String m4723c(android.content.Context r3) {
        /*
            java.lang.String r0 = p031c.p101b.p102a.p115m.C0938a.f3971b
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto Lb
            java.lang.String r3 = p031c.p101b.p102a.p115m.C0938a.f3971b
            return r3
        Lb:
            android.content.Context r3 = p031c.p101b.p102a.C0869a.m4245c(r3)     // Catch: java.lang.Throwable -> L3e
            r0 = 0
            if (r3 == 0) goto L1b
            java.lang.String r0 = "activity"
            java.lang.Object r3 = r3.getSystemService(r0)     // Catch: java.lang.Throwable -> L3e
            r0 = r3
            android.app.ActivityManager r0 = (android.app.ActivityManager) r0     // Catch: java.lang.Throwable -> L3e
        L1b:
            if (r0 == 0) goto L59
            int r3 = android.os.Process.myPid()     // Catch: java.lang.Throwable -> L3e
            java.util.List r0 = r0.getRunningAppProcesses()     // Catch: java.lang.Throwable -> L3e
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Throwable -> L3e
        L29:
            boolean r1 = r0.hasNext()     // Catch: java.lang.Throwable -> L3e
            if (r1 == 0) goto L59
            java.lang.Object r1 = r0.next()     // Catch: java.lang.Throwable -> L3e
            android.app.ActivityManager$RunningAppProcessInfo r1 = (android.app.ActivityManager.RunningAppProcessInfo) r1     // Catch: java.lang.Throwable -> L3e
            int r2 = r1.pid     // Catch: java.lang.Throwable -> L3e
            if (r2 != r3) goto L29
            java.lang.String r3 = r1.processName     // Catch: java.lang.Throwable -> L3e
            p031c.p101b.p102a.p115m.C0938a.f3971b = r3     // Catch: java.lang.Throwable -> L3e
            goto L59
        L3e:
            r3 = move-exception
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "#unexcepted - getCurProcessName failed:"
            r0.append(r1)
            java.lang.String r3 = r3.getMessage()
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            java.lang.String r0 = "AndroidUtil"
            p031c.p101b.p102a.p114l.C0923b.m4654j(r0, r3)
        L59:
            java.lang.String r3 = p031c.p101b.p102a.p115m.C0938a.f3971b
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: p031c.p101b.p102a.p115m.C0938a.m4723c(android.content.Context):java.lang.String");
    }

    /* renamed from: c */
    public static boolean m4724c(Context context, String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return context.getPackageManager().getPackageInfo(str, 0) != null;
    }

    /* renamed from: d */
    public static void m4725d(Context context) {
        try {
            if (Build.VERSION.SDK_INT >= 28) {
                String m4723c = m4723c(context);
                String packageName = context.getPackageName();
                if (m4723c == null || packageName == null || packageName.equals(m4723c)) {
                    return;
                }
                WebView.setDataDirectorySuffix(m4723c);
                C0923b.m4642a("AndroidUtil", "setDataDirectorySuffix =" + m4723c);
            }
        } catch (Throwable th) {
            C0923b.m4646c("AndroidUtil", "fixWebViewProcess e:" + th);
        }
    }

    /* renamed from: d */
    public static boolean m4726d(Context context, String str) {
        try {
            PackageManager packageManager = context.getPackageManager();
            Intent intent = new Intent(str);
            intent.addCategory(context.getPackageName());
            return !packageManager.queryIntentActivities(intent, 0).isEmpty();
        } catch (Throwable th) {
            C0923b.m4644b("AndroidUtil", "hasActivityIntentFilter error:" + th.getMessage());
            return true;
        }
    }

    /* renamed from: e */
    public static void m4727e(Context context) {
        m4722b(context, null);
    }

    /* renamed from: f */
    public static Intent m4728f(Context context) {
        Intent intent = null;
        try {
            PackageManager packageManager = context.getPackageManager();
            String packageName = context.getApplicationContext().getPackageName();
            if (TextUtils.isEmpty(packageName)) {
                C0923b.m4654j("AndroidUtil", "The package with the given name cannot be found!");
                return null;
            }
            Intent launchIntentForPackage = packageManager.getLaunchIntentForPackage(packageName);
            try {
                if (launchIntentForPackage == null) {
                    C0923b.m4654j("AndroidUtil", "Can't get launch intent for this package!");
                    return null;
                }
                launchIntentForPackage.addFlags(Build.VERSION.SDK_INT >= 11 ? 268468224 : 268435456);
                return launchIntentForPackage;
            } catch (Throwable th) {
                intent = launchIntentForPackage;
                th = th;
                C0923b.m4653i("AndroidUtil", "getLaunchIntent error:" + th.getMessage());
                return intent;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    /* renamed from: g */
    public static boolean m4729g(Context context) {
        String str;
        StringBuilder sb;
        Class cls;
        C0923b.m4644b("AndroidUtil", "action:checkValidManifest");
        if (m4716a(context, (Class<?>) PushActivity.class)) {
            if (!m4716a(context, (Class<?>) PopWinActivity.class)) {
                C0923b.m4654j("AndroidUtil", "AndroidManifest.xml missing activity: " + PopWinActivity.class.getCanonicalName());
                C0923b.m4654j("AndroidUtil", "You will unable to use pop-window rich push type.");
            }
            if (!m4726d(context, "cn.jpush.android.ui.PushActivity")) {
                str = "AndroidManifest.xml missing required intent filter for PushActivity: cn.jpush.android.ui.PushActivity";
            } else if (!m4716a(context, (Class<?>) JNotifyActivity.class)) {
                sb = new StringBuilder();
                sb.append("AndroidManifest.xml missing required activity: ");
                cls = JNotifyActivity.class;
            } else {
                if (!TextUtils.isEmpty(C0869a.m4243b(context))) {
                    return true;
                }
                str = "AndroidManifest.xml missing required receiver: please custom receiver extends JPushMessageReceiver";
            }
            C0923b.m4648d("AndroidUtil", str);
            return false;
        }
        sb = new StringBuilder();
        sb.append("AndroidManifest.xml missing required activity: ");
        cls = PushActivity.class;
        sb.append(cls.getCanonicalName());
        str = sb.toString();
        C0923b.m4648d("AndroidUtil", str);
        return false;
    }

    /* renamed from: h */
    public static boolean m4730h(Context context) {
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = ((ActivityManager) context.getSystemService("activity")).getRunningAppProcesses();
        if (runningAppProcesses == null) {
            return false;
        }
        for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : runningAppProcesses) {
            if (runningAppProcessInfo.processName.equals(context.getPackageName()) && runningAppProcessInfo.importance == 100) {
                return true;
            }
        }
        return false;
    }
}
