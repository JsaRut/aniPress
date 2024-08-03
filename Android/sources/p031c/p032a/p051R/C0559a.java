package p031c.p032a.p051R;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p031c.p032a.p033A.AbstractC0506a;
import p031c.p032a.p033A.C0511f;
import p031c.p032a.p033A.C0513h;
import p031c.p032a.p047O.C0552b;
import p031c.p032a.p052S.C0569a;
import p031c.p032a.p052S.C0570b;
import p031c.p032a.p052S.C0571c;
import p031c.p032a.p066j.C0675a;
import p031c.p032a.p091r.C0812a;

/* renamed from: c.a.R.a */
/* loaded from: classes.dex */
public class C0559a extends AbstractC0506a {

    /* renamed from: a */
    @SuppressLint({"StaticFieldLeak"})
    private static volatile C0559a f2712a;

    /* renamed from: b */
    private Context f2713b;

    /* renamed from: a */
    private static Bundle m2931a(long j, double d2, double d3) {
        Bundle bundle = new Bundle();
        bundle.putLong("time", j);
        bundle.putDouble("lot", d2);
        bundle.putDouble("lat", d3);
        return bundle;
    }

    /* renamed from: a */
    private JSONObject m2932a(List<C0571c> list, C0569a c0569a, C0570b c0570b) {
        String str;
        boolean z;
        String str2;
        String str3;
        JSONObject jSONObject;
        C0571c c0571c;
        JSONObject jSONObject2 = new JSONObject();
        String str4 = "JLocation";
        if (list == null || list.isEmpty()) {
            str = "JLocation";
            z = false;
        } else {
            JSONArray jSONArray = new JSONArray();
            int i = 0;
            z = false;
            while (i < list.size()) {
                try {
                    jSONObject = new JSONObject();
                    c0571c = list.get(i);
                    str2 = str4;
                } catch (JSONException e2) {
                    e = e2;
                    str2 = str4;
                }
                try {
                    jSONObject.put("itime", c0571c.f2749a);
                    if (c0571c.f2751c != null) {
                        jSONObject.put("tag", c0571c.f2751c);
                    }
                    jSONObject.put("ssid", c0571c.f2750b);
                    jSONObject.put("mac_address", c0571c.f2753e);
                    jSONObject.put("signal_strength", c0571c.f2752d);
                    jSONObject.put("age", 0);
                    jSONArray.put(jSONObject);
                    jSONObject2.put("wifi", jSONArray);
                    str3 = str2;
                    z = true;
                } catch (JSONException e3) {
                    e = e3;
                    str3 = str2;
                    C0675a.m3475g(str3, "package wifi json exception:" + e.getMessage());
                    i++;
                    str4 = str3;
                }
                i++;
                str4 = str3;
            }
            str = str4;
        }
        if (c0569a != null) {
            try {
                JSONArray jSONArray2 = new JSONArray();
                JSONObject jSONObject3 = new JSONObject();
                jSONObject3.put("itime", c0569a.f2733a);
                jSONObject3.put("radio_type", c0569a.f2739g);
                jSONObject3.put("generation", c0569a.f2740h);
                jSONObject3.put("carrier", c0569a.f2741i);
                jSONObject3.put("mobile_country_code", c0569a.f2734b);
                jSONObject3.put("mobile_network_code", c0569a.f2735c);
                jSONObject3.put("signal_strength", c0569a.f2738f);
                jSONObject3.put("cell_id", c0569a.f2737e);
                jSONObject3.put("location_area_code", c0569a.f2736d);
                jSONArray2.put(jSONObject3);
                jSONObject2.put("cell", jSONArray2);
                z = true;
            } catch (JSONException e4) {
                C0675a.m3475g(str, "package cell json exception:" + e4.getMessage());
            }
        }
        if (c0570b != null) {
            try {
                JSONArray jSONArray3 = new JSONArray();
                JSONObject jSONObject4 = new JSONObject();
                jSONObject4.put("itime", c0570b.f2742a);
                jSONObject4.put("tag", c0570b.f2743b);
                jSONObject4.put("lat", c0570b.f2744c);
                jSONObject4.put("lng", c0570b.f2745d);
                jSONObject4.put("alt", c0570b.f2746e);
                jSONObject4.put("bear", c0570b.f2747f);
                jSONObject4.put("acc", c0570b.f2748g);
                jSONArray3.put(jSONObject4);
                jSONObject2.put("gps", jSONArray3);
                z = true;
            } catch (JSONException e5) {
                C0675a.m3475g(str, "package gps json exception:" + e5.getMessage());
            }
        }
        if (z) {
            try {
                C0513h.m2719a(this.f2713b, jSONObject2, "loc_info");
                jSONObject2.put("local_dns", C0812a.m3945c());
                jSONObject2.put("network_type", C0812a.m3956i(this.f2713b));
            } catch (JSONException e6) {
                C0675a.m3475g(str, "package json exception:" + e6.getMessage());
            }
        }
        return jSONObject2;
    }

