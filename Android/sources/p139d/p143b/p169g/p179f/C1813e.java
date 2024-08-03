package p139d.p143b.p169g.p179f;

import android.content.res.Resources;
import android.graphics.PointF;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.NinePatchDrawable;
import android.os.Build;
import p139d.p143b.p148c.p152d.C1691j;
import p139d.p143b.p148c.p153e.C1700a;
import p139d.p143b.p169g.p178e.C1793i;
import p139d.p143b.p169g.p178e.C1797m;
import p139d.p143b.p169g.p178e.C1798n;
import p139d.p143b.p169g.p178e.C1800p;
import p139d.p143b.p169g.p178e.C1802r;
import p139d.p143b.p169g.p178e.C1803s;
import p139d.p143b.p169g.p178e.C1804t;
import p139d.p143b.p169g.p178e.InterfaceC1789e;
import p139d.p143b.p169g.p178e.InterfaceC1796l;
import p139d.p143b.p169g.p179f.C1812d;

/* renamed from: d.b.g.f.e */
/* loaded from: classes.dex */
public class C1813e {

    /* renamed from: a */
    private static final Drawable f6702a = new ColorDrawable(0);

    /* renamed from: a */
    public static Drawable m7460a(Drawable drawable, C1804t.b bVar) {
        return m7461a(drawable, bVar, (PointF) null);
    }

    /* renamed from: a */
    public static Drawable m7461a(Drawable drawable, C1804t.b bVar, PointF pointF) {
        if (drawable == null || bVar == null) {
            return drawable;
        }
        C1803s c1803s = new C1803s(drawable, bVar);
        if (pointF != null) {
            c1803s.m7389a(pointF);
        }
        return c1803s;
    }

    /* renamed from: a */
    public static Drawable m7462a(Drawable drawable, C1812d c1812d) {
        if (drawable == null || c1812d == null || c1812d.m7458g() != C1812d.a.OVERLAY_COLOR) {
            return drawable;
        }
        C1800p c1800p = new C1800p(drawable);
        m7469a((InterfaceC1796l) c1800p, c1812d);
        c1800p.m7385a(c1812d.m7455d());
        return c1800p;
    }

    /* renamed from: a */
    public static Drawable m7463a(Drawable drawable, C1812d c1812d, Resources resources) {
        if (drawable == null || c1812d == null || c1812d.m7458g() != C1812d.a.BITMAP_ONLY) {
            return drawable;
        }
        if (!(drawable instanceof C1793i)) {
            return m7470b(drawable, c1812d, resources);
        }
        InterfaceC1789e m7464a = m7464a((C1793i) drawable);
        m7464a.mo7336a(m7470b(m7464a.mo7336a(f6702a), c1812d, resources));
        return drawable;
    }

    /* renamed from: a */
    static InterfaceC1789e m7464a(InterfaceC1789e interfaceC1789e) {
        while (true) {
            Object mo7335a = interfaceC1789e.mo7335a();
            if (mo7335a == interfaceC1789e || !(mo7335a instanceof InterfaceC1789e)) {
                break;
            }
            interfaceC1789e = (InterfaceC1789e) mo7335a;
        }
        return interfaceC1789e;
    }

    /* renamed from: a */
    public static C1803s m7465a(InterfaceC1789e interfaceC1789e, C1804t.b bVar) {
        Drawable m7460a = m7460a(interfaceC1789e.mo7336a(f6702a), bVar);
        interfaceC1789e.mo7336a(m7460a);
        C1691j.m6972a(m7460a, "Parent has no child drawable!");
        return (C1803s) m7460a;
    }

    /* renamed from: a */
    public static void m7466a(InterfaceC1789e interfaceC1789e, C1812d c1812d) {
        Drawable mo7335a = interfaceC1789e.mo7335a();
        if (c1812d == null || c1812d.m7458g() != C1812d.a.OVERLAY_COLOR) {
            if (mo7335a instanceof C1800p) {
                interfaceC1789e.mo7336a(((C1800p) mo7335a).mo7368b(f6702a));
                f6702a.setCallback(null);
                return;
            }
            return;
        }
        if (!(mo7335a instanceof C1800p)) {
            interfaceC1789e.mo7336a(m7462a(interfaceC1789e.mo7336a(f6702a), c1812d));
            return;
        }
        C1800p c1800p = (C1800p) mo7335a;
        m7469a((InterfaceC1796l) c1800p, c1812d);
        c1800p.m7385a(c1812d.m7455d());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: a */
    public static void m7467a(InterfaceC1789e interfaceC1789e, C1812d c1812d, Resources resources) {
        InterfaceC1789e m7464a = m7464a(interfaceC1789e);
        Drawable mo7335a = m7464a.mo7335a();
        if (c1812d == null || c1812d.m7458g() != C1812d.a.BITMAP_ONLY) {
            if (mo7335a instanceof InterfaceC1796l) {
                m7468a((InterfaceC1796l) mo7335a);
            }
        } else if (mo7335a instanceof InterfaceC1796l) {
            m7469a((InterfaceC1796l) mo7335a, c1812d);
        } else if (mo7335a != 0) {
            m7464a.mo7336a(f6702a);
            m7464a.mo7336a(m7470b(mo7335a, c1812d, resources));
        }
    }

    /* renamed from: a */
    static void m7468a(InterfaceC1796l interfaceC1796l) {
        interfaceC1796l.mo7375a(false);
        interfaceC1796l.mo7377b(0.0f);
        interfaceC1796l.mo7374a(0, 0.0f);
        interfaceC1796l.mo7373a(0.0f);
        interfaceC1796l.mo7378b(false);
    }

    /* renamed from: a */
    static void m7469a(InterfaceC1796l interfaceC1796l, C1812d c1812d) {
        interfaceC1796l.mo7375a(c1812d.m7457f());
        interfaceC1796l.mo7376a(c1812d.m7454c());
        interfaceC1796l.mo7374a(c1812d.m7447a(), c1812d.m7452b());
        interfaceC1796l.mo7373a(c1812d.m7456e());
        interfaceC1796l.mo7378b(c1812d.m7459h());
    }

    /* renamed from: b */
    private static Drawable m7470b(Drawable drawable, C1812d c1812d, Resources resources) {
        if (drawable instanceof BitmapDrawable) {
            BitmapDrawable bitmapDrawable = (BitmapDrawable) drawable;
            C1797m c1797m = new C1797m(resources, bitmapDrawable.getBitmap(), bitmapDrawable.getPaint());
            m7469a((InterfaceC1796l) c1797m, c1812d);
            return c1797m;
        }
        if (drawable instanceof NinePatchDrawable) {
            C1802r c1802r = new C1802r((NinePatchDrawable) drawable);
            m7469a((InterfaceC1796l) c1802r, c1812d);
            return c1802r;
        }
        if (!(drawable instanceof ColorDrawable) || Build.VERSION.SDK_INT < 11) {
            C1700a.m7014c("WrappingUtils", "Don't know how to round that drawable: %s", drawable);
            return drawable;
        }
        C1798n m7381a = C1798n.m7381a((ColorDrawable) drawable);
        m7469a((InterfaceC1796l) m7381a, c1812d);
        return m7381a;
    }
}
