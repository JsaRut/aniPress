package p275e;

import java.io.Closeable;
import java.io.Flushable;

/* renamed from: e.C */
/* loaded from: classes.dex */
public interface InterfaceC2708C extends Closeable, Flushable {
    @Override // java.io.Closeable, java.lang.AutoCloseable
    void close();

    @Override // java.io.Flushable
    void flush();

    C2711F timeout();

    void write(C2719g c2719g, long j);
}
