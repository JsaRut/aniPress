package p031c.p032a.p065i;

import android.content.Context;
import android.os.Bundle;
import android.os.Message;
import p031c.p032a.p090q.AbstractC0808a;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: c.a.i.j */
/* loaded from: classes.dex */
public final class C0667j extends AbstractC0808a {

    /* renamed from: c */
    final /* synthetic */ C0666i f3090c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0667j(C0666i c0666i) {
        this.f3090c = c0666i;
    }

    @Override // p031c.p032a.p090q.AbstractC0808a
    /* renamed from: a */
    public final void mo3405a(Message message) {
        Context context;
        Context context2;
        Context context3;
        Context context4;
        Context context5;
        Context context6;
        if (message != null) {
            int i = message.what;
            if (i == 1011) {
                C0666i c0666i = this.f3090c;
                context = c0666i.f3086k;
                c0666i.m3426a(context, "tcp_a14", null);
                return;
            }
            if (i == 1022) {
                C0666i c0666i2 = this.f3090c;
                context2 = c0666i2.f3086k;
                c0666i2.m3426a(context2, "tcp_a17", null);
                return;
            }
            if (i == 2000) {
                C0674q m3457a = C0674q.m3457a();
                context3 = this.f3090c.f3086k;
                m3457a.m3461a(context3);
                return;
            }
            switch (i) {
                case 1004:
                    Bundle bundle = new Bundle();
                    bundle.putBoolean("force", true);
                    C0666i c0666i3 = this.f3090c;
                    context4 = c0666i3.f3086k;
                    c0666i3.m3426a(context4, "tcp_a16", bundle);
                    return;
                case 1005:
                    Bundle bundle2 = new Bundle();
                    bundle2.putBoolean("force", false);
                    C0666i c0666i4 = this.f3090c;
                    context5 = c0666i4.f3086k;
                    c0666i4.m3426a(context5, "tcp_a16", bundle2);
                    return;
                case 1006:
                case 1007:
                    C0666i c0666i5 = this.f3090c;
                    context6 = c0666i5.f3086k;
                    c0666i5.m3426a(context6, "tcp_a2", null);
                    return;
                default:
                    return;
            }
        }
    }
}
