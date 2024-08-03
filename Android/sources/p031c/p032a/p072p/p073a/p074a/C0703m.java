package p031c.p032a.p072p.p073a.p074a;

import android.content.Context;
import p031c.p032a.p072p.p073a.p080f.p081a.C0732b;
import p031c.p032a.p072p.p073a.p080f.p087g.C0766h;
import p031c.p032a.p092s.InterfaceC0828d;

/* renamed from: c.a.p.a.a.m */
/* loaded from: classes.dex */
public final class C0703m implements InterfaceC0828d {

    /* renamed from: a */
    final /* synthetic */ C0700j f3220a;

    public C0703m(C0700j c0700j) {
        this.f3220a = c0700j;
    }

    @Override // p031c.p032a.p092s.InterfaceC0828d
    /* renamed from: a */
    public final void mo3600a(Context context) {
        C0705o.m3605b().m3612f();
    }

    @Override // p031c.p032a.p092s.InterfaceC0828d
    /* renamed from: a */
    public final void mo3601a(Context context, String str) {
        if (C0766h.m3815a(str)) {
            C0732b.m3716a("SessionManager", "status name was empty");
            return;
        }
        C0732b.m3716a("SessionManager", "statusName:" + str);
        if (str.equals("onStop")) {
            return;
        }
        C0705o.m3605b().m3611e();
    }

    @Override // p031c.p032a.p092s.InterfaceC0828d
    /* renamed from: b */
    public final void mo3602b(Context context) {
        C0705o.m3605b().m3611e();
    }
}
