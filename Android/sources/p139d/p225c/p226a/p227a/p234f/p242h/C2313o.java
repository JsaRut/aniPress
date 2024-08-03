package p139d.p225c.p226a.p227a.p234f.p242h;

import android.util.SparseArray;
import java.util.ArrayList;
import java.util.Arrays;
import p139d.p225c.p226a.p227a.C2676s;
import p139d.p225c.p226a.p227a.p231d.C2213m;
import p139d.p225c.p226a.p227a.p234f.InterfaceC2325i;
import p139d.p225c.p226a.p227a.p234f.InterfaceC2337q;
import p139d.p225c.p226a.p227a.p234f.p242h.InterfaceC2296G;
import p139d.p225c.p226a.p227a.p270n.C2630g;
import p139d.p225c.p226a.p227a.p270n.C2642s;
import p139d.p225c.p226a.p227a.p270n.C2644u;
import p139d.p225c.p226a.p227a.p270n.C2645v;

/* renamed from: d.c.a.a.f.h.o */
/* loaded from: classes.dex */
public final class C2313o implements InterfaceC2310l {

    /* renamed from: a */
    private final C2291B f8969a;

    /* renamed from: b */
    private final boolean f8970b;

    /* renamed from: c */
    private final boolean f8971c;

    /* renamed from: g */
    private long f8975g;

    /* renamed from: i */
    private String f8977i;

    /* renamed from: j */
    private InterfaceC2337q f8978j;

    /* renamed from: k */
    private a f8979k;

    /* renamed from: l */
    private boolean f8980l;

    /* renamed from: m */
    private long f8981m;

    /* renamed from: n */
    private boolean f8982n;

    /* renamed from: h */
    private final boolean[] f8976h = new boolean[3];

    /* renamed from: d */
    private final C2318t f8972d = new C2318t(7, 128);

    /* renamed from: e */
    private final C2318t f8973e = new C2318t(8, 128);

    /* renamed from: f */
    private final C2318t f8974f = new C2318t(6, 128);

    /* renamed from: o */
    private final C2644u f8983o = new C2644u();

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: d.c.a.a.f.h.o$a */
    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a */
        private final InterfaceC2337q f8984a;

        /* renamed from: b */
        private final boolean f8985b;

        /* renamed from: c */
        private final boolean f8986c;

        /* renamed from: h */
        private int f8991h;

        /* renamed from: i */
        private int f8992i;

        /* renamed from: j */
        private long f8993j;

        /* renamed from: k */
        private boolean f8994k;

        /* renamed from: l */
        private long f8995l;

        /* renamed from: m */
        private C2803a f8996m;

        /* renamed from: n */
        private C2803a f8997n;

        /* renamed from: o */
        private boolean f8998o;

        /* renamed from: p */
        private long f8999p;

        /* renamed from: q */
        private long f9000q;

        /* renamed from: r */
        private boolean f9001r;

        /* renamed from: d */
        private final SparseArray<C2642s.b> f8987d = new SparseArray<>();

        /* renamed from: e */
        private final SparseArray<C2642s.a> f8988e = new SparseArray<>();

        /* renamed from: g */
        private byte[] f8990g = new byte[128];

