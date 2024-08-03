package p031c.p032a.p097w;

import android.content.Context;
import org.json.JSONObject;
import p031c.p032a.p057a.C0583a;
import p031c.p032a.p060d.C0601d;
import p031c.p032a.p061e.C0612k;
import p031c.p032a.p092s.InterfaceC0836l;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: c.a.w.b */
/* loaded from: classes.dex */
public final class C0856b extends Thread implements InterfaceC0836l {

    /* renamed from: a */
    final /* synthetic */ C0855a f3610a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0856b(C0855a c0855a) {
        this.f3610a = c0855a;
    }

    @Override // p031c.p032a.p092s.InterfaceC0836l
    /* renamed from: a */
    public final void mo2758a(int i) {
        C0601d.m3077f("JPushCrashHandler", "ReportDirect finish : " + i);
        if (i == 0) {
            C0855a.m4175a(C0583a.m2978a(null));
        }
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        JSONObject m4177d;
        try {
            Context m2978a = C0583a.m2978a(null);
            if (m2978a == null) {
                C0601d.m3077f("JPushCrashHandler", "ReportDirect context is null");
                return;
            }
            C0855a c0855a = this.f3610a;
            m4177d = C0855a.m4177d(m2978a);
            if (m4177d != null) {
                C0612k.m3137a(m2978a, m4177d, this);
            }
        } catch (Throwable th) {
            C0601d.m3079h("JPushCrashHandler", "run report crash e:" + th);
        }
    }
}
