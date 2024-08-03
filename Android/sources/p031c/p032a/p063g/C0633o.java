package p031c.p032a.p063g;

import android.text.TextUtils;
import java.util.LinkedList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: c.a.g.o */
/* loaded from: classes.dex */
public final class C0633o {

    /* renamed from: a */
    public String f2953a;

    /* renamed from: b */
    public int f2954b;

    /* renamed from: c */
    public C0626h f2955c;

    /* renamed from: d */
    public long f2956d;

    /* renamed from: e */
    public long f2957e;

    /* renamed from: f */
    public long f2958f;

    /* renamed from: g */
    public int f2959g;

    /* renamed from: h */
    public double f2960h;

    /* renamed from: i */
    public double f2961i;

    /* renamed from: j */
    public long f2962j;

    /* renamed from: k */
    public int f2963k;

    /* renamed from: a */
    private static C0633o m3250a(JSONObject jSONObject) {
        if (jSONObject != null && jSONObject.length() != 0) {
            try {
                C0633o c0633o = new C0633o();
                c0633o.f2953a = jSONObject.optString("appkey");
                c0633o.f2954b = jSONObject.getInt("type");
                c0633o.f2955c = C0626h.m3216a(jSONObject.getString("addr"));
                c0633o.f2957e = jSONObject.getLong("rtime");
                c0633o.f2958f = jSONObject.getLong("interval");
                c0633o.f2959g = jSONObject.getInt("net");
                c0633o.f2963k = jSONObject.getInt("code");
                c0633o.f2956d = jSONObject.optLong("uid");
                c0633o.f2960h = jSONObject.optDouble("lat");
                c0633o.f2961i = jSONObject.optDouble("lng");
                c0633o.f2962j = jSONObject.optLong("ltime");
                return c0633o;
            } catch (JSONException e2) {
                e2.printStackTrace();
            }
        }
        return null;
    }

    /* renamed from: a */
    public static LinkedList<C0633o> m3251a(String str) {
        LinkedList<C0633o> linkedList = new LinkedList<>();
        if (!TextUtils.isEmpty(str)) {
            try {
                JSONArray jSONArray = new JSONArray(str);
                for (int i = 0; i < jSONArray.length(); i++) {
                    linkedList.add(m3250a(jSONArray.getJSONObject(i)));
                }
            } catch (JSONException unused) {
            }
        }
        return linkedList;
    }

    /* renamed from: a */
    public final JSONObject m3252a() {
        JSONObject jSONObject = new JSONObject();
        try {
            if (!TextUtils.isEmpty(this.f2953a)) {
                jSONObject.put("appkey", this.f2953a);
            }
            jSONObject.put("type", this.f2954b);
            jSONObject.put("addr", this.f2955c.toString());
            jSONObject.put("rtime", this.f2957e);
            jSONObject.put("interval", this.f2958f);
            jSONObject.put("net", this.f2959g);
            jSONObject.put("code", this.f2963k);
            if (this.f2956d != 0) {
                jSONObject.put("uid", this.f2956d);
            }
            double d2 = this.f2960h;
            double d3 = this.f2961i;
            if (d2 > -90.0d && d2 < 90.0d && d3 > -180.0d && d3 < 180.0d) {
                jSONObject.put("lat", this.f2960h);
                jSONObject.put("lng", this.f2961i);
                jSONObject.put("ltime", this.f2962j);
            }
        } catch (JSONException e2) {
            e2.printStackTrace();
        }
        return jSONObject;
    }
}
