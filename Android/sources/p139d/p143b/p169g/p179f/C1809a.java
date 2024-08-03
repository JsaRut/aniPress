package p139d.p143b.p169g.p179f;

import android.content.res.Resources;
import android.graphics.ColorFilter;
import android.graphics.PointF;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import java.util.Iterator;
import p139d.p143b.p148c.p152d.C1691j;
import p139d.p143b.p169g.p178e.C1792h;
import p139d.p143b.p169g.p178e.C1793i;
import p139d.p143b.p169g.p178e.C1794j;
import p139d.p143b.p169g.p178e.C1803s;
import p139d.p143b.p169g.p178e.C1804t;
import p139d.p143b.p169g.p178e.InterfaceC1789e;
import p139d.p143b.p169g.p181h.InterfaceC1817c;

/* renamed from: d.b.g.f.a */
/* loaded from: classes.dex */
public class C1809a implements InterfaceC1817c {

    /* renamed from: b */
    private final Resources f6663b;

    /* renamed from: c */
    private C1812d f6664c;

    /* renamed from: d */
    private final C1811c f6665d;

    /* renamed from: e */
    private final C1792h f6666e;

    /* renamed from: a */
    private final Drawable f6662a = new ColorDrawable(0);

    /* renamed from: f */
    private final C1793i f6667f = new C1793i(this.f6662a);

    /* JADX INFO: Access modifiers changed from: package-private */
    public C1809a(C1810b c1810b) {
        this.f6663b = c1810b.m7440o();
        this.f6664c = c1810b.m7443r();
        int i = 1;
        int size = (c1810b.m7434i() != null ? c1810b.m7434i().size() : 1) + (c1810b.m7437l() != null ? 1 : 0);
        Drawable[] drawableArr = new Drawable[size + 6];
        drawableArr[0] = m7400b(c1810b.m7430e(), null);
        drawableArr[1] = m7400b(c1810b.m7435j(), c1810b.m7436k());
        drawableArr[2] = m7397a(this.f6667f, c1810b.m7429d(), c1810b.m7428c(), c1810b.m7427b());
        drawableArr[3] = m7400b(c1810b.m7438m(), c1810b.m7439n());
        drawableArr[4] = m7400b(c1810b.m7441p(), c1810b.m7442q());
        drawableArr[5] = m7400b(c1810b.m7432g(), c1810b.m7433h());
        if (size > 0) {
            if (c1810b.m7434i() != null) {
                Iterator<Drawable> it = c1810b.m7434i().iterator();
                i = 0;
                while (it.hasNext()) {
                    drawableArr[i + 6] = m7400b(it.next(), null);
                    i++;
                }
            }
            if (c1810b.m7437l() != null) {
                drawableArr[i + 6] = m7400b(c1810b.m7437l(), null);
            }
        }
        this.f6666e = new C1792h(drawableArr);
        this.f6666e.m7366e(c1810b.m7431f());
        this.f6665d = new C1811c(C1813e.m7462a(this.f6666e, this.f6664c));
        this.f6665d.mutate();
        m7407e();
    }

