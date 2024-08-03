package p139d.p273d.p274a;

import android.view.MotionEvent;
import android.view.View;
import java.util.Arrays;
import p139d.p273d.p274a.C2686c;

/* renamed from: d.d.a.c */
/* loaded from: classes.dex */
public class C2686c<T extends C2686c> {

    /* renamed from: a */
    private static int f11249a = 11;

    /* renamed from: b */
    private static MotionEvent.PointerProperties[] f11250b;

    /* renamed from: c */
    private static MotionEvent.PointerCoords[] f11251c;

    /* renamed from: f */
    private int f11254f;

    /* renamed from: g */
    private View f11255g;

    /* renamed from: i */
    private float f11257i;

    /* renamed from: j */
    private float f11258j;

    /* renamed from: k */
    private boolean f11259k;

    /* renamed from: m */
    private float[] f11261m;

    /* renamed from: n */
    private float f11262n;

    /* renamed from: o */
    private float f11263o;

    /* renamed from: p */
    private float f11264p;

    /* renamed from: q */
    private float f11265q;

    /* renamed from: r */
    private boolean f11266r;

    /* renamed from: t */
    private C2689f f11268t;

    /* renamed from: u */
    private InterfaceC2695l<T> f11269u;

    /* renamed from: v */
    private InterfaceC2687d f11270v;

    /* renamed from: w */
    int f11271w;

    /* renamed from: x */
    boolean f11272x;

    /* renamed from: y */
    boolean f11273y;

    /* renamed from: d */
    private final int[] f11252d = new int[f11249a];

    /* renamed from: e */
    private int f11253e = 0;

    /* renamed from: h */
    private int f11256h = 0;

    /* renamed from: l */
    private boolean f11260l = true;

    /* renamed from: s */
    private int f11267s = 0;

    /* renamed from: a */
    private static boolean m11502a(float f) {
        return !Float.isNaN(f);
    }

    /* renamed from: d */
    private MotionEvent m11503d(MotionEvent motionEvent) {
        int actionIndex;
        if (!m11506e(motionEvent)) {
            return motionEvent;
        }
        int actionMasked = motionEvent.getActionMasked();
        int i = 2;
        int i2 = 5;
        if (actionMasked == 0 || actionMasked == 5) {
            actionIndex = motionEvent.getActionIndex();
            if (this.f11252d[motionEvent.getPointerId(actionIndex)] != -1) {
                if (this.f11253e == 1) {
                    i2 = 0;
                }
                i = i2;
            }
        } else {
            i2 = 6;
            if (actionMasked == 1 || actionMasked == 6) {
                actionIndex = motionEvent.getActionIndex();
                if (this.f11252d[motionEvent.getPointerId(actionIndex)] != -1) {
                    if (this.f11253e == 1) {
                        i2 = 1;
                    }
                    i = i2;
                }
            } else {
                i = actionMasked;
                actionIndex = -1;
            }
        }
        m11504d(this.f11253e);
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        motionEvent.setLocation(motionEvent.getRawX(), motionEvent.getRawY());
        int pointerCount = motionEvent.getPointerCount();
        int i3 = i;
        int i4 = 0;
        for (int i5 = 0; i5 < pointerCount; i5++) {
            int pointerId = motionEvent.getPointerId(i5);
            if (this.f11252d[pointerId] != -1) {
                motionEvent.getPointerProperties(i5, f11250b[i4]);
                f11250b[i4].id = this.f11252d[pointerId];
                motionEvent.getPointerCoords(i5, f11251c[i4]);
                if (i5 == actionIndex) {
                    i3 |= i4 << 8;
                }
                i4++;
            }
        }
        MotionEvent obtain = MotionEvent.obtain(motionEvent.getDownTime(), motionEvent.getEventTime(), i3, i4, f11250b, f11251c, motionEvent.getMetaState(), motionEvent.getButtonState(), motionEvent.getXPrecision(), motionEvent.getYPrecision(), motionEvent.getDeviceId(), motionEvent.getEdgeFlags(), motionEvent.getSource(), motionEvent.getFlags());
        motionEvent.setLocation(x, y);
        obtain.setLocation(x, y);
        return obtain;
    }

