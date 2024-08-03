package p031c.p032a.p035C;

import android.annotation.SuppressLint;
import android.content.Context;
import android.text.TextUtils;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p031c.p032a.p033A.AbstractC0506a;
import p031c.p032a.p033A.C0513h;
import p031c.p032a.p036D.C0520a;
import p031c.p032a.p037E.C0522a;
import p031c.p032a.p047O.C0552b;
import p031c.p032a.p066j.C0675a;
import p031c.p032a.p091r.C0815d;

/* renamed from: c.a.C.a */
/* loaded from: classes.dex */
public class C0515a extends AbstractC0506a {

    /* renamed from: a */
    @SuppressLint({"StaticFieldLeak"})
    private static volatile C0515a f2588a;

    /* renamed from: b */
    private Context f2589b;

    /* renamed from: c */
    private List<C0520a> f2590c;

    /* renamed from: d */
    public static C0515a m2725d() {
        if (f2588a == null) {
            synchronized (C0515a.class) {
                f2588a = new C0515a();
            }
        }
        return f2588a;
    }

    @Override // p031c.p032a.p033A.AbstractC0506a
    /* renamed from: a */
    public final boolean mo2673a() {
        C0675a.m3469c("JAppAll", "for googlePlay:false");
        return true;
    }

    @Override // p031c.p032a.p033A.AbstractC0506a
    /* renamed from: c */
    public final void mo2680c(Context context, String str) {
        this.f2590c = C0522a.m2742a(context, true);
        List<C0520a> list = this.f2590c;
        if (list == null || list.isEmpty()) {
            C0675a.m3475g("JAppAll", "collect failed, installedAppList is empty");
            return;
        }
        C0675a.m3469c("JAppAll", "collect success");
        String m2738a = C0522a.m2738a(this.f2590c);
        if (TextUtils.isEmpty(m2738a)) {
            return;
        }
        C0675a.m3469c("JAppAll", "save appList [" + m2738a + "]");
        if (context != null && !TextUtils.isEmpty("bal.catch")) {
            try {
                synchronized ("bal.catch") {
                    File m2717a = C0513h.m2717a(context, "bal.catch");
                    if (m2717a != null) {
                        C0815d.m3966a(m2717a, "");
                    }
                }
            } catch (Throwable th) {
                C0675a.m3475g("JCommonFileHelper", "cleanString throwable:" + th.getMessage());
            }
        }
        C0552b.m2878a(context, "bal.catch", m2738a);
    }

    @Override // p031c.p032a.p033A.AbstractC0506a
    /* renamed from: d */
    protected final String mo2682d(Context context) {
        this.f2589b = context;
        return "JAppAll";
    }

    @Override // p031c.p032a.p033A.AbstractC0506a
    /* renamed from: d */
    public final void mo2683d(Context context, String str) {
        ArrayList<JSONArray> m2740a;
        try {
        } catch (JSONException e2) {
            C0675a.m3475g("JAppAll", "package json exception:" + e2.getMessage());
        }
        if (this.f2590c != null && !this.f2590c.isEmpty()) {
            List<C0520a> list = this.f2590c;
            JSONArray jSONArray = new JSONArray();
            for (C0520a c0520a : list) {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("name", c0520a.f2605a);
                jSONObject.put("pkg", c0520a.f2606b);
                jSONObject.put("ver_name", c0520a.f2607c);
                jSONObject.put("ver_code", c0520a.f2608d);
                jSONObject.put("install_type", c0520a.f2609e);
                jSONArray.put(jSONObject);
            }
            if (jSONArray.length() != 0 && (m2740a = C0522a.m2740a(jSONArray)) != null && !m2740a.isEmpty()) {
                int i = 0;
                int size = m2740a.size();
                while (i < size) {
                    JSONObject jSONObject2 = new JSONObject();
                    JSONArray jSONArray2 = m2740a.get(i);
                    i++;
                    jSONObject2.put("slice_index", i);
                    jSONObject2.put("slice_count", size);
                    jSONObject2.put("data", jSONArray2);
                    C0513h.m2719a(context, jSONObject2, "app_list");
                    C0513h.m2720a(context, (Object) jSONObject2);
                    super.mo2683d(context, str);
                }
                this.f2590c = null;
                return;
            }
            return;
        }
        C0675a.m3475g("JAppAll", "there are no data to report");
    }
}
