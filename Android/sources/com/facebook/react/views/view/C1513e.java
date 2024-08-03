package com.facebook.react.views.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.DashPathEffect;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.Build;
import com.facebook.react.modules.i18nmanager.C1190a;
import com.facebook.react.uimanager.C1277M;
import com.facebook.react.uimanager.C1349i;
import com.facebook.yoga.C1553a;
import java.util.Arrays;
import java.util.Locale;

/* renamed from: com.facebook.react.views.view.e */
/* loaded from: classes.dex */
public class C1513e extends Drawable {

    /* renamed from: a */
    private C1277M f5565a;

    /* renamed from: b */
    private C1277M f5566b;

    /* renamed from: c */
    private C1277M f5567c;

    /* renamed from: d */
    private b f5568d;

    /* renamed from: e */
    private PathEffect f5569e;

    /* renamed from: f */
    private Path f5570f;

    /* renamed from: g */
    private Path f5571g;

    /* renamed from: h */
    private Path f5572h;

    /* renamed from: i */
    private Path f5573i;

    /* renamed from: j */
    private Path f5574j;

    /* renamed from: k */
    private RectF f5575k;

    /* renamed from: l */
    private RectF f5576l;

    /* renamed from: m */
    private RectF f5577m;

    /* renamed from: n */
    private RectF f5578n;

    /* renamed from: o */
    private PointF f5579o;

    /* renamed from: p */
    private PointF f5580p;

    /* renamed from: q */
    private PointF f5581q;

    /* renamed from: r */
    private PointF f5582r;

    /* renamed from: s */
    private boolean f5583s = false;

    /* renamed from: t */
    private float f5584t = Float.NaN;

    /* renamed from: u */
    private final Paint f5585u = new Paint(1);

    /* renamed from: v */
    private int f5586v = 0;

    /* renamed from: w */
    private int f5587w = 255;

    /* renamed from: x */
    private float[] f5588x;

    /* renamed from: y */
    private final Context f5589y;

    /* renamed from: z */
    private int f5590z;

    /* renamed from: com.facebook.react.views.view.e$a */
    /* loaded from: classes.dex */
    public enum a {
        TOP_LEFT,
        TOP_RIGHT,
        BOTTOM_RIGHT,
        BOTTOM_LEFT,
        TOP_START,
        TOP_END,
        BOTTOM_START,
        BOTTOM_END
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.facebook.react.views.view.e$b */
    /* loaded from: classes.dex */
    public enum b {
        SOLID,
        DASHED,
        DOTTED;

        /* renamed from: a */
        public static PathEffect m6327a(b bVar, float f) {
            int i = C1512d.f5564a[bVar.ordinal()];
            if (i == 1) {
                return null;
            }
            if (i == 2) {
                float f2 = f * 3.0f;
                return new DashPathEffect(new float[]{f2, f2, f2, f2}, 0.0f);
            }
            if (i != 3) {
                return null;
            }
            return new DashPathEffect(new float[]{f, f, f, f}, 0.0f);
        }
    }

    public C1513e(Context context) {
        this.f5589y = context;
    }

    /* renamed from: a */
    private static int m6298a(float f, float f2) {
        return ((((int) f) << 24) & (-16777216)) | (((int) f2) & 16777215);
    }

    /* renamed from: a */
    private static int m6299a(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        int i9 = (i4 > 0 ? i8 : -1) & (i > 0 ? i5 : -1) & (i2 > 0 ? i6 : -1) & (i3 > 0 ? i7 : -1);
        if (i <= 0) {
            i5 = 0;
        }
        if (i2 <= 0) {
            i6 = 0;
        }
        int i10 = i5 | i6;
        if (i3 <= 0) {
            i7 = 0;
        }
        int i11 = i10 | i7;
        if (i4 <= 0) {
            i8 = 0;
        }
        if (i9 == (i11 | i8)) {
            return i9;
        }
        return 0;
    }

