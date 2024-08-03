package p139d.p225c.p226a.p227a.p245h.p247b;

import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;
import p139d.p225c.p226a.p227a.p245h.C2353b;
import p139d.p225c.p226a.p227a.p245h.C2394f;
import p139d.p225c.p226a.p227a.p245h.InterfaceC2379c;
import p139d.p225c.p226a.p227a.p270n.C2622I;
import p139d.p225c.p226a.p227a.p270n.C2638o;
import p139d.p225c.p226a.p227a.p270n.C2643t;
import p139d.p225c.p226a.p227a.p270n.C2644u;

/* renamed from: d.c.a.a.h.b.n */
/* loaded from: classes.dex */
public final class C2367n implements InterfaceC2379c {

    /* renamed from: a */
    public static final a f9304a = C2354a.f9280a;

    /* renamed from: b */
    public static final int f9305b = C2622I.m11078b("ID3");

    /* renamed from: c */
    private final a f9306c;

    /* renamed from: d.c.a.a.h.b.n$a */
    /* loaded from: classes.dex */
    public interface a {
        /* renamed from: a */
        boolean mo9284a(int i, int i2, int i3, int i4, int i5);
    }

    /* renamed from: d.c.a.a.h.b.n$b */
    /* loaded from: classes.dex */
    public static final class b {

        /* renamed from: a */
        private final int f9307a;

        /* renamed from: b */
        private final boolean f9308b;

        /* renamed from: c */
        private final int f9309c;

        public b(int i, boolean z, int i2) {
            this.f9307a = i;
            this.f9308b = z;
            this.f9309c = i2;
        }
    }

    public C2367n() {
        this(null);
    }

    public C2367n(a aVar) {
        this.f9306c = aVar;
    }

    /* renamed from: a */
    private static int m9812a(int i) {
        return (i == 0 || i == 3) ? 1 : 2;
    }

    /* renamed from: a */
    private static C2356c m9813a(C2644u c2644u, int i, int i2) {
        int m9823b;
        String str;
        int m11238t = c2644u.m11238t();
        String m9828b = m9828b(m11238t);
        int i3 = i - 1;
        byte[] bArr = new byte[i3];
        c2644u.m11214a(bArr, 0, i3);
        if (i2 == 2) {
            str = "image/" + C2622I.m11098j(new String(bArr, 0, 3, "ISO-8859-1"));
            if ("image/jpg".equals(str)) {
                str = "image/jpeg";
            }
            m9823b = 2;
        } else {
            m9823b = m9823b(bArr, 0);
            String m11098j = C2622I.m11098j(new String(bArr, 0, m9823b, "ISO-8859-1"));
            if (m11098j.indexOf(47) == -1) {
                str = "image/" + m11098j;
            } else {
                str = m11098j;
            }
        }
        int i4 = bArr[m9823b + 1] & 255;
        int i5 = m9823b + 2;
        int m9824b = m9824b(bArr, i5, m11238t);
        return new C2356c(str, new String(bArr, i5, m9824b - i5, m9828b), i4, m9822a(bArr, m9824b + m9812a(m11238t), bArr.length));
    }

    /* renamed from: a */
    private static C2358e m9814a(C2644u c2644u, int i, String str) {
        byte[] bArr = new byte[i];
        c2644u.m11214a(bArr, 0, i);
        return new C2358e(str, bArr);
    }

    /* renamed from: a */
    private static C2360g m9815a(C2644u c2644u, int i, int i2, boolean z, int i3, a aVar) {
        int m11217c = c2644u.m11217c();
        int m9823b = m9823b(c2644u.f11004a, m11217c);
        String str = new String(c2644u.f11004a, m11217c, m9823b - m11217c, "ISO-8859-1");
        c2644u.m11222e(m9823b + 1);
        int m11226h = c2644u.m11226h();
        int m11226h2 = c2644u.m11226h();
        long m11240v = c2644u.m11240v();
        long j = m11240v == 4294967295L ? -1L : m11240v;
        long m11240v2 = c2644u.m11240v();
        long j2 = m11240v2 == 4294967295L ? -1L : m11240v2;
        ArrayList arrayList = new ArrayList();
        int i4 = m11217c + i;
        while (c2644u.m11217c() < i4) {
            AbstractC2368o m9818a = m9818a(i2, c2644u, z, i3, aVar);
            if (m9818a != null) {
                arrayList.add(m9818a);
            }
        }
        AbstractC2368o[] abstractC2368oArr = new AbstractC2368o[arrayList.size()];
        arrayList.toArray(abstractC2368oArr);
        return new C2360g(str, m11226h, m11226h2, j, j2, abstractC2368oArr);
    }

