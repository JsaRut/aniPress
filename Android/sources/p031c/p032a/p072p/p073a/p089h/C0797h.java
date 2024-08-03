package p031c.p032a.p072p.p073a.p089h;

import android.graphics.Point;
import android.graphics.Rect;
import android.util.Pair;
import android.view.MotionEvent;
import android.view.View;
import android.view.WindowManager;
import android.webkit.WebView;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import p031c.p032a.p072p.p073a.p080f.C0758g;
import p031c.p032a.p072p.p073a.p080f.p081a.C0732b;
import p031c.p032a.p072p.p073a.p080f.p087g.C0765g;
import p031c.p032a.p072p.p073a.p080f.p087g.RunnableC0762d;
import p031c.p032a.p072p.p073a.p088g.C0775c;

/* renamed from: c.a.p.a.h.h */
/* loaded from: classes.dex */
public final class C0797h extends FrameLayout {

    /* renamed from: a */
    public static int f3474a;

    /* renamed from: b */
    public static int f3475b;

    /* renamed from: c */
    public static int f3476c;

    /* renamed from: d */
    private WindowManager f3477d;

    /* renamed from: e */
    private int f3478e;

    /* renamed from: f */
    private C0800k f3479f;

    /* renamed from: g */
    private C0801l f3480g;

    /* renamed from: h */
    private int f3481h;

    /* renamed from: i */
    private C0799j f3482i;

    /* renamed from: j */
    private C0803n f3483j;

    /* renamed from: k */
    private float f3484k;

    /* renamed from: l */
    private float f3485l;

    /* renamed from: m */
    private boolean f3486m;

    /* renamed from: n */
    private float f3487n;

    /* renamed from: o */
    private float f3488o;

    /* renamed from: p */
    private float f3489p;

    /* renamed from: q */
    private float f3490q;

    /* renamed from: r */
    private Point f3491r;

    /* renamed from: s */
    private View[] f3492s;

    /* renamed from: t */
    private LinkedHashMap<View, List<View>> f3493t;

    /* renamed from: u */
    private View f3494u;

    /* renamed from: v */
    InterfaceC0798i f3495v;

    /* JADX WARN: Code restructure failed: missing block: B:23:0x003f, code lost:            if (r14 >= 24) goto L54;     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:6:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x00e6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public C0797h(android.content.Context r14) {
        /*
            Method dump skipped, instructions count: 430
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p031c.p032a.p072p.p073a.p089h.C0797h.<init>(android.content.Context):void");
    }

    /* renamed from: a */
    private void m3904a(View view, View view2, View view3) {
        try {
            Rect rect = new Rect();
            view2.getGlobalVisibleRect(rect);
            if (view3 != null) {
                int[] iArr = new int[2];
                view3.getLocationOnScreen(iArr);
                rect.offset(iArr[0], iArr[1]);
            }
            WindowManager.LayoutParams layoutParams = (WindowManager.LayoutParams) view.getLayoutParams();
            if (layoutParams == null) {
                layoutParams = new WindowManager.LayoutParams(0, 0, this.f3481h, C0804o.f3508a, -3);
            }
            layoutParams.width = rect.width();
            layoutParams.height = rect.height();
            layoutParams.x = rect.left;
            layoutParams.y = rect.top;
            this.f3477d.removeView(view);
            this.f3477d.addView(view, layoutParams);
            view.setVisibility(0);
        } catch (Throwable unused) {
        }
    }

    /* renamed from: c */
    private void m3905c() {
        C0803n c0803n = this.f3483j;
        if (c0803n != null) {
            c0803n.removeAllViews();
            this.f3477d.removeView(this.f3483j);
            this.f3483j = null;
        }
    }

    /* renamed from: d */
    private Pair<View, View> m3906d() {
        if (this.f3493t.isEmpty()) {
            return null;
        }
        Rect rect = new Rect();
        int[] iArr = new int[2];
        ListIterator listIterator = new LinkedList(this.f3493t.entrySet()).listIterator(this.f3493t.size());
        while (listIterator.hasPrevious()) {
            Map.Entry entry = (Map.Entry) listIterator.previous();
            View view = (View) entry.getKey();
            List list = (List) entry.getValue();
            view.getLocationOnScreen(iArr);
            for (int size = list.size() - 1; size >= 0; size--) {
                View view2 = (View) list.get(size);
                view2.getGlobalVisibleRect(rect);
                rect.offset(iArr[0], iArr[1]);
                Point point = this.f3491r;
                if (rect.contains(point.x, point.y)) {
                    if (view2 instanceof WebView) {
                        Point point2 = this.f3491r;
                        RunnableC0762d.m3806a(view2, "getElemetByPoint", Integer.valueOf(point2.x - rect.left), Integer.valueOf(point2.y - rect.top));
                    }
                    return new Pair<>(view, view2);
                }
            }
        }
        return null;
    }

    /* renamed from: a */
    public final void m3907a() {
        if (C0775c.m3855b(getContext())) {
            if (this.f3483j == null) {
                this.f3483j = new C0803n(getContext());
                WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams(-1, -1, this.f3481h, C0804o.f3509b, -3);
                layoutParams.gravity = 51;
                layoutParams.setTitle("CircleTipWindow:" + getContext().getPackageName());
                this.f3483j.setLayoutParams(layoutParams);
            }
            if (this.f3483j.getParent() == null) {
                WindowManager windowManager = this.f3477d;
                C0803n c0803n = this.f3483j;
                windowManager.addView(c0803n, c0803n.getLayoutParams());
                bringToFront();
            }
            C0775c.m3854a(getContext(), false);
        }
        if (getParent() != null) {
            setVisibility(0);
            this.f3480g.setVisibility(0);
            bringToFront();
            return;
        }
        int i = f3476c;
        WindowManager.LayoutParams layoutParams2 = new WindowManager.LayoutParams(i, i, this.f3481h, C0804o.f3509b, -3);
        layoutParams2.gravity = 51;
        int i2 = f3474a;
        int i3 = f3476c;
        layoutParams2.x = (i2 - i3) / 2;
        layoutParams2.y = (f3475b - i3) / 2;
        layoutParams2.setTitle("AnchorWindow:" + getContext().getPackageName());
        this.f3477d.addView(this, layoutParams2);
        this.f3482i.m3910a();
    }

