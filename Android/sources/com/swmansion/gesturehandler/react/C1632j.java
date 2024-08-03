package com.swmansion.gesturehandler.react;

import android.os.SystemClock;
import android.util.Log;
import android.view.MotionEvent;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.UiThreadUtil;
import p139d.p143b.p208m.C2056P;
import p139d.p273d.p274a.C2686c;
import p139d.p273d.p274a.C2689f;

/* renamed from: com.swmansion.gesturehandler.react.j */
/* loaded from: classes.dex */
public class C1632j {

    /* renamed from: a */
    private final ReactContext f6065a;

    /* renamed from: b */
    private final C2689f f6066b;

    /* renamed from: c */
    private final C2686c f6067c;

    /* renamed from: d */
    private final C2056P f6068d;

    /* renamed from: e */
    private boolean f6069e = false;

    /* renamed from: f */
    private boolean f6070f = false;

    /* renamed from: com.swmansion.gesturehandler.react.j$a */
    /* loaded from: classes.dex */
    private class a extends C2686c {
        private a() {
        }

        /* synthetic */ a(C1632j c1632j, RunnableC1631i runnableC1631i) {
            this();
        }

        @Override // p139d.p273d.p274a.C2686c
        /* renamed from: c */
        protected void mo6795c(MotionEvent motionEvent) {
            if (m11537k() == 0) {
                m11520b();
                C1632j.this.f6069e = false;
            }
            if (motionEvent.getActionMasked() == 1) {
                m11528d();
            }
        }

        @Override // p139d.p273d.p274a.C2686c
        /* renamed from: p */
        protected void mo6796p() {
            C1632j.this.f6069e = true;
            long uptimeMillis = SystemClock.uptimeMillis();
            MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
            obtain.setAction(3);
            C1632j.this.f6068d.mo5583a(obtain);
        }
    }

    public C1632j(ReactContext reactContext, ViewGroup viewGroup) {
        UiThreadUtil.assertOnUiThread();
        int id = viewGroup.getId();
        if (id < 1) {
            throw new IllegalStateException("Expect view tag to be set for " + viewGroup);
        }
        RNGestureHandlerModule rNGestureHandlerModule = (RNGestureHandlerModule) reactContext.getNativeModule(RNGestureHandlerModule.class);
        C1630h registry = rNGestureHandlerModule.getRegistry();
        this.f6068d = m6785a(viewGroup);
        Log.i("ReactNative", "[GESTURE HANDLER] Initialize gesture handler for root view " + this.f6068d);
        this.f6065a = reactContext;
        this.f6066b = new C2689f(viewGroup, registry, new C1636n());
        this.f6066b.m11570a(0.1f);
        this.f6067c = new a(this, null);
        this.f6067c.m11513a(-id);
        registry.m6781a(this.f6067c);
        registry.m6782a(this.f6067c.m11538l(), id);
        rNGestureHandlerModule.registerRootHelper(this);
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* renamed from: a */
    private static C2056P m6785a(ViewGroup viewGroup) {
        UiThreadUtil.assertOnUiThread();
        ViewParent viewParent = viewGroup;
        while (viewParent != null && !(viewParent instanceof C2056P)) {
            viewParent = viewParent.getParent();
        }
        if (viewParent != null) {
            return (C2056P) viewParent;
        }
        throw new IllegalStateException("View " + viewGroup + " has not been mounted under ReactRootView");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: c */
    public void m6789c() {
        C2686c c2686c = this.f6067c;
        if (c2686c == null || c2686c.m11537k() != 2) {
            return;
        }
        this.f6067c.m11512a();
        this.f6067c.m11528d();
    }

    /* renamed from: a */
    public C2056P m6790a() {
        return this.f6068d;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public void m6791a(int i, boolean z) {
        if (z) {
            UiThreadUtil.runOnUiThread(new RunnableC1631i(this));
        }
    }

    /* renamed from: a */
    public void m6792a(boolean z) {
        if (this.f6066b == null || this.f6070f) {
            return;
        }
        m6789c();
    }

    /* renamed from: a */
    public boolean m6793a(MotionEvent motionEvent) {
        this.f6070f = true;
        this.f6066b.m11573b(motionEvent);
        this.f6070f = false;
        return this.f6069e;
    }

    /* renamed from: b */
    public void m6794b() {
        Log.i("ReactNative", "[GESTURE HANDLER] Tearing down gesture handler registered for root view " + this.f6068d);
        RNGestureHandlerModule rNGestureHandlerModule = (RNGestureHandlerModule) this.f6065a.getNativeModule(RNGestureHandlerModule.class);
        rNGestureHandlerModule.getRegistry().m6780a(this.f6067c.m11538l());
        rNGestureHandlerModule.unregisterRootHelper(this);
    }
}
