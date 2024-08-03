package p139d.p225c.p226a.p227a.p259k;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.util.Collections;
import java.util.List;
import p139d.p225c.p226a.p227a.AbstractC2190c;
import p139d.p225c.p226a.p227a.C2399j;
import p139d.p225c.p226a.p227a.C2676s;
import p139d.p225c.p226a.p227a.C2677t;
import p139d.p225c.p226a.p227a.p230c.C2196f;
import p139d.p225c.p226a.p227a.p231d.InterfaceC2215o;
import p139d.p225c.p226a.p227a.p270n.C2622I;
import p139d.p225c.p226a.p227a.p270n.C2628e;
import p139d.p225c.p226a.p227a.p270n.C2641r;

/* renamed from: d.c.a.a.k.m */
/* loaded from: classes.dex */
public final class C2565m extends AbstractC2190c implements Handler.Callback {

    /* renamed from: j */
    private final Handler f10619j;

    /* renamed from: k */
    private final InterfaceC2564l f10620k;

    /* renamed from: l */
    private final InterfaceC2561i f10621l;

    /* renamed from: m */
    private final C2677t f10622m;

    /* renamed from: n */
    private boolean f10623n;

    /* renamed from: o */
    private boolean f10624o;

    /* renamed from: p */
    private int f10625p;

    /* renamed from: q */
    private C2676s f10626q;

    /* renamed from: r */
    private InterfaceC2540f f10627r;

    /* renamed from: s */
    private C2562j f10628s;

    /* renamed from: t */
    private AbstractC2563k f10629t;

    /* renamed from: u */
    private AbstractC2563k f10630u;

    /* renamed from: v */
    private int f10631v;

    @Deprecated
    /* renamed from: d.c.a.a.k.m$a */
    /* loaded from: classes.dex */
    public interface a extends InterfaceC2564l {
    }

    public C2565m(InterfaceC2564l interfaceC2564l, Looper looper) {
        this(interfaceC2564l, looper, InterfaceC2561i.f10615a);
    }

    public C2565m(InterfaceC2564l interfaceC2564l, Looper looper, InterfaceC2561i interfaceC2561i) {
        super(3);
        C2628e.m11110a(interfaceC2564l);
        this.f10620k = interfaceC2564l;
        this.f10619j = looper == null ? null : C2622I.m11048a(looper, (Handler.Callback) this);
        this.f10621l = interfaceC2561i;
        this.f10622m = new C2677t();
    }

    /* renamed from: a */
    private void m10795a(List<C2527b> list) {
        this.f10620k.mo4851a(list);
    }

    /* renamed from: b */
    private void m10796b(List<C2527b> list) {
        Handler handler = this.f10619j;
        if (handler != null) {
            handler.obtainMessage(0, list).sendToTarget();
        } else {
            m10795a(list);
        }
    }

    /* renamed from: v */
    private void m10797v() {
        m10796b(Collections.emptyList());
    }

    /* renamed from: w */
    private long m10798w() {
        int i = this.f10631v;
        if (i == -1 || i >= this.f10629t.mo10603a()) {
            return Long.MAX_VALUE;
        }
        return this.f10629t.mo10605a(this.f10631v);
    }

    /* renamed from: x */
    private void m10799x() {
        this.f10628s = null;
        this.f10631v = -1;
        AbstractC2563k abstractC2563k = this.f10629t;
        if (abstractC2563k != null) {
            abstractC2563k.mo9031f();
            this.f10629t = null;
        }
        AbstractC2563k abstractC2563k2 = this.f10630u;
        if (abstractC2563k2 != null) {
            abstractC2563k2.mo9031f();
            this.f10630u = null;
        }
    }

    /* renamed from: y */
    private void m10800y() {
        m10799x();
        this.f10627r.mo9020a();
        this.f10627r = null;
        this.f10625p = 0;
    }

    /* renamed from: z */
    private void m10801z() {
        m10800y();
        this.f10627r = this.f10621l.mo10716b(this.f10626q);
    }

