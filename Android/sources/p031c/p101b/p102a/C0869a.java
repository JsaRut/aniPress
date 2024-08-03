package p031c.p101b.p102a;

import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ComponentInfo;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import cn.jpush.android.service.AbstractC0959f;
import cn.jpush.android.service.ServiceC0958e;
import p031c.p101b.p102a.p107e.C0900a;
import p031c.p101b.p102a.p107e.C0901b;
import p031c.p101b.p102a.p114l.C0922a;
import p031c.p101b.p102a.p114l.C0923b;
import p031c.p101b.p102a.p114l.C0925d;
import p031c.p101b.p102a.p114l.C0926e;
import p031c.p101b.p102a.p115m.C0938a;

/* renamed from: c.b.a.a */
/* loaded from: classes.dex */
public class C0869a {

    /* renamed from: a */
    public static Context f3646a = null;

    /* renamed from: b */
    private static String f3647b = null;

    /* renamed from: c */
    private static boolean f3648c = false;

    /* renamed from: d */
    private static String f3649d = null;

    /* renamed from: e */
    private static Boolean f3650e = null;

    /* renamed from: f */
    private static AbstractC0959f f3651f = null;

    /* renamed from: g */
    public static int f3652g = -1;

    /* renamed from: h */
    private static boolean f3653h = false;

    /* renamed from: i */
    private static boolean f3654i = false;

    /* renamed from: a */
    public static AbstractC0959f m4237a() {
        return f3651f;
    }

    /* renamed from: a */
    public static void m4238a(Context context, int i, int i2, String str) {
        try {
            String m4243b = m4243b(context);
            if (!TextUtils.isEmpty(m4243b)) {
                Intent intent = new Intent();
                intent.setClassName(context, m4243b);
                intent.setAction("cmd_msg");
                intent.putExtra("cmd", i);
                intent.putExtra("code", i2);
                intent.putExtra("message", str);
                if (!m4241a(context) || m4237a() == null) {
                    context.sendBroadcast(intent);
                } else {
                    C0926e.m4663a(m4237a(), context, intent);
                }
            }
        } catch (Throwable th) {
            C0923b.m4653i("JPushGobal", "sendCmdMsgToUser failed:" + th.getMessage());
        }
    }

    /* renamed from: a */
    public static void m4239a(Context context, boolean z) {
        C0923b.m4642a("JPushGobal", "changeForegroudStat:" + z);
        f3652g = !z ? 1 : 0;
        Bundle bundle = new Bundle();
        bundle.putBoolean("foreground", z);
        C0922a.m4637a(context, "JPUSH", "change_foreground", bundle);
    }

    /* renamed from: a */
    public static void m4240a(boolean z) {
        f3648c = z;
    }

    /* renamed from: a */
    public static boolean m4241a(Context context) {
        boolean z;
        try {
        } catch (Throwable th) {
            C0923b.m4653i("JPushGobal", "call isSameProcessWithJCommonService failed:" + th.getMessage());
        }
        if (f3650e != null) {
            return f3650e.booleanValue();
        }
        if (f3649d == null) {
            m4243b(context);
        }
        ComponentInfo m4708a = C0938a.m4708a(context, context.getPackageName(), (Class<?>) ServiceC0958e.class);
        if (m4708a != null) {
            if (m4708a.processName.equals(f3649d)) {
                C0923b.m4644b("JPushGobal", "same process with JCommonService");
                z = true;
            } else {
                C0923b.m4644b("JPushGobal", "is not same process with JCommonService");
                z = false;
            }
            f3650e = z;
            return f3650e.booleanValue();
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0029, code lost:            if (r3.getApplicationInfo().targetSdkVersion <= 28) goto L62;     */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean m4242a(android.content.Context r3, boolean r4, java.lang.String r5) {
        /*
            r0 = 1
            r1 = 0
            r2 = 28
            if (r4 != 0) goto L16
            boolean r3 = p031c.p101b.p102a.C0869a.f3654i
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
            boolean r4 = p031c.p101b.p102a.C0869a.f3654i
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
            if (r0 == 0) goto L43
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "is Android Q, msg: "
            r3.append(r4)
            r3.append(r5)
            java.lang.String r3 = r3.toString()
            java.lang.String r4 = "JPushGobal"
            p031c.p101b.p102a.p114l.C0923b.m4642a(r4, r3)
        L43:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p031c.p101b.p102a.C0869a.m4242a(android.content.Context, boolean, java.lang.String):boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0052, code lost:            p031c.p101b.p102a.C0869a.f3647b = r4;        p031c.p101b.p102a.C0869a.f3649d = r3.activityInfo.processName;        p031c.p101b.p102a.p114l.C0923b.m4650f("JPushGobal", "found messageReceiverClass :" + p031c.p101b.p102a.C0869a.f3647b + " by getCommonReceiverNames");     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0077, code lost:            if (m4241a(r7) == false) goto L142;     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0079, code lost:            p031c.p101b.p102a.C0869a.f3651f = (cn.jpush.android.service.AbstractC0959f) r5.newInstance();     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0082, code lost:            r2 = move-exception;     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0083, code lost:            r2.printStackTrace();     */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.String m4243b(android.content.Context r7) {
        /*
            Method dump skipped, instructions count: 263
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p031c.p101b.p102a.C0869a.m4243b(android.content.Context):java.lang.String");
    }

    /* renamed from: b */
    public static boolean m4244b() {
        return f3648c;
    }

    /* renamed from: c */
    public static Context m4245c(Context context) {
        if (f3646a == null && context != null) {
            f3646a = context.getApplicationContext();
        }
        return f3646a;
    }

    /* renamed from: d */
    public static void m4246d(Context context) {
        m4248f(context);
        C0900a<Integer> m4432a = C0900a.m4432a();
        m4432a.m4436a((C0900a<Integer>) 334);
        C0901b.m4440a(context, (C0900a<?>[]) new C0900a[]{m4432a});
    }

    /* renamed from: e */
    public static boolean m4247e(Context context) {
        String str;
        if (m4242a(context, true, "canGetLbsInBackGround")) {
            if (f3652g != 1 || C0938a.m4717a(context, "android.permission.ACCESS_BACKGROUND_LOCATION")) {
                str = (f3652g == -1 && !C0938a.m4717a(context, "android.permission.ACCESS_BACKGROUND_LOCATION")) ? "app is unkonwn foreground stat and no android.permission.ACCESS_BACKGROUND_LOCATION" : "app is not in foreground and no android.permission.ACCESS_BACKGROUND_LOCATION";
            }
            C0923b.m4654j("JPushGobal", str);
            return false;
        }
        return true;
    }

    /* renamed from: f */
    private static void m4248f(Context context) {
        String str;
        C0923b.m4642a("JPushGobal", "initPageLifecycle init");
        if (f3653h) {
            return;
        }
        try {
            f3653h = true;
            if (Build.VERSION.SDK_INT < 14 || !(context instanceof Application)) {
                return;
            }
            String m4723c = C0938a.m4723c(context);
            String packageName = context.getPackageName();
            if (m4723c == null || packageName == null || !context.getPackageName().equals(m4723c)) {
                str = "need not initPageLifecycle in other process :" + m4723c;
            } else {
                ((Application) context).registerActivityLifecycleCallbacks(new C0925d());
                str = "initPageLifecycle in main process,packageName:" + packageName + ",currentProcessName:" + m4723c;
            }
            C0923b.m4642a("JPushGobal", str);
        } catch (Throwable th) {
            C0923b.m4654j("JPushGobal", "registerActivityLifecycleCallbacks failed:" + th.getMessage());
        }
    }
}
