package android.support.v7.widget;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.database.DataSetObserver;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.ListAdapter;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.ThemedSpinnerAdapter;
import p000a.p005b.p009c.p019h.C0107v;
import p000a.p005b.p009c.p019h.InterfaceC0105t;
import p000a.p005b.p022d.p023a.C0112a;
import p000a.p005b.p022d.p024b.p025a.C0122a;

/* renamed from: android.support.v7.widget.C */
/* loaded from: classes.dex */
public class C0392C extends Spinner implements InterfaceC0105t {

    /* renamed from: a */
    private static final int[] f1982a = {R.attr.spinnerMode};

    /* renamed from: b */
    private final C0454j f1983b;

    /* renamed from: c */
    private final Context f1984c;

    /* renamed from: d */
    private AbstractViewOnTouchListenerC0415P f1985d;

    /* renamed from: e */
    private SpinnerAdapter f1986e;

    /* renamed from: f */
    private final boolean f1987f;

    /* renamed from: g */
    b f1988g;

    /* renamed from: h */
    int f1989h;

    /* renamed from: i */
    final Rect f1990i;

    /* renamed from: android.support.v7.widget.C$a */
    /* loaded from: classes.dex */
    public static class a implements ListAdapter, SpinnerAdapter {

        /* renamed from: a */
        private SpinnerAdapter f1991a;

        /* renamed from: b */
        private ListAdapter f1992b;

        public a(SpinnerAdapter spinnerAdapter, Resources.Theme theme) {
            this.f1991a = spinnerAdapter;
            if (spinnerAdapter instanceof ListAdapter) {
                this.f1992b = (ListAdapter) spinnerAdapter;
            }
            if (theme != null) {
                if (Build.VERSION.SDK_INT >= 23 && (spinnerAdapter instanceof ThemedSpinnerAdapter)) {
                    ThemedSpinnerAdapter themedSpinnerAdapter = (ThemedSpinnerAdapter) spinnerAdapter;
                    if (themedSpinnerAdapter.getDropDownViewTheme() != theme) {
                        themedSpinnerAdapter.setDropDownViewTheme(theme);
                        return;
                    }
                    return;
                }
                if (spinnerAdapter instanceof InterfaceC0471ra) {
                    InterfaceC0471ra interfaceC0471ra = (InterfaceC0471ra) spinnerAdapter;
                    if (interfaceC0471ra.getDropDownViewTheme() == null) {
                        interfaceC0471ra.setDropDownViewTheme(theme);
                    }
                }
            }
        }

        @Override // android.widget.ListAdapter
        public boolean areAllItemsEnabled() {
            ListAdapter listAdapter = this.f1992b;
            if (listAdapter != null) {
                return listAdapter.areAllItemsEnabled();
            }
            return true;
        }

        @Override // android.widget.Adapter
        public int getCount() {
            SpinnerAdapter spinnerAdapter = this.f1991a;
            if (spinnerAdapter == null) {
                return 0;
            }
            return spinnerAdapter.getCount();
        }

        @Override // android.widget.SpinnerAdapter
        public View getDropDownView(int i, View view, ViewGroup viewGroup) {
            SpinnerAdapter spinnerAdapter = this.f1991a;
            if (spinnerAdapter == null) {
                return null;
            }
            return spinnerAdapter.getDropDownView(i, view, viewGroup);
        }

        @Override // android.widget.Adapter
        public Object getItem(int i) {
            SpinnerAdapter spinnerAdapter = this.f1991a;
            if (spinnerAdapter == null) {
                return null;
            }
            return spinnerAdapter.getItem(i);
        }

        @Override // android.widget.Adapter
        public long getItemId(int i) {
            SpinnerAdapter spinnerAdapter = this.f1991a;
            if (spinnerAdapter == null) {
                return -1L;
            }
            return spinnerAdapter.getItemId(i);
        }

        @Override // android.widget.Adapter
        public int getItemViewType(int i) {
            return 0;
        }

        @Override // android.widget.Adapter
        public View getView(int i, View view, ViewGroup viewGroup) {
            return getDropDownView(i, view, viewGroup);
        }

