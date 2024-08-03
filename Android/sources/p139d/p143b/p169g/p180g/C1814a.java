package p139d.p143b.p169g.p180g;

import android.content.Context;
import android.view.ViewConfiguration;

/* renamed from: d.b.g.g.a */
/* loaded from: classes.dex */
public class C1814a {

    /* renamed from: a */
    a f6703a;

    /* renamed from: b */
    final float f6704b;

    /* renamed from: c */
    boolean f6705c;

    /* renamed from: d */
    boolean f6706d;

    /* renamed from: e */
    long f6707e;

    /* renamed from: f */
    float f6708f;

    /* renamed from: g */
    float f6709g;

    /* renamed from: d.b.g.g.a$a */
    /* loaded from: classes.dex */
    public interface a {
        /* renamed from: d */
        boolean mo7284d();
    }

    public C1814a(Context context) {
        this.f6704b = ViewConfiguration.get(context).getScaledTouchSlop();
        m7472a();
    }

    /* renamed from: a */
    public static C1814a m7471a(Context context) {
        return new C1814a(context);
    }

    /* renamed from: a */
    public void m7472a() {
        this.f6703a = null;
        m7476c();
    }

    /* renamed from: a */
    public void m7473a(a aVar) {
        this.f6703a = aVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0038, code lost:            if (java.lang.Math.abs(r8.getY() - r7.f6709g) <= r7.f6704b) goto L31;     */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean m7474a(android.view.MotionEvent r8) {
        /*
            r7 = this;
            int r0 = r8.getAction()
            r1 = 1
            if (r0 == 0) goto L7d
            r2 = 0
            if (r0 == r1) goto L3b
            r3 = 2
            if (r0 == r3) goto L18
            r8 = 3
            if (r0 == r8) goto L12
            goto L93
        L12:
            r7.f6705c = r2
        L14:
            r7.f6706d = r2
            goto L93
        L18:
            float r0 = r8.getX()
            float r3 = r7.f6708f
            float r0 = r0 - r3
            float r0 = java.lang.Math.abs(r0)
            float r3 = r7.f6704b
            int r0 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r0 > 0) goto L14
            float r8 = r8.getY()
            float r0 = r7.f6709g
            float r8 = r8 - r0
            float r8 = java.lang.Math.abs(r8)
            float r0 = r7.f6704b
            int r8 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
            if (r8 <= 0) goto L93
            goto L14
        L3b:
            r7.f6705c = r2
            float r0 = r8.getX()
            float r3 = r7.f6708f
            float r0 = r0 - r3
            float r0 = java.lang.Math.abs(r0)
            float r3 = r7.f6704b
            int r0 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r0 > 0) goto L5f
            float r0 = r8.getY()
            float r3 = r7.f6709g
            float r0 = r0 - r3
            float r0 = java.lang.Math.abs(r0)
            float r3 = r7.f6704b
            int r0 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r0 <= 0) goto L61
        L5f:
            r7.f6706d = r2
        L61:
            boolean r0 = r7.f6706d
            if (r0 == 0) goto L14
            long r3 = r8.getEventTime()
            long r5 = r7.f6707e
            long r3 = r3 - r5
            int r8 = android.view.ViewConfiguration.getLongPressTimeout()
            long r5 = (long) r8
            int r8 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r8 > 0) goto L14
            d.b.g.g.a$a r8 = r7.f6703a
            if (r8 == 0) goto L14
            r8.mo7284d()
            goto L14
        L7d:
            r7.f6705c = r1
            r7.f6706d = r1
            long r2 = r8.getEventTime()
            r7.f6707e = r2
            float r0 = r8.getX()
            r7.f6708f = r0
            float r8 = r8.getY()
            r7.f6709g = r8
        L93:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p139d.p143b.p169g.p180g.C1814a.m7474a(android.view.MotionEvent):boolean");
    }

    /* renamed from: b */
    public boolean m7475b() {
        return this.f6705c;
    }

    /* renamed from: c */
    public void m7476c() {
        this.f6705c = false;
        this.f6706d = false;
    }
}
