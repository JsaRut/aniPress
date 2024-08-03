package android.support.v7.view.menu;

import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.Build;
import android.support.v7.view.menu.InterfaceC0376v;
import android.view.Display;
import android.view.View;
import android.view.WindowManager;
import android.widget.PopupWindow;
import p000a.p005b.p009c.p019h.C0091f;
import p000a.p005b.p009c.p019h.C0107v;
import p000a.p005b.p022d.p023a.C0115d;

/* renamed from: android.support.v7.view.menu.u */
/* loaded from: classes.dex */
public class C0375u implements InterfaceC0368n {

    /* renamed from: a */
    private final Context f1885a;

    /* renamed from: b */
    private final C0366l f1886b;

    /* renamed from: c */
    private final boolean f1887c;

    /* renamed from: d */
    private final int f1888d;

    /* renamed from: e */
    private final int f1889e;

    /* renamed from: f */
    private View f1890f;

    /* renamed from: g */
    private int f1891g;

    /* renamed from: h */
    private boolean f1892h;

    /* renamed from: i */
    private InterfaceC0376v.a f1893i;

    /* renamed from: j */
    private AbstractC0373s f1894j;

    /* renamed from: k */
    private PopupWindow.OnDismissListener f1895k;

    /* renamed from: l */
    private final PopupWindow.OnDismissListener f1896l;

    public C0375u(Context context, C0366l c0366l, View view, boolean z, int i) {
        this(context, c0366l, view, z, i, 0);
    }

    public C0375u(Context context, C0366l c0366l, View view, boolean z, int i, int i2) {
        this.f1891g = 8388611;
        this.f1896l = new C0374t(this);
        this.f1885a = context;
        this.f1886b = c0366l;
        this.f1890f = view;
        this.f1887c = z;
        this.f1888d = i;
        this.f1889e = i2;
    }

    /* renamed from: a */
    private void m2079a(int i, int i2, boolean z, boolean z2) {
        AbstractC0373s m2088b = m2088b();
        m2088b.mo1943c(z2);
        if (z) {
            if ((C0091f.m429a(this.f1891g, C0107v.m518g(this.f1890f)) & 7) == 5) {
                i -= this.f1890f.getWidth();
            }
            m2088b.mo1938b(i);
            m2088b.mo1942c(i2);
            int i3 = (int) ((this.f1885a.getResources().getDisplayMetrics().density * 48.0f) / 2.0f);
            m2088b.m2077a(new Rect(i - i3, i2 - i3, i + i3, i2 + i3));
        }
        m2088b.mo1941c();
    }

    /* renamed from: g */
    private AbstractC0373s m2080g() {
        Display defaultDisplay = ((WindowManager) this.f1885a.getSystemService("window")).getDefaultDisplay();
        Point point = new Point();
        if (Build.VERSION.SDK_INT >= 17) {
            defaultDisplay.getRealSize(point);
        } else {
            defaultDisplay.getSize(point);
        }
        AbstractC0373s viewOnKeyListenerC0363i = Math.min(point.x, point.y) >= this.f1885a.getResources().getDimensionPixelSize(C0115d.abc_cascading_menus_min_smallest_width) ? new ViewOnKeyListenerC0363i(this.f1885a, this.f1890f, this.f1888d, this.f1889e, this.f1887c) : new ViewOnKeyListenerC0352C(this.f1885a, this.f1886b, this.f1890f, this.f1888d, this.f1889e, this.f1887c);
        viewOnKeyListenerC0363i.mo1930a(this.f1886b);
        viewOnKeyListenerC0363i.mo1934a(this.f1896l);
        viewOnKeyListenerC0363i.mo1933a(this.f1890f);
        viewOnKeyListenerC0363i.mo1932a(this.f1893i);
        viewOnKeyListenerC0363i.mo1939b(this.f1892h);
        viewOnKeyListenerC0363i.mo1929a(this.f1891g);
        return viewOnKeyListenerC0363i;
    }

    /* renamed from: a */
    public void m2081a() {
        if (m2089c()) {
            this.f1894j.dismiss();
        }
    }

    /* renamed from: a */
    public void m2082a(int i) {
        this.f1891g = i;
    }

    /* renamed from: a */
    public void m2083a(InterfaceC0376v.a aVar) {
        this.f1893i = aVar;
        AbstractC0373s abstractC0373s = this.f1894j;
        if (abstractC0373s != null) {
            abstractC0373s.mo1932a(aVar);
        }
    }

    /* renamed from: a */
    public void m2084a(View view) {
        this.f1890f = view;
    }

    /* renamed from: a */
    public void m2085a(PopupWindow.OnDismissListener onDismissListener) {
        this.f1895k = onDismissListener;
    }

    /* renamed from: a */
    public void m2086a(boolean z) {
        this.f1892h = z;
        AbstractC0373s abstractC0373s = this.f1894j;
        if (abstractC0373s != null) {
            abstractC0373s.mo1939b(z);
        }
    }

    /* renamed from: a */
    public boolean m2087a(int i, int i2) {
        if (m2089c()) {
            return true;
        }
        if (this.f1890f == null) {
            return false;
        }
        m2079a(i, i2, true, true);
        return true;
    }

    /* renamed from: b */
    public AbstractC0373s m2088b() {
        if (this.f1894j == null) {
            this.f1894j = m2080g();
        }
        return this.f1894j;
    }

    /* renamed from: c */
    public boolean m2089c() {
        AbstractC0373s abstractC0373s = this.f1894j;
        return abstractC0373s != null && abstractC0373s.mo1940b();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: d */
    public void mo2090d() {
        this.f1894j = null;
        PopupWindow.OnDismissListener onDismissListener = this.f1895k;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
        }
    }

    /* renamed from: e */
    public void m2091e() {
        if (!m2092f()) {
            throw new IllegalStateException("MenuPopupHelper cannot be used without an anchor");
        }
    }

    /* renamed from: f */
    public boolean m2092f() {
        if (m2089c()) {
            return true;
        }
        if (this.f1890f == null) {
            return false;
        }
        m2079a(0, 0, false, false);
        return true;
    }
}
