package p031c.p032a.p057a;

import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.ServiceConnection;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import cn.jpush.android.service.BinderC0956c;
import cn.jpush.android.service.PushReceiver;
import cn.jpush.android.service.ServiceC0958e;
import p031c.p032a.p059c.C0591b;
import p031c.p032a.p059c.C0592c;
import p031c.p032a.p059c.C0593d;
import p031c.p032a.p060d.C0601d;
import p031c.p032a.p065i.C0661d;
import p031c.p032a.p092s.InterfaceC0828d;
import p031c.p032a.p095u.C0844a;
import p031c.p032a.p096v.C0845a;
import p031c.p032a.p096v.C0851g;
import p031c.p032a.p097w.C0855a;
import p031c.p032a.p098x.C0857a;

/* renamed from: c.a.a.a */
/* loaded from: classes.dex */
public final class C0583a {

    /* renamed from: a */
    public static Context f2794a = null;

    /* renamed from: b */
    public static InterfaceC0828d f2795b = null;

    /* renamed from: c */
    public static boolean f2796c = false;

    /* renamed from: d */
    public static String f2797d = "JCore";

    /* renamed from: e */
    public static boolean f2798e = false;

    /* renamed from: f */
    private static Boolean f2799f;

    /* renamed from: g */
    private static Boolean f2800g;

    /* renamed from: h */
    private static ServiceConnection f2801h = new ServiceConnectionC0584b();

    /* renamed from: i */
    public static boolean f2802i = true;

    /* renamed from: j */
    private static boolean f2803j = false;

    /* renamed from: k */
    public static String f2804k = "";

    /* renamed from: l */
    private static boolean f2805l = false;

    /* renamed from: a */
    public static Context m2978a(Context context) {
        if (f2794a == null && context != null) {
            f2794a = context.getApplicationContext();
        }
        return f2794a;
    }

    /* renamed from: a */
    public static void m2979a(Context context, String str, Bundle bundle) {
        C0844a.m4116a("SDK_INIT", new RunnableC0585c(context, false, str, bundle));
    }

    /* renamed from: a */
    public static void m2980a(Context context, boolean z, long j) {
        try {
            Bundle bundle = new Bundle();
            bundle.putBoolean("force", z);
            bundle.putLong("delay_time", j);
            m2979a(context, "tcp_a2", bundle);
        } catch (Throwable th) {
            C0601d.m3078g("JCoreGobal", "sendHeartBeat error:" + th);
        }
    }

