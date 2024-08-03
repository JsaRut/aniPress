package p031c.p032a.p091r;

import android.R;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.app.Service;
import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.ContentProvider;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ComponentInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.content.pm.ResolveInfo;
import android.content.pm.Signature;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.wifi.WifiManager;
import android.os.Build;
import android.os.Environment;
import android.os.Handler;
import android.os.Looper;
import android.provider.Settings;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import cn.jpush.android.service.PushReceiver;
import java.io.ByteArrayInputStream;
import java.lang.reflect.Method;
import java.net.Inet4Address;
import java.net.InetAddress;
import java.net.NetworkInterface;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.List;
import javax.security.auth.x500.X500Principal;
import p031c.p032a.p048P.p049a.C0557c;
import p031c.p032a.p066j.C0675a;

/* renamed from: c.a.r.a */
/* loaded from: classes.dex */
public final class C0812a {

    /* renamed from: a */
    private static String f3527a = "";

    /* renamed from: a */
    public static int m3930a(String str) {
        if (TextUtils.isEmpty(str)) {
            return 0;
        }
        String[] split = str.split("\\.");
        return (Integer.parseInt(split[0]) << 16) + (Integer.parseInt(split[1]) << 8) + Integer.parseInt(split[2]);
    }

    /* renamed from: a */
    public static ComponentInfo m3931a(Context context, String str, Class<?> cls) {
        int i;
        ComponentInfo[] componentInfoArr;
        if (context == null || TextUtils.isEmpty(str) || cls == null) {
            C0675a.m3475g("AndroidUtil", "Action - hasComponent, invalide param, context:" + context + ",packageName:" + str + ",cls:" + cls);
            return null;
        }
        try {
            int i2 = Service.class.isAssignableFrom(cls) ? 4 : BroadcastReceiver.class.isAssignableFrom(cls) ? 2 : Activity.class.isAssignableFrom(cls) ? 1 : ContentProvider.class.isAssignableFrom(cls) ? 8 : 0;
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo(str, i2);
            componentInfoArr = i2 != 1 ? i2 != 2 ? i2 != 4 ? i2 != 8 ? null : packageInfo.providers : packageInfo.services : packageInfo.receivers : packageInfo.activities;
        } catch (Throwable th) {
            C0675a.m3476h("AndroidUtil", "hasComponent error:" + th);
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
    public static String m3932a(Context context) {
        if (!TextUtils.isEmpty(f3527a)) {
            return f3527a;
        }
        String packageName = context.getPackageName();
        f3527a = packageName;
        return packageName;
    }

    /* renamed from: a */
    public static String m3933a(Context context, String str, String str2) {
        try {
            return (String) C0817f.m3983a(context.getClassLoader().loadClass("android.os.SystemProperties"), "get", new Object[]{str, str2}, new Class[]{String.class, String.class});
        } catch (IllegalArgumentException e2) {
            throw e2;
        } catch (Exception unused) {
            return "";
        }
    }

    /* renamed from: a */
    private static List<String> m3934a(Context context, Intent intent, String str) {
        ArrayList arrayList = new ArrayList();
        try {
            List<ResolveInfo> queryBroadcastReceivers = context.getPackageManager().queryBroadcastReceivers(intent, 0);
            PackageManager packageManager = context.getPackageManager();
            for (ResolveInfo resolveInfo : queryBroadcastReceivers) {
                if (resolveInfo.activityInfo != null) {
                    String str2 = resolveInfo.activityInfo.name;
                    if (!TextUtils.isEmpty(str2)) {
                        boolean z = true;
                        if (!TextUtils.isEmpty(null) && packageManager.checkPermission(null, resolveInfo.activityInfo.packageName) != 0) {
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
    public static void m3935a(Context context, Intent intent) {
        try {
            context.sendBroadcast(intent);
        } catch (Throwable unused) {
            try {
                List<String> m3934a = m3934a(context, intent, (String) null);
                if (m3934a.isEmpty()) {
                    C0675a.m3476h("AndroidUtil", "sendBroadcast failed again: receiver not found, action:" + intent.getAction());
                    return;
                }
                for (String str : m3934a) {
                    try {
                        Intent intent2 = (Intent) intent.clone();
                        intent2.setComponent(new ComponentName(context.getPackageName(), str));
                        context.sendBroadcast(intent2);
                    } catch (Exception e2) {
                        C0675a.m3476h("AndroidUtil", "sendBroadcast failed again:" + e2.getMessage() + ", action:" + intent.getAction());
                    }
                }
            } catch (Throwable th) {
                C0675a.m3476h("AndroidUtil", "tryAgainSendBrocast failed:" + th.getMessage());
            }
        }
    }

    /* renamed from: a */
    public static void m3936a(Context context, String str, int i) {
        int i2;
        Notification notification;
        if (!m3959l(context)) {
            C0675a.m3469c("AndroidUtil", "not debuggable");
            return;
        }
        if (!m3938a(context, (Class<?>) PushReceiver.class)) {
            new Handler(Looper.getMainLooper()).post(new RunnableC0813b(context, str));
            return;
        }
        C0675a.m3469c("AndroidUtil", "action:showPermanentNotification");
        Intent intent = new Intent(context, (Class<?>) PushReceiver.class);
        intent.setAction("noti_open_proxy");
        intent.addCategory(context.getPackageName());
        intent.putExtra("debug_notification", true);
        intent.putExtra("toastText", str);
        intent.putExtra("type", -1);
        PendingIntent broadcast = PendingIntent.getBroadcast(context, 0, intent, 134217728);
        NotificationManager notificationManager = (NotificationManager) context.getSystemService("notification");
        try {
            i2 = context.getPackageManager().getApplicationInfo(context.getApplicationContext().getPackageName(), 0).icon;
        } catch (Throwable th) {
            C0675a.m3470c("AndroidUtil", "failed to get application info and icon.", th);
            i2 = R.drawable.ic_menu_share;
        }
        long currentTimeMillis = System.currentTimeMillis();
        if (Build.VERSION.SDK_INT >= 11) {
            Notification.Builder when = new Notification.Builder(context.getApplicationContext()).setContentTitle("Jiguang提示：包名和AppKey不匹配").setContentText("请到 Portal 上获取您的包名和AppKey并更新AndroidManifest相应字段").setContentIntent(broadcast).setSmallIcon(i2).setTicker(str).setWhen(currentTimeMillis);
            if (Build.VERSION.SDK_INT >= 26) {
                when.setChannelId("JPush_Notification");
            }
            notification = when.getNotification();
            notification.flags = 34;
        } else {
            Notification notification2 = new Notification(i2, str, currentTimeMillis);
            notification2.flags = 34;
            try {
                C0817f.m3985a(notification2, "setLatestEventInfo", new Object[]{context, "Jiguang提示：包名和AppKey不匹配", "请到 Portal 上获取您的包名和AppKey并更新AndroidManifest相应字段", broadcast}, new Class[]{Context.class, CharSequence.class, CharSequence.class, PendingIntent.class});
            } catch (Exception unused) {
            }
            notification = notification2;
        }
        notificationManager.notify(str.hashCode(), notification);
    }

    /* renamed from: a */
    public static boolean m3937a() {
        boolean z;
        try {
            z = Environment.getExternalStorageState().equals("mounted");
        } catch (Throwable th) {
            C0675a.m3475g("AndroidUtil", "isSdcardExist exception: " + th);
            z = false;
        }
        if (!z) {
            C0675a.m3469c("AndroidUtil", "SDCard is not mounted");
        }
        return z;
    }

    /* renamed from: a */
    private static boolean m3938a(Context context, Class<?> cls) {
        boolean z;
        try {
            z = !context.getPackageManager().queryBroadcastReceivers(new Intent(context, cls), 0).isEmpty();
        } catch (Throwable unused) {
        }
        if (z) {
            return z;
        }
        try {
            return m3931a(context, context.getPackageName(), cls) != null;
        } catch (Throwable unused2) {
            return z;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x002e, code lost:            if (((android.app.AppOpsManager) r4.getSystemService("appops")).noteProxyOpNoThrow(r5, r4.getPackageName()) == 0) goto L15;     */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean m3939a(android.content.Context r4, java.lang.String r5) {
        /*
            r0 = 0
            r1 = 1
            int r2 = android.os.Build.VERSION.SDK_INT     // Catch: java.lang.Throwable -> L32
            r3 = 23
            if (r2 < r3) goto L30
            android.content.pm.ApplicationInfo r2 = r4.getApplicationInfo()     // Catch: java.lang.Throwable -> L32
            int r2 = r2.targetSdkVersion     // Catch: java.lang.Throwable -> L32
            if (r2 < r3) goto L17
            int r4 = r4.checkSelfPermission(r5)     // Catch: java.lang.Throwable -> L32
            if (r4 != 0) goto L4a
            goto L30
        L17:
            java.lang.String r5 = android.app.AppOpsManager.permissionToOp(r5)     // Catch: java.lang.Throwable -> L32
            if (r5 != 0) goto L1e
            goto L30
        L1e:
            java.lang.String r2 = "appops"
            java.lang.Object r2 = r4.getSystemService(r2)     // Catch: java.lang.Throwable -> L32
            android.app.AppOpsManager r2 = (android.app.AppOpsManager) r2     // Catch: java.lang.Throwable -> L32
            java.lang.String r4 = r4.getPackageName()     // Catch: java.lang.Throwable -> L32
            int r4 = r2.noteProxyOpNoThrow(r5, r4)     // Catch: java.lang.Throwable -> L32
            if (r4 != 0) goto L4a
        L30:
            r0 = 1
            goto L4a
        L32:
            r4 = move-exception
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r1 = "checkPermission error:"
            r5.<init>(r1)
            java.lang.String r4 = r4.getMessage()
            r5.append(r4)
            java.lang.String r4 = r5.toString()
            java.lang.String r5 = "AndroidUtil"
            p031c.p032a.p066j.C0675a.m3475g(r5, r4)
        L4a:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p031c.p032a.p091r.C0812a.m3939a(android.content.Context, java.lang.String):boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002e A[RETURN] */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int m3940b(android.content.Context r5) {
        /*
            java.lang.String r0 = "AndroidUtil"
            r1 = -1
            if (r5 != 0) goto L6
            return r1
        L6:
            android.content.IntentFilter r2 = new android.content.IntentFilter
            java.lang.String r3 = "android.intent.action.BATTERY_CHANGED"
            r2.<init>(r3)
            r3 = 0
            android.content.Intent r3 = r5.registerReceiver(r3, r2)     // Catch: java.lang.Exception -> L13 java.lang.SecurityException -> L27
            goto L2c
        L13:
            r5 = move-exception
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r4 = "getChargedStatus unkown exception:"
            r2.<init>(r4)
            java.lang.String r5 = r5.getMessage()
            r2.append(r5)
            java.lang.String r5 = r2.toString()
            goto L29
        L27:
            java.lang.String r5 = "getChargedStatus SecurityException"
        L29:
            p031c.p032a.p066j.C0675a.m3475g(r0, r5)
        L2c:
            if (r3 != 0) goto L2f
            return r1
        L2f:
            java.lang.String r5 = "status"
            int r5 = r3.getIntExtra(r5, r1)
            r0 = 2
            if (r5 == r0) goto L3e
            r0 = 5
            if (r5 != r0) goto L3c
            goto L3e
        L3c:
            r5 = 0
            goto L3f
        L3e:
            r5 = 1
        L3f:
            if (r5 != 0) goto L42
            return r1
        L42:
            java.lang.String r5 = "plugged"
            int r5 = r3.getIntExtra(r5, r1)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: p031c.p032a.p091r.C0812a.m3940b(android.content.Context):int");
    }

    /* renamed from: b */
    public static ProviderInfo m3941b(Context context, String str, Class<? extends ContentProvider> cls) {
        try {
            return context.getPackageManager().getProviderInfo(new ComponentName(str, cls.getName()), 65536);
        } catch (Throwable unused) {
            return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:5:0x0014  */
    /* JADX WARN: Removed duplicated region for block: B:8:? A[RETURN, SYNTHETIC] */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.String m3942b() {
        /*
            java.io.File r0 = android.os.Environment.getExternalStorageDirectory()     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L9 java.lang.Exception -> Ld
            java.lang.String r0 = r0.getPath()     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L9 java.lang.Exception -> Ld
            goto Le
        L9:
            r0 = move-exception
            r0.printStackTrace()
        Ld:
            r0 = 0
        Le:
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            if (r1 != 0) goto L25
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            java.lang.String r0 = "/data/"
            r1.append(r0)
            java.lang.String r0 = r1.toString()
        L25:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p031c.p032a.p091r.C0812a.m3942b():java.lang.String");
    }

    @SuppressLint({"MissingPermission"})
    /* renamed from: b */
    public static String m3943b(Context context, String str) {
        String str2 = null;
        try {
        } catch (Exception e2) {
            C0675a.m3477i("AndroidUtil", e2.getMessage());
        }
        if (C0557c.m2903a(context, false, "do not getImei")) {
            return "";
        }
        if (m3939a(context, "android.permission.READ_PHONE_STATE")) {
            str2 = ((TelephonyManager) context.getSystemService("phone")).getDeviceId();
        }
        return C0819h.m3998h(str2) ? str2 : str;
    }

    /* renamed from: c */
    public static ComponentInfo m3944c(Context context, String str, Class<?> cls) {
        int i;
        ComponentInfo[] componentInfoArr;
        if (context == null || TextUtils.isEmpty(str) || cls == null) {
            C0675a.m3475g("AndroidUtil", "Action - hasComponent, invalide param, context:" + context + ",packageName:" + str + ",cls:" + cls);
            return null;
        }
        try {
            int i2 = Service.class.isAssignableFrom(cls) ? 4 : BroadcastReceiver.class.isAssignableFrom(cls) ? 2 : Activity.class.isAssignableFrom(cls) ? 1 : ContentProvider.class.isAssignableFrom(cls) ? 8 : 0;
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo(str, i2);
            componentInfoArr = i2 != 1 ? i2 != 2 ? i2 != 4 ? i2 != 8 ? null : packageInfo.providers : packageInfo.services : packageInfo.receivers : packageInfo.activities;
        } catch (Throwable th) {
            C0675a.m3476h("AndroidUtil", "hasComponent error:" + th.getMessage());
        }
        if (componentInfoArr == null) {
            return null;
        }
        String name = cls.getName();
        for (ComponentInfo componentInfo : componentInfoArr) {
            if (name.equals(componentInfo.name)) {
                return componentInfo;
            }
        }
        return null;
    }

    /* renamed from: c */
    public static String m3945c() {
        try {
            Enumeration<NetworkInterface> networkInterfaces = NetworkInterface.getNetworkInterfaces();
            while (networkInterfaces.hasMoreElements()) {
                Enumeration<InetAddress> inetAddresses = networkInterfaces.nextElement().getInetAddresses();
                while (inetAddresses.hasMoreElements()) {
                    InetAddress nextElement = inetAddresses.nextElement();
                    if (!nextElement.isLoopbackAddress() && (nextElement instanceof Inet4Address)) {
                        return nextElement.getHostAddress();
                    }
                }
            }
            return "";
        } catch (Exception e2) {
            C0675a.m3475g("AndroidUtil", "getPhoneIp:");
            e2.printStackTrace();
            return "";
        }
    }

    @SuppressLint({"MissingPermission"})
    /* renamed from: c */
    public static String m3946c(Context context, String str) {
        try {
            return C0557c.m2903a(context, false, "do not getImsi") ? "" : m3939a(context, "android.permission.READ_PHONE_STATE") ? ((TelephonyManager) context.getSystemService("phone")).getSubscriberId() : str;
        } catch (Throwable th) {
            C0675a.m3475g("AndroidUtil", "getImsi failed:" + th.getMessage());
            return str;
        }
    }

    /* renamed from: c */
    public static boolean m3947c(Context context) {
        NetworkInfo activeNetworkInfo;
        try {
            if (m3939a(context, "android.permission.ACCESS_NETWORK_STATE") && (activeNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo()) != null) {
                if (activeNetworkInfo.isConnected()) {
                    return true;
                }
            }
            return false;
        } catch (Throwable th) {
            th.printStackTrace();
        }
        return false;
    }

    /* renamed from: d */
    public static String m3948d(Context context, String str) {
        String m3960m = m3960m(context);
        String m3961n = !C0819h.m3999i(m3960m) ? m3961n(context) : m3960m;
        if (!C0819h.m3999i(m3961n)) {
            m3961n = str;
        }
        C0675a.m3469c("AndroidUtil", "getWifiMac:" + m3961n);
        return m3961n;
    }

    /* renamed from: d */
    public static boolean m3949d(Context context) {
        String str = context.getApplicationInfo().sourceDir;
        if (C0819h.m3990a(str)) {
            C0675a.m3477i("AndroidUtil", "Unexpected: cannot get pk installed path");
            return false;
        }
        C0675a.m3469c("AndroidUtil", "Current pk installed path: " + str);
        if (str.startsWith("/system/app/")) {
            return true;
        }
        if (str.startsWith("/data/app/")) {
            return false;
        }
        C0675a.m3473e("AndroidUtil", "NOTE: the pk does not installed in system/data. ");
        return false;
    }

    /* renamed from: e */
    public static String m3950e(Context context) {
        DisplayMetrics displayMetrics;
        if (context == null || context.getResources() == null || (displayMetrics = context.getResources().getDisplayMetrics()) == null) {
            return "0*0";
        }
        return displayMetrics.widthPixels + "*" + displayMetrics.heightPixels;
    }

    /* renamed from: e */
    public static boolean m3951e(Context context, String str) {
        if (C0819h.m3990a(str)) {
            return false;
        }
        return context.getPackageManager().getPackageInfo(str, 0) != null;
    }

    /* renamed from: f */
    public static String m3952f(Context context) {
        String str;
        try {
            str = Settings.Secure.getString(context.getContentResolver(), "android_id");
        } catch (Throwable unused) {
            str = "";
        }
        return C0819h.m3998h(str) ? str : "";
    }

    /* renamed from: f */
    public static boolean m3953f(Context context, String str) {
        if (context == null || TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("empty params");
        }
        try {
            context.getPackageManager().getPermissionInfo(str, 128);
            return true;
        } catch (Throwable th) {
            C0675a.m3476h("AndroidUtil", "hasPermissionDefined error:" + th.getMessage());
            return false;
        }
    }

    /* renamed from: g */
    public static String m3954g(Context context) {
        try {
            String m3948d = m3948d(context, "");
            if (m3948d != null && !m3948d.equals("")) {
                C0675a.m3473e("AndroidUtil", "MAC addr info---- " + m3948d);
                return C0819h.m3994d(m3948d.toLowerCase() + Build.MODEL);
            }
            return null;
        } catch (Exception e2) {
            C0675a.m3468b("AndroidUtil", "", e2);
            return null;
        }
    }

    /* renamed from: h */
    public static boolean m3955h(Context context) {
        String m3933a = m3933a(context, "ro.product.brand", "");
        C0675a.m3469c("AndroidUtil", "brand = " + m3933a);
        String m3933a2 = m3933a(context, "ro.miui.ui.version.name", "");
        if (TextUtils.isEmpty(m3933a) || !"Xiaomi".equals(m3933a) || TextUtils.isEmpty(m3933a2)) {
            return true;
        }
        String m3933a3 = m3933a(context, "ro.build.version.incremental", "");
        if (TextUtils.isEmpty(m3933a3) || !m3933a3.startsWith("V7.1")) {
            return true;
        }
        C0675a.m3475g("AndroidUtil", "7.1 will not get wifi list");
        return false;
    }

    /* renamed from: i */
    public static String m3956i(Context context) {
        try {
            NetworkInfo activeNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
            if (activeNetworkInfo == null) {
                return "Unknown";
            }
            String typeName = activeNetworkInfo.getTypeName();
            String subtypeName = activeNetworkInfo.getSubtypeName();
            if (typeName == null) {
                return "Unknown";
            }
            if (C0819h.m3990a(subtypeName)) {
                return typeName;
            }
            return typeName + "," + subtypeName;
        } catch (Exception e2) {
            e2.printStackTrace();
            return "Unknown";
        }
    }

    /* renamed from: j */
    public static String m3957j(Context context) {
        try {
            WifiManager wifiManager = (WifiManager) context.getApplicationContext().getSystemService("wifi");
            if (wifiManager == null || !m3939a(context, "android.permission.ACCESS_WIFI_STATE")) {
                return "";
            }
            String bssid = wifiManager.getConnectionInfo().getBSSID();
            if (bssid == null) {
                return "";
            }
            try {
                if (bssid.startsWith("02:00:00:")) {
                    return "";
                }
            } catch (Throwable unused) {
            }
            return bssid;
        } catch (Throwable unused2) {
            return "";
        }
    }

    /* renamed from: k */
    public static String m3958k(Context context) {
        Object invoke;
        String str = null;
        int i = -1;
        if (context != null) {
            try {
                Object systemService = context.getApplicationContext().getSystemService("country_detector");
                if (systemService != null) {
                    Method declaredMethod = systemService.getClass().getDeclaredMethod("detectCountry", new Class[0]);
                    if (declaredMethod != null && (invoke = declaredMethod.invoke(systemService, new Object[0])) != null) {
                        String str2 = (String) invoke.getClass().getDeclaredMethod("getCountryIso", new Class[0]).invoke(invoke, new Object[0]);
                        try {
                            i = ((Integer) invoke.getClass().getDeclaredMethod("getSource", new Class[0]).invoke(invoke, new Object[0])).intValue();
                            str = str2;
                        } catch (Throwable th) {
                            th = th;
                            str = str2;
                            C0675a.m3477i("AndroidUtil", "getCountryCode failed, error :" + th);
                            C0675a.m3469c("AndroidUtil", "get CountCode = " + str + " source = " + i);
                            if (i != 0) {
                            }
                        }
                    }
                } else {
                    C0675a.m3469c("AndroidUtil", "country_detector is null");
                }
            } catch (Throwable th2) {
                th = th2;
            }
        }
        C0675a.m3469c("AndroidUtil", "get CountCode = " + str + " source = " + i);
        return (i != 0 || i == 1) ? str : "";
    }

    /* renamed from: l */
    private static boolean m3959l(Context context) {
        try {
            C0675a.m3469c("AndroidUtil", "isDebug:" + ((context.getApplicationInfo().flags & 2) != 0));
            X500Principal x500Principal = new X500Principal("CN=Android Debug,O=Android,C=US");
            String[] strArr = {"CN=Android Debug", "O=Android", "C=US"};
            Signature[] signatureArr = context.getPackageManager().getPackageInfo(context.getPackageName(), 64).signatures;
            CertificateFactory certificateFactory = CertificateFactory.getInstance("X.509");
            boolean z = false;
            for (Signature signature : signatureArr) {
                try {
                    X509Certificate x509Certificate = (X509Certificate) certificateFactory.generateCertificate(new ByteArrayInputStream(signature.toByteArray()));
                    z = x509Certificate.getSubjectX500Principal().equals(x500Principal);
                    C0675a.m3469c("AndroidUtil", "debuggable :" + z);
                    if (z) {
                        break;
                    }
                    String str = null;
                    try {
                        str = x509Certificate.getSubjectX500Principal().getName();
                    } catch (Exception unused) {
                    }
                    C0675a.m3469c("AndroidUtil", "certName:" + str);
                    if (str != null && str.contains(strArr[0]) && str.contains(strArr[1]) && str.contains(strArr[2])) {
                        return true;
                    }
                } catch (Throwable unused2) {
                }
            }
            return z;
        } catch (Throwable unused3) {
            return false;
        }
    }

    @SuppressLint({"MissingPermission"})
    /* renamed from: m */
    private static String m3960m(Context context) {
        String str = "";
        if (Build.VERSION.SDK_INT >= 23 || !m3939a(context, "android.permission.ACCESS_WIFI_STATE")) {
            return "";
        }
        try {
            str = ((WifiManager) context.getApplicationContext().getSystemService("wifi")).getConnectionInfo().getMacAddress();
            C0675a.m3469c("AndroidUtil", "mac address from WifiManager:" + str);
            return str;
        } catch (Exception e2) {
            C0675a.m3466a("AndroidUtil", "get mac from wifiManager failed ", e2);
            return str;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0044, code lost:            r3 = new java.lang.StringBuilder();        r5 = r4.length;        r6 = 0;     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x004c, code lost:            if (r6 >= r5) goto L54;     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x004e, code lost:            r3.append(java.lang.String.format(java.util.Locale.ENGLISH, "%02x:", java.lang.Byte.valueOf(r4[r6])));        r6 = r6 + 1;     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x006a, code lost:            if (r3.length() <= 0) goto L24;     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x006c, code lost:            r3.deleteCharAt(r3.length() - 1);     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0074, code lost:            r2 = r3.toString();     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0078, code lost:            p031c.p032a.p066j.C0675a.m3469c("AndroidUtil", "mac address from NetworkInterface:" + r2);     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x008a, code lost:            r3 = move-exception;     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x008b, code lost:            r3 = r12;        r12 = r2;        r2 = r3;     */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00c4  */
    /* renamed from: n */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.lang.String m3961n(android.content.Context r12) {
        /*
            java.lang.String r0 = ""
            java.lang.String r1 = "AndroidUtil"
            r2 = 0
            java.lang.String r3 = "android.permission.ACCESS_WIFI_STATE"
            boolean r3 = m3939a(r12, r3)     // Catch: java.lang.Exception -> L95
            if (r3 == 0) goto L1e
            android.content.Context r12 = r12.getApplicationContext()     // Catch: java.lang.Exception -> L95
            java.lang.String r3 = "wifi"
            java.lang.Object r12 = r12.getSystemService(r3)     // Catch: java.lang.Exception -> L95
            android.net.wifi.WifiManager r12 = (android.net.wifi.WifiManager) r12     // Catch: java.lang.Exception -> L95
            boolean r12 = r12.isWifiEnabled()     // Catch: java.lang.Exception -> L95
            goto L1f
        L1e:
            r12 = 0
        L1f:
            java.util.Enumeration r3 = java.net.NetworkInterface.getNetworkInterfaces()     // Catch: java.lang.Exception -> L92
        L23:
            boolean r4 = r3.hasMoreElements()     // Catch: java.lang.Exception -> L92
            if (r4 == 0) goto L90
            java.lang.Object r4 = r3.nextElement()     // Catch: java.lang.Exception -> L92
            java.net.NetworkInterface r4 = (java.net.NetworkInterface) r4     // Catch: java.lang.Exception -> L92
            java.lang.String r5 = "wlan0"
            java.lang.String r6 = r4.getName()     // Catch: java.lang.Exception -> L92
            boolean r5 = r5.equalsIgnoreCase(r6)     // Catch: java.lang.Exception -> L92
            if (r5 == 0) goto L23
            byte[] r4 = r4.getHardwareAddress()     // Catch: java.lang.Exception -> L92
            if (r4 == 0) goto L23
            int r5 = r4.length     // Catch: java.lang.Exception -> L92
            if (r5 == 0) goto L23
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L92
            r3.<init>()     // Catch: java.lang.Exception -> L92
            int r5 = r4.length     // Catch: java.lang.Exception -> L92
            r6 = 0
        L4b:
            r7 = 1
            if (r6 >= r5) goto L66
            r8 = r4[r6]     // Catch: java.lang.Exception -> L92
            java.util.Locale r9 = java.util.Locale.ENGLISH     // Catch: java.lang.Exception -> L92
            java.lang.String r10 = "%02x:"
            java.lang.Object[] r7 = new java.lang.Object[r7]     // Catch: java.lang.Exception -> L92
            java.lang.Byte r8 = java.lang.Byte.valueOf(r8)     // Catch: java.lang.Exception -> L92
            r7[r2] = r8     // Catch: java.lang.Exception -> L92
            java.lang.String r7 = java.lang.String.format(r9, r10, r7)     // Catch: java.lang.Exception -> L92
            r3.append(r7)     // Catch: java.lang.Exception -> L92
            int r6 = r6 + 1
            goto L4b
        L66:
            int r2 = r3.length()     // Catch: java.lang.Exception -> L92
            if (r2 <= 0) goto L74
            int r2 = r3.length()     // Catch: java.lang.Exception -> L92
            int r2 = r2 - r7
            r3.deleteCharAt(r2)     // Catch: java.lang.Exception -> L92
        L74:
            java.lang.String r2 = r3.toString()     // Catch: java.lang.Exception -> L92
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L8a
            java.lang.String r4 = "mac address from NetworkInterface:"
            r3.<init>(r4)     // Catch: java.lang.Exception -> L8a
            r3.append(r2)     // Catch: java.lang.Exception -> L8a
            java.lang.String r3 = r3.toString()     // Catch: java.lang.Exception -> L8a
            p031c.p032a.p066j.C0675a.m3469c(r1, r3)     // Catch: java.lang.Exception -> L8a
            goto Lb0
        L8a:
            r3 = move-exception
            r11 = r3
            r3 = r12
            r12 = r2
            r2 = r11
            goto L99
        L90:
            r2 = r0
            goto Lb0
        L92:
            r2 = move-exception
            r3 = r12
            goto L98
        L95:
            r12 = move-exception
            r3 = 0
            r2 = r12
        L98:
            r12 = r0
        L99:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r5 = "get mac from NetworkInterface failed:"
            r4.<init>(r5)
            java.lang.String r2 = r2.getMessage()
            r4.append(r2)
            java.lang.String r2 = r4.toString()
            p031c.p032a.p066j.C0675a.m3475g(r1, r2)
            r2 = r12
            r12 = r3
        Lb0:
            if (r12 != 0) goto Lc4
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            java.lang.String r3 = "mac address is dropped, which is "
            r12.<init>(r3)
            r12.append(r2)
            java.lang.String r12 = r12.toString()
            p031c.p032a.p066j.C0675a.m3469c(r1, r12)
            goto Lc5
        Lc4:
            r0 = r2
        Lc5:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p031c.p032a.p091r.C0812a.m3961n(android.content.Context):java.lang.String");
    }
}
