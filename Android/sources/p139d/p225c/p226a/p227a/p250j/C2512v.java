package p139d.p225c.p226a.p227a.p250j;

import android.net.Uri;
import android.os.Handler;
import java.io.EOFException;
import java.io.IOException;
import java.util.Arrays;
import p139d.p225c.p226a.p227a.C2147L;
import p139d.p225c.p226a.p227a.C2676s;
import p139d.p225c.p226a.p227a.C2677t;
import p139d.p225c.p226a.p227a.p230c.C2196f;
import p139d.p225c.p226a.p227a.p234f.C2247d;
import p139d.p225c.p226a.p227a.p234f.C2334n;
import p139d.p225c.p226a.p227a.p234f.InterfaceC2287g;
import p139d.p225c.p226a.p227a.p234f.InterfaceC2289h;
import p139d.p225c.p226a.p227a.p234f.InterfaceC2325i;
import p139d.p225c.p226a.p227a.p234f.InterfaceC2335o;
import p139d.p225c.p226a.p227a.p234f.InterfaceC2337q;
import p139d.p225c.p226a.p227a.p250j.C2403D;
import p139d.p225c.p226a.p227a.p250j.InterfaceC2514x;
import p139d.p225c.p226a.p227a.p250j.InterfaceC2516z;
import p139d.p225c.p226a.p227a.p268l.InterfaceC2577k;
import p139d.p225c.p226a.p227a.p269m.C2585D;
import p139d.p225c.p226a.p227a.p269m.C2600n;
import p139d.p225c.p226a.p227a.p269m.C2612z;
import p139d.p225c.p226a.p227a.p269m.InterfaceC2590d;
import p139d.p225c.p226a.p227a.p269m.InterfaceC2597k;
import p139d.p225c.p226a.p227a.p269m.InterfaceC2610x;
import p139d.p225c.p226a.p227a.p270n.C2622I;
import p139d.p225c.p226a.p227a.p270n.C2628e;
import p139d.p225c.p226a.p227a.p270n.C2632i;
import p139d.p225c.p226a.p227a.p270n.C2641r;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: d.c.a.a.j.v */
/* loaded from: classes.dex */
public final class C2512v implements InterfaceC2514x, InterfaceC2325i, C2612z.a<a>, C2612z.e, C2403D.b {

    /* renamed from: A */
    private int f10204A;

    /* renamed from: D */
    private long f10207D;

    /* renamed from: F */
    private boolean f10209F;

    /* renamed from: G */
    private int f10210G;

    /* renamed from: H */
    private boolean f10211H;

    /* renamed from: I */
    private boolean f10212I;

    /* renamed from: a */
    private final Uri f10213a;

    /* renamed from: b */
    private final InterfaceC2597k f10214b;

    /* renamed from: c */
    private final InterfaceC2610x f10215c;

    /* renamed from: d */
    private final InterfaceC2516z.a f10216d;

    /* renamed from: e */
    private final c f10217e;

    /* renamed from: f */
    private final InterfaceC2590d f10218f;

    /* renamed from: g */
    private final String f10219g;

    /* renamed from: h */
    private final long f10220h;

    /* renamed from: j */
    private final b f10222j;

    /* renamed from: o */
    private InterfaceC2514x.a f10227o;

    /* renamed from: p */
    private InterfaceC2335o f10228p;

    /* renamed from: s */
    private boolean f10231s;

    /* renamed from: t */
    private boolean f10232t;

    /* renamed from: u */
    private d f10233u;

    /* renamed from: v */
    private boolean f10234v;

    /* renamed from: x */
    private boolean f10236x;

    /* renamed from: y */
    private boolean f10237y;

    /* renamed from: z */
    private boolean f10238z;

    /* renamed from: i */
    private final C2612z f10221i = new C2612z("Loader:ExtractorMediaPeriod");

    /* renamed from: k */
    private final C2632i f10223k = new C2632i();

    /* renamed from: l */
    private final Runnable f10224l = new Runnable() { // from class: d.c.a.a.j.c
        @Override // java.lang.Runnable
        public final void run() {
            C2512v.this.m10464o();
        }
    };

