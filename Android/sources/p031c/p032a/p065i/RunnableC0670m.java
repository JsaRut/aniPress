package p031c.p032a.p065i;

import android.content.Context;
import android.os.Message;
import p031c.p032a.p048P.p049a.C0556b;
import p031c.p032a.p063g.C0626h;
import p031c.p032a.p066j.C0675a;
import p031c.p032a.p090q.AbstractC0808a;
import p031c.p032a.p092s.C0831g;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: c.a.i.m */
/* loaded from: classes.dex */
public final class RunnableC0670m extends AbstractC0808a implements Runnable {

    /* renamed from: c */
    private Context f3101c;

    /* renamed from: d */
    private int f3102d;

    /* renamed from: e */
    private final Object f3103e;

    /* renamed from: f */
    private int f3104f;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC0670m(Context context, int i, Object obj) {
        this.f3101c = context;
        this.f3102d = i;
        this.f3103e = obj;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC0670m(Context context, Object obj) {
        this.f3101c = context;
        this.f3103e = obj;
    }

    @Override // p031c.p032a.p090q.AbstractC0808a
    /* renamed from: a */
    public final void mo3405a(Message message) {
        int i = message.what;
        if (i >= 60000) {
            if (this.f3103e instanceof C0626h) {
                C0675a.m3469c("TcpReporter", "time to idle=" + this.f3103e);
                C0669l.m3442a(C0669l.m3433a(), this.f3101c, (C0626h) this.f3103e, 0);
                return;
            }
            return;
        }
        if (i >= 50000) {
            Object obj = this.f3103e;
            if (obj instanceof C0671n) {
                C0671n c0671n = (C0671n) obj;
                C0675a.m3469c("TcpReporter", "onTimeout=" + c0671n);
                C0669l.m3436a(C0669l.m3433a(), c0671n.f3111g, c0671n.f3110f);
                C0669l.m3433a().m3446a(this.f3101c, c0671n);
            }
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            int i = this.f3102d;
            if (i != 1) {
                if (i != 2) {
                    if (i == 3 && (this.f3103e instanceof C0671n)) {
                        C0671n c0671n = (C0671n) this.f3103e;
                        C0675a.m3469c("TcpReporter", "onResult, data=" + c0671n + " code=" + this.f3104f);
                        C0831g.m4072a(this.f3101c, C0556b.f2704d, 61, "", null, Integer.valueOf(this.f3104f), c0671n.f3106b, c0671n.f3107c, Integer.valueOf(c0671n.f3105a), c0671n.f3108d, c0671n.f3109e, c0671n.f3114j);
                    }
                } else if (this.f3103e instanceof C0626h) {
                    C0669l.m3445b(C0669l.m3433a(), this.f3101c, (C0626h) this.f3103e);
                }
            } else if (this.f3103e instanceof C0626h) {
                C0669l.m3441a(C0669l.m3433a(), this.f3101c, (C0626h) this.f3103e);
            }
        } catch (Throwable unused) {
        }
    }
}
