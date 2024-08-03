package p139d.p225c.p226a.p227a.p250j;

import android.os.Handler;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import p139d.p225c.p226a.p227a.AbstractC2151P;
import p139d.p225c.p226a.p227a.InterfaceC2517k;
import p139d.p225c.p226a.p227a.p250j.InterfaceC2515y;
import p139d.p225c.p226a.p227a.p250j.InterfaceC2516z;
import p139d.p225c.p226a.p227a.p269m.InterfaceC2586E;
import p139d.p225c.p226a.p227a.p270n.C2622I;
import p139d.p225c.p226a.p227a.p270n.C2628e;

/* renamed from: d.c.a.a.j.p */
/* loaded from: classes.dex */
public abstract class AbstractC2506p<T> extends AbstractC2503m {

    /* renamed from: f */
    private final HashMap<T, b> f10193f = new HashMap<>();

    /* renamed from: g */
    private InterfaceC2517k f10194g;

    /* renamed from: h */
    private Handler f10195h;

    /* renamed from: i */
    private InterfaceC2586E f10196i;

    /* renamed from: d.c.a.a.j.p$a */
    /* loaded from: classes.dex */
    private final class a implements InterfaceC2516z {

        /* renamed from: a */
        private final T f10197a;

        /* renamed from: b */
        private InterfaceC2516z.a f10198b;

        public a(T t) {
            this.f10198b = AbstractC2506p.this.m10431a((InterfaceC2515y.a) null);
            this.f10197a = t;
        }

        /* renamed from: a */
        private InterfaceC2516z.c m10447a(InterfaceC2516z.c cVar) {
            AbstractC2506p abstractC2506p = AbstractC2506p.this;
            T t = this.f10197a;
            long j = cVar.f10293f;
            abstractC2506p.m10444a((AbstractC2506p) t, j);
            AbstractC2506p abstractC2506p2 = AbstractC2506p.this;
            T t2 = this.f10197a;
            long j2 = cVar.f10294g;
            abstractC2506p2.m10444a((AbstractC2506p) t2, j2);
            return (j == cVar.f10293f && j2 == cVar.f10294g) ? cVar : new InterfaceC2516z.c(cVar.f10288a, cVar.f10289b, cVar.f10290c, cVar.f10291d, cVar.f10292e, j, j2);
        }

        /* renamed from: d */
        private boolean m10448d(int i, InterfaceC2515y.a aVar) {
            InterfaceC2515y.a aVar2;
            if (aVar != null) {
                aVar2 = AbstractC2506p.this.mo9890a((AbstractC2506p) this.f10197a, aVar);
                if (aVar2 == null) {
                    return false;
                }
            } else {
                aVar2 = null;
            }
            AbstractC2506p.this.m10443a((AbstractC2506p) this.f10197a, i);
            InterfaceC2516z.a aVar3 = this.f10198b;
            if (aVar3.f10276a == i && C2622I.m11067a(aVar3.f10277b, aVar2)) {
                return true;
            }
            this.f10198b = AbstractC2506p.this.m10430a(i, aVar2, 0L);
            return true;
        }

        @Override // p139d.p225c.p226a.p227a.p250j.InterfaceC2516z
        /* renamed from: a */
        public void mo8684a(int i, InterfaceC2515y.a aVar) {
            if (m10448d(i, aVar)) {
                this.f10198b.m10517c();
            }
        }

        @Override // p139d.p225c.p226a.p227a.p250j.InterfaceC2516z
        /* renamed from: a */
        public void mo8685a(int i, InterfaceC2515y.a aVar, InterfaceC2516z.b bVar, InterfaceC2516z.c cVar) {
            if (m10448d(i, aVar)) {
                this.f10198b.m10511b(bVar, m10447a(cVar));
            }
        }

        @Override // p139d.p225c.p226a.p227a.p250j.InterfaceC2516z
        /* renamed from: a */
        public void mo8686a(int i, InterfaceC2515y.a aVar, InterfaceC2516z.b bVar, InterfaceC2516z.c cVar, IOException iOException, boolean z) {
            if (m10448d(i, aVar)) {
                this.f10198b.m10496a(bVar, m10447a(cVar), iOException, z);
            }
        }

        @Override // p139d.p225c.p226a.p227a.p250j.InterfaceC2516z
        /* renamed from: a */
        public void mo8687a(int i, InterfaceC2515y.a aVar, InterfaceC2516z.c cVar) {
            if (m10448d(i, aVar)) {
                this.f10198b.m10512b(m10447a(cVar));
            }
        }

        @Override // p139d.p225c.p226a.p227a.p250j.InterfaceC2516z
        /* renamed from: b */
        public void mo8689b(int i, InterfaceC2515y.a aVar) {
            if (m10448d(i, aVar)) {
                this.f10198b.m10510b();
            }
        }

