package p139d.p225c.p226a.p227a.p234f.p242h;

import android.util.Pair;
import java.util.Arrays;
import p139d.p225c.p226a.p227a.C2676s;
import p139d.p225c.p226a.p227a.p234f.InterfaceC2325i;
import p139d.p225c.p226a.p227a.p234f.InterfaceC2337q;
import p139d.p225c.p226a.p227a.p234f.p242h.InterfaceC2296G;
import p139d.p225c.p226a.p227a.p270n.C2642s;
import p139d.p225c.p226a.p227a.p270n.C2644u;

/* renamed from: d.c.a.a.f.h.m */
/* loaded from: classes.dex */
public final class C2311m implements InterfaceC2310l {

    /* renamed from: a */
    private static final double[] f8947a = {23.976023976023978d, 24.0d, 25.0d, 29.97002997002997d, 30.0d, 50.0d, 59.94005994005994d, 60.0d};

    /* renamed from: b */
    private String f8948b;

    /* renamed from: c */
    private InterfaceC2337q f8949c;

    /* renamed from: d */
    private boolean f8950d;

    /* renamed from: e */
    private long f8951e;

    /* renamed from: f */
    private final C2298I f8952f;

    /* renamed from: g */
    private final C2644u f8953g;

    /* renamed from: h */
    private final boolean[] f8954h;

    /* renamed from: i */
    private final a f8955i;

    /* renamed from: j */
    private final C2318t f8956j;

    /* renamed from: k */
    private long f8957k;

    /* renamed from: l */
    private boolean f8958l;

    /* renamed from: m */
    private long f8959m;

    /* renamed from: n */
    private long f8960n;

    /* renamed from: o */
    private long f8961o;

    /* renamed from: p */
    private boolean f8962p;

    /* renamed from: q */
    private boolean f8963q;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: d.c.a.a.f.h.m$a */
    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a */
        private static final byte[] f8964a = {0, 0, 1};

        /* renamed from: b */
        private boolean f8965b;

        /* renamed from: c */
        public int f8966c;

        /* renamed from: d */
        public int f8967d;

        /* renamed from: e */
        public byte[] f8968e;

        public a(int i) {
            this.f8968e = new byte[i];
        }

        /* renamed from: a */
        public void m9597a() {
            this.f8965b = false;
            this.f8966c = 0;
            this.f8967d = 0;
        }

        /* renamed from: a */
        public void m9598a(byte[] bArr, int i, int i2) {
            if (this.f8965b) {
                int i3 = i2 - i;
                byte[] bArr2 = this.f8968e;
                int length = bArr2.length;
                int i4 = this.f8966c;
                if (length < i4 + i3) {
                    this.f8968e = Arrays.copyOf(bArr2, (i4 + i3) * 2);
                }
                System.arraycopy(bArr, i, this.f8968e, this.f8966c, i3);
                this.f8966c += i3;
            }
        }