        /* renamed from: f */
        private final C2645v f8989f = new C2645v(this.f8990g, 0, 0);

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: d.c.a.a.f.h.o$a$a, reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C2803a {

            /* renamed from: a */
            private boolean f9002a;

            /* renamed from: b */
            private boolean f9003b;

            /* renamed from: c */
            private C2642s.b f9004c;

            /* renamed from: d */
            private int f9005d;

            /* renamed from: e */
            private int f9006e;

            /* renamed from: f */
            private int f9007f;

            /* renamed from: g */
            private int f9008g;

            /* renamed from: h */
            private boolean f9009h;

            /* renamed from: i */
            private boolean f9010i;

            /* renamed from: j */
            private boolean f9011j;

            /* renamed from: k */
            private boolean f9012k;

            /* renamed from: l */
            private int f9013l;

            /* renamed from: m */
            private int f9014m;

            /* renamed from: n */
            private int f9015n;

            /* renamed from: o */
            private int f9016o;

            /* renamed from: p */
            private int f9017p;

            private C2803a() {
            }

            /* JADX INFO: Access modifiers changed from: private */
            /* renamed from: a */
            public boolean m9611a(C2803a c2803a) {
                boolean z;
                boolean z2;
                if (this.f9002a) {
                    if (!c2803a.f9002a || this.f9007f != c2803a.f9007f || this.f9008g != c2803a.f9008g || this.f9009h != c2803a.f9009h) {
                        return true;
                    }
                    if (this.f9010i && c2803a.f9010i && this.f9011j != c2803a.f9011j) {
                        return true;
                    }
                    int i = this.f9005d;
                    int i2 = c2803a.f9005d;
                    if (i != i2 && (i == 0 || i2 == 0)) {
                        return true;
                    }
                    if (this.f9004c.f10997k == 0 && c2803a.f9004c.f10997k == 0 && (this.f9014m != c2803a.f9014m || this.f9015n != c2803a.f9015n)) {
                        return true;
                    }
                    if ((this.f9004c.f10997k == 1 && c2803a.f9004c.f10997k == 1 && (this.f9016o != c2803a.f9016o || this.f9017p != c2803a.f9017p)) || (z = this.f9012k) != (z2 = c2803a.f9012k)) {
                        return true;
                    }
                    if (z && z2 && this.f9013l != c2803a.f9013l) {
                        return true;
                    }
                }
                return false;
            }

            /* renamed from: a */
            public void m9613a() {
                this.f9003b = false;
                this.f9002a = false;
            }

            /* renamed from: a */
            public void m9614a(int i) {
                this.f9006e = i;
                this.f9003b = true;
            }

            /* renamed from: a */
            public void m9615a(C2642s.b bVar, int i, int i2, int i3, int i4, boolean z, boolean z2, boolean z3, boolean z4, int i5, int i6, int i7, int i8, int i9) {
                this.f9004c = bVar;
                this.f9005d = i;
                this.f9006e = i2;
                this.f9007f = i3;
                this.f9008g = i4;
                this.f9009h = z;
                this.f9010i = z2;
                this.f9011j = z3;
                this.f9012k = z4;
                this.f9013l = i5;
                this.f9014m = i6;
                this.f9015n = i7;
                this.f9016o = i8;
                this.f9017p = i9;
                this.f9002a = true;
                this.f9003b = true;
            }

            /* renamed from: b */
            public boolean m9616b() {
                int i;
                return this.f9003b && ((i = this.f9006e) == 7 || i == 2);
            }
        }

        public a(InterfaceC2337q interfaceC2337q, boolean z, boolean z2) {
            this.f8984a = interfaceC2337q;
            this.f8985b = z;
            this.f8986c = z2;
            this.f8996m = new C2803a();
            this.f8997n = new C2803a();
            m9610b();
        }

        /* renamed from: a */
        private void m9603a(int i) {
            boolean z = this.f9001r;
            this.f8984a.mo9431a(this.f9000q, z ? 1 : 0, (int) (this.f8993j - this.f8999p), i, null);
        }

        /* renamed from: a */
        public void m9604a(long j, int i, long j2) {
            this.f8992i = i;
            this.f8995l = j2;
            this.f8993j = j;
            if (!this.f8985b || this.f8992i != 1) {
                if (!this.f8986c) {
                    return;
                }
                int i2 = this.f8992i;
                if (i2 != 5 && i2 != 1 && i2 != 2) {
                    return;
                }
            }
            C2803a c2803a = this.f8996m;
            this.f8996m = this.f8997n;
            this.f8997n = c2803a;
            this.f8997n.m9613a();
            this.f8991h = 0;
            this.f8994k = true;
        }

        /* renamed from: a */
        public void m9605a(C2642s.a aVar) {
            this.f8988e.append(aVar.f10984a, aVar);
        }

