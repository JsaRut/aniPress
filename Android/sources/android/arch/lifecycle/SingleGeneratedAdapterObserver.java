package android.arch.lifecycle;

import android.arch.lifecycle.AbstractC0144d;

/* loaded from: classes.dex */
public class SingleGeneratedAdapterObserver implements GenericLifecycleObserver {

    /* renamed from: a */
    private final InterfaceC0143c f580a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public SingleGeneratedAdapterObserver(InterfaceC0143c interfaceC0143c) {
        this.f580a = interfaceC0143c;
    }

    @Override // android.arch.lifecycle.GenericLifecycleObserver
    /* renamed from: a */
    public void mo675a(InterfaceC0146f interfaceC0146f, AbstractC0144d.a aVar) {
        this.f580a.m709a(interfaceC0146f, aVar, false, null);
        this.f580a.m709a(interfaceC0146f, aVar, true, null);
    }
}
