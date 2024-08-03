package p031c.p032a.p058b;

import android.content.Context;
import android.text.TextUtils;
import com.facebook.react.modules.appstate.AppStateModule;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p031c.p032a.p047O.C0552b;
import p031c.p032a.p048P.p049a.C0557c;
import p031c.p032a.p056W.C0581b;
import p031c.p032a.p056W.C0582c;
import p031c.p032a.p066j.C0675a;

/* renamed from: c.a.b.d */
/* loaded from: classes.dex */
public final class C0589d {
    /* renamed from: a */
    public static List<C0582c> m3008a(String str, String str2, String str3, int i) {
        List<C0582c> list;
        C0582c c0582c = new C0582c();
        c0582c.f2789a = str2;
        c0582c.f2790b = str3;
        c0582c.f2791c = i;
        if (str == null || TextUtils.isEmpty(str)) {
            list = null;
        } else {
            list = C0588c.m3004a(str);
            C0675a.m3469c("JWakePackageHelper", "cache cmd wakeTargets:" + list);
        }
        boolean z = true;
        if (list == null) {
            list = new ArrayList<>();
        } else {
            for (C0582c c0582c2 : list) {
                if (c0582c2.f2789a.equals(str2)) {
                    c0582c2.f2790b = str3;
                    c0582c2.f2791c = i;
                    z = false;
                }
            }
        }
        if (z) {
            list.add(c0582c);
        }
        return list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: a */
    public static JSONArray m3009a(Context context, JSONArray jSONArray) {
        HashMap hashMap;
        Integer valueOf;
        int i;
        if (jSONArray != null) {
            try {
                if (jSONArray.length() > 0) {
                    HashMap hashMap2 = new HashMap();
                    HashMap hashMap3 = new HashMap();
                    for (int i2 = 0; i2 < jSONArray.length(); i2++) {
                        JSONObject jSONObject = jSONArray.getJSONObject(i2);
                        String optString = jSONObject.optString("type");
                        if ("android_awake2".equals(optString)) {
                            JSONArray optJSONArray = jSONObject.optJSONArray("target");
                            if (optJSONArray == null || optJSONArray.length() <= 0) {
                                break;
                            }
                            for (int i3 = 0; i3 < optJSONArray.length(); i3++) {
                                JSONObject optJSONObject = optJSONArray.optJSONObject(i3);
                                String optString2 = optJSONObject.optString("package");
                                int optInt = optJSONObject.optInt("count");
                                hashMap2.put(optString2, hashMap2.containsKey(optString2) ? Integer.valueOf(((Integer) hashMap2.get(optString2)).intValue() + optInt) : Integer.valueOf(optInt));
                            }
                        } else if ("android_awake_target2".equals(optString)) {
                            String optString3 = jSONObject.optString("package");
                            String str = jSONObject.optBoolean("app_alive") ? AppStateModule.APP_STATE_ACTIVE : "dead";
                            int optInt2 = jSONObject.optInt("wake_type");
                            if (hashMap3.containsKey(optString3)) {
                                Map map = (Map) hashMap3.get(optString3);
                                if (map.containsKey(str)) {
                                    Map map2 = (Map) map.get(str);
                                    if (map2.containsKey(Integer.valueOf(optInt2))) {
                                        i = Integer.valueOf(((Integer) map2.get(Integer.valueOf(optInt2))).intValue() + 1);
                                        valueOf = Integer.valueOf(optInt2);
                                    } else {
                                        valueOf = Integer.valueOf(optInt2);
                                        i = 1;
                                    }
                                    map2.put(valueOf, i);
                                    hashMap = map2;
                                } else {
                                    HashMap hashMap4 = new HashMap();
                                    hashMap4.put(Integer.valueOf(optInt2), 1);
                                    hashMap = hashMap4;
                                }
                                map.put(str, hashMap);
                                hashMap3.put(optString3, map);
                            } else {
                                HashMap hashMap5 = new HashMap();
                                hashMap5.put(Integer.valueOf(optInt2), 1);
                                HashMap hashMap6 = new HashMap();
                                hashMap6.put(str, hashMap5);
                                hashMap3.put(optString3, hashMap6);
                            }
                        } else {
                            C0675a.m3475g("JWakePackageHelper", "unkown type :" + optString);
                        }
                    }
                    JSONArray jSONArray2 = new JSONArray();
                    JSONArray jSONArray3 = new JSONArray();
                    for (Map.Entry entry : hashMap2.entrySet()) {
                        JSONObject jSONObject2 = new JSONObject();
                        jSONObject2.put("package", entry.getKey());
                        jSONObject2.put("count", entry.getValue());
                        jSONArray3.put(jSONObject2);
                    }
                    if (jSONArray3.length() > 0) {
                        JSONObject jSONObject3 = new JSONObject();
                        jSONObject3.put("target", jSONArray3);
                        jSONObject3.put("itime", C0557c.m2916j(context));
                        jSONObject3.put("type", "android_awake2");
                        jSONArray2.put(jSONObject3);
                    }
                    JSONObject jSONObject4 = new JSONObject();
                    JSONArray jSONArray4 = new JSONArray();
                    Iterator it = hashMap3.entrySet().iterator();
                    while (it.hasNext()) {
                        Map.Entry entry2 = (Map.Entry) it.next();
                        JSONObject jSONObject5 = new JSONObject();
                        jSONObject5.put("package", entry2.getKey());
                        Iterator it2 = ((Map) entry2.getValue()).entrySet().iterator();
                        while (it2.hasNext()) {
                            JSONArray jSONArray5 = new JSONArray();
                            Map.Entry entry3 = (Map.Entry) it2.next();
                            for (Map.Entry entry4 : ((Map) entry3.getValue()).entrySet()) {
                                Iterator it3 = it;
                                JSONObject jSONObject6 = new JSONObject();
                                jSONObject6.put("wake_type", entry4.getKey());
                                jSONObject6.put("count", entry4.getValue());
                                jSONArray5.put(jSONObject6);
                                it = it3;
                                it2 = it2;
                            }
                            jSONObject5.put((String) entry3.getKey(), jSONArray5);
                            it = it;
                            it2 = it2;
                        }
                        jSONArray4.put(jSONObject5);
                        it = it;
                    }
                    if (jSONArray4.length() > 0) {
                        jSONObject4.put("from", jSONArray4);
                        jSONObject4.put("itime", C0557c.m2916j(context));
                        jSONObject4.put("type", "android_awake_target2");
                        jSONArray2.put(jSONObject4);
                    }
                    if (jSONArray2.length() > 0) {
                        return jSONArray2;
                    }
                }
            } catch (Throwable th) {
                C0675a.m3476h("JWakePackageHelper", "merge wake json failed:" + th.getMessage());
            }
        }
        return jSONArray;
    }

    /* renamed from: a */
    public static JSONObject m3010a(Context context, List<C0581b> list) {
        try {
            JSONObject jSONObject = new JSONObject();
            JSONArray jSONArray = new JSONArray();
            boolean z = false;
            for (C0581b c0581b : list) {
                JSONObject jSONObject2 = new JSONObject();
                HashMap<Integer, Boolean> hashMap = c0581b.f2788b;
                Iterator<Integer> it = hashMap.keySet().iterator();
                while (it.hasNext()) {
                    if (hashMap.get(Integer.valueOf(it.next().intValue())).booleanValue()) {
                        z = true;
                    }
                }
                jSONObject2.put("awake_from", context.getApplicationContext().getPackageName());
                jSONObject2.put("awake_to", c0581b.f2787a.getPackageName());
                jSONObject2.put("awake_class", c0581b.f2787a.getClassName());
                jSONObject2.put("awake_count", 1);
                jSONObject2.put("success", z);
                jSONArray.put(jSONObject2);
            }
            jSONObject.put("awake_path", jSONArray);
            return jSONObject;
        } catch (JSONException e2) {
            C0675a.m3475g("JWakePackageHelper", "package cmd report json exception:" + e2.getMessage());
            return null;
        }
    }

    /* renamed from: a */
    public static JSONObject m3011a(String str, int i, boolean z) {
        if (str == null) {
            str = "";
        }
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("wake_type", i);
            jSONObject.put("package", str);
            jSONObject.put("app_alive", z);
            return jSONObject;
        } catch (JSONException e2) {
            e2.printStackTrace();
            return null;
        }
    }

