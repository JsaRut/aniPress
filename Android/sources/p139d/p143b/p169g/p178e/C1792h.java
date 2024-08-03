package p139d.p143b.p169g.p178e;

import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import java.util.Arrays;
import p139d.p143b.p148c.p152d.C1691j;

/* renamed from: d.b.g.e.h */
/* loaded from: classes.dex */
public class C1792h extends C1786b {

    /* renamed from: i */
    private final Drawable[] f6549i;

    /* renamed from: j */
    int f6550j;

    /* renamed from: k */
    int f6551k;

    /* renamed from: l */
    long f6552l;

    /* renamed from: m */
    int[] f6553m;

    /* renamed from: n */
    int[] f6554n;

    /* renamed from: o */
    int f6555o;

    /* renamed from: p */
    boolean[] f6556p;

    /* renamed from: q */
    int f6557q;

    public C1792h(Drawable[] drawableArr) {
        super(drawableArr);
        C1691j.m6979b(drawableArr.length >= 1, "At least one layer required!");
        this.f6549i = drawableArr;
        this.f6553m = new int[drawableArr.length];
        this.f6554n = new int[drawableArr.length];
        this.f6555o = 255;
        this.f6556p = new boolean[drawableArr.length];
        this.f6557q = 0;
        m7359g();
    }

    /* renamed from: a */
    private void m7357a(Canvas canvas, Drawable drawable, int i) {
        if (drawable == null || i <= 0) {
            return;
        }
        this.f6557q++;
        drawable.mutate().setAlpha(i);
        this.f6557q--;
        drawable.draw(canvas);
    }

    /* renamed from: a */
    private boolean m7358a(float f) {
        boolean z = true;
        for (int i = 0; i < this.f6549i.length; i++) {
            int i2 = this.f6556p[i] ? 1 : -1;
            int[] iArr = this.f6554n;
            iArr[i] = (int) (this.f6553m[i] + (i2 * 255 * f));
            if (iArr[i] < 0) {
                iArr[i] = 0;
            }
            int[] iArr2 = this.f6554n;
            if (iArr2[i] > 255) {
                iArr2[i] = 255;
            }
            if (this.f6556p[i] && this.f6554n[i] < 255) {
                z = false;
            }
            if (!this.f6556p[i] && this.f6554n[i] > 0) {
                z = false;
            }
        }
        return z;
    }

    /* renamed from: g */
    private void m7359g() {
        this.f6550j = 2;
        Arrays.fill(this.f6553m, 0);
        this.f6553m[0] = 255;
        Arrays.fill(this.f6554n, 0);
        this.f6554n[0] = 255;
        Arrays.fill(this.f6556p, false);
        this.f6556p[0] = true;
    }

    /* renamed from: b */
    public void m7360b() {
        this.f6557q++;
    }

    /* renamed from: c */
    public void m7361c() {
        this.f6557q--;
        invalidateSelf();
    }

    /* renamed from: c */
    public void m7362c(int i) {
        this.f6550j = 0;
        this.f6556p[i] = true;
        invalidateSelf();
    }

    /* renamed from: d */
    public void m7363d() {
        this.f6550j = 0;
        Arrays.fill(this.f6556p, true);
        invalidateSelf();
    }

    /* renamed from: d */
    public void m7364d(int i) {
        this.f6550j = 0;
        this.f6556p[i] = false;
        invalidateSelf();
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0025, code lost:            if (r0 != false) goto L21;     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0047, code lost:            r1 = 1;     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0048, code lost:            r8.f6550j = r1;     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0044, code lost:            if (r0 != false) goto L21;     */
    @Override // p139d.p143b.p169g.p178e.C1786b, android.graphics.drawable.Drawable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void draw(android.graphics.Canvas r9) {
        /*
            r8 = this;
            int r0 = r8.f6550j
            r1 = 2
            r2 = 0
            r3 = 1
            if (r0 == 0) goto L28
            if (r0 == r3) goto Lb
            r0 = 1
            goto L4a
        Lb:
            int r0 = r8.f6551k
            if (r0 <= 0) goto L11
            r0 = 1
            goto L12
        L11:
            r0 = 0
        L12:
            p139d.p143b.p148c.p152d.C1691j.m6978b(r0)
            long r4 = r8.m7367f()
            long r6 = r8.f6552l
            long r4 = r4 - r6
            float r0 = (float) r4
            int r4 = r8.f6551k
            float r4 = (float) r4
            float r0 = r0 / r4
            boolean r0 = r8.m7358a(r0)
            if (r0 == 0) goto L47
            goto L48
        L28:
            int[] r0 = r8.f6554n
            int[] r4 = r8.f6553m
            android.graphics.drawable.Drawable[] r5 = r8.f6549i
            int r5 = r5.length
            java.lang.System.arraycopy(r0, r2, r4, r2, r5)
            long r4 = r8.m7367f()
            r8.f6552l = r4
            int r0 = r8.f6551k
            if (r0 != 0) goto L3f
            r0 = 1065353216(0x3f800000, float:1.0)
            goto L40
        L3f:
            r0 = 0
        L40:
            boolean r0 = r8.m7358a(r0)
            if (r0 == 0) goto L47
            goto L48
        L47:
            r1 = 1
        L48:
            r8.f6550j = r1
        L4a:
            android.graphics.drawable.Drawable[] r1 = r8.f6549i
            int r3 = r1.length
            if (r2 >= r3) goto L61
            r1 = r1[r2]
            int[] r3 = r8.f6554n
            r3 = r3[r2]
            int r4 = r8.f6555o
            int r3 = r3 * r4
            int r3 = r3 / 255
            r8.m7357a(r9, r1, r3)
            int r2 = r2 + 1
            goto L4a
        L61:
            if (r0 != 0) goto L66
            r8.invalidateSelf()
        L66:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p139d.p143b.p169g.p178e.C1792h.draw(android.graphics.Canvas):void");
    }

    /* renamed from: e */
    public void m7365e() {
        this.f6550j = 2;
        for (int i = 0; i < this.f6549i.length; i++) {
            this.f6554n[i] = this.f6556p[i] ? 255 : 0;
        }
        invalidateSelf();
    }

    /* renamed from: e */
    public void m7366e(int i) {
        this.f6551k = i;
        if (this.f6550j == 1) {
            this.f6550j = 0;
        }
    }

    /* renamed from: f */
    protected long m7367f() {
        return SystemClock.uptimeMillis();
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.f6555o;
    }

    @Override // android.graphics.drawable.Drawable
    public void invalidateSelf() {
        if (this.f6557q == 0) {
            super.invalidateSelf();
        }
    }

    @Override // p139d.p143b.p169g.p178e.C1786b, android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        if (this.f6555o != i) {
            this.f6555o = i;
            invalidateSelf();
        }
    }
}
