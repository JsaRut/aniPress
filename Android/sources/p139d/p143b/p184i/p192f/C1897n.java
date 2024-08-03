package p139d.p143b.p184i.p192f;

import android.content.Context;
import p139d.p143b.p145b.p146a.InterfaceC1648d;
import p139d.p143b.p148c.p152d.InterfaceC1694m;
import p139d.p143b.p148c.p155g.InterfaceC1704a;
import p139d.p143b.p148c.p155g.InterfaceC1710g;
import p139d.p143b.p148c.p155g.InterfaceC1711h;
import p139d.p143b.p148c.p160l.InterfaceC1730b;
import p139d.p143b.p184i.p189c.AbstractC1842f;
import p139d.p143b.p184i.p190d.C1862l;
import p139d.p143b.p184i.p190d.InterfaceC1844A;
import p139d.p143b.p184i.p190d.InterfaceC1863m;
import p139d.p143b.p184i.p192f.C1895l;
import p139d.p143b.p184i.p194h.InterfaceC1910d;
import p139d.p143b.p184i.p194h.InterfaceC1912f;
import p139d.p143b.p184i.p196j.AbstractC1918b;

/* renamed from: d.b.i.f.n */
/* loaded from: classes.dex */
public class C1897n {

    /* renamed from: a */
    private final boolean f6949a;

    /* renamed from: b */
    private final InterfaceC1730b.a f6950b;

    /* renamed from: c */
    private final boolean f6951c;

    /* renamed from: d */
    private final InterfaceC1730b f6952d;

    /* renamed from: e */
    private final boolean f6953e;

    /* renamed from: f */
    private final boolean f6954f;

    /* renamed from: g */
    private final int f6955g;

    /* renamed from: h */
    private final int f6956h;

    /* renamed from: i */
    private boolean f6957i;

    /* renamed from: j */
    private final boolean f6958j;

    /* renamed from: k */
    private final c f6959k;

    /* renamed from: l */
    private final InterfaceC1694m<Boolean> f6960l;

    /* renamed from: d.b.i.f.n$a */
    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a */
        private final C1895l.a f6961a;

        /* renamed from: c */
        private InterfaceC1730b.a f6963c;

        /* renamed from: e */
        private InterfaceC1730b f6965e;

        /* renamed from: l */
        private c f6972l;

        /* renamed from: m */
        public InterfaceC1694m<Boolean> f6973m;

        /* renamed from: b */
        private boolean f6962b = false;

        /* renamed from: d */
        private boolean f6964d = false;

        /* renamed from: f */
        private boolean f6966f = false;

        /* renamed from: g */
        private boolean f6967g = false;

        /* renamed from: h */
        private int f6968h = 0;

        /* renamed from: i */
        private int f6969i = 0;

        /* renamed from: j */
        public boolean f6970j = false;

        /* renamed from: k */
        private boolean f6971k = false;

        public a(C1895l.a aVar) {
            this.f6961a = aVar;
        }

        /* renamed from: a */
        public C1897n m7776a() {
            return new C1897n(this);
        }
    }

    /* renamed from: d.b.i.f.n$b */
    /* loaded from: classes.dex */
    public static class b implements c {
        @Override // p139d.p143b.p184i.p192f.C1897n.c
        /* renamed from: a */
        public C1901r mo7777a(Context context, InterfaceC1704a interfaceC1704a, InterfaceC1910d interfaceC1910d, InterfaceC1912f interfaceC1912f, boolean z, boolean z2, boolean z3, InterfaceC1888e interfaceC1888e, InterfaceC1711h interfaceC1711h, InterfaceC1844A<InterfaceC1648d, AbstractC1918b> interfaceC1844A, InterfaceC1844A<InterfaceC1648d, InterfaceC1710g> interfaceC1844A2, C1862l c1862l, C1862l c1862l2, InterfaceC1863m interfaceC1863m, AbstractC1842f abstractC1842f, int i, int i2, boolean z4) {
            return new C1901r(context, interfaceC1704a, interfaceC1910d, interfaceC1912f, z, z2, z3, interfaceC1888e, interfaceC1711h, interfaceC1844A, interfaceC1844A2, c1862l, c1862l2, interfaceC1863m, abstractC1842f, i, i2, z4);
        }
    }

    /* renamed from: d.b.i.f.n$c */
    /* loaded from: classes.dex */
    public interface c {
        /* renamed from: a */
        C1901r mo7777a(Context context, InterfaceC1704a interfaceC1704a, InterfaceC1910d interfaceC1910d, InterfaceC1912f interfaceC1912f, boolean z, boolean z2, boolean z3, InterfaceC1888e interfaceC1888e, InterfaceC1711h interfaceC1711h, InterfaceC1844A<InterfaceC1648d, AbstractC1918b> interfaceC1844A, InterfaceC1844A<InterfaceC1648d, InterfaceC1710g> interfaceC1844A2, C1862l c1862l, C1862l c1862l2, InterfaceC1863m interfaceC1863m, AbstractC1842f abstractC1842f, int i, int i2, boolean z4);
    }

    private C1897n(a aVar) {
        this.f6949a = aVar.f6962b;
        this.f6950b = aVar.f6963c;
        this.f6951c = aVar.f6964d;
        this.f6952d = aVar.f6965e;
        this.f6953e = aVar.f6966f;
        this.f6954f = aVar.f6967g;
        this.f6955g = aVar.f6968h;
        this.f6956h = aVar.f6969i;
        this.f6957i = aVar.f6970j;
        this.f6958j = aVar.f6971k;
        this.f6959k = aVar.f6972l == null ? new b() : aVar.f6972l;
        this.f6960l = aVar.f6973m;
    }

    /* synthetic */ C1897n(a aVar, C1896m c1896m) {
        this(aVar);
    }

    /* renamed from: a */
    public boolean m7754a() {
        return this.f6957i;
    }

    /* renamed from: b */
    public int m7755b() {
        return this.f6956h;
    }

    /* renamed from: c */
    public int m7756c() {
        return this.f6955g;
    }

    /* renamed from: d */
    public c m7757d() {
        return this.f6959k;
    }

    /* renamed from: e */
    public boolean m7758e() {
        return this.f6954f;
    }

    /* renamed from: f */
    public boolean m7759f() {
        return this.f6953e;
    }

    /* renamed from: g */
    public InterfaceC1730b m7760g() {
        return this.f6952d;
    }

    /* renamed from: h */
    public InterfaceC1730b.a m7761h() {
        return this.f6950b;
    }

    /* renamed from: i */
    public boolean m7762i() {
        return this.f6951c;
    }

    /* renamed from: j */
    public InterfaceC1694m<Boolean> m7763j() {
        return this.f6960l;
    }

    /* renamed from: k */
    public boolean m7764k() {
        return this.f6958j;
    }

    /* renamed from: l */
    public boolean m7765l() {
        return this.f6949a;
    }
}
