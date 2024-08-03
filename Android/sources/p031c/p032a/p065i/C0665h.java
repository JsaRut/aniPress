package p031c.p032a.p065i;

import android.content.Context;
import android.os.Message;
import p031c.p032a.p048P.p049a.C0556b;
import p031c.p032a.p066j.C0675a;
import p031c.p032a.p090q.AbstractC0808a;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: c.a.i.h */
/* loaded from: classes.dex */
public final class C0665h extends AbstractC0808a {

    /* renamed from: c */
    final /* synthetic */ C0664g f3075c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0665h(C0664g c0664g) {
        this.f3075c = c0664g;
    }

    @Override // p031c.p032a.p090q.AbstractC0808a
    /* renamed from: a */
    public final void mo3405a(Message message) {
        Context context;
        C0675a.m3469c("PeriodWorker", "time is up, next period=" + (C0556b.f2702b * 1000));
        C0664g c0664g = this.f3075c;
        context = c0664g.f3072c;
        c0664g.m3403c(context);
    }
}
