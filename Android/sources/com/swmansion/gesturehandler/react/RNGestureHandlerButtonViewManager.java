package com.swmansion.gesturehandler.react;

import android.R;
import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.PaintDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.ViewGroup;
import com.facebook.react.uimanager.C1278N;
import com.facebook.react.uimanager.ViewGroupManager;
import com.facebook.react.uimanager.p127a.InterfaceC1294a;

/* loaded from: classes.dex */
public class RNGestureHandlerButtonViewManager extends ViewGroupManager<C1614a> {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.swmansion.gesturehandler.react.RNGestureHandlerButtonViewManager$a */
    /* loaded from: classes.dex */
    public static class C1614a extends ViewGroup {

        /* renamed from: a */
        static TypedValue f6044a = new TypedValue();

        /* renamed from: b */
        static C1614a f6045b;

        /* renamed from: c */
        int f6046c;

        /* renamed from: d */
        Integer f6047d;

        /* renamed from: e */
        boolean f6048e;

        /* renamed from: f */
        boolean f6049f;

        /* renamed from: g */
        float f6050g;

        /* renamed from: h */
        boolean f6051h;

        public C1614a(Context context) {
            super(context);
            this.f6046c = 0;
            this.f6048e = false;
            this.f6049f = false;
            this.f6050g = 0.0f;
            this.f6051h = false;
            setClickable(true);
            setFocusable(true);
            this.f6051h = true;
        }

        /* renamed from: a */
        private Drawable m6741a() {
            int i = Build.VERSION.SDK_INT;
            getContext().getTheme().resolveAttribute(getResources().getIdentifier((!this.f6049f || i < 21) ? "selectableItemBackground" : "selectableItemBackgroundBorderless", "attr", "android"), f6044a, true);
            return i >= 21 ? getResources().getDrawable(f6044a.resourceId, getContext().getTheme()) : getResources().getDrawable(f6044a.resourceId);
        }

        /* renamed from: a */
        private Drawable m6742a(Drawable drawable) {
            Integer num = this.f6047d;
            if (num != null && drawable != null && Build.VERSION.SDK_INT >= 21 && (drawable instanceof RippleDrawable)) {
                ((RippleDrawable) drawable).setColor(new ColorStateList(new int[][]{new int[]{R.attr.state_enabled}}, new int[]{num.intValue()}));
            }
            return drawable;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: b */
        public void m6744b() {
            if (this.f6051h) {
                this.f6051h = false;
                if (this.f6046c == 0) {
                    setBackground(null);
                }
                if (Build.VERSION.SDK_INT >= 23) {
                    setForeground(null);
                }
                if (this.f6048e && Build.VERSION.SDK_INT >= 23) {
                    Drawable m6741a = m6741a();
                    m6742a(m6741a);
                    setForeground(m6741a);
                    int i = this.f6046c;
                    if (i != 0) {
                        setBackgroundColor(i);
                        return;
                    }
                    return;
                }
                if (this.f6046c == 0 && this.f6047d == null) {
                    setBackground(m6741a());
                    return;
                }
                PaintDrawable paintDrawable = new PaintDrawable(this.f6046c);
                Drawable m6741a2 = m6741a();
                float f = this.f6050g;
                if (f != 0.0f) {
                    paintDrawable.setCornerRadius(f);
                    if (Build.VERSION.SDK_INT >= 21 && (m6741a2 instanceof RippleDrawable)) {
                        PaintDrawable paintDrawable2 = new PaintDrawable(-1);
                        paintDrawable2.setCornerRadius(this.f6050g);
                        ((RippleDrawable) m6741a2).setDrawableByLayerId(R.id.mask, paintDrawable2);
                    }
                }
                m6742a(m6741a2);
                setBackground(new LayerDrawable(new Drawable[]{paintDrawable, m6741a2}));
            }
        }

        /* renamed from: a */
        public void m6745a(float f) {
            this.f6050g = f * getResources().getDisplayMetrics().density;
            this.f6051h = true;
        }

        /* renamed from: a */
        public void m6746a(Integer num) {
            this.f6047d = num;
            this.f6051h = true;
        }

        /* renamed from: a */
        public void m6747a(boolean z) {
            this.f6049f = z;
        }

        /* renamed from: b */
        public void m6748b(boolean z) {
            this.f6048e = z;
            this.f6051h = true;
        }

        @Override // android.view.ViewGroup, android.view.View
        public void dispatchDrawableHotspotChanged(float f, float f2) {
        }

        @Override // android.view.View
        public void drawableHotspotChanged(float f, float f2) {
            C1614a c1614a = f6045b;
            if (c1614a == null || c1614a == this) {
                super.drawableHotspotChanged(f, f2);
            }
        }

        @Override // android.view.ViewGroup
        public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
            if (super.onInterceptTouchEvent(motionEvent)) {
                return true;
            }
            onTouchEvent(motionEvent);
            return isPressed();
        }

        @Override // android.view.ViewGroup, android.view.View
        protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        }

        @Override // android.view.View
        public void setBackgroundColor(int i) {
            this.f6046c = i;
            this.f6051h = true;
        }

        @Override // android.view.View
        public void setPressed(boolean z) {
            if (z && f6045b == null) {
                f6045b = this;
            }
            if (!z || f6045b == this) {
                super.setPressed(z);
            }
            if (z || f6045b != this) {
                return;
            }
            f6045b = null;
        }
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public C1614a createViewInstance(C1278N c1278n) {
        return new C1614a(c1278n);
    }

    @Override // com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    public String getName() {
        return "RNGestureHandlerButton";
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
    public void onAfterUpdateTransaction(C1614a c1614a) {
        c1614a.m6744b();
    }

    @InterfaceC1294a(name = "borderRadius")
    public void setBorderRadius(C1614a c1614a, float f) {
        c1614a.m6745a(f);
    }

    @InterfaceC1294a(name = "borderless")
    public void setBorderless(C1614a c1614a, boolean z) {
        c1614a.m6747a(z);
    }

    @InterfaceC1294a(name = "enabled")
    public void setEnabled(C1614a c1614a, boolean z) {
        c1614a.setEnabled(z);
    }

    @InterfaceC1294a(name = "foreground")
    @TargetApi(23)
    public void setForeground(C1614a c1614a, boolean z) {
        c1614a.m6748b(z);
    }

    @InterfaceC1294a(name = "rippleColor")
    public void setRippleColor(C1614a c1614a, Integer num) {
        c1614a.m6746a(num);
    }
}
