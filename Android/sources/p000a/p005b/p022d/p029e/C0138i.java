package p000a.p005b.p022d.p029e;

import android.view.animation.Interpolator;
import java.util.ArrayList;
import java.util.Iterator;
import p000a.p005b.p009c.p019h.C0074H;
import p000a.p005b.p009c.p019h.C0076J;
import p000a.p005b.p009c.p019h.InterfaceC0075I;

/* renamed from: a.b.d.e.i */
/* loaded from: classes.dex */
public class C0138i {

    /* renamed from: c */
    private Interpolator f555c;

    /* renamed from: d */
    InterfaceC0075I f556d;

    /* renamed from: e */
    private boolean f557e;

    /* renamed from: b */
    private long f554b = -1;

    /* renamed from: f */
    private final C0076J f558f = new C0137h(this);

    /* renamed from: a */
    final ArrayList<C0074H> f553a = new ArrayList<>();

    /* renamed from: a */
    public C0138i m667a(long j) {
        if (!this.f557e) {
            this.f554b = j;
        }
        return this;
    }

    /* renamed from: a */
    public C0138i m668a(C0074H c0074h) {
        if (!this.f557e) {
            this.f553a.add(c0074h);
        }
        return this;
    }

    /* renamed from: a */
    public C0138i m669a(C0074H c0074h, C0074H c0074h2) {
        this.f553a.add(c0074h);
        c0074h2.m346b(c0074h.m344b());
        this.f553a.add(c0074h2);
        return this;
    }

    /* renamed from: a */
    public C0138i m670a(InterfaceC0075I interfaceC0075I) {
        if (!this.f557e) {
            this.f556d = interfaceC0075I;
        }
        return this;
    }

    /* renamed from: a */
    public C0138i m671a(Interpolator interpolator) {
        if (!this.f557e) {
            this.f555c = interpolator;
        }
        return this;
    }

    /* renamed from: a */
    public void m672a() {
        if (this.f557e) {
            Iterator<C0074H> it = this.f553a.iterator();
            while (it.hasNext()) {
                it.next().m343a();
            }
            this.f557e = false;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public void m673b() {
        this.f557e = false;
    }

    /* renamed from: c */
    public void m674c() {
        if (this.f557e) {
            return;
        }
        Iterator<C0074H> it = this.f553a.iterator();
        while (it.hasNext()) {
            C0074H next = it.next();
            long j = this.f554b;
            if (j >= 0) {
                next.m339a(j);
            }
            Interpolator interpolator = this.f555c;
            if (interpolator != null) {
                next.m342a(interpolator);
            }
            if (this.f556d != null) {
                next.m340a(this.f558f);
            }
            next.m347c();
        }
        this.f557e = true;
    }
}
