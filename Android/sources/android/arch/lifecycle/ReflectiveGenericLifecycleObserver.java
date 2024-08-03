package android.arch.lifecycle;

import android.arch.lifecycle.AbstractC0144d;
import android.arch.lifecycle.C0141a;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class ReflectiveGenericLifecycleObserver implements GenericLifecycleObserver {

    /* renamed from: a */
    private final Object f578a;

    /* renamed from: b */
    private final C0141a.a f579b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public ReflectiveGenericLifecycleObserver(Object obj) {
        this.f578a = obj;
        this.f579b = C0141a.f581a.m704a(this.f578a.getClass());
    }

    @Override // android.arch.lifecycle.GenericLifecycleObserver
    /* renamed from: a */
    public void mo675a(InterfaceC0146f interfaceC0146f, AbstractC0144d.a aVar) {
        this.f579b.m707a(interfaceC0146f, aVar, this.f578a);
    }
}
