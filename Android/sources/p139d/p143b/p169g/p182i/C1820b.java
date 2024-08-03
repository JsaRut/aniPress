package p139d.p143b.p169g.p182i;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import p139d.p143b.p148c.p152d.C1690i;
import p139d.p143b.p148c.p152d.C1691j;
import p139d.p143b.p148c.p153e.C1700a;
import p139d.p143b.p169g.p174b.C1771c;
import p139d.p143b.p169g.p178e.InterfaceC1807w;
import p139d.p143b.p169g.p178e.InterfaceC1808x;
import p139d.p143b.p169g.p181h.InterfaceC1815a;
import p139d.p143b.p169g.p181h.InterfaceC1816b;

/* renamed from: d.b.g.i.b */
/* loaded from: classes.dex */
public class C1820b<DH extends InterfaceC1816b> implements InterfaceC1808x {

    /* renamed from: d */
    private DH f6715d;

    /* renamed from: a */
    private boolean f6712a = false;

    /* renamed from: b */
    private boolean f6713b = false;

    /* renamed from: c */
    private boolean f6714c = true;

    /* renamed from: e */
    private InterfaceC1815a f6716e = null;

    /* renamed from: f */
    private final C1771c f6717f = C1771c.m7253a();

    public C1820b(DH dh) {
        if (dh != null) {
            m7488a((C1820b<DH>) dh);
        }
    }

    /* renamed from: a */
    public static <DH extends InterfaceC1816b> C1820b<DH> m7479a(DH dh, Context context) {
        C1820b<DH> c1820b = new C1820b<>(dh);
        c1820b.m7486a(context);
        return c1820b;
    }

    /* renamed from: a */
    private void m7480a(InterfaceC1808x interfaceC1808x) {
        Object m7491c = m7491c();
        if (m7491c instanceof InterfaceC1807w) {
            ((InterfaceC1807w) m7491c).mo7395a(interfaceC1808x);
        }
    }

    /* renamed from: f */
    private void m7481f() {
        if (this.f6712a) {
            return;
        }
        this.f6717f.m7254a(C1771c.a.ON_ATTACH_CONTROLLER);
        this.f6712a = true;
        InterfaceC1815a interfaceC1815a = this.f6716e;
        if (interfaceC1815a == null || interfaceC1815a.mo7283c() == null) {
            return;
        }
        this.f6716e.mo7285e();
    }

    /* renamed from: g */
    private void m7482g() {
        if (this.f6713b && this.f6714c) {
            m7481f();
        } else {
            m7483h();
        }
    }

    /* renamed from: h */
    private void m7483h() {
        if (this.f6712a) {
            this.f6717f.m7254a(C1771c.a.ON_DETACH_CONTROLLER);
            this.f6712a = false;
            if (m7484i()) {
                this.f6716e.mo7280b();
            }
        }
    }

    /* renamed from: i */
    private boolean m7484i() {
        InterfaceC1815a interfaceC1815a = this.f6716e;
        return interfaceC1815a != null && interfaceC1815a.mo7283c() == this.f6715d;
    }

    /* renamed from: a */
    public InterfaceC1815a m7485a() {
        return this.f6716e;
    }

    /* renamed from: a */
    public void m7486a(Context context) {
    }

    /* renamed from: a */
    public void m7487a(InterfaceC1815a interfaceC1815a) {
        boolean z = this.f6712a;
        if (z) {
            m7483h();
        }
        if (m7484i()) {
            this.f6717f.m7254a(C1771c.a.ON_CLEAR_OLD_CONTROLLER);
            this.f6716e.mo7222a((InterfaceC1816b) null);
        }
        this.f6716e = interfaceC1815a;
        if (this.f6716e != null) {
            this.f6717f.m7254a(C1771c.a.ON_SET_CONTROLLER);
            this.f6716e.mo7222a(this.f6715d);
        } else {
            this.f6717f.m7254a(C1771c.a.ON_CLEAR_CONTROLLER);
        }
        if (z) {
            m7481f();
        }
    }

    /* renamed from: a */
    public void m7488a(DH dh) {
        this.f6717f.m7254a(C1771c.a.ON_SET_HIERARCHY);
        boolean m7484i = m7484i();
        m7480a((InterfaceC1808x) null);
        C1691j.m6971a(dh);
        this.f6715d = dh;
        Drawable mo7408a = this.f6715d.mo7408a();
        mo7396a(mo7408a == null || mo7408a.isVisible());
        m7480a(this);
        if (m7484i) {
            this.f6716e.mo7222a(dh);
        }
    }

    @Override // p139d.p143b.p169g.p178e.InterfaceC1808x
    /* renamed from: a */
    public void mo7396a(boolean z) {
        if (this.f6714c == z) {
            return;
        }
        this.f6717f.m7254a(z ? C1771c.a.ON_DRAWABLE_SHOW : C1771c.a.ON_DRAWABLE_HIDE);
        this.f6714c = z;
        m7482g();
    }

    /* renamed from: a */
    public boolean m7489a(MotionEvent motionEvent) {
        if (m7484i()) {
            return this.f6716e.mo7278a(motionEvent);
        }
        return false;
    }

    /* renamed from: b */
    public DH m7490b() {
        DH dh = this.f6715d;
        C1691j.m6971a(dh);
        return dh;
    }

    /* renamed from: c */
    public Drawable m7491c() {
        DH dh = this.f6715d;
        if (dh == null) {
            return null;
        }
        return dh.mo7408a();
    }

    /* renamed from: d */
    public void m7492d() {
        this.f6717f.m7254a(C1771c.a.ON_HOLDER_ATTACH);
        this.f6713b = true;
        m7482g();
    }

    /* renamed from: e */
    public void m7493e() {
        this.f6717f.m7254a(C1771c.a.ON_HOLDER_DETACH);
        this.f6713b = false;
        m7482g();
    }

    @Override // p139d.p143b.p169g.p178e.InterfaceC1808x
    public void onDraw() {
        if (this.f6712a) {
            return;
        }
        C1700a.m7011c((Class<?>) C1771c.class, "%x: Draw requested for a non-attached controller %x. %s", Integer.valueOf(System.identityHashCode(this)), Integer.valueOf(System.identityHashCode(this.f6716e)), toString());
        this.f6713b = true;
        this.f6714c = true;
        m7482g();
    }

    public String toString() {
        C1690i.a m6961a = C1690i.m6961a(this);
        m6961a.m6968a("controllerAttached", this.f6712a);
        m6961a.m6968a("holderAttached", this.f6713b);
        m6961a.m6968a("drawableVisible", this.f6714c);
        m6961a.m6967a("events", this.f6717f.toString());
        return m6961a.toString();
    }
}
