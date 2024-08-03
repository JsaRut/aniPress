package android.support.v7.app;

import android.R;
import android.app.Activity;
import android.app.UiModeManager;
import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.IntentFilter;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.media.AudioManager;
import android.os.Build;
import android.os.Bundle;
import android.support.v4.app.C0188Z;
import android.support.v7.view.menu.C0364j;
import android.support.v7.view.menu.C0366l;
import android.support.v7.view.menu.InterfaceC0376v;
import android.support.v7.view.menu.InterfaceC0377w;
import android.support.v7.widget.ActionBarContextView;
import android.support.v7.widget.C0406Ia;
import android.support.v7.widget.C0408Ja;
import android.support.v7.widget.C0464o;
import android.support.v7.widget.C0479va;
import android.support.v7.widget.ContentFrameLayout;
import android.support.v7.widget.InterfaceC0409K;
import android.support.v7.widget.InterfaceC0414O;
import android.text.TextUtils;
import android.util.AndroidRuntimeException;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.Log;
import android.util.TypedValue;
import android.view.ActionMode;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.KeyboardShortcutGroup;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.PopupWindow;
import android.widget.TextView;
import java.util.List;
import org.xmlpull.v1.XmlPullParser;
import p000a.p005b.p009c.p019h.C0074H;
import p000a.p005b.p009c.p019h.C0092g;
import p000a.p005b.p009c.p019h.C0093h;
import p000a.p005b.p009c.p019h.C0107v;
import p000a.p005b.p022d.p023a.C0112a;
import p000a.p005b.p022d.p023a.C0114c;
import p000a.p005b.p022d.p023a.C0117f;
import p000a.p005b.p022d.p023a.C0118g;
import p000a.p005b.p022d.p023a.C0120i;
import p000a.p005b.p022d.p023a.C0121j;
import p000a.p005b.p022d.p024b.p025a.C0122a;
import p000a.p005b.p022d.p029e.AbstractC0131b;
import p000a.p005b.p022d.p029e.C0133d;
import p000a.p005b.p022d.p029e.C0135f;
import p000a.p005b.p022d.p029e.C0136g;
import p000a.p005b.p022d.p029e.WindowCallbackC0139j;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: android.support.v7.app.x */
/* loaded from: classes.dex */
public class LayoutInflaterFactory2C0345x extends AbstractC0336o implements C0366l.a, LayoutInflater.Factory2 {

    /* renamed from: b */
    private static final boolean f1586b;

    /* renamed from: c */
    private static final int[] f1587c;

    /* renamed from: d */
    private static boolean f1588d;

    /* renamed from: A */
    private boolean f1589A;

    /* renamed from: B */
    boolean f1590B;

    /* renamed from: C */
    boolean f1591C;

    /* renamed from: D */
    boolean f1592D;

    /* renamed from: E */
    boolean f1593E;

    /* renamed from: F */
    boolean f1594F;

    /* renamed from: G */
    private boolean f1595G;

    /* renamed from: H */
    private f[] f1596H;

    /* renamed from: I */
    private f f1597I;

    /* renamed from: J */
    private boolean f1598J;

    /* renamed from: K */
    boolean f1599K;

    /* renamed from: M */
    private boolean f1601M;

    /* renamed from: N */
    private d f1602N;

    /* renamed from: O */
    boolean f1603O;

    /* renamed from: P */
    int f1604P;

    /* renamed from: R */
    private boolean f1606R;

    /* renamed from: S */
    private Rect f1607S;

    /* renamed from: T */
    private Rect f1608T;

    /* renamed from: U */
    private AppCompatViewInflater f1609U;

    /* renamed from: e */
    final Context f1610e;

    /* renamed from: f */
    final Window f1611f;

    /* renamed from: g */
    final Window.Callback f1612g;

    /* renamed from: h */
    final Window.Callback f1613h;

    /* renamed from: i */
    final InterfaceC0335n f1614i;

    /* renamed from: j */
    AbstractC0322a f1615j;

    /* renamed from: k */
    MenuInflater f1616k;

    /* renamed from: l */
    private CharSequence f1617l;

    /* renamed from: m */
    private InterfaceC0409K f1618m;

    /* renamed from: n */
    private a f1619n;

    /* renamed from: o */
    private g f1620o;

    /* renamed from: p */
    AbstractC0131b f1621p;

    /* renamed from: q */
    ActionBarContextView f1622q;

    /* renamed from: r */
    PopupWindow f1623r;

    /* renamed from: s */
    Runnable f1624s;

    /* renamed from: v */
    private boolean f1627v;

    /* renamed from: w */
    private ViewGroup f1628w;

    /* renamed from: x */
    private TextView f1629x;

    /* renamed from: y */
    private View f1630y;

    /* renamed from: z */
    private boolean f1631z;

    /* renamed from: t */
    C0074H f1625t = null;

    /* renamed from: u */
    private boolean f1626u = true;

    /* renamed from: L */
    private int f1600L = -100;

    /* renamed from: Q */
    private final Runnable f1605Q = new RunnableC0338q(this);

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: android.support.v7.app.x$a */
    /* loaded from: classes.dex */
    public final class a implements InterfaceC0376v.a {
        a() {
        }

        @Override // android.support.v7.view.menu.InterfaceC0376v.a
        /* renamed from: a */
        public void mo1906a(C0366l c0366l, boolean z) {
            LayoutInflaterFactory2C0345x.this.m1888b(c0366l);
        }

