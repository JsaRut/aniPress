package p139d.p225c.p226a.p227a.p234f.p239e;

import android.util.Pair;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import p139d.p225c.p226a.p227a.C2676s;
import p139d.p225c.p226a.p227a.C2683z;
import p139d.p225c.p226a.p227a.p229b.C2171h;
import p139d.p225c.p226a.p227a.p231d.C2213m;
import p139d.p225c.p226a.p227a.p234f.C2331k;
import p139d.p225c.p226a.p227a.p234f.p239e.AbstractC2258c;
import p139d.p225c.p226a.p227a.p234f.p239e.C2262g;
import p139d.p225c.p226a.p227a.p245h.C2353b;
import p139d.p225c.p226a.p227a.p270n.C2622I;
import p139d.p225c.p226a.p227a.p270n.C2628e;
import p139d.p225c.p226a.p227a.p270n.C2630g;
import p139d.p225c.p226a.p227a.p270n.C2638o;
import p139d.p225c.p226a.p227a.p270n.C2641r;
import p139d.p225c.p226a.p227a.p270n.C2644u;
import p139d.p225c.p226a.p227a.p271o.C2660h;
import p139d.p225c.p226a.p227a.p271o.C2662j;
import p139d.p225c.p226a.p227a.p271o.C2665m;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: d.c.a.a.f.e.d */
/* loaded from: classes.dex */
public final class C2259d {

    /* renamed from: a */
    private static final int f8506a = C2622I.m11078b("vide");

    /* renamed from: b */
    private static final int f8507b = C2622I.m11078b("soun");

    /* renamed from: c */
    private static final int f8508c = C2622I.m11078b("text");

    /* renamed from: d */
    private static final int f8509d = C2622I.m11078b("sbtl");

    /* renamed from: e */
    private static final int f8510e = C2622I.m11078b("subt");

    /* renamed from: f */
    private static final int f8511f = C2622I.m11078b("clcp");

    /* renamed from: g */
    private static final int f8512g = C2622I.m11078b("meta");

    /* renamed from: h */
    private static final byte[] f8513h = C2622I.m11086c("OpusHead");

    /* renamed from: d.c.a.a.f.e.d$a */
    /* loaded from: classes.dex */
    private static final class a {

        /* renamed from: a */
        public final int f8514a;

        /* renamed from: b */
        public int f8515b;

        /* renamed from: c */
        public int f8516c;

        /* renamed from: d */
        public long f8517d;

        /* renamed from: e */
        private final boolean f8518e;

        /* renamed from: f */
        private final C2644u f8519f;

        /* renamed from: g */
        private final C2644u f8520g;

        /* renamed from: h */
        private int f8521h;

        /* renamed from: i */
        private int f8522i;

        public a(C2644u c2644u, C2644u c2644u2, boolean z) {
            this.f8520g = c2644u;
            this.f8519f = c2644u2;
            this.f8518e = z;
            c2644u2.m11222e(12);
            this.f8514a = c2644u2.m11242x();
            c2644u.m11222e(12);
            this.f8522i = c2644u.m11242x();
            C2628e.m11114b(c2644u.m11226h() == 1, "first_chunk must be 1");
            this.f8515b = -1;
        }

        /* renamed from: a */
        public boolean m9332a() {
            int i = this.f8515b + 1;
            this.f8515b = i;
            if (i == this.f8514a) {
                return false;
            }
            this.f8517d = this.f8518e ? this.f8519f.m11243y() : this.f8519f.m11240v();
            if (this.f8515b == this.f8521h) {
                this.f8516c = this.f8520g.m11242x();
                this.f8520g.m11224f(4);
                int i2 = this.f8522i - 1;
                this.f8522i = i2;
                this.f8521h = i2 > 0 ? this.f8520g.m11242x() - 1 : -1;
            }
            return true;
        }
    }

    /* renamed from: d.c.a.a.f.e.d$b */
    /* loaded from: classes.dex */
    private interface b {
        /* renamed from: a */
        boolean mo9333a();

        /* renamed from: b */
        int mo9334b();

        /* renamed from: c */
        int mo9335c();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: d.c.a.a.f.e.d$c */
    /* loaded from: classes.dex */
    public static final class c {

        /* renamed from: a */
        public final C2269n[] f8523a;

        /* renamed from: b */
        public C2676s f8524b;

        /* renamed from: c */
        public int f8525c;

        /* renamed from: d */
        public int f8526d = 0;

        public c(int i) {
            this.f8523a = new C2269n[i];
        }
    }

    /* renamed from: d.c.a.a.f.e.d$d */
    /* loaded from: classes.dex */
    static final class d implements b {

        /* renamed from: a */
        private final int f8527a;

        /* renamed from: b */
        private final int f8528b;

        /* renamed from: c */
        private final C2644u f8529c;

        public d(AbstractC2258c.b bVar) {
            this.f8529c = bVar.f8505Wa;
            this.f8529c.m11222e(12);
            this.f8527a = this.f8529c.m11242x();
            this.f8528b = this.f8529c.m11242x();
        }

        @Override // p139d.p225c.p226a.p227a.p234f.p239e.C2259d.b
        /* renamed from: a */
        public boolean mo9333a() {
            return this.f8527a != 0;
        }

        @Override // p139d.p225c.p226a.p227a.p234f.p239e.C2259d.b
        /* renamed from: b */
        public int mo9334b() {
            return this.f8528b;
        }

        @Override // p139d.p225c.p226a.p227a.p234f.p239e.C2259d.b
        /* renamed from: c */
        public int mo9335c() {
            int i = this.f8527a;
            return i == 0 ? this.f8529c.m11242x() : i;
        }
    }

    /* renamed from: d.c.a.a.f.e.d$e */
    /* loaded from: classes.dex */
    static final class e implements b {

        /* renamed from: a */
        private final C2644u f8530a;

        /* renamed from: b */
        private final int f8531b;

        /* renamed from: c */
        private final int f8532c;

        /* renamed from: d */
        private int f8533d;

        /* renamed from: e */
        private int f8534e;

        public e(AbstractC2258c.b bVar) {
            this.f8530a = bVar.f8505Wa;
            this.f8530a.m11222e(12);
            this.f8532c = this.f8530a.m11242x() & 255;
            this.f8531b = this.f8530a.m11242x();
        }

        @Override // p139d.p225c.p226a.p227a.p234f.p239e.C2259d.b
        /* renamed from: a */
        public boolean mo9333a() {
            return false;
        }