    /* renamed from: a */
    private Drawable m7397a(Drawable drawable, C1804t.b bVar, PointF pointF, ColorFilter colorFilter) {
        drawable.setColorFilter(colorFilter);
        return C1813e.m7461a(drawable, bVar, pointF);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: a */
    private void m7398a(float f) {
        Drawable m7339a = this.f6666e.m7339a(3);
        if (m7339a == 0) {
            return;
        }
        if (f >= 0.999f) {
            if (m7339a instanceof Animatable) {
                ((Animatable) m7339a).stop();
            }
            m7403c(3);
        } else {
            if (m7339a instanceof Animatable) {
                ((Animatable) m7339a).start();
            }
            m7401b(3);
        }
        m7339a.setLevel(Math.round(f * 10000.0f));
    }

    /* renamed from: a */
    private void m7399a(int i, Drawable drawable) {
        if (drawable == null) {
            this.f6666e.m7340a(i, null);
        } else {
            m7404d(i).mo7336a(C1813e.m7463a(drawable, this.f6664c, this.f6663b));
        }
    }

    /* renamed from: b */
    private Drawable m7400b(Drawable drawable, C1804t.b bVar) {
        return C1813e.m7460a(C1813e.m7463a(drawable, this.f6664c, this.f6663b), bVar);
    }

    /* renamed from: b */
    private void m7401b(int i) {
        if (i >= 0) {
            this.f6666e.m7362c(i);
        }
    }

    /* renamed from: c */
    private void m7402c() {
        m7403c(1);
        m7403c(2);
        m7403c(3);
        m7403c(4);
        m7403c(5);
    }

    /* renamed from: c */
    private void m7403c(int i) {
        if (i >= 0) {
            this.f6666e.m7364d(i);
        }
    }

    /* renamed from: d */
    private InterfaceC1789e m7404d(int i) {
        InterfaceC1789e m7344b = this.f6666e.m7344b(i);
        if (m7344b.mo7335a() instanceof C1794j) {
            m7344b = (C1794j) m7344b.mo7335a();
        }
        return m7344b.mo7335a() instanceof C1803s ? (C1803s) m7344b.mo7335a() : m7344b;
    }

    /* renamed from: d */
    private void m7405d() {
        this.f6667f.mo7336a(this.f6662a);
    }

    /* renamed from: e */
    private C1803s m7406e(int i) {
        InterfaceC1789e m7404d = m7404d(i);
        return m7404d instanceof C1803s ? (C1803s) m7404d : C1813e.m7465a(m7404d, C1804t.b.f6644a);
    }

    /* renamed from: e */
    private void m7407e() {
        C1792h c1792h = this.f6666e;
        if (c1792h != null) {
            c1792h.m7360b();
            this.f6666e.m7363d();
            m7402c();
            m7401b(1);
            this.f6666e.m7365e();
            this.f6666e.m7361c();
        }
    }

    @Override // p139d.p143b.p169g.p181h.InterfaceC1816b
    /* renamed from: a */
    public Drawable mo7408a() {
        return this.f6665d;
    }

    @Override // p139d.p143b.p169g.p181h.InterfaceC1817c
    /* renamed from: a */
    public void mo7409a(float f, boolean z) {
        if (this.f6666e.m7339a(3) == null) {
            return;
        }
        this.f6666e.m7360b();
        m7398a(f);
        if (z) {
            this.f6666e.m7365e();
        }
        this.f6666e.m7361c();
    }

    /* renamed from: a */
    public void m7410a(int i) {
        this.f6666e.m7366e(i);
    }

    @Override // p139d.p143b.p169g.p181h.InterfaceC1817c
    /* renamed from: a */
    public void mo7411a(Drawable drawable) {
        this.f6665d.m7444d(drawable);
    }

    @Override // p139d.p143b.p169g.p181h.InterfaceC1817c
    /* renamed from: a */
    public void mo7412a(Drawable drawable, float f, boolean z) {
        Drawable m7463a = C1813e.m7463a(drawable, this.f6664c, this.f6663b);
        m7463a.mutate();
        this.f6667f.mo7336a(m7463a);
        this.f6666e.m7360b();
        m7402c();
        m7401b(2);
        m7398a(f);
        if (z) {
            this.f6666e.m7365e();
        }
        this.f6666e.m7361c();
    }

    /* renamed from: a */
    public void m7413a(Drawable drawable, C1804t.b bVar) {
        m7399a(1, drawable);
        m7406e(1).m7390a(bVar);
    }

    /* renamed from: a */
    public void m7414a(C1804t.b bVar) {
        C1691j.m6971a(bVar);
        m7406e(2).m7390a(bVar);
    }

    /* renamed from: a */
    public void m7415a(C1812d c1812d) {
        this.f6664c = c1812d;
        C1813e.m7466a((InterfaceC1789e) this.f6665d, this.f6664c);
        for (int i = 0; i < this.f6666e.m7338a(); i++) {
            C1813e.m7467a(m7404d(i), this.f6664c, this.f6663b);
        }
    }

    @Override // p139d.p143b.p169g.p181h.InterfaceC1817c
    /* renamed from: a */
    public void mo7416a(Throwable th) {
        this.f6666e.m7360b();
        m7402c();
        if (this.f6666e.m7339a(4) != null) {
            m7401b(4);
        } else {
            m7401b(1);
        }
        this.f6666e.m7361c();
    }

    /* renamed from: b */
    public C1812d m7417b() {
        return this.f6664c;
    }

    /* renamed from: b */
    public void m7418b(Drawable drawable) {
        m7399a(0, drawable);
    }

    @Override // p139d.p143b.p169g.p181h.InterfaceC1817c
    /* renamed from: b */
    public void mo7419b(Throwable th) {
        this.f6666e.m7360b();
        m7402c();
        if (this.f6666e.m7339a(5) != null) {
            m7401b(5);
        } else {
            m7401b(1);
        }
        this.f6666e.m7361c();
    }

    @Override // p139d.p143b.p169g.p181h.InterfaceC1817c
    public void reset() {
        m7405d();
        m7407e();
    }
}
