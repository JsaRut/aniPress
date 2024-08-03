package com.facebook.react.views.modal;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStructure;
import android.view.accessibility.AccessibilityEvent;
import android.widget.FrameLayout;
import com.facebook.react.bridge.LifecycleEventListener;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.uimanager.C1355l;
import com.facebook.react.uimanager.InterfaceC1274J;
import com.facebook.react.uimanager.UIManagerModule;
import com.facebook.react.uimanager.events.C1333f;
import com.facebook.react.views.view.C1516h;
import java.util.ArrayList;
import p139d.p143b.p204k.p205a.C2038a;
import p139d.p143b.p208m.C2124o;
import p139d.p143b.p208m.p222j.p223a.C2115a;

/* renamed from: com.facebook.react.views.modal.g */
/* loaded from: classes.dex */
public class C1409g extends ViewGroup implements LifecycleEventListener {

    /* renamed from: a */
    private a f5178a;

    /* renamed from: b */
    private Dialog f5179b;

    /* renamed from: c */
    private boolean f5180c;

    /* renamed from: d */
    private String f5181d;

    /* renamed from: e */
    private boolean f5182e;

    /* renamed from: f */
    private boolean f5183f;

    /* renamed from: g */
    private DialogInterface.OnShowListener f5184g;

    /* renamed from: h */
    private b f5185h;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.facebook.react.views.modal.g$a */
    /* loaded from: classes.dex */
    public static class a extends C1516h implements InterfaceC1274J {

        /* renamed from: s */
        private final C1355l f5186s;

        public a(Context context) {
            super(context);
            this.f5186s = new C1355l(this);
        }

        /* renamed from: e */
        private C1333f m6034e() {
            return ((UIManagerModule) m6035f().getNativeModule(UIManagerModule.class)).getEventDispatcher();
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: f */
        public ReactContext m6035f() {
            return (ReactContext) getContext();
        }

        @Override // com.facebook.react.uimanager.InterfaceC1274J
        /* renamed from: a */
        public void mo5583a(MotionEvent motionEvent) {
            this.f5186s.m5848b(motionEvent, m6034e());
        }

        @Override // com.facebook.react.uimanager.InterfaceC1274J
        /* renamed from: a */
        public void mo5584a(Throwable th) {
            m6035f().handleException(new RuntimeException(th));
        }

        @Override // com.facebook.react.views.view.C1516h, android.view.ViewGroup
        public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
            this.f5186s.m5847a(motionEvent, m6034e());
            return super.onInterceptTouchEvent(motionEvent);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.facebook.react.views.view.C1516h, android.view.View
        public void onSizeChanged(int i, int i2, int i3, int i4) {
            super.onSizeChanged(i, i2, i3, i4);
            if (getChildCount() > 0) {
                int id = getChildAt(0).getId();
                ReactContext m6035f = m6035f();
                m6035f.runOnNativeModulesQueueThread(new C1408f(this, m6035f, id, i, i2));
            }
        }

        @Override // com.facebook.react.views.view.C1516h, android.view.View
        public boolean onTouchEvent(MotionEvent motionEvent) {
            this.f5186s.m5847a(motionEvent, m6034e());
            super.onTouchEvent(motionEvent);
            return true;
        }

        @Override // android.view.ViewGroup, android.view.ViewParent
        public void requestDisallowInterceptTouchEvent(boolean z) {
        }
    }

    /* renamed from: com.facebook.react.views.modal.g$b */
    /* loaded from: classes.dex */
    public interface b {
        /* renamed from: a */
        void mo6027a(DialogInterface dialogInterface);
    }

    public C1409g(Context context) {
        super(context);
        ((ReactContext) context).addLifecycleEventListener(this);
        this.f5178a = new a(context);
    }

    /* renamed from: c */
    private void m6029c() {
        Activity activity;
        Dialog dialog = this.f5179b;
        if (dialog != null) {
            if (dialog.isShowing() && ((activity = (Activity) C2115a.m8457a(this.f5179b.getContext(), Activity.class)) == null || !activity.isFinishing())) {
                this.f5179b.dismiss();
            }
            this.f5179b = null;
            ((ViewGroup) this.f5178a.getParent()).removeViewAt(0);
        }
    }