        @Override // android.support.v7.view.menu.InterfaceC0376v.a
        /* renamed from: a */
        public boolean mo1907a(C0366l c0366l) {
            Window.Callback m1901o = LayoutInflaterFactory2C0345x.this.m1901o();
            if (m1901o == null) {
                return true;
            }
            m1901o.onMenuOpened(C0121j.AppCompatTheme_tooltipForegroundColor, c0366l);
            return true;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: android.support.v7.app.x$b */
    /* loaded from: classes.dex */
    public class b implements AbstractC0131b.a {

        /* renamed from: a */
        private AbstractC0131b.a f1633a;

        public b(AbstractC0131b.a aVar) {
            this.f1633a = aVar;
        }

        @Override // p000a.p005b.p022d.p029e.AbstractC0131b.a
        /* renamed from: a */
        public void mo642a(AbstractC0131b abstractC0131b) {
            this.f1633a.mo642a(abstractC0131b);
            LayoutInflaterFactory2C0345x layoutInflaterFactory2C0345x = LayoutInflaterFactory2C0345x.this;
            if (layoutInflaterFactory2C0345x.f1623r != null) {
                layoutInflaterFactory2C0345x.f1611f.getDecorView().removeCallbacks(LayoutInflaterFactory2C0345x.this.f1624s);
            }
            LayoutInflaterFactory2C0345x layoutInflaterFactory2C0345x2 = LayoutInflaterFactory2C0345x.this;
            if (layoutInflaterFactory2C0345x2.f1622q != null) {
                layoutInflaterFactory2C0345x2.m1898l();
                LayoutInflaterFactory2C0345x layoutInflaterFactory2C0345x3 = LayoutInflaterFactory2C0345x.this;
                C0074H m490a = C0107v.m490a(layoutInflaterFactory2C0345x3.f1622q);
                m490a.m338a(0.0f);
                layoutInflaterFactory2C0345x3.f1625t = m490a;
                LayoutInflaterFactory2C0345x.this.f1625t.m340a(new C0346y(this));
            }
            LayoutInflaterFactory2C0345x layoutInflaterFactory2C0345x4 = LayoutInflaterFactory2C0345x.this;
            InterfaceC0335n interfaceC0335n = layoutInflaterFactory2C0345x4.f1614i;
            if (interfaceC0335n != null) {
                interfaceC0335n.mo1748a(layoutInflaterFactory2C0345x4.f1621p);
            }
            LayoutInflaterFactory2C0345x.this.f1621p = null;
        }

        @Override // p000a.p005b.p022d.p029e.AbstractC0131b.a
        /* renamed from: a */
        public boolean mo643a(AbstractC0131b abstractC0131b, Menu menu) {
            return this.f1633a.mo643a(abstractC0131b, menu);
        }

        @Override // p000a.p005b.p022d.p029e.AbstractC0131b.a
        /* renamed from: a */
        public boolean mo644a(AbstractC0131b abstractC0131b, MenuItem menuItem) {
            return this.f1633a.mo644a(abstractC0131b, menuItem);
        }

        @Override // p000a.p005b.p022d.p029e.AbstractC0131b.a
        /* renamed from: b */
        public boolean mo645b(AbstractC0131b abstractC0131b, Menu menu) {
            return this.f1633a.mo645b(abstractC0131b, menu);
        }
    }

    /* renamed from: android.support.v7.app.x$c */
    /* loaded from: classes.dex */
    class c extends WindowCallbackC0139j {
        c(Window.Callback callback) {
            super(callback);
        }

        /* renamed from: a */
        final ActionMode m1908a(ActionMode.Callback callback) {
            C0135f.a aVar = new C0135f.a(LayoutInflaterFactory2C0345x.this.f1610e, callback);
            AbstractC0131b m1878a = LayoutInflaterFactory2C0345x.this.m1878a(aVar);
            if (m1878a != null) {
                return aVar.m653b(m1878a);
            }
            return null;
        }

        @Override // p000a.p005b.p022d.p029e.WindowCallbackC0139j, android.view.Window.Callback
        public boolean dispatchKeyEvent(KeyEvent keyEvent) {
            return LayoutInflaterFactory2C0345x.this.m1886a(keyEvent) || super.dispatchKeyEvent(keyEvent);
        }

        @Override // p000a.p005b.p022d.p029e.WindowCallbackC0139j, android.view.Window.Callback
        public boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
            return super.dispatchKeyShortcutEvent(keyEvent) || LayoutInflaterFactory2C0345x.this.m1889b(keyEvent.getKeyCode(), keyEvent);
        }

        @Override // android.view.Window.Callback
        public void onContentChanged() {
        }

        @Override // p000a.p005b.p022d.p029e.WindowCallbackC0139j, android.view.Window.Callback
        public boolean onCreatePanelMenu(int i, Menu menu) {
            if (i != 0 || (menu instanceof C0366l)) {
                return super.onCreatePanelMenu(i, menu);
            }
            return false;
        }

        @Override // p000a.p005b.p022d.p029e.WindowCallbackC0139j, android.view.Window.Callback
        public boolean onMenuOpened(int i, Menu menu) {
            super.onMenuOpened(i, menu);
            LayoutInflaterFactory2C0345x.this.m1894g(i);
            return true;
        }

        @Override // p000a.p005b.p022d.p029e.WindowCallbackC0139j, android.view.Window.Callback
        public void onPanelClosed(int i, Menu menu) {
            super.onPanelClosed(i, menu);
            LayoutInflaterFactory2C0345x.this.m1895h(i);
        }

        @Override // p000a.p005b.p022d.p029e.WindowCallbackC0139j, android.view.Window.Callback
        public boolean onPreparePanel(int i, View view, Menu menu) {
            C0366l c0366l = menu instanceof C0366l ? (C0366l) menu : null;
            if (i == 0 && c0366l == null) {
                return false;
            }
            if (c0366l != null) {
                c0366l.m2031c(true);
            }
            boolean onPreparePanel = super.onPreparePanel(i, view, menu);
            if (c0366l != null) {
                c0366l.m2031c(false);
            }
            return onPreparePanel;
        }

        @Override // p000a.p005b.p022d.p029e.WindowCallbackC0139j, android.view.Window.Callback
        public void onProvideKeyboardShortcuts(List<KeyboardShortcutGroup> list, Menu menu, int i) {
            C0366l c0366l;
            f m1879a = LayoutInflaterFactory2C0345x.this.m1879a(0, true);
            if (m1879a == null || (c0366l = m1879a.f1651j) == null) {
                super.onProvideKeyboardShortcuts(list, menu, i);
            } else {
                super.onProvideKeyboardShortcuts(list, c0366l, i);
            }
        }

        @Override // p000a.p005b.p022d.p029e.WindowCallbackC0139j, android.view.Window.Callback
        public ActionMode onWindowStartingActionMode(ActionMode.Callback callback) {
            if (Build.VERSION.SDK_INT >= 23) {
                return null;
            }
            return LayoutInflaterFactory2C0345x.this.m1902p() ? m1908a(callback) : super.onWindowStartingActionMode(callback);
        }

        @Override // p000a.p005b.p022d.p029e.WindowCallbackC0139j, android.view.Window.Callback
        public ActionMode onWindowStartingActionMode(ActionMode.Callback callback, int i) {
            return (LayoutInflaterFactory2C0345x.this.m1902p() && i == 0) ? m1908a(callback) : super.onWindowStartingActionMode(callback, i);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: android.support.v7.app.x$d */
    /* loaded from: classes.dex */
    public final class d {

        /* renamed from: a */
        private C0317E f1636a;

        /* renamed from: b */
        private boolean f1637b;

        /* renamed from: c */
        private BroadcastReceiver f1638c;

        /* renamed from: d */
        private IntentFilter f1639d;

        d(C0317E c0317e) {
            this.f1636a = c0317e;
            this.f1637b = c0317e.m1764a();
        }

        /* renamed from: a */
        void m1909a() {
            BroadcastReceiver broadcastReceiver = this.f1638c;
            if (broadcastReceiver != null) {
                LayoutInflaterFactory2C0345x.this.f1610e.unregisterReceiver(broadcastReceiver);
                this.f1638c = null;
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: b */
        public void m1910b() {
            boolean m1764a = this.f1636a.m1764a();
            if (m1764a != this.f1637b) {
                this.f1637b = m1764a;
                LayoutInflaterFactory2C0345x.this.mo1840a();
            }
        }

        /* renamed from: c */
        int m1911c() {
            this.f1637b = this.f1636a.m1764a();
            return this.f1637b ? 2 : 1;
        }

        /* renamed from: d */
        void m1912d() {
            m1909a();
            if (this.f1638c == null) {
                this.f1638c = new C0347z(this);
            }
            if (this.f1639d == null) {
                this.f1639d = new IntentFilter();
                this.f1639d.addAction("android.intent.action.TIME_SET");
                this.f1639d.addAction("android.intent.action.TIMEZONE_CHANGED");
                this.f1639d.addAction("android.intent.action.TIME_TICK");
            }
            LayoutInflaterFactory2C0345x.this.f1610e.registerReceiver(this.f1638c, this.f1639d);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: android.support.v7.app.x$e */
    /* loaded from: classes.dex */
    public class e extends ContentFrameLayout {
        public e(Context context) {
            super(context);
        }

        /* renamed from: a */
        private boolean m1913a(int i, int i2) {
            return i < -5 || i2 < -5 || i > getWidth() + 5 || i2 > getHeight() + 5;
        }

        @Override // android.view.ViewGroup, android.view.View
        public boolean dispatchKeyEvent(KeyEvent keyEvent) {
            return LayoutInflaterFactory2C0345x.this.m1886a(keyEvent) || super.dispatchKeyEvent(keyEvent);
        }

        @Override // android.view.ViewGroup
        public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
            if (motionEvent.getAction() != 0 || !m1913a((int) motionEvent.getX(), (int) motionEvent.getY())) {
                return super.onInterceptTouchEvent(motionEvent);
            }
            LayoutInflaterFactory2C0345x.this.m1891d(0);
            return true;
        }

        @Override // android.view.View
        public void setBackgroundResource(int i) {
            setBackgroundDrawable(C0122a.m550b(getContext(), i));
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: android.support.v7.app.x$f */
    /* loaded from: classes.dex */
    public static final class f {

        /* renamed from: a */
        int f1642a;

        /* renamed from: b */
        int f1643b;

        /* renamed from: c */
        int f1644c;

        /* renamed from: d */
        int f1645d;

        /* renamed from: e */
        int f1646e;

        /* renamed from: f */
        int f1647f;

        /* renamed from: g */
        ViewGroup f1648g;

        /* renamed from: h */
        View f1649h;

        /* renamed from: i */
        View f1650i;

        /* renamed from: j */
        C0366l f1651j;

        /* renamed from: k */
        C0364j f1652k;

        /* renamed from: l */
        Context f1653l;

        /* renamed from: m */
        boolean f1654m;

        /* renamed from: n */
        boolean f1655n;

        /* renamed from: o */
        boolean f1656o;

        /* renamed from: p */
        public boolean f1657p;

        /* renamed from: q */
        boolean f1658q = false;

        /* renamed from: r */
        boolean f1659r;

        /* renamed from: s */
        Bundle f1660s;

        f(int i) {
            this.f1642a = i;
        }

        /* renamed from: a */
        InterfaceC0377w m1914a(InterfaceC0376v.a aVar) {
            if (this.f1651j == null) {
                return null;
            }
            if (this.f1652k == null) {
                this.f1652k = new C0364j(this.f1653l, C0118g.abc_list_menu_item_layout);
                this.f1652k.mo1932a(aVar);
                this.f1651j.m2016a(this.f1652k);
            }
            return this.f1652k.m1993a(this.f1648g);
        }

        /* renamed from: a */
        void m1915a(Context context) {
            TypedValue typedValue = new TypedValue();
            Resources.Theme newTheme = context.getResources().newTheme();
            newTheme.setTo(context.getTheme());
            newTheme.resolveAttribute(C0112a.actionBarPopupTheme, typedValue, true);
            int i = typedValue.resourceId;
            if (i != 0) {
                newTheme.applyStyle(i, true);
            }
            newTheme.resolveAttribute(C0112a.panelMenuListTheme, typedValue, true);
            int i2 = typedValue.resourceId;
            if (i2 == 0) {
                i2 = C0120i.Theme_AppCompat_CompactMenu;
            }
            newTheme.applyStyle(i2, true);
            C0133d c0133d = new C0133d(context, 0);
            c0133d.getTheme().setTo(newTheme);
            this.f1653l = c0133d;
            TypedArray obtainStyledAttributes = c0133d.obtainStyledAttributes(C0121j.AppCompatTheme);
            this.f1643b = obtainStyledAttributes.getResourceId(C0121j.AppCompatTheme_panelBackground, 0);
            this.f1647f = obtainStyledAttributes.getResourceId(C0121j.AppCompatTheme_android_windowAnimationStyle, 0);
            obtainStyledAttributes.recycle();
        }

        /* renamed from: a */
        void m1916a(C0366l c0366l) {
            C0364j c0364j;
            C0366l c0366l2 = this.f1651j;
            if (c0366l == c0366l2) {
                return;
            }
            if (c0366l2 != null) {
                c0366l2.m2026b(this.f1652k);
            }
            this.f1651j = c0366l;
            if (c0366l == null || (c0364j = this.f1652k) == null) {
                return;
            }
            c0366l.m2016a(c0364j);
        }

        /* renamed from: a */
        public boolean m1917a() {
            if (this.f1649h == null) {
                return false;
            }
            return this.f1650i != null || this.f1652k.m1994b().getCount() > 0;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: android.support.v7.app.x$g */
    /* loaded from: classes.dex */
    public final class g implements InterfaceC0376v.a {
        g() {
        }

        @Override // android.support.v7.view.menu.InterfaceC0376v.a
        /* renamed from: a */
        public void mo1906a(C0366l c0366l, boolean z) {
            C0366l mo1950m = c0366l.mo1950m();
            boolean z2 = mo1950m != c0366l;
            LayoutInflaterFactory2C0345x layoutInflaterFactory2C0345x = LayoutInflaterFactory2C0345x.this;
            if (z2) {
                c0366l = mo1950m;
            }
            f m1880a = layoutInflaterFactory2C0345x.m1880a((Menu) c0366l);
            if (m1880a != null) {
                if (!z2) {
                    LayoutInflaterFactory2C0345x.this.m1883a(m1880a, z);
                } else {
                    LayoutInflaterFactory2C0345x.this.m1882a(m1880a.f1642a, m1880a, mo1950m);
                    LayoutInflaterFactory2C0345x.this.m1883a(m1880a, true);
                }
            }
        }

        @Override // android.support.v7.view.menu.InterfaceC0376v.a
        /* renamed from: a */
        public boolean mo1907a(C0366l c0366l) {
            Window.Callback m1901o;
            if (c0366l != null) {
                return true;
            }
            LayoutInflaterFactory2C0345x layoutInflaterFactory2C0345x = LayoutInflaterFactory2C0345x.this;
            if (!layoutInflaterFactory2C0345x.f1590B || (m1901o = layoutInflaterFactory2C0345x.m1901o()) == null || LayoutInflaterFactory2C0345x.this.f1599K) {
                return true;
            }
            m1901o.onMenuOpened(C0121j.AppCompatTheme_tooltipForegroundColor, c0366l);
            return true;
        }
    }

    static {
        f1586b = Build.VERSION.SDK_INT < 21;
        f1587c = new int[]{R.attr.windowBackground};
        if (!f1586b || f1588d) {
            return;
        }
        Thread.setDefaultUncaughtExceptionHandler(new C0337p(Thread.getDefaultUncaughtExceptionHandler()));
        f1588d = true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public LayoutInflaterFactory2C0345x(Context context, Window window, InterfaceC0335n interfaceC0335n) {
        this.f1610e = context;
        this.f1611f = window;
        this.f1614i = interfaceC0335n;
        this.f1612g = this.f1611f.getCallback();
        Window.Callback callback = this.f1612g;
        if (callback instanceof c) {
            throw new IllegalStateException("AppCompat has already installed itself into the Window");
        }
        this.f1613h = new c(callback);
        this.f1611f.setCallback(this.f1613h);
        C0479va m2570a = C0479va.m2570a(context, (AttributeSet) null, f1587c);
        Drawable m2581c = m2570a.m2581c(0);
        if (m2581c != null) {
            this.f1611f.setBackgroundDrawable(m2581c);
        }
        m2570a.m2576a();
    }

    /* renamed from: A */
    private void m1857A() {
        if (this.f1627v) {
            throw new AndroidRuntimeException("Window feature must be requested before adding content");
        }
    }

    /* renamed from: a */
    private void m1858a(f fVar, KeyEvent keyEvent) {
        int i;
        ViewGroup.LayoutParams layoutParams;
        if (fVar.f1656o || this.f1599K) {
            return;
        }
        if (fVar.f1642a == 0) {
            if ((this.f1610e.getResources().getConfiguration().screenLayout & 15) == 4) {
                return;
            }
        }
        Window.Callback m1901o = m1901o();
        if (m1901o != null && !m1901o.onMenuOpened(fVar.f1642a, fVar.f1651j)) {
            m1883a(fVar, true);
            return;
        }
        WindowManager windowManager = (WindowManager) this.f1610e.getSystemService("window");
        if (windowManager != null && m1864b(fVar, keyEvent)) {
            if (fVar.f1648g == null || fVar.f1658q) {
                ViewGroup viewGroup = fVar.f1648g;
                if (viewGroup == null) {
                    if (!m1863b(fVar) || fVar.f1648g == null) {
                        return;
                    }
                } else if (fVar.f1658q && viewGroup.getChildCount() > 0) {
                    fVar.f1648g.removeAllViews();
                }
                if (!m1860a(fVar) || !fVar.m1917a()) {
                    return;
                }
                ViewGroup.LayoutParams layoutParams2 = fVar.f1649h.getLayoutParams();
                if (layoutParams2 == null) {
                    layoutParams2 = new ViewGroup.LayoutParams(-2, -2);
                }
                fVar.f1648g.setBackgroundResource(fVar.f1643b);
                ViewParent parent = fVar.f1649h.getParent();
                if (parent != null && (parent instanceof ViewGroup)) {
                    ((ViewGroup) parent).removeView(fVar.f1649h);
                }
                fVar.f1648g.addView(fVar.f1649h, layoutParams2);
                if (!fVar.f1649h.hasFocus()) {
                    fVar.f1649h.requestFocus();
                }
            } else {
                View view = fVar.f1650i;
                if (view != null && (layoutParams = view.getLayoutParams()) != null && layoutParams.width == -1) {
                    i = -1;
                    fVar.f1655n = false;
                    WindowManager.LayoutParams layoutParams3 = new WindowManager.LayoutParams(i, -2, fVar.f1645d, fVar.f1646e, 1002, 8519680, -3);
                    layoutParams3.gravity = fVar.f1644c;
                    layoutParams3.windowAnimations = fVar.f1647f;
                    windowManager.addView(fVar.f1648g, layoutParams3);
                    fVar.f1656o = true;
                }
            }
            i = -2;
            fVar.f1655n = false;
            WindowManager.LayoutParams layoutParams32 = new WindowManager.LayoutParams(i, -2, fVar.f1645d, fVar.f1646e, 1002, 8519680, -3);
            layoutParams32.gravity = fVar.f1644c;
            layoutParams32.windowAnimations = fVar.f1647f;
            windowManager.addView(fVar.f1648g, layoutParams32);
            fVar.f1656o = true;
        }
    }

    /* renamed from: a */
    private void m1859a(C0366l c0366l, boolean z) {
        InterfaceC0409K interfaceC0409K = this.f1618m;
        if (interfaceC0409K == null || !interfaceC0409K.mo2123c() || (ViewConfiguration.get(this.f1610e).hasPermanentMenuKey() && !this.f1618m.mo2124d())) {
            f m1879a = m1879a(0, true);
            m1879a.f1658q = true;
            m1883a(m1879a, false);
            m1858a(m1879a, (KeyEvent) null);
            return;
        }
        Window.Callback m1901o = m1901o();
        if (this.f1618m.mo2121a() && z) {
            this.f1618m.mo2125e();
            if (this.f1599K) {
                return;
            }
            m1901o.onPanelClosed(C0121j.AppCompatTheme_tooltipForegroundColor, m1879a(0, true).f1651j);
            return;
        }
        if (m1901o == null || this.f1599K) {
            return;
        }
        if (this.f1603O && (this.f1604P & 1) != 0) {
            this.f1611f.getDecorView().removeCallbacks(this.f1605Q);
            this.f1605Q.run();
        }
        f m1879a2 = m1879a(0, true);
        C0366l c0366l2 = m1879a2.f1651j;
        if (c0366l2 == null || m1879a2.f1659r || !m1901o.onPreparePanel(0, m1879a2.f1650i, c0366l2)) {
            return;
        }
        m1901o.onMenuOpened(C0121j.AppCompatTheme_tooltipForegroundColor, m1879a2.f1651j);
        this.f1618m.mo2126f();
    }

    /* renamed from: a */
    private boolean m1860a(f fVar) {
        View view = fVar.f1650i;
        if (view != null) {
            fVar.f1649h = view;
            return true;
        }
        if (fVar.f1651j == null) {
            return false;
        }
        if (this.f1620o == null) {
            this.f1620o = new g();
        }
        fVar.f1649h = (View) fVar.m1914a(this.f1620o);
        return fVar.f1649h != null;
    }

    /* renamed from: a */
    private boolean m1861a(f fVar, int i, KeyEvent keyEvent, int i2) {
        C0366l c0366l;
        boolean z = false;
        if (keyEvent.isSystem()) {
            return false;
        }
        if ((fVar.f1654m || m1864b(fVar, keyEvent)) && (c0366l = fVar.f1651j) != null) {
            z = c0366l.performShortcut(i, keyEvent, i2);
        }
        if (z && (i2 & 1) == 0 && this.f1618m == null) {
            m1883a(fVar, true);
        }
        return z;
    }

    /* renamed from: a */
    private boolean m1862a(ViewParent viewParent) {
        if (viewParent == null) {
            return false;
        }
        View decorView = this.f1611f.getDecorView();
        while (viewParent != null) {
            if (viewParent == decorView || !(viewParent instanceof View) || C0107v.m529q((View) viewParent)) {
                return false;
            }
            viewParent = viewParent.getParent();
        }
        return true;
    }

    /* renamed from: b */
    private boolean m1863b(f fVar) {
        fVar.m1915a(m1899m());
        fVar.f1648g = new e(fVar.f1653l);
        fVar.f1644c = 81;
        return true;
    }

    /* renamed from: b */
    private boolean m1864b(f fVar, KeyEvent keyEvent) {
        InterfaceC0409K interfaceC0409K;
        InterfaceC0409K interfaceC0409K2;
        InterfaceC0409K interfaceC0409K3;
        if (this.f1599K) {
            return false;
        }
        if (fVar.f1654m) {
            return true;
        }
        f fVar2 = this.f1597I;
        if (fVar2 != null && fVar2 != fVar) {
            m1883a(fVar2, false);
        }
        Window.Callback m1901o = m1901o();
        if (m1901o != null) {
            fVar.f1650i = m1901o.onCreatePanelView(fVar.f1642a);
        }
        int i = fVar.f1642a;
        boolean z = i == 0 || i == 108;
        if (z && (interfaceC0409K3 = this.f1618m) != null) {
            interfaceC0409K3.mo2122b();
        }
        if (fVar.f1650i == null) {
            if (z) {
                m1904r();
            }
            if (fVar.f1651j == null || fVar.f1659r) {
                if (fVar.f1651j == null && (!m1865c(fVar) || fVar.f1651j == null)) {
                    return false;
                }
                if (z && this.f1618m != null) {
                    if (this.f1619n == null) {
                        this.f1619n = new a();
                    }
                    this.f1618m.mo2120a(fVar.f1651j, this.f1619n);
                }
                fVar.f1651j.m2045s();
                if (!m1901o.onCreatePanelMenu(fVar.f1642a, fVar.f1651j)) {
                    fVar.m1916a((C0366l) null);
                    if (z && (interfaceC0409K = this.f1618m) != null) {
                        interfaceC0409K.mo2120a(null, this.f1619n);
                    }
                    return false;
                }
                fVar.f1659r = false;
            }
            fVar.f1651j.m2045s();
            Bundle bundle = fVar.f1660s;
            if (bundle != null) {
                fVar.f1651j.m2015a(bundle);
                fVar.f1660s = null;
            }
            if (!m1901o.onPreparePanel(0, fVar.f1650i, fVar.f1651j)) {
                if (z && (interfaceC0409K2 = this.f1618m) != null) {
                    interfaceC0409K2.mo2120a(null, this.f1619n);
                }
                fVar.f1651j.m2044r();
                return false;
            }
            fVar.f1657p = KeyCharacterMap.load(keyEvent != null ? keyEvent.getDeviceId() : -1).getKeyboardType() != 1;
            fVar.f1651j.setQwertyMode(fVar.f1657p);
            fVar.f1651j.m2044r();
        }
        fVar.f1654m = true;
        fVar.f1655n = false;
        this.f1597I = fVar;
        return true;
    }

    /* renamed from: c */
    private boolean m1865c(f fVar) {
        Context context = this.f1610e;
        int i = fVar.f1642a;
        if ((i == 0 || i == 108) && this.f1618m != null) {
            TypedValue typedValue = new TypedValue();
            Resources.Theme theme = context.getTheme();
            theme.resolveAttribute(C0112a.actionBarTheme, typedValue, true);
            Resources.Theme theme2 = null;
            if (typedValue.resourceId != 0) {
                theme2 = context.getResources().newTheme();
                theme2.setTo(theme);
                theme2.applyStyle(typedValue.resourceId, true);
                theme2.resolveAttribute(C0112a.actionBarWidgetTheme, typedValue, true);
            } else {
                theme.resolveAttribute(C0112a.actionBarWidgetTheme, typedValue, true);
            }
            if (typedValue.resourceId != 0) {
                if (theme2 == null) {
                    theme2 = context.getResources().newTheme();
                    theme2.setTo(theme);
                }
                theme2.applyStyle(typedValue.resourceId, true);
            }
            if (theme2 != null) {
                C0133d c0133d = new C0133d(context, 0);
                c0133d.getTheme().setTo(theme2);
                context = c0133d;
            }
        }
        C0366l c0366l = new C0366l(context);
        c0366l.mo1945a(this);
        fVar.m1916a(c0366l);
        return true;
    }

    /* renamed from: d */
    private boolean m1866d(int i, KeyEvent keyEvent) {
        if (keyEvent.getRepeatCount() != 0) {
            return false;
        }
        f m1879a = m1879a(i, true);
        if (m1879a.f1656o) {
            return false;
        }
        return m1864b(m1879a, keyEvent);
    }

    /* renamed from: e */
    private boolean m1867e(int i, KeyEvent keyEvent) {
        boolean z;
        boolean z2;
        InterfaceC0409K interfaceC0409K;
        if (this.f1621p != null) {
            return false;
        }
        f m1879a = m1879a(i, true);
        if (i != 0 || (interfaceC0409K = this.f1618m) == null || !interfaceC0409K.mo2123c() || ViewConfiguration.get(this.f1610e).hasPermanentMenuKey()) {
            if (m1879a.f1656o || m1879a.f1655n) {
                z = m1879a.f1656o;
                m1883a(m1879a, true);
            } else {
                if (m1879a.f1654m) {
                    if (m1879a.f1659r) {
                        m1879a.f1654m = false;
                        z2 = m1864b(m1879a, keyEvent);
                    } else {
                        z2 = true;
                    }
                    if (z2) {
                        m1858a(m1879a, keyEvent);
                        z = true;
                    }
                }
                z = false;
            }
        } else if (this.f1618m.mo2121a()) {
            z = this.f1618m.mo2125e();
        } else {
            if (!this.f1599K && m1864b(m1879a, keyEvent)) {
                z = this.f1618m.mo2126f();
            }
            z = false;
        }
        if (z) {
            AudioManager audioManager = (AudioManager) this.f1610e.getSystemService("audio");
            if (audioManager != null) {
                audioManager.playSoundEffect(0);
            } else {
                Log.w("AppCompatDelegate", "Couldn't get audio manager");
            }
        }
        return z;
    }

    /* renamed from: j */
    private void m1868j(int i) {
        this.f1604P = (1 << i) | this.f1604P;
        if (this.f1603O) {
            return;
        }
        C0107v.m501a(this.f1611f.getDecorView(), this.f1605Q);
        this.f1603O = true;
    }

    /* renamed from: k */
    private int m1869k(int i) {
        if (i == 8) {
            Log.i("AppCompatDelegate", "You should now use the AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR id when requesting this feature.");
            return C0121j.AppCompatTheme_tooltipForegroundColor;
        }
        if (i != 9) {
            return i;
        }
        Log.i("AppCompatDelegate", "You should now use the AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR_OVERLAY id when requesting this feature.");
        return C0121j.AppCompatTheme_tooltipFrameBackground;
    }

    /* renamed from: l */
    private boolean m1870l(int i) {
        Resources resources = this.f1610e.getResources();
        Configuration configuration = resources.getConfiguration();
        int i2 = configuration.uiMode & 48;
        int i3 = i == 2 ? 32 : 16;
        if (i2 == i3) {
            return false;
        }
        if (m1877z()) {
            ((Activity) this.f1610e).recreate();
            return true;
        }
        Configuration configuration2 = new Configuration(configuration);
        DisplayMetrics displayMetrics = resources.getDisplayMetrics();
        configuration2.uiMode = i3 | (configuration2.uiMode & (-49));
        resources.updateConfiguration(configuration2, displayMetrics);
        if (Build.VERSION.SDK_INT >= 26) {
            return true;
        }
        C0315C.m1752a(resources);
        return true;
    }

    /* renamed from: t */
    private void m1871t() {
        ContentFrameLayout contentFrameLayout = (ContentFrameLayout) this.f1628w.findViewById(R.id.content);
        View decorView = this.f1611f.getDecorView();
        contentFrameLayout.m2191a(decorView.getPaddingLeft(), decorView.getPaddingTop(), decorView.getPaddingRight(), decorView.getPaddingBottom());
        TypedArray obtainStyledAttributes = this.f1610e.obtainStyledAttributes(C0121j.AppCompatTheme);
        obtainStyledAttributes.getValue(C0121j.AppCompatTheme_windowMinWidthMajor, contentFrameLayout.getMinWidthMajor());
        obtainStyledAttributes.getValue(C0121j.AppCompatTheme_windowMinWidthMinor, contentFrameLayout.getMinWidthMinor());
        if (obtainStyledAttributes.hasValue(C0121j.AppCompatTheme_windowFixedWidthMajor)) {
            obtainStyledAttributes.getValue(C0121j.AppCompatTheme_windowFixedWidthMajor, contentFrameLayout.getFixedWidthMajor());
        }
        if (obtainStyledAttributes.hasValue(C0121j.AppCompatTheme_windowFixedWidthMinor)) {
            obtainStyledAttributes.getValue(C0121j.AppCompatTheme_windowFixedWidthMinor, contentFrameLayout.getFixedWidthMinor());
        }
        if (obtainStyledAttributes.hasValue(C0121j.AppCompatTheme_windowFixedHeightMajor)) {
            obtainStyledAttributes.getValue(C0121j.AppCompatTheme_windowFixedHeightMajor, contentFrameLayout.getFixedHeightMajor());
        }
        if (obtainStyledAttributes.hasValue(C0121j.AppCompatTheme_windowFixedHeightMinor)) {
            obtainStyledAttributes.getValue(C0121j.AppCompatTheme_windowFixedHeightMinor, contentFrameLayout.getFixedHeightMinor());
        }
        obtainStyledAttributes.recycle();
        contentFrameLayout.requestLayout();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* renamed from: u */
    private ViewGroup m1872u() {
        ViewGroup viewGroup;
        TypedArray obtainStyledAttributes = this.f1610e.obtainStyledAttributes(C0121j.AppCompatTheme);
        if (!obtainStyledAttributes.hasValue(C0121j.AppCompatTheme_windowActionBar)) {
            obtainStyledAttributes.recycle();
            throw new IllegalStateException("You need to use a Theme.AppCompat theme (or descendant) with this activity.");
        }
        if (obtainStyledAttributes.getBoolean(C0121j.AppCompatTheme_windowNoTitle, false)) {
            mo1843b(1);
        } else if (obtainStyledAttributes.getBoolean(C0121j.AppCompatTheme_windowActionBar, false)) {
            mo1843b(C0121j.AppCompatTheme_tooltipForegroundColor);
        }
        if (obtainStyledAttributes.getBoolean(C0121j.AppCompatTheme_windowActionBarOverlay, false)) {
            mo1843b(C0121j.AppCompatTheme_tooltipFrameBackground);
        }
        if (obtainStyledAttributes.getBoolean(C0121j.AppCompatTheme_windowActionModeOverlay, false)) {
            mo1843b(10);
        }
        this.f1593E = obtainStyledAttributes.getBoolean(C0121j.AppCompatTheme_android_windowIsFloating, false);
        obtainStyledAttributes.recycle();
        this.f1611f.getDecorView();
        LayoutInflater from = LayoutInflater.from(this.f1610e);
        if (this.f1594F) {
            ViewGroup viewGroup2 = (ViewGroup) from.inflate(this.f1592D ? C0118g.abc_screen_simple_overlay_action_mode : C0118g.abc_screen_simple, (ViewGroup) null);
            if (Build.VERSION.SDK_INT >= 21) {
                C0107v.m497a(viewGroup2, new C0339r(this));
                viewGroup = viewGroup2;
            } else {
                ((InterfaceC0414O) viewGroup2).setOnFitSystemWindowsListener(new C0340s(this));
                viewGroup = viewGroup2;
            }
        } else if (this.f1593E) {
            ViewGroup viewGroup3 = (ViewGroup) from.inflate(C0118g.abc_dialog_title_material, (ViewGroup) null);
            this.f1591C = false;
            this.f1590B = false;
            viewGroup = viewGroup3;
        } else if (this.f1590B) {
            TypedValue typedValue = new TypedValue();
            this.f1610e.getTheme().resolveAttribute(C0112a.actionBarTheme, typedValue, true);
            int i = typedValue.resourceId;
            ViewGroup viewGroup4 = (ViewGroup) LayoutInflater.from(i != 0 ? new C0133d(this.f1610e, i) : this.f1610e).inflate(C0118g.abc_screen_toolbar, (ViewGroup) null);
            this.f1618m = (InterfaceC0409K) viewGroup4.findViewById(C0117f.decor_content_parent);
            this.f1618m.setWindowCallback(m1901o());
            if (this.f1591C) {
                this.f1618m.mo2119a(C0121j.AppCompatTheme_tooltipFrameBackground);
            }
            if (this.f1631z) {
                this.f1618m.mo2119a(2);
            }
            viewGroup = viewGroup4;
            if (this.f1589A) {
                this.f1618m.mo2119a(5);
                viewGroup = viewGroup4;
            }
        } else {
            viewGroup = null;
        }
        if (viewGroup == null) {
            throw new IllegalArgumentException("AppCompat does not support the current theme features: { windowActionBar: " + this.f1590B + ", windowActionBarOverlay: " + this.f1591C + ", android:windowIsFloating: " + this.f1593E + ", windowActionModeOverlay: " + this.f1592D + ", windowNoTitle: " + this.f1594F + " }");
        }
        if (this.f1618m == null) {
            this.f1629x = (TextView) viewGroup.findViewById(C0117f.title);
        }
        C0408Ja.m2260b(viewGroup);
        ContentFrameLayout contentFrameLayout = (ContentFrameLayout) viewGroup.findViewById(C0117f.action_bar_activity_content);
        ViewGroup viewGroup5 = (ViewGroup) this.f1611f.findViewById(R.id.content);
        if (viewGroup5 != null) {
            while (viewGroup5.getChildCount() > 0) {
                View childAt = viewGroup5.getChildAt(0);
                viewGroup5.removeViewAt(0);
                contentFrameLayout.addView(childAt);
            }
            viewGroup5.setId(-1);
            contentFrameLayout.setId(R.id.content);
            if (viewGroup5 instanceof FrameLayout) {
                ((FrameLayout) viewGroup5).setForeground(null);
            }
        }
        this.f1611f.setContentView(viewGroup);
        contentFrameLayout.setAttachListener(new C0341t(this));
        return viewGroup;
    }

    /* renamed from: v */
    private void m1873v() {
        if (this.f1602N == null) {
            this.f1602N = new d(C0317E.m1760a(this.f1610e));
        }
    }

    /* renamed from: w */
    private void m1874w() {
        if (this.f1627v) {
            return;
        }
        this.f1628w = m1872u();
        CharSequence m1900n = m1900n();
        if (!TextUtils.isEmpty(m1900n)) {
            InterfaceC0409K interfaceC0409K = this.f1618m;
            if (interfaceC0409K != null) {
                interfaceC0409K.setWindowTitle(m1900n);
            } else if (m1904r() != null) {
                m1904r().mo1779a(m1900n);
            } else {
                TextView textView = this.f1629x;
                if (textView != null) {
                    textView.setText(m1900n);
                }
            }
        }
        m1871t();
        m1884a(this.f1628w);
        this.f1627v = true;
        f m1879a = m1879a(0, false);
        if (this.f1599K) {
            return;
        }
        if (m1879a == null || m1879a.f1651j == null) {
            m1868j(C0121j.AppCompatTheme_tooltipForegroundColor);
        }
    }

    /* renamed from: x */
    private int m1875x() {
        int i = this.f1600L;
        return i != -100 ? i : AbstractC0336o.m1833b();
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:14:? A[RETURN, SYNTHETIC] */
    /* renamed from: y */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void m1876y() {
        /*
            r3 = this;
            r3.m1874w()
            boolean r0 = r3.f1590B
            if (r0 == 0) goto L33
            android.support.v7.app.a r0 = r3.f1615j
            if (r0 == 0) goto Lc
            goto L33
        Lc:
            android.view.Window$Callback r0 = r3.f1612g
            boolean r1 = r0 instanceof android.app.Activity
            if (r1 == 0) goto L1e
            android.support.v7.app.I r1 = new android.support.v7.app.I
            android.app.Activity r0 = (android.app.Activity) r0
            boolean r2 = r3.f1591C
            r1.<init>(r0, r2)
        L1b:
            r3.f1615j = r1
            goto L2a
        L1e:
            boolean r1 = r0 instanceof android.app.Dialog
            if (r1 == 0) goto L2a
            android.support.v7.app.I r1 = new android.support.v7.app.I
            android.app.Dialog r0 = (android.app.Dialog) r0
            r1.<init>(r0)
            goto L1b
        L2a:
            android.support.v7.app.a r0 = r3.f1615j
            if (r0 == 0) goto L33
            boolean r1 = r3.f1606R
            r0.mo1785c(r1)
        L33:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v7.app.LayoutInflaterFactory2C0345x.m1876y():void");
    }

    /* renamed from: z */
    private boolean m1877z() {
        if (this.f1601M) {
            Context context = this.f1610e;
            if (context instanceof Activity) {
                try {
                    return (context.getPackageManager().getActivityInfo(new ComponentName(this.f1610e, this.f1610e.getClass()), 0).configChanges & 512) == 0;
                } catch (PackageManager.NameNotFoundException e2) {
                    Log.d("AppCompatDelegate", "Exception while getting ActivityInfo", e2);
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: a */
    public AbstractC0131b m1878a(AbstractC0131b.a aVar) {
        InterfaceC0335n interfaceC0335n;
        if (aVar == null) {
            throw new IllegalArgumentException("ActionMode callback can not be null.");
        }
        AbstractC0131b abstractC0131b = this.f1621p;
        if (abstractC0131b != null) {
            abstractC0131b.mo625a();
        }
        b bVar = new b(aVar);
        AbstractC0322a mo1847d = mo1847d();
        if (mo1847d != null) {
            this.f1621p = mo1847d.mo1773a(bVar);
            AbstractC0131b abstractC0131b2 = this.f1621p;
            if (abstractC0131b2 != null && (interfaceC0335n = this.f1614i) != null) {
                interfaceC0335n.mo1751b(abstractC0131b2);
            }
        }
        if (this.f1621p == null) {
            this.f1621p = m1887b(bVar);
        }
        return this.f1621p;
    }

    /* renamed from: a */
    protected f m1879a(int i, boolean z) {
        f[] fVarArr = this.f1596H;
        if (fVarArr == null || fVarArr.length <= i) {
            f[] fVarArr2 = new f[i + 1];
            if (fVarArr != null) {
                System.arraycopy(fVarArr, 0, fVarArr2, 0, fVarArr.length);
            }
            this.f1596H = fVarArr2;
            fVarArr = fVarArr2;
        }
        f fVar = fVarArr[i];
        if (fVar != null) {
            return fVar;
        }
        f fVar2 = new f(i);
        fVarArr[i] = fVar2;
        return fVar2;
    }

    /* renamed from: a */
    f m1880a(Menu menu) {
        f[] fVarArr = this.f1596H;
        int length = fVarArr != null ? fVarArr.length : 0;
        for (int i = 0; i < length; i++) {
            f fVar = fVarArr[i];
            if (fVar != null && fVar.f1651j == menu) {
                return fVar;
            }
        }
        return null;
    }

    @Override // android.support.v7.app.AbstractC0336o
    /* renamed from: a */
    public <T extends View> T mo1834a(int i) {
        m1874w();
        return (T) this.f1611f.findViewById(i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: a */
    public View m1881a(View view, String str, Context context, AttributeSet attributeSet) {
        boolean z;
        AppCompatViewInflater appCompatViewInflater;
        boolean z2 = false;
        if (this.f1609U == null) {
            String string = this.f1610e.obtainStyledAttributes(C0121j.AppCompatTheme).getString(C0121j.AppCompatTheme_viewInflaterClass);
            if (string == null || AppCompatViewInflater.class.getName().equals(string)) {
                appCompatViewInflater = new AppCompatViewInflater();
            } else {
                try {
                    this.f1609U = (AppCompatViewInflater) Class.forName(string).getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
                } catch (Throwable th) {
                    Log.i("AppCompatDelegate", "Failed to instantiate custom view inflater " + string + ". Falling back to default.", th);
                    appCompatViewInflater = new AppCompatViewInflater();
                }
            }
            this.f1609U = appCompatViewInflater;
        }
        if (f1586b) {
            if (!(attributeSet instanceof XmlPullParser)) {
                z2 = m1862a((ViewParent) view);
            } else if (((XmlPullParser) attributeSet).getDepth() > 1) {
                z2 = true;
            }
            z = z2;
        } else {
            z = false;
        }
        return this.f1609U.m1731a(view, str, context, attributeSet, z, f1586b, true, C0406Ia.m2230b());
    }

    /* renamed from: a */
    void m1882a(int i, f fVar, Menu menu) {
        if (menu == null) {
            if (fVar == null && i >= 0) {
                f[] fVarArr = this.f1596H;
                if (i < fVarArr.length) {
                    fVar = fVarArr[i];
                }
            }
            if (fVar != null) {
                menu = fVar.f1651j;
            }
        }
        if ((fVar == null || fVar.f1656o) && !this.f1599K) {
            this.f1612g.onPanelClosed(i, menu);
        }
    }

    @Override // android.support.v7.app.AbstractC0336o
    /* renamed from: a */
    public void mo1835a(Configuration configuration) {
        AbstractC0322a mo1847d;
        if (this.f1590B && this.f1627v && (mo1847d = mo1847d()) != null) {
            mo1847d.mo1778a(configuration);
        }
        C0464o.m2506a().m2528a(this.f1610e);
        mo1840a();
    }

    @Override // android.support.v7.app.AbstractC0336o
    /* renamed from: a */
    public void mo1836a(Bundle bundle) {
        Window.Callback callback = this.f1612g;
        if (callback instanceof Activity) {
            String str = null;
            try {
                str = C0188Z.m841b((Activity) callback);
            } catch (IllegalArgumentException unused) {
            }
            if (str != null) {
                AbstractC0322a m1904r = m1904r();
                if (m1904r == null) {
                    this.f1606R = true;
                } else {
                    m1904r.mo1785c(true);
                }
            }
        }
        if (bundle == null || this.f1600L != -100) {
            return;
        }
        this.f1600L = bundle.getInt("appcompat:local_night_mode", -100);
    }

    /* renamed from: a */
    void m1883a(f fVar, boolean z) {
        ViewGroup viewGroup;
        InterfaceC0409K interfaceC0409K;
        if (z && fVar.f1642a == 0 && (interfaceC0409K = this.f1618m) != null && interfaceC0409K.mo2121a()) {
            m1888b(fVar.f1651j);
            return;
        }
        WindowManager windowManager = (WindowManager) this.f1610e.getSystemService("window");
        if (windowManager != null && fVar.f1656o && (viewGroup = fVar.f1648g) != null) {
            windowManager.removeView(viewGroup);
            if (z) {
                m1882a(fVar.f1642a, fVar, null);
            }
        }
        fVar.f1654m = false;
        fVar.f1655n = false;
        fVar.f1656o = false;
        fVar.f1649h = null;
        fVar.f1658q = true;
        if (this.f1597I == fVar) {
            this.f1597I = null;
        }
    }

    @Override // android.support.v7.view.menu.C0366l.a
    /* renamed from: a */
    public void mo650a(C0366l c0366l) {
        m1859a(c0366l, true);
    }

    @Override // android.support.v7.app.AbstractC0336o
    /* renamed from: a */
    public void mo1837a(View view) {
        m1874w();
        ViewGroup viewGroup = (ViewGroup) this.f1628w.findViewById(R.id.content);
        viewGroup.removeAllViews();
        viewGroup.addView(view);
        this.f1612g.onContentChanged();
    }

    @Override // android.support.v7.app.AbstractC0336o
    /* renamed from: a */
    public void mo1838a(View view, ViewGroup.LayoutParams layoutParams) {
        m1874w();
        ((ViewGroup) this.f1628w.findViewById(R.id.content)).addView(view, layoutParams);
        this.f1612g.onContentChanged();
    }

    /* renamed from: a */
    void m1884a(ViewGroup viewGroup) {
    }

    @Override // android.support.v7.app.AbstractC0336o
    /* renamed from: a */
    public final void mo1839a(CharSequence charSequence) {
        this.f1617l = charSequence;
        InterfaceC0409K interfaceC0409K = this.f1618m;
        if (interfaceC0409K != null) {
            interfaceC0409K.setWindowTitle(charSequence);
            return;
        }
        if (m1904r() != null) {
            m1904r().mo1779a(charSequence);
            return;
        }
        TextView textView = this.f1629x;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }

    @Override // android.support.v7.app.AbstractC0336o
    /* renamed from: a */
    public boolean mo1840a() {
        int m1875x = m1875x();
        int m1893f = m1893f(m1875x);
        boolean m1870l = m1893f != -1 ? m1870l(m1893f) : false;
        if (m1875x == 0) {
            m1873v();
            this.f1602N.m1912d();
        }
        this.f1601M = true;
        return m1870l;
    }

    /* renamed from: a */
    boolean m1885a(int i, KeyEvent keyEvent) {
        if (i == 4) {
            this.f1598J = (keyEvent.getFlags() & 128) != 0;
        } else if (i == 82) {
            m1866d(0, keyEvent);
            return true;
        }
        return false;
    }

    @Override // android.support.v7.view.menu.C0366l.a
    /* renamed from: a */
    public boolean mo651a(C0366l c0366l, MenuItem menuItem) {
        f m1880a;
        Window.Callback m1901o = m1901o();
        if (m1901o == null || this.f1599K || (m1880a = m1880a((Menu) c0366l.mo1950m())) == null) {
            return false;
        }
        return m1901o.onMenuItemSelected(m1880a.f1642a, menuItem);
    }

    /* renamed from: a */
    boolean m1886a(KeyEvent keyEvent) {
        View decorView;
        Window.Callback callback = this.f1612g;
        if (((callback instanceof C0092g.a) || (callback instanceof DialogC0314B)) && (decorView = this.f1611f.getDecorView()) != null && C0092g.m435a(decorView, keyEvent)) {
            return true;
        }
        if (keyEvent.getKeyCode() == 82 && this.f1612g.dispatchKeyEvent(keyEvent)) {
            return true;
        }
        int keyCode = keyEvent.getKeyCode();
        return keyEvent.getAction() == 0 ? m1885a(keyCode, keyEvent) : m1890c(keyCode, keyEvent);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0029  */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    p000a.p005b.p022d.p029e.AbstractC0131b m1887b(p000a.p005b.p022d.p029e.AbstractC0131b.a r8) {
        /*
            Method dump skipped, instructions count: 371
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v7.app.LayoutInflaterFactory2C0345x.m1887b(a.b.d.e.b$a):a.b.d.e.b");
    }

    @Override // android.support.v7.app.AbstractC0336o
    /* renamed from: b */
    public void mo1841b(Bundle bundle) {
        m1874w();
    }

    /* renamed from: b */
    void m1888b(C0366l c0366l) {
        if (this.f1595G) {
            return;
        }
        this.f1595G = true;
        this.f1618m.mo2127g();
        Window.Callback m1901o = m1901o();
        if (m1901o != null && !this.f1599K) {
            m1901o.onPanelClosed(C0121j.AppCompatTheme_tooltipForegroundColor, c0366l);
        }
        this.f1595G = false;
    }

    @Override // android.support.v7.app.AbstractC0336o
    /* renamed from: b */
    public void mo1842b(View view, ViewGroup.LayoutParams layoutParams) {
        m1874w();
        ViewGroup viewGroup = (ViewGroup) this.f1628w.findViewById(R.id.content);
        viewGroup.removeAllViews();
        viewGroup.addView(view, layoutParams);
        this.f1612g.onContentChanged();
    }

    @Override // android.support.v7.app.AbstractC0336o
    /* renamed from: b */
    public boolean mo1843b(int i) {
        int m1869k = m1869k(i);
        if (this.f1594F && m1869k == 108) {
            return false;
        }
        if (this.f1590B && m1869k == 1) {
            this.f1590B = false;
        }
        if (m1869k == 1) {
            m1857A();
            this.f1594F = true;
            return true;
        }
        if (m1869k == 2) {
            m1857A();
            this.f1631z = true;
            return true;
        }
        if (m1869k == 5) {
            m1857A();
            this.f1589A = true;
            return true;
        }
        if (m1869k == 10) {
            m1857A();
            this.f1592D = true;
            return true;
        }
        if (m1869k == 108) {
            m1857A();
            this.f1590B = true;
            return true;
        }
        if (m1869k != 109) {
            return this.f1611f.requestFeature(m1869k);
        }
        m1857A();
        this.f1591C = true;
        return true;
    }

    /* renamed from: b */
    boolean m1889b(int i, KeyEvent keyEvent) {
        AbstractC0322a mo1847d = mo1847d();
        if (mo1847d != null && mo1847d.mo1781a(i, keyEvent)) {
            return true;
        }
        f fVar = this.f1597I;
        if (fVar != null && m1861a(fVar, keyEvent.getKeyCode(), keyEvent, 1)) {
            f fVar2 = this.f1597I;
            if (fVar2 != null) {
                fVar2.f1655n = true;
            }
            return true;
        }
        if (this.f1597I == null) {
            f m1879a = m1879a(0, true);
            m1864b(m1879a, keyEvent);
            boolean m1861a = m1861a(m1879a, keyEvent.getKeyCode(), keyEvent, 1);
            m1879a.f1654m = false;
            if (m1861a) {
                return true;
            }
        }
        return false;
    }

    @Override // android.support.v7.app.AbstractC0336o
    /* renamed from: c */
    public MenuInflater mo1844c() {
        if (this.f1616k == null) {
            m1876y();
            AbstractC0322a abstractC0322a = this.f1615j;
            this.f1616k = new C0136g(abstractC0322a != null ? abstractC0322a.mo1793h() : this.f1610e);
        }
        return this.f1616k;
    }

    @Override // android.support.v7.app.AbstractC0336o
    /* renamed from: c */
    public void mo1845c(int i) {
        m1874w();
        ViewGroup viewGroup = (ViewGroup) this.f1628w.findViewById(R.id.content);
        viewGroup.removeAllViews();
        LayoutInflater.from(this.f1610e).inflate(i, viewGroup);
        this.f1612g.onContentChanged();
    }

    @Override // android.support.v7.app.AbstractC0336o
    /* renamed from: c */
    public void mo1846c(Bundle bundle) {
        int i = this.f1600L;
        if (i != -100) {
            bundle.putInt("appcompat:local_night_mode", i);
        }
    }

    /* renamed from: c */
    boolean m1890c(int i, KeyEvent keyEvent) {
        if (i == 4) {
            boolean z = this.f1598J;
            this.f1598J = false;
            f m1879a = m1879a(0, false);
            if (m1879a != null && m1879a.f1656o) {
                if (!z) {
                    m1883a(m1879a, true);
                }
                return true;
            }
            if (m1903q()) {
                return true;
            }
        } else if (i == 82) {
            m1867e(0, keyEvent);
            return true;
        }
        return false;
    }

    @Override // android.support.v7.app.AbstractC0336o
    /* renamed from: d */
    public AbstractC0322a mo1847d() {
        m1876y();
        return this.f1615j;
    }

    /* renamed from: d */
    void m1891d(int i) {
        m1883a(m1879a(i, true), true);
    }

    @Override // android.support.v7.app.AbstractC0336o
    /* renamed from: e */
    public void mo1848e() {
        LayoutInflater from = LayoutInflater.from(this.f1610e);
        if (from.getFactory() == null) {
            C0093h.m437a(from, this);
        } else {
            if (from.getFactory2() instanceof LayoutInflaterFactory2C0345x) {
                return;
            }
            Log.i("AppCompatDelegate", "The Activity's LayoutInflater already has a Factory installed so we can not install AppCompat's");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public void m1892e(int i) {
        f m1879a;
        f m1879a2 = m1879a(i, true);
        if (m1879a2.f1651j != null) {
            Bundle bundle = new Bundle();
            m1879a2.f1651j.m2025b(bundle);
            if (bundle.size() > 0) {
                m1879a2.f1660s = bundle;
            }
            m1879a2.f1651j.m2045s();
            m1879a2.f1651j.clear();
        }
        m1879a2.f1659r = true;
        m1879a2.f1658q = true;
        if ((i != 108 && i != 0) || this.f1618m == null || (m1879a = m1879a(0, false)) == null) {
            return;
        }
        m1879a.f1654m = false;
        m1864b(m1879a, (KeyEvent) null);
    }

    /* renamed from: f */
    int m1893f(int i) {
        if (i == -100) {
            return -1;
        }
        if (i != 0) {
            return i;
        }
        if (Build.VERSION.SDK_INT >= 23 && ((UiModeManager) this.f1610e.getSystemService(UiModeManager.class)).getNightMode() == 0) {
            return -1;
        }
        m1873v();
        return this.f1602N.m1911c();
    }

    @Override // android.support.v7.app.AbstractC0336o
    /* renamed from: f */
    public void mo1849f() {
        AbstractC0322a mo1847d = mo1847d();
        if (mo1847d == null || !mo1847d.m1802i()) {
            m1868j(0);
        }
    }

    @Override // android.support.v7.app.AbstractC0336o
    /* renamed from: g */
    public void mo1850g() {
        if (this.f1603O) {
            this.f1611f.getDecorView().removeCallbacks(this.f1605Q);
        }
        this.f1599K = true;
        AbstractC0322a abstractC0322a = this.f1615j;
        if (abstractC0322a != null) {
            abstractC0322a.m1803j();
        }
        d dVar = this.f1602N;
        if (dVar != null) {
            dVar.m1909a();
        }
    }

    /* renamed from: g */
    void m1894g(int i) {
        AbstractC0322a mo1847d;
        if (i != 108 || (mo1847d = mo1847d()) == null) {
            return;
        }
        mo1847d.mo1783b(true);
    }

    @Override // android.support.v7.app.AbstractC0336o
    /* renamed from: h */
    public void mo1851h() {
        AbstractC0322a mo1847d = mo1847d();
        if (mo1847d != null) {
            mo1847d.mo1787d(true);
        }
    }

    /* renamed from: h */
    void m1895h(int i) {
        if (i == 108) {
            AbstractC0322a mo1847d = mo1847d();
            if (mo1847d != null) {
                mo1847d.mo1783b(false);
                return;
            }
            return;
        }
        if (i == 0) {
            f m1879a = m1879a(i, true);
            if (m1879a.f1656o) {
                m1883a(m1879a, false);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: i */
    public int m1896i(int i) {
        boolean z;
        boolean z2;
        ActionBarContextView actionBarContextView = this.f1622q;
        if (actionBarContextView == null || !(actionBarContextView.getLayoutParams() instanceof ViewGroup.MarginLayoutParams)) {
            z = false;
        } else {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f1622q.getLayoutParams();
            if (this.f1622q.isShown()) {
                if (this.f1607S == null) {
                    this.f1607S = new Rect();
                    this.f1608T = new Rect();
                }
                Rect rect = this.f1607S;
                Rect rect2 = this.f1608T;
                rect.set(0, i, 0, 0);
                C0408Ja.m2258a(this.f1628w, rect, rect2);
                if (marginLayoutParams.topMargin != (rect2.top == 0 ? i : 0)) {
                    marginLayoutParams.topMargin = i;
                    View view = this.f1630y;
                    if (view == null) {
                        this.f1630y = new View(this.f1610e);
                        this.f1630y.setBackgroundColor(this.f1610e.getResources().getColor(C0114c.abc_input_method_navigation_guard));
                        this.f1628w.addView(this.f1630y, -1, new ViewGroup.LayoutParams(-1, i));
                    } else {
                        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                        if (layoutParams.height != i) {
                            layoutParams.height = i;
                            this.f1630y.setLayoutParams(layoutParams);
                        }
                    }
                    z2 = true;
                } else {
                    z2 = false;
                }
                z = this.f1630y != null;
                if (!this.f1592D && z) {
                    i = 0;
                }
            } else {
                if (marginLayoutParams.topMargin != 0) {
                    marginLayoutParams.topMargin = 0;
                    z2 = true;
                } else {
                    z2 = false;
                }
                z = false;
            }
            if (z2) {
                this.f1622q.setLayoutParams(marginLayoutParams);
            }
        }
        View view2 = this.f1630y;
        if (view2 != null) {
            view2.setVisibility(z ? 0 : 8);
        }
        return i;
    }

    @Override // android.support.v7.app.AbstractC0336o
    /* renamed from: i */
    public void mo1852i() {
        mo1840a();
    }

    @Override // android.support.v7.app.AbstractC0336o
    /* renamed from: j */
    public void mo1853j() {
        AbstractC0322a mo1847d = mo1847d();
        if (mo1847d != null) {
            mo1847d.mo1787d(false);
        }
        d dVar = this.f1602N;
        if (dVar != null) {
            dVar.m1909a();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: k */
    public void m1897k() {
        C0366l c0366l;
        InterfaceC0409K interfaceC0409K = this.f1618m;
        if (interfaceC0409K != null) {
            interfaceC0409K.mo2127g();
        }
        if (this.f1623r != null) {
            this.f1611f.getDecorView().removeCallbacks(this.f1624s);
            if (this.f1623r.isShowing()) {
                try {
                    this.f1623r.dismiss();
                } catch (IllegalArgumentException unused) {
                }
            }
            this.f1623r = null;
        }
        m1898l();
        f m1879a = m1879a(0, false);
        if (m1879a == null || (c0366l = m1879a.f1651j) == null) {
            return;
        }
        c0366l.close();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: l */
    public void m1898l() {
        C0074H c0074h = this.f1625t;
        if (c0074h != null) {
            c0074h.m343a();
        }
    }

    /* renamed from: m */
    final Context m1899m() {
        AbstractC0322a mo1847d = mo1847d();
        Context mo1793h = mo1847d != null ? mo1847d.mo1793h() : null;
        return mo1793h == null ? this.f1610e : mo1793h;
    }

    /* renamed from: n */
    final CharSequence m1900n() {
        Window.Callback callback = this.f1612g;
        return callback instanceof Activity ? ((Activity) callback).getTitle() : this.f1617l;
    }

    /* renamed from: o */
    final Window.Callback m1901o() {
        return this.f1611f.getCallback();
    }

    @Override // android.view.LayoutInflater.Factory2
    public final View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        return m1881a(view, str, context, attributeSet);
    }

    @Override // android.view.LayoutInflater.Factory
    public View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return onCreateView(null, str, context, attributeSet);
    }

    /* renamed from: p */
    public boolean m1902p() {
        return this.f1626u;
    }

    /* renamed from: q */
    boolean m1903q() {
        AbstractC0131b abstractC0131b = this.f1621p;
        if (abstractC0131b != null) {
            abstractC0131b.mo625a();
            return true;
        }
        AbstractC0322a mo1847d = mo1847d();
        return mo1847d != null && mo1847d.mo1790f();
    }

    /* renamed from: r */
    final AbstractC0322a m1904r() {
        return this.f1615j;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: s */
    public final boolean m1905s() {
        ViewGroup viewGroup;
        return this.f1627v && (viewGroup = this.f1628w) != null && C0107v.m530r(viewGroup);
    }
}
