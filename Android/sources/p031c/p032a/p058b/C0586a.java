package p031c.p032a.p058b;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.ComponentInfo;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.os.Build;
import android.text.TextUtils;
import cn.jpush.android.service.C0957d;
import cn.jpush.android.service.ServiceC0955b;
import java.util.List;
import p031c.p032a.p048P.p049a.C0557c;
import p031c.p032a.p056W.C0582c;
import p031c.p032a.p066j.C0675a;
import p031c.p032a.p091r.C0812a;

/* renamed from: c.a.b.a */
/* loaded from: classes.dex */
public final class C0586a {

    /* renamed from: a */
    private static Boolean f2810a;

    /* renamed from: b */
    private static Boolean f2811b;

    /* renamed from: c */
    private static final String f2812c = "Xiaomi".toLowerCase();

    /* renamed from: a */
    private static Intent m2988a(PackageManager packageManager, String str) {
        try {
            Intent intent = new Intent();
            intent.setAction("cn.jpush.android.intent.DActivity");
            intent.addCategory(str);
            intent.setPackage(str);
            ResolveInfo resolveActivity = packageManager.resolveActivity(intent, 0);
            if (resolveActivity == null) {
                C0675a.m3475g("JWakeComponentHelper", "getDActivity resolveInfo was null from:" + str);
                return null;
            }
            C0675a.m3469c("JWakeComponentHelper", "target actvity name:" + resolveActivity.activityInfo.name + ", theme:" + resolveActivity.activityInfo.theme + ",exported:" + resolveActivity.activityInfo.exported);
            if (resolveActivity.activityInfo.exported && resolveActivity.activityInfo.enabled && "jpush.custom".equals(resolveActivity.activityInfo.taskAffinity)) {
                if (resolveActivity.activityInfo.theme != 16973840) {
                    C0675a.m3475g("JWakeComponentHelper", resolveActivity.activityInfo.name + "activity theme must config as @android:style/Theme.Translucent.NoTitleBar");
                    return null;
                }
                intent.setComponent(new ComponentName(str, resolveActivity.activityInfo.name));
                C0675a.m3469c("JWakeComponentHelper", "dIntent:" + intent);
                return intent;
            }
            C0675a.m3475g("JWakeComponentHelper", "activity muse be exported and enabled, and taskAffinity must be jpush.custom");
            return null;
        } catch (Throwable th) {
            C0675a.m3475g("JWakeComponentHelper", "get deeplink activity error#" + th);
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static C0582c m2989a(Context context, PackageManager packageManager, String str, String str2) {
        StringBuilder sb;
        String message;
        if (packageManager != null && !TextUtils.isEmpty(str)) {
            try {
                int checkPermission = packageManager.checkPermission(str + ".permission.JPUSH_MESSAGE", str);
                ApplicationInfo applicationInfo = packageManager.getApplicationInfo(str, 128);
                if (applicationInfo != null && applicationInfo.metaData != null) {
                    String m2915i = C0557c.m2915i(context);
                    Intent intent = new Intent();
                    intent.setClassName(str, "cn.jpush.android.service.PushService");
                    boolean z = false;
                    List<ResolveInfo> queryIntentServices = packageManager.queryIntentServices(intent, 0);
                    if (queryIntentServices != null && queryIntentServices.size() != 0) {
                        z = true;
                    }
                    if (checkPermission == 0 && z && !TextUtils.isEmpty(m2915i) && m2915i.length() == 24) {
                        C0582c c0582c = new C0582c(str, str2, applicationInfo.targetSdkVersion);
                        ComponentInfo m3931a = C0812a.m3931a(context, str, (Class<?>) C0957d.class);
                        if (m3931a instanceof ProviderInfo) {
                            ProviderInfo providerInfo = (ProviderInfo) m3931a;
                            if (providerInfo.exported && providerInfo.enabled && providerInfo.authority != null) {
                                if (TextUtils.equals(str + ".DownloadProvider", providerInfo.authority)) {
                                    c0582c.f2792d = providerInfo.authority;
                                }
                            }
                        }
                        if (m2994b(context) && !m2992a(context)) {
                            c0582c.f2793e = m2988a(packageManager, str);
                        }
                        return c0582c;
                    }
                }
            } catch (PackageManager.NameNotFoundException e2) {
                sb = new StringBuilder("checkWhetherToStart exception:");
                message = e2.toString();
                sb.append(message);
                C0675a.m3475g("JWakeComponentHelper", sb.toString());
                return null;
            } catch (Throwable th) {
                sb = new StringBuilder("checkWhetherToStart throwable:");
                message = th.getMessage();
                sb.append(message);
                C0675a.m3475g("JWakeComponentHelper", sb.toString());
                return null;
            }
        }
        return null;
    }

    /* renamed from: a */
    public static void m2990a(Context context, boolean z) {
        ServiceInfo serviceInfo;
        try {
            if (context == null) {
                C0675a.m3476h("JWakeComponentHelper", "context is null, give up setComponentEnabled");
            } else {
                PackageManager packageManager = context.getApplicationContext().getPackageManager();
                if (packageManager == null) {
                    C0675a.m3476h("JWakeComponentHelper", "PackageManager is null, give up setComponentEnabled");
                } else {
                    String packageName = context.getPackageName();
                    int i = z ? 1 : 2;
                    Intent intent = new Intent();
                    intent.setPackage(packageName);
                    intent.setAction("cn.jpush.android.intent.DaemonService");
                    List<ResolveInfo> queryIntentServices = packageManager.queryIntentServices(intent, 512);
                    if (queryIntentServices == null || queryIntentServices.isEmpty()) {
                        C0675a.m3475g("JWakeComponentHelper", "cant't find DaemonService");
                    } else {
                        for (ResolveInfo resolveInfo : queryIntentServices) {
                            if (resolveInfo != null && (serviceInfo = resolveInfo.serviceInfo) != null) {
                                String str = serviceInfo.name;
                                if (TextUtils.isEmpty(str)) {
                                    continue;
                                } else {
                                    try {
                                        Class<?> cls = Class.forName(str);
                                        if (cls != null) {
                                            if (ServiceC0955b.class.isAssignableFrom(cls)) {
                                                ComponentName componentName = new ComponentName(serviceInfo.packageName, serviceInfo.name);
                                                C0675a.m3469c("JWakeComponentHelper", componentName + " setComponentEnabledSetting newState: " + i);
                                                if (packageManager.getComponentEnabledSetting(componentName) == i) {
                                                    C0675a.m3469c("JWakeComponentHelper", "DaemonService  enabled is :" + z + ", no need repeat set.");
                                                    break;
                                                }
                                                packageManager.setComponentEnabledSetting(componentName, i, 1);
                                            } else {
                                                C0675a.m3476h("JWakeComponentHelper", "give up setting, as " + str + " is not extend from: " + ServiceC0955b.class.getName());
                                            }
                                        }
                                    } catch (ClassNotFoundException unused) {
                                        C0675a.m3475g("JWakeComponentHelper", "cant't find service class:" + str);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        } catch (Throwable th) {
            C0675a.m3475g("JWakeComponentHelper", "setServiceEnabled throwable:" + th.getMessage());
        }
        try {
            if (context == null) {
                C0675a.m3476h("JWakeComponentHelper", "context is null, give up setComponentEnabled");
                return;
            }
            PackageManager packageManager2 = context.getApplicationContext().getPackageManager();
            if (packageManager2 == null) {
                C0675a.m3476h("JWakeComponentHelper", "PackageManager is null, give up setComponentEnabled");
                return;
            }
            int i2 = z ? 1 : 2;
            ComponentName componentName2 = new ComponentName(context, (Class<?>) C0957d.class);
            if (packageManager2.getComponentEnabledSetting(componentName2) == i2) {
                C0675a.m3469c("JWakeComponentHelper", componentName2.getClassName() + " enabled is :" + z + ", no need repeat set.");
                return;
            }
            C0675a.m3469c("JWakeComponentHelper", componentName2 + " setDownloadProviderEnabledSetting newState: " + i2);
            packageManager2.setComponentEnabledSetting(componentName2, i2, 1);
        } catch (Throwable th2) {
            C0675a.m3475g("JWakeComponentHelper", "setContentProviderEnabled throwable:" + th2.getMessage());
        }
    }

    /* renamed from: a */
    private static boolean m2991a() {
        try {
            String str = Build.MANUFACTURER;
            if (TextUtils.isEmpty(str)) {
                return false;
            }
            return TextUtils.equals(f2812c, str.toLowerCase());
        } catch (Throwable th) {
            C0675a.m3476h("JWakeComponentHelper", "get MANUFACTURER failed - error:" + th);
            return false;
        }
    }

    /* renamed from: a */
    public static boolean m2992a(Context context) {
        Boolean bool = f2811b;
        if (bool != null) {
            return bool.booleanValue();
        }
        f2811b = Boolean.valueOf(m2991a());
        return f2811b.booleanValue();
    }

    /* renamed from: a */
    private static boolean m2993a(Context context, String str) {
        try {
            PackageManager packageManager = context.getPackageManager();
            Intent intent = new Intent(str);
            intent.addCategory(context.getPackageName());
            return !packageManager.queryIntentActivities(intent, 0).isEmpty();
        } catch (Throwable th) {
            C0675a.m3476h("JWakeComponentHelper", "hasActivityIntentFilter error:" + th.getMessage());
            return false;
        }
    }

    /* renamed from: b */
    public static boolean m2994b(Context context) {
        Boolean bool = f2810a;
        if (bool != null) {
            return bool.booleanValue();
        }
        f2810a = Boolean.valueOf(m2993a(context, "cn.jpush.android.intent.DActivity"));
        return f2810a.booleanValue();
    }
}
