package p139d.p225c.p226a.p227a.p234f.p242h;

import android.util.SparseArray;
import p139d.p225c.p226a.p227a.p234f.InterfaceC2287g;
import p139d.p225c.p226a.p227a.p234f.InterfaceC2289h;
import p139d.p225c.p226a.p227a.p234f.InterfaceC2325i;
import p139d.p225c.p226a.p227a.p234f.InterfaceC2330j;
import p139d.p225c.p226a.p227a.p234f.InterfaceC2335o;
import p139d.p225c.p226a.p227a.p270n.C2619F;
import p139d.p225c.p226a.p227a.p270n.C2643t;
import p139d.p225c.p226a.p227a.p270n.C2644u;

/* renamed from: d.c.a.a.f.h.y */
/* loaded from: classes.dex */
public final class C2323y implements InterfaceC2287g {

    /* renamed from: a */
    public static final InterfaceC2330j f9110a = new InterfaceC2330j() { // from class: d.c.a.a.f.h.c
        @Override // p139d.p225c.p226a.p227a.p234f.InterfaceC2330j
        /* renamed from: a */
        public final InterfaceC2287g[] mo9142a() {
            return C2323y.m9666b();
        }
    };

    /* renamed from: b */
    private final C2619F f9111b;

    /* renamed from: c */
    private final SparseArray<a> f9112c;

    /* renamed from: d */
    private final C2644u f9113d;

    /* renamed from: e */
    private final C2322x f9114e;

    /* renamed from: f */
    private boolean f9115f;

    /* renamed from: g */
    private boolean f9116g;

    /* renamed from: h */
    private boolean f9117h;

    /* renamed from: i */
    private long f9118i;

    /* renamed from: j */
    private C2321w f9119j;

    /* renamed from: k */
    private InterfaceC2325i f9120k;

    /* renamed from: l */
    private boolean f9121l;

    /* renamed from: d.c.a.a.f.h.y$a */
    /* loaded from: classes.dex */
    private static final class a {

        /* renamed from: a */
        private final InterfaceC2310l f9122a;

        /* renamed from: b */
        private final C2619F f9123b;

        /* renamed from: c */
        private final C2643t f9124c = new C2643t(new byte[64]);

        /* renamed from: d */
        private boolean f9125d;

        /* renamed from: e */
        private boolean f9126e;

        /* renamed from: f */
        private boolean f9127f;

        /* renamed from: g */
        private int f9128g;

        /* renamed from: h */
        private long f9129h;

        public a(InterfaceC2310l interfaceC2310l, C2619F c2619f) {
            this.f9122a = interfaceC2310l;
            this.f9123b = c2619f;
        }

        /* renamed from: b */
        private void m9667b() {
            this.f9124c.m11201c(8);
            this.f9125d = this.f9124c.m11204e();
            this.f9126e = this.f9124c.m11204e();
            this.f9124c.m11201c(6);
            this.f9128g = this.f9124c.m11191a(8);
        }

        /* renamed from: c */
        private void m9668c() {
            this.f9129h = 0L;
            if (this.f9125d) {
                this.f9124c.m11201c(4);
                this.f9124c.m11201c(1);
                this.f9124c.m11201c(1);
                long m11191a = (this.f9124c.m11191a(3) << 30) | (this.f9124c.m11191a(15) << 15) | this.f9124c.m11191a(15);
                this.f9124c.m11201c(1);
                if (!this.f9127f && this.f9126e) {
                    this.f9124c.m11201c(4);
                    this.f9124c.m11201c(1);
                    this.f9124c.m11201c(1);
                    this.f9124c.m11201c(1);
                    this.f9123b.m11022b((this.f9124c.m11191a(3) << 30) | (this.f9124c.m11191a(15) << 15) | this.f9124c.m11191a(15));
                    this.f9127f = true;
                }
                this.f9129h = this.f9123b.m11022b(m11191a);
            }
        }

        /* renamed from: a */
        public void m9669a() {
            this.f9127f = false;
            this.f9122a.mo9560a();
        }