    /* renamed from: d */
    private void m6030d() {
        C2038a.m8319a(this.f5179b, "mDialog must exist when we call updateProperties");
        Activity currentActivity = getCurrentActivity();
        if (currentActivity != null) {
            if ((currentActivity.getWindow().getAttributes().flags & 1024) != 0) {
                this.f5179b.getWindow().addFlags(1024);
            } else {
                this.f5179b.getWindow().clearFlags(1024);
            }
        }
        if (this.f5180c) {
            this.f5179b.getWindow().clearFlags(2);
        } else {
            this.f5179b.getWindow().setDimAmount(0.5f);
            this.f5179b.getWindow().setFlags(2, 2);
        }
    }

    private View getContentView() {
        FrameLayout frameLayout = new FrameLayout(getContext());
        frameLayout.addView(this.f5178a);
        frameLayout.setFitsSystemWindows(true);
        return frameLayout;
    }

    private Activity getCurrentActivity() {
        return ((ReactContext) getContext()).getCurrentActivity();
    }

    /* renamed from: a */
    public void m6031a() {
        ((ReactContext) getContext()).removeLifecycleEventListener(this);
        m6029c();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void addChildrenForAccessibility(ArrayList<View> arrayList) {
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i) {
        this.f5178a.addView(view, i);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: b */
    public void mo6032b() {
        if (this.f5179b != null) {
            if (!this.f5183f) {
                m6030d();
                return;
            }
            m6029c();
        }
        this.f5183f = false;
        int i = C2124o.Theme_FullScreenDialog;
        if (this.f5181d.equals("fade")) {
            i = C2124o.Theme_FullScreenDialogAnimatedFade;
        } else if (this.f5181d.equals("slide")) {
            i = C2124o.Theme_FullScreenDialogAnimatedSlide;
        }
        Activity currentActivity = getCurrentActivity();
        this.f5179b = new Dialog(currentActivity == null ? getContext() : currentActivity, i);
        this.f5179b.setContentView(getContentView());
        m6030d();
        this.f5179b.setOnShowListener(this.f5184g);
        this.f5179b.setOnKeyListener(new DialogInterfaceOnKeyListenerC1407e(this));
        this.f5179b.getWindow().setSoftInputMode(16);
        if (this.f5182e) {
            this.f5179b.getWindow().addFlags(16777216);
        }
        if (currentActivity == null || currentActivity.isFinishing()) {
            return;
        }
        this.f5179b.show();
    }

    @Override // android.view.View
    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return false;
    }

    @Override // android.view.ViewGroup, android.view.View
    @TargetApi(23)
    public void dispatchProvideStructure(ViewStructure viewStructure) {
        this.f5178a.dispatchProvideStructure(viewStructure);
    }

    @Override // android.view.ViewGroup
    public View getChildAt(int i) {
        return this.f5178a.getChildAt(i);
    }

    @Override // android.view.ViewGroup
    public int getChildCount() {
        return this.f5178a.getChildCount();
    }

    public Dialog getDialog() {
        return this.f5179b;
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostDestroy() {
        m6031a();
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostPause() {
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostResume() {
        mo6032b();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public void removeView(View view) {
        this.f5178a.removeView(view);
    }

    @Override // android.view.ViewGroup
    public void removeViewAt(int i) {
        this.f5178a.removeView(getChildAt(i));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void setAnimationType(String str) {
        this.f5181d = str;
        this.f5183f = true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void setHardwareAccelerated(boolean z) {
        this.f5182e = z;
        this.f5183f = true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void setOnRequestCloseListener(b bVar) {
        this.f5185h = bVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void setOnShowListener(DialogInterface.OnShowListener onShowListener) {
        this.f5184g = onShowListener;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void setTransparent(boolean z) {
        this.f5180c = z;
    }
}