    /* renamed from: d */
    private static void m11504d(int i) {
        if (f11250b == null) {
            int i2 = f11249a;
            f11250b = new MotionEvent.PointerProperties[i2];
            f11251c = new MotionEvent.PointerCoords[i2];
        }
        while (i > 0) {
            MotionEvent.PointerProperties[] pointerPropertiesArr = f11250b;
            int i3 = i - 1;
            if (pointerPropertiesArr[i3] != null) {
                return;
            }
            pointerPropertiesArr[i3] = new MotionEvent.PointerProperties();
            f11251c[i3] = new MotionEvent.PointerCoords();
            i--;
        }
    }

    /* renamed from: e */
    private void m11505e(int i) {
        int i2 = this.f11256h;
        if (i2 == i) {
            return;
        }
        this.f11256h = i;
        this.f11268t.m11572a(this, i, i2);
        mo11522b(i, i2);
    }

    /* renamed from: e */
    private boolean m11506e(MotionEvent motionEvent) {
        if (motionEvent.getPointerCount() != this.f11253e) {
            return true;
        }
        int i = 0;
        while (true) {
            int[] iArr = this.f11252d;
            if (i >= iArr.length) {
                return false;
            }
            if (iArr[i] != -1 && iArr[i] != i) {
                return true;
            }
            i++;
        }
    }

    /* renamed from: t */
    private int m11507t() {
        int i = 0;
        while (i < this.f11253e) {
            int i2 = 0;
            while (true) {
                int[] iArr = this.f11252d;
                if (i2 >= iArr.length || iArr[i2] == i) {
                    break;
                }
                i2++;
            }
            if (i2 == this.f11252d.length) {
                return i;
            }
            i++;
        }
        return i;
    }

    /* renamed from: a */
    public T m11508a(float f, float f2, float f3, float f4, float f5, float f6) {
        if (this.f11261m == null) {
            this.f11261m = new float[6];
        }
        float[] fArr = this.f11261m;
        fArr[0] = f;
        fArr[1] = f2;
        fArr[2] = f3;
        fArr[3] = f4;
        fArr[4] = f5;
        fArr[5] = f6;
        if (m11502a(f5) && m11502a(f) && m11502a(f3)) {
            throw new IllegalArgumentException("Cannot have all of left, right and width defined");
        }
        if (m11502a(f5) && !m11502a(f) && !m11502a(f3)) {
            throw new IllegalArgumentException("When width is set one of left or right pads need to be defined");
        }
        if (m11502a(f6) && m11502a(f4) && m11502a(f2)) {
            throw new IllegalArgumentException("Cannot have all of top, bottom and height defined");
        }
        if (!m11502a(f6) || m11502a(f4) || m11502a(f2)) {
            return this;
        }
        throw new IllegalArgumentException("When height is set one of top or bottom pads need to be defined");
    }

    /* renamed from: a */
    public T m11509a(InterfaceC2687d interfaceC2687d) {
        this.f11270v = interfaceC2687d;
        return this;
    }

    /* renamed from: a */
    public C2686c m11510a(InterfaceC2695l<T> interfaceC2695l) {
        this.f11269u = interfaceC2695l;
        return this;
    }

    /* renamed from: a */
    public T m11511a(boolean z) {
        if (this.f11255g != null) {
            m11525c();
        }
        this.f11260l = z;
        return this;
    }

    /* renamed from: a */
    public final void m11512a() {
        int i = this.f11256h;
        if (i == 0 || i == 2) {
            m11505e(4);
        }
    }

