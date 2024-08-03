package p031c.p032a.p072p.p073a.p088g;

import android.text.TextUtils;
import android.util.Pair;
import java.io.Serializable;
import org.json.JSONObject;
import p031c.p032a.p072p.p073a.p080f.C0770h;
import p031c.p032a.p072p.p073a.p080f.p081a.C0732b;

/* renamed from: c.a.p.a.g.b */
/* loaded from: classes.dex */
public class C0774b implements Serializable {

    /* renamed from: a */
    public String f3418a;

    /* renamed from: b */
    protected int f3419b;

    /* renamed from: c */
    public String f3420c;

    /* renamed from: d */
    public String f3421d;

    /* renamed from: e */
    public String f3422e;

    public C0774b() {
        this.f3419b = 1;
        this.f3422e = "";
    }

    public C0774b(JSONObject jSONObject) {
        this.f3419b = 1;
        this.f3422e = "";
        try {
            this.f3418a = jSONObject.getString("view_path");
            this.f3419b = jSONObject.optInt("track_type", 1);
            this.f3420c = jSONObject.optString("pos");
            this.f3421d = C0770h.m3836a(jSONObject.optString("text"));
            this.f3422e = jSONObject.optString("event_id");
        } catch (Throwable th) {
            C0732b.m3725h("BuryPoint", "json error:" + th.getMessage());
        }
    }

    /* renamed from: a */
    private static boolean m3848a(int i, int i2) {
        return (i & i2) == i2;
    }

    /* renamed from: b */
    private static Pair<String, String> m3849b(String str) {
        if (TextUtils.isEmpty(str)) {
            return new Pair<>("", "");
        }
        int lastIndexOf = str.lastIndexOf(",");
        if (lastIndexOf == -1) {
            return new Pair<>("", str);
        }
        int i = lastIndexOf + 1;
        return new Pair<>(str.substring(0, lastIndexOf), i < str.length() ? str.substring(i) : "");
    }

    /* renamed from: a */
    public JSONObject mo3850a(String str) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("track_type", this.f3419b);
            jSONObject.put("view_path", this.f3418a);
            if (!TextUtils.isEmpty(this.f3421d)) {
                jSONObject.put("text", this.f3421d);
            }
            if (!TextUtils.isEmpty(this.f3420c)) {
                jSONObject.put("pos", this.f3420c);
            }
            if (this.f3422e == null) {
                this.f3422e = "";
            }
            jSONObject.put("event_id", this.f3422e);
        } catch (Throwable th) {
            C0732b.m3725h("BuryPoint", "bury json error:" + th.getMessage());
        }
        return jSONObject;
    }

    /* renamed from: a */
    public final boolean m3851a(String str, String str2, boolean z) {
        try {
            Pair<String, String> m3849b = m3849b(this.f3420c);
            Pair<String, String> m3849b2 = m3849b(str);
            if (!((String) m3849b.first).equals(m3849b2.first)) {
                return false;
            }
            if (z && !m3848a(this.f3419b, 2) && !((String) m3849b.second).equals(m3849b2.second)) {
                return false;
            }
            if (z && !m3848a(this.f3419b, 1)) {
                if (TextUtils.isEmpty(this.f3421d)) {
                    if (!TextUtils.isEmpty(str2)) {
                        return false;
                    }
                } else if (!this.f3421d.equals(str2)) {
                    return false;
                }
            }
            return true;
        } catch (Throwable th) {
            C0732b.m3725h("BuryPoint", "hit e:" + th);
            return false;
        }
    }
}
