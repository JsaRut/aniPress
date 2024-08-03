package p031c.p032a.p064h;

import android.util.Pair;
import java.util.LinkedHashSet;
import java.util.concurrent.Callable;
import p031c.p032a.p063g.C0626h;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: c.a.h.n */
/* loaded from: classes.dex */
public final class CallableC0654n implements Callable<LinkedHashSet<C0626h>> {

    /* renamed from: a */
    private String f3045a;

    /* renamed from: b */
    private C0653m f3046b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public CallableC0654n(String str, C0653m c0653m) {
        this.f3045a = str;
        this.f3046b = c0653m;
    }

    @Override // java.util.concurrent.Callable
    public final /* synthetic */ LinkedHashSet<C0626h> call() {
        LinkedHashSet<C0626h> m3359a = C0653m.m3359a(this.f3045a);
        if (m3359a != null && m3359a.size() > 0) {
            C0653m.m3360a(this.f3046b, this.f3045a, new Pair(m3359a, Long.valueOf(System.currentTimeMillis())));
        }
        return m3359a;
    }
}
