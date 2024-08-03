package android.support.v7.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.support.v4.widget.C0301s;
import android.support.v7.view.menu.InterfaceC0380z;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow;
import java.lang.reflect.Method;
import p000a.p005b.p009c.p019h.C0107v;
import p000a.p005b.p022d.p023a.C0121j;

/* renamed from: android.support.v7.widget.U */
/* loaded from: classes.dex */
public class C0429U implements InterfaceC0380z {

    /* renamed from: a */
    private static Method f2240a;

    /* renamed from: b */
    private static Method f2241b;

    /* renamed from: c */
    private static Method f2242c;

    /* renamed from: A */
    final e f2243A;

    /* renamed from: B */
    private final d f2244B;

    /* renamed from: C */
    private final c f2245C;

    /* renamed from: D */
    private final a f2246D;

    /* renamed from: E */
    private Runnable f2247E;

    /* renamed from: F */
    final Handler f2248F;

    /* renamed from: G */
    private final Rect f2249G;

    /* renamed from: H */
    private Rect f2250H;

    /* renamed from: I */
    private boolean f2251I;

    /* renamed from: J */
    PopupWindow f2252J;

    /* renamed from: d */
    private Context f2253d;

    /* renamed from: e */
    private ListAdapter f2254e;

    /* renamed from: f */
    C0413N f2255f;

    /* renamed from: g */
    private int f2256g;

    /* renamed from: h */
    private int f2257h;

    /* renamed from: i */
    private int f2258i;

    /* renamed from: j */
    private int f2259j;

    /* renamed from: k */
    private int f2260k;

    /* renamed from: l */
    private boolean f2261l;

    /* renamed from: m */
    private boolean f2262m;

    /* renamed from: n */
    private boolean f2263n;

    /* renamed from: o */
    private boolean f2264o;

    /* renamed from: p */
    private int f2265p;

    /* renamed from: q */
    private boolean f2266q;

    /* renamed from: r */
    private boolean f2267r;

    /* renamed from: s */
    int f2268s;

    /* renamed from: t */
    private View f2269t;

    /* renamed from: u */
    private int f2270u;

    /* renamed from: v */
    private DataSetObserver f2271v;

    /* renamed from: w */
    private View f2272w;

    /* renamed from: x */
    private Drawable f2273x;

    /* renamed from: y */
    private AdapterView.OnItemClickListener f2274y;

    /* renamed from: z */
    private AdapterView.OnItemSelectedListener f2275z;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: android.support.v7.widget.U$a */
    /* loaded from: classes.dex */
    public class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            C0429U.this.m2392a();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: android.support.v7.widget.U$b */
    /* loaded from: classes.dex */
    public class b extends DataSetObserver {
        b() {
        }

        @Override // android.database.DataSetObserver
        public void onChanged() {
            if (C0429U.this.mo1940b()) {
                C0429U.this.mo1941c();
            }
        }

