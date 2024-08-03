package p139d.p143b.p169g.p178e;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;

/* renamed from: d.b.g.e.t */
/* loaded from: classes.dex */
public class C1804t {

    /* renamed from: d.b.g.e.t$a */
    /* loaded from: classes.dex */
    public static abstract class a implements b {
        @Override // p139d.p143b.p169g.p178e.C1804t.b
        /* renamed from: a */
        public Matrix mo7394a(Matrix matrix, Rect rect, int i, int i2, float f, float f2) {
            mo6024a(matrix, rect, i, i2, f, f2, rect.width() / i, rect.height() / i2);
            return matrix;
        }

        /* renamed from: a */
        public abstract void mo6024a(Matrix matrix, Rect rect, int i, int i2, float f, float f2, float f3, float f4);
    }

    /* renamed from: d.b.g.e.t$b */
    /* loaded from: classes.dex */
    public interface b {

        /* renamed from: a */
        public static final b f6644a = j.f6660a;

        /* renamed from: b */
        public static final b f6645b = i.f6659a;

        /* renamed from: c */
        public static final b f6646c = g.f6657a;

        /* renamed from: d */
        public static final b f6647d = h.f6658a;

        /* renamed from: e */
        public static final b f6648e = c.f6653a;

        /* renamed from: f */
        public static final b f6649f = e.f6655a;

        /* renamed from: g */
        public static final b f6650g = d.f6654a;

        /* renamed from: h */
        public static final b f6651h = k.f6661a;

        /* renamed from: i */
        public static final b f6652i = f.f6656a;

        /* renamed from: a */
        Matrix mo7394a(Matrix matrix, Rect rect, int i, int i2, float f, float f2);
    }

    /* renamed from: d.b.g.e.t$c */
    /* loaded from: classes.dex */
    private static class c extends a {

        /* renamed from: a */
        public static final b f6653a = new c();

        private c() {
        }

        @Override // p139d.p143b.p169g.p178e.C1804t.a
        /* renamed from: a */
        public void mo6024a(Matrix matrix, Rect rect, int i, int i2, float f, float f2, float f3, float f4) {
            matrix.setTranslate((int) (rect.left + ((rect.width() - i) * 0.5f) + 0.5f), (int) (rect.top + ((rect.height() - i2) * 0.5f) + 0.5f));
        }

        public String toString() {
            return "center";
        }
    }

    /* renamed from: d.b.g.e.t$d */
    /* loaded from: classes.dex */
    private static class d extends a {

        /* renamed from: a */
        public static final b f6654a = new d();

        private d() {
        }

        @Override // p139d.p143b.p169g.p178e.C1804t.a
        /* renamed from: a */
        public void mo6024a(Matrix matrix, Rect rect, int i, int i2, float f, float f2, float f3, float f4) {
            float f5;
            float height;
            if (f4 > f3) {
                float width = rect.left + ((rect.width() - (i * f4)) * 0.5f);
                height = rect.top;
                f5 = width;
                f3 = f4;
            } else {
                f5 = rect.left;
                height = ((rect.height() - (i2 * f3)) * 0.5f) + rect.top;
            }
            matrix.setScale(f3, f3);
            matrix.postTranslate((int) (f5 + 0.5f), (int) (height + 0.5f));
        }

        public String toString() {
            return "center_crop";
        }
    }

    /* renamed from: d.b.g.e.t$e */
    /* loaded from: classes.dex */
    private static class e extends a {

        /* renamed from: a */
        public static final b f6655a = new e();

        private e() {
        }

        @Override // p139d.p143b.p169g.p178e.C1804t.a
        /* renamed from: a */
        public void mo6024a(Matrix matrix, Rect rect, int i, int i2, float f, float f2, float f3, float f4) {
            float min = Math.min(Math.min(f3, f4), 1.0f);
            float width = rect.left + ((rect.width() - (i * min)) * 0.5f);
            float height = rect.top + ((rect.height() - (i2 * min)) * 0.5f);
            matrix.setScale(min, min);
            matrix.postTranslate((int) (width + 0.5f), (int) (height + 0.5f));
        }

        public String toString() {
            return "center_inside";
        }
    }

    /* renamed from: d.b.g.e.t$f */
    /* loaded from: classes.dex */
    private static class f extends a {

        /* renamed from: a */
        public static final b f6656a = new f();

        private f() {
        }

        @Override // p139d.p143b.p169g.p178e.C1804t.a
        /* renamed from: a */
        public void mo6024a(Matrix matrix, Rect rect, int i, int i2, float f, float f2, float f3, float f4) {
            float min = Math.min(f3, f4);
            float f5 = rect.left;
            float height = rect.top + (rect.height() - (i2 * min));
            matrix.setScale(min, min);
            matrix.postTranslate((int) (f5 + 0.5f), (int) (height + 0.5f));
        }

        public String toString() {
            return "fit_bottom_start";
        }
    }

