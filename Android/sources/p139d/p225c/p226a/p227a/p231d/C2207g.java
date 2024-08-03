package p139d.p225c.p226a.p227a.p231d;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.media.NotProvisionedException;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.util.Pair;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import p139d.p225c.p226a.p227a.C2200d;
import p139d.p225c.p226a.p227a.p231d.C2213m;
import p139d.p225c.p226a.p227a.p231d.InterfaceC2214n;
import p139d.p225c.p226a.p227a.p231d.InterfaceC2217q;
import p139d.p225c.p226a.p227a.p231d.InterfaceC2218r;
import p139d.p225c.p226a.p227a.p270n.C2635l;
import p139d.p225c.p226a.p227a.p270n.C2638o;

/* JADX INFO: Access modifiers changed from: package-private */
@TargetApi(18)
/* renamed from: d.c.a.a.d.g */
/* loaded from: classes.dex */
public class C2207g<T extends InterfaceC2217q> implements InterfaceC2214n<T> {

    /* renamed from: a */
    public final List<C2213m.a> f8070a;

    /* renamed from: b */
    private final InterfaceC2218r<T> f8071b;

    /* renamed from: c */
    private final c<T> f8072c;

    /* renamed from: d */
    private final int f8073d;

    /* renamed from: e */
    private final HashMap<String, String> f8074e;

    /* renamed from: f */
    private final C2635l<InterfaceC2208h> f8075f;

    /* renamed from: g */
    private final int f8076g;

    /* renamed from: h */
    final InterfaceC2221u f8077h;

    /* renamed from: i */
    final UUID f8078i;

    /* renamed from: j */
    final C2207g<T>.b f8079j;

    /* renamed from: k */
    private int f8080k;

    /* renamed from: l */
    private int f8081l;

    /* renamed from: m */
    private HandlerThread f8082m;

    /* renamed from: n */
    private C2207g<T>.a f8083n;

    /* renamed from: o */
    private T f8084o;

    /* renamed from: p */
    private InterfaceC2214n.a f8085p;

    /* renamed from: q */
    private byte[] f8086q;

    /* renamed from: r */
    private byte[] f8087r;

    /* renamed from: s */
    private InterfaceC2218r.a f8088s;

    /* renamed from: t */
    private InterfaceC2218r.b f8089t;

    /* JADX INFO: Access modifiers changed from: private */
    @SuppressLint({"HandlerLeak"})
    /* renamed from: d.c.a.a.d.g$a */
    /* loaded from: classes.dex */
    public class a extends Handler {
        public a(Looper looper) {
            super(looper);
        }

        /* renamed from: a */
        private long m9075a(int i) {
            return Math.min((i - 1) * 1000, 5000);
        }

        /* renamed from: a */
        private boolean m9076a(Message message) {
            int i;
            if (!(message.arg1 == 1) || (i = message.arg2 + 1) > C2207g.this.f8076g) {
                return false;
            }
            Message obtain = Message.obtain(message);
            obtain.arg2 = i;
            sendMessageDelayed(obtain, m9075a(i));
            return true;
        }

        /* renamed from: a */
        void m9077a(int i, Object obj, boolean z) {
            obtainMessage(i, z ? 1 : 0, 0, obj).sendToTarget();
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            Object obj = message.obj;
            try {
                int i = message.what;
                if (i == 0) {
                    e = C2207g.this.f8077h.m9110a(C2207g.this.f8078i, (InterfaceC2218r.b) obj);
                } else {
                    if (i != 1) {
                        throw new RuntimeException();
                    }
                    e = C2207g.this.f8077h.m9109a(C2207g.this.f8078i, (InterfaceC2218r.a) obj);
                }
            } catch (Exception e2) {
                e = e2;
                if (m9076a(message)) {
                    return;
                }
            }
            C2207g.this.f8079j.obtainMessage(message.what, Pair.create(obj, e)).sendToTarget();
        }
    }

    @SuppressLint({"HandlerLeak"})
    /* renamed from: d.c.a.a.d.g$b */
    /* loaded from: classes.dex */
    private class b extends Handler {
        public b(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            Pair pair = (Pair) message.obj;
            Object obj = pair.first;
            Object obj2 = pair.second;
            int i = message.what;
            if (i == 0) {
                C2207g.this.m9058b(obj, obj2);
            } else {
                if (i != 1) {
                    return;
                }
                C2207g.this.m9054a(obj, obj2);
            }
        }
    }

    /* renamed from: d.c.a.a.d.g$c */
    /* loaded from: classes.dex */
    public interface c<T extends InterfaceC2217q> {
        /* renamed from: a */
        void mo9078a();

        /* renamed from: a */
        void mo9079a(C2207g<T> c2207g);

        /* renamed from: a */
        void mo9080a(Exception exc);
    }