        @Override // android.database.DataSetObserver
        public void onInvalidated() {
            C0429U.this.dismiss();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: android.support.v7.widget.U$c */
    /* loaded from: classes.dex */
    public class c implements AbsListView.OnScrollListener {
        c() {
        }

        @Override // android.widget.AbsListView.OnScrollListener
        public void onScroll(AbsListView absListView, int i, int i2, int i3) {
        }

        @Override // android.widget.AbsListView.OnScrollListener
        public void onScrollStateChanged(AbsListView absListView, int i) {
            if (i != 1 || C0429U.this.m2414j() || C0429U.this.f2252J.getContentView() == null) {
                return;
            }
            C0429U c0429u = C0429U.this;
            c0429u.f2248F.removeCallbacks(c0429u.f2243A);
            C0429U.this.f2243A.run();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: android.support.v7.widget.U$d */
    /* loaded from: classes.dex */
    public class d implements View.OnTouchListener {
        d() {
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            PopupWindow popupWindow;
            int action = motionEvent.getAction();
            int x = (int) motionEvent.getX();
            int y = (int) motionEvent.getY();
            if (action == 0 && (popupWindow = C0429U.this.f2252J) != null && popupWindow.isShowing() && x >= 0 && x < C0429U.this.f2252J.getWidth() && y >= 0 && y < C0429U.this.f2252J.getHeight()) {
                C0429U c0429u = C0429U.this;
                c0429u.f2248F.postDelayed(c0429u.f2243A, 250L);
                return false;
            }
            if (action != 1) {
                return false;
            }
            C0429U c0429u2 = C0429U.this;
            c0429u2.f2248F.removeCallbacks(c0429u2.f2243A);
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: android.support.v7.widget.U$e */
    /* loaded from: classes.dex */
    public class e implements Runnable {
        e() {
        }

        @Override // java.lang.Runnable
        public void run() {
            C0413N c0413n = C0429U.this.f2255f;
            if (c0413n == null || !C0107v.m529q(c0413n) || C0429U.this.f2255f.getCount() <= C0429U.this.f2255f.getChildCount()) {
                return;
            }
            int childCount = C0429U.this.f2255f.getChildCount();
            C0429U c0429u = C0429U.this;
            if (childCount <= c0429u.f2268s) {
                c0429u.f2252J.setInputMethodMode(2);
                C0429U.this.mo1941c();
            }
        }
    }

    static {
        try {
            f2240a = PopupWindow.class.getDeclaredMethod("setClipToScreenEnabled", Boolean.TYPE);
        } catch (NoSuchMethodException unused) {
            Log.i("ListPopupWindow", "Could not find method setClipToScreenEnabled() on PopupWindow. Oh well.");
        }
        try {
            f2241b = PopupWindow.class.getDeclaredMethod("getMaxAvailableHeight", View.class, Integer.TYPE, Boolean.TYPE);
        } catch (NoSuchMethodException unused2) {
            Log.i("ListPopupWindow", "Could not find method getMaxAvailableHeight(View, int, boolean) on PopupWindow. Oh well.");
        }
        try {
            f2242c = PopupWindow.class.getDeclaredMethod("setEpicenterBounds", Rect.class);
        } catch (NoSuchMethodException unused3) {
            Log.i("ListPopupWindow", "Could not find method setEpicenterBounds(Rect) on PopupWindow. Oh well.");
        }
    }

    public C0429U(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
    }

    public C0429U(Context context, AttributeSet attributeSet, int i, int i2) {
        this.f2256g = -2;
        this.f2257h = -2;
        this.f2260k = 1002;
        this.f2262m = true;
        this.f2265p = 0;
        this.f2266q = false;
        this.f2267r = false;
        this.f2268s = Integer.MAX_VALUE;
        this.f2270u = 0;
        this.f2243A = new e();
        this.f2244B = new d();
        this.f2245C = new c();
        this.f2246D = new a();
        this.f2249G = new Rect();
        this.f2253d = context;
        this.f2248F = new Handler(context.getMainLooper());
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0121j.ListPopupWindow, i, i2);
        this.f2258i = obtainStyledAttributes.getDimensionPixelOffset(C0121j.ListPopupWindow_android_dropDownHorizontalOffset, 0);
        this.f2259j = obtainStyledAttributes.getDimensionPixelOffset(C0121j.ListPopupWindow_android_dropDownVerticalOffset, 0);
        if (this.f2259j != 0) {
            this.f2261l = true;
        }
        obtainStyledAttributes.recycle();
        this.f2252J = new C0478v(context, attributeSet, i, i2);
        this.f2252J.setInputMethodMode(1);
    }

    /* renamed from: a */
    private int m2387a(View view, int i, boolean z) {
        Method method = f2241b;
        if (method != null) {
            try {
                return ((Integer) method.invoke(this.f2252J, view, Integer.valueOf(i), Boolean.valueOf(z))).intValue();
            } catch (Exception unused) {
                Log.i("ListPopupWindow", "Could not call getMaxAvailableHeightMethod(View, int, boolean) on PopupWindow. Using the public version.");
            }
        }
        return this.f2252J.getMaxAvailableHeight(view, i);
    }

    /* renamed from: c */
    private void m2388c(boolean z) {
        Method method = f2240a;
        if (method != null) {
            try {
                method.invoke(this.f2252J, Boolean.valueOf(z));
            } catch (Exception unused) {
                Log.i("ListPopupWindow", "Could not call setClipToScreenEnabled() on PopupWindow. Oh well.");
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x0154  */
    /* renamed from: l */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private int m2389l() {
        /*
            Method dump skipped, instructions count: 359
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v7.widget.C0429U.m2389l():int");
    }

    /* renamed from: m */
    private void m2390m() {
        View view = this.f2269t;
        if (view != null) {
            ViewParent parent = view.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(this.f2269t);
            }
        }
    }

    /* renamed from: a */
    C0413N mo2391a(Context context, boolean z) {
        return new C0413N(context, z);
    }

    /* renamed from: a */
    public void m2392a() {
        C0413N c0413n = this.f2255f;
        if (c0413n != null) {
            c0413n.setListSelectionHidden(true);
            c0413n.requestLayout();
        }
    }

    /* renamed from: a */
    public void m2393a(int i) {
        this.f2252J.setAnimationStyle(i);
    }

    /* renamed from: a */
    public void m2394a(Rect rect) {
        this.f2250H = rect;
    }

    /* renamed from: a */
    public void m2395a(Drawable drawable) {
        this.f2252J.setBackgroundDrawable(drawable);
    }

    /* renamed from: a */
    public void m2396a(View view) {
        this.f2272w = view;
    }

    /* renamed from: a */
    public void m2397a(AdapterView.OnItemClickListener onItemClickListener) {
        this.f2274y = onItemClickListener;
    }

    /* renamed from: a */
    public void mo2151a(ListAdapter listAdapter) {
        DataSetObserver dataSetObserver = this.f2271v;
        if (dataSetObserver == null) {
            this.f2271v = new b();
        } else {
            ListAdapter listAdapter2 = this.f2254e;
            if (listAdapter2 != null) {
                listAdapter2.unregisterDataSetObserver(dataSetObserver);
            }
        }
        this.f2254e = listAdapter;
        if (listAdapter != null) {
            listAdapter.registerDataSetObserver(this.f2271v);
        }
        C0413N c0413n = this.f2255f;
        if (c0413n != null) {
            c0413n.setAdapter(this.f2254e);
        }
    }

    /* renamed from: a */
    public void m2398a(PopupWindow.OnDismissListener onDismissListener) {
        this.f2252J.setOnDismissListener(onDismissListener);
    }

    /* renamed from: a */
    public void m2399a(boolean z) {
        this.f2251I = z;
        this.f2252J.setFocusable(z);
    }

    /* renamed from: b */
    public void m2400b(int i) {
        Drawable background = this.f2252J.getBackground();
        if (background == null) {
            m2413i(i);
            return;
        }
        background.getPadding(this.f2249G);
        Rect rect = this.f2249G;
        this.f2257h = rect.left + rect.right + i;
    }

    /* renamed from: b */
    public void m2401b(boolean z) {
        this.f2264o = true;
        this.f2263n = z;
    }

    @Override // android.support.v7.view.menu.InterfaceC0380z
    /* renamed from: b */
    public boolean mo1940b() {
        return this.f2252J.isShowing();
    }

    @Override // android.support.v7.view.menu.InterfaceC0380z
    /* renamed from: c */
    public void mo1941c() {
        int m2389l = m2389l();
        boolean m2414j = m2414j();
        C0301s.m1692a(this.f2252J, this.f2260k);
        if (this.f2252J.isShowing()) {
            if (C0107v.m529q(m2404e())) {
                int i = this.f2257h;
                if (i == -1) {
                    i = -1;
                } else if (i == -2) {
                    i = m2404e().getWidth();
                }
                int i2 = this.f2256g;
                if (i2 == -1) {
                    if (!m2414j) {
                        m2389l = -1;
                    }
                    if (m2414j) {
                        this.f2252J.setWidth(this.f2257h == -1 ? -1 : 0);
                        this.f2252J.setHeight(0);
                    } else {
                        this.f2252J.setWidth(this.f2257h == -1 ? -1 : 0);
                        this.f2252J.setHeight(-1);
                    }
                } else if (i2 != -2) {
                    m2389l = i2;
                }
                this.f2252J.setOutsideTouchable((this.f2267r || this.f2266q) ? false : true);
                this.f2252J.update(m2404e(), this.f2258i, this.f2259j, i < 0 ? -1 : i, m2389l < 0 ? -1 : m2389l);
                return;
            }
            return;
        }
        int i3 = this.f2257h;
        if (i3 == -1) {
            i3 = -1;
        } else if (i3 == -2) {
            i3 = m2404e().getWidth();
        }
        int i4 = this.f2256g;
        if (i4 == -1) {
            m2389l = -1;
        } else if (i4 != -2) {
            m2389l = i4;
        }
        this.f2252J.setWidth(i3);
        this.f2252J.setHeight(m2389l);
        m2388c(true);
        this.f2252J.setOutsideTouchable((this.f2267r || this.f2266q) ? false : true);
        this.f2252J.setTouchInterceptor(this.f2244B);
        if (this.f2264o) {
            C0301s.m1694a(this.f2252J, this.f2263n);
        }
        Method method = f2242c;
        if (method != null) {
            try {
                method.invoke(this.f2252J, this.f2250H);
            } catch (Exception e2) {
                Log.e("ListPopupWindow", "Could not invoke setEpicenterBounds on PopupWindow", e2);
            }
        }
        C0301s.m1693a(this.f2252J, m2404e(), this.f2258i, this.f2259j, this.f2265p);
        this.f2255f.setSelection(-1);
        if (!this.f2251I || this.f2255f.isInTouchMode()) {
            m2392a();
        }
        if (this.f2251I) {
            return;
        }
        this.f2248F.post(this.f2246D);
    }

    /* renamed from: c */
    public void m2402c(int i) {
        this.f2265p = i;
    }

    @Override // android.support.v7.view.menu.InterfaceC0380z
    /* renamed from: d */
    public ListView mo1944d() {
        return this.f2255f;
    }

    /* renamed from: d */
    public void m2403d(int i) {
        this.f2258i = i;
    }

    @Override // android.support.v7.view.menu.InterfaceC0380z
    public void dismiss() {
        this.f2252J.dismiss();
        m2390m();
        this.f2252J.setContentView(null);
        this.f2255f = null;
        this.f2248F.removeCallbacks(this.f2243A);
    }

    /* renamed from: e */
    public View m2404e() {
        return this.f2272w;
    }

    /* renamed from: e */
    public void m2405e(int i) {
        this.f2252J.setInputMethodMode(i);
    }

    /* renamed from: f */
    public Drawable m2406f() {
        return this.f2252J.getBackground();
    }

    /* renamed from: f */
    public void m2407f(int i) {
        this.f2270u = i;
    }

    /* renamed from: g */
    public int m2408g() {
        return this.f2258i;
    }

    /* renamed from: g */
    public void m2409g(int i) {
        C0413N c0413n = this.f2255f;
        if (!mo1940b() || c0413n == null) {
            return;
        }
        c0413n.setListSelectionHidden(false);
        c0413n.setSelection(i);
        if (c0413n.getChoiceMode() != 0) {
            c0413n.setItemChecked(i, true);
        }
    }

    /* renamed from: h */
    public int m2410h() {
        if (this.f2261l) {
            return this.f2259j;
        }
        return 0;
    }

    /* renamed from: h */
    public void m2411h(int i) {
        this.f2259j = i;
        this.f2261l = true;
    }

    /* renamed from: i */
    public int m2412i() {
        return this.f2257h;
    }

    /* renamed from: i */
    public void m2413i(int i) {
        this.f2257h = i;
    }

    /* renamed from: j */
    public boolean m2414j() {
        return this.f2252J.getInputMethodMode() == 2;
    }

    /* renamed from: k */
    public boolean m2415k() {
        return this.f2251I;
    }
}
