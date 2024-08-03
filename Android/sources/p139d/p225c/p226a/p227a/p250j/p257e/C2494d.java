package p139d.p225c.p226a.p227a.p250j.p257e;

import android.util.Base64;
import java.util.ArrayList;
import p139d.p225c.p226a.p227a.C2147L;
import p139d.p225c.p226a.p227a.p234f.p239e.C2269n;
import p139d.p225c.p226a.p227a.p250j.C2411L;
import p139d.p225c.p226a.p227a.p250j.C2413N;
import p139d.p225c.p226a.p227a.p250j.InterfaceC2404E;
import p139d.p225c.p226a.p227a.p250j.InterfaceC2405F;
import p139d.p225c.p226a.p227a.p250j.InterfaceC2508r;
import p139d.p225c.p226a.p227a.p250j.InterfaceC2514x;
import p139d.p225c.p226a.p227a.p250j.InterfaceC2516z;
import p139d.p225c.p226a.p227a.p250j.p252b.C2424g;
import p139d.p225c.p226a.p227a.p250j.p257e.InterfaceC2493c;
import p139d.p225c.p226a.p227a.p250j.p257e.p258a.C2489a;
import p139d.p225c.p226a.p227a.p268l.InterfaceC2577k;
import p139d.p225c.p226a.p227a.p269m.InterfaceC2582A;
import p139d.p225c.p226a.p227a.p269m.InterfaceC2586E;
import p139d.p225c.p226a.p227a.p269m.InterfaceC2590d;
import p139d.p225c.p226a.p227a.p269m.InterfaceC2610x;

/* renamed from: d.c.a.a.j.e.d */
/* loaded from: classes.dex */
final class C2494d implements InterfaceC2514x, InterfaceC2405F.a<C2424g<InterfaceC2493c>> {

    /* renamed from: a */
    private final InterfaceC2493c.a f10123a;

    /* renamed from: b */
    private final InterfaceC2586E f10124b;

    /* renamed from: c */
    private final InterfaceC2582A f10125c;

    /* renamed from: d */
    private final InterfaceC2610x f10126d;

    /* renamed from: e */
    private final InterfaceC2516z.a f10127e;

    /* renamed from: f */
    private final InterfaceC2590d f10128f;

    /* renamed from: g */
    private final C2413N f10129g;

    /* renamed from: h */
    private final C2269n[] f10130h;

    /* renamed from: i */
    private final InterfaceC2508r f10131i;

    /* renamed from: j */
    private InterfaceC2514x.a f10132j;

    /* renamed from: k */
    private C2489a f10133k;

    /* renamed from: l */
    private C2424g<InterfaceC2493c>[] f10134l;

    /* renamed from: m */
    private InterfaceC2405F f10135m;

    /* renamed from: n */
    private boolean f10136n;

    public C2494d(C2489a c2489a, InterfaceC2493c.a aVar, InterfaceC2586E interfaceC2586E, InterfaceC2508r interfaceC2508r, InterfaceC2610x interfaceC2610x, InterfaceC2516z.a aVar2, InterfaceC2582A interfaceC2582A, InterfaceC2590d interfaceC2590d) {
        this.f10123a = aVar;
        this.f10124b = interfaceC2586E;
        this.f10125c = interfaceC2582A;
        this.f10126d = interfaceC2610x;
        this.f10127e = aVar2;
        this.f10128f = interfaceC2590d;
        this.f10131i = interfaceC2508r;
        this.f10129g = m10423b(c2489a);
        C2489a.a aVar3 = c2489a.f10058e;
        this.f10130h = aVar3 != null ? new C2269n[]{new C2269n(true, null, 8, m10421a(aVar3.f10063b), 0, 0, null)} : null;
        this.f10133k = c2489a;
        this.f10134l = m10422a(0);
        this.f10135m = interfaceC2508r.mo10449a(this.f10134l);
        aVar2.m10491a();
    }

    /* renamed from: a */
    private C2424g<InterfaceC2493c> m10419a(InterfaceC2577k interfaceC2577k, long j) {
        int m9977a = this.f10129g.m9977a(interfaceC2577k.mo10815a());
        return new C2424g<>(this.f10133k.f10059f[m9977a].f10064a, null, null, this.f10123a.mo10418a(this.f10125c, this.f10133k, m9977a, interfaceC2577k, this.f10130h, this.f10124b), this, this.f10128f, j, this.f10126d, this.f10127e);
    }

    /* renamed from: a */
    private static void m10420a(byte[] bArr, int i, int i2) {
        byte b2 = bArr[i];
        bArr[i] = bArr[i2];
        bArr[i2] = b2;
    }

