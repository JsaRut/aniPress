package p031c.p032a.p054U;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p031c.p032a.p033A.AbstractC0506a;
import p031c.p032a.p033A.C0511f;
import p031c.p032a.p033A.C0513h;
import p031c.p032a.p066j.C0675a;

/* renamed from: c.a.U.a */
/* loaded from: classes.dex */
public class C0573a extends AbstractC0506a {

    /* renamed from: a */
    @SuppressLint({"StaticFieldLeak"})
    private static volatile C0573a f2754a;

    /* renamed from: b */
    private Context f2755b;

    /* renamed from: c */
    private Bundle f2756c;

    /* renamed from: d */
    private String f2757d = "";

    /* renamed from: e */
    private int f2758e = 0;

    /* renamed from: f */
    private int f2759f = 0;

    /* renamed from: a */
    private static JSONObject m2962a(String str, int i, int i2) {
        try {
            JSONObject jSONObject = new JSONObject();
            JSONArray jSONArray = new JSONArray();
            JSONObject jSONObject2 = new JSONObject();
            jSONArray.put(i);
            jSONArray.put(i2);
            jSONObject2.put(str, jSONArray);
            jSONObject.put("type", "sdk_type");
            jSONObject.put("sdk", jSONObject2);
            return jSONObject;
        } catch (JSONException e2) {
            C0675a.m3475g("JType", "package json exception: " + e2.getMessage());
            return null;
        }
    }

    /* renamed from: d */
    public static C0573a m2963d() {
        if (f2754a == null) {
            synchronized (C0573a.class) {
                f2754a = new C0573a();
            }
        }
        return f2754a;
    }

    @Override // p031c.p032a.p033A.AbstractC0506a
    /* renamed from: a */
    protected final void mo2671a(String str, Bundle bundle) {
        this.f2756c = bundle;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p031c.p032a.p033A.AbstractC0506a
    /* renamed from: c */
    public final void mo2680c(Context context, String str) {
    }

    @Override // p031c.p032a.p033A.AbstractC0506a
    /* renamed from: c */
    protected final boolean mo2681c() {
        Bundle bundle = this.f2756c;
        boolean z = false;
        if (bundle == null) {
            return false;
        }
        this.f2757d = bundle.getString("name");
        this.f2758e = this.f2756c.getInt("custom", 0);
        this.f2759f = this.f2756c.getInt("dynamic", 0);
        C0675a.m3469c("JType", "parseBundle type:" + this.f2757d + ",custom:" + this.f2758e + ",dynamic:" + this.f2759f);
        Context context = this.f2755b;
        String str = this.f2757d;
        int i = this.f2758e;
        int i2 = this.f2759f;
        if (!TextUtils.isEmpty(str) && i >= 0 && i2 >= 0) {
            if (!C0511f.m2711j(context, str).equals(i + "," + i2)) {
                z = true;
            }
        }
        if (z) {
            C0511f.m2689a(this.f2755b, this.f2757d, this.f2758e + "," + this.f2759f);
        } else {
            C0675a.m3469c("JType", "type [" + this.f2757d + "] data not change");
        }
        return z;
    }

    @Override // p031c.p032a.p033A.AbstractC0506a
    /* renamed from: d */
    protected final String mo2682d(Context context) {
        this.f2755b = context;
        return "JType";
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p031c.p032a.p033A.AbstractC0506a
    /* renamed from: d */
    public final void mo2683d(Context context, String str) {
        JSONObject m2962a = m2962a(this.f2757d, this.f2758e, this.f2759f);
        if (m2962a == null) {
            C0675a.m3475g("JType", "there are no data to report");
        } else {
            C0513h.m2720a(context, (Object) m2962a);
        }
    }
}
