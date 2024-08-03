package p031c.p032a.p051R;

import android.content.Context;
import java.util.concurrent.Callable;
import p031c.p032a.p052S.C0570b;
import p031c.p032a.p066j.C0675a;

/* renamed from: c.a.R.c */
/* loaded from: classes.dex */
final class CallableC0561c implements Callable<C0570b> {

    /* renamed from: a */
    final /* synthetic */ C0559a f2715a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public CallableC0561c(C0559a c0559a) {
        this.f2715a = c0559a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // java.util.concurrent.Callable
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public C0570b call() {
        Context context;
        try {
            context = this.f2715a.f2713b;
            C0564f m2942a = C0564f.m2942a(context);
            m2942a.m2955c();
            for (int i = 0; i < 30; i++) {
                if (m2942a.m2954b()) {
                    return m2942a.m2953a();
                }
                Thread.sleep(1000L);
            }
            return null;
        } catch (Throwable th) {
            C0675a.m3475g("JLocation", "JLocationGpsInfo call failed:" + th.getMessage());
            return null;
        }
    }
}
