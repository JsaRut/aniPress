package android.support.v7.view.menu;

import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.support.v7.view.menu.InterfaceC0376v;
import android.support.v7.widget.C0432W;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.AdapterView;
import android.widget.FrameLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow;
import android.widget.TextView;
import p000a.p005b.p009c.p019h.C0107v;
import p000a.p005b.p022d.p023a.C0115d;
import p000a.p005b.p022d.p023a.C0118g;

/* renamed from: android.support.v7.view.menu.C */
/* loaded from: classes.dex */
public final class ViewOnKeyListenerC0352C extends AbstractC0373s implements PopupWindow.OnDismissListener, AdapterView.OnItemClickListener, InterfaceC0376v, View.OnKeyListener {

    /* renamed from: b */
    private static final int f1678b = C0118g.abc_popup_menu_item_layout;

    /* renamed from: c */
    private final Context f1679c;

    /* renamed from: d */
    private final C0366l f1680d;

    /* renamed from: e */
    private final C0365k f1681e;

    /* renamed from: f */
    private final boolean f1682f;

    /* renamed from: g */
    private final int f1683g;

    /* renamed from: h */
    private final int f1684h;

    /* renamed from: i */
    private final int f1685i;

    /* renamed from: j */
    final C0432W f1686j;

    /* renamed from: m */
    private PopupWindow.OnDismissListener f1689m;

    /* renamed from: n */
    private View f1690n;

    /* renamed from: o */
    View f1691o;

    /* renamed from: p */
    private InterfaceC0376v.a f1692p;

    /* renamed from: q */
    ViewTreeObserver f1693q;

    /* renamed from: r */
    private boolean f1694r;

    /* renamed from: s */
    private boolean f1695s;

    /* renamed from: t */
    private int f1696t;

    /* renamed from: v */
    private boolean f1698v;

    /* renamed from: k */
    final ViewTreeObserver.OnGlobalLayoutListener f1687k = new ViewTreeObserverOnGlobalLayoutListenerC0348A(this);

    /* renamed from: l */
    private final View.OnAttachStateChangeListener f1688l = new ViewOnAttachStateChangeListenerC0351B(this);

    /* renamed from: u */
    private int f1697u = 0;

