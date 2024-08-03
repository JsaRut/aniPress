package p275e;

import java.io.EOFException;
import java.io.IOException;
import java.util.zip.CRC32;
import java.util.zip.Inflater;

/* renamed from: e.n */
/* loaded from: classes.dex */
public final class C2726n implements InterfaceC2709D {

    /* renamed from: b */
    private final InterfaceC2721i f11405b;

    /* renamed from: c */
    private final Inflater f11406c;

    /* renamed from: d */
    private final C2727o f11407d;

    /* renamed from: a */
    private int f11404a = 0;

    /* renamed from: e */
    private final CRC32 f11408e = new CRC32();

    public C2726n(InterfaceC2709D interfaceC2709D) {
        if (interfaceC2709D == null) {
            throw new IllegalArgumentException("source == null");
        }
        this.f11406c = new Inflater(true);
        this.f11405b = C2732t.m11745a(interfaceC2709D);
        this.f11407d = new C2727o(this.f11405b, this.f11406c);
    }

    /* renamed from: a */
    private void m11731a(C2719g c2719g, long j, long j2) {
        C2738z c2738z = c2719g.f11389b;
        while (true) {
            int i = c2738z.f11439c;
            int i2 = c2738z.f11438b;
            if (j < i - i2) {
                break;
            }
            j -= i - i2;
            c2738z = c2738z.f11442f;
        }
        while (j2 > 0) {
            int min = (int) Math.min(c2738z.f11439c - r7, j2);
            this.f11408e.update(c2738z.f11437a, (int) (c2738z.f11438b + j), min);
            j2 -= min;
            c2738z = c2738z.f11442f;
            j = 0;
        }
    }

    /* renamed from: a */
    private void m11732a(String str, int i, int i2) {
        if (i2 != i) {
            throw new IOException(String.format("%s: actual 0x%08x != expected 0x%08x", str, Integer.valueOf(i2), Integer.valueOf(i)));
        }
    }

    /* renamed from: b */
    private void m11733b() {
        this.f11405b.mo11700f(10L);
        byte m11703h = this.f11405b.mo11674a().m11703h(3L);
        boolean z = ((m11703h >> 1) & 1) == 1;
        if (z) {
            m11731a(this.f11405b.mo11674a(), 0L, 10L);
        }
        m11732a("ID1ID2", 8075, this.f11405b.readShort());
        this.f11405b.skip(8L);
        if (((m11703h >> 2) & 1) == 1) {
            this.f11405b.mo11700f(2L);
            if (z) {
                m11731a(this.f11405b.mo11674a(), 0L, 2L);
            }
            long mo11706i = this.f11405b.mo11674a().mo11706i();
            this.f11405b.mo11700f(mo11706i);
            if (z) {
                m11731a(this.f11405b.mo11674a(), 0L, mo11706i);
            }
            this.f11405b.skip(mo11706i);
        }
        if (((m11703h >> 3) & 1) == 1) {
            long mo11669a = this.f11405b.mo11669a((byte) 0);
            if (mo11669a == -1) {
                throw new EOFException();
            }
            if (z) {
                m11731a(this.f11405b.mo11674a(), 0L, mo11669a + 1);
            }
            this.f11405b.skip(mo11669a + 1);
        }
        if (((m11703h >> 4) & 1) == 1) {
            long mo11669a2 = this.f11405b.mo11669a((byte) 0);
            if (mo11669a2 == -1) {
                throw new EOFException();
            }
            if (z) {
                m11731a(this.f11405b.mo11674a(), 0L, mo11669a2 + 1);
            }
            this.f11405b.skip(mo11669a2 + 1);
        }
        if (z) {
            m11732a("FHCRC", this.f11405b.mo11706i(), (short) this.f11408e.getValue());
            this.f11408e.reset();
        }
    }

    /* renamed from: e */
    private void m11734e() {
        m11732a("CRC", this.f11405b.mo11704h(), (int) this.f11408e.getValue());
        m11732a("ISIZE", this.f11405b.mo11704h(), (int) this.f11406c.getBytesWritten());
    }

    @Override // p275e.InterfaceC2709D, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f11407d.close();
    }

    @Override // p275e.InterfaceC2709D
    public long read(C2719g c2719g, long j) {
        if (j < 0) {
            throw new IllegalArgumentException("byteCount < 0: " + j);
        }
        if (j == 0) {
            return 0L;
        }
        if (this.f11404a == 0) {
            m11733b();
            this.f11404a = 1;
        }
        if (this.f11404a == 1) {
            long j2 = c2719g.f11390c;
            long read = this.f11407d.read(c2719g, j);
            if (read != -1) {
                m11731a(c2719g, j2, read);
                return read;
            }
            this.f11404a = 2;
        }
        if (this.f11404a == 2) {
            m11734e();
            this.f11404a = 3;
            if (!this.f11405b.mo11695d()) {
                throw new IOException("gzip finished without exhausting source");
            }
        }
        return -1L;
    }

    @Override // p275e.InterfaceC2709D
    public C2711F timeout() {
        return this.f11405b.timeout();
    }
}
