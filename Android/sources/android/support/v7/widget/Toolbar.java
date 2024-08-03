package android.support.v7.widget;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.v7.app.AbstractC0322a;
import android.support.v7.view.menu.C0366l;
import android.support.v7.view.menu.C0370p;
import android.support.v7.view.menu.InterfaceC0376v;
import android.support.v7.view.menu.SubMenuC0353D;
import android.support.v7.widget.ActionMenuView;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.List;
import p000a.p005b.p009c.p019h.AbstractC0088c;
import p000a.p005b.p009c.p019h.C0091f;
import p000a.p005b.p009c.p019h.C0094i;
import p000a.p005b.p009c.p019h.C0107v;
import p000a.p005b.p022d.p023a.C0112a;
import p000a.p005b.p022d.p023a.C0121j;
import p000a.p005b.p022d.p024b.p025a.C0122a;
import p000a.p005b.p022d.p029e.C0136g;
import p000a.p005b.p022d.p029e.InterfaceC0132c;

/* loaded from: classes.dex */
public class Toolbar extends ViewGroup {

    /* renamed from: A */
    private int f2193A;

    /* renamed from: B */
    private boolean f2194B;

    /* renamed from: C */
    private boolean f2195C;

    /* renamed from: D */
    private final ArrayList<View> f2196D;

    /* renamed from: E */
    private final ArrayList<View> f2197E;

    /* renamed from: F */
    private final int[] f2198F;

    /* renamed from: G */
    InterfaceC0427c f2199G;

    /* renamed from: H */
    private final ActionMenuView.InterfaceC0389e f2200H;

    /* renamed from: I */
    private C0393Ca f2201I;

    /* renamed from: J */
    private C0448g f2202J;

    /* renamed from: K */
    private C0425a f2203K;

    /* renamed from: L */
    private InterfaceC0376v.a f2204L;

    /* renamed from: M */
    private C0366l.a f2205M;

    /* renamed from: N */
    private boolean f2206N;

    /* renamed from: O */
    private final Runnable f2207O;

    /* renamed from: a */
    private ActionMenuView f2208a;

    /* renamed from: b */
    private TextView f2209b;

    /* renamed from: c */
    private TextView f2210c;

    /* renamed from: d */
    private ImageButton f2211d;

    /* renamed from: e */
    private ImageView f2212e;

    /* renamed from: f */
    private Drawable f2213f;

    /* renamed from: g */
    private CharSequence f2214g;

    /* renamed from: h */
    ImageButton f2215h;

    /* renamed from: i */
    View f2216i;

    /* renamed from: j */
    private Context f2217j;

    /* renamed from: k */
    private int f2218k;

    /* renamed from: l */
    private int f2219l;

    /* renamed from: m */
    private int f2220m;

    /* renamed from: n */
    int f2221n;

    /* renamed from: o */
    private int f2222o;

    /* renamed from: p */
    private int f2223p;

    /* renamed from: q */
    private int f2224q;

    /* renamed from: r */
    private int f2225r;

    /* renamed from: s */
    private int f2226s;

    /* renamed from: t */
    private C0434Y f2227t;

    /* renamed from: u */
    private int f2228u;

    /* renamed from: v */
    private int f2229v;

    /* renamed from: w */
    private int f2230w;

    /* renamed from: x */
    private CharSequence f2231x;

    /* renamed from: y */
    private CharSequence f2232y;

    /* renamed from: z */
    private int f2233z;

    /* renamed from: android.support.v7.widget.Toolbar$a */
    /* loaded from: classes.dex */
    public class C0425a implements InterfaceC0376v {

        /* renamed from: a */
        C0366l f2234a;

        /* renamed from: b */
        C0370p f2235b;

        C0425a() {
        }

        @Override // android.support.v7.view.menu.InterfaceC0376v
        /* renamed from: a */
        public void mo1968a(Context context, C0366l c0366l) {
            C0370p c0370p;
            C0366l c0366l2 = this.f2234a;
            if (c0366l2 != null && (c0370p = this.f2235b) != null) {
                c0366l2.mo1947a(c0370p);
            }
            this.f2234a = c0366l;
        }

        @Override // android.support.v7.view.menu.InterfaceC0376v
        /* renamed from: a */
        public void mo1931a(C0366l c0366l, boolean z) {
        }

