package android.support.v7.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import p000a.p005b.p009c.p019h.C0074H;
import p000a.p005b.p009c.p019h.C0107v;
import p000a.p005b.p009c.p019h.InterfaceC0075I;
import p000a.p005b.p022d.p023a.C0112a;
import p000a.p005b.p022d.p023a.C0121j;

/* renamed from: android.support.v7.widget.a */
/* loaded from: classes.dex */
public abstract class AbstractC0436a extends ViewGroup {

    /* renamed from: a */
    protected final a f2303a;

    /* renamed from: b */
    protected final Context f2304b;

    /* renamed from: c */
    protected ActionMenuView f2305c;

    /* renamed from: d */
    protected C0448g f2306d;

    /* renamed from: e */
    protected int f2307e;

    /* renamed from: f */
    protected C0074H f2308f;

    /* renamed from: g */
    private boolean f2309g;

    /* renamed from: h */
    private boolean f2310h;

    /* renamed from: android.support.v7.widget.a$a */
    /* loaded from: classes.dex */
    public class a implements InterfaceC0075I {

        /* renamed from: a */
        private boolean f2311a = false;

        /* renamed from: b */
        int f2312b;

        protected a() {
        }

        /* renamed from: a */
        public a m2434a(C0074H c0074h, int i) {
            AbstractC0436a.this.f2308f = c0074h;
            this.f2312b = i;
            return this;
        }

        @Override // p000a.p005b.p009c.p019h.InterfaceC0075I
        /* renamed from: a */
        public void mo348a(View view) {
            this.f2311a = true;
        }

        @Override // p000a.p005b.p009c.p019h.InterfaceC0075I
        /* renamed from: b */
        public void mo349b(View view) {
            if (this.f2311a) {
                return;
            }
            AbstractC0436a abstractC0436a = AbstractC0436a.this;
            abstractC0436a.f2308f = null;
            AbstractC0436a.super.setVisibility(this.f2312b);
        }

        @Override // p000a.p005b.p009c.p019h.InterfaceC0075I
        /* renamed from: c */
        public void mo350c(View view) {
            AbstractC0436a.super.setVisibility(0);
            this.f2311a = false;
        }
    }

    AbstractC0436a(Context context) {
        this(context, null);
    }

    AbstractC0436a(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public AbstractC0436a(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        int i2;
        this.f2303a = new a();
        TypedValue typedValue = new TypedValue();
        if (!context.getTheme().resolveAttribute(C0112a.actionBarPopupTheme, typedValue, true) || (i2 = typedValue.resourceId) == 0) {
            this.f2304b = context;
        } else {
            this.f2304b = new ContextThemeWrapper(context, i2);
        }
    }

    /* renamed from: a */
    public static int m2429a(int i, int i2, boolean z) {
        return z ? i - i2 : i + i2;
    }

    /* renamed from: a */
    public int m2432a(View view, int i, int i2, int i3) {
        view.measure(View.MeasureSpec.makeMeasureSpec(i, Integer.MIN_VALUE), i2);
        return Math.max(0, (i - view.getMeasuredWidth()) - i3);
    }

    /* renamed from: a */
    public int m2433a(View view, int i, int i2, int i3, boolean z) {
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        int i4 = i2 + ((i3 - measuredHeight) / 2);
        if (z) {
            view.layout(i - measuredWidth, i4, i, measuredHeight + i4);
        } else {
            view.layout(i, i4, i + measuredWidth, measuredHeight + i4);
        }
        return z ? -measuredWidth : measuredWidth;
    }

    /* renamed from: a */
    public C0074H mo2105a(int i, long j) {
        C0074H c0074h = this.f2308f;
        if (c0074h != null) {
            c0074h.m343a();
        }
        if (i != 0) {
            C0074H m490a = C0107v.m490a(this);
            m490a.m338a(0.0f);
            m490a.m339a(j);
            a aVar = this.f2303a;
            aVar.m2434a(m490a, i);
            m490a.m340a(aVar);
            return m490a;
        }
        if (getVisibility() != 0) {
            setAlpha(0.0f);
        }
        C0074H m490a2 = C0107v.m490a(this);
        m490a2.m338a(1.0f);
        m490a2.m339a(j);
        a aVar2 = this.f2303a;
        aVar2.m2434a(m490a2, i);
        m490a2.m340a(aVar2);
        return m490a2;
    }

    public int getAnimatedVisibility() {
        return this.f2308f != null ? this.f2303a.f2312b : getVisibility();
    }

    public int getContentHeight() {
        return this.f2307e;
    }

    @Override // android.view.View
    protected void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(null, C0121j.ActionBar, C0112a.actionBarStyle, 0);
        setContentHeight(obtainStyledAttributes.getLayoutDimension(C0121j.ActionBar_height, 0));
        obtainStyledAttributes.recycle();
        C0448g c0448g = this.f2306d;
        if (c0448g != null) {
            c0448g.m2451a(configuration);
        }
    }

    @Override // android.view.View
    public boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 9) {
            this.f2310h = false;
        }
        if (!this.f2310h) {
            boolean onHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9 && !onHoverEvent) {
                this.f2310h = true;
            }
        }
        if (actionMasked == 10 || actionMasked == 3) {
            this.f2310h = false;
        }
        return true;
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f2309g = false;
        }
        if (!this.f2309g) {
            boolean onTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0 && !onTouchEvent) {
                this.f2309g = true;
            }
        }
        if (actionMasked == 1 || actionMasked == 3) {
            this.f2309g = false;
        }
        return true;
    }

    public abstract void setContentHeight(int i);

    @Override // android.view.View
    public void setVisibility(int i) {
        if (i != getVisibility()) {
            C0074H c0074h = this.f2308f;
            if (c0074h != null) {
                c0074h.m343a();
            }
            super.setVisibility(i);
        }
    }
}
