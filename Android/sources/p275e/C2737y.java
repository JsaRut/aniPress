package p275e;

import java.io.EOFException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: e.y */
/* loaded from: classes.dex */
public final class C2737y implements InterfaceC2721i {

    /* renamed from: a */
    public final C2719g f11434a = new C2719g();

    /* renamed from: b */
    public final InterfaceC2709D f11435b;

    /* renamed from: c */
    boolean f11436c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C2737y(InterfaceC2709D interfaceC2709D) {
        if (interfaceC2709D == null) {
            throw new NullPointerException("source == null");
        }
        this.f11435b = interfaceC2709D;
    }

    @Override // p275e.InterfaceC2721i
    /* renamed from: a */
    public long mo11669a(byte b2) {
        return m11753a(b2, 0L, Long.MAX_VALUE);
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* renamed from: a */
    public long m11753a(byte b2, long j, long j2) {
        if (this.f11436c) {
            throw new IllegalStateException("closed");
        }
        if (j < 0 || j2 < j) {
            throw new IllegalArgumentException(String.format("fromIndex=%s toIndex=%s", Long.valueOf(j), Long.valueOf(j2)));
        }
        while (j < j2) {
            long m11670a = this.f11434a.m11670a(b2, j, j2);
            if (m11670a == -1) {
                C2719g c2719g = this.f11434a;
                long j3 = c2719g.f11390c;
                if (j3 >= j2 || this.f11435b.read(c2719g, 8192L) == -1) {
                    break;
                }
                j = Math.max(j, j3);
            } else {
                return m11670a;
            }
        }
        return -1L;
    }

    @Override // p275e.InterfaceC2721i, p275e.InterfaceC2720h
    /* renamed from: a */
    public C2719g mo11674a() {
        return this.f11434a;
    }

    @Override // p275e.InterfaceC2721i
    /* renamed from: a */
    public C2722j mo11682a(long j) {
        mo11700f(j);
        return this.f11434a.mo11682a(j);
    }

    @Override // p275e.InterfaceC2721i
    /* renamed from: a */
    public String mo11684a(Charset charset) {
        if (charset == null) {
            throw new IllegalArgumentException("charset == null");
        }
        this.f11434a.mo11671a(this.f11435b);
        return this.f11434a.mo11684a(charset);
    }

    @Override // p275e.InterfaceC2721i
    /* renamed from: a */
    public void mo11685a(C2719g c2719g, long j) {
        try {
            mo11700f(j);
            this.f11434a.mo11685a(c2719g, j);
        } catch (EOFException e2) {
            c2719g.mo11671a(this.f11434a);
            throw e2;
        }
    }

    @Override // p275e.InterfaceC2721i
    /* renamed from: a */
    public boolean mo11686a(long j, C2722j c2722j) {
        return m11754a(j, c2722j, 0, c2722j.mo11655h());
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* renamed from: a */
    public boolean m11754a(long j, C2722j c2722j, int i, int i2) {
        if (this.f11436c) {
            throw new IllegalStateException("closed");
        }
        if (j < 0 || i < 0 || i2 < 0 || c2722j.mo11655h() - i < i2) {
            return false;
        }
        for (int i3 = 0; i3 < i2; i3++) {
            long j2 = i3 + j;
            if (!mo11696d(1 + j2) || this.f11434a.m11703h(j2) != c2722j.mo11644a(i + i3)) {
                return false;
            }
        }
        return true;
    }

    @Override // p275e.InterfaceC2721i
    /* renamed from: b */
    public String mo11691b(long j) {
        if (j < 0) {
            throw new IllegalArgumentException("limit < 0: " + j);
        }
        long j2 = j == Long.MAX_VALUE ? Long.MAX_VALUE : j + 1;
        long m11753a = m11753a((byte) 10, 0L, j2);
        if (m11753a != -1) {
            return this.f11434a.m11708j(m11753a);
        }
        if (j2 < Long.MAX_VALUE && mo11696d(j2) && this.f11434a.m11703h(j2 - 1) == 13 && mo11696d(1 + j2) && this.f11434a.m11703h(j2) == 10) {
            return this.f11434a.m11708j(j2);
        }
        C2719g c2719g = new C2719g();
        C2719g c2719g2 = this.f11434a;
        c2719g2.m11675a(c2719g, 0L, Math.min(32L, c2719g2.size()));
        throw new EOFException("\\n not found: limit=" + Math.min(this.f11434a.size(), j) + " content=" + c2719g.m11714o().mo11650c() + (char) 8230);
    }

    @Override // p275e.InterfaceC2721i
    /* renamed from: c */
    public byte[] mo11694c() {
        this.f11434a.mo11671a(this.f11435b);
        return this.f11434a.mo11694c();
    }

    @Override // p275e.InterfaceC2709D, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        if (this.f11436c) {
            return;
        }
        this.f11436c = true;
        this.f11435b.close();
        this.f11434a.m11712m();
    }