        @Override // android.support.v7.view.menu.InterfaceC0376v
        /* renamed from: a */
        public void mo1935a(boolean z) {
            if (this.f2235b != null) {
                C0366l c0366l = this.f2234a;
                boolean z2 = false;
                if (c0366l != null) {
                    int size = c0366l.size();
                    int i = 0;
                    while (true) {
                        if (i >= size) {
                            break;
                        }
                        if (this.f2234a.getItem(i) == this.f2235b) {
                            z2 = true;
                            break;
                        }
                        i++;
                    }
                }
                if (z2) {
                    return;
                }
                mo1976b(this.f2234a, this.f2235b);
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
            return false;
        }

        @Override // android.support.v7.view.menu.InterfaceC0376v
        /* renamed from: a */
        public boolean mo1972a(C0366l c0366l, C0370p c0370p) {
            Toolbar.this.m2379e();
            ViewParent parent = Toolbar.this.f2215h.getParent();
            Toolbar toolbar = Toolbar.this;
            if (parent != toolbar) {
                if (parent instanceof ViewGroup) {
                    ((ViewGroup) parent).removeView(toolbar.f2215h);
                }
                Toolbar toolbar2 = Toolbar.this;
                toolbar2.addView(toolbar2.f2215h);
            }
            Toolbar.this.f2216i = c0370p.getActionView();
            this.f2235b = c0370p;
            ViewParent parent2 = Toolbar.this.f2216i.getParent();
            Toolbar toolbar3 = Toolbar.this;
            if (parent2 != toolbar3) {
                if (parent2 instanceof ViewGroup) {
                    ((ViewGroup) parent2).removeView(toolbar3.f2216i);
                }
                C0426b generateDefaultLayoutParams = Toolbar.this.generateDefaultLayoutParams();
                Toolbar toolbar4 = Toolbar.this;
                generateDefaultLayoutParams.f1545a = 8388611 | (toolbar4.f2221n & C0121j.AppCompatTheme_windowActionBarOverlay);
                generateDefaultLayoutParams.f2237b = 2;
                toolbar4.f2216i.setLayoutParams(generateDefaultLayoutParams);
                Toolbar toolbar5 = Toolbar.this;
                toolbar5.addView(toolbar5.f2216i);
            }
            Toolbar.this.m2384j();
            Toolbar.this.requestLayout();
            c0370p.m2053a(true);
            KeyEvent.Callback callback = Toolbar.this.f2216i;
            if (callback instanceof InterfaceC0132c) {
                ((InterfaceC0132c) callback).onActionViewExpanded();
            }
            return true;
        }

        @Override // android.support.v7.view.menu.InterfaceC0376v
        /* renamed from: b */
        public boolean mo1976b(C0366l c0366l, C0370p c0370p) {
            KeyEvent.Callback callback = Toolbar.this.f2216i;
            if (callback instanceof InterfaceC0132c) {
                ((InterfaceC0132c) callback).onActionViewCollapsed();
            }
            Toolbar toolbar = Toolbar.this;
            toolbar.removeView(toolbar.f2216i);
            Toolbar toolbar2 = Toolbar.this;
            toolbar2.removeView(toolbar2.f2215h);
            Toolbar toolbar3 = Toolbar.this;
            toolbar3.f2216i = null;
            toolbar3.m2371a();
            this.f2235b = null;
            Toolbar.this.requestLayout();
            c0370p.m2053a(false);
            return true;
        }
    }

    /* renamed from: android.support.v7.widget.Toolbar$b */
    /* loaded from: classes.dex */
    public static class C0426b extends AbstractC0322a.a {

        /* renamed from: b */
        int f2237b;

        public C0426b(int i, int i2) {
            super(i, i2);
            this.f2237b = 0;
            this.f1545a = 8388627;
        }

        public C0426b(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f2237b = 0;
        }

        public C0426b(AbstractC0322a.a aVar) {
            super(aVar);
            this.f2237b = 0;
        }

        public C0426b(C0426b c0426b) {
            super((AbstractC0322a.a) c0426b);
            this.f2237b = 0;
            this.f2237b = c0426b.f2237b;
        }

        public C0426b(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f2237b = 0;
        }

        public C0426b(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.f2237b = 0;
            m2386a(marginLayoutParams);
        }

        /* renamed from: a */
        void m2386a(ViewGroup.MarginLayoutParams marginLayoutParams) {
            ((ViewGroup.MarginLayoutParams) this).leftMargin = marginLayoutParams.leftMargin;
            ((ViewGroup.MarginLayoutParams) this).topMargin = marginLayoutParams.topMargin;
            ((ViewGroup.MarginLayoutParams) this).rightMargin = marginLayoutParams.rightMargin;
            ((ViewGroup.MarginLayoutParams) this).bottomMargin = marginLayoutParams.bottomMargin;
        }
    }

    /* renamed from: android.support.v7.widget.Toolbar$c */
    /* loaded from: classes.dex */
    public interface InterfaceC0427c {
        boolean onMenuItemClick(MenuItem menuItem);
    }

    /* renamed from: android.support.v7.widget.Toolbar$d */
    /* loaded from: classes.dex */
    public static class C0428d extends AbstractC0088c {
        public static final Parcelable.Creator<C0428d> CREATOR = new C0487za();

        /* renamed from: a */
        int f2238a;

        /* renamed from: b */
        boolean f2239b;

        public C0428d(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f2238a = parcel.readInt();
            this.f2239b = parcel.readInt() != 0;
        }

        public C0428d(Parcelable parcelable) {
            super(parcelable);
        }

        @Override // p000a.p005b.p009c.p019h.AbstractC0088c, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.f2238a);
            parcel.writeInt(this.f2239b ? 1 : 0);
        }
    }

    public Toolbar(Context context) {
        this(context, null);
    }

