package com.facebook.react.views.viewpager;

import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.uimanager.UIManagerModule;
import com.facebook.react.uimanager.events.C1333f;
import com.facebook.react.uimanager.events.C1336i;
import java.util.ArrayList;
import java.util.List;
import p000a.p005b.p009c.p019h.AbstractC0103r;
import p000a.p005b.p009c.p019h.C0069C;
import p139d.p143b.p148c.p153e.C1700a;

/* renamed from: com.facebook.react.views.viewpager.e */
/* loaded from: classes.dex */
public class C1521e extends C0069C {

    /* renamed from: la */
    private final C1333f f5630la;

    /* renamed from: ma */
    private boolean f5631ma;

    /* renamed from: na */
    private boolean f5632na;

    /* renamed from: oa */
    private final Runnable f5633oa;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.facebook.react.views.viewpager.e$a */
    /* loaded from: classes.dex */
    public class a extends AbstractC0103r {

        /* renamed from: c */
        private final List<View> f5634c;

        /* renamed from: d */
        private boolean f5635d;

        private a() {
            this.f5634c = new ArrayList();
            this.f5635d = false;
        }

        /* synthetic */ a(C1521e c1521e, RunnableC1520d runnableC1520d) {
            this();
        }

        @Override // p000a.p005b.p009c.p019h.AbstractC0103r
        /* renamed from: a */
        public int mo475a() {
            return this.f5634c.size();
        }

        @Override // p000a.p005b.p009c.p019h.AbstractC0103r
        /* renamed from: a */
        public int mo476a(Object obj) {
            if (this.f5635d || !this.f5634c.contains(obj)) {
                return -2;
            }
            return this.f5634c.indexOf(obj);
        }

        @Override // p000a.p005b.p009c.p019h.AbstractC0103r
        /* renamed from: a */
        public Object mo477a(ViewGroup viewGroup, int i) {
            View view = this.f5634c.get(i);
            viewGroup.addView(view, 0, C1521e.this.generateDefaultLayoutParams());
            return view;
        }

        /* renamed from: a */
        void m6363a(View view, int i) {
            this.f5634c.add(i, view);
            m485b();
            C1521e.this.setOffscreenPageLimit(this.f5634c.size());
        }

        @Override // p000a.p005b.p009c.p019h.AbstractC0103r
        /* renamed from: a */
        public void mo483a(ViewGroup viewGroup, int i, Object obj) {
            viewGroup.removeView((View) obj);
        }

        /* renamed from: a */
        void m6364a(List<View> list) {
            this.f5634c.clear();
            this.f5634c.addAll(list);
            m485b();
            this.f5635d = false;
        }

        @Override // p000a.p005b.p009c.p019h.AbstractC0103r
        /* renamed from: a */
        public boolean mo484a(View view, Object obj) {
            return view == obj;
        }

        /* renamed from: b */
        View m6365b(int i) {
            return this.f5634c.get(i);
        }

        /* renamed from: c */
        void m6366c(int i) {
            this.f5634c.remove(i);
            m485b();
            C1521e.this.setOffscreenPageLimit(this.f5634c.size());
        }
    }

    /* renamed from: com.facebook.react.views.viewpager.e$b */
    /* loaded from: classes.dex */
    private class b implements C0069C.f {
        private b() {
        }

        /* synthetic */ b(C1521e c1521e, RunnableC1520d runnableC1520d) {
            this();
        }

        @Override // p000a.p005b.p009c.p019h.C0069C.f
        /* renamed from: a */
        public void mo325a(int i) {
            String str;
            if (i == 0) {
                str = "idle";
            } else if (i == 1) {
                str = "dragging";
            } else {
                if (i != 2) {
                    throw new IllegalStateException("Unsupported pageScrollState");
                }
                str = "settling";
            }
            C1521e.this.f5630la.m5753a(new C1518b(C1521e.this.getId(), str));
        }

        @Override // p000a.p005b.p009c.p019h.C0069C.f
        /* renamed from: a */
        public void mo326a(int i, float f, int i2) {
            C1521e.this.f5630la.m5753a(new C1517a(C1521e.this.getId(), i, f));
        }

        @Override // p000a.p005b.p009c.p019h.C0069C.f
        /* renamed from: b */
        public void mo327b(int i) {
            if (C1521e.this.f5631ma) {
                return;
            }
            C1521e.this.f5630la.m5753a(new C1519c(C1521e.this.getId(), i));
        }
    }

    public C1521e(ReactContext reactContext) {
        super(reactContext);
        this.f5632na = true;
        this.f5633oa = new RunnableC1520d(this);
        this.f5630la = ((UIManagerModule) reactContext.getNativeModule(UIManagerModule.class)).getEventDispatcher();
        this.f5631ma = false;
        RunnableC1520d runnableC1520d = null;
        setOnPageChangeListener(new b(this, runnableC1520d));
        setAdapter(new a(this, runnableC1520d));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public void m6359a(View view, int i) {
        getAdapter().m6363a(view, i);
    }

    /* renamed from: b */
    public void m6360b(int i, boolean z) {
        this.f5631ma = true;
        m307a(i, z);
        this.f5631ma = false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public View m6361d(int i) {
        return getAdapter().m6365b(i);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public void m6362e(int i) {
        getAdapter().m6366c(i);
    }

    @Override // p000a.p005b.p009c.p019h.C0069C
    public a getAdapter() {
        return (a) super.getAdapter();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int getViewCountInAdapter() {
        return getAdapter().mo475a();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p000a.p005b.p009c.p019h.C0069C, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        requestLayout();
        post(this.f5633oa);
    }

    @Override // p000a.p005b.p009c.p019h.C0069C, android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (!this.f5632na) {
            return false;
        }
        try {
            if (super.onInterceptTouchEvent(motionEvent)) {
                C1336i.m5762a(this, motionEvent);
                return true;
            }
        } catch (IllegalArgumentException e2) {
            C1700a.m7007b("ReactNative", "Error intercepting touch event.", e2);
        }
        return false;
    }

    @Override // p000a.p005b.p009c.p019h.C0069C, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.f5632na) {
            return false;
        }
        try {
            return super.onTouchEvent(motionEvent);
        } catch (IllegalArgumentException e2) {
            C1700a.m7007b("ReactNative", "Error handling touch event.", e2);
            return false;
        }
    }

    public void setScrollEnabled(boolean z) {
        this.f5632na = z;
    }

    public void setViews(List<View> list) {
        getAdapter().m6364a(list);
    }
}
