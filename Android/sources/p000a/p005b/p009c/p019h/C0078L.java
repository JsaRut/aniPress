package p000a.p005b.p009c.p019h;

import android.os.Build;
import android.view.WindowInsets;

/* renamed from: a.b.c.h.L */
/* loaded from: classes.dex */
public class C0078L {

    /* renamed from: a */
    private final Object f332a;

    private C0078L(Object obj) {
        this.f332a = obj;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static C0078L m352a(Object obj) {
        if (obj == null) {
            return null;
        }
        return new C0078L(obj);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static Object m353a(C0078L c0078l) {
        if (c0078l == null) {
            return null;
        }
        return c0078l.f332a;
    }

    /* renamed from: a */
    public int m354a() {
        if (Build.VERSION.SDK_INT >= 20) {
            return ((WindowInsets) this.f332a).getSystemWindowInsetBottom();
        }
        return 0;
    }

    /* renamed from: a */
    public C0078L m355a(int i, int i2, int i3, int i4) {
        if (Build.VERSION.SDK_INT >= 20) {
            return new C0078L(((WindowInsets) this.f332a).replaceSystemWindowInsets(i, i2, i3, i4));
        }
        return null;
    }

    /* renamed from: b */
    public int m356b() {
        if (Build.VERSION.SDK_INT >= 20) {
            return ((WindowInsets) this.f332a).getSystemWindowInsetLeft();
        }
        return 0;
    }

    /* renamed from: c */
    public int m357c() {
        if (Build.VERSION.SDK_INT >= 20) {
            return ((WindowInsets) this.f332a).getSystemWindowInsetRight();
        }
        return 0;
    }

    /* renamed from: d */
    public int m358d() {
        if (Build.VERSION.SDK_INT >= 20) {
            return ((WindowInsets) this.f332a).getSystemWindowInsetTop();
        }
        return 0;
    }

    /* renamed from: e */
    public boolean m359e() {
        if (Build.VERSION.SDK_INT >= 21) {
            return ((WindowInsets) this.f332a).isConsumed();
        }
        return false;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C0078L.class != obj.getClass()) {
            return false;
        }
        C0078L c0078l = (C0078L) obj;
        Object obj2 = this.f332a;
        return obj2 == null ? c0078l.f332a == null : obj2.equals(c0078l.f332a);
    }

    public int hashCode() {
        Object obj = this.f332a;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }
}
