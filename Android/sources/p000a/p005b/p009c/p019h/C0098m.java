package p000a.p005b.p009c.p019h;

import android.view.View;
import android.view.ViewParent;

/* renamed from: a.b.c.h.m */
/* loaded from: classes.dex */
public class C0098m {

    /* renamed from: a */
    private ViewParent f390a;

    /* renamed from: b */
    private ViewParent f391b;

    /* renamed from: c */
    private final View f392c;

    /* renamed from: d */
    private boolean f393d;

    /* renamed from: e */
    private int[] f394e;

    public C0098m(View view) {
        this.f392c = view;
    }

    /* renamed from: a */
    private void m448a(int i, ViewParent viewParent) {
        if (i == 0) {
            this.f390a = viewParent;
        } else {
            if (i != 1) {
                return;
            }
            this.f391b = viewParent;
        }
    }

    /* renamed from: d */
    private ViewParent m449d(int i) {
        if (i == 0) {
            return this.f390a;
        }
        if (i != 1) {
            return null;
        }
        return this.f391b;
    }

    /* renamed from: a */
    public void m450a(boolean z) {
        if (this.f393d) {
            C0107v.m534v(this.f392c);
        }
        this.f393d = z;
    }

    /* renamed from: a */
    public boolean m451a() {
        return m454a(0);
    }

    /* renamed from: a */
    public boolean m452a(float f, float f2) {
        ViewParent m449d;
        if (!m460b() || (m449d = m449d(0)) == null) {
            return false;
        }
        return C0071E.m334a(m449d, this.f392c, f, f2);
    }

    /* renamed from: a */
    public boolean m453a(float f, float f2, boolean z) {
        ViewParent m449d;
        if (!m460b() || (m449d = m449d(0)) == null) {
            return false;
        }
        return C0071E.m335a(m449d, this.f392c, f, f2, z);
    }

    /* renamed from: a */
    public boolean m454a(int i) {
        return m449d(i) != null;
    }

    /* renamed from: a */
    public boolean m455a(int i, int i2) {
        if (m454a(i2)) {
            return true;
        }
        if (!m460b()) {
            return false;
        }
        View view = this.f392c;
        for (ViewParent parent = this.f392c.getParent(); parent != null; parent = parent.getParent()) {
            if (C0071E.m336b(parent, view, this.f392c, i, i2)) {
                m448a(i2, parent);
                C0071E.m333a(parent, view, this.f392c, i, i2);
                return true;
            }
            if (parent instanceof View) {
                view = (View) parent;
            }
        }
        return false;
    }

    /* renamed from: a */
    public boolean m456a(int i, int i2, int i3, int i4, int[] iArr) {
        return m457a(i, i2, i3, i4, iArr, 0);
    }

    /* renamed from: a */
    public boolean m457a(int i, int i2, int i3, int i4, int[] iArr, int i5) {
        ViewParent m449d;
        int i6;
        int i7;
        if (!m460b() || (m449d = m449d(i5)) == null) {
            return false;
        }
        if (i == 0 && i2 == 0 && i3 == 0 && i4 == 0) {
            if (iArr != null) {
                iArr[0] = 0;
                iArr[1] = 0;
            }
            return false;
        }
        if (iArr != null) {
            this.f392c.getLocationInWindow(iArr);
            i6 = iArr[0];
            i7 = iArr[1];
        } else {
            i6 = 0;
            i7 = 0;
        }
        C0071E.m331a(m449d, this.f392c, i, i2, i3, i4, i5);
        if (iArr != null) {
            this.f392c.getLocationInWindow(iArr);
            iArr[0] = iArr[0] - i6;
            iArr[1] = iArr[1] - i7;
        }
        return true;
    }

    /* renamed from: a */
    public boolean m458a(int i, int i2, int[] iArr, int[] iArr2) {
        return m459a(i, i2, iArr, iArr2, 0);
    }

    /* renamed from: a */
    public boolean m459a(int i, int i2, int[] iArr, int[] iArr2, int i3) {
        ViewParent m449d;
        int i4;
        int i5;
        if (!m460b() || (m449d = m449d(i3)) == null) {
            return false;
        }
        if (i == 0 && i2 == 0) {
            if (iArr2 != null) {
                iArr2[0] = 0;
                iArr2[1] = 0;
            }
            return false;
        }
        if (iArr2 != null) {
            this.f392c.getLocationInWindow(iArr2);
            i4 = iArr2[0];
            i5 = iArr2[1];
        } else {
            i4 = 0;
            i5 = 0;
        }
        if (iArr == null) {
            if (this.f394e == null) {
                this.f394e = new int[2];
            }
            iArr = this.f394e;
        }
        iArr[0] = 0;
        iArr[1] = 0;
        C0071E.m332a(m449d, this.f392c, i, i2, iArr, i3);
        if (iArr2 != null) {
            this.f392c.getLocationInWindow(iArr2);
            iArr2[0] = iArr2[0] - i4;
            iArr2[1] = iArr2[1] - i5;
        }
        return (iArr[0] == 0 && iArr[1] == 0) ? false : true;
    }

    /* renamed from: b */
    public boolean m460b() {
        return this.f393d;
    }

    /* renamed from: b */
    public boolean m461b(int i) {
        return m455a(i, 0);
    }

    /* renamed from: c */
    public void m462c() {
        m463c(0);
    }

    /* renamed from: c */
    public void m463c(int i) {
        ViewParent m449d = m449d(i);
        if (m449d != null) {
            C0071E.m330a(m449d, this.f392c, i);
            m448a(i, (ViewParent) null);
        }
    }
}
