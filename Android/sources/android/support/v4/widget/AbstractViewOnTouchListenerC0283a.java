package android.support.v4.widget;

import android.content.res.Resources;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import p000a.p005b.p009c.p019h.C0107v;

/* renamed from: android.support.v4.widget.a */
/* loaded from: classes.dex */
public abstract class AbstractViewOnTouchListenerC0283a implements View.OnTouchListener {

    /* renamed from: a */
    private static final int f1223a = ViewConfiguration.getTapTimeout();

    /* renamed from: d */
    final View f1226d;

    /* renamed from: e */
    private Runnable f1227e;

    /* renamed from: h */
    private int f1230h;

    /* renamed from: i */
    private int f1231i;

    /* renamed from: m */
    private boolean f1235m;

    /* renamed from: n */
    boolean f1236n;

    /* renamed from: o */
    boolean f1237o;

    /* renamed from: p */
    boolean f1238p;

    /* renamed from: q */
    private boolean f1239q;

    /* renamed from: r */
    private boolean f1240r;

    /* renamed from: b */
    final a f1224b = new a();

    /* renamed from: c */
    private final Interpolator f1225c = new AccelerateInterpolator();

    /* renamed from: f */
    private float[] f1228f = {0.0f, 0.0f};

    /* renamed from: g */
    private float[] f1229g = {Float.MAX_VALUE, Float.MAX_VALUE};

    /* renamed from: j */
    private float[] f1232j = {0.0f, 0.0f};

    /* renamed from: k */
    private float[] f1233k = {0.0f, 0.0f};

    /* renamed from: l */
    private float[] f1234l = {Float.MAX_VALUE, Float.MAX_VALUE};

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: android.support.v4.widget.a$a */
    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a */
        private int f1241a;

        /* renamed from: b */
        private int f1242b;

        /* renamed from: c */
        private float f1243c;

        /* renamed from: d */
        private float f1244d;

        /* renamed from: j */
        private float f1250j;

        /* renamed from: k */
        private int f1251k;

        /* renamed from: e */
        private long f1245e = Long.MIN_VALUE;

        /* renamed from: i */
        private long f1249i = -1;

        /* renamed from: f */
        private long f1246f = 0;

        /* renamed from: g */
        private int f1247g = 0;

        /* renamed from: h */
        private int f1248h = 0;

        a() {
        }

        /* renamed from: a */
        private float m1559a(float f) {
            return ((-4.0f) * f * f) + (f * 4.0f);
        }

        /* renamed from: a */
        private float m1560a(long j) {
            if (j < this.f1245e) {
                return 0.0f;
            }
            long j2 = this.f1249i;
            if (j2 < 0 || j < j2) {
                return AbstractViewOnTouchListenerC0283a.m1537a(((float) (j - this.f1245e)) / this.f1241a, 0.0f, 1.0f) * 0.5f;
            }
            long j3 = j - j2;
            float f = this.f1250j;
            return (1.0f - f) + (f * AbstractViewOnTouchListenerC0283a.m1537a(((float) j3) / this.f1251k, 0.0f, 1.0f));
        }

        /* renamed from: a */
        public void m1561a() {
            if (this.f1246f == 0) {
                throw new RuntimeException("Cannot compute scroll delta before calling start()");
            }
            long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
            float m1559a = m1559a(m1560a(currentAnimationTimeMillis));
            long j = currentAnimationTimeMillis - this.f1246f;
            this.f1246f = currentAnimationTimeMillis;
            float f = ((float) j) * m1559a;
            this.f1247g = (int) (this.f1243c * f);
            this.f1248h = (int) (f * this.f1244d);
        }

        /* renamed from: a */
        public void m1562a(float f, float f2) {
            this.f1243c = f;
            this.f1244d = f2;
        }

        /* renamed from: a */
        public void m1563a(int i) {
            this.f1242b = i;
        }

        /* renamed from: b */
        public int m1564b() {
            return this.f1247g;
        }

        /* renamed from: b */
        public void m1565b(int i) {
            this.f1241a = i;
        }

        /* renamed from: c */
        public int m1566c() {
            return this.f1248h;
        }

        /* renamed from: d */
        public int m1567d() {
            float f = this.f1243c;
            return (int) (f / Math.abs(f));
        }

        /* renamed from: e */
        public int m1568e() {
            float f = this.f1244d;
            return (int) (f / Math.abs(f));
        }

        /* renamed from: f */
        public boolean m1569f() {
            return this.f1249i > 0 && AnimationUtils.currentAnimationTimeMillis() > this.f1249i + ((long) this.f1251k);
        }

        /* renamed from: g */
        public void m1570g() {
            long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
            this.f1251k = AbstractViewOnTouchListenerC0283a.m1540a((int) (currentAnimationTimeMillis - this.f1245e), 0, this.f1242b);
            this.f1250j = m1560a(currentAnimationTimeMillis);
            this.f1249i = currentAnimationTimeMillis;
        }