        @Override // android.widget.Adapter
        public int getViewTypeCount() {
            return 1;
        }

        @Override // android.widget.Adapter
        public boolean hasStableIds() {
            SpinnerAdapter spinnerAdapter = this.f1991a;
            return spinnerAdapter != null && spinnerAdapter.hasStableIds();
        }

        @Override // android.widget.Adapter
        public boolean isEmpty() {
            return getCount() == 0;
        }

        @Override // android.widget.ListAdapter
        public boolean isEnabled(int i) {
            ListAdapter listAdapter = this.f1992b;
            if (listAdapter != null) {
                return listAdapter.isEnabled(i);
            }
            return true;
        }

        @Override // android.widget.Adapter
        public void registerDataSetObserver(DataSetObserver dataSetObserver) {
            SpinnerAdapter spinnerAdapter = this.f1991a;
            if (spinnerAdapter != null) {
                spinnerAdapter.registerDataSetObserver(dataSetObserver);
            }
        }

        @Override // android.widget.Adapter
        public void unregisterDataSetObserver(DataSetObserver dataSetObserver) {
            SpinnerAdapter spinnerAdapter = this.f1991a;
            if (spinnerAdapter != null) {
                spinnerAdapter.unregisterDataSetObserver(dataSetObserver);
            }
        }
    }

    /* renamed from: android.support.v7.widget.C$b */
    /* loaded from: classes.dex */
    public class b extends C0429U {

        /* renamed from: K */
        private CharSequence f1993K;

        /* renamed from: L */
        ListAdapter f1994L;

        /* renamed from: M */
        private final Rect f1995M;

        public b(Context context, AttributeSet attributeSet, int i) {
            super(context, attributeSet, i);
            this.f1995M = new Rect();
            m2396a(C0392C.this);
            m2399a(true);
            m2407f(0);
            m2397a(new C0395D(this, C0392C.this));
        }

        @Override // android.support.v7.widget.C0429U
        /* renamed from: a */
        public void mo2151a(ListAdapter listAdapter) {
            super.mo2151a(listAdapter);
            this.f1994L = listAdapter;
        }

        /* renamed from: a */
        public void m2152a(CharSequence charSequence) {
            this.f1993K = charSequence;
        }

        /* renamed from: b */
        public boolean m2153b(View view) {
            return C0107v.m529q(view) && view.getGlobalVisibleRect(this.f1995M);
        }

        @Override // android.support.v7.widget.C0429U, android.support.v7.view.menu.InterfaceC0380z
        /* renamed from: c */
        public void mo1941c() {
            ViewTreeObserver viewTreeObserver;
            boolean mo1940b = mo1940b();
            m2154l();
            m2405e(2);
            super.mo1941c();
            mo1944d().setChoiceMode(1);
            m2409g(C0392C.this.getSelectedItemPosition());
            if (mo1940b || (viewTreeObserver = C0392C.this.getViewTreeObserver()) == null) {
                return;
            }
            ViewTreeObserverOnGlobalLayoutListenerC0397E viewTreeObserverOnGlobalLayoutListenerC0397E = new ViewTreeObserverOnGlobalLayoutListenerC0397E(this);
            viewTreeObserver.addOnGlobalLayoutListener(viewTreeObserverOnGlobalLayoutListenerC0397E);
            m2398a(new C0399F(this, viewTreeObserverOnGlobalLayoutListenerC0397E));
        }

