package android.support.v7.widget;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.support.v7.view.menu.C0366l;
import android.support.v7.view.menu.InterfaceC0376v;
import android.support.v7.widget.Toolbar;
import android.text.TextUtils;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import p000a.p005b.p009c.p019h.C0074H;
import p000a.p005b.p009c.p019h.C0107v;
import p000a.p005b.p022d.p023a.C0112a;
import p000a.p005b.p022d.p023a.C0116e;
import p000a.p005b.p022d.p023a.C0117f;
import p000a.p005b.p022d.p023a.C0119h;
import p000a.p005b.p022d.p023a.C0121j;
import p000a.p005b.p022d.p024b.p025a.C0122a;

/* renamed from: android.support.v7.widget.Ca */
/* loaded from: classes.dex */
public class C0393Ca implements InterfaceC0411L {

    /* renamed from: a */
    Toolbar f1997a;

    /* renamed from: b */
    private int f1998b;

    /* renamed from: c */
    private View f1999c;

    /* renamed from: d */
    private View f2000d;

    /* renamed from: e */
    private Drawable f2001e;

    /* renamed from: f */
    private Drawable f2002f;

    /* renamed from: g */
    private Drawable f2003g;

    /* renamed from: h */
    private boolean f2004h;

    /* renamed from: i */
    CharSequence f2005i;

    /* renamed from: j */
    private CharSequence f2006j;

    /* renamed from: k */
    private CharSequence f2007k;

    /* renamed from: l */
    Window.Callback f2008l;

    /* renamed from: m */
    boolean f2009m;

    /* renamed from: n */
    private C0448g f2010n;

    /* renamed from: o */
    private int f2011o;

    /* renamed from: p */
    private int f2012p;

    /* renamed from: q */
    private Drawable f2013q;

    public C0393Ca(Toolbar toolbar, boolean z) {
        this(toolbar, z, C0119h.abc_action_bar_up_description, C0116e.abc_ic_ab_back_material);
    }

    public C0393Ca(Toolbar toolbar, boolean z, int i, int i2) {
        Drawable drawable;
        this.f2011o = 0;
        this.f2012p = 0;
        this.f1997a = toolbar;
        this.f2005i = toolbar.getTitle();
        this.f2006j = toolbar.getSubtitle();
        this.f2004h = this.f2005i != null;
        this.f2003g = toolbar.getNavigationIcon();
        C0479va m2571a = C0479va.m2571a(toolbar.getContext(), null, C0121j.ActionBar, C0112a.actionBarStyle, 0);
        this.f2013q = m2571a.m2579b(C0121j.ActionBar_homeAsUpIndicator);
        if (z) {
            CharSequence m2585e = m2571a.m2585e(C0121j.ActionBar_title);
            if (!TextUtils.isEmpty(m2585e)) {
                m2176c(m2585e);
            }
            CharSequence m2585e2 = m2571a.m2585e(C0121j.ActionBar_subtitle);
            if (!TextUtils.isEmpty(m2585e2)) {
                m2173b(m2585e2);
            }
            Drawable m2579b = m2571a.m2579b(C0121j.ActionBar_logo);
            if (m2579b != null) {
                m2163a(m2579b);
            }
            Drawable m2579b2 = m2571a.m2579b(C0121j.ActionBar_icon);
            if (m2579b2 != null) {
                setIcon(m2579b2);
            }
            if (this.f2003g == null && (drawable = this.f2013q) != null) {
                m2172b(drawable);
            }
            mo2162a(m2571a.m2582d(C0121j.ActionBar_displayOptions, 0));
            int m2588g = m2571a.m2588g(C0121j.ActionBar_customNavigationLayout, 0);
            if (m2588g != 0) {
                m2166a(LayoutInflater.from(this.f1997a.getContext()).inflate(m2588g, (ViewGroup) this.f1997a, false));
                mo2162a(this.f1998b | 16);
            }
            int m2586f = m2571a.m2586f(C0121j.ActionBar_height, 0);
            if (m2586f > 0) {
                ViewGroup.LayoutParams layoutParams = this.f1997a.getLayoutParams();
                layoutParams.height = m2586f;
                this.f1997a.setLayoutParams(layoutParams);
            }
            int m2578b = m2571a.m2578b(C0121j.ActionBar_contentInsetStart, -1);
            int m2578b2 = m2571a.m2578b(C0121j.ActionBar_contentInsetEnd, -1);
            if (m2578b >= 0 || m2578b2 >= 0) {
                this.f1997a.m2372a(Math.max(m2578b, 0), Math.max(m2578b2, 0));
            }
            int m2588g2 = m2571a.m2588g(C0121j.ActionBar_titleTextStyle, 0);
            if (m2588g2 != 0) {
                Toolbar toolbar2 = this.f1997a;
                toolbar2.m2375b(toolbar2.getContext(), m2588g2);
            }
            int m2588g3 = m2571a.m2588g(C0121j.ActionBar_subtitleTextStyle, 0);
            if (m2588g3 != 0) {
                Toolbar toolbar3 = this.f1997a;
                toolbar3.m2373a(toolbar3.getContext(), m2588g3);
            }
            int m2588g4 = m2571a.m2588g(C0121j.ActionBar_popupTheme, 0);
            if (m2588g4 != 0) {
                this.f1997a.setPopupTheme(m2588g4);
            }
        } else {
            this.f1998b = m2157o();
        }
        m2571a.m2576a();
        m2178d(i);
        this.f2007k = this.f1997a.getNavigationContentDescription();
        this.f1997a.setNavigationOnClickListener(new ViewOnClickListenerC0382Aa(this));
    }

