package p139d.p143b.p208m.p209a;

import android.view.View;

/* renamed from: d.b.m.a.a */
/* loaded from: classes.dex */
public abstract class AbstractC2062a {

    /* renamed from: a */
    private final int f7503a;

    /* renamed from: b */
    private final InterfaceC2064c f7504b;

    /* renamed from: c */
    private volatile boolean f7505c;

    /* renamed from: d */
    private volatile boolean f7506d;

    /* renamed from: e */
    private InterfaceC2063b f7507e;

    /* renamed from: f */
    private View f7508f;

    /* renamed from: a */
    public final void m8426a() {
        if (this.f7506d || this.f7505c) {
            return;
        }
        this.f7505c = true;
        InterfaceC2063b interfaceC2063b = this.f7507e;
        if (interfaceC2063b != null) {
            interfaceC2063b.onCancel();
        }
    }

    /* renamed from: a */
    public final void m8427a(View view) {
        this.f7508f = view;
        this.f7504b.m8431a(view);
        m8430c();
    }

    /* renamed from: a */
    public void m8428a(InterfaceC2063b interfaceC2063b) {
        this.f7507e = interfaceC2063b;
    }

    /* renamed from: b */
    public int m8429b() {
        return this.f7503a;
    }

    /* renamed from: c */
    public abstract void m8430c();
}