    /* renamed from: d.b.g.e.t$g */
    /* loaded from: classes.dex */
    private static class g extends a {

        /* renamed from: a */
        public static final b f6657a = new g();

        private g() {
        }

        @Override // p139d.p143b.p169g.p178e.C1804t.a
        /* renamed from: a */
        public void mo6024a(Matrix matrix, Rect rect, int i, int i2, float f, float f2, float f3, float f4) {
            float min = Math.min(f3, f4);
            float width = rect.left + ((rect.width() - (i * min)) * 0.5f);
            float height = rect.top + ((rect.height() - (i2 * min)) * 0.5f);
            matrix.setScale(min, min);
            matrix.postTranslate((int) (width + 0.5f), (int) (height + 0.5f));
        }

        public String toString() {
            return "fit_center";
        }
    }

    /* renamed from: d.b.g.e.t$h */
    /* loaded from: classes.dex */
    private static class h extends a {

        /* renamed from: a */
        public static final b f6658a = new h();

        private h() {
        }

        @Override // p139d.p143b.p169g.p178e.C1804t.a
        /* renamed from: a */
        public void mo6024a(Matrix matrix, Rect rect, int i, int i2, float f, float f2, float f3, float f4) {
            float min = Math.min(f3, f4);
            float width = rect.left + (rect.width() - (i * min));
            float height = rect.top + (rect.height() - (i2 * min));
            matrix.setScale(min, min);
            matrix.postTranslate((int) (width + 0.5f), (int) (height + 0.5f));
        }

        public String toString() {
            return "fit_end";
        }
    }

    /* renamed from: d.b.g.e.t$i */
    /* loaded from: classes.dex */
    private static class i extends a {

        /* renamed from: a */
        public static final b f6659a = new i();

        private i() {
        }

        @Override // p139d.p143b.p169g.p178e.C1804t.a
        /* renamed from: a */
        public void mo6024a(Matrix matrix, Rect rect, int i, int i2, float f, float f2, float f3, float f4) {
            float min = Math.min(f3, f4);
            float f5 = rect.left;
            float f6 = rect.top;
            matrix.setScale(min, min);
            matrix.postTranslate((int) (f5 + 0.5f), (int) (f6 + 0.5f));
        }

        public String toString() {
            return "fit_start";
        }
    }

    /* renamed from: d.b.g.e.t$j */
    /* loaded from: classes.dex */
    private static class j extends a {

        /* renamed from: a */
        public static final b f6660a = new j();

        private j() {
        }

        @Override // p139d.p143b.p169g.p178e.C1804t.a
        /* renamed from: a */
        public void mo6024a(Matrix matrix, Rect rect, int i, int i2, float f, float f2, float f3, float f4) {
            float f5 = rect.left;
            float f6 = rect.top;
            matrix.setScale(f3, f4);
            matrix.postTranslate((int) (f5 + 0.5f), (int) (f6 + 0.5f));
        }

        public String toString() {
            return "fit_xy";
        }
    }

    /* renamed from: d.b.g.e.t$k */
    /* loaded from: classes.dex */
    private static class k extends a {

        /* renamed from: a */
        public static final b f6661a = new k();

        private k() {
        }

        @Override // p139d.p143b.p169g.p178e.C1804t.a
        /* renamed from: a */
        public void mo6024a(Matrix matrix, Rect rect, int i, int i2, float f, float f2, float f3, float f4) {
            float f5;
            float max;
            if (f4 > f3) {
                float f6 = i * f4;
                f5 = rect.left + Math.max(Math.min((rect.width() * 0.5f) - (f * f6), 0.0f), rect.width() - f6);
                max = rect.top;
                f3 = f4;
            } else {
                f5 = rect.left;
                float f7 = i2 * f3;
                max = Math.max(Math.min((rect.height() * 0.5f) - (f2 * f7), 0.0f), rect.height() - f7) + rect.top;
            }
            matrix.setScale(f3, f3);
            matrix.postTranslate((int) (f5 + 0.5f), (int) (max + 0.5f));
        }

        public String toString() {
            return "focus_crop";
        }
    }

    /* renamed from: d.b.g.e.t$l */
    /* loaded from: classes.dex */
    public interface l {
        Object getState();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: a */
    public static C1803s m7393a(Drawable drawable) {
        if (drawable == 0) {
            return null;
        }
        if (drawable instanceof C1803s) {
            return (C1803s) drawable;
        }
        if (drawable instanceof InterfaceC1789e) {
            return m7393a(((InterfaceC1789e) drawable).mo7335a());
        }
        if (drawable instanceof C1786b) {
            C1786b c1786b = (C1786b) drawable;
            int m7338a = c1786b.m7338a();
            for (int i2 = 0; i2 < m7338a; i2++) {
                C1803s m7393a = m7393a(c1786b.m7339a(i2));
                if (m7393a != null) {
                    return m7393a;
                }
            }
        }
        return null;
    }
}
