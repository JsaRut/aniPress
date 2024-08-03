package p275e;

import java.io.Closeable;
import java.io.EOFException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.channels.ByteChannel;
import java.nio.charset.Charset;

/* renamed from: e.g */
/* loaded from: classes.dex */
public final class C2719g implements InterfaceC2721i, InterfaceC2720h, Cloneable, ByteChannel {

    /* renamed from: a */
    private static final byte[] f11388a = {48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 97, 98, 99, 100, 101, 102};

    /* renamed from: b */
    C2738z f11389b;

    /* renamed from: c */
    long f11390c;

    /* renamed from: e.g$a */
    /* loaded from: classes.dex */
    public static final class a implements Closeable {

        /* renamed from: a */
        public C2719g f11391a;

        /* renamed from: b */
        public boolean f11392b;

        /* renamed from: c */
        private C2738z f11393c;

        /* renamed from: e */
        public byte[] f11395e;

        /* renamed from: d */
        public long f11394d = -1;

        /* renamed from: f */
        public int f11396f = -1;

        /* renamed from: g */
        public int f11397g = -1;

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            if (this.f11391a == null) {
                throw new IllegalStateException("not attached to a buffer");
            }
            this.f11391a = null;
            this.f11393c = null;
            this.f11394d = -1L;
            this.f11395e = null;
            this.f11396f = -1;
            this.f11397g = -1;
        }

        /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
        /* renamed from: h */
        public final int m11717h(long j) {
            C2738z c2738z;
            if (j >= -1) {
                C2719g c2719g = this.f11391a;
                long j2 = c2719g.f11390c;
                if (j <= j2) {
                    if (j == -1 || j == j2) {
                        this.f11393c = null;
                        this.f11394d = j;
                        this.f11395e = null;
                        this.f11396f = -1;
                        this.f11397g = -1;
                        return -1;
                    }
                    long j3 = 0;
                    C2738z c2738z2 = c2719g.f11389b;
                    C2738z c2738z3 = this.f11393c;
                    if (c2738z3 != null) {
                        long j4 = this.f11394d - (this.f11396f - c2738z3.f11438b);
                        if (j4 > j) {
                            j2 = j4;
                            c2738z3 = c2738z2;
                            c2738z2 = c2738z3;
                        } else {
                            j3 = j4;
                        }
                    } else {
                        c2738z3 = c2738z2;
                    }
                    if (j2 - j > j - j3) {
                        while (true) {
                            int i = c2738z3.f11439c;
                            int i2 = c2738z3.f11438b;
                            if (j < (i - i2) + j3) {
                                break;
                            }
                            j3 += i - i2;
                            c2738z3 = c2738z3.f11442f;
                        }
                    } else {
                        c2738z3 = c2738z2;
                        j3 = j2;
                        while (j3 > j) {
                            c2738z3 = c2738z3.f11443g;
                            j3 -= c2738z3.f11439c - c2738z3.f11438b;
                        }
                    }
                    if (this.f11392b && c2738z3.f11440d) {
                        c2738z = c2738z3.m11761d();
                        C2719g c2719g2 = this.f11391a;
                        if (c2719g2.f11389b == c2738z3) {
                            c2719g2.f11389b = c2738z;
                        }
                        c2738z3.m11756a(c2738z);
                        c2738z.f11443g.m11759b();
                    } else {
                        c2738z = c2738z3;
                    }
                    this.f11393c = c2738z;
                    this.f11394d = j;
                    this.f11395e = c2738z.f11437a;
                    this.f11396f = c2738z.f11438b + ((int) (j - j3));
                    this.f11397g = c2738z.f11439c;
                    return this.f11397g - this.f11396f;
                }
            }
            throw new ArrayIndexOutOfBoundsException(String.format("offset=%s > size=%s", Long.valueOf(j), Long.valueOf(this.f11391a.f11390c)));
        }

