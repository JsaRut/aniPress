package p000a.p005b.p009c.p019h.p020a;

import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import p000a.p005b.p022d.p023a.C0121j;

/* renamed from: a.b.c.h.a.a */
/* loaded from: classes.dex */
public class C0080a {

    /* renamed from: a */
    private final AccessibilityNodeInfo f333a;

    /* renamed from: b */
    public int f334b = -1;

    /* renamed from: a.b.c.h.a.a$a */
    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: A */
        public static final a f335A;

        /* renamed from: B */
        public static final a f336B;

        /* renamed from: C */
        public static final a f337C;

        /* renamed from: D */
        public static final a f338D;

        /* renamed from: E */
        public static final a f339E;

        /* renamed from: F */
        public static final a f340F;

        /* renamed from: G */
        public static final a f341G;

        /* renamed from: a */
        public static final a f342a = new a(1, null);

        /* renamed from: b */
        public static final a f343b = new a(2, null);

        /* renamed from: c */
        public static final a f344c = new a(4, null);

        /* renamed from: d */
        public static final a f345d = new a(8, null);

        /* renamed from: e */
        public static final a f346e = new a(16, null);

        /* renamed from: f */
        public static final a f347f = new a(32, null);

        /* renamed from: g */
        public static final a f348g = new a(64, null);

        /* renamed from: h */
        public static final a f349h = new a(128, null);

        /* renamed from: i */
        public static final a f350i = new a(256, null);

        /* renamed from: j */
        public static final a f351j = new a(512, null);

        /* renamed from: k */
        public static final a f352k = new a(1024, null);

        /* renamed from: l */
        public static final a f353l = new a(2048, null);

        /* renamed from: m */
        public static final a f354m = new a(4096, null);

        /* renamed from: n */
        public static final a f355n = new a(8192, null);

        /* renamed from: o */
        public static final a f356o = new a(16384, null);

        /* renamed from: p */
        public static final a f357p = new a(32768, null);

        /* renamed from: q */
        public static final a f358q = new a(65536, null);

        /* renamed from: r */
        public static final a f359r = new a(131072, null);

        /* renamed from: s */
        public static final a f360s = new a(262144, null);

        /* renamed from: t */
        public static final a f361t = new a(524288, null);

        /* renamed from: u */
        public static final a f362u = new a(1048576, null);

        /* renamed from: v */
        public static final a f363v = new a(2097152, null);

        /* renamed from: w */
        public static final a f364w;

        /* renamed from: x */
        public static final a f365x;

        /* renamed from: y */
        public static final a f366y;

        /* renamed from: z */
        public static final a f367z;

        /* renamed from: H */
        final Object f368H;

        static {
            f364w = new a(Build.VERSION.SDK_INT >= 23 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_ON_SCREEN : null);
            f365x = new a(Build.VERSION.SDK_INT >= 23 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_TO_POSITION : null);
            f366y = new a(Build.VERSION.SDK_INT >= 23 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_UP : null);
            f367z = new a(Build.VERSION.SDK_INT >= 23 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_LEFT : null);
            f335A = new a(Build.VERSION.SDK_INT >= 23 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_DOWN : null);
            f336B = new a(Build.VERSION.SDK_INT >= 23 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_RIGHT : null);
            f337C = new a(Build.VERSION.SDK_INT >= 23 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_CONTEXT_CLICK : null);
            f338D = new a(Build.VERSION.SDK_INT >= 24 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SET_PROGRESS : null);
            f339E = new a(Build.VERSION.SDK_INT >= 26 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_MOVE_WINDOW : null);
            f340F = new a(Build.VERSION.SDK_INT >= 28 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_TOOLTIP : null);
            f341G = new a(Build.VERSION.SDK_INT >= 28 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_HIDE_TOOLTIP : null);
        }

        public a(int i, CharSequence charSequence) {
            this(Build.VERSION.SDK_INT >= 21 ? new AccessibilityNodeInfo.AccessibilityAction(i, charSequence) : null);
        }