    /* renamed from: m */
    private final Runnable f10225m = new Runnable() { // from class: d.c.a.a.j.b
        @Override // java.lang.Runnable
        public final void run() {
            C2512v.this.m10470c();
        }
    };

    /* renamed from: n */
    private final Handler f10226n = new Handler();

    /* renamed from: r */
    private int[] f10230r = new int[0];

    /* renamed from: q */
    private C2403D[] f10229q = new C2403D[0];

    /* renamed from: E */
    private long f10208E = -9223372036854775807L;

    /* renamed from: C */
    private long f10206C = -1;

    /* renamed from: B */
    private long f10205B = -9223372036854775807L;

    /* renamed from: w */
    private int f10235w = 1;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d.c.a.a.j.v$a */
    /* loaded from: classes.dex */
    public final class a implements C2612z.d {

        /* renamed from: a */
        private final Uri f10239a;

        /* renamed from: b */
        private final C2585D f10240b;

        /* renamed from: c */
        private final b f10241c;

        /* renamed from: d */
        private final InterfaceC2325i f10242d;

        /* renamed from: e */
        private final C2632i f10243e;

        /* renamed from: g */
        private volatile boolean f10245g;

        /* renamed from: i */
        private long f10247i;

        /* renamed from: j */
        private C2600n f10248j;

        /* renamed from: f */
        private final C2334n f10244f = new C2334n();

        /* renamed from: h */
        private boolean f10246h = true;

        /* renamed from: k */
        private long f10249k = -1;

