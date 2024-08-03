package p139d.p143b.p184i.p196j;

import java.io.Closeable;
import p139d.p143b.p148c.p153e.C1700a;

/* renamed from: d.b.i.j.b */
/* loaded from: classes.dex */
public abstract class AbstractC1918b implements Closeable, InterfaceC1921e {
    @Override // java.io.Closeable, java.lang.AutoCloseable
    public abstract void close();

    protected void finalize() {
        if (isClosed()) {
            return;
        }
        C1700a.m7014c("CloseableImage", "finalize: %s %x still open.", getClass().getSimpleName(), Integer.valueOf(System.identityHashCode(this)));
        try {
            close();
        } finally {
            super.finalize();
        }
    }

    public abstract boolean isClosed();

    /* renamed from: o */
    public InterfaceC1923g mo7891o() {
        return C1922f.f7079a;
    }

    /* renamed from: p */
    public abstract int mo7892p();

    /* renamed from: q */
    public boolean m7893q() {
        return false;
    }
}