    /* renamed from: b */
    public final void m3908b() {
        if (getParent() != null) {
            this.f3477d.removeView(this);
        }
        C0800k c0800k = this.f3479f;
        if (c0800k != null && c0800k.getParent() != null) {
            this.f3477d.removeView(this.f3479f);
        }
        C0801l c0801l = this.f3480g;
        if (c0801l != null && c0801l.getParent() != null) {
            this.f3477d.removeView(this.f3480g);
        }
        C0803n c0803n = this.f3483j;
        if (c0803n != null && c0803n.getParent() != null) {
            this.f3477d.removeView(this.f3483j);
        }
        C0799j c0799j = this.f3482i;
        if (c0799j == null || c0799j.getParent() == null) {
            return;
        }
        this.f3477d.removeView(this.f3482i);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        try {
            int action = motionEvent.getAction();
            boolean z = true;
            if (action != 0) {
                if (action != 1) {
                    if (action != 2) {
                        if (action != 3) {
                        }
                    } else if (this.f3486m) {
                        this.f3487n = motionEvent.getRawX();
                        this.f3488o = motionEvent.getRawY();
                        if (Math.abs(this.f3487n - this.f3489p) >= this.f3478e || Math.abs(this.f3488o - this.f3490q) >= this.f3478e) {
                            if (this.f3483j != null) {
                                m3905c();
                            }
                            WindowManager.LayoutParams layoutParams = (WindowManager.LayoutParams) getLayoutParams();
                            int i = (int) (this.f3487n - this.f3484k);
                            int i2 = (int) (this.f3488o - this.f3485l);
                            if (i < 0) {
                                i = 0;
                            }
                            if (i2 < 0) {
                                i2 = 0;
                            }
                            if (getContext().getResources().getConfiguration().orientation != 1) {
                                z = false;
                            }
                            int width = f3474a - getWidth();
                            int height = f3475b - getHeight();
                            int i3 = z ? width : height;
                            if (i > i3) {
                                i = i3;
                            }
                            if (z) {
                                width = height;
                            }
                            if (i2 > width) {
                                i2 = width;
                            }
                            if (i2 < 0) {
                                i2 = 0;
                            }
                            layoutParams.x = i;
                            layoutParams.y = i2;
                            this.f3477d.updateViewLayout(this, layoutParams);
                            Rect rect = new Rect();
                            getGlobalVisibleRect(rect);
                            if (rect.contains((int) this.f3489p, (int) this.f3490q)) {
                                this.f3482i.setVisibility(8);
                            } else {
                                this.f3491r = new Point((int) this.f3487n, (int) this.f3488o);
                                Pair<View, View> m3906d = m3906d();
                                View view = m3906d != null ? (View) m3906d.second : null;
                                if (view != null && !(view instanceof WebView)) {
                                    if (!view.equals(this.f3494u)) {
                                        this.f3494u = view;
                                        m3904a(this.f3479f, this.f3494u, (View) m3906d.first);
                                    } else if (!view.equals(this.f3494u)) {
                                        this.f3479f.setVisibility(8);
                                    } else if (this.f3479f.getVisibility() == 8) {
                                        this.f3479f.setVisibility(0);
                                    }
                                }
                                this.f3479f.setVisibility(8);
                                this.f3494u = view;
                            }
                        }
                    }
                }
                this.f3486m = false;
                this.f3479f.setVisibility(8);
                if (this.f3494u != null) {
                    if (this.f3494u instanceof WebView) {
                        RunnableC0762d.m3806a(this.f3494u, "cancleHoverNode", new Object[0]);
                    } else {
                        ActivityC0790a.m3901a(this.f3494u);
                    }
                    return true;
                }
                if (this.f3495v != null && Math.abs(this.f3487n - this.f3489p) < 0.1f && Math.abs(this.f3488o - this.f3490q) < 0.1f) {
                    m3905c();
                    this.f3495v.mo3909a();
                    return true;
                }
            } else {
                this.f3486m = true;
                this.f3484k = motionEvent.getX();
                this.f3485l = motionEvent.getY();
                this.f3489p = motionEvent.getRawX();
                this.f3490q = motionEvent.getRawY();
                this.f3487n = motionEvent.getRawX();
                this.f3488o = motionEvent.getRawY();
                this.f3480g.removeAllViews();
                this.f3492s = C0765g.m3813b();
                if (this.f3492s != null && this.f3492s.length != 0) {
                    this.f3493t.clear();
                    for (View view2 : this.f3492s) {
                        ArrayList arrayList = new ArrayList();
                        C0758g.m3793a((List<View>) arrayList, view2, false);
                        this.f3493t.put(view2, arrayList);
                    }
                }
            }
            return super.onTouchEvent(motionEvent);
        } catch (Throwable th) {
            C0732b.m3725h("CircleView", "onTouchEvent e:" + th);
            return super.onTouchEvent(motionEvent);
        }
    }
}
