package p139d.p143b.p148c.p155g;

import java.io.IOException;
import java.io.OutputStream;
import p139d.p143b.p148c.p152d.C1699r;

/* renamed from: d.b.c.g.j */
/* loaded from: classes.dex */
public abstract class AbstractC1713j extends OutputStream {
    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        try {
            super.close();
        } catch (IOException e2) {
            C1699r.m6984a(e2);
            throw null;
        }
    }

    /* renamed from: m */
    public abstract InterfaceC1710g mo5043m();

    public abstract int size();
}