        @Override // p139d.p225c.p226a.p227a.p234f.p239e.C2259d.b
        /* renamed from: b */
        public int mo9334b() {
            return this.f8531b;
        }

        @Override // p139d.p225c.p226a.p227a.p234f.p239e.C2259d.b
        /* renamed from: c */
        public int mo9335c() {
            int i = this.f8532c;
            if (i == 8) {
                return this.f8530a.m11238t();
            }
            if (i == 16) {
                return this.f8530a.m11244z();
            }
            int i2 = this.f8533d;
            this.f8533d = i2 + 1;
            if (i2 % 2 != 0) {
                return this.f8534e & 15;
            }
            this.f8534e = this.f8530a.m11238t();
            return (this.f8534e & 240) >> 4;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: d.c.a.a.f.e.d$f */
    /* loaded from: classes.dex */
    public static final class f {

        /* renamed from: a */
        private final int f8535a;

        /* renamed from: b */
        private final long f8536b;

        /* renamed from: c */
        private final int f8537c;

        public f(int i, long j, int i2) {
            this.f8535a = i;
            this.f8536b = j;
            this.f8537c = i2;
        }
    }

    /* renamed from: a */
    private static int m9309a(C2644u c2644u) {
        int m11238t = c2644u.m11238t();
        int i = m11238t & 127;
        while ((m11238t & 128) == 128) {
            m11238t = c2644u.m11238t();
            i = (i << 7) | (m11238t & 127);
        }
        return i;
    }

    /* renamed from: a */
    private static Pair<long[], long[]> m9310a(AbstractC2258c.a aVar) {
        AbstractC2258c.b m9308e;
        if (aVar == null || (m9308e = aVar.m9308e(AbstractC2258c.f8434Q)) == null) {
            return Pair.create(null, null);
        }
        C2644u c2644u = m9308e.f8505Wa;
        c2644u.m11222e(8);
        int m9304c = AbstractC2258c.m9304c(c2644u.m11226h());
        int m11242x = c2644u.m11242x();
        long[] jArr = new long[m11242x];
        long[] jArr2 = new long[m11242x];
        for (int i = 0; i < m11242x; i++) {
            jArr[i] = m9304c == 1 ? c2644u.m11243y() : c2644u.m11240v();
            jArr2[i] = m9304c == 1 ? c2644u.m11234p() : c2644u.m11226h();
            if (c2644u.m11236r() != 1) {
                throw new IllegalArgumentException("Unsupported media rate.");
            }
            c2644u.m11224f(2);
        }
        return Pair.create(jArr, jArr2);
    }

    /* renamed from: a */
    private static Pair<String, byte[]> m9311a(C2644u c2644u, int i) {
        c2644u.m11222e(i + 8 + 4);
        c2644u.m11224f(1);
        m9309a(c2644u);
        c2644u.m11224f(2);
        int m11238t = c2644u.m11238t();
        if ((m11238t & 128) != 0) {
            c2644u.m11224f(2);
        }
        if ((m11238t & 64) != 0) {
            c2644u.m11224f(c2644u.m11244z());
        }
        if ((m11238t & 32) != 0) {
            c2644u.m11224f(2);
        }
        c2644u.m11224f(1);
        m9309a(c2644u);
        String m11165a = C2641r.m11165a(c2644u.m11238t());
        if ("audio/mpeg".equals(m11165a) || "audio/vnd.dts".equals(m11165a) || "audio/vnd.dts.hd".equals(m11165a)) {
            return Pair.create(m11165a, null);
        }
        c2644u.m11224f(12);
        c2644u.m11224f(1);
        int m9309a = m9309a(c2644u);
        byte[] bArr = new byte[m9309a];
        c2644u.m11214a(bArr, 0, m9309a);
        return Pair.create(m11165a, bArr);
    }

    /* renamed from: a */
    static Pair<Integer, C2269n> m9312a(C2644u c2644u, int i, int i2) {
        int i3 = i + 8;
        String str = null;
        Integer num = null;
        int i4 = -1;
        int i5 = 0;
        while (i3 - i < i2) {
            c2644u.m11222e(i3);
            int m11226h = c2644u.m11226h();
            int m11226h2 = c2644u.m11226h();
            if (m11226h2 == AbstractC2258c.f8452ba) {
                num = Integer.valueOf(c2644u.m11226h());
            } else if (m11226h2 == AbstractC2258c.f8445W) {
                c2644u.m11224f(4);
                str = c2644u.m11216b(4);
            } else if (m11226h2 == AbstractC2258c.f8446X) {
                i4 = i3;
                i5 = m11226h;
            }
            i3 += m11226h;
        }
        if (!"cenc".equals(str) && !"cbc1".equals(str) && !"cens".equals(str) && !"cbcs".equals(str)) {
            return null;
        }
        C2628e.m11112a(num != null, "frma atom is mandatory");
        C2628e.m11112a(i4 != -1, "schi atom is mandatory");
        C2269n m9315a = m9315a(c2644u, i4, i5, str);
        C2628e.m11112a(m9315a != null, "tenc atom is mandatory");
        return Pair.create(num, m9315a);
    }

    /* renamed from: a */
    private static c m9313a(C2644u c2644u, int i, int i2, String str, C2213m c2213m, boolean z) {
        c2644u.m11222e(12);
        int m11226h = c2644u.m11226h();
        c cVar = new c(m11226h);
        for (int i3 = 0; i3 < m11226h; i3++) {
            int m11217c = c2644u.m11217c();
            int m11226h2 = c2644u.m11226h();
            C2628e.m11112a(m11226h2 > 0, "childAtomSize should be positive");
            int m11226h3 = c2644u.m11226h();
            if (m11226h3 == AbstractC2258c.f8451b || m11226h3 == AbstractC2258c.f8453c || m11226h3 == AbstractC2258c.f8448Z || m11226h3 == AbstractC2258c.f8472la || m11226h3 == AbstractC2258c.f8455d || m11226h3 == AbstractC2258c.f8457e || m11226h3 == AbstractC2258c.f8459f || m11226h3 == AbstractC2258c.f8423Ka || m11226h3 == AbstractC2258c.f8425La) {
                m9318a(c2644u, m11226h3, m11217c, m11226h2, i, i2, c2213m, cVar, i3);
            } else if (m11226h3 == AbstractC2258c.f8465i || m11226h3 == AbstractC2258c.f8450aa || m11226h3 == AbstractC2258c.f8475n || m11226h3 == AbstractC2258c.f8479p || m11226h3 == AbstractC2258c.f8483r || m11226h3 == AbstractC2258c.f8489u || m11226h3 == AbstractC2258c.f8485s || m11226h3 == AbstractC2258c.f8487t || m11226h3 == AbstractC2258c.f8498ya || m11226h3 == AbstractC2258c.f8500za || m11226h3 == AbstractC2258c.f8471l || m11226h3 == AbstractC2258c.f8473m || m11226h3 == AbstractC2258c.f8467j || m11226h3 == AbstractC2258c.f8431Oa || m11226h3 == AbstractC2258c.f8433Pa || m11226h3 == AbstractC2258c.f8435Qa || m11226h3 == AbstractC2258c.f8437Ra || m11226h3 == AbstractC2258c.f8441Ta) {
                m9320a(c2644u, m11226h3, m11217c, m11226h2, i, str, z, c2213m, cVar, i3);
            } else if (m11226h3 == AbstractC2258c.f8468ja || m11226h3 == AbstractC2258c.f8490ua || m11226h3 == AbstractC2258c.f8492va || m11226h3 == AbstractC2258c.f8494wa || m11226h3 == AbstractC2258c.f8496xa) {
                m9319a(c2644u, m11226h3, m11217c, m11226h2, i, str, cVar);
            } else if (m11226h3 == AbstractC2258c.f8429Na) {
                cVar.f8524b = C2676s.m11430a(Integer.toString(i), "application/x-camera-motion", (String) null, -1, (C2213m) null);
            }
            c2644u.m11222e(m11217c + m11226h2);
        }
        return cVar;
    }

    /* renamed from: a */
    public static C2268m m9314a(AbstractC2258c.a aVar, AbstractC2258c.b bVar, long j, C2213m c2213m, boolean z, boolean z2) {
        AbstractC2258c.b bVar2;
        long j2;
        long[] jArr;
        long[] jArr2;
        AbstractC2258c.a m9307d = aVar.m9307d(AbstractC2258c.f8410E);
        int m9322b = m9322b(m9307d.m9308e(AbstractC2258c.f8438S).f8505Wa);
        if (m9322b == -1) {
            return null;
        }
        f m9331e = m9331e(aVar.m9308e(AbstractC2258c.f8430O).f8505Wa);
        if (j == -9223372036854775807L) {
            j2 = m9331e.f8536b;
            bVar2 = bVar;
        } else {
            bVar2 = bVar;
            j2 = j;
        }
        long m9329d = m9329d(bVar2.f8505Wa);
        long m11085c = j2 != -9223372036854775807L ? C2622I.m11085c(j2, 1000000L, m9329d) : -9223372036854775807L;
        AbstractC2258c.a m9307d2 = m9307d.m9307d(AbstractC2258c.f8412F).m9307d(AbstractC2258c.f8414G);
        Pair<Long, String> m9325c = m9325c(m9307d.m9308e(AbstractC2258c.f8436R).f8505Wa);
        c m9313a = m9313a(m9307d2.m9308e(AbstractC2258c.f8440T).f8505Wa, m9331e.f8535a, m9331e.f8537c, (String) m9325c.second, c2213m, z2);
        if (z) {
            jArr = null;
            jArr2 = null;
        } else {
            Pair<long[], long[]> m9310a = m9310a(aVar.m9307d(AbstractC2258c.f8432P));
            long[] jArr3 = (long[]) m9310a.first;
            jArr2 = (long[]) m9310a.second;
            jArr = jArr3;
        }
        if (m9313a.f8524b == null) {
            return null;
        }
        return new C2268m(m9331e.f8535a, m9322b, ((Long) m9325c.first).longValue(), m9329d, m11085c, m9313a.f8524b, m9313a.f8526d, m9313a.f8523a, m9313a.f8525c, jArr, jArr2);
    }

    /* renamed from: a */
    private static C2269n m9315a(C2644u c2644u, int i, int i2, String str) {
        int i3;
        int i4;
        int i5 = i + 8;
        while (true) {
            byte[] bArr = null;
            if (i5 - i >= i2) {
                return null;
            }
            c2644u.m11222e(i5);
            int m11226h = c2644u.m11226h();
            if (c2644u.m11226h() == AbstractC2258c.f8447Y) {
                int m9304c = AbstractC2258c.m9304c(c2644u.m11226h());
                c2644u.m11224f(1);
                if (m9304c == 0) {
                    c2644u.m11224f(1);
                    i4 = 0;
                    i3 = 0;
                } else {
                    int m11238t = c2644u.m11238t();
                    i3 = m11238t & 15;
                    i4 = (m11238t & 240) >> 4;
                }
                boolean z = c2644u.m11238t() == 1;
                int m11238t2 = c2644u.m11238t();
                byte[] bArr2 = new byte[16];
                c2644u.m11214a(bArr2, 0, bArr2.length);
                if (z && m11238t2 == 0) {
                    int m11238t3 = c2644u.m11238t();
                    bArr = new byte[m11238t3];
                    c2644u.m11214a(bArr, 0, m11238t3);
                }
                return new C2269n(z, str, m11238t2, bArr2, i4, i3, bArr);
            }
            i5 += m11226h;
        }
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* renamed from: a */
    public static C2271p m9316a(C2268m c2268m, AbstractC2258c.a aVar, C2331k c2331k) {
        b eVar;
        boolean z;
        int i;
        int i2;
        int i3;
        long[] jArr;
        int[] iArr;
        int i4;
        long[] jArr2;
        int[] iArr2;
        long j;
        int[] iArr3;
        int i5;
        long[] jArr3;
        int[] iArr4;
        int[] iArr5;
        int i6;
        boolean z2;
        int i7;
        int i8;
        boolean z3;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        C2268m c2268m2 = c2268m;
        AbstractC2258c.b m9308e = aVar.m9308e(AbstractC2258c.f8482qa);
        if (m9308e != null) {
            eVar = new d(m9308e);
        } else {
            AbstractC2258c.b m9308e2 = aVar.m9308e(AbstractC2258c.f8484ra);
            if (m9308e2 == null) {
                throw new C2683z("Track has no sample table size information");
            }
            eVar = new e(m9308e2);
        }
        int mo9334b = eVar.mo9334b();
        if (mo9334b == 0) {
            return new C2271p(c2268m, new long[0], new int[0], 0, new long[0], new int[0], -9223372036854775807L);
        }
        AbstractC2258c.b m9308e3 = aVar.m9308e(AbstractC2258c.f8486sa);
        if (m9308e3 == null) {
            m9308e3 = aVar.m9308e(AbstractC2258c.f8488ta);
            z = true;
        } else {
            z = false;
        }
        C2644u c2644u = m9308e3.f8505Wa;
        C2644u c2644u2 = aVar.m9308e(AbstractC2258c.f8480pa).f8505Wa;
        C2644u c2644u3 = aVar.m9308e(AbstractC2258c.f8474ma).f8505Wa;
        AbstractC2258c.b m9308e4 = aVar.m9308e(AbstractC2258c.f8476na);
        C2644u c2644u4 = m9308e4 != null ? m9308e4.f8505Wa : null;
        AbstractC2258c.b m9308e5 = aVar.m9308e(AbstractC2258c.f8478oa);
        C2644u c2644u5 = m9308e5 != null ? m9308e5.f8505Wa : null;
        a aVar2 = new a(c2644u2, c2644u, z);
        c2644u3.m11222e(12);
        int m11242x = c2644u3.m11242x() - 1;
        int m11242x2 = c2644u3.m11242x();
        int m11242x3 = c2644u3.m11242x();
        if (c2644u5 != null) {
            c2644u5.m11222e(12);
            i = c2644u5.m11242x();
        } else {
            i = 0;
        }
        int i14 = -1;
        if (c2644u4 != null) {
            c2644u4.m11222e(12);
            i2 = c2644u4.m11242x();
            if (i2 > 0) {
                i14 = c2644u4.m11242x() - 1;
            } else {
                c2644u4 = null;
            }
        } else {
            i2 = 0;
        }
        if (eVar.mo9333a() && "audio/raw".equals(c2268m2.f8661f.f11182g) && m11242x == 0 && i == 0 && i2 == 0) {
            i3 = mo9334b;
            int i15 = aVar2.f8514a;
            long[] jArr4 = new long[i15];
            int[] iArr6 = new int[i15];
            while (aVar2.m9332a()) {
                int i16 = aVar2.f8515b;
                jArr4[i16] = aVar2.f8517d;
                iArr6[i16] = aVar2.f8516c;
            }
            C2676s c2676s = c2268m2.f8661f;
            C2262g.a m9339a = C2262g.m9339a(C2622I.m11075b(c2676s.f11197v, c2676s.f11195t), jArr4, iArr6, m11242x3);
            jArr = m9339a.f8542a;
            iArr = m9339a.f8543b;
            i4 = m9339a.f8544c;
            jArr2 = m9339a.f8545d;
            iArr2 = m9339a.f8546e;
            j = m9339a.f8547f;
        } else {
            long[] jArr5 = new long[mo9334b];
            int[] iArr7 = new int[mo9334b];
            long[] jArr6 = new long[mo9334b];
            int i17 = i2;
            iArr2 = new int[mo9334b];
            int i18 = m11242x;
            int i19 = m11242x3;
            long j2 = 0;
            long j3 = 0;
            int i20 = 0;
            int i21 = 0;
            int i22 = 0;
            int i23 = 0;
            int i24 = i17;
            int i25 = i;
            int i26 = m11242x2;
            int i27 = i14;
            int i28 = 0;
            while (true) {
                if (i21 >= mo9334b) {
                    i3 = mo9334b;
                    i7 = i24;
                    i8 = i26;
                    break;
                }
                long j4 = j3;
                boolean z4 = true;
                while (i28 == 0) {
                    z4 = aVar2.m9332a();
                    if (!z4) {
                        break;
                    }
                    int i29 = i24;
                    long j5 = aVar2.f8517d;
                    i28 = aVar2.f8516c;
                    j4 = j5;
                    i24 = i29;
                    i26 = i26;
                    mo9334b = mo9334b;
                }
                int i30 = mo9334b;
                i7 = i24;
                i8 = i26;
                if (!z4) {
                    C2638o.m11160d("AtomParsers", "Unexpected end of chunk data");
                    jArr5 = Arrays.copyOf(jArr5, i21);
                    iArr7 = Arrays.copyOf(iArr7, i21);
                    jArr6 = Arrays.copyOf(jArr6, i21);
                    iArr2 = Arrays.copyOf(iArr2, i21);
                    i3 = i21;
                    break;
                }
                if (c2644u5 != null) {
                    int i31 = i25;
                    while (i22 == 0 && i31 > 0) {
                        i22 = c2644u5.m11242x();
                        i23 = c2644u5.m11226h();
                        i31--;
                    }
                    i22--;
                    i11 = i31;
                } else {
                    i11 = i25;
                }
                int i32 = i23;
                jArr5[i21] = j4;
                iArr7[i21] = eVar.mo9335c();
                if (iArr7[i21] > i20) {
                    i20 = iArr7[i21];
                }
                jArr6[i21] = j2 + i32;
                iArr2[i21] = c2644u4 == null ? 1 : 0;
                if (i21 == i27) {
                    iArr2[i21] = 1;
                    int i33 = i7 - 1;
                    if (i33 > 0) {
                        i27 = c2644u4.m11242x() - 1;
                    }
                    i12 = i20;
                    i24 = i33;
                    i13 = i32;
                } else {
                    i12 = i20;
                    i13 = i32;
                    i24 = i7;
                }
                j2 += i19;
                int i34 = i8 - 1;
                if (i34 == 0 && i18 > 0) {
                    i34 = c2644u3.m11242x();
                    i18--;
                    i19 = c2644u3.m11226h();
                }
                int i35 = i34;
                long j6 = j4 + iArr7[i21];
                i28--;
                i21++;
                i23 = i13;
                i26 = i35;
                j3 = j6;
                i20 = i12;
                i25 = i11;
                mo9334b = i30;
            }
            int i36 = i28;
            j = j2 + i23;
            int i37 = i25;
            while (true) {
                if (i37 <= 0) {
                    z3 = true;
                    break;
                }
                if (c2644u5.m11242x() != 0) {
                    z3 = false;
                    break;
                }
                c2644u5.m11226h();
                i37--;
            }
            if (i7 == 0 && i8 == 0 && i36 == 0 && i18 == 0) {
                i9 = i22;
                if (i9 == 0 && z3) {
                    i10 = i20;
                    c2268m2 = c2268m;
                    jArr = jArr5;
                    jArr2 = jArr6;
                    i4 = i10;
                    iArr = iArr7;
                }
            } else {
                i9 = i22;
            }
            StringBuilder sb = new StringBuilder();
            sb.append("Inconsistent stbl box for track ");
            i10 = i20;
            c2268m2 = c2268m;
            sb.append(c2268m2.f8656a);
            sb.append(": remainingSynchronizationSamples ");
            sb.append(i7);
            sb.append(", remainingSamplesAtTimestampDelta ");
            sb.append(i8);
            sb.append(", remainingSamplesInChunk ");
            sb.append(i36);
            sb.append(", remainingTimestampDeltaChanges ");
            sb.append(i18);
            sb.append(", remainingSamplesAtTimestampOffset ");
            sb.append(i9);
            sb.append(!z3 ? ", ctts invalid" : "");
            C2638o.m11160d("AtomParsers", sb.toString());
            jArr = jArr5;
            jArr2 = jArr6;
            i4 = i10;
            iArr = iArr7;
        }
        int i38 = i3;
        long m11085c = C2622I.m11085c(j, 1000000L, c2268m2.f8658c);
        if (c2268m2.f8663h == null || c2331k.m9688a()) {
            C2622I.m11063a(jArr2, 1000000L, c2268m2.f8658c);
            return new C2271p(c2268m, jArr, iArr, i4, jArr2, iArr2, m11085c);
        }
        long[] jArr7 = c2268m2.f8663h;
        if (jArr7.length == 1 && c2268m2.f8657b == 1 && jArr2.length >= 2) {
            long j7 = c2268m2.f8664i[0];
            long m11085c2 = j7 + C2622I.m11085c(jArr7[0], c2268m2.f8658c, c2268m2.f8659d);
            iArr3 = iArr;
            i5 = i4;
            if (m9321a(jArr2, j, j7, m11085c2)) {
                long j8 = j - m11085c2;
                long m11085c3 = C2622I.m11085c(j7 - jArr2[0], c2268m2.f8661f.f11196u, c2268m2.f8658c);
                long m11085c4 = C2622I.m11085c(j8, c2268m2.f8661f.f11196u, c2268m2.f8658c);
                if ((m11085c3 != 0 || m11085c4 != 0) && m11085c3 <= 2147483647L && m11085c4 <= 2147483647L) {
                    c2331k.f9148b = (int) m11085c3;
                    c2331k.f9149c = (int) m11085c4;
                    C2622I.m11063a(jArr2, 1000000L, c2268m2.f8658c);
                    return new C2271p(c2268m, jArr, iArr3, i5, jArr2, iArr2, C2622I.m11085c(c2268m2.f8663h[0], 1000000L, c2268m2.f8659d));
                }
            }
        } else {
            iArr3 = iArr;
            i5 = i4;
        }
        long[] jArr8 = c2268m2.f8663h;
        if (jArr8.length == 1 && jArr8[0] == 0) {
            long j9 = c2268m2.f8664i[0];
            for (int i39 = 0; i39 < jArr2.length; i39++) {
                jArr2[i39] = C2622I.m11085c(jArr2[i39] - j9, 1000000L, c2268m2.f8658c);
            }
            return new C2271p(c2268m, jArr, iArr3, i5, jArr2, iArr2, C2622I.m11085c(j - j9, 1000000L, c2268m2.f8658c));
        }
        boolean z5 = c2268m2.f8657b == 1;
        long[] jArr9 = c2268m2.f8663h;
        int[] iArr8 = new int[jArr9.length];
        int[] iArr9 = new int[jArr9.length];
        int i40 = 0;
        boolean z6 = false;
        int i41 = 0;
        int i42 = 0;
        while (true) {
            long[] jArr10 = c2268m2.f8663h;
            if (i40 >= jArr10.length) {
                break;
            }
            long j10 = c2268m2.f8664i[i40];
            if (j10 != -1) {
                boolean z7 = z6;
                int i43 = i41;
                long m11085c5 = C2622I.m11085c(jArr10[i40], c2268m2.f8658c, c2268m2.f8659d);
                iArr8[i40] = C2622I.m11042a(jArr2, j10, true, true);
                iArr9[i40] = C2622I.m11042a(jArr2, j10 + m11085c5, z5, false);
                while (iArr8[i40] < iArr9[i40] && (iArr2[iArr8[i40]] & 1) == 0) {
                    iArr8[i40] = iArr8[i40] + 1;
                }
                i41 = i43 + (iArr9[i40] - iArr8[i40]);
                z2 = z7 | (i42 != iArr8[i40]);
                i6 = iArr9[i40];
            } else {
                i6 = i42;
                z2 = z6;
            }
            i40++;
            z6 = z2;
            i42 = i6;
        }
        boolean z8 = z6;
        int i44 = 0;
        boolean z9 = z8 | (i41 != i38);
        long[] jArr11 = z9 ? new long[i41] : jArr;
        int[] iArr10 = z9 ? new int[i41] : iArr3;
        int i45 = z9 ? 0 : i5;
        int[] iArr11 = z9 ? new int[i41] : iArr2;
        long[] jArr12 = new long[i41];
        int i46 = i45;
        long j11 = 0;
        int i47 = 0;
        while (i44 < c2268m2.f8663h.length) {
            long j12 = c2268m2.f8664i[i44];
            int i48 = iArr8[i44];
            int[] iArr12 = iArr8;
            int i49 = iArr9[i44];
            if (z9) {
                iArr4 = iArr9;
                int i50 = i49 - i48;
                System.arraycopy(jArr, i48, jArr11, i47, i50);
                jArr3 = jArr;
                iArr5 = iArr3;
                System.arraycopy(iArr5, i48, iArr10, i47, i50);
                System.arraycopy(iArr2, i48, iArr11, i47, i50);
            } else {
                jArr3 = jArr;
                iArr4 = iArr9;
                iArr5 = iArr3;
            }
            int i51 = i46;
            while (i48 < i49) {
                int[] iArr13 = iArr2;
                int i52 = i49;
                int[] iArr14 = iArr11;
                long j13 = j11;
                jArr12[i47] = C2622I.m11085c(j11, 1000000L, c2268m2.f8659d) + C2622I.m11085c(jArr2[i48] - j12, 1000000L, c2268m2.f8658c);
                if (z9 && iArr10[i47] > i51) {
                    i51 = iArr5[i48];
                }
                i47++;
                i48++;
                i49 = i52;
                iArr2 = iArr13;
                j11 = j13;
                iArr11 = iArr14;
            }
            j11 += c2268m2.f8663h[i44];
            i44++;
            i46 = i51;
            iArr2 = iArr2;
            iArr8 = iArr12;
            iArr9 = iArr4;
            iArr11 = iArr11;
            iArr3 = iArr5;
            jArr = jArr3;
        }
        return new C2271p(c2268m, jArr11, iArr10, i46, jArr12, iArr11, C2622I.m11085c(j11, 1000000L, c2268m2.f8659d));
    }

    /* renamed from: a */
    public static C2353b m9317a(AbstractC2258c.b bVar, boolean z) {
        if (z) {
            return null;
        }
        C2644u c2644u = bVar.f8505Wa;
        c2644u.m11222e(8);
        while (c2644u.m11208a() >= 8) {
            int m11217c = c2644u.m11217c();
            int m11226h = c2644u.m11226h();
            if (c2644u.m11226h() == AbstractC2258c.f8405Ba) {
                c2644u.m11222e(m11217c);
                return m9326c(c2644u, m11217c + m11226h);
            }
            c2644u.m11224f(m11226h - 8);
        }
        return null;
    }

    /* renamed from: a */
    private static void m9318a(C2644u c2644u, int i, int i2, int i3, int i4, int i5, C2213m c2213m, c cVar, int i6) {
        C2213m c2213m2 = c2213m;
        c2644u.m11222e(i2 + 8 + 8);
        c2644u.m11224f(16);
        int m11244z = c2644u.m11244z();
        int m11244z2 = c2644u.m11244z();
        c2644u.m11224f(50);
        int m11217c = c2644u.m11217c();
        String str = null;
        int i7 = i;
        if (i7 == AbstractC2258c.f8448Z) {
            Pair<Integer, C2269n> m9330d = m9330d(c2644u, i2, i3);
            if (m9330d != null) {
                i7 = ((Integer) m9330d.first).intValue();
                c2213m2 = c2213m2 == null ? null : c2213m2.m9092a(((C2269n) m9330d.second).f8668b);
                cVar.f8523a[i6] = (C2269n) m9330d.second;
            }
            c2644u.m11222e(m11217c);
        }
        C2213m c2213m3 = c2213m2;
        List<byte[]> list = null;
        byte[] bArr = null;
        boolean z = false;
        float f2 = 1.0f;
        int i8 = -1;
        while (m11217c - i2 < i3) {
            c2644u.m11222e(m11217c);
            int m11217c2 = c2644u.m11217c();
            int m11226h = c2644u.m11226h();
            if (m11226h == 0 && c2644u.m11217c() - i2 == i3) {
                break;
            }
            C2628e.m11112a(m11226h > 0, "childAtomSize should be positive");
            int m11226h2 = c2644u.m11226h();
            if (m11226h2 == AbstractC2258c.f8416H) {
                C2628e.m11113b(str == null);
                c2644u.m11222e(m11217c2 + 8);
                C2660h m11265a = C2660h.m11265a(c2644u);
                list = m11265a.f11037a;
                cVar.f8525c = m11265a.f11038b;
                if (!z) {
                    f2 = m11265a.f11041e;
                }
                str = "video/avc";
            } else if (m11226h2 == AbstractC2258c.f8418I) {
                C2628e.m11113b(str == null);
                c2644u.m11222e(m11217c2 + 8);
                C2665m m11275a = C2665m.m11275a(c2644u);
                list = m11275a.f11057a;
                cVar.f8525c = m11275a.f11058b;
                str = "video/hevc";
            } else if (m11226h2 == AbstractC2258c.f8427Ma) {
                C2628e.m11113b(str == null);
                str = i7 == AbstractC2258c.f8423Ka ? "video/x-vnd.on2.vp8" : "video/x-vnd.on2.vp9";
            } else if (m11226h2 == AbstractC2258c.f8461g) {
                C2628e.m11113b(str == null);
                str = "video/3gpp";
            } else if (m11226h2 == AbstractC2258c.f8420J) {
                C2628e.m11113b(str == null);
                Pair<String, byte[]> m9311a = m9311a(c2644u, m11217c2);
                str = (String) m9311a.first;
                list = Collections.singletonList(m9311a.second);
            } else if (m11226h2 == AbstractC2258c.f8466ia) {
                f2 = m9328d(c2644u, m11217c2);
                z = true;
            } else if (m11226h2 == AbstractC2258c.f8419Ia) {
                bArr = m9327c(c2644u, m11217c2, m11226h);
            } else if (m11226h2 == AbstractC2258c.f8417Ha) {
                int m11238t = c2644u.m11238t();
                c2644u.m11224f(3);
                if (m11238t == 0) {
                    int m11238t2 = c2644u.m11238t();
                    if (m11238t2 == 0) {
                        i8 = 0;
                    } else if (m11238t2 == 1) {
                        i8 = 1;
                    } else if (m11238t2 == 2) {
                        i8 = 2;
                    } else if (m11238t2 == 3) {
                        i8 = 3;
                    }
                }
            }
            m11217c += m11226h;
        }
        if (str == null) {
            return;
        }
        cVar.f8524b = C2676s.m11423a(Integer.toString(i4), str, (String) null, -1, -1, m11244z, m11244z2, -1.0f, list, i5, f2, bArr, i8, (C2662j) null, c2213m3);
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* renamed from: a */
    private static void m9319a(C2644u c2644u, int i, int i2, int i3, int i4, String str, c cVar) {
        c2644u.m11222e(i2 + 8 + 8);
        String str2 = "application/ttml+xml";
        List list = null;
        long j = Long.MAX_VALUE;
        if (i != AbstractC2258c.f8468ja) {
            if (i == AbstractC2258c.f8490ua) {
                int i5 = (i3 - 8) - 8;
                byte[] bArr = new byte[i5];
                c2644u.m11214a(bArr, 0, i5);
                list = Collections.singletonList(bArr);
                str2 = "application/x-quicktime-tx3g";
            } else if (i == AbstractC2258c.f8492va) {
                str2 = "application/x-mp4-vtt";
            } else if (i == AbstractC2258c.f8494wa) {
                j = 0;
            } else {
                if (i != AbstractC2258c.f8496xa) {
                    throw new IllegalStateException();
                }
                cVar.f8526d = 1;
                str2 = "application/x-mp4-cea-608";
            }
        }
        cVar.f8524b = C2676s.m11427a(Integer.toString(i4), str2, null, -1, 0, str, -1, null, j, list);
    }

    /* renamed from: a */
    private static void m9320a(C2644u c2644u, int i, int i2, int i3, int i4, String str, boolean z, C2213m c2213m, c cVar, int i5) {
        int i6;
        int m11244z;
        int m11239u;
        int i7;
        String str2;
        int i8;
        String str3;
        C2213m c2213m2;
        C2676s m8856b;
        int i9 = i2;
        C2213m c2213m3 = c2213m;
        c2644u.m11222e(i9 + 8 + 8);
        if (z) {
            i6 = c2644u.m11244z();
            c2644u.m11224f(6);
        } else {
            c2644u.m11224f(8);
            i6 = 0;
        }
        if (i6 == 0 || i6 == 1) {
            m11244z = c2644u.m11244z();
            c2644u.m11224f(6);
            m11239u = c2644u.m11239u();
            if (i6 == 1) {
                c2644u.m11224f(16);
            }
        } else {
            if (i6 != 2) {
                return;
            }
            c2644u.m11224f(16);
            int round = (int) Math.round(c2644u.m11225g());
            int m11242x = c2644u.m11242x();
            c2644u.m11224f(20);
            m11244z = m11242x;
            m11239u = round;
        }
        int m11217c = c2644u.m11217c();
        int i10 = i;
        if (i10 == AbstractC2258c.f8450aa) {
            Pair<Integer, C2269n> m9330d = m9330d(c2644u, i9, i3);
            if (m9330d != null) {
                i10 = ((Integer) m9330d.first).intValue();
                c2213m3 = c2213m3 == null ? null : c2213m3.m9092a(((C2269n) m9330d.second).f8668b);
                cVar.f8523a[i5] = (C2269n) m9330d.second;
            }
            c2644u.m11222e(m11217c);
        }
        C2213m c2213m4 = c2213m3;
        String str4 = "audio/raw";
        String str5 = i10 == AbstractC2258c.f8475n ? "audio/ac3" : i10 == AbstractC2258c.f8479p ? "audio/eac3" : i10 == AbstractC2258c.f8483r ? "audio/vnd.dts" : (i10 == AbstractC2258c.f8485s || i10 == AbstractC2258c.f8487t) ? "audio/vnd.dts.hd" : i10 == AbstractC2258c.f8489u ? "audio/vnd.dts.hd;profile=lbr" : i10 == AbstractC2258c.f8498ya ? "audio/3gpp" : i10 == AbstractC2258c.f8500za ? "audio/amr-wb" : (i10 == AbstractC2258c.f8471l || i10 == AbstractC2258c.f8473m) ? "audio/raw" : i10 == AbstractC2258c.f8467j ? "audio/mpeg" : i10 == AbstractC2258c.f8431Oa ? "audio/alac" : i10 == AbstractC2258c.f8433Pa ? "audio/g711-alaw" : i10 == AbstractC2258c.f8435Qa ? "audio/g711-mlaw" : i10 == AbstractC2258c.f8437Ra ? "audio/opus" : i10 == AbstractC2258c.f8441Ta ? "audio/flac" : null;
        int i11 = m11239u;
        int i12 = m11217c;
        int i13 = m11244z;
        byte[] bArr = null;
        String str6 = str5;
        while (i12 - i9 < i3) {
            c2644u.m11222e(i12);
            int m11226h = c2644u.m11226h();
            C2628e.m11112a(m11226h > 0, "childAtomSize should be positive");
            int m11226h2 = c2644u.m11226h();
            if (m11226h2 == AbstractC2258c.f8420J || (z && m11226h2 == AbstractC2258c.f8469k)) {
                i7 = m11226h;
                str2 = str6;
                i8 = i12;
                str3 = str4;
                c2213m2 = c2213m4;
                int m9323b = m11226h2 == AbstractC2258c.f8420J ? i8 : m9323b(c2644u, i8, i7);
                if (m9323b != -1) {
                    Pair<String, byte[]> m9311a = m9311a(c2644u, m9323b);
                    str6 = (String) m9311a.first;
                    bArr = (byte[]) m9311a.second;
                    if ("audio/mp4a-latm".equals(str6)) {
                        Pair<Integer, Integer> m11118a = C2630g.m11118a(bArr);
                        i11 = ((Integer) m11118a.first).intValue();
                        i13 = ((Integer) m11118a.second).intValue();
                    }
                    i12 = i8 + i7;
                    i9 = i2;
                    c2213m4 = c2213m2;
                    str4 = str3;
                }
            } else {
                if (m11226h2 == AbstractC2258c.f8477o) {
                    c2644u.m11222e(i12 + 8);
                    m8856b = C2171h.m8853a(c2644u, Integer.toString(i4), str, c2213m4);
                } else if (m11226h2 == AbstractC2258c.f8481q) {
                    c2644u.m11222e(i12 + 8);
                    m8856b = C2171h.m8856b(c2644u, Integer.toString(i4), str, c2213m4);
                } else if (m11226h2 == AbstractC2258c.f8491v) {
                    str2 = str6;
                    str3 = str4;
                    c2213m2 = c2213m4;
                    cVar.f8524b = C2676s.m11426a(Integer.toString(i4), str6, (String) null, -1, -1, i13, i11, (List<byte[]>) null, c2213m2, 0, str);
                    i7 = m11226h;
                    i8 = i12;
                } else {
                    str2 = str6;
                    int i14 = i12;
                    str3 = str4;
                    c2213m2 = c2213m4;
                    if (m11226h2 == AbstractC2258c.f8431Oa) {
                        i7 = m11226h;
                        byte[] bArr2 = new byte[i7];
                        i8 = i14;
                        c2644u.m11222e(i8);
                        c2644u.m11214a(bArr2, 0, i7);
                        bArr = bArr2;
                    } else {
                        i7 = m11226h;
                        i8 = i14;
                        if (m11226h2 == AbstractC2258c.f8439Sa) {
                            int i15 = i7 - 8;
                            byte[] bArr3 = f8513h;
                            byte[] bArr4 = new byte[bArr3.length + i15];
                            System.arraycopy(bArr3, 0, bArr4, 0, bArr3.length);
                            c2644u.m11222e(i8 + 8);
                            c2644u.m11214a(bArr4, f8513h.length, i15);
                            bArr = bArr4;
                        } else if (i7 == AbstractC2258c.f8443Ua) {
                            int i16 = i7 - 12;
                            byte[] bArr5 = new byte[i16];
                            c2644u.m11222e(i8 + 12);
                            c2644u.m11214a(bArr5, 0, i16);
                            bArr = bArr5;
                        }
                    }
                }
                cVar.f8524b = m8856b;
                i7 = m11226h;
                str2 = str6;
                i8 = i12;
                str3 = str4;
                c2213m2 = c2213m4;
            }
            str6 = str2;
            i12 = i8 + i7;
            i9 = i2;
            c2213m4 = c2213m2;
            str4 = str3;
        }
        String str7 = str6;
        String str8 = str4;
        C2213m c2213m5 = c2213m4;
        if (cVar.f8524b != null || str7 == null) {
            return;
        }
        cVar.f8524b = C2676s.m11425a(Integer.toString(i4), str7, (String) null, -1, -1, i13, i11, str8.equals(str7) ? 2 : -1, (List<byte[]>) (bArr == null ? null : Collections.singletonList(bArr)), c2213m5, 0, str);
    }

    /* renamed from: a */
    private static boolean m9321a(long[] jArr, long j, long j2, long j3) {
        int length = jArr.length - 1;
        return jArr[0] <= j2 && j2 < jArr[C2622I.m11038a(3, 0, length)] && jArr[C2622I.m11038a(jArr.length - 3, 0, length)] < j3 && j3 <= j;
    }

    /* renamed from: b */
    private static int m9322b(C2644u c2644u) {
        c2644u.m11222e(16);
        int m11226h = c2644u.m11226h();
        if (m11226h == f8507b) {
            return 1;
        }
        if (m11226h == f8506a) {
            return 2;
        }
        if (m11226h == f8508c || m11226h == f8509d || m11226h == f8510e || m11226h == f8511f) {
            return 3;
        }
        return m11226h == f8512g ? 4 : -1;
    }

    /* renamed from: b */
    private static int m9323b(C2644u c2644u, int i, int i2) {
        int m11217c = c2644u.m11217c();
        while (m11217c - i < i2) {
            c2644u.m11222e(m11217c);
            int m11226h = c2644u.m11226h();
            C2628e.m11112a(m11226h > 0, "childAtomSize should be positive");
            if (c2644u.m11226h() == AbstractC2258c.f8420J) {
                return m11217c;
            }
            m11217c += m11226h;
        }
        return -1;
    }

    /* renamed from: b */
    private static C2353b m9324b(C2644u c2644u, int i) {
        c2644u.m11224f(8);
        ArrayList arrayList = new ArrayList();
        while (c2644u.m11217c() < i) {
            C2353b.a m9385a = C2264i.m9385a(c2644u);
            if (m9385a != null) {
                arrayList.add(m9385a);
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new C2353b(arrayList);
    }

    /* renamed from: c */
    private static Pair<Long, String> m9325c(C2644u c2644u) {
        c2644u.m11222e(8);
        int m9304c = AbstractC2258c.m9304c(c2644u.m11226h());
        c2644u.m11224f(m9304c == 0 ? 8 : 16);
        long m11240v = c2644u.m11240v();
        c2644u.m11224f(m9304c == 0 ? 4 : 8);
        int m11244z = c2644u.m11244z();
        return Pair.create(Long.valueOf(m11240v), "" + ((char) (((m11244z >> 10) & 31) + 96)) + ((char) (((m11244z >> 5) & 31) + 96)) + ((char) ((m11244z & 31) + 96)));
    }

    /* renamed from: c */
    private static C2353b m9326c(C2644u c2644u, int i) {
        c2644u.m11224f(12);
        while (c2644u.m11217c() < i) {
            int m11217c = c2644u.m11217c();
            int m11226h = c2644u.m11226h();
            if (c2644u.m11226h() == AbstractC2258c.f8407Ca) {
                c2644u.m11222e(m11217c);
                return m9324b(c2644u, m11217c + m11226h);
            }
            c2644u.m11224f(m11226h - 8);
        }
        return null;
    }

    /* renamed from: c */
    private static byte[] m9327c(C2644u c2644u, int i, int i2) {
        int i3 = i + 8;
        while (i3 - i < i2) {
            c2644u.m11222e(i3);
            int m11226h = c2644u.m11226h();
            if (c2644u.m11226h() == AbstractC2258c.f8421Ja) {
                return Arrays.copyOfRange(c2644u.f11004a, i3, m11226h + i3);
            }
            i3 += m11226h;
        }
        return null;
    }

    /* renamed from: d */
    private static float m9328d(C2644u c2644u, int i) {
        c2644u.m11222e(i + 8);
        return c2644u.m11242x() / c2644u.m11242x();
    }

    /* renamed from: d */
    private static long m9329d(C2644u c2644u) {
        c2644u.m11222e(8);
        c2644u.m11224f(AbstractC2258c.m9304c(c2644u.m11226h()) != 0 ? 16 : 8);
        return c2644u.m11240v();
    }

    /* renamed from: d */
    private static Pair<Integer, C2269n> m9330d(C2644u c2644u, int i, int i2) {
        Pair<Integer, C2269n> m9312a;
        int m11217c = c2644u.m11217c();
        while (m11217c - i < i2) {
            c2644u.m11222e(m11217c);
            int m11226h = c2644u.m11226h();
            C2628e.m11112a(m11226h > 0, "childAtomSize should be positive");
            if (c2644u.m11226h() == AbstractC2258c.f8444V && (m9312a = m9312a(c2644u, m11217c, m11226h)) != null) {
                return m9312a;
            }
            m11217c += m11226h;
        }
        return null;
    }

    /* renamed from: e */
    private static f m9331e(C2644u c2644u) {
        boolean z;
        c2644u.m11222e(8);
        int m9304c = AbstractC2258c.m9304c(c2644u.m11226h());
        c2644u.m11224f(m9304c == 0 ? 8 : 16);
        int m11226h = c2644u.m11226h();
        c2644u.m11224f(4);
        int m11217c = c2644u.m11217c();
        int i = m9304c == 0 ? 4 : 8;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            if (i3 >= i) {
                z = true;
                break;
            }
            if (c2644u.f11004a[m11217c + i3] != -1) {
                z = false;
                break;
            }
            i3++;
        }
        long j = -9223372036854775807L;
        if (z) {
            c2644u.m11224f(i);
        } else {
            long m11240v = m9304c == 0 ? c2644u.m11240v() : c2644u.m11243y();
            if (m11240v != 0) {
                j = m11240v;
            }
        }
        c2644u.m11224f(16);
        int m11226h2 = c2644u.m11226h();
        int m11226h3 = c2644u.m11226h();
        c2644u.m11224f(4);
        int m11226h4 = c2644u.m11226h();
        int m11226h5 = c2644u.m11226h();
        if (m11226h2 == 0 && m11226h3 == 65536 && m11226h4 == -65536 && m11226h5 == 0) {
            i2 = 90;
        } else if (m11226h2 == 0 && m11226h3 == -65536 && m11226h4 == 65536 && m11226h5 == 0) {
            i2 = 270;
        } else if (m11226h2 == -65536 && m11226h3 == 0 && m11226h4 == 0 && m11226h5 == -65536) {
            i2 = 180;
        }
        return new f(m11226h, j, i2);
    }
}
