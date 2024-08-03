package p031c.p101b.p102a.p109g;

import android.text.TextUtils;
import java.io.Serializable;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: c.b.a.g.a */
/* loaded from: classes.dex */
public class C0904a implements Serializable {

    /* renamed from: f */
    private String f3876f;

    /* renamed from: g */
    private String f3877g;

    /* renamed from: h */
    private String f3878h;

    /* renamed from: i */
    private long f3879i;

    /* renamed from: a */
    private int f3871a = 1;

    /* renamed from: b */
    private String f3872b = "";

    /* renamed from: c */
    private String f3873c = "00";

    /* renamed from: d */
    private String f3874d = "00";

    /* renamed from: e */
    private long f3875e = 0;

    /* renamed from: j */
    private long f3880j = 1;

    /* renamed from: k */
    private int f3881k = 1;

    /* renamed from: l */
    private String f3882l = "";

    /* renamed from: m */
    private String f3883m = "";

    /* renamed from: a */
    private void m4473a(String str, String str2, JSONObject jSONObject) {
        if (TextUtils.isEmpty(str2)) {
            return;
        }
        jSONObject.put(str, str2);
    }

    /* renamed from: a */
    public void m4474a(long j) {
        this.f3875e = j;
    }

    /* renamed from: a */
    public void m4475a(String str) {
        this.f3876f = str;
    }

    /* renamed from: b */
    public long m4476b() {
        return this.f3875e;
    }

    /* renamed from: b */
    public void m4477b(long j) {
        this.f3879i = j;
    }

    /* renamed from: b */
    public void m4478b(String str) {
        this.f3878h = str;
    }

    /* renamed from: c */
    public long m4479c() {
        return this.f3880j;
    }

    /* renamed from: c */
    public void m4480c(long j) {
        this.f3880j = (int) j;
    }

    /* renamed from: c */
    public void m4481c(String str) {
        this.f3877g = str;
    }

    /* renamed from: d */
    public String m4482d() {
        JSONObject jSONObject = new JSONObject();
        try {
            JSONObject jSONObject2 = new JSONObject();
            if (!TextUtils.isEmpty(this.f3878h)) {
                jSONObject2.put("n_extras", new JSONObject(this.f3878h));
            }
            m4473a("n_content", this.f3876f, jSONObject2);
            m4473a("n_title", this.f3877g, jSONObject2);
            m4473a("n_content", this.f3876f, jSONObject2);
            jSONObject2.put("ad_t", 0);
            jSONObject.put("m_content", jSONObject2);
            m4473a("msg_id", "" + this.f3880j, jSONObject);
            m4473a("content_type", this.f3883m, jSONObject);
            m4473a("override_msg_id", this.f3882l, jSONObject);
            jSONObject.put("n_only", this.f3881k);
            jSONObject.put("n_builder_id", this.f3879i);
            jSONObject.put("show_type", 3);
            jSONObject.put("notificaion_type", 1);
        } catch (JSONException e2) {
            e2.printStackTrace();
        }
        return jSONObject.toString();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && C0904a.class == obj.getClass() && this.f3880j == ((C0904a) obj).f3880j;
    }

    public int hashCode() {
        long j = this.f3880j;
        return (int) (j ^ (j >>> 32));
    }
}
