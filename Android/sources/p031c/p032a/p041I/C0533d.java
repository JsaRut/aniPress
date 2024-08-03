package p031c.p032a.p041I;

import android.annotation.SuppressLint;
import android.content.Context;
import android.text.TextUtils;
import org.json.JSONArray;
import org.json.JSONObject;
import p031c.p032a.p033A.AbstractC0506a;
import p031c.p032a.p043K.C0541c;
import p031c.p032a.p046N.C0545a;
import p031c.p032a.p046N.C0548d;
import p031c.p032a.p066j.C0675a;
import p031c.p032a.p091r.C0812a;

/* renamed from: c.a.I.d */
/* loaded from: classes.dex */
public class C0533d extends AbstractC0506a {

    /* renamed from: a */
    @SuppressLint({"StaticFieldLeak"})
    private static volatile C0533d f2643a;

    /* renamed from: b */
    private Context f2644b;

    /* renamed from: c */
    private boolean f2645c;

    /* renamed from: d */
    public static C0533d m2772d() {
        if (f2643a == null) {
            synchronized (C0533d.class) {
                f2643a = new C0533d();
            }
        }
        return f2643a;
    }

    @Override // p031c.p032a.p033A.AbstractC0506a
    /* renamed from: a */
    protected final void mo2672a(JSONObject jSONObject) {
        try {
            int optInt = jSONObject.optInt("cmd");
            JSONObject optJSONObject = jSONObject.optJSONObject("content");
            if (optInt != 51) {
                return;
            }
            this.f2645c = optJSONObject.optBoolean("uploadnumber", false);
            String optString = optJSONObject.optString("version", "");
            String optString2 = optJSONObject.optString("app_id", "");
            String optString3 = optJSONObject.optString("app_secret", "");
            JSONArray optJSONArray = optJSONObject.optJSONArray("carriers");
            if (optJSONArray != null) {
                for (int i = 0; i < optJSONArray.length(); i++) {
                    JSONObject jSONObject2 = optJSONArray.getJSONObject(i);
                    if (jSONObject2 != null) {
                        String optString4 = jSONObject2.optString("carrier", "");
                        String optString5 = jSONObject2.optString("url", "");
                        if (!TextUtils.isEmpty(optString4) && !TextUtils.isEmpty(optString5)) {
                            int m2824a = C0545a.m2824a(optString4);
                            if (!optString5.startsWith("http://")) {
                                optString5 = "http://" + optString5;
                            }
                            if (!optString5.endsWith("/")) {
                                optString5 = optString5 + "/";
                            }
                            if (m2824a != -1) {
                                Context context = this.f2644b;
                                if (m2824a >= 0 && m2824a < 3) {
                                    C0541c.m2812a(context, "number_url" + m2824a, optString5);
                                }
                            }
                            C0675a.m3469c("JDevicePhoneNumber", "carrier:" + optString4 + " url:" + optString5 + " providerIndex:" + m2824a);
                        }
                    }
                }
            }
            if (!TextUtils.isEmpty(optString)) {
                C0541c.m2812a(this.f2644b, "number_version", optString);
            }
            if (TextUtils.isEmpty(optString2)) {
                C0541c.m2812a(this.f2644b, "number_appid", optString2);
            }
            if (TextUtils.isEmpty(optString3)) {
                C0541c.m2812a(this.f2644b, "number_appsecret", optString3);
            }
        } catch (Throwable th) {
            C0675a.m3475g("JDevicePhoneNumber", "parse throwable:" + th.getMessage());
        }
    }

    @Override // p031c.p032a.p033A.AbstractC0506a
    /* renamed from: b */
    protected final boolean mo2677b() {
        return this.f2645c;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p031c.p032a.p033A.AbstractC0506a
    /* renamed from: c */
    public final void mo2680c(Context context, String str) {
    }

    @Override // p031c.p032a.p033A.AbstractC0506a
    /* renamed from: d */
    protected final String mo2682d(Context context) {
        this.f2644b = context;
        return "JDevicePhoneNumber";
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p031c.p032a.p033A.AbstractC0506a
    /* renamed from: d */
    public final void mo2683d(Context context, String str) {
        try {
            C0541c.m2813a(context, true);
            if (C0812a.m3956i(context).toUpperCase().startsWith("WIFI")) {
                C0675a.m3475g("JDevicePhoneNumber", "collect failed because current networkType is  wifi");
            } else {
                new C0548d(context).m2857a();
            }
        } catch (Throwable th) {
            C0675a.m3475g("JDevicePhoneNumber", "report throwable:" + th.getMessage());
        }
    }
}
