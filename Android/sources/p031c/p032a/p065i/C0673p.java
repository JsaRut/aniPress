package p031c.p032a.p065i;

import android.content.Context;
import android.os.Bundle;
import android.os.Message;
import p031c.p032a.p090q.AbstractC0808a;
import p031c.p032a.p092s.C0831g;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: c.a.i.p */
/* loaded from: classes.dex */
public final class C0673p extends AbstractC0808a {

    /* renamed from: c */
    final /* synthetic */ C0672o f3120c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0673p(C0672o c0672o) {
        this.f3120c = c0672o;
    }

    @Override // p031c.p032a.p090q.AbstractC0808a
    /* renamed from: a */
    public final void mo3405a(Message message) {
        long j = message.what - 100000;
        Bundle bundle = new Bundle();
        bundle.putLong("rid", j);
        C0666i.m3408a().m3426a(C0831g.m4071a((Context) null), "tcp_a6", bundle);
    }
}
