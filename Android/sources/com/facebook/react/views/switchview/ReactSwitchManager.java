package com.facebook.react.views.switchview;

import android.view.View;
import android.widget.CompoundButton;
import com.facebook.react.uimanager.C1278N;
import com.facebook.react.uimanager.C1359n;
import com.facebook.react.uimanager.SimpleViewManager;
import com.facebook.react.uimanager.p127a.InterfaceC1294a;
import com.facebook.yoga.C1554b;
import com.facebook.yoga.YogaMeasureFunction;
import com.facebook.yoga.YogaMeasureMode;
import com.facebook.yoga.YogaNode;

/* loaded from: classes.dex */
public class ReactSwitchManager extends SimpleViewManager<C1442a> {
    private static final CompoundButton.OnCheckedChangeListener ON_CHECKED_CHANGE_LISTENER = new C1444c();
    public static final String REACT_CLASS = "AndroidSwitch";

    /* renamed from: com.facebook.react.views.switchview.ReactSwitchManager$a */
    /* loaded from: classes.dex */
    public static class C1441a extends C1359n implements YogaMeasureFunction {

        /* renamed from: w */
        private int f5316w;

        /* renamed from: x */
        private int f5317x;

        /* renamed from: y */
        private boolean f5318y;

        private C1441a() {
            m6120N();
        }

        /* synthetic */ C1441a(C1444c c1444c) {
            this();
        }

        /* renamed from: N */
        private void m6120N() {
            m5544a((YogaMeasureFunction) this);
        }

        @Override // com.facebook.yoga.YogaMeasureFunction
        public long measure(YogaNode yogaNode, float f, YogaMeasureMode yogaMeasureMode, float f2, YogaMeasureMode yogaMeasureMode2) {
            if (!this.f5318y) {
                C1442a c1442a = new C1442a(mo5513p());
                c1442a.setShowText(false);
                int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
                c1442a.measure(makeMeasureSpec, makeMeasureSpec);
                this.f5316w = c1442a.getMeasuredWidth();
                this.f5317x = c1442a.getMeasuredHeight();
                this.f5318y = true;
            }
            return C1554b.m6546a(this.f5316w, this.f5317x);
        }
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public void addEventEmitters(C1278N c1278n, C1442a c1442a) {
        c1442a.setOnCheckedChangeListener(ON_CHECKED_CHANGE_LISTENER);
    }

    @Override // com.facebook.react.uimanager.SimpleViewManager, com.facebook.react.uimanager.ViewManager
    public C1359n createShadowNodeInstance() {
        return new C1441a(null);
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public C1442a createViewInstance(C1278N c1278n) {
        C1442a c1442a = new C1442a(c1278n);
        c1442a.setShowText(false);
        return c1442a;
    }

    @Override // com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    public String getName() {
        return REACT_CLASS;
    }

    @Override // com.facebook.react.uimanager.SimpleViewManager, com.facebook.react.uimanager.ViewManager
    public Class getShadowNodeClass() {
        return C1441a.class;
    }

    @InterfaceC1294a(defaultBoolean = false, name = "disabled")
    public void setDisabled(C1442a c1442a, boolean z) {
        c1442a.setEnabled(!z);
    }

    @InterfaceC1294a(defaultBoolean = true, name = "enabled")
    public void setEnabled(C1442a c1442a, boolean z) {
        c1442a.setEnabled(z);
    }

    @InterfaceC1294a(name = "on")
    public void setOn(C1442a c1442a, boolean z) {
        setValue(c1442a, z);
    }

    @InterfaceC1294a(customType = "Color", name = "thumbColor")
    public void setThumbColor(C1442a c1442a, Integer num) {
        c1442a.m6123a(num);
    }

    @InterfaceC1294a(customType = "Color", name = "thumbTintColor")
    public void setThumbTintColor(C1442a c1442a, Integer num) {
        setThumbColor(c1442a, num);
    }

    @InterfaceC1294a(customType = "Color", name = "trackColorForFalse")
    public void setTrackColorForFalse(C1442a c1442a, Integer num) {
        c1442a.m6126c(num);
    }

    @InterfaceC1294a(customType = "Color", name = "trackColorForTrue")
    public void setTrackColorForTrue(C1442a c1442a, Integer num) {
        c1442a.m6127d(num);
    }

    @InterfaceC1294a(customType = "Color", name = "trackTintColor")
    public void setTrackTintColor(C1442a c1442a, Integer num) {
        c1442a.m6125b(num);
    }

    @InterfaceC1294a(name = "value")
    public void setValue(C1442a c1442a, boolean z) {
        c1442a.setOnCheckedChangeListener(null);
        c1442a.m6124a(z);
        c1442a.setOnCheckedChangeListener(ON_CHECKED_CHANGE_LISTENER);
    }
}
