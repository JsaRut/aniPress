package p031c.p032a.p036D;

import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: c.a.D.b */
/* loaded from: classes.dex */
public final class C0521b {

    /* renamed from: a */
    public String f2610a;

    /* renamed from: b */
    public String f2611b;

    /* renamed from: c */
    public String f2612c;

    /* renamed from: d */
    public String f2613d;

    /* renamed from: a */
    public final JSONObject m2735a(int i) {
        try {
            JSONObject put = new JSONObject().put("uid", this.f2610a).put("pid", this.f2611b).put("ppid", this.f2612c);
            CharSequence charSequence = this.f2613d;
            if (128 < charSequence.length()) {
                charSequence = charSequence.subSequence(0, 128);
            }
            return put.put("proc_name", charSequence);
        } catch (JSONException unused) {
            return null;
        }
    }
}
