package p139d.p143b.p169g.p175c;

import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import java.util.concurrent.Executor;
import p139d.p143b.p148c.p152d.C1690i;
import p139d.p143b.p148c.p152d.C1691j;
import p139d.p143b.p148c.p153e.C1700a;
import p139d.p143b.p161d.InterfaceC1736e;
import p139d.p143b.p169g.p174b.C1770b;
import p139d.p143b.p169g.p174b.C1771c;
import p139d.p143b.p169g.p174b.C1772d;
import p139d.p143b.p169g.p180g.C1814a;
import p139d.p143b.p169g.p181h.InterfaceC1815a;
import p139d.p143b.p169g.p181h.InterfaceC1816b;
import p139d.p143b.p169g.p181h.InterfaceC1817c;

/* renamed from: d.b.g.c.b */
/* loaded from: classes.dex */
public abstract class AbstractC1774b<T, INFO> implements InterfaceC1815a, C1770b.a, C1814a.a {

    /* renamed from: a */
    private static final Class<?> f6455a = AbstractC1774b.class;

    /* renamed from: c */
    private final C1770b f6457c;

    /* renamed from: d */
    private final Executor f6458d;

    /* renamed from: e */
    private C1772d f6459e;

    /* renamed from: f */
    private C1814a f6460f;

    /* renamed from: g */
    private InterfaceC1779g<INFO> f6461g;

    /* renamed from: h */
    private InterfaceC1780h f6462h;

    /* renamed from: i */
    private InterfaceC1817c f6463i;

    /* renamed from: j */
    private Drawable f6464j;

    /* renamed from: k */
    private String f6465k;

    /* renamed from: l */
    private Object f6466l;

    /* renamed from: m */
    private boolean f6467m;

    /* renamed from: n */
    private boolean f6468n;

    /* renamed from: o */
    private boolean f6469o;

    /* renamed from: p */
    private boolean f6470p;

    /* renamed from: q */
    private boolean f6471q;

    /* renamed from: r */
    private String f6472r;

    /* renamed from: s */
    private InterfaceC1736e<T> f6473s;

    /* renamed from: t */
    private T f6474t;

    /* renamed from: u */
    private Drawable f6475u;

    /* renamed from: b */
    private final C1771c f6456b = C1771c.m7253a();

    /* renamed from: v */
    private boolean f6476v = true;

    /* renamed from: d.b.g.c.b$a */
    /* loaded from: classes.dex */
    public static class a<INFO> extends C1781i<INFO> {
        private a() {
        }

        /* renamed from: a */
        public static <INFO> a<INFO> m7294a(InterfaceC1779g<? super INFO> interfaceC1779g, InterfaceC1779g<? super INFO> interfaceC1779g2) {
            a<INFO> aVar = new a<>();
            aVar.m7324a(interfaceC1779g);
            aVar.m7324a(interfaceC1779g2);
            return aVar;
        }
    }

    public AbstractC1774b(C1770b c1770b, Executor executor, String str, Object obj) {
        this.f6457c = c1770b;
        this.f6458d = executor;
        m7268c(str, obj);
    }

    /* renamed from: a */
    public void m7263a(String str, InterfaceC1736e<T> interfaceC1736e, float f, boolean z) {
        if (!m7267a(str, (InterfaceC1736e) interfaceC1736e)) {
            m7266a("ignore_old_datasource @ onProgress", (Throwable) null);
            interfaceC1736e.close();
        } else {
            if (z) {
                return;
            }
            this.f6463i.mo7409a(f, false);
        }
    }

