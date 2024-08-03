package android.support.v4.widget;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.support.v4.util.C0268n;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import p000a.p005b.p009c.p019h.p021b.C0085b;

/* renamed from: android.support.v4.widget.f */
/* loaded from: classes.dex */
public class C0288f extends Drawable implements Animatable {

    /* renamed from: a */
    private static final Interpolator f1263a = new LinearInterpolator();

    /* renamed from: b */
    private static final Interpolator f1264b = new C0085b();

    /* renamed from: c */
    private static final int[] f1265c = {-16777216};

    /* renamed from: d */
    private final a f1266d;

    /* renamed from: e */
    private float f1267e;

    /* renamed from: f */
    private Resources f1268f;

    /* renamed from: g */
    private Animator f1269g;

    /* renamed from: h */
    float f1270h;

    /* renamed from: i */
    boolean f1271i;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: android.support.v4.widget.f$a */
    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: i */
        int[] f1280i;

        /* renamed from: j */
        int f1281j;

        /* renamed from: k */
        float f1282k;

        /* renamed from: l */
        float f1283l;

        /* renamed from: m */
        float f1284m;

        /* renamed from: n */
        boolean f1285n;

        /* renamed from: o */
        Path f1286o;

        /* renamed from: q */
        float f1288q;

        /* renamed from: r */
        int f1289r;

        /* renamed from: s */
        int f1290s;

        /* renamed from: u */
        int f1292u;

        /* renamed from: a */
        final RectF f1272a = new RectF();

        /* renamed from: b */
        final Paint f1273b = new Paint();

        /* renamed from: c */
        final Paint f1274c = new Paint();

        /* renamed from: d */
        final Paint f1275d = new Paint();

        /* renamed from: e */
        float f1276e = 0.0f;

        /* renamed from: f */
        float f1277f = 0.0f;

        /* renamed from: g */
        float f1278g = 0.0f;

        /* renamed from: h */
        float f1279h = 5.0f;

        /* renamed from: p */
        float f1287p = 1.0f;

        /* renamed from: t */
        int f1291t = 255;

        a() {
            this.f1273b.setStrokeCap(Paint.Cap.SQUARE);
            this.f1273b.setAntiAlias(true);
            this.f1273b.setStyle(Paint.Style.STROKE);
            this.f1274c.setStyle(Paint.Style.FILL);
            this.f1274c.setAntiAlias(true);
            this.f1275d.setColor(0);
        }

        /* renamed from: a */
        int m1589a() {
            return this.f1291t;
        }

        /* renamed from: a */
        void m1590a(float f) {
            if (f != this.f1287p) {
                this.f1287p = f;
            }
        }

        /* renamed from: a */
        void m1591a(float f, float f2) {
            this.f1289r = (int) f;
            this.f1290s = (int) f2;
        }

        /* renamed from: a */
        void m1592a(int i) {
            this.f1291t = i;
        }

        /* renamed from: a */
        void m1593a(Canvas canvas, float f, float f2, RectF rectF) {
            if (this.f1285n) {
                Path path = this.f1286o;
                if (path == null) {
                    this.f1286o = new Path();
                    this.f1286o.setFillType(Path.FillType.EVEN_ODD);
                } else {
                    path.reset();
                }
                float min = Math.min(rectF.width(), rectF.height()) / 2.0f;
                float f3 = (this.f1289r * this.f1287p) / 2.0f;
                this.f1286o.moveTo(0.0f, 0.0f);
                this.f1286o.lineTo(this.f1289r * this.f1287p, 0.0f);
                Path path2 = this.f1286o;
                float f4 = this.f1289r;
                float f5 = this.f1287p;
                path2.lineTo((f4 * f5) / 2.0f, this.f1290s * f5);
                this.f1286o.offset((min + rectF.centerX()) - f3, rectF.centerY() + (this.f1279h / 2.0f));
                this.f1286o.close();
                this.f1274c.setColor(this.f1292u);
                this.f1274c.setAlpha(this.f1291t);
                canvas.save();
                canvas.rotate(f + f2, rectF.centerX(), rectF.centerY());
                canvas.drawPath(this.f1286o, this.f1274c);
                canvas.restore();
            }
        }