        /* renamed from: h */
        public void m1571h() {
            this.f1245e = AnimationUtils.currentAnimationTimeMillis();
            this.f1249i = -1L;
            this.f1246f = this.f1245e;
            this.f1250j = 0.5f;
            this.f1247g = 0;
            this.f1248h = 0;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: android.support.v4.widget.a$b */
    /* loaded from: classes.dex */
    public class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            AbstractViewOnTouchListenerC0283a abstractViewOnTouchListenerC0283a = AbstractViewOnTouchListenerC0283a.this;
            if (abstractViewOnTouchListenerC0283a.f1238p) {
                if (abstractViewOnTouchListenerC0283a.f1236n) {
                    abstractViewOnTouchListenerC0283a.f1236n = false;
                    abstractViewOnTouchListenerC0283a.f1224b.m1571h();
                }
                a aVar = AbstractViewOnTouchListenerC0283a.this.f1224b;
                if (aVar.m1569f() || !AbstractViewOnTouchListenerC0283a.this.m1550b()) {
                    AbstractViewOnTouchListenerC0283a.this.f1238p = false;
                    return;
                }
                AbstractViewOnTouchListenerC0283a abstractViewOnTouchListenerC0283a2 = AbstractViewOnTouchListenerC0283a.this;
                if (abstractViewOnTouchListenerC0283a2.f1237o) {
                    abstractViewOnTouchListenerC0283a2.f1237o = false;
                    abstractViewOnTouchListenerC0283a2.m1546a();
                }
                aVar.m1561a();
                AbstractViewOnTouchListenerC0283a.this.mo1547a(aVar.m1564b(), aVar.m1566c());
                C0107v.m501a(AbstractViewOnTouchListenerC0283a.this.f1226d, this);
            }
        }
    }

    public AbstractViewOnTouchListenerC0283a(View view) {
        this.f1226d = view;
        float f = Resources.getSystem().getDisplayMetrics().density;
        float f2 = (int) ((1575.0f * f) + 0.5f);
        m1549b(f2, f2);
        float f3 = (int) ((f * 315.0f) + 0.5f);
        m1552c(f3, f3);
        m1555d(1);
        m1544a(Float.MAX_VALUE, Float.MAX_VALUE);
        m1554d(0.2f, 0.2f);
        m1556e(1.0f, 1.0f);
        m1553c(f1223a);
        m1558f(500);
        m1557e(500);
    }

    /* renamed from: a */
    static float m1537a(float f, float f2, float f3) {
        return f > f3 ? f3 : f < f2 ? f2 : f;
    }

    /* renamed from: a */
    private float m1538a(float f, float f2, float f3, float f4) {
        float interpolation;
        float m1537a = m1537a(f * f2, 0.0f, f3);
        float m1543f = m1543f(f2 - f4, m1537a) - m1543f(f4, m1537a);
        if (m1543f < 0.0f) {
            interpolation = -this.f1225c.getInterpolation(-m1543f);
        } else {
            if (m1543f <= 0.0f) {
                return 0.0f;
            }
            interpolation = this.f1225c.getInterpolation(m1543f);
        }
        return m1537a(interpolation, -1.0f, 1.0f);
    }

    /* renamed from: a */
    private float m1539a(int i, float f, float f2, float f3) {
        float m1538a = m1538a(this.f1228f[i], f2, this.f1229g[i], f);
        if (m1538a == 0.0f) {
            return 0.0f;
        }
        float f4 = this.f1232j[i];
        float f5 = this.f1233k[i];
        float f6 = this.f1234l[i];
        float f7 = f4 * f3;
        return m1538a > 0.0f ? m1537a(m1538a * f7, f5, f6) : -m1537a((-m1538a) * f7, f5, f6);
    }

    /* renamed from: a */
    static int m1540a(int i, int i2, int i3) {
        return i > i3 ? i3 : i < i2 ? i2 : i;
    }

    /* renamed from: c */
    private void m1541c() {
        if (this.f1236n) {
            this.f1238p = false;
        } else {
            this.f1224b.m1570g();
        }
    }

    /* renamed from: d */
    private void m1542d() {
        int i;
        if (this.f1227e == null) {
            this.f1227e = new b();
        }
        this.f1238p = true;
        this.f1236n = true;
        if (this.f1235m || (i = this.f1231i) <= 0) {
            this.f1227e.run();
        } else {
            C0107v.m502a(this.f1226d, this.f1227e, i);
        }
        this.f1235m = true;
    }

    /* renamed from: f */
    private float m1543f(float f, float f2) {
        if (f2 == 0.0f) {
            return 0.0f;
        }
        int i = this.f1230h;
        if (i == 0 || i == 1) {
            if (f < f2) {
                if (f >= 0.0f) {
                    return 1.0f - (f / f2);
                }
                if (this.f1238p && this.f1230h == 1) {
                    return 1.0f;
                }
            }
        } else if (i == 2 && f < 0.0f) {
            return f / (-f2);
        }
        return 0.0f;
    }

    /* renamed from: a */
    public AbstractViewOnTouchListenerC0283a m1544a(float f, float f2) {
        float[] fArr = this.f1229g;
        fArr[0] = f;
        fArr[1] = f2;
        return this;
    }

    /* renamed from: a */
    public AbstractViewOnTouchListenerC0283a m1545a(boolean z) {
        if (this.f1239q && !z) {
            m1541c();
        }
        this.f1239q = z;
        return this;
    }

    /* renamed from: a */
    void m1546a() {
        long uptimeMillis = SystemClock.uptimeMillis();
        MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
        this.f1226d.onTouchEvent(obtain);
        obtain.recycle();
    }

    /* renamed from: a */
    public abstract void mo1547a(int i, int i2);

    /* renamed from: a */
    public abstract boolean mo1548a(int i);

    /* renamed from: b */
    public AbstractViewOnTouchListenerC0283a m1549b(float f, float f2) {
        float[] fArr = this.f1234l;
        fArr[0] = f / 1000.0f;
        fArr[1] = f2 / 1000.0f;
        return this;
    }

    /* renamed from: b */
    boolean m1550b() {
        a aVar = this.f1224b;
        int m1568e = aVar.m1568e();
        int m1567d = aVar.m1567d();
        return (m1568e != 0 && mo1551b(m1568e)) || (m1567d != 0 && mo1548a(m1567d));
    }

    /* renamed from: b */
    public abstract boolean mo1551b(int i);

    /* renamed from: c */
    public AbstractViewOnTouchListenerC0283a m1552c(float f, float f2) {
        float[] fArr = this.f1233k;
        fArr[0] = f / 1000.0f;
        fArr[1] = f2 / 1000.0f;
        return this;
    }

    /* renamed from: c */
    public AbstractViewOnTouchListenerC0283a m1553c(int i) {
        this.f1231i = i;
        return this;
    }

    /* renamed from: d */
    public AbstractViewOnTouchListenerC0283a m1554d(float f, float f2) {
        float[] fArr = this.f1228f;
        fArr[0] = f;
        fArr[1] = f2;
        return this;
    }

    /* renamed from: d */
    public AbstractViewOnTouchListenerC0283a m1555d(int i) {
        this.f1230h = i;
        return this;
    }

    /* renamed from: e */
    public AbstractViewOnTouchListenerC0283a m1556e(float f, float f2) {
        float[] fArr = this.f1232j;
        fArr[0] = f / 1000.0f;
        fArr[1] = f2 / 1000.0f;
        return this;
    }

    /* renamed from: e */
    public AbstractViewOnTouchListenerC0283a m1557e(int i) {
        this.f1224b.m1563a(i);
        return this;
    }

    /* renamed from: f */
    public AbstractViewOnTouchListenerC0283a m1558f(int i) {
        this.f1224b.m1565b(i);
        return this;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0013, code lost:            if (r0 != 3) goto L20;     */
    @Override // android.view.View.OnTouchListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean onTouch(android.view.View r6, android.view.MotionEvent r7) {
        /*
            r5 = this;
            boolean r0 = r5.f1239q
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            int r0 = r7.getActionMasked()
            r2 = 1
            if (r0 == 0) goto L1a
            if (r0 == r2) goto L16
            r3 = 2
            if (r0 == r3) goto L1e
            r6 = 3
            if (r0 == r6) goto L16
            goto L58
        L16:
            r5.m1541c()
            goto L58
        L1a:
            r5.f1237o = r2
            r5.f1235m = r1
        L1e:
            float r0 = r7.getX()
            int r3 = r6.getWidth()
            float r3 = (float) r3
            android.view.View r4 = r5.f1226d
            int r4 = r4.getWidth()
            float r4 = (float) r4
            float r0 = r5.m1539a(r1, r0, r3, r4)
            float r7 = r7.getY()
            int r6 = r6.getHeight()
            float r6 = (float) r6
            android.view.View r3 = r5.f1226d
            int r3 = r3.getHeight()
            float r3 = (float) r3
            float r6 = r5.m1539a(r2, r7, r6, r3)
            android.support.v4.widget.a$a r7 = r5.f1224b
            r7.m1562a(r0, r6)
            boolean r6 = r5.f1238p
            if (r6 != 0) goto L58
            boolean r6 = r5.m1550b()
            if (r6 == 0) goto L58
            r5.m1542d()
        L58:
            boolean r6 = r5.f1240r
            if (r6 == 0) goto L61
            boolean r6 = r5.f1238p
            if (r6 == 0) goto L61
            r1 = 1
        L61:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v4.widget.AbstractViewOnTouchListenerC0283a.onTouch(android.view.View, android.view.MotionEvent):boolean");
    }
}
