package p139d.p225c.p226a.p227a;

import android.annotation.SuppressLint;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Pair;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;
import p139d.p225c.p226a.p227a.AbstractC2151P;
import p139d.p225c.p226a.p227a.C2141F;
import p139d.p225c.p226a.p227a.InterfaceC2139D;
import p139d.p225c.p226a.p227a.p250j.C2413N;
import p139d.p225c.p226a.p227a.p250j.InterfaceC2515y;
import p139d.p225c.p226a.p227a.p268l.AbstractC2579m;
import p139d.p225c.p226a.p227a.p268l.C2578l;
import p139d.p225c.p226a.p227a.p268l.C2580n;
import p139d.p225c.p226a.p227a.p268l.InterfaceC2577k;
import p139d.p225c.p226a.p227a.p269m.InterfaceC2592f;
import p139d.p225c.p226a.p227a.p270n.C2622I;
import p139d.p225c.p226a.p227a.p270n.C2628e;
import p139d.p225c.p226a.p227a.p270n.C2638o;
import p139d.p225c.p226a.p227a.p270n.InterfaceC2629f;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: d.c.a.a.n */
/* loaded from: classes.dex */
public final class C2613n extends AbstractC2155b implements InterfaceC2517k {

    /* renamed from: b */
    final C2580n f10867b;

    /* renamed from: c */
    private final InterfaceC2143H[] f10868c;

    /* renamed from: d */
    private final AbstractC2579m f10869d;

    /* renamed from: e */
    private final Handler f10870e;

    /* renamed from: f */
    private final C2673p f10871f;

    /* renamed from: g */
    private final Handler f10872g;

    /* renamed from: h */
    private final CopyOnWriteArraySet<InterfaceC2139D.b> f10873h;

    /* renamed from: i */
    private final AbstractC2151P.a f10874i;

    /* renamed from: j */
    private final ArrayDeque<a> f10875j;

    /* renamed from: k */
    private InterfaceC2515y f10876k;

    /* renamed from: l */
    private boolean f10877l;

    /* renamed from: m */
    private boolean f10878m;

    /* renamed from: n */
    private int f10879n;

    /* renamed from: o */
    private boolean f10880o;

    /* renamed from: p */
    private int f10881p;

    /* renamed from: q */
    private boolean f10882q;

    /* renamed from: r */
    private boolean f10883r;

    /* renamed from: s */
    private C2137B f10884s;

    /* renamed from: t */
    private C2147L f10885t;

    /* renamed from: u */
    private C2399j f10886u;

    /* renamed from: v */
    private C2136A f10887v;

    /* renamed from: w */
    private int f10888w;

    /* renamed from: x */
    private int f10889x;

    /* renamed from: y */
    private long f10890y;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: d.c.a.a.n$a */
    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a */
        private final C2136A f10928a;

        /* renamed from: b */
        private final Set<InterfaceC2139D.b> f10929b;

        /* renamed from: c */
        private final AbstractC2579m f10930c;

        /* renamed from: d */
        private final boolean f10931d;

        /* renamed from: e */
        private final int f10932e;

        /* renamed from: f */
        private final int f10933f;

        /* renamed from: g */
        private final boolean f10934g;

        /* renamed from: h */
        private final boolean f10935h;

        /* renamed from: i */
        private final boolean f10936i;

        /* renamed from: j */
        private final boolean f10937j;

        /* renamed from: k */
        private final boolean f10938k;

        /* renamed from: l */
        private final boolean f10939l;

        public a(C2136A c2136a, C2136A c2136a2, Set<InterfaceC2139D.b> set, AbstractC2579m abstractC2579m, boolean z, int i, int i2, boolean z2, boolean z3, boolean z4) {
            this.f10928a = c2136a;
            this.f10929b = set;
            this.f10930c = abstractC2579m;
            this.f10931d = z;
            this.f10932e = i;
            this.f10933f = i2;
            this.f10934g = z2;
            this.f10935h = z3;
            this.f10936i = z4 || c2136a2.f7633g != c2136a.f7633g;
            this.f10937j = (c2136a2.f7628b == c2136a.f7628b && c2136a2.f7629c == c2136a.f7629c) ? false : true;
            this.f10938k = c2136a2.f7634h != c2136a.f7634h;
            this.f10939l = c2136a2.f7636j != c2136a.f7636j;
        }

