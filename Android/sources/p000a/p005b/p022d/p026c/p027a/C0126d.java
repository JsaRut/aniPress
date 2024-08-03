package p000a.p005b.p022d.p026c.p027a;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.support.v4.graphics.drawable.C0220a;
import android.util.SparseArray;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: a.b.d.c.a.d */
/* loaded from: classes.dex */
public class C0126d extends Drawable implements Drawable.Callback {

    /* renamed from: a */
    private b f434a;

    /* renamed from: b */
    private Rect f435b;

    /* renamed from: c */
    private Drawable f436c;

    /* renamed from: d */
    private Drawable f437d;

    /* renamed from: f */
    private boolean f439f;

    /* renamed from: i */
    private boolean f442i;

    /* renamed from: j */
    private Runnable f443j;

    /* renamed from: k */
    private long f444k;

    /* renamed from: l */
    private long f445l;

    /* renamed from: m */
    private a f446m;

    /* renamed from: e */
    private int f438e = 255;

    /* renamed from: g */
    private int f440g = -1;

    /* renamed from: h */
    private int f441h = -1;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a.b.d.c.a.d$a */
    /* loaded from: classes.dex */
    public static class a implements Drawable.Callback {

        /* renamed from: a */
        private Drawable.Callback f447a;

        a() {
        }

        /* renamed from: a */
        public a m586a(Drawable.Callback callback) {
            this.f447a = callback;
            return this;
        }

        /* renamed from: a */
        public Drawable.Callback m587a() {
            Drawable.Callback callback = this.f447a;
            this.f447a = null;
            return callback;
        }

        @Override // android.graphics.drawable.Drawable.Callback
        public void invalidateDrawable(Drawable drawable) {
        }

        @Override // android.graphics.drawable.Drawable.Callback
        public void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
            Drawable.Callback callback = this.f447a;
            if (callback != null) {
                callback.scheduleDrawable(drawable, runnable, j);
            }
        }

