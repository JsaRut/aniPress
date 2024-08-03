package p031c.p032a.p072p.p073a.p074a;

import p031c.p032a.p072p.p073a.C0707b;
import p031c.p032a.p072p.p073a.p080f.p081a.C0732b;
import p031c.p032a.p072p.p073a.p088g.C0784l;
import p031c.p032a.p092s.C0835k;

/* renamed from: c.a.p.a.a.i */
/* loaded from: classes.dex */
public final class C0699i extends AbstractRunnableC0704n {
    @Override // p031c.p032a.p072p.p073a.p074a.AbstractRunnableC0704n
    /* renamed from: a */
    public final int mo3579a() {
        int m4092b = C0835k.m4092b(C0707b.m3613a(null), "analytics_report_period", 0);
        if (m4092b == 0) {
            return 0;
        }
        if (m4092b < 10) {
            return 10;
        }
        if (m4092b > 86400) {
            return 86400;
        }
        return m4092b;
    }

    @Override // p031c.p032a.p072p.p073a.p074a.AbstractRunnableC0704n
    /* renamed from: a */
    public final boolean mo3580a(int i) {
        if (i != 0 && (i < 10 || i > 86400)) {
            C0732b.m3724g("JAnalyticsInterface", "period should be in [10,86400]");
            return false;
        }
        if (i == mo3579a()) {
            return false;
        }
        C0835k.m4091a(C0707b.m3613a(null), "analytics_report_period", i);
        return true;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C0705o.m3605b().m3610d();
        C0784l.m3878a().m3884a(C0707b.m3613a(null));
    }
}