        /* renamed from: a */
        public void m9670a(C2644u c2644u) {
            c2644u.m11214a(this.f9124c.f11000a, 0, 3);
            this.f9124c.m11198b(0);
            m9667b();
            c2644u.m11214a(this.f9124c.f11000a, 0, this.f9128g);
            this.f9124c.m11198b(0);
            m9668c();
            this.f9122a.mo9561a(this.f9129h, 4);
            this.f9122a.mo9563a(c2644u);
            this.f9122a.mo9564b();
        }
    }

    public C2323y() {
        this(new C2619F(0L));
    }

    public C2323y(C2619F c2619f) {
        this.f9111b = c2619f;
        this.f9113d = new C2644u(4096);
        this.f9112c = new SparseArray<>();
        this.f9114e = new C2322x();
    }

    /* renamed from: a */
    private void m9665a(long j) {
        InterfaceC2325i interfaceC2325i;
        InterfaceC2335o bVar;
        if (this.f9121l) {
            return;
        }
        this.f9121l = true;
        if (this.f9114e.m9662a() != -9223372036854775807L) {
            this.f9119j = new C2321w(this.f9114e.m9663b(), this.f9114e.m9662a(), j);
            interfaceC2325i = this.f9120k;
            bVar = this.f9119j.m9127a();
        } else {
            interfaceC2325i = this.f9120k;
            bVar = new InterfaceC2335o.b(this.f9114e.m9662a());
        }
        interfaceC2325i.mo9673a(bVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public static /* synthetic */ InterfaceC2287g[] m9666b() {
        return new InterfaceC2287g[]{new C2323y()};
    }

    /* JADX WARN: Removed duplicated region for block: B:51:0x00ef  */
    @Override // p139d.p225c.p226a.p227a.p234f.InterfaceC2287g
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public int mo9157a(p139d.p225c.p226a.p227a.p234f.InterfaceC2289h r11, p139d.p225c.p226a.p227a.p234f.C2334n r12) {
        /*
            Method dump skipped, instructions count: 352
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p139d.p225c.p226a.p227a.p234f.p242h.C2323y.mo9157a(d.c.a.a.f.h, d.c.a.a.f.n):int");
    }

    @Override // p139d.p225c.p226a.p227a.p234f.InterfaceC2287g
    /* renamed from: a */
    public void mo9158a() {
    }

    @Override // p139d.p225c.p226a.p227a.p234f.InterfaceC2287g
    /* renamed from: a */
    public void mo9159a(long j, long j2) {
        if ((this.f9111b.m11023c() == -9223372036854775807L) || (this.f9111b.m11019a() != 0 && this.f9111b.m11019a() != j2)) {
            this.f9111b.m11024d();
            this.f9111b.m11025d(j2);
        }
        C2321w c2321w = this.f9119j;
        if (c2321w != null) {
            c2321w.m9130b(j2);
        }
        for (int i = 0; i < this.f9112c.size(); i++) {
            this.f9112c.valueAt(i).m9669a();
        }
    }

    @Override // p139d.p225c.p226a.p227a.p234f.InterfaceC2287g
    /* renamed from: a */
    public void mo9160a(InterfaceC2325i interfaceC2325i) {
        this.f9120k = interfaceC2325i;
    }

    @Override // p139d.p225c.p226a.p227a.p234f.InterfaceC2287g
    /* renamed from: a */
    public boolean mo9161a(InterfaceC2289h interfaceC2289h) {
        byte[] bArr = new byte[14];
        interfaceC2289h.mo9276a(bArr, 0, 14);
        if (442 != (((bArr[0] & 255) << 24) | ((bArr[1] & 255) << 16) | ((bArr[2] & 255) << 8) | (bArr[3] & 255)) || (bArr[4] & 196) != 68 || (bArr[6] & 4) != 4 || (bArr[8] & 4) != 4 || (bArr[9] & 1) != 1 || (bArr[12] & 3) != 3) {
            return false;
        }
        interfaceC2289h.mo9275a(bArr[13] & 7);
        interfaceC2289h.mo9276a(bArr, 0, 3);
        return 1 == ((((bArr[0] & 255) << 16) | ((bArr[1] & 255) << 8)) | (bArr[2] & 255));
    }
}
