package p139d.p225c.p226a.p227a.p250j;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import p139d.p225c.p226a.p227a.C2147L;
import p139d.p225c.p226a.p227a.C2676s;
import p139d.p225c.p226a.p227a.C2677t;
import p139d.p225c.p226a.p227a.p230c.C2196f;
import p139d.p225c.p226a.p227a.p250j.InterfaceC2514x;
import p139d.p225c.p226a.p227a.p250j.InterfaceC2516z;
import p139d.p225c.p226a.p227a.p268l.InterfaceC2577k;
import p139d.p225c.p226a.p227a.p269m.C2585D;
import p139d.p225c.p226a.p227a.p269m.C2600n;
import p139d.p225c.p226a.p227a.p269m.C2612z;
import p139d.p225c.p226a.p227a.p269m.InterfaceC2586E;
import p139d.p225c.p226a.p227a.p269m.InterfaceC2597k;
import p139d.p225c.p226a.p227a.p269m.InterfaceC2610x;
import p139d.p225c.p226a.p227a.p270n.C2622I;
import p139d.p225c.p226a.p227a.p270n.C2641r;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: d.c.a.a.j.I */
/* loaded from: classes.dex */
public final class C2408I implements InterfaceC2514x, C2612z.a<b> {

    /* renamed from: a */
    private final C2600n f9450a;

    /* renamed from: b */
    private final InterfaceC2597k.a f9451b;

    /* renamed from: c */
    private final InterfaceC2586E f9452c;

    /* renamed from: d */
    private final InterfaceC2610x f9453d;

    /* renamed from: e */
    private final InterfaceC2516z.a f9454e;

    /* renamed from: f */
    private final C2413N f9455f;

    /* renamed from: h */
    private final long f9457h;

    /* renamed from: j */
    final C2676s f9459j;

    /* renamed from: k */
    final boolean f9460k;

    /* renamed from: l */
    boolean f9461l;

    /* renamed from: m */
    boolean f9462m;

    /* renamed from: n */
    boolean f9463n;

    /* renamed from: o */
    byte[] f9464o;

    /* renamed from: p */
    int f9465p;

    /* renamed from: g */
    private final ArrayList<a> f9456g = new ArrayList<>();

    /* renamed from: i */
    final C2612z f9458i = new C2612z("Loader:SingleSampleMediaPeriod");

    /* renamed from: d.c.a.a.j.I$a */
    /* loaded from: classes.dex */
    private final class a implements InterfaceC2404E {

        /* renamed from: a */
        private int f9466a;

        /* renamed from: b */
        private boolean f9467b;

        private a() {
        }

        /* renamed from: d */
        private void m9969d() {
            if (this.f9467b) {
                return;
            }
            C2408I.this.f9454e.m10493a(C2641r.m11169d(C2408I.this.f9459j.f11182g), C2408I.this.f9459j, 0, (Object) null, 0L);
            this.f9467b = true;
        }

        @Override // p139d.p225c.p226a.p227a.p250j.InterfaceC2404E
        /* renamed from: a */
        public int mo9960a(C2677t c2677t, C2196f c2196f, boolean z) {
            m9969d();
            int i = this.f9466a;
            if (i == 2) {
                c2196f.m9007b(4);
                return -4;
            }
            if (z || i == 0) {
                c2677t.f11202a = C2408I.this.f9459j;
                this.f9466a = 1;
                return -5;
            }
            C2408I c2408i = C2408I.this;
            if (!c2408i.f9462m) {
                return -3;
            }
            if (c2408i.f9463n) {
                c2196f.f8041d = 0L;
                c2196f.m9007b(1);
                c2196f.m9028f(C2408I.this.f9465p);
                ByteBuffer byteBuffer = c2196f.f8040c;
                C2408I c2408i2 = C2408I.this;
                byteBuffer.put(c2408i2.f9464o, 0, c2408i2.f9465p);
            } else {
                c2196f.m9007b(4);
            }
            this.f9466a = 2;
            return -4;
        }

        @Override // p139d.p225c.p226a.p227a.p250j.InterfaceC2404E
        /* renamed from: a */
        public void mo9961a() {
            C2408I c2408i = C2408I.this;
            if (c2408i.f9460k) {
                return;
            }
            c2408i.f9458i.mo10177a();
        }

        /* renamed from: b */
        public void m9970b() {
            if (this.f9466a == 2) {
                this.f9466a = 1;
            }
        }

