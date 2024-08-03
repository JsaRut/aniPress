package p139d.p143b.p184i.p200n;

import android.util.Pair;
import p139d.p143b.p184i.p200n.C1944Fa;

/* renamed from: d.b.i.n.Ea */
/* loaded from: classes.dex */
public class RunnableC1942Ea implements Runnable {

    /* renamed from: a */
    final /* synthetic */ Pair f7121a;

    /* renamed from: b */
    final /* synthetic */ C1944Fa.a f7122b;

    public RunnableC1942Ea(C1944Fa.a aVar, Pair pair) {
        this.f7122b = aVar;
        this.f7121a = pair;
    }

    @Override // java.lang.Runnable
    public void run() {
        C1944Fa c1944Fa = C1944Fa.this;
        Pair pair = this.f7121a;
        c1944Fa.m7976b((InterfaceC1995n) pair.first, (InterfaceC1998oa) pair.second);
    }
}
