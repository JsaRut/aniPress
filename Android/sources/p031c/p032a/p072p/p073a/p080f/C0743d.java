package p031c.p032a.p072p.p073a.p080f;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONObject;
import p031c.p032a.p072p.p073a.C0707b;
import p031c.p032a.p072p.p073a.p078d.C0728a;
import p031c.p032a.p072p.p073a.p080f.p081a.C0732b;
import p031c.p032a.p072p.p073a.p080f.p087g.C0759a;
import p031c.p032a.p072p.p073a.p088g.C0781i;
import p031c.p032a.p072p.p073a.p088g.C0788p;
import p031c.p032a.p072p.p073a.p088g.C0789q;
import p031c.p032a.p092s.C0830f;

/* renamed from: c.a.p.a.f.d */
/* loaded from: classes.dex */
public final class C0743d {
    /* renamed from: a */
    private static JSONObject m3760a(Context context) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("app_ver", C0759a.m3797a(context));
            jSONObject.put("analytics_ver", "2.0.0");
            jSONObject.put("app_key", C0830f.m4048a());
            jSONObject.put("pkg_name", context.getPackageName());
            jSONObject.put("platform", "a");
            jSONObject.put("token", C0789q.m3895a());
        } catch (Throwable th) {
            C0732b.m3725h("BuryProtocol", "toAppInfoJson err:" + th.getMessage());
        }
        return jSONObject;
    }

    /* renamed from: a */
    public static JSONObject m3761a(View view, String str) {
        try {
            C0728a m3795b = C0758g.m3795b(view);
            C0781i c0781i = new C0781i(view, C0758g.m3789a(view), m3795b.m3697a(), m3795b.m3698b());
            ArrayList arrayList = new ArrayList();
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                for (int i = 0; i < viewGroup.getChildCount(); i++) {
                    m3763a(arrayList, viewGroup.getChildAt(i), m3795b.m3697a(), m3795b.m3698b());
                }
            }
            View m3794b = C0758g.m3794b(C0770h.m3844d(view));
            C0728a m3795b2 = C0758g.m3795b(m3794b);
            JSONObject m3727a = new C0733b(new C0781i(m3794b, C0758g.m3789a(m3794b), m3795b2.m3697a(), m3795b2.m3698b()), c0781i, arrayList).m3727a(str);
            try {
                m3727a.put("app_info", m3760a(C0707b.m3613a(null)));
            } catch (Throwable unused) {
            }
            return m3727a;
        } catch (Throwable th) {
            C0732b.m3725h("BuryProtocol", "toBuryActionJson e:" + th);
            return new JSONObject();
        }
    }

    /* renamed from: a */
    public static JSONObject m3762a(JSONArray jSONArray) {
        if (jSONArray != null && jSONArray.length() != 0) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("records", jSONArray);
                return C0830f.m4050a(jSONObject, "visual_track");
            } catch (Throwable th) {
                C0732b.m3725h("BuryProtocol", "toUpdateJson err:" + th.getMessage());
            }
        }
        return null;
    }

    /* renamed from: a */
    private static void m3763a(ArrayList<C0781i> arrayList, View view, String str, String str2) {
        C0788p m3789a = C0758g.m3789a(view);
        String str3 = str + "/" + m3789a.f3454a;
        if (m3789a.f3458e) {
            str2 = TextUtils.isEmpty(str2) ? m3789a.f3455b : str2 + "," + m3789a.f3455b;
        }
        if (C0770h.m3837a(view)) {
            C0781i c0781i = new C0781i(view, C0758g.m3789a(view), str3, str2);
            c0781i.f3432g = true;
            arrayList.add(c0781i);
        } else {
            if (!(view instanceof ViewGroup) || (view instanceof WebView)) {
                return;
            }
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                m3763a(arrayList, viewGroup.getChildAt(i), str3, str2);
            }
        }
    }
}
