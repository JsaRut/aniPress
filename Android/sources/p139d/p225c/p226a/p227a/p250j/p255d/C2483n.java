package p139d.p225c.p226a.p227a.p250j.p255d;

import android.os.Handler;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import p139d.p225c.p226a.p227a.C2676s;
import p139d.p225c.p226a.p227a.C2677t;
import p139d.p225c.p226a.p227a.p230c.C2196f;
import p139d.p225c.p226a.p227a.p234f.C2272f;
import p139d.p225c.p226a.p227a.p234f.InterfaceC2325i;
import p139d.p225c.p226a.p227a.p234f.InterfaceC2335o;
import p139d.p225c.p226a.p227a.p234f.InterfaceC2337q;
import p139d.p225c.p226a.p227a.p245h.C2353b;
import p139d.p225c.p226a.p227a.p245h.p247b.C2374u;
import p139d.p225c.p226a.p227a.p250j.C2403D;
import p139d.p225c.p226a.p227a.p250j.C2411L;
import p139d.p225c.p226a.p227a.p250j.C2413N;
import p139d.p225c.p226a.p227a.p250j.InterfaceC2404E;
import p139d.p225c.p226a.p227a.p250j.InterfaceC2405F;
import p139d.p225c.p226a.p227a.p250j.InterfaceC2516z;
import p139d.p225c.p226a.p227a.p250j.p252b.AbstractC2421d;
import p139d.p225c.p226a.p227a.p250j.p255d.C2475f;
import p139d.p225c.p226a.p227a.p250j.p255d.p256a.C2465d;
import p139d.p225c.p226a.p227a.p269m.C2612z;
import p139d.p225c.p226a.p227a.p269m.InterfaceC2590d;
import p139d.p225c.p226a.p227a.p269m.InterfaceC2610x;
import p139d.p225c.p226a.p227a.p270n.C2622I;
import p139d.p225c.p226a.p227a.p270n.C2628e;
import p139d.p225c.p226a.p227a.p270n.C2638o;
import p139d.p225c.p226a.p227a.p270n.C2641r;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: d.c.a.a.j.d.n */
/* loaded from: classes.dex */
public final class C2483n implements C2612z.a<AbstractC2421d>, C2612z.e, InterfaceC2405F, InterfaceC2325i, C2403D.b {

    /* renamed from: A */
    private C2676s f9996A;

    /* renamed from: B */
    private C2676s f9997B;

    /* renamed from: C */
    private boolean f9998C;

    /* renamed from: D */
    private C2413N f9999D;

    /* renamed from: E */
    private C2413N f10000E;

    /* renamed from: F */
    private int[] f10001F;

    /* renamed from: G */
    private int f10002G;

    /* renamed from: H */
    private boolean f10003H;

    /* renamed from: K */
    private long f10006K;

    /* renamed from: L */
    private long f10007L;

    /* renamed from: M */
    private boolean f10008M;

    /* renamed from: N */
    private boolean f10009N;

    /* renamed from: O */
    private boolean f10010O;

    /* renamed from: P */
    private boolean f10011P;

    /* renamed from: Q */
    private long f10012Q;

    /* renamed from: R */
    private int f10013R;

    /* renamed from: a */
    private final int f10014a;

    /* renamed from: b */
    private final a f10015b;

    /* renamed from: c */
    private final C2475f f10016c;

    /* renamed from: d */
    private final InterfaceC2590d f10017d;

    /* renamed from: e */
    private final C2676s f10018e;

    /* renamed from: f */
    private final InterfaceC2610x f10019f;

    /* renamed from: h */
    private final InterfaceC2516z.a f10021h;

    /* renamed from: r */
    private boolean f10031r;

    /* renamed from: t */
    private boolean f10033t;

    /* renamed from: v */
    private int f10035v;

    /* renamed from: w */
    private int f10036w;

    /* renamed from: x */
    private boolean f10037x;

    /* renamed from: y */
    private boolean f10038y;

