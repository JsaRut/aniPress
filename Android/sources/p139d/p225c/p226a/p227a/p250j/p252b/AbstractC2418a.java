package p139d.p225c.p226a.p227a.p250j.p252b;

import p139d.p225c.p226a.p227a.C2676s;
import p139d.p225c.p226a.p227a.p269m.C2600n;
import p139d.p225c.p226a.p227a.p269m.InterfaceC2597k;

/* renamed from: d.c.a.a.j.b.a */
/* loaded from: classes.dex */
public abstract class AbstractC2418a extends AbstractC2429l {

    /* renamed from: j */
    public final long f9502j;

    /* renamed from: k */
    public final long f9503k;

    /* renamed from: l */
    private C2420c f9504l;

    /* renamed from: m */
    private int[] f9505m;

    public AbstractC2418a(InterfaceC2597k interfaceC2597k, C2600n c2600n, C2676s c2676s, int i, Object obj, long j, long j2, long j3, long j4, long j5) {
        super(interfaceC2597k, c2600n, c2676s, i, obj, j, j2, j5);
        this.f9502j = j3;
        this.f9503k = j4;
    }

    /* renamed from: a */
    public final int m9986a(int i) {
        return this.f9505m[i];
    }

    /* renamed from: a */
    public void m9987a(C2420c c2420c) {
        this.f9504l = c2420c;
        this.f9505m = c2420c.m9991a();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: i */
    public final C2420c m9988i() {
        return this.f9504l;
    }
}