    public ViewOnKeyListenerC0352C(Context context, C0366l c0366l, View view, int i, int i2, boolean z) {
        this.f1679c = context;
        this.f1680d = c0366l;
        this.f1682f = z;
        this.f1681e = new C0365k(c0366l, LayoutInflater.from(context), this.f1682f, f1678b);
        this.f1684h = i;
        this.f1685i = i2;
        Resources resources = context.getResources();
        this.f1683g = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(C0115d.abc_config_prefDialogWidth));
        this.f1690n = view;
        this.f1686j = new C0432W(this.f1679c, null, this.f1684h, this.f1685i);
        c0366l.m2017a(this, context);
    }

    /* renamed from: g */
    private boolean m1928g() {
        View view;
        if (mo1940b()) {
            return true;
        }
        if (this.f1694r || (view = this.f1690n) == null) {
            return false;
        }
        this.f1691o = view;
        this.f1686j.m2398a((PopupWindow.OnDismissListener) this);
        this.f1686j.m2397a((AdapterView.OnItemClickListener) this);
        this.f1686j.m2399a(true);
        View view2 = this.f1691o;
        boolean z = this.f1693q == null;
        this.f1693q = view2.getViewTreeObserver();
        if (z) {
            this.f1693q.addOnGlobalLayoutListener(this.f1687k);
        }
        view2.addOnAttachStateChangeListener(this.f1688l);
        this.f1686j.m2396a(view2);
        this.f1686j.m2402c(this.f1697u);
        if (!this.f1695s) {
            this.f1696t = AbstractC0373s.m2074a(this.f1681e, null, this.f1679c, this.f1683g);
            this.f1695s = true;
        }
        this.f1686j.m2400b(this.f1696t);
        this.f1686j.m2405e(2);
        this.f1686j.m2394a(m2078f());
        this.f1686j.mo1941c();
        ListView mo1944d = this.f1686j.mo1944d();
        mo1944d.setOnKeyListener(this);
        if (this.f1698v && this.f1680d.m2038h() != null) {
            FrameLayout frameLayout = (FrameLayout) LayoutInflater.from(this.f1679c).inflate(C0118g.abc_popup_menu_header_item_layout, (ViewGroup) mo1944d, false);
            TextView textView = (TextView) frameLayout.findViewById(R.id.title);
            if (textView != null) {
                textView.setText(this.f1680d.m2038h());
            }
            frameLayout.setEnabled(false);
            mo1944d.addHeaderView(frameLayout, null, false);
        }
        this.f1686j.mo2151a((ListAdapter) this.f1681e);
        this.f1686j.mo1941c();
        return true;
    }

    @Override // android.support.v7.view.menu.AbstractC0373s
    /* renamed from: a */
    public void mo1929a(int i) {
        this.f1697u = i;
    }

    @Override // android.support.v7.view.menu.AbstractC0373s
    /* renamed from: a */
    public void mo1930a(C0366l c0366l) {
    }

    @Override // android.support.v7.view.menu.InterfaceC0376v
    /* renamed from: a */
    public void mo1931a(C0366l c0366l, boolean z) {
        if (c0366l != this.f1680d) {
            return;
        }
        dismiss();
        InterfaceC0376v.a aVar = this.f1692p;
        if (aVar != null) {
            aVar.mo1906a(c0366l, z);
        }
    }

    @Override // android.support.v7.view.menu.InterfaceC0376v
    /* renamed from: a */
    public void mo1932a(InterfaceC0376v.a aVar) {
        this.f1692p = aVar;
    }

    @Override // android.support.v7.view.menu.AbstractC0373s
    /* renamed from: a */
    public void mo1933a(View view) {
        this.f1690n = view;
    }

    @Override // android.support.v7.view.menu.AbstractC0373s
    /* renamed from: a */
    public void mo1934a(PopupWindow.OnDismissListener onDismissListener) {
        this.f1689m = onDismissListener;
    }

    @Override // android.support.v7.view.menu.InterfaceC0376v
    /* renamed from: a */
    public void mo1935a(boolean z) {
        this.f1695s = false;
        C0365k c0365k = this.f1681e;
        if (c0365k != null) {
            c0365k.notifyDataSetChanged();
        }
    }

    @Override // android.support.v7.view.menu.InterfaceC0376v
    /* renamed from: a */
    public boolean mo1936a() {
        return false;
    }

    @Override // android.support.v7.view.menu.InterfaceC0376v
    /* renamed from: a */
    public boolean mo1937a(SubMenuC0353D subMenuC0353D) {
        if (subMenuC0353D.hasVisibleItems()) {
            C0375u c0375u = new C0375u(this.f1679c, subMenuC0353D, this.f1691o, this.f1682f, this.f1684h, this.f1685i);
            c0375u.m2083a(this.f1692p);
            c0375u.m2086a(AbstractC0373s.m2076b(subMenuC0353D));
            c0375u.m2085a(this.f1689m);
            this.f1689m = null;
            this.f1680d.m2020a(false);
            int m2408g = this.f1686j.m2408g();
            int m2410h = this.f1686j.m2410h();
            if ((Gravity.getAbsoluteGravity(this.f1697u, C0107v.m518g(this.f1690n)) & 7) == 5) {
                m2408g += this.f1690n.getWidth();
            }
            if (c0375u.m2087a(m2408g, m2410h)) {
                InterfaceC0376v.a aVar = this.f1692p;
                if (aVar == null) {
                    return true;
                }
                aVar.mo1907a(subMenuC0353D);
                return true;
            }
        }
        return false;
    }

    @Override // android.support.v7.view.menu.AbstractC0373s
    /* renamed from: b */
    public void mo1938b(int i) {
        this.f1686j.m2403d(i);
    }

    @Override // android.support.v7.view.menu.AbstractC0373s
    /* renamed from: b */
    public void mo1939b(boolean z) {
        this.f1681e.m1997a(z);
    }

    @Override // android.support.v7.view.menu.InterfaceC0380z
    /* renamed from: b */
    public boolean mo1940b() {
        return !this.f1694r && this.f1686j.mo1940b();
    }

    @Override // android.support.v7.view.menu.InterfaceC0380z
    /* renamed from: c */
    public void mo1941c() {
        if (!m1928g()) {
            throw new IllegalStateException("StandardMenuPopup cannot be used without an anchor");
        }
    }

    @Override // android.support.v7.view.menu.AbstractC0373s
    /* renamed from: c */
    public void mo1942c(int i) {
        this.f1686j.m2411h(i);
    }

    @Override // android.support.v7.view.menu.AbstractC0373s
    /* renamed from: c */
    public void mo1943c(boolean z) {
        this.f1698v = z;
    }

    @Override // android.support.v7.view.menu.InterfaceC0380z
    /* renamed from: d */
    public ListView mo1944d() {
        return this.f1686j.mo1944d();
    }

    @Override // android.support.v7.view.menu.InterfaceC0380z
    public void dismiss() {
        if (mo1940b()) {
            this.f1686j.dismiss();
        }
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public void onDismiss() {
        this.f1694r = true;
        this.f1680d.close();
        ViewTreeObserver viewTreeObserver = this.f1693q;
        if (viewTreeObserver != null) {
            if (!viewTreeObserver.isAlive()) {
                this.f1693q = this.f1691o.getViewTreeObserver();
            }
            this.f1693q.removeGlobalOnLayoutListener(this.f1687k);
            this.f1693q = null;
        }
        this.f1691o.removeOnAttachStateChangeListener(this.f1688l);
        PopupWindow.OnDismissListener onDismissListener = this.f1689m;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
        }
    }

    @Override // android.view.View.OnKeyListener
    public boolean onKey(View view, int i, KeyEvent keyEvent) {
        if (keyEvent.getAction() != 1 || i != 82) {
            return false;
        }
        dismiss();
        return true;
    }
}
