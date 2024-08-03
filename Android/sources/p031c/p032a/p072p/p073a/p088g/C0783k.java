package p031c.p032a.p072p.p073a.p088g;

import android.text.TextUtils;
import java.util.Arrays;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p031c.p032a.p072p.p073a.p079e.C0729a;
import p031c.p032a.p072p.p073a.p080f.C0770h;

/* renamed from: c.a.p.a.g.k */
/* loaded from: classes.dex */
public final class C0783k {

    /* renamed from: a */
    final String f3438a;

    /* renamed from: b */
    final Integer[] f3439b;

    /* renamed from: c */
    final String f3440c;

    /* renamed from: d */
    final String f3441d;

    public C0783k(String str, Integer[] numArr, String str2, String str3) {
        this.f3438a = str;
        this.f3439b = numArr;
        this.f3440c = str2;
        this.f3441d = str3;
    }

    /* renamed from: a */
    public static C0783k m3875a(JSONObject jSONObject) {
        try {
            String string = jSONObject.getString("view_path");
            JSONArray jSONArray = jSONObject.getJSONArray("track_types");
            Integer[] numArr = new Integer[jSONArray.length()];
            for (int i = 0; i < jSONArray.length(); i++) {
                numArr[i] = Integer.valueOf(jSONArray.getInt(i));
            }
            return new C0783k(string, numArr, jSONObject.optString("pos"), C0770h.m3836a(jSONObject.optString("text")));
        } catch (JSONException unused) {
            return null;
        }
    }

    /* renamed from: a */
    public final JSONObject m3876a() {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("view_path", this.f3438a);
            jSONObject.put("track_types", C0729a.m3702a(this.f3439b));
            if (!TextUtils.isEmpty(this.f3440c)) {
                jSONObject.put("pos", this.f3440c);
            }
            if (!TextUtils.isEmpty(this.f3441d)) {
                jSONObject.put("text", this.f3441d);
            }
            return jSONObject;
        } catch (JSONException unused) {
            return null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0783k)) {
            return false;
        }
        C0783k c0783k = (C0783k) obj;
        if (!this.f3438a.equals(c0783k.f3438a) || !Arrays.equals(this.f3439b, c0783k.f3439b)) {
            return false;
        }
        String str = this.f3440c;
        if (str == null ? c0783k.f3440c != null : !str.equals(c0783k.f3440c)) {
            return false;
        }
        String str2 = this.f3441d;
        return str2 != null ? str2.equals(c0783k.f3441d) : c0783k.f3441d == null;
    }

    public final int hashCode() {
        int hashCode = ((this.f3438a.hashCode() * 31) + Arrays.hashCode(this.f3439b)) * 31;
        String str = this.f3440c;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f3441d;
        return hashCode2 + (str2 != null ? str2.hashCode() : 0);
    }
}