    /* renamed from: a */
    public void m7264a(String str, InterfaceC1736e<T> interfaceC1736e, T t, float f, boolean z, boolean z2) {
        if (!m7267a(str, (InterfaceC1736e) interfaceC1736e)) {
            m7269d("ignore_old_datasource @ onNewResult", t);
            mo7232e(t);
            interfaceC1736e.close();
            return;
        }
        this.f6456b.m7254a(z ? C1771c.a.ON_DATASOURCE_RESULT : C1771c.a.ON_DATASOURCE_RESULT_INT);
        try {
            Drawable mo7216a = mo7216a((AbstractC1774b<T, INFO>) t);
            T t2 = this.f6474t;
            Drawable drawable = this.f6475u;
            this.f6474t = t;
            this.f6475u = mo7216a;
            try {
                if (z) {
                    m7269d("set_final_result @ onNewResult", t);
                    this.f6473s = null;
                    this.f6463i.mo7412a(mo7216a, 1.0f, z2);
                    m7287h().mo6002a(str, mo7231d(t), m7286f());
                } else {
                    m7269d("set_intermediate_result @ onNewResult", t);
                    this.f6463i.mo7412a(mo7216a, f, z2);
                    m7287h().mo7173a(str, (String) mo7231d(t));
                }
                if (drawable != null && drawable != mo7216a) {
                    mo7217a(drawable);
                }
                if (t2 == null || t2 == t) {
                    return;
                }
                m7269d("release_previous_result @ onNewResult", t2);
                mo7232e(t2);
            } catch (Throwable th) {
                if (drawable != null && drawable != mo7216a) {
                    mo7217a(drawable);
                }
                if (t2 != null && t2 != t) {
                    m7269d("release_previous_result @ onNewResult", t2);
                    mo7232e(t2);
                }
                throw th;
            }
        } catch (Exception e2) {
            m7269d("drawable_failed @ onNewResult", t);
            mo7232e(t);
            m7265a(str, interfaceC1736e, e2, z);
        }
    }

    /* renamed from: a */
    public void m7265a(String str, InterfaceC1736e<T> interfaceC1736e, Throwable th, boolean z) {
        Drawable drawable;
        if (!m7267a(str, (InterfaceC1736e) interfaceC1736e)) {
            m7266a("ignore_old_datasource @ onFailure", th);
            interfaceC1736e.close();
            return;
        }
        this.f6456b.m7254a(z ? C1771c.a.ON_DATASOURCE_FAILURE : C1771c.a.ON_DATASOURCE_FAILURE_INT);
        if (!z) {
            m7266a("intermediate_failed @ onFailure", th);
            m7287h().mo7321b(this.f6465k, th);
            return;
        }
        m7266a("final_failed @ onFailure", th);
        this.f6473s = null;
        this.f6470p = true;
        if (this.f6471q && (drawable = this.f6475u) != null) {
            this.f6463i.mo7412a(drawable, 1.0f, true);
        } else if (m7271q()) {
            this.f6463i.mo7416a(th);
        } else {
            this.f6463i.mo7419b(th);
        }
        m7287h().mo6003a(this.f6465k, th);
    }

    /* renamed from: a */
    private void m7266a(String str, Throwable th) {
        if (C1700a.m7000a(2)) {
            C1700a.m6993a(f6455a, "controller %x %s: %s: failure: %s", Integer.valueOf(System.identityHashCode(this)), this.f6465k, str, th);
        }
    }

    /* renamed from: a */
    private boolean m7267a(String str, InterfaceC1736e<T> interfaceC1736e) {
        if (interfaceC1736e == null && this.f6473s == null) {
            return true;
        }
        return str.equals(this.f6465k) && interfaceC1736e == this.f6473s && this.f6468n;
    }

    /* renamed from: c */
    private synchronized void m7268c(String str, Object obj) {
        this.f6456b.m7254a(C1771c.a.ON_INIT_CONTROLLER);
        if (!this.f6476v && this.f6457c != null) {
            this.f6457c.m7250a(this);
        }
        this.f6467m = false;
        this.f6469o = false;
        m7270p();
        this.f6471q = false;
        if (this.f6459e != null) {
            this.f6459e.m7255a();
        }
        if (this.f6460f != null) {
            this.f6460f.m7472a();
            this.f6460f.m7473a(this);
        }
        if (this.f6461g instanceof a) {
            ((a) this.f6461g).m7323a();
        } else {
            this.f6461g = null;
        }
        this.f6462h = null;
        if (this.f6463i != null) {
            this.f6463i.reset();
            this.f6463i.mo7411a((Drawable) null);
            this.f6463i = null;
        }
        this.f6464j = null;
        if (C1700a.m7000a(2)) {
            C1700a.m6992a(f6455a, "controller %x %s -> %s: initialize", Integer.valueOf(System.identityHashCode(this)), this.f6465k, str);
        }
        this.f6465k = str;
        this.f6466l = obj;
    }