        /* renamed from: a */
        public void m11108a() {
            if (this.f10937j || this.f10933f == 0) {
                for (InterfaceC2139D.b bVar : this.f10929b) {
                    C2136A c2136a = this.f10928a;
                    bVar.mo4848a(c2136a.f7628b, c2136a.f7629c, this.f10933f);
                }
            }
            if (this.f10931d) {
                Iterator<InterfaceC2139D.b> it = this.f10929b.iterator();
                while (it.hasNext()) {
                    it.next().mo4855b(this.f10932e);
                }
            }
            if (this.f10939l) {
                this.f10930c.mo10877a(this.f10928a.f7636j.f10734d);
                for (InterfaceC2139D.b bVar2 : this.f10929b) {
                    C2136A c2136a2 = this.f10928a;
                    bVar2.mo4849a(c2136a2.f7635i, c2136a2.f7636j.f10733c);
                }
            }
            if (this.f10938k) {
                Iterator<InterfaceC2139D.b> it2 = this.f10929b.iterator();
                while (it2.hasNext()) {
                    it2.next().mo4852a(this.f10928a.f7634h);
                }
            }
            if (this.f10936i) {
                Iterator<InterfaceC2139D.b> it3 = this.f10929b.iterator();
                while (it3.hasNext()) {
                    it3.next().mo4853a(this.f10935h, this.f10928a.f7633g);
                }
            }
            if (this.f10934g) {
                Iterator<InterfaceC2139D.b> it4 = this.f10929b.iterator();
                while (it4.hasNext()) {
                    it4.next().mo4843a();
                }
            }
        }
    }

    @SuppressLint({"HandlerLeak"})
    public C2613n(InterfaceC2143H[] interfaceC2143HArr, AbstractC2579m abstractC2579m, InterfaceC2679v interfaceC2679v, InterfaceC2592f interfaceC2592f, InterfaceC2629f interfaceC2629f, Looper looper) {
        C2638o.m11159c("ExoPlayerImpl", "Init " + Integer.toHexString(System.identityHashCode(this)) + " [ExoPlayerLib/2.9.3] [" + C2622I.f10920e + "]");
        C2628e.m11113b(interfaceC2143HArr.length > 0);
        C2628e.m11110a(interfaceC2143HArr);
        this.f10868c = interfaceC2143HArr;
        C2628e.m11110a(abstractC2579m);
        this.f10869d = abstractC2579m;
        this.f10877l = false;
        this.f10879n = 0;
        this.f10880o = false;
        this.f10873h = new CopyOnWriteArraySet<>();
        this.f10867b = new C2580n(new C2145J[interfaceC2143HArr.length], new InterfaceC2577k[interfaceC2143HArr.length], null);
        this.f10874i = new AbstractC2151P.a();
        this.f10884s = C2137B.f7641a;
        this.f10885t = C2147L.f7665e;
        this.f10870e = new HandlerC2581m(this, looper);
        this.f10887v = C2136A.m8500a(0L, this.f10867b);
        this.f10875j = new ArrayDeque<>();
        this.f10871f = new C2673p(interfaceC2143HArr, abstractC2579m, this.f10867b, interfaceC2679v, interfaceC2592f, this.f10877l, this.f10879n, this.f10880o, this.f10870e, this, interfaceC2629f);
        this.f10872g = new Handler(this.f10871f.m11402b());
    }

    /* renamed from: a */
    private long m10975a(InterfaceC2515y.a aVar, long j) {
        long m9048b = C2200d.m9048b(j);
        this.f10887v.f7628b.m8648a(aVar.f10271a, this.f10874i);
        return m9048b + this.f10874i.m8668d();
    }

    /* renamed from: a */
    private C2136A m10976a(boolean z, boolean z2, int i) {
        if (z) {
            this.f10888w = 0;
            this.f10889x = 0;
            this.f10890y = 0L;
        } else {
            this.f10888w = mo8522g();
            this.f10889x = m10986u();
            this.f10890y = getCurrentPosition();
        }
        InterfaceC2515y.a m8508a = z ? this.f10887v.m8508a(this.f10880o, this.f7740a) : this.f10887v.f7630d;
        long j = z ? 0L : this.f10887v.f7640n;
        return new C2136A(z2 ? AbstractC2151P.f7699a : this.f10887v.f7628b, z2 ? null : this.f10887v.f7629c, m8508a, j, z ? -9223372036854775807L : this.f10887v.f7632f, i, false, z2 ? C2413N.f9484a : this.f10887v.f7635i, z2 ? this.f10867b : this.f10887v.f7636j, m8508a, j, 0L, j);
    }

    /* renamed from: a */
    private void m10977a(C2136A c2136a, int i, boolean z, int i2) {
        this.f10881p -= i;
        if (this.f10881p == 0) {
            if (c2136a.f7631e == -9223372036854775807L) {
                c2136a = c2136a.m8505a(c2136a.f7630d, 0L, c2136a.f7632f);
            }
            C2136A c2136a2 = c2136a;
            if ((!this.f10887v.f7628b.m8654c() || this.f10882q) && c2136a2.f7628b.m8654c()) {
                this.f10889x = 0;
                this.f10888w = 0;
                this.f10890y = 0L;
            }
            int i3 = this.f10882q ? 0 : 2;
            boolean z2 = this.f10883r;
            this.f10882q = false;
            this.f10883r = false;
            m10978a(c2136a2, z, i2, i3, z2, false);
        }
    }

    /* renamed from: a */
    private void m10978a(C2136A c2136a, boolean z, int i, int i2, boolean z2, boolean z3) {
        boolean z4 = !this.f10875j.isEmpty();
        this.f10875j.addLast(new a(c2136a, this.f10887v, this.f10873h, this.f10869d, z, i, i2, z2, this.f10877l, z3));
        this.f10887v = c2136a;
        if (z4) {
            return;
        }
        while (!this.f10875j.isEmpty()) {
            this.f10875j.peekFirst().m11108a();
            this.f10875j.removeFirst();
        }
    }

    /* renamed from: y */
    private boolean m10979y() {
        return this.f10887v.f7628b.m8654c() || this.f10881p > 0;
    }

    /* renamed from: a */
    public C2141F m10980a(C2141F.b bVar) {
        return new C2141F(this.f10871f, bVar, this.f10887v.f7628b, mo8522g(), this.f10872g);
    }

    @Override // p139d.p225c.p226a.p227a.InterfaceC2139D
    /* renamed from: a */
    public void mo8511a(int i) {
        if (this.f10879n != i) {
            this.f10879n = i;
            this.f10871f.m11398a(i);
            Iterator<InterfaceC2139D.b> it = this.f10873h.iterator();
            while (it.hasNext()) {
                it.next().mo4844a(i);
            }
        }
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // p139d.p225c.p226a.p227a.InterfaceC2139D
    /* renamed from: a */
    public void mo8512a(int i, long j) {
        AbstractC2151P abstractC2151P = this.f10887v.f7628b;
        if (i < 0 || (!abstractC2151P.m8654c() && i >= abstractC2151P.mo8641b())) {
            throw new C2678u(abstractC2151P, i, j);
        }
        this.f10883r = true;
        this.f10881p++;
        if (mo8518c()) {
            C2638o.m11160d("ExoPlayerImpl", "seekTo ignored because an ad is playing");
            this.f10870e.obtainMessage(0, 1, -1, this.f10887v).sendToTarget();
            return;
        }
        this.f10888w = i;
        if (abstractC2151P.m8654c()) {
            this.f10890y = j == -9223372036854775807L ? 0L : j;
            this.f10889x = 0;
        } else {
            long m8673b = j == -9223372036854775807L ? abstractC2151P.m8649a(i, this.f7740a).m8673b() : C2200d.m9047a(j);
            Pair<Object, Long> m8645a = abstractC2151P.m8645a(this.f7740a, this.f10874i, i, m8673b);
            this.f10890y = C2200d.m9048b(m8673b);
            this.f10889x = abstractC2151P.mo8637a(m8645a.first);
        }
        this.f10871f.m11399a(abstractC2151P, i, C2200d.m9047a(j));
        Iterator<InterfaceC2139D.b> it = this.f10873h.iterator();
        while (it.hasNext()) {
            it.next().mo4855b(1);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public void m10981a(Message message) {
        int i = message.what;
        if (i == 0) {
            m10977a((C2136A) message.obj, message.arg1, message.arg2 != -1, message.arg2);
            return;
        }
        if (i != 1) {
            if (i != 2) {
                throw new IllegalStateException();
            }
            C2399j c2399j = (C2399j) message.obj;
            this.f10886u = c2399j;
            Iterator<InterfaceC2139D.b> it = this.f10873h.iterator();
            while (it.hasNext()) {
                it.next().mo4850a(c2399j);
            }
            return;
        }
        C2137B c2137b = (C2137B) message.obj;
        if (this.f10884s.equals(c2137b)) {
            return;
        }
        this.f10884s = c2137b;
        Iterator<InterfaceC2139D.b> it2 = this.f10873h.iterator();
        while (it2.hasNext()) {
            it2.next().mo4847a(c2137b);
        }
    }

    /* renamed from: a */
    public void m10982a(C2137B c2137b) {
        if (c2137b == null) {
            c2137b = C2137B.f7641a;
        }
        this.f10871f.m11403b(c2137b);
    }

    @Override // p139d.p225c.p226a.p227a.InterfaceC2139D
    /* renamed from: a */
    public void mo8513a(InterfaceC2139D.b bVar) {
        this.f10873h.add(bVar);
    }

    /* renamed from: a */
    public void m10983a(InterfaceC2515y interfaceC2515y, boolean z, boolean z2) {
        this.f10886u = null;
        this.f10876k = interfaceC2515y;
        C2136A m10976a = m10976a(z, z2, 2);
        this.f10882q = true;
        this.f10881p++;
        this.f10871f.m11400a(interfaceC2515y, z, z2);
        m10978a(m10976a, false, 4, 1, false, false);
    }

    @Override // p139d.p225c.p226a.p227a.InterfaceC2139D
    /* renamed from: a */
    public void mo8514a(boolean z) {
        if (this.f10880o != z) {
            this.f10880o = z;
            this.f10871f.m11406b(z);
            Iterator<InterfaceC2139D.b> it = this.f10873h.iterator();
            while (it.hasNext()) {
                it.next().mo4856b(z);
            }
        }
    }

    /* renamed from: a */
    public void m10984a(boolean z, boolean z2) {
        boolean z3 = z && !z2;
        if (this.f10878m != z3) {
            this.f10878m = z3;
            this.f10871f.m11401a(z3);
        }
        if (this.f10877l != z) {
            this.f10877l = z;
            m10978a(this.f10887v, false, 4, 1, false, true);
        }
    }

    /* renamed from: b */
    public int m10985b(int i) {
        return this.f10868c[i].mo8568f();
    }

    @Override // p139d.p225c.p226a.p227a.InterfaceC2139D
    /* renamed from: b */
    public C2137B mo8515b() {
        return this.f10884s;
    }

    @Override // p139d.p225c.p226a.p227a.InterfaceC2139D
    /* renamed from: b */
    public void mo8516b(InterfaceC2139D.b bVar) {
        this.f10873h.remove(bVar);
    }

    @Override // p139d.p225c.p226a.p227a.InterfaceC2139D
    /* renamed from: b */
    public void mo8517b(boolean z) {
        m10984a(z, false);
    }

    @Override // p139d.p225c.p226a.p227a.InterfaceC2139D
    /* renamed from: c */
    public boolean mo8518c() {
        return !m10979y() && this.f10887v.f7630d.m10487a();
    }

    @Override // p139d.p225c.p226a.p227a.InterfaceC2139D
    /* renamed from: d */
    public long mo8519d() {
        return Math.max(0L, C2200d.m9048b(this.f10887v.f7639m));
    }

    @Override // p139d.p225c.p226a.p227a.InterfaceC2139D
    /* renamed from: e */
    public boolean mo8520e() {
        return this.f10877l;
    }

    @Override // p139d.p225c.p226a.p227a.InterfaceC2139D
    /* renamed from: f */
    public int mo8521f() {
        if (mo8518c()) {
            return this.f10887v.f7630d.f10273c;
        }
        return -1;
    }

    @Override // p139d.p225c.p226a.p227a.InterfaceC2139D
    /* renamed from: g */
    public int mo8522g() {
        if (m10979y()) {
            return this.f10888w;
        }
        C2136A c2136a = this.f10887v;
        return c2136a.f7628b.m8648a(c2136a.f7630d.f10271a, this.f10874i).f7702c;
    }

    @Override // p139d.p225c.p226a.p227a.InterfaceC2139D
    public long getCurrentPosition() {
        if (m10979y()) {
            return this.f10890y;
        }
        if (this.f10887v.f7630d.m10487a()) {
            return C2200d.m9048b(this.f10887v.f7640n);
        }
        C2136A c2136a = this.f10887v;
        return m10975a(c2136a.f7630d, c2136a.f7640n);
    }

    @Override // p139d.p225c.p226a.p227a.InterfaceC2139D
    public long getDuration() {
        if (!mo8518c()) {
            return m8759s();
        }
        C2136A c2136a = this.f10887v;
        InterfaceC2515y.a aVar = c2136a.f7630d;
        c2136a.f7628b.m8648a(aVar.f10271a, this.f10874i);
        return C2200d.m9048b(this.f10874i.m8658a(aVar.f10272b, aVar.f10273c));
    }

    @Override // p139d.p225c.p226a.p227a.InterfaceC2139D
    /* renamed from: h */
    public long mo8523h() {
        if (!mo8518c()) {
            return getCurrentPosition();
        }
        C2136A c2136a = this.f10887v;
        c2136a.f7628b.m8648a(c2136a.f7630d.f10271a, this.f10874i);
        return this.f10874i.m8668d() + C2200d.m9048b(this.f10887v.f7632f);
    }

    @Override // p139d.p225c.p226a.p227a.InterfaceC2139D
    /* renamed from: j */
    public long mo8525j() {
        if (!mo8518c()) {
            return mo8533r();
        }
        C2136A c2136a = this.f10887v;
        return c2136a.f7637k.equals(c2136a.f7630d) ? C2200d.m9048b(this.f10887v.f7638l) : getDuration();
    }

    @Override // p139d.p225c.p226a.p227a.InterfaceC2139D
    /* renamed from: k */
    public int mo8526k() {
        return this.f10887v.f7633g;
    }

    @Override // p139d.p225c.p226a.p227a.InterfaceC2139D
    /* renamed from: l */
    public int mo8527l() {
        if (mo8518c()) {
            return this.f10887v.f7630d.f10272b;
        }
        return -1;
    }

    @Override // p139d.p225c.p226a.p227a.InterfaceC2139D
    /* renamed from: n */
    public int mo8529n() {
        return this.f10879n;
    }

    @Override // p139d.p225c.p226a.p227a.InterfaceC2139D
    /* renamed from: o */
    public AbstractC2151P mo8530o() {
        return this.f10887v.f7628b;
    }

    @Override // p139d.p225c.p226a.p227a.InterfaceC2139D
    /* renamed from: p */
    public Looper mo8531p() {
        return this.f10870e.getLooper();
    }

    @Override // p139d.p225c.p226a.p227a.InterfaceC2139D
    /* renamed from: q */
    public boolean mo8532q() {
        return this.f10880o;
    }

    @Override // p139d.p225c.p226a.p227a.InterfaceC2139D
    /* renamed from: r */
    public long mo8533r() {
        if (m10979y()) {
            return this.f10890y;
        }
        C2136A c2136a = this.f10887v;
        if (c2136a.f7637k.f10274d != c2136a.f7630d.f10274d) {
            return c2136a.f7628b.m8649a(mo8522g(), this.f7740a).m8674c();
        }
        long j = c2136a.f7638l;
        if (this.f10887v.f7637k.m10487a()) {
            C2136A c2136a2 = this.f10887v;
            AbstractC2151P.a m8648a = c2136a2.f7628b.m8648a(c2136a2.f7637k.f10271a, this.f10874i);
            long m8664b = m8648a.m8664b(this.f10887v.f7637k.f10272b);
            j = m8664b == Long.MIN_VALUE ? m8648a.f7703d : m8664b;
        }
        return m10975a(this.f10887v.f7637k, j);
    }

    /* renamed from: u */
    public int m10986u() {
        if (m10979y()) {
            return this.f10889x;
        }
        C2136A c2136a = this.f10887v;
        return c2136a.f7628b.mo8637a(c2136a.f7630d.f10271a);
    }

    /* renamed from: v */
    public C2578l m10987v() {
        return this.f10887v.f7636j.f10733c;
    }

    /* renamed from: w */
    public int m10988w() {
        return this.f10868c.length;
    }

    /* renamed from: x */
    public void m10989x() {
        C2638o.m11159c("ExoPlayerImpl", "Release " + Integer.toHexString(System.identityHashCode(this)) + " [ExoPlayerLib/2.9.3] [" + C2622I.f10920e + "] [" + C2674q.m11417a() + "]");
        this.f10876k = null;
        this.f10871f.m11407c();
        this.f10870e.removeCallbacksAndMessages(null);
    }
}
