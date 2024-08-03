package p031c.p032a.p072p.p073a.p088g;

import android.content.Context;
import android.view.View;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import p031c.p032a.p072p.p073a.p078d.C0728a;
import p031c.p032a.p072p.p073a.p079e.C0729a;
import p031c.p032a.p072p.p073a.p080f.C0758g;
import p031c.p032a.p072p.p073a.p080f.C0770h;
import p031c.p032a.p072p.p073a.p080f.p081a.C0732b;
import p031c.p032a.p072p.p073a.p080f.p087g.C0760b;
import p031c.p032a.p092s.C0830f;

/* renamed from: c.a.p.a.g.d */
/* loaded from: classes.dex */
public final class C0776d {

    /* renamed from: a */
    private static C0778f f3425a = new C0778f();

    /* renamed from: b */
    private static long f3426b = 0;

    /* renamed from: a */
    public static /* synthetic */ long m3858a(long j) {
        f3426b = 0L;
        return 0L;
    }

    /* renamed from: a */
    public static List<C0774b> m3860a(String str, String str2, String str3) {
        return f3425a.m3866a(str, str2, str3, true);
    }

    /* renamed from: a */
    public static void m3861a(Context context, List<C0774b> list) {
        try {
            Iterator<C0774b> it = list.iterator();
            while (it.hasNext()) {
                C0732b.m3718b("EventFilter", "xxx_updateBury json=" + C0729a.m3700a(it.next().mo3850a("file://")));
            }
            f3425a.m3868a(list);
            C0775c.m3853a(context, f3425a.m3870b().toString(), 0L);
        } catch (Throwable th) {
            C0732b.m3725h("EventFilter", "updateBury e:" + th);
        }
    }

    /* renamed from: a */
    public static void m3862a(Context context, boolean z) {
        try {
            if (C0789q.m3898b()) {
                if (f3425a == null || f3425a.m3869a()) {
                    String m3852a = C0775c.m3852a(context);
                    C0732b.m3718b("EventFilter", "xxx_fetchFilter from sp : " + m3852a);
                    C0778f m3864a = C0778f.m3864a(m3852a);
                    if (m3864a != null) {
                        f3425a = m3864a;
                    }
                }
                if (z) {
                    long currentTimeMillis = System.currentTimeMillis();
                    if (f3426b > 0 && currentTimeMillis < f3426b + 30000) {
                        C0732b.m3718b("EventFilter", "is fetching, please wait for result");
                        return;
                    }
                    long m3856c = C0775c.m3856c(context);
                    if (m3856c > 0 && currentTimeMillis < 3600000 + m3856c) {
                        C0732b.m3718b("EventFilter", "no need update list, lastUpdate is " + C0760b.m3805a("yyyyMMdd-HH:mm:ss").format(new Date(m3856c)));
                        return;
                    }
                }
                f3426b = System.currentTimeMillis();
                C0830f.m4056a(new RunnableC0777e(context), new int[0]);
            }
        } catch (Throwable th) {
            C0732b.m3725h("EventFilter", "fetch e:" + th);
        }
    }

    /* renamed from: a */
    public static void m3863a(View view) {
        try {
            if (view.getParent() instanceof View) {
                C0728a m3795b = C0758g.m3795b((View) view.getParent());
                f3425a.m3867a(view, m3795b.m3697a(), m3795b.m3698b());
            } else {
                C0728a m3795b2 = C0758g.m3795b(C0758g.m3794b(C0770h.m3844d(view)));
                f3425a.m3867a(view, m3795b2.m3697a(), m3795b2.m3698b());
            }
        } catch (Throwable th) {
            C0732b.m3725h("EventFilter", "bindViewListener e" + th);
        }
    }
}
