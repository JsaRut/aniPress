package p139d.p143b.p184i.p200n;

import p139d.p143b.p148c.p156h.C1716b;
import p139d.p143b.p184i.p196j.AbstractC1918b;
import p139d.p143b.p184i.p200n.C1992la;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: d.b.i.n.ka */
/* loaded from: classes.dex */
public class RunnableC1990ka implements Runnable {

    /* renamed from: a */
    final /* synthetic */ C1992la.a f7264a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC1990ka(C1992la.a aVar) {
        this.f7264a = aVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        C1716b c1716b;
        int i;
        synchronized (this.f7264a) {
            c1716b = this.f7264a.f7272g;
            i = this.f7264a.f7273h;
            this.f7264a.f7272g = null;
            this.f7264a.f7274i = false;
        }
        if (C1716b.m7046c(c1716b)) {
            try {
                this.f7264a.m8145b((C1716b<AbstractC1918b>) c1716b, i);
            } finally {
                C1716b.m7045b(c1716b);
            }
        }
        this.f7264a.m8150d();
    }
}
