package p139d.p225c.p226a.p227a.p234f.p242h;

import java.util.List;
import p139d.p225c.p226a.p227a.C2676s;
import p139d.p225c.p226a.p227a.p231d.C2213m;
import p139d.p225c.p226a.p227a.p234f.C2333m;
import p139d.p225c.p226a.p227a.p234f.InterfaceC2325i;
import p139d.p225c.p226a.p227a.p234f.InterfaceC2337q;
import p139d.p225c.p226a.p227a.p234f.p242h.InterfaceC2296G;
import p139d.p225c.p226a.p227a.p270n.C2644u;

/* renamed from: d.c.a.a.f.h.s */
/* loaded from: classes.dex */
public final class C2317s implements InterfaceC2310l {

    /* renamed from: a */
    private final C2644u f9071a;

    /* renamed from: b */
    private final C2333m f9072b;

    /* renamed from: c */
    private final String f9073c;

    /* renamed from: d */
    private String f9074d;

    /* renamed from: e */
    private InterfaceC2337q f9075e;

    /* renamed from: f */
    private int f9076f;

    /* renamed from: g */
    private int f9077g;

    /* renamed from: h */
    private boolean f9078h;

    /* renamed from: i */
    private boolean f9079i;

    /* renamed from: j */
    private long f9080j;

    /* renamed from: k */
    private int f9081k;

    /* renamed from: l */
    private long f9082l;

    public C2317s() {
        this(null);
    }

    public C2317s(String str) {
        this.f9076f = 0;
        this.f9071a = new C2644u(4);
        this.f9071a.f11004a[0] = -1;
        this.f9072b = new C2333m();
        this.f9073c = str;
    }

    /* renamed from: b */
    private void m9636b(C2644u c2644u) {
        byte[] bArr = c2644u.f11004a;
        int m11219d = c2644u.m11219d();
        for (int m11217c = c2644u.m11217c(); m11217c < m11219d; m11217c++) {
            boolean z = (bArr[m11217c] & 255) == 255;
            boolean z2 = this.f9079i && (bArr[m11217c] & 224) == 224;
            this.f9079i = z;
            if (z2) {
                c2644u.m11222e(m11217c + 1);
                this.f9079i = false;
                this.f9071a.f11004a[1] = bArr[m11217c];
                this.f9077g = 2;
                this.f9076f = 1;
                return;
            }
        }
        c2644u.m11222e(m11219d);
    }

    /* renamed from: c */
    private void m9637c(C2644u c2644u) {
        int min = Math.min(c2644u.m11208a(), this.f9081k - this.f9077g);
        this.f9075e.mo9432a(c2644u, min);
        this.f9077g += min;
        int i = this.f9077g;
        int i2 = this.f9081k;
        if (i < i2) {
            return;
        }
        this.f9075e.mo9431a(this.f9082l, 1, i2, 0, null);
        this.f9082l += this.f9080j;
        this.f9077g = 0;
        this.f9076f = 0;
    }

    /* renamed from: d */
    private void m9638d(C2644u c2644u) {
        int min = Math.min(c2644u.m11208a(), 4 - this.f9077g);
        c2644u.m11214a(this.f9071a.f11004a, this.f9077g, min);
        this.f9077g += min;
        if (this.f9077g < 4) {
            return;
        }
        this.f9071a.m11222e(0);
        if (!C2333m.m9694a(this.f9071a.m11226h(), this.f9072b)) {
            this.f9077g = 0;
            this.f9076f = 1;
            return;
        }
        C2333m c2333m = this.f9072b;
        this.f9081k = c2333m.f9160j;
        if (!this.f9078h) {
            int i = c2333m.f9161k;
            this.f9080j = (c2333m.f9164n * 1000000) / i;
            this.f9075e.mo9433a(C2676s.m11426a(this.f9074d, c2333m.f9159i, (String) null, -1, 4096, c2333m.f9162l, i, (List<byte[]>) null, (C2213m) null, 0, this.f9073c));
            this.f9078h = true;
        }
        this.f9071a.m11222e(0);
        this.f9075e.mo9432a(this.f9071a, 4);
        this.f9076f = 2;
    }

    @Override // p139d.p225c.p226a.p227a.p234f.p242h.InterfaceC2310l
    /* renamed from: a */
    public void mo9560a() {
        this.f9076f = 0;
        this.f9077g = 0;
        this.f9079i = false;
    }

    @Override // p139d.p225c.p226a.p227a.p234f.p242h.InterfaceC2310l
    /* renamed from: a */
    public void mo9561a(long j, int i) {
        this.f9082l = j;
    }

    @Override // p139d.p225c.p226a.p227a.p234f.p242h.InterfaceC2310l
    /* renamed from: a */
    public void mo9562a(InterfaceC2325i interfaceC2325i, InterfaceC2296G.d dVar) {
        dVar.m9548a();
        this.f9074d = dVar.m9549b();
        this.f9075e = interfaceC2325i.mo9671a(dVar.m9550c(), 1);
    }

    @Override // p139d.p225c.p226a.p227a.p234f.p242h.InterfaceC2310l
    /* renamed from: a */
    public void mo9563a(C2644u c2644u) {
        while (c2644u.m11208a() > 0) {
            int i = this.f9076f;
            if (i == 0) {
                m9636b(c2644u);
            } else if (i == 1) {
                m9638d(c2644u);
            } else {
                if (i != 2) {
                    throw new IllegalStateException();
                }
                m9637c(c2644u);
            }
        }
    }

    @Override // p139d.p225c.p226a.p227a.p234f.p242h.InterfaceC2310l
    /* renamed from: b */
    public void mo9564b() {
    }
}
