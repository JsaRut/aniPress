package p000a.p005b.p022d.p029e;

import android.view.View;
import p000a.p005b.p009c.p019h.C0076J;
import p000a.p005b.p009c.p019h.InterfaceC0075I;

/* renamed from: a.b.d.e.h */
/* loaded from: classes.dex */
public class C0137h extends C0076J {

    /* renamed from: a */
    private boolean f550a = false;

    /* renamed from: b */
    private int f551b = 0;

    /* renamed from: c */
    final /* synthetic */ C0138i f552c;

    public C0137h(C0138i c0138i) {
        this.f552c = c0138i;
    }

    /* renamed from: a */
    void m666a() {
        this.f551b = 0;
        this.f550a = false;
        this.f552c.m673b();
    }

    @Override // p000a.p005b.p009c.p019h.InterfaceC0075I
    /* renamed from: b */
    public void mo349b(View view) {
        int i = this.f551b + 1;
        this.f551b = i;
        if (i == this.f552c.f553a.size()) {
            InterfaceC0075I interfaceC0075I = this.f552c.f556d;
            if (interfaceC0075I != null) {
                interfaceC0075I.mo349b(null);
            }
            m666a();
        }
    }

    @Override // p000a.p005b.p009c.p019h.C0076J, p000a.p005b.p009c.p019h.InterfaceC0075I
    /* renamed from: c */
    public void mo350c(View view) {
        if (this.f550a) {
            return;
        }
        this.f550a = true;
        InterfaceC0075I interfaceC0075I = this.f552c.f556d;
        if (interfaceC0075I != null) {
            interfaceC0075I.mo350c(null);
        }
    }
}
