package p031c.p032a.p072p.p073a.p080f;

import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;
import p031c.p032a.p072p.p073a.p080f.p081a.C0732b;
import p031c.p032a.p072p.p073a.p088g.C0781i;

/* renamed from: c.a.p.a.f.b */
/* loaded from: classes.dex */
public final class C0733b {

    /* renamed from: a */
    public C0781i f3318a;

    /* renamed from: b */
    public C0781i f3319b;

    /* renamed from: c */
    public List<C0781i> f3320c;

    public C0733b(C0781i c0781i, C0781i c0781i2, List<C0781i> list) {
        this.f3318a = c0781i;
        this.f3319b = c0781i2;
        this.f3320c = list;
    }

    /* renamed from: a */
    public final JSONObject m3727a(String str) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("page", this.f3318a.mo3850a(str));
            if (this.f3319b != null) {
                jSONObject.put("view", this.f3319b.mo3850a(str));
            }
            if (this.f3320c != null && this.f3320c.size() > 0) {
                JSONArray jSONArray = new JSONArray();
                Iterator<C0781i> it = this.f3320c.iterator();
                while (it.hasNext()) {
                    jSONArray.put(it.next().mo3850a(str));
                }
                jSONObject.put("inside_views", jSONArray);
            }
        } catch (Throwable th) {
            C0732b.m3725h("BuryInfos", "toBuryActionJson err:" + th.getMessage());
        }
        return jSONObject;
    }
}
