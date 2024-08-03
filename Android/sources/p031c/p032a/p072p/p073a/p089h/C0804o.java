package p031c.p032a.p072p.p073a.p089h;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.AppOpsManager;
import android.content.Context;
import android.os.Binder;
import android.os.Build;
import android.widget.Toast;
import p031c.p032a.p072p.p073a.p080f.C0730a;
import p031c.p032a.p072p.p073a.p080f.C0758g;
import p031c.p032a.p072p.p073a.p080f.p081a.C0732b;

/* renamed from: c.a.p.a.h.o */
/* loaded from: classes.dex */
public final class C0804o {

    /* renamed from: a */
    public static int f3508a = 312;

    /* renamed from: b */
    public static int f3509b = 296;

    /* renamed from: c */
    private static boolean f3510c;

    /* renamed from: d */
    private static C0797h f3511d;

    /* renamed from: e */
    private static boolean f3512e;

    /* renamed from: f */
    private static boolean f3513f;

    /* renamed from: g */
    private static boolean f3514g;

    static {
        if (Build.MANUFACTURER.equals("Xiaomi")) {
            f3514g = true;
        }
    }

    /* renamed from: a */
    public static synchronized void m3914a(Context context) {
        synchronized (C0804o.class) {
            m3915a(context, false, true);
        }
    }

    /* renamed from: a */
    public static synchronized void m3915a(Context context, boolean z, boolean z2) {
        synchronized (C0804o.class) {
            if (!f3510c && (!z || !f3513f)) {
                if (z2 || f3512e) {
                    try {
                        Context applicationContext = context.getApplicationContext();
                        if (!(Build.VERSION.SDK_INT >= 19 ? m3918a(applicationContext, 24) : !f3514g || (applicationContext.getApplicationInfo().flags & 134217728) == 134217728)) {
                            Toast.makeText(applicationContext, "请先开启悬浮窗权限", 0).show();
                            C0732b.m3726i("WindowUtils", "没有悬浮窗权限");
                            return;
                        }
                        f3512e = true;
                        f3510c = true;
                        C0797h c0797h = new C0797h(applicationContext);
                        f3511d = c0797h;
                        c0797h.f3495v = new C0805p();
                        f3511d.m3907a();
                        Activity m3711c = C0730a.m3703a().m3711c();
                        if (m3711c == null && (context instanceof Activity)) {
                            m3711c = (Activity) context;
                        }
                        C0758g.m3796c(m3711c);
                    } catch (Throwable th) {
                        C0732b.m3725h("WindowUtils", "showCircleView err:" + th);
                    }
                }
            }
        }
    }

    /* renamed from: a */
    public static synchronized void m3916a(boolean z) {
        synchronized (C0804o.class) {
            f3513f = z;
        }
    }

    /* renamed from: a */
    public static boolean m3917a() {
        return f3512e;
    }

    @TargetApi(19)
    /* renamed from: a */
    private static boolean m3918a(Context context, int i) {
        if (Build.VERSION.SDK_INT >= 19) {
            AppOpsManager appOpsManager = (AppOpsManager) context.getSystemService("appops");
            try {
                return ((Integer) appOpsManager.getClass().getDeclaredMethod("checkOp", Integer.TYPE, Integer.TYPE, String.class).invoke(appOpsManager, 24, Integer.valueOf(Binder.getCallingUid()), context.getPackageName())).intValue() == 0;
            } catch (Exception e2) {
                C0732b.m3725h("WindowUtils", "checkOp e:" + e2);
            }
        }
        return false;
    }

    /* renamed from: b */
    public static synchronized void m3919b() {
        synchronized (C0804o.class) {
            f3512e = false;
            m3920c();
        }
    }

    /* renamed from: c */
    public static synchronized void m3920c() {
        synchronized (C0804o.class) {
            try {
                if (f3511d != null) {
                    f3511d.m3908b();
                    f3511d = null;
                }
                f3510c = false;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* renamed from: d */
    public static void m3921d() {
    }
}
