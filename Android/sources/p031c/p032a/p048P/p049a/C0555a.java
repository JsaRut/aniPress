package p031c.p032a.p048P.p049a;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import p031c.p032a.p062f.C0617b;
import p031c.p032a.p062f.C0618c;
import p031c.p032a.p065i.C0659b;
import p031c.p032a.p065i.C0661d;
import p031c.p032a.p065i.C0664g;
import p031c.p032a.p065i.C0666i;
import p031c.p032a.p066j.C0675a;
import p031c.p032a.p091r.C0819h;
import p031c.p032a.p092s.AbstractC0829e;
import p031c.p032a.p092s.C0831g;

/* renamed from: c.a.P.a.a */
/* loaded from: classes.dex */
public class C0555a extends AbstractC0829e {

    /* renamed from: a */
    private boolean f2700a;

    /* renamed from: a */
    private synchronized void m2884a(Context context) {
        if (this.f2700a) {
            return;
        }
        if (context == null) {
            return;
        }
        C0675a.m3469c("JCoreActionImpl", "init jcore impl ,version:2.1.2");
        this.f2700a = true;
        try {
            if (C0831g.m4072a(context, C0556b.f2704d, 32, "", null, new Object[0]) instanceof Bundle) {
                C0675a.m3469c("JCoreActionImpl", "hb:" + C0556b.f2702b + ",google:false,internal:" + C0556b.f2701a);
                Bundle bundle = new Bundle();
                int i = !TextUtils.isEmpty("") ? 2 : 0;
                bundle.putString("name", "core");
                bundle.putInt("custom", i);
                bundle.putInt("dynamic", 0);
                C0661d.m3386a(context, "set_sdktype_info", bundle);
            }
        } catch (Throwable unused) {
        }
        String str = (String) C0618c.m3190a(context, C0617b.m3168g());
        if (TextUtils.isEmpty(str) || str.startsWith("1.")) {
            C0557c.m2921o(context);
        }
        if (TextUtils.isEmpty(str) || !"2.1.2".equals(str)) {
            C0617b<String> m3168g = C0617b.m3168g();
            m3168g.m3188a((C0617b<String>) "2.1.2");
            C0618c.m3193a(context, (C0617b<?>[]) new C0617b[]{m3168g});
        }
        String str2 = (String) C0618c.m3190a(context, C0617b.m3170h());
        String m2915i = C0557c.m2915i(context);
        C0675a.m3469c("InitHelper", "appkey=" + m2915i + " last=" + str2);
        if (C0819h.m3990a(str2) || "null".equals(str2) || !str2.equalsIgnoreCase(m2915i)) {
            C0617b<String> m3170h = C0617b.m3170h();
            m3170h.m3188a((C0617b<String>) m2915i);
            C0618c.m3193a(context, (C0617b<?>[]) new C0617b[]{m3170h});
            C0675a.m3471d("InitHelper", "We found the appKey is changed or register appkey is empty. Will re-register.");
            C0557c.m2917k(context);
        }
    }

    @Override // p031c.p032a.p092s.AbstractC0829e
    /* renamed from: a */
    public void mo2885a(Context context, String str, Bundle bundle) {
        String string;
        m2884a(context);
        if (TextUtils.isEmpty(str)) {
            C0675a.m3476h("JCoreActionImpl", "handleAction Failed,action is empty");
            return;
        }
        C0675a.m3469c("JCoreActionImpl", "handleAction action:" + str);
        String string2 = bundle != null ? bundle.getString("sdk_type") : "";
        if (str.equals("a1")) {
            if (bundle != null) {
                try {
                    string = bundle.getString("report_data");
                } catch (Throwable th) {
                    C0675a.m3475g("JCoreActionImpl", "report failed:" + th.getMessage());
                    return;
                }
            } else {
                string = null;
            }
            C0557c.m2892a(context, (Object) string);
            return;
        }
        if (str.startsWith("tcp_")) {
            C0666i.m3408a().m3426a(context, str, bundle);
            return;
        }
        if (str.equals("a2")) {
            C0664g.m3399a().m3404a(context, true);
            return;
        }
        if (str.equals("a3")) {
            C0659b.m3371a();
            C0659b.m3375a(context, string2, bundle);
        } else if (str.equals("a4")) {
            C0557c.m2891a(context, bundle);
        }
    }
}
