package p275e;

import java.io.EOFException;
import java.io.IOException;
import java.util.zip.DataFormatException;
import java.util.zip.Inflater;

/* renamed from: e.o */
/* loaded from: classes.dex */
public final class C2727o implements InterfaceC2709D {

    /* renamed from: a */
    private final InterfaceC2721i f11409a;

    /* renamed from: b */
    private final Inflater f11410b;

    /* renamed from: c */
    private int f11411c;

    /* renamed from: d */
    private boolean f11412d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C2727o(InterfaceC2721i interfaceC2721i, Inflater inflater) {
        if (interfaceC2721i == null) {
            throw new IllegalArgumentException("source == null");
        }
        if (inflater == null) {
            throw new IllegalArgumentException("inflater == null");
        }
        this.f11409a = interfaceC2721i;
        this.f11410b = inflater;
    }

    /* renamed from: e */
    private void m11735e() {
        int i = this.f11411c;
        if (i == 0) {
            return;
        }
        int remaining = i - this.f11410b.getRemaining();
        this.f11411c -= remaining;
        this.f11409a.skip(remaining);
    }

    /* renamed from: b */
    public final boolean m11736b() {
        if (!this.f11410b.needsInput()) {
            return false;
        }
        m11735e();
        if (this.f11410b.getRemaining() != 0) {
            throw new IllegalStateException("?");
        }
        if (this.f11409a.mo11695d()) {
            return true;
        }
        C2738z c2738z = this.f11409a.mo11674a().f11389b;
        int i = c2738z.f11439c;
        int i2 = c2738z.f11438b;
        this.f11411c = i - i2;
        this.f11410b.setInput(c2738z.f11437a, i2, this.f11411c);
        return false;
    }

    @Override // p275e.InterfaceC2709D, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        if (this.f11412d) {
            return;
        }
        this.f11410b.end();
        this.f11412d = true;
        this.f11409a.close();
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // p275e.InterfaceC2709D
    public long read(C2719g c2719g, long j) {
        boolean m11736b;
        if (j < 0) {
            throw new IllegalArgumentException("byteCount < 0: " + j);
        }
        if (this.f11412d) {
            throw new IllegalStateException("closed");
        }
        if (j == 0) {
            return 0L;
        }
        do {
            m11736b = m11736b();
            try {
                C2738z m11690b = c2719g.m11690b(1);
                int inflate = this.f11410b.inflate(m11690b.f11437a, m11690b.f11439c, (int) Math.min(j, 8192 - m11690b.f11439c));
                if (inflate > 0) {
                    m11690b.f11439c += inflate;
                    long j2 = inflate;
                    c2719g.f11390c += j2;
                    return j2;
                }
                if (!this.f11410b.finished() && !this.f11410b.needsDictionary()) {
                }
                m11735e();
                if (m11690b.f11438b != m11690b.f11439c) {
                    return -1L;
                }
                c2719g.f11389b = m11690b.m11759b();
                C2706A.m11641a(m11690b);
                return -1L;
            } catch (DataFormatException e2) {
                throw new IOException(e2);
            }
        } while (!m11736b);
        throw new EOFException("source exhausted prematurely");
    }

    @Override // p275e.InterfaceC2709D
    public C2711F timeout() {
        return this.f11409a.timeout();
    }
}
