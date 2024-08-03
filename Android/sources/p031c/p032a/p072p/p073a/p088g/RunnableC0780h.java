package p031c.p032a.p072p.p073a.p088g;

import android.view.View;

/* renamed from: c.a.p.a.g.h */
/* loaded from: classes.dex */
final class RunnableC0780h implements Runnable {

    /* renamed from: a */
    final /* synthetic */ View f3429a;

    /* renamed from: b */
    final /* synthetic */ ViewGroupOnHierarchyChangeListenerC0779g f3430b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC0780h(ViewGroupOnHierarchyChangeListenerC0779g viewGroupOnHierarchyChangeListenerC0779g, View view) {
        this.f3430b = viewGroupOnHierarchyChangeListenerC0779g;
        this.f3429a = view;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C0776d.m3863a(this.f3429a);
    }
}
