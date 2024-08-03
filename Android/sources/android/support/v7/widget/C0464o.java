package android.support.v7.widget;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Build;
import android.support.v4.graphics.drawable.C0220a;
import android.support.v4.util.C0256b;
import android.support.v4.util.C0262h;
import android.support.v4.util.C0263i;
import android.support.v4.util.C0270p;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.util.Xml;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import p000a.p005b.p007b.p008a.C0014d;
import p000a.p005b.p007b.p008a.C0021k;
import p000a.p005b.p009c.p010a.C0022a;
import p000a.p005b.p009c.p012b.C0035a;
import p000a.p005b.p022d.p023a.C0112a;
import p000a.p005b.p022d.p023a.C0116e;
import p000a.p005b.p022d.p026c.p027a.C0124b;

/* renamed from: android.support.v7.widget.o */
/* loaded from: classes.dex */
public final class C0464o {

    /* renamed from: b */
    private static C0464o f2421b;

    /* renamed from: j */
    private WeakHashMap<Context, C0270p<ColorStateList>> f2429j;

    /* renamed from: k */
    private C0256b<String, d> f2430k;

    /* renamed from: l */
    private C0270p<String> f2431l;

    /* renamed from: m */
    private final WeakHashMap<Context, C0262h<WeakReference<Drawable.ConstantState>>> f2432m = new WeakHashMap<>(0);

    /* renamed from: n */
    private TypedValue f2433n;

    /* renamed from: o */
    private boolean f2434o;

    /* renamed from: a */
    private static final PorterDuff.Mode f2420a = PorterDuff.Mode.SRC_IN;

    /* renamed from: c */
    private static final c f2422c = new c(6);

    /* renamed from: d */
    private static final int[] f2423d = {C0116e.abc_textfield_search_default_mtrl_alpha, C0116e.abc_textfield_default_mtrl_alpha, C0116e.abc_ab_share_pack_mtrl_alpha};

    /* renamed from: e */
    private static final int[] f2424e = {C0116e.abc_ic_commit_search_api_mtrl_alpha, C0116e.abc_seekbar_tick_mark_material, C0116e.abc_ic_menu_share_mtrl_alpha, C0116e.abc_ic_menu_copy_mtrl_am_alpha, C0116e.abc_ic_menu_cut_mtrl_alpha, C0116e.abc_ic_menu_selectall_mtrl_alpha, C0116e.abc_ic_menu_paste_mtrl_am_alpha};

    /* renamed from: f */
    private static final int[] f2425f = {C0116e.abc_textfield_activated_mtrl_alpha, C0116e.abc_textfield_search_activated_mtrl_alpha, C0116e.abc_cab_background_top_mtrl_alpha, C0116e.abc_text_cursor_material, C0116e.abc_text_select_handle_left_mtrl_dark, C0116e.abc_text_select_handle_middle_mtrl_dark, C0116e.abc_text_select_handle_right_mtrl_dark, C0116e.abc_text_select_handle_left_mtrl_light, C0116e.abc_text_select_handle_middle_mtrl_light, C0116e.abc_text_select_handle_right_mtrl_light};

    /* renamed from: g */
    private static final int[] f2426g = {C0116e.abc_popup_background_mtrl_mult, C0116e.abc_cab_background_internal_bg, C0116e.abc_menu_hardkey_panel_mtrl_mult};

    /* renamed from: h */
    private static final int[] f2427h = {C0116e.abc_tab_indicator_material, C0116e.abc_textfield_search_material};

    /* renamed from: i */
    private static final int[] f2428i = {C0116e.abc_btn_check_material, C0116e.abc_btn_radio_material};

    /* renamed from: android.support.v7.widget.o$a */
    /* loaded from: classes.dex */
    public static class a implements d {
        a() {
        }

        @Override // android.support.v7.widget.C0464o.d
        /* renamed from: a */
        public Drawable mo2530a(Context context, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
            try {
                return C0124b.m554a(context, context.getResources(), xmlPullParser, attributeSet, theme);
            } catch (Exception e2) {
                Log.e("AsldcInflateDelegate", "Exception while inflating <animated-selector>", e2);
                return null;
            }
        }
    }

