package p031c.p032a.p033A;

import android.content.Context;
import android.os.Bundle;
import org.json.JSONObject;
import p031c.p032a.p048P.p049a.C0557c;
import p031c.p032a.p066j.C0675a;

/* renamed from: c.a.A.a */
/* loaded from: classes.dex */
public abstract class AbstractC0506a {
    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static /* synthetic */ void m2663a(AbstractC0506a abstractC0506a, Context context, String str) {
        boolean mo2674a = abstractC0506a.mo2674a(context, str);
        C0675a.m3469c("JCommon", str + " isBusinessEnable:" + mo2674a);
        if (mo2674a) {
            abstractC0506a.mo2680c(context, str);
        }
        boolean mo2678b = abstractC0506a.mo2678b(context, str);
        C0675a.m3469c("JCommon", str + " isReportEnable:" + mo2678b);
        if (mo2678b) {
            abstractC0506a.mo2683d(context, str);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static /* synthetic */ void m2664a(AbstractC0506a abstractC0506a, Context context, String str, Bundle bundle) {
        abstractC0506a.mo2671a(str, bundle);
        boolean mo2681c = abstractC0506a.mo2681c();
        C0675a.m3469c("JCommon", str + " isActionBundleEnable:" + mo2681c);
        if (mo2681c) {
            abstractC0506a.mo2680c(context, str);
            abstractC0506a.mo2683d(context, str);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static /* synthetic */ void m2665a(AbstractC0506a abstractC0506a, Context context, String str, JSONObject jSONObject) {
        abstractC0506a.mo2672a(jSONObject);
        if (jSONObject.optInt("cmd") != 45) {
            boolean mo2677b = abstractC0506a.mo2677b();
            C0675a.m3469c("JCommon", str + " isActionCommandEnable:" + mo2677b);
            if (mo2677b) {
                abstractC0506a.mo2680c(context, str);
                abstractC0506a.mo2683d(context, str);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public static /* synthetic */ void m2666b(AbstractC0506a abstractC0506a, Context context, String str) {
        abstractC0506a.mo2680c(context, str);
        abstractC0506a.mo2683d(context, str);
    }

    /* renamed from: e */
    private boolean m2667e(Context context, String str) {
        boolean mo2673a = mo2673a();
        boolean mo2677b = mo2677b();
        boolean mo2684e = mo2684e(context);
        boolean z = mo2673a && mo2677b && mo2684e;
        C0675a.m3469c("JCommon", str + " isActionEnable:" + z + ",actionUserEnable:" + mo2673a + ",actionCommandEnable:" + mo2677b + ",actionUidEnable:" + mo2684e);
        return z;
    }

    /* renamed from: a */
    public final void m2668a(Context context) {
        String mo2682d = mo2682d(context);
        C0675a.m3469c("JCommon", "executeAction: [" + mo2682d + "] from heartBeat");
        if (m2667e(context, mo2682d)) {
            C0557c.m2901a("JCommon", new RunnableC0509d(this, context, mo2682d));
        }
    }

    /* renamed from: a */
    public final void m2669a(Context context, Bundle bundle) {
        String mo2682d = mo2682d(context);
        C0675a.m3469c("JCommon", "executeBundleAction: [" + mo2682d + "] from bundle");
        boolean mo2673a = mo2673a();
        C0675a.m3469c("JCommon", mo2682d + " isActionUserEnable:" + mo2673a);
        if (mo2673a) {
            C0557c.m2901a("JCommon", new RunnableC0507b(this, context, mo2682d, bundle));
        }
    }

    /* renamed from: a */
    public final void m2670a(Context context, JSONObject jSONObject) {
        String mo2682d = mo2682d(context);
        C0675a.m3469c("JCommon", "executeJsonAction: [" + mo2682d + "] from cmd");
        boolean mo2673a = mo2673a();
        C0675a.m3469c("JCommon", mo2682d + " isActionUserEnable:" + mo2673a);
        if (mo2673a) {
            C0557c.m2901a("JCommon", new RunnableC0510e(this, context, mo2682d, jSONObject));
        }
    }

    /* renamed from: a */
    protected void mo2671a(String str, Bundle bundle) {
        if (bundle != null) {
            C0675a.m3469c("JCommon", str + " parseJson:" + bundle.toString());
        }
    }

    /* renamed from: a */
    protected void mo2672a(JSONObject jSONObject) {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: a */
    public boolean mo2673a() {
        return true;
    }

    /* renamed from: a */
    protected boolean mo2674a(Context context, String str) {
        return C0511f.m2698b(context, str);
    }

    /* renamed from: b */
    public final void m2675b(Context context) {
        String mo2682d = mo2682d(context);
        C0675a.m3469c("JCommon", "executeCommandAction: [" + mo2682d + "] from cmd");
        if (m2667e(context, mo2682d)) {
            C0557c.m2901a("JCommon", new RunnableC0508c(this, context, mo2682d));
        }
    }

    /* renamed from: b */
    public final void m2676b(Context context, JSONObject jSONObject) {
        String mo2682d = mo2682d(context);
        C0675a.m3469c("JCommon", "executeCommandActionSingle: [" + mo2682d + "] from cmd");
        boolean mo2673a = mo2673a();
        C0675a.m3469c("JCommon", mo2682d + " isActionUserEnable:" + mo2673a);
        if (mo2673a) {
            C0557c.m2901a(mo2682d, new RunnableC0510e(this, context, mo2682d, jSONObject));
        }
    }

    /* renamed from: b */
    protected boolean mo2677b() {
        return true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: b */
    public boolean mo2678b(Context context, String str) {
        return C0511f.m2698b(context, str);
    }

    /* renamed from: c */
    public final void m2679c(Context context) {
        String mo2682d = mo2682d(context);
        C0675a.m3469c("JCommon", "executeActionSingle: [" + mo2682d + "] from heartBeat");
        if (m2667e(context, mo2682d)) {
            C0557c.m2901a(mo2682d, new RunnableC0509d(this, context, mo2682d));
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: c */
    public void mo2680c(Context context, String str) {
        C0511f.m2699c(context, str);
    }

    /* renamed from: c */
    protected boolean mo2681c() {
        return true;
    }

    /* renamed from: d */
    protected abstract String mo2682d(Context context);

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: d */
    public void mo2683d(Context context, String str) {
        C0511f.m2704e(context, str);
    }

    /* renamed from: e */
    protected boolean mo2684e(Context context) {
        return C0557c.m2911e(context) > 0;
    }
}