        /* renamed from: a */
        void m1594a(Canvas canvas, Rect rect) {
            RectF rectF = this.f1272a;
            float f = this.f1288q;
            float f2 = (this.f1279h / 2.0f) + f;
            if (f <= 0.0f) {
                f2 = (Math.min(rect.width(), rect.height()) / 2.0f) - Math.max((this.f1289r * this.f1287p) / 2.0f, this.f1279h / 2.0f);
            }
            rectF.set(rect.centerX() - f2, rect.centerY() - f2, rect.centerX() + f2, rect.centerY() + f2);
            float f3 = this.f1276e;
            float f4 = this.f1278g;
            float f5 = (f3 + f4) * 360.0f;
            float f6 = ((this.f1277f + f4) * 360.0f) - f5;
            this.f1273b.setColor(this.f1292u);
            this.f1273b.setAlpha(this.f1291t);
            float f7 = this.f1279h / 2.0f;
            rectF.inset(f7, f7);
            canvas.drawCircle(rectF.centerX(), rectF.centerY(), rectF.width() / 2.0f, this.f1275d);
            float f8 = -f7;
            rectF.inset(f8, f8);
            canvas.drawArc(rectF, f5, f6, false, this.f1273b);
            m1593a(canvas, f5, f6, rectF);
        }

