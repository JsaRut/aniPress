package android.support.v7.view.menu;

import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Build;
import android.os.Handler;
import android.support.v7.view.menu.InterfaceC0376v;
import android.support.v7.widget.C0432W;
import android.support.v7.widget.InterfaceC0430V;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.AdapterView;
import android.widget.FrameLayout;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p000a.p005b.p009c.p019h.C0091f;
import p000a.p005b.p009c.p019h.C0107v;
import p000a.p005b.p022d.p023a.C0115d;
import p000a.p005b.p022d.p023a.C0118g;

/* renamed from: android.support.v7.view.menu.i */
/* loaded from: classes.dex */
public final class ViewOnKeyListenerC0363i extends AbstractC0373s implements InterfaceC0376v, View.OnKeyListener, PopupWindow.OnDismissListener {

    /* renamed from: b */
    private static final int f1765b = C0118g.abc_cascading_menu_item_layout;

    /* renamed from: A */
    private PopupWindow.OnDismissListener f1766A;

    /* renamed from: B */
    boolean f1767B;

    /* renamed from: c */
    private final Context f1768c;

    /* renamed from: d */
    private final int f1769d;

    /* renamed from: e */
    private final int f1770e;

    /* renamed from: f */
    private final int f1771f;

    /* renamed from: g */
    private final boolean f1772g;

    /* renamed from: h */
    final Handler f1773h;

    /* renamed from: p */
    private View f1781p;

    /* renamed from: q */
    View f1782q;

    /* renamed from: s */
    private boolean f1784s;

    /* renamed from: t */
    private boolean f1785t;

    /* renamed from: u */
    private int f1786u;

    /* renamed from: v */
    private int f1787v;

    /* renamed from: x */
    private boolean f1789x;

    /* renamed from: y */
    private InterfaceC0376v.a f1790y;

    /* renamed from: z */
    ViewTreeObserver f1791z;

    /* renamed from: i */
    private final List<C0366l> f1774i = new ArrayList();

    /* renamed from: j */
    final List<a> f1775j = new ArrayList();

    /* renamed from: k */
    final ViewTreeObserver.OnGlobalLayoutListener f1776k = new ViewTreeObserverOnGlobalLayoutListenerC0359e(this);

    /* renamed from: l */
    private final View.OnAttachStateChangeListener f1777l = new ViewOnAttachStateChangeListenerC0360f(this);

    /* renamed from: m */
    private final InterfaceC0430V f1778m = new C0362h(this);

    /* renamed from: n */
    private int f1779n = 0;

    /* renamed from: o */
    private int f1780o = 0;

    /* renamed from: w */
    private boolean f1788w = false;

    /* renamed from: r */
    private int f1783r = m1990h();

    /* renamed from: android.support.v7.view.menu.i$a */
    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a */
        public final C0432W f1792a;

        /* renamed from: b */
        public final C0366l f1793b;

        /* renamed from: c */
        public final int f1794c;

        public a(C0432W c0432w, C0366l c0366l, int i) {
            this.f1792a = c0432w;
            this.f1793b = c0366l;
            this.f1794c = i;
        }

