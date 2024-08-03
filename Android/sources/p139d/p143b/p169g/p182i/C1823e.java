package p139d.p143b.p169g.p182i;

import java.util.ArrayList;
import p139d.p143b.p148c.p152d.C1691j;
import p139d.p143b.p169g.p181h.InterfaceC1816b;

/* renamed from: d.b.g.i.e */
/* loaded from: classes.dex */
public class C1823e<DH extends InterfaceC1816b> {

    /* renamed from: a */
    boolean f6724a = false;

    /* renamed from: b */
    ArrayList<C1820b<DH>> f6725b = new ArrayList<>();

    /* renamed from: a */
    public void m7500a() {
        if (this.f6724a) {
            for (int i = 0; i < this.f6725b.size(); i++) {
                this.f6725b.get(i).m7493e();
            }
        }
        this.f6725b.clear();
    }

    /* renamed from: a */
    public void m7501a(int i, C1820b<DH> c1820b) {
        C1691j.m6971a(c1820b);
        C1691j.m6969a(i, this.f6725b.size() + 1);
        this.f6725b.add(i, c1820b);
        if (this.f6724a) {
            c1820b.m7492d();
        }
    }

    /* renamed from: a */
    public void m7502a(C1820b<DH> c1820b) {
        m7501a(this.f6725b.size(), c1820b);
    }

    /* renamed from: b */
    public void m7503b() {
        if (this.f6724a) {
            return;
        }
        this.f6724a = true;
        for (int i = 0; i < this.f6725b.size(); i++) {
            this.f6725b.get(i).m7492d();
        }
    }

    /* renamed from: c */
    public void m7504c() {
        if (this.f6724a) {
            this.f6724a = false;
            for (int i = 0; i < this.f6725b.size(); i++) {
                this.f6725b.get(i).m7493e();
            }
        }
    }
}