    /* renamed from: z */
    private int f10039z;

    /* renamed from: g */
    private final C2612z f10020g = new C2612z("Loader:HlsSampleStreamWrapper");

    /* renamed from: i */
    private final C2475f.b f10022i = new C2475f.b();

    /* renamed from: q */
    private int[] f10030q = new int[0];

    /* renamed from: s */
    private int f10032s = -1;

    /* renamed from: u */
    private int f10034u = -1;

    /* renamed from: p */
    private C2403D[] f10029p = new C2403D[0];

    /* renamed from: J */
    private boolean[] f10005J = new boolean[0];

    /* renamed from: I */
    private boolean[] f10004I = new boolean[0];

    /* renamed from: j */
    private final ArrayList<C2479j> f10023j = new ArrayList<>();

    /* renamed from: k */
    private final List<C2479j> f10024k = Collections.unmodifiableList(this.f10023j);

    /* renamed from: o */
    private final ArrayList<C2482m> f10028o = new ArrayList<>();

    /* renamed from: l */
    private final Runnable f10025l = new Runnable() { // from class: d.c.a.a.j.d.a
        @Override // java.lang.Runnable
        public final void run() {
            C2483n.this.m10362o();
        }
    };

    /* renamed from: m */
    private final Runnable f10026m = new Runnable() { // from class: d.c.a.a.j.d.b
        @Override // java.lang.Runnable
        public final void run() {
            C2483n.this.m10363p();
        }
    };

    /* renamed from: n */
    private final Handler f10027n = new Handler();

    /* renamed from: d.c.a.a.j.d.n$a */
    /* loaded from: classes.dex */
    public interface a extends InterfaceC2405F.a<C2483n> {
        /* renamed from: a */
        void mo10342a();

        /* renamed from: a */
        void mo10343a(C2465d.a aVar);
    }

    /* renamed from: d.c.a.a.j.d.n$b */
    /* loaded from: classes.dex */
    private static final class b extends C2403D {
        public b(InterfaceC2590d interfaceC2590d) {
            super(interfaceC2590d);
        }

        /* renamed from: a */
        private C2353b m10383a(C2353b c2353b) {
            if (c2353b == null) {
                return null;
            }
            int m9810a = c2353b.m9810a();
            int i = 0;
            int i2 = 0;
            while (true) {
                if (i2 >= m9810a) {
                    i2 = -1;
                    break;
                }
                C2353b.a m9811a = c2353b.m9811a(i2);
                if ((m9811a instanceof C2374u) && "com.apple.streaming.transportStreamTimestamp".equals(((C2374u) m9811a).f9319a)) {
                    break;
                }
                i2++;
            }
            if (i2 == -1) {
                return c2353b;
            }
            if (m9810a == 1) {
                return null;
            }
            C2353b.a[] aVarArr = new C2353b.a[m9810a - 1];
            while (i < m9810a) {
                if (i != i2) {
                    aVarArr[i < i2 ? i : i - 1] = c2353b.m9811a(i);
                }
                i++;
            }
            return new C2353b(aVarArr);
        }

        @Override // p139d.p225c.p226a.p227a.p250j.C2403D, p139d.p225c.p226a.p227a.p234f.InterfaceC2337q
        /* renamed from: a */
        public void mo9433a(C2676s c2676s) {
            super.mo9433a(c2676s.m11441a(m10383a(c2676s.f11180e)));
        }
    }

    public C2483n(int i, a aVar, C2475f c2475f, InterfaceC2590d interfaceC2590d, long j, C2676s c2676s, InterfaceC2610x interfaceC2610x, InterfaceC2516z.a aVar2) {
        this.f10014a = i;
        this.f10015b = aVar;
        this.f10016c = c2475f;
        this.f10017d = interfaceC2590d;
        this.f10018e = c2676s;
        this.f10019f = interfaceC2610x;
        this.f10021h = aVar2;
        this.f10006K = j;
        this.f10007L = j;
    }