        @Override // p139d.p225c.p226a.p227a.p250j.InterfaceC2404E
        /* renamed from: c */
        public boolean mo9962c() {
            return C2408I.this.f9462m;
        }

        @Override // p139d.p225c.p226a.p227a.p250j.InterfaceC2404E
        /* renamed from: d */
        public int mo9963d(long j) {
            m9969d();
            if (j <= 0 || this.f9466a == 2) {
                return 0;
            }
            this.f9466a = 2;
            return 1;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d.c.a.a.j.I$b */
    /* loaded from: classes.dex */
    public static final class b implements C2612z.d {

        /* renamed from: a */
        public final C2600n f9469a;

        /* renamed from: b */
        private final C2585D f9470b;

        /* renamed from: c */
        private byte[] f9471c;

        public b(C2600n c2600n, InterfaceC2597k interfaceC2597k) {
            this.f9469a = c2600n;
            this.f9470b = new C2585D(interfaceC2597k);
        }

        /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
        @Override // p139d.p225c.p226a.p227a.p269m.C2612z.d
        /* renamed from: a */
        public void mo9973a() {
            byte[] copyOf;
            this.f9470b.m10904e();
            try {
                this.f9470b.mo9121a(this.f9469a);
                int i = 0;
                while (i != -1) {
                    int m10901b = (int) this.f9470b.m10901b();
                    if (this.f9471c == null) {
                        copyOf = new byte[1024];
                    } else if (m10901b == this.f9471c.length) {
                        copyOf = Arrays.copyOf(this.f9471c, this.f9471c.length * 2);
                    } else {
                        i = this.f9470b.read(this.f9471c, m10901b, this.f9471c.length - m10901b);
                    }
                    this.f9471c = copyOf;
                    i = this.f9470b.read(this.f9471c, m10901b, this.f9471c.length - m10901b);
                }
            } finally {
                C2622I.m11060a((InterfaceC2597k) this.f9470b);
            }
        }

        @Override // p139d.p225c.p226a.p227a.p269m.C2612z.d
        /* renamed from: b */
        public void mo9974b() {
        }
    }

    public C2408I(C2600n c2600n, InterfaceC2597k.a aVar, InterfaceC2586E interfaceC2586E, C2676s c2676s, long j, InterfaceC2610x interfaceC2610x, InterfaceC2516z.a aVar2, boolean z) {
        this.f9450a = c2600n;
        this.f9451b = aVar;
        this.f9452c = interfaceC2586E;
        this.f9459j = c2676s;
        this.f9457h = j;
        this.f9453d = interfaceC2610x;
        this.f9454e = aVar2;
        this.f9460k = z;
        this.f9455f = new C2413N(new C2411L(c2676s));
        aVar2.m10491a();
    }

    @Override // p139d.p225c.p226a.p227a.p250j.InterfaceC2514x
    /* renamed from: a */
    public long mo9874a(long j) {
        for (int i = 0; i < this.f9456g.size(); i++) {
            this.f9456g.get(i).m9970b();
        }
        return j;
    }

    @Override // p139d.p225c.p226a.p227a.p250j.InterfaceC2514x
    /* renamed from: a */
    public long mo9875a(long j, C2147L c2147l) {
        return j;
    }

    @Override // p139d.p225c.p226a.p227a.p250j.InterfaceC2514x
    /* renamed from: a */
    public long mo9876a(InterfaceC2577k[] interfaceC2577kArr, boolean[] zArr, InterfaceC2404E[] interfaceC2404EArr, boolean[] zArr2, long j) {
        for (int i = 0; i < interfaceC2577kArr.length; i++) {
            if (interfaceC2404EArr[i] != null && (interfaceC2577kArr[i] == null || !zArr[i])) {
                this.f9456g.remove(interfaceC2404EArr[i]);
                interfaceC2404EArr[i] = null;
            }
            if (interfaceC2404EArr[i] == null && interfaceC2577kArr[i] != null) {
                a aVar = new a();
                this.f9456g.add(aVar);
                interfaceC2404EArr[i] = aVar;
                zArr2[i] = true;
            }
        }
        return j;
    }

    @Override // p139d.p225c.p226a.p227a.p269m.C2612z.a
    /* renamed from: a, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public C2612z.b mo9965a(b bVar, long j, long j2, IOException iOException, int i) {
        C2612z.b m10955a;
        long mo10949a = this.f9453d.mo10949a(1, this.f9457h, iOException, i);
        boolean z = mo10949a == -9223372036854775807L || i >= this.f9453d.mo10948a(1);
        if (this.f9460k && z) {
            this.f9462m = true;
            m10955a = C2612z.f10849c;
        } else {
            m10955a = mo10949a != -9223372036854775807L ? C2612z.m10955a(false, mo10949a) : C2612z.f10850d;
        }
        this.f9454e.m10507a(bVar.f9469a, bVar.f9470b.m10902c(), bVar.f9470b.m10903d(), 1, -1, this.f9459j, 0, null, 0L, this.f9457h, j, j2, bVar.f9470b.m10901b(), iOException, !m10955a.m10968a());
        return m10955a;
    }

    /* renamed from: a */
    public void m9966a() {
        this.f9458i.m10965d();
        this.f9454e.m10510b();
    }

    @Override // p139d.p225c.p226a.p227a.p250j.InterfaceC2514x
    /* renamed from: a */
    public void mo9877a(long j, boolean z) {
    }

    @Override // p139d.p225c.p226a.p227a.p269m.C2612z.a
    /* renamed from: a, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public void mo9967a(b bVar, long j, long j2) {
        this.f9465p = (int) bVar.f9470b.m10901b();
        this.f9464o = bVar.f9471c;
        this.f9462m = true;
        this.f9463n = true;
        this.f9454e.m10515b(bVar.f9469a, bVar.f9470b.m10902c(), bVar.f9470b.m10903d(), 1, -1, this.f9459j, 0, null, 0L, this.f9457h, j, j2, this.f9465p);
    }

    @Override // p139d.p225c.p226a.p227a.p269m.C2612z.a
    /* renamed from: a, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public void mo9968a(b bVar, long j, long j2, boolean z) {
        this.f9454e.m10506a(bVar.f9469a, bVar.f9470b.m10902c(), bVar.f9470b.m10903d(), 1, -1, null, 0, null, 0L, this.f9457h, j, j2, bVar.f9470b.m10901b());
    }

    @Override // p139d.p225c.p226a.p227a.p250j.InterfaceC2514x
    /* renamed from: a */
    public void mo9879a(InterfaceC2514x.a aVar, long j) {
        aVar.mo10485a((InterfaceC2514x) this);
    }

    @Override // p139d.p225c.p226a.p227a.p250j.InterfaceC2514x, p139d.p225c.p226a.p227a.p250j.InterfaceC2405F
    /* renamed from: b */
    public long mo9880b() {
        return (this.f9462m || this.f9458i.m10964c()) ? Long.MIN_VALUE : 0L;
    }

    @Override // p139d.p225c.p226a.p227a.p250j.InterfaceC2514x, p139d.p225c.p226a.p227a.p250j.InterfaceC2405F
    /* renamed from: b */
    public boolean mo9882b(long j) {
        if (this.f9462m || this.f9458i.m10964c()) {
            return false;
        }
        InterfaceC2597k mo10923a = this.f9451b.mo10923a();
        InterfaceC2586E interfaceC2586E = this.f9452c;
        if (interfaceC2586E != null) {
            mo10923a.mo10300a(interfaceC2586E);
        }
        this.f9454e.m10504a(this.f9450a, 1, -1, this.f9459j, 0, (Object) null, 0L, this.f9457h, this.f9458i.m10960a(new b(this.f9450a, mo10923a), this, this.f9453d.mo10948a(1)));
        return true;
    }

    @Override // p139d.p225c.p226a.p227a.p250j.InterfaceC2514x, p139d.p225c.p226a.p227a.p250j.InterfaceC2405F
    /* renamed from: c */
    public void mo9883c(long j) {
    }

    @Override // p139d.p225c.p226a.p227a.p250j.InterfaceC2514x
    /* renamed from: d */
    public void mo9884d() {
    }

    @Override // p139d.p225c.p226a.p227a.p250j.InterfaceC2514x
    /* renamed from: e */
    public long mo9885e() {
        if (this.f9461l) {
            return -9223372036854775807L;
        }
        this.f9454e.m10517c();
        this.f9461l = true;
        return -9223372036854775807L;
    }

    @Override // p139d.p225c.p226a.p227a.p250j.InterfaceC2514x
    /* renamed from: f */
    public C2413N mo9886f() {
        return this.f9455f;
    }

    @Override // p139d.p225c.p226a.p227a.p250j.InterfaceC2514x, p139d.p225c.p226a.p227a.p250j.InterfaceC2405F
    /* renamed from: g */
    public long mo9887g() {
        return this.f9462m ? Long.MIN_VALUE : 0L;
    }
}
