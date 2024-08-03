package p275e;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: e.r */
/* loaded from: classes.dex */
public final class C2730r implements InterfaceC2708C {
    @Override // p275e.InterfaceC2708C, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
    }

    @Override // p275e.InterfaceC2708C, java.io.Flushable
    public void flush() {
    }

    @Override // p275e.InterfaceC2708C
    public C2711F timeout() {
        return C2711F.NONE;
    }

    @Override // p275e.InterfaceC2708C
    public void write(C2719g c2719g, long j) {
        c2719g.skip(j);
    }
}
