package p139d.p225c.p226a.p227a.p250j.p252b;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import p139d.p225c.p226a.p227a.C2147L;
import p139d.p225c.p226a.p227a.C2676s;
import p139d.p225c.p226a.p227a.C2677t;
import p139d.p225c.p226a.p227a.p230c.C2196f;
import p139d.p225c.p226a.p227a.p250j.C2403D;
import p139d.p225c.p226a.p227a.p250j.InterfaceC2404E;
import p139d.p225c.p226a.p227a.p250j.InterfaceC2405F;
import p139d.p225c.p226a.p227a.p250j.InterfaceC2516z;
import p139d.p225c.p226a.p227a.p250j.p252b.InterfaceC2425h;
import p139d.p225c.p226a.p227a.p269m.C2612z;
import p139d.p225c.p226a.p227a.p269m.InterfaceC2590d;
import p139d.p225c.p226a.p227a.p269m.InterfaceC2610x;
import p139d.p225c.p226a.p227a.p270n.C2622I;
import p139d.p225c.p226a.p227a.p270n.C2628e;
import p139d.p225c.p226a.p227a.p270n.C2638o;

/* renamed from: d.c.a.a.j.b.g */
/* loaded from: classes.dex */
public class C2424g<T extends InterfaceC2425h> implements InterfaceC2404E, InterfaceC2405F, C2612z.a<AbstractC2421d>, C2612z.e {

    /* renamed from: a */
    public final int f9537a;

    /* renamed from: b */
    private final int[] f9538b;

    /* renamed from: c */
    private final C2676s[] f9539c;

    /* renamed from: d */
    private final boolean[] f9540d;

    /* renamed from: e */
    private final T f9541e;

    /* renamed from: f */
    private final InterfaceC2405F.a<C2424g<T>> f9542f;

    /* renamed from: g */
    private final InterfaceC2516z.a f9543g;

    /* renamed from: h */
    private final InterfaceC2610x f9544h;

    /* renamed from: i */
    private final C2612z f9545i = new C2612z("Loader:ChunkSampleStream");

    /* renamed from: j */
    private final C2423f f9546j = new C2423f();

    /* renamed from: k */
    private final ArrayList<AbstractC2418a> f9547k = new ArrayList<>();

    /* renamed from: l */
    private final List<AbstractC2418a> f9548l = Collections.unmodifiableList(this.f9547k);

    /* renamed from: m */
    private final C2403D f9549m;

    /* renamed from: n */
    private final C2403D[] f9550n;

    /* renamed from: o */
    private final C2420c f9551o;

    /* renamed from: p */
    private C2676s f9552p;

    /* renamed from: q */
    private b<T> f9553q;

    /* renamed from: r */
    private long f9554r;

    /* renamed from: s */
    private long f9555s;

    /* renamed from: t */
    private int f9556t;

    /* renamed from: u */
    long f9557u;

    /* renamed from: v */
    boolean f9558v;

    /* renamed from: d.c.a.a.j.b.g$a */
    /* loaded from: classes.dex */
    public final class a implements InterfaceC2404E {

        /* renamed from: a */
        public final C2424g<T> f9559a;

        /* renamed from: b */
        private final C2403D f9560b;

        /* renamed from: c */
        private final int f9561c;

        /* renamed from: d */
        private boolean f9562d;

        public a(C2424g<T> c2424g, C2403D c2403d, int i) {
            this.f9559a = c2424g;
            this.f9560b = c2403d;
            this.f9561c = i;
        }

        /* renamed from: d */
        private void m10023d() {
            if (this.f9562d) {
                return;
            }
            C2424g.this.f9543g.m10493a(C2424g.this.f9538b[this.f9561c], C2424g.this.f9539c[this.f9561c], 0, (Object) null, C2424g.this.f9555s);
            this.f9562d = true;
        }

        @Override // p139d.p225c.p226a.p227a.p250j.InterfaceC2404E
        /* renamed from: a */
        public int mo9960a(C2677t c2677t, C2196f c2196f, boolean z) {
            if (C2424g.this.m10021j()) {
                return -3;
            }
            m10023d();
            C2403D c2403d = this.f9560b;
            C2424g c2424g = C2424g.this;
            return c2403d.m9935a(c2677t, c2196f, z, c2424g.f9558v, c2424g.f9557u);
        }

        @Override // p139d.p225c.p226a.p227a.p250j.InterfaceC2404E
        /* renamed from: a */
        public void mo9961a() {
        }