        public a(Uri uri, InterfaceC2597k interfaceC2597k, b bVar, InterfaceC2325i interfaceC2325i, C2632i c2632i) {
            this.f10239a = uri;
            this.f10240b = new C2585D(interfaceC2597k);
            this.f10241c = bVar;
            this.f10242d = interfaceC2325i;
            this.f10243e = c2632i;
            this.f10248j = new C2600n(uri, this.f10244f.f9165a, -1L, C2512v.this.f10219g);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: a */
        public void m10474a(long j, long j2) {
            this.f10244f.f9165a = j;
            this.f10247i = j2;
            this.f10246h = true;
        }

        @Override // p139d.p225c.p226a.p227a.p269m.C2612z.d
        /* renamed from: a */
        public void mo9973a() {
            int i = 0;
            while (i == 0 && !this.f10245g) {
                C2247d c2247d = null;
                try {
                    long j = this.f10244f.f9165a;
                    this.f10248j = new C2600n(this.f10239a, j, -1L, C2512v.this.f10219g);
                    this.f10249k = this.f10240b.mo9121a(this.f10248j);
                    if (this.f10249k != -1) {
                        this.f10249k += j;
                    }
                    Uri uri = this.f10240b.getUri();
                    C2628e.m11110a(uri);
                    Uri uri2 = uri;
                    C2247d c2247d2 = new C2247d(this.f10240b, j, this.f10249k);
                    try {
                        InterfaceC2287g m10479a = this.f10241c.m10479a(c2247d2, this.f10242d, uri2);
                        if (this.f10246h) {
                            m10479a.mo9159a(j, this.f10247i);
                            this.f10246h = false;
                        }
                        while (i == 0 && !this.f10245g) {
                            this.f10243e.m11132a();
                            i = m10479a.mo9157a(c2247d2, this.f10244f);
                            if (c2247d2.getPosition() > C2512v.this.f10220h + j) {
                                j = c2247d2.getPosition();
                                this.f10243e.m11133b();
                                C2512v.this.f10226n.post(C2512v.this.f10225m);
                            }
                        }
                        if (i == 1) {
                            i = 0;
                        } else {
                            this.f10244f.f9165a = c2247d2.getPosition();
                        }
                        C2622I.m11060a((InterfaceC2597k) this.f10240b);
                    } catch (Throwable th) {
                        th = th;
                        c2247d = c2247d2;
                        if (i != 1 && c2247d != null) {
                            this.f10244f.f9165a = c2247d.getPosition();
                        }
                        C2622I.m11060a((InterfaceC2597k) this.f10240b);
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                }
            }
        }

        @Override // p139d.p225c.p226a.p227a.p269m.C2612z.d
        /* renamed from: b */
        public void mo9974b() {
            this.f10245g = true;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: d.c.a.a.j.v$b */
    /* loaded from: classes.dex */
    public static final class b {

        /* renamed from: a */
        private final InterfaceC2287g[] f10251a;

        /* renamed from: b */
        private InterfaceC2287g f10252b;

        public b(InterfaceC2287g[] interfaceC2287gArr) {
            this.f10251a = interfaceC2287gArr;
        }

        /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
        /* renamed from: a */
        public InterfaceC2287g m10479a(InterfaceC2289h interfaceC2289h, InterfaceC2325i interfaceC2325i, Uri uri) {
            InterfaceC2287g interfaceC2287g = this.f10252b;
            if (interfaceC2287g != null) {
                return interfaceC2287g;
            }
            InterfaceC2287g[] interfaceC2287gArr = this.f10251a;
            int length = interfaceC2287gArr.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    break;
                }
                InterfaceC2287g interfaceC2287g2 = interfaceC2287gArr[i];
                try {
                } catch (EOFException unused) {
                } catch (Throwable th) {
                    interfaceC2289h.mo9280b();
                    throw th;
                }
                if (interfaceC2287g2.mo9161a(interfaceC2289h)) {
                    this.f10252b = interfaceC2287g2;
                    interfaceC2289h.mo9280b();
                    break;
                }
                continue;
                interfaceC2289h.mo9280b();
                i++;
            }
            InterfaceC2287g interfaceC2287g3 = this.f10252b;
            if (interfaceC2287g3 != null) {
                interfaceC2287g3.mo9160a(interfaceC2325i);
                return this.f10252b;
            }
            throw new C2414O("None of the available extractors (" + C2622I.m11082b(this.f10251a) + ") could read the stream.", uri);
        }

        /* renamed from: a */
        public void m10480a() {
            InterfaceC2287g interfaceC2287g = this.f10252b;
            if (interfaceC2287g != null) {
                interfaceC2287g.mo9158a();
                this.f10252b = null;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d.c.a.a.j.v$c */
    /* loaded from: classes.dex */
    public interface c {
        /* renamed from: a */
        void mo10481a(long j, boolean z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: d.c.a.a.j.v$d */
    /* loaded from: classes.dex */
    public static final class d {

        /* renamed from: a */
        public final InterfaceC2335o f10253a;

        /* renamed from: b */
        public final C2413N f10254b;

        /* renamed from: c */
        public final boolean[] f10255c;

        /* renamed from: d */
        public final boolean[] f10256d;

        /* renamed from: e */
        public final boolean[] f10257e;

        public d(InterfaceC2335o interfaceC2335o, C2413N c2413n, boolean[] zArr) {
            this.f10253a = interfaceC2335o;
            this.f10254b = c2413n;
            this.f10255c = zArr;
            int i = c2413n.f9485b;
            this.f10256d = new boolean[i];
            this.f10257e = new boolean[i];
        }
    }

    /* renamed from: d.c.a.a.j.v$e */
    /* loaded from: classes.dex */
    private final class e implements InterfaceC2404E {

        /* renamed from: a */
        private final int f10258a;

        public e(int i) {
            this.f10258a = i;
        }

        @Override // p139d.p225c.p226a.p227a.p250j.InterfaceC2404E
        /* renamed from: a */
        public int mo9960a(C2677t c2677t, C2196f c2196f, boolean z) {
            return C2512v.this.m10468a(this.f10258a, c2677t, c2196f, z);
        }

        @Override // p139d.p225c.p226a.p227a.p250j.InterfaceC2404E
        /* renamed from: a */
        public void mo9961a() {
            C2512v.this.m10471i();
        }

        @Override // p139d.p225c.p226a.p227a.p250j.InterfaceC2404E
        /* renamed from: c */
        public boolean mo9962c() {
            return C2512v.this.m10469a(this.f10258a);
        }

        @Override // p139d.p225c.p226a.p227a.p250j.InterfaceC2404E
        /* renamed from: d */
        public int mo9963d(long j) {
            return C2512v.this.m10467a(this.f10258a, j);
        }
    }

    public C2512v(Uri uri, InterfaceC2597k interfaceC2597k, InterfaceC2287g[] interfaceC2287gArr, InterfaceC2610x interfaceC2610x, InterfaceC2516z.a aVar, c cVar, InterfaceC2590d interfaceC2590d, String str, int i) {
        this.f10213a = uri;
        this.f10214b = interfaceC2597k;
        this.f10215c = interfaceC2610x;
        this.f10216d = aVar;
        this.f10217e = cVar;
        this.f10218f = interfaceC2590d;
        this.f10219g = str;
        this.f10220h = i;
        this.f10222j = new b(interfaceC2287gArr);
        aVar.m10491a();
    }

    /* renamed from: a */
    private void m10451a(a aVar) {
        if (this.f10206C == -1) {
            this.f10206C = aVar.f10249k;
        }
    }

    /* renamed from: a */
    private boolean m10452a(a aVar, int i) {
        InterfaceC2335o interfaceC2335o;
        if (this.f10206C != -1 || ((interfaceC2335o = this.f10228p) != null && interfaceC2335o.mo9141d() != -9223372036854775807L)) {
            this.f10210G = i;
            return true;
        }
        if (this.f10232t && !m10466q()) {
            this.f10209F = true;
            return false;
        }
        this.f10237y = this.f10232t;
        this.f10207D = 0L;
        this.f10210G = 0;
        for (C2403D c2403d : this.f10229q) {
            c2403d.m9953l();
        }
        aVar.m10474a(0L, 0L);
        return true;
    }

    /* renamed from: a */
    private boolean m10453a(boolean[] zArr, long j) {
        int i;
        int length = this.f10229q.length;
        while (true) {
            if (i >= length) {
                return true;
            }
            C2403D c2403d = this.f10229q[i];
            c2403d.m9954m();
            i = ((c2403d.m9934a(j, true, false) != -1) || (!zArr[i] && this.f10234v)) ? i + 1 : 0;
        }
        return false;
    }

    /* renamed from: b */
    private void m10455b(int i) {
        d m10462m = m10462m();
        boolean[] zArr = m10462m.f10257e;
        if (zArr[i]) {
            return;
        }
        C2676s m9976a = m10462m.f10254b.m9978a(i).m9976a(0);
        this.f10216d.m10493a(C2641r.m11169d(m9976a.f11182g), m9976a, 0, (Object) null, this.f10207D);
        zArr[i] = true;
    }

    /* renamed from: c */
    private void m10457c(int i) {
        boolean[] zArr = m10462m().f10255c;
        if (this.f10209F && zArr[i] && !this.f10229q[i].m9951j()) {
            this.f10208E = 0L;
            this.f10209F = false;
            this.f10237y = true;
            this.f10207D = 0L;
            this.f10210G = 0;
            for (C2403D c2403d : this.f10229q) {
                c2403d.m9953l();
            }
            InterfaceC2514x.a aVar = this.f10227o;
            C2628e.m11110a(aVar);
            aVar.mo9878a((InterfaceC2514x.a) this);
        }
    }

    /* renamed from: k */
    private int m10460k() {
        int i = 0;
        for (C2403D c2403d : this.f10229q) {
            i += c2403d.m9950i();
        }
        return i;
    }

    /* renamed from: l */
    private long m10461l() {
        long j = Long.MIN_VALUE;
        for (C2403D c2403d : this.f10229q) {
            j = Math.max(j, c2403d.m9947f());
        }
        return j;
    }

    /* renamed from: m */
    private d m10462m() {
        d dVar = this.f10233u;
        C2628e.m11110a(dVar);
        return dVar;
    }

    /* renamed from: n */
    private boolean m10463n() {
        return this.f10208E != -9223372036854775807L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: o */
    public void m10464o() {
        InterfaceC2335o interfaceC2335o = this.f10228p;
        if (this.f10212I || this.f10232t || !this.f10231s || interfaceC2335o == null) {
            return;
        }
        for (C2403D c2403d : this.f10229q) {
            if (c2403d.m9949h() == null) {
                return;
            }
        }
        this.f10223k.m11133b();
        int length = this.f10229q.length;
        C2411L[] c2411lArr = new C2411L[length];
        boolean[] zArr = new boolean[length];
        this.f10205B = interfaceC2335o.mo9141d();
        int i = 0;
        while (true) {
            boolean z = true;
            if (i >= length) {
                break;
            }
            C2676s m9949h = this.f10229q[i].m9949h();
            c2411lArr[i] = new C2411L(m9949h);
            String str = m9949h.f11182g;
            if (!C2641r.m11174i(str) && !C2641r.m11172g(str)) {
                z = false;
            }
            zArr[i] = z;
            this.f10234v = z | this.f10234v;
            i++;
        }
        this.f10235w = (this.f10206C == -1 && interfaceC2335o.mo9141d() == -9223372036854775807L) ? 7 : 1;
        this.f10233u = new d(interfaceC2335o, new C2413N(c2411lArr), zArr);
        this.f10232t = true;
        this.f10217e.mo10481a(this.f10205B, interfaceC2335o.mo9140c());
        InterfaceC2514x.a aVar = this.f10227o;
        C2628e.m11110a(aVar);
        aVar.mo10485a((InterfaceC2514x) this);
    }

    /* renamed from: p */
    private void m10465p() {
        a aVar = new a(this.f10213a, this.f10214b, this.f10222j, this, this.f10223k);
        if (this.f10232t) {
            InterfaceC2335o interfaceC2335o = m10462m().f10253a;
            C2628e.m11113b(m10463n());
            long j = this.f10205B;
            if (j != -9223372036854775807L && this.f10208E >= j) {
                this.f10211H = true;
                this.f10208E = -9223372036854775807L;
                return;
            } else {
                aVar.m10474a(interfaceC2335o.mo9138b(this.f10208E).f9166a.f9172c, this.f10208E);
                this.f10208E = -9223372036854775807L;
            }
        }
        this.f10210G = m10460k();
        this.f10216d.m10504a(aVar.f10248j, 1, -1, (C2676s) null, 0, (Object) null, aVar.f10247i, this.f10205B, this.f10221i.m10960a(aVar, this, this.f10215c.mo10948a(this.f10235w)));
    }

    /* renamed from: q */
    private boolean m10466q() {
        return this.f10237y || m10463n();
    }

    /* renamed from: a */
    int m10467a(int i, long j) {
        int i2 = 0;
        if (m10466q()) {
            return 0;
        }
        m10455b(i);
        C2403D c2403d = this.f10229q[i];
        if (!this.f10211H || j <= c2403d.m9947f()) {
            int m9934a = c2403d.m9934a(j, true, true);
            if (m9934a != -1) {
                i2 = m9934a;
            }
        } else {
            i2 = c2403d.m9933a();
        }
        if (i2 == 0) {
            m10457c(i);
        }
        return i2;
    }

    /* renamed from: a */
    int m10468a(int i, C2677t c2677t, C2196f c2196f, boolean z) {
        if (m10466q()) {
            return -3;
        }
        m10455b(i);
        int m9935a = this.f10229q[i].m9935a(c2677t, c2196f, z, this.f10211H, this.f10207D);
        if (m9935a == -3) {
            m10457c(i);
        }
        return m9935a;
    }

    @Override // p139d.p225c.p226a.p227a.p250j.InterfaceC2514x
    /* renamed from: a */
    public long mo9874a(long j) {
        d m10462m = m10462m();
        InterfaceC2335o interfaceC2335o = m10462m.f10253a;
        boolean[] zArr = m10462m.f10255c;
        if (!interfaceC2335o.mo9140c()) {
            j = 0;
        }
        this.f10237y = false;
        this.f10207D = j;
        if (m10463n()) {
            this.f10208E = j;
            return j;
        }
        if (this.f10235w != 7 && m10453a(zArr, j)) {
            return j;
        }
        this.f10209F = false;
        this.f10208E = j;
        this.f10211H = false;
        if (this.f10221i.m10964c()) {
            this.f10221i.m10963b();
        } else {
            for (C2403D c2403d : this.f10229q) {
                c2403d.m9953l();
            }
        }
        return j;
    }

    @Override // p139d.p225c.p226a.p227a.p250j.InterfaceC2514x
    /* renamed from: a */
    public long mo9875a(long j, C2147L c2147l) {
        InterfaceC2335o interfaceC2335o = m10462m().f10253a;
        if (!interfaceC2335o.mo9140c()) {
            return 0L;
        }
        InterfaceC2335o.a mo9138b = interfaceC2335o.mo9138b(j);
        return C2622I.m11046a(j, c2147l, mo9138b.f9166a.f9171b, mo9138b.f9167b.f9171b);
    }

    @Override // p139d.p225c.p226a.p227a.p250j.InterfaceC2514x
    /* renamed from: a */
    public long mo9876a(InterfaceC2577k[] interfaceC2577kArr, boolean[] zArr, InterfaceC2404E[] interfaceC2404EArr, boolean[] zArr2, long j) {
        d m10462m = m10462m();
        C2413N c2413n = m10462m.f10254b;
        boolean[] zArr3 = m10462m.f10256d;
        int i = this.f10204A;
        int i2 = 0;
        for (int i3 = 0; i3 < interfaceC2577kArr.length; i3++) {
            if (interfaceC2404EArr[i3] != null && (interfaceC2577kArr[i3] == null || !zArr[i3])) {
                int i4 = ((e) interfaceC2404EArr[i3]).f10258a;
                C2628e.m11113b(zArr3[i4]);
                this.f10204A--;
                zArr3[i4] = false;
                interfaceC2404EArr[i3] = null;
            }
        }
        boolean z = !this.f10236x ? j == 0 : i != 0;
        for (int i5 = 0; i5 < interfaceC2577kArr.length; i5++) {
            if (interfaceC2404EArr[i5] == null && interfaceC2577kArr[i5] != null) {
                InterfaceC2577k interfaceC2577k = interfaceC2577kArr[i5];
                C2628e.m11113b(interfaceC2577k.length() == 1);
                C2628e.m11113b(interfaceC2577k.mo10819b(0) == 0);
                int m9977a = c2413n.m9977a(interfaceC2577k.mo10815a());
                C2628e.m11113b(!zArr3[m9977a]);
                this.f10204A++;
                zArr3[m9977a] = true;
                interfaceC2404EArr[i5] = new e(m9977a);
                zArr2[i5] = true;
                if (!z) {
                    C2403D c2403d = this.f10229q[m9977a];
                    c2403d.m9954m();
                    z = c2403d.m9934a(j, true, true) == -1 && c2403d.m9948g() != 0;
                }
            }
        }
        if (this.f10204A == 0) {
            this.f10209F = false;
            this.f10237y = false;
            if (this.f10221i.m10964c()) {
                C2403D[] c2403dArr = this.f10229q;
                int length = c2403dArr.length;
                while (i2 < length) {
                    c2403dArr[i2].m9940b();
                    i2++;
                }
                this.f10221i.m10963b();
            } else {
                C2403D[] c2403dArr2 = this.f10229q;
                int length2 = c2403dArr2.length;
                while (i2 < length2) {
                    c2403dArr2[i2].m9953l();
                    i2++;
                }
            }
        } else if (z) {
            j = mo9874a(j);
            while (i2 < interfaceC2404EArr.length) {
                if (interfaceC2404EArr[i2] != null) {
                    zArr2[i2] = true;
                }
                i2++;
            }
        }
        this.f10236x = true;
        return j;
    }

    @Override // p139d.p225c.p226a.p227a.p234f.InterfaceC2325i
    /* renamed from: a */
    public InterfaceC2337q mo9671a(int i, int i2) {
        int length = this.f10229q.length;
        for (int i3 = 0; i3 < length; i3++) {
            if (this.f10230r[i3] == i) {
                return this.f10229q[i3];
            }
        }
        C2403D c2403d = new C2403D(this.f10218f);
        c2403d.m9938a(this);
        int i4 = length + 1;
        this.f10230r = Arrays.copyOf(this.f10230r, i4);
        this.f10230r[length] = i;
        C2403D[] c2403dArr = (C2403D[]) Arrays.copyOf(this.f10229q, i4);
        c2403dArr[length] = c2403d;
        C2622I.m11071a((Object[]) c2403dArr);
        this.f10229q = c2403dArr;
        return c2403d;
    }

    @Override // p139d.p225c.p226a.p227a.p269m.C2612z.a
    /* renamed from: a, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public C2612z.b mo9965a(a aVar, long j, long j2, IOException iOException, int i) {
        a aVar2;
        boolean z;
        C2612z.b m10955a;
        m10451a(aVar);
        long mo10949a = this.f10215c.mo10949a(this.f10235w, this.f10205B, iOException, i);
        if (mo10949a == -9223372036854775807L) {
            m10955a = C2612z.f10850d;
        } else {
            int m10460k = m10460k();
            if (m10460k > this.f10210G) {
                aVar2 = aVar;
                z = true;
            } else {
                aVar2 = aVar;
                z = false;
            }
            m10955a = m10452a(aVar2, m10460k) ? C2612z.m10955a(z, mo10949a) : C2612z.f10849c;
        }
        this.f10216d.m10507a(aVar.f10248j, aVar.f10240b.m10902c(), aVar.f10240b.m10903d(), 1, -1, null, 0, null, aVar.f10247i, this.f10205B, j, j2, aVar.f10240b.m10901b(), iOException, !m10955a.m10968a());
        return m10955a;
    }

    @Override // p139d.p225c.p226a.p227a.p234f.InterfaceC2325i
    /* renamed from: a */
    public void mo9672a() {
        this.f10231s = true;
        this.f10226n.post(this.f10224l);
    }

    @Override // p139d.p225c.p226a.p227a.p250j.InterfaceC2514x
    /* renamed from: a */
    public void mo9877a(long j, boolean z) {
        if (m10463n()) {
            return;
        }
        boolean[] zArr = m10462m().f10256d;
        int length = this.f10229q.length;
        for (int i = 0; i < length; i++) {
            this.f10229q[i].m9941b(j, z, zArr[i]);
        }
    }

    @Override // p139d.p225c.p226a.p227a.p234f.InterfaceC2325i
    /* renamed from: a */
    public void mo9673a(InterfaceC2335o interfaceC2335o) {
        this.f10228p = interfaceC2335o;
        this.f10226n.post(this.f10224l);
    }

    @Override // p139d.p225c.p226a.p227a.p269m.C2612z.a
    /* renamed from: a, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public void mo9967a(a aVar, long j, long j2) {
        if (this.f10205B == -9223372036854775807L) {
            InterfaceC2335o interfaceC2335o = this.f10228p;
            C2628e.m11110a(interfaceC2335o);
            InterfaceC2335o interfaceC2335o2 = interfaceC2335o;
            long m10461l = m10461l();
            this.f10205B = m10461l == Long.MIN_VALUE ? 0L : m10461l + 10000;
            this.f10217e.mo10481a(this.f10205B, interfaceC2335o2.mo9140c());
        }
        this.f10216d.m10515b(aVar.f10248j, aVar.f10240b.m10902c(), aVar.f10240b.m10903d(), 1, -1, null, 0, null, aVar.f10247i, this.f10205B, j, j2, aVar.f10240b.m10901b());
        m10451a(aVar);
        this.f10211H = true;
        InterfaceC2514x.a aVar2 = this.f10227o;
        C2628e.m11110a(aVar2);
        aVar2.mo9878a((InterfaceC2514x.a) this);
    }

    @Override // p139d.p225c.p226a.p227a.p269m.C2612z.a
    /* renamed from: a, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public void mo9968a(a aVar, long j, long j2, boolean z) {
        this.f10216d.m10506a(aVar.f10248j, aVar.f10240b.m10902c(), aVar.f10240b.m10903d(), 1, -1, null, 0, null, aVar.f10247i, this.f10205B, j, j2, aVar.f10240b.m10901b());
        if (z) {
            return;
        }
        m10451a(aVar);
        for (C2403D c2403d : this.f10229q) {
            c2403d.m9953l();
        }
        if (this.f10204A > 0) {
            InterfaceC2514x.a aVar2 = this.f10227o;
            C2628e.m11110a(aVar2);
            aVar2.mo9878a((InterfaceC2514x.a) this);
        }
    }

    @Override // p139d.p225c.p226a.p227a.p250j.InterfaceC2514x
    /* renamed from: a */
    public void mo9879a(InterfaceC2514x.a aVar, long j) {
        this.f10227o = aVar;
        this.f10223k.m11134c();
        m10465p();
    }

    @Override // p139d.p225c.p226a.p227a.p250j.C2403D.b
    /* renamed from: a */
    public void mo9959a(C2676s c2676s) {
        this.f10226n.post(this.f10224l);
    }

    /* renamed from: a */
    boolean m10469a(int i) {
        return !m10466q() && (this.f10211H || this.f10229q[i].m9951j());
    }

    @Override // p139d.p225c.p226a.p227a.p250j.InterfaceC2514x, p139d.p225c.p226a.p227a.p250j.InterfaceC2405F
    /* renamed from: b */
    public long mo9880b() {
        if (this.f10204A == 0) {
            return Long.MIN_VALUE;
        }
        return mo9887g();
    }

    @Override // p139d.p225c.p226a.p227a.p250j.InterfaceC2514x, p139d.p225c.p226a.p227a.p250j.InterfaceC2405F
    /* renamed from: b */
    public boolean mo9882b(long j) {
        if (this.f10211H || this.f10209F) {
            return false;
        }
        if (this.f10232t && this.f10204A == 0) {
            return false;
        }
        boolean m11134c = this.f10223k.m11134c();
        if (this.f10221i.m10964c()) {
            return m11134c;
        }
        m10465p();
        return true;
    }

    /* renamed from: c */
    public /* synthetic */ void m10470c() {
        if (this.f10212I) {
            return;
        }
        InterfaceC2514x.a aVar = this.f10227o;
        C2628e.m11110a(aVar);
        aVar.mo9878a((InterfaceC2514x.a) this);
    }

    @Override // p139d.p225c.p226a.p227a.p250j.InterfaceC2514x, p139d.p225c.p226a.p227a.p250j.InterfaceC2405F
    /* renamed from: c */
    public void mo9883c(long j) {
    }

    @Override // p139d.p225c.p226a.p227a.p250j.InterfaceC2514x
    /* renamed from: d */
    public void mo9884d() {
        m10471i();
    }

    @Override // p139d.p225c.p226a.p227a.p250j.InterfaceC2514x
    /* renamed from: e */
    public long mo9885e() {
        if (!this.f10238z) {
            this.f10216d.m10517c();
            this.f10238z = true;
        }
        if (!this.f10237y) {
            return -9223372036854775807L;
        }
        if (!this.f10211H && m10460k() <= this.f10210G) {
            return -9223372036854775807L;
        }
        this.f10237y = false;
        return this.f10207D;
    }

    @Override // p139d.p225c.p226a.p227a.p250j.InterfaceC2514x
    /* renamed from: f */
    public C2413N mo9886f() {
        return m10462m().f10254b;
    }

    @Override // p139d.p225c.p226a.p227a.p250j.InterfaceC2514x, p139d.p225c.p226a.p227a.p250j.InterfaceC2405F
    /* renamed from: g */
    public long mo9887g() {
        long m10461l;
        boolean[] zArr = m10462m().f10255c;
        if (this.f10211H) {
            return Long.MIN_VALUE;
        }
        if (m10463n()) {
            return this.f10208E;
        }
        if (this.f10234v) {
            m10461l = Long.MAX_VALUE;
            int length = this.f10229q.length;
            for (int i = 0; i < length; i++) {
                if (zArr[i]) {
                    m10461l = Math.min(m10461l, this.f10229q[i].m9947f());
                }
            }
        } else {
            m10461l = m10461l();
        }
        return m10461l == Long.MIN_VALUE ? this.f10207D : m10461l;
    }

    @Override // p139d.p225c.p226a.p227a.p269m.C2612z.e
    /* renamed from: h */
    public void mo10019h() {
        for (C2403D c2403d : this.f10229q) {
            c2403d.m9953l();
        }
        this.f10222j.m10480a();
    }

    /* renamed from: i */
    void m10471i() {
        this.f10221i.m10961a(this.f10215c.mo10948a(this.f10235w));
    }

    /* renamed from: j */
    public void m10472j() {
        if (this.f10232t) {
            for (C2403D c2403d : this.f10229q) {
                c2403d.m9940b();
            }
        }
        this.f10221i.m10962a(this);
        this.f10226n.removeCallbacksAndMessages(null);
        this.f10227o = null;
        this.f10212I = true;
        this.f10216d.m10510b();
    }
}
