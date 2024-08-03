package p031c.p032a.p063g;

import android.text.TextUtils;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: c.a.g.d */
/* loaded from: classes.dex */
public final class C0622d {

    /* renamed from: a */
    final C0626h f2913a;

    /* renamed from: b */
    int f2914b;

    /* renamed from: c */
    long f2915c;

    /* renamed from: d */
    long f2916d;

    /* renamed from: e */
    int f2917e;

    public C0622d(C0626h c0626h) {
        this.f2913a = c0626h;
    }

    /* renamed from: a */
    public static C0622d m3206a(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            C0622d c0622d = new C0622d(new C0626h(jSONObject.getString("ip"), jSONObject.getInt("port")));
            c0622d.f2914b = jSONObject.optInt("status");
            c0622d.f2915c = jSONObject.optLong("fetch_time");
            c0622d.f2916d = jSONObject.optLong("cost");
            c0622d.f2917e = jSONObject.optInt("prefer");
            return c0622d;
        } catch (JSONException unused) {
            return null;
        }
    }

    /* renamed from: a */
    public final String m3207a() {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("ip", this.f2913a.f2922a);
            jSONObject.put("port", this.f2913a.f2923b);
            jSONObject.put("status", this.f2914b);
            jSONObject.put("fetch_time", this.f2915c);
            jSONObject.put("cost", this.f2916d);
            jSONObject.put("prefer", this.f2917e);
            return jSONObject.toString();
        } catch (JSONException unused) {
            return null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0622d)) {
            return false;
        }
        C0622d c0622d = (C0622d) obj;
        if (this.f2914b != c0622d.f2914b || this.f2915c != c0622d.f2915c || this.f2916d != c0622d.f2916d || this.f2917e != c0622d.f2917e) {
            return false;
        }
        C0626h c0626h = this.f2913a;
        return c0626h != null ? c0626h.equals(c0622d.f2913a) : c0622d.f2913a == null;
    }

    public final int hashCode() {
        C0626h c0626h = this.f2913a;
        int hashCode = (((c0626h != null ? c0626h.hashCode() : 0) * 31) + this.f2914b) * 31;
        long j = this.f2915c;
        int i = (hashCode + ((int) (j ^ (j >>> 32)))) * 31;
        long j2 = this.f2916d;
        return ((i + ((int) (j2 ^ (j2 >>> 32)))) * 31) + this.f2917e;
    }

    public final String toString() {
        return "IpInfo{ipPort=" + this.f2913a + ", status=" + this.f2914b + ", fetchTime=" + this.f2915c + ", cost=" + this.f2916d + ", prefer=" + this.f2917e + '}';
    }
}
