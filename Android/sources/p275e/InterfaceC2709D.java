package p275e;

import java.io.Closeable;

/* renamed from: e.D */
/* loaded from: classes.dex */
public interface InterfaceC2709D extends Closeable {
    @Override // java.io.Closeable, java.lang.AutoCloseable
    void close();

    long read(C2719g c2719g, long j);

    C2711F timeout();
}
