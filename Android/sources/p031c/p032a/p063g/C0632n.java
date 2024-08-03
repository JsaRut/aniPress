package p031c.p032a.p063g;

import android.text.TextUtils;
import java.util.LinkedHashSet;
import org.json.JSONArray;
import org.json.JSONObject;
import p031c.p032a.p066j.C0675a;

/* renamed from: c.a.g.n */
/* loaded from: classes.dex */
public final class C0632n {

    /* renamed from: a */
    LinkedHashSet<C0626h> f2945a;

    /* renamed from: b */
    LinkedHashSet<C0626h> f2946b;

    /* renamed from: c */
    LinkedHashSet<C0626h> f2947c;

    /* renamed from: d */
    LinkedHashSet<C0626h> f2948d;

    /* renamed from: e */
    LinkedHashSet<C0626h> f2949e;

    /* renamed from: f */
    JSONObject f2950f;

    /* renamed from: g */
    transient C0626h f2951g;

    /* renamed from: h */
    boolean f2952h;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0632n(String str) {
        try {
            if (TextUtils.isEmpty(str)) {
                return;
            }
            JSONObject jSONObject = new JSONObject(str);
            this.f2945a = m3248a(jSONObject, "ips");
            this.f2946b = m3248a(jSONObject, "ssl_ips");
            this.f2947c = m3248a(jSONObject, "http_report");
            this.f2948d = m3248a(jSONObject, "https_report");
            this.f2949e = m3248a(jSONObject, "sis_ips");
            this.f2952h = jSONObject.optBoolean("data_report");
            this.f2950f = jSONObject.optJSONObject("tcp_report");
            C0675a.m3469c("sis", "get sis=" + jSONObject.toString(2));
        } catch (Throwable unused) {
        }
    }

    /* renamed from: a */
    private static LinkedHashSet<C0626h> m3248a(JSONObject jSONObject, String str) {
        LinkedHashSet<C0626h> linkedHashSet = new LinkedHashSet<>();
        try {
            JSONArray optJSONArray = jSONObject.optJSONArray(str);
            if (optJSONArray != null) {
                for (int i = 0; i < optJSONArray.length(); i++) {
                    C0626h m3216a = C0626h.m3216a(optJSONArray.optString(i, null));
                    if (m3216a != null && m3216a.m3221a()) {
                        linkedHashSet.add(m3216a);
                    }
                }
            }
        } catch (Throwable unused) {
        }
        return linkedHashSet;
    }

    /* renamed from: a */
    public final boolean m3249a() {
        LinkedHashSet<C0626h> linkedHashSet = this.f2945a;
        if (linkedHashSet != null && !linkedHashSet.isEmpty()) {
            return false;
        }
        LinkedHashSet<C0626h> linkedHashSet2 = this.f2946b;
        return linkedHashSet2 == null || linkedHashSet2.isEmpty();
    }
}
