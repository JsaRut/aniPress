package com.p122BV.LinearGradient;

import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.uimanager.C1278N;
import com.facebook.react.uimanager.SimpleViewManager;
import com.facebook.react.uimanager.p127a.InterfaceC1294a;

/* loaded from: classes.dex */
public class LinearGradientManager extends SimpleViewManager<C0973b> {
    public static final String PROP_ANGLE = "angle";
    public static final String PROP_ANGLE_CENTER = "angleCenter";
    public static final String PROP_BORDER_RADII = "borderRadii";
    public static final String PROP_COLORS = "colors";
    public static final String PROP_END_POS = "endPoint";
    public static final String PROP_LOCATIONS = "locations";
    public static final String PROP_START_POS = "startPoint";
    public static final String PROP_USE_ANGLE = "useAngle";
    public static final String REACT_CLASS = "BVLinearGradient";

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.react.uimanager.ViewManager
    public C0973b createViewInstance(C1278N c1278n) {
        return new C0973b(c1278n);
    }

    @Override // com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    public String getName() {
        return REACT_CLASS;
    }

    @InterfaceC1294a(defaultFloat = 45.0f, name = PROP_ANGLE)
    public void setAngle(C0973b c0973b, float f) {
        c0973b.setAngle(f);
    }

    @InterfaceC1294a(name = PROP_ANGLE_CENTER)
    public void setAngleCenter(C0973b c0973b, ReadableArray readableArray) {
        c0973b.setAngleCenter(readableArray);
    }

    @InterfaceC1294a(name = PROP_BORDER_RADII)
    public void setBorderRadii(C0973b c0973b, ReadableArray readableArray) {
        c0973b.setBorderRadii(readableArray);
    }

    @InterfaceC1294a(name = PROP_COLORS)
    public void setColors(C0973b c0973b, ReadableArray readableArray) {
        c0973b.setColors(readableArray);
    }

    @InterfaceC1294a(name = PROP_END_POS)
    public void setEndPosition(C0973b c0973b, ReadableArray readableArray) {
        c0973b.setEndPosition(readableArray);
    }

    @InterfaceC1294a(name = PROP_LOCATIONS)
    public void setLocations(C0973b c0973b, ReadableArray readableArray) {
        if (readableArray != null) {
            c0973b.setLocations(readableArray);
        }
    }

    @InterfaceC1294a(name = PROP_START_POS)
    public void setStartPosition(C0973b c0973b, ReadableArray readableArray) {
        c0973b.setStartPosition(readableArray);
    }

    @InterfaceC1294a(defaultBoolean = false, name = PROP_USE_ANGLE)
    public void setUseAngle(C0973b c0973b, boolean z) {
        c0973b.setUseAngle(z);
    }
}
