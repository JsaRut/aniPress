package p030b;

import p030b.C0502k;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: b.m */
/* loaded from: classes.dex */
public class C0504m {

    /* renamed from: a */
    private C0502k<?> f2569a;

    public C0504m(C0502k<?> c0502k) {
        this.f2569a = c0502k;
    }

    /* renamed from: a */
    public void m2662a() {
        this.f2569a = null;
    }

    protected void finalize() {
        C0502k.a m2642c;
        try {
            C0502k<?> c0502k = this.f2569a;
            if (c0502k != null && (m2642c = C0502k.m2642c()) != null) {
                m2642c.m2654a(c0502k, new C0505n(c0502k.m2646a()));
            }
        } finally {
            super.finalize();
        }
    }
}