    /* renamed from: d */
    private void m7269d(String str, T t) {
        if (C1700a.m7000a(2)) {
            C1700a.m7004b(f6455a, "controller %x %s: %s: image: %s %x", Integer.valueOf(System.identityHashCode(this)), this.f6465k, str, m7279b((AbstractC1774b<T, INFO>) t), Integer.valueOf(mo7230c(t)));
        }
    }

    /* renamed from: p */
    private void m7270p() {
        boolean z = this.f6468n;
        this.f6468n = false;
        this.f6470p = false;
        InterfaceC1736e<T> interfaceC1736e = this.f6473s;
        if (interfaceC1736e != null) {
            interfaceC1736e.close();
            this.f6473s = null;
        }
        Drawable drawable = this.f6475u;
        if (drawable != null) {
            mo7217a(drawable);
        }
        if (this.f6472r != null) {
            this.f6472r = null;
        }
        this.f6475u = null;
        T t = this.f6474t;
        if (t != null) {
            m7269d("release", t);
            mo7232e(this.f6474t);
            this.f6474t = null;
        }
        if (z) {
            m7287h().mo7170a(this.f6465k);
        }
    }

    /* renamed from: q */
    private boolean m7271q() {
        C1772d c1772d;
        return this.f6470p && (c1772d = this.f6459e) != null && c1772d.m7259d();
    }

    /* renamed from: a */
    protected abstract Drawable mo7216a(T t);

    @Override // p139d.p143b.p169g.p174b.C1770b.a
    /* renamed from: a */
    public void mo7252a() {
        this.f6456b.m7254a(C1771c.a.ON_RELEASE_CONTROLLER);
        C1772d c1772d = this.f6459e;
        if (c1772d != null) {
            c1772d.m7258c();
        }
        C1814a c1814a = this.f6460f;
        if (c1814a != null) {
            c1814a.m7476c();
        }
        InterfaceC1817c interfaceC1817c = this.f6463i;
        if (interfaceC1817c != null) {
            interfaceC1817c.reset();
        }
        m7270p();
    }

    /* renamed from: a */
    protected abstract void mo7217a(Drawable drawable);

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: a */
    public void m7272a(InterfaceC1779g<? super INFO> interfaceC1779g) {
        C1691j.m6971a(interfaceC1779g);
        InterfaceC1779g<INFO> interfaceC1779g2 = this.f6461g;
        if (interfaceC1779g2 instanceof a) {
            ((a) interfaceC1779g2).m7324a(interfaceC1779g);
        } else if (interfaceC1779g2 != null) {
            this.f6461g = a.m7294a(interfaceC1779g2, interfaceC1779g);
        } else {
            this.f6461g = interfaceC1779g;
        }
    }

    /* renamed from: a */
    public void m7273a(InterfaceC1780h interfaceC1780h) {
        this.f6462h = interfaceC1780h;
    }

    /* renamed from: a */
    public void m7274a(C1814a c1814a) {
        this.f6460f = c1814a;
        C1814a c1814a2 = this.f6460f;
        if (c1814a2 != null) {
            c1814a2.m7473a(this);
        }
    }

