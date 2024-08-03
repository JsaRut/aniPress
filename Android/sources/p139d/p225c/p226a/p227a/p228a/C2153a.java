package p139d.p225c.p226a.p227a.p228a;

import android.view.Surface;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;
import p139d.p225c.p226a.p227a.AbstractC2151P;
import p139d.p225c.p226a.p227a.C2137B;
import p139d.p225c.p226a.p227a.C2399j;
import p139d.p225c.p226a.p227a.C2676s;
import p139d.p225c.p226a.p227a.InterfaceC2139D;
import p139d.p225c.p226a.p227a.p228a.InterfaceC2154b;
import p139d.p225c.p226a.p227a.p229b.InterfaceC2177n;
import p139d.p225c.p226a.p227a.p229b.InterfaceC2179p;
import p139d.p225c.p226a.p227a.p230c.C2195e;
import p139d.p225c.p226a.p227a.p231d.InterfaceC2208h;
import p139d.p225c.p226a.p227a.p245h.C2353b;
import p139d.p225c.p226a.p227a.p245h.InterfaceC2395g;
import p139d.p225c.p226a.p227a.p250j.C2413N;
import p139d.p225c.p226a.p227a.p250j.InterfaceC2515y;
import p139d.p225c.p226a.p227a.p250j.InterfaceC2516z;
import p139d.p225c.p226a.p227a.p268l.C2578l;
import p139d.p225c.p226a.p227a.p269m.InterfaceC2592f;
import p139d.p225c.p226a.p227a.p270n.C2628e;
import p139d.p225c.p226a.p227a.p270n.InterfaceC2629f;
import p139d.p225c.p226a.p227a.p271o.InterfaceC2671s;
import p139d.p225c.p226a.p227a.p271o.InterfaceC2672t;

/* renamed from: d.c.a.a.a.a */
/* loaded from: classes.dex */
public class C2153a implements InterfaceC2139D.b, InterfaceC2395g, InterfaceC2179p, InterfaceC2672t, InterfaceC2516z, InterfaceC2592f.a, InterfaceC2208h, InterfaceC2671s, InterfaceC2177n {

    /* renamed from: a */
    private final CopyOnWriteArraySet<InterfaceC2154b> f7718a;

    /* renamed from: b */
    private final InterfaceC2629f f7719b;

    /* renamed from: c */
    private final AbstractC2151P.b f7720c;

    /* renamed from: d */
    private final c f7721d;

    /* renamed from: e */
    private InterfaceC2139D f7722e;

