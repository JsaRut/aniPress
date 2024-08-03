package p139d.p225c.p226a.p227a.p259k.p265f;

import android.text.Layout;
import p139d.p225c.p226a.p227a.p270n.C2628e;

/* renamed from: d.c.a.a.k.f.e */
/* loaded from: classes.dex */
final class C2545e {

    /* renamed from: a */
    private String f10527a;

    /* renamed from: b */
    private int f10528b;

    /* renamed from: c */
    private boolean f10529c;

    /* renamed from: d */
    private int f10530d;

    /* renamed from: e */
    private boolean f10531e;

    /* renamed from: f */
    private int f10532f = -1;

    /* renamed from: g */
    private int f10533g = -1;

    /* renamed from: h */
    private int f10534h = -1;

    /* renamed from: i */
    private int f10535i = -1;

    /* renamed from: j */
    private int f10536j = -1;

    /* renamed from: k */
    private float f10537k;

    /* renamed from: l */
    private String f10538l;

    /* renamed from: m */
    private C2545e f10539m;

    /* renamed from: n */
    private Layout.Alignment f10540n;

    /* renamed from: a */
    private C2545e m10683a(C2545e c2545e, boolean z) {
        if (c2545e != null) {
            if (!this.f10529c && c2545e.f10529c) {
                m10692b(c2545e.f10528b);
            }
            if (this.f10534h == -1) {
                this.f10534h = c2545e.f10534h;
            }
            if (this.f10535i == -1) {
                this.f10535i = c2545e.f10535i;
            }
            if (this.f10527a == null) {
                this.f10527a = c2545e.f10527a;
            }
            if (this.f10532f == -1) {
                this.f10532f = c2545e.f10532f;
            }
            if (this.f10533g == -1) {
                this.f10533g = c2545e.f10533g;
            }
            if (this.f10540n == null) {
                this.f10540n = c2545e.f10540n;
            }
            if (this.f10536j == -1) {
                this.f10536j = c2545e.f10536j;
                this.f10537k = c2545e.f10537k;
            }
            if (z && !this.f10531e && c2545e.f10531e) {
                m10686a(c2545e.f10530d);
            }
        }
        return this;
    }

    /* renamed from: a */
    public int m10684a() {
        if (this.f10531e) {
            return this.f10530d;
        }
        throw new IllegalStateException("Background color has not been defined.");
    }

    /* renamed from: a */
    public C2545e m10685a(float f) {
        this.f10537k = f;
        return this;
    }

    /* renamed from: a */
    public C2545e m10686a(int i) {
        this.f10530d = i;
        this.f10531e = true;
        return this;
    }

    /* renamed from: a */
    public C2545e m10687a(Layout.Alignment alignment) {
        this.f10540n = alignment;
        return this;
    }

    /* renamed from: a */
    public C2545e m10688a(C2545e c2545e) {
        m10683a(c2545e, true);
        return this;
    }

    /* renamed from: a */
    public C2545e m10689a(String str) {
        C2628e.m11113b(this.f10539m == null);
        this.f10527a = str;
        return this;
    }

    /* renamed from: a */
    public C2545e m10690a(boolean z) {
        C2628e.m11113b(this.f10539m == null);
        this.f10534h = z ? 1 : 0;
        return this;
    }

    /* renamed from: b */
    public int m10691b() {
        if (this.f10529c) {
            return this.f10528b;
        }
        throw new IllegalStateException("Font color has not been defined.");
    }

    /* renamed from: b */
    public C2545e m10692b(int i) {
        C2628e.m11113b(this.f10539m == null);
        this.f10528b = i;
        this.f10529c = true;
        return this;
    }

    /* renamed from: b */
    public C2545e m10693b(String str) {
        this.f10538l = str;
        return this;
    }

    /* renamed from: b */
    public C2545e m10694b(boolean z) {
        C2628e.m11113b(this.f10539m == null);
        this.f10535i = z ? 1 : 0;
        return this;
    }

    /* renamed from: c */
    public C2545e m10695c(int i) {
        this.f10536j = i;
        return this;
    }

    /* renamed from: c */
    public C2545e m10696c(boolean z) {
        C2628e.m11113b(this.f10539m == null);
        this.f10532f = z ? 1 : 0;
        return this;
    }

    /* renamed from: c */
    public String m10697c() {
        return this.f10527a;
    }

    /* renamed from: d */
    public float m10698d() {
        return this.f10537k;
    }

    /* renamed from: d */
    public C2545e m10699d(boolean z) {
        C2628e.m11113b(this.f10539m == null);
        this.f10533g = z ? 1 : 0;
        return this;
    }

    /* renamed from: e */
    public int m10700e() {
        return this.f10536j;
    }

    /* renamed from: f */
    public String m10701f() {
        return this.f10538l;
    }

    /* renamed from: g */
    public int m10702g() {
        if (this.f10534h == -1 && this.f10535i == -1) {
            return -1;
        }
        return (this.f10534h == 1 ? 1 : 0) | (this.f10535i == 1 ? 2 : 0);
    }

    /* renamed from: h */
    public Layout.Alignment m10703h() {
        return this.f10540n;
    }

    /* renamed from: i */
    public boolean m10704i() {
        return this.f10531e;
    }

    /* renamed from: j */
    public boolean m10705j() {
        return this.f10529c;
    }

    /* renamed from: k */
    public boolean m10706k() {
        return this.f10532f == 1;
    }

    /* renamed from: l */
    public boolean m10707l() {
        return this.f10533g == 1;
    }
}
