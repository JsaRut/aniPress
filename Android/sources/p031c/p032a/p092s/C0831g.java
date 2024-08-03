package p031c.p032a.p092s;

import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import p031c.p032a.p048P.p049a.C0557c;
import p031c.p032a.p057a.C0583a;
import p031c.p032a.p059c.C0590a;
import p031c.p032a.p059c.C0593d;
import p031c.p032a.p059c.C0595f;
import p031c.p032a.p059c.C0596g;
import p031c.p032a.p060d.C0601d;
import p031c.p032a.p096v.C0845a;
import p031c.p032a.p097w.C0855a;
import p031c.p032a.p100z.C0866a;
import p031c.p032a.p100z.C0867b;

/* renamed from: c.a.s.g */
/* loaded from: classes.dex */
public class C0831g {

    /* renamed from: a */
    private static final AtomicBoolean f3564a = new AtomicBoolean();

    /* renamed from: a */
    public static Context m4071a(Context context) {
        return C0583a.m2978a(context);
    }

    /* renamed from: a */
    public static Object m4072a(Context context, String str, int i, String str2, Bundle bundle, Object... objArr) {
        m4080c(context);
        return C0595f.m3043a(context, str, i, str2, bundle, objArr);
    }

    /* renamed from: a */
    public static void m4073a(InterfaceC0828d interfaceC0828d) {
        C0583a.f2795b = interfaceC0828d;
    }

    /* renamed from: a */
    public static void m4074a(String str, String str2) {
        C0590a.m3014a();
        C0590a.m3016a(str, str2);
    }

    /* renamed from: a */
    public static void m4075a(boolean z) {
        C0583a.f2798e = true;
    }

    /* renamed from: a */
    public static boolean m4076a() {
        return C0583a.f2796c;
    }

    /* renamed from: b */
    public static void m4077b(boolean z) {
        C0583a.f2796c = z;
    }

    /* renamed from: b */
    public static boolean m4078b() {
        return false;
    }

    @Deprecated
    /* renamed from: b */
    public static boolean m4079b(Context context) {
        try {
            Bundle m3059a = C0596g.m3055a().m3059a(context, "INTERNAL_API", "isTcpLoggedIn", null, C0593d.m3038a(context));
            return (m3059a == null || !m3059a.containsKey("state")) ? C0557c.m2908b() : m3059a.getBoolean("state");
        } catch (Throwable unused) {
            return false;
        }
    }

    /* renamed from: c */
    public static void m4080c(Context context) {
        Context m2978a = C0583a.m2978a(context);
        if (m2978a == null || f3564a.get()) {
            return;
        }
        f3564a.set(true);
        C0583a.m2987d(m2978a);
        C0583a.m2979a(m2978a, "tcp_a1", (Bundle) null);
        if (((Long) C0867b.m4225a(m2978a, C0866a.m4222w())).longValue() <= 0) {
            C0866a<Long> m4222w = C0866a.m4222w();
            m4222w.m4224a((C0866a<Long>) Long.valueOf(System.currentTimeMillis()));
            C0867b.m4229a(m2978a, (C0866a<?>[]) new C0866a[]{m4222w});
        }
    }

    /* renamed from: c */
    public static boolean m4081c() {
        return C0583a.m2981a();
    }

    /* renamed from: d */
    public static void m4082d(Context context) {
        C0855a m4170a = C0855a.m4170a();
        if (m4170a.f3609d) {
            return;
        }
        m4170a.f3609d = true;
        Context m2978a = C0583a.m2978a(context);
        C0866a<Boolean> m4201b = C0866a.m4201b();
        m4201b.m4224a((C0866a<Boolean>) true);
        C0867b.m4229a(m2978a, (C0866a<?>[]) new C0866a[]{m4201b});
    }

    /* renamed from: e */
    public static void m4083e(Context context) {
        String str;
        if (context == null) {
            str = "[requestPermission] context was null";
        } else {
            if (context instanceof Activity) {
                if (Build.VERSION.SDK_INT < 23 || context.getApplicationInfo().targetSdkVersion < 23) {
                    return;
                }
                try {
                    LinkedList linkedList = new LinkedList();
                    linkedList.add("android.permission.WRITE_EXTERNAL_STORAGE");
                    linkedList.add("android.permission.READ_EXTERNAL_STORAGE");
                    linkedList.add("android.permission.ACCESS_FINE_LOCATION");
                    linkedList.add("android.permission.READ_PHONE_STATE");
                    if (C0583a.m2982a(context, false, "will request background location permission")) {
                        linkedList.add("android.permission.ACCESS_BACKGROUND_LOCATION");
                    }
                    List<String> m4121a = C0845a.m4121a(context, linkedList);
                    if (m4121a != null && !m4121a.isEmpty()) {
                        C0601d.m3070a("JCoreManager", "lackPermissions:" + m4121a);
                        Class.forName("android.app.Activity").getDeclaredMethod("requestPermissions", String[].class, Integer.TYPE).invoke(context, m4121a.toArray(new String[m4121a.size()]), 1);
                        return;
                    }
                    return;
                } catch (Exception e2) {
                    C0601d.m3078g("JCoreManager", "#unexcepted - requestPermission e:" + e2);
                    return;
                }
            }
            str = "[requestPermission] context must instanceof Activity";
        }
        C0601d.m3078g("JCoreManager", str);
    }

    /* renamed from: f */
    public static void m4084f(Context context) {
        C0855a m4170a = C0855a.m4170a();
        if (m4170a.f3609d) {
            m4170a.f3609d = false;
            Context m2978a = C0583a.m2978a(context);
            C0866a<Boolean> m4201b = C0866a.m4201b();
            m4201b.m4224a((C0866a<Boolean>) false);
            C0867b.m4229a(m2978a, (C0866a<?>[]) new C0866a[]{m4201b});
        }
    }
}
