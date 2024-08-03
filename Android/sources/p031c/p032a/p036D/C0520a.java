package p031c.p032a.p036D;

import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: c.a.D.a */
/* loaded from: classes.dex */
public final class C0520a {

    /* renamed from: a */
    public String f2605a;

    /* renamed from: b */
    public String f2606b;

    /* renamed from: c */
    public String f2607c;

    /* renamed from: d */
    public int f2608d;

    /* renamed from: e */
    public int f2609e;

    /* renamed from: a */
    public final JSONObject m2734a(int i) {
        try {
            JSONObject put = new JSONObject().put("name", this.f2605a);
            CharSequence charSequence = this.f2606b;
            if (128 < charSequence.length()) {
                charSequence = charSequence.subSequence(0, 128);
            }
            return put.put("pkg", charSequence).put("ver_name", this.f2607c).put("ver_code", this.f2608d).put("install_type", this.f2609e);
        } catch (JSONException unused) {
            return null;
        }
    }
}
