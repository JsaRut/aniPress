package p139d.p225c.p226a.p227a.p259k.p260a;

import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.text.style.UnderlineSpan;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import p000a.p005b.p022d.p023a.C0121j;
import p139d.p225c.p226a.p227a.p259k.AbstractC2563k;
import p139d.p225c.p226a.p227a.p259k.C2527b;
import p139d.p225c.p226a.p227a.p259k.C2562j;
import p139d.p225c.p226a.p227a.p259k.InterfaceC2537e;
import p139d.p225c.p226a.p227a.p270n.C2628e;
import p139d.p225c.p226a.p227a.p270n.C2638o;
import p139d.p225c.p226a.p227a.p270n.C2643t;
import p139d.p225c.p226a.p227a.p270n.C2644u;

/* renamed from: d.c.a.a.k.a.c */
/* loaded from: classes.dex */
public final class C2521c extends AbstractC2524f {

    /* renamed from: g */
    private final C2644u f10333g = new C2644u();

    /* renamed from: h */
    private final C2643t f10334h = new C2643t();

    /* renamed from: i */
    private final int f10335i;

    /* renamed from: j */
    private final a[] f10336j;

    /* renamed from: k */
    private a f10337k;

    /* renamed from: l */
    private List<C2527b> f10338l;

    /* renamed from: m */
    private List<C2527b> f10339m;

    /* renamed from: n */
    private b f10340n;

    /* renamed from: o */
    private int f10341o;

    /* renamed from: d.c.a.a.k.a.c$a */
    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a */
        public static final int f10342a = m10582a(2, 2, 2, 0);

        /* renamed from: b */
        public static final int f10343b = m10582a(0, 0, 0, 0);

        /* renamed from: c */
        public static final int f10344c = m10582a(0, 0, 0, 3);

        /* renamed from: d */
        private static final int[] f10345d = {0, 0, 0, 0, 0, 2, 0};

        /* renamed from: e */
        private static final int[] f10346e = {0, 0, 0, 0, 0, 0, 2};

        /* renamed from: f */
        private static final int[] f10347f = {3, 3, 3, 3, 3, 3, 1};

        /* renamed from: g */
        private static final boolean[] f10348g = {false, false, false, true, true, true, false};

        /* renamed from: h */
        private static final int[] f10349h;

        /* renamed from: i */
        private static final int[] f10350i;

        /* renamed from: j */
        private static final int[] f10351j;

        /* renamed from: k */
        private static final int[] f10352k;

        /* renamed from: A */
        private int f10353A;

        /* renamed from: B */
        private int f10354B;

        /* renamed from: C */
        private int f10355C;

        /* renamed from: D */
        private int f10356D;

        /* renamed from: E */
        private int f10357E;

        /* renamed from: F */
        private int f10358F;

        /* renamed from: G */
        private int f10359G;

        /* renamed from: l */
        private final List<SpannableString> f10360l = new ArrayList();

        /* renamed from: m */
        private final SpannableStringBuilder f10361m = new SpannableStringBuilder();

        /* renamed from: n */
        private boolean f10362n;

        /* renamed from: o */
        private boolean f10363o;

        /* renamed from: p */
        private int f10364p;

        /* renamed from: q */
        private boolean f10365q;

        /* renamed from: r */
        private int f10366r;

        /* renamed from: s */
        private int f10367s;

        /* renamed from: t */
        private int f10368t;

        /* renamed from: u */
        private int f10369u;

        /* renamed from: v */
        private boolean f10370v;

        /* renamed from: w */
        private int f10371w;

        /* renamed from: x */
        private int f10372x;

        /* renamed from: y */
        private int f10373y;

        /* renamed from: z */
        private int f10374z;

        static {
            int i = f10343b;
            int i2 = f10344c;
            f10349h = new int[]{i, i2, i, i, i2, i, i};
            f10350i = new int[]{0, 1, 2, 3, 4, 3, 4};
            f10351j = new int[]{0, 0, 0, 0, 0, 3, 3};
            f10352k = new int[]{i, i, i, i, i, i2, i2};
        }

        public a() {
            m10597h();
        }

