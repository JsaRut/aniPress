package android.support.v4.app;

import android.arch.lifecycle.AbstractC0144d;
import android.arch.lifecycle.C0148h;
import android.arch.lifecycle.InterfaceC0146f;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: android.support.v4.app.k */
/* loaded from: classes.dex */
public class C0204k implements InterfaceC0146f {

    /* renamed from: a */
    final /* synthetic */ ComponentCallbacksC0205l f780a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0204k(ComponentCallbacksC0205l componentCallbacksC0205l) {
        this.f780a = componentCallbacksC0205l;
    }

    @Override // android.arch.lifecycle.InterfaceC0146f
    /* renamed from: a */
    public AbstractC0144d mo714a() {
        ComponentCallbacksC0205l componentCallbacksC0205l = this.f780a;
        if (componentCallbacksC0205l.f804V == null) {
            componentCallbacksC0205l.f804V = new C0148h(componentCallbacksC0205l.f805W);
        }
        return this.f780a.f804V;
    }
}
