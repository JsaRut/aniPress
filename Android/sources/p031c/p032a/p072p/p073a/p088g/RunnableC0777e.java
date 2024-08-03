package p031c.p032a.p072p.p073a.p088g;

import android.content.Context;
import p031c.p032a.p072p.p073a.p080f.p081a.C0732b;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: c.a.p.a.g.e */
/* loaded from: classes.dex */
public final class RunnableC0777e implements Runnable {

    /* renamed from: a */
    final /* synthetic */ Context f3427a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC0777e(Context context) {
        this.f3427a = context;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String m3847a = C0773a.m3847a();
        C0732b.m3718b("EventFilter", "xxx_fetchFilter from http : " + m3847a);
        C0776d.m3858a(0L);
        C0778f m3864a = C0778f.m3864a(m3847a);
        if (m3864a != null) {
            C0775c.m3853a(this.f3427a, m3847a, System.currentTimeMillis());
            C0778f unused = C0776d.f3425a = m3864a;
        }
    }
}