    /* renamed from: d */
    private void m2156d(CharSequence charSequence) {
        this.f2005i = charSequence;
        if ((this.f1998b & 8) != 0) {
            this.f1997a.setTitle(charSequence);
        }
    }

    /* renamed from: o */
    private int m2157o() {
        if (this.f1997a.getNavigationIcon() == null) {
            return 11;
        }
        this.f2013q = this.f1997a.getNavigationIcon();
        return 15;
    }

    /* renamed from: p */
    private void m2158p() {
        if ((this.f1998b & 4) != 0) {
            if (TextUtils.isEmpty(this.f2007k)) {
                this.f1997a.setNavigationContentDescription(this.f2012p);
            } else {
                this.f1997a.setNavigationContentDescription(this.f2007k);
            }
        }
    }

    /* renamed from: q */
    private void m2159q() {
        Toolbar toolbar;
        Drawable drawable;
        if ((this.f1998b & 4) != 0) {
            toolbar = this.f1997a;
            drawable = this.f2003g;
            if (drawable == null) {
                drawable = this.f2013q;
            }
        } else {
            toolbar = this.f1997a;
            drawable = null;
        }
        toolbar.setNavigationIcon(drawable);
    }

    /* renamed from: r */
    private void m2160r() {
        Drawable drawable;
        int i = this.f1998b;
        if ((i & 2) == 0) {
            drawable = null;
        } else if ((i & 1) == 0 || (drawable = this.f2002f) == null) {
            drawable = this.f2001e;
        }
        this.f1997a.setLogo(drawable);
    }

    @Override // android.support.v7.widget.InterfaceC0411L
    /* renamed from: a */
    public C0074H mo2161a(int i, long j) {
        C0074H m490a = C0107v.m490a(this.f1997a);
        m490a.m338a(i == 0 ? 1.0f : 0.0f);
        m490a.m339a(j);
        m490a.m340a(new C0391Ba(this, i));
        return m490a;
    }

