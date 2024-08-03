package p031c.p032a.p059c;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ComponentInfo;
import android.os.Bundle;
import android.text.TextUtils;
import cn.jpush.android.service.ServiceC0958e;
import java.util.List;
import p031c.p032a.p048P.p049a.C0555a;
import p031c.p032a.p057a.C0583a;
import p031c.p032a.p060d.C0601d;
import p031c.p032a.p091r.C0812a;
import p031c.p032a.p092s.AbstractC0829e;
import p031c.p032a.p095u.C0844a;
import p031c.p032a.p096v.C0845a;

/* renamed from: c.a.c.d */
/* loaded from: classes.dex */
public final class C0593d {

    /* renamed from: b */
    private static volatile C0593d f2837b;

    /* renamed from: d */
    private static String f2839d;

    /* renamed from: e */
    private static String f2840e;

    /* renamed from: a */
    private static final Object f2836a = new Object();

    /* renamed from: c */
    public static AbstractC0829e f2838c = new C0555a();

    /* renamed from: a */
    public static C0593d m3037a() {
        if (f2837b == null) {
            synchronized (f2836a) {
                if (f2837b == null) {
                    f2837b = new C0593d();
                }
            }
        }
        return f2837b;
    }

    /* renamed from: a */
    public static String m3038a(Context context) {
        String str = f2840e;
        if (str != null) {
            return str;
        }
        String m3040b = m3040b(context);
        if (TextUtils.isEmpty(m3040b)) {
            f2840e = "";
            return "";
        }
        f2840e = C0845a.m4119a(context, m3040b);
        C0601d.m3072b("JCommonServiceHelper", "user serviceProcess is:" + f2840e);
        return f2840e;
    }

    /* renamed from: a */
    public static void m3039a(Context context, String str, Bundle bundle) {
        try {
            StringBuilder sb = new StringBuilder("onAction action:");
            sb.append(str);
            sb.append(" bundle:");
            sb.append(bundle == null ? "null" : bundle.toString());
            C0601d.m3072b("JCommonServiceHelper", sb.toString());
            String m3040b = m3040b(context);
            if (TextUtils.isEmpty(m3040b)) {
                C0583a.m2984b(context, str, bundle);
            } else {
                C0596g.m3055a().m3060a(context, m3040b, str, bundle);
            }
        } catch (Throwable th) {
            C0601d.m3073b("JCommonServiceHelper", "onAction failed", th);
        }
    }

    /* renamed from: b */
    public static String m3040b(Context context) {
        ComponentInfo m3931a;
        try {
        } catch (Throwable th) {
            C0601d.m3072b("JCommonServiceHelper", "getUserServiceClass failed:" + th);
        }
        if (f2839d != null) {
            return f2839d;
        }
        Intent intent = new Intent();
        intent.setAction("cn.jiguang.user.service.action");
        intent.setPackage(context.getPackageName());
        List<String> m4120a = C0845a.m4120a(context, intent, "");
        if (m4120a.size() > 0 && ServiceC0958e.class.isAssignableFrom(Class.forName(m4120a.get(0)))) {
            f2839d = m4120a.get(0);
            C0601d.m3076e("JCommonServiceHelper", "found userServiceClass :" + f2839d + " by getCommonServiceNames");
        }
        if (TextUtils.isEmpty(f2839d) && (m3931a = C0812a.m3931a(context, context.getPackageName(), (Class<?>) ServiceC0958e.class)) != null) {
            f2839d = m3931a.name;
            C0601d.m3076e("JCommonServiceHelper", "found userServiceClass :" + f2839d + " by getComponentInfo");
        }
        if (TextUtils.isEmpty(f2839d)) {
            f2839d = "";
        }
        return f2839d;
    }

    /* renamed from: b */
    public final void m3041b(Context context, String str, Bundle bundle) {
        try {
            StringBuilder sb = new StringBuilder("callAction action:");
            sb.append(str);
            sb.append(" bundle:");
            sb.append(bundle == null ? "null" : bundle.toString());
            C0601d.m3075d("JCommonServiceHelper", sb.toString());
            C0844a.m4116a("ACTION", new RunnableC0594e(this, C0583a.m2978a(context), str, bundle));
        } catch (Throwable th) {
            C0601d.m3073b("JCommonServiceHelper", "callAction failed", th);
        }
    }
}