        /* renamed from: b */
        public void m10024b() {
            C2628e.m11113b(C2424g.this.f9540d[this.f9561c]);
            C2424g.this.f9540d[this.f9561c] = false;
        }

        @Override // p139d.p225c.p226a.p227a.p250j.InterfaceC2404E
        /* renamed from: c */
        public boolean mo9962c() {
            C2424g c2424g = C2424g.this;
            return c2424g.f9558v || (!c2424g.m10021j() && this.f9560b.m9951j());
        }

        @Override // p139d.p225c.p226a.p227a.p250j.InterfaceC2404E
        /* renamed from: d */
        public int mo9963d(long j) {
            if (C2424g.this.m10021j()) {
                return 0;
            }
            m10023d();
            if (C2424g.this.f9558v && j > this.f9560b.m9947f()) {
                return this.f9560b.m9933a();
            }
            int m9934a = this.f9560b.m9934a(j, true, true);
            if (m9934a == -1) {
                return 0;
            }
            return m9934a;
        }
    }

    /* renamed from: d.c.a.a.j.b.g$b */
    /* loaded from: classes.dex */
    public interface b<T extends InterfaceC2425h> {
        /* renamed from: a */
        void mo10025a(C2424g<T> c2424g);
    }

    public C2424g(int i, int[] iArr, C2676s[] c2676sArr, T t, InterfaceC2405F.a<C2424g<T>> aVar, InterfaceC2590d interfaceC2590d, long j, InterfaceC2610x interfaceC2610x, InterfaceC2516z.a aVar2) {
        this.f9537a = i;
        this.f9538b = iArr;
        this.f9539c = c2676sArr;
        this.f9541e = t;
        this.f9542f = aVar;
        this.f9543g = aVar2;
        this.f9544h = interfaceC2610x;
        int i2 = 0;
        int length = iArr == null ? 0 : iArr.length;
        this.f9550n = new C2403D[length];
        this.f9540d = new boolean[length];
        int i3 = length + 1;
        int[] iArr2 = new int[i3];
        C2403D[] c2403dArr = new C2403D[i3];
        this.f9549m = new C2403D(interfaceC2590d);
        iArr2[0] = i;
        c2403dArr[0] = this.f9549m;
        while (i2 < length) {
            C2403D c2403d = new C2403D(interfaceC2590d);
            this.f9550n[i2] = c2403d;
            int i4 = i2 + 1;
            c2403dArr[i4] = c2403d;
            iArr2[i4] = iArr[i2];
            i2 = i4;
        }
        this.f9551o = new C2420c(iArr2, c2403dArr);
        this.f9554r = j;
        this.f9555s = j;
    }

    /* renamed from: a */
    private int m10001a(int i, int i2) {
        do {
            i2++;
            if (i2 >= this.f9547k.size()) {
                return this.f9547k.size() - 1;
            }
        } while (this.f9547k.get(i2).m9986a(0) <= i);
        return i2 - 1;
    }

    /* renamed from: a */
    private void m10002a(int i) {
        int min = Math.min(m10001a(i, 0), this.f9556t);
        if (min > 0) {
            C2622I.m11062a((List) this.f9547k, 0, min);
            this.f9556t -= min;
        }
    }

    /* renamed from: a */
    private boolean m10003a(AbstractC2421d abstractC2421d) {
        return abstractC2421d instanceof AbstractC2418a;
    }

    /* renamed from: b */
    private AbstractC2418a m10005b(int i) {
        AbstractC2418a abstractC2418a = this.f9547k.get(i);
        ArrayList<AbstractC2418a> arrayList = this.f9547k;
        C2622I.m11062a((List) arrayList, i, arrayList.size());
        this.f9556t = Math.max(this.f9556t, this.f9547k.size());
        C2403D c2403d = this.f9549m;
        int i2 = 0;
        while (true) {
            c2403d.m9936a(abstractC2418a.m9986a(i2));
            C2403D[] c2403dArr = this.f9550n;
            if (i2 >= c2403dArr.length) {
                return abstractC2418a;
            }
            c2403d = c2403dArr[i2];
            i2++;
        }
    }

    /* renamed from: c */
    private boolean m10007c(int i) {
        int m9948g;
        AbstractC2418a abstractC2418a = this.f9547k.get(i);
        if (this.f9549m.m9948g() > abstractC2418a.m9986a(0)) {
            return true;
        }
        int i2 = 0;
        do {
            C2403D[] c2403dArr = this.f9550n;
            if (i2 >= c2403dArr.length) {
                return false;
            }
            m9948g = c2403dArr[i2].m9948g();
            i2++;
        } while (m9948g <= abstractC2418a.m9986a(i2));
        return true;
    }