        a(Object obj) {
            this.f368H = obj;
        }
    }

    /* renamed from: a.b.c.h.a.a$b */
    /* loaded from: classes.dex */
    public static class b {

        /* renamed from: a */
        final Object f369a;

        b(Object obj) {
            this.f369a = obj;
        }

        /* renamed from: a */
        public static b m407a(int i, int i2, int i3, int i4, boolean z) {
            return Build.VERSION.SDK_INT >= 19 ? new b(AccessibilityNodeInfo.CollectionItemInfo.obtain(i, i2, i3, i4, z)) : new b(null);
        }
    }

    private C0080a(AccessibilityNodeInfo accessibilityNodeInfo) {
        this.f333a = accessibilityNodeInfo;
    }

    /* renamed from: a */
    public static C0080a m360a(C0080a c0080a) {
        return m361a(AccessibilityNodeInfo.obtain(c0080a.f333a));
    }

    /* renamed from: a */
    public static C0080a m361a(AccessibilityNodeInfo accessibilityNodeInfo) {
        return new C0080a(accessibilityNodeInfo);
    }

    /* renamed from: b */
    private static String m362b(int i) {
        if (i == 1) {
            return "ACTION_FOCUS";
        }
        if (i == 2) {
            return "ACTION_CLEAR_FOCUS";
        }
        switch (i) {
            case 4:
                return "ACTION_SELECT";
            case 8:
                return "ACTION_CLEAR_SELECTION";
            case 16:
                return "ACTION_CLICK";
            case C0121j.AppCompatTheme_activityChooserViewStyle /* 32 */:
                return "ACTION_LONG_CLICK";
            case C0121j.AppCompatTheme_dropDownListViewStyle /* 64 */:
                return "ACTION_ACCESSIBILITY_FOCUS";
            case 128:
                return "ACTION_CLEAR_ACCESSIBILITY_FOCUS";
            case 256:
                return "ACTION_NEXT_AT_MOVEMENT_GRANULARITY";
            case 512:
                return "ACTION_PREVIOUS_AT_MOVEMENT_GRANULARITY";
            case 1024:
                return "ACTION_NEXT_HTML_ELEMENT";
            case 2048:
                return "ACTION_PREVIOUS_HTML_ELEMENT";
            case 4096:
                return "ACTION_SCROLL_FORWARD";
            case 8192:
                return "ACTION_SCROLL_BACKWARD";
            case 16384:
                return "ACTION_COPY";
            case 32768:
                return "ACTION_PASTE";
            case 65536:
                return "ACTION_CUT";
            case 131072:
                return "ACTION_SET_SELECTION";
            default:
                return "ACTION_UNKNOWN";
        }
    }

    /* renamed from: a */
    public int m363a() {
        return this.f333a.getActions();
    }

    /* renamed from: a */
    public void m364a(int i) {
        this.f333a.addAction(i);
    }

    /* renamed from: a */
    public void m365a(Rect rect) {
        this.f333a.getBoundsInParent(rect);
    }

    /* renamed from: a */
    public void m366a(View view) {
        this.f333a.addChild(view);
    }

    /* renamed from: a */
    public void m367a(CharSequence charSequence) {
        this.f333a.setClassName(charSequence);
    }

    /* renamed from: a */
    public void m368a(Object obj) {
        if (Build.VERSION.SDK_INT >= 19) {
            this.f333a.setCollectionItemInfo(obj == null ? null : (AccessibilityNodeInfo.CollectionItemInfo) ((b) obj).f369a);
        }
    }

    /* renamed from: a */
    public void m369a(boolean z) {
        if (Build.VERSION.SDK_INT >= 16) {
            this.f333a.setAccessibilityFocused(z);
        }
    }

    /* renamed from: a */
    public boolean m370a(a aVar) {
        if (Build.VERSION.SDK_INT >= 21) {
            return this.f333a.removeAction((AccessibilityNodeInfo.AccessibilityAction) aVar.f368H);
        }
        return false;
    }

    /* renamed from: b */
    public CharSequence m371b() {
        return this.f333a.getClassName();
    }

    /* renamed from: b */
    public void m372b(Rect rect) {
        this.f333a.getBoundsInScreen(rect);
    }

    /* renamed from: b */
    public void m373b(View view) {
        this.f333a.setParent(view);
    }

    /* renamed from: b */
    public void m374b(CharSequence charSequence) {
        this.f333a.setContentDescription(charSequence);
    }

    /* renamed from: b */
    public void m375b(boolean z) {
        this.f333a.setClickable(z);
    }

    /* renamed from: c */
    public CharSequence m376c() {
        return this.f333a.getContentDescription();
    }

    /* renamed from: c */
    public void m377c(Rect rect) {
        this.f333a.setBoundsInParent(rect);
    }

    /* renamed from: c */
    public void m378c(View view) {
        this.f333a.setSource(view);
    }

    /* renamed from: c */
    public void m379c(CharSequence charSequence) {
        this.f333a.setPackageName(charSequence);
    }

    /* renamed from: c */
    public void m380c(boolean z) {
        this.f333a.setEnabled(z);
    }

    /* renamed from: d */
    public CharSequence m381d() {
        return this.f333a.getPackageName();
    }

    /* renamed from: d */
    public void m382d(Rect rect) {
        this.f333a.setBoundsInScreen(rect);
    }

    /* renamed from: d */
    public void m383d(CharSequence charSequence) {
        if (Build.VERSION.SDK_INT >= 19) {
            this.f333a.getExtras().putCharSequence("AccessibilityNodeInfo.roleDescription", charSequence);
        }
    }

    /* renamed from: d */
    public void m384d(boolean z) {
        this.f333a.setFocusable(z);
    }

    /* renamed from: e */
    public CharSequence m385e() {
        return this.f333a.getText();
    }

    /* renamed from: e */
    public void m386e(CharSequence charSequence) {
        this.f333a.setText(charSequence);
    }

    /* renamed from: e */
    public void m387e(boolean z) {
        this.f333a.setFocused(z);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C0080a.class != obj.getClass()) {
            return false;
        }
        C0080a c0080a = (C0080a) obj;
        AccessibilityNodeInfo accessibilityNodeInfo = this.f333a;
        if (accessibilityNodeInfo == null) {
            if (c0080a.f333a != null) {
                return false;
            }
        } else if (!accessibilityNodeInfo.equals(c0080a.f333a)) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public String m388f() {
        if (Build.VERSION.SDK_INT >= 18) {
            return this.f333a.getViewIdResourceName();
        }
        return null;
    }

    /* renamed from: f */
    public void m389f(boolean z) {
        this.f333a.setLongClickable(z);
    }

    /* renamed from: g */
    public void m390g(boolean z) {
        this.f333a.setScrollable(z);
    }

    /* renamed from: g */
    public boolean m391g() {
        if (Build.VERSION.SDK_INT >= 16) {
            return this.f333a.isAccessibilityFocused();
        }
        return false;
    }

    /* renamed from: h */
    public void m392h(boolean z) {
        this.f333a.setSelected(z);
    }

    /* renamed from: h */
    public boolean m393h() {
        return this.f333a.isCheckable();
    }

    public int hashCode() {
        AccessibilityNodeInfo accessibilityNodeInfo = this.f333a;
        if (accessibilityNodeInfo == null) {
            return 0;
        }
        return accessibilityNodeInfo.hashCode();
    }

    /* renamed from: i */
    public void m394i(boolean z) {
        if (Build.VERSION.SDK_INT >= 16) {
            this.f333a.setVisibleToUser(z);
        }
    }

    /* renamed from: i */
    public boolean m395i() {
        return this.f333a.isChecked();
    }

    /* renamed from: j */
    public boolean m396j() {
        return this.f333a.isClickable();
    }

    /* renamed from: k */
    public boolean m397k() {
        return this.f333a.isEnabled();
    }

    /* renamed from: l */
    public boolean m398l() {
        return this.f333a.isFocusable();
    }

    /* renamed from: m */
    public boolean m399m() {
        return this.f333a.isFocused();
    }

    /* renamed from: n */
    public boolean m400n() {
        return this.f333a.isLongClickable();
    }

    /* renamed from: o */
    public boolean m401o() {
        return this.f333a.isPassword();
    }

    /* renamed from: p */
    public boolean m402p() {
        return this.f333a.isScrollable();
    }

    /* renamed from: q */
    public boolean m403q() {
        return this.f333a.isSelected();
    }

    /* renamed from: r */
    public boolean m404r() {
        if (Build.VERSION.SDK_INT >= 16) {
            return this.f333a.isVisibleToUser();
        }
        return false;
    }

    /* renamed from: s */
    public void m405s() {
        this.f333a.recycle();
    }

    /* renamed from: t */
    public AccessibilityNodeInfo m406t() {
        return this.f333a;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        Rect rect = new Rect();
        m365a(rect);
        sb.append("; boundsInParent: " + rect);
        m372b(rect);
        sb.append("; boundsInScreen: " + rect);
        sb.append("; packageName: ");
        sb.append(m381d());
        sb.append("; className: ");
        sb.append(m371b());
        sb.append("; text: ");
        sb.append(m385e());
        sb.append("; contentDescription: ");
        sb.append(m376c());
        sb.append("; viewId: ");
        sb.append(m388f());
        sb.append("; checkable: ");
        sb.append(m393h());
        sb.append("; checked: ");
        sb.append(m395i());
        sb.append("; focusable: ");
        sb.append(m398l());
        sb.append("; focused: ");
        sb.append(m399m());
        sb.append("; selected: ");
        sb.append(m403q());
        sb.append("; clickable: ");
        sb.append(m396j());
        sb.append("; longClickable: ");
        sb.append(m400n());
        sb.append("; enabled: ");
        sb.append(m397k());
        sb.append("; password: ");
        sb.append(m401o());
        sb.append("; scrollable: " + m402p());
        sb.append("; [");
        int m363a = m363a();
        while (m363a != 0) {
            int numberOfTrailingZeros = 1 << Integer.numberOfTrailingZeros(m363a);
            m363a &= numberOfTrailingZeros ^ (-1);
            sb.append(m362b(numberOfTrailingZeros));
            if (m363a != 0) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }
}