        /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
        /* renamed from: m */
        public final int m11718m() {
            long j = this.f11394d;
            if (j != this.f11391a.f11390c) {
                return m11717h(j == -1 ? 0L : j + (this.f11397g - this.f11396f));
            }
            throw new IllegalStateException();
        }
    }

    /* renamed from: a */
    public int m11668a(byte[] bArr, int i, int i2) {
        C2712G.m11661a(bArr.length, i, i2);
        C2738z c2738z = this.f11389b;
        if (c2738z == null) {
            return -1;
        }
        int min = Math.min(i2, c2738z.f11439c - c2738z.f11438b);
        System.arraycopy(c2738z.f11437a, c2738z.f11438b, bArr, i, min);
        c2738z.f11438b += min;
        this.f11390c -= min;
        if (c2738z.f11438b == c2738z.f11439c) {
            this.f11389b = c2738z.m11759b();
            C2706A.m11641a(c2738z);
        }
        return min;
    }

    @Override // p275e.InterfaceC2721i
    /* renamed from: a */
    public long mo11669a(byte b2) {
        return m11670a(b2, 0L, Long.MAX_VALUE);
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* renamed from: a */
    public long m11670a(byte b2, long j, long j2) {
        C2738z c2738z;
        long j3 = 0;
        if (j < 0 || j2 < j) {
            throw new IllegalArgumentException(String.format("size=%s fromIndex=%s toIndex=%s", Long.valueOf(this.f11390c), Long.valueOf(j), Long.valueOf(j2)));
        }
        long j4 = this.f11390c;
        if (j2 <= j4) {
            j4 = j2;
        }
        if (j == j4 || (c2738z = this.f11389b) == null) {
            return -1L;
        }
        long j5 = this.f11390c;
        if (j5 - j >= j) {
            while (true) {
                j5 = j3;
                j3 = (c2738z.f11439c - c2738z.f11438b) + j5;
                if (j3 >= j) {
                    break;
                }
                c2738z = c2738z.f11442f;
            }
        } else {
            while (j5 > j) {
                c2738z = c2738z.f11443g;
                j5 -= c2738z.f11439c - c2738z.f11438b;
            }
        }
        long j6 = j;
        while (j5 < j4) {
            byte[] bArr = c2738z.f11437a;
            int min = (int) Math.min(c2738z.f11439c, (c2738z.f11438b + j4) - j5);
            for (int i = (int) ((c2738z.f11438b + j6) - j5); i < min; i++) {
                if (bArr[i] == b2) {
                    return (i - c2738z.f11438b) + j5;
                }
            }
            j6 = (c2738z.f11439c - c2738z.f11438b) + j5;
            c2738z = c2738z.f11442f;
            j5 = j6;
        }
        return -1L;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // p275e.InterfaceC2720h
    /* renamed from: a */
    public long mo11671a(InterfaceC2709D interfaceC2709D) {
        if (interfaceC2709D == null) {
            throw new IllegalArgumentException("source == null");
        }
        long j = 0;
        while (true) {
            long read = interfaceC2709D.read(this, 8192L);
            if (read == -1) {
                return j;
            }
            j += read;
        }
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* renamed from: a */
    public long m11672a(C2722j c2722j, long j) {
        int i;
        long j2 = 0;
        if (j < 0) {
            throw new IllegalArgumentException("fromIndex < 0");
        }
        C2738z c2738z = this.f11389b;
        if (c2738z == null) {
            return -1L;
        }
        long j3 = this.f11390c;
        if (j3 - j >= j) {
            while (true) {
                j3 = j2;
                j2 = (c2738z.f11439c - c2738z.f11438b) + j3;
                if (j2 >= j) {
                    break;
                }
                c2738z = c2738z.f11442f;
            }
        } else {
            while (j3 > j) {
                c2738z = c2738z.f11443g;
                j3 -= c2738z.f11439c - c2738z.f11438b;
            }
        }
        if (c2722j.mo11655h() == 2) {
            byte mo11644a = c2722j.mo11644a(0);
            byte mo11644a2 = c2722j.mo11644a(1);
            while (j3 < this.f11390c) {
                byte[] bArr = c2738z.f11437a;
                i = (int) ((c2738z.f11438b + j) - j3);
                int i2 = c2738z.f11439c;
                while (i < i2) {
                    byte b2 = bArr[i];
                    if (b2 != mo11644a && b2 != mo11644a2) {
                        i++;
                    }
                    return (i - c2738z.f11438b) + j3;
                }
                j = (c2738z.f11439c - c2738z.f11438b) + j3;
                c2738z = c2738z.f11442f;
                j3 = j;
            }
            return -1L;
        }
        byte[] mo11651d = c2722j.mo11651d();
        while (j3 < this.f11390c) {
            byte[] bArr2 = c2738z.f11437a;
            i = (int) ((c2738z.f11438b + j) - j3);
            int i3 = c2738z.f11439c;
            while (i < i3) {
                byte b3 = bArr2[i];
                for (byte b4 : mo11651d) {
                    if (b3 == b4) {
                        return (i - c2738z.f11438b) + j3;
                    }
                }
                i++;
            }
            j = (c2738z.f11439c - c2738z.f11438b) + j3;
            c2738z = c2738z.f11442f;
            j3 = j;
        }
        return -1L;
    }

    /* renamed from: a */
    public final a m11673a(a aVar) {
        if (aVar.f11391a != null) {
            throw new IllegalStateException("already attached to a buffer");
        }
        aVar.f11391a = this;
        aVar.f11392b = true;
        return aVar;
    }

    @Override // p275e.InterfaceC2721i, p275e.InterfaceC2720h
    /* renamed from: a */
    public C2719g mo11674a() {
        return this;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* renamed from: a */
    public final C2719g m11675a(C2719g c2719g, long j, long j2) {
        if (c2719g == null) {
            throw new IllegalArgumentException("out == null");
        }
        C2712G.m11661a(this.f11390c, j, j2);
        if (j2 == 0) {
            return this;
        }
        c2719g.f11390c += j2;
        C2738z c2738z = this.f11389b;
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
            C2738z m11760c = c2738z.m11760c();
            m11760c.f11438b = (int) (m11760c.f11438b + j);
            m11760c.f11439c = Math.min(m11760c.f11438b + ((int) j2), m11760c.f11439c);
            C2738z c2738z2 = c2719g.f11389b;
            if (c2738z2 == null) {
                m11760c.f11443g = m11760c;
                m11760c.f11442f = m11760c;
                c2719g.f11389b = m11760c;
            } else {
                c2738z2.f11443g.m11756a(m11760c);
            }
            j2 -= m11760c.f11439c - m11760c.f11438b;
            c2738z = c2738z.f11442f;
            j = 0;
        }
        return this;
    }

    @Override // p275e.InterfaceC2720h
    /* renamed from: a */
    public C2719g mo11676a(C2722j c2722j) {
        if (c2722j == null) {
            throw new IllegalArgumentException("byteString == null");
        }
        c2722j.mo11646a(this);
        return this;
    }

    @Override // p275e.InterfaceC2720h
    /* renamed from: a */
    public C2719g mo11677a(String str) {
        m11678a(str, 0, str.length());
        return this;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* renamed from: a */
    public C2719g m11678a(String str, int i, int i2) {
        int i3;
        if (str == null) {
            throw new IllegalArgumentException("string == null");
        }
        if (i < 0) {
            throw new IllegalArgumentException("beginIndex < 0: " + i);
        }
        if (i2 < i) {
            throw new IllegalArgumentException("endIndex < beginIndex: " + i2 + " < " + i);
        }
        if (i2 > str.length()) {
            throw new IllegalArgumentException("endIndex > string.length: " + i2 + " > " + str.length());
        }
        while (i < i2) {
            char charAt = str.charAt(i);
            if (charAt < 128) {
                C2738z m11690b = m11690b(1);
                byte[] bArr = m11690b.f11437a;
                int i4 = m11690b.f11439c - i;
                int min = Math.min(i2, 8192 - i4);
                int i5 = i + 1;
                bArr[i + i4] = (byte) charAt;
                while (i5 < min) {
                    char charAt2 = str.charAt(i5);
                    if (charAt2 >= 128) {
                        break;
                    }
                    bArr[i5 + i4] = (byte) charAt2;
                    i5++;
                }
                int i6 = m11690b.f11439c;
                int i7 = (i4 + i5) - i6;
                m11690b.f11439c = i6 + i7;
                this.f11390c += i7;
                i = i5;
            } else {
                if (charAt < 2048) {
                    i3 = (charAt >> 6) | 192;
                } else if (charAt < 55296 || charAt > 57343) {
                    writeByte((charAt >> '\f') | 224);
                    i3 = ((charAt >> 6) & 63) | 128;
                } else {
                    int i8 = i + 1;
                    char charAt3 = i8 < i2 ? str.charAt(i8) : (char) 0;
                    if (charAt > 56319 || charAt3 < 56320 || charAt3 > 57343) {
                        writeByte(63);
                        i = i8;
                    } else {
                        int i9 = (((charAt & 10239) << 10) | (9215 & charAt3)) + 65536;
                        writeByte((i9 >> 18) | 240);
                        writeByte(((i9 >> 12) & 63) | 128);
                        writeByte(((i9 >> 6) & 63) | 128);
                        writeByte((i9 & 63) | 128);
                        i += 2;
                    }
                }
                writeByte(i3);
                writeByte((charAt & '?') | 128);
                i++;
            }
        }
        return this;
    }

    /* renamed from: a */
    public C2719g m11679a(String str, int i, int i2, Charset charset) {
        if (str == null) {
            throw new IllegalArgumentException("string == null");
        }
        if (i < 0) {
            throw new IllegalAccessError("beginIndex < 0: " + i);
        }
        if (i2 < i) {
            throw new IllegalArgumentException("endIndex < beginIndex: " + i2 + " < " + i);
        }
        if (i2 > str.length()) {
            throw new IllegalArgumentException("endIndex > string.length: " + i2 + " > " + str.length());
        }
        if (charset == null) {
            throw new IllegalArgumentException("charset == null");
        }
        if (charset.equals(C2712G.f11379a)) {
            m11678a(str, i, i2);
            return this;
        }
        byte[] bytes = str.substring(i, i2).getBytes(charset);
        write(bytes, 0, bytes.length);
        return this;
    }

    /* renamed from: a */
    public C2719g m11680a(String str, Charset charset) {
        m11679a(str, 0, str.length(), charset);
        return this;
    }

    @Override // p275e.InterfaceC2720h
    /* renamed from: a */
    public /* bridge */ /* synthetic */ InterfaceC2720h mo11676a(C2722j c2722j) {
        mo11676a(c2722j);
        return this;
    }

    @Override // p275e.InterfaceC2720h
    /* renamed from: a */
    public /* bridge */ /* synthetic */ InterfaceC2720h mo11677a(String str) {
        mo11677a(str);
        return this;
    }

    /* renamed from: a */
    public final C2722j m11681a(int i) {
        return i == 0 ? C2722j.f11399b : new C2707B(this, i);
    }

    @Override // p275e.InterfaceC2721i
    /* renamed from: a */
    public C2722j mo11682a(long j) {
        return new C2722j(mo11698e(j));
    }

    /* renamed from: a */
    public String m11683a(long j, Charset charset) {
        C2712G.m11661a(this.f11390c, 0L, j);
        if (charset == null) {
            throw new IllegalArgumentException("charset == null");
        }
        if (j > 2147483647L) {
            throw new IllegalArgumentException("byteCount > Integer.MAX_VALUE: " + j);
        }
        if (j == 0) {
            return "";
        }
        C2738z c2738z = this.f11389b;
        int i = c2738z.f11438b;
        if (i + j > c2738z.f11439c) {
            return new String(mo11698e(j), charset);
        }
        String str = new String(c2738z.f11437a, i, (int) j, charset);
        c2738z.f11438b = (int) (c2738z.f11438b + j);
        this.f11390c -= j;
        if (c2738z.f11438b == c2738z.f11439c) {
            this.f11389b = c2738z.m11759b();
            C2706A.m11641a(c2738z);
        }
        return str;
    }

    @Override // p275e.InterfaceC2721i
    /* renamed from: a */
    public String mo11684a(Charset charset) {
        try {
            return m11683a(this.f11390c, charset);
        } catch (EOFException e2) {
            throw new AssertionError(e2);
        }
    }

    @Override // p275e.InterfaceC2721i
    /* renamed from: a */
    public void mo11685a(C2719g c2719g, long j) {
        long j2 = this.f11390c;
        if (j2 >= j) {
            c2719g.write(this, j);
        } else {
            c2719g.write(this, j2);
            throw new EOFException();
        }
    }

    @Override // p275e.InterfaceC2721i
    /* renamed from: a */
    public boolean mo11686a(long j, C2722j c2722j) {
        return m11687a(j, c2722j, 0, c2722j.mo11655h());
    }

    /* renamed from: a */
    public boolean m11687a(long j, C2722j c2722j, int i, int i2) {
        if (j < 0 || i < 0 || i2 < 0 || this.f11390c - j < i2 || c2722j.mo11655h() - i < i2) {
            return false;
        }
        for (int i3 = 0; i3 < i2; i3++) {
            if (m11703h(i3 + j) != c2722j.mo11644a(i + i3)) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: b */
    public long m11688b(C2722j c2722j) {
        return m11672a(c2722j, 0L);
    }

    @Override // p275e.InterfaceC2720h
    /* renamed from: b */
    public InterfaceC2720h mo11689b() {
        return this;
    }

    /* renamed from: b */
    public C2738z m11690b(int i) {
        if (i < 1 || i > 8192) {
            throw new IllegalArgumentException();
        }
        C2738z c2738z = this.f11389b;
        if (c2738z == null) {
            this.f11389b = C2706A.m11640a();
            C2738z c2738z2 = this.f11389b;
            c2738z2.f11443g = c2738z2;
            c2738z2.f11442f = c2738z2;
            return c2738z2;
        }
        C2738z c2738z3 = c2738z.f11443g;
        if (c2738z3.f11439c + i <= 8192 && c2738z3.f11441e) {
            return c2738z3;
        }
        C2738z m11640a = C2706A.m11640a();
        c2738z3.m11756a(m11640a);
        return m11640a;
    }

    @Override // p275e.InterfaceC2721i
    /* renamed from: b */
    public String mo11691b(long j) {
        if (j < 0) {
            throw new IllegalArgumentException("limit < 0: " + j);
        }
        long j2 = j != Long.MAX_VALUE ? j + 1 : Long.MAX_VALUE;
        long m11670a = m11670a((byte) 10, 0L, j2);
        if (m11670a != -1) {
            return m11708j(m11670a);
        }
        if (j2 < size() && m11703h(j2 - 1) == 13 && m11703h(j2) == 10) {
            return m11708j(j2);
        }
        C2719g c2719g = new C2719g();
        m11675a(c2719g, 0L, Math.min(32L, size()));
        throw new EOFException("\\n not found: limit=" + Math.min(size(), j) + " content=" + c2719g.m11714o().mo11650c() + (char) 8230);
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* renamed from: c */
    public C2719g m11692c(int i) {
        int i2;
        int i3;
        if (i >= 128) {
            if (i < 2048) {
                i3 = (i >> 6) | 192;
            } else {
                if (i < 65536) {
                    if (i >= 55296 && i <= 57343) {
                        writeByte(63);
                        return this;
                    }
                    i2 = (i >> 12) | 224;
                } else {
                    if (i > 1114111) {
                        throw new IllegalArgumentException("Unexpected code point: " + Integer.toHexString(i));
                    }
                    writeByte((i >> 18) | 240);
                    i2 = ((i >> 12) & 63) | 128;
                }
                writeByte(i2);
                i3 = ((i >> 6) & 63) | 128;
            }
            writeByte(i3);
            i = (i & 63) | 128;
        }
        writeByte(i);
        return this;
    }

    @Override // p275e.InterfaceC2720h
    /* renamed from: c */
    public C2719g mo11693c(long j) {
        if (j == 0) {
            writeByte(48);
            return this;
        }
        int numberOfTrailingZeros = (Long.numberOfTrailingZeros(Long.highestOneBit(j)) / 4) + 1;
        C2738z m11690b = m11690b(numberOfTrailingZeros);
        byte[] bArr = m11690b.f11437a;
        int i = m11690b.f11439c;
        for (int i2 = (i + numberOfTrailingZeros) - 1; i2 >= i; i2--) {
            bArr[i2] = f11388a[(int) (15 & j)];
            j >>>= 4;
        }
        m11690b.f11439c += numberOfTrailingZeros;
        this.f11390c += numberOfTrailingZeros;
        return this;
    }

    @Override // p275e.InterfaceC2720h
    /* renamed from: c */
    public /* bridge */ /* synthetic */ InterfaceC2720h mo11693c(long j) {
        mo11693c(j);
        return this;
    }

    @Override // p275e.InterfaceC2721i
    /* renamed from: c */
    public byte[] mo11694c() {
        try {
            return mo11698e(this.f11390c);
        } catch (EOFException e2) {
            throw new AssertionError(e2);
        }
    }

    /* renamed from: clone */
    public C2719g m11779clone() {
        C2719g c2719g = new C2719g();
        if (this.f11390c == 0) {
            return c2719g;
        }
        c2719g.f11389b = this.f11389b.m11760c();
        C2738z c2738z = c2719g.f11389b;
        c2738z.f11443g = c2738z;
        c2738z.f11442f = c2738z;
        C2738z c2738z2 = this.f11389b;
        while (true) {
            c2738z2 = c2738z2.f11442f;
            if (c2738z2 == this.f11389b) {
                c2719g.f11390c = this.f11390c;
                return c2719g;
            }
            c2719g.f11389b.f11443g.m11756a(c2738z2.m11760c());
        }
    }

    @Override // p275e.InterfaceC2709D, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
    }

    @Override // p275e.InterfaceC2721i
    /* renamed from: d */
    public boolean mo11695d() {
        return this.f11390c == 0;
    }

    @Override // p275e.InterfaceC2721i
    /* renamed from: d */
    public boolean mo11696d(long j) {
        return this.f11390c >= j;
    }

    @Override // p275e.InterfaceC2720h
    /* renamed from: e */
    public C2719g mo11697e() {
        return this;
    }

    @Override // p275e.InterfaceC2720h
    /* renamed from: e */
    public /* bridge */ /* synthetic */ InterfaceC2720h mo11697e() {
        mo11697e();
        return this;
    }

    @Override // p275e.InterfaceC2721i
    /* renamed from: e */
    public byte[] mo11698e(long j) {
        C2712G.m11661a(this.f11390c, 0L, j);
        if (j <= 2147483647L) {
            byte[] bArr = new byte[(int) j];
            readFully(bArr);
            return bArr;
        }
        throw new IllegalArgumentException("byteCount > Integer.MAX_VALUE: " + j);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2719g)) {
            return false;
        }
        C2719g c2719g = (C2719g) obj;
        long j = this.f11390c;
        if (j != c2719g.f11390c) {
            return false;
        }
        long j2 = 0;
        if (j == 0) {
            return true;
        }
        C2738z c2738z = this.f11389b;
        C2738z c2738z2 = c2719g.f11389b;
        int i = c2738z.f11438b;
        int i2 = c2738z2.f11438b;
        while (j2 < this.f11390c) {
            long min = Math.min(c2738z.f11439c - i, c2738z2.f11439c - i2);
            int i3 = i2;
            int i4 = i;
            int i5 = 0;
            while (i5 < min) {
                int i6 = i4 + 1;
                int i7 = i3 + 1;
                if (c2738z.f11437a[i4] != c2738z2.f11437a[i3]) {
                    return false;
                }
                i5++;
                i4 = i6;
                i3 = i7;
            }
            if (i4 == c2738z.f11439c) {
                c2738z = c2738z.f11442f;
                i = c2738z.f11438b;
            } else {
                i = i4;
            }
            if (i3 == c2738z2.f11439c) {
                c2738z2 = c2738z2.f11442f;
                i2 = c2738z2.f11438b;
            } else {
                i2 = i3;
            }
            j2 += min;
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00ac A[EDGE_INSN: B:47:0x00ac->B:41:0x00ac BREAK  A[LOOP:0: B:4:0x0010->B:46:?], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00a4  */
    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // p275e.InterfaceC2721i
    /* renamed from: f */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public long mo11699f() {
        /*
            r17 = this;
            r0 = r17
            long r1 = r0.f11390c
            r3 = 0
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 == 0) goto Lb7
            r5 = -7
            r7 = 0
            r8 = r5
            r5 = 0
            r6 = 0
        L10:
            e.z r10 = r0.f11389b
            byte[] r11 = r10.f11437a
            int r12 = r10.f11438b
            int r13 = r10.f11439c
        L18:
            if (r12 >= r13) goto L98
            r15 = r11[r12]
            r14 = 48
            if (r15 < r14) goto L6a
            r1 = 57
            if (r15 > r1) goto L6a
            int r14 = r14 - r15
            r1 = -922337203685477580(0xf333333333333334, double:-8.390303882365713E246)
            int r16 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r16 < 0) goto L3f
            int r16 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r16 != 0) goto L38
            long r1 = (long) r14
            int r16 = (r1 > r8 ? 1 : (r1 == r8 ? 0 : -1))
            if (r16 >= 0) goto L38
            goto L3f
        L38:
            r1 = 10
            long r3 = r3 * r1
            long r1 = (long) r14
            long r3 = r3 + r1
            goto L74
        L3f:
            e.g r1 = new e.g
            r1.<init>()
            r1.mo11701g(r3)
            r1.writeByte(r15)
            if (r5 != 0) goto L4f
            r1.readByte()
        L4f:
            java.lang.NumberFormatException r2 = new java.lang.NumberFormatException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "Number too large: "
            r3.append(r4)
            java.lang.String r1 = r1.m11715p()
            r3.append(r1)
            java.lang.String r1 = r3.toString()
            r2.<init>(r1)
            throw r2
        L6a:
            r1 = 45
            if (r15 != r1) goto L79
            if (r7 != 0) goto L79
            r1 = 1
            long r8 = r8 - r1
            r5 = 1
        L74:
            int r12 = r12 + 1
            int r7 = r7 + 1
            goto L18
        L79:
            if (r7 == 0) goto L7d
            r6 = 1
            goto L98
        L7d:
            java.lang.NumberFormatException r1 = new java.lang.NumberFormatException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Expected leading [0-9] or '-' character but was 0x"
            r2.append(r3)
            java.lang.String r3 = java.lang.Integer.toHexString(r15)
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r1
        L98:
            if (r12 != r13) goto La4
            e.z r1 = r10.m11759b()
            r0.f11389b = r1
            p275e.C2706A.m11641a(r10)
            goto La6
        La4:
            r10.f11438b = r12
        La6:
            if (r6 != 0) goto Lac
            e.z r1 = r0.f11389b
            if (r1 != 0) goto L10
        Lac:
            long r1 = r0.f11390c
            long r6 = (long) r7
            long r1 = r1 - r6
            r0.f11390c = r1
            if (r5 == 0) goto Lb5
            goto Lb6
        Lb5:
            long r3 = -r3
        Lb6:
            return r3
        Lb7:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "size == 0"
            r1.<init>(r2)
            throw r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p275e.C2719g.mo11699f():long");
    }

    @Override // p275e.InterfaceC2721i
    /* renamed from: f */
    public void mo11700f(long j) {
        if (this.f11390c < j) {
            throw new EOFException();
        }
    }

    @Override // p275e.InterfaceC2720h, p275e.InterfaceC2708C, java.io.Flushable
    public void flush() {
    }

    @Override // p275e.InterfaceC2720h
    /* renamed from: g */
    public C2719g mo11701g(long j) {
        if (j == 0) {
            writeByte(48);
            return this;
        }
        boolean z = false;
        int i = 1;
        if (j < 0) {
            j = -j;
            if (j < 0) {
                mo11677a("-9223372036854775808");
                return this;
            }
            z = true;
        }
        if (j >= 100000000) {
            i = j < 1000000000000L ? j < 10000000000L ? j < 1000000000 ? 9 : 10 : j < 100000000000L ? 11 : 12 : j < 1000000000000000L ? j < 10000000000000L ? 13 : j < 100000000000000L ? 14 : 15 : j < 100000000000000000L ? j < 10000000000000000L ? 16 : 17 : j < 1000000000000000000L ? 18 : 19;
        } else if (j >= 10000) {
            i = j < 1000000 ? j < 100000 ? 5 : 6 : j < 10000000 ? 7 : 8;
        } else if (j >= 100) {
            i = j < 1000 ? 3 : 4;
        } else if (j >= 10) {
            i = 2;
        }
        if (z) {
            i++;
        }
        C2738z m11690b = m11690b(i);
        byte[] bArr = m11690b.f11437a;
        int i2 = m11690b.f11439c + i;
        while (j != 0) {
            i2--;
            bArr[i2] = f11388a[(int) (j % 10)];
            j /= 10;
        }
        if (z) {
            bArr[i2 - 1] = 45;
        }
        m11690b.f11439c += i;
        this.f11390c += i;
        return this;
    }

    @Override // p275e.InterfaceC2720h
    /* renamed from: g */
    public /* bridge */ /* synthetic */ InterfaceC2720h mo11701g(long j) {
        mo11701g(j);
        return this;
    }

    @Override // p275e.InterfaceC2721i
    /* renamed from: g */
    public String mo11702g() {
        return mo11691b(Long.MAX_VALUE);
    }

    /* renamed from: h */
    public final byte m11703h(long j) {
        int i;
        C2712G.m11661a(this.f11390c, j, 1L);
        long j2 = this.f11390c;
        if (j2 - j <= j) {
            long j3 = j - j2;
            C2738z c2738z = this.f11389b;
            do {
                c2738z = c2738z.f11443g;
                int i2 = c2738z.f11439c;
                i = c2738z.f11438b;
                j3 += i2 - i;
            } while (j3 < 0);
            return c2738z.f11437a[i + ((int) j3)];
        }
        C2738z c2738z2 = this.f11389b;
        while (true) {
            int i3 = c2738z2.f11439c;
            int i4 = c2738z2.f11438b;
            long j4 = i3 - i4;
            if (j < j4) {
                return c2738z2.f11437a[i4 + ((int) j)];
            }
            j -= j4;
            c2738z2 = c2738z2.f11442f;
        }
    }

    @Override // p275e.InterfaceC2721i
    /* renamed from: h */
    public int mo11704h() {
        return C2712G.m11659a(readInt());
    }

    public int hashCode() {
        C2738z c2738z = this.f11389b;
        if (c2738z == null) {
            return 0;
        }
        int i = 1;
        do {
            int i2 = c2738z.f11439c;
            for (int i3 = c2738z.f11438b; i3 < i2; i3++) {
                i = (i * 31) + c2738z.f11437a[i3];
            }
            c2738z = c2738z.f11442f;
        } while (c2738z != this.f11389b);
        return i;
    }

    /* renamed from: i */
    public String m11705i(long j) {
        return m11683a(j, C2712G.f11379a);
    }

    @Override // p275e.InterfaceC2721i
    /* renamed from: i */
    public short mo11706i() {
        return C2712G.m11660a(readShort());
    }

    @Override // java.nio.channels.Channel
    public boolean isOpen() {
        return true;
    }

    @Override // p275e.InterfaceC2720h
    /* renamed from: j */
    public OutputStream mo11707j() {
        return new C2717e(this);
    }

    /* renamed from: j */
    public String m11708j(long j) {
        String m11705i;
        long j2 = 1;
        if (j > 0) {
            long j3 = j - 1;
            if (m11703h(j3) == 13) {
                m11705i = m11705i(j3);
                j2 = 2;
                skip(j2);
                return m11705i;
            }
        }
        m11705i = m11705i(j);
        skip(j2);
        return m11705i;
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00a3 A[EDGE_INSN: B:41:0x00a3->B:38:0x00a3 BREAK  A[LOOP:0: B:4:0x000b->B:40:?], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x009b  */
    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // p275e.InterfaceC2721i
    /* renamed from: k */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public long mo11709k() {
        /*
            r15 = this;
            long r0 = r15.f11390c
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 == 0) goto Laa
            r0 = 0
            r4 = r2
            r1 = 0
        Lb:
            e.z r6 = r15.f11389b
            byte[] r7 = r6.f11437a
            int r8 = r6.f11438b
            int r9 = r6.f11439c
        L13:
            if (r8 >= r9) goto L8f
            r10 = r7[r8]
            r11 = 48
            if (r10 < r11) goto L22
            r11 = 57
            if (r10 > r11) goto L22
            int r11 = r10 + (-48)
            goto L3a
        L22:
            r11 = 97
            if (r10 < r11) goto L2f
            r11 = 102(0x66, float:1.43E-43)
            if (r10 > r11) goto L2f
            int r11 = r10 + (-97)
        L2c:
            int r11 = r11 + 10
            goto L3a
        L2f:
            r11 = 65
            if (r10 < r11) goto L70
            r11 = 70
            if (r10 > r11) goto L70
            int r11 = r10 + (-65)
            goto L2c
        L3a:
            r12 = -1152921504606846976(0xf000000000000000, double:-3.105036184601418E231)
            long r12 = r12 & r4
            int r14 = (r12 > r2 ? 1 : (r12 == r2 ? 0 : -1))
            if (r14 != 0) goto L4a
            r10 = 4
            long r4 = r4 << r10
            long r10 = (long) r11
            long r4 = r4 | r10
            int r8 = r8 + 1
            int r1 = r1 + 1
            goto L13
        L4a:
            e.g r0 = new e.g
            r0.<init>()
            r0.mo11693c(r4)
            r0.writeByte(r10)
            java.lang.NumberFormatException r1 = new java.lang.NumberFormatException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Number too large: "
            r2.append(r3)
            java.lang.String r0 = r0.m11715p()
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            r1.<init>(r0)
            throw r1
        L70:
            if (r1 == 0) goto L74
            r0 = 1
            goto L8f
        L74:
            java.lang.NumberFormatException r0 = new java.lang.NumberFormatException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Expected leading [0-9a-fA-F] character but was 0x"
            r1.append(r2)
            java.lang.String r2 = java.lang.Integer.toHexString(r10)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L8f:
            if (r8 != r9) goto L9b
            e.z r7 = r6.m11759b()
            r15.f11389b = r7
            p275e.C2706A.m11641a(r6)
            goto L9d
        L9b:
            r6.f11438b = r8
        L9d:
            if (r0 != 0) goto La3
            e.z r6 = r15.f11389b
            if (r6 != 0) goto Lb
        La3:
            long r2 = r15.f11390c
            long r0 = (long) r1
            long r2 = r2 - r0
            r15.f11390c = r2
            return r4
        Laa:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "size == 0"
            r0.<init>(r1)
            throw r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p275e.C2719g.mo11709k():long");
    }

    /* renamed from: k */
    public C2719g m11710k(long j) {
        C2738z m11690b = m11690b(8);
        byte[] bArr = m11690b.f11437a;
        int i = m11690b.f11439c;
        int i2 = i + 1;
        bArr[i] = (byte) ((j >>> 56) & 255);
        int i3 = i2 + 1;
        bArr[i2] = (byte) ((j >>> 48) & 255);
        int i4 = i3 + 1;
        bArr[i3] = (byte) ((j >>> 40) & 255);
        int i5 = i4 + 1;
        bArr[i4] = (byte) ((j >>> 32) & 255);
        int i6 = i5 + 1;
        bArr[i5] = (byte) ((j >>> 24) & 255);
        int i7 = i6 + 1;
        bArr[i6] = (byte) ((j >>> 16) & 255);
        int i8 = i7 + 1;
        bArr[i7] = (byte) ((j >>> 8) & 255);
        bArr[i8] = (byte) (j & 255);
        m11690b.f11439c = i8 + 1;
        this.f11390c += 8;
        return this;
    }

    @Override // p275e.InterfaceC2721i
    /* renamed from: l */
    public InputStream mo11711l() {
        return new C2718f(this);
    }

    /* renamed from: m */
    public final void m11712m() {
        try {
            skip(this.f11390c);
        } catch (EOFException e2) {
            throw new AssertionError(e2);
        }
    }

    /* renamed from: n */
    public final long m11713n() {
        long j = this.f11390c;
        if (j == 0) {
            return 0L;
        }
        C2738z c2738z = this.f11389b.f11443g;
        return (c2738z.f11439c >= 8192 || !c2738z.f11441e) ? j : j - (r3 - c2738z.f11438b);
    }

    /* renamed from: o */
    public C2722j m11714o() {
        return new C2722j(mo11694c());
    }

    /* renamed from: p */
    public String m11715p() {
        try {
            return m11683a(this.f11390c, C2712G.f11379a);
        } catch (EOFException e2) {
            throw new AssertionError(e2);
        }
    }

    /* renamed from: q */
    public final C2722j m11716q() {
        long j = this.f11390c;
        if (j <= 2147483647L) {
            return m11681a((int) j);
        }
        throw new IllegalArgumentException("size > Integer.MAX_VALUE: " + this.f11390c);
    }

    @Override // java.nio.channels.ReadableByteChannel
    public int read(ByteBuffer byteBuffer) {
        C2738z c2738z = this.f11389b;
        if (c2738z == null) {
            return -1;
        }
        int min = Math.min(byteBuffer.remaining(), c2738z.f11439c - c2738z.f11438b);
        byteBuffer.put(c2738z.f11437a, c2738z.f11438b, min);
        c2738z.f11438b += min;
        this.f11390c -= min;
        if (c2738z.f11438b == c2738z.f11439c) {
            this.f11389b = c2738z.m11759b();
            C2706A.m11641a(c2738z);
        }
        return min;
    }

    @Override // p275e.InterfaceC2709D
    public long read(C2719g c2719g, long j) {
        if (c2719g == null) {
            throw new IllegalArgumentException("sink == null");
        }
        if (j < 0) {
            throw new IllegalArgumentException("byteCount < 0: " + j);
        }
        long j2 = this.f11390c;
        if (j2 == 0) {
            return -1L;
        }
        if (j > j2) {
            j = j2;
        }
        c2719g.write(this, j);
        return j;
    }

    @Override // p275e.InterfaceC2721i
    public byte readByte() {
        long j = this.f11390c;
        if (j == 0) {
            throw new IllegalStateException("size == 0");
        }
        C2738z c2738z = this.f11389b;
        int i = c2738z.f11438b;
        int i2 = c2738z.f11439c;
        int i3 = i + 1;
        byte b2 = c2738z.f11437a[i];
        this.f11390c = j - 1;
        if (i3 == i2) {
            this.f11389b = c2738z.m11759b();
            C2706A.m11641a(c2738z);
        } else {
            c2738z.f11438b = i3;
        }
        return b2;
    }

    @Override // p275e.InterfaceC2721i
    public void readFully(byte[] bArr) {
        int i = 0;
        while (i < bArr.length) {
            int m11668a = m11668a(bArr, i, bArr.length - i);
            if (m11668a == -1) {
                throw new EOFException();
            }
            i += m11668a;
        }
    }

    @Override // p275e.InterfaceC2721i
    public int readInt() {
        long j = this.f11390c;
        if (j < 4) {
            throw new IllegalStateException("size < 4: " + this.f11390c);
        }
        C2738z c2738z = this.f11389b;
        int i = c2738z.f11438b;
        int i2 = c2738z.f11439c;
        if (i2 - i < 4) {
            return ((readByte() & 255) << 24) | ((readByte() & 255) << 16) | ((readByte() & 255) << 8) | (readByte() & 255);
        }
        byte[] bArr = c2738z.f11437a;
        int i3 = i + 1;
        int i4 = i3 + 1;
        int i5 = ((bArr[i] & 255) << 24) | ((bArr[i3] & 255) << 16);
        int i6 = i4 + 1;
        int i7 = i5 | ((bArr[i4] & 255) << 8);
        int i8 = i6 + 1;
        int i9 = i7 | (bArr[i6] & 255);
        this.f11390c = j - 4;
        if (i8 == i2) {
            this.f11389b = c2738z.m11759b();
            C2706A.m11641a(c2738z);
        } else {
            c2738z.f11438b = i8;
        }
        return i9;
    }

    @Override // p275e.InterfaceC2721i
    public long readLong() {
        long j = this.f11390c;
        if (j < 8) {
            throw new IllegalStateException("size < 8: " + this.f11390c);
        }
        C2738z c2738z = this.f11389b;
        int i = c2738z.f11438b;
        int i2 = c2738z.f11439c;
        if (i2 - i < 8) {
            return ((readInt() & 4294967295L) << 32) | (4294967295L & readInt());
        }
        byte[] bArr = c2738z.f11437a;
        long j2 = (bArr[i] & 255) << 56;
        long j3 = ((bArr[r11] & 255) << 48) | j2;
        long j4 = j3 | ((bArr[r6] & 255) << 40);
        long j5 = j4 | ((bArr[r11] & 255) << 32) | ((bArr[r6] & 255) << 24);
        long j6 = j5 | ((bArr[r9] & 255) << 16);
        long j7 = j6 | ((bArr[r6] & 255) << 8);
        int i3 = i + 1 + 1 + 1 + 1 + 1 + 1 + 1 + 1;
        long j8 = j7 | (bArr[r9] & 255);
        this.f11390c = j - 8;
        if (i3 == i2) {
            this.f11389b = c2738z.m11759b();
            C2706A.m11641a(c2738z);
        } else {
            c2738z.f11438b = i3;
        }
        return j8;
    }

    @Override // p275e.InterfaceC2721i
    public short readShort() {
        long j = this.f11390c;
        if (j < 2) {
            throw new IllegalStateException("size < 2: " + this.f11390c);
        }
        C2738z c2738z = this.f11389b;
        int i = c2738z.f11438b;
        int i2 = c2738z.f11439c;
        if (i2 - i < 2) {
            return (short) (((readByte() & 255) << 8) | (readByte() & 255));
        }
        byte[] bArr = c2738z.f11437a;
        int i3 = i + 1;
        int i4 = i3 + 1;
        int i5 = ((bArr[i] & 255) << 8) | (bArr[i3] & 255);
        this.f11390c = j - 2;
        if (i4 == i2) {
            this.f11389b = c2738z.m11759b();
            C2706A.m11641a(c2738z);
        } else {
            c2738z.f11438b = i4;
        }
        return (short) i5;
    }

    public final long size() {
        return this.f11390c;
    }

    @Override // p275e.InterfaceC2721i
    public void skip(long j) {
        while (j > 0) {
            if (this.f11389b == null) {
                throw new EOFException();
            }
            int min = (int) Math.min(j, r0.f11439c - r0.f11438b);
            long j2 = min;
            this.f11390c -= j2;
            j -= j2;
            C2738z c2738z = this.f11389b;
            c2738z.f11438b += min;
            if (c2738z.f11438b == c2738z.f11439c) {
                this.f11389b = c2738z.m11759b();
                C2706A.m11641a(c2738z);
            }
        }
    }

    @Override // p275e.InterfaceC2709D
    public C2711F timeout() {
        return C2711F.NONE;
    }

    public String toString() {
        return m11716q().toString();
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // java.nio.channels.WritableByteChannel
    public int write(ByteBuffer byteBuffer) {
        if (byteBuffer == null) {
            throw new IllegalArgumentException("source == null");
        }
        int remaining = byteBuffer.remaining();
        int i = remaining;
        while (i > 0) {
            C2738z m11690b = m11690b(1);
            int min = Math.min(i, 8192 - m11690b.f11439c);
            byteBuffer.get(m11690b.f11437a, m11690b.f11439c, min);
            i -= min;
            m11690b.f11439c += min;
        }
        this.f11390c += remaining;
        return remaining;
    }

    @Override // p275e.InterfaceC2720h
    public C2719g write(byte[] bArr) {
        if (bArr == null) {
            throw new IllegalArgumentException("source == null");
        }
        write(bArr, 0, bArr.length);
        return this;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // p275e.InterfaceC2720h
    public C2719g write(byte[] bArr, int i, int i2) {
        if (bArr == null) {
            throw new IllegalArgumentException("source == null");
        }
        long j = i2;
        C2712G.m11661a(bArr.length, i, j);
        int i3 = i2 + i;
        while (i < i3) {
            C2738z m11690b = m11690b(1);
            int min = Math.min(i3 - i, 8192 - m11690b.f11439c);
            System.arraycopy(bArr, i, m11690b.f11437a, m11690b.f11439c, min);
            i += min;
            m11690b.f11439c += min;
        }
        this.f11390c += j;
        return this;
    }

    @Override // p275e.InterfaceC2720h
    public /* bridge */ /* synthetic */ InterfaceC2720h write(byte[] bArr) {
        write(bArr);
        return this;
    }

    @Override // p275e.InterfaceC2720h
    public /* bridge */ /* synthetic */ InterfaceC2720h write(byte[] bArr, int i, int i2) {
        write(bArr, i, i2);
        return this;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // p275e.InterfaceC2708C
    public void write(C2719g c2719g, long j) {
        if (c2719g == null) {
            throw new IllegalArgumentException("source == null");
        }
        if (c2719g == this) {
            throw new IllegalArgumentException("source == this");
        }
        C2712G.m11661a(c2719g.f11390c, 0L, j);
        while (j > 0) {
            C2738z c2738z = c2719g.f11389b;
            if (j < c2738z.f11439c - c2738z.f11438b) {
                C2738z c2738z2 = this.f11389b;
                C2738z c2738z3 = c2738z2 != null ? c2738z2.f11443g : null;
                if (c2738z3 != null && c2738z3.f11441e) {
                    if ((c2738z3.f11439c + j) - (c2738z3.f11440d ? 0 : c2738z3.f11438b) <= 8192) {
                        c2719g.f11389b.m11758a(c2738z3, (int) j);
                        c2719g.f11390c -= j;
                        this.f11390c += j;
                        return;
                    }
                }
                c2719g.f11389b = c2719g.f11389b.m11755a((int) j);
            }
            C2738z c2738z4 = c2719g.f11389b;
            long j2 = c2738z4.f11439c - c2738z4.f11438b;
            c2719g.f11389b = c2738z4.m11759b();
            C2738z c2738z5 = this.f11389b;
            if (c2738z5 == null) {
                this.f11389b = c2738z4;
                C2738z c2738z6 = this.f11389b;
                c2738z6.f11443g = c2738z6;
                c2738z6.f11442f = c2738z6;
            } else {
                c2738z5.f11443g.m11756a(c2738z4);
                c2738z4.m11757a();
            }
            c2719g.f11390c -= j2;
            this.f11390c += j2;
            j -= j2;
        }
    }

    @Override // p275e.InterfaceC2720h
    public C2719g writeByte(int i) {
        C2738z m11690b = m11690b(1);
        byte[] bArr = m11690b.f11437a;
        int i2 = m11690b.f11439c;
        m11690b.f11439c = i2 + 1;
        bArr[i2] = (byte) i;
        this.f11390c++;
        return this;
    }

    @Override // p275e.InterfaceC2720h
    public /* bridge */ /* synthetic */ InterfaceC2720h writeByte(int i) {
        writeByte(i);
        return this;
    }

    @Override // p275e.InterfaceC2720h
    public C2719g writeInt(int i) {
        C2738z m11690b = m11690b(4);
        byte[] bArr = m11690b.f11437a;
        int i2 = m11690b.f11439c;
        int i3 = i2 + 1;
        bArr[i2] = (byte) ((i >>> 24) & 255);
        int i4 = i3 + 1;
        bArr[i3] = (byte) ((i >>> 16) & 255);
        int i5 = i4 + 1;
        bArr[i4] = (byte) ((i >>> 8) & 255);
        bArr[i5] = (byte) (i & 255);
        m11690b.f11439c = i5 + 1;
        this.f11390c += 4;
        return this;
    }

    @Override // p275e.InterfaceC2720h
    public /* bridge */ /* synthetic */ InterfaceC2720h writeInt(int i) {
        writeInt(i);
        return this;
    }

    @Override // p275e.InterfaceC2720h
    public C2719g writeShort(int i) {
        C2738z m11690b = m11690b(2);
        byte[] bArr = m11690b.f11437a;
        int i2 = m11690b.f11439c;
        int i3 = i2 + 1;
        bArr[i2] = (byte) ((i >>> 8) & 255);
        bArr[i3] = (byte) (i & 255);
        m11690b.f11439c = i3 + 1;
        this.f11390c += 2;
        return this;
    }

    @Override // p275e.InterfaceC2720h
    public /* bridge */ /* synthetic */ InterfaceC2720h writeShort(int i) {
        writeShort(i);
        return this;
    }
}
