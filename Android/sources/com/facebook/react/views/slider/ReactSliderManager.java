package com.facebook.react.views.slider;

import android.R;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.view.View;
import android.widget.SeekBar;
import com.facebook.react.common.C1104f;
import com.facebook.react.uimanager.C1278N;
import com.facebook.react.uimanager.C1359n;
import com.facebook.react.uimanager.SimpleViewManager;
import com.facebook.react.uimanager.p127a.InterfaceC1294a;
import com.facebook.yoga.C1554b;
import com.facebook.yoga.YogaMeasureFunction;
import com.facebook.yoga.YogaMeasureMode;
import com.facebook.yoga.YogaNode;
import java.util.Map;

/* loaded from: classes.dex */
public class ReactSliderManager extends SimpleViewManager<C1434a> {
    private static final SeekBar.OnSeekBarChangeListener ON_CHANGE_LISTENER = new C1436c();
    public static final String REACT_CLASS = "RCTSlider";
    private static final int STYLE = 16842875;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.facebook.react.views.slider.ReactSliderManager$a */
    /* loaded from: classes.dex */
    public static class C1433a extends C1359n implements YogaMeasureFunction {

        /* renamed from: w */
        private int f5295w;

        /* renamed from: x */
        private int f5296x;

        /* renamed from: y */
        private boolean f5297y;

        private C1433a() {
            m6109N();
        }

        /* synthetic */ C1433a(C1436c c1436c) {
            this();
        }

        /* renamed from: N */
        private void m6109N() {
            m5544a((YogaMeasureFunction) this);
        }

        @Override // com.facebook.yoga.YogaMeasureFunction
        public long measure(YogaNode yogaNode, float f, YogaMeasureMode yogaMeasureMode, float f2, YogaMeasureMode yogaMeasureMode2) {
            if (!this.f5297y) {
                C1434a c1434a = new C1434a(mo5513p(), null, 16842875);
                int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(-2, 0);
                c1434a.measure(makeMeasureSpec, makeMeasureSpec);
                this.f5295w = c1434a.getMeasuredWidth();
                this.f5296x = c1434a.getMeasuredHeight();
                this.f5297y = true;
            }
            return C1554b.m6546a(this.f5295w, this.f5296x);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.react.uimanager.ViewManager
    public void addEventEmitters(C1278N c1278n, C1434a c1434a) {
        c1434a.setOnSeekBarChangeListener(ON_CHANGE_LISTENER);
    }

    @Override // com.facebook.react.uimanager.SimpleViewManager, com.facebook.react.uimanager.ViewManager
    public C1359n createShadowNodeInstance() {
        return new C1433a(null);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.react.uimanager.ViewManager
    public C1434a createViewInstance(C1278N c1278n) {
        return new C1434a(c1278n, null, 16842875);
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public Map getExportedCustomDirectEventTypeConstants() {
        return C1104f.m5176a("topSlidingComplete", C1104f.m5176a("registrationName", "onSlidingComplete"));
    }

    @Override // com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    public String getName() {
        return REACT_CLASS;
    }

    @Override // com.facebook.react.uimanager.SimpleViewManager, com.facebook.react.uimanager.ViewManager
    public Class getShadowNodeClass() {
        return C1433a.class;
    }

    @InterfaceC1294a(defaultBoolean = true, name = "enabled")
    public void setEnabled(C1434a c1434a, boolean z) {
        c1434a.setEnabled(z);
    }

    @InterfaceC1294a(customType = "Color", name = "maximumTrackTintColor")
    public void setMaximumTrackTintColor(C1434a c1434a, Integer num) {
        Drawable findDrawableByLayerId = ((LayerDrawable) c1434a.getProgressDrawable().getCurrent()).findDrawableByLayerId(R.id.background);
        if (num == null) {
            findDrawableByLayerId.clearColorFilter();
        } else {
            findDrawableByLayerId.setColorFilter(num.intValue(), PorterDuff.Mode.SRC_IN);
        }
    }

    @InterfaceC1294a(defaultDouble = 1.0d, name = "maximumValue")
    public void setMaximumValue(C1434a c1434a, double d2) {
        c1434a.setMaxValue(d2);
    }

    @InterfaceC1294a(customType = "Color", name = "minimumTrackTintColor")
    public void setMinimumTrackTintColor(C1434a c1434a, Integer num) {
        Drawable findDrawableByLayerId = ((LayerDrawable) c1434a.getProgressDrawable().getCurrent()).findDrawableByLayerId(R.id.progress);
        if (num == null) {
            findDrawableByLayerId.clearColorFilter();
        } else {
            findDrawableByLayerId.setColorFilter(num.intValue(), PorterDuff.Mode.SRC_IN);
        }
    }

    @InterfaceC1294a(defaultDouble = 0.0d, name = "minimumValue")
    public void setMinimumValue(C1434a c1434a, double d2) {
        c1434a.setMinValue(d2);
    }

    @InterfaceC1294a(defaultDouble = 0.0d, name = "step")
    public void setStep(C1434a c1434a, double d2) {
        c1434a.setStep(d2);
    }

    @InterfaceC1294a(customType = "Color", name = "thumbTintColor")
    public void setThumbTintColor(C1434a c1434a, Integer num) {
        if (num == null) {
            c1434a.getThumb().clearColorFilter();
        } else {
            c1434a.getThumb().setColorFilter(num.intValue(), PorterDuff.Mode.SRC_IN);
        }
    }

    @InterfaceC1294a(defaultDouble = 0.0d, name = "value")
    public void setValue(C1434a c1434a, double d2) {
        c1434a.setOnSeekBarChangeListener(null);
        c1434a.setValue(d2);
        c1434a.setOnSeekBarChangeListener(ON_CHANGE_LISTENER);
    }
}