        /* renamed from: a */
        public static int m10581a(int i, int i2, int i3) {
            return m10582a(i, i2, i3, 0);
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
        /* JADX WARN: Removed duplicated region for block: B:12:0x002a  */
        /* JADX WARN: Removed duplicated region for block: B:14:0x0030  */
        /* JADX WARN: Removed duplicated region for block: B:18:0x002d  */
        /* JADX WARN: Removed duplicated region for block: B:19:0x0027  */
        /* renamed from: a */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public static int m10582a(int r4, int r5, int r6, int r7) {
            /*
                r0 = 4
                r1 = 0
                p139d.p225c.p226a.p227a.p270n.C2628e.m11109a(r4, r1, r0)
                p139d.p225c.p226a.p227a.p270n.C2628e.m11109a(r5, r1, r0)
                p139d.p225c.p226a.p227a.p270n.C2628e.m11109a(r6, r1, r0)
                p139d.p225c.p226a.p227a.p270n.C2628e.m11109a(r7, r1, r0)
                r0 = 1
                r2 = 255(0xff, float:3.57E-43)
                if (r7 == 0) goto L1b
                if (r7 == r0) goto L1b
                r3 = 2
                if (r7 == r3) goto L20
                r3 = 3
                if (r7 == r3) goto L1e
            L1b:
                r7 = 255(0xff, float:3.57E-43)
                goto L22
            L1e:
                r7 = 0
                goto L22
            L20:
                r7 = 127(0x7f, float:1.78E-43)
            L22:
                if (r4 <= r0) goto L27
                r4 = 255(0xff, float:3.57E-43)
                goto L28
            L27:
                r4 = 0
            L28:
                if (r5 <= r0) goto L2d
                r5 = 255(0xff, float:3.57E-43)
                goto L2e
            L2d:
                r5 = 0
            L2e:
                if (r6 <= r0) goto L32
                r1 = 255(0xff, float:3.57E-43)
            L32:
                int r4 = android.graphics.Color.argb(r7, r4, r5, r1)
                return r4
            */
            throw new UnsupportedOperationException("Method not decompiled: p139d.p225c.p226a.p227a.p259k.p260a.C2521c.a.m10582a(int, int, int, int):int");
        }

        /* renamed from: a */
        public void m10583a() {
            int length = this.f10361m.length();
            if (length > 0) {
                this.f10361m.delete(length - 1, length);
            }
        }

        /* renamed from: a */
        public void m10584a(char c2) {
            if (c2 != '\n') {
                this.f10361m.append(c2);
                return;
            }
            this.f10360l.add(m10592c());
            this.f10361m.clear();
            if (this.f10353A != -1) {
                this.f10353A = 0;
            }
            if (this.f10354B != -1) {
                this.f10354B = 0;
            }
            if (this.f10355C != -1) {
                this.f10355C = 0;
            }
            if (this.f10357E != -1) {
                this.f10357E = 0;
            }
            while (true) {
                if ((!this.f10370v || this.f10360l.size() < this.f10369u) && this.f10360l.size() < 15) {
                    return;
                } else {
                    this.f10360l.remove(0);
                }
            }
        }

        /* renamed from: a */
        public void m10585a(int i, int i2) {
            if (this.f10359G != i) {
                m10584a('\n');
            }
            this.f10359G = i;
        }

        /* renamed from: a */
        public void m10586a(int i, int i2, int i3, boolean z, boolean z2, int i4, int i5) {
            if (this.f10353A != -1) {
                if (!z) {
                    this.f10361m.setSpan(new StyleSpan(2), this.f10353A, this.f10361m.length(), 33);
                    this.f10353A = -1;
                }
            } else if (z) {
                this.f10353A = this.f10361m.length();
            }
            if (this.f10354B == -1) {
                if (z2) {
                    this.f10354B = this.f10361m.length();
                }
            } else {
                if (z2) {
                    return;
                }
                this.f10361m.setSpan(new UnderlineSpan(), this.f10354B, this.f10361m.length(), 33);
                this.f10354B = -1;
            }
        }

        /* renamed from: a */
        public void m10587a(int i, int i2, boolean z, int i3, int i4, int i5, int i6) {
            this.f10374z = i;
            this.f10371w = i6;
        }

        /* renamed from: a */
        public void m10588a(boolean z) {
            this.f10363o = z;
        }

        /* renamed from: a */
        public void m10589a(boolean z, boolean z2, boolean z3, int i, boolean z4, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            this.f10362n = true;
            this.f10363o = z;
            this.f10370v = z2;
            this.f10364p = i;
            this.f10365q = z4;
            this.f10366r = i2;
            this.f10367s = i3;
            this.f10368t = i6;
            int i9 = i4 + 1;
            if (this.f10369u != i9) {
                this.f10369u = i9;
                while (true) {
                    if ((!z2 || this.f10360l.size() < this.f10369u) && this.f10360l.size() < 15) {
                        break;
                    } else {
                        this.f10360l.remove(0);
                    }
                }
            }
            if (i7 != 0 && this.f10372x != i7) {
                this.f10372x = i7;
                int i10 = i7 - 1;
                m10587a(f10349h[i10], f10344c, f10348g[i10], 0, f10346e[i10], f10347f[i10], f10345d[i10]);
            }
            if (i8 == 0 || this.f10373y == i8) {
                return;
            }
            this.f10373y = i8;
            int i11 = i8 - 1;
            m10586a(0, 1, 1, false, false, f10351j[i11], f10350i[i11]);
            m10591b(f10342a, f10352k[i11], f10343b);
        }

        /* JADX WARN: Removed duplicated region for block: B:20:0x0065  */
        /* JADX WARN: Removed duplicated region for block: B:23:0x0091  */
        /* JADX WARN: Removed duplicated region for block: B:26:0x009f  */
        /* JADX WARN: Removed duplicated region for block: B:29:0x00ad  */
        /* JADX WARN: Removed duplicated region for block: B:32:0x00a1  */
        /* JADX WARN: Removed duplicated region for block: B:36:0x0093  */
        /* JADX WARN: Removed duplicated region for block: B:40:0x0070  */
        /* renamed from: b */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public p139d.p225c.p226a.p227a.p259k.p260a.C2520b m10590b() {
            /*
                Method dump skipped, instructions count: 196
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: p139d.p225c.p226a.p227a.p259k.p260a.C2521c.a.m10590b():d.c.a.a.k.a.b");
        }

        /* renamed from: b */
        public void m10591b(int i, int i2, int i3) {
            int i4;
            int i5;
            if (this.f10355C != -1 && (i5 = this.f10356D) != i) {
                this.f10361m.setSpan(new ForegroundColorSpan(i5), this.f10355C, this.f10361m.length(), 33);
            }
            if (i != f10342a) {
                this.f10355C = this.f10361m.length();
                this.f10356D = i;
            }
            if (this.f10357E != -1 && (i4 = this.f10358F) != i2) {
                this.f10361m.setSpan(new BackgroundColorSpan(i4), this.f10357E, this.f10361m.length(), 33);
            }
            if (i2 != f10343b) {
                this.f10357E = this.f10361m.length();
                this.f10358F = i2;
            }
        }

        /* renamed from: c */
        public SpannableString m10592c() {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(this.f10361m);
            int length = spannableStringBuilder.length();
            if (length > 0) {
                if (this.f10353A != -1) {
                    spannableStringBuilder.setSpan(new StyleSpan(2), this.f10353A, length, 33);
                }
                if (this.f10354B != -1) {
                    spannableStringBuilder.setSpan(new UnderlineSpan(), this.f10354B, length, 33);
                }
                if (this.f10355C != -1) {
                    spannableStringBuilder.setSpan(new ForegroundColorSpan(this.f10356D), this.f10355C, length, 33);
                }
                if (this.f10357E != -1) {
                    spannableStringBuilder.setSpan(new BackgroundColorSpan(this.f10358F), this.f10357E, length, 33);
                }
            }
            return new SpannableString(spannableStringBuilder);
        }

        /* renamed from: d */
        public void m10593d() {
            this.f10360l.clear();
            this.f10361m.clear();
            this.f10353A = -1;
            this.f10354B = -1;
            this.f10355C = -1;
            this.f10357E = -1;
            this.f10359G = 0;
        }

        /* renamed from: e */
        public boolean m10594e() {
            return this.f10362n;
        }

        /* renamed from: f */
        public boolean m10595f() {
            return !m10594e() || (this.f10360l.isEmpty() && this.f10361m.length() == 0);
        }

        /* renamed from: g */
        public boolean m10596g() {
            return this.f10363o;
        }

        /* renamed from: h */
        public void m10597h() {
            m10593d();
            this.f10362n = false;
            this.f10363o = false;
            this.f10364p = 4;
            this.f10365q = false;
            this.f10366r = 0;
            this.f10367s = 0;
            this.f10368t = 0;
            this.f10369u = 15;
            this.f10370v = true;
            this.f10371w = 0;
            this.f10372x = 0;
            this.f10373y = 0;
            int i = f10343b;
            this.f10374z = i;
            this.f10356D = f10342a;
            this.f10358F = i;
        }
    }

    /* renamed from: d.c.a.a.k.a.c$b */
    /* loaded from: classes.dex */
    public static final class b {

        /* renamed from: a */
        public final int f10375a;

        /* renamed from: b */
        public final int f10376b;

        /* renamed from: c */
        public final byte[] f10377c;

        /* renamed from: d */
        int f10378d = 0;

        public b(int i, int i2) {
            this.f10375a = i;
            this.f10376b = i2;
            this.f10377c = new byte[(i2 * 2) - 1];
        }
    }

    public C2521c(int i, List<byte[]> list) {
        this.f10335i = i == -1 ? 1 : i;
        this.f10336j = new a[8];
        for (int i2 = 0; i2 < 8; i2++) {
            this.f10336j[i2] = new a();
        }
        this.f10337k = this.f10336j[0];
        m10580m();
    }

    /* renamed from: a */
    private void m10564a(int i) {
        C2643t c2643t;
        if (i != 0) {
            if (i == 3) {
                this.f10338l = m10571g();
                return;
            }
            int i2 = 8;
            if (i == 8) {
                this.f10337k.m10583a();
                return;
            }
            switch (i) {
                case 12:
                    m10580m();
                    return;
                case 13:
                    this.f10337k.m10584a('\n');
                    return;
                case 14:
                    return;
                default:
                    if (i >= 17 && i <= 23) {
                        C2638o.m11160d("Cea708Decoder", "Currently unsupported COMMAND_EXT1 Command: " + i);
                        c2643t = this.f10334h;
                    } else {
                        if (i < 24 || i > 31) {
                            C2638o.m11160d("Cea708Decoder", "Invalid C0 command: " + i);
                            return;
                        }
                        C2638o.m11160d("Cea708Decoder", "Currently unsupported COMMAND_P16 Command: " + i);
                        c2643t = this.f10334h;
                        i2 = 16;
                    }
                    c2643t.m11201c(i2);
                    return;
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0005. Please report as an issue. */
    /* renamed from: b */
    private void m10565b(int i) {
        a aVar;
        C2643t c2643t;
        int i2 = 16;
        int i3 = 1;
        switch (i) {
            case 128:
            case 129:
            case 130:
            case 131:
            case 132:
            case 133:
            case 134:
            case 135:
                int i4 = i - 128;
                if (this.f10341o != i4) {
                    this.f10341o = i4;
                    aVar = this.f10336j[i4];
                    this.f10337k = aVar;
                    return;
                }
                return;
            case 136:
                while (i3 <= 8) {
                    if (this.f10334h.m11204e()) {
                        this.f10336j[8 - i3].m10593d();
                    }
                    i3++;
                }
                return;
            case 137:
                for (int i5 = 1; i5 <= 8; i5++) {
                    if (this.f10334h.m11204e()) {
                        this.f10336j[8 - i5].m10588a(true);
                    }
                }
                return;
            case 138:
                while (i3 <= 8) {
                    if (this.f10334h.m11204e()) {
                        this.f10336j[8 - i3].m10588a(false);
                    }
                    i3++;
                }
                return;
            case 139:
                for (int i6 = 1; i6 <= 8; i6++) {
                    if (this.f10334h.m11204e()) {
                        this.f10336j[8 - i6].m10588a(!r0.m10596g());
                    }
                }
                return;
            case 140:
                while (i3 <= 8) {
                    if (this.f10334h.m11204e()) {
                        this.f10336j[8 - i3].m10597h();
                    }
                    i3++;
                }
                return;
            case 141:
                this.f10334h.m11201c(8);
                return;
            case 142:
                return;
            case 143:
                m10580m();
                return;
            case 144:
                if (this.f10337k.m10594e()) {
                    m10573h();
                    return;
                }
                c2643t = this.f10334h;
                c2643t.m11201c(i2);
                return;
            case 145:
                if (this.f10337k.m10594e()) {
                    m10575i();
                    return;
                }
                c2643t = this.f10334h;
                i2 = 24;
                c2643t.m11201c(i2);
                return;
            case 146:
                if (this.f10337k.m10594e()) {
                    m10577j();
                    return;
                }
                c2643t = this.f10334h;
                c2643t.m11201c(i2);
                return;
            case 147:
            case 148:
            case 149:
            case 150:
            default:
                C2638o.m11160d("Cea708Decoder", "Invalid C1 command: " + i);
                return;
            case 151:
                if (this.f10337k.m10594e()) {
                    m10578k();
                    return;
                }
                c2643t = this.f10334h;
                i2 = 32;
                c2643t.m11201c(i2);
                return;
            case 152:
            case 153:
            case 154:
            case 155:
            case 156:
            case 157:
            case 158:
            case 159:
                int i7 = i - 152;
                m10568e(i7);
                if (this.f10341o != i7) {
                    this.f10341o = i7;
                    aVar = this.f10336j[i7];
                    this.f10337k = aVar;
                    return;
                }
                return;
        }
    }

    /* renamed from: c */
    private void m10566c(int i) {
        C2643t c2643t;
        int i2;
        if (i <= 7) {
            return;
        }
        if (i <= 15) {
            c2643t = this.f10334h;
            i2 = 8;
        } else if (i <= 23) {
            c2643t = this.f10334h;
            i2 = 16;
        } else {
            if (i > 31) {
                return;
            }
            c2643t = this.f10334h;
            i2 = 24;
        }
        c2643t.m11201c(i2);
    }

    /* renamed from: d */
    private void m10567d(int i) {
        C2643t c2643t;
        int i2;
        if (i <= 135) {
            c2643t = this.f10334h;
            i2 = 32;
        } else {
            if (i > 143) {
                if (i <= 159) {
                    this.f10334h.m11201c(2);
                    this.f10334h.m11201c(this.f10334h.m11191a(6) * 8);
                    return;
                }
                return;
            }
            c2643t = this.f10334h;
            i2 = 40;
        }
        c2643t.m11201c(i2);
    }

    /* renamed from: e */
    private void m10568e(int i) {
        a aVar = this.f10336j[i];
        this.f10334h.m11201c(2);
        boolean m11204e = this.f10334h.m11204e();
        boolean m11204e2 = this.f10334h.m11204e();
        boolean m11204e3 = this.f10334h.m11204e();
        int m11191a = this.f10334h.m11191a(3);
        boolean m11204e4 = this.f10334h.m11204e();
        int m11191a2 = this.f10334h.m11191a(7);
        int m11191a3 = this.f10334h.m11191a(8);
        int m11191a4 = this.f10334h.m11191a(4);
        int m11191a5 = this.f10334h.m11191a(4);
        this.f10334h.m11201c(2);
        int m11191a6 = this.f10334h.m11191a(6);
        this.f10334h.m11201c(2);
        aVar.m10589a(m11204e, m11204e2, m11204e3, m11191a, m11204e4, m11191a2, m11191a3, m11191a5, m11191a6, m11191a4, this.f10334h.m11191a(3), this.f10334h.m11191a(3));
    }

    /* renamed from: f */
    private void m10569f() {
        if (this.f10340n == null) {
            return;
        }
        m10579l();
        this.f10340n = null;
    }

    /* renamed from: f */
    private void m10570f(int i) {
        if (i == 127) {
            this.f10337k.m10584a((char) 9835);
        } else {
            this.f10337k.m10584a((char) (i & 255));
        }
    }

    /* renamed from: g */
    private List<C2527b> m10571g() {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < 8; i++) {
            if (!this.f10336j[i].m10595f() && this.f10336j[i].m10596g()) {
                arrayList.add(this.f10336j[i].m10590b());
            }
        }
        Collections.sort(arrayList);
        return Collections.unmodifiableList(arrayList);
    }

    /* renamed from: g */
    private void m10572g(int i) {
        this.f10337k.m10584a((char) (i & 255));
    }

    /* renamed from: h */
    private void m10573h() {
        this.f10337k.m10586a(this.f10334h.m11191a(4), this.f10334h.m11191a(2), this.f10334h.m11191a(2), this.f10334h.m11204e(), this.f10334h.m11204e(), this.f10334h.m11191a(3), this.f10334h.m11191a(3));
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:21:0x0028. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:22:0x002b. Please report as an issue. */
    /* renamed from: h */
    private void m10574h(int i) {
        a aVar;
        char c2 = ' ';
        if (i == 32) {
            aVar = this.f10337k;
        } else if (i == 33) {
            aVar = this.f10337k;
            c2 = 160;
        } else if (i == 37) {
            aVar = this.f10337k;
            c2 = 8230;
        } else if (i == 42) {
            aVar = this.f10337k;
            c2 = 352;
        } else if (i == 44) {
            aVar = this.f10337k;
            c2 = 338;
        } else if (i == 63) {
            aVar = this.f10337k;
            c2 = 376;
        } else if (i == 57) {
            aVar = this.f10337k;
            c2 = 8482;
        } else if (i == 58) {
            aVar = this.f10337k;
            c2 = 353;
        } else if (i == 60) {
            aVar = this.f10337k;
            c2 = 339;
        } else if (i != 61) {
            switch (i) {
                case C0121j.AppCompatTheme_colorAccent /* 48 */:
                    aVar = this.f10337k;
                    c2 = 9608;
                    break;
                case C0121j.AppCompatTheme_colorBackgroundFloating /* 49 */:
                    aVar = this.f10337k;
                    c2 = 8216;
                    break;
                case C0121j.AppCompatTheme_colorButtonNormal /* 50 */:
                    aVar = this.f10337k;
                    c2 = 8217;
                    break;
                case C0121j.AppCompatTheme_colorControlActivated /* 51 */:
                    aVar = this.f10337k;
                    c2 = 8220;
                    break;
                case C0121j.AppCompatTheme_colorControlHighlight /* 52 */:
                    aVar = this.f10337k;
                    c2 = 8221;
                    break;
                case C0121j.AppCompatTheme_colorControlNormal /* 53 */:
                    aVar = this.f10337k;
                    c2 = 8226;
                    break;
                default:
                    switch (i) {
                        case C0121j.AppCompatTheme_windowMinWidthMajor /* 118 */:
                            aVar = this.f10337k;
                            c2 = 8539;
                            break;
                        case C0121j.AppCompatTheme_windowMinWidthMinor /* 119 */:
                            aVar = this.f10337k;
                            c2 = 8540;
                            break;
                        case C0121j.AppCompatTheme_windowNoTitle /* 120 */:
                            aVar = this.f10337k;
                            c2 = 8541;
                            break;
                        case 121:
                            aVar = this.f10337k;
                            c2 = 8542;
                            break;
                        case 122:
                            aVar = this.f10337k;
                            c2 = 9474;
                            break;
                        case 123:
                            aVar = this.f10337k;
                            c2 = 9488;
                            break;
                        case 124:
                            aVar = this.f10337k;
                            c2 = 9492;
                            break;
                        case 125:
                            aVar = this.f10337k;
                            c2 = 9472;
                            break;
                        case 126:
                            aVar = this.f10337k;
                            c2 = 9496;
                            break;
                        case 127:
                            aVar = this.f10337k;
                            c2 = 9484;
                            break;
                        default:
                            C2638o.m11160d("Cea708Decoder", "Invalid G2 character: " + i);
                            return;
                    }
            }
        } else {
            aVar = this.f10337k;
            c2 = 8480;
        }
        aVar.m10584a(c2);
    }

    /* renamed from: i */
    private void m10575i() {
        int m10582a = a.m10582a(this.f10334h.m11191a(2), this.f10334h.m11191a(2), this.f10334h.m11191a(2), this.f10334h.m11191a(2));
        int m10582a2 = a.m10582a(this.f10334h.m11191a(2), this.f10334h.m11191a(2), this.f10334h.m11191a(2), this.f10334h.m11191a(2));
        this.f10334h.m11201c(2);
        this.f10337k.m10591b(m10582a, m10582a2, a.m10581a(this.f10334h.m11191a(2), this.f10334h.m11191a(2), this.f10334h.m11191a(2)));
    }

    /* renamed from: i */
    private void m10576i(int i) {
        a aVar;
        char c2;
        if (i == 160) {
            aVar = this.f10337k;
            c2 = 13252;
        } else {
            C2638o.m11160d("Cea708Decoder", "Invalid G3 character: " + i);
            aVar = this.f10337k;
            c2 = '_';
        }
        aVar.m10584a(c2);
    }

    /* renamed from: j */
    private void m10577j() {
        this.f10334h.m11201c(4);
        int m11191a = this.f10334h.m11191a(4);
        this.f10334h.m11201c(2);
        this.f10337k.m10585a(m11191a, this.f10334h.m11191a(6));
    }

    /* renamed from: k */
    private void m10578k() {
        int m10582a = a.m10582a(this.f10334h.m11191a(2), this.f10334h.m11191a(2), this.f10334h.m11191a(2), this.f10334h.m11191a(2));
        int m11191a = this.f10334h.m11191a(2);
        int m10581a = a.m10581a(this.f10334h.m11191a(2), this.f10334h.m11191a(2), this.f10334h.m11191a(2));
        if (this.f10334h.m11204e()) {
            m11191a |= 4;
        }
        boolean m11204e = this.f10334h.m11204e();
        int m11191a2 = this.f10334h.m11191a(2);
        int m11191a3 = this.f10334h.m11191a(2);
        int m11191a4 = this.f10334h.m11191a(2);
        this.f10334h.m11201c(8);
        this.f10337k.m10587a(m10582a, m10581a, m11204e, m11191a, m11191a2, m11191a3, m11191a4);
    }

    /* renamed from: l */
    private void m10579l() {
        StringBuilder sb;
        String str;
        b bVar = this.f10340n;
        int i = bVar.f10378d;
        if (i != (bVar.f10376b * 2) - 1) {
            C2638o.m11160d("Cea708Decoder", "DtvCcPacket ended prematurely; size is " + ((this.f10340n.f10376b * 2) - 1) + ", but current index is " + this.f10340n.f10378d + " (sequence number " + this.f10340n.f10375a + "); ignoring packet");
            return;
        }
        this.f10334h.m11195a(bVar.f10377c, i);
        int m11191a = this.f10334h.m11191a(3);
        int m11191a2 = this.f10334h.m11191a(5);
        if (m11191a == 7) {
            this.f10334h.m11201c(2);
            m11191a = this.f10334h.m11191a(6);
            if (m11191a < 7) {
                C2638o.m11160d("Cea708Decoder", "Invalid extended service number: " + m11191a);
            }
        }
        if (m11191a2 == 0) {
            if (m11191a != 0) {
                C2638o.m11160d("Cea708Decoder", "serviceNumber is non-zero (" + m11191a + ") when blockSize is 0");
                return;
            }
            return;
        }
        if (m11191a != this.f10335i) {
            return;
        }
        boolean z = false;
        while (this.f10334h.m11190a() > 0) {
            int m11191a3 = this.f10334h.m11191a(8);
            if (m11191a3 == 16) {
                m11191a3 = this.f10334h.m11191a(8);
                if (m11191a3 <= 31) {
                    m10566c(m11191a3);
                } else {
                    if (m11191a3 <= 127) {
                        m10574h(m11191a3);
                    } else if (m11191a3 <= 159) {
                        m10567d(m11191a3);
                    } else if (m11191a3 <= 255) {
                        m10576i(m11191a3);
                    } else {
                        sb = new StringBuilder();
                        str = "Invalid extended command: ";
                        sb.append(str);
                        sb.append(m11191a3);
                        C2638o.m11160d("Cea708Decoder", sb.toString());
                    }
                    z = true;
                }
            } else if (m11191a3 <= 31) {
                m10564a(m11191a3);
            } else {
                if (m11191a3 <= 127) {
                    m10570f(m11191a3);
                } else if (m11191a3 <= 159) {
                    m10565b(m11191a3);
                } else if (m11191a3 <= 255) {
                    m10572g(m11191a3);
                } else {
                    sb = new StringBuilder();
                    str = "Invalid base command: ";
                    sb.append(str);
                    sb.append(m11191a3);
                    C2638o.m11160d("Cea708Decoder", sb.toString());
                }
                z = true;
            }
        }
        if (z) {
            this.f10338l = m10571g();
        }
    }

    /* renamed from: m */
    private void m10580m() {
        for (int i = 0; i < 8; i++) {
            this.f10336j[i].m10597h();
        }
    }

    @Override // p139d.p225c.p226a.p227a.p259k.p260a.AbstractC2524f, p139d.p225c.p226a.p227a.p230c.InterfaceC2194d
    /* renamed from: a */
    public /* bridge */ /* synthetic */ void mo9020a() {
        super.mo9020a();
    }

    @Override // p139d.p225c.p226a.p227a.p259k.p260a.AbstractC2524f, p139d.p225c.p226a.p227a.p259k.InterfaceC2540f
    /* renamed from: a */
    public /* bridge */ /* synthetic */ void mo10542a(long j) {
        super.mo10542a(j);
    }

    @Override // p139d.p225c.p226a.p227a.p259k.p260a.AbstractC2524f
    /* renamed from: a */
    protected void mo10543a(C2562j c2562j) {
        this.f10333g.m11213a(c2562j.f8040c.array(), c2562j.f8040c.limit());
        while (this.f10333g.m11208a() >= 3) {
            int m11238t = this.f10333g.m11238t() & 7;
            int i = m11238t & 3;
            boolean z = (m11238t & 4) == 4;
            byte m11238t2 = (byte) this.f10333g.m11238t();
            byte m11238t3 = (byte) this.f10333g.m11238t();
            if (i == 2 || i == 3) {
                if (z) {
                    if (i == 3) {
                        m10569f();
                        int i2 = (m11238t2 & 192) >> 6;
                        int i3 = m11238t2 & 63;
                        if (i3 == 0) {
                            i3 = 64;
                        }
                        this.f10340n = new b(i2, i3);
                        b bVar = this.f10340n;
                        byte[] bArr = bVar.f10377c;
                        int i4 = bVar.f10378d;
                        bVar.f10378d = i4 + 1;
                        bArr[i4] = m11238t3;
                    } else {
                        C2628e.m11111a(i == 2);
                        b bVar2 = this.f10340n;
                        if (bVar2 == null) {
                            C2638o.m11157b("Cea708Decoder", "Encountered DTVCC_PACKET_DATA before DTVCC_PACKET_START");
                        } else {
                            byte[] bArr2 = bVar2.f10377c;
                            int i5 = bVar2.f10378d;
                            bVar2.f10378d = i5 + 1;
                            bArr2[i5] = m11238t2;
                            int i6 = bVar2.f10378d;
                            bVar2.f10378d = i6 + 1;
                            bArr2[i6] = m11238t3;
                        }
                    }
                    b bVar3 = this.f10340n;
                    if (bVar3.f10378d == (bVar3.f10376b * 2) - 1) {
                        m10569f();
                    }
                }
            }
        }
    }

    @Override // p139d.p225c.p226a.p227a.p259k.p260a.AbstractC2524f, p139d.p225c.p226a.p227a.p230c.InterfaceC2194d
    /* renamed from: b */
    public /* bridge */ /* synthetic */ AbstractC2563k mo9022b() {
        return super.mo9022b();
    }

    @Override // p139d.p225c.p226a.p227a.p259k.p260a.AbstractC2524f
    /* renamed from: b */
    public /* bridge */ /* synthetic */ void mo9021a(C2562j c2562j) {
        super.mo9021a(c2562j);
    }

    @Override // p139d.p225c.p226a.p227a.p259k.p260a.AbstractC2524f, p139d.p225c.p226a.p227a.p230c.InterfaceC2194d
    /* renamed from: c */
    public /* bridge */ /* synthetic */ C2562j mo9023c() {
        return super.mo9023c();
    }

    @Override // p139d.p225c.p226a.p227a.p259k.p260a.AbstractC2524f
    /* renamed from: d */
    protected InterfaceC2537e mo10545d() {
        List<C2527b> list = this.f10338l;
        this.f10339m = list;
        return new C2525g(list);
    }

    @Override // p139d.p225c.p226a.p227a.p259k.p260a.AbstractC2524f
    /* renamed from: e */
    protected boolean mo10546e() {
        return this.f10338l != this.f10339m;
    }

    @Override // p139d.p225c.p226a.p227a.p259k.p260a.AbstractC2524f, p139d.p225c.p226a.p227a.p230c.InterfaceC2194d
    public void flush() {
        super.flush();
        this.f10338l = null;
        this.f10339m = null;
        this.f10341o = 0;
        this.f10337k = this.f10336j[this.f10341o];
        m10580m();
        this.f10340n = null;
    }
}
