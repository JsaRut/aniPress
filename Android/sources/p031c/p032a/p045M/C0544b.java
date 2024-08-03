package p031c.p032a.p045M;

import android.text.TextUtils;
import org.json.JSONObject;

/* renamed from: c.a.M.b */
/* loaded from: classes.dex */
public final class C0544b {

    /* renamed from: a */
    public String f2683a;

    /* renamed from: b */
    public String f2684b;

    /* renamed from: c */
    public String f2685c;

    /* renamed from: a */
    public final JSONObject m2822a() {
        JSONObject jSONObject = new JSONObject();
        try {
            String str = "";
            jSONObject.put("imei", TextUtils.isEmpty(this.f2683a) ? "" : this.f2683a);
            jSONObject.put("iccid", TextUtils.isEmpty(this.f2685c) ? "" : this.f2685c);
            if (!TextUtils.isEmpty(this.f2684b)) {
                str = this.f2684b;
            }
            jSONObject.put("imsi", str);
            return jSONObject;
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: b */
    public final boolean m2823b() {
        return TextUtils.isEmpty(this.f2683a) && TextUtils.isEmpty(this.f2684b);
    }

    public final String toString() {
        return "JDeviceSimInfo{imei='" + this.f2683a + "', imsi='" + this.f2684b + "', iccid='" + this.f2685c + "'}";
    }
}