        /* renamed from: a */
        public void m9606a(C2642s.b bVar) {
            this.f8987d.append(bVar.f10990d, bVar);
        }

        /* JADX WARN: Removed duplicated region for block: B:50:0x0101  */
        /* JADX WARN: Removed duplicated region for block: B:52:0x0108  */
        /* JADX WARN: Removed duplicated region for block: B:58:0x0120  */
        /* JADX WARN: Removed duplicated region for block: B:74:0x0150  */
        /* JADX WARN: Removed duplicated region for block: B:89:0x011a  */
        /* JADX WARN: Removed duplicated region for block: B:90:0x0104  */
        /* renamed from: a */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void m9607a(byte[] r24, int r25, int r26) {
            /*
                Method dump skipped, instructions count: 410
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: p139d.p225c.p226a.p227a.p234f.p242h.C2313o.a.m9607a(byte[], int, int):void");
        }

        /* renamed from: a */
        public boolean m9608a() {
            return this.f8986c;
        }

        /* renamed from: a */
        public boolean m9609a(long j, int i, boolean z, boolean z2) {
            boolean z3 = false;
            if (this.f8992i == 9 || (this.f8986c && this.f8997n.m9611a(this.f8996m))) {
                if (z && this.f8998o) {
                    m9603a(i + ((int) (j - this.f8993j)));
                }
                this.f8999p = this.f8993j;
                this.f9000q = this.f8995l;
                this.f9001r = false;
                this.f8998o = true;
            }
            if (this.f8985b) {
                z2 = this.f8997n.m9616b();
            }
            boolean z4 = this.f9001r;
            int i2 = this.f8992i;
            if (i2 == 5 || (z2 && i2 == 1)) {
                z3 = true;
            }
            this.f9001r = z4 | z3;
            return this.f9001r;
        }

        /* renamed from: b */
        public void m9610b() {
            this.f8994k = false;
            this.f8998o = false;
            this.f8997n.m9613a();
        }
    }

    public C2313o(C2291B c2291b, boolean z, boolean z2) {
        this.f8969a = c2291b;
        this.f8970b = z;
        this.f8971c = z2;
    }

    /* renamed from: a */
    private void m9600a(long j, int i, int i2, long j2) {
        C2318t c2318t;
        if (!this.f8980l || this.f8979k.m9608a()) {
            this.f8972d.m9641a(i2);
            this.f8973e.m9641a(i2);
            if (this.f8980l) {
                if (this.f8972d.m9640a()) {
                    C2318t c2318t2 = this.f8972d;
                    this.f8979k.m9606a(C2642s.m11186b(c2318t2.f9086d, 3, c2318t2.f9087e));
                    c2318t = this.f8972d;
                } else if (this.f8973e.m9640a()) {
                    C2318t c2318t3 = this.f8973e;
                    this.f8979k.m9605a(C2642s.m11180a(c2318t3.f9086d, 3, c2318t3.f9087e));
                    c2318t = this.f8973e;
                }
            } else if (this.f8972d.m9640a() && this.f8973e.m9640a()) {
                ArrayList arrayList = new ArrayList();
                C2318t c2318t4 = this.f8972d;
                arrayList.add(Arrays.copyOf(c2318t4.f9086d, c2318t4.f9087e));
                C2318t c2318t5 = this.f8973e;
                arrayList.add(Arrays.copyOf(c2318t5.f9086d, c2318t5.f9087e));
                C2318t c2318t6 = this.f8972d;
                C2642s.b m11186b = C2642s.m11186b(c2318t6.f9086d, 3, c2318t6.f9087e);
                C2318t c2318t7 = this.f8973e;
                C2642s.a m11180a = C2642s.m11180a(c2318t7.f9086d, 3, c2318t7.f9087e);
                this.f8978j.mo9433a(C2676s.m11422a(this.f8977i, "video/avc", C2630g.m11124b(m11186b.f10987a, m11186b.f10988b, m11186b.f10989c), -1, -1, m11186b.f10991e, m11186b.f10992f, -1.0f, arrayList, -1, m11186b.f10993g, (C2213m) null));
                this.f8980l = true;
                this.f8979k.m9606a(m11186b);
                this.f8979k.m9605a(m11180a);
                this.f8972d.m9642b();
                c2318t = this.f8973e;
            }
            c2318t.m9642b();
        }
        if (this.f8974f.m9641a(i2)) {
            C2318t c2318t8 = this.f8974f;
            this.f8983o.m11213a(this.f8974f.f9086d, C2642s.m11187c(c2318t8.f9086d, c2318t8.f9087e));
            this.f8983o.m11222e(4);
            this.f8969a.m9506a(j2, this.f8983o);
        }
        if (this.f8979k.m9609a(j, i, this.f8980l, this.f8982n)) {
            this.f8982n = false;
        }
    }

