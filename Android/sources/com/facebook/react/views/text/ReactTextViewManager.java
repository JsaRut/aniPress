package com.facebook.react.views.text;

import android.text.Spannable;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReadableNativeMap;
import com.facebook.react.common.C1104f;
import com.facebook.react.uimanager.C1271G;
import com.facebook.react.uimanager.C1278N;
import com.facebook.yoga.YogaMeasureMode;
import java.util.Map;
import p139d.p143b.p208m.p212d.p213a.InterfaceC2073a;

@InterfaceC2073a(name = ReactTextViewManager.REACT_CLASS)
/* loaded from: classes.dex */
public class ReactTextViewManager extends ReactTextAnchorViewManager<C1469t, C1467r> {
    public static final String REACT_CLASS = "RCTText";

    @Override // com.facebook.react.uimanager.ViewManager
    public C1467r createShadowNodeInstance() {
        return new C1467r();
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public C1469t createViewInstance(C1278N c1278n) {
        return new C1469t(c1278n);
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public Map getExportedCustomDirectEventTypeConstants() {
        return C1104f.m5176a("topTextLayout", C1104f.m5176a("registrationName", "onTextLayout"));
    }

    @Override // com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    public String getName() {
        return REACT_CLASS;
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public Class<C1467r> getShadowNodeClass() {
        return C1467r.class;
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public long measure(ReactContext reactContext, ReadableNativeMap readableNativeMap, ReadableNativeMap readableNativeMap2, float f, YogaMeasureMode yogaMeasureMode, float f2, YogaMeasureMode yogaMeasureMode2) {
        return C1445A.m6130a(reactContext, readableNativeMap, readableNativeMap2, f, yogaMeasureMode, f2, yogaMeasureMode2);
    }

    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
    public void onAfterUpdateTransaction(C1469t c1469t) {
        super.onAfterUpdateTransaction((ReactTextViewManager) c1469t);
        c1469t.m6187d();
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public void updateExtraData(C1469t c1469t, Object obj) {
        C1468s c1468s = (C1468s) obj;
        if (c1468s.m6174a()) {
            AbstractC1475z.m6238a(c1468s.m6181h(), c1469t);
        }
        c1469t.setText(c1468s);
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public Object updateLocalData(C1469t c1469t, C1271G c1271g, C1271G c1271g2) {
        Spannable m6131a = C1445A.m6131a(c1469t.getContext(), c1271g2.m5576c("attributedString"));
        c1469t.setSpanned(m6131a);
        C1473x c1473x = new C1473x(c1271g);
        return new C1468s(m6131a, -1, false, c1473x.m6211d(), c1473x.m6216f(), c1473x.m6208c(), c1473x.m6195a(), c1473x.m6214e(), 1, 0);
    }
}
