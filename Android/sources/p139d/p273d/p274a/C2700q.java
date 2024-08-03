package p139d.p273d.p274a;

/* renamed from: d.d.a.q */
/* loaded from: classes.dex */
public class C2700q {

    /* renamed from: a */
    private long f11342a;

    /* renamed from: b */
    private long f11343b;

    /* renamed from: c */
    private double f11344c;

    /* renamed from: d */
    private double f11345d;

    /* renamed from: e */
    private float f11346e;

    /* renamed from: f */
    private float f11347f;

    /* renamed from: g */
    private boolean f11348g;

    /* renamed from: h */
    private int[] f11349h = new int[2];

    /* renamed from: i */
    private a f11350i;

    /* renamed from: d.d.a.q$a */
    /* loaded from: classes.dex */
    public interface a {
        /* renamed from: a */
        void mo11620a(C2700q c2700q);

        /* renamed from: b */
        boolean mo11621b(C2700q c2700q);

        /* renamed from: c */
        boolean mo11622c(C2700q c2700q);
    }

    public C2700q(a aVar) {
        this.f11350i = aVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x007e  */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void m11613b(android.view.MotionEvent r7) {
        /*
            r6 = this;
            long r0 = r6.f11342a
            r6.f11343b = r0
            long r0 = r7.getEventTime()
            r6.f11342a = r0
            int[] r0 = r6.f11349h
            r1 = 0
            r0 = r0[r1]
            int r0 = r7.findPointerIndex(r0)
            int[] r1 = r6.f11349h
            r2 = 1
            r1 = r1[r2]
            int r1 = r7.findPointerIndex(r1)
            float r2 = r7.getX(r0)
            float r0 = r7.getY(r0)
            float r3 = r7.getX(r1)
            float r7 = r7.getY(r1)
            float r1 = r3 - r2
            float r4 = r7 - r0
            float r2 = r2 + r3
            r3 = 1056964608(0x3f000000, float:0.5)
            float r2 = r2 * r3
            r6.f11346e = r2
            float r0 = r0 + r7
            float r0 = r0 * r3
            r6.f11347f = r0
            double r2 = (double) r4
            double r0 = (double) r1
            double r0 = java.lang.Math.atan2(r2, r0)
            double r0 = -r0
            double r2 = r6.f11344c
            boolean r7 = java.lang.Double.isNaN(r2)
            if (r7 == 0) goto L4e
            r2 = 0
            goto L51
        L4e:
            double r2 = r6.f11344c
            double r2 = r2 - r0
        L51:
            r6.f11345d = r2
            r6.f11344c = r0
            double r0 = r6.f11345d
            r2 = 4614256656552045848(0x400921fb54442d18, double:3.141592653589793)
            int r7 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r7 <= 0) goto L64
            double r0 = r0 - r2
        L61:
            r6.f11345d = r0
            goto L6f
        L64:
            r4 = -4609115380302729960(0xc00921fb54442d18, double:-3.141592653589793)
            int r7 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r7 >= 0) goto L6f
            double r0 = r0 + r2
            goto L61
        L6f:
            double r0 = r6.f11345d
            r4 = 4609753056924675352(0x3ff921fb54442d18, double:1.5707963267948966)
            int r7 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r7 <= 0) goto L7e
            double r0 = r0 - r2
        L7b:
            r6.f11345d = r0
            goto L89
        L7e:
            r4 = -4613618979930100456(0xbff921fb54442d18, double:-1.5707963267948966)
            int r7 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r7 >= 0) goto L89
            double r0 = r0 + r2
            goto L7b
        L89:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p139d.p273d.p274a.C2700q.m11613b(android.view.MotionEvent):void");
    }

    /* renamed from: e */
    private void m11614e() {
        if (this.f11348g) {
            this.f11348g = false;
            a aVar = this.f11350i;
            if (aVar != null) {
                aVar.mo11620a(this);
            }
        }
    }

    /* renamed from: a */
    public float m11615a() {
        return this.f11346e;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0028, code lost:            if (r5 != r0[1]) goto L31;     */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean m11616a(android.view.MotionEvent r5) {
        /*
            r4 = this;
            int r0 = r5.getActionMasked()
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L65
            if (r0 == r2) goto L61
            r3 = 2
            if (r0 == r3) goto L52
            r3 = 5
            if (r0 == r3) goto L2b
            r3 = 6
            if (r0 == r3) goto L14
            goto L78
        L14:
            boolean r0 = r4.f11348g
            if (r0 == 0) goto L78
            int r0 = r5.getActionIndex()
            int r5 = r5.getPointerId(r0)
            int[] r0 = r4.f11349h
            r1 = r0[r1]
            if (r5 == r1) goto L61
            r0 = r0[r2]
            if (r5 != r0) goto L78
            goto L61
        L2b:
            boolean r0 = r4.f11348g
            if (r0 != 0) goto L78
            int[] r0 = r4.f11349h
            int r1 = r5.getActionIndex()
            int r1 = r5.getPointerId(r1)
            r0[r2] = r1
            r4.f11348g = r2
            long r0 = r5.getEventTime()
            r4.f11343b = r0
            r0 = 9221120237041090560(0x7ff8000000000000, double:NaN)
            r4.f11344c = r0
            r4.m11613b(r5)
            d.d.a.q$a r5 = r4.f11350i
            if (r5 == 0) goto L78
            r5.mo11622c(r4)
            goto L78
        L52:
            boolean r0 = r4.f11348g
            if (r0 == 0) goto L78
            r4.m11613b(r5)
            d.d.a.q$a r5 = r4.f11350i
            if (r5 == 0) goto L78
            r5.mo11621b(r4)
            goto L78
        L61:
            r4.m11614e()
            goto L78
        L65:
            r4.f11348g = r1
            int[] r0 = r4.f11349h
            int r3 = r5.getActionIndex()
            int r5 = r5.getPointerId(r3)
            r0[r1] = r5
            int[] r5 = r4.f11349h
            r0 = -1
            r5[r2] = r0
        L78:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p139d.p273d.p274a.C2700q.m11616a(android.view.MotionEvent):boolean");
    }

    /* renamed from: b */
    public float m11617b() {
        return this.f11347f;
    }

    /* renamed from: c */
    public double m11618c() {
        return this.f11345d;
    }

    /* renamed from: d */
    public long m11619d() {
        return this.f11342a - this.f11343b;
    }
}
