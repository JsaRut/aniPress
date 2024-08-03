package p139d.p225c.p226a.p227a.p234f.p242h;

import java.util.List;
import p139d.p225c.p226a.p227a.C2676s;
import p139d.p225c.p226a.p227a.p229b.C2171h;
import p139d.p225c.p226a.p227a.p231d.C2213m;
import p139d.p225c.p226a.p227a.p234f.InterfaceC2325i;
import p139d.p225c.p226a.p227a.p234f.InterfaceC2337q;
import p139d.p225c.p226a.p227a.p234f.p242h.InterfaceC2296G;
import p139d.p225c.p226a.p227a.p270n.C2643t;
import p139d.p225c.p226a.p227a.p270n.C2644u;

/* renamed from: d.c.a.a.f.h.f */
/* loaded from: classes.dex */
public final class C2304f implements InterfaceC2310l {

    /* renamed from: a */
    private final C2643t f8879a;

    /* renamed from: b */
    private final C2644u f8880b;

    /* renamed from: c */
    private final String f8881c;

    /* renamed from: d */
    private String f8882d;

    /* renamed from: e */
    private InterfaceC2337q f8883e;

    /* renamed from: f */
    private int f8884f;

    /* renamed from: g */
    private int f8885g;

    /* renamed from: h */
    private boolean f8886h;

    /* renamed from: i */
    private long f8887i;

    /* renamed from: j */
    private C2676s f8888j;

    /* renamed from: k */
    private int f8889k;

    /* renamed from: l */
    private long f8890l;

    public C2304f() {
        this(null);
    }

    public C2304f(String str) {
        this.f8879a = new C2643t(new byte[128]);
        this.f8880b = new C2644u(this.f8879a.f11000a);
        this.f8884f = 0;
        this.f8881c = str;
    }

    /* renamed from: a */
    private boolean m9557a(C2644u c2644u, byte[] bArr, int i) {
        int min = Math.min(c2644u.m11208a(), i - this.f8885g);
        c2644u.m11214a(bArr, this.f8885g, min);
        this.f8885g += min;
        return this.f8885g == i;
    }

    /* renamed from: b */
    private boolean m9558b(C2644u c2644u) {
        while (true) {
            boolean z = false;
            if (c2644u.m11208a() <= 0) {
                return false;
            }
            if (this.f8886h) {
                int m11238t = c2644u.m11238t();
                if (m11238t == 119) {
                    this.f8886h = false;
                    return true;
                }
                if (m11238t != 11) {
                    this.f8886h = z;
                }
                z = true;
                this.f8886h = z;
            } else {
                if (c2644u.m11238t() != 11) {
                    this.f8886h = z;
                }
                z = true;
                this.f8886h = z;
            }
        }
    }

    /* renamed from: c */
    private void m9559c() {
        this.f8879a.m11198b(0);
        C2171h.a m8852a = C2171h.m8852a(this.f8879a);
        C2676s c2676s = this.f8888j;
        if (c2676s == null || m8852a.f7858d != c2676s.f11195t || m8852a.f7857c != c2676s.f11196u || m8852a.f7855a != c2676s.f11182g) {
            this.f8888j = C2676s.m11426a(this.f8882d, m8852a.f7855a, (String) null, -1, -1, m8852a.f7858d, m8852a.f7857c, (List<byte[]>) null, (C2213m) null, 0, this.f8881c);
            this.f8883e.mo9433a(this.f8888j);
        }
        this.f8889k = m8852a.f7859e;
        this.f8887i = (m8852a.f7860f * 1000000) / this.f8888j.f11196u;
    }

    @Override // p139d.p225c.p226a.p227a.p234f.p242h.InterfaceC2310l
    /* renamed from: a */
    public void mo9560a() {
        this.f8884f = 0;
        this.f8885g = 0;
        this.f8886h = false;
    }

    @Override // p139d.p225c.p226a.p227a.p234f.p242h.InterfaceC2310l
    /* renamed from: a */
    public void mo9561a(long j, int i) {
        this.f8890l = j;
    }

    @Override // p139d.p225c.p226a.p227a.p234f.p242h.InterfaceC2310l
    /* renamed from: a */
    public void mo9562a(InterfaceC2325i interfaceC2325i, InterfaceC2296G.d dVar) {
        dVar.m9548a();
        this.f8882d = dVar.m9549b();
        this.f8883e = interfaceC2325i.mo9671a(dVar.m9550c(), 1);
    }

    @Override // p139d.p225c.p226a.p227a.p234f.p242h.InterfaceC2310l
    /* renamed from: a */
    public void mo9563a(C2644u c2644u) {
        while (c2644u.m11208a() > 0) {
            int i = this.f8884f;
            if (i != 0) {
                if (i != 1) {
                    if (i == 2) {
                        int min = Math.min(c2644u.m11208a(), this.f8889k - this.f8885g);
                        this.f8883e.mo9432a(c2644u, min);
                        this.f8885g += min;
                        int i2 = this.f8885g;
                        int i3 = this.f8889k;
                        if (i2 == i3) {
                            this.f8883e.mo9431a(this.f8890l, 1, i3, 0, null);
                            this.f8890l += this.f8887i;
                            this.f8884f = 0;
                        }
                    }
                } else if (m9557a(c2644u, this.f8880b.f11004a, 128)) {
                    m9559c();
                    this.f8880b.m11222e(0);
                    this.f8883e.mo9432a(this.f8880b, 128);
                    this.f8884f = 2;
                }
            } else if (m9558b(c2644u)) {
                this.f8884f = 1;
                byte[] bArr = this.f8880b.f11004a;
                bArr[0] = 11;
                bArr[1] = 119;
                this.f8885g = 2;
            }
        }
    }

    @Override // p139d.p225c.p226a.p227a.p234f.p242h.InterfaceC2310l
    /* renamed from: b */
    public void mo9564b() {
    }
}
