package p031c.p032a.p051R;

import android.content.Context;
import java.util.concurrent.Callable;
import p031c.p032a.p052S.C0569a;
import p031c.p032a.p066j.C0675a;

/* renamed from: c.a.R.b */
/* loaded from: classes.dex */
final class CallableC0560b implements Callable<C0569a> {

    /* renamed from: a */
    final /* synthetic */ C0559a f2714a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public CallableC0560b(C0559a c0559a) {
        this.f2714a = c0559a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // java.util.concurrent.Callable
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public C0569a call() {
        Context context;
        try {
            context = this.f2714a.f2713b;
            C0562d c0562d = new C0562d(context);
            c0562d.m2941b();
            for (int i = 0; i < 20; i++) {
                C0569a m2940a = c0562d.m2940a();
                if (m2940a != null) {
                    return m2940a;
                }
                Thread.sleep(2000L);
            }
            return null;
        } catch (Throwable th) {
            C0675a.m3475g("JLocation", "JLocationCellInfo call failed:" + th.getMessage());
            return null;
        }
    }
}
