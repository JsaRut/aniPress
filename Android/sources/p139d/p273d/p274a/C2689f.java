package p139d.p273d.p274a;

import android.graphics.Matrix;
import android.graphics.PointF;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

/* renamed from: d.d.a.f */
/* loaded from: classes.dex */
public class C2689f {

    /* renamed from: a */
    private static final PointF f11274a = new PointF();

    /* renamed from: b */
    private static final float[] f11275b = new float[2];

    /* renamed from: c */
    private static final Matrix f11276c = new Matrix();

    /* renamed from: d */
    private static final float[] f11277d = new float[2];

    /* renamed from: e */
    private static final Comparator<C2686c> f11278e = new C2688e();

    /* renamed from: f */
    private final ViewGroup f11279f;

    /* renamed from: g */
    private final InterfaceC2690g f11280g;

    /* renamed from: h */
    private final InterfaceC2705v f11281h;

    /* renamed from: i */
    private final C2686c[] f11282i = new C2686c[20];

    /* renamed from: j */
    private final C2686c[] f11283j = new C2686c[20];

    /* renamed from: k */
    private final C2686c[] f11284k = new C2686c[20];

    /* renamed from: l */
    private final C2686c[] f11285l = new C2686c[20];

    /* renamed from: m */
    private int f11286m = 0;

    /* renamed from: n */
    private int f11287n = 0;

    /* renamed from: o */
    private boolean f11288o = false;

    /* renamed from: p */
    private int f11289p = 0;

    /* renamed from: q */
    private boolean f11290q = false;

    /* renamed from: r */
    private int f11291r = 0;

    /* renamed from: s */
    private float f11292s = 0.0f;

    public C2689f(ViewGroup viewGroup, InterfaceC2690g interfaceC2690g, InterfaceC2705v interfaceC2705v) {
        this.f11279f = viewGroup;
        this.f11280g = interfaceC2690g;
        this.f11281h = interfaceC2705v;
    }

    /* renamed from: a */
    private void m11545a() {
        for (int i = this.f11287n - 1; i >= 0; i--) {
            this.f11283j[i].m11525c();
        }
        int i2 = this.f11286m;
        for (int i3 = 0; i3 < i2; i3++) {
            this.f11284k[i3] = this.f11282i[i3];
        }
        for (int i4 = i2 - 1; i4 >= 0; i4--) {
            this.f11284k[i4].m11525c();
        }
    }

    /* renamed from: a */
    private static void m11546a(float f, float f2, ViewGroup viewGroup, View view, PointF pointF) {
        float scrollX = (f + viewGroup.getScrollX()) - view.getLeft();
        float scrollY = (f2 + viewGroup.getScrollY()) - view.getTop();
        Matrix matrix = view.getMatrix();
        if (!matrix.isIdentity()) {
            float[] fArr = f11275b;
            fArr[0] = scrollX;
            fArr[1] = scrollY;
            Matrix matrix2 = f11276c;
            matrix.invert(matrix2);
            matrix2.mapPoints(fArr);
            float f3 = fArr[0];
            scrollY = fArr[1];
            scrollX = f3;
        }
        pointF.set(scrollX, scrollY);
    }