    /* renamed from: a */
    private static C2364k m9816a(C2644u c2644u, int i) {
        if (i < 4) {
            return null;
        }
        int m11238t = c2644u.m11238t();
        String m9828b = m9828b(m11238t);
        byte[] bArr = new byte[3];
        c2644u.m11214a(bArr, 0, 3);
        String str = new String(bArr, 0, 3);
        int i2 = i - 4;
        byte[] bArr2 = new byte[i2];
        c2644u.m11214a(bArr2, 0, i2);
        int m9824b = m9824b(bArr2, 0, m11238t);
        String str2 = new String(bArr2, 0, m9824b, m9828b);
        int m9812a = m9824b + m9812a(m11238t);
        return new C2364k(str, str2, m9819a(bArr2, m9812a, m9824b(bArr2, m9812a, m11238t), m9828b));
    }

    /* renamed from: a */
    private static b m9817a(C2644u c2644u) {
        StringBuilder sb;
        String str;
        String str2;
        if (c2644u.m11208a() < 10) {
            str2 = "Data too short to be an ID3 tag";
        } else {
            int m11241w = c2644u.m11241w();
            if (m11241w == f9305b) {
                m11241w = c2644u.m11238t();
                c2644u.m11224f(1);
                int m11238t = c2644u.m11238t();
                int m11237s = c2644u.m11237s();
                if (m11241w == 2) {
                    if ((m11238t & 64) != 0) {
                        str2 = "Skipped ID3 tag with majorVersion=2 and undefined compression scheme";
                    }
                } else if (m11241w == 3) {
                    if ((m11238t & 64) != 0) {
                        int m11226h = c2644u.m11226h();
                        c2644u.m11224f(m11226h);
                        m11237s -= m11226h + 4;
                    }
                } else if (m11241w == 4) {
                    if ((m11238t & 64) != 0) {
                        int m11237s2 = c2644u.m11237s();
                        c2644u.m11224f(m11237s2 - 4);
                        m11237s -= m11237s2;
                    }
                    if ((m11238t & 16) != 0) {
                        m11237s -= 10;
                    }
                } else {
                    sb = new StringBuilder();
                    str = "Skipped ID3 tag with unsupported majorVersion=";
                }
                return new b(m11241w, m11241w < 4 && (m11238t & 128) != 0, m11237s);
            }
            sb = new StringBuilder();
            str = "Unexpected first three bytes of ID3 tag header: ";
            sb.append(str);
            sb.append(m11241w);
            str2 = sb.toString();
        }
        C2638o.m11160d("Id3Decoder", str2);
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:131:0x0193, code lost:            if (r13 == 67) goto L486;     */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static p139d.p225c.p226a.p227a.p245h.p247b.AbstractC2368o m9818a(int r19, p139d.p225c.p226a.p227a.p270n.C2644u r20, boolean r21, int r22, p139d.p225c.p226a.p227a.p245h.p247b.C2367n.a r23) {
        /*
            Method dump skipped, instructions count: 565
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p139d.p225c.p226a.p227a.p245h.p247b.C2367n.m9818a(int, d.c.a.a.n.u, boolean, int, d.c.a.a.h.b.n$a):d.c.a.a.h.b.o");
    }

    /* renamed from: a */
    private static String m9819a(byte[] bArr, int i, int i2, String str) {
        return (i2 <= i || i2 > bArr.length) ? "" : new String(bArr, i, i2 - i, str);
    }

    /* renamed from: a */
    public static /* synthetic */ boolean m9820a(int i, int i2, int i3, int i4, int i5) {
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0076, code lost:            if ((r10 & 1) != 0) goto L178;     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0078, code lost:            r7 = true;     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0085, code lost:            if ((r10 & 128) != 0) goto L178;     */
    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static boolean m9821a(p139d.p225c.p226a.p227a.p270n.C2644u r18, int r19, int r20, boolean r21) {
        /*
            r1 = r18
            r0 = r19
            int r2 = r18.m11217c()
        L8:
            int r3 = r18.m11208a()     // Catch: java.lang.Throwable -> Lb2
            r4 = 1
            r5 = r20
            if (r3 < r5) goto Lae
            r3 = 3
            r6 = 0
            if (r0 < r3) goto L22
            int r7 = r18.m11226h()     // Catch: java.lang.Throwable -> Lb2
            long r8 = r18.m11240v()     // Catch: java.lang.Throwable -> Lb2
            int r10 = r18.m11244z()     // Catch: java.lang.Throwable -> Lb2
            goto L2c
        L22:
            int r7 = r18.m11241w()     // Catch: java.lang.Throwable -> Lb2
            int r8 = r18.m11241w()     // Catch: java.lang.Throwable -> Lb2
            long r8 = (long) r8
            r10 = 0
        L2c:
            r11 = 0
            if (r7 != 0) goto L3a
            int r7 = (r8 > r11 ? 1 : (r8 == r11 ? 0 : -1))
            if (r7 != 0) goto L3a
            if (r10 != 0) goto L3a
            r1.m11222e(r2)
            return r4
        L3a:
            r7 = 4
            if (r0 != r7) goto L6b
            if (r21 != 0) goto L6b
            r13 = 8421504(0x808080, double:4.160776E-317)
            long r13 = r13 & r8
            int r15 = (r13 > r11 ? 1 : (r13 == r11 ? 0 : -1))
            if (r15 == 0) goto L4b
            r1.m11222e(r2)
            return r6
        L4b:
            r11 = 255(0xff, double:1.26E-321)
            long r13 = r8 & r11
            r15 = 8
            long r15 = r8 >> r15
            long r15 = r15 & r11
            r17 = 7
            long r15 = r15 << r17
            long r13 = r13 | r15
            r15 = 16
            long r15 = r8 >> r15
            long r15 = r15 & r11
            r17 = 14
            long r15 = r15 << r17
            long r13 = r13 | r15
            r15 = 24
            long r8 = r8 >> r15
            long r8 = r8 & r11
            r11 = 21
            long r8 = r8 << r11
            long r8 = r8 | r13
        L6b:
            if (r0 != r7) goto L7a
            r3 = r10 & 64
            if (r3 == 0) goto L73
            r3 = 1
            goto L74
        L73:
            r3 = 0
        L74:
            r7 = r10 & 1
            if (r7 == 0) goto L89
        L78:
            r7 = 1
            goto L8a
        L7a:
            if (r0 != r3) goto L88
            r3 = r10 & 32
            if (r3 == 0) goto L82
            r3 = 1
            goto L83
        L82:
            r3 = 0
        L83:
            r7 = r10 & 128(0x80, float:1.8E-43)
            if (r7 == 0) goto L89
            goto L78
        L88:
            r3 = 0
        L89:
            r7 = 0
        L8a:
            if (r3 == 0) goto L8d
            goto L8e
        L8d:
            r4 = 0
        L8e:
            if (r7 == 0) goto L92
            int r4 = r4 + 4
        L92:
            long r3 = (long) r4
            int r7 = (r8 > r3 ? 1 : (r8 == r3 ? 0 : -1))
            if (r7 >= 0) goto L9b
            r1.m11222e(r2)
            return r6
        L9b:
            int r3 = r18.m11208a()     // Catch: java.lang.Throwable -> Lb2
            long r3 = (long) r3
            int r7 = (r3 > r8 ? 1 : (r3 == r8 ? 0 : -1))
            if (r7 >= 0) goto La8
            r1.m11222e(r2)
            return r6
        La8:
            int r3 = (int) r8
            r1.m11224f(r3)     // Catch: java.lang.Throwable -> Lb2
            goto L8
        Lae:
            r1.m11222e(r2)
            return r4
        Lb2:
            r0 = move-exception
            r1.m11222e(r2)
            throw r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p139d.p225c.p226a.p227a.p245h.p247b.C2367n.m9821a(d.c.a.a.n.u, int, int, boolean):boolean");
    }

    /* renamed from: a */
    private static byte[] m9822a(byte[] bArr, int i, int i2) {
        return i2 <= i ? C2622I.f10921f : Arrays.copyOfRange(bArr, i, i2);
    }

    /* renamed from: b */
    private static int m9823b(byte[] bArr, int i) {
        while (i < bArr.length) {
            if (bArr[i] == 0) {
                return i;
            }
            i++;
        }
        return bArr.length;
    }

    /* renamed from: b */
    private static int m9824b(byte[] bArr, int i, int i2) {
        int m9823b = m9823b(bArr, i);
        if (i2 == 0 || i2 == 3) {
            return m9823b;
        }
        while (m9823b < bArr.length - 1) {
            if (m9823b % 2 == 0 && bArr[m9823b + 1] == 0) {
                return m9823b;
            }
            m9823b = m9823b(bArr, m9823b + 1);
        }
        return bArr.length;
    }

    /* renamed from: b */
    private static C2362i m9825b(C2644u c2644u, int i, int i2, boolean z, int i3, a aVar) {
        int m11217c = c2644u.m11217c();
        int m9823b = m9823b(c2644u.f11004a, m11217c);
        String str = new String(c2644u.f11004a, m11217c, m9823b - m11217c, "ISO-8859-1");
        c2644u.m11222e(m9823b + 1);
        int m11238t = c2644u.m11238t();
        boolean z2 = (m11238t & 2) != 0;
        boolean z3 = (m11238t & 1) != 0;
        int m11238t2 = c2644u.m11238t();
        String[] strArr = new String[m11238t2];
        for (int i4 = 0; i4 < m11238t2; i4++) {
            int m11217c2 = c2644u.m11217c();
            int m9823b2 = m9823b(c2644u.f11004a, m11217c2);
            strArr[i4] = new String(c2644u.f11004a, m11217c2, m9823b2 - m11217c2, "ISO-8859-1");
            c2644u.m11222e(m9823b2 + 1);
        }
        ArrayList arrayList = new ArrayList();
        int i5 = m11217c + i;
        while (c2644u.m11217c() < i5) {
            AbstractC2368o m9818a = m9818a(i2, c2644u, z, i3, aVar);
            if (m9818a != null) {
                arrayList.add(m9818a);
            }
        }
        AbstractC2368o[] abstractC2368oArr = new AbstractC2368o[arrayList.size()];
        arrayList.toArray(abstractC2368oArr);
        return new C2362i(str, z2, z3, strArr, abstractC2368oArr);
    }

    /* renamed from: b */
    private static C2366m m9826b(C2644u c2644u, int i) {
        int m11238t = c2644u.m11238t();
        String m9828b = m9828b(m11238t);
        int i2 = i - 1;
        byte[] bArr = new byte[i2];
        c2644u.m11214a(bArr, 0, i2);
        int m9823b = m9823b(bArr, 0);
        String str = new String(bArr, 0, m9823b, "ISO-8859-1");
        int i3 = m9823b + 1;
        int m9824b = m9824b(bArr, i3, m11238t);
        String m9819a = m9819a(bArr, i3, m9824b, m9828b);
        int m9812a = m9824b + m9812a(m11238t);
        int m9824b2 = m9824b(bArr, m9812a, m11238t);
        return new C2366m(str, m9819a, m9819a(bArr, m9812a, m9824b2, m9828b), m9822a(bArr, m9824b2 + m9812a(m11238t), bArr.length));
    }

    /* renamed from: b */
    private static C2376w m9827b(C2644u c2644u, int i, String str) {
        if (i < 1) {
            return null;
        }
        int m11238t = c2644u.m11238t();
        String m9828b = m9828b(m11238t);
        int i2 = i - 1;
        byte[] bArr = new byte[i2];
        c2644u.m11214a(bArr, 0, i2);
        return new C2376w(str, null, new String(bArr, 0, m9824b(bArr, 0, m11238t), m9828b));
    }

    /* renamed from: b */
    private static String m9828b(int i) {
        return i != 1 ? i != 2 ? i != 3 ? "ISO-8859-1" : "UTF-8" : "UTF-16BE" : "UTF-16";
    }

    /* renamed from: b */
    private static String m9829b(int i, int i2, int i3, int i4, int i5) {
        return i == 2 ? String.format(Locale.US, "%c%c%c", Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)) : String.format(Locale.US, "%c%c%c%c", Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5));
    }

    /* renamed from: c */
    private static C2372s m9830c(C2644u c2644u, int i) {
        int m11244z = c2644u.m11244z();
        int m11241w = c2644u.m11241w();
        int m11241w2 = c2644u.m11241w();
        int m11238t = c2644u.m11238t();
        int m11238t2 = c2644u.m11238t();
        C2643t c2643t = new C2643t();
        c2643t.m11193a(c2644u);
        int i2 = ((i - 10) * 8) / (m11238t + m11238t2);
        int[] iArr = new int[i2];
        int[] iArr2 = new int[i2];
        for (int i3 = 0; i3 < i2; i3++) {
            int m11191a = c2643t.m11191a(m11238t);
            int m11191a2 = c2643t.m11191a(m11238t2);
            iArr[i3] = m11191a;
            iArr2[i3] = m11191a2;
        }
        return new C2372s(m11244z, m11241w, m11241w2, iArr, iArr2);
    }

    /* renamed from: c */
    private static C2378y m9831c(C2644u c2644u, int i, String str) {
        byte[] bArr = new byte[i];
        c2644u.m11214a(bArr, 0, i);
        return new C2378y(str, null, new String(bArr, 0, m9823b(bArr, 0), "ISO-8859-1"));
    }

    /* renamed from: d */
    private static C2374u m9832d(C2644u c2644u, int i) {
        byte[] bArr = new byte[i];
        c2644u.m11214a(bArr, 0, i);
        int m9823b = m9823b(bArr, 0);
        return new C2374u(new String(bArr, 0, m9823b, "ISO-8859-1"), m9822a(bArr, m9823b + 1, bArr.length));
    }

    /* renamed from: e */
    private static C2376w m9833e(C2644u c2644u, int i) {
        if (i < 1) {
            return null;
        }
        int m11238t = c2644u.m11238t();
        String m9828b = m9828b(m11238t);
        int i2 = i - 1;
        byte[] bArr = new byte[i2];
        c2644u.m11214a(bArr, 0, i2);
        int m9824b = m9824b(bArr, 0, m11238t);
        String str = new String(bArr, 0, m9824b, m9828b);
        int m9812a = m9824b + m9812a(m11238t);
        return new C2376w("TXXX", str, m9819a(bArr, m9812a, m9824b(bArr, m9812a, m11238t), m9828b));
    }

    /* renamed from: f */
    private static C2378y m9834f(C2644u c2644u, int i) {
        if (i < 1) {
            return null;
        }
        int m11238t = c2644u.m11238t();
        String m9828b = m9828b(m11238t);
        int i2 = i - 1;
        byte[] bArr = new byte[i2];
        c2644u.m11214a(bArr, 0, i2);
        int m9824b = m9824b(bArr, 0, m11238t);
        String str = new String(bArr, 0, m9824b, m9828b);
        int m9812a = m9824b + m9812a(m11238t);
        return new C2378y("WXXX", str, m9819a(bArr, m9812a, m9823b(bArr, m9812a), "ISO-8859-1"));
    }

    /* renamed from: g */
    private static int m9835g(C2644u c2644u, int i) {
        byte[] bArr = c2644u.f11004a;
        int m11217c = c2644u.m11217c();
        while (true) {
            int i2 = m11217c + 1;
            if (i2 >= i) {
                return i;
            }
            if ((bArr[m11217c] & 255) == 255 && bArr[i2] == 0) {
                System.arraycopy(bArr, m11217c + 2, bArr, i2, (i - m11217c) - 2);
                i--;
            }
            m11217c = i2;
        }
    }

    @Override // p139d.p225c.p226a.p227a.p245h.InterfaceC2379c
    /* renamed from: a */
    public C2353b mo9806a(C2394f c2394f) {
        ByteBuffer byteBuffer = c2394f.f8040c;
        return m9836a(byteBuffer.array(), byteBuffer.limit());
    }

    /* renamed from: a */
    public C2353b m9836a(byte[] bArr, int i) {
        ArrayList arrayList = new ArrayList();
        C2644u c2644u = new C2644u(bArr, i);
        b m9817a = m9817a(c2644u);
        if (m9817a == null) {
            return null;
        }
        int m11217c = c2644u.m11217c();
        int i2 = m9817a.f9307a == 2 ? 6 : 10;
        int i3 = m9817a.f9309c;
        if (m9817a.f9308b) {
            i3 = m9835g(c2644u, m9817a.f9309c);
        }
        c2644u.m11220d(m11217c + i3);
        boolean z = false;
        if (!m9821a(c2644u, m9817a.f9307a, i2, false)) {
            if (m9817a.f9307a != 4 || !m9821a(c2644u, 4, i2, true)) {
                C2638o.m11160d("Id3Decoder", "Failed to validate ID3 tag with majorVersion=" + m9817a.f9307a);
                return null;
            }
            z = true;
        }
        while (c2644u.m11208a() >= i2) {
            AbstractC2368o m9818a = m9818a(m9817a.f9307a, c2644u, z, i2, this.f9306c);
            if (m9818a != null) {
                arrayList.add(m9818a);
            }
        }
        return new C2353b(arrayList);
    }
}
