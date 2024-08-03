package p139d.p225c.p226a.p227a.p268l;

import java.util.List;
import p139d.p225c.p226a.p227a.C2676s;
import p139d.p225c.p226a.p227a.p250j.C2411L;
import p139d.p225c.p226a.p227a.p250j.p252b.AbstractC2429l;
import p139d.p225c.p226a.p227a.p250j.p252b.InterfaceC2431n;
import p139d.p225c.p226a.p227a.p268l.InterfaceC2577k;
import p139d.p225c.p226a.p227a.p269m.InterfaceC2592f;
import p139d.p225c.p226a.p227a.p270n.C2622I;
import p139d.p225c.p226a.p227a.p270n.InterfaceC2629f;

/* renamed from: d.c.a.a.l.a */
/* loaded from: classes.dex */
public class C2567a extends AbstractC2569c {

    /* renamed from: g */
    private final InterfaceC2592f f10633g;

    /* renamed from: h */
    private final long f10634h;

    /* renamed from: i */
    private final long f10635i;

    /* renamed from: j */
    private final long f10636j;

    /* renamed from: k */
    private final float f10637k;

    /* renamed from: l */
    private final float f10638l;

    /* renamed from: m */
    private final long f10639m;

    /* renamed from: n */
    private final InterfaceC2629f f10640n;

    /* renamed from: o */
    private float f10641o;

    /* renamed from: p */
    private int f10642p;

    /* renamed from: q */
    private int f10643q;

    /* renamed from: r */
    private long f10644r;

    /* renamed from: d.c.a.a.l.a$a */
    /* loaded from: classes.dex */
    public static final class a implements InterfaceC2577k.a {

        /* renamed from: a */
        private final InterfaceC2592f f10645a;

        /* renamed from: b */
        private final int f10646b;

        /* renamed from: c */
        private final int f10647c;

        /* renamed from: d */
        private final int f10648d;

        /* renamed from: e */
        private final float f10649e;

        /* renamed from: f */
        private final float f10650f;

        /* renamed from: g */
        private final long f10651g;

        /* renamed from: h */
        private final InterfaceC2629f f10652h;

        @Deprecated
        public a(InterfaceC2592f interfaceC2592f) {
            this(interfaceC2592f, 10000, 25000, 25000, 0.75f, 0.75f, 2000L, InterfaceC2629f.f10943a);
        }

        @Deprecated
        public a(InterfaceC2592f interfaceC2592f, int i, int i2, int i3, float f, float f2, long j, InterfaceC2629f interfaceC2629f) {
            this.f10645a = interfaceC2592f;
            this.f10646b = i;
            this.f10647c = i2;
            this.f10648d = i3;
            this.f10649e = f;
            this.f10650f = f2;
            this.f10651g = j;
            this.f10652h = interfaceC2629f;
        }

        @Override // p139d.p225c.p226a.p227a.p268l.InterfaceC2577k.a
        /* renamed from: a */
        public C2567a mo10813a(C2411L c2411l, InterfaceC2592f interfaceC2592f, int... iArr) {
            InterfaceC2592f interfaceC2592f2 = this.f10645a;
            return new C2567a(c2411l, iArr, interfaceC2592f2 != null ? interfaceC2592f2 : interfaceC2592f, this.f10646b, this.f10647c, this.f10648d, this.f10649e, this.f10650f, this.f10651g, this.f10652h);
        }
    }

    public C2567a(C2411L c2411l, int[] iArr, InterfaceC2592f interfaceC2592f, long j, long j2, long j3, float f, float f2, long j4, InterfaceC2629f interfaceC2629f) {
        super(c2411l, iArr);
        this.f10633g = interfaceC2592f;
        this.f10634h = j * 1000;
        this.f10635i = j2 * 1000;
        this.f10636j = j3 * 1000;
        this.f10637k = f;
        this.f10638l = f2;
        this.f10639m = j4;
        this.f10640n = interfaceC2629f;
        this.f10641o = 1.0f;
        this.f10643q = 1;
        this.f10644r = -9223372036854775807L;
        this.f10642p = m10808a(Long.MIN_VALUE);
    }