    @Override // p139d.p143b.p169g.p181h.InterfaceC1815a
    /* renamed from: a */
    public void mo7222a(InterfaceC1816b interfaceC1816b) {
        if (C1700a.m7000a(2)) {
            C1700a.m6992a(f6455a, "controller %x %s: setHierarchy: %s", Integer.valueOf(System.identityHashCode(this)), this.f6465k, interfaceC1816b);
        }
        this.f6456b.m7254a(interfaceC1816b != null ? C1771c.a.ON_SET_HIERARCHY : C1771c.a.ON_CLEAR_HIERARCHY);
        if (this.f6468n) {
            this.f6457c.m7250a(this);
            mo7252a();
        }
        InterfaceC1817c interfaceC1817c = this.f6463i;
        if (interfaceC1817c != null) {
            interfaceC1817c.mo7411a((Drawable) null);
            this.f6463i = null;
        }
        if (interfaceC1816b != null) {
            C1691j.m6974a(interfaceC1816b instanceof InterfaceC1817c);
            this.f6463i = (InterfaceC1817c) interfaceC1816b;
            this.f6463i.mo7411a(this.f6464j);
        }
    }

    /* renamed from: a */
    public void m7275a(String str) {
        this.f6472r = str;
    }

    /* renamed from: a */
    public void m7276a(String str, Object obj) {
        m7268c(str, obj);
        this.f6476v = false;
    }

    /* renamed from: a */
    public void m7277a(boolean z) {
        this.f6471q = z;
    }

    @Override // p139d.p143b.p169g.p181h.InterfaceC1815a
    /* renamed from: a */
    public boolean mo7278a(MotionEvent motionEvent) {
        if (C1700a.m7000a(2)) {
            C1700a.m6992a(f6455a, "controller %x %s: onTouchEvent %s", Integer.valueOf(System.identityHashCode(this)), this.f6465k, motionEvent);
        }
        C1814a c1814a = this.f6460f;
        if (c1814a == null) {
            return false;
        }
        if (!c1814a.m7475b() && !m7292n()) {
            return false;
        }
        this.f6460f.m7474a(motionEvent);
        return true;
    }

    /* renamed from: b */
    protected String m7279b(T t) {
        return t != null ? t.getClass().getSimpleName() : "<null>";
    }

    @Override // p139d.p143b.p169g.p181h.InterfaceC1815a
    /* renamed from: b */
    public void mo7280b() {
        if (C1700a.m7000a(2)) {
            C1700a.m6991a(f6455a, "controller %x %s: onDetach", Integer.valueOf(System.identityHashCode(this)), this.f6465k);
        }
        this.f6456b.m7254a(C1771c.a.ON_DETACH_CONTROLLER);
        this.f6467m = false;
        this.f6457c.m7251b(this);
    }

    /* renamed from: b */
    public void m7281b(Drawable drawable) {
        this.f6464j = drawable;
        InterfaceC1817c interfaceC1817c = this.f6463i;
        if (interfaceC1817c != null) {
            interfaceC1817c.mo7411a(this.f6464j);
        }
    }

    /* renamed from: b */
    public void m7282b(InterfaceC1779g<? super INFO> interfaceC1779g) {
        C1691j.m6971a(interfaceC1779g);
        InterfaceC1779g<INFO> interfaceC1779g2 = this.f6461g;
        if (interfaceC1779g2 instanceof a) {
            ((a) interfaceC1779g2).m7325b(interfaceC1779g);
        } else if (interfaceC1779g2 == interfaceC1779g) {
            this.f6461g = null;
        }
    }

    /* renamed from: b */
    public void mo7228b(String str, T t) {
    }

    /* renamed from: c */
    protected int mo7230c(T t) {
        return System.identityHashCode(t);
    }

    @Override // p139d.p143b.p169g.p181h.InterfaceC1815a
    /* renamed from: c */
    public InterfaceC1816b mo7283c() {
        return this.f6463i;
    }

    /* renamed from: d */
    protected abstract INFO mo7231d(T t);