    /* renamed from: android.support.v7.widget.o$b */
    /* loaded from: classes.dex */
    public static class b implements d {
        b() {
        }

        @Override // android.support.v7.widget.C0464o.d
        /* renamed from: a */
        public Drawable mo2530a(Context context, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
            try {
                return C0014d.m16a(context, context.getResources(), xmlPullParser, attributeSet, theme);
            } catch (Exception e2) {
                Log.e("AvdcInflateDelegate", "Exception while inflating <animated-vector>", e2);
                return null;
            }
        }
    }

    /* renamed from: android.support.v7.widget.o$c */
    /* loaded from: classes.dex */
    public static class c extends C0263i<Integer, PorterDuffColorFilter> {
        public c(int i) {
            super(i);
        }

        /* renamed from: b */
        private static int m2531b(int i, PorterDuff.Mode mode) {
            return ((i + 31) * 31) + mode.hashCode();
        }

        /* renamed from: a */
        PorterDuffColorFilter m2532a(int i, PorterDuff.Mode mode) {
            return m1371b(Integer.valueOf(m2531b(i, mode)));
        }

        /* renamed from: a */
        PorterDuffColorFilter m2533a(int i, PorterDuff.Mode mode, PorterDuffColorFilter porterDuffColorFilter) {
            return m1367a((c) Integer.valueOf(m2531b(i, mode)), (Integer) porterDuffColorFilter);
        }
    }

    /* renamed from: android.support.v7.widget.o$d */
    /* loaded from: classes.dex */
    public interface d {
        /* renamed from: a */
        Drawable mo2530a(Context context, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme);
    }

    /* renamed from: android.support.v7.widget.o$e */
    /* loaded from: classes.dex */
    public static class e implements d {
        e() {
        }

        @Override // android.support.v7.widget.C0464o.d
        /* renamed from: a */
        public Drawable mo2530a(Context context, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
            try {
                return C0021k.createFromXmlInner(context.getResources(), xmlPullParser, attributeSet, theme);
            } catch (Exception e2) {
                Log.e("VdcInflateDelegate", "Exception while inflating <vector>", e2);
                return null;
            }
        }
    }

    /* renamed from: a */
    private static long m2500a(TypedValue typedValue) {
        return (typedValue.assetCookie << 32) | typedValue.data;
    }

    /* renamed from: a */
    static PorterDuff.Mode m2501a(int i) {
        if (i == C0116e.abc_switch_thumb_material) {
            return PorterDuff.Mode.MULTIPLY;
        }
        return null;
    }

    /* renamed from: a */
    public static synchronized PorterDuffColorFilter m2502a(int i, PorterDuff.Mode mode) {
        PorterDuffColorFilter m2532a;
        synchronized (C0464o.class) {
            m2532a = f2422c.m2532a(i, mode);
            if (m2532a == null) {
                m2532a = new PorterDuffColorFilter(i, mode);
                f2422c.m2533a(i, mode, m2532a);
            }
        }
        return m2532a;
    }

    /* renamed from: a */
    private static PorterDuffColorFilter m2503a(ColorStateList colorStateList, PorterDuff.Mode mode, int[] iArr) {
        if (colorStateList == null || mode == null) {
            return null;
        }
        return m2502a(colorStateList.getColorForState(iArr, 0), mode);
    }

