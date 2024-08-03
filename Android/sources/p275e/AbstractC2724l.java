package p275e;

/* renamed from: e.l */
/* loaded from: classes.dex */
public abstract class AbstractC2724l implements InterfaceC2709D {
    private final InterfaceC2709D delegate;

    public AbstractC2724l(InterfaceC2709D interfaceC2709D) {
        if (interfaceC2709D == null) {
            throw new IllegalArgumentException("delegate == null");
        }
        this.delegate = interfaceC2709D;
    }

    @Override // p275e.InterfaceC2709D, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.delegate.close();
    }

    public final InterfaceC2709D delegate() {
        return this.delegate;
    }

    @Override // p275e.InterfaceC2709D
    public long read(C2719g c2719g, long j) {
        return this.delegate.read(c2719g, j);
    }

    @Override // p275e.InterfaceC2709D
    public C2711F timeout() {
        return this.delegate.timeout();
    }

    public String toString() {
        return getClass().getSimpleName() + "(" + this.delegate.toString() + ")";
    }
}
