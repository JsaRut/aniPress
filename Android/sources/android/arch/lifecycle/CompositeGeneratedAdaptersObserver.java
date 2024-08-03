package android.arch.lifecycle;

import android.arch.lifecycle.AbstractC0144d;

/* loaded from: classes.dex */
public class CompositeGeneratedAdaptersObserver implements GenericLifecycleObserver {

    /* renamed from: a */
    private final InterfaceC0143c[] f560a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public CompositeGeneratedAdaptersObserver(InterfaceC0143c[] interfaceC0143cArr) {
        this.f560a = interfaceC0143cArr;
    }

    @Override // android.arch.lifecycle.GenericLifecycleObserver
    /* renamed from: a */
    public void mo675a(InterfaceC0146f interfaceC0146f, AbstractC0144d.a aVar) {
        C0152l c0152l = new C0152l();
        for (InterfaceC0143c interfaceC0143c : this.f560a) {
            interfaceC0143c.m709a(interfaceC0146f, aVar, false, c0152l);
        }
        for (InterfaceC0143c interfaceC0143c2 : this.f560a) {
            interfaceC0143c2.m709a(interfaceC0146f, aVar, true, c0152l);
        }
    }
}