    /* renamed from: a */
    private static byte[] m10421a(byte[] bArr) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < bArr.length; i += 2) {
            sb.append((char) bArr[i]);
        }
        String sb2 = sb.toString();
        byte[] decode = Base64.decode(sb2.substring(sb2.indexOf("<KID>") + 5, sb2.indexOf("</KID>")), 0);
        m10420a(decode, 0, 3);
        m10420a(decode, 1, 2);
        m10420a(decode, 4, 5);
        m10420a(decode, 6, 7);
        return decode;
    }

    /* renamed from: a */
    private static C2424g<InterfaceC2493c>[] m10422a(int i) {
        return new C2424g[i];
    }

    /* renamed from: b */
    private static C2413N m10423b(C2489a c2489a) {
        C2411L[] c2411lArr = new C2411L[c2489a.f10059f.length];
        int i = 0;
        while (true) {
            C2489a.b[] bVarArr = c2489a.f10059f;
            if (i >= bVarArr.length) {
                return new C2413N(c2411lArr);
            }
            c2411lArr[i] = new C2411L(bVarArr[i].f10073j);
            i++;
        }
    }

    @Override // p139d.p225c.p226a.p227a.p250j.InterfaceC2514x
    /* renamed from: a */
    public long mo9874a(long j) {
        for (C2424g<InterfaceC2493c> c2424g : this.f10134l) {
            c2424g.m10016a(j);
        }
        return j;
    }

    @Override // p139d.p225c.p226a.p227a.p250j.InterfaceC2514x
    /* renamed from: a */
    public long mo9875a(long j, C2147L c2147l) {
        for (C2424g<InterfaceC2493c> c2424g : this.f10134l) {
            if (c2424g.f9537a == 2) {
                return c2424g.m10014a(j, c2147l);
            }
        }
        return j;
    }

    @Override // p139d.p225c.p226a.p227a.p250j.InterfaceC2514x
    /* renamed from: a */
    public long mo9876a(InterfaceC2577k[] interfaceC2577kArr, boolean[] zArr, InterfaceC2404E[] interfaceC2404EArr, boolean[] zArr2, long j) {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < interfaceC2577kArr.length; i++) {
            if (interfaceC2404EArr[i] != null) {
                C2424g c2424g = (C2424g) interfaceC2404EArr[i];
                if (interfaceC2577kArr[i] == null || !zArr[i]) {
                    c2424g.m10022k();
                    interfaceC2404EArr[i] = null;
                } else {
                    arrayList.add(c2424g);
                }
            }
            if (interfaceC2404EArr[i] == null && interfaceC2577kArr[i] != null) {
                C2424g<InterfaceC2493c> m10419a = m10419a(interfaceC2577kArr[i], j);
                arrayList.add(m10419a);
                interfaceC2404EArr[i] = m10419a;
                zArr2[i] = true;
            }
        }
        this.f10134l = m10422a(arrayList.size());
        arrayList.toArray(this.f10134l);
        this.f10135m = this.f10131i.mo10449a(this.f10134l);
        return j;
    }

    @Override // p139d.p225c.p226a.p227a.p250j.InterfaceC2514x
    /* renamed from: a */
    public void mo9877a(long j, boolean z) {
        for (C2424g<InterfaceC2493c> c2424g : this.f10134l) {
            c2424g.m10017a(j, z);
        }
    }

    @Override // p139d.p225c.p226a.p227a.p250j.InterfaceC2405F.a
    /* renamed from: a, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public void mo9878a(C2424g<InterfaceC2493c> c2424g) {
        this.f10132j.mo9878a((InterfaceC2514x.a) this);
    }

    /* renamed from: a */
    public void m10424a(C2489a c2489a) {
        this.f10133k = c2489a;
        for (C2424g<InterfaceC2493c> c2424g : this.f10134l) {
            c2424g.m10020i().mo10417a(c2489a);
        }
        this.f10132j.mo9878a((InterfaceC2514x.a) this);
    }

    @Override // p139d.p225c.p226a.p227a.p250j.InterfaceC2514x
    /* renamed from: a */
    public void mo9879a(InterfaceC2514x.a aVar, long j) {
        this.f10132j = aVar;
        aVar.mo10485a((InterfaceC2514x) this);
    }

    @Override // p139d.p225c.p226a.p227a.p250j.InterfaceC2514x, p139d.p225c.p226a.p227a.p250j.InterfaceC2405F
    /* renamed from: b */
    public long mo9880b() {
        return this.f10135m.mo9880b();
    }

    @Override // p139d.p225c.p226a.p227a.p250j.InterfaceC2514x, p139d.p225c.p226a.p227a.p250j.InterfaceC2405F
    /* renamed from: b */
    public boolean mo9882b(long j) {
        return this.f10135m.mo9882b(j);
    }

    /* renamed from: c */
    public void m10425c() {
        for (C2424g<InterfaceC2493c> c2424g : this.f10134l) {
            c2424g.m10022k();
        }
        this.f10132j = null;
        this.f10127e.m10510b();
    }

    @Override // p139d.p225c.p226a.p227a.p250j.InterfaceC2514x, p139d.p225c.p226a.p227a.p250j.InterfaceC2405F
    /* renamed from: c */
    public void mo9883c(long j) {
        this.f10135m.mo9883c(j);
    }

    @Override // p139d.p225c.p226a.p227a.p250j.InterfaceC2514x
    /* renamed from: d */
    public void mo9884d() {
        this.f10125c.mo10177a();
    }

    @Override // p139d.p225c.p226a.p227a.p250j.InterfaceC2514x
    /* renamed from: e */
    public long mo9885e() {
        if (this.f10136n) {
            return -9223372036854775807L;
        }
        this.f10127e.m10517c();
        this.f10136n = true;
        return -9223372036854775807L;
    }

    @Override // p139d.p225c.p226a.p227a.p250j.InterfaceC2514x
    /* renamed from: f */
    public C2413N mo9886f() {
        return this.f10129g;
    }

    @Override // p139d.p225c.p226a.p227a.p250j.InterfaceC2514x, p139d.p225c.p226a.p227a.p250j.InterfaceC2405F
    /* renamed from: g */
    public long mo9887g() {
        return this.f10135m.mo9887g();
    }
}