    @Override // android.support.v7.widget.InterfaceC0411L
    /* renamed from: a */
    public void mo2162a(int i) {
        View view;
        CharSequence charSequence;
        Toolbar toolbar;
        int i2 = this.f1998b ^ i;
        this.f1998b = i;
        if (i2 != 0) {
            if ((i2 & 4) != 0) {
                if ((i & 4) != 0) {
                    m2158p();
                }
                m2159q();
            }
            if ((i2 & 3) != 0) {
                m2160r();
            }
            if ((i2 & 8) != 0) {
                if ((i & 8) != 0) {
                    this.f1997a.setTitle(this.f2005i);
                    toolbar = this.f1997a;
                    charSequence = this.f2006j;
                } else {
                    charSequence = null;
                    this.f1997a.setTitle((CharSequence) null);
                    toolbar = this.f1997a;
                }
                toolbar.setSubtitle(charSequence);
            }
            if ((i2 & 16) == 0 || (view = this.f2000d) == null) {
                return;
            }
            if ((i & 16) != 0) {
                this.f1997a.addView(view);
            } else {
                this.f1997a.removeView(view);
            }
        }
    }

    /* renamed from: a */
    public void m2163a(Drawable drawable) {
        this.f2002f = drawable;
        m2160r();
    }

    @Override // android.support.v7.widget.InterfaceC0411L
    /* renamed from: a */
    public void mo2164a(C0437aa c0437aa) {
        View view = this.f1999c;
        if (view != null) {
            ViewParent parent = view.getParent();
            Toolbar toolbar = this.f1997a;
            if (parent == toolbar) {
                toolbar.removeView(this.f1999c);
            }
        }
        this.f1999c = c0437aa;
        if (c0437aa == null || this.f2011o != 2) {
            return;
        }
        this.f1997a.addView(this.f1999c, 0);
        Toolbar.C0426b c0426b = (Toolbar.C0426b) this.f1999c.getLayoutParams();
        ((ViewGroup.MarginLayoutParams) c0426b).width = -2;
        ((ViewGroup.MarginLayoutParams) c0426b).height = -2;
        c0426b.f1545a = 8388691;
        c0437aa.setAllowCollapse(true);
    }

    @Override // android.support.v7.widget.InterfaceC0411L
    /* renamed from: a */
    public void mo2165a(Menu menu, InterfaceC0376v.a aVar) {
        if (this.f2010n == null) {
            this.f2010n = new C0448g(this.f1997a.getContext());
            this.f2010n.m1967a(C0117f.action_menu_presenter);
        }
        this.f2010n.mo1932a(aVar);
        this.f1997a.m2374a((C0366l) menu, this.f2010n);
    }

    /* renamed from: a */
    public void m2166a(View view) {
        View view2 = this.f2000d;
        if (view2 != null && (this.f1998b & 16) != 0) {
            this.f1997a.removeView(view2);
        }
        this.f2000d = view;
        if (view == null || (this.f1998b & 16) == 0) {
            return;
        }
        this.f1997a.addView(this.f2000d);
    }

    /* renamed from: a */
    public void m2167a(CharSequence charSequence) {
        this.f2007k = charSequence;
        m2158p();
    }

    @Override // android.support.v7.widget.InterfaceC0411L
    /* renamed from: a */
    public void mo2168a(boolean z) {
    }

    @Override // android.support.v7.widget.InterfaceC0411L
    /* renamed from: a */
    public boolean mo2169a() {
        return this.f1997a.m2383i();
    }

    @Override // android.support.v7.widget.InterfaceC0411L
    /* renamed from: b */
    public void mo2170b() {
        this.f2009m = true;
    }

    @Override // android.support.v7.widget.InterfaceC0411L
    /* renamed from: b */
    public void mo2171b(int i) {
        m2163a(i != 0 ? C0122a.m550b(mo2187k(), i) : null);
    }

    /* renamed from: b */
    public void m2172b(Drawable drawable) {
        this.f2003g = drawable;
        m2159q();
    }

    /* renamed from: b */
    public void m2173b(CharSequence charSequence) {
        this.f2006j = charSequence;
        if ((this.f1998b & 8) != 0) {
            this.f1997a.setSubtitle(charSequence);
        }
    }