        @Override // android.graphics.drawable.Drawable.Callback
        public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
            Drawable.Callback callback = this.f447a;
            if (callback != null) {
                callback.unscheduleDrawable(drawable, runnable);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a.b.d.c.a.d$b */
    /* loaded from: classes.dex */
    public static abstract class b extends Drawable.ConstantState {

        /* renamed from: A */
        int f448A;

        /* renamed from: B */
        int f449B;

        /* renamed from: C */
        boolean f450C;

        /* renamed from: D */
        ColorFilter f451D;

        /* renamed from: E */
        boolean f452E;

        /* renamed from: F */
        ColorStateList f453F;

        /* renamed from: G */
        PorterDuff.Mode f454G;

        /* renamed from: H */
        boolean f455H;

        /* renamed from: I */
        boolean f456I;

        /* renamed from: a */
        final C0126d f457a;

        /* renamed from: b */
        Resources f458b;

        /* renamed from: c */
        int f459c;

        /* renamed from: d */
        int f460d;

        /* renamed from: e */
        int f461e;

        /* renamed from: f */
        SparseArray<Drawable.ConstantState> f462f;

        /* renamed from: g */
        Drawable[] f463g;

        /* renamed from: h */
        int f464h;

        /* renamed from: i */
        boolean f465i;

        /* renamed from: j */
        boolean f466j;

        /* renamed from: k */
        Rect f467k;

        /* renamed from: l */
        boolean f468l;

        /* renamed from: m */
        boolean f469m;

        /* renamed from: n */
        int f470n;

        /* renamed from: o */
        int f471o;

        /* renamed from: p */
        int f472p;

        /* renamed from: q */
        int f473q;

        /* renamed from: r */
        boolean f474r;

        /* renamed from: s */
        int f475s;

        /* renamed from: t */
        boolean f476t;

        /* renamed from: u */
        boolean f477u;

        /* renamed from: v */
        boolean f478v;

        /* renamed from: w */
        boolean f479w;

        /* renamed from: x */
        boolean f480x;

        /* renamed from: y */
        boolean f481y;

        /* renamed from: z */
        int f482z;

        /* JADX INFO: Access modifiers changed from: package-private */
        public b(b bVar, C0126d c0126d, Resources resources) {
            this.f459c = 160;
            this.f465i = false;
            this.f468l = false;
            this.f480x = true;
            this.f448A = 0;
            this.f449B = 0;
            this.f457a = c0126d;
            this.f458b = resources != null ? resources : bVar != null ? bVar.f458b : null;
            this.f459c = C0126d.m579a(resources, bVar != null ? bVar.f459c : 0);
            if (bVar == null) {
                this.f463g = new Drawable[10];
                this.f464h = 0;
                return;
            }
            this.f460d = bVar.f460d;
            this.f461e = bVar.f461e;
            this.f478v = true;
            this.f479w = true;
            this.f465i = bVar.f465i;
            this.f468l = bVar.f468l;
            this.f480x = bVar.f480x;
            this.f481y = bVar.f481y;
            this.f482z = bVar.f482z;
            this.f448A = bVar.f448A;
            this.f449B = bVar.f449B;
            this.f450C = bVar.f450C;
            this.f451D = bVar.f451D;
            this.f452E = bVar.f452E;
            this.f453F = bVar.f453F;
            this.f454G = bVar.f454G;
            this.f455H = bVar.f455H;
            this.f456I = bVar.f456I;
            if (bVar.f459c == this.f459c) {
                if (bVar.f466j) {
                    this.f467k = new Rect(bVar.f467k);
                    this.f466j = true;
                }
                if (bVar.f469m) {
                    this.f470n = bVar.f470n;
                    this.f471o = bVar.f471o;
                    this.f472p = bVar.f472p;
                    this.f473q = bVar.f473q;
                    this.f469m = true;
                }
            }
            if (bVar.f474r) {
                this.f475s = bVar.f475s;
                this.f474r = true;
            }
            if (bVar.f476t) {
                this.f477u = bVar.f477u;
                this.f476t = true;
            }
            Drawable[] drawableArr = bVar.f463g;
            this.f463g = new Drawable[drawableArr.length];
            this.f464h = bVar.f464h;
            SparseArray<Drawable.ConstantState> sparseArray = bVar.f462f;
            this.f462f = sparseArray != null ? sparseArray.clone() : new SparseArray<>(this.f464h);
            int i = this.f464h;
            for (int i2 = 0; i2 < i; i2++) {
                if (drawableArr[i2] != null) {
                    Drawable.ConstantState constantState = drawableArr[i2].getConstantState();
                    if (constantState != null) {
                        this.f462f.put(i2, constantState);
                    } else {
                        this.f463g[i2] = drawableArr[i2];
                    }
                }
            }
        }

        /* renamed from: b */
        private Drawable m588b(Drawable drawable) {
            if (Build.VERSION.SDK_INT >= 23) {
                drawable.setLayoutDirection(this.f482z);
            }
            Drawable mutate = drawable.mutate();
            mutate.setCallback(this.f457a);
            return mutate;
        }

        /* renamed from: n */
        private void m589n() {
            SparseArray<Drawable.ConstantState> sparseArray = this.f462f;
            if (sparseArray != null) {
                int size = sparseArray.size();
                for (int i = 0; i < size; i++) {
                    this.f463g[this.f462f.keyAt(i)] = m588b(this.f462f.valueAt(i).newDrawable(this.f458b));
                }
                this.f462f = null;
            }
        }

        /* renamed from: a */
        public final int m590a(Drawable drawable) {
            int i = this.f464h;
            if (i >= this.f463g.length) {
                mo592a(i, i + 10);
            }
            drawable.mutate();
            drawable.setVisible(false, true);
            drawable.setCallback(this.f457a);
            this.f463g[i] = drawable;
            this.f464h++;
            this.f461e = drawable.getChangingConfigurations() | this.f461e;
            m610k();
            this.f467k = null;
            this.f466j = false;
            this.f469m = false;
            this.f478v = false;
            return i;
        }

        /* renamed from: a */
        public final Drawable m591a(int i) {
            int indexOfKey;
            Drawable drawable = this.f463g[i];
            if (drawable != null) {
                return drawable;
            }
            SparseArray<Drawable.ConstantState> sparseArray = this.f462f;
            if (sparseArray == null || (indexOfKey = sparseArray.indexOfKey(i)) < 0) {
                return null;
            }
            Drawable m588b = m588b(this.f462f.valueAt(indexOfKey).newDrawable(this.f458b));
            this.f463g[i] = m588b;
            this.f462f.removeAt(indexOfKey);
            if (this.f462f.size() == 0) {
                this.f462f = null;
            }
            return m588b;
        }

        /* renamed from: a */
        public void mo592a(int i, int i2) {
            Drawable[] drawableArr = new Drawable[i2];
            System.arraycopy(this.f463g, 0, drawableArr, 0, i);
            this.f463g = drawableArr;
        }

        /* renamed from: a */
        final void m593a(Resources.Theme theme) {
            if (theme != null) {
                m589n();
                int i = this.f464h;
                Drawable[] drawableArr = this.f463g;
                for (int i2 = 0; i2 < i; i2++) {
                    if (drawableArr[i2] != null && drawableArr[i2].canApplyTheme()) {
                        drawableArr[i2].applyTheme(theme);
                        this.f461e |= drawableArr[i2].getChangingConfigurations();
                    }
                }
                m594a(theme.getResources());
            }
        }

        /* renamed from: a */
        final void m594a(Resources resources) {
            if (resources != null) {
                this.f458b = resources;
                int m579a = C0126d.m579a(resources, this.f459c);
                int i = this.f459c;
                this.f459c = m579a;
                if (i != m579a) {
                    this.f469m = false;
                    this.f466j = false;
                }
            }
        }

        /* renamed from: a */
        public final void m595a(boolean z) {
            this.f468l = z;
        }

        /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
        /* renamed from: a */
        public synchronized boolean m596a() {
            if (this.f478v) {
                return this.f479w;
            }
            m589n();
            this.f478v = true;
            int i = this.f464h;
            Drawable[] drawableArr = this.f463g;
            for (int i2 = 0; i2 < i; i2++) {
                if (drawableArr[i2].getConstantState() == null) {
                    this.f479w = false;
                    return false;
                }
            }
            this.f479w = true;
            return true;
        }

        /* renamed from: b */
        protected void m597b() {
            this.f469m = true;
            m589n();
            int i = this.f464h;
            Drawable[] drawableArr = this.f463g;
            this.f471o = -1;
            this.f470n = -1;
            this.f473q = 0;
            this.f472p = 0;
            for (int i2 = 0; i2 < i; i2++) {
                Drawable drawable = drawableArr[i2];
                int intrinsicWidth = drawable.getIntrinsicWidth();
                if (intrinsicWidth > this.f470n) {
                    this.f470n = intrinsicWidth;
                }
                int intrinsicHeight = drawable.getIntrinsicHeight();
                if (intrinsicHeight > this.f471o) {
                    this.f471o = intrinsicHeight;
                }
                int minimumWidth = drawable.getMinimumWidth();
                if (minimumWidth > this.f472p) {
                    this.f472p = minimumWidth;
                }
                int minimumHeight = drawable.getMinimumHeight();
                if (minimumHeight > this.f473q) {
                    this.f473q = minimumHeight;
                }
            }
        }

        /* renamed from: b */
        public final void m598b(int i) {
            this.f448A = i;
        }

        /* renamed from: b */
        public final void m599b(boolean z) {
            this.f465i = z;
        }

        /* renamed from: b */
        final boolean m600b(int i, int i2) {
            int i3 = this.f464h;
            Drawable[] drawableArr = this.f463g;
            boolean z = false;
            for (int i4 = 0; i4 < i3; i4++) {
                if (drawableArr[i4] != null) {
                    boolean layoutDirection = Build.VERSION.SDK_INT >= 23 ? drawableArr[i4].setLayoutDirection(i) : false;
                    if (i4 == i2) {
                        z = layoutDirection;
                    }
                }
            }
            this.f482z = i;
            return z;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: c */
        public final int m601c() {
            return this.f463g.length;
        }

        /* renamed from: c */
        public final void m602c(int i) {
            this.f449B = i;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public boolean canApplyTheme() {
            int i = this.f464h;
            Drawable[] drawableArr = this.f463g;
            for (int i2 = 0; i2 < i; i2++) {
                Drawable drawable = drawableArr[i2];
                if (drawable == null) {
                    Drawable.ConstantState constantState = this.f462f.get(i2);
                    if (constantState != null && constantState.canApplyTheme()) {
                        return true;
                    }
                } else if (drawable.canApplyTheme()) {
                    return true;
                }
            }
            return false;
        }

        /* renamed from: d */
        public final int m603d() {
            return this.f464h;
        }

        /* renamed from: e */
        public final int m604e() {
            if (!this.f469m) {
                m597b();
            }
            return this.f471o;
        }

        /* renamed from: f */
        public final int m605f() {
            if (!this.f469m) {
                m597b();
            }
            return this.f473q;
        }

        /* renamed from: g */
        public final int m606g() {
            if (!this.f469m) {
                m597b();
            }
            return this.f472p;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return this.f460d | this.f461e;
        }

        /* renamed from: h */
        public final Rect m607h() {
            if (this.f465i) {
                return null;
            }
            if (this.f467k != null || this.f466j) {
                return this.f467k;
            }
            m589n();
            Rect rect = new Rect();
            int i = this.f464h;
            Drawable[] drawableArr = this.f463g;
            Rect rect2 = null;
            for (int i2 = 0; i2 < i; i2++) {
                if (drawableArr[i2].getPadding(rect)) {
                    if (rect2 == null) {
                        rect2 = new Rect(0, 0, 0, 0);
                    }
                    int i3 = rect.left;
                    if (i3 > rect2.left) {
                        rect2.left = i3;
                    }
                    int i4 = rect.top;
                    if (i4 > rect2.top) {
                        rect2.top = i4;
                    }
                    int i5 = rect.right;
                    if (i5 > rect2.right) {
                        rect2.right = i5;
                    }
                    int i6 = rect.bottom;
                    if (i6 > rect2.bottom) {
                        rect2.bottom = i6;
                    }
                }
            }
            this.f466j = true;
            this.f467k = rect2;
            return rect2;
        }

        /* renamed from: i */
        public final int m608i() {
            if (!this.f469m) {
                m597b();
            }
            return this.f470n;
        }

        /* renamed from: j */
        public final int m609j() {
            if (this.f474r) {
                return this.f475s;
            }
            m589n();
            int i = this.f464h;
            Drawable[] drawableArr = this.f463g;
            int opacity = i > 0 ? drawableArr[0].getOpacity() : -2;
            for (int i2 = 1; i2 < i; i2++) {
                opacity = Drawable.resolveOpacity(opacity, drawableArr[i2].getOpacity());
            }
            this.f475s = opacity;
            this.f474r = true;
            return opacity;
        }

        /* renamed from: k */
        void m610k() {
            this.f474r = false;
            this.f476t = false;
        }

        /* renamed from: l */
        public final boolean m611l() {
            return this.f468l;
        }

        /* renamed from: m */
        abstract void mo574m();
    }

    /* renamed from: a */
    static int m579a(Resources resources, int i) {
        if (resources != null) {
            i = resources.getDisplayMetrics().densityDpi;
        }
        if (i == 0) {
            return 160;
        }
        return i;
    }

    /* renamed from: a */
    private void m580a(Drawable drawable) {
        if (this.f446m == null) {
            this.f446m = new a();
        }
        a aVar = this.f446m;
        aVar.m586a(drawable.getCallback());
        drawable.setCallback(aVar);
        try {
            if (this.f434a.f448A <= 0 && this.f439f) {
                drawable.setAlpha(this.f438e);
            }
            if (this.f434a.f452E) {
                drawable.setColorFilter(this.f434a.f451D);
            } else {
                if (this.f434a.f455H) {
                    C0220a.m1195a(drawable, this.f434a.f453F);
                }
                if (this.f434a.f456I) {
                    C0220a.m1198a(drawable, this.f434a.f454G);
                }
            }
            drawable.setVisible(isVisible(), true);
            drawable.setDither(this.f434a.f480x);
            drawable.setState(getState());
            drawable.setLevel(getLevel());
            drawable.setBounds(getBounds());
            if (Build.VERSION.SDK_INT >= 23) {
                drawable.setLayoutDirection(getLayoutDirection());
            }
            if (Build.VERSION.SDK_INT >= 19) {
                drawable.setAutoMirrored(this.f434a.f450C);
            }
            Rect rect = this.f435b;
            if (Build.VERSION.SDK_INT >= 21 && rect != null) {
                drawable.setHotspotBounds(rect.left, rect.top, rect.right, rect.bottom);
            }
        } finally {
            drawable.setCallback(this.f446m.m587a());
        }
    }

    @SuppressLint({"WrongConstant"})
    @TargetApi(23)
    /* renamed from: c */
    private boolean m581c() {
        return isAutoMirrored() && getLayoutDirection() == 1;
    }

    /* renamed from: a */
    b mo561a() {
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: a */
    public void mo562a(b bVar) {
        this.f434a = bVar;
        int i = this.f440g;
        if (i >= 0) {
            this.f436c = bVar.m591a(i);
            Drawable drawable = this.f436c;
            if (drawable != null) {
                m580a(drawable);
            }
        }
        this.f441h = -1;
        this.f437d = null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public final void m582a(Resources resources) {
        this.f434a.m594a(resources);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:11:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0069 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:23:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void m583a(boolean r14) {
        /*
            r13 = this;
            r0 = 1
            r13.f439f = r0
            long r1 = android.os.SystemClock.uptimeMillis()
            android.graphics.drawable.Drawable r3 = r13.f436c
            r4 = 255(0xff, double:1.26E-321)
            r6 = 0
            r7 = 0
            if (r3 == 0) goto L36
            long r9 = r13.f444k
            int r11 = (r9 > r7 ? 1 : (r9 == r7 ? 0 : -1))
            if (r11 == 0) goto L38
            int r11 = (r9 > r1 ? 1 : (r9 == r1 ? 0 : -1))
            if (r11 > 0) goto L20
            int r9 = r13.f438e
            r3.setAlpha(r9)
            goto L36
        L20:
            long r9 = r9 - r1
            long r9 = r9 * r4
            int r10 = (int) r9
            a.b.d.c.a.d$b r9 = r13.f434a
            int r9 = r9.f448A
            int r10 = r10 / r9
            int r9 = 255 - r10
            int r10 = r13.f438e
            int r9 = r9 * r10
            int r9 = r9 / 255
            r3.setAlpha(r9)
            r3 = 1
            goto L39
        L36:
            r13.f444k = r7
        L38:
            r3 = 0
        L39:
            android.graphics.drawable.Drawable r9 = r13.f437d
            if (r9 == 0) goto L64
            long r10 = r13.f445l
            int r12 = (r10 > r7 ? 1 : (r10 == r7 ? 0 : -1))
            if (r12 == 0) goto L66
            int r12 = (r10 > r1 ? 1 : (r10 == r1 ? 0 : -1))
            if (r12 > 0) goto L51
            r9.setVisible(r6, r6)
            r0 = 0
            r13.f437d = r0
            r0 = -1
            r13.f441h = r0
            goto L64
        L51:
            long r10 = r10 - r1
            long r10 = r10 * r4
            int r3 = (int) r10
            a.b.d.c.a.d$b r4 = r13.f434a
            int r4 = r4.f449B
            int r3 = r3 / r4
            int r4 = r13.f438e
            int r3 = r3 * r4
            int r3 = r3 / 255
            r9.setAlpha(r3)
            goto L67
        L64:
            r13.f445l = r7
        L66:
            r0 = r3
        L67:
            if (r14 == 0) goto L73
            if (r0 == 0) goto L73
            java.lang.Runnable r14 = r13.f443j
            r3 = 16
            long r1 = r1 + r3
            r13.scheduleSelf(r14, r1)
        L73:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p000a.p005b.p022d.p026c.p027a.C0126d.m583a(boolean):void");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0079  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean m584a(int r9) {
        /*
            r8 = this;
            int r0 = r8.f440g
            r1 = 0
            if (r9 != r0) goto L6
            return r1
        L6:
            long r2 = android.os.SystemClock.uptimeMillis()
            a.b.d.c.a.d$b r0 = r8.f434a
            int r0 = r0.f449B
            r4 = -1
            r5 = 0
            r6 = 0
            if (r0 <= 0) goto L35
            android.graphics.drawable.Drawable r0 = r8.f437d
            if (r0 == 0) goto L1b
            r0.setVisible(r1, r1)
        L1b:
            android.graphics.drawable.Drawable r0 = r8.f436c
            if (r0 == 0) goto L2e
            r8.f437d = r0
            int r0 = r8.f440g
            r8.f441h = r0
            a.b.d.c.a.d$b r0 = r8.f434a
            int r0 = r0.f449B
            long r0 = (long) r0
            long r0 = r0 + r2
            r8.f445l = r0
            goto L3c
        L2e:
            r8.f437d = r5
            r8.f441h = r4
            r8.f445l = r6
            goto L3c
        L35:
            android.graphics.drawable.Drawable r0 = r8.f436c
            if (r0 == 0) goto L3c
            r0.setVisible(r1, r1)
        L3c:
            if (r9 < 0) goto L5c
            a.b.d.c.a.d$b r0 = r8.f434a
            int r1 = r0.f464h
            if (r9 >= r1) goto L5c
            android.graphics.drawable.Drawable r0 = r0.m591a(r9)
            r8.f436c = r0
            r8.f440g = r9
            if (r0 == 0) goto L60
            a.b.d.c.a.d$b r9 = r8.f434a
            int r9 = r9.f448A
            if (r9 <= 0) goto L58
            long r4 = (long) r9
            long r2 = r2 + r4
            r8.f444k = r2
        L58:
            r8.m580a(r0)
            goto L60
        L5c:
            r8.f436c = r5
            r8.f440g = r4
        L60:
            long r0 = r8.f444k
            r9 = 1
            int r2 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r2 != 0) goto L6d
            long r0 = r8.f445l
            int r2 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r2 == 0) goto L7f
        L6d:
            java.lang.Runnable r0 = r8.f443j
            if (r0 != 0) goto L79
            a.b.d.c.a.c r0 = new a.b.d.c.a.c
            r0.<init>(r8)
            r8.f443j = r0
            goto L7c
        L79:
            r8.unscheduleSelf(r0)
        L7c:
            r8.m583a(r9)
        L7f:
            r8.invalidateSelf()
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: p000a.p005b.p022d.p026c.p027a.C0126d.m584a(int):boolean");
    }

    @Override // android.graphics.drawable.Drawable
    public void applyTheme(Resources.Theme theme) {
        this.f434a.m593a(theme);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public int m585b() {
        return this.f440g;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean canApplyTheme() {
        return this.f434a.canApplyTheme();
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        Drawable drawable = this.f436c;
        if (drawable != null) {
            drawable.draw(canvas);
        }
        Drawable drawable2 = this.f437d;
        if (drawable2 != null) {
            drawable2.draw(canvas);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.f438e;
    }

    @Override // android.graphics.drawable.Drawable
    public int getChangingConfigurations() {
        return super.getChangingConfigurations() | this.f434a.getChangingConfigurations();
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        if (!this.f434a.m596a()) {
            return null;
        }
        this.f434a.f460d = getChangingConfigurations();
        return this.f434a;
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable getCurrent() {
        return this.f436c;
    }

    @Override // android.graphics.drawable.Drawable
    public void getHotspotBounds(Rect rect) {
        Rect rect2 = this.f435b;
        if (rect2 != null) {
            rect.set(rect2);
        } else {
            super.getHotspotBounds(rect);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        if (this.f434a.m611l()) {
            return this.f434a.m604e();
        }
        Drawable drawable = this.f436c;
        if (drawable != null) {
            return drawable.getIntrinsicHeight();
        }
        return -1;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        if (this.f434a.m611l()) {
            return this.f434a.m608i();
        }
        Drawable drawable = this.f436c;
        if (drawable != null) {
            return drawable.getIntrinsicWidth();
        }
        return -1;
    }

    @Override // android.graphics.drawable.Drawable
    public int getMinimumHeight() {
        if (this.f434a.m611l()) {
            return this.f434a.m605f();
        }
        Drawable drawable = this.f436c;
        if (drawable != null) {
            return drawable.getMinimumHeight();
        }
        return 0;
    }

    @Override // android.graphics.drawable.Drawable
    public int getMinimumWidth() {
        if (this.f434a.m611l()) {
            return this.f434a.m606g();
        }
        Drawable drawable = this.f436c;
        if (drawable != null) {
            return drawable.getMinimumWidth();
        }
        return 0;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        Drawable drawable = this.f436c;
        if (drawable == null || !drawable.isVisible()) {
            return -2;
        }
        return this.f434a.m609j();
    }

    @Override // android.graphics.drawable.Drawable
    public void getOutline(Outline outline) {
        Drawable drawable = this.f436c;
        if (drawable != null) {
            drawable.getOutline(outline);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean getPadding(Rect rect) {
        boolean padding;
        Rect m607h = this.f434a.m607h();
        if (m607h != null) {
            rect.set(m607h);
            padding = (m607h.right | ((m607h.left | m607h.top) | m607h.bottom)) != 0;
        } else {
            Drawable drawable = this.f436c;
            padding = drawable != null ? drawable.getPadding(rect) : super.getPadding(rect);
        }
        if (m581c()) {
            int i = rect.left;
            rect.left = rect.right;
            rect.right = i;
        }
        return padding;
    }

    public void invalidateDrawable(Drawable drawable) {
        b bVar = this.f434a;
        if (bVar != null) {
            bVar.m610k();
        }
        if (drawable != this.f436c || getCallback() == null) {
            return;
        }
        getCallback().invalidateDrawable(this);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isAutoMirrored() {
        return this.f434a.f450C;
    }

    @Override // android.graphics.drawable.Drawable
    public void jumpToCurrentState() {
        boolean z;
        Drawable drawable = this.f437d;
        if (drawable != null) {
            drawable.jumpToCurrentState();
            this.f437d = null;
            this.f441h = -1;
            z = true;
        } else {
            z = false;
        }
        Drawable drawable2 = this.f436c;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
            if (this.f439f) {
                this.f436c.setAlpha(this.f438e);
            }
        }
        if (this.f445l != 0) {
            this.f445l = 0L;
            z = true;
        }
        if (this.f444k != 0) {
            this.f444k = 0L;
            z = true;
        }
        if (z) {
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable mutate() {
        if (!this.f442i && super.mutate() == this) {
            b mo561a = mo561a();
            mo561a.mo574m();
            mo562a(mo561a);
            this.f442i = true;
        }
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    protected void onBoundsChange(Rect rect) {
        Drawable drawable = this.f437d;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
        Drawable drawable2 = this.f436c;
        if (drawable2 != null) {
            drawable2.setBounds(rect);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onLayoutDirectionChanged(int i) {
        return this.f434a.m600b(i, m585b());
    }

    @Override // android.graphics.drawable.Drawable
    protected boolean onLevelChange(int i) {
        Drawable drawable = this.f437d;
        if (drawable != null) {
            return drawable.setLevel(i);
        }
        Drawable drawable2 = this.f436c;
        if (drawable2 != null) {
            return drawable2.setLevel(i);
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.graphics.drawable.Drawable
    public boolean onStateChange(int[] iArr) {
        Drawable drawable = this.f437d;
        if (drawable != null) {
            return drawable.setState(iArr);
        }
        Drawable drawable2 = this.f436c;
        if (drawable2 != null) {
            return drawable2.setState(iArr);
        }
        return false;
    }

    public void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        if (drawable != this.f436c || getCallback() == null) {
            return;
        }
        getCallback().scheduleDrawable(this, runnable, j);
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        if (this.f439f && this.f438e == i) {
            return;
        }
        this.f439f = true;
        this.f438e = i;
        Drawable drawable = this.f436c;
        if (drawable != null) {
            if (this.f444k == 0) {
                drawable.setAlpha(i);
            } else {
                m583a(false);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setAutoMirrored(boolean z) {
        b bVar = this.f434a;
        if (bVar.f450C != z) {
            bVar.f450C = z;
            Drawable drawable = this.f436c;
            if (drawable != null) {
                C0220a.m1199a(drawable, bVar.f450C);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        b bVar = this.f434a;
        bVar.f452E = true;
        if (bVar.f451D != colorFilter) {
            bVar.f451D = colorFilter;
            Drawable drawable = this.f436c;
            if (drawable != null) {
                drawable.setColorFilter(colorFilter);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setDither(boolean z) {
        b bVar = this.f434a;
        if (bVar.f480x != z) {
            bVar.f480x = z;
            Drawable drawable = this.f436c;
            if (drawable != null) {
                drawable.setDither(bVar.f480x);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setHotspot(float f, float f2) {
        Drawable drawable = this.f436c;
        if (drawable != null) {
            C0220a.m1193a(drawable, f, f2);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setHotspotBounds(int i, int i2, int i3, int i4) {
        Rect rect = this.f435b;
        if (rect == null) {
            this.f435b = new Rect(i, i2, i3, i4);
        } else {
            rect.set(i, i2, i3, i4);
        }
        Drawable drawable = this.f436c;
        if (drawable != null) {
            C0220a.m1194a(drawable, i, i2, i3, i4);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintList(ColorStateList colorStateList) {
        b bVar = this.f434a;
        bVar.f455H = true;
        if (bVar.f453F != colorStateList) {
            bVar.f453F = colorStateList;
            C0220a.m1195a(this.f436c, colorStateList);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintMode(PorterDuff.Mode mode) {
        b bVar = this.f434a;
        bVar.f456I = true;
        if (bVar.f454G != mode) {
            bVar.f454G = mode;
            C0220a.m1198a(this.f436c, mode);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z, boolean z2) {
        boolean visible = super.setVisible(z, z2);
        Drawable drawable = this.f437d;
        if (drawable != null) {
            drawable.setVisible(z, z2);
        }
        Drawable drawable2 = this.f436c;
        if (drawable2 != null) {
            drawable2.setVisible(z, z2);
        }
        return visible;
    }

    public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        if (drawable != this.f436c || getCallback() == null) {
            return;
        }
        getCallback().unscheduleDrawable(this, runnable);
    }
}