        /* renamed from: a */
        public boolean m9599a(int i, int i2) {
            if (this.f8965b) {
                this.f8966c -= i2;
                if (this.f8967d != 0 || i != 181) {
                    this.f8965b = false;
                    return true;
                }
                this.f8967d = this.f8966c;
            } else if (i == 179) {
                this.f8965b = true;
            }
            byte[] bArr = f8964a;
            m9598a(bArr, 0, bArr.length);
            return false;
        }
    }

    public C2311m() {
        this(null);
    }

    public C2311m(C2298I c2298i) {
        C2644u c2644u;
        this.f8952f = c2298i;
        this.f8954h = new boolean[4];
        this.f8955i = new a(128);
        if (c2298i != null) {
            this.f8956j = new C2318t(178, 128);
            c2644u = new C2644u();
        } else {
            c2644u = null;
            this.f8956j = null;
        }
        this.f8953g = c2644u;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x006b  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static android.util.Pair<p139d.p225c.p226a.p227a.C2676s, java.lang.Long> m9596a(p139d.p225c.p226a.p227a.p234f.p242h.C2311m.a r20, java.lang.String r21) {
        /*
            r0 = r20
            byte[] r1 = r0.f8968e
            int r2 = r0.f8966c
            byte[] r1 = java.util.Arrays.copyOf(r1, r2)
            r2 = 4
            r3 = r1[r2]
            r3 = r3 & 255(0xff, float:3.57E-43)
            r4 = 5
            r5 = r1[r4]
            r5 = r5 & 255(0xff, float:3.57E-43)
            r6 = 6
            r6 = r1[r6]
            r6 = r6 & 255(0xff, float:3.57E-43)
            int r3 = r3 << r2
            int r7 = r5 >> 4
            r13 = r3 | r7
            r3 = r5 & 15
            int r3 = r3 << 8
            r14 = r3 | r6
            r3 = 7
            r5 = r1[r3]
            r5 = r5 & 240(0xf0, float:3.36E-43)
            int r5 = r5 >> r2
            r6 = 2
            if (r5 == r6) goto L43
            r6 = 3
            if (r5 == r6) goto L3d
            if (r5 == r2) goto L37
            r2 = 1065353216(0x3f800000, float:1.0)
            r18 = 1065353216(0x3f800000, float:1.0)
            goto L4c
        L37:
            int r2 = r14 * 121
            float r2 = (float) r2
            int r5 = r13 * 100
            goto L48
        L3d:
            int r2 = r14 * 16
            float r2 = (float) r2
            int r5 = r13 * 9
            goto L48
        L43:
            int r2 = r14 * 4
            float r2 = (float) r2
            int r5 = r13 * 3
        L48:
            float r5 = (float) r5
            float r2 = r2 / r5
            r18 = r2
        L4c:
            r10 = 0
            r11 = -1
            r12 = -1
            r15 = -1082130432(0xffffffffbf800000, float:-1.0)
            java.util.List r16 = java.util.Collections.singletonList(r1)
            r17 = -1
            r19 = 0
            java.lang.String r9 = "video/mpeg2"
            r8 = r21
            d.c.a.a.s r2 = p139d.p225c.p226a.p227a.C2676s.m11422a(r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19)
            r5 = 0
            r3 = r1[r3]
            r3 = r3 & 15
            int r3 = r3 + (-1)
            if (r3 < 0) goto L98
            double[] r7 = p139d.p225c.p226a.p227a.p234f.p242h.C2311m.f8947a
            int r8 = r7.length
            if (r3 >= r8) goto L98
            r5 = r7[r3]
            int r0 = r0.f8967d
            int r0 = r0 + 9
            r3 = r1[r0]
            r3 = r3 & 96
            int r3 = r3 >> r4
            r0 = r1[r0]
            r0 = r0 & 31
            if (r3 == r0) goto L91
            double r3 = (double) r3
            r7 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            java.lang.Double.isNaN(r3)
            double r3 = r3 + r7
            int r0 = r0 + 1
            double r0 = (double) r0
            java.lang.Double.isNaN(r0)
            double r3 = r3 / r0
            double r5 = r5 * r3
        L91:
            r0 = 4696837146684686336(0x412e848000000000, double:1000000.0)
            double r0 = r0 / r5
            long r5 = (long) r0
        L98:
            java.lang.Long r0 = java.lang.Long.valueOf(r5)
            android.util.Pair r0 = android.util.Pair.create(r2, r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p139d.p225c.p226a.p227a.p234f.p242h.C2311m.m9596a(d.c.a.a.f.h.m$a, java.lang.String):android.util.Pair");
    }

    @Override // p139d.p225c.p226a.p227a.p234f.p242h.InterfaceC2310l
    /* renamed from: a */
    public void mo9560a() {
        C2642s.m11183a(this.f8954h);
        this.f8955i.m9597a();
        if (this.f8952f != null) {
            this.f8956j.m9642b();
        }
        this.f8957k = 0L;
        this.f8958l = false;
    }

    @Override // p139d.p225c.p226a.p227a.p234f.p242h.InterfaceC2310l
    /* renamed from: a */
    public void mo9561a(long j, int i) {
        this.f8959m = j;
    }

    @Override // p139d.p225c.p226a.p227a.p234f.p242h.InterfaceC2310l
    /* renamed from: a */
    public void mo9562a(InterfaceC2325i interfaceC2325i, InterfaceC2296G.d dVar) {
        dVar.m9548a();
        this.f8948b = dVar.m9549b();
        this.f8949c = interfaceC2325i.mo9671a(dVar.m9550c(), 2);
        C2298I c2298i = this.f8952f;
        if (c2298i != null) {
            c2298i.m9555a(interfaceC2325i, dVar);
        }
    }

    @Override // p139d.p225c.p226a.p227a.p234f.p242h.InterfaceC2310l
    /* renamed from: a */
    public void mo9563a(C2644u c2644u) {
        int i;
        int m11217c = c2644u.m11217c();
        int m11219d = c2644u.m11219d();
        byte[] bArr = c2644u.f11004a;
        this.f8957k += c2644u.m11208a();
        this.f8949c.mo9432a(c2644u, c2644u.m11208a());
        while (true) {
            int m11179a = C2642s.m11179a(bArr, m11217c, m11219d, this.f8954h);
            if (m11179a == m11219d) {
                break;
            }
            int i2 = m11179a + 3;
            int i3 = c2644u.f11004a[i2] & 255;
            int i4 = m11179a - m11217c;
            if (!this.f8950d) {
                if (i4 > 0) {
                    this.f8955i.m9598a(bArr, m11217c, m11179a);
                }
                if (this.f8955i.m9599a(i3, i4 < 0 ? -i4 : 0)) {
                    Pair<C2676s, Long> m9596a = m9596a(this.f8955i, this.f8948b);
                    this.f8949c.mo9433a((C2676s) m9596a.first);
                    this.f8951e = ((Long) m9596a.second).longValue();
                    this.f8950d = true;
                }
            }
            if (this.f8952f != null) {
                if (i4 > 0) {
                    this.f8956j.m9639a(bArr, m11217c, m11179a);
                    i = 0;
                } else {
                    i = -i4;
                }
                if (this.f8956j.m9641a(i)) {
                    C2318t c2318t = this.f8956j;
                    this.f8953g.m11213a(this.f8956j.f9086d, C2642s.m11187c(c2318t.f9086d, c2318t.f9087e));
                    this.f8952f.m9554a(this.f8961o, this.f8953g);
                }
                if (i3 == 178 && c2644u.f11004a[m11179a + 2] == 1) {
                    this.f8956j.m9643b(i3);
                }
            }
            if (i3 == 0 || i3 == 179) {
                int i5 = m11219d - m11179a;
                if (this.f8958l && this.f8963q && this.f8950d) {
                    this.f8949c.mo9431a(this.f8961o, this.f8962p ? 1 : 0, ((int) (this.f8957k - this.f8960n)) - i5, i5, null);
                }
                if (!this.f8958l || this.f8963q) {
                    this.f8960n = this.f8957k - i5;
                    long j = this.f8959m;
                    if (j == -9223372036854775807L) {
                        j = this.f8958l ? this.f8961o + this.f8951e : 0L;
                    }
                    this.f8961o = j;
                    this.f8962p = false;
                    this.f8959m = -9223372036854775807L;
                    this.f8958l = true;
                }
                this.f8963q = i3 == 0;
            } else if (i3 == 184) {
                this.f8962p = true;
            }
            m11217c = i2;
        }
        if (!this.f8950d) {
            this.f8955i.m9598a(bArr, m11217c, m11219d);
        }
        if (this.f8952f != null) {
            this.f8956j.m9639a(bArr, m11217c, m11219d);
        }
    }

    @Override // p139d.p225c.p226a.p227a.p234f.p242h.InterfaceC2310l
    /* renamed from: b */
    public void mo9564b() {
    }
}
