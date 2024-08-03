package p139d.p225c.p226a.p227a.p269m;

import java.util.Arrays;
import p139d.p225c.p226a.p227a.p270n.C2622I;
import p139d.p225c.p226a.p227a.p270n.C2628e;

/* renamed from: d.c.a.a.m.o */
/* loaded from: classes.dex */
public final class C2601o implements InterfaceC2590d {

    /* renamed from: a */
    private final boolean f10791a;

    /* renamed from: b */
    private final int f10792b;

    /* renamed from: c */
    private final byte[] f10793c;

    /* renamed from: d */
    private final C2589c[] f10794d;

    /* renamed from: e */
    private int f10795e;

    /* renamed from: f */
    private int f10796f;

    /* renamed from: g */
    private int f10797g;

    /* renamed from: h */
    private C2589c[] f10798h;

    public C2601o(boolean z, int i) {
        this(z, i, 0);
    }

    public C2601o(boolean z, int i, int i2) {
        C2628e.m11111a(i > 0);
        C2628e.m11111a(i2 >= 0);
        this.f10791a = z;
        this.f10792b = i;
        this.f10797g = i2;
        this.f10798h = new C2589c[i2 + 100];
        if (i2 > 0) {
            this.f10793c = new byte[i2 * i];
            for (int i3 = 0; i3 < i2; i3++) {
                this.f10798h[i3] = new C2589c(this.f10793c, i3 * i);
            }
        } else {
            this.f10793c = null;
        }
        this.f10794d = new C2589c[1];
    }

    @Override // p139d.p225c.p226a.p227a.p269m.InterfaceC2590d
    /* renamed from: a */
    public synchronized C2589c mo10909a() {
        C2589c c2589c;
        this.f10796f++;
        if (this.f10797g > 0) {
            C2589c[] c2589cArr = this.f10798h;
            int i = this.f10797g - 1;
            this.f10797g = i;
            c2589c = c2589cArr[i];
            this.f10798h[this.f10797g] = null;
        } else {
            c2589c = new C2589c(new byte[this.f10792b], 0);
        }
        return c2589c;
    }

    /* renamed from: a */
    public synchronized void m10931a(int i) {
        boolean z = i < this.f10795e;
        this.f10795e = i;
        if (z) {
            mo10912b();
        }
    }

    @Override // p139d.p225c.p226a.p227a.p269m.InterfaceC2590d
    /* renamed from: a */
    public synchronized void mo10910a(C2589c c2589c) {
        this.f10794d[0] = c2589c;
        mo10911a(this.f10794d);
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // p139d.p225c.p226a.p227a.p269m.InterfaceC2590d
    /* renamed from: a */
    public synchronized void mo10911a(C2589c[] c2589cArr) {
        if (this.f10797g + c2589cArr.length >= this.f10798h.length) {
            this.f10798h = (C2589c[]) Arrays.copyOf(this.f10798h, Math.max(this.f10798h.length * 2, this.f10797g + c2589cArr.length));
        }
        for (C2589c c2589c : c2589cArr) {
            C2589c[] c2589cArr2 = this.f10798h;
            int i = this.f10797g;
            this.f10797g = i + 1;
            c2589cArr2[i] = c2589c;
        }
        this.f10796f -= c2589cArr.length;
        notifyAll();
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // p139d.p225c.p226a.p227a.p269m.InterfaceC2590d
    /* renamed from: b */
    public synchronized void mo10912b() {
        int i = 0;
        int max = Math.max(0, C2622I.m11037a(this.f10795e, this.f10792b) - this.f10796f);
        if (max >= this.f10797g) {
            return;
        }
        if (this.f10793c != null) {
            int i2 = this.f10797g - 1;
            while (i <= i2) {
                C2589c c2589c = this.f10798h[i];
                if (c2589c.f10755a == this.f10793c) {
                    i++;
                } else {
                    C2589c c2589c2 = this.f10798h[i2];
                    if (c2589c2.f10755a != this.f10793c) {
                        i2--;
                    } else {
                        this.f10798h[i] = c2589c2;
                        this.f10798h[i2] = c2589c;
                        i2--;
                        i++;
                    }
                }
            }
            max = Math.max(max, i);
            if (max >= this.f10797g) {
                return;
            }
        }
        Arrays.fill(this.f10798h, max, this.f10797g, (Object) null);
        this.f10797g = max;
    }

    @Override // p139d.p225c.p226a.p227a.p269m.InterfaceC2590d
    /* renamed from: c */
    public int mo10913c() {
        return this.f10792b;
    }

    /* renamed from: d */
    public synchronized int m10932d() {
        return this.f10796f * this.f10792b;
    }

    /* renamed from: e */
    public synchronized void m10933e() {
        if (this.f10791a) {
            m10931a(0);
        }
    }
}
