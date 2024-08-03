package android.support.v4.widget;

import android.R;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.support.v4.graphics.drawable.C0220a;
import android.support.v4.widget.C0279I;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.view.accessibility.AccessibilityEvent;
import java.util.ArrayList;
import java.util.List;
import p000a.p005b.p009c.p010a.C0022a;
import p000a.p005b.p009c.p019h.AbstractC0088c;
import p000a.p005b.p009c.p019h.C0089d;
import p000a.p005b.p009c.p019h.C0091f;
import p000a.p005b.p009c.p019h.C0107v;
import p000a.p005b.p009c.p019h.p020a.C0080a;
import p000a.p005b.p022d.p023a.C0121j;

/* renamed from: android.support.v4.widget.k */
/* loaded from: classes.dex */
public class C0293k extends ViewGroup {

    /* renamed from: a */
    private static final int[] f1307a = {R.attr.colorPrimaryDark};

    /* renamed from: b */
    static final int[] f1308b = {R.attr.layout_gravity};

    /* renamed from: c */
    static final boolean f1309c;

    /* renamed from: d */
    private static final boolean f1310d;

    /* renamed from: A */
    private float f1311A;

    /* renamed from: B */
    private Drawable f1312B;

    /* renamed from: C */
    private Drawable f1313C;

    /* renamed from: D */
    private Drawable f1314D;

    /* renamed from: E */
    private CharSequence f1315E;

    /* renamed from: F */
    private CharSequence f1316F;

    /* renamed from: G */
    private Object f1317G;

    /* renamed from: H */
    private boolean f1318H;

    /* renamed from: I */
    private Drawable f1319I;

    /* renamed from: J */
    private Drawable f1320J;

    /* renamed from: K */
    private Drawable f1321K;

    /* renamed from: L */
    private Drawable f1322L;

    /* renamed from: M */
    private final ArrayList<View> f1323M;

    /* renamed from: N */
    private Rect f1324N;

    /* renamed from: O */
    private Matrix f1325O;

    /* renamed from: e */
    private final b f1326e;

    /* renamed from: f */
    private float f1327f;

    /* renamed from: g */
    private int f1328g;

    /* renamed from: h */
    private int f1329h;

    /* renamed from: i */
    private float f1330i;

    /* renamed from: j */
    private Paint f1331j;

    /* renamed from: k */
    private final C0279I f1332k;

    /* renamed from: l */
    private final C0279I f1333l;

    /* renamed from: m */
    private final f f1334m;

    /* renamed from: n */
    private final f f1335n;

    /* renamed from: o */
    private int f1336o;

    /* renamed from: p */
    private boolean f1337p;

    /* renamed from: q */
    private boolean f1338q;

    /* renamed from: r */
    private int f1339r;

    /* renamed from: s */
    private int f1340s;

    /* renamed from: t */
    private int f1341t;

    /* renamed from: u */
    private int f1342u;

    /* renamed from: v */
    private boolean f1343v;

    /* renamed from: w */
    private boolean f1344w;

    /* renamed from: x */
    private c f1345x;

    /* renamed from: y */
    private List<c> f1346y;

    /* renamed from: z */
    private float f1347z;

    /* renamed from: android.support.v4.widget.k$a */
    /* loaded from: classes.dex */
    class a extends C0089d {

        /* renamed from: c */
        private final Rect f1348c = new Rect();

        a() {
        }

        /* renamed from: a */
        private void m1675a(C0080a c0080a, C0080a c0080a2) {
            Rect rect = this.f1348c;
            c0080a2.m365a(rect);
            c0080a.m377c(rect);
            c0080a2.m372b(rect);
            c0080a.m382d(rect);
            c0080a.m394i(c0080a2.m404r());
            c0080a.m379c(c0080a2.m381d());
            c0080a.m367a(c0080a2.m371b());
            c0080a.m374b(c0080a2.m376c());
            c0080a.m380c(c0080a2.m397k());
            c0080a.m375b(c0080a2.m396j());
            c0080a.m384d(c0080a2.m398l());
            c0080a.m387e(c0080a2.m399m());
            c0080a.m369a(c0080a2.m391g());
            c0080a.m392h(c0080a2.m403q());
            c0080a.m389f(c0080a2.m400n());
            c0080a.m364a(c0080a2.m363a());
        }

        /* renamed from: a */
        private void m1676a(C0080a c0080a, ViewGroup viewGroup) {
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = viewGroup.getChildAt(i);
                if (C0293k.m1637g(childAt)) {
                    c0080a.m366a(childAt);
                }
            }
        }

        @Override // p000a.p005b.p009c.p019h.C0089d
        /* renamed from: a */
        public void mo321a(View view, C0080a c0080a) {
            if (C0293k.f1309c) {
                super.mo321a(view, c0080a);
            } else {
                C0080a m360a = C0080a.m360a(c0080a);
                super.mo321a(view, m360a);
                c0080a.m378c(view);
                Object m523k = C0107v.m523k(view);
                if (m523k instanceof View) {
                    c0080a.m373b((View) m523k);
                }
                m1675a(c0080a, m360a);
                m360a.m405s();
                m1676a(c0080a, (ViewGroup) view);
            }
            c0080a.m367a((CharSequence) C0293k.class.getName());
            c0080a.m384d(false);
            c0080a.m387e(false);
            c0080a.m370a(C0080a.a.f342a);
            c0080a.m370a(C0080a.a.f343b);
        }

        @Override // p000a.p005b.p009c.p019h.C0089d
        /* renamed from: a */
        public boolean mo415a(View view, AccessibilityEvent accessibilityEvent) {
            if (accessibilityEvent.getEventType() != 32) {
                return super.mo415a(view, accessibilityEvent);
            }
            List<CharSequence> text = accessibilityEvent.getText();
            View m1665d = C0293k.this.m1665d();
            if (m1665d == null) {
                return true;
            }
            CharSequence m1666d = C0293k.this.m1666d(C0293k.this.m1667e(m1665d));
            if (m1666d == null) {
                return true;
            }
            text.add(m1666d);
            return true;
        }

        @Override // p000a.p005b.p009c.p019h.C0089d
        /* renamed from: a */
        public boolean mo416a(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
            if (C0293k.f1309c || C0293k.m1637g(view)) {
                return super.mo416a(viewGroup, view, accessibilityEvent);
            }
            return false;
        }