        /* JADX WARN: Removed duplicated region for block: B:16:0x008d  */
        /* JADX WARN: Removed duplicated region for block: B:20:0x0095  */
        /* renamed from: l */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void m2154l() {
            /*
                r8 = this;
                android.graphics.drawable.Drawable r0 = r8.m2406f()
                r1 = 0
                if (r0 == 0) goto L26
                android.support.v7.widget.C r1 = android.support.v7.widget.C0392C.this
                android.graphics.Rect r1 = r1.f1990i
                r0.getPadding(r1)
                android.support.v7.widget.C r0 = android.support.v7.widget.C0392C.this
                boolean r0 = android.support.v7.widget.C0408Ja.m2259a(r0)
                if (r0 == 0) goto L1d
                android.support.v7.widget.C r0 = android.support.v7.widget.C0392C.this
                android.graphics.Rect r0 = r0.f1990i
                int r0 = r0.right
                goto L24
            L1d:
                android.support.v7.widget.C r0 = android.support.v7.widget.C0392C.this
                android.graphics.Rect r0 = r0.f1990i
                int r0 = r0.left
                int r0 = -r0
            L24:
                r1 = r0
                goto L2e
            L26:
                android.support.v7.widget.C r0 = android.support.v7.widget.C0392C.this
                android.graphics.Rect r0 = r0.f1990i
                r0.right = r1
                r0.left = r1
            L2e:
                android.support.v7.widget.C r0 = android.support.v7.widget.C0392C.this
                int r0 = r0.getPaddingLeft()
                android.support.v7.widget.C r2 = android.support.v7.widget.C0392C.this
                int r2 = r2.getPaddingRight()
                android.support.v7.widget.C r3 = android.support.v7.widget.C0392C.this
                int r3 = r3.getWidth()
                android.support.v7.widget.C r4 = android.support.v7.widget.C0392C.this
                int r5 = r4.f1989h
                r6 = -2
                if (r5 != r6) goto L78
                android.widget.ListAdapter r5 = r8.f1994L
                android.widget.SpinnerAdapter r5 = (android.widget.SpinnerAdapter) r5
                android.graphics.drawable.Drawable r6 = r8.m2406f()
                int r4 = r4.m2149a(r5, r6)
                android.support.v7.widget.C r5 = android.support.v7.widget.C0392C.this
                android.content.Context r5 = r5.getContext()
                android.content.res.Resources r5 = r5.getResources()
                android.util.DisplayMetrics r5 = r5.getDisplayMetrics()
                int r5 = r5.widthPixels
                android.support.v7.widget.C r6 = android.support.v7.widget.C0392C.this
                android.graphics.Rect r6 = r6.f1990i
                int r7 = r6.left
                int r5 = r5 - r7
                int r6 = r6.right
                int r5 = r5 - r6
                if (r4 <= r5) goto L70
                r4 = r5
            L70:
                int r5 = r3 - r0
                int r5 = r5 - r2
                int r4 = java.lang.Math.max(r4, r5)
                goto L7e
            L78:
                r4 = -1
                if (r5 != r4) goto L82
                int r4 = r3 - r0
                int r4 = r4 - r2
            L7e:
                r8.m2400b(r4)
                goto L85
            L82:
                r8.m2400b(r5)
            L85:
                android.support.v7.widget.C r4 = android.support.v7.widget.C0392C.this
                boolean r4 = android.support.v7.widget.C0408Ja.m2259a(r4)
                if (r4 == 0) goto L95
                int r3 = r3 - r2
                int r0 = r8.m2412i()
                int r3 = r3 - r0
                int r1 = r1 + r3
                goto L96
            L95:
                int r1 = r1 + r0
            L96:
                r8.m2403d(r1)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: android.support.v7.widget.C0392C.b.m2154l():void");
        }

        /* renamed from: m */
        public CharSequence m2155m() {
            return this.f1993K;
        }
    }

    public C0392C(Context context, int i) {
        this(context, null, C0112a.spinnerStyle, i);
    }

    public C0392C(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C0112a.spinnerStyle);
    }

