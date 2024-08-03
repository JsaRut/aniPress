package p031c.p101b.p102a.p103a;

import java.io.Serializable;
import org.json.JSONObject;
import p031c.p101b.p102a.p106d.C0899d;
import p031c.p101b.p102a.p114l.C0923b;

/* renamed from: c.b.a.a.e */
/* loaded from: classes.dex */
public class C0874e implements Serializable {

    /* renamed from: a */
    public String f3667a;

    /* renamed from: b */
    public long f3668b;

    /* renamed from: c */
    public String f3669c;

    /* renamed from: d */
    public boolean f3670d;

    /* renamed from: e */
    public long f3671e;

    /* renamed from: f */
    public double f3672f = 200.0d;

    /* renamed from: g */
    public double f3673g = 200.0d;

    /* renamed from: h */
    public String f3674h;

    /* renamed from: i */
    public int f3675i;

    /* renamed from: j */
    public String f3676j;

    /* renamed from: k */
    public String f3677k;

    /* renamed from: l */
    public int f3678l;

    /* renamed from: m */
    public int f3679m;

    /* renamed from: n */
    public int f3680n;

    /* renamed from: o */
    public long f3681o;

    /* renamed from: p */
    public String f3682p;

    /* renamed from: q */
    public int f3683q;

    /* renamed from: r */
    public String f3684r;

    /* renamed from: s */
    public int f3685s;

    /* renamed from: t */
    public C0899d f3686t;

    /* renamed from: a */
    public static C0874e m4276a(JSONObject jSONObject) {
        try {
            if (jSONObject == null) {
                C0923b.m4653i("Geofence", "geofence json is null");
                return null;
            }
            C0874e c0874e = new C0874e();
            C0923b.m4642a("Geofence", "geofence message:" + jSONObject.toString());
            c0874e.f3677k = jSONObject.optString("op");
            c0874e.f3667a = jSONObject.optString("geofenceid");
            c0874e.f3676j = jSONObject.optString("name");
            c0874e.f3668b = jSONObject.optLong("radius");
            c0874e.f3669c = jSONObject.optString("status");
            c0874e.f3670d = jSONObject.optBoolean("repeat");
            c0874e.f3678l = jSONObject.optInt("repeat_week_num");
            c0874e.f3679m = jSONObject.optInt("repeat_day_num");
            c0874e.f3680n = jSONObject.optInt("repeat_time");
            c0874e.f3671e = jSONObject.optLong("expiration");
            c0874e.f3675i = jSONObject.optInt("type", 1);
            JSONObject optJSONObject = jSONObject.optJSONObject("center");
            if (optJSONObject != null) {
                c0874e.f3672f = optJSONObject.optDouble("lon", 200.0d);
                c0874e.f3673g = optJSONObject.optDouble("lat", 200.0d);
            }
            return c0874e;
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: a */
    public void m4277a(C0874e c0874e) {
        this.f3674h = c0874e.f3674h;
        this.f3681o = c0874e.f3681o;
        this.f3682p = c0874e.f3682p;
        this.f3684r = c0874e.f3684r;
        this.f3683q = c0874e.f3683q;
        this.f3685s = c0874e.f3685s;
    }

    /* renamed from: b */
    public void m4278b(JSONObject jSONObject) {
        try {
            if (jSONObject.has("name")) {
                this.f3676j = jSONObject.optString("name");
            }
            long optLong = jSONObject.optLong("radius", -1L);
            if (optLong > 0) {
                this.f3668b = optLong;
            }
            if (jSONObject.has("status")) {
                this.f3669c = jSONObject.optString("status");
            }
            if (jSONObject.has("repeat")) {
                this.f3670d = jSONObject.optBoolean("repeat");
                if (this.f3670d) {
                    if (jSONObject.has("repeat_week_num")) {
                        this.f3678l = jSONObject.optInt("repeat_week_num");
                    }
                    if (jSONObject.has("repeat_day_num")) {
                        this.f3679m = jSONObject.optInt("repeat_day_num");
                    }
                    if (jSONObject.has("repeat_time")) {
                        this.f3680n = jSONObject.optInt("repeat_time");
                    }
                }
            }
            if (jSONObject.has("expiration")) {
                this.f3671e = jSONObject.optLong("expiration");
            }
            JSONObject optJSONObject = jSONObject.optJSONObject("center");
            if (optJSONObject != null) {
                double optDouble = optJSONObject.optDouble("lon", 200.0d);
                double optDouble2 = optJSONObject.optDouble("lat", 200.0d);
                if (optDouble >= -180.0d && optDouble <= 180.0d && optDouble2 >= -90.0d && optDouble2 <= 90.0d) {
                    this.f3672f = optDouble;
                    this.f3673g = optDouble2;
                    return;
                }
                C0923b.m4653i("Geofence", "update center failed because value invalid, [" + optDouble2 + "," + optDouble + "]");
            }
        } catch (Throwable unused) {
        }
    }
}
