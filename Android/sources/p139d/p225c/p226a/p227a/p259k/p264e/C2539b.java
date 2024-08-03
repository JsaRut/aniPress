package p139d.p225c.p226a.p227a.p259k.p264e;

import java.util.Collections;
import java.util.List;
import p139d.p225c.p226a.p227a.p259k.C2527b;
import p139d.p225c.p226a.p227a.p259k.InterfaceC2537e;
import p139d.p225c.p226a.p227a.p270n.C2622I;
import p139d.p225c.p226a.p227a.p270n.C2628e;

/* renamed from: d.c.a.a.k.e.b */
/* loaded from: classes.dex */
final class C2539b implements InterfaceC2537e {

    /* renamed from: a */
    private final C2527b[] f10489a;

    /* renamed from: b */
    private final long[] f10490b;

    public C2539b(C2527b[] c2527bArr, long[] jArr) {
        this.f10489a = c2527bArr;
        this.f10490b = jArr;
    }

    @Override // p139d.p225c.p226a.p227a.p259k.InterfaceC2537e
    /* renamed from: a */
    public int mo10603a() {
        return this.f10490b.length;
    }

    @Override // p139d.p225c.p226a.p227a.p259k.InterfaceC2537e
    /* renamed from: a */
    public int mo10604a(long j) {
        int m11042a = C2622I.m11042a(this.f10490b, j, false, false);
        if (m11042a < this.f10490b.length) {
            return m11042a;
        }
        return -1;
    }

    @Override // p139d.p225c.p226a.p227a.p259k.InterfaceC2537e
    /* renamed from: a */
    public long mo10605a(int i) {
        C2628e.m11111a(i >= 0);
        C2628e.m11111a(i < this.f10490b.length);
        return this.f10490b[i];
    }

    @Override // p139d.p225c.p226a.p227a.p259k.InterfaceC2537e
    /* renamed from: b */
    public List<C2527b> mo10606b(long j) {
        int m11079b = C2622I.m11079b(this.f10490b, j, true, false);
        if (m11079b != -1) {
            C2527b[] c2527bArr = this.f10489a;
            if (c2527bArr[m11079b] != null) {
                return Collections.singletonList(c2527bArr[m11079b]);
            }
        }
        return Collections.emptyList();
    }
}
