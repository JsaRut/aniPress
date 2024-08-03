package p139d.p225c.p226a.p227a.p234f.p242h;

import p139d.p225c.p226a.p227a.C2676s;
import p139d.p225c.p226a.p227a.p229b.C2188y;
import p139d.p225c.p226a.p227a.p234f.InterfaceC2325i;
import p139d.p225c.p226a.p227a.p234f.InterfaceC2337q;
import p139d.p225c.p226a.p227a.p234f.p242h.InterfaceC2296G;
import p139d.p225c.p226a.p227a.p270n.C2644u;

/* renamed from: d.c.a.a.f.h.j */
/* loaded from: classes.dex */
public final class C2308j implements InterfaceC2310l {

    /* renamed from: b */
    private final String f8931b;

    /* renamed from: c */
    private String f8932c;

    /* renamed from: d */
    private InterfaceC2337q f8933d;

    /* renamed from: f */
    private int f8935f;

    /* renamed from: g */
    private int f8936g;

    /* renamed from: h */
    private long f8937h;

    /* renamed from: i */
    private C2676s f8938i;

    /* renamed from: j */
    private int f8939j;

    /* renamed from: k */
    private long f8940k;

    /* renamed from: a */
    private final C2644u f8930a = new C2644u(new byte[18]);

    /* renamed from: e */
    private int f8934e = 0;

    public C2308j(String str) {
        this.f8931b = str;
    }

    /* renamed from: a */
    private boolean m9592a(C2644u c2644u, byte[] bArr, int i) {
        int min = Math.min(c2644u.m11208a(), i - this.f8935f);
        c2644u.m11214a(bArr, this.f8935f, min);
        this.f8935f += min;
        return this.f8935f == i;
    }

    /* renamed from: b */
    private boolean m9593b(C2644u c2644u) {
        while (c2644u.m11208a() > 0) {
            this.f8936g <<= 8;
            this.f8936g |= c2644u.m11238t();
            if (C2188y.m8994a(this.f8936g)) {
                byte[] bArr = this.f8930a.f11004a;
                int i = this.f8936g;
                bArr[0] = (byte) ((i >> 24) & 255);
                bArr[1] = (byte) ((i >> 16) & 255);
                bArr[2] = (byte) ((i >> 8) & 255);
                bArr[3] = (byte) (i & 255);
                this.f8935f = 4;
                this.f8936g = 0;
                return true;
            }
        }
        return false;
    }

    /* renamed from: c */
    private void m9594c() {
        byte[] bArr = this.f8930a.f11004a;
        if (this.f8938i == null) {
            this.f8938i = C2188y.m8993a(bArr, this.f8932c, this.f8931b, null);
            this.f8933d.mo9433a(this.f8938i);
        }
        this.f8939j = C2188y.m8992a(bArr);
        this.f8937h = (int) ((C2188y.m8995b(bArr) * 1000000) / this.f8938i.f11196u);
    }

    @Override // p139d.p225c.p226a.p227a.p234f.p242h.InterfaceC2310l
    /* renamed from: a */
    public void mo9560a() {
        this.f8934e = 0;
        this.f8935f = 0;
        this.f8936g = 0;
    }

    @Override // p139d.p225c.p226a.p227a.p234f.p242h.InterfaceC2310l
    /* renamed from: a */
    public void mo9561a(long j, int i) {
        this.f8940k = j;
    }

    @Override // p139d.p225c.p226a.p227a.p234f.p242h.InterfaceC2310l
    /* renamed from: a */
    public void mo9562a(InterfaceC2325i interfaceC2325i, InterfaceC2296G.d dVar) {
        dVar.m9548a();
        this.f8932c = dVar.m9549b();
        this.f8933d = interfaceC2325i.mo9671a(dVar.m9550c(), 1);
    }

    @Override // p139d.p225c.p226a.p227a.p234f.p242h.InterfaceC2310l
    /* renamed from: a */
    public void mo9563a(C2644u c2644u) {
        while (c2644u.m11208a() > 0) {
            int i = this.f8934e;
            if (i != 0) {
                if (i != 1) {
                    if (i != 2) {
                        throw new IllegalStateException();
                    }
                    int min = Math.min(c2644u.m11208a(), this.f8939j - this.f8935f);
                    this.f8933d.mo9432a(c2644u, min);
                    this.f8935f += min;
                    int i2 = this.f8935f;
                    int i3 = this.f8939j;
                    if (i2 == i3) {
                        this.f8933d.mo9431a(this.f8940k, 1, i3, 0, null);
                        this.f8940k += this.f8937h;
                        this.f8934e = 0;
                    }
                } else if (m9592a(c2644u, this.f8930a.f11004a, 18)) {
                    m9594c();
                    this.f8930a.m11222e(0);
                    this.f8933d.mo9432a(this.f8930a, 18);
                    this.f8934e = 2;
                }
            } else if (m9593b(c2644u)) {
                this.f8934e = 1;
            }
        }
    }

    @Override // p139d.p225c.p226a.p227a.p234f.p242h.InterfaceC2310l
    /* renamed from: b */
    public void mo9564b() {
    }
}
