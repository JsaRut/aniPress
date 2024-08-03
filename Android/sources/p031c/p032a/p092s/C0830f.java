package p031c.p032a.p092s;

import android.content.Context;
import android.os.Bundle;
import org.json.JSONObject;
import p031c.p032a.p094t.C0838a;
import p031c.p032a.p094t.C0839b;
import p031c.p032a.p094t.C0840c;
import p031c.p032a.p094t.C0841d;
import p031c.p032a.p094t.C0842e;

/* renamed from: c.a.s.f */
/* loaded from: classes.dex */
public class C0830f {

    /* renamed from: a */
    private static Context f3563a;

    /* renamed from: a */
    public static Bundle m4047a(Context context, int i, Bundle bundle) {
        if (context != null) {
            f3563a = context.getApplicationContext();
        }
        return C0839b.m4099a(context, i, bundle);
    }

    /* renamed from: a */
    public static String m4048a() {
        Object m4072a = C0831g.m4072a(f3563a, null, 7, null, null, new Object[0]);
        return m4072a instanceof String ? (String) m4072a : "";
    }

    /* renamed from: a */
    public static String m4049a(Context context) {
        Object m4072a = C0831g.m4072a(context, null, 8, null, null, new Object[0]);
        return m4072a instanceof String ? (String) m4072a : "";
    }

    /* renamed from: a */
    public static JSONObject m4050a(JSONObject jSONObject, String str) {
        Object m4072a = C0831g.m4072a(null, null, 26, null, null, jSONObject, str);
        if (m4072a instanceof JSONObject) {
            return (JSONObject) m4072a;
        }
        return null;
    }

    /* renamed from: a */
    public static void m4051a(Context context, String str, int i, byte[] bArr) {
        m4052a(context, str, 0, bArr, i, true);
    }

    /* renamed from: a */
    private static void m4052a(Context context, String str, int i, byte[] bArr, int i2, boolean z) {
        if (bArr != null) {
            try {
                if (bArr.length > 24) {
                    byte[] bArr2 = new byte[24];
                    byte[] bArr3 = new byte[bArr.length - 24];
                    System.arraycopy(bArr, 0, bArr2, 0, 24);
                    System.arraycopy(bArr, 24, bArr3, 0, bArr.length - 24);
                    C0840c c0840c = new C0840c(true, bArr2);
                    Bundle bundle = new Bundle();
                    bundle.putInt("cmd", c0840c.m4100a());
                    bundle.putInt("ver", c0840c.m4102c());
                    bundle.putLong("rid", c0840c.m4101b().longValue());
                    bundle.putLong("timeout", i2);
                    bundle.putByteArray("body", bArr3);
                    C0831g.m4072a(context, str, z ? 17 : 50, null, bundle, new Object[0]);
                }
            } catch (Throwable th) {
                C0841d.m4108e("JCoreInterface", "send failed:" + th.getMessage());
            }
        }
    }

    /* renamed from: a */
    public static void m4053a(Context context, String str, Bundle bundle) {
        if (bundle != null) {
            try {
                C0831g.m4072a(context, str, 3, bundle.getString("action"), bundle, new Object[0]);
            } catch (Throwable th) {
                C0841d.m4108e("JCoreInterface", "sendAction failed:" + th);
            }
        }
    }

    /* renamed from: a */
    public static void m4054a(Context context, JSONObject jSONObject, boolean z) {
        C0831g.m4072a(context, "JSupport", 14, null, null, jSONObject);
    }

    /* renamed from: a */
    public static void m4055a(InterfaceC0828d interfaceC0828d) {
        if (interfaceC0828d != null) {
            C0831g.m4073a(interfaceC0828d);
        }
    }

    /* renamed from: a */
    public static void m4056a(Runnable runnable, int... iArr) {
        C0831g.m4072a(null, null, 12, null, null, runnable);
    }

    /* renamed from: a */
    public static void m4057a(String str) {
        C0831g.m4072a(null, null, 13, str, null, new Object[0]);
    }

    /* renamed from: a */
    public static void m4058a(String str, Class<? extends InterfaceC0826b> cls) {
        C0838a.m4096a();
        C0838a.m4097a(str, cls.getName());
    }

    /* renamed from: a */
    public static void m4059a(String str, Runnable runnable, int... iArr) {
        C0831g.m4072a(null, null, 11, str, null, runnable);
    }

    /* renamed from: a */
    public static void m4060a(boolean z) {
        C0831g.m4077b(z);
    }

    /* renamed from: a */
    public static boolean m4061a(Context context, Object obj, String str) {
        C0831g.m4072a(context, str, 14, null, null, obj);
        return true;
    }

    /* renamed from: b */
    public static long m4062b() {
        return C0842e.m4111a(f3563a);
    }

    /* renamed from: b */
    public static void m4063b(Context context) {
        C0831g.m4082d(context);
    }

    /* renamed from: b */
    public static void m4064b(String str) {
        C0831g.m4072a(null, null, 22, str, null, new Object[0]);
    }

    /* renamed from: c */
    public static long m4065c() {
        Object m4072a = C0831g.m4072a(f3563a, null, 19, null, null, new Object[0]);
        return m4072a instanceof Long ? ((Long) m4072a).longValue() : System.currentTimeMillis() / 1000;
    }

    /* renamed from: c */
    public static void m4066c(Context context) {
        C0841d.m4105b("JCoreInterface", "Action - init registerOnly:");
        if (context != null) {
            f3563a = context;
        }
        C0831g.m4080c(context);
    }

    /* renamed from: d */
    public static int m4067d() {
        return 0;
    }

    /* renamed from: d */
    public static void m4068d(Context context) {
        C0831g.m4084f(context);
    }

    /* renamed from: e */
    public static long m4069e() {
        Object m4072a = C0831g.m4072a(f3563a, null, 20, null, null, new Object[0]);
        if (m4072a instanceof Long) {
            return ((Long) m4072a).longValue();
        }
        return 0L;
    }

    /* renamed from: f */
    public static boolean m4070f() {
        return C0831g.m4079b(f3563a);
    }
}
