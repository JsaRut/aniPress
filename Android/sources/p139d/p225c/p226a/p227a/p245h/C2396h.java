package p139d.p225c.p226a.p227a.p245h;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.util.Arrays;
import p139d.p225c.p226a.p227a.AbstractC2190c;
import p139d.p225c.p226a.p227a.C2676s;
import p139d.p225c.p226a.p227a.C2677t;
import p139d.p225c.p226a.p227a.p230c.C2196f;
import p139d.p225c.p226a.p227a.p231d.InterfaceC2215o;
import p139d.p225c.p226a.p227a.p270n.C2622I;
import p139d.p225c.p226a.p227a.p270n.C2628e;

/* renamed from: d.c.a.a.h.h */
/* loaded from: classes.dex */
public final class C2396h extends AbstractC2190c implements Handler.Callback {

    /* renamed from: j */
    private final InterfaceC2393e f9365j;

    /* renamed from: k */
    private final InterfaceC2395g f9366k;

    /* renamed from: l */
    private final Handler f9367l;

    /* renamed from: m */
    private final C2677t f9368m;

    /* renamed from: n */
    private final C2394f f9369n;

    /* renamed from: o */
    private final C2353b[] f9370o;

    /* renamed from: p */
    private final long[] f9371p;

    /* renamed from: q */
    private int f9372q;

    /* renamed from: r */
    private int f9373r;

    /* renamed from: s */
    private InterfaceC2379c f9374s;

    /* renamed from: t */
    private boolean f9375t;

    @Deprecated
    /* renamed from: d.c.a.a.h.h$a */
    /* loaded from: classes.dex */
    public interface a extends InterfaceC2395g {
    }

    public C2396h(InterfaceC2395g interfaceC2395g, Looper looper) {
        this(interfaceC2395g, looper, InterfaceC2393e.f9363a);
    }

    public C2396h(InterfaceC2395g interfaceC2395g, Looper looper, InterfaceC2393e interfaceC2393e) {
        super(4);
        C2628e.m11110a(interfaceC2395g);
        this.f9366k = interfaceC2395g;
        this.f9367l = looper == null ? null : C2622I.m11048a(looper, (Handler.Callback) this);
        C2628e.m11110a(interfaceC2393e);
        this.f9365j = interfaceC2393e;
        this.f9368m = new C2677t();
        this.f9369n = new C2394f();
        this.f9370o = new C2353b[5];
        this.f9371p = new long[5];
    }

    /* renamed from: a */
    private void m9859a(C2353b c2353b) {
        Handler handler = this.f9367l;
        if (handler != null) {
            handler.obtainMessage(0, c2353b).sendToTarget();
        } else {
            m9860b(c2353b);
        }
    }

    /* renamed from: b */
    private void m9860b(C2353b c2353b) {
        this.f9366k.mo4927a(c2353b);
    }

    /* renamed from: v */
    private void m9861v() {
        Arrays.fill(this.f9370o, (Object) null);
        this.f9372q = 0;
        this.f9373r = 0;
    }

    @Override // p139d.p225c.p226a.p227a.InterfaceC2144I
    /* renamed from: a */
    public int mo8576a(C2676s c2676s) {
        if (this.f9365j.mo9857a(c2676s)) {
            return AbstractC2190c.m8999a((InterfaceC2215o<?>) null, c2676s.f11185j) ? 4 : 2;
        }
        return 0;
    }

    @Override // p139d.p225c.p226a.p227a.InterfaceC2143H
    /* renamed from: a */
    public void mo8562a(long j, long j2) {
        if (!this.f9375t && this.f9373r < 5) {
            this.f9369n.mo9006b();
            if (m9000a(this.f9368m, (C2196f) this.f9369n, false) == -4) {
                if (this.f9369n.m9010d()) {
                    this.f9375t = true;
                } else if (!this.f9369n.m9009c()) {
                    C2394f c2394f = this.f9369n;
                    c2394f.f9364f = this.f9368m.f11202a.f11186k;
                    c2394f.m9027f();
                    int i = (this.f9372q + this.f9373r) % 5;
                    C2353b mo9806a = this.f9374s.mo9806a(this.f9369n);
                    if (mo9806a != null) {
                        this.f9370o[i] = mo9806a;
                        this.f9371p[i] = this.f9369n.f8041d;
                        this.f9373r++;
                    }
                }
            }
        }
        if (this.f9373r > 0) {
            long[] jArr = this.f9371p;
            int i2 = this.f9372q;
            if (jArr[i2] <= j) {
                m9859a(this.f9370o[i2]);
                C2353b[] c2353bArr = this.f9370o;
                int i3 = this.f9372q;
                c2353bArr[i3] = null;
                this.f9372q = (i3 + 1) % 5;
                this.f9373r--;
            }
        }
    }

    @Override // p139d.p225c.p226a.p227a.AbstractC2190c
    /* renamed from: a */
    protected void mo8779a(long j, boolean z) {
        m9861v();
        this.f9375t = false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p139d.p225c.p226a.p227a.AbstractC2190c
    /* renamed from: a */
    public void mo8785a(C2676s[] c2676sArr, long j) {
        this.f9374s = this.f9365j.mo9858b(c2676sArr[0]);
    }

    @Override // p139d.p225c.p226a.p227a.InterfaceC2143H
    /* renamed from: c */
    public boolean mo8565c() {
        return true;
    }

    @Override // p139d.p225c.p226a.p227a.InterfaceC2143H
    /* renamed from: d */
    public boolean mo8566d() {
        return this.f9375t;
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(Message message) {
        if (message.what != 0) {
            throw new IllegalStateException();
        }
        m9860b((C2353b) message.obj);
        return true;
    }

    @Override // p139d.p225c.p226a.p227a.AbstractC2190c
    /* renamed from: s */
    protected void mo8791s() {
        m9861v();
        this.f9374s = null;
    }
}
