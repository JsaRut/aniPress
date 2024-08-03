package p031c.p032a.p096v;

import java.util.Iterator;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: c.a.v.h */
/* loaded from: classes.dex */
public final class C0852h {
    /* renamed from: a */
    public static String m4145a(JSONObject jSONObject) {
        if (jSONObject == null) {
            return "null";
        }
        try {
            return jSONObject.toString(2);
        } catch (JSONException unused) {
            return jSONObject.toString();
        }
    }

    /* renamed from: a */
    public static JSONObject m4146a(JSONObject jSONObject, Set<String> set) {
        JSONObject jSONObject2 = new JSONObject();
        if (set != null && !set.isEmpty()) {
            for (String str : set) {
                try {
                    jSONObject2.put(str, jSONObject.opt(str));
                } catch (JSONException unused) {
                }
            }
        }
        return jSONObject2;
    }

    /* renamed from: a */
    public static void m4147a(JSONObject jSONObject, JSONObject jSONObject2) {
        if (jSONObject2 == null || jSONObject2.length() == 0 || jSONObject == null) {
            return;
        }
        Iterator<String> keys = jSONObject2.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            try {
                jSONObject.put(next, jSONObject2.get(next));
            } catch (JSONException unused) {
            }
        }
    }

    /* renamed from: b */
    public static int m4148b(JSONObject jSONObject) {
        if (jSONObject != null && jSONObject.length() != 0) {
            try {
                return C0854j.m4168h(jSONObject.toString()).length;
            } catch (Throwable unused) {
            }
        }
        return 0;
    }
}