    @Override // p139d.p143b.p169g.p180g.C1814a.a
    /* renamed from: d */
    public boolean mo7284d() {
        if (C1700a.m7000a(2)) {
            C1700a.m6991a(f6455a, "controller %x %s: onClick", Integer.valueOf(System.identityHashCode(this)), this.f6465k);
        }
        if (!m7271q()) {
            return false;
        }
        this.f6459e.m7257b();
        this.f6463i.reset();
        m7293o();
        return true;
    }

    @Override // p139d.p143b.p169g.p181h.InterfaceC1815a
    /* renamed from: e */
    public void mo7285e() {
        if (C1700a.m7000a(2)) {
            C1700a.m6992a(f6455a, "controller %x %s: onAttach: %s", Integer.valueOf(System.identityHashCode(this)), this.f6465k, this.f6468n ? "request already submitted" : "request needs submit");
        }
        this.f6456b.m7254a(C1771c.a.ON_ATTACH_CONTROLLER);
        C1691j.m6971a(this.f6463i);
        this.f6457c.m7250a(this);
        this.f6467m = true;
        if (this.f6468n) {
            return;
        }
        m7293o();
    }

    /* renamed from: e */
    protected abstract void mo7232e(T t);

    /* renamed from: f */
    public Animatable m7286f() {
        Object obj = this.f6475u;
        if (obj instanceof Animatable) {
            return (Animatable) obj;
        }
        return null;
    }

    /* renamed from: g */
    protected T mo7233g() {
        return null;
    }

    /* renamed from: h */
    protected InterfaceC1779g<INFO> m7287h() {
        InterfaceC1779g<INFO> interfaceC1779g = this.f6461g;
        return interfaceC1779g == null ? C1778f.m7320a() : interfaceC1779g;
    }

    /* renamed from: i */
    public Drawable m7288i() {
        return this.f6464j;
    }

    /* renamed from: j */
    protected abstract InterfaceC1736e<T> mo7234j();

    /* renamed from: k */
    public C1814a m7289k() {
        return this.f6460f;
    }

    /* renamed from: l */
    public String m7290l() {
        return this.f6465k;
    }

    /* renamed from: m */
    public C1772d m7291m() {
        if (this.f6459e == null) {
            this.f6459e = new C1772d();
        }
        return this.f6459e;
    }

    /* renamed from: n */
    protected boolean m7292n() {
        return m7271q();
    }

    /* renamed from: o */
    protected void m7293o() {
        T mo7233g = mo7233g();
        if (mo7233g != null) {
            this.f6473s = null;
            this.f6468n = true;
            this.f6470p = false;
            this.f6456b.m7254a(C1771c.a.ON_SUBMIT_CACHE_HIT);
            m7287h().mo6004b(this.f6465k, this.f6466l);
            mo7228b(this.f6465k, mo7233g);
            m7264a(this.f6465k, this.f6473s, mo7233g, 1.0f, true, true);
            return;
        }
        this.f6456b.m7254a(C1771c.a.ON_DATASOURCE_SUBMIT);
        m7287h().mo6004b(this.f6465k, this.f6466l);
        this.f6463i.mo7409a(0.0f, true);
        this.f6468n = true;
        this.f6470p = false;
        this.f6473s = mo7234j();
        if (C1700a.m7000a(2)) {
            C1700a.m6992a(f6455a, "controller %x %s: submitRequest: dataSource: %x", Integer.valueOf(System.identityHashCode(this)), this.f6465k, Integer.valueOf(System.identityHashCode(this.f6473s)));
        }
        this.f6473s.mo7111a(new C1773a(this, this.f6465k, this.f6473s.mo7113a()), this.f6458d);
    }

    public String toString() {
        C1690i.a m6961a = C1690i.m6961a(this);
        m6961a.m6968a("isAttached", this.f6467m);
        m6961a.m6968a("isRequestSubmitted", this.f6468n);
        m6961a.m6968a("hasFetchFailed", this.f6470p);
        m6961a.m6966a("fetchedImage", mo7230c(this.f6474t));
        m6961a.m6967a("events", this.f6456b.toString());
        return m6961a.toString();
    }
}