    @Override // android.support.v7.widget.InterfaceC0411L
    /* renamed from: b */
    public void mo2174b(boolean z) {
        this.f1997a.setCollapsible(z);
    }

    @Override // android.support.v7.widget.InterfaceC0411L
    /* renamed from: c */
    public void mo2175c(int i) {
        this.f1997a.setVisibility(i);
    }

    /* renamed from: c */
    public void m2176c(CharSequence charSequence) {
        this.f2004h = true;
        m2156d(charSequence);
    }

    @Override // android.support.v7.widget.InterfaceC0411L
    /* renamed from: c */
    public boolean mo2177c() {
        return this.f1997a.m2376b();
    }

    @Override // android.support.v7.widget.InterfaceC0411L
    public void collapseActionView() {
        this.f1997a.m2377c();
    }

    /* renamed from: d */
    public void m2178d(int i) {
        if (i == this.f2012p) {
            return;
        }
        this.f2012p = i;
        if (TextUtils.isEmpty(this.f1997a.getNavigationContentDescription())) {
            m2180e(this.f2012p);
        }
    }

    @Override // android.support.v7.widget.InterfaceC0411L
    /* renamed from: d */
    public boolean mo2179d() {
        return this.f1997a.m2382h();
    }

    /* renamed from: e */
    public void m2180e(int i) {
        m2167a(i == 0 ? null : mo2187k().getString(i));
    }

    @Override // android.support.v7.widget.InterfaceC0411L
    /* renamed from: e */
    public boolean mo2181e() {
        return this.f1997a.m2381g();
    }

    @Override // android.support.v7.widget.InterfaceC0411L
    /* renamed from: f */
    public boolean mo2182f() {
        return this.f1997a.m2385k();
    }

    @Override // android.support.v7.widget.InterfaceC0411L
    /* renamed from: g */
    public void mo2183g() {
        this.f1997a.m2378d();
    }

    @Override // android.support.v7.widget.InterfaceC0411L
    public CharSequence getTitle() {
        return this.f1997a.getTitle();
    }

    @Override // android.support.v7.widget.InterfaceC0411L
    /* renamed from: h */
    public boolean mo2184h() {
        return this.f1997a.m2380f();
    }

    @Override // android.support.v7.widget.InterfaceC0411L
    /* renamed from: i */
    public int mo2185i() {
        return this.f2011o;
    }

    @Override // android.support.v7.widget.InterfaceC0411L
    /* renamed from: j */
    public ViewGroup mo2186j() {
        return this.f1997a;
    }

    @Override // android.support.v7.widget.InterfaceC0411L
    /* renamed from: k */
    public Context mo2187k() {
        return this.f1997a.getContext();
    }

    @Override // android.support.v7.widget.InterfaceC0411L
    /* renamed from: l */
    public int mo2188l() {
        return this.f1998b;
    }

    @Override // android.support.v7.widget.InterfaceC0411L
    /* renamed from: m */
    public void mo2189m() {
        Log.i("ToolbarWidgetWrapper", "Progress display unsupported");
    }

    @Override // android.support.v7.widget.InterfaceC0411L
    /* renamed from: n */
    public void mo2190n() {
        Log.i("ToolbarWidgetWrapper", "Progress display unsupported");
    }

    @Override // android.support.v7.widget.InterfaceC0411L
    public void setIcon(int i) {
        setIcon(i != 0 ? C0122a.m550b(mo2187k(), i) : null);
    }

    @Override // android.support.v7.widget.InterfaceC0411L
    public void setIcon(Drawable drawable) {
        this.f2001e = drawable;
        m2160r();
    }

    @Override // android.support.v7.widget.InterfaceC0411L
    public void setWindowCallback(Window.Callback callback) {
        this.f2008l = callback;
    }

    @Override // android.support.v7.widget.InterfaceC0411L
    public void setWindowTitle(CharSequence charSequence) {
        if (this.f2004h) {
            return;
        }
        m2156d(charSequence);
    }
}