    /* renamed from: a */
    private void m11547a(View view, MotionEvent motionEvent, float[] fArr) {
        if (view == this.f11279f) {
            fArr[0] = motionEvent.getX();
            fArr[1] = motionEvent.getY();
        } else {
            if (view == null || !(view.getParent() instanceof ViewGroup)) {
                throw new IllegalArgumentException("Parent is null? View is no longer in the tree");
            }
            ViewGroup viewGroup = (ViewGroup) view.getParent();
            m11547a(viewGroup, motionEvent, fArr);
            PointF pointF = f11274a;
            m11546a(fArr[0], fArr[1], viewGroup, view, pointF);
            fArr[0] = pointF.x;
            fArr[1] = pointF.y;
        }
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* renamed from: a */
    private void m11548a(C2686c c2686c) {
        int i = 0;
        while (true) {
            int i2 = this.f11287n;
            if (i >= i2) {
                C2686c[] c2686cArr = this.f11283j;
                if (i2 >= c2686cArr.length) {
                    throw new IllegalStateException("Too many recognizers");
                }
                this.f11287n = i2 + 1;
                c2686cArr[i2] = c2686c;
                c2686c.f11273y = true;
                int i3 = this.f11291r;
                this.f11291r = i3 + 1;
                c2686c.f11271w = i3;
                return;
            }
            if (this.f11283j[i] == c2686c) {
                return;
            } else {
                i++;
            }
        }
    }

    /* renamed from: a */
    private void m11549a(C2686c c2686c, MotionEvent motionEvent) {
        if (!m11566c(c2686c.m11539m())) {
            c2686c.m11525c();
            return;
        }
        if (c2686c.m11543s()) {
            int actionMasked = motionEvent.getActionMasked();
            if (c2686c.f11273y && actionMasked == 2) {
                return;
            }
            float[] fArr = f11277d;
            m11547a(c2686c.m11539m(), motionEvent, fArr);
            float x = motionEvent.getX();
            float y = motionEvent.getY();
            motionEvent.setLocation(fArr[0], fArr[1]);
            c2686c.m11523b(motionEvent);
            if (c2686c.f11272x) {
                c2686c.m11515a(motionEvent);
            }
            motionEvent.setLocation(x, y);
            if (actionMasked == 1 || actionMasked == 6) {
                c2686c.m11526c(motionEvent.getPointerId(motionEvent.getActionIndex()));
            }
        }
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* renamed from: a */
    private void m11550a(C2686c c2686c, View view) {
        int i = 0;
        while (true) {
            int i2 = this.f11286m;
            if (i >= i2) {
                C2686c[] c2686cArr = this.f11282i;
                if (i2 >= c2686cArr.length) {
                    throw new IllegalStateException("Too many recognizers");
                }
                this.f11286m = i2 + 1;
                c2686cArr[i2] = c2686c;
                c2686c.f11272x = false;
                c2686c.f11273y = false;
                c2686c.f11271w = Integer.MAX_VALUE;
                c2686c.m11516a(view, this);
                return;
            }
            if (this.f11282i[i] == c2686c) {
                return;
            } else {
                i++;
            }
        }
    }

    /* renamed from: a */
    private static boolean m11551a(float f, float f2, View view) {
        return f >= 0.0f && f <= ((float) view.getWidth()) && f2 >= 0.0f && f2 < ((float) view.getHeight());
    }

    /* renamed from: a */
    private static boolean m11552a(int i) {
        return i == 3 || i == 1 || i == 5;
    }

    /* renamed from: a */
    private boolean m11553a(View view) {
        return view.getVisibility() == 0 && view.getAlpha() >= this.f11292s;
    }

    /* renamed from: a */
    private static boolean m11554a(View view, float[] fArr) {
        return (!(view instanceof ViewGroup) || view.getBackground() != null) && m11551a(fArr[0], fArr[1], view);
    }

    /* renamed from: a */
    private boolean m11555a(View view, float[] fArr, int i) {
        ArrayList<C2686c> mo6778a = this.f11280g.mo6778a(view);
        if (mo6778a == null) {
            return false;
        }
        int size = mo6778a.size();
        boolean z = false;
        for (int i2 = 0; i2 < size; i2++) {
            C2686c c2686c = mo6778a.get(i2);
            if (c2686c.m11540n() && c2686c.m11517a(view, fArr[0], fArr[1])) {
                m11550a(c2686c, view);
                c2686c.m11521b(i);
                z = true;
            }
        }
        return z;
    }

    /* renamed from: a */
    private boolean m11556a(ViewGroup viewGroup, float[] fArr, int i) {
        for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
            View mo6800a = this.f11281h.mo6800a(viewGroup, childCount);
            if (m11553a(mo6800a)) {
                PointF pointF = f11274a;
                m11546a(fArr[0], fArr[1], viewGroup, mo6800a, pointF);
                float f = fArr[0];
                float f2 = fArr[1];
                fArr[0] = pointF.x;
                fArr[1] = pointF.y;
                boolean m11560b = (!m11559b(mo6800a) || m11551a(fArr[0], fArr[1], mo6800a)) ? m11560b(mo6800a, fArr, i) : false;
                fArr[0] = f;
                fArr[1] = f2;
                if (m11560b) {
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: a */
    private static boolean m11557a(C2686c c2686c, C2686c c2686c2) {
        return c2686c == c2686c2 || c2686c.mo11527c(c2686c2) || c2686c2.mo11527c(c2686c);
    }

    /* renamed from: b */
    private void m11558b() {
        int i = 0;
        for (int i2 = 0; i2 < this.f11287n; i2++) {
            C2686c[] c2686cArr = this.f11283j;
            if (c2686cArr[i2].f11273y) {
                c2686cArr[i] = c2686cArr[i2];
                i++;
            }
        }
        this.f11287n = i;
    }

    /* renamed from: b */
    private boolean m11559b(View view) {
        return !(view instanceof ViewGroup) || this.f11281h.mo6802a((ViewGroup) view);
    }

    /* renamed from: b */
    private boolean m11560b(View view, float[] fArr, int i) {
        EnumC2699p mo6801a = this.f11281h.mo6801a(view);
        if (mo6801a == EnumC2699p.NONE) {
            return false;
        }
        if (mo6801a == EnumC2699p.BOX_ONLY) {
            return m11555a(view, fArr, i) || m11554a(view, fArr);
        }
        if (mo6801a == EnumC2699p.BOX_NONE) {
            if (view instanceof ViewGroup) {
                return m11556a((ViewGroup) view, fArr, i);
            }
            return false;
        }
        if (mo6801a == EnumC2699p.AUTO) {
            return m11555a(view, fArr, i) || (view instanceof ViewGroup ? m11556a((ViewGroup) view, fArr, i) : false) || m11554a(view, fArr);
        }
        throw new IllegalArgumentException("Unknown pointer event type: " + mo6801a.toString());
    }

    /* renamed from: b */
    private boolean m11561b(C2686c c2686c) {
        for (int i = 0; i < this.f11286m; i++) {
            C2686c c2686c2 = this.f11282i[i];
            if (!m11552a(c2686c2.m11537k()) && m11567c(c2686c, c2686c2)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: b */
    private static boolean m11562b(C2686c c2686c, C2686c c2686c2) {
        if (!c2686c.m11518a(c2686c2) || m11557a(c2686c, c2686c2)) {
            return false;
        }
        if (c2686c == c2686c2) {
            return true;
        }
        if (c2686c.f11273y || c2686c.m11537k() == 4) {
            return c2686c.mo11524b(c2686c2);
        }
        return true;
    }

    /* renamed from: c */
    private void m11563c() {
        boolean z = false;
        for (int i = this.f11286m - 1; i >= 0; i--) {
            C2686c c2686c = this.f11282i[i];
            if (m11552a(c2686c.m11537k()) && !c2686c.f11273y) {
                this.f11282i[i] = null;
                c2686c.m11542r();
                c2686c.f11272x = false;
                c2686c.f11273y = false;
                c2686c.f11271w = Integer.MAX_VALUE;
                z = true;
            }
        }
        if (z) {
            int i2 = 0;
            for (int i3 = 0; i3 < this.f11286m; i3++) {
                C2686c[] c2686cArr = this.f11282i;
                if (c2686cArr[i3] != null) {
                    c2686cArr[i2] = c2686cArr[i3];
                    i2++;
                }
            }
            this.f11286m = i2;
        }
        this.f11290q = false;
    }

    /* renamed from: c */
    private void m11564c(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        int pointerId = motionEvent.getPointerId(actionIndex);
        f11277d[0] = motionEvent.getX(actionIndex);
        f11277d[1] = motionEvent.getY(actionIndex);
        m11560b(this.f11279f, f11277d, pointerId);
        m11556a(this.f11279f, f11277d, pointerId);
    }

    /* renamed from: c */
    private void m11565c(C2686c c2686c) {
        int m11537k = c2686c.m11537k();
        c2686c.f11273y = false;
        c2686c.f11272x = true;
        int i = this.f11291r;
        this.f11291r = i + 1;
        c2686c.f11271w = i;
        int i2 = 0;
        for (int i3 = 0; i3 < this.f11286m; i3++) {
            C2686c c2686c2 = this.f11282i[i3];
            if (m11562b(c2686c2, c2686c)) {
                this.f11285l[i2] = c2686c2;
                i2++;
            }
        }
        for (int i4 = i2 - 1; i4 >= 0; i4--) {
            this.f11285l[i4].m11525c();
        }
        for (int i5 = this.f11287n - 1; i5 >= 0; i5--) {
            C2686c c2686c3 = this.f11283j[i5];
            if (m11562b(c2686c3, c2686c)) {
                c2686c3.m11525c();
                c2686c3.f11273y = false;
            }
        }
        m11558b();
        c2686c.m11514a(4, 2);
        if (m11537k != 4) {
            c2686c.m11514a(5, 4);
            if (m11537k != 5) {
                c2686c.m11514a(0, 5);
            }
        }
    }

    /* renamed from: c */
    private boolean m11566c(View view) {
        if (view == null) {
            return false;
        }
        if (view == this.f11279f) {
            return true;
        }
        ViewParent parent = view.getParent();
        while (parent != null && parent != this.f11279f) {
            parent = parent.getParent();
        }
        return parent == this.f11279f;
    }

    /* renamed from: c */
    private static boolean m11567c(C2686c c2686c, C2686c c2686c2) {
        return c2686c != c2686c2 && (c2686c.m11531e(c2686c2) || c2686c2.mo11529d(c2686c));
    }

    /* renamed from: d */
    private void m11568d() {
        if (this.f11288o || this.f11289p != 0) {
            this.f11290q = true;
        } else {
            m11563c();
        }
    }

    /* renamed from: d */
    private void m11569d(C2686c c2686c) {
        if (m11561b(c2686c)) {
            m11548a(c2686c);
        } else {
            m11565c(c2686c);
            c2686c.f11273y = false;
        }
    }

    /* renamed from: a */
    public void m11570a(float f) {
        this.f11292s = f;
    }

    /* renamed from: a */
    public void m11571a(MotionEvent motionEvent) {
        int i = this.f11286m;
        System.arraycopy(this.f11282i, 0, this.f11284k, 0, i);
        Arrays.sort(this.f11284k, 0, i, f11278e);
        for (int i2 = 0; i2 < i; i2++) {
            m11549a(this.f11284k[i2], motionEvent);
        }
    }

    /* renamed from: a */
    public void m11572a(C2686c c2686c, int i, int i2) {
        this.f11289p++;
        if (m11552a(i)) {
            for (int i3 = 0; i3 < this.f11287n; i3++) {
                C2686c c2686c2 = this.f11283j[i3];
                if (m11567c(c2686c2, c2686c)) {
                    if (i == 5) {
                        c2686c2.m11525c();
                        c2686c2.f11273y = false;
                    } else {
                        m11569d(c2686c2);
                    }
                }
            }
            m11558b();
        }
        if (i == 4) {
            m11569d(c2686c);
        } else if ((i2 != 4 && i2 != 5) || c2686c.f11272x) {
            c2686c.m11514a(i, i2);
        }
        this.f11289p--;
        m11568d();
    }

    /* renamed from: b */
    public boolean m11573b(MotionEvent motionEvent) {
        this.f11288o = true;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0 || actionMasked == 5) {
            m11564c(motionEvent);
        } else if (actionMasked == 3) {
            m11545a();
        }
        m11571a(motionEvent);
        this.f11288o = false;
        if (this.f11290q && this.f11289p == 0) {
            m11563c();
        }
        return true;
    }
}
