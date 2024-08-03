package p031c.p032a.p094t;

import android.text.TextUtils;
import java.util.HashMap;
import p031c.p032a.p092s.AbstractC0827c;
import p031c.p032a.p092s.C0831g;
import p031c.p032a.p092s.InterfaceC0826b;

/* renamed from: c.a.t.a */
/* loaded from: classes.dex */
public final class C0838a {

    /* renamed from: d */
    private static volatile C0838a f3581d;

    /* renamed from: a */
    public static HashMap<String, C0843f> f3578a = new HashMap<>();

    /* renamed from: b */
    public static HashMap<String, InterfaceC0826b> f3579b = new HashMap<>();

    /* renamed from: c */
    public static HashMap<String, AbstractC0827c> f3580c = new HashMap<>();

    /* renamed from: e */
    private static final Object f3582e = new Object();

    private C0838a() {
    }

    /* renamed from: a */
    public static InterfaceC0826b m4095a(String str) {
        if (f3579b.containsKey(str)) {
            return f3579b.get(str);
        }
        return null;
    }

    /* renamed from: a */
    public static C0838a m4096a() {
        if (f3581d == null) {
            synchronized (f3582e) {
                if (f3581d == null) {
                    f3581d = new C0838a();
                }
            }
        }
        return f3581d;
    }

    /* renamed from: a */
    public static void m4097a(String str, String str2) {
        C0841d.m4104a("DispacthManager", "addAction type:" + str + ",action:" + str2);
        if (TextUtils.isEmpty(str2)) {
            return;
        }
        if (!f3578a.containsKey(str)) {
            C0843f c0843f = new C0843f();
            C0831g.m4074a(str, C0843f.class.getCanonicalName());
            f3578a.put(str, c0843f);
        }
        if (f3579b.containsKey(str)) {
            return;
        }
        try {
            Object newInstance = Class.forName(str2).newInstance();
            if (newInstance instanceof InterfaceC0826b) {
                f3579b.put(str, (InterfaceC0826b) newInstance);
            }
        } catch (Throwable th) {
            C0841d.m4107d("DispacthManager", "#unexcepted - instance " + str2 + " class failed:" + th);
        }
    }

    /* renamed from: b */
    public static AbstractC0827c m4098b(String str) {
        if (f3580c.containsKey(str)) {
            return f3580c.get(str);
        }
        return null;
    }
}