    /* renamed from: a */
    public static JSONObject m3012a(List<C0581b> list) {
        if (list == null || list.size() == 0) {
            C0675a.m3469c("JWakePackageHelper", "wakeUpResult is empty, no need report");
            return null;
        }
        JSONArray jSONArray = new JSONArray();
        for (C0581b c0581b : list) {
            try {
                if (c0581b.f2788b != null && !c0581b.f2788b.isEmpty()) {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("package", c0581b.f2787a.getPackageName());
                    jSONObject.put("count", c0581b.f2788b.size());
                    jSONArray.put(jSONObject);
                }
            } catch (Throwable th) {
                C0675a.m3477i("JWakePackageHelper", "formatReportData:" + th);
            }
        }
        JSONObject jSONObject2 = new JSONObject();
        try {
            jSONObject2.put("target", jSONArray);
        } catch (JSONException e2) {
            e2.printStackTrace();
        }
        return jSONObject2;
    }

    /* renamed from: a */
    public static void m3013a(Context context, String str, JSONObject jSONObject) {
        JSONObject m2875a;
        if (jSONObject == null) {
            return;
        }
        try {
            C0675a.m3469c("JWakePackageHelper", "save wake data:" + jSONObject.toString());
            jSONObject.put("itime", C0557c.m2916j(context));
            jSONObject.put("type", str);
            synchronized ("wakeup_cache_v2.json") {
                m2875a = C0552b.m2875a(context, "wakeup_cache_v2.json");
            }
            if (m2875a == null) {
                m2875a = new JSONObject();
            }
            JSONArray optJSONArray = m2875a.optJSONArray("content");
            if (optJSONArray == null) {
                optJSONArray = new JSONArray();
            }
            try {
                optJSONArray.put(jSONObject);
                m2875a.put("content", optJSONArray);
                synchronized ("wakeup_cache_v2.json") {
                    C0552b.m2879a(context, "wakeup_cache_v2.json", m2875a);
                }
            } catch (JSONException e2) {
                e2.printStackTrace();
            }
        } catch (Throwable th) {
            C0675a.m3475g("JWakePackageHelper", "saveReportData failed:" + th.getMessage());
        }
    }
}
