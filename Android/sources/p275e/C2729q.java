package p275e;

import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: e.q */
/* loaded from: classes.dex */
public final class C2729q implements InterfaceC2709D {

    /* renamed from: a */
    final /* synthetic */ C2711F f11415a;

    /* renamed from: b */
    final /* synthetic */ InputStream f11416b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C2729q(C2711F c2711f, InputStream inputStream) {
        this.f11415a = c2711f;
        this.f11416b = inputStream;
    }

    @Override // p275e.InterfaceC2709D, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f11416b.close();
    }

    @Override // p275e.InterfaceC2709D
    public long read(C2719g c2719g, long j) {
        if (j < 0) {
            throw new IllegalArgumentException("byteCount < 0: " + j);
        }
        if (j == 0) {
            return 0L;
        }
        try {
            this.f11415a.throwIfReached();
            C2738z m11690b = c2719g.m11690b(1);
            int read = this.f11416b.read(m11690b.f11437a, m11690b.f11439c, (int) Math.min(j, 8192 - m11690b.f11439c));
            if (read == -1) {
                return -1L;
            }
            m11690b.f11439c += read;
            long j2 = read;
            c2719g.f11390c += j2;
            return j2;
        } catch (AssertionError e2) {
            if (C2732t.m11746a(e2)) {
                throw new IOException(e2);
            }
            throw e2;
        }
    }

    @Override // p275e.InterfaceC2709D
    public C2711F timeout() {
        return this.f11415a;
    }

    public String toString() {
        return "source(" + this.f11416b + ")";
    }
}