    /* renamed from: a */
    private Drawable m2504a(Context context, int i, boolean z, Drawable drawable) {
        LayerDrawable layerDrawable;
        Drawable findDrawableByLayerId;
        int i2;
        ColorStateList m2529b = m2529b(context, i);
        if (m2529b != null) {
            if (C0412M.m2263a(drawable)) {
                drawable = drawable.mutate();
            }
            Drawable m1209h = C0220a.m1209h(drawable);
            C0220a.m1195a(m1209h, m2529b);
            PorterDuff.Mode m2501a = m2501a(i);
            if (m2501a == null) {
                return m1209h;
            }
            C0220a.m1198a(m1209h, m2501a);
            return m1209h;
        }
        if (i == C0116e.abc_seekbar_track_material) {
            layerDrawable = (LayerDrawable) drawable;
            m2508a(layerDrawable.findDrawableByLayerId(R.id.background), C0469qa.m2552b(context, C0112a.colorControlNormal), f2420a);
            findDrawableByLayerId = layerDrawable.findDrawableByLayerId(R.id.secondaryProgress);
            i2 = C0112a.colorControlNormal;
        } else {
            if (i != C0116e.abc_ratingbar_material && i != C0116e.abc_ratingbar_indicator_material && i != C0116e.abc_ratingbar_small_material) {
                if (m2512a(context, i, drawable) || !z) {
                    return drawable;
                }
                return null;
            }
            layerDrawable = (LayerDrawable) drawable;
            m2508a(layerDrawable.findDrawableByLayerId(R.id.background), C0469qa.m2549a(context, C0112a.colorControlNormal), f2420a);
            findDrawableByLayerId = layerDrawable.findDrawableByLayerId(R.id.secondaryProgress);
            i2 = C0112a.colorControlActivated;
        }
        m2508a(findDrawableByLayerId, C0469qa.m2552b(context, i2), f2420a);
        m2508a(layerDrawable.findDrawableByLayerId(R.id.progress), C0469qa.m2552b(context, C0112a.colorControlActivated), f2420a);
        return drawable;
    }

    /* renamed from: a */
    private synchronized Drawable m2505a(Context context, long j) {
        C0262h<WeakReference<Drawable.ConstantState>> c0262h = this.f2432m.get(context);
        if (c0262h == null) {
            return null;
        }
        WeakReference<Drawable.ConstantState> m1362b = c0262h.m1362b(j);
        if (m1362b != null) {
            Drawable.ConstantState constantState = m1362b.get();
            if (constantState != null) {
                return constantState.newDrawable(context.getResources());
            }
            c0262h.m1358a(j);
        }
        return null;
    }

    /* renamed from: a */
    public static synchronized C0464o m2506a() {
        C0464o c0464o;
        synchronized (C0464o.class) {
            if (f2421b == null) {
                f2421b = new C0464o();
                m2510a(f2421b);
            }
            c0464o = f2421b;
        }
        return c0464o;
    }

    /* renamed from: a */
    private void m2507a(Context context, int i, ColorStateList colorStateList) {
        if (this.f2429j == null) {
            this.f2429j = new WeakHashMap<>();
        }
        C0270p<ColorStateList> c0270p = this.f2429j.get(context);
        if (c0270p == null) {
            c0270p = new C0270p<>();
            this.f2429j.put(context, c0270p);
        }
        c0270p.m1401a(i, colorStateList);
    }

    /* renamed from: a */
    private static void m2508a(Drawable drawable, int i, PorterDuff.Mode mode) {
        if (C0412M.m2263a(drawable)) {
            drawable = drawable.mutate();
        }
        if (mode == null) {
            mode = f2420a;
        }
        drawable.setColorFilter(m2502a(i, mode));
    }

    /* renamed from: a */
    public static void m2509a(Drawable drawable, C0475ta c0475ta, int[] iArr) {
        if (C0412M.m2263a(drawable) && drawable.mutate() != drawable) {
            Log.d("AppCompatDrawableManag", "Mutated drawable is not the same instance as the input.");
            return;
        }
        if (c0475ta.f2502d || c0475ta.f2501c) {
            drawable.setColorFilter(m2503a(c0475ta.f2502d ? c0475ta.f2499a : null, c0475ta.f2501c ? c0475ta.f2500b : f2420a, iArr));
        } else {
            drawable.clearColorFilter();
        }
        if (Build.VERSION.SDK_INT <= 23) {
            drawable.invalidateSelf();
        }
    }

    /* renamed from: a */
    private static void m2510a(C0464o c0464o) {
        if (Build.VERSION.SDK_INT < 24) {
            c0464o.m2511a("vector", new e());
            c0464o.m2511a("animated-vector", new b());
            c0464o.m2511a("animated-selector", new a());
        }
    }

