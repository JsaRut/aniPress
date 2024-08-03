package p139d.p225c.p226a.p227a.p250j.p252b;

import p139d.p225c.p226a.p227a.C2676s;
import p139d.p225c.p226a.p227a.p269m.C2600n;
import p139d.p225c.p226a.p227a.p269m.InterfaceC2597k;
import p139d.p225c.p226a.p227a.p270n.C2628e;

/* renamed from: d.c.a.a.j.b.l */
/* loaded from: classes.dex */
public abstract class AbstractC2429l extends AbstractC2421d {

    /* renamed from: i */
    public final long f9577i;

    public AbstractC2429l(InterfaceC2597k interfaceC2597k, C2600n c2600n, C2676s c2676s, int i, Object obj, long j, long j2, long j3) {
        super(interfaceC2597k, c2600n, 1, c2676s, i, obj, j, j2);
        C2628e.m11110a(c2676s);
        this.f9577i = j3;
    }

    /* renamed from: g */
    public long mo10032g() {
        long j = this.f9577i;
        if (j != -1) {
            return 1 + j;
        }
        return -1L;
    }

    /* renamed from: h */
    public abstract boolean mo10033h();
}