        /* renamed from: a */
        void m1595a(ColorFilter colorFilter) {
            this.f1273b.setColorFilter(colorFilter);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: a */
        public void m1596a(boolean z) {
            if (this.f1285n != z) {
                this.f1285n = z;
            }
        }

        /* renamed from: a */
        void m1597a(int[] iArr) {
            this.f1280i = iArr;
            m1603c(0);
        }

        /* renamed from: b */
        float m1598b() {
            return this.f1277f;
        }

        /* renamed from: b */
        void m1599b(float f) {
            this.f1288q = f;
        }

        /* renamed from: b */
        void m1600b(int i) {
            this.f1292u = i;
        }

        /* renamed from: c */
        int m1601c() {
            return this.f1280i[m1604d()];
        }

        /* renamed from: c */
        void m1602c(float f) {
            this.f1277f = f;
        }

        /* renamed from: c */
        void m1603c(int i) {
            this.f1281j = i;
            this.f1292u = this.f1280i[this.f1281j];
        }

        /* renamed from: d */
        int m1604d() {
            return (this.f1281j + 1) % this.f1280i.length;
        }

        /* renamed from: d */
        void m1605d(float f) {
            this.f1278g = f;
        }

        /* renamed from: e */
        float m1606e() {
            return this.f1276e;
        }

        /* renamed from: e */
        void m1607e(float f) {
            this.f1276e = f;
        }

        /* renamed from: f */
        int m1608f() {
            return this.f1280i[this.f1281j];
        }

        /* renamed from: f */
        void m1609f(float f) {
            this.f1279h = f;
            this.f1273b.setStrokeWidth(f);
        }

        /* renamed from: g */
        float m1610g() {
            return this.f1283l;
        }

        /* renamed from: h */
        float m1611h() {
            return this.f1284m;
        }

        /* renamed from: i */
        float m1612i() {
            return this.f1282k;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: j */
        public void m1613j() {
            m1603c(m1604d());
        }

        /* renamed from: k */
        void m1614k() {
            this.f1282k = 0.0f;
            this.f1283l = 0.0f;
            this.f1284m = 0.0f;
            m1607e(0.0f);
            m1602c(0.0f);
            m1605d(0.0f);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: l */
        public void m1615l() {
            this.f1282k = this.f1276e;
            this.f1283l = this.f1277f;
            this.f1284m = this.f1278g;
        }
    }

    public C0288f(Context context) {
        C0268n.m1384a(context);
        this.f1268f = context.getResources();
        this.f1266d = new a();
        this.f1266d.m1597a(f1265c);
        m1588c(2.5f);
        m1576a();
    }

    /* renamed from: a */
    private int m1575a(float f, int i, int i2) {
        return ((((i >> 24) & 255) + ((int) ((((i2 >> 24) & 255) - r0) * f))) << 24) | ((((i >> 16) & 255) + ((int) ((((i2 >> 16) & 255) - r1) * f))) << 16) | ((((i >> 8) & 255) + ((int) ((((i2 >> 8) & 255) - r2) * f))) << 8) | ((i & 255) + ((int) (f * ((i2 & 255) - r8))));
    }

    /* renamed from: a */
    private void m1576a() {
        a aVar = this.f1266d;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.addUpdateListener(new C0286d(this, aVar));
        ofFloat.setRepeatCount(-1);
        ofFloat.setRepeatMode(1);
        ofFloat.setInterpolator(f1263a);
        ofFloat.addListener(new C0287e(this, aVar));
        this.f1269g = ofFloat;
    }

    /* renamed from: a */
    private void m1577a(float f, float f2, float f3, float f4) {
        a aVar = this.f1266d;
        float f5 = this.f1268f.getDisplayMetrics().density;
        aVar.m1609f(f2 * f5);
        aVar.m1599b(f * f5);
        aVar.m1603c(0);
        aVar.m1591a(f3 * f5, f4 * f5);
    }

    /* renamed from: b */
    private void m1578b(float f, a aVar) {
        m1582a(f, aVar);
        float floor = (float) (Math.floor(aVar.m1611h() / 0.8f) + 1.0d);
        aVar.m1607e(aVar.m1612i() + (((aVar.m1610g() - 0.01f) - aVar.m1612i()) * f));
        aVar.m1602c(aVar.m1610g());
        aVar.m1605d(aVar.m1611h() + ((floor - aVar.m1611h()) * f));
    }

    /* renamed from: d */
    private void m1579d(float f) {
        this.f1267e = f;
    }

    /* renamed from: a */
    public void m1580a(float f) {
        this.f1266d.m1590a(f);
        invalidateSelf();
    }

    /* renamed from: a */
    public void m1581a(float f, float f2) {
        this.f1266d.m1607e(f);
        this.f1266d.m1602c(f2);
        invalidateSelf();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public void m1582a(float f, a aVar) {
        aVar.m1600b(f > 0.75f ? m1575a((f - 0.75f) / 0.25f, aVar.m1608f(), aVar.m1601c()) : aVar.m1608f());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public void m1583a(float f, a aVar, boolean z) {
        float m1612i;
        float interpolation;
        if (this.f1271i) {
            m1578b(f, aVar);
            return;
        }
        if (f != 1.0f || z) {
            float m1611h = aVar.m1611h();
            if (f < 0.5f) {
                float m1612i2 = aVar.m1612i();
                m1612i = (f1264b.getInterpolation(f / 0.5f) * 0.79f) + 0.01f + m1612i2;
                interpolation = m1612i2;
            } else {
                m1612i = aVar.m1612i() + 0.79f;
                interpolation = m1612i - (((1.0f - f1264b.getInterpolation((f - 0.5f) / 0.5f)) * 0.79f) + 0.01f);
            }
            float f2 = m1611h + (0.20999998f * f);
            float f3 = (f + this.f1270h) * 216.0f;
            aVar.m1607e(interpolation);
            aVar.m1602c(m1612i);
            aVar.m1605d(f2);
            m1579d(f3);
        }
    }

    /* renamed from: a */
    public void m1584a(int i) {
        float f;
        float f2;
        float f3;
        float f4;
        if (i == 0) {
            f = 11.0f;
            f2 = 3.0f;
            f3 = 12.0f;
            f4 = 6.0f;
        } else {
            f = 7.5f;
            f2 = 2.5f;
            f3 = 10.0f;
            f4 = 5.0f;
        }
        m1577a(f, f2, f3, f4);
        invalidateSelf();
    }

    /* renamed from: a */
    public void m1585a(boolean z) {
        this.f1266d.m1596a(z);
        invalidateSelf();
    }

    /* renamed from: a */
    public void m1586a(int... iArr) {
        this.f1266d.m1597a(iArr);
        this.f1266d.m1603c(0);
        invalidateSelf();
    }

    /* renamed from: b */
    public void m1587b(float f) {
        this.f1266d.m1605d(f);
        invalidateSelf();
    }

    /* renamed from: c */
    public void m1588c(float f) {
        this.f1266d.m1609f(f);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        Rect bounds = getBounds();
        canvas.save();
        canvas.rotate(this.f1267e, bounds.exactCenterX(), bounds.exactCenterY());
        this.f1266d.m1594a(canvas, bounds);
        canvas.restore();
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.f1266d.m1589a();
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Animatable
    public boolean isRunning() {
        return this.f1269g.isRunning();
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        this.f1266d.m1592a(i);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.f1266d.m1595a(colorFilter);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Animatable
    public void start() {
        Animator animator;
        long j;
        this.f1269g.cancel();
        this.f1266d.m1615l();
        if (this.f1266d.m1598b() != this.f1266d.m1606e()) {
            this.f1271i = true;
            animator = this.f1269g;
            j = 666;
        } else {
            this.f1266d.m1603c(0);
            this.f1266d.m1614k();
            animator = this.f1269g;
            j = 1332;
        }
        animator.setDuration(j);
        this.f1269g.start();
    }

    @Override // android.graphics.drawable.Animatable
    public void stop() {
        this.f1269g.cancel();
        m1579d(0.0f);
        this.f1266d.m1596a(false);
        this.f1266d.m1603c(0);
        this.f1266d.m1614k();
        invalidateSelf();
    }
}