    /* renamed from: a */
    private JSONObject m2933a(JSONObject jSONObject, JSONObject jSONObject2) {
        JSONObject jSONObject3;
        JSONArray jSONArray;
        C0675a.m3469c("JLocation", "currentJson:" + jSONObject + ",cacheJson:" + jSONObject2);
        if (jSONObject == null) {
            return jSONObject2;
        }
        if (jSONObject2 == null) {
            try {
                jSONObject3 = new JSONObject();
            } catch (JSONException e2) {
                e = e2;
                jSONObject3 = jSONObject2;
            }
            try {
                JSONArray jSONArray2 = new JSONArray();
                jSONArray2.put(jSONObject);
                jSONObject3.put("content", jSONArray2);
            } catch (JSONException e3) {
                e = e3;
                C0675a.m3475g("JLocation", "mergeJson exception:" + e.getMessage());
                return jSONObject3;
            }
            return jSONObject3;
        }
        try {
            jSONArray = jSONObject2.getJSONArray("content");
        } catch (JSONException unused) {
            jSONArray = new JSONArray();
        }
        for (int i = 0; i < jSONArray.length(); i++) {
            JSONObject optJSONObject = jSONArray.optJSONObject(i);
            JSONArray optJSONArray = optJSONObject.optJSONArray("wifi");
            JSONArray optJSONArray2 = optJSONObject.optJSONArray("cell");
            JSONArray optJSONArray3 = optJSONObject.optJSONArray("gps");
            JSONArray optJSONArray4 = jSONObject.optJSONArray("wifi");
            JSONArray optJSONArray5 = jSONObject.optJSONArray("cell");
            JSONArray optJSONArray6 = jSONObject.optJSONArray("gps");
            if (optJSONArray != null && optJSONArray.equals(optJSONArray4)) {
                jSONObject.remove("wifi");
            }
            if (optJSONArray2 != null && optJSONArray2.equals(optJSONArray5)) {
                jSONObject.remove("cell");
            }
            if (optJSONArray3 != null && optJSONArray3.equals(optJSONArray6)) {
                jSONObject.remove("gps");
            }
        }
        if (jSONObject.length() != 0) {
            try {
                jSONObject.put("network_type", C0812a.m3956i(this.f2713b));
                jSONObject.put("local_dns", C0812a.m3945c());
                C0513h.m2719a(this.f2713b, jSONObject, "loc_info");
                jSONArray.put(jSONObject);
            } catch (JSONException e4) {
                C0675a.m3475g("JLocation", "package json exception:" + e4.getMessage());
            }
        }
        return jSONObject2;
    }

    /* renamed from: d */
    public static C0559a m2934d() {
        if (f2712a == null) {
            synchronized (C0559a.class) {
                f2712a = new C0559a();
            }
        }
        return f2712a;
    }

