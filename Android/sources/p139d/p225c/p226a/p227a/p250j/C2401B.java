package p139d.p225c.p226a.p227a.p250j;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import p139d.p225c.p226a.p227a.AbstractC2151P;
import p139d.p225c.p226a.p227a.InterfaceC2517k;
import p139d.p225c.p226a.p227a.p250j.InterfaceC2515y;
import p139d.p225c.p226a.p227a.p269m.InterfaceC2586E;
import p139d.p225c.p226a.p227a.p269m.InterfaceC2590d;

/* renamed from: d.c.a.a.j.B */
/* loaded from: classes.dex */
public final class C2401B extends AbstractC2506p<Integer> {

    /* renamed from: j */
    private final InterfaceC2515y[] f9391j;

    /* renamed from: k */
    private final AbstractC2151P[] f9392k;

    /* renamed from: l */
    private final ArrayList<InterfaceC2515y> f9393l;

    /* renamed from: m */
    private final InterfaceC2508r f9394m;

    /* renamed from: n */
    private Object f9395n;

    /* renamed from: o */
    private int f9396o;

    /* renamed from: p */
    private a f9397p;

    /* renamed from: d.c.a.a.j.B$a */
    /* loaded from: classes.dex */
    public static final class a extends IOException {

        /* renamed from: a */
        public final int f9398a;

        public a(int i) {
            this.f9398a = i;
        }
    }

    public C2401B(InterfaceC2508r interfaceC2508r, InterfaceC2515y... interfaceC2515yArr) {
        this.f9391j = interfaceC2515yArr;
        this.f9394m = interfaceC2508r;
        this.f9393l = new ArrayList<>(Arrays.asList(interfaceC2515yArr));
        this.f9396o = -1;
        this.f9392k = new AbstractC2151P[interfaceC2515yArr.length];
    }

    public C2401B(InterfaceC2515y... interfaceC2515yArr) {
        this(new C2509s(), interfaceC2515yArr);
    }

    /* renamed from: a */
    private a m9888a(AbstractC2151P abstractC2151P) {
        if (this.f9396o == -1) {
            this.f9396o = abstractC2151P.mo8636a();
            return null;
        }
        if (abstractC2151P.mo8636a() != this.f9396o) {
            return new a(0);
        }
        return null;
    }

    @Override // p139d.p225c.p226a.p227a.p250j.InterfaceC2515y
    /* renamed from: a */
    public InterfaceC2514x mo9889a(InterfaceC2515y.a aVar, InterfaceC2590d interfaceC2590d) {
        InterfaceC2514x[] interfaceC2514xArr = new InterfaceC2514x[this.f9391j.length];
        int mo8637a = this.f9392k[0].mo8637a(aVar.f10271a);
        for (int i = 0; i < interfaceC2514xArr.length; i++) {
            interfaceC2514xArr[i] = this.f9391j[i].mo9889a(aVar.m10486a(this.f9392k[i].mo8640a(mo8637a)), interfaceC2590d);
        }
        return new C2400A(this.f9394m, interfaceC2514xArr);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p139d.p225c.p226a.p227a.p250j.AbstractC2506p
    /* renamed from: a, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public InterfaceC2515y.a mo9890a(Integer num, InterfaceC2515y.a aVar) {
        if (num.intValue() == 0) {
            return aVar;
        }
        return null;
    }

    @Override // p139d.p225c.p226a.p227a.p250j.AbstractC2506p, p139d.p225c.p226a.p227a.p250j.InterfaceC2515y
    /* renamed from: a */
    public void mo9891a() {
        a aVar = this.f9397p;
        if (aVar != null) {
            throw aVar;
        }
        super.mo9891a();
    }

    @Override // p139d.p225c.p226a.p227a.p250j.InterfaceC2515y
    /* renamed from: a */
    public void mo9892a(InterfaceC2514x interfaceC2514x) {
        C2400A c2400a = (C2400A) interfaceC2514x;
        int i = 0;
        while (true) {
            InterfaceC2515y[] interfaceC2515yArr = this.f9391j;
            if (i >= interfaceC2515yArr.length) {
                return;
            }
            interfaceC2515yArr[i].mo9892a(c2400a.f9383a[i]);
            i++;
        }
    }

    @Override // p139d.p225c.p226a.p227a.p250j.AbstractC2506p, p139d.p225c.p226a.p227a.p250j.AbstractC2503m
    /* renamed from: a */
    public void mo9893a(InterfaceC2517k interfaceC2517k, boolean z, InterfaceC2586E interfaceC2586E) {
        super.mo9893a(interfaceC2517k, z, interfaceC2586E);
        for (int i = 0; i < this.f9391j.length; i++) {
            m10445a((C2401B) Integer.valueOf(i), this.f9391j[i]);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p139d.p225c.p226a.p227a.p250j.AbstractC2506p
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public void m10446a(Integer num, InterfaceC2515y interfaceC2515y, AbstractC2151P abstractC2151P, Object obj) {
        if (this.f9397p == null) {
            this.f9397p = m9888a(abstractC2151P);
        }
        if (this.f9397p != null) {
            return;
        }
        this.f9393l.remove(interfaceC2515y);
        this.f9392k[num.intValue()] = abstractC2151P;
        if (interfaceC2515y == this.f9391j[0]) {
            this.f9395n = obj;
        }
        if (this.f9393l.isEmpty()) {
            m10434a(this.f9392k[0], this.f9395n);
        }
    }

    @Override // p139d.p225c.p226a.p227a.p250j.AbstractC2506p, p139d.p225c.p226a.p227a.p250j.AbstractC2503m
    /* renamed from: b */
    public void mo9895b() {
        super.mo9895b();
        Arrays.fill(this.f9392k, (Object) null);
        this.f9395n = null;
        this.f9396o = -1;
        this.f9397p = null;
        this.f9393l.clear();
        Collections.addAll(this.f9393l, this.f9391j);
    }
}