        /* renamed from: a */
        public ListView m1992a() {
            return this.f1792a.mo1944d();
        }
    }

    public ViewOnKeyListenerC0363i(Context context, View view, int i, int i2, boolean z) {
        this.f1768c = context;
        this.f1781p = view;
        this.f1770e = i;
        this.f1771f = i2;
        this.f1772g = z;
        Resources resources = context.getResources();
        this.f1769d = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(C0115d.abc_config_prefDialogWidth));
        this.f1773h = new Handler();
    }

    /* renamed from: a */
    private MenuItem m1984a(C0366l c0366l, C0366l c0366l2) {
        int size = c0366l.size();
        for (int i = 0; i < size; i++) {
            MenuItem item = c0366l.getItem(i);
            if (item.hasSubMenu() && c0366l2 == item.getSubMenu()) {
                return item;
            }
        }
        return null;
    }

    /* renamed from: a */
    private View m1985a(a aVar, C0366l c0366l) {
        C0365k c0365k;
        int i;
        int firstVisiblePosition;
        MenuItem m1984a = m1984a(aVar.f1793b, c0366l);
        if (m1984a == null) {
            return null;
        }
        ListView m1992a = aVar.m1992a();
        ListAdapter adapter = m1992a.getAdapter();
        int i2 = 0;
        if (adapter instanceof HeaderViewListAdapter) {
            HeaderViewListAdapter headerViewListAdapter = (HeaderViewListAdapter) adapter;
            i = headerViewListAdapter.getHeadersCount();
            c0365k = (C0365k) headerViewListAdapter.getWrappedAdapter();
        } else {
            c0365k = (C0365k) adapter;
            i = 0;
        }
        int count = c0365k.getCount();
        while (true) {
            if (i2 >= count) {
                i2 = -1;
                break;
            }
            if (m1984a == c0365k.getItem(i2)) {
                break;
            }
            i2++;
        }
        if (i2 != -1 && (firstVisiblePosition = (i2 + i) - m1992a.getFirstVisiblePosition()) >= 0 && firstVisiblePosition < m1992a.getChildCount()) {
            return m1992a.getChildAt(firstVisiblePosition);
        }
        return null;
    }

    /* renamed from: c */
    private int m1986c(C0366l c0366l) {
        int size = this.f1775j.size();
        for (int i = 0; i < size; i++) {
            if (c0366l == this.f1775j.get(i).f1793b) {
                return i;
            }
        }
        return -1;
    }

    /* renamed from: d */
    private int m1987d(int i) {
        List<a> list = this.f1775j;
        ListView m1992a = list.get(list.size() - 1).m1992a();
        int[] iArr = new int[2];
        m1992a.getLocationOnScreen(iArr);
        Rect rect = new Rect();
        this.f1782q.getWindowVisibleDisplayFrame(rect);
        return this.f1783r == 1 ? (iArr[0] + m1992a.getWidth()) + i > rect.right ? 0 : 1 : iArr[0] - i < 0 ? 1 : 0;
    }

    /* renamed from: d */
    private void m1988d(C0366l c0366l) {
        a aVar;
        View view;
        int i;
        int i2;
        int i3;
        LayoutInflater from = LayoutInflater.from(this.f1768c);
        C0365k c0365k = new C0365k(c0366l, from, this.f1772g, f1765b);
        if (!mo1940b() && this.f1788w) {
            c0365k.m1997a(true);
        } else if (mo1940b()) {
            c0365k.m1997a(AbstractC0373s.m2076b(c0366l));
        }
        int m2074a = AbstractC0373s.m2074a(c0365k, null, this.f1768c, this.f1769d);
        C0432W m1989g = m1989g();
        m1989g.mo2151a((ListAdapter) c0365k);
        m1989g.m2400b(m2074a);
        m1989g.m2402c(this.f1780o);
        if (this.f1775j.size() > 0) {
            List<a> list = this.f1775j;
            aVar = list.get(list.size() - 1);
            view = m1985a(aVar, c0366l);
        } else {
            aVar = null;
            view = null;
        }
        if (view != null) {
            m1989g.m2421c(false);
            m1989g.m2419a((Object) null);
            int m1987d = m1987d(m2074a);
            boolean z = m1987d == 1;
            this.f1783r = m1987d;
            if (Build.VERSION.SDK_INT >= 26) {
                m1989g.m2396a(view);
                i2 = 0;
                i = 0;
            } else {
                int[] iArr = new int[2];
                this.f1781p.getLocationOnScreen(iArr);
                int[] iArr2 = new int[2];
                view.getLocationOnScreen(iArr2);
                if ((this.f1780o & 7) == 5) {
                    iArr[0] = iArr[0] + this.f1781p.getWidth();
                    iArr2[0] = iArr2[0] + view.getWidth();
                }
                i = iArr2[0] - iArr[0];
                i2 = iArr2[1] - iArr[1];
            }
            if ((this.f1780o & 5) == 5) {
                if (!z) {
                    m2074a = view.getWidth();
                    i3 = i - m2074a;
                }
                i3 = i + m2074a;
            } else {
                if (z) {
                    m2074a = view.getWidth();
                    i3 = i + m2074a;
                }
                i3 = i - m2074a;
            }
            m1989g.m2403d(i3);
            m1989g.m2401b(true);
            m1989g.m2411h(i2);
        } else {
            if (this.f1784s) {
                m1989g.m2403d(this.f1786u);
            }
            if (this.f1785t) {
                m1989g.m2411h(this.f1787v);
            }
            m1989g.m2394a(m2078f());
        }
        this.f1775j.add(new a(m1989g, c0366l, this.f1783r));
        m1989g.mo1941c();
        ListView mo1944d = m1989g.mo1944d();
        mo1944d.setOnKeyListener(this);
        if (aVar == null && this.f1789x && c0366l.m2038h() != null) {
            FrameLayout frameLayout = (FrameLayout) from.inflate(C0118g.abc_popup_menu_header_item_layout, (ViewGroup) mo1944d, false);
            TextView textView = (TextView) frameLayout.findViewById(R.id.title);
            frameLayout.setEnabled(false);
            textView.setText(c0366l.m2038h());
            mo1944d.addHeaderView(frameLayout, null, false);
            m1989g.mo1941c();
        }
    }

    /* renamed from: g */
    private C0432W m1989g() {
        C0432W c0432w = new C0432W(this.f1768c, null, this.f1770e, this.f1771f);
        c0432w.m2418a(this.f1778m);
        c0432w.m2397a((AdapterView.OnItemClickListener) this);
        c0432w.m2398a((PopupWindow.OnDismissListener) this);
        c0432w.m2396a(this.f1781p);
        c0432w.m2402c(this.f1780o);
        c0432w.m2399a(true);
        c0432w.m2405e(2);
        return c0432w;
    }

    /* renamed from: h */
    private int m1990h() {
        return C0107v.m518g(this.f1781p) == 1 ? 0 : 1;
    }

    @Override // android.support.v7.view.menu.AbstractC0373s
    /* renamed from: a */
    public void mo1929a(int i) {
        if (this.f1779n != i) {
            this.f1779n = i;
            this.f1780o = C0091f.m429a(i, C0107v.m518g(this.f1781p));
        }
    }

    @Override // android.support.v7.view.menu.AbstractC0373s
    /* renamed from: a */
    public void mo1930a(C0366l c0366l) {
        c0366l.m2017a(this, this.f1768c);
        if (mo1940b()) {
            m1988d(c0366l);
        } else {
            this.f1774i.add(c0366l);
        }
    }

    @Override // android.support.v7.view.menu.InterfaceC0376v
    /* renamed from: a */
    public void mo1931a(C0366l c0366l, boolean z) {
        int m1986c = m1986c(c0366l);
        if (m1986c < 0) {
            return;
        }
        int i = m1986c + 1;
        if (i < this.f1775j.size()) {
            this.f1775j.get(i).f1793b.m2020a(false);
        }
        a remove = this.f1775j.remove(m1986c);
        remove.f1793b.m2026b(this);
        if (this.f1767B) {
            remove.f1792a.m2420b((Object) null);
            remove.f1792a.m2393a(0);
        }
        remove.f1792a.dismiss();
        int size = this.f1775j.size();
        this.f1783r = size > 0 ? this.f1775j.get(size - 1).f1794c : m1990h();
        if (size != 0) {
            if (z) {
                this.f1775j.get(0).f1793b.m2020a(false);
                return;
            }
            return;
        }
        dismiss();
        InterfaceC0376v.a aVar = this.f1790y;
        if (aVar != null) {
            aVar.mo1906a(c0366l, true);
        }
        ViewTreeObserver viewTreeObserver = this.f1791z;
        if (viewTreeObserver != null) {
            if (viewTreeObserver.isAlive()) {
                this.f1791z.removeGlobalOnLayoutListener(this.f1776k);
            }
            this.f1791z = null;
        }
        this.f1782q.removeOnAttachStateChangeListener(this.f1777l);
        this.f1766A.onDismiss();
    }

    @Override // android.support.v7.view.menu.InterfaceC0376v
    /* renamed from: a */
    public void mo1932a(InterfaceC0376v.a aVar) {
        this.f1790y = aVar;
    }

    @Override // android.support.v7.view.menu.AbstractC0373s
    /* renamed from: a */
    public void mo1933a(View view) {
        if (this.f1781p != view) {
            this.f1781p = view;
            this.f1780o = C0091f.m429a(this.f1779n, C0107v.m518g(this.f1781p));
        }
    }

    @Override // android.support.v7.view.menu.AbstractC0373s
    /* renamed from: a */
    public void mo1934a(PopupWindow.OnDismissListener onDismissListener) {
        this.f1766A = onDismissListener;
    }

    @Override // android.support.v7.view.menu.InterfaceC0376v
    /* renamed from: a */
    public void mo1935a(boolean z) {
        Iterator<a> it = this.f1775j.iterator();
        while (it.hasNext()) {
            AbstractC0373s.m2075a(it.next().m1992a().getAdapter()).notifyDataSetChanged();
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
        for (a aVar : this.f1775j) {
            if (subMenuC0353D == aVar.f1793b) {
                aVar.m1992a().requestFocus();
                return true;
            }
        }
        if (!subMenuC0353D.hasVisibleItems()) {
            return false;
        }
        mo1930a((C0366l) subMenuC0353D);
        InterfaceC0376v.a aVar2 = this.f1790y;
        if (aVar2 != null) {
            aVar2.mo1907a(subMenuC0353D);
        }
        return true;
    }

    @Override // android.support.v7.view.menu.AbstractC0373s
    /* renamed from: b */
    public void mo1938b(int i) {
        this.f1784s = true;
        this.f1786u = i;
    }

    @Override // android.support.v7.view.menu.AbstractC0373s
    /* renamed from: b */
    public void mo1939b(boolean z) {
        this.f1788w = z;
    }

    @Override // android.support.v7.view.menu.InterfaceC0380z
    /* renamed from: b */
    public boolean mo1940b() {
        return this.f1775j.size() > 0 && this.f1775j.get(0).f1792a.mo1940b();
    }

    @Override // android.support.v7.view.menu.InterfaceC0380z
    /* renamed from: c */
    public void mo1941c() {
        if (mo1940b()) {
            return;
        }
        Iterator<C0366l> it = this.f1774i.iterator();
        while (it.hasNext()) {
            m1988d(it.next());
        }
        this.f1774i.clear();
        this.f1782q = this.f1781p;
        if (this.f1782q != null) {
            boolean z = this.f1791z == null;
            this.f1791z = this.f1782q.getViewTreeObserver();
            if (z) {
                this.f1791z.addOnGlobalLayoutListener(this.f1776k);
            }
            this.f1782q.addOnAttachStateChangeListener(this.f1777l);
        }
    }

    @Override // android.support.v7.view.menu.AbstractC0373s
    /* renamed from: c */
    public void mo1942c(int i) {
        this.f1785t = true;
        this.f1787v = i;
    }

    @Override // android.support.v7.view.menu.AbstractC0373s
    /* renamed from: c */
    public void mo1943c(boolean z) {
        this.f1789x = z;
    }

    @Override // android.support.v7.view.menu.InterfaceC0380z
    /* renamed from: d */
    public ListView mo1944d() {
        if (this.f1775j.isEmpty()) {
            return null;
        }
        return this.f1775j.get(r0.size() - 1).m1992a();
    }

    @Override // android.support.v7.view.menu.InterfaceC0380z
    public void dismiss() {
        int size = this.f1775j.size();
        if (size > 0) {
            a[] aVarArr = (a[]) this.f1775j.toArray(new a[size]);
            for (int i = size - 1; i >= 0; i--) {
                a aVar = aVarArr[i];
                if (aVar.f1792a.mo1940b()) {
                    aVar.f1792a.dismiss();
                }
            }
        }
    }

    @Override // android.support.v7.view.menu.AbstractC0373s
    /* renamed from: e */
    protected boolean mo1991e() {
        return false;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public void onDismiss() {
        a aVar;
        int size = this.f1775j.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                aVar = null;
                break;
            }
            aVar = this.f1775j.get(i);
            if (!aVar.f1792a.mo1940b()) {
                break;
            } else {
                i++;
            }
        }
        if (aVar != null) {
            aVar.f1793b.m2020a(false);
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
