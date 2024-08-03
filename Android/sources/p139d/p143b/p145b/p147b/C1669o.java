package p139d.p143b.p145b.p147b;

import java.io.IOException;
import p139d.p143b.p145b.p146a.InterfaceC1646b;
import p139d.p143b.p145b.p146a.InterfaceC1647c;
import p139d.p143b.p145b.p146a.InterfaceC1648d;

/* renamed from: d.b.b.b.o */
/* loaded from: classes.dex */
public class C1669o implements InterfaceC1646b {

    /* renamed from: a */
    private static final Object f6191a = new Object();

    /* renamed from: b */
    private static C1669o f6192b;

    /* renamed from: c */
    private static int f6193c;

    /* renamed from: d */
    private InterfaceC1648d f6194d;

    /* renamed from: e */
    private String f6195e;

    /* renamed from: f */
    private long f6196f;

    /* renamed from: g */
    private long f6197g;

    /* renamed from: h */
    private long f6198h;

    /* renamed from: i */
    private IOException f6199i;

    /* renamed from: j */
    private InterfaceC1647c.a f6200j;

    /* renamed from: k */
    private C1669o f6201k;

    private C1669o() {
    }

    /* renamed from: a */
    public static C1669o m6924a() {
        synchronized (f6191a) {
            if (f6192b == null) {
                return new C1669o();
            }
            C1669o c1669o = f6192b;
            f6192b = c1669o.f6201k;
            c1669o.f6201k = null;
            f6193c--;
            return c1669o;
        }
    }

    /* renamed from: c */
    private void m6925c() {
        this.f6194d = null;
        this.f6195e = null;
        this.f6196f = 0L;
        this.f6197g = 0L;
        this.f6198h = 0L;
        this.f6199i = null;
        this.f6200j = null;
    }

    /* renamed from: a */
    public C1669o m6926a(long j) {
        this.f6197g = j;
        return this;
    }

    /* renamed from: a */
    public C1669o m6927a(InterfaceC1647c.a aVar) {
        this.f6200j = aVar;
        return this;
    }

    /* renamed from: a */
    public C1669o m6928a(InterfaceC1648d interfaceC1648d) {
        this.f6194d = interfaceC1648d;
        return this;
    }

    /* renamed from: a */
    public C1669o m6929a(IOException iOException) {
        this.f6199i = iOException;
        return this;
    }

    /* renamed from: a */
    public C1669o m6930a(String str) {
        this.f6195e = str;
        return this;
    }

    /* renamed from: b */
    public C1669o m6931b(long j) {
        this.f6198h = j;
        return this;
    }

    /* renamed from: b */
    public void m6932b() {
        synchronized (f6191a) {
            if (f6193c < 5) {
                m6925c();
                f6193c++;
                if (f6192b != null) {
                    this.f6201k = f6192b;
                }
                f6192b = this;
            }
        }
    }

    /* renamed from: c */
    public C1669o m6933c(long j) {
        this.f6196f = j;
        return this;
    }
}