    /* renamed from: a */
    private static void m6300a(double d2, double d3, double d4, double d5, double d6, double d7, double d8, double d9, PointF pointF) {
        double d10 = (d2 + d4) / 2.0d;
        double d11 = (d3 + d5) / 2.0d;
        double d12 = d6 - d10;
        double d13 = d7 - d11;
        double abs = Math.abs(d4 - d2) / 2.0d;
        double abs2 = Math.abs(d5 - d3) / 2.0d;
        double d14 = ((d9 - d11) - d13) / ((d8 - d10) - d12);
        double d15 = d13 - (d12 * d14);
        double d16 = abs2 * abs2;
        double d17 = abs * abs;
        double d18 = d16 + (d17 * d14 * d14);
        double d19 = abs * 2.0d * abs * d15 * d14;
        double d20 = (-(d17 * ((d15 * d15) - d16))) / d18;
        double d21 = d18 * 2.0d;
        double sqrt = ((-d19) / d21) - Math.sqrt(d20 + Math.pow(d19 / d21, 2.0d));
        double d22 = (d14 * sqrt) + d15;
        double d23 = sqrt + d10;
        double d24 = d22 + d11;
        if (Double.isNaN(d23) || Double.isNaN(d24)) {
            return;
        }
        pointF.x = (float) d23;
        pointF.y = (float) d24;
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x013a  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void m6301a(android.graphics.Canvas r25) {
        /*
            Method dump skipped, instructions count: 460
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.react.views.view.C1513e.m6301a(android.graphics.Canvas):void");
    }

    /* renamed from: a */
    private void m6302a(Canvas canvas, int i, float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8) {
        if (i == 0) {
            return;
        }
        if (this.f5573i == null) {
            this.f5573i = new Path();
        }
        this.f5585u.setColor(i);
        this.f5573i.reset();
        this.f5573i.moveTo(f, f2);
        this.f5573i.lineTo(f3, f4);
        this.f5573i.lineTo(f5, f6);
        this.f5573i.lineTo(f7, f8);
        this.f5573i.lineTo(f, f2);
        canvas.drawPath(this.f5573i, this.f5585u);
    }

    /* renamed from: b */
    private void m6303b(int i, float f) {
        if (this.f5567c == null) {
            this.f5567c = new C1277M(255.0f);
        }
        if (C1349i.m5842a(this.f5567c.m5597b(i), f)) {
            return;
        }
        this.f5567c.m5596a(i, f);
        invalidateSelf();
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0163  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0185  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x01a8  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0155  */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void m6304b(android.graphics.Canvas r23) {
        /*
            Method dump skipped, instructions count: 457
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.react.views.view.C1513e.m6304b(android.graphics.Canvas):void");
    }

    /* renamed from: c */
    private void m6305c(int i, float f) {
        if (this.f5566b == null) {
            this.f5566b = new C1277M(0.0f);
        }
        if (C1349i.m5842a(this.f5566b.m5597b(i), f)) {
            return;
        }
        this.f5566b.m5596a(i, f);
        invalidateSelf();
    }

    /* renamed from: d */
    private int m6306d(int i) {
        C1277M c1277m = this.f5566b;
        float m5595a = c1277m != null ? c1277m.m5595a(i) : 0.0f;
        C1277M c1277m2 = this.f5567c;
        return m6298a(c1277m2 != null ? c1277m2.m5595a(i) : 255.0f, m5595a);
    }

    /* renamed from: e */
    private boolean m6307e(int i) {
        C1277M c1277m = this.f5566b;
        float m5595a = c1277m != null ? c1277m.m5595a(i) : Float.NaN;
        C1277M c1277m2 = this.f5567c;
        return (C1553a.m6544a(m5595a) || C1553a.m6544a(c1277m2 != null ? c1277m2.m5595a(i) : Float.NaN)) ? false : true;
    }

    /* renamed from: g */
    private void m6308g() {
        if (this.f5583s) {
            this.f5583s = false;
            if (this.f5570f == null) {
                this.f5570f = new Path();
            }
            if (this.f5571g == null) {
                this.f5571g = new Path();
            }
            if (this.f5572h == null) {
                this.f5572h = new Path();
            }
            if (this.f5574j == null) {
                this.f5574j = new Path();
            }
            if (this.f5575k == null) {
                this.f5575k = new RectF();
            }
            if (this.f5576l == null) {
                this.f5576l = new RectF();
            }
            if (this.f5577m == null) {
                this.f5577m = new RectF();
            }
            if (this.f5578n == null) {
                this.f5578n = new RectF();
            }
            this.f5570f.reset();
            this.f5571g.reset();
            this.f5572h.reset();
            this.f5574j.reset();
            this.f5575k.set(getBounds());
            this.f5576l.set(getBounds());
            this.f5577m.set(getBounds());
            this.f5578n.set(getBounds());
            float m6324d = m6324d();
            if (m6324d > 0.0f) {
                float f = m6324d * 0.5f;
                this.f5578n.inset(f, f);
            }
            RectF m6319b = m6319b();
            RectF rectF = this.f5575k;
            rectF.top += m6319b.top;
            rectF.bottom -= m6319b.bottom;
            rectF.left += m6319b.left;
            rectF.right -= m6319b.right;
            float m6322c = m6322c();
            float m6311a = m6311a(m6322c, a.TOP_LEFT);
            float m6311a2 = m6311a(m6322c, a.TOP_RIGHT);
            float m6311a3 = m6311a(m6322c, a.BOTTOM_LEFT);
            float m6311a4 = m6311a(m6322c, a.BOTTOM_RIGHT);
            if (Build.VERSION.SDK_INT >= 17) {
                boolean z = m6325e() == 1;
                float m6312a = m6312a(a.TOP_START);
                float m6312a2 = m6312a(a.TOP_END);
                float m6312a3 = m6312a(a.BOTTOM_START);
                float m6312a4 = m6312a(a.BOTTOM_END);
                if (C1190a.m5346a().m5353a(this.f5589y)) {
                    if (!C1553a.m6544a(m6312a)) {
                        m6311a = m6312a;
                    }
                    if (!C1553a.m6544a(m6312a2)) {
                        m6311a2 = m6312a2;
                    }
                    if (!C1553a.m6544a(m6312a3)) {
                        m6311a3 = m6312a3;
                    }
                    if (!C1553a.m6544a(m6312a4)) {
                        m6311a4 = m6312a4;
                    }
                    float f2 = z ? m6311a2 : m6311a;
                    if (z) {
                        m6311a2 = m6311a;
                    }
                    float f3 = z ? m6311a4 : m6311a3;
                    if (z) {
                        m6311a4 = m6311a3;
                    }
                    m6311a3 = f3;
                    m6311a = f2;
                } else {
                    float f4 = z ? m6312a2 : m6312a;
                    if (!z) {
                        m6312a = m6312a2;
                    }
                    float f5 = z ? m6312a4 : m6312a3;
                    if (!z) {
                        m6312a3 = m6312a4;
                    }
                    if (!C1553a.m6544a(f4)) {
                        m6311a = f4;
                    }
                    if (!C1553a.m6544a(m6312a)) {
                        m6311a2 = m6312a;
                    }
                    if (!C1553a.m6544a(f5)) {
                        m6311a3 = f5;
                    }
                    if (!C1553a.m6544a(m6312a3)) {
                        m6311a4 = m6312a3;
                    }
                }
            }
            float max = Math.max(m6311a - m6319b.left, 0.0f);
            float max2 = Math.max(m6311a - m6319b.top, 0.0f);
            float max3 = Math.max(m6311a2 - m6319b.right, 0.0f);
            float max4 = Math.max(m6311a2 - m6319b.top, 0.0f);
            float max5 = Math.max(m6311a4 - m6319b.right, 0.0f);
            float max6 = Math.max(m6311a4 - m6319b.bottom, 0.0f);
            float max7 = Math.max(m6311a3 - m6319b.left, 0.0f);
            float max8 = Math.max(m6311a3 - m6319b.bottom, 0.0f);
            float f6 = m6311a3;
            float f7 = m6311a4;
            this.f5570f.addRoundRect(this.f5575k, new float[]{max, max2, max3, max4, max5, max6, max7, max8}, Path.Direction.CW);
            this.f5571g.addRoundRect(this.f5576l, new float[]{m6311a, m6311a, m6311a2, m6311a2, f7, f7, f6, f6}, Path.Direction.CW);
            C1277M c1277m = this.f5565a;
            float m5595a = c1277m != null ? c1277m.m5595a(8) / 2.0f : 0.0f;
            float f8 = m6311a + m5595a;
            float f9 = m6311a2 + m5595a;
            float f10 = f7 + m5595a;
            float f11 = f6 + m5595a;
            this.f5572h.addRoundRect(this.f5577m, new float[]{f8, f8, f9, f9, f10, f10, f11, f11}, Path.Direction.CW);
            this.f5574j.addRoundRect(this.f5578n, new float[]{max + m5595a, max2 + m5595a, max3 + m5595a, max4 + m5595a, max5 + m5595a, max6 + m5595a, max7 + m5595a, max8 + m5595a}, Path.Direction.CW);
            if (this.f5579o == null) {
                this.f5579o = new PointF();
            }
            PointF pointF = this.f5579o;
            RectF rectF2 = this.f5575k;
            float f12 = rectF2.left;
            pointF.x = f12;
            float f13 = rectF2.top;
            pointF.y = f13;
            RectF rectF3 = this.f5576l;
            m6300a(f12, f13, (max * 2.0f) + f12, (max2 * 2.0f) + f13, rectF3.left, rectF3.top, f12, f13, pointF);
            if (this.f5582r == null) {
                this.f5582r = new PointF();
            }
            PointF pointF2 = this.f5582r;
            RectF rectF4 = this.f5575k;
            float f14 = rectF4.left;
            pointF2.x = f14;
            float f15 = rectF4.bottom;
            pointF2.y = f15;
            RectF rectF5 = this.f5576l;
            m6300a(f14, f15 - (max8 * 2.0f), (max7 * 2.0f) + f14, f15, rectF5.left, rectF5.bottom, f14, f15, pointF2);
            if (this.f5580p == null) {
                this.f5580p = new PointF();
            }
            PointF pointF3 = this.f5580p;
            RectF rectF6 = this.f5575k;
            float f16 = rectF6.right;
            pointF3.x = f16;
            float f17 = rectF6.top;
            pointF3.y = f17;
            RectF rectF7 = this.f5576l;
            m6300a(f16 - (max3 * 2.0f), f17, f16, (max4 * 2.0f) + f17, rectF7.right, rectF7.top, f16, f17, pointF3);
            if (this.f5581q == null) {
                this.f5581q = new PointF();
            }
            PointF pointF4 = this.f5581q;
            RectF rectF8 = this.f5575k;
            float f18 = rectF8.right;
            pointF4.x = f18;
            float f19 = rectF8.bottom;
            pointF4.y = f19;
            RectF rectF9 = this.f5576l;
            m6300a(f18 - (max5 * 2.0f), f19 - (max6 * 2.0f), f18, f19, rectF9.right, rectF9.bottom, f18, f19, pointF4);
        }
    }

    /* renamed from: h */
    private void m6309h() {
        b bVar = this.f5568d;
        this.f5569e = bVar != null ? b.m6327a(bVar, m6324d()) : null;
        this.f5585u.setPathEffect(this.f5569e);
    }

    /* renamed from: a */
    public float m6310a(float f, int i) {
        C1277M c1277m = this.f5565a;
        if (c1277m == null) {
            return f;
        }
        float m5597b = c1277m.m5597b(i);
        return C1553a.m6544a(m5597b) ? f : m5597b;
    }

    /* renamed from: a */
    public float m6311a(float f, a aVar) {
        float[] fArr = this.f5588x;
        if (fArr == null) {
            return f;
        }
        float f2 = fArr[aVar.ordinal()];
        return C1553a.m6544a(f2) ? f : f2;
    }

    /* renamed from: a */
    public float m6312a(a aVar) {
        return m6311a(Float.NaN, aVar);
    }

    /* renamed from: a */
    public int m6313a() {
        return this.f5586v;
    }

    /* renamed from: a */
    public void m6314a(float f) {
        if (C1349i.m5842a(this.f5584t, f)) {
            return;
        }
        this.f5584t = f;
        this.f5583s = true;
        invalidateSelf();
    }

    /* renamed from: a */
    public void m6315a(int i, float f) {
        if (this.f5565a == null) {
            this.f5565a = new C1277M();
        }
        if (C1349i.m5842a(this.f5565a.m5597b(i), f)) {
            return;
        }
        this.f5565a.m5596a(i, f);
        if (i == 0 || i == 1 || i == 2 || i == 3 || i == 4 || i == 5 || i == 8) {
            this.f5583s = true;
        }
        invalidateSelf();
    }

    /* renamed from: a */
    public void m6316a(int i, float f, float f2) {
        m6305c(i, f);
        m6303b(i, f2);
    }

    /* renamed from: a */
    public void m6317a(String str) {
        b valueOf = str == null ? null : b.valueOf(str.toUpperCase(Locale.US));
        if (this.f5568d != valueOf) {
            this.f5568d = valueOf;
            this.f5583s = true;
            invalidateSelf();
        }
    }

    /* renamed from: a */
    public boolean m6318a(int i) {
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x005b, code lost:            if (r1 != false) goto L35;     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0074, code lost:            r0 = r4;     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0072, code lost:            if (com.facebook.yoga.C1553a.m6544a(r4) == false) goto L35;     */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public android.graphics.RectF m6319b() {
        /*
            r9 = this;
            r0 = 0
            r1 = 8
            float r0 = r9.m6310a(r0, r1)
            r1 = 1
            float r2 = r9.m6310a(r0, r1)
            r3 = 3
            float r3 = r9.m6310a(r0, r3)
            r4 = 0
            float r5 = r9.m6310a(r0, r4)
            r6 = 2
            float r0 = r9.m6310a(r0, r6)
            int r6 = android.os.Build.VERSION.SDK_INT
            r7 = 17
            if (r6 < r7) goto L75
            com.facebook.react.uimanager.M r6 = r9.f5565a
            if (r6 == 0) goto L75
            int r6 = r9.m6325e()
            if (r6 != r1) goto L2c
            goto L2d
        L2c:
            r1 = 0
        L2d:
            com.facebook.react.uimanager.M r4 = r9.f5565a
            r6 = 4
            float r4 = r4.m5597b(r6)
            com.facebook.react.uimanager.M r6 = r9.f5565a
            r7 = 5
            float r6 = r6.m5597b(r7)
            com.facebook.react.modules.i18nmanager.a r7 = com.facebook.react.modules.i18nmanager.C1190a.m5346a()
            android.content.Context r8 = r9.f5589y
            boolean r7 = r7.m5353a(r8)
            if (r7 == 0) goto L5e
            boolean r7 = com.facebook.yoga.C1553a.m6544a(r4)
            if (r7 == 0) goto L4e
            r4 = r5
        L4e:
            boolean r5 = com.facebook.yoga.C1553a.m6544a(r6)
            if (r5 == 0) goto L55
            goto L56
        L55:
            r0 = r6
        L56:
            if (r1 == 0) goto L5a
            r5 = r0
            goto L5b
        L5a:
            r5 = r4
        L5b:
            if (r1 == 0) goto L75
            goto L74
        L5e:
            if (r1 == 0) goto L62
            r7 = r6
            goto L63
        L62:
            r7 = r4
        L63:
            if (r1 == 0) goto L66
            goto L67
        L66:
            r4 = r6
        L67:
            boolean r1 = com.facebook.yoga.C1553a.m6544a(r7)
            if (r1 != 0) goto L6e
            r5 = r7
        L6e:
            boolean r1 = com.facebook.yoga.C1553a.m6544a(r4)
            if (r1 != 0) goto L75
        L74:
            r0 = r4
        L75:
            android.graphics.RectF r1 = new android.graphics.RectF
            r1.<init>(r5, r2, r0, r3)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.react.views.view.C1513e.m6319b():android.graphics.RectF");
    }

    /* renamed from: b */
    public void m6320b(float f, int i) {
        if (this.f5588x == null) {
            this.f5588x = new float[8];
            Arrays.fill(this.f5588x, Float.NaN);
        }
        if (C1349i.m5842a(this.f5588x[i], f)) {
            return;
        }
        this.f5588x[i] = f;
        this.f5583s = true;
        invalidateSelf();
    }

    /* renamed from: b */
    public void m6321b(int i) {
        this.f5586v = i;
        invalidateSelf();
    }

    /* renamed from: c */
    public float m6322c() {
        if (C1553a.m6544a(this.f5584t)) {
            return 0.0f;
        }
        return this.f5584t;
    }

    /* renamed from: c */
    public boolean m6323c(int i) {
        if (this.f5590z == i) {
            return false;
        }
        this.f5590z = i;
        return m6318a(i);
    }

    /* renamed from: d */
    public float m6324d() {
        C1277M c1277m = this.f5565a;
        if (c1277m == null || C1553a.m6544a(c1277m.m5597b(8))) {
            return 0.0f;
        }
        return this.f5565a.m5597b(8);
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        m6309h();
        if (m6326f()) {
            m6304b(canvas);
        } else {
            m6301a(canvas);
        }
    }

    /* renamed from: e */
    public int m6325e() {
        return this.f5590z;
    }

    /* renamed from: f */
    public boolean m6326f() {
        if (!C1553a.m6544a(this.f5584t) && this.f5584t > 0.0f) {
            return true;
        }
        float[] fArr = this.f5588x;
        if (fArr != null) {
            for (float f : fArr) {
                if (!C1553a.m6544a(f) && f > 0.0f) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.f5587w;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return C1509a.m6294a(C1509a.m6295a(this.f5586v, this.f5587w));
    }

    @Override // android.graphics.drawable.Drawable
    public void getOutline(Outline outline) {
        if (Build.VERSION.SDK_INT < 21) {
            super.getOutline(outline);
            return;
        }
        if ((C1553a.m6544a(this.f5584t) || this.f5584t <= 0.0f) && this.f5588x == null) {
            outline.setRect(getBounds());
        } else {
            m6308g();
            outline.setConvexPath(this.f5572h);
        }
    }

    @Override // android.graphics.drawable.Drawable
    protected void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.f5583s = true;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        if (i != this.f5587w) {
            this.f5587w = i;
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
    }
}