    @Override // p139d.p225c.p226a.p227a.InterfaceC2144I
    /* renamed from: a */
    public int mo8576a(C2676s c2676s) {
        return this.f10621l.mo10715a(c2676s) ? AbstractC2190c.m8999a((InterfaceC2215o<?>) null, c2676s.f11185j) ? 4 : 2 : C2641r.m11173h(c2676s.f11182g) ? 1 : 0;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // p139d.p225c.p226a.p227a.InterfaceC2143H
    /* renamed from: a */
    public void mo8562a(long j, long j2) {
        boolean z;
        if (this.f10624o) {
            return;
        }
        if (this.f10630u == null) {
            this.f10627r.mo10542a(j);
            try {
                this.f10630u = this.f10627r.mo9022b();
            } catch (C2547g e2) {
                throw C2399j.m9870a(e2, m9003p());
            }
        }
        if (getState() != 2) {
            return;
        }
        if (this.f10629t != null) {
            long m10798w = m10798w();
            z = false;
            while (m10798w <= j) {
                this.f10631v++;
                m10798w = m10798w();
                z = true;
            }
        } else {
            z = false;
        }
        AbstractC2563k abstractC2563k = this.f10630u;
        if (abstractC2563k != null) {
            if (abstractC2563k.m9010d()) {
                if (!z && m10798w() == Long.MAX_VALUE) {
                    if (this.f10625p == 2) {
                        m10801z();
                    } else {
                        m10799x();
                        this.f10624o = true;
                    }
                }
            } else if (this.f10630u.f8043b <= j) {
                AbstractC2563k abstractC2563k2 = this.f10629t;
                if (abstractC2563k2 != null) {
                    abstractC2563k2.mo9031f();
                }
                this.f10629t = this.f10630u;
                this.f10630u = null;
                this.f10631v = this.f10629t.mo10604a(j);
                z = true;
            }
        }
        if (z) {
            m10796b(this.f10629t.mo10606b(j));
        }
        if (this.f10625p == 2) {
            return;
        }
        while (!this.f10623n) {
            try {
                if (this.f10628s == null) {
                    this.f10628s = this.f10627r.mo9023c();
                    if (this.f10628s == null) {
                        return;
                    }
                }
                if (this.f10625p == 1) {
                    this.f10628s.m9012e(4);
                    this.f10627r.mo9021a((InterfaceC2540f) this.f10628s);
                    this.f10628s = null;
                    this.f10625p = 2;
                    return;
                }
                int m9000a = m9000a(this.f10622m, (C2196f) this.f10628s, false);
                if (m9000a == -4) {
                    if (this.f10628s.m9010d()) {
                        this.f10623n = true;
                    } else {
                        this.f10628s.f10616f = this.f10622m.f11202a.f11186k;
                        this.f10628s.m9027f();
                    }
                    this.f10627r.mo9021a((InterfaceC2540f) this.f10628s);
                    this.f10628s = null;
                } else if (m9000a == -3) {
                    return;
                }
            } catch (C2547g e3) {
                throw C2399j.m9870a(e3, m9003p());
            }
        }
    }

    @Override // p139d.p225c.p226a.p227a.AbstractC2190c
    /* renamed from: a */
    protected void mo8779a(long j, boolean z) {
        m10797v();
        this.f10623n = false;
        this.f10624o = false;
        if (this.f10625p != 0) {
            m10801z();
        } else {
            m10799x();
            this.f10627r.flush();
        }
    }

    @Override // p139d.p225c.p226a.p227a.AbstractC2190c
    /* renamed from: a */
    public void mo8785a(C2676s[] c2676sArr, long j) {
        this.f10626q = c2676sArr[0];
        if (this.f10627r != null) {
            this.f10625p = 1;
        } else {
            this.f10627r = this.f10621l.mo10716b(this.f10626q);
        }
    }

    @Override // p139d.p225c.p226a.p227a.InterfaceC2143H
    /* renamed from: c */
    public boolean mo8565c() {
        return true;
    }

    @Override // p139d.p225c.p226a.p227a.InterfaceC2143H
    /* renamed from: d */
    public boolean mo8566d() {
        return this.f10624o;
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(Message message) {
        if (message.what != 0) {
            throw new IllegalStateException();
        }
        m10795a((List<C2527b>) message.obj);
        return true;
    }

    @Override // p139d.p225c.p226a.p227a.AbstractC2190c
    /* renamed from: s */
    protected void mo8791s() {
        this.f10626q = null;
        m10797v();
        m10800y();
    }
}
