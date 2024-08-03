package p031c.p032a.p072p.p073a.p088g;

import android.text.TextUtils;
import android.view.View;
import org.json.JSONObject;
import p031c.p032a.p072p.p073a.p080f.C0770h;
import p031c.p032a.p072p.p073a.p080f.p081a.C0732b;
import p031c.p032a.p072p.p073a.p080f.p087g.C0766h;

/* renamed from: c.a.p.a.g.i */
/* loaded from: classes.dex */
public final class C0781i extends C0774b {

    /* renamed from: f */
    public boolean f3431f;

    /* renamed from: g */
    public boolean f3432g;

    /* renamed from: h */
    public String f3433h;

    /* renamed from: i */
    public String f3434i;

    public C0781i(View view, C0788p c0788p, String str, String str2) {
        this.f3433h = c0788p.f3454a;
        this.f3418a = str;
        this.f3420c = str2;
        this.f3432g = !TextUtils.isEmpty(str2);
        this.f3421d = C0770h.m3842b(view);
        if (this.f3421d == null) {
            this.f3421d = "";
        }
        this.f3434i = C0770h.m3835a(view, C0766h.m3816b(this.f3418a + "|" + this.f3421d));
    }

    @Override // p031c.p032a.p072p.p073a.p088g.C0774b
    /* renamed from: a */
    public final JSONObject mo3850a(String str) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject = super.mo3850a(str);
            if (jSONObject.has("event_id")) {
                jSONObject.remove("event_id");
            }
            if (jSONObject.has("track_type")) {
                jSONObject.remove("track_type");
            }
            if (!TextUtils.isEmpty(this.f3434i)) {
                jSONObject.put("img", str + this.f3434i);
            }
            if (this.f3432g) {
                jSONObject.put("in_item", true);
                if (!TextUtils.isEmpty(this.f3420c)) {
                    jSONObject.put("pos", this.f3420c);
                }
            }
            if (this.f3431f) {
                jSONObject.put("is_page", true);
            }
            jSONObject.put("view_name", this.f3433h);
        } catch (Throwable th) {
            C0732b.m3725h("BuryPoint", "pre bury json error:" + th.getMessage());
        }
        return jSONObject;
    }
}
