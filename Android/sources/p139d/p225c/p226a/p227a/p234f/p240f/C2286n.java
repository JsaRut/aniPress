package p139d.p225c.p226a.p227a.p234f.p240f;

import java.util.Arrays;
import p139d.p225c.p226a.p227a.C2683z;
import p139d.p225c.p226a.p227a.p270n.C2638o;
import p139d.p225c.p226a.p227a.p270n.C2644u;

/* renamed from: d.c.a.a.f.f.n */
/* loaded from: classes.dex */
final class C2286n {

    /* renamed from: d.c.a.a.f.f.n$a */
    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a */
        public final int f8773a;

        /* renamed from: b */
        public final int f8774b;

        /* renamed from: c */
        public final long[] f8775c;

        /* renamed from: d */
        public final int f8776d;

        /* renamed from: e */
        public final boolean f8777e;

        public a(int i, int i2, long[] jArr, int i3, boolean z) {
            this.f8773a = i;
            this.f8774b = i2;
            this.f8775c = jArr;
            this.f8776d = i3;
            this.f8777e = z;
        }
    }

    /* renamed from: d.c.a.a.f.f.n$b */
    /* loaded from: classes.dex */
    public static final class b {

        /* renamed from: a */
        public final String f8778a;

        /* renamed from: b */
        public final String[] f8779b;

        /* renamed from: c */
        public final int f8780c;

        public b(String str, String[] strArr, int i) {
            this.f8778a = str;
            this.f8779b = strArr;
            this.f8780c = i;
        }
    }

    /* renamed from: d.c.a.a.f.f.n$c */
    /* loaded from: classes.dex */
    public static final class c {

        /* renamed from: a */
        public final boolean f8781a;

        /* renamed from: b */
        public final int f8782b;

        /* renamed from: c */
        public final int f8783c;

        /* renamed from: d */
        public final int f8784d;

        public c(boolean z, int i, int i2, int i3) {
            this.f8781a = z;
            this.f8782b = i;
            this.f8783c = i2;
            this.f8784d = i3;
        }
    }

    /* renamed from: d.c.a.a.f.f.n$d */
    /* loaded from: classes.dex */
    public static final class d {

        /* renamed from: a */
        public final long f8785a;

        /* renamed from: b */
        public final int f8786b;

        /* renamed from: c */
        public final long f8787c;

        /* renamed from: d */
        public final int f8788d;

        /* renamed from: e */
        public final int f8789e;

        /* renamed from: f */
        public final int f8790f;

        /* renamed from: g */
        public final int f8791g;

        /* renamed from: h */
        public final int f8792h;

        /* renamed from: i */
        public final boolean f8793i;

        /* renamed from: j */
        public final byte[] f8794j;

        public d(long j, int i, long j2, int i2, int i3, int i4, int i5, int i6, boolean z, byte[] bArr) {
            this.f8785a = j;
            this.f8786b = i;
            this.f8787c = j2;
            this.f8788d = i2;
            this.f8789e = i3;
            this.f8790f = i4;
            this.f8791g = i5;
            this.f8792h = i6;
            this.f8793i = z;
            this.f8794j = bArr;
        }
    }

    /* renamed from: a */
    public static int m9489a(int i) {
        int i2 = 0;
        while (i > 0) {
            i2++;
            i >>>= 1;
        }
        return i2;
    }

    /* renamed from: a */
    private static long m9490a(long j, long j2) {
        double d2 = j2;
        Double.isNaN(d2);
        return (long) Math.floor(Math.pow(j, 1.0d / d2));
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* renamed from: a */
    private static a m9491a(C2284l c2284l) {
        if (c2284l.m9481a(24) != 5653314) {
            throw new C2683z("expected code book to start with [0x56, 0x43, 0x42] at " + c2284l.m9480a());
        }
        int m9481a = c2284l.m9481a(16);
        int m9481a2 = c2284l.m9481a(24);
        long[] jArr = new long[m9481a2];
        boolean m9483b = c2284l.m9483b();
        long j = 0;
        if (m9483b) {
            int m9481a3 = c2284l.m9481a(5) + 1;
            int i = 0;
            while (i < jArr.length) {
                int m9481a4 = c2284l.m9481a(m9489a(m9481a2 - i));
                int i2 = i;
                for (int i3 = 0; i3 < m9481a4 && i2 < jArr.length; i3++) {
                    jArr[i2] = m9481a3;
                    i2++;
                }
                m9481a3++;
                i = i2;
            }
        } else {
            boolean m9483b2 = c2284l.m9483b();
            for (int i4 = 0; i4 < jArr.length; i4++) {
                if (!m9483b2) {
                    jArr[i4] = c2284l.m9481a(5) + 1;
                } else if (c2284l.m9483b()) {
                    jArr[i4] = c2284l.m9481a(5) + 1;
                } else {
                    jArr[i4] = 0;
                }
            }
        }
        int m9481a5 = c2284l.m9481a(4);
        if (m9481a5 > 2) {
            throw new C2683z("lookup type greater than 2 not decodable: " + m9481a5);
        }
        if (m9481a5 == 1 || m9481a5 == 2) {
            c2284l.m9482b(32);
            c2284l.m9482b(32);
            int m9481a6 = c2284l.m9481a(4) + 1;
            c2284l.m9482b(1);
            if (m9481a5 != 1) {
                j = m9481a2 * m9481a;
            } else if (m9481a != 0) {
                j = m9490a(m9481a2, m9481a);
            }
            c2284l.m9482b((int) (j * m9481a6));
        }
        return new a(m9481a, m9481a2, jArr, m9481a5, m9483b);
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* renamed from: a */
    public static b m9492a(C2644u c2644u) {
        m9494a(3, c2644u, false);
        String m11216b = c2644u.m11216b((int) c2644u.m11231m());
        int length = 11 + m11216b.length();
        long m11231m = c2644u.m11231m();
        String[] strArr = new String[(int) m11231m];
        int i = length + 4;
        for (int i2 = 0; i2 < m11231m; i2++) {
            strArr[i2] = c2644u.m11216b((int) c2644u.m11231m());
            i = i + 4 + strArr[i2].length();
        }
        if ((c2644u.m11238t() & 1) != 0) {
            return new b(m11216b, strArr, i + 1);
        }
        throw new C2683z("framing bit expected to be set");
    }

    /* renamed from: a */
    private static void m9493a(int i, C2284l c2284l) {
        int m9481a = c2284l.m9481a(6) + 1;
        for (int i2 = 0; i2 < m9481a; i2++) {
            int m9481a2 = c2284l.m9481a(16);
            if (m9481a2 != 0) {
                C2638o.m11157b("VorbisUtil", "mapping type other than 0 not supported: " + m9481a2);
            } else {
                int m9481a3 = c2284l.m9483b() ? c2284l.m9481a(4) + 1 : 1;
                if (c2284l.m9483b()) {
                    int m9481a4 = c2284l.m9481a(8) + 1;
                    for (int i3 = 0; i3 < m9481a4; i3++) {
                        int i4 = i - 1;
                        c2284l.m9482b(m9489a(i4));
                        c2284l.m9482b(m9489a(i4));
                    }
                }
                if (c2284l.m9481a(2) != 0) {
                    throw new C2683z("to reserved bits must be zero after mapping coupling steps");
                }
                if (m9481a3 > 1) {
                    for (int i5 = 0; i5 < i; i5++) {
                        c2284l.m9482b(4);
                    }
                }
                for (int i6 = 0; i6 < m9481a3; i6++) {
                    c2284l.m9482b(8);
                    c2284l.m9482b(8);
                    c2284l.m9482b(8);
                }
            }
        }
    }

    /* renamed from: a */
    public static boolean m9494a(int i, C2644u c2644u, boolean z) {
        if (c2644u.m11208a() < 7) {
            if (z) {
                return false;
            }
            throw new C2683z("too short header: " + c2644u.m11208a());
        }
        if (c2644u.m11238t() != i) {
            if (z) {
                return false;
            }
            throw new C2683z("expected header type " + Integer.toHexString(i));
        }
        if (c2644u.m11238t() == 118 && c2644u.m11238t() == 111 && c2644u.m11238t() == 114 && c2644u.m11238t() == 98 && c2644u.m11238t() == 105 && c2644u.m11238t() == 115) {
            return true;
        }
        if (z) {
            return false;
        }
        throw new C2683z("expected characters 'vorbis'");
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* renamed from: a */
    public static c[] m9495a(C2644u c2644u, int i) {
        m9494a(5, c2644u, false);
        int m11238t = c2644u.m11238t() + 1;
        C2284l c2284l = new C2284l(c2644u.f11004a);
        c2284l.m9482b(c2644u.m11217c() * 8);
        for (int i2 = 0; i2 < m11238t; i2++) {
            m9491a(c2284l);
        }
        int m9481a = c2284l.m9481a(6) + 1;
        for (int i3 = 0; i3 < m9481a; i3++) {
            if (c2284l.m9481a(16) != 0) {
                throw new C2683z("placeholder of time domain transforms not zeroed out");
            }
        }
        m9497b(c2284l);
        m9499d(c2284l);
        m9493a(i, c2284l);
        c[] m9498c = m9498c(c2284l);
        if (c2284l.m9483b()) {
            return m9498c;
        }
        throw new C2683z("framing bit after modes not set as expected");
    }

    /* renamed from: b */
    public static d m9496b(C2644u c2644u) {
        m9494a(1, c2644u, false);
        long m11231m = c2644u.m11231m();
        int m11238t = c2644u.m11238t();
        long m11231m2 = c2644u.m11231m();
        int m11229k = c2644u.m11229k();
        int m11229k2 = c2644u.m11229k();
        int m11229k3 = c2644u.m11229k();
        int m11238t2 = c2644u.m11238t();
        return new d(m11231m, m11238t, m11231m2, m11229k, m11229k2, m11229k3, (int) Math.pow(2.0d, m11238t2 & 15), (int) Math.pow(2.0d, (m11238t2 & 240) >> 4), (c2644u.m11238t() & 1) > 0, Arrays.copyOf(c2644u.f11004a, c2644u.m11219d()));
    }

    /* renamed from: b */
    private static void m9497b(C2284l c2284l) {
        int m9481a = c2284l.m9481a(6) + 1;
        for (int i = 0; i < m9481a; i++) {
            int m9481a2 = c2284l.m9481a(16);
            if (m9481a2 == 0) {
                c2284l.m9482b(8);
                c2284l.m9482b(16);
                c2284l.m9482b(16);
                c2284l.m9482b(6);
                c2284l.m9482b(8);
                int m9481a3 = c2284l.m9481a(4) + 1;
                for (int i2 = 0; i2 < m9481a3; i2++) {
                    c2284l.m9482b(8);
                }
            } else {
                if (m9481a2 != 1) {
                    throw new C2683z("floor type greater than 1 not decodable: " + m9481a2);
                }
                int m9481a4 = c2284l.m9481a(5);
                int[] iArr = new int[m9481a4];
                int i3 = -1;
                for (int i4 = 0; i4 < m9481a4; i4++) {
                    iArr[i4] = c2284l.m9481a(4);
                    if (iArr[i4] > i3) {
                        i3 = iArr[i4];
                    }
                }
                int[] iArr2 = new int[i3 + 1];
                for (int i5 = 0; i5 < iArr2.length; i5++) {
                    iArr2[i5] = c2284l.m9481a(3) + 1;
                    int m9481a5 = c2284l.m9481a(2);
                    if (m9481a5 > 0) {
                        c2284l.m9482b(8);
                    }
                    for (int i6 = 0; i6 < (1 << m9481a5); i6++) {
                        c2284l.m9482b(8);
                    }
                }
                c2284l.m9482b(2);
                int m9481a6 = c2284l.m9481a(4);
                int i7 = 0;
                int i8 = 0;
                for (int i9 = 0; i9 < m9481a4; i9++) {
                    i7 += iArr2[iArr[i9]];
                    while (i8 < i7) {
                        c2284l.m9482b(m9481a6);
                        i8++;
                    }
                }
            }
        }
    }

    /* renamed from: c */
    private static c[] m9498c(C2284l c2284l) {
        int m9481a = c2284l.m9481a(6) + 1;
        c[] cVarArr = new c[m9481a];
        for (int i = 0; i < m9481a; i++) {
            cVarArr[i] = new c(c2284l.m9483b(), c2284l.m9481a(16), c2284l.m9481a(16), c2284l.m9481a(8));
        }
        return cVarArr;
    }

    /* renamed from: d */
    private static void m9499d(C2284l c2284l) {
        int m9481a = c2284l.m9481a(6) + 1;
        for (int i = 0; i < m9481a; i++) {
            if (c2284l.m9481a(16) > 2) {
                throw new C2683z("residueType greater than 2 is not decodable");
            }
            c2284l.m9482b(24);
            c2284l.m9482b(24);
            c2284l.m9482b(24);
            int m9481a2 = c2284l.m9481a(6) + 1;
            c2284l.m9482b(8);
            int[] iArr = new int[m9481a2];
            for (int i2 = 0; i2 < m9481a2; i2++) {
                iArr[i2] = ((c2284l.m9483b() ? c2284l.m9481a(5) : 0) * 8) + c2284l.m9481a(3);
            }
            for (int i3 = 0; i3 < m9481a2; i3++) {
                for (int i4 = 0; i4 < 8; i4++) {
                    if ((iArr[i3] & (1 << i4)) != 0) {
                        c2284l.m9482b(8);
                    }
                }
            }
        }
    }
}