    /* renamed from: a */
    private void m9601a(long j, int i, long j2) {
        if (!this.f8980l || this.f8979k.m9608a()) {
            this.f8972d.m9643b(i);
            this.f8973e.m9643b(i);
        }
        this.f8974f.m9643b(i);
        this.f8979k.m9604a(j, i, j2);
    }

    /* renamed from: a */
    private void m9602a(byte[] bArr, int i, int i2) {
        if (!this.f8980l || this.f8979k.m9608a()) {
            this.f8972d.m9639a(bArr, i, i2);
            this.f8973e.m9639a(bArr, i, i2);
        }
        this.f8974f.m9639a(bArr, i, i2);
        this.f8979k.m9607a(bArr, i, i2);
    }

    @Override // p139d.p225c.p226a.p227a.p234f.p242h.InterfaceC2310l
    /* renamed from: a */
    public void mo9560a() {
        C2642s.m11183a(this.f8976h);
        this.f8972d.m9642b();
        this.f8973e.m9642b();
        this.f8974f.m9642b();
        this.f8979k.m9610b();
        this.f8975g = 0L;
        this.f8982n = false;
    }

    @Override // p139d.p225c.p226a.p227a.p234f.p242h.InterfaceC2310l
    /* renamed from: a */
    public void mo9561a(long j, int i) {
        this.f8981m = j;
        this.f8982n |= (i & 2) != 0;
    }

    @Override // p139d.p225c.p226a.p227a.p234f.p242h.InterfaceC2310l
    /* renamed from: a */
    public void mo9562a(InterfaceC2325i interfaceC2325i, InterfaceC2296G.d dVar) {
        dVar.m9548a();
        this.f8977i = dVar.m9549b();
        this.f8978j = interfaceC2325i.mo9671a(dVar.m9550c(), 2);
        this.f8979k = new a(this.f8978j, this.f8970b, this.f8971c);
        this.f8969a.m9507a(interfaceC2325i, dVar);
    }

    @Override // p139d.p225c.p226a.p227a.p234f.p242h.InterfaceC2310l
    /* renamed from: a */
    public void mo9563a(C2644u c2644u) {
        int m11217c = c2644u.m11217c();
        int m11219d = c2644u.m11219d();
        byte[] bArr = c2644u.f11004a;
        this.f8975g += c2644u.m11208a();
        this.f8978j.mo9432a(c2644u, c2644u.m11208a());
        while (true) {
            int m11179a = C2642s.m11179a(bArr, m11217c, m11219d, this.f8976h);
            if (m11179a == m11219d) {
                m9602a(bArr, m11217c, m11219d);
                return;
            }
            int m11185b = C2642s.m11185b(bArr, m11179a);
            int i = m11179a - m11217c;
            if (i > 0) {
                m9602a(bArr, m11217c, m11179a);
            }
            int i2 = m11219d - m11179a;
            long j = this.f8975g - i2;
            m9600a(j, i2, i < 0 ? -i : 0, this.f8981m);
            m9601a(j, m11185b, this.f8981m);
            m11217c = m11179a + 3;
        }
    }

    @Override // p139d.p225c.p226a.p227a.p234f.p242h.InterfaceC2310l
    /* renamed from: b */
    public void mo9564b() {
    }
}