        @Override // p000a.p005b.p009c.p019h.C0089d
        /* renamed from: b */
        public void mo323b(View view, AccessibilityEvent accessibilityEvent) {
            super.mo323b(view, accessibilityEvent);
            accessibilityEvent.setClassName(C0293k.class.getName());
        }
    }

    /* renamed from: android.support.v4.widget.k$b */
    /* loaded from: classes.dex */
    static final class b extends C0089d {
        b() {
        }

        @Override // p000a.p005b.p009c.p019h.C0089d
        /* renamed from: a */
        public void mo321a(View view, C0080a c0080a) {
            super.mo321a(view, c0080a);
            if (C0293k.m1637g(view)) {
                return;
            }
            c0080a.m373b((View) null);
        }
    }

    /* renamed from: android.support.v4.widget.k$c */
    /* loaded from: classes.dex */
    public interface c {
        /* renamed from: a */
        void mo1677a(int i);

        /* renamed from: a */
        void mo1678a(View view);

        /* renamed from: a */
        void mo1679a(View view, float f);

        /* renamed from: b */
        void mo1680b(View view);
    }

    /* renamed from: android.support.v4.widget.k$d */
    /* loaded from: classes.dex */
    public static class d extends ViewGroup.MarginLayoutParams {

        /* renamed from: a */
        public int f1350a;

        /* renamed from: b */
        float f1351b;

        /* renamed from: c */
        boolean f1352c;

        /* renamed from: d */
        int f1353d;

        public d(int i, int i2) {
            super(i, i2);
            this.f1350a = 0;
        }

        public d(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f1350a = 0;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0293k.f1308b);
            this.f1350a = obtainStyledAttributes.getInt(0, 0);
            obtainStyledAttributes.recycle();
        }

        public d(d dVar) {
            super((ViewGroup.MarginLayoutParams) dVar);
            this.f1350a = 0;
            this.f1350a = dVar.f1350a;
        }

        public d(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f1350a = 0;
        }

        public d(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.f1350a = 0;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: android.support.v4.widget.k$e */
    /* loaded from: classes.dex */
    public static class e extends AbstractC0088c {
        public static final Parcelable.Creator<e> CREATOR = new C0294l();

        /* renamed from: a */
        int f1354a;

        /* renamed from: b */
        int f1355b;

        /* renamed from: c */
        int f1356c;

        /* renamed from: d */
        int f1357d;

        /* renamed from: e */
        int f1358e;

        public e(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f1354a = 0;
            this.f1354a = parcel.readInt();
            this.f1355b = parcel.readInt();
            this.f1356c = parcel.readInt();
            this.f1357d = parcel.readInt();
            this.f1358e = parcel.readInt();
        }

        public e(Parcelable parcelable) {
            super(parcelable);
            this.f1354a = 0;
        }

        @Override // p000a.p005b.p009c.p019h.AbstractC0088c, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.f1354a);
            parcel.writeInt(this.f1355b);
            parcel.writeInt(this.f1356c);
            parcel.writeInt(this.f1357d);
            parcel.writeInt(this.f1358e);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: android.support.v4.widget.k$f */
    /* loaded from: classes.dex */
    public class f extends C0279I.a {

        /* renamed from: a */
        private final int f1359a;

        /* renamed from: b */
        private C0279I f1360b;

        /* renamed from: c */
        private final Runnable f1361c = new RunnableC0295m(this);

        f(int i) {
            this.f1359a = i;
        }

        /* renamed from: c */
        private void m1681c() {
            View m1653b = C0293k.this.m1653b(this.f1359a == 3 ? 5 : 3);
            if (m1653b != null) {
                C0293k.this.m1647a(m1653b);
            }
        }

        @Override // android.support.v4.widget.C0279I.a
        /* renamed from: a */
        public int mo1491a(View view) {
            if (C0293k.this.m1672j(view)) {
                return view.getWidth();
            }
            return 0;
        }

        @Override // android.support.v4.widget.C0279I.a
        /* renamed from: a */
        public int mo1492a(View view, int i, int i2) {
            int width;
            int width2;
            if (C0293k.this.m1652a(view, 3)) {
                width2 = -view.getWidth();
                width = 0;
            } else {
                width = C0293k.this.getWidth();
                width2 = width - view.getWidth();
            }
            return Math.max(width2, Math.min(i, width));
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: a */
        public void m1682a() {
            View m1653b;
            int width;
            int m1483c = this.f1360b.m1483c();
            boolean z = this.f1359a == 3;
            if (z) {
                m1653b = C0293k.this.m1653b(3);
                width = (m1653b != null ? -m1653b.getWidth() : 0) + m1483c;
            } else {
                m1653b = C0293k.this.m1653b(5);
                width = C0293k.this.getWidth() - m1483c;
            }
            if (m1653b != null) {
                if (((!z || m1653b.getLeft() >= width) && (z || m1653b.getLeft() <= width)) || C0293k.this.m1664d(m1653b) != 0) {
                    return;
                }
                d dVar = (d) m1653b.getLayoutParams();
                this.f1360b.m1482b(m1653b, width, m1653b.getTop());
                dVar.f1352c = true;
                C0293k.this.invalidate();
                m1681c();
                C0293k.this.m1641a();
            }
        }

        @Override // android.support.v4.widget.C0279I.a
        /* renamed from: a */
        public void mo1493a(int i, int i2) {
            C0293k c0293k;
            int i3;
            if ((i & 1) == 1) {
                c0293k = C0293k.this;
                i3 = 3;
            } else {
                c0293k = C0293k.this;
                i3 = 5;
            }
            View m1653b = c0293k.m1653b(i3);
            if (m1653b == null || C0293k.this.m1664d(m1653b) != 0) {
                return;
            }
            this.f1360b.m1472a(m1653b, i2);
        }

        /* renamed from: a */
        public void m1683a(C0279I c0279i) {
            this.f1360b = c0279i;
        }

        @Override // android.support.v4.widget.C0279I.a
        /* renamed from: a */
        public void mo1494a(View view, float f, float f2) {
            int i;
            float m1668f = C0293k.this.m1668f(view);
            int width = view.getWidth();
            if (C0293k.this.m1652a(view, 3)) {
                i = (f > 0.0f || (f == 0.0f && m1668f > 0.5f)) ? 0 : -width;
            } else {
                int width2 = C0293k.this.getWidth();
                if (f < 0.0f || (f == 0.0f && m1668f > 0.5f)) {
                    width2 -= width;
                }
                i = width2;
            }
            this.f1360b.m1488d(i, view.getTop());
            C0293k.this.invalidate();
        }

        @Override // android.support.v4.widget.C0279I.a
        /* renamed from: a */
        public void mo1495a(View view, int i) {
            ((d) view.getLayoutParams()).f1352c = false;
            m1681c();
        }

        @Override // android.support.v4.widget.C0279I.a
        /* renamed from: a */
        public void mo1496a(View view, int i, int i2, int i3, int i4) {
            float width = (C0293k.this.m1652a(view, 3) ? i + r3 : C0293k.this.getWidth() - i) / view.getWidth();
            C0293k.this.m1663c(view, width);
            view.setVisibility(width == 0.0f ? 4 : 0);
            C0293k.this.invalidate();
        }

        @Override // android.support.v4.widget.C0279I.a
        /* renamed from: b */
        public int mo1498b(View view, int i, int i2) {
            return view.getTop();
        }

        /* renamed from: b */
        public void m1684b() {
            C0293k.this.removeCallbacks(this.f1361c);
        }

        @Override // android.support.v4.widget.C0279I.a
        /* renamed from: b */
        public void mo1499b(int i, int i2) {
            C0293k.this.postDelayed(this.f1361c, 160L);
        }

        @Override // android.support.v4.widget.C0279I.a
        /* renamed from: b */
        public boolean mo1500b(int i) {
            return false;
        }

        @Override // android.support.v4.widget.C0279I.a
        /* renamed from: b */
        public boolean mo1501b(View view, int i) {
            return C0293k.this.m1672j(view) && C0293k.this.m1652a(view, this.f1359a) && C0293k.this.m1664d(view) == 0;
        }

        @Override // android.support.v4.widget.C0279I.a
        /* renamed from: c */
        public void mo1502c(int i) {
            C0293k.this.m1644a(this.f1359a, i, this.f1360b.m1477b());
        }
    }

    static {
        f1309c = Build.VERSION.SDK_INT >= 19;
        f1310d = Build.VERSION.SDK_INT >= 21;
    }

    public C0293k(Context context) {
        this(context, null);
    }

    public C0293k(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public C0293k(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f1326e = new b();
        this.f1329h = -1728053248;
        this.f1331j = new Paint();
        this.f1338q = true;
        this.f1339r = 3;
        this.f1340s = 3;
        this.f1341t = 3;
        this.f1342u = 3;
        this.f1319I = null;
        this.f1320J = null;
        this.f1321K = null;
        this.f1322L = null;
        setDescendantFocusability(262144);
        float f2 = getResources().getDisplayMetrics().density;
        this.f1328g = (int) ((64.0f * f2) + 0.5f);
        float f3 = 400.0f * f2;
        this.f1334m = new f(3);
        this.f1335n = new f(5);
        this.f1332k = C0279I.m1451a(this, 1.0f, this.f1334m);
        this.f1332k.m1487d(1);
        this.f1332k.m1470a(f3);
        this.f1334m.m1683a(this.f1332k);
        this.f1333l = C0279I.m1451a(this, 1.0f, this.f1335n);
        this.f1333l.m1487d(2);
        this.f1333l.m1470a(f3);
        this.f1335n.m1683a(this.f1333l);
        setFocusableInTouchMode(true);
        C0107v.m513d(this, 1);
        C0107v.m496a(this, new a());
        setMotionEventSplittingEnabled(false);
        if (C0107v.m515e(this)) {
            if (Build.VERSION.SDK_INT >= 21) {
                setOnApplyWindowInsetsListener(new ViewOnApplyWindowInsetsListenerC0292j(this));
                setSystemUiVisibility(1280);
                TypedArray obtainStyledAttributes = context.obtainStyledAttributes(f1307a);
                try {
                    this.f1312B = obtainStyledAttributes.getDrawable(0);
                } finally {
                    obtainStyledAttributes.recycle();
                }
            } else {
                this.f1312B = null;
            }
        }
        this.f1327f = f2 * 10.0f;
        this.f1323M = new ArrayList<>();
    }

    /* renamed from: a */
    private boolean m1628a(float f2, float f3, View view) {
        if (this.f1324N == null) {
            this.f1324N = new Rect();
        }
        view.getHitRect(this.f1324N);
        return this.f1324N.contains((int) f2, (int) f3);
    }

    /* renamed from: a */
    private boolean m1629a(Drawable drawable, int i) {
        if (drawable == null || !C0220a.m1206e(drawable)) {
            return false;
        }
        C0220a.m1201a(drawable, i);
        return true;
    }

    /* renamed from: a */
    private boolean m1630a(MotionEvent motionEvent, View view) {
        if (!view.getMatrix().isIdentity()) {
            MotionEvent m1631b = m1631b(motionEvent, view);
            boolean dispatchGenericMotionEvent = view.dispatchGenericMotionEvent(m1631b);
            m1631b.recycle();
            return dispatchGenericMotionEvent;
        }
        float scrollX = getScrollX() - view.getLeft();
        float scrollY = getScrollY() - view.getTop();
        motionEvent.offsetLocation(scrollX, scrollY);
        boolean dispatchGenericMotionEvent2 = view.dispatchGenericMotionEvent(motionEvent);
        motionEvent.offsetLocation(-scrollX, -scrollY);
        return dispatchGenericMotionEvent2;
    }

    /* renamed from: b */
    private MotionEvent m1631b(MotionEvent motionEvent, View view) {
        float scrollX = getScrollX() - view.getLeft();
        float scrollY = getScrollY() - view.getTop();
        MotionEvent obtain = MotionEvent.obtain(motionEvent);
        obtain.offsetLocation(scrollX, scrollY);
        Matrix matrix = view.getMatrix();
        if (!matrix.isIdentity()) {
            if (this.f1325O == null) {
                this.f1325O = new Matrix();
            }
            matrix.invert(this.f1325O);
            obtain.transform(this.f1325O);
        }
        return obtain;
    }

    /* renamed from: c */
    private void m1632c(View view, boolean z) {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            C0107v.m513d(childAt, ((z || m1672j(childAt)) && !(z && childAt == view)) ? 4 : 1);
        }
    }

    /* renamed from: e */
    static String m1633e(int i) {
        return (i & 3) == 3 ? "LEFT" : (i & 5) == 5 ? "RIGHT" : Integer.toHexString(i);
    }

    /* renamed from: e */
    private boolean m1634e() {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            if (((d) getChildAt(i).getLayoutParams()).f1352c) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: f */
    private boolean m1635f() {
        return m1665d() != null;
    }

    /* renamed from: g */
    private Drawable m1636g() {
        int m518g = C0107v.m518g(this);
        if (m518g == 0) {
            Drawable drawable = this.f1319I;
            if (drawable != null) {
                m1629a(drawable, m518g);
                return this.f1319I;
            }
        } else {
            Drawable drawable2 = this.f1320J;
            if (drawable2 != null) {
                m1629a(drawable2, m518g);
                return this.f1320J;
            }
        }
        return this.f1321K;
    }

    /* renamed from: g */
    static boolean m1637g(View view) {
        return (C0107v.m516f(view) == 4 || C0107v.m516f(view) == 2) ? false : true;
    }

    /* renamed from: h */
    private Drawable m1638h() {
        int m518g = C0107v.m518g(this);
        if (m518g == 0) {
            Drawable drawable = this.f1320J;
            if (drawable != null) {
                m1629a(drawable, m518g);
                return this.f1320J;
            }
        } else {
            Drawable drawable2 = this.f1319I;
            if (drawable2 != null) {
                m1629a(drawable2, m518g);
                return this.f1319I;
            }
        }
        return this.f1322L;
    }

    /* renamed from: i */
    private void m1639i() {
        if (f1310d) {
            return;
        }
        this.f1313C = m1636g();
        this.f1314D = m1638h();
    }

    /* renamed from: m */
    private static boolean m1640m(View view) {
        Drawable background = view.getBackground();
        return background != null && background.getOpacity() == -1;
    }

    /* renamed from: a */
    void m1641a() {
        if (this.f1344w) {
            return;
        }
        long uptimeMillis = SystemClock.uptimeMillis();
        MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            getChildAt(i).dispatchTouchEvent(obtain);
        }
        obtain.recycle();
        this.f1344w = true;
    }

    /* renamed from: a */
    public void m1642a(int i) {
        m1645a(i, true);
    }

    /* renamed from: a */
    public void m1643a(int i, int i2) {
        View m1653b;
        int m429a = C0091f.m429a(i2, C0107v.m518g(this));
        if (i2 == 3) {
            this.f1339r = i;
        } else if (i2 == 5) {
            this.f1340s = i;
        } else if (i2 == 8388611) {
            this.f1341t = i;
        } else if (i2 == 8388613) {
            this.f1342u = i;
        }
        if (i != 0) {
            (m429a == 3 ? this.f1332k : this.f1333l).m1469a();
        }
        if (i != 1) {
            if (i == 2 && (m1653b = m1653b(m429a)) != null) {
                m1674l(m1653b);
                return;
            }
            return;
        }
        View m1653b2 = m1653b(m429a);
        if (m1653b2 != null) {
            m1647a(m1653b2);
        }
    }

    /* renamed from: a */
    void m1644a(int i, int i2, View view) {
        int m1489e = this.f1332k.m1489e();
        int m1489e2 = this.f1333l.m1489e();
        int i3 = 2;
        if (m1489e == 1 || m1489e2 == 1) {
            i3 = 1;
        } else if (m1489e != 2 && m1489e2 != 2) {
            i3 = 0;
        }
        if (view != null && i2 == 0) {
            float f2 = ((d) view.getLayoutParams()).f1351b;
            if (f2 == 0.0f) {
                m1657b(view);
            } else if (f2 == 1.0f) {
                m1662c(view);
            }
        }
        if (i3 != this.f1336o) {
            this.f1336o = i3;
            List<c> list = this.f1346y;
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    this.f1346y.get(size).mo1677a(i3);
                }
            }
        }
    }

    /* renamed from: a */
    public void m1645a(int i, boolean z) {
        View m1653b = m1653b(i);
        if (m1653b != null) {
            m1649a(m1653b, z);
            return;
        }
        throw new IllegalArgumentException("No drawer view found with gravity " + m1633e(i));
    }

    /* renamed from: a */
    public void m1646a(c cVar) {
        if (cVar == null) {
            return;
        }
        if (this.f1346y == null) {
            this.f1346y = new ArrayList();
        }
        this.f1346y.add(cVar);
    }

    /* renamed from: a */
    public void m1647a(View view) {
        m1649a(view, true);
    }

    /* renamed from: a */
    void m1648a(View view, float f2) {
        List<c> list = this.f1346y;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                this.f1346y.get(size).mo1679a(view, f2);
            }
        }
    }

    /* renamed from: a */
    public void m1649a(View view, boolean z) {
        C0279I c0279i;
        int width;
        if (!m1672j(view)) {
            throw new IllegalArgumentException("View " + view + " is not a sliding drawer");
        }
        d dVar = (d) view.getLayoutParams();
        if (this.f1338q) {
            dVar.f1351b = 0.0f;
            dVar.f1353d = 0;
        } else if (z) {
            dVar.f1353d |= 4;
            if (m1652a(view, 3)) {
                c0279i = this.f1332k;
                width = -view.getWidth();
            } else {
                c0279i = this.f1333l;
                width = getWidth();
            }
            c0279i.m1482b(view, width, view.getTop());
        } else {
            m1658b(view, 0.0f);
            m1644a(dVar.f1350a, 0, view);
            view.setVisibility(4);
        }
        invalidate();
    }

    /* renamed from: a */
    public void m1650a(Object obj, boolean z) {
        this.f1317G = obj;
        this.f1318H = z;
        setWillNotDraw(!z && getBackground() == null);
        requestLayout();
    }

    /* renamed from: a */
    void m1651a(boolean z) {
        int childCount = getChildCount();
        boolean z2 = false;
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            d dVar = (d) childAt.getLayoutParams();
            if (m1672j(childAt) && (!z || dVar.f1352c)) {
                z2 |= m1652a(childAt, 3) ? this.f1332k.m1482b(childAt, -childAt.getWidth(), childAt.getTop()) : this.f1333l.m1482b(childAt, getWidth(), childAt.getTop());
                dVar.f1352c = false;
            }
        }
        this.f1334m.m1684b();
        this.f1335n.m1684b();
        if (z2) {
            invalidate();
        }
    }

    /* renamed from: a */
    boolean m1652a(View view, int i) {
        return (m1667e(view) & i) == i;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void addFocusables(ArrayList<View> arrayList, int i, int i2) {
        if (getDescendantFocusability() == 393216) {
            return;
        }
        int childCount = getChildCount();
        boolean z = false;
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = getChildAt(i3);
            if (!m1672j(childAt)) {
                this.f1323M.add(childAt);
            } else if (m1671i(childAt)) {
                childAt.addFocusables(arrayList, i, i2);
                z = true;
            }
        }
        if (!z) {
            int size = this.f1323M.size();
            for (int i4 = 0; i4 < size; i4++) {
                View view = this.f1323M.get(i4);
                if (view.getVisibility() == 0) {
                    view.addFocusables(arrayList, i, i2);
                }
            }
        }
        this.f1323M.clear();
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i, layoutParams);
        C0107v.m513d(view, (m1661c() != null || m1672j(view)) ? 4 : 1);
        if (f1309c) {
            return;
        }
        C0107v.m496a(view, this.f1326e);
    }

    /* renamed from: b */
    View m1653b(int i) {
        int m429a = C0091f.m429a(i, C0107v.m518g(this)) & 7;
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            if ((m1667e(childAt) & 7) == m429a) {
                return childAt;
            }
        }
        return null;
    }

    /* renamed from: b */
    public void m1654b() {
        m1651a(false);
    }

    /* renamed from: b */
    public void m1655b(int i, boolean z) {
        View m1653b = m1653b(i);
        if (m1653b != null) {
            m1659b(m1653b, z);
            return;
        }
        throw new IllegalArgumentException("No drawer view found with gravity " + m1633e(i));
    }

    /* renamed from: b */
    public void m1656b(c cVar) {
        List<c> list;
        if (cVar == null || (list = this.f1346y) == null) {
            return;
        }
        list.remove(cVar);
    }

    /* renamed from: b */
    void m1657b(View view) {
        View rootView;
        d dVar = (d) view.getLayoutParams();
        if ((dVar.f1353d & 1) == 1) {
            dVar.f1353d = 0;
            List<c> list = this.f1346y;
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    this.f1346y.get(size).mo1680b(view);
                }
            }
            m1632c(view, false);
            if (!hasWindowFocus() || (rootView = getRootView()) == null) {
                return;
            }
            rootView.sendAccessibilityEvent(32);
        }
    }

    /* renamed from: b */
    void m1658b(View view, float f2) {
        float m1668f = m1668f(view);
        float width = view.getWidth();
        int i = ((int) (width * f2)) - ((int) (m1668f * width));
        if (!m1652a(view, 3)) {
            i = -i;
        }
        view.offsetLeftAndRight(i);
        m1663c(view, f2);
    }

    /* renamed from: b */
    public void m1659b(View view, boolean z) {
        if (!m1672j(view)) {
            throw new IllegalArgumentException("View " + view + " is not a sliding drawer");
        }
        d dVar = (d) view.getLayoutParams();
        if (this.f1338q) {
            dVar.f1351b = 1.0f;
            dVar.f1353d = 1;
            m1632c(view, true);
        } else if (z) {
            dVar.f1353d |= 2;
            if (m1652a(view, 3)) {
                this.f1332k.m1482b(view, 0, view.getTop());
            } else {
                this.f1333l.m1482b(view, getWidth() - view.getWidth(), view.getTop());
            }
        } else {
            m1658b(view, 1.0f);
            m1644a(dVar.f1350a, 0, view);
            view.setVisibility(0);
        }
        invalidate();
    }

    /* renamed from: c */
    public int m1660c(int i) {
        int m518g = C0107v.m518g(this);
        if (i == 3) {
            int i2 = this.f1339r;
            if (i2 != 3) {
                return i2;
            }
            int i3 = m518g == 0 ? this.f1341t : this.f1342u;
            if (i3 != 3) {
                return i3;
            }
            return 0;
        }
        if (i == 5) {
            int i4 = this.f1340s;
            if (i4 != 3) {
                return i4;
            }
            int i5 = m518g == 0 ? this.f1342u : this.f1341t;
            if (i5 != 3) {
                return i5;
            }
            return 0;
        }
        if (i == 8388611) {
            int i6 = this.f1341t;
            if (i6 != 3) {
                return i6;
            }
            int i7 = m518g == 0 ? this.f1339r : this.f1340s;
            if (i7 != 3) {
                return i7;
            }
            return 0;
        }
        if (i != 8388613) {
            return 0;
        }
        int i8 = this.f1342u;
        if (i8 != 3) {
            return i8;
        }
        int i9 = m518g == 0 ? this.f1340s : this.f1339r;
        if (i9 != 3) {
            return i9;
        }
        return 0;
    }

    /* renamed from: c */
    View m1661c() {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if ((((d) childAt.getLayoutParams()).f1353d & 1) == 1) {
                return childAt;
            }
        }
        return null;
    }

    /* renamed from: c */
    void m1662c(View view) {
        d dVar = (d) view.getLayoutParams();
        if ((dVar.f1353d & 1) == 0) {
            dVar.f1353d = 1;
            List<c> list = this.f1346y;
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    this.f1346y.get(size).mo1678a(view);
                }
            }
            m1632c(view, true);
            if (hasWindowFocus()) {
                sendAccessibilityEvent(32);
            }
        }
    }

    /* renamed from: c */
    void m1663c(View view, float f2) {
        d dVar = (d) view.getLayoutParams();
        if (f2 == dVar.f1351b) {
            return;
        }
        dVar.f1351b = f2;
        m1648a(view, f2);
    }

    @Override // android.view.ViewGroup
    protected boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof d) && super.checkLayoutParams(layoutParams);
    }

    @Override // android.view.View
    public void computeScroll() {
        int childCount = getChildCount();
        float f2 = 0.0f;
        for (int i = 0; i < childCount; i++) {
            f2 = Math.max(f2, ((d) getChildAt(i).getLayoutParams()).f1351b);
        }
        this.f1330i = f2;
        boolean m1476a = this.f1332k.m1476a(true);
        boolean m1476a2 = this.f1333l.m1476a(true);
        if (m1476a || m1476a2) {
            C0107v.m532t(this);
        }
    }

    /* renamed from: d */
    public int m1664d(View view) {
        if (m1672j(view)) {
            return m1660c(((d) view.getLayoutParams()).f1350a);
        }
        throw new IllegalArgumentException("View " + view + " is not a drawer");
    }

    /* renamed from: d */
    View m1665d() {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (m1672j(childAt) && m1673k(childAt)) {
                return childAt;
            }
        }
        return null;
    }

    /* renamed from: d */
    public CharSequence m1666d(int i) {
        int m429a = C0091f.m429a(i, C0107v.m518g(this));
        if (m429a == 3) {
            return this.f1315E;
        }
        if (m429a == 5) {
            return this.f1316F;
        }
        return null;
    }

    @Override // android.view.View
    public boolean dispatchGenericMotionEvent(MotionEvent motionEvent) {
        if ((motionEvent.getSource() & 2) == 0 || motionEvent.getAction() == 10 || this.f1330i <= 0.0f) {
            return super.dispatchGenericMotionEvent(motionEvent);
        }
        int childCount = getChildCount();
        if (childCount == 0) {
            return false;
        }
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        for (int i = childCount - 1; i >= 0; i--) {
            View childAt = getChildAt(i);
            if (m1628a(x, y, childAt) && !m1670h(childAt) && m1630a(motionEvent, childAt)) {
                return true;
            }
        }
        return false;
    }

    @Override // android.view.ViewGroup
    protected boolean drawChild(Canvas canvas, View view, long j) {
        int i;
        Drawable drawable;
        int height = getHeight();
        boolean m1670h = m1670h(view);
        int width = getWidth();
        int save = canvas.save();
        int i2 = 0;
        if (m1670h) {
            int childCount = getChildCount();
            i = width;
            int i3 = 0;
            for (int i4 = 0; i4 < childCount; i4++) {
                View childAt = getChildAt(i4);
                if (childAt != view && childAt.getVisibility() == 0 && m1640m(childAt) && m1672j(childAt) && childAt.getHeight() >= height) {
                    if (m1652a(childAt, 3)) {
                        int right = childAt.getRight();
                        if (right > i3) {
                            i3 = right;
                        }
                    } else {
                        int left = childAt.getLeft();
                        if (left < i) {
                            i = left;
                        }
                    }
                }
            }
            canvas.clipRect(i3, 0, i, getHeight());
            i2 = i3;
        } else {
            i = width;
        }
        boolean drawChild = super.drawChild(canvas, view, j);
        canvas.restoreToCount(save);
        float f2 = this.f1330i;
        if (f2 <= 0.0f || !m1670h) {
            if (this.f1313C != null && m1652a(view, 3)) {
                int intrinsicWidth = this.f1313C.getIntrinsicWidth();
                int right2 = view.getRight();
                float max = Math.max(0.0f, Math.min(right2 / this.f1332k.m1483c(), 1.0f));
                this.f1313C.setBounds(right2, view.getTop(), intrinsicWidth + right2, view.getBottom());
                this.f1313C.setAlpha((int) (max * 255.0f));
                drawable = this.f1313C;
            } else if (this.f1314D != null && m1652a(view, 5)) {
                int intrinsicWidth2 = this.f1314D.getIntrinsicWidth();
                int left2 = view.getLeft();
                float max2 = Math.max(0.0f, Math.min((getWidth() - left2) / this.f1333l.m1483c(), 1.0f));
                this.f1314D.setBounds(left2 - intrinsicWidth2, view.getTop(), left2, view.getBottom());
                this.f1314D.setAlpha((int) (max2 * 255.0f));
                drawable = this.f1314D;
            }
            drawable.draw(canvas);
        } else {
            this.f1331j.setColor((this.f1329h & 16777215) | (((int) ((((-16777216) & r2) >>> 24) * f2)) << 24));
            canvas.drawRect(i2, 0.0f, i, getHeight(), this.f1331j);
        }
        return drawChild;
    }

    /* renamed from: e */
    int m1667e(View view) {
        return C0091f.m429a(((d) view.getLayoutParams()).f1350a, C0107v.m518g(this));
    }

    /* renamed from: f */
    float m1668f(View view) {
        return ((d) view.getLayoutParams()).f1351b;
    }

    /* renamed from: f */
    public void m1669f(int i) {
        m1655b(i, true);
    }

    @Override // android.view.ViewGroup
    protected ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new d(-1, -1);
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new d(getContext(), attributeSet);
    }

    @Override // android.view.ViewGroup
    protected ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof d ? new d((d) layoutParams) : layoutParams instanceof ViewGroup.MarginLayoutParams ? new d((ViewGroup.MarginLayoutParams) layoutParams) : new d(layoutParams);
    }

    public float getDrawerElevation() {
        if (f1310d) {
            return this.f1327f;
        }
        return 0.0f;
    }

    public Drawable getStatusBarBackgroundDrawable() {
        return this.f1312B;
    }

    /* renamed from: h */
    boolean m1670h(View view) {
        return ((d) view.getLayoutParams()).f1350a == 0;
    }

    /* renamed from: i */
    public boolean m1671i(View view) {
        if (m1672j(view)) {
            return (((d) view.getLayoutParams()).f1353d & 1) == 1;
        }
        throw new IllegalArgumentException("View " + view + " is not a drawer");
    }

    /* renamed from: j */
    boolean m1672j(View view) {
        int m429a = C0091f.m429a(((d) view.getLayoutParams()).f1350a, C0107v.m518g(view));
        return ((m429a & 3) == 0 && (m429a & 5) == 0) ? false : true;
    }

    /* renamed from: k */
    public boolean m1673k(View view) {
        if (m1672j(view)) {
            return ((d) view.getLayoutParams()).f1351b > 0.0f;
        }
        throw new IllegalArgumentException("View " + view + " is not a drawer");
    }

    /* renamed from: l */
    public void m1674l(View view) {
        m1659b(view, true);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f1338q = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f1338q = true;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        Object obj;
        super.onDraw(canvas);
        if (!this.f1318H || this.f1312B == null) {
            return;
        }
        int systemWindowInsetTop = (Build.VERSION.SDK_INT < 21 || (obj = this.f1317G) == null) ? 0 : ((WindowInsets) obj).getSystemWindowInsetTop();
        if (systemWindowInsetTop > 0) {
            this.f1312B.setBounds(0, 0, getWidth(), systemWindowInsetTop);
            this.f1312B.draw(canvas);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x001b, code lost:            if (r0 != 3) goto L13;     */
    @Override // android.view.ViewGroup
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean onInterceptTouchEvent(android.view.MotionEvent r7) {
        /*
            r6 = this;
            int r0 = r7.getActionMasked()
            android.support.v4.widget.I r1 = r6.f1332k
            boolean r1 = r1.m1480b(r7)
            android.support.v4.widget.I r2 = r6.f1333l
            boolean r2 = r2.m1480b(r7)
            r1 = r1 | r2
            r2 = 1
            r3 = 0
            if (r0 == 0) goto L3a
            if (r0 == r2) goto L31
            r7 = 2
            r4 = 3
            if (r0 == r7) goto L1e
            if (r0 == r4) goto L31
            goto L38
        L1e:
            android.support.v4.widget.I r7 = r6.f1332k
            boolean r7 = r7.m1473a(r4)
            if (r7 == 0) goto L38
            android.support.v4.widget.k$f r7 = r6.f1334m
            r7.m1684b()
            android.support.v4.widget.k$f r7 = r6.f1335n
            r7.m1684b()
            goto L38
        L31:
            r6.m1651a(r2)
            r6.f1343v = r3
            r6.f1344w = r3
        L38:
            r7 = 0
            goto L64
        L3a:
            float r0 = r7.getX()
            float r7 = r7.getY()
            r6.f1347z = r0
            r6.f1311A = r7
            float r4 = r6.f1330i
            r5 = 0
            int r4 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r4 <= 0) goto L5f
            android.support.v4.widget.I r4 = r6.f1332k
            int r0 = (int) r0
            int r7 = (int) r7
            android.view.View r7 = r4.m1478b(r0, r7)
            if (r7 == 0) goto L5f
            boolean r7 = r6.m1670h(r7)
            if (r7 == 0) goto L5f
            r7 = 1
            goto L60
        L5f:
            r7 = 0
        L60:
            r6.f1343v = r3
            r6.f1344w = r3
        L64:
            if (r1 != 0) goto L74
            if (r7 != 0) goto L74
            boolean r7 = r6.m1634e()
            if (r7 != 0) goto L74
            boolean r7 = r6.f1344w
            if (r7 == 0) goto L73
            goto L74
        L73:
            r2 = 0
        L74:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v4.widget.C0293k.onInterceptTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override // android.view.View, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (i != 4 || !m1635f()) {
            return super.onKeyDown(i, keyEvent);
        }
        keyEvent.startTracking();
        return true;
    }

    @Override // android.view.View, android.view.KeyEvent.Callback
    public boolean onKeyUp(int i, KeyEvent keyEvent) {
        if (i != 4) {
            return super.onKeyUp(i, keyEvent);
        }
        View m1665d = m1665d();
        if (m1665d != null && m1664d(m1665d) == 0) {
            m1654b();
        }
        return m1665d != null;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        float f2;
        int i5;
        int measuredHeight;
        int i6;
        int i7;
        this.f1337p = true;
        int i8 = i3 - i;
        int childCount = getChildCount();
        for (int i9 = 0; i9 < childCount; i9++) {
            View childAt = getChildAt(i9);
            if (childAt.getVisibility() != 8) {
                d dVar = (d) childAt.getLayoutParams();
                if (m1670h(childAt)) {
                    int i10 = ((ViewGroup.MarginLayoutParams) dVar).leftMargin;
                    childAt.layout(i10, ((ViewGroup.MarginLayoutParams) dVar).topMargin, childAt.getMeasuredWidth() + i10, ((ViewGroup.MarginLayoutParams) dVar).topMargin + childAt.getMeasuredHeight());
                } else {
                    int measuredWidth = childAt.getMeasuredWidth();
                    int measuredHeight2 = childAt.getMeasuredHeight();
                    if (m1652a(childAt, 3)) {
                        float f3 = measuredWidth;
                        i5 = (-measuredWidth) + ((int) (dVar.f1351b * f3));
                        f2 = (measuredWidth + i5) / f3;
                    } else {
                        float f4 = measuredWidth;
                        f2 = (i8 - r11) / f4;
                        i5 = i8 - ((int) (dVar.f1351b * f4));
                    }
                    boolean z2 = f2 != dVar.f1351b;
                    int i11 = dVar.f1350a & C0121j.AppCompatTheme_windowActionBarOverlay;
                    if (i11 != 16) {
                        if (i11 != 80) {
                            measuredHeight = ((ViewGroup.MarginLayoutParams) dVar).topMargin;
                            i6 = measuredWidth + i5;
                            i7 = measuredHeight2 + measuredHeight;
                        } else {
                            int i12 = i4 - i2;
                            measuredHeight = (i12 - ((ViewGroup.MarginLayoutParams) dVar).bottomMargin) - childAt.getMeasuredHeight();
                            i6 = measuredWidth + i5;
                            i7 = i12 - ((ViewGroup.MarginLayoutParams) dVar).bottomMargin;
                        }
                        childAt.layout(i5, measuredHeight, i6, i7);
                    } else {
                        int i13 = i4 - i2;
                        int i14 = (i13 - measuredHeight2) / 2;
                        int i15 = ((ViewGroup.MarginLayoutParams) dVar).topMargin;
                        if (i14 < i15) {
                            i14 = i15;
                        } else {
                            int i16 = i14 + measuredHeight2;
                            int i17 = ((ViewGroup.MarginLayoutParams) dVar).bottomMargin;
                            if (i16 > i13 - i17) {
                                i14 = (i13 - i17) - measuredHeight2;
                            }
                        }
                        childAt.layout(i5, i14, measuredWidth + i5, measuredHeight2 + i14);
                    }
                    if (z2) {
                        m1663c(childAt, f2);
                    }
                    int i18 = dVar.f1351b > 0.0f ? 0 : 4;
                    if (childAt.getVisibility() != i18) {
                        childAt.setVisibility(i18);
                    }
                }
            }
        }
        this.f1337p = false;
        this.f1338q = false;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // android.view.View
    @SuppressLint({"WrongConstant"})
    protected void onMeasure(int i, int i2) {
        int mode = View.MeasureSpec.getMode(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        if (mode != 1073741824 || mode2 != 1073741824) {
            if (!isInEditMode()) {
                throw new IllegalArgumentException("DrawerLayout must be measured with MeasureSpec.EXACTLY.");
            }
            if (mode != Integer.MIN_VALUE && mode == 0) {
                size = 300;
            }
            if (mode2 != Integer.MIN_VALUE && mode2 == 0) {
                size2 = 300;
            }
        }
        setMeasuredDimension(size, size2);
        int i3 = 0;
        boolean z = this.f1317G != null && C0107v.m515e(this);
        int m518g = C0107v.m518g(this);
        int childCount = getChildCount();
        int i4 = 0;
        boolean z2 = false;
        boolean z3 = false;
        while (i4 < childCount) {
            View childAt = getChildAt(i4);
            if (childAt.getVisibility() != 8) {
                d dVar = (d) childAt.getLayoutParams();
                if (z) {
                    int m429a = C0091f.m429a(dVar.f1350a, m518g);
                    if (C0107v.m515e(childAt)) {
                        if (Build.VERSION.SDK_INT >= 21) {
                            WindowInsets windowInsets = (WindowInsets) this.f1317G;
                            if (m429a == 3) {
                                windowInsets = windowInsets.replaceSystemWindowInsets(windowInsets.getSystemWindowInsetLeft(), windowInsets.getSystemWindowInsetTop(), i3, windowInsets.getSystemWindowInsetBottom());
                            } else if (m429a == 5) {
                                windowInsets = windowInsets.replaceSystemWindowInsets(i3, windowInsets.getSystemWindowInsetTop(), windowInsets.getSystemWindowInsetRight(), windowInsets.getSystemWindowInsetBottom());
                            }
                            childAt.dispatchApplyWindowInsets(windowInsets);
                        }
                    } else if (Build.VERSION.SDK_INT >= 21) {
                        WindowInsets windowInsets2 = (WindowInsets) this.f1317G;
                        if (m429a == 3) {
                            windowInsets2 = windowInsets2.replaceSystemWindowInsets(windowInsets2.getSystemWindowInsetLeft(), windowInsets2.getSystemWindowInsetTop(), i3, windowInsets2.getSystemWindowInsetBottom());
                        } else if (m429a == 5) {
                            windowInsets2 = windowInsets2.replaceSystemWindowInsets(i3, windowInsets2.getSystemWindowInsetTop(), windowInsets2.getSystemWindowInsetRight(), windowInsets2.getSystemWindowInsetBottom());
                        }
                        ((ViewGroup.MarginLayoutParams) dVar).leftMargin = windowInsets2.getSystemWindowInsetLeft();
                        ((ViewGroup.MarginLayoutParams) dVar).topMargin = windowInsets2.getSystemWindowInsetTop();
                        ((ViewGroup.MarginLayoutParams) dVar).rightMargin = windowInsets2.getSystemWindowInsetRight();
                        ((ViewGroup.MarginLayoutParams) dVar).bottomMargin = windowInsets2.getSystemWindowInsetBottom();
                    }
                }
                if (m1670h(childAt)) {
                    childAt.measure(View.MeasureSpec.makeMeasureSpec((size - ((ViewGroup.MarginLayoutParams) dVar).leftMargin) - ((ViewGroup.MarginLayoutParams) dVar).rightMargin, 1073741824), View.MeasureSpec.makeMeasureSpec((size2 - ((ViewGroup.MarginLayoutParams) dVar).topMargin) - ((ViewGroup.MarginLayoutParams) dVar).bottomMargin, 1073741824));
                } else {
                    if (!m1672j(childAt)) {
                        throw new IllegalStateException("Child " + childAt + " at index " + i4 + " does not have a valid layout_gravity - must be Gravity.LEFT, Gravity.RIGHT or Gravity.NO_GRAVITY");
                    }
                    if (f1310d) {
                        float m512d = C0107v.m512d(childAt);
                        float f2 = this.f1327f;
                        if (m512d != f2) {
                            C0107v.m493a(childAt, f2);
                        }
                    }
                    int m1667e = m1667e(childAt) & 7;
                    boolean z4 = m1667e == 3;
                    if ((z4 && z2) || (!z4 && z3)) {
                        throw new IllegalStateException("Child drawer has absolute gravity " + m1633e(m1667e) + " but this DrawerLayout already has a drawer view along that edge");
                    }
                    if (z4) {
                        z2 = true;
                    } else {
                        z3 = true;
                    }
                    childAt.measure(ViewGroup.getChildMeasureSpec(i, this.f1328g + ((ViewGroup.MarginLayoutParams) dVar).leftMargin + ((ViewGroup.MarginLayoutParams) dVar).rightMargin, ((ViewGroup.MarginLayoutParams) dVar).width), ViewGroup.getChildMeasureSpec(i2, ((ViewGroup.MarginLayoutParams) dVar).topMargin + ((ViewGroup.MarginLayoutParams) dVar).bottomMargin, ((ViewGroup.MarginLayoutParams) dVar).height));
                    i4++;
                    i3 = 0;
                }
            }
            i4++;
            i3 = 0;
        }
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable) {
        View m1653b;
        if (!(parcelable instanceof e)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        e eVar = (e) parcelable;
        super.onRestoreInstanceState(eVar.m411a());
        int i = eVar.f1354a;
        if (i != 0 && (m1653b = m1653b(i)) != null) {
            m1674l(m1653b);
        }
        int i2 = eVar.f1355b;
        if (i2 != 3) {
            m1643a(i2, 3);
        }
        int i3 = eVar.f1356c;
        if (i3 != 3) {
            m1643a(i3, 5);
        }
        int i4 = eVar.f1357d;
        if (i4 != 3) {
            m1643a(i4, 8388611);
        }
        int i5 = eVar.f1358e;
        if (i5 != 3) {
            m1643a(i5, 8388613);
        }
    }

    @Override // android.view.View
    public void onRtlPropertiesChanged(int i) {
        m1639i();
    }

    @Override // android.view.View
    protected Parcelable onSaveInstanceState() {
        e eVar = new e(super.onSaveInstanceState());
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            d dVar = (d) getChildAt(i).getLayoutParams();
            boolean z = dVar.f1353d == 1;
            boolean z2 = dVar.f1353d == 2;
            if (z || z2) {
                eVar.f1354a = dVar.f1350a;
                break;
            }
        }
        eVar.f1355b = this.f1339r;
        eVar.f1356c = this.f1340s;
        eVar.f1357d = this.f1341t;
        eVar.f1358e = this.f1342u;
        return eVar;
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z;
        View m1661c;
        this.f1332k.m1471a(motionEvent);
        this.f1333l.m1471a(motionEvent);
        int action = motionEvent.getAction() & 255;
        if (action != 0) {
            if (action == 1) {
                float x = motionEvent.getX();
                float y = motionEvent.getY();
                View m1478b = this.f1332k.m1478b((int) x, (int) y);
                if (m1478b != null && m1670h(m1478b)) {
                    float f2 = x - this.f1347z;
                    float f3 = y - this.f1311A;
                    int m1486d = this.f1332k.m1486d();
                    if ((f2 * f2) + (f3 * f3) < m1486d * m1486d && (m1661c = m1661c()) != null && m1664d(m1661c) != 2) {
                        z = false;
                        m1651a(z);
                        this.f1343v = false;
                    }
                }
                z = true;
                m1651a(z);
                this.f1343v = false;
            } else if (action == 3) {
                m1651a(true);
            }
            return true;
        }
        float x2 = motionEvent.getX();
        float y2 = motionEvent.getY();
        this.f1347z = x2;
        this.f1311A = y2;
        this.f1343v = false;
        this.f1344w = false;
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestDisallowInterceptTouchEvent(boolean z) {
        super.requestDisallowInterceptTouchEvent(z);
        this.f1343v = z;
        if (z) {
            m1651a(true);
        }
    }

    @Override // android.view.View, android.view.ViewParent
    public void requestLayout() {
        if (this.f1337p) {
            return;
        }
        super.requestLayout();
    }

    public void setDrawerElevation(float f2) {
        this.f1327f = f2;
        for (int i = 0; i < getChildCount(); i++) {
            View childAt = getChildAt(i);
            if (m1672j(childAt)) {
                C0107v.m493a(childAt, this.f1327f);
            }
        }
    }

    @Deprecated
    public void setDrawerListener(c cVar) {
        c cVar2 = this.f1345x;
        if (cVar2 != null) {
            m1656b(cVar2);
        }
        if (cVar != null) {
            m1646a(cVar);
        }
        this.f1345x = cVar;
    }

    public void setDrawerLockMode(int i) {
        m1643a(i, 3);
        m1643a(i, 5);
    }

    public void setScrimColor(int i) {
        this.f1329h = i;
        invalidate();
    }

    public void setStatusBarBackground(int i) {
        this.f1312B = i != 0 ? C0022a.m92c(getContext(), i) : null;
        invalidate();
    }

    public void setStatusBarBackground(Drawable drawable) {
        this.f1312B = drawable;
        invalidate();
    }

    public void setStatusBarBackgroundColor(int i) {
        this.f1312B = new ColorDrawable(i);
        invalidate();
    }
}