    @Override // p275e.InterfaceC2721i
    /* renamed from: d */
    public boolean mo11695d() {
        if (this.f11436c) {
            throw new IllegalStateException("closed");
        }
        return this.f11434a.mo11695d() && this.f11435b.read(this.f11434a, 8192L) == -1;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // p275e.InterfaceC2721i
    /* renamed from: d */
    public boolean mo11696d(long j) {
        C2719g c2719g;
        if (j < 0) {
            throw new IllegalArgumentException("byteCount < 0: " + j);
        }
        if (this.f11436c) {
            throw new IllegalStateException("closed");
        }
        do {
            c2719g = this.f11434a;
            if (c2719g.f11390c >= j) {
                return true;
            }
        } while (this.f11435b.read(c2719g, 8192L) != -1);
        return false;
    }

    @Override // p275e.InterfaceC2721i
    /* renamed from: e */
    public byte[] mo11698e(long j) {
        mo11700f(j);
        return this.f11434a.mo11698e(j);
    }

    @Override // p275e.InterfaceC2721i
    /* renamed from: f */
    public long mo11699f() {
        byte m11703h;
        mo11700f(1L);
        int i = 0;
        while (true) {
            int i2 = i + 1;
            if (!mo11696d(i2)) {
                break;
            }
            m11703h = this.f11434a.m11703h(i);
            if ((m11703h < 48 || m11703h > 57) && !(i == 0 && m11703h == 45)) {
                break;
            }
            i = i2;
        }
        if (i == 0) {
            throw new NumberFormatException(String.format("Expected leading [0-9] or '-' character but was %#x", Byte.valueOf(m11703h)));
        }
        return this.f11434a.mo11699f();
    }

    @Override // p275e.InterfaceC2721i
    /* renamed from: f */
    public void mo11700f(long j) {
        if (!mo11696d(j)) {
            throw new EOFException();
        }
    }

    @Override // p275e.InterfaceC2721i
    /* renamed from: g */
    public String mo11702g() {
        return mo11691b(Long.MAX_VALUE);
    }

    @Override // p275e.InterfaceC2721i
    /* renamed from: h */
    public int mo11704h() {
        mo11700f(4L);
        return this.f11434a.mo11704h();
    }

    @Override // p275e.InterfaceC2721i
    /* renamed from: i */
    public short mo11706i() {
        mo11700f(2L);
        return this.f11434a.mo11706i();
    }

    @Override // java.nio.channels.Channel
    public boolean isOpen() {
        return !this.f11436c;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0032, code lost:            if (r1 == 0) goto L21;     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0049, code lost:            throw new java.lang.NumberFormatException(java.lang.String.format("Expected leading [0-9a-fA-F] character but was %#x", java.lang.Byte.valueOf(r3)));     */
    @Override // p275e.InterfaceC2721i
    /* renamed from: k */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public long mo11709k() {
        /*
            r6 = this;
            r0 = 1
            r6.mo11700f(r0)
            r0 = 0
            r1 = 0
        L7:
            int r2 = r1 + 1
            long r3 = (long) r2
            boolean r3 = r6.mo11696d(r3)
            if (r3 == 0) goto L4a
            e.g r3 = r6.f11434a
            long r4 = (long) r1
            byte r3 = r3.m11703h(r4)
            r4 = 48
            if (r3 < r4) goto L1f
            r4 = 57
            if (r3 <= r4) goto L30
        L1f:
            r4 = 97
            if (r3 < r4) goto L27
            r4 = 102(0x66, float:1.43E-43)
            if (r3 <= r4) goto L30
        L27:
            r4 = 65
            if (r3 < r4) goto L32
            r4 = 70
            if (r3 <= r4) goto L30
            goto L32
        L30:
            r1 = r2
            goto L7
        L32:
            if (r1 == 0) goto L35
            goto L4a
        L35:
            java.lang.NumberFormatException r1 = new java.lang.NumberFormatException
            r2 = 1
            java.lang.Object[] r2 = new java.lang.Object[r2]
            java.lang.Byte r3 = java.lang.Byte.valueOf(r3)
            r2[r0] = r3
            java.lang.String r0 = "Expected leading [0-9a-fA-F] character but was %#x"
            java.lang.String r0 = java.lang.String.format(r0, r2)
            r1.<init>(r0)
            throw r1
        L4a:
            e.g r0 = r6.f11434a
            long r0 = r0.mo11709k()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p275e.C2737y.mo11709k():long");
    }

    @Override // p275e.InterfaceC2721i
    /* renamed from: l */
    public InputStream mo11711l() {
        return new C2736x(this);
    }

    @Override // java.nio.channels.ReadableByteChannel
    public int read(ByteBuffer byteBuffer) {
        C2719g c2719g = this.f11434a;
        if (c2719g.f11390c == 0 && this.f11435b.read(c2719g, 8192L) == -1) {
            return -1;
        }
        return this.f11434a.read(byteBuffer);
    }

    @Override // p275e.InterfaceC2709D
    public long read(C2719g c2719g, long j) {
        if (c2719g == null) {
            throw new IllegalArgumentException("sink == null");
        }
        if (j < 0) {
            throw new IllegalArgumentException("byteCount < 0: " + j);
        }
        if (this.f11436c) {
            throw new IllegalStateException("closed");
        }
        C2719g c2719g2 = this.f11434a;
        if (c2719g2.f11390c == 0 && this.f11435b.read(c2719g2, 8192L) == -1) {
            return -1L;
        }
        return this.f11434a.read(c2719g, Math.min(j, this.f11434a.f11390c));
    }

    @Override // p275e.InterfaceC2721i
    public byte readByte() {
        mo11700f(1L);
        return this.f11434a.readByte();
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // p275e.InterfaceC2721i
    public void readFully(byte[] bArr) {
        try {
            mo11700f(bArr.length);
            this.f11434a.readFully(bArr);
        } catch (EOFException e2) {
            int i = 0;
            while (true) {
                C2719g c2719g = this.f11434a;
                long j = c2719g.f11390c;
                if (j <= 0) {
                    throw e2;
                }
                int m11668a = c2719g.m11668a(bArr, i, (int) j);
                if (m11668a == -1) {
                    throw new AssertionError();
                }
                i += m11668a;
            }
        }
    }

    @Override // p275e.InterfaceC2721i
    public int readInt() {
        mo11700f(4L);
        return this.f11434a.readInt();
    }

    @Override // p275e.InterfaceC2721i
    public long readLong() {
        mo11700f(8L);
        return this.f11434a.readLong();
    }

    @Override // p275e.InterfaceC2721i
    public short readShort() {
        mo11700f(2L);
        return this.f11434a.readShort();
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // p275e.InterfaceC2721i
    public void skip(long j) {
        if (this.f11436c) {
            throw new IllegalStateException("closed");
        }
        while (j > 0) {
            C2719g c2719g = this.f11434a;
            if (c2719g.f11390c == 0 && this.f11435b.read(c2719g, 8192L) == -1) {
                throw new EOFException();
            }
            long min = Math.min(j, this.f11434a.size());
            this.f11434a.skip(min);
            j -= min;
        }
    }

    @Override // p275e.InterfaceC2709D
    public C2711F timeout() {
        return this.f11435b.timeout();
    }

    public String toString() {
        return "buffer(" + this.f11435b + ")";
    }
}
