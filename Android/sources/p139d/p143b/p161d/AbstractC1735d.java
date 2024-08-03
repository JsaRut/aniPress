package p139d.p143b.p161d;

/* renamed from: d.b.d.d */
/* loaded from: classes.dex */
public abstract class AbstractC1735d<T> implements InterfaceC1739h<T> {
    @Override // p139d.p143b.p161d.InterfaceC1739h
    /* renamed from: a */
    public void mo7123a(InterfaceC1736e<T> interfaceC1736e) {
    }

    @Override // p139d.p143b.p161d.InterfaceC1739h
    /* renamed from: b */
    public void mo7124b(InterfaceC1736e<T> interfaceC1736e) {
        try {
            mo5357e(interfaceC1736e);
        } finally {
            interfaceC1736e.close();
        }
    }

    @Override // p139d.p143b.p161d.InterfaceC1739h
    /* renamed from: c */
    public void mo7125c(InterfaceC1736e<T> interfaceC1736e) {
        boolean mo7117b = interfaceC1736e.mo7117b();
        try {
            mo5358f(interfaceC1736e);
        } finally {
            if (mo7117b) {
                interfaceC1736e.close();
            }
        }
    }

    @Override // p139d.p143b.p161d.InterfaceC1739h
    /* renamed from: d */
    public void mo7126d(InterfaceC1736e<T> interfaceC1736e) {
    }

    /* renamed from: e */
    protected abstract void mo5357e(InterfaceC1736e<T> interfaceC1736e);

    /* renamed from: f */
    protected abstract void mo5358f(InterfaceC1736e<T> interfaceC1736e);
}