    @Override // p031c.p032a.p033A.AbstractC0506a
    /* renamed from: a */
    protected final void mo2672a(JSONObject jSONObject) {
        int optInt = jSONObject.optInt("cmd");
        JSONObject optJSONObject = jSONObject.optJSONObject("content");
        if (optInt != 5) {
            if (optInt == 45) {
                C0511f.m2688a(this.f2713b, "JLocation", optJSONObject.optLong("interval", 0L) * 1000);
                return;
            }
            return;
        }
        boolean optBoolean = true ^ optJSONObject.optBoolean("disable", true);
        C0511f.m2690a(this.f2713b, "JLocation", optBoolean);
        if (optBoolean) {
            C0511f.m2696b(this.f2713b, "JLocation", optJSONObject.optLong("frequency", 0L) * 1000);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p031c.p032a.p033A.AbstractC0506a
    /* renamed from: a */
    public final boolean mo2673a() {
        return C0511f.m2710i(this.f2713b, "JLocation");
    }

    @Override // p031c.p032a.p033A.AbstractC0506a
    /* renamed from: a */
    protected final boolean mo2674a(Context context, String str) {
        return C0511f.m2692a(context, str);
    }

    @Override // p031c.p032a.p033A.AbstractC0506a
    /* renamed from: b */
    protected final boolean mo2677b() {
        return C0511f.m2709h(this.f2713b, "JLocation");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Can't wrap try/catch for region: R(20:1|(2:3|(17:5|6|7|(12:12|13|14|15|(6:20|(3:28|29|(1:31))|22|(1:24)|25|26)|35|(3:39|(4:41|(2:62|63)(1:43)|44|45)(1:64)|(1:47))|(0)|22|(0)|25|26)|69|(13:71|72|73|14|15|(7:17|20|(0)|22|(0)|25|26)|35|(4:37|39|(0)(0)|(0))|(0)|22|(0)|25|26)|13|14|15|(0)|35|(0)|(0)|22|(0)|25|26)(1:92))(1:94)|93|6|7|(13:9|12|13|14|15|(0)|35|(0)|(0)|22|(0)|25|26)|69|(0)|13|14|15|(0)|35|(0)|(0)|22|(0)|25|26|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x01a6, code lost:            r0 = e;     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x01a8, code lost:            r0 = e;     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x01a4, code lost:            r0 = th;     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x0099, code lost:            r0 = e;     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x009a, code lost:            r12 = null;     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x009c, code lost:            r0 = e;     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x009d, code lost:            r12 = null;     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x00cd, code lost:            r12 = null;     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x0096, code lost:            r0 = th;     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x0097, code lost:            r12 = null;     */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0103 A[Catch: Throwable -> 0x01a4, InterruptedException -> 0x01a6, ExecutionException -> 0x01a8, TimeoutException -> 0x01d1, TryCatch #9 {InterruptedException -> 0x01a6, ExecutionException -> 0x01a8, TimeoutException -> 0x01d1, Throwable -> 0x01a4, blocks: (B:15:0x00d3, B:17:0x0103, B:20:0x010a, B:35:0x0111, B:37:0x0117, B:39:0x0121, B:41:0x012b, B:47:0x0182, B:64:0x016b), top: B:14:0x00d3 }] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0208  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x01d8 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0117 A[Catch: Throwable -> 0x01a4, InterruptedException -> 0x01a6, ExecutionException -> 0x01a8, TimeoutException -> 0x01d1, TryCatch #9 {InterruptedException -> 0x01a6, ExecutionException -> 0x01a8, TimeoutException -> 0x01d1, Throwable -> 0x01a4, blocks: (B:15:0x00d3, B:17:0x0103, B:20:0x010a, B:35:0x0111, B:37:0x0117, B:39:0x0121, B:41:0x012b, B:47:0x0182, B:64:0x016b), top: B:14:0x00d3 }] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x012b A[Catch: Throwable -> 0x01a4, InterruptedException -> 0x01a6, ExecutionException -> 0x01a8, TimeoutException -> 0x01d1, TRY_LEAVE, TryCatch #9 {InterruptedException -> 0x01a6, ExecutionException -> 0x01a8, TimeoutException -> 0x01d1, Throwable -> 0x01a4, blocks: (B:15:0x00d3, B:17:0x0103, B:20:0x010a, B:35:0x0111, B:37:0x0117, B:39:0x0121, B:41:0x012b, B:47:0x0182, B:64:0x016b), top: B:14:0x00d3 }] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0182 A[Catch: Throwable -> 0x01a4, InterruptedException -> 0x01a6, ExecutionException -> 0x01a8, TimeoutException -> 0x01d1, TRY_LEAVE, TryCatch #9 {InterruptedException -> 0x01a6, ExecutionException -> 0x01a8, TimeoutException -> 0x01d1, Throwable -> 0x01a4, blocks: (B:15:0x00d3, B:17:0x0103, B:20:0x010a, B:35:0x0111, B:37:0x0117, B:39:0x0121, B:41:0x012b, B:47:0x0182, B:64:0x016b), top: B:14:0x00d3 }] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x016b A[Catch: Throwable -> 0x01a4, InterruptedException -> 0x01a6, ExecutionException -> 0x01a8, TimeoutException -> 0x01d1, TRY_ENTER, TryCatch #9 {InterruptedException -> 0x01a6, ExecutionException -> 0x01a8, TimeoutException -> 0x01d1, Throwable -> 0x01a4, blocks: (B:15:0x00d3, B:17:0x0103, B:20:0x010a, B:35:0x0111, B:37:0x0117, B:39:0x0121, B:41:0x012b, B:47:0x0182, B:64:0x016b), top: B:14:0x00d3 }] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0060 A[Catch: Throwable -> 0x0096, InterruptedException -> 0x0099, ExecutionException -> 0x009c, TimeoutException -> 0x00cd, TRY_LEAVE, TryCatch #7 {InterruptedException -> 0x0099, ExecutionException -> 0x009c, TimeoutException -> 0x00cd, Throwable -> 0x0096, blocks: (B:7:0x0047, B:9:0x004d, B:12:0x0054, B:69:0x005a, B:71:0x0060), top: B:6:0x0047 }] */
    @Override // p031c.p032a.p033A.AbstractC0506a
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void mo2680c(android.content.Context r16, java.lang.String r17) {
        /*
            Method dump skipped, instructions count: 544
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p031c.p032a.p051R.C0559a.mo2680c(android.content.Context, java.lang.String):void");
    }

    @Override // p031c.p032a.p033A.AbstractC0506a
    /* renamed from: d */
    protected final String mo2682d(Context context) {
        this.f2713b = context;
        return "JLocation";
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p031c.p032a.p033A.AbstractC0506a
    /* renamed from: d */
    public final void mo2683d(Context context, String str) {
        String str2;
        String str3;
        JSONObject m2875a = C0552b.m2875a(context, "rl.catch");
        if (m2875a == null) {
            str2 = "JLocation";
            str3 = "there are no data to report";
        } else {
            JSONArray optJSONArray = m2875a.optJSONArray("content");
            if (optJSONArray != null) {
                C0513h.m2720a(context, optJSONArray);
                C0675a.m3469c("JLocation", "clean cache json");
                if (context != null && !TextUtils.isEmpty("rl.catch")) {
                    try {
                        if (!C0552b.m2879a(context, "rl.catch", (JSONObject) null)) {
                            synchronized ("rl.catch") {
                                context.deleteFile("rl.catch");
                            }
                        }
                    } catch (Throwable th) {
                        C0675a.m3475g("JCommonFileHelper", "cleanJson throwable:" + th.getMessage());
                    }
                }
                super.mo2683d(context, str);
                return;
            }
            str2 = "JLocation";
            str3 = "there are no content data to report";
        }
        C0675a.m3469c(str2, str3);
    }

    @Override // p031c.p032a.p033A.AbstractC0506a
    /* renamed from: e */
    protected final boolean mo2684e(Context context) {
        return true;
    }

    /* renamed from: f */
    public final Bundle m2935f(Context context) {
        long longValue;
        double doubleValue;
        double doubleValue2;
        String m2702d = C0511f.m2702d(context);
        if (TextUtils.isEmpty(m2702d)) {
            longValue = 0;
            doubleValue = 200.0d;
            doubleValue2 = 200.0d;
        } else {
            String[] split = m2702d.split(",");
            longValue = Long.valueOf(split[0]).longValue();
            doubleValue = Double.valueOf(split[1]).doubleValue();
            doubleValue2 = Double.valueOf(split[2]).doubleValue();
        }
        return m2931a(longValue, doubleValue, doubleValue2);
    }
}
