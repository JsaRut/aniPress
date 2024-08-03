package p139d.p143b.p169g.p179f;

import android.content.res.Resources;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import java.util.Iterator;
import java.util.List;
import p139d.p143b.p148c.p152d.C1691j;
import p139d.p143b.p169g.p178e.C1804t;

/* renamed from: d.b.g.f.b */
/* loaded from: classes.dex */
public class C1810b {

    /* renamed from: a */
    public static final C1804t.b f6668a = C1804t.b.f6649f;

    /* renamed from: b */
    public static final C1804t.b f6669b = C1804t.b.f6650g;

    /* renamed from: c */
    private Resources f6670c;

    /* renamed from: d */
    private int f6671d;

    /* renamed from: e */
    private float f6672e;

    /* renamed from: f */
    private Drawable f6673f;

    /* renamed from: g */
    private C1804t.b f6674g;

    /* renamed from: h */
    private Drawable f6675h;

    /* renamed from: i */
    private C1804t.b f6676i;

    /* renamed from: j */
    private Drawable f6677j;

    /* renamed from: k */
    private C1804t.b f6678k;

    /* renamed from: l */
    private Drawable f6679l;

    /* renamed from: m */
    private C1804t.b f6680m;

    /* renamed from: n */
    private C1804t.b f6681n;

    /* renamed from: o */
    private Matrix f6682o;

    /* renamed from: p */
    private PointF f6683p;

    /* renamed from: q */
    private ColorFilter f6684q;

    /* renamed from: r */
    private Drawable f6685r;

    /* renamed from: s */
    private List<Drawable> f6686s;

    /* renamed from: t */
    private Drawable f6687t;

    /* renamed from: u */
    private C1812d f6688u;

    public C1810b(Resources resources) {
        this.f6670c = resources;
        m7421s();
    }

    /* renamed from: a */
    public static C1810b m7420a(Resources resources) {
        return new C1810b(resources);
    }

    /* renamed from: s */
    private void m7421s() {
        this.f6671d = 300;
        this.f6672e = 0.0f;
        this.f6673f = null;
        C1804t.b bVar = f6668a;
        this.f6674g = bVar;
        this.f6675h = null;
        this.f6676i = bVar;
        this.f6677j = null;
        this.f6678k = bVar;
        this.f6679l = null;
        this.f6680m = bVar;
        this.f6681n = f6669b;
        this.f6682o = null;
        this.f6683p = null;
        this.f6684q = null;
        this.f6685r = null;
        this.f6686s = null;
        this.f6687t = null;
        this.f6688u = null;
    }

    /* renamed from: t */
    private void m7422t() {
        List<Drawable> list = this.f6686s;
        if (list != null) {
            Iterator<Drawable> it = list.iterator();
            while (it.hasNext()) {
                C1691j.m6971a(it.next());
            }
        }
    }

    /* renamed from: a */
    public C1809a m7423a() {
        m7422t();
        return new C1809a(this);
    }

    /* renamed from: a */
    public C1810b m7424a(int i) {
        this.f6671d = i;
        return this;
    }

    /* renamed from: a */
    public C1810b m7425a(C1804t.b bVar) {
        this.f6681n = bVar;
        this.f6682o = null;
        return this;
    }

    /* renamed from: a */
    public C1810b m7426a(C1812d c1812d) {
        this.f6688u = c1812d;
        return this;
    }

    /* renamed from: b */
    public ColorFilter m7427b() {
        return this.f6684q;
    }

    /* renamed from: c */
    public PointF m7428c() {
        return this.f6683p;
    }

    /* renamed from: d */
    public C1804t.b m7429d() {
        return this.f6681n;
    }

    /* renamed from: e */
    public Drawable m7430e() {
        return this.f6685r;
    }

    /* renamed from: f */
    public int m7431f() {
        return this.f6671d;
    }

    /* renamed from: g */
    public Drawable m7432g() {
        return this.f6677j;
    }

    /* renamed from: h */
    public C1804t.b m7433h() {
        return this.f6678k;
    }

    /* renamed from: i */
    public List<Drawable> m7434i() {
        return this.f6686s;
    }

    /* renamed from: j */
    public Drawable m7435j() {
        return this.f6673f;
    }

    /* renamed from: k */
    public C1804t.b m7436k() {
        return this.f6674g;
    }

    /* renamed from: l */
    public Drawable m7437l() {
        return this.f6687t;
    }

    /* renamed from: m */
    public Drawable m7438m() {
        return this.f6679l;
    }

    /* renamed from: n */
    public C1804t.b m7439n() {
        return this.f6680m;
    }

    /* renamed from: o */
    public Resources m7440o() {
        return this.f6670c;
    }

    /* renamed from: p */
    public Drawable m7441p() {
        return this.f6675h;
    }

    /* renamed from: q */
    public C1804t.b m7442q() {
        return this.f6676i;
    }

    /* renamed from: r */
    public C1812d m7443r() {
        return this.f6688u;
    }
}
