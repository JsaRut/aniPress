package p139d.p225c.p226a.p227a;

import p139d.p225c.p226a.p227a.p250j.C2413N;
import p139d.p225c.p226a.p227a.p268l.C2578l;
import p139d.p225c.p226a.p227a.p269m.C2601o;
import p139d.p225c.p226a.p227a.p269m.InterfaceC2590d;
import p139d.p225c.p226a.p227a.p270n.C2622I;
import p139d.p225c.p226a.p227a.p270n.C2628e;
import p139d.p225c.p226a.p227a.p270n.C2647x;

/* renamed from: d.c.a.a.g */
/* loaded from: classes.dex */
public class C2338g implements InterfaceC2679v {

    /* renamed from: a */
    private final C2601o f9177a;

    /* renamed from: b */
    private final long f9178b;

    /* renamed from: c */
    private final long f9179c;

    /* renamed from: d */
    private final long f9180d;

    /* renamed from: e */
    private final long f9181e;

    /* renamed from: f */
    private final int f9182f;

    /* renamed from: g */
    private final boolean f9183g;

    /* renamed from: h */
    private final C2647x f9184h;

    /* renamed from: i */
    private final long f9185i;

    /* renamed from: j */
    private final boolean f9186j;

    /* renamed from: k */
    private int f9187k;

    /* renamed from: l */
    private boolean f9188l;

    @Deprecated
    public C2338g(C2601o c2601o, int i, int i2, int i3, int i4, int i5, boolean z) {
        this(c2601o, i, i2, i3, i4, i5, z, null);
    }

    @Deprecated
    public C2338g(C2601o c2601o, int i, int i2, int i3, int i4, int i5, boolean z, C2647x c2647x) {
        this(c2601o, i, i2, i3, i4, i5, z, c2647x, 0, false);
    }

    protected C2338g(C2601o c2601o, int i, int i2, int i3, int i4, int i5, boolean z, C2647x c2647x, int i6, boolean z2) {
        m9695a(i3, 0, "bufferForPlaybackMs", "0");
        m9695a(i4, 0, "bufferForPlaybackAfterRebufferMs", "0");
        m9695a(i, i3, "minBufferMs", "bufferForPlaybackMs");
        m9695a(i, i4, "minBufferMs", "bufferForPlaybackAfterRebufferMs");
        m9695a(i2, i, "maxBufferMs", "minBufferMs");
        m9695a(i6, 0, "backBufferDurationMs", "0");
        this.f9177a = c2601o;
        this.f9178b = C2200d.m9047a(i);
        this.f9179c = C2200d.m9047a(i2);
        this.f9180d = C2200d.m9047a(i3);
        this.f9181e = C2200d.m9047a(i4);
        this.f9182f = i5;
        this.f9183g = z;
        this.f9184h = c2647x;
        this.f9185i = C2200d.m9047a(i6);
        this.f9186j = z2;
    }

    /* renamed from: a */
    private static void m9695a(int i, int i2, String str, String str2) {
        C2628e.m11112a(i >= i2, str + " cannot be less than " + str2);
    }

    /* renamed from: a */
    private void m9696a(boolean z) {
        this.f9187k = 0;
        C2647x c2647x = this.f9184h;
        if (c2647x != null && this.f9188l) {
            c2647x.m11258b(0);
            throw null;
        }
        this.f9188l = false;
        if (z) {
            this.f9177a.m10933e();
        }
    }

    /* renamed from: a */
    protected int m9697a(InterfaceC2143H[] interfaceC2143HArr, C2578l c2578l) {
        int i = 0;
        for (int i2 = 0; i2 < interfaceC2143HArr.length; i2++) {
            if (c2578l.m10887a(i2) != null) {
                i += C2622I.m11074b(interfaceC2143HArr[i2].mo8568f());
            }
        }
        return i;
    }

    @Override // p139d.p225c.p226a.p227a.InterfaceC2679v
    /* renamed from: a */
    public void mo9698a() {
        m9696a(false);
    }

    @Override // p139d.p225c.p226a.p227a.InterfaceC2679v
    /* renamed from: a */
    public void mo9699a(InterfaceC2143H[] interfaceC2143HArr, C2413N c2413n, C2578l c2578l) {
        int i = this.f9182f;
        if (i == -1) {
            i = m9697a(interfaceC2143HArr, c2578l);
        }
        this.f9187k = i;
        this.f9177a.m10931a(this.f9187k);
    }

    @Override // p139d.p225c.p226a.p227a.InterfaceC2679v
    /* renamed from: a */
    public boolean mo9700a(long j, float f) {
        boolean z;
        boolean z2 = true;
        boolean z3 = this.f9177a.m10932d() >= this.f9187k;
        boolean z4 = this.f9188l;
        long j2 = this.f9178b;
        if (f > 1.0f) {
            j2 = Math.min(C2622I.m11043a(j2, f), this.f9179c);
        }
        if (j < j2) {
            if (!this.f9183g && z3) {
                z2 = false;
            }
            this.f9188l = z2;
        } else if (j >= this.f9179c || z3) {
            this.f9188l = false;
        }
        C2647x c2647x = this.f9184h;
        if (c2647x == null || (z = this.f9188l) == z4) {
            return this.f9188l;
        }
        if (z) {
            c2647x.m11257a(0);
            throw null;
        }
        c2647x.m11258b(0);
        throw null;
    }

    @Override // p139d.p225c.p226a.p227a.InterfaceC2679v
    /* renamed from: a */
    public boolean mo9701a(long j, float f, boolean z) {
        long m11080b = C2622I.m11080b(j, f);
        long j2 = z ? this.f9181e : this.f9180d;
        return j2 <= 0 || m11080b >= j2 || (!this.f9183g && this.f9177a.m10932d() >= this.f9187k);
    }

    @Override // p139d.p225c.p226a.p227a.InterfaceC2679v
    /* renamed from: b */
    public boolean mo9702b() {
        return this.f9186j;
    }

    @Override // p139d.p225c.p226a.p227a.InterfaceC2679v
    /* renamed from: c */
    public long mo9703c() {
        return this.f9185i;
    }

    @Override // p139d.p225c.p226a.p227a.InterfaceC2679v
    /* renamed from: d */
    public void mo9704d() {
        m9696a(true);
    }

    @Override // p139d.p225c.p226a.p227a.InterfaceC2679v
    /* renamed from: e */
    public InterfaceC2590d mo9705e() {
        return this.f9177a;
    }

    @Override // p139d.p225c.p226a.p227a.InterfaceC2679v
    /* renamed from: f */
    public void mo9706f() {
        m9696a(true);
    }
}
