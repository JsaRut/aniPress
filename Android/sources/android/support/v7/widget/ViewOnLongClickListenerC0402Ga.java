package android.support.v7.widget;

import android.text.TextUtils;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.accessibility.AccessibilityManager;
import p000a.p005b.p009c.p019h.C0107v;
import p000a.p005b.p009c.p019h.C0108w;

/* renamed from: android.support.v7.widget.Ga */
/* loaded from: classes.dex */
class ViewOnLongClickListenerC0402Ga implements View.OnLongClickListener, View.OnHoverListener, View.OnAttachStateChangeListener {

    /* renamed from: a */
    private static ViewOnLongClickListenerC0402Ga f2033a;

    /* renamed from: b */
    private static ViewOnLongClickListenerC0402Ga f2034b;

    /* renamed from: c */
    private final View f2035c;

    /* renamed from: d */
    private final CharSequence f2036d;

    /* renamed from: e */
    private final int f2037e;

    /* renamed from: f */
    private final Runnable f2038f = new RunnableC0398Ea(this);

    /* renamed from: g */
    private final Runnable f2039g = new RunnableC0400Fa(this);

    /* renamed from: h */
    private int f2040h;

    /* renamed from: i */
    private int f2041i;

    /* renamed from: j */
    private C0404Ha f2042j;

    /* renamed from: k */
    private boolean f2043k;

    private ViewOnLongClickListenerC0402Ga(View view, CharSequence charSequence) {
        this.f2035c = view;
        this.f2036d = charSequence;
        this.f2037e = C0108w.m543a(ViewConfiguration.get(this.f2035c.getContext()));
        m2198c();
        this.f2035c.setOnLongClickListener(this);
        this.f2035c.setOnHoverListener(this);
    }

    /* renamed from: a */
    private static void m2194a(ViewOnLongClickListenerC0402Ga viewOnLongClickListenerC0402Ga) {
        ViewOnLongClickListenerC0402Ga viewOnLongClickListenerC0402Ga2 = f2033a;
        if (viewOnLongClickListenerC0402Ga2 != null) {
            viewOnLongClickListenerC0402Ga2.m2197b();
        }
        f2033a = viewOnLongClickListenerC0402Ga;
        ViewOnLongClickListenerC0402Ga viewOnLongClickListenerC0402Ga3 = f2033a;
        if (viewOnLongClickListenerC0402Ga3 != null) {
            viewOnLongClickListenerC0402Ga3.m2199d();
        }
    }

    /* renamed from: a */
    public static void m2195a(View view, CharSequence charSequence) {
        ViewOnLongClickListenerC0402Ga viewOnLongClickListenerC0402Ga = f2033a;
        if (viewOnLongClickListenerC0402Ga != null && viewOnLongClickListenerC0402Ga.f2035c == view) {
            m2194a((ViewOnLongClickListenerC0402Ga) null);
        }
        if (!TextUtils.isEmpty(charSequence)) {
            new ViewOnLongClickListenerC0402Ga(view, charSequence);
            return;
        }
        ViewOnLongClickListenerC0402Ga viewOnLongClickListenerC0402Ga2 = f2034b;
        if (viewOnLongClickListenerC0402Ga2 != null && viewOnLongClickListenerC0402Ga2.f2035c == view) {
            viewOnLongClickListenerC0402Ga2.m2200a();
        }
        view.setOnLongClickListener(null);
        view.setLongClickable(false);
        view.setOnHoverListener(null);
    }

    /* renamed from: a */
    private boolean m2196a(MotionEvent motionEvent) {
        int x = (int) motionEvent.getX();
        int y = (int) motionEvent.getY();
        if (Math.abs(x - this.f2040h) <= this.f2037e && Math.abs(y - this.f2041i) <= this.f2037e) {
            return false;
        }
        this.f2040h = x;
        this.f2041i = y;
        return true;
    }

    /* renamed from: b */
    private void m2197b() {
        this.f2035c.removeCallbacks(this.f2038f);
    }

    /* renamed from: c */
    private void m2198c() {
        this.f2040h = Integer.MAX_VALUE;
        this.f2041i = Integer.MAX_VALUE;
    }

    /* renamed from: d */
    private void m2199d() {
        this.f2035c.postDelayed(this.f2038f, ViewConfiguration.getLongPressTimeout());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public void m2200a() {
        if (f2034b == this) {
            f2034b = null;
            C0404Ha c0404Ha = this.f2042j;
            if (c0404Ha != null) {
                c0404Ha.m2225a();
                this.f2042j = null;
                m2198c();
                this.f2035c.removeOnAttachStateChangeListener(this);
            } else {
                Log.e("TooltipCompatHandler", "sActiveHandler.mPopup == null");
            }
        }
        if (f2033a == this) {
            m2194a((ViewOnLongClickListenerC0402Ga) null);
        }
        this.f2035c.removeCallbacks(this.f2039g);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public void m2201a(boolean z) {
        long longPressTimeout;
        if (C0107v.m529q(this.f2035c)) {
            m2194a((ViewOnLongClickListenerC0402Ga) null);
            ViewOnLongClickListenerC0402Ga viewOnLongClickListenerC0402Ga = f2034b;
            if (viewOnLongClickListenerC0402Ga != null) {
                viewOnLongClickListenerC0402Ga.m2200a();
            }
            f2034b = this;
            this.f2043k = z;
            this.f2042j = new C0404Ha(this.f2035c.getContext());
            this.f2042j.m2226a(this.f2035c, this.f2040h, this.f2041i, this.f2043k, this.f2036d);
            this.f2035c.addOnAttachStateChangeListener(this);
            if (this.f2043k) {
                longPressTimeout = 2500;
            } else {
                longPressTimeout = ((C0107v.m525m(this.f2035c) & 1) == 1 ? 3000L : 15000L) - ViewConfiguration.getLongPressTimeout();
            }
            this.f2035c.removeCallbacks(this.f2039g);
            this.f2035c.postDelayed(this.f2039g, longPressTimeout);
        }
    }

    @Override // android.view.View.OnHoverListener
    public boolean onHover(View view, MotionEvent motionEvent) {
        if (this.f2042j != null && this.f2043k) {
            return false;
        }
        AccessibilityManager accessibilityManager = (AccessibilityManager) this.f2035c.getContext().getSystemService("accessibility");
        if (accessibilityManager.isEnabled() && accessibilityManager.isTouchExplorationEnabled()) {
            return false;
        }
        int action = motionEvent.getAction();
        if (action != 7) {
            if (action == 10) {
                m2198c();
                m2200a();
            }
        } else if (this.f2035c.isEnabled() && this.f2042j == null && m2196a(motionEvent)) {
            m2194a(this);
        }
        return false;
    }

    @Override // android.view.View.OnLongClickListener
    public boolean onLongClick(View view) {
        this.f2040h = view.getWidth() / 2;
        this.f2041i = view.getHeight() / 2;
        m2201a(true);
        return true;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewAttachedToWindow(View view) {
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewDetachedFromWindow(View view) {
        m2200a();
    }
}