    /* renamed from: a */
    public static boolean m2981a() {
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0029, code lost:            if (r3.getApplicationInfo().targetSdkVersion <= 28) goto L62;     */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean m2982a(android.content.Context r3, boolean r4, java.lang.String r5) {
        /*
            r0 = 1
            r1 = 0
            r2 = 28
            if (r4 != 0) goto L16
            boolean r3 = p031c.p032a.p057a.C0583a.f2805l
            if (r3 == 0) goto Lf
            int r3 = android.os.Build.VERSION.SDK_INT
            if (r3 < r2) goto L14
            goto L2b
        Lf:
            int r3 = android.os.Build.VERSION.SDK_INT
            if (r3 <= r2) goto L14
            goto L2b
        L14:
            r0 = 0
            goto L2b
        L16:
            boolean r4 = p031c.p032a.p057a.C0583a.f2805l
            if (r4 == 0) goto L1f
            int r4 = android.os.Build.VERSION.SDK_INT
            if (r4 < r2) goto L14
            goto L23
        L1f:
            int r4 = android.os.Build.VERSION.SDK_INT
            if (r4 <= r2) goto L14
        L23:
            android.content.pm.ApplicationInfo r3 = r3.getApplicationInfo()
            int r3 = r3.targetSdkVersion
            if (r3 <= r2) goto L14
        L2b:
            if (r0 == 0) goto L40
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "is Android Q, msg: "
            r3.<init>(r4)
            r3.append(r5)
            java.lang.String r3 = r3.toString()
            java.lang.String r4 = "JCoreGobal"
            p031c.p032a.p060d.C0601d.m3072b(r4, r3)
        L40:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p031c.p032a.p057a.C0583a.m2982a(android.content.Context, boolean, java.lang.String):boolean");
    }

    /* renamed from: b */
    public static void m2983b() {
        C0601d.m3072b("JCoreGobal", "call testAndroidQ");
        f2805l = true;
    }

    /* renamed from: b */
    public static void m2984b(Context context, String str, Bundle bundle) {
        C0844a.m4116a("SDK_SERVICE_INIT", new RunnableC0585c(context, true, str, bundle));
    }

    /* renamed from: b */
    public static synchronized boolean m2985b(Context context) {
        synchronized (C0583a.class) {
            if (f2799f != null) {
                return f2799f.booleanValue();
            }
            if (context == null) {
                C0601d.m3080i("JCoreGobal", "init failed,context is null");
                return false;
            }
            C0601d.m3076e("JCoreGobal", "action:init jcore,version:2.1.2,build id:40");
            C0601d.m3072b("JCoreGobal", "build type:release");
            f2794a = context.getApplicationContext();
            Context applicationContext = context.getApplicationContext();
            C0592c.m3025a();
            String m3040b = C0593d.m3040b(applicationContext);
            if ((C0592c.m3025a().m3035c() || C0592c.m3025a().m3034b()) && TextUtils.isEmpty(m3040b)) {
                f2799f = false;
                C0601d.m3080i("JCoreGobal", "AndroidManifest.xml missing required service:" + ServiceC0958e.class.getCanonicalName() + ",please custom one service and extends JCommonService");
                return false;
            }
            C0855a.m4170a().m4178b();
            String m3040b2 = C0593d.m3040b(applicationContext);
            if (TextUtils.isEmpty(m3040b2)) {
                C0601d.m3075d("JCoreGobal", "not found commonServiceClass（JCommonService）");
            } else if (BinderC0956c.m4789a()) {
                C0601d.m3072b("JCoreGobal", "is binding service");
            } else {
                try {
                    try {
                        Intent intent = new Intent();
                        intent.setClass(applicationContext, Class.forName(m3040b2));
                        if (applicationContext.bindService(intent, f2801h, 1)) {
                            C0601d.m3070a("JCoreGobal", "Remote Service on binding...");
                            BinderC0956c.m4790b();
                        } else {
                            C0601d.m3070a("JCoreGobal", "Remote Service bind failed");
                        }
                    } catch (Throwable th) {
                        C0601d.m3078g("JCoreGobal", "Remote Service bind failed :" + th);
                    }
                } catch (SecurityException unused) {
                    C0601d.m3078g("JCoreGobal", "Remote Service bind failed caused by SecurityException!");
                }
            }
            Boolean bool = true;
            f2799f = bool;
            return bool.booleanValue();
        }
    }

    /* renamed from: c */
    public static synchronized boolean m2986c(Context context) {
        synchronized (C0583a.class) {
            if (f2800g != null) {
                return f2800g.booleanValue();
            }
            if (context == null) {
                C0601d.m3080i("JCoreGobal", "init failed,context is null");
                return false;
            }
            C0601d.m3072b("JCoreGobal", "serviceInit...");
            f2794a = context.getApplicationContext();
            Context applicationContext = context.getApplicationContext();
            if (!C0591b.m3024d(applicationContext)) {
                Boolean bool = false;
                f2800g = bool;
                return bool.booleanValue();
            }
            C0592c.m3025a();
            try {
                IntentFilter intentFilter = new IntentFilter();
                PushReceiver pushReceiver = new PushReceiver();
                intentFilter.addAction("android.intent.action.USER_PRESENT");
                intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
                applicationContext.registerReceiver(pushReceiver, intentFilter);
                if (!C0851g.m4144a(applicationContext, PushReceiver.class)) {
                    IntentFilter intentFilter2 = new IntentFilter();
                    intentFilter2.addAction("android.intent.action.PACKAGE_ADDED");
                    intentFilter2.addAction("android.intent.action.PACKAGE_REMOVED");
                    intentFilter2.addDataScheme("package");
                    applicationContext.registerReceiver(pushReceiver, intentFilter2);
                }
            } catch (Throwable th) {
                C0601d.m3079h("JCoreGobal", "registerPushReceiver fail:" + th);
            }
            f2800g = true;
            C0855a.m4170a().m4179b(applicationContext);
            C0661d.m3386a(applicationContext, "service_create", null);
            return f2800g.booleanValue();
        }
    }

    /* renamed from: d */
    public static synchronized void m2987d(Context context) {
        synchronized (C0583a.class) {
            try {
            } catch (Throwable th) {
                C0601d.m3078g("JCoreGobal", "registerActivityLifecycleCallbacks failed:" + th);
                f2802i = true;
            }
            if (f2802i && Build.VERSION.SDK_INT >= 14 && (context instanceof Application)) {
                String m4118a = C0845a.m4118a(context);
                String packageName = context.getPackageName();
                if (m4118a != null && packageName != null && context.getPackageName().equals(m4118a)) {
                    f2802i = false;
                    ((Application) context).registerActivityLifecycleCallbacks(new C0857a());
                    C0601d.m3072b("JCoreGobal", "registerActivityLifecycleCallbacks in main process,packageName:" + packageName + ",currentProcessName:" + m4118a);
                    return;
                }
                C0601d.m3072b("JCoreGobal", "need not registerActivityLifecycleCallbacks in other process :" + m4118a);
            }
        }
    }
}