    /* renamed from: a */
    public void m11513a(int i) {
        this.f11254f = i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public void m11514a(int i, int i2) {
        InterfaceC2695l<T> interfaceC2695l = this.f11269u;
        if (interfaceC2695l != null) {
            interfaceC2695l.mo6774a(this, i, i2);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public void m11515a(MotionEvent motionEvent) {
        InterfaceC2695l<T> interfaceC2695l = this.f11269u;
        if (interfaceC2695l != null) {
            interfaceC2695l.mo6775a(this, motionEvent);
        }
    }

    /* renamed from: a */
    public final void m11516a(View view, C2689f c2689f) {
        if (this.f11255g != null || this.f11268t != null) {
            throw new IllegalStateException("Already prepared or hasn't been reset");
        }
        Arrays.fill(this.f11252d, -1);
        this.f11253e = 0;
        this.f11256h = 0;
        this.f11255g = view;
        this.f11268t = c2689f;
    }

    /* renamed from: a */
    public boolean m11517a(View view, float f, float f2) {
        float f3;
        float width = view.getWidth();
        float height = view.getHeight();
        float[] fArr = this.f11261m;
        if (fArr != null) {
            float f4 = fArr[0];
            float f5 = fArr[1];
            float f6 = fArr[2];
            float f7 = fArr[3];
            f3 = m11502a(f4) ? 0.0f - f4 : 0.0f;
            r4 = m11502a(f5) ? 0.0f - f7 : 0.0f;
            if (m11502a(f6)) {
                width += f6;
            }
            if (m11502a(f7)) {
                height += f7;
            }
            float[] fArr2 = this.f11261m;
            float f8 = fArr2[4];
            float f9 = fArr2[5];
            if (m11502a(f8)) {
                if (!m11502a(f4)) {
                    f3 = width - f8;
                } else if (!m11502a(f6)) {
                    width = f8 + f3;
                }
            }
            if (m11502a(f9)) {
                if (!m11502a(r4)) {
                    r4 = height - f9;
                } else if (!m11502a(height)) {
                    height = r4 + f9;
                }
            }
        } else {
            f3 = 0.0f;
        }
        return f >= f3 && f <= width && f2 >= r4 && f2 <= height;
    }

    /* renamed from: a */
    public boolean m11518a(C2686c c2686c) {
        int i = 0;
        while (true) {
            int[] iArr = this.f11252d;
            if (i >= iArr.length) {
                return false;
            }
            if (iArr[i] != -1 && c2686c.f11252d[i] != -1) {
                return true;
            }
            i++;
        }
    }

    /* renamed from: b */
    public T m11519b(boolean z) {
        this.f11266r = z;
        return this;
    }

    /* renamed from: b */
    public final void m11520b() {
        if (this.f11256h == 0) {
            m11505e(2);
        }
    }

    /* renamed from: b */
    public void m11521b(int i) {
        int[] iArr = this.f11252d;
        if (iArr[i] == -1) {
            iArr[i] = m11507t();
            this.f11253e++;
        }
    }

    /* renamed from: b */
    protected void mo11522b(int i, int i2) {
    }

    /* renamed from: b */
    public final void m11523b(MotionEvent motionEvent) {
        int i;
        if (!this.f11260l || (i = this.f11256h) == 3 || i == 1 || i == 5 || this.f11253e < 1) {
            return;
        }
        MotionEvent m11503d = m11503d(motionEvent);
        this.f11257i = m11503d.getX();
        this.f11258j = m11503d.getY();
        this.f11267s = m11503d.getPointerCount();
        this.f11259k = m11517a(this.f11255g, this.f11257i, this.f11258j);
        if (this.f11266r && !this.f11259k) {
            int i2 = this.f11256h;
            if (i2 == 4) {
                m11525c();
                return;
            } else {
                if (i2 == 2) {
                    m11530e();
                    return;
                }
                return;
            }
        }
        this.f11262n = C2691h.m11574a(m11503d, true);
        this.f11263o = C2691h.m11575b(m11503d, true);
        this.f11264p = m11503d.getRawX() - m11503d.getX();
        this.f11265q = m11503d.getRawY() - m11503d.getY();
        mo6795c(m11503d);
        if (m11503d != motionEvent) {
            m11503d.recycle();
        }
    }

    /* renamed from: b */
    public boolean mo11524b(C2686c c2686c) {
        InterfaceC2687d interfaceC2687d;
        if (c2686c == this || (interfaceC2687d = this.f11270v) == null) {
            return false;
        }
        return interfaceC2687d.mo6770a(this, c2686c);
    }

    /* renamed from: c */
    public final void m11525c() {
        int i = this.f11256h;
        if (i == 4 || i == 0 || i == 2) {
            mo6796p();
            m11505e(3);
        }
    }

    /* renamed from: c */
    public void m11526c(int i) {
        int[] iArr = this.f11252d;
        if (iArr[i] != -1) {
            iArr[i] = -1;
            this.f11253e--;
        }
    }

    /* renamed from: c */
    protected void mo6795c(MotionEvent motionEvent) {
        m11505e(1);
    }

    /* renamed from: c */
    public boolean mo11527c(C2686c c2686c) {
        if (c2686c == this) {
            return true;
        }
        InterfaceC2687d interfaceC2687d = this.f11270v;
        if (interfaceC2687d != null) {
            return interfaceC2687d.mo6771b(this, c2686c);
        }
        return false;
    }

    /* renamed from: d */
    public final void m11528d() {
        int i = this.f11256h;
        if (i == 2 || i == 4) {
            m11505e(5);
        }
    }

    /* renamed from: d */
    public boolean mo11529d(C2686c c2686c) {
        InterfaceC2687d interfaceC2687d;
        if (c2686c == this || (interfaceC2687d = this.f11270v) == null) {
            return false;
        }
        return interfaceC2687d.mo6773d(this, c2686c);
    }

    /* renamed from: e */
    public final void m11530e() {
        int i = this.f11256h;
        if (i == 4 || i == 0 || i == 2) {
            m11505e(1);
        }
    }

    /* renamed from: e */
    public boolean m11531e(C2686c c2686c) {
        InterfaceC2687d interfaceC2687d;
        if (c2686c == this || (interfaceC2687d = this.f11270v) == null) {
            return false;
        }
        return interfaceC2687d.mo6772c(this, c2686c);
    }

    /* renamed from: f */
    public float m11532f() {
        return this.f11262n;
    }

    /* renamed from: g */
    public float m11533g() {
        return this.f11263o;
    }

    /* renamed from: h */
    public float m11534h() {
        return this.f11262n - this.f11264p;
    }

    /* renamed from: i */
    public float m11535i() {
        return this.f11263o - this.f11265q;
    }

    /* renamed from: j */
    public int m11536j() {
        return this.f11267s;
    }

    /* renamed from: k */
    public int m11537k() {
        return this.f11256h;
    }

    /* renamed from: l */
    public int m11538l() {
        return this.f11254f;
    }

    /* renamed from: m */
    public View m11539m() {
        return this.f11255g;
    }

    /* renamed from: n */
    public boolean m11540n() {
        return this.f11260l;
    }

    /* renamed from: o */
    public boolean m11541o() {
        return this.f11259k;
    }

    /* renamed from: p */
    protected void mo6796p() {
    }

    /* renamed from: q */
    protected void mo11501q() {
    }

    /* renamed from: r */
    public final void m11542r() {
        this.f11255g = null;
        this.f11268t = null;
        Arrays.fill(this.f11252d, -1);
        this.f11253e = 0;
        mo11501q();
    }

    /* renamed from: s */
    public boolean m11543s() {
        int i;
        return (!this.f11260l || (i = this.f11256h) == 1 || i == 3 || i == 5 || this.f11253e <= 0) ? false : true;
    }

    public String toString() {
        View view = this.f11255g;
        return getClass().getSimpleName() + "@[" + this.f11254f + "]:" + (view == null ? null : view.getClass().getSimpleName());
    }
}
