package p275e;

import java.io.IOException;

/* renamed from: e.b */
/* loaded from: classes.dex */
public class C2714b implements InterfaceC2709D {

    /* renamed from: a */
    final /* synthetic */ InterfaceC2709D f11382a;

    /* renamed from: b */
    final /* synthetic */ C2715c f11383b;

    public C2714b(C2715c c2715c, InterfaceC2709D interfaceC2709D) {
        this.f11383b = c2715c;
        this.f11382a = interfaceC2709D;
    }

    @Override // p275e.InterfaceC2709D, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        try {
            try {
                this.f11382a.close();
                this.f11383b.exit(true);
            } catch (IOException e2) {
                throw this.f11383b.exit(e2);
            }
        } catch (Throwable th) {
            this.f11383b.exit(false);
            throw th;
        }
    }

    @Override // p275e.InterfaceC2709D
    public long read(C2719g c2719g, long j) {
        this.f11383b.enter();
        try {
            try {
                long read = this.f11382a.read(c2719g, j);
                this.f11383b.exit(true);
                return read;
            } catch (IOException e2) {
                throw this.f11383b.exit(e2);
            }
        } catch (Throwable th) {
            this.f11383b.exit(false);
            throw th;
        }
    }

    @Override // p275e.InterfaceC2709D
    public C2711F timeout() {
        return this.f11383b;
    }

    public String toString() {
        return "AsyncTimeout.source(" + this.f11382a + ")";
    }
}
