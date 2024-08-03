package p031c.p101b.p102a.p114l;

import android.content.Context;
import android.os.Bundle;
import org.json.JSONObject;
import p031c.p032a.p092s.C0831g;

/* renamed from: c.b.a.l.a */
/* loaded from: classes.dex */
public class C0922a {
    /* renamed from: a */
    public static String m4630a(Context context) {
        Object m4072a = C0831g.m4072a(context, null, 7, null, null, new Object[0]);
        return m4072a instanceof String ? (String) m4072a : "";
    }

    /* renamed from: a */
    public static JSONObject m4631a(Context context, JSONObject jSONObject, String str) {
        Object m4072a = C0831g.m4072a(context, "JPUSH", 26, "", null, jSONObject, str);
        if (m4072a instanceof JSONObject) {
            return (JSONObject) m4072a;
        }
        return null;
    }

    /* renamed from: a */
    public static void m4632a(Context context, String str) {
        C0831g.m4072a(context, "JPUSH", 9, str, null, new Object[0]);
    }

    /* renamed from: a */
    public static void m4633a(Context context, String str, int i, int i2, long j, long j2, byte[] bArr) {
        m4634a(context, str, i, i2, j, j2, bArr, true);
    }

    /* renamed from: a */
    private static void m4634a(Context context, String str, int i, int i2, long j, long j2, byte[] bArr, boolean z) {
        Bundle bundle = new Bundle();
        bundle.putInt("cmd", i);
        bundle.putInt("ver", i2);
        bundle.putLong("rid", j);
        bundle.putLong("timeout", j2);
        bundle.putByteArray("body", bArr);
        C0831g.m4072a(context, str, z ? 17 : 16, null, bundle, new Object[0]);
    }

    /* renamed from: a */
    public static void m4635a(Context context, String str, int i, int i2, long j, byte[] bArr) {
        m4634a(context, str, i, i2, j, 0L, bArr, false);
    }

    /* renamed from: a */
    public static void m4636a(Context context, String str, Object obj) {
        C0831g.m4072a(context, "JPUSH", 56, str, null, obj);
    }

    /* renamed from: a */
    public static void m4637a(Context context, String str, String str2, Bundle bundle) {
        C0831g.m4072a(context, str, 3, str2, bundle, new Object[0]);
    }

    /* renamed from: b */
    public static String m4638b(Context context) {
        Object m4072a = C0831g.m4072a(context, null, 8, null, null, new Object[0]);
        return m4072a instanceof String ? (String) m4072a : "";
    }

    /* renamed from: c */
    public static String m4639c(Context context) {
        Object m4072a = C0831g.m4072a(context, "JPUSH", 4, null, null, new Object[0]);
        return m4072a instanceof String ? (String) m4072a : "";
    }

    /* renamed from: d */
    public static void m4640d(Context context) {
        C0831g.m4072a(context, "JPUSH", 29, null, null, 3);
    }
}
