package p275e;

import java.io.OutputStream;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: e.p */
/* loaded from: classes.dex */
public final class C2728p implements InterfaceC2708C {

    /* renamed from: a */
    final /* synthetic */ C2711F f11413a;

    /* renamed from: b */
    final /* synthetic */ OutputStream f11414b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C2728p(C2711F c2711f, OutputStream outputStream) {
        this.f11413a = c2711f;
        this.f11414b = outputStream;
    }

    @Override // p275e.InterfaceC2708C, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f11414b.close();
    }

    @Override // p275e.InterfaceC2708C, java.io.Flushable
    public void flush() {
        this.f11414b.flush();
    }

    @Override // p275e.InterfaceC2708C
    public C2711F timeout() {
        return this.f11413a;
    }

    public String toString() {
        return "sink(" + this.f11414b + ")";
    }

    @Override // p275e.InterfaceC2708C
    public void write(C2719g c2719g, long j) {
        C2712G.m11661a(c2719g.f11390c, 0L, j);
        while (j > 0) {
            this.f11413a.throwIfReached();
            C2738z c2738z = c2719g.f11389b;
            int min = (int) Math.min(j, c2738z.f11439c - c2738z.f11438b);
            this.f11414b.write(c2738z.f11437a, c2738z.f11438b, min);
            c2738z.f11438b += min;
            long j2 = min;
            j -= j2;
            c2719g.f11390c -= j2;
            if (c2738z.f11438b == c2738z.f11439c) {
                c2719g.f11389b = c2738z.m11759b();
                C2706A.m11641a(c2738z);
            }
        }
    }
}