        @Override // p139d.p225c.p226a.p227a.p250j.InterfaceC2516z
        /* renamed from: b */
        public void mo8690b(int i, InterfaceC2515y.a aVar, InterfaceC2516z.b bVar, InterfaceC2516z.c cVar) {
            if (m10448d(i, aVar)) {
                this.f10198b.m10495a(bVar, m10447a(cVar));
            }
        }

        @Override // p139d.p225c.p226a.p227a.p250j.InterfaceC2516z
        /* renamed from: b */
        public void mo8691b(int i, InterfaceC2515y.a aVar, InterfaceC2516z.c cVar) {
            if (m10448d(i, aVar)) {
                this.f10198b.m10497a(m10447a(cVar));
            }
        }

        @Override // p139d.p225c.p226a.p227a.p250j.InterfaceC2516z
        /* renamed from: c */
        public void mo8693c(int i, InterfaceC2515y.a aVar) {
            if (m10448d(i, aVar)) {
                this.f10198b.m10491a();
            }
        }

        @Override // p139d.p225c.p226a.p227a.p250j.InterfaceC2516z
        /* renamed from: c */
        public void mo8694c(int i, InterfaceC2515y.a aVar, InterfaceC2516z.b bVar, InterfaceC2516z.c cVar) {
            if (m10448d(i, aVar)) {
                this.f10198b.m10518c(bVar, m10447a(cVar));
            }
        }
    }

    /* renamed from: d.c.a.a.j.p$b */
    /* loaded from: classes.dex */
    private static final class b {

        /* renamed from: a */
        public final InterfaceC2515y f10200a;

        /* renamed from: b */
        public final InterfaceC2515y.b f10201b;

        /* renamed from: c */
        public final InterfaceC2516z f10202c;

        public b(InterfaceC2515y interfaceC2515y, InterfaceC2515y.b bVar, InterfaceC2516z interfaceC2516z) {
            this.f10200a = interfaceC2515y;
            this.f10201b = bVar;
            this.f10202c = interfaceC2516z;
        }
    }

    /* renamed from: a */
    protected int m10443a(T t, int i) {
        return i;
    }

    /* renamed from: a */
    protected long m10444a(T t, long j) {
        return j;
    }

    /* renamed from: a */
    protected abstract InterfaceC2515y.a mo9890a(T t, InterfaceC2515y.a aVar);

    @Override // p139d.p225c.p226a.p227a.p250j.InterfaceC2515y
    /* renamed from: a */
    public void mo9891a() {
        Iterator<b> it = this.f10193f.values().iterator();
        while (it.hasNext()) {
            it.next().f10200a.mo9891a();
        }
    }

    @Override // p139d.p225c.p226a.p227a.p250j.AbstractC2503m
    /* renamed from: a */
    public void mo9893a(InterfaceC2517k interfaceC2517k, boolean z, InterfaceC2586E interfaceC2586E) {
        this.f10194g = interfaceC2517k;
        this.f10196i = interfaceC2586E;
        this.f10195h = new Handler();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: a */
    public final void m10445a(final T t, InterfaceC2515y interfaceC2515y) {
        C2628e.m11111a(!this.f10193f.containsKey(t));
        InterfaceC2515y.b bVar = new InterfaceC2515y.b() { // from class: d.c.a.a.j.a
            @Override // p139d.p225c.p226a.p227a.p250j.InterfaceC2515y.b
            /* renamed from: a */
            public final void mo9979a(InterfaceC2515y interfaceC2515y2, AbstractC2151P abstractC2151P, Object obj) {
                AbstractC2506p.this.m10446a(t, interfaceC2515y2, abstractC2151P, obj);
            }
        };
        a aVar = new a(t);
        this.f10193f.put(t, new b(interfaceC2515y, bVar, aVar));
        Handler handler = this.f10195h;
        C2628e.m11110a(handler);
        interfaceC2515y.mo10433a(handler, aVar);
        InterfaceC2517k interfaceC2517k = this.f10194g;
        C2628e.m11110a(interfaceC2517k);
        interfaceC2515y.mo10437a(interfaceC2517k, false, bVar, this.f10196i);
    }

    @Override // p139d.p225c.p226a.p227a.p250j.AbstractC2503m
    /* renamed from: b */
    public void mo9895b() {
        for (b bVar : this.f10193f.values()) {
            bVar.f10200a.mo10435a(bVar.f10201b);
            bVar.f10200a.mo10436a(bVar.f10202c);
        }
        this.f10193f.clear();
        this.f10194g = null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public abstract void m10446a(T t, InterfaceC2515y interfaceC2515y, AbstractC2151P abstractC2151P, Object obj);
}
