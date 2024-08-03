package android.support.v7.widget;

import android.os.SystemClock;
import android.support.v7.view.menu.InterfaceC0380z;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewParent;

/* renamed from: android.support.v7.widget.P */
/* loaded from: classes.dex */
public abstract class AbstractViewOnTouchListenerC0415P implements View.OnTouchListener, View.OnAttachStateChangeListener {

    /* renamed from: a */
    private final float f2098a;

    /* renamed from: b */
    private final int f2099b;

    /* renamed from: c */
    private final int f2100c;

    /* renamed from: d */
    final View f2101d;

    /* renamed from: e */
    private Runnable f2102e;

    /* renamed from: f */
    private Runnable f2103f;

    /* renamed from: g */
    private boolean f2104g;

    /* renamed from: h */
    private int f2105h;

    /* renamed from: i */
    private final int[] f2106i = new int[2];

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: android.support.v7.widget.P$a */
    /* loaded from: classes.dex */
    public class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ViewParent parent = AbstractViewOnTouchListenerC0415P.this.f2101d.getParent();
            if (parent != null) {
                parent.requestDisallowInterceptTouchEvent(true);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: android.support.v7.widget.P$b */
    /* loaded from: classes.dex */
    public class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            AbstractViewOnTouchListenerC0415P.this.m2288d();
        }
    }

    public AbstractViewOnTouchListenerC0415P(View view) {
        this.f2101d = view;
        view.setLongClickable(true);
        view.addOnAttachStateChangeListener(this);
        this.f2098a = ViewConfiguration.get(view.getContext()).getScaledTouchSlop();
        this.f2099b = ViewConfiguration.getTapTimeout();
        this.f2100c = (this.f2099b + ViewConfiguration.getLongPressTimeout()) / 2;
    }

    /* renamed from: a */
    private boolean m2281a(MotionEvent motionEvent) {
        C0413N c0413n;
        View view = this.f2101d;
        InterfaceC0380z mo1925a = mo1925a();
        if (mo1925a == null || !mo1925a.mo1940b() || (c0413n = (C0413N) mo1925a.mo1944d()) == null || !c0413n.isShown()) {
            return false;
        }
        MotionEvent obtainNoHistory = MotionEvent.obtainNoHistory(motionEvent);
        m2283a(view, obtainNoHistory);
        m2285b(c0413n, obtainNoHistory);
        boolean mo2277a = c0413n.mo2277a(obtainNoHistory, this.f2105h);
        obtainNoHistory.recycle();
        int actionMasked = motionEvent.getActionMasked();
        return mo2277a && (actionMasked != 1 && actionMasked != 3);
    }

    /* renamed from: a */
    private static boolean m2282a(View view, float f, float f2, float f3) {
        float f4 = -f3;
        return f >= f4 && f2 >= f4 && f < ((float) (view.getRight() - view.getLeft())) + f3 && f2 < ((float) (view.getBottom() - view.getTop())) + f3;
    }

    /* renamed from: a */
    private boolean m2283a(View view, MotionEvent motionEvent) {
        view.getLocationOnScreen(this.f2106i);
        motionEvent.offsetLocation(r0[0], r0[1]);
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0017, code lost:            if (r1 != 3) goto L28;     */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private boolean m2284b(android.view.MotionEvent r6) {
        /*
            r5 = this;
            android.view.View r0 = r5.f2101d
            boolean r1 = r0.isEnabled()
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            int r1 = r6.getActionMasked()
            if (r1 == 0) goto L41
            r3 = 1
            if (r1 == r3) goto L3d
            r4 = 2
            if (r1 == r4) goto L1a
            r6 = 3
            if (r1 == r6) goto L3d
            goto L6d
        L1a:
            int r1 = r5.f2105h
            int r1 = r6.findPointerIndex(r1)
            if (r1 < 0) goto L6d
            float r4 = r6.getX(r1)
            float r6 = r6.getY(r1)
            float r1 = r5.f2098a
            boolean r6 = m2282a(r0, r4, r6, r1)
            if (r6 != 0) goto L6d
            r5.m2286e()
            android.view.ViewParent r6 = r0.getParent()
            r6.requestDisallowInterceptTouchEvent(r3)
            return r3
        L3d:
            r5.m2286e()
            goto L6d
        L41:
            int r6 = r6.getPointerId(r2)
            r5.f2105h = r6
            java.lang.Runnable r6 = r5.f2102e
            if (r6 != 0) goto L52
            android.support.v7.widget.P$a r6 = new android.support.v7.widget.P$a
            r6.<init>()
            r5.f2102e = r6
        L52:
            java.lang.Runnable r6 = r5.f2102e
            int r1 = r5.f2099b
            long r3 = (long) r1
            r0.postDelayed(r6, r3)
            java.lang.Runnable r6 = r5.f2103f
            if (r6 != 0) goto L65
            android.support.v7.widget.P$b r6 = new android.support.v7.widget.P$b
            r6.<init>()
            r5.f2103f = r6
        L65:
            java.lang.Runnable r6 = r5.f2103f
            int r1 = r5.f2100c
            long r3 = (long) r1
            r0.postDelayed(r6, r3)
        L6d:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v7.widget.AbstractViewOnTouchListenerC0415P.m2284b(android.view.MotionEvent):boolean");
    }

    /* renamed from: b */
    private boolean m2285b(View view, MotionEvent motionEvent) {
        view.getLocationOnScreen(this.f2106i);
        motionEvent.offsetLocation(-r0[0], -r0[1]);
        return true;
    }

    /* renamed from: e */
    private void m2286e() {
        Runnable runnable = this.f2103f;
        if (runnable != null) {
            this.f2101d.removeCallbacks(runnable);
        }
        Runnable runnable2 = this.f2102e;
        if (runnable2 != null) {
            this.f2101d.removeCallbacks(runnable2);
        }
    }

    /* renamed from: a */
    public abstract InterfaceC0380z mo1925a();

    /* renamed from: b */
    protected abstract boolean mo1926b();

    /* renamed from: c */
    protected boolean mo2287c() {
        InterfaceC0380z mo1925a = mo1925a();
        if (mo1925a == null || !mo1925a.mo1940b()) {
            return true;
        }
        mo1925a.dismiss();
        return true;
    }

    /* renamed from: d */
    void m2288d() {
        m2286e();
        View view = this.f2101d;
        if (view.isEnabled() && !view.isLongClickable() && mo1926b()) {
            view.getParent().requestDisallowInterceptTouchEvent(true);
            long uptimeMillis = SystemClock.uptimeMillis();
            MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
            view.onTouchEvent(obtain);
            obtain.recycle();
            this.f2104g = true;
        }
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
        boolean z;
        boolean z2 = this.f2104g;
        if (z2) {
            z = m2281a(motionEvent) || !mo2287c();
        } else {
            z = m2284b(motionEvent) && mo1926b();
            if (z) {
                long uptimeMillis = SystemClock.uptimeMillis();
                MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                this.f2101d.onTouchEvent(obtain);
                obtain.recycle();
            }
        }
        this.f2104g = z;
        return z || z2;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewAttachedToWindow(View view) {
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewDetachedFromWindow(View view) {
        this.f2104g = false;
        this.f2105h = -1;
        Runnable runnable = this.f2102e;
        if (runnable != null) {
            this.f2101d.removeCallbacks(runnable);
        }
    }
}
