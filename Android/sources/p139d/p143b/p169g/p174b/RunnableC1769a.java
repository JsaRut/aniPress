package p139d.p143b.p169g.p174b;

import java.util.Iterator;
import java.util.Set;
import p139d.p143b.p169g.p174b.C1770b;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: d.b.g.b.a */
/* loaded from: classes.dex */
public class RunnableC1769a implements Runnable {

    /* renamed from: a */
    final /* synthetic */ C1770b f6416a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC1769a(C1770b c1770b) {
        this.f6416a = c1770b;
    }

    @Override // java.lang.Runnable
    public void run() {
        Set set;
        Set set2;
        C1770b.m7249c();
        set = this.f6416a.f6418b;
        Iterator it = set.iterator();
        while (it.hasNext()) {
            ((C1770b.a) it.next()).mo7252a();
        }
        set2 = this.f6416a.f6418b;
        set2.clear();
    }
}