    /* renamed from: a */
    private int m10808a(long j) {
        long mo10917b = ((float) this.f10633g.mo10917b()) * this.f10637k;
        int i = 0;
        for (int i2 = 0; i2 < this.f10654b; i2++) {
            if (j == Long.MIN_VALUE || !m10820b(i2, j)) {
                if (Math.round(mo10816a(i2).f11178c * this.f10641o) <= mo10917b) {
                    return i2;
                }
                i = i2;
            }
        }
        return i;
    }

    /* renamed from: b */
    private long m10809b(long j) {
        return (j > (-9223372036854775807L) ? 1 : (j == (-9223372036854775807L) ? 0 : -1)) != 0 && (j > this.f10634h ? 1 : (j == this.f10634h ? 0 : -1)) <= 0 ? ((float) j) * this.f10638l : this.f10634h;
    }

    @Override // p139d.p225c.p226a.p227a.p268l.AbstractC2569c, p139d.p225c.p226a.p227a.p268l.InterfaceC2577k
    /* renamed from: a */
    public int mo10810a(long j, List<? extends AbstractC2429l> list) {
        int i;
        int i2;
        long mo11001b = this.f10640n.mo11001b();
        long j2 = this.f10644r;
        if (j2 != -9223372036854775807L && mo11001b - j2 < this.f10639m) {
            return list.size();
        }
        this.f10644r = mo11001b;
        if (list.isEmpty()) {
            return 0;
        }
        int size = list.size();
        if (C2622I.m11080b(list.get(size - 1).f9516f - j, this.f10641o) < this.f10636j) {
            return size;
        }
        C2676s mo10816a = mo10816a(m10808a(mo11001b));
        for (int i3 = 0; i3 < size; i3++) {
            AbstractC2429l abstractC2429l = list.get(i3);
            C2676s c2676s = abstractC2429l.f9513c;
            if (C2622I.m11080b(abstractC2429l.f9516f - j, this.f10641o) >= this.f10636j && c2676s.f11178c < mo10816a.f11178c && (i = c2676s.f11188m) != -1 && i < 720 && (i2 = c2676s.f11187l) != -1 && i2 < 1280 && i < mo10816a.f11188m) {
                return i3;
            }
        }
        return size;
    }

    @Override // p139d.p225c.p226a.p227a.p268l.AbstractC2569c, p139d.p225c.p226a.p227a.p268l.InterfaceC2577k
    /* renamed from: a */
    public void mo10811a(float f) {
        this.f10641o = f;
    }

    @Override // p139d.p225c.p226a.p227a.p268l.AbstractC2569c, p139d.p225c.p226a.p227a.p268l.InterfaceC2577k
    /* renamed from: a */
    public void mo10327a(long j, long j2, long j3, List<? extends AbstractC2429l> list, InterfaceC2431n[] interfaceC2431nArr) {
        long mo11001b = this.f10640n.mo11001b();
        int i = this.f10642p;
        this.f10642p = m10808a(mo11001b);
        if (this.f10642p == i) {
            return;
        }
        if (!m10820b(i, mo11001b)) {
            C2676s mo10816a = mo10816a(i);
            C2676s mo10816a2 = mo10816a(this.f10642p);
            if ((mo10816a2.f11178c > mo10816a.f11178c && j2 < m10809b(j3)) || (mo10816a2.f11178c < mo10816a.f11178c && j2 >= this.f10635i)) {
                this.f10642p = i;
            }
        }
        if (this.f10642p != i) {
            this.f10643q = 3;
        }
    }

    @Override // p139d.p225c.p226a.p227a.p268l.InterfaceC2577k
    /* renamed from: b */
    public int mo10328b() {
        return this.f10642p;
    }

    @Override // p139d.p225c.p226a.p227a.p268l.AbstractC2569c, p139d.p225c.p226a.p227a.p268l.InterfaceC2577k
    /* renamed from: c */
    public void mo10812c() {
        this.f10644r = -9223372036854775807L;
    }

    @Override // p139d.p225c.p226a.p227a.p268l.InterfaceC2577k
    /* renamed from: g */
    public int mo10329g() {
        return this.f10643q;
    }

    @Override // p139d.p225c.p226a.p227a.p268l.InterfaceC2577k
    /* renamed from: h */
    public Object mo10330h() {
        return null;
    }
}
