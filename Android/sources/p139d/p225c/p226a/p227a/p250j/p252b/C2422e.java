package p139d.p225c.p226a.p227a.p250j.p252b;

import android.util.SparseArray;
import p139d.p225c.p226a.p227a.C2676s;
import p139d.p225c.p226a.p227a.p234f.C2272f;
import p139d.p225c.p226a.p227a.p234f.InterfaceC2287g;
import p139d.p225c.p226a.p227a.p234f.InterfaceC2289h;
import p139d.p225c.p226a.p227a.p234f.InterfaceC2325i;
import p139d.p225c.p226a.p227a.p234f.InterfaceC2335o;
import p139d.p225c.p226a.p227a.p234f.InterfaceC2337q;
import p139d.p225c.p226a.p227a.p270n.C2628e;
import p139d.p225c.p226a.p227a.p270n.C2644u;

/* renamed from: d.c.a.a.j.b.e */
/* loaded from: classes.dex */
public final class C2422e implements InterfaceC2325i {

    /* renamed from: a */
    public final InterfaceC2287g f9519a;

    /* renamed from: b */
    private final int f9520b;

    /* renamed from: c */
    private final C2676s f9521c;

    /* renamed from: d */
    private final SparseArray<a> f9522d = new SparseArray<>();

    /* renamed from: e */
    private boolean f9523e;

    /* renamed from: f */
    private b f9524f;

    /* renamed from: g */
    private long f9525g;

    /* renamed from: h */
    private InterfaceC2335o f9526h;

    /* renamed from: i */
    private C2676s[] f9527i;

    /* renamed from: d.c.a.a.j.b.e$a */
    /* loaded from: classes.dex */
    public static final class a implements InterfaceC2337q {

        /* renamed from: a */
        private final int f9528a;

        /* renamed from: b */
        private final int f9529b;

        /* renamed from: c */
        private final C2676s f9530c;

        /* renamed from: d */
        private final C2272f f9531d = new C2272f();

        /* renamed from: e */
        public C2676s f9532e;

        /* renamed from: f */
        private InterfaceC2337q f9533f;

        /* renamed from: g */
        private long f9534g;

        public a(int i, int i2, C2676s c2676s) {
            this.f9528a = i;
            this.f9529b = i2;
            this.f9530c = c2676s;
        }

        @Override // p139d.p225c.p226a.p227a.p234f.InterfaceC2337q
        /* renamed from: a */
        public int mo9430a(InterfaceC2289h interfaceC2289h, int i, boolean z) {
            return this.f9533f.mo9430a(interfaceC2289h, i, z);
        }

        @Override // p139d.p225c.p226a.p227a.p234f.InterfaceC2337q
        /* renamed from: a */
        public void mo9431a(long j, int i, int i2, int i3, InterfaceC2337q.a aVar) {
            long j2 = this.f9534g;
            if (j2 != -9223372036854775807L && j >= j2) {
                this.f9533f = this.f9531d;
            }
            this.f9533f.mo9431a(j, i, i2, i3, aVar);
        }

        /* renamed from: a */
        public void m9999a(b bVar, long j) {
            if (bVar == null) {
                this.f9533f = this.f9531d;
                return;
            }
            this.f9534g = j;
            this.f9533f = bVar.mo9989a(this.f9528a, this.f9529b);
            C2676s c2676s = this.f9532e;
            if (c2676s != null) {
                this.f9533f.mo9433a(c2676s);
            }
        }

        @Override // p139d.p225c.p226a.p227a.p234f.InterfaceC2337q
        /* renamed from: a */
        public void mo9432a(C2644u c2644u, int i) {
            this.f9533f.mo9432a(c2644u, i);
        }

        @Override // p139d.p225c.p226a.p227a.p234f.InterfaceC2337q
        /* renamed from: a */
        public void mo9433a(C2676s c2676s) {
            C2676s c2676s2 = this.f9530c;
            if (c2676s2 != null) {
                c2676s = c2676s.m11442a(c2676s2);
            }
            this.f9532e = c2676s;
            this.f9533f.mo9433a(this.f9532e);
        }
    }

    /* renamed from: d.c.a.a.j.b.e$b */
    /* loaded from: classes.dex */
    public interface b {
        /* renamed from: a */
        InterfaceC2337q mo9989a(int i, int i2);
    }

    public C2422e(InterfaceC2287g interfaceC2287g, int i, C2676s c2676s) {
        this.f9519a = interfaceC2287g;
        this.f9520b = i;
        this.f9521c = c2676s;
    }

    @Override // p139d.p225c.p226a.p227a.p234f.InterfaceC2325i
    /* renamed from: a */
    public InterfaceC2337q mo9671a(int i, int i2) {
        a aVar = this.f9522d.get(i);
        if (aVar == null) {
            C2628e.m11113b(this.f9527i == null);
            aVar = new a(i, i2, i2 == this.f9520b ? this.f9521c : null);
            aVar.m9999a(this.f9524f, this.f9525g);
            this.f9522d.put(i, aVar);
        }
        return aVar;
    }

    @Override // p139d.p225c.p226a.p227a.p234f.InterfaceC2325i
    /* renamed from: a */
    public void mo9672a() {
        C2676s[] c2676sArr = new C2676s[this.f9522d.size()];
        for (int i = 0; i < this.f9522d.size(); i++) {
            c2676sArr[i] = this.f9522d.valueAt(i).f9532e;
        }
        this.f9527i = c2676sArr;
    }

    @Override // p139d.p225c.p226a.p227a.p234f.InterfaceC2325i
    /* renamed from: a */
    public void mo9673a(InterfaceC2335o interfaceC2335o) {
        this.f9526h = interfaceC2335o;
    }

    /* renamed from: a */
    public void m9996a(b bVar, long j, long j2) {
        this.f9524f = bVar;
        this.f9525g = j2;
        if (!this.f9523e) {
            this.f9519a.mo9160a(this);
            if (j != -9223372036854775807L) {
                this.f9519a.mo9159a(0L, j);
            }
            this.f9523e = true;
            return;
        }
        InterfaceC2287g interfaceC2287g = this.f9519a;
        if (j == -9223372036854775807L) {
            j = 0;
        }
        interfaceC2287g.mo9159a(0L, j);
        for (int i = 0; i < this.f9522d.size(); i++) {
            this.f9522d.valueAt(i).m9999a(bVar, j2);
        }
    }

    /* renamed from: b */
    public C2676s[] m9997b() {
        return this.f9527i;
    }

    /* renamed from: c */
    public InterfaceC2335o m9998c() {
        return this.f9526h;
    }
}