    public C2207g(UUID uuid, InterfaceC2218r<T> interfaceC2218r, c<T> cVar, List<C2213m.a> list, int i, byte[] bArr, HashMap<String, String> hashMap, InterfaceC2221u interfaceC2221u, Looper looper, C2635l<InterfaceC2208h> c2635l, int i2) {
        this.f8078i = uuid;
        this.f8072c = cVar;
        this.f8071b = interfaceC2218r;
        this.f8073d = i;
        this.f8087r = bArr;
        this.f8070a = bArr == null ? Collections.unmodifiableList(list) : null;
        this.f8074e = hashMap;
        this.f8077h = interfaceC2221u;
        this.f8076g = i2;
        this.f8075f = c2635l;
        this.f8080k = 2;
        this.f8079j = new b(looper);
        this.f8082m = new HandlerThread("DrmRequestHandler");
        this.f8082m.start();
        this.f8083n = new a(this.f8082m.getLooper());
    }

    /* renamed from: a */
    private void m9051a(int i, boolean z) {
        try {
            this.f8088s = this.f8071b.m9098a(i == 3 ? this.f8087r : this.f8086q, this.f8070a, i, this.f8074e);
            this.f8083n.m9077a(1, this.f8088s, z);
        } catch (Exception e2) {
            m9060c(e2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public void m9054a(Object obj, Object obj2) {
        C2635l<InterfaceC2208h> c2635l;
        C2635l.a<InterfaceC2208h> aVar;
        if (obj == this.f8088s && m9062i()) {
            this.f8088s = null;
            if (obj2 instanceof Exception) {
                m9060c((Exception) obj2);
                return;
            }
            try {
                byte[] bArr = (byte[]) obj2;
                if (this.f8073d == 3) {
                    this.f8071b.m9104b(this.f8087r, bArr);
                    c2635l = this.f8075f;
                    aVar = C2205e.f8068a;
                } else {
                    byte[] m9104b = this.f8071b.m9104b(this.f8086q, bArr);
                    if ((this.f8073d == 2 || (this.f8073d == 0 && this.f8087r != null)) && m9104b != null && m9104b.length != 0) {
                        this.f8087r = m9104b;
                    }
                    this.f8080k = 4;
                    c2635l = this.f8075f;
                    aVar = new C2635l.a() { // from class: d.c.a.a.d.f
                        @Override // p139d.p225c.p226a.p227a.p270n.C2635l.a
                        /* renamed from: a */
                        public final void mo9049a(Object obj3) {
                            ((InterfaceC2208h) obj3).mo8695d();
                        }
                    };
                }
                c2635l.m11146a(aVar);
            } catch (Exception e2) {
                m9060c(e2);
            }
        }
    }

    /* renamed from: a */
    private void m9055a(boolean z) {
        int i = this.f8073d;
        int i2 = 1;
        if (i != 0 && i != 1) {
            if (i == 2) {
                if (this.f8087r != null && !m9064k()) {
                    return;
                }
                m9051a(2, z);
                return;
            }
            i2 = 3;
            if (i != 3 || !m9064k()) {
                return;
            }
            m9051a(i2, z);
        }
        if (this.f8087r != null) {
            if (this.f8080k == 4 || m9064k()) {
                long m9061h = m9061h();
                if (this.f8073d != 0 || m9061h > 60) {
                    if (m9061h <= 0) {
                        m9057b(new C2220t());
                        return;
                    } else {
                        this.f8080k = 4;
                        this.f8075f.m11146a(C2205e.f8068a);
                        return;
                    }
                }
                C2638o.m11155a("DefaultDrmSession", "Offline license has expired or will expire soon. Remaining seconds: " + m9061h);
                m9051a(2, z);
                return;
            }
            return;
        }
        m9051a(i2, z);
    }

    /* renamed from: b */
    private void m9057b(final Exception exc) {
        this.f8085p = new InterfaceC2214n.a(exc);
        this.f8075f.m11146a(new C2635l.a() { // from class: d.c.a.a.d.b
            @Override // p139d.p225c.p226a.p227a.p270n.C2635l.a
            /* renamed from: a */
            public final void mo9049a(Object obj) {
                ((InterfaceC2208h) obj).mo8688a(exc);
            }
        });
        if (this.f8080k != 4) {
            this.f8080k = 1;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b */
    public void m9058b(Object obj, Object obj2) {
        if (obj == this.f8089t) {
            if (this.f8080k == 2 || m9062i()) {
                this.f8089t = null;
                if (obj2 instanceof Exception) {
                    this.f8072c.mo9080a((Exception) obj2);
                    return;
                }
                try {
                    this.f8071b.m9106d((byte[]) obj2);
                    this.f8072c.mo9078a();
                } catch (Exception e2) {
                    this.f8072c.mo9080a(e2);
                }
            }
        }
    }

    /* renamed from: b */
    private boolean m9059b(boolean z) {
        if (m9062i()) {
            return true;
        }
        try {
            this.f8086q = this.f8071b.m9103b();
            this.f8075f.m11146a(new C2635l.a() { // from class: d.c.a.a.d.d
                @Override // p139d.p225c.p226a.p227a.p270n.C2635l.a
                /* renamed from: a */
                public final void mo9049a(Object obj) {
                    ((InterfaceC2208h) obj).mo8697f();
                }
            });
            this.f8084o = this.f8071b.m9102b(this.f8086q);
            this.f8080k = 3;
            return true;
        } catch (NotProvisionedException e2) {
            if (z) {
                this.f8072c.mo9079a(this);
                return false;
            }
            m9057b(e2);
            return false;
        } catch (Exception e3) {
            m9057b(e3);
            return false;
        }
    }

    /* renamed from: c */
    private void m9060c(Exception exc) {
        if (exc instanceof NotProvisionedException) {
            this.f8072c.mo9079a(this);
        } else {
            m9057b(exc);
        }
    }

    /* renamed from: h */
    private long m9061h() {
        if (!C2200d.f8062d.equals(this.f8078i)) {
            return Long.MAX_VALUE;
        }
        Pair<Long, Long> m9112a = C2222v.m9112a(this);
        return Math.min(((Long) m9112a.first).longValue(), ((Long) m9112a.second).longValue());
    }

    /* renamed from: i */
    private boolean m9062i() {
        int i = this.f8080k;
        return i == 3 || i == 4;
    }

    /* renamed from: j */
    private void m9063j() {
        if (this.f8080k == 4) {
            this.f8080k = 3;
            m9057b(new C2220t());
        }
    }

    /* renamed from: k */
    private boolean m9064k() {
        try {
            this.f8071b.m9101a(this.f8086q, this.f8087r);
            return true;
        } catch (Exception e2) {
            C2638o.m11156a("DefaultDrmSession", "Error trying to restore Widevine keys.", e2);
            m9057b(e2);
            return false;
        }
    }

    @Override // p139d.p225c.p226a.p227a.p231d.InterfaceC2214n
    /* renamed from: a */
    public Map<String, String> mo9065a() {
        byte[] bArr = this.f8086q;
        if (bArr == null) {
            return null;
        }
        return this.f8071b.m9100a(bArr);
    }

    /* renamed from: a */
    public void m9066a(int i) {
        if (m9062i()) {
            if (i == 1) {
                this.f8080k = 3;
                this.f8072c.mo9079a(this);
            } else if (i == 2) {
                m9055a(false);
            } else {
                if (i != 3) {
                    return;
                }
                m9063j();
            }
        }
    }

    /* renamed from: a */
    public void m9067a(Exception exc) {
        m9057b(exc);
    }

    /* renamed from: a */
    public boolean m9068a(byte[] bArr) {
        return Arrays.equals(this.f8086q, bArr);
    }

    @Override // p139d.p225c.p226a.p227a.p231d.InterfaceC2214n
    /* renamed from: b */
    public final T mo9069b() {
        return this.f8084o;
    }

    @Override // p139d.p225c.p226a.p227a.p231d.InterfaceC2214n
    /* renamed from: c */
    public final InterfaceC2214n.a mo9070c() {
        if (this.f8080k == 1) {
            return this.f8085p;
        }
        return null;
    }

    /* renamed from: d */
    public void m9071d() {
        int i = this.f8081l + 1;
        this.f8081l = i;
        if (i == 1 && this.f8080k != 1 && m9059b(true)) {
            m9055a(true);
        }
    }

    /* renamed from: e */
    public void m9072e() {
        if (m9059b(false)) {
            m9055a(true);
        }
    }

    /* renamed from: f */
    public void m9073f() {
        this.f8089t = this.f8071b.m9099a();
        this.f8083n.m9077a(0, this.f8089t, true);
    }

    /* renamed from: g */
    public boolean m9074g() {
        int i = this.f8081l - 1;
        this.f8081l = i;
        if (i != 0) {
            return false;
        }
        this.f8080k = 0;
        this.f8079j.removeCallbacksAndMessages(null);
        this.f8083n.removeCallbacksAndMessages(null);
        this.f8083n = null;
        this.f8082m.quit();
        this.f8082m = null;
        this.f8084o = null;
        this.f8085p = null;
        this.f8088s = null;
        this.f8089t = null;
        byte[] bArr = this.f8086q;
        if (bArr != null) {
            this.f8071b.m9105c(bArr);
            this.f8086q = null;
            this.f8075f.m11146a(new C2635l.a() { // from class: d.c.a.a.d.a
                @Override // p139d.p225c.p226a.p227a.p270n.C2635l.a
                /* renamed from: a */
                public final void mo9049a(Object obj) {
                    ((InterfaceC2208h) obj).mo8696e();
                }
            });
        }
        return true;
    }

    @Override // p139d.p225c.p226a.p227a.p231d.InterfaceC2214n
    public final int getState() {
        return this.f8080k;
    }
}