    /* renamed from: a */
    private void m2511a(String str, d dVar) {
        if (this.f2430k == null) {
            this.f2430k = new C0256b<>();
        }
        this.f2430k.put(str, dVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0061 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:6:0x0046  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean m2512a(android.content.Context r6, int r7, android.graphics.drawable.Drawable r8) {
        /*
            android.graphics.PorterDuff$Mode r0 = android.support.v7.widget.C0464o.f2420a
            int[] r1 = android.support.v7.widget.C0464o.f2423d
            boolean r1 = m2515a(r1, r7)
            r2 = 16842801(0x1010031, float:2.3693695E-38)
            r3 = -1
            r4 = 0
            r5 = 1
            if (r1 == 0) goto L15
            int r2 = p000a.p005b.p022d.p023a.C0112a.colorControlNormal
        L12:
            r7 = 1
            r1 = -1
            goto L44
        L15:
            int[] r1 = android.support.v7.widget.C0464o.f2425f
            boolean r1 = m2515a(r1, r7)
            if (r1 == 0) goto L20
            int r2 = p000a.p005b.p022d.p023a.C0112a.colorControlActivated
            goto L12
        L20:
            int[] r1 = android.support.v7.widget.C0464o.f2426g
            boolean r1 = m2515a(r1, r7)
            if (r1 == 0) goto L2b
            android.graphics.PorterDuff$Mode r0 = android.graphics.PorterDuff.Mode.MULTIPLY
            goto L12
        L2b:
            int r1 = p000a.p005b.p022d.p023a.C0116e.abc_list_divider_mtrl_alpha
            if (r7 != r1) goto L3c
            r2 = 16842800(0x1010030, float:2.3693693E-38)
            r7 = 1109603123(0x42233333, float:40.8)
            int r7 = java.lang.Math.round(r7)
            r1 = r7
            r7 = 1
            goto L44
        L3c:
            int r1 = p000a.p005b.p022d.p023a.C0116e.abc_dialog_material_background
            if (r7 != r1) goto L41
            goto L12
        L41:
            r7 = 0
            r1 = -1
            r2 = 0
        L44:
            if (r7 == 0) goto L61
            boolean r7 = android.support.v7.widget.C0412M.m2263a(r8)
            if (r7 == 0) goto L50
            android.graphics.drawable.Drawable r8 = r8.mutate()
        L50:
            int r6 = android.support.v7.widget.C0469qa.m2552b(r6, r2)
            android.graphics.PorterDuffColorFilter r6 = m2502a(r6, r0)
            r8.setColorFilter(r6)
            if (r1 == r3) goto L60
            r8.setAlpha(r1)
        L60:
            return r5
        L61:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v7.widget.C0464o.m2512a(android.content.Context, int, android.graphics.drawable.Drawable):boolean");
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* renamed from: a */
    private synchronized boolean m2513a(Context context, long j, Drawable drawable) {
        boolean z;
        Drawable.ConstantState constantState = drawable.getConstantState();
        if (constantState != null) {
            C0262h<WeakReference<Drawable.ConstantState>> c0262h = this.f2432m.get(context);
            if (c0262h == null) {
                c0262h = new C0262h<>();
                this.f2432m.put(context, c0262h);
            }
            c0262h.m1364c(j, new WeakReference<>(constantState));
            z = true;
        } else {
            z = false;
        }
        return z;
    }

    /* renamed from: a */
    private static boolean m2514a(Drawable drawable) {
        return (drawable instanceof C0021k) || "android.graphics.drawable.VectorDrawable".equals(drawable.getClass().getName());
    }

    /* renamed from: a */
    private static boolean m2515a(int[] iArr, int i) {
        for (int i2 : iArr) {
            if (i2 == i) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: b */
    private void m2516b(Context context) {
        if (this.f2434o) {
            return;
        }
        this.f2434o = true;
        Drawable m2525a = m2525a(context, C0116e.abc_vector_test);
        if (m2525a == null || !m2514a(m2525a)) {
            this.f2434o = false;
            throw new IllegalStateException("This app has been built with an incorrect configuration. Please configure your build for VectorDrawableCompat.");
        }
    }

    /* renamed from: c */
    private ColorStateList m2517c(Context context) {
        return m2518c(context, 0);
    }

    /* renamed from: c */
    private ColorStateList m2518c(Context context, int i) {
        int m2552b = C0469qa.m2552b(context, C0112a.colorControlHighlight);
        return new ColorStateList(new int[][]{C0469qa.f2478b, C0469qa.f2481e, C0469qa.f2479c, C0469qa.f2485i}, new int[]{C0469qa.m2549a(context, C0112a.colorButtonNormal), C0035a.m170a(m2552b, i), C0035a.m170a(m2552b, i), i});
    }

    /* renamed from: d */
    private ColorStateList m2519d(Context context) {
        return m2518c(context, C0469qa.m2552b(context, C0112a.colorAccent));
    }

    /* renamed from: d */
    private Drawable m2520d(Context context, int i) {
        if (this.f2433n == null) {
            this.f2433n = new TypedValue();
        }
        TypedValue typedValue = this.f2433n;
        context.getResources().getValue(i, typedValue, true);
        long m2500a = m2500a(typedValue);
        Drawable m2505a = m2505a(context, m2500a);
        if (m2505a != null) {
            return m2505a;
        }
        if (i == C0116e.abc_cab_background_top_material) {
            m2505a = new LayerDrawable(new Drawable[]{m2525a(context, C0116e.abc_cab_background_internal_bg), m2525a(context, C0116e.abc_cab_background_top_mtrl_alpha)});
        }
        if (m2505a != null) {
            m2505a.setChangingConfigurations(typedValue.changingConfigurations);
            m2513a(context, m2500a, m2505a);
        }
        return m2505a;
    }

    /* renamed from: e */
    private ColorStateList m2521e(Context context) {
        return m2518c(context, C0469qa.m2552b(context, C0112a.colorButtonNormal));
    }

    /* renamed from: e */
    private ColorStateList m2522e(Context context, int i) {
        C0270p<ColorStateList> c0270p;
        WeakHashMap<Context, C0270p<ColorStateList>> weakHashMap = this.f2429j;
        if (weakHashMap == null || (c0270p = weakHashMap.get(context)) == null) {
            return null;
        }
        return c0270p.m1403b(i);
    }

    /* renamed from: f */
    private ColorStateList m2523f(Context context) {
        int[][] iArr = new int[3];
        int[] iArr2 = new int[3];
        ColorStateList m2553c = C0469qa.m2553c(context, C0112a.colorSwitchThumbNormal);
        if (m2553c == null || !m2553c.isStateful()) {
            iArr[0] = C0469qa.f2478b;
            iArr2[0] = C0469qa.m2549a(context, C0112a.colorSwitchThumbNormal);
            iArr[1] = C0469qa.f2482f;
            iArr2[1] = C0469qa.m2552b(context, C0112a.colorControlActivated);
            iArr[2] = C0469qa.f2485i;
            iArr2[2] = C0469qa.m2552b(context, C0112a.colorSwitchThumbNormal);
        } else {
            iArr[0] = C0469qa.f2478b;
            iArr2[0] = m2553c.getColorForState(iArr[0], 0);
            iArr[1] = C0469qa.f2482f;
            iArr2[1] = C0469qa.m2552b(context, C0112a.colorControlActivated);
            iArr[2] = C0469qa.f2485i;
            iArr2[2] = m2553c.getDefaultColor();
        }
        return new ColorStateList(iArr, iArr2);
    }

    /* renamed from: f */
    private Drawable m2524f(Context context, int i) {
        int next;
        C0256b<String, d> c0256b = this.f2430k;
        if (c0256b == null || c0256b.isEmpty()) {
            return null;
        }
        C0270p<String> c0270p = this.f2431l;
        if (c0270p != null) {
            String m1403b = c0270p.m1403b(i);
            if ("appcompat_skip_skip".equals(m1403b) || (m1403b != null && this.f2430k.get(m1403b) == null)) {
                return null;
            }
        } else {
            this.f2431l = new C0270p<>();
        }
        if (this.f2433n == null) {
            this.f2433n = new TypedValue();
        }
        TypedValue typedValue = this.f2433n;
        Resources resources = context.getResources();
        resources.getValue(i, typedValue, true);
        long m2500a = m2500a(typedValue);
        Drawable m2505a = m2505a(context, m2500a);
        if (m2505a != null) {
            return m2505a;
        }
        CharSequence charSequence = typedValue.string;
        if (charSequence != null && charSequence.toString().endsWith(".xml")) {
            try {
                XmlResourceParser xml = resources.getXml(i);
                AttributeSet asAttributeSet = Xml.asAttributeSet(xml);
                do {
                    next = xml.next();
                    if (next == 2) {
                        break;
                    }
                } while (next != 1);
                if (next != 2) {
                    throw new XmlPullParserException("No start tag found");
                }
                String name = xml.getName();
                this.f2431l.m1401a(i, name);
                d dVar = this.f2430k.get(name);
                if (dVar != null) {
                    m2505a = dVar.mo2530a(context, xml, asAttributeSet, context.getTheme());
                }
                if (m2505a != null) {
                    m2505a.setChangingConfigurations(typedValue.changingConfigurations);
                    m2513a(context, m2500a, m2505a);
                }
            } catch (Exception e2) {
                Log.e("AppCompatDrawableManag", "Exception while inflating drawable", e2);
            }
        }
        if (m2505a == null) {
            this.f2431l.m1401a(i, "appcompat_skip_skip");
        }
        return m2505a;
    }

    /* renamed from: a */
    public synchronized Drawable m2525a(Context context, int i) {
        return m2526a(context, i, false);
    }

    /* renamed from: a */
    public synchronized Drawable m2526a(Context context, int i, boolean z) {
        Drawable m2524f;
        m2516b(context);
        m2524f = m2524f(context, i);
        if (m2524f == null) {
            m2524f = m2520d(context, i);
        }
        if (m2524f == null) {
            m2524f = C0022a.m92c(context, i);
        }
        if (m2524f != null) {
            m2524f = m2504a(context, i, z, m2524f);
        }
        if (m2524f != null) {
            C0412M.m2264b(m2524f);
        }
        return m2524f;
    }

    /* renamed from: a */
    public synchronized Drawable m2527a(Context context, C0406Ia c0406Ia, int i) {
        Drawable m2524f = m2524f(context, i);
        if (m2524f == null) {
            m2524f = c0406Ia.m2231a(i);
        }
        if (m2524f == null) {
            return null;
        }
        return m2504a(context, i, false, m2524f);
    }

    /* renamed from: a */
    public synchronized void m2528a(Context context) {
        C0262h<WeakReference<Drawable.ConstantState>> c0262h = this.f2432m.get(context);
        if (c0262h != null) {
            c0262h.m1357a();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0078 A[Catch: all -> 0x007d, TRY_LEAVE, TryCatch #0 {, blocks: (B:3:0x0001, B:5:0x0007, B:7:0x000b, B:8:0x000d, B:10:0x0078, B:12:0x0013, B:14:0x0017, B:15:0x001a, B:17:0x001e, B:18:0x0023, B:20:0x0027, B:21:0x002c, B:23:0x0030, B:24:0x0035, B:26:0x0039, B:27:0x003e, B:29:0x0042, B:32:0x0047, B:34:0x004f, B:35:0x0056, B:37:0x005e, B:38:0x0061, B:40:0x0069, B:41:0x006c, B:43:0x0070, B:44:0x0073), top: B:2:0x0001 }] */
    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public synchronized android.content.res.ColorStateList m2529b(android.content.Context r3, int r4) {
        /*
            r2 = this;
            monitor-enter(r2)
            android.content.res.ColorStateList r0 = r2.m2522e(r3, r4)     // Catch: java.lang.Throwable -> L7d
            if (r0 != 0) goto L7b
            int r1 = p000a.p005b.p022d.p023a.C0116e.abc_edit_text_material     // Catch: java.lang.Throwable -> L7d
            if (r4 != r1) goto L13
            int r0 = p000a.p005b.p022d.p023a.C0114c.abc_tint_edittext     // Catch: java.lang.Throwable -> L7d
        Ld:
            android.content.res.ColorStateList r0 = p000a.p005b.p022d.p024b.p025a.C0122a.m547a(r3, r0)     // Catch: java.lang.Throwable -> L7d
            goto L76
        L13:
            int r1 = p000a.p005b.p022d.p023a.C0116e.abc_switch_track_mtrl_alpha     // Catch: java.lang.Throwable -> L7d
            if (r4 != r1) goto L1a
            int r0 = p000a.p005b.p022d.p023a.C0114c.abc_tint_switch_track     // Catch: java.lang.Throwable -> L7d
            goto Ld
        L1a:
            int r1 = p000a.p005b.p022d.p023a.C0116e.abc_switch_thumb_material     // Catch: java.lang.Throwable -> L7d
            if (r4 != r1) goto L23
            android.content.res.ColorStateList r0 = r2.m2523f(r3)     // Catch: java.lang.Throwable -> L7d
            goto L76
        L23:
            int r1 = p000a.p005b.p022d.p023a.C0116e.abc_btn_default_mtrl_shape     // Catch: java.lang.Throwable -> L7d
            if (r4 != r1) goto L2c
            android.content.res.ColorStateList r0 = r2.m2521e(r3)     // Catch: java.lang.Throwable -> L7d
            goto L76
        L2c:
            int r1 = p000a.p005b.p022d.p023a.C0116e.abc_btn_borderless_material     // Catch: java.lang.Throwable -> L7d
            if (r4 != r1) goto L35
            android.content.res.ColorStateList r0 = r2.m2517c(r3)     // Catch: java.lang.Throwable -> L7d
            goto L76
        L35:
            int r1 = p000a.p005b.p022d.p023a.C0116e.abc_btn_colored_material     // Catch: java.lang.Throwable -> L7d
            if (r4 != r1) goto L3e
            android.content.res.ColorStateList r0 = r2.m2519d(r3)     // Catch: java.lang.Throwable -> L7d
            goto L76
        L3e:
            int r1 = p000a.p005b.p022d.p023a.C0116e.abc_spinner_mtrl_am_alpha     // Catch: java.lang.Throwable -> L7d
            if (r4 == r1) goto L73
            int r1 = p000a.p005b.p022d.p023a.C0116e.abc_spinner_textfield_background_material     // Catch: java.lang.Throwable -> L7d
            if (r4 != r1) goto L47
            goto L73
        L47:
            int[] r1 = android.support.v7.widget.C0464o.f2424e     // Catch: java.lang.Throwable -> L7d
            boolean r1 = m2515a(r1, r4)     // Catch: java.lang.Throwable -> L7d
            if (r1 == 0) goto L56
            int r0 = p000a.p005b.p022d.p023a.C0112a.colorControlNormal     // Catch: java.lang.Throwable -> L7d
            android.content.res.ColorStateList r0 = android.support.v7.widget.C0469qa.m2553c(r3, r0)     // Catch: java.lang.Throwable -> L7d
            goto L76
        L56:
            int[] r1 = android.support.v7.widget.C0464o.f2427h     // Catch: java.lang.Throwable -> L7d
            boolean r1 = m2515a(r1, r4)     // Catch: java.lang.Throwable -> L7d
            if (r1 == 0) goto L61
            int r0 = p000a.p005b.p022d.p023a.C0114c.abc_tint_default     // Catch: java.lang.Throwable -> L7d
            goto Ld
        L61:
            int[] r1 = android.support.v7.widget.C0464o.f2428i     // Catch: java.lang.Throwable -> L7d
            boolean r1 = m2515a(r1, r4)     // Catch: java.lang.Throwable -> L7d
            if (r1 == 0) goto L6c
            int r0 = p000a.p005b.p022d.p023a.C0114c.abc_tint_btn_checkable     // Catch: java.lang.Throwable -> L7d
            goto Ld
        L6c:
            int r1 = p000a.p005b.p022d.p023a.C0116e.abc_seekbar_thumb_material     // Catch: java.lang.Throwable -> L7d
            if (r4 != r1) goto L76
            int r0 = p000a.p005b.p022d.p023a.C0114c.abc_tint_seek_thumb     // Catch: java.lang.Throwable -> L7d
            goto Ld
        L73:
            int r0 = p000a.p005b.p022d.p023a.C0114c.abc_tint_spinner     // Catch: java.lang.Throwable -> L7d
            goto Ld
        L76:
            if (r0 == 0) goto L7b
            r2.m2507a(r3, r4, r0)     // Catch: java.lang.Throwable -> L7d
        L7b:
            monitor-exit(r2)
            return r0
        L7d:
            r3 = move-exception
            monitor-exit(r2)
            throw r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v7.widget.C0464o.m2529b(android.content.Context, int):android.content.res.ColorStateList");
    }
}
