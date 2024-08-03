package p031c.p032a.p063g;

import java.util.Iterator;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: c.a.g.p */
/* loaded from: classes.dex */
public final class C0634p {

    /* renamed from: a */
    public int f2964a;

    /* renamed from: b */
    public String f2965b;

    /* renamed from: c */
    public String f2966c;

    /* renamed from: d */
    public long f2967d;

    /* renamed from: e */
    public String f2968e;

    /* renamed from: f */
    public double f2969f;

    /* renamed from: g */
    public double f2970g;

    /* renamed from: h */
    public long f2971h;

    /* renamed from: i */
    private int f2972i = 0;

    /* renamed from: j */
    private int f2973j = 0;

    public C0634p(int i, String str, String str2, long j, String str3, double d2, double d3, long j2) {
        this.f2964a = i;
        this.f2965b = str;
        this.f2966c = str2;
        this.f2967d = j;
        this.f2968e = str3;
        this.f2969f = d2;
        this.f2970g = d3;
        this.f2971h = j2;
    }

    /* renamed from: a */
    public final JSONObject m3253a(Set<String> set) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("type", this.f2964a);
            jSONObject.put("appkey", this.f2965b);
            jSONObject.put("sdkver", this.f2966c);
            boolean z = false;
            jSONObject.put("platform", 0);
            if (this.f2967d != 0) {
                jSONObject.put("uid", this.f2967d);
            }
            if (this.f2968e != null) {
                jSONObject.put("opera", this.f2968e);
            }
            double d2 = this.f2969f;
            double d3 = this.f2970g;
            if (d2 > -90.0d && d2 < 90.0d && d3 > -180.0d && d3 < 180.0d) {
                z = true;
            }
            if (z) {
                jSONObject.put("lat", this.f2969f);
                jSONObject.put("lng", this.f2970g);
                jSONObject.put("time", this.f2971h);
            }
            if (set != null && !set.isEmpty()) {
                JSONArray jSONArray = new JSONArray();
                Iterator<String> it = set.iterator();
                while (it.hasNext()) {
                    jSONArray.put(it.next());
                }
                jSONObject.put("fail_ips", jSONArray);
            }
            if (this.f2972i != 0) {
                jSONObject.put("ips_flag", this.f2972i);
            }
            if (this.f2973j != 0) {
                jSONObject.put("report_flag", this.f2973j);
            }
        } catch (JSONException e2) {
            e2.printStackTrace();
        }
        return jSONObject;
    }
}
