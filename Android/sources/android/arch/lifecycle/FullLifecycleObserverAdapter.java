package android.arch.lifecycle;

import android.arch.lifecycle.AbstractC0144d;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class FullLifecycleObserverAdapter implements GenericLifecycleObserver {

    /* renamed from: a */
    private final FullLifecycleObserver f561a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public FullLifecycleObserverAdapter(FullLifecycleObserver fullLifecycleObserver) {
        this.f561a = fullLifecycleObserver;
    }

    @Override // android.arch.lifecycle.GenericLifecycleObserver
    /* renamed from: a */
    public void mo675a(InterfaceC0146f interfaceC0146f, AbstractC0144d.a aVar) {
        switch (C0142b.f588a[aVar.ordinal()]) {
            case 1:
                this.f561a.m679d(interfaceC0146f);
                return;
            case 2:
                this.f561a.m676a(interfaceC0146f);
                return;
            case 3:
                this.f561a.m680e(interfaceC0146f);
                return;
            case 4:
                this.f561a.m677b(interfaceC0146f);
                return;
            case 5:
                this.f561a.m681f(interfaceC0146f);
                return;
            case 6:
                this.f561a.m678c(interfaceC0146f);
                return;
            case 7:
                throw new IllegalArgumentException("ON_ANY must not been send by anybody");
            default:
                return;
        }
    }
}
