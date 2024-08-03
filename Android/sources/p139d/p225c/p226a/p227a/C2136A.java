package p139d.p225c.p226a.p227a;

import p139d.p225c.p226a.p227a.AbstractC2151P;
import p139d.p225c.p226a.p227a.p250j.C2413N;
import p139d.p225c.p226a.p227a.p250j.InterfaceC2515y;
import p139d.p225c.p226a.p227a.p268l.C2580n;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: d.c.a.a.A */
/* loaded from: classes.dex */
public final class C2136A {

    /* renamed from: a */
    private static final InterfaceC2515y.a f7627a = new InterfaceC2515y.a(new Object());

    /* renamed from: b */
    public final AbstractC2151P f7628b;

    /* renamed from: c */
    public final Object f7629c;

    /* renamed from: d */
    public final InterfaceC2515y.a f7630d;

    /* renamed from: e */
    public final long f7631e;

    /* renamed from: f */
    public final long f7632f;

    /* renamed from: g */
    public final int f7633g;

    /* renamed from: h */
    public final boolean f7634h;

    /* renamed from: i */
    public final C2413N f7635i;

    /* renamed from: j */
    public final C2580n f7636j;

    /* renamed from: k */
    public final InterfaceC2515y.a f7637k;

    /* renamed from: l */
    public volatile long f7638l;

    /* renamed from: m */
    public volatile long f7639m;

    /* renamed from: n */
    public volatile long f7640n;

    public C2136A(AbstractC2151P abstractC2151P, Object obj, InterfaceC2515y.a aVar, long j, long j2, int i, boolean z, C2413N c2413n, C2580n c2580n, InterfaceC2515y.a aVar2, long j3, long j4, long j5) {
        this.f7628b = abstractC2151P;
        this.f7629c = obj;
        this.f7630d = aVar;
        this.f7631e = j;
        this.f7632f = j2;
        this.f7633g = i;
        this.f7634h = z;
        this.f7635i = c2413n;
        this.f7636j = c2580n;
        this.f7637k = aVar2;
        this.f7638l = j3;
        this.f7639m = j4;
        this.f7640n = j5;
    }

    /* renamed from: a */
    public static C2136A m8500a(long j, C2580n c2580n) {
        return new C2136A(AbstractC2151P.f7699a, null, f7627a, j, -9223372036854775807L, 1, false, C2413N.f9484a, c2580n, f7627a, j, 0L, j);
    }

    /* renamed from: a */
    public C2136A m8501a(int i) {
        return new C2136A(this.f7628b, this.f7629c, this.f7630d, this.f7631e, this.f7632f, i, this.f7634h, this.f7635i, this.f7636j, this.f7637k, this.f7638l, this.f7639m, this.f7640n);
    }

    /* renamed from: a */
    public C2136A m8502a(AbstractC2151P abstractC2151P, Object obj) {
        return new C2136A(abstractC2151P, obj, this.f7630d, this.f7631e, this.f7632f, this.f7633g, this.f7634h, this.f7635i, this.f7636j, this.f7637k, this.f7638l, this.f7639m, this.f7640n);
    }

    /* renamed from: a */
    public C2136A m8503a(C2413N c2413n, C2580n c2580n) {
        return new C2136A(this.f7628b, this.f7629c, this.f7630d, this.f7631e, this.f7632f, this.f7633g, this.f7634h, c2413n, c2580n, this.f7637k, this.f7638l, this.f7639m, this.f7640n);
    }

    /* renamed from: a */
    public C2136A m8504a(InterfaceC2515y.a aVar) {
        return new C2136A(this.f7628b, this.f7629c, this.f7630d, this.f7631e, this.f7632f, this.f7633g, this.f7634h, this.f7635i, this.f7636j, aVar, this.f7638l, this.f7639m, this.f7640n);
    }

    /* renamed from: a */
    public C2136A m8505a(InterfaceC2515y.a aVar, long j, long j2) {
        return new C2136A(this.f7628b, this.f7629c, aVar, j, aVar.m10487a() ? j2 : -9223372036854775807L, this.f7633g, this.f7634h, this.f7635i, this.f7636j, aVar, j, 0L, j);
    }

    /* renamed from: a */
    public C2136A m8506a(InterfaceC2515y.a aVar, long j, long j2, long j3) {
        return new C2136A(this.f7628b, this.f7629c, aVar, j, aVar.m10487a() ? j2 : -9223372036854775807L, this.f7633g, this.f7634h, this.f7635i, this.f7636j, this.f7637k, this.f7638l, j3, j);
    }

    /* renamed from: a */
    public C2136A m8507a(boolean z) {
        return new C2136A(this.f7628b, this.f7629c, this.f7630d, this.f7631e, this.f7632f, this.f7633g, z, this.f7635i, this.f7636j, this.f7637k, this.f7638l, this.f7639m, this.f7640n);
    }

    /* renamed from: a */
    public InterfaceC2515y.a m8508a(boolean z, AbstractC2151P.b bVar) {
        if (this.f7628b.m8654c()) {
            return f7627a;
        }
        AbstractC2151P abstractC2151P = this.f7628b;
        return new InterfaceC2515y.a(this.f7628b.mo8640a(abstractC2151P.m8649a(abstractC2151P.m8644a(z), bVar).f7711f));
    }
}
