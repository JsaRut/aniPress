package p139d.p225c.p226a.p227a.p250j.p255d;

import android.util.SparseArray;
import p139d.p225c.p226a.p227a.p270n.C2619F;

/* renamed from: d.c.a.a.j.d.p */
/* loaded from: classes.dex */
public final class C2485p {

    /* renamed from: a */
    private final SparseArray<C2619F> f10040a = new SparseArray<>();

    /* renamed from: a */
    public C2619F m10384a(int i) {
        C2619F c2619f = this.f10040a.get(i);
        if (c2619f != null) {
            return c2619f;
        }
        C2619F c2619f2 = new C2619F(Long.MAX_VALUE);
        this.f10040a.put(i, c2619f2);
        return c2619f2;
    }

    /* renamed from: a */
    public void m10385a() {
        this.f10040a.clear();
    }
}
