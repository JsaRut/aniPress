package p031c.p032a.p072p.p073a.p080f.p087g;

import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p031c.p032a.p072p.p073a.p080f.p081a.C0732b;

/* renamed from: c.a.p.a.f.g.e */
/* loaded from: classes.dex */
public final class C0763e {
    /* renamed from: a */
    public static JSONObject m3807a(Map map) {
        if (map == null) {
            return null;
        }
        JSONObject jSONObject = new JSONObject();
        for (Map.Entry entry : map.entrySet()) {
            try {
                jSONObject.put((String) entry.getKey(), entry.getValue());
            } catch (JSONException e2) {
                C0732b.m3719b("JsonObjectUtil", "There was an error packaging JSON", e2);
            }
        }
        return jSONObject;
    }

    /* renamed from: a */
    public static JSONObject m3808a(JSONObject jSONObject, Map map) {
        if (map == null) {
            return null;
        }
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        for (Map.Entry entry : map.entrySet()) {
            try {
                if (jSONObject.has((String) entry.getKey())) {
                    C0732b.m3724g("JsonObjectUtil", "the extra map has same key with janalytics :" + entry.getKey());
                } else {
                    jSONObject.put((String) entry.getKey(), entry.getValue());
                }
            } catch (JSONException e2) {
                C0732b.m3719b("JsonObjectUtil", "There was an error packaging JSON", e2);
            }
        }
        return jSONObject;
    }

    /* renamed from: a */
    public static boolean m3809a(Object obj) {
        if (obj == null) {
            return true;
        }
        if (obj instanceof JSONArray) {
            return ((JSONArray) obj).length() <= 0;
        }
        if (obj instanceof JSONObject) {
            return obj.toString().equals("{}");
        }
        return false;
    }
}