    /* renamed from: d.c.a.a.a.a$a */
    /* loaded from: classes.dex */
    public static class a {
        /* renamed from: a */
        public C2153a m8700a(InterfaceC2139D interfaceC2139D, InterfaceC2629f interfaceC2629f) {
            return new C2153a(interfaceC2139D, interfaceC2629f);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: d.c.a.a.a.a$b */
    /* loaded from: classes.dex */
    public static final class b {

        /* renamed from: a */
        public final InterfaceC2515y.a f7723a;

        /* renamed from: b */
        public final AbstractC2151P f7724b;

        /* renamed from: c */
        public final int f7725c;

        public b(InterfaceC2515y.a aVar, AbstractC2151P abstractC2151P, int i) {
            this.f7723a = aVar;
            this.f7724b = abstractC2151P;
            this.f7725c = i;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: d.c.a.a.a.a$c */
    /* loaded from: classes.dex */
    public static final class c {

        /* renamed from: d */
        private b f7729d;

        /* renamed from: e */
        private b f7730e;

        /* renamed from: g */
        private boolean f7732g;

        /* renamed from: a */
        private final ArrayList<b> f7726a = new ArrayList<>();

        /* renamed from: b */
        private final HashMap<InterfaceC2515y.a, b> f7727b = new HashMap<>();

        /* renamed from: c */
        private final AbstractC2151P.a f7728c = new AbstractC2151P.a();

        /* renamed from: f */
        private AbstractC2151P f7731f = AbstractC2151P.f7699a;

        /* renamed from: a */
        private b m8701a(b bVar, AbstractC2151P abstractC2151P) {
            int mo8637a = abstractC2151P.mo8637a(bVar.f7723a.f10271a);
            if (mo8637a == -1) {
                return bVar;
            }
            return new b(bVar.f7723a, abstractC2151P, abstractC2151P.m8647a(mo8637a, this.f7728c).f7702c);
        }

        /* renamed from: h */
        private void m8703h() {
            if (this.f7726a.isEmpty()) {
                return;
            }
            this.f7729d = this.f7726a.get(0);
        }

        /* renamed from: a */
        public b m8704a() {
            return this.f7729d;
        }

        /* renamed from: a */
        public b m8705a(InterfaceC2515y.a aVar) {
            return this.f7727b.get(aVar);
        }

        /* renamed from: a */
        public void m8706a(int i) {
            m8703h();
        }

        /* renamed from: a */
        public void m8707a(int i, InterfaceC2515y.a aVar) {
            b bVar = new b(aVar, this.f7731f.mo8637a(aVar.f10271a) != -1 ? this.f7731f : AbstractC2151P.f7699a, i);
            this.f7726a.add(bVar);
            this.f7727b.put(aVar, bVar);
            if (this.f7726a.size() != 1 || this.f7731f.m8654c()) {
                return;
            }
            m8703h();
        }

        /* renamed from: a */
        public void m8708a(AbstractC2151P abstractC2151P) {
            for (int i = 0; i < this.f7726a.size(); i++) {
                b m8701a = m8701a(this.f7726a.get(i), abstractC2151P);
                this.f7726a.set(i, m8701a);
                this.f7727b.put(m8701a.f7723a, m8701a);
            }
            b bVar = this.f7730e;
            if (bVar != null) {
                this.f7730e = m8701a(bVar, abstractC2151P);
            }
            this.f7731f = abstractC2151P;
            m8703h();
        }

        /* renamed from: b */
        public b m8709b() {
            if (this.f7726a.isEmpty()) {
                return null;
            }
            return this.f7726a.get(r0.size() - 1);
        }

        /* renamed from: b */
        public b m8710b(int i) {
            b bVar = null;
            for (int i2 = 0; i2 < this.f7726a.size(); i2++) {
                b bVar2 = this.f7726a.get(i2);
                int mo8637a = this.f7731f.mo8637a(bVar2.f7723a.f10271a);
                if (mo8637a != -1 && this.f7731f.m8647a(mo8637a, this.f7728c).f7702c == i) {
                    if (bVar != null) {
                        return null;
                    }
                    bVar = bVar2;
                }
            }
            return bVar;
        }

        /* renamed from: b */
        public boolean m8711b(InterfaceC2515y.a aVar) {
            b remove = this.f7727b.remove(aVar);
            if (remove == null) {
                return false;
            }
            this.f7726a.remove(remove);
            b bVar = this.f7730e;
            if (bVar == null || !aVar.equals(bVar.f7723a)) {
                return true;
            }
            this.f7730e = this.f7726a.isEmpty() ? null : this.f7726a.get(0);
            return true;
        }

        /* renamed from: c */
        public b m8712c() {
            if (this.f7726a.isEmpty() || this.f7731f.m8654c() || this.f7732g) {
                return null;
            }
            return this.f7726a.get(0);
        }

        /* renamed from: c */
        public void m8713c(InterfaceC2515y.a aVar) {
            this.f7730e = this.f7727b.get(aVar);
        }

        /* renamed from: d */
        public b m8714d() {
            return this.f7730e;
        }

        /* renamed from: e */
        public boolean m8715e() {
            return this.f7732g;
        }

        /* renamed from: f */
        public void m8716f() {
            this.f7732g = false;
            m8703h();
        }

        /* renamed from: g */
        public void m8717g() {
            this.f7732g = true;
        }
    }

    protected C2153a(InterfaceC2139D interfaceC2139D, InterfaceC2629f interfaceC2629f) {
        if (interfaceC2139D != null) {
            this.f7722e = interfaceC2139D;
        }
        C2628e.m11110a(interfaceC2629f);
        this.f7719b = interfaceC2629f;
        this.f7718a = new CopyOnWriteArraySet<>();
        this.f7721d = new c();
        this.f7720c = new AbstractC2151P.b();
    }

    /* renamed from: a */
    private InterfaceC2154b.a m8676a(b bVar) {
        C2628e.m11110a(this.f7722e);
        if (bVar == null) {
            int mo8522g = this.f7722e.mo8522g();
            b m8710b = this.f7721d.m8710b(mo8522g);
            if (m8710b == null) {
                AbstractC2151P mo8530o = this.f7722e.mo8530o();
                if (!(mo8522g < mo8530o.mo8641b())) {
                    mo8530o = AbstractC2151P.f7699a;
                }
                return m8682a(mo8530o, mo8522g, (InterfaceC2515y.a) null);
            }
            bVar = m8710b;
        }
        return m8682a(bVar.f7724b, bVar.f7725c, bVar.f7723a);
    }

    /* renamed from: d */
    private InterfaceC2154b.a m8677d(int i, InterfaceC2515y.a aVar) {
        C2628e.m11110a(this.f7722e);
        if (aVar != null) {
            b m8705a = this.f7721d.m8705a(aVar);
            return m8705a != null ? m8676a(m8705a) : m8682a(AbstractC2151P.f7699a, i, aVar);
        }
        AbstractC2151P mo8530o = this.f7722e.mo8530o();
        if (!(i < mo8530o.mo8641b())) {
            mo8530o = AbstractC2151P.f7699a;
        }
        return m8682a(mo8530o, i, (InterfaceC2515y.a) null);
    }

    /* renamed from: i */
    private InterfaceC2154b.a m8678i() {
        return m8676a(this.f7721d.m8704a());
    }

    /* renamed from: j */
    private InterfaceC2154b.a m8679j() {
        return m8676a(this.f7721d.m8709b());
    }

    /* renamed from: k */
    private InterfaceC2154b.a m8680k() {
        return m8676a(this.f7721d.m8712c());
    }

    /* renamed from: l */
    private InterfaceC2154b.a m8681l() {
        return m8676a(this.f7721d.m8714d());
    }

    /* renamed from: a */
    protected InterfaceC2154b.a m8682a(AbstractC2151P abstractC2151P, int i, InterfaceC2515y.a aVar) {
        if (abstractC2151P.m8654c()) {
            aVar = null;
        }
        InterfaceC2515y.a aVar2 = aVar;
        long mo11001b = this.f7719b.mo11001b();
        boolean z = abstractC2151P == this.f7722e.mo8530o() && i == this.f7722e.mo8522g();
        long j = 0;
        if (aVar2 != null && aVar2.m10487a()) {
            if (z && this.f7722e.mo8527l() == aVar2.f10272b && this.f7722e.mo8521f() == aVar2.f10273c) {
                j = this.f7722e.getCurrentPosition();
            }
        } else if (z) {
            j = this.f7722e.mo8523h();
        } else if (!abstractC2151P.m8654c()) {
            j = abstractC2151P.m8649a(i, this.f7720c).m8671a();
        }
        return new InterfaceC2154b.a(mo11001b, abstractC2151P, i, aVar2, j, this.f7722e.getCurrentPosition(), this.f7722e.mo8519d());
    }

    @Override // p139d.p225c.p226a.p227a.InterfaceC2139D.b
    /* renamed from: a */
    public final void mo4843a() {
        if (this.f7721d.m8715e()) {
            this.f7721d.m8716f();
            InterfaceC2154b.a m8680k = m8680k();
            Iterator<InterfaceC2154b> it = this.f7718a.iterator();
            while (it.hasNext()) {
                it.next().m8718a(m8680k);
            }
        }
    }

    @Override // p139d.p225c.p226a.p227a.p229b.InterfaceC2177n
    /* renamed from: a */
    public void mo8683a(float f) {
        InterfaceC2154b.a m8681l = m8681l();
        Iterator<InterfaceC2154b> it = this.f7718a.iterator();
        while (it.hasNext()) {
            it.next().m8719a(m8681l, f);
        }
    }

    @Override // p139d.p225c.p226a.p227a.InterfaceC2139D.b
    /* renamed from: a */
    public final void mo4844a(int i) {
        InterfaceC2154b.a m8680k = m8680k();
        Iterator<InterfaceC2154b> it = this.f7718a.iterator();
        while (it.hasNext()) {
            it.next().m8740b(m8680k, i);
        }
    }

    @Override // p139d.p225c.p226a.p227a.p271o.InterfaceC2671s
    /* renamed from: a */
    public void mo4845a(int i, int i2) {
        InterfaceC2154b.a m8681l = m8681l();
        Iterator<InterfaceC2154b> it = this.f7718a.iterator();
        while (it.hasNext()) {
            it.next().m8721a(m8681l, i, i2);
        }
    }

    @Override // p139d.p225c.p226a.p227a.p271o.InterfaceC2672t
    /* renamed from: a */
    public final void mo8623a(int i, int i2, int i3, float f) {
        InterfaceC2154b.a m8681l = m8681l();
        Iterator<InterfaceC2154b> it = this.f7718a.iterator();
        while (it.hasNext()) {
            it.next().m8722a(m8681l, i, i2, i3, f);
        }
    }

    @Override // p139d.p225c.p226a.p227a.p271o.InterfaceC2672t
    /* renamed from: a */
    public final void mo8624a(int i, long j) {
        InterfaceC2154b.a m8678i = m8678i();
        Iterator<InterfaceC2154b> it = this.f7718a.iterator();
        while (it.hasNext()) {
            it.next().m8723a(m8678i, i, j);
        }
    }

    @Override // p139d.p225c.p226a.p227a.p269m.InterfaceC2592f.a
    /* renamed from: a */
    public final void mo4921a(int i, long j, long j2) {
        InterfaceC2154b.a m8679j = m8679j();
        Iterator<InterfaceC2154b> it = this.f7718a.iterator();
        while (it.hasNext()) {
            it.next().m8724a(m8679j, i, j, j2);
        }
    }

    @Override // p139d.p225c.p226a.p227a.p250j.InterfaceC2516z
    /* renamed from: a */
    public final void mo8684a(int i, InterfaceC2515y.a aVar) {
        this.f7721d.m8713c(aVar);
        InterfaceC2154b.a m8677d = m8677d(i, aVar);
        Iterator<InterfaceC2154b> it = this.f7718a.iterator();
        while (it.hasNext()) {
            it.next().m8755i(m8677d);
        }
    }

    @Override // p139d.p225c.p226a.p227a.p250j.InterfaceC2516z
    /* renamed from: a */
    public final void mo8685a(int i, InterfaceC2515y.a aVar, InterfaceC2516z.b bVar, InterfaceC2516z.c cVar) {
        InterfaceC2154b.a m8677d = m8677d(i, aVar);
        Iterator<InterfaceC2154b> it = this.f7718a.iterator();
        while (it.hasNext()) {
            it.next().m8732a(m8677d, bVar, cVar);
        }
    }

    @Override // p139d.p225c.p226a.p227a.p250j.InterfaceC2516z
    /* renamed from: a */
    public final void mo8686a(int i, InterfaceC2515y.a aVar, InterfaceC2516z.b bVar, InterfaceC2516z.c cVar, IOException iOException, boolean z) {
        InterfaceC2154b.a m8677d = m8677d(i, aVar);
        Iterator<InterfaceC2154b> it = this.f7718a.iterator();
        while (it.hasNext()) {
            it.next().m8733a(m8677d, bVar, cVar, iOException, z);
        }
    }

    @Override // p139d.p225c.p226a.p227a.p250j.InterfaceC2516z
    /* renamed from: a */
    public final void mo8687a(int i, InterfaceC2515y.a aVar, InterfaceC2516z.c cVar) {
        InterfaceC2154b.a m8677d = m8677d(i, aVar);
        Iterator<InterfaceC2154b> it = this.f7718a.iterator();
        while (it.hasNext()) {
            it.next().m8744b(m8677d, cVar);
        }
    }

    @Override // p139d.p225c.p226a.p227a.p271o.InterfaceC2672t
    /* renamed from: a */
    public final void mo8625a(Surface surface) {
        InterfaceC2154b.a m8681l = m8681l();
        Iterator<InterfaceC2154b> it = this.f7718a.iterator();
        while (it.hasNext()) {
            it.next().m8728a(m8681l, surface);
        }
    }

    @Override // p139d.p225c.p226a.p227a.InterfaceC2139D.b
    /* renamed from: a */
    public final void mo4847a(C2137B c2137b) {
        InterfaceC2154b.a m8680k = m8680k();
        Iterator<InterfaceC2154b> it = this.f7718a.iterator();
        while (it.hasNext()) {
            it.next().m8729a(m8680k, c2137b);
        }
    }

    @Override // p139d.p225c.p226a.p227a.InterfaceC2139D.b
    /* renamed from: a */
    public final void mo4848a(AbstractC2151P abstractC2151P, Object obj, int i) {
        this.f7721d.m8708a(abstractC2151P);
        InterfaceC2154b.a m8680k = m8680k();
        Iterator<InterfaceC2154b> it = this.f7718a.iterator();
        while (it.hasNext()) {
            it.next().m8747c(m8680k, i);
        }
    }

    @Override // p139d.p225c.p226a.p227a.p229b.InterfaceC2179p
    /* renamed from: a */
    public final void mo8626a(C2195e c2195e) {
        InterfaceC2154b.a m8678i = m8678i();
        Iterator<InterfaceC2154b> it = this.f7718a.iterator();
        while (it.hasNext()) {
            it.next().m8742b(m8678i, 1, c2195e);
        }
    }

    @Override // p139d.p225c.p226a.p227a.p245h.InterfaceC2395g
    /* renamed from: a */
    public final void mo4927a(C2353b c2353b) {
        InterfaceC2154b.a m8680k = m8680k();
        Iterator<InterfaceC2154b> it = this.f7718a.iterator();
        while (it.hasNext()) {
            it.next().m8730a(m8680k, c2353b);
        }
    }

    @Override // p139d.p225c.p226a.p227a.InterfaceC2139D.b
    /* renamed from: a */
    public final void mo4849a(C2413N c2413n, C2578l c2578l) {
        InterfaceC2154b.a m8680k = m8680k();
        Iterator<InterfaceC2154b> it = this.f7718a.iterator();
        while (it.hasNext()) {
            it.next().m8731a(m8680k, c2413n, c2578l);
        }
    }

    @Override // p139d.p225c.p226a.p227a.InterfaceC2139D.b
    /* renamed from: a */
    public final void mo4850a(C2399j c2399j) {
        InterfaceC2154b.a m8680k = m8680k();
        Iterator<InterfaceC2154b> it = this.f7718a.iterator();
        while (it.hasNext()) {
            it.next().m8735a(m8680k, c2399j);
        }
    }

    @Override // p139d.p225c.p226a.p227a.p271o.InterfaceC2672t
    /* renamed from: a */
    public final void mo8627a(C2676s c2676s) {
        InterfaceC2154b.a m8681l = m8681l();
        Iterator<InterfaceC2154b> it = this.f7718a.iterator();
        while (it.hasNext()) {
            it.next().m8726a(m8681l, 2, c2676s);
        }
    }

    @Override // p139d.p225c.p226a.p227a.p231d.InterfaceC2208h
    /* renamed from: a */
    public final void mo8688a(Exception exc) {
        InterfaceC2154b.a m8681l = m8681l();
        Iterator<InterfaceC2154b> it = this.f7718a.iterator();
        while (it.hasNext()) {
            it.next().m8736a(m8681l, exc);
        }
    }

    @Override // p139d.p225c.p226a.p227a.p271o.InterfaceC2672t
    /* renamed from: a */
    public final void mo8628a(String str, long j, long j2) {
        InterfaceC2154b.a m8681l = m8681l();
        Iterator<InterfaceC2154b> it = this.f7718a.iterator();
        while (it.hasNext()) {
            it.next().m8727a(m8681l, 2, str, j2);
        }
    }

    @Override // p139d.p225c.p226a.p227a.InterfaceC2139D.b
    /* renamed from: a */
    public final void mo4852a(boolean z) {
        InterfaceC2154b.a m8680k = m8680k();
        Iterator<InterfaceC2154b> it = this.f7718a.iterator();
        while (it.hasNext()) {
            it.next().m8737a(m8680k, z);
        }
    }

    @Override // p139d.p225c.p226a.p227a.InterfaceC2139D.b
    /* renamed from: a */
    public final void mo4853a(boolean z, int i) {
        InterfaceC2154b.a m8680k = m8680k();
        Iterator<InterfaceC2154b> it = this.f7718a.iterator();
        while (it.hasNext()) {
            it.next().m8738a(m8680k, z, i);
        }
    }

    @Override // p139d.p225c.p226a.p227a.p271o.InterfaceC2671s
    /* renamed from: b */
    public final void mo4854b() {
    }

    @Override // p139d.p225c.p226a.p227a.InterfaceC2139D.b
    /* renamed from: b */
    public final void mo4855b(int i) {
        this.f7721d.m8706a(i);
        InterfaceC2154b.a m8680k = m8680k();
        Iterator<InterfaceC2154b> it = this.f7718a.iterator();
        while (it.hasNext()) {
            it.next().m8720a(m8680k, i);
        }
    }

    @Override // p139d.p225c.p226a.p227a.p229b.InterfaceC2179p
    /* renamed from: b */
    public final void mo8629b(int i, long j, long j2) {
        InterfaceC2154b.a m8681l = m8681l();
        Iterator<InterfaceC2154b> it = this.f7718a.iterator();
        while (it.hasNext()) {
            it.next().m8741b(m8681l, i, j, j2);
        }
    }

    @Override // p139d.p225c.p226a.p227a.p250j.InterfaceC2516z
    /* renamed from: b */
    public final void mo8689b(int i, InterfaceC2515y.a aVar) {
        InterfaceC2154b.a m8677d = m8677d(i, aVar);
        if (this.f7721d.m8711b(aVar)) {
            Iterator<InterfaceC2154b> it = this.f7718a.iterator();
            while (it.hasNext()) {
                it.next().m8749d(m8677d);
            }
        }
    }

    @Override // p139d.p225c.p226a.p227a.p250j.InterfaceC2516z
    /* renamed from: b */
    public final void mo8690b(int i, InterfaceC2515y.a aVar, InterfaceC2516z.b bVar, InterfaceC2516z.c cVar) {
        InterfaceC2154b.a m8677d = m8677d(i, aVar);
        Iterator<InterfaceC2154b> it = this.f7718a.iterator();
        while (it.hasNext()) {
            it.next().m8743b(m8677d, bVar, cVar);
        }
    }

    @Override // p139d.p225c.p226a.p227a.p250j.InterfaceC2516z
    /* renamed from: b */
    public final void mo8691b(int i, InterfaceC2515y.a aVar, InterfaceC2516z.c cVar) {
        InterfaceC2154b.a m8677d = m8677d(i, aVar);
        Iterator<InterfaceC2154b> it = this.f7718a.iterator();
        while (it.hasNext()) {
            it.next().m8734a(m8677d, cVar);
        }
    }

    @Override // p139d.p225c.p226a.p227a.p229b.InterfaceC2179p
    /* renamed from: b */
    public final void mo8630b(C2195e c2195e) {
        InterfaceC2154b.a m8680k = m8680k();
        Iterator<InterfaceC2154b> it = this.f7718a.iterator();
        while (it.hasNext()) {
            it.next().m8725a(m8680k, 1, c2195e);
        }
    }

    @Override // p139d.p225c.p226a.p227a.p229b.InterfaceC2179p
    /* renamed from: b */
    public final void mo8631b(C2676s c2676s) {
        InterfaceC2154b.a m8681l = m8681l();
        Iterator<InterfaceC2154b> it = this.f7718a.iterator();
        while (it.hasNext()) {
            it.next().m8726a(m8681l, 1, c2676s);
        }
    }

    @Override // p139d.p225c.p226a.p227a.p229b.InterfaceC2179p
    /* renamed from: b */
    public final void mo8632b(String str, long j, long j2) {
        InterfaceC2154b.a m8681l = m8681l();
        Iterator<InterfaceC2154b> it = this.f7718a.iterator();
        while (it.hasNext()) {
            it.next().m8727a(m8681l, 1, str, j2);
        }
    }

    @Override // p139d.p225c.p226a.p227a.InterfaceC2139D.b
    /* renamed from: b */
    public final void mo4856b(boolean z) {
        InterfaceC2154b.a m8680k = m8680k();
        Iterator<InterfaceC2154b> it = this.f7718a.iterator();
        while (it.hasNext()) {
            it.next().m8745b(m8680k, z);
        }
    }

    @Override // p139d.p225c.p226a.p227a.p231d.InterfaceC2208h
    /* renamed from: c */
    public final void mo8692c() {
        InterfaceC2154b.a m8681l = m8681l();
        Iterator<InterfaceC2154b> it = this.f7718a.iterator();
        while (it.hasNext()) {
            it.next().m8746c(m8681l);
        }
    }

    @Override // p139d.p225c.p226a.p227a.p229b.InterfaceC2179p
    /* renamed from: c */
    public final void mo8633c(int i) {
        InterfaceC2154b.a m8681l = m8681l();
        Iterator<InterfaceC2154b> it = this.f7718a.iterator();
        while (it.hasNext()) {
            it.next().m8750d(m8681l, i);
        }
    }

    @Override // p139d.p225c.p226a.p227a.p250j.InterfaceC2516z
    /* renamed from: c */
    public final void mo8693c(int i, InterfaceC2515y.a aVar) {
        this.f7721d.m8707a(i, aVar);
        InterfaceC2154b.a m8677d = m8677d(i, aVar);
        Iterator<InterfaceC2154b> it = this.f7718a.iterator();
        while (it.hasNext()) {
            it.next().m8752f(m8677d);
        }
    }

    @Override // p139d.p225c.p226a.p227a.p250j.InterfaceC2516z
    /* renamed from: c */
    public final void mo8694c(int i, InterfaceC2515y.a aVar, InterfaceC2516z.b bVar, InterfaceC2516z.c cVar) {
        InterfaceC2154b.a m8677d = m8677d(i, aVar);
        Iterator<InterfaceC2154b> it = this.f7718a.iterator();
        while (it.hasNext()) {
            it.next().m8748c(m8677d, bVar, cVar);
        }
    }

    @Override // p139d.p225c.p226a.p227a.p271o.InterfaceC2672t
    /* renamed from: c */
    public final void mo8634c(C2195e c2195e) {
        InterfaceC2154b.a m8680k = m8680k();
        Iterator<InterfaceC2154b> it = this.f7718a.iterator();
        while (it.hasNext()) {
            it.next().m8725a(m8680k, 2, c2195e);
        }
    }

    @Override // p139d.p225c.p226a.p227a.p231d.InterfaceC2208h
    /* renamed from: d */
    public final void mo8695d() {
        InterfaceC2154b.a m8681l = m8681l();
        Iterator<InterfaceC2154b> it = this.f7718a.iterator();
        while (it.hasNext()) {
            it.next().m8751e(m8681l);
        }
    }

    @Override // p139d.p225c.p226a.p227a.p271o.InterfaceC2672t
    /* renamed from: d */
    public final void mo8635d(C2195e c2195e) {
        InterfaceC2154b.a m8678i = m8678i();
        Iterator<InterfaceC2154b> it = this.f7718a.iterator();
        while (it.hasNext()) {
            it.next().m8742b(m8678i, 2, c2195e);
        }
    }

    @Override // p139d.p225c.p226a.p227a.p231d.InterfaceC2208h
    /* renamed from: e */
    public final void mo8696e() {
        InterfaceC2154b.a m8678i = m8678i();
        Iterator<InterfaceC2154b> it = this.f7718a.iterator();
        while (it.hasNext()) {
            it.next().m8739b(m8678i);
        }
    }

    @Override // p139d.p225c.p226a.p227a.p231d.InterfaceC2208h
    /* renamed from: f */
    public final void mo8697f() {
        InterfaceC2154b.a m8681l = m8681l();
        Iterator<InterfaceC2154b> it = this.f7718a.iterator();
        while (it.hasNext()) {
            it.next().m8754h(m8681l);
        }
    }

    /* renamed from: g */
    public final void m8698g() {
        if (this.f7721d.m8715e()) {
            return;
        }
        InterfaceC2154b.a m8680k = m8680k();
        this.f7721d.m8717g();
        Iterator<InterfaceC2154b> it = this.f7718a.iterator();
        while (it.hasNext()) {
            it.next().m8753g(m8680k);
        }
    }

    /* renamed from: h */
    public final void m8699h() {
        for (b bVar : new ArrayList(this.f7721d.f7726a)) {
            mo8689b(bVar.f7725c, bVar.f7723a);
        }
    }
}
