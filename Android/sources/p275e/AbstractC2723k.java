package p275e;

/* renamed from: e.k */
/* loaded from: classes.dex */
public abstract class AbstractC2723k implements InterfaceC2708C {
    private final InterfaceC2708C delegate;

    public AbstractC2723k(InterfaceC2708C interfaceC2708C) {
        if (interfaceC2708C == null) {
            throw new IllegalArgumentException("delegate == null");
        }
        this.delegate = interfaceC2708C;
    }

    @Override // p275e.InterfaceC2708C, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.delegate.close();
    }

    public final InterfaceC2708C delegate() {
        return this.delegate;
    }

    @Override // p275e.InterfaceC2708C, java.io.Flushable
    public void flush() {
        this.delegate.flush();
    }

    @Override // p275e.InterfaceC2708C
    public C2711F timeout() {
        return this.delegate.timeout();
    }

    public String toString() {
        return getClass().getSimpleName() + "(" + this.delegate.toString() + ")";
    }

    @Override // p275e.InterfaceC2708C
    public void write(C2719g c2719g, long j) {
        this.delegate.write(c2719g, j);
    }
}