    /* renamed from: d */
    private void m10010d(int i) {
        AbstractC2418a abstractC2418a = this.f9547k.get(i);
        C2676s c2676s = abstractC2418a.f9513c;
        if (!c2676s.equals(this.f9552p)) {
            this.f9543g.m10493a(this.f9537a, c2676s, abstractC2418a.f9514d, abstractC2418a.f9515e, abstractC2418a.f9516f);
        }
        this.f9552p = c2676s;
    }

    /* renamed from: l */
    private AbstractC2418a m10012l() {
        return this.f9547k.get(r0.size() - 1);
    }

    /* renamed from: m */
    private void m10013m() {
        int m10001a = m10001a(this.f9549m.m9948g(), this.f9556t - 1);
        while (true) {
            int i = this.f9556t;
            if (i > m10001a) {
                return;
            }
            this.f9556t = i + 1;
            m10010d(i);
        }
    }

    @Override // p139d.p225c.p226a.p227a.p250j.InterfaceC2404E
    /* renamed from: a */
    public int mo9960a(C2677t c2677t, C2196f c2196f, boolean z) {
        if (m10021j()) {
            return -3;
        }
        m10013m();
        return this.f9549m.m9935a(c2677t, c2196f, z, this.f9558v, this.f9557u);
    }

    /* renamed from: a */
    public long m10014a(long j, C2147L c2147l) {
        return this.f9541e.mo10027a(j, c2147l);
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* renamed from: a */
    public C2424g<T>.a m10015a(long j, int i) {
        for (int i2 = 0; i2 < this.f9550n.length; i2++) {
            if (this.f9538b[i2] == i) {
                C2628e.m11113b(!this.f9540d[i2]);
                this.f9540d[i2] = true;
                this.f9550n[i2].m9954m();
                this.f9550n[i2].m9934a(j, true, true);
                return new a(this, this.f9550n[i2], i2);
            }
        }
        throw new IllegalStateException();
    }

    @Override // p139d.p225c.p226a.p227a.p269m.C2612z.a
    /* renamed from: a, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public C2612z.b mo9965a(AbstractC2421d abstractC2421d, long j, long j2, IOException iOException, int i) {
        long m9992c = abstractC2421d.m9992c();
        boolean m10003a = m10003a(abstractC2421d);
        int size = this.f9547k.size() - 1;
        boolean z = (m9992c != 0 && m10003a && m10007c(size)) ? false : true;
        C2612z.b bVar = null;
        if (this.f9541e.mo10031a(abstractC2421d, z, iOException, z ? this.f9544h.mo10950b(abstractC2421d.f9512b, j2, iOException, i) : -9223372036854775807L)) {
            if (z) {
                bVar = C2612z.f10849c;
                if (m10003a) {
                    C2628e.m11113b(m10005b(size) == abstractC2421d);
                    if (this.f9547k.isEmpty()) {
                        this.f9554r = this.f9555s;
                    }
                }
            } else {
                C2638o.m11160d("ChunkSampleStream", "Ignoring attempt to cancel non-cancelable load.");
            }
        }
        if (bVar == null) {
            long mo10949a = this.f9544h.mo10949a(abstractC2421d.f9512b, j2, iOException, i);
            bVar = mo10949a != -9223372036854775807L ? C2612z.m10955a(false, mo10949a) : C2612z.f10850d;
        }
        C2612z.b bVar2 = bVar;
        boolean z2 = !bVar2.m10968a();
        this.f9543g.m10507a(abstractC2421d.f9511a, abstractC2421d.m9995f(), abstractC2421d.m9994e(), abstractC2421d.f9512b, this.f9537a, abstractC2421d.f9513c, abstractC2421d.f9514d, abstractC2421d.f9515e, abstractC2421d.f9516f, abstractC2421d.f9517g, j, j2, m9992c, iOException, z2);
        if (z2) {
            this.f9542f.mo9878a(this);
        }
        return bVar2;
    }

    @Override // p139d.p225c.p226a.p227a.p250j.InterfaceC2404E
    /* renamed from: a */
    public void mo9961a() {
        this.f9545i.mo10177a();
        if (this.f9545i.m10964c()) {
            return;
        }
        this.f9541e.mo10028a();
    }

    /* renamed from: a */
    public void m10016a(long j) {
        boolean z;
        long j2;
        this.f9555s = j;
        if (m10021j()) {
            this.f9554r = j;
            return;
        }
        AbstractC2418a abstractC2418a = null;
        int i = 0;
        while (true) {
            if (i >= this.f9547k.size()) {
                break;
            }
            AbstractC2418a abstractC2418a2 = this.f9547k.get(i);
            long j3 = abstractC2418a2.f9516f;
            if (j3 == j && abstractC2418a2.f9502j == -9223372036854775807L) {
                abstractC2418a = abstractC2418a2;
                break;
            } else if (j3 > j) {
                break;
            } else {
                i++;
            }
        }
        this.f9549m.m9954m();
        if (abstractC2418a != null) {
            z = this.f9549m.m9942b(abstractC2418a.m9986a(0));
            j2 = 0;
        } else {
            z = this.f9549m.m9934a(j, true, (j > mo9880b() ? 1 : (j == mo9880b() ? 0 : -1)) < 0) != -1;
            j2 = this.f9555s;
        }
        this.f9557u = j2;
        if (z) {
            this.f9556t = m10001a(this.f9549m.m9948g(), 0);
            for (C2403D c2403d : this.f9550n) {
                c2403d.m9954m();
                c2403d.m9934a(j, true, false);
            }
            return;
        }
        this.f9554r = j;
        this.f9558v = false;
        this.f9547k.clear();
        this.f9556t = 0;
        if (this.f9545i.m10964c()) {
            this.f9545i.m10963b();
            return;
        }
        this.f9549m.m9953l();
        for (C2403D c2403d2 : this.f9550n) {
            c2403d2.m9953l();
        }
    }

    /* renamed from: a */
    public void m10017a(long j, boolean z) {
        if (m10021j()) {
            return;
        }
        int m9945d = this.f9549m.m9945d();
        this.f9549m.m9941b(j, z, true);
        int m9945d2 = this.f9549m.m9945d();
        if (m9945d2 > m9945d) {
            long m9946e = this.f9549m.m9946e();
            int i = 0;
            while (true) {
                C2403D[] c2403dArr = this.f9550n;
                if (i >= c2403dArr.length) {
                    break;
                }
                c2403dArr[i].m9941b(m9946e, z, this.f9540d[i]);
                i++;
            }
        }
        m10002a(m9945d2);
    }

    @Override // p139d.p225c.p226a.p227a.p269m.C2612z.a
    /* renamed from: a, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public void mo9967a(AbstractC2421d abstractC2421d, long j, long j2) {
        this.f9541e.mo10030a(abstractC2421d);
        this.f9543g.m10515b(abstractC2421d.f9511a, abstractC2421d.m9995f(), abstractC2421d.m9994e(), abstractC2421d.f9512b, this.f9537a, abstractC2421d.f9513c, abstractC2421d.f9514d, abstractC2421d.f9515e, abstractC2421d.f9516f, abstractC2421d.f9517g, j, j2, abstractC2421d.m9992c());
        this.f9542f.mo9878a(this);
    }

    @Override // p139d.p225c.p226a.p227a.p269m.C2612z.a
    /* renamed from: a, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public void mo9968a(AbstractC2421d abstractC2421d, long j, long j2, boolean z) {
        this.f9543g.m10506a(abstractC2421d.f9511a, abstractC2421d.m9995f(), abstractC2421d.m9994e(), abstractC2421d.f9512b, this.f9537a, abstractC2421d.f9513c, abstractC2421d.f9514d, abstractC2421d.f9515e, abstractC2421d.f9516f, abstractC2421d.f9517g, j, j2, abstractC2421d.m9992c());
        if (z) {
            return;
        }
        this.f9549m.m9953l();
        for (C2403D c2403d : this.f9550n) {
            c2403d.m9953l();
        }
        this.f9542f.mo9878a(this);
    }

    /* renamed from: a */
    public void m10018a(b<T> bVar) {
        this.f9553q = bVar;
        this.f9549m.m9940b();
        for (C2403D c2403d : this.f9550n) {
            c2403d.m9940b();
        }
        this.f9545i.m10962a(this);
    }

    @Override // p139d.p225c.p226a.p227a.p250j.InterfaceC2405F
    /* renamed from: b */
    public long mo9880b() {
        if (m10021j()) {
            return this.f9554r;
        }
        if (this.f9558v) {
            return Long.MIN_VALUE;
        }
        return m10012l().f9517g;
    }

    @Override // p139d.p225c.p226a.p227a.p250j.InterfaceC2405F
    /* renamed from: b */
    public boolean mo9882b(long j) {
        List<AbstractC2418a> list;
        long j2;
        if (this.f9558v || this.f9545i.m10964c()) {
            return false;
        }
        boolean m10021j = m10021j();
        if (m10021j) {
            list = Collections.emptyList();
            j2 = this.f9554r;
        } else {
            list = this.f9548l;
            j2 = m10012l().f9517g;
        }
        this.f9541e.mo10029a(j, j2, list, this.f9546j);
        C2423f c2423f = this.f9546j;
        boolean z = c2423f.f9536b;
        AbstractC2421d abstractC2421d = c2423f.f9535a;
        c2423f.m10000a();
        if (z) {
            this.f9554r = -9223372036854775807L;
            this.f9558v = true;
            return true;
        }
        if (abstractC2421d == null) {
            return false;
        }
        if (m10003a(abstractC2421d)) {
            AbstractC2418a abstractC2418a = (AbstractC2418a) abstractC2421d;
            if (m10021j) {
                this.f9557u = abstractC2418a.f9516f == this.f9554r ? 0L : this.f9554r;
                this.f9554r = -9223372036854775807L;
            }
            abstractC2418a.m9987a(this.f9551o);
            this.f9547k.add(abstractC2418a);
        }
        this.f9543g.m10504a(abstractC2421d.f9511a, abstractC2421d.f9512b, this.f9537a, abstractC2421d.f9513c, abstractC2421d.f9514d, abstractC2421d.f9515e, abstractC2421d.f9516f, abstractC2421d.f9517g, this.f9545i.m10960a(abstractC2421d, this, this.f9544h.mo10948a(abstractC2421d.f9512b)));
        return true;
    }

    @Override // p139d.p225c.p226a.p227a.p250j.InterfaceC2405F
    /* renamed from: c */
    public void mo9883c(long j) {
        int size;
        int mo10026a;
        if (this.f9545i.m10964c() || m10021j() || (size = this.f9547k.size()) <= (mo10026a = this.f9541e.mo10026a(j, this.f9548l))) {
            return;
        }
        while (true) {
            if (mo10026a >= size) {
                mo10026a = size;
                break;
            } else if (!m10007c(mo10026a)) {
                break;
            } else {
                mo10026a++;
            }
        }
        if (mo10026a == size) {
            return;
        }
        long j2 = m10012l().f9517g;
        AbstractC2418a m10005b = m10005b(mo10026a);
        if (this.f9547k.isEmpty()) {
            this.f9554r = this.f9555s;
        }
        this.f9558v = false;
        this.f9543g.m10492a(this.f9537a, m10005b.f9516f, j2);
    }

    @Override // p139d.p225c.p226a.p227a.p250j.InterfaceC2404E
    /* renamed from: c */
    public boolean mo9962c() {
        return this.f9558v || (!m10021j() && this.f9549m.m9951j());
    }

    @Override // p139d.p225c.p226a.p227a.p250j.InterfaceC2404E
    /* renamed from: d */
    public int mo9963d(long j) {
        int i = 0;
        if (m10021j()) {
            return 0;
        }
        if (!this.f9558v || j <= this.f9549m.m9947f()) {
            int m9934a = this.f9549m.m9934a(j, true, true);
            if (m9934a != -1) {
                i = m9934a;
            }
        } else {
            i = this.f9549m.m9933a();
        }
        m10013m();
        return i;
    }

    @Override // p139d.p225c.p226a.p227a.p250j.InterfaceC2405F
    /* renamed from: g */
    public long mo9887g() {
        if (this.f9558v) {
            return Long.MIN_VALUE;
        }
        if (m10021j()) {
            return this.f9554r;
        }
        long j = this.f9555s;
        AbstractC2418a m10012l = m10012l();
        if (!m10012l.mo10033h()) {
            if (this.f9547k.size() > 1) {
                m10012l = this.f9547k.get(r2.size() - 2);
            } else {
                m10012l = null;
            }
        }
        if (m10012l != null) {
            j = Math.max(j, m10012l.f9517g);
        }
        return Math.max(j, this.f9549m.m9947f());
    }

    @Override // p139d.p225c.p226a.p227a.p269m.C2612z.e
    /* renamed from: h */
    public void mo10019h() {
        this.f9549m.m9953l();
        for (C2403D c2403d : this.f9550n) {
            c2403d.m9953l();
        }
        b<T> bVar = this.f9553q;
        if (bVar != null) {
            bVar.mo10025a(this);
        }
    }

    /* renamed from: i */
    public T m10020i() {
        return this.f9541e;
    }

    /* renamed from: j */
    boolean m10021j() {
        return this.f9554r != -9223372036854775807L;
    }

    /* renamed from: k */
    public void m10022k() {
        m10018a((b) null);
    }
}