    public Toolbar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C0112a.toolbarStyle);
    }

    public Toolbar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f2230w = 8388627;
        this.f2196D = new ArrayList<>();
        this.f2197E = new ArrayList<>();
        this.f2198F = new int[2];
        this.f2200H = new C0481wa(this);
        this.f2207O = new RunnableC0483xa(this);
        C0479va m2571a = C0479va.m2571a(getContext(), attributeSet, C0121j.Toolbar, i, 0);
        this.f2219l = m2571a.m2588g(C0121j.Toolbar_titleTextAppearance, 0);
        this.f2220m = m2571a.m2588g(C0121j.Toolbar_subtitleTextAppearance, 0);
        this.f2230w = m2571a.m2584e(C0121j.Toolbar_android_gravity, this.f2230w);
        this.f2221n = m2571a.m2584e(C0121j.Toolbar_buttonGravity, 48);
        int m2578b = m2571a.m2578b(C0121j.Toolbar_titleMargin, 0);
        m2578b = m2571a.m2589g(C0121j.Toolbar_titleMargins) ? m2571a.m2578b(C0121j.Toolbar_titleMargins, m2578b) : m2578b;
        this.f2226s = m2578b;
        this.f2225r = m2578b;
        this.f2224q = m2578b;
        this.f2223p = m2578b;
        int m2578b2 = m2571a.m2578b(C0121j.Toolbar_titleMarginStart, -1);
        if (m2578b2 >= 0) {
            this.f2223p = m2578b2;
        }
        int m2578b3 = m2571a.m2578b(C0121j.Toolbar_titleMarginEnd, -1);
        if (m2578b3 >= 0) {
            this.f2224q = m2578b3;
        }
        int m2578b4 = m2571a.m2578b(C0121j.Toolbar_titleMarginTop, -1);
        if (m2578b4 >= 0) {
            this.f2225r = m2578b4;
        }
        int m2578b5 = m2571a.m2578b(C0121j.Toolbar_titleMarginBottom, -1);
        if (m2578b5 >= 0) {
            this.f2226s = m2578b5;
        }
        this.f2222o = m2571a.m2580c(C0121j.Toolbar_maxButtonHeight, -1);
        int m2578b6 = m2571a.m2578b(C0121j.Toolbar_contentInsetStart, Integer.MIN_VALUE);
        int m2578b7 = m2571a.m2578b(C0121j.Toolbar_contentInsetEnd, Integer.MIN_VALUE);
        int m2580c = m2571a.m2580c(C0121j.Toolbar_contentInsetLeft, 0);
        int m2580c2 = m2571a.m2580c(C0121j.Toolbar_contentInsetRight, 0);
        m2364l();
        this.f2227t.m2423a(m2580c, m2580c2);
        if (m2578b6 != Integer.MIN_VALUE || m2578b7 != Integer.MIN_VALUE) {
            this.f2227t.m2426b(m2578b6, m2578b7);
        }
        this.f2228u = m2571a.m2578b(C0121j.Toolbar_contentInsetStartWithNavigation, Integer.MIN_VALUE);
        this.f2229v = m2571a.m2578b(C0121j.Toolbar_contentInsetEndWithActions, Integer.MIN_VALUE);
        this.f2213f = m2571a.m2579b(C0121j.Toolbar_collapseIcon);
        this.f2214g = m2571a.m2585e(C0121j.Toolbar_collapseContentDescription);
        CharSequence m2585e = m2571a.m2585e(C0121j.Toolbar_title);
        if (!TextUtils.isEmpty(m2585e)) {
            setTitle(m2585e);
        }
        CharSequence m2585e2 = m2571a.m2585e(C0121j.Toolbar_subtitle);
        if (!TextUtils.isEmpty(m2585e2)) {
            setSubtitle(m2585e2);
        }
        this.f2217j = getContext();
        setPopupTheme(m2571a.m2588g(C0121j.Toolbar_popupTheme, 0));
        Drawable m2579b = m2571a.m2579b(C0121j.Toolbar_navigationIcon);
        if (m2579b != null) {
            setNavigationIcon(m2579b);
        }
        CharSequence m2585e3 = m2571a.m2585e(C0121j.Toolbar_navigationContentDescription);
        if (!TextUtils.isEmpty(m2585e3)) {
            setNavigationContentDescription(m2585e3);
        }
        Drawable m2579b2 = m2571a.m2579b(C0121j.Toolbar_logo);
        if (m2579b2 != null) {
            setLogo(m2579b2);
        }
        CharSequence m2585e4 = m2571a.m2585e(C0121j.Toolbar_logoDescription);
        if (!TextUtils.isEmpty(m2585e4)) {
            setLogoDescription(m2585e4);
        }
        if (m2571a.m2589g(C0121j.Toolbar_titleTextColor)) {
            setTitleTextColor(m2571a.m2573a(C0121j.Toolbar_titleTextColor, -1));
        }
        if (m2571a.m2589g(C0121j.Toolbar_subtitleTextColor)) {
            setSubtitleTextColor(m2571a.m2573a(C0121j.Toolbar_subtitleTextColor, -1));
        }
        m2571a.m2576a();
    }

    /* renamed from: a */
    private int m2350a(int i) {
        int m518g = C0107v.m518g(this);
        int m429a = C0091f.m429a(i, m518g) & 7;
        return (m429a == 1 || m429a == 3 || m429a == 5) ? m429a : m518g == 1 ? 5 : 3;
    }

    /* renamed from: a */
    private int m2351a(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        return C0094i.m440b(marginLayoutParams) + C0094i.m439a(marginLayoutParams);
    }

    /* renamed from: a */
    private int m2352a(View view, int i) {
        C0426b c0426b = (C0426b) view.getLayoutParams();
        int measuredHeight = view.getMeasuredHeight();
        int i2 = i > 0 ? (measuredHeight - i) / 2 : 0;
        int m2359b = m2359b(c0426b.f1545a);
        if (m2359b == 48) {
            return getPaddingTop() - i2;
        }
        if (m2359b == 80) {
            return (((getHeight() - getPaddingBottom()) - measuredHeight) - ((ViewGroup.MarginLayoutParams) c0426b).bottomMargin) - i2;
        }
        int paddingTop = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        int height = getHeight();
        int i3 = (((height - paddingTop) - paddingBottom) - measuredHeight) / 2;
        int i4 = ((ViewGroup.MarginLayoutParams) c0426b).topMargin;
        if (i3 < i4) {
            i3 = i4;
        } else {
            int i5 = (((height - paddingBottom) - measuredHeight) - i3) - paddingTop;
            int i6 = ((ViewGroup.MarginLayoutParams) c0426b).bottomMargin;
            if (i5 < i6) {
                i3 = Math.max(0, i3 - (i6 - i5));
            }
        }
        return paddingTop + i3;
    }

    /* renamed from: a */
    private int m2353a(View view, int i, int i2, int i3, int i4, int[] iArr) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int i5 = marginLayoutParams.leftMargin - iArr[0];
        int i6 = marginLayoutParams.rightMargin - iArr[1];
        int max = Math.max(0, i5) + Math.max(0, i6);
        iArr[0] = Math.max(0, -i5);
        iArr[1] = Math.max(0, -i6);
        view.measure(ViewGroup.getChildMeasureSpec(i, getPaddingLeft() + getPaddingRight() + max + i2, marginLayoutParams.width), ViewGroup.getChildMeasureSpec(i3, getPaddingTop() + getPaddingBottom() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + i4, marginLayoutParams.height));
        return view.getMeasuredWidth() + max;
    }

    /* renamed from: a */
    private int m2354a(View view, int i, int[] iArr, int i2) {
        C0426b c0426b = (C0426b) view.getLayoutParams();
        int i3 = ((ViewGroup.MarginLayoutParams) c0426b).leftMargin - iArr[0];
        int max = i + Math.max(0, i3);
        iArr[0] = Math.max(0, -i3);
        int m2352a = m2352a(view, i2);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(max, m2352a, max + measuredWidth, view.getMeasuredHeight() + m2352a);
        return max + measuredWidth + ((ViewGroup.MarginLayoutParams) c0426b).rightMargin;
    }

    /* renamed from: a */
    private int m2355a(List<View> list, int[] iArr) {
        int i = iArr[0];
        int i2 = iArr[1];
        int size = list.size();
        int i3 = i2;
        int i4 = i;
        int i5 = 0;
        int i6 = 0;
        while (i5 < size) {
            View view = list.get(i5);
            C0426b c0426b = (C0426b) view.getLayoutParams();
            int i7 = ((ViewGroup.MarginLayoutParams) c0426b).leftMargin - i4;
            int i8 = ((ViewGroup.MarginLayoutParams) c0426b).rightMargin - i3;
            int max = Math.max(0, i7);
            int max2 = Math.max(0, i8);
            int max3 = Math.max(0, -i7);
            int max4 = Math.max(0, -i8);
            i6 += max + view.getMeasuredWidth() + max2;
            i5++;
            i3 = max4;
            i4 = max3;
        }
        return i6;
    }

    /* renamed from: a */
    private void m2356a(View view, int i, int i2, int i3, int i4, int i5) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i, getPaddingLeft() + getPaddingRight() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i2, marginLayoutParams.width);
        int childMeasureSpec2 = ViewGroup.getChildMeasureSpec(i3, getPaddingTop() + getPaddingBottom() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + i4, marginLayoutParams.height);
        int mode = View.MeasureSpec.getMode(childMeasureSpec2);
        if (mode != 1073741824 && i5 >= 0) {
            if (mode != 0) {
                i5 = Math.min(View.MeasureSpec.getSize(childMeasureSpec2), i5);
            }
            childMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i5, 1073741824);
        }
        view.measure(childMeasureSpec, childMeasureSpec2);
    }

    /* renamed from: a */
    private void m2357a(View view, boolean z) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        C0426b generateDefaultLayoutParams = layoutParams == null ? generateDefaultLayoutParams() : !checkLayoutParams(layoutParams) ? generateLayoutParams(layoutParams) : (C0426b) layoutParams;
        generateDefaultLayoutParams.f2237b = 1;
        if (!z || this.f2216i == null) {
            addView(view, generateDefaultLayoutParams);
        } else {
            view.setLayoutParams(generateDefaultLayoutParams);
            this.f2197E.add(view);
        }
    }

    /* renamed from: a */
    private void m2358a(List<View> list, int i) {
        boolean z = C0107v.m518g(this) == 1;
        int childCount = getChildCount();
        int m429a = C0091f.m429a(i, C0107v.m518g(this));
        list.clear();
        if (!z) {
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = getChildAt(i2);
                C0426b c0426b = (C0426b) childAt.getLayoutParams();
                if (c0426b.f2237b == 0 && m2363d(childAt) && m2350a(c0426b.f1545a) == m429a) {
                    list.add(childAt);
                }
            }
            return;
        }
        for (int i3 = childCount - 1; i3 >= 0; i3--) {
            View childAt2 = getChildAt(i3);
            C0426b c0426b2 = (C0426b) childAt2.getLayoutParams();
            if (c0426b2.f2237b == 0 && m2363d(childAt2) && m2350a(c0426b2.f1545a) == m429a) {
                list.add(childAt2);
            }
        }
    }

    /* renamed from: b */
    private int m2359b(int i) {
        int i2 = i & C0121j.AppCompatTheme_windowActionBarOverlay;
        return (i2 == 16 || i2 == 48 || i2 == 80) ? i2 : this.f2230w & C0121j.AppCompatTheme_windowActionBarOverlay;
    }

    /* renamed from: b */
    private int m2360b(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        return marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
    }

    /* renamed from: b */
    private int m2361b(View view, int i, int[] iArr, int i2) {
        C0426b c0426b = (C0426b) view.getLayoutParams();
        int i3 = ((ViewGroup.MarginLayoutParams) c0426b).rightMargin - iArr[1];
        int max = i - Math.max(0, i3);
        iArr[1] = Math.max(0, -i3);
        int m2352a = m2352a(view, i2);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(max - measuredWidth, m2352a, max, view.getMeasuredHeight() + m2352a);
        return max - (measuredWidth + ((ViewGroup.MarginLayoutParams) c0426b).leftMargin);
    }

    /* renamed from: c */
    private boolean m2362c(View view) {
        return view.getParent() == this || this.f2197E.contains(view);
    }

    /* renamed from: d */
    private boolean m2363d(View view) {
        return (view == null || view.getParent() != this || view.getVisibility() == 8) ? false : true;
    }

    private MenuInflater getMenuInflater() {
        return new C0136g(getContext());
    }

    /* renamed from: l */
    private void m2364l() {
        if (this.f2227t == null) {
            this.f2227t = new C0434Y();
        }
    }

    /* renamed from: m */
    private void m2365m() {
        if (this.f2212e == null) {
            this.f2212e = new C0474t(getContext());
        }
    }

    /* renamed from: n */
    private void m2366n() {
        m2367o();
        if (this.f2208a.m2141g() == null) {
            C0366l c0366l = (C0366l) this.f2208a.getMenu();
            if (this.f2203K == null) {
                this.f2203K = new C0425a();
            }
            this.f2208a.setExpandedActionViewsExclusive(true);
            c0366l.m2017a(this.f2203K, this.f2217j);
        }
    }

    /* renamed from: o */
    private void m2367o() {
        if (this.f2208a == null) {
            this.f2208a = new ActionMenuView(getContext());
            this.f2208a.setPopupTheme(this.f2218k);
            this.f2208a.setOnMenuItemClickListener(this.f2200H);
            this.f2208a.m2134a(this.f2204L, this.f2205M);
            C0426b generateDefaultLayoutParams = generateDefaultLayoutParams();
            generateDefaultLayoutParams.f1545a = 8388613 | (this.f2221n & C0121j.AppCompatTheme_windowActionBarOverlay);
            this.f2208a.setLayoutParams(generateDefaultLayoutParams);
            m2357a((View) this.f2208a, false);
        }
    }

    /* renamed from: p */
    private void m2368p() {
        if (this.f2211d == null) {
            this.f2211d = new C0470r(getContext(), null, C0112a.toolbarNavigationButtonStyle);
            C0426b generateDefaultLayoutParams = generateDefaultLayoutParams();
            generateDefaultLayoutParams.f1545a = 8388611 | (this.f2221n & C0121j.AppCompatTheme_windowActionBarOverlay);
            this.f2211d.setLayoutParams(generateDefaultLayoutParams);
        }
    }

    /* renamed from: q */
    private void m2369q() {
        removeCallbacks(this.f2207O);
        post(this.f2207O);
    }

    /* renamed from: r */
    private boolean m2370r() {
        if (!this.f2206N) {
            return false;
        }
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (m2363d(childAt) && childAt.getMeasuredWidth() > 0 && childAt.getMeasuredHeight() > 0) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: a */
    void m2371a() {
        for (int size = this.f2197E.size() - 1; size >= 0; size--) {
            addView(this.f2197E.get(size));
        }
        this.f2197E.clear();
    }

    /* renamed from: a */
    public void m2372a(int i, int i2) {
        m2364l();
        this.f2227t.m2426b(i, i2);
    }

    /* renamed from: a */
    public void m2373a(Context context, int i) {
        this.f2220m = i;
        TextView textView = this.f2210c;
        if (textView != null) {
            textView.setTextAppearance(context, i);
        }
    }

    /* renamed from: a */
    public void m2374a(C0366l c0366l, C0448g c0448g) {
        if (c0366l == null && this.f2208a == null) {
            return;
        }
        m2367o();
        C0366l m2141g = this.f2208a.m2141g();
        if (m2141g == c0366l) {
            return;
        }
        if (m2141g != null) {
            m2141g.m2026b(this.f2202J);
            m2141g.m2026b(this.f2203K);
        }
        if (this.f2203K == null) {
            this.f2203K = new C0425a();
        }
        c0448g.m2454b(true);
        if (c0366l != null) {
            c0366l.m2017a(c0448g, this.f2217j);
            c0366l.m2017a(this.f2203K, this.f2217j);
        } else {
            c0448g.mo1968a(this.f2217j, (C0366l) null);
            this.f2203K.mo1968a(this.f2217j, (C0366l) null);
            c0448g.mo1935a(true);
            this.f2203K.mo1935a(true);
        }
        this.f2208a.setPopupTheme(this.f2218k);
        this.f2208a.setPresenter(c0448g);
        this.f2202J = c0448g;
    }

    /* renamed from: b */
    public void m2375b(Context context, int i) {
        this.f2219l = i;
        TextView textView = this.f2209b;
        if (textView != null) {
            textView.setTextAppearance(context, i);
        }
    }

    /* renamed from: b */
    public boolean m2376b() {
        ActionMenuView actionMenuView;
        return getVisibility() == 0 && (actionMenuView = this.f2208a) != null && actionMenuView.m2140f();
    }

    /* renamed from: c */
    public void m2377c() {
        C0425a c0425a = this.f2203K;
        C0370p c0370p = c0425a == null ? null : c0425a.f2235b;
        if (c0370p != null) {
            c0370p.collapseActionView();
        }
    }

    @Override // android.view.ViewGroup
    protected boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return super.checkLayoutParams(layoutParams) && (layoutParams instanceof C0426b);
    }

    /* renamed from: d */
    public void m2378d() {
        ActionMenuView actionMenuView = this.f2208a;
        if (actionMenuView != null) {
            actionMenuView.m2133a();
        }
    }

    /* renamed from: e */
    void m2379e() {
        if (this.f2215h == null) {
            this.f2215h = new C0470r(getContext(), null, C0112a.toolbarNavigationButtonStyle);
            this.f2215h.setImageDrawable(this.f2213f);
            this.f2215h.setContentDescription(this.f2214g);
            C0426b generateDefaultLayoutParams = generateDefaultLayoutParams();
            generateDefaultLayoutParams.f1545a = 8388611 | (this.f2221n & C0121j.AppCompatTheme_windowActionBarOverlay);
            generateDefaultLayoutParams.f2237b = 2;
            this.f2215h.setLayoutParams(generateDefaultLayoutParams);
            this.f2215h.setOnClickListener(new ViewOnClickListenerC0485ya(this));
        }
    }

    /* renamed from: f */
    public boolean m2380f() {
        C0425a c0425a = this.f2203K;
        return (c0425a == null || c0425a.f2235b == null) ? false : true;
    }

    /* renamed from: g */
    public boolean m2381g() {
        ActionMenuView actionMenuView = this.f2208a;
        return actionMenuView != null && actionMenuView.m2136c();
    }

    @Override // android.view.ViewGroup
    public C0426b generateDefaultLayoutParams() {
        return new C0426b(-2, -2);
    }

    @Override // android.view.ViewGroup
    public C0426b generateLayoutParams(AttributeSet attributeSet) {
        return new C0426b(getContext(), attributeSet);
    }

    @Override // android.view.ViewGroup
    public C0426b generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof C0426b ? new C0426b((C0426b) layoutParams) : layoutParams instanceof AbstractC0322a.a ? new C0426b((AbstractC0322a.a) layoutParams) : layoutParams instanceof ViewGroup.MarginLayoutParams ? new C0426b((ViewGroup.MarginLayoutParams) layoutParams) : new C0426b(layoutParams);
    }

    public int getContentInsetEnd() {
        C0434Y c0434y = this.f2227t;
        if (c0434y != null) {
            return c0434y.m2422a();
        }
        return 0;
    }

    public int getContentInsetEndWithActions() {
        int i = this.f2229v;
        return i != Integer.MIN_VALUE ? i : getContentInsetEnd();
    }

    public int getContentInsetLeft() {
        C0434Y c0434y = this.f2227t;
        if (c0434y != null) {
            return c0434y.m2425b();
        }
        return 0;
    }

    public int getContentInsetRight() {
        C0434Y c0434y = this.f2227t;
        if (c0434y != null) {
            return c0434y.m2427c();
        }
        return 0;
    }

    public int getContentInsetStart() {
        C0434Y c0434y = this.f2227t;
        if (c0434y != null) {
            return c0434y.m2428d();
        }
        return 0;
    }

    public int getContentInsetStartWithNavigation() {
        int i = this.f2228u;
        return i != Integer.MIN_VALUE ? i : getContentInsetStart();
    }

    public int getCurrentContentInsetEnd() {
        C0366l m2141g;
        ActionMenuView actionMenuView = this.f2208a;
        return actionMenuView != null && (m2141g = actionMenuView.m2141g()) != null && m2141g.hasVisibleItems() ? Math.max(getContentInsetEnd(), Math.max(this.f2229v, 0)) : getContentInsetEnd();
    }

    public int getCurrentContentInsetLeft() {
        return C0107v.m518g(this) == 1 ? getCurrentContentInsetEnd() : getCurrentContentInsetStart();
    }

    public int getCurrentContentInsetRight() {
        return C0107v.m518g(this) == 1 ? getCurrentContentInsetStart() : getCurrentContentInsetEnd();
    }

    public int getCurrentContentInsetStart() {
        return getNavigationIcon() != null ? Math.max(getContentInsetStart(), Math.max(this.f2228u, 0)) : getContentInsetStart();
    }

    public Drawable getLogo() {
        ImageView imageView = this.f2212e;
        if (imageView != null) {
            return imageView.getDrawable();
        }
        return null;
    }

    public CharSequence getLogoDescription() {
        ImageView imageView = this.f2212e;
        if (imageView != null) {
            return imageView.getContentDescription();
        }
        return null;
    }

    public Menu getMenu() {
        m2366n();
        return this.f2208a.getMenu();
    }

    public CharSequence getNavigationContentDescription() {
        ImageButton imageButton = this.f2211d;
        if (imageButton != null) {
            return imageButton.getContentDescription();
        }
        return null;
    }

    public Drawable getNavigationIcon() {
        ImageButton imageButton = this.f2211d;
        if (imageButton != null) {
            return imageButton.getDrawable();
        }
        return null;
    }

    C0448g getOuterActionMenuPresenter() {
        return this.f2202J;
    }

    public Drawable getOverflowIcon() {
        m2366n();
        return this.f2208a.getOverflowIcon();
    }

    Context getPopupContext() {
        return this.f2217j;
    }

    public int getPopupTheme() {
        return this.f2218k;
    }

    public CharSequence getSubtitle() {
        return this.f2232y;
    }

    public CharSequence getTitle() {
        return this.f2231x;
    }

    public int getTitleMarginBottom() {
        return this.f2226s;
    }

    public int getTitleMarginEnd() {
        return this.f2224q;
    }

    public int getTitleMarginStart() {
        return this.f2223p;
    }

    public int getTitleMarginTop() {
        return this.f2225r;
    }

    public InterfaceC0411L getWrapper() {
        if (this.f2201I == null) {
            this.f2201I = new C0393Ca(this, true);
        }
        return this.f2201I;
    }

    /* renamed from: h */
    public boolean m2382h() {
        ActionMenuView actionMenuView = this.f2208a;
        return actionMenuView != null && actionMenuView.m2137d();
    }

    /* renamed from: i */
    public boolean m2383i() {
        ActionMenuView actionMenuView = this.f2208a;
        return actionMenuView != null && actionMenuView.m2139e();
    }

    /* renamed from: j */
    void m2384j() {
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = getChildAt(childCount);
            if (((C0426b) childAt.getLayoutParams()).f2237b != 2 && childAt != this.f2208a) {
                removeViewAt(childCount);
                this.f2197E.add(childAt);
            }
        }
    }

    /* renamed from: k */
    public boolean m2385k() {
        ActionMenuView actionMenuView = this.f2208a;
        return actionMenuView != null && actionMenuView.m2142h();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeCallbacks(this.f2207O);
    }

    @Override // android.view.View
    public boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 9) {
            this.f2195C = false;
        }
        if (!this.f2195C) {
            boolean onHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9 && !onHoverEvent) {
                this.f2195C = true;
            }
        }
        if (actionMasked == 10 || actionMasked == 3) {
            this.f2195C = false;
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:107:0x01a8  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x02a6 A[LOOP:0: B:41:0x02a4->B:42:0x02a6, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x02c8 A[LOOP:1: B:45:0x02c6->B:46:0x02c8, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x02f3  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0302 A[LOOP:2: B:54:0x0300->B:55:0x0302, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x016a  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x01b9  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x022c  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected void onLayout(boolean r20, int r21, int r22, int r23, int r24) {
        /*
            Method dump skipped, instructions count: 791
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v7.widget.Toolbar.onLayout(boolean, int, int, int, int):void");
    }

    @Override // android.view.View
    protected void onMeasure(int i, int i2) {
        char c2;
        char c3;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int[] iArr = this.f2198F;
        if (C0408Ja.m2259a(this)) {
            c2 = 1;
            c3 = 0;
        } else {
            c2 = 0;
            c3 = 1;
        }
        if (m2363d(this.f2211d)) {
            m2356a(this.f2211d, i, 0, i2, 0, this.f2222o);
            i3 = this.f2211d.getMeasuredWidth() + m2351a(this.f2211d);
            i4 = Math.max(0, this.f2211d.getMeasuredHeight() + m2360b(this.f2211d));
            i5 = View.combineMeasuredStates(0, this.f2211d.getMeasuredState());
        } else {
            i3 = 0;
            i4 = 0;
            i5 = 0;
        }
        if (m2363d(this.f2215h)) {
            m2356a(this.f2215h, i, 0, i2, 0, this.f2222o);
            i3 = this.f2215h.getMeasuredWidth() + m2351a(this.f2215h);
            i4 = Math.max(i4, this.f2215h.getMeasuredHeight() + m2360b(this.f2215h));
            i5 = View.combineMeasuredStates(i5, this.f2215h.getMeasuredState());
        }
        int currentContentInsetStart = getCurrentContentInsetStart();
        int max = 0 + Math.max(currentContentInsetStart, i3);
        iArr[c2] = Math.max(0, currentContentInsetStart - i3);
        if (m2363d(this.f2208a)) {
            m2356a(this.f2208a, i, max, i2, 0, this.f2222o);
            i6 = this.f2208a.getMeasuredWidth() + m2351a(this.f2208a);
            i4 = Math.max(i4, this.f2208a.getMeasuredHeight() + m2360b(this.f2208a));
            i5 = View.combineMeasuredStates(i5, this.f2208a.getMeasuredState());
        } else {
            i6 = 0;
        }
        int currentContentInsetEnd = getCurrentContentInsetEnd();
        int max2 = max + Math.max(currentContentInsetEnd, i6);
        iArr[c3] = Math.max(0, currentContentInsetEnd - i6);
        if (m2363d(this.f2216i)) {
            max2 += m2353a(this.f2216i, i, max2, i2, 0, iArr);
            i4 = Math.max(i4, this.f2216i.getMeasuredHeight() + m2360b(this.f2216i));
            i5 = View.combineMeasuredStates(i5, this.f2216i.getMeasuredState());
        }
        if (m2363d(this.f2212e)) {
            max2 += m2353a(this.f2212e, i, max2, i2, 0, iArr);
            i4 = Math.max(i4, this.f2212e.getMeasuredHeight() + m2360b(this.f2212e));
            i5 = View.combineMeasuredStates(i5, this.f2212e.getMeasuredState());
        }
        int childCount = getChildCount();
        int i10 = i4;
        int i11 = max2;
        for (int i12 = 0; i12 < childCount; i12++) {
            View childAt = getChildAt(i12);
            if (((C0426b) childAt.getLayoutParams()).f2237b == 0 && m2363d(childAt)) {
                i11 += m2353a(childAt, i, i11, i2, 0, iArr);
                i10 = Math.max(i10, childAt.getMeasuredHeight() + m2360b(childAt));
                i5 = View.combineMeasuredStates(i5, childAt.getMeasuredState());
            }
        }
        int i13 = this.f2225r + this.f2226s;
        int i14 = this.f2223p + this.f2224q;
        if (m2363d(this.f2209b)) {
            m2353a(this.f2209b, i, i11 + i14, i2, i13, iArr);
            int measuredWidth = this.f2209b.getMeasuredWidth() + m2351a(this.f2209b);
            i9 = this.f2209b.getMeasuredHeight() + m2360b(this.f2209b);
            i7 = View.combineMeasuredStates(i5, this.f2209b.getMeasuredState());
            i8 = measuredWidth;
        } else {
            i7 = i5;
            i8 = 0;
            i9 = 0;
        }
        if (m2363d(this.f2210c)) {
            i8 = Math.max(i8, m2353a(this.f2210c, i, i11 + i14, i2, i9 + i13, iArr));
            i9 += this.f2210c.getMeasuredHeight() + m2360b(this.f2210c);
            i7 = View.combineMeasuredStates(i7, this.f2210c.getMeasuredState());
        }
        int max3 = Math.max(i10, i9);
        int paddingLeft = i11 + i8 + getPaddingLeft() + getPaddingRight();
        int paddingTop = max3 + getPaddingTop() + getPaddingBottom();
        int resolveSizeAndState = View.resolveSizeAndState(Math.max(paddingLeft, getSuggestedMinimumWidth()), i, (-16777216) & i7);
        int resolveSizeAndState2 = View.resolveSizeAndState(Math.max(paddingTop, getSuggestedMinimumHeight()), i2, i7 << 16);
        if (m2370r()) {
            resolveSizeAndState2 = 0;
        }
        setMeasuredDimension(resolveSizeAndState, resolveSizeAndState2);
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable) {
        MenuItem findItem;
        if (!(parcelable instanceof C0428d)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        C0428d c0428d = (C0428d) parcelable;
        super.onRestoreInstanceState(c0428d.m411a());
        ActionMenuView actionMenuView = this.f2208a;
        C0366l m2141g = actionMenuView != null ? actionMenuView.m2141g() : null;
        int i = c0428d.f2238a;
        if (i != 0 && this.f2203K != null && m2141g != null && (findItem = m2141g.findItem(i)) != null) {
            findItem.expandActionView();
        }
        if (c0428d.f2239b) {
            m2369q();
        }
    }

    @Override // android.view.View
    public void onRtlPropertiesChanged(int i) {
        if (Build.VERSION.SDK_INT >= 17) {
            super.onRtlPropertiesChanged(i);
        }
        m2364l();
        this.f2227t.m2424a(i == 1);
    }

    @Override // android.view.View
    protected Parcelable onSaveInstanceState() {
        C0370p c0370p;
        C0428d c0428d = new C0428d(super.onSaveInstanceState());
        C0425a c0425a = this.f2203K;
        if (c0425a != null && (c0370p = c0425a.f2235b) != null) {
            c0428d.f2238a = c0370p.getItemId();
        }
        c0428d.f2239b = m2383i();
        return c0428d;
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f2194B = false;
        }
        if (!this.f2194B) {
            boolean onTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0 && !onTouchEvent) {
                this.f2194B = true;
            }
        }
        if (actionMasked == 1 || actionMasked == 3) {
            this.f2194B = false;
        }
        return true;
    }

    public void setCollapsible(boolean z) {
        this.f2206N = z;
        requestLayout();
    }

    public void setContentInsetEndWithActions(int i) {
        if (i < 0) {
            i = Integer.MIN_VALUE;
        }
        if (i != this.f2229v) {
            this.f2229v = i;
            if (getNavigationIcon() != null) {
                requestLayout();
            }
        }
    }

    public void setContentInsetStartWithNavigation(int i) {
        if (i < 0) {
            i = Integer.MIN_VALUE;
        }
        if (i != this.f2228u) {
            this.f2228u = i;
            if (getNavigationIcon() != null) {
                requestLayout();
            }
        }
    }

    public void setLogo(int i) {
        setLogo(C0122a.m550b(getContext(), i));
    }

    public void setLogo(Drawable drawable) {
        if (drawable != null) {
            m2365m();
            if (!m2362c(this.f2212e)) {
                m2357a((View) this.f2212e, true);
            }
        } else {
            ImageView imageView = this.f2212e;
            if (imageView != null && m2362c(imageView)) {
                removeView(this.f2212e);
                this.f2197E.remove(this.f2212e);
            }
        }
        ImageView imageView2 = this.f2212e;
        if (imageView2 != null) {
            imageView2.setImageDrawable(drawable);
        }
    }

    public void setLogoDescription(int i) {
        setLogoDescription(getContext().getText(i));
    }

    public void setLogoDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            m2365m();
        }
        ImageView imageView = this.f2212e;
        if (imageView != null) {
            imageView.setContentDescription(charSequence);
        }
    }

    public void setNavigationContentDescription(int i) {
        setNavigationContentDescription(i != 0 ? getContext().getText(i) : null);
    }

    public void setNavigationContentDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            m2368p();
        }
        ImageButton imageButton = this.f2211d;
        if (imageButton != null) {
            imageButton.setContentDescription(charSequence);
        }
    }

    public void setNavigationIcon(int i) {
        setNavigationIcon(C0122a.m550b(getContext(), i));
    }

    public void setNavigationIcon(Drawable drawable) {
        if (drawable != null) {
            m2368p();
            if (!m2362c(this.f2211d)) {
                m2357a((View) this.f2211d, true);
            }
        } else {
            ImageButton imageButton = this.f2211d;
            if (imageButton != null && m2362c(imageButton)) {
                removeView(this.f2211d);
                this.f2197E.remove(this.f2211d);
            }
        }
        ImageButton imageButton2 = this.f2211d;
        if (imageButton2 != null) {
            imageButton2.setImageDrawable(drawable);
        }
    }

    public void setNavigationOnClickListener(View.OnClickListener onClickListener) {
        m2368p();
        this.f2211d.setOnClickListener(onClickListener);
    }

    public void setOnMenuItemClickListener(InterfaceC0427c interfaceC0427c) {
        this.f2199G = interfaceC0427c;
    }

    public void setOverflowIcon(Drawable drawable) {
        m2366n();
        this.f2208a.setOverflowIcon(drawable);
    }

    public void setPopupTheme(int i) {
        if (this.f2218k != i) {
            this.f2218k = i;
            if (i == 0) {
                this.f2217j = getContext();
            } else {
                this.f2217j = new ContextThemeWrapper(getContext(), i);
            }
        }
    }

    public void setSubtitle(int i) {
        setSubtitle(getContext().getText(i));
    }

    public void setSubtitle(CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            TextView textView = this.f2210c;
            if (textView != null && m2362c(textView)) {
                removeView(this.f2210c);
                this.f2197E.remove(this.f2210c);
            }
        } else {
            if (this.f2210c == null) {
                Context context = getContext();
                this.f2210c = new C0405I(context);
                this.f2210c.setSingleLine();
                this.f2210c.setEllipsize(TextUtils.TruncateAt.END);
                int i = this.f2220m;
                if (i != 0) {
                    this.f2210c.setTextAppearance(context, i);
                }
                int i2 = this.f2193A;
                if (i2 != 0) {
                    this.f2210c.setTextColor(i2);
                }
            }
            if (!m2362c(this.f2210c)) {
                m2357a((View) this.f2210c, true);
            }
        }
        TextView textView2 = this.f2210c;
        if (textView2 != null) {
            textView2.setText(charSequence);
        }
        this.f2232y = charSequence;
    }

    public void setSubtitleTextColor(int i) {
        this.f2193A = i;
        TextView textView = this.f2210c;
        if (textView != null) {
            textView.setTextColor(i);
        }
    }

    public void setTitle(int i) {
        setTitle(getContext().getText(i));
    }

    public void setTitle(CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            TextView textView = this.f2209b;
            if (textView != null && m2362c(textView)) {
                removeView(this.f2209b);
                this.f2197E.remove(this.f2209b);
            }
        } else {
            if (this.f2209b == null) {
                Context context = getContext();
                this.f2209b = new C0405I(context);
                this.f2209b.setSingleLine();
                this.f2209b.setEllipsize(TextUtils.TruncateAt.END);
                int i = this.f2219l;
                if (i != 0) {
                    this.f2209b.setTextAppearance(context, i);
                }
                int i2 = this.f2233z;
                if (i2 != 0) {
                    this.f2209b.setTextColor(i2);
                }
            }
            if (!m2362c(this.f2209b)) {
                m2357a((View) this.f2209b, true);
            }
        }
        TextView textView2 = this.f2209b;
        if (textView2 != null) {
            textView2.setText(charSequence);
        }
        this.f2231x = charSequence;
    }

    public void setTitleMarginBottom(int i) {
        this.f2226s = i;
        requestLayout();
    }

    public void setTitleMarginEnd(int i) {
        this.f2224q = i;
        requestLayout();
    }

    public void setTitleMarginStart(int i) {
        this.f2223p = i;
        requestLayout();
    }

    public void setTitleMarginTop(int i) {
        this.f2225r = i;
        requestLayout();
    }

    public void setTitleTextColor(int i) {
        this.f2233z = i;
        TextView textView = this.f2209b;
        if (textView != null) {
            textView.setTextColor(i);
        }
    }
}
