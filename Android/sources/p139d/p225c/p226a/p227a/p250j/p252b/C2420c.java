package p139d.p225c.p226a.p227a.p250j.p252b;

import p139d.p225c.p226a.p227a.p234f.C2272f;
import p139d.p225c.p226a.p227a.p234f.InterfaceC2337q;
import p139d.p225c.p226a.p227a.p250j.C2403D;
import p139d.p225c.p226a.p227a.p250j.p252b.C2422e;
import p139d.p225c.p226a.p227a.p270n.C2638o;

/* renamed from: d.c.a.a.j.b.c */
/* loaded from: classes.dex */
public final class C2420c implements C2422e.b {

    /* renamed from: a */
    private final int[] f9509a;

    /* renamed from: b */
    private final C2403D[] f9510b;

    public C2420c(int[] iArr, C2403D[] c2403dArr) {
        this.f9509a = iArr;
        this.f9510b = c2403dArr;
    }

    @Override // p139d.p225c.p226a.p227a.p250j.p252b.C2422e.b
    /* renamed from: a */
    public InterfaceC2337q mo9989a(int i, int i2) {
        int i3 = 0;
        while (true) {
            int[] iArr = this.f9509a;
            if (i3 >= iArr.length) {
                C2638o.m11157b("BaseMediaChunkOutput", "Unmatched track of type: " + i2);
                return new C2272f();
            }
            if (i2 == iArr[i3]) {
                return this.f9510b[i3];
            }
            i3++;
        }
    }

    /* renamed from: a */
    public void m9990a(long j) {
        for (C2403D c2403d : this.f9510b) {
            if (c2403d != null) {
                c2403d.m9937a(j);
            }
        }
    }

    /* renamed from: a */
    public int[] m9991a() {
        int[] iArr = new int[this.f9510b.length];
        int i = 0;
        while (true) {
            C2403D[] c2403dArr = this.f9510b;
            if (i >= c2403dArr.length) {
                return iArr;
            }
            if (c2403dArr[i] != null) {
                iArr[i] = c2403dArr[i].m9950i();
            }
            i++;
        }
    }
}