    /* renamed from: a */
    private static C2676s m10348a(C2676s c2676s, C2676s c2676s2, boolean z) {
        if (c2676s == null) {
            return c2676s2;
        }
        int i = z ? c2676s.f11178c : -1;
        String m11053a = C2622I.m11053a(c2676s.f11179d, C2641r.m11169d(c2676s2.f11182g));
        String m11168c = C2641r.m11168c(m11053a);
        if (m11168c == null) {
            m11168c = c2676s2.f11182g;
        }
        return c2676s2.m11443a(c2676s.f11176a, c2676s.f11177b, m11168c, m11053a, i, c2676s.f11187l, c2676s.f11188m, c2676s.f11200y, c2676s.f11201z);
    }

    /* renamed from: a */
    private void m10350a(InterfaceC2404E[] interfaceC2404EArr) {
        this.f10028o.clear();
        for (InterfaceC2404E interfaceC2404E : interfaceC2404EArr) {
            if (interfaceC2404E != null) {
                this.f10028o.add((C2482m) interfaceC2404E);
            }
        }
    }

    /* renamed from: a */
    private static boolean m10351a(AbstractC2421d abstractC2421d) {
        return abstractC2421d instanceof C2479j;
    }

    /* renamed from: a */
    private boolean m10352a(C2479j c2479j) {
        int i = c2479j.f9950k;
        int length = this.f10029p.length;
        for (int i2 = 0; i2 < length; i2++) {
            if (this.f10004I[i2] && this.f10029p[i2].m9952k() == i) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: a */
    private static boolean m10353a(C2676s c2676s, C2676s c2676s2) {
        String str = c2676s.f11182g;
        String str2 = c2676s2.f11182g;
        int m11169d = C2641r.m11169d(str);
        if (m11169d != 3) {
            return m11169d == C2641r.m11169d(str2);
        }
        if (C2622I.m11067a((Object) str, (Object) str2)) {
            return !("application/cea-608".equals(str) || "application/cea-708".equals(str)) || c2676s.f11174A == c2676s2.f11174A;
        }
        return false;
    }

    /* renamed from: b */
    private static C2272f m10354b(int i, int i2) {
        C2638o.m11160d("HlsSampleStreamWrapper", "Unmapped track with id " + i + " of type " + i2);
        return new C2272f();
    }

    /* renamed from: d */
    private static int m10356d(int i) {
        if (i == 1) {
            return 2;
        }
        if (i != 2) {
            return i != 3 ? 0 : 1;
        }
        return 3;
    }

    /* renamed from: e */
    private boolean m10357e(long j) {
        int i;
        int length = this.f10029p.length;
        while (true) {
            if (i >= length) {
                return true;
            }
            C2403D c2403d = this.f10029p[i];
            c2403d.m9954m();
            i = ((c2403d.m9934a(j, true, false) != -1) || (!this.f10005J[i] && this.f10003H)) ? i + 1 : 0;
        }
        return false;
    }

    /* renamed from: k */
    private void m10358k() {
        int length = this.f10029p.length;
        int i = 0;
        int i2 = 6;
        int i3 = -1;
        while (true) {
            if (i >= length) {
                break;
            }
            String str = this.f10029p[i].m9949h().f11182g;
            int i4 = C2641r.m11174i(str) ? 2 : C2641r.m11172g(str) ? 1 : C2641r.m11173h(str) ? 3 : 6;
            if (m10356d(i4) > m10356d(i2)) {
                i3 = i;
                i2 = i4;
            } else if (i4 == i2 && i3 != -1) {
                i3 = -1;
            }
            i++;
        }
        C2411L m10314a = this.f10016c.m10314a();
        int i5 = m10314a.f9481a;
        this.f10002G = -1;
        this.f10001F = new int[length];
        for (int i6 = 0; i6 < length; i6++) {
            this.f10001F[i6] = i6;
        }
        C2411L[] c2411lArr = new C2411L[length];
        for (int i7 = 0; i7 < length; i7++) {
            C2676s m9949h = this.f10029p[i7].m9949h();
            if (i7 == i3) {
                C2676s[] c2676sArr = new C2676s[i5];
                if (i5 == 1) {
                    c2676sArr[0] = m9949h.m11442a(m10314a.m9976a(0));
                } else {
                    for (int i8 = 0; i8 < i5; i8++) {
                        c2676sArr[i8] = m10348a(m10314a.m9976a(i8), m9949h, true);
                    }
                }
                c2411lArr[i7] = new C2411L(c2676sArr);
                this.f10002G = i7;
            } else {
                c2411lArr[i7] = new C2411L(m10348a((i2 == 2 && C2641r.m11172g(m9949h.f11182g)) ? this.f10018e : null, m9949h, false));
            }
        }
        this.f9999D = new C2413N(c2411lArr);
        C2628e.m11113b(this.f10000E == null);
        this.f10000E = C2413N.f9484a;
    }

    /* renamed from: l */
    private C2479j m10359l() {
        return this.f10023j.get(r0.size() - 1);
    }

    /* renamed from: m */
    private boolean m10360m() {
        return this.f10007L != -9223372036854775807L;
    }

    /* renamed from: n */
    private void m10361n() {
        int i = this.f9999D.f9485b;
        this.f10001F = new int[i];
        Arrays.fill(this.f10001F, -1);
        for (int i2 = 0; i2 < i; i2++) {
            int i3 = 0;
            while (true) {
                C2403D[] c2403dArr = this.f10029p;
                if (i3 >= c2403dArr.length) {
                    break;
                }
                if (m10353a(c2403dArr[i3].m9949h(), this.f9999D.m9978a(i2).m9976a(0))) {
                    this.f10001F[i2] = i3;
                    break;
                }
                i3++;
            }
        }
        Iterator<C2482m> it = this.f10028o.iterator();
        while (it.hasNext()) {
            it.next().m10346b();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: o */
    public void m10362o() {
        if (!this.f9998C && this.f10001F == null && this.f10037x) {
            for (C2403D c2403d : this.f10029p) {
                if (c2403d.m9949h() == null) {
                    return;
                }
            }
            if (this.f9999D != null) {
                m10361n();
                return;
            }
            m10358k();
            this.f10038y = true;
            this.f10015b.mo10342a();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: p */
    public void m10363p() {
        this.f10037x = true;
        m10362o();
    }

    /* renamed from: q */
    private void m10364q() {
        for (C2403D c2403d : this.f10029p) {
            c2403d.m9939a(this.f10008M);
        }
        this.f10008M = false;
    }

    /* renamed from: a */
    public int m10365a(int i) {
        int i2 = this.f10001F[i];
        if (i2 == -1) {
            return this.f10000E.m9977a(this.f9999D.m9978a(i)) == -1 ? -2 : -3;
        }
        boolean[] zArr = this.f10004I;
        if (zArr[i2]) {
            return -2;
        }
        zArr[i2] = true;
        return i2;
    }

    /* renamed from: a */
    public int m10366a(int i, long j) {
        if (m10360m()) {
            return 0;
        }
        C2403D c2403d = this.f10029p[i];
        if (this.f10010O && j > c2403d.m9947f()) {
            return c2403d.m9933a();
        }
        int m9934a = c2403d.m9934a(j, true, true);
        if (m9934a == -1) {
            return 0;
        }
        return m9934a;
    }

    /* renamed from: a */
    public int m10367a(int i, C2677t c2677t, C2196f c2196f, boolean z) {
        if (m10360m()) {
            return -3;
        }
        int i2 = 0;
        if (!this.f10023j.isEmpty()) {
            int i3 = 0;
            while (i3 < this.f10023j.size() - 1 && m10352a(this.f10023j.get(i3))) {
                i3++;
            }
            C2622I.m11062a((List) this.f10023j, 0, i3);
            C2479j c2479j = this.f10023j.get(0);
            C2676s c2676s = c2479j.f9513c;
            if (!c2676s.equals(this.f9997B)) {
                this.f10021h.m10493a(this.f10014a, c2676s, c2479j.f9514d, c2479j.f9515e, c2479j.f9516f);
            }
            this.f9997B = c2676s;
        }
        int m9935a = this.f10029p[i].m9935a(c2677t, c2196f, z, this.f10010O, this.f10006K);
        if (m9935a == -5 && i == this.f10036w) {
            int m9952k = this.f10029p[i].m9952k();
            while (i2 < this.f10023j.size() && this.f10023j.get(i2).f9950k != m9952k) {
                i2++;
            }
            c2677t.f11202a = c2677t.f11202a.m11442a(i2 < this.f10023j.size() ? this.f10023j.get(i2).f9513c : this.f9996A);
        }
        return m9935a;
    }

    @Override // p139d.p225c.p226a.p227a.p234f.InterfaceC2325i
    /* renamed from: a */
    public InterfaceC2337q mo9671a(int i, int i2) {
        C2403D[] c2403dArr = this.f10029p;
        int length = c2403dArr.length;
        if (i2 == 1) {
            int i3 = this.f10032s;
            if (i3 != -1) {
                if (this.f10031r) {
                    return this.f10030q[i3] == i ? c2403dArr[i3] : m10354b(i, i2);
                }
                this.f10031r = true;
                this.f10030q[i3] = i;
                return c2403dArr[i3];
            }
            if (this.f10011P) {
                return m10354b(i, i2);
            }
        } else if (i2 == 2) {
            int i4 = this.f10034u;
            if (i4 != -1) {
                if (this.f10033t) {
                    return this.f10030q[i4] == i ? c2403dArr[i4] : m10354b(i, i2);
                }
                this.f10033t = true;
                this.f10030q[i4] = i;
                return c2403dArr[i4];
            }
            if (this.f10011P) {
                return m10354b(i, i2);
            }
        } else {
            for (int i5 = 0; i5 < length; i5++) {
                if (this.f10030q[i5] == i) {
                    return this.f10029p[i5];
                }
            }
            if (this.f10011P) {
                return m10354b(i, i2);
            }
        }
        b bVar = new b(this.f10017d);
        bVar.m9937a(this.f10012Q);
        bVar.m9944c(this.f10013R);
        bVar.m9938a(this);
        int i6 = length + 1;
        this.f10030q = Arrays.copyOf(this.f10030q, i6);
        this.f10030q[length] = i;
        this.f10029p = (C2403D[]) Arrays.copyOf(this.f10029p, i6);
        this.f10029p[length] = bVar;
        this.f10005J = Arrays.copyOf(this.f10005J, i6);
        this.f10005J[length] = i2 == 1 || i2 == 2;
        this.f10003H |= this.f10005J[length];
        if (i2 == 1) {
            this.f10031r = true;
            this.f10032s = length;
        } else if (i2 == 2) {
            this.f10033t = true;
            this.f10034u = length;
        }
        if (m10356d(i2) > m10356d(this.f10035v)) {
            this.f10036w = length;
            this.f10035v = i2;
        }
        this.f10004I = Arrays.copyOf(this.f10004I, i6);
        return bVar;
    }

    @Override // p139d.p225c.p226a.p227a.p269m.C2612z.a
    /* renamed from: a, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public C2612z.b mo9965a(AbstractC2421d abstractC2421d, long j, long j2, IOException iOException, int i) {
        C2612z.b m10955a;
        long m9992c = abstractC2421d.m9992c();
        boolean m10351a = m10351a(abstractC2421d);
        long mo10950b = this.f10019f.mo10950b(abstractC2421d.f9512b, j2, iOException, i);
        boolean m10319a = mo10950b != -9223372036854775807L ? this.f10016c.m10319a(abstractC2421d, mo10950b) : false;
        if (m10319a) {
            if (m10351a && m9992c == 0) {
                ArrayList<C2479j> arrayList = this.f10023j;
                C2628e.m11113b(arrayList.remove(arrayList.size() - 1) == abstractC2421d);
                if (this.f10023j.isEmpty()) {
                    this.f10007L = this.f10006K;
                }
            }
            m10955a = C2612z.f10849c;
        } else {
            long mo10949a = this.f10019f.mo10949a(abstractC2421d.f9512b, j2, iOException, i);
            m10955a = mo10949a != -9223372036854775807L ? C2612z.m10955a(false, mo10949a) : C2612z.f10850d;
        }
        C2612z.b bVar = m10955a;
        this.f10021h.m10507a(abstractC2421d.f9511a, abstractC2421d.m9995f(), abstractC2421d.m9994e(), abstractC2421d.f9512b, this.f10014a, abstractC2421d.f9513c, abstractC2421d.f9514d, abstractC2421d.f9515e, abstractC2421d.f9516f, abstractC2421d.f9517g, j, j2, m9992c, iOException, !bVar.m10968a());
        if (m10319a) {
            if (this.f10038y) {
                this.f10015b.mo9878a((a) this);
            } else {
                mo9882b(this.f10006K);
            }
        }
        return bVar;
    }

    @Override // p139d.p225c.p226a.p227a.p234f.InterfaceC2325i
    /* renamed from: a */
    public void mo9672a() {
        this.f10011P = true;
        this.f10027n.post(this.f10026m);
    }

    /* renamed from: a */
    public void m10368a(int i, boolean z, boolean z2) {
        if (!z2) {
            this.f10031r = false;
            this.f10033t = false;
        }
        this.f10013R = i;
        for (C2403D c2403d : this.f10029p) {
            c2403d.m9944c(i);
        }
        if (z) {
            for (C2403D c2403d2 : this.f10029p) {
                c2403d2.m9955n();
            }
        }
    }

    /* renamed from: a */
    public void m10369a(long j, boolean z) {
        if (!this.f10037x || m10360m()) {
            return;
        }
        int length = this.f10029p.length;
        for (int i = 0; i < length; i++) {
            this.f10029p[i].m9941b(j, z, this.f10004I[i]);
        }
    }

    @Override // p139d.p225c.p226a.p227a.p234f.InterfaceC2325i
    /* renamed from: a */
    public void mo9673a(InterfaceC2335o interfaceC2335o) {
    }

    /* renamed from: a */
    public void m10370a(C2413N c2413n, int i, C2413N c2413n2) {
        this.f10038y = true;
        this.f9999D = c2413n;
        this.f10000E = c2413n2;
        this.f10002G = i;
        this.f10015b.mo10342a();
    }

    @Override // p139d.p225c.p226a.p227a.p269m.C2612z.a
    /* renamed from: a, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public void mo9967a(AbstractC2421d abstractC2421d, long j, long j2) {
        this.f10016c.m10316a(abstractC2421d);
        this.f10021h.m10515b(abstractC2421d.f9511a, abstractC2421d.m9995f(), abstractC2421d.m9994e(), abstractC2421d.f9512b, this.f10014a, abstractC2421d.f9513c, abstractC2421d.f9514d, abstractC2421d.f9515e, abstractC2421d.f9516f, abstractC2421d.f9517g, j, j2, abstractC2421d.m9992c());
        if (this.f10038y) {
            this.f10015b.mo9878a((a) this);
        } else {
            mo9882b(this.f10006K);
        }
    }

    @Override // p139d.p225c.p226a.p227a.p269m.C2612z.a
    /* renamed from: a, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public void mo9968a(AbstractC2421d abstractC2421d, long j, long j2, boolean z) {
        this.f10021h.m10506a(abstractC2421d.f9511a, abstractC2421d.m9995f(), abstractC2421d.m9994e(), abstractC2421d.f9512b, this.f10014a, abstractC2421d.f9513c, abstractC2421d.f9514d, abstractC2421d.f9515e, abstractC2421d.f9516f, abstractC2421d.f9517g, j, j2, abstractC2421d.m9992c());
        if (z) {
            return;
        }
        m10364q();
        if (this.f10039z > 0) {
            this.f10015b.mo9878a((a) this);
        }
    }

    @Override // p139d.p225c.p226a.p227a.p250j.C2403D.b
    /* renamed from: a */
    public void mo9959a(C2676s c2676s) {
        this.f10027n.post(this.f10025l);
    }

    /* renamed from: a */
    public void m10371a(boolean z) {
        this.f10016c.m10318a(z);
    }

    /* renamed from: a */
    public boolean m10372a(C2465d.a aVar, long j) {
        return this.f10016c.m10320a(aVar, j);
    }

    /* JADX WARN: Removed duplicated region for block: B:79:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x013c  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean m10373a(p139d.p225c.p226a.p227a.p268l.InterfaceC2577k[] r20, boolean[] r21, p139d.p225c.p226a.p227a.p250j.InterfaceC2404E[] r22, boolean[] r23, long r24, boolean r26) {
        /*
            Method dump skipped, instructions count: 337
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p139d.p225c.p226a.p227a.p250j.p255d.C2483n.m10373a(d.c.a.a.l.k[], boolean[], d.c.a.a.j.E[], boolean[], long, boolean):boolean");
    }

    @Override // p139d.p225c.p226a.p227a.p250j.InterfaceC2405F
    /* renamed from: b */
    public long mo9880b() {
        if (m10360m()) {
            return this.f10007L;
        }
        if (this.f10010O) {
            return Long.MIN_VALUE;
        }
        return m10359l().f9517g;
    }

    /* renamed from: b */
    public boolean m10374b(int i) {
        return this.f10010O || (!m10360m() && this.f10029p[i].m9951j());
    }

    @Override // p139d.p225c.p226a.p227a.p250j.InterfaceC2405F
    /* renamed from: b */
    public boolean mo9882b(long j) {
        List<C2479j> list;
        long max;
        if (this.f10010O || this.f10020g.m10964c()) {
            return false;
        }
        if (m10360m()) {
            list = Collections.emptyList();
            max = this.f10007L;
        } else {
            list = this.f10024k;
            C2479j m10359l = m10359l();
            max = m10359l.mo10033h() ? m10359l.f9517g : Math.max(this.f10006K, m10359l.f9516f);
        }
        this.f10016c.m10315a(j, max, list, this.f10022i);
        C2475f.b bVar = this.f10022i;
        boolean z = bVar.f9934b;
        AbstractC2421d abstractC2421d = bVar.f9933a;
        C2465d.a aVar = bVar.f9935c;
        bVar.m10326a();
        if (z) {
            this.f10007L = -9223372036854775807L;
            this.f10010O = true;
            return true;
        }
        if (abstractC2421d == null) {
            if (aVar != null) {
                this.f10015b.mo10343a(aVar);
            }
            return false;
        }
        if (m10351a(abstractC2421d)) {
            this.f10007L = -9223372036854775807L;
            C2479j c2479j = (C2479j) abstractC2421d;
            c2479j.m10336a(this);
            this.f10023j.add(c2479j);
            this.f9996A = c2479j.f9513c;
        }
        this.f10021h.m10504a(abstractC2421d.f9511a, abstractC2421d.f9512b, this.f10014a, abstractC2421d.f9513c, abstractC2421d.f9514d, abstractC2421d.f9515e, abstractC2421d.f9516f, abstractC2421d.f9517g, this.f10020g.m10960a(abstractC2421d, this, this.f10019f.mo10948a(abstractC2421d.f9512b)));
        return true;
    }

    /* renamed from: b */
    public boolean m10375b(long j, boolean z) {
        this.f10006K = j;
        if (m10360m()) {
            this.f10007L = j;
            return true;
        }
        if (this.f10037x && !z && m10357e(j)) {
            return false;
        }
        this.f10007L = j;
        this.f10010O = false;
        this.f10023j.clear();
        if (this.f10020g.m10964c()) {
            this.f10020g.m10963b();
        } else {
            m10364q();
        }
        return true;
    }

    /* renamed from: c */
    public void m10376c() {
        if (this.f10038y) {
            return;
        }
        mo9882b(this.f10006K);
    }

    /* renamed from: c */
    public void m10377c(int i) {
        int i2 = this.f10001F[i];
        C2628e.m11113b(this.f10004I[i2]);
        this.f10004I[i2] = false;
    }

    @Override // p139d.p225c.p226a.p227a.p250j.InterfaceC2405F
    /* renamed from: c */
    public void mo9883c(long j) {
    }

    /* renamed from: d */
    public void m10378d() {
        m10381i();
    }

    /* renamed from: d */
    public void m10379d(long j) {
        this.f10012Q = j;
        for (C2403D c2403d : this.f10029p) {
            c2403d.m9937a(j);
        }
    }

    /* renamed from: f */
    public C2413N m10380f() {
        return this.f9999D;
    }

    /*  JADX ERROR: NullPointerException in pass: LoopRegionVisitor
        java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.SSAVar.use(jadx.core.dex.instructions.args.RegisterArg)" because "ssaVar" is null
        	at jadx.core.dex.nodes.InsnNode.rebindArgs(InsnNode.java:489)
        	at jadx.core.dex.nodes.InsnNode.rebindArgs(InsnNode.java:492)
        */
    @Override // p139d.p225c.p226a.p227a.p250j.InterfaceC2405F
    /* renamed from: g */
    public long mo9887g() {
        /*
            r7 = this;
            boolean r0 = r7.f10010O
            if (r0 == 0) goto L7
            r0 = -9223372036854775808
            return r0
        L7:
            boolean r0 = r7.m10360m()
            if (r0 == 0) goto L10
            long r0 = r7.f10007L
            return r0
        L10:
            long r0 = r7.f10006K
            d.c.a.a.j.d.j r2 = r7.m10359l()
            boolean r3 = r2.mo10033h()
            if (r3 == 0) goto L1d
            goto L36
        L1d:
            java.util.ArrayList<d.c.a.a.j.d.j> r2 = r7.f10023j
            int r2 = r2.size()
            r3 = 1
            if (r2 <= r3) goto L35
            java.util.ArrayList<d.c.a.a.j.d.j> r2 = r7.f10023j
            int r3 = r2.size()
            int r3 = r3 + (-2)
            java.lang.Object r2 = r2.get(r3)
            d.c.a.a.j.d.j r2 = (p139d.p225c.p226a.p227a.p250j.p255d.C2479j) r2
            goto L36
        L35:
            r2 = 0
        L36:
            if (r2 == 0) goto L3e
            long r2 = r2.f9517g
            long r0 = java.lang.Math.max(r0, r2)
        L3e:
            boolean r2 = r7.f10037x
            if (r2 == 0) goto L55
            d.c.a.a.j.D[] r2 = r7.f10029p
            int r3 = r2.length
            r4 = 0
        L46:
            if (r4 >= r3) goto L55
            r5 = r2[r4]
            long r5 = r5.m9947f()
            long r0 = java.lang.Math.max(r0, r5)
            int r4 = r4 + 1
            goto L46
        L55:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p139d.p225c.p226a.p227a.p250j.p255d.C2483n.mo9887g():long");
    }

    @Override // p139d.p225c.p226a.p227a.p269m.C2612z.e
    /* renamed from: h */
    public void mo10019h() {
        m10364q();
    }

    /* renamed from: i */
    public void m10381i() {
        this.f10020g.mo10177a();
        this.f10016c.m10323c();
    }

    /* renamed from: j */
    public void m10382j() {
        if (this.f10038y) {
            for (C2403D c2403d : this.f10029p) {
                c2403d.m9940b();
            }
        }
        this.f10020g.m10962a(this);
        this.f10027n.removeCallbacksAndMessages(null);
        this.f9998C = true;
        this.f10028o.clear();
    }
}