    public C0392C(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, -1);
    }

    public C0392C(Context context, AttributeSet attributeSet, int i, int i2) {
        this(context, attributeSet, i, i2, null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0054, code lost:            if (r12 != null) goto L127;     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0056, code lost:            r12.recycle();     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0068, code lost:            if (r12 == null) goto L141;     */
    /* JADX WARN: Removed duplicated region for block: B:26:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0041  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public C0392C(android.content.Context r8, android.util.AttributeSet r9, int r10, int r11, android.content.res.Resources.Theme r12) {
        /*
            r7 = this;
            r7.<init>(r8, r9, r10)
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>()
            r7.f1990i = r0
            int[] r0 = p000a.p005b.p022d.p023a.C0121j.Spinner
            r1 = 0
            android.support.v7.widget.va r0 = android.support.v7.widget.C0479va.m2571a(r8, r9, r0, r10, r1)
            android.support.v7.widget.j r2 = new android.support.v7.widget.j
            r2.<init>(r7)
            r7.f1983b = r2
            r2 = 0
            if (r12 == 0) goto L23
            a.b.d.e.d r3 = new a.b.d.e.d
            r3.<init>(r8, r12)
        L20:
            r7.f1984c = r3
            goto L3c
        L23:
            int r12 = p000a.p005b.p022d.p023a.C0121j.Spinner_popupTheme
            int r12 = r0.m2588g(r12, r1)
            if (r12 == 0) goto L31
            a.b.d.e.d r3 = new a.b.d.e.d
            r3.<init>(r8, r12)
            goto L20
        L31:
            int r12 = android.os.Build.VERSION.SDK_INT
            r3 = 23
            if (r12 >= r3) goto L39
            r12 = r8
            goto L3a
        L39:
            r12 = r2
        L3a:
            r7.f1984c = r12
        L3c:
            android.content.Context r12 = r7.f1984c
            r3 = 1
            if (r12 == 0) goto Laa
            r12 = -1
            if (r11 != r12) goto L72
            int[] r12 = android.support.v7.widget.C0392C.f1982a     // Catch: java.lang.Throwable -> L5c java.lang.Exception -> L5f
            android.content.res.TypedArray r12 = r8.obtainStyledAttributes(r9, r12, r10, r1)     // Catch: java.lang.Throwable -> L5c java.lang.Exception -> L5f
            boolean r4 = r12.hasValue(r1)     // Catch: java.lang.Exception -> L5a java.lang.Throwable -> L6b
            if (r4 == 0) goto L54
            int r11 = r12.getInt(r1, r1)     // Catch: java.lang.Exception -> L5a java.lang.Throwable -> L6b
        L54:
            if (r12 == 0) goto L72
        L56:
            r12.recycle()
            goto L72
        L5a:
            r4 = move-exception
            goto L61
        L5c:
            r8 = move-exception
            r12 = r2
            goto L6c
        L5f:
            r4 = move-exception
            r12 = r2
        L61:
            java.lang.String r5 = "AppCompatSpinner"
            java.lang.String r6 = "Could not read android:spinnerMode"
            android.util.Log.i(r5, r6, r4)     // Catch: java.lang.Throwable -> L6b
            if (r12 == 0) goto L72
            goto L56
        L6b:
            r8 = move-exception
        L6c:
            if (r12 == 0) goto L71
            r12.recycle()
        L71:
            throw r8
        L72:
            if (r11 != r3) goto Laa
            android.support.v7.widget.C$b r11 = new android.support.v7.widget.C$b
            android.content.Context r12 = r7.f1984c
            r11.<init>(r12, r9, r10)
            android.content.Context r12 = r7.f1984c
            int[] r4 = p000a.p005b.p022d.p023a.C0121j.Spinner
            android.support.v7.widget.va r12 = android.support.v7.widget.C0479va.m2571a(r12, r9, r4, r10, r1)
            int r1 = p000a.p005b.p022d.p023a.C0121j.Spinner_android_dropDownWidth
            r4 = -2
            int r1 = r12.m2586f(r1, r4)
            r7.f1989h = r1
            int r1 = p000a.p005b.p022d.p023a.C0121j.Spinner_android_popupBackground
            android.graphics.drawable.Drawable r1 = r12.m2579b(r1)
            r11.m2395a(r1)
            int r1 = p000a.p005b.p022d.p023a.C0121j.Spinner_android_prompt
            java.lang.String r1 = r0.m2583d(r1)
            r11.m2152a(r1)
            r12.m2576a()
            r7.f1988g = r11
            android.support.v7.widget.B r12 = new android.support.v7.widget.B
            r12.<init>(r7, r7, r11)
            r7.f1985d = r12
        Laa:
            int r11 = p000a.p005b.p022d.p023a.C0121j.Spinner_android_entries
            java.lang.CharSequence[] r11 = r0.m2587f(r11)
            if (r11 == 0) goto Lc2
            android.widget.ArrayAdapter r12 = new android.widget.ArrayAdapter
            r1 = 17367048(0x1090008, float:2.5162948E-38)
            r12.<init>(r8, r1, r11)
            int r8 = p000a.p005b.p022d.p023a.C0118g.support_simple_spinner_dropdown_item
            r12.setDropDownViewResource(r8)
            r7.setAdapter(r12)
        Lc2:
            r0.m2576a()
            r7.f1987f = r3
            android.widget.SpinnerAdapter r8 = r7.f1986e
            if (r8 == 0) goto Ld0
            r7.setAdapter(r8)
            r7.f1986e = r2
        Ld0:
            android.support.v7.widget.j r8 = r7.f1983b
            r8.m2470a(r9, r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v7.widget.C0392C.<init>(android.content.Context, android.util.AttributeSet, int, int, android.content.res.Resources$Theme):void");
    }

    /* renamed from: a */
    int m2149a(SpinnerAdapter spinnerAdapter, Drawable drawable) {
        int i = 0;
        if (spinnerAdapter == null) {
            return 0;
        }
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 0);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 0);
        int max = Math.max(0, getSelectedItemPosition());
        int min = Math.min(spinnerAdapter.getCount(), max + 15);
        View view = null;
        int i2 = 0;
        for (int max2 = Math.max(0, max - (15 - (min - max))); max2 < min; max2++) {
            int itemViewType = spinnerAdapter.getItemViewType(max2);
            if (itemViewType != i) {
                view = null;
                i = itemViewType;
            }
            view = spinnerAdapter.getView(max2, view, this);
            if (view.getLayoutParams() == null) {
                view.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
            }
            view.measure(makeMeasureSpec, makeMeasureSpec2);
            i2 = Math.max(i2, view.getMeasuredWidth());
        }
        if (drawable == null) {
            return i2;
        }
        drawable.getPadding(this.f1990i);
        Rect rect = this.f1990i;
        return i2 + rect.left + rect.right;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        C0454j c0454j = this.f1983b;
        if (c0454j != null) {
            c0454j.m2465a();
        }
    }

    @Override // android.widget.Spinner
    public int getDropDownHorizontalOffset() {
        b bVar = this.f1988g;
        if (bVar != null) {
            return bVar.m2408g();
        }
        if (Build.VERSION.SDK_INT >= 16) {
            return super.getDropDownHorizontalOffset();
        }
        return 0;
    }

    @Override // android.widget.Spinner
    public int getDropDownVerticalOffset() {
        b bVar = this.f1988g;
        if (bVar != null) {
            return bVar.m2410h();
        }
        if (Build.VERSION.SDK_INT >= 16) {
            return super.getDropDownVerticalOffset();
        }
        return 0;
    }

    @Override // android.widget.Spinner
    public int getDropDownWidth() {
        if (this.f1988g != null) {
            return this.f1989h;
        }
        if (Build.VERSION.SDK_INT >= 16) {
            return super.getDropDownWidth();
        }
        return 0;
    }

    @Override // android.widget.Spinner
    public Drawable getPopupBackground() {
        b bVar = this.f1988g;
        if (bVar != null) {
            return bVar.m2406f();
        }
        if (Build.VERSION.SDK_INT >= 16) {
            return super.getPopupBackground();
        }
        return null;
    }

    @Override // android.widget.Spinner
    public Context getPopupContext() {
        if (this.f1988g != null) {
            return this.f1984c;
        }
        if (Build.VERSION.SDK_INT >= 23) {
            return super.getPopupContext();
        }
        return null;
    }

    @Override // android.widget.Spinner
    public CharSequence getPrompt() {
        b bVar = this.f1988g;
        return bVar != null ? bVar.m2155m() : super.getPrompt();
    }

    @Override // p000a.p005b.p009c.p019h.InterfaceC0105t
    public ColorStateList getSupportBackgroundTintList() {
        C0454j c0454j = this.f1983b;
        if (c0454j != null) {
            return c0454j.m2471b();
        }
        return null;
    }

    @Override // p000a.p005b.p009c.p019h.InterfaceC0105t
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C0454j c0454j = this.f1983b;
        if (c0454j != null) {
            return c0454j.m2473c();
        }
        return null;
    }

    @Override // android.widget.Spinner, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        b bVar = this.f1988g;
        if (bVar == null || !bVar.mo1940b()) {
            return;
        }
        this.f1988g.dismiss();
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    protected void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (this.f1988g == null || View.MeasureSpec.getMode(i) != Integer.MIN_VALUE) {
            return;
        }
        setMeasuredDimension(Math.min(Math.max(getMeasuredWidth(), m2149a(getAdapter(), getBackground())), View.MeasureSpec.getSize(i)), getMeasuredHeight());
    }

    @Override // android.widget.Spinner, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        AbstractViewOnTouchListenerC0415P abstractViewOnTouchListenerC0415P = this.f1985d;
        if (abstractViewOnTouchListenerC0415P == null || !abstractViewOnTouchListenerC0415P.onTouch(this, motionEvent)) {
            return super.onTouchEvent(motionEvent);
        }
        return true;
    }

    @Override // android.widget.Spinner, android.view.View
    public boolean performClick() {
        b bVar = this.f1988g;
        if (bVar == null) {
            return super.performClick();
        }
        if (bVar.mo1940b()) {
            return true;
        }
        this.f1988g.mo1941c();
        return true;
    }

    @Override // android.widget.AdapterView
    public void setAdapter(SpinnerAdapter spinnerAdapter) {
        if (!this.f1987f) {
            this.f1986e = spinnerAdapter;
            return;
        }
        super.setAdapter(spinnerAdapter);
        if (this.f1988g != null) {
            Context context = this.f1984c;
            if (context == null) {
                context = getContext();
            }
            this.f1988g.mo2151a(new a(spinnerAdapter, context.getTheme()));
        }
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C0454j c0454j = this.f1983b;
        if (c0454j != null) {
            c0454j.m2469a(drawable);
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        C0454j c0454j = this.f1983b;
        if (c0454j != null) {
            c0454j.m2466a(i);
        }
    }

    @Override // android.widget.Spinner
    public void setDropDownHorizontalOffset(int i) {
        b bVar = this.f1988g;
        if (bVar != null) {
            bVar.m2403d(i);
        } else if (Build.VERSION.SDK_INT >= 16) {
            super.setDropDownHorizontalOffset(i);
        }
    }

    @Override // android.widget.Spinner
    public void setDropDownVerticalOffset(int i) {
        b bVar = this.f1988g;
        if (bVar != null) {
            bVar.m2411h(i);
        } else if (Build.VERSION.SDK_INT >= 16) {
            super.setDropDownVerticalOffset(i);
        }
    }

    @Override // android.widget.Spinner
    public void setDropDownWidth(int i) {
        if (this.f1988g != null) {
            this.f1989h = i;
        } else if (Build.VERSION.SDK_INT >= 16) {
            super.setDropDownWidth(i);
        }
    }

    @Override // android.widget.Spinner
    public void setPopupBackgroundDrawable(Drawable drawable) {
        b bVar = this.f1988g;
        if (bVar != null) {
            bVar.m2395a(drawable);
        } else if (Build.VERSION.SDK_INT >= 16) {
            super.setPopupBackgroundDrawable(drawable);
        }
    }

    @Override // android.widget.Spinner
    public void setPopupBackgroundResource(int i) {
        setPopupBackgroundDrawable(C0122a.m550b(getPopupContext(), i));
    }

    @Override // android.widget.Spinner
    public void setPrompt(CharSequence charSequence) {
        b bVar = this.f1988g;
        if (bVar != null) {
            bVar.m2152a(charSequence);
        } else {
            super.setPrompt(charSequence);
        }
    }

    @Override // p000a.p005b.p009c.p019h.InterfaceC0105t
    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C0454j c0454j = this.f1983b;
        if (c0454j != null) {
            c0454j.m2472b(colorStateList);
        }
    }

    @Override // p000a.p005b.p009c.p019h.InterfaceC0105t
    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C0454j c0454j = this.f1983b;
        if (c0454j != null) {
            c0454j.m2468a(mode);
        }
    }
}
