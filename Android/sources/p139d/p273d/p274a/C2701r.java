package p139d.p273d.p274a;

import p139d.p273d.p274a.C2700q;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: d.d.a.r */
/* loaded from: classes.dex */
public class C2701r implements C2700q.a {

    /* renamed from: a */
    final /* synthetic */ C2702s f11351a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C2701r(C2702s c2702s) {
        this.f11351a = c2702s;
    }

    @Override // p139d.p273d.p274a.C2700q.a
    /* renamed from: a */
    public void mo11620a(C2700q c2700q) {
        this.f11351a.m11528d();
    }

    @Override // p139d.p273d.p274a.C2700q.a
    /* renamed from: b */
    public boolean mo11621b(C2700q c2700q) {
        double d2;
        double d3;
        double d4;
        double d5;
        d2 = this.f11351a.f11352A;
        C2702s c2702s = this.f11351a;
        d3 = c2702s.f11352A;
        c2702s.f11352A = d3 + c2700q.m11618c();
        long m11619d = c2700q.m11619d();
        if (m11619d > 0) {
            C2702s c2702s2 = this.f11351a;
            d5 = c2702s2.f11352A;
            double d6 = d5 - d2;
            double d7 = m11619d;
            Double.isNaN(d7);
            c2702s2.f11353B = d6 / d7;
        }
        d4 = this.f11351a.f11352A;
        if (Math.abs(d4) < 0.08726646259971647d || this.f11351a.m11537k() != 2) {
            return true;
        }
        this.f11351a.m11512a();
        return true;
    }

    @Override // p139d.p273d.p274a.C2700q.a
    /* renamed from: c */
    public boolean mo11622c(C2700q c2700q) {
        return true;
    }
}
