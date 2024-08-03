package p031c.p032a.p072p.p073a.p079e;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: c.a.p.a.e.a */
/* loaded from: classes.dex */
public final class C0729a {
    /* renamed from: a */
    public static String m3700a(JSONObject jSONObject) {
        try {
            return jSONObject.toString(2);
        } catch (JSONException unused) {
            return jSONObject.toString();
        }
    }

    /* renamed from: a */
    public static JSONArray m3701a(JSONArray jSONArray, JSONArray jSONArray2) {
        if (jSONArray == null) {
            jSONArray = new JSONArray();
        }
        if (jSONArray2 != null && jSONArray2.length() != 0) {
            for (int i = 0; i < jSONArray2.length(); i++) {
                try {
                    jSONArray.put(jSONArray2.get(i));
                } catch (JSONException unused) {
                }
            }
        }
        return jSONArray;
    }

    /* renamed from: a */
    public static JSONArray m3702a(Object[] objArr) {
        if (objArr == null || objArr.length == 0) {
            return null;
        }
        JSONArray jSONArray = new JSONArray();
        for (Object obj : objArr) {
            jSONArray.put(obj);
        }
        return jSONArray;
    }
}
