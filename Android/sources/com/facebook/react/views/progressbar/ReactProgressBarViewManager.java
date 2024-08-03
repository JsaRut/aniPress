package com.facebook.react.views.progressbar;

import android.R;
import android.content.Context;
import android.widget.ProgressBar;
import com.facebook.react.bridge.JSApplicationIllegalArgumentException;
import com.facebook.react.uimanager.BaseViewManager;
import com.facebook.react.uimanager.C1278N;
import com.facebook.react.uimanager.p127a.InterfaceC1294a;
import p139d.p143b.p208m.p212d.p213a.InterfaceC2073a;

@InterfaceC2073a(name = ReactProgressBarViewManager.REACT_CLASS)
/* loaded from: classes.dex */
public class ReactProgressBarViewManager extends BaseViewManager<C1418a, C1419b> {
    static final String DEFAULT_STYLE = "Normal";
    static final String PROP_ANIMATING = "animating";
    static final String PROP_INDETERMINATE = "indeterminate";
    static final String PROP_PROGRESS = "progress";
    static final String PROP_STYLE = "styleAttr";
    public static final String REACT_CLASS = "AndroidProgressBar";
    private static Object sProgressBarCtorLock = new Object();

    public static ProgressBar createProgressBar(Context context, int i) {
        ProgressBar progressBar;
        synchronized (sProgressBarCtorLock) {
            progressBar = new ProgressBar(context, null, i);
        }
        return progressBar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int getStyleFromString(String str) {
        if (str == null) {
            throw new JSApplicationIllegalArgumentException("ProgressBar needs to have a style, null received");
        }
        if (str.equals("Horizontal")) {
            return R.attr.progressBarStyleHorizontal;
        }
        if (str.equals("Small")) {
            return R.attr.progressBarStyleSmall;
        }
        if (str.equals("Large")) {
            return R.attr.progressBarStyleLarge;
        }
        if (str.equals("Inverse")) {
            return R.attr.progressBarStyleInverse;
        }
        if (str.equals("SmallInverse")) {
            return R.attr.progressBarStyleSmallInverse;
        }
        if (str.equals("LargeInverse")) {
            return R.attr.progressBarStyleLargeInverse;
        }
        if (str.equals(DEFAULT_STYLE)) {
            return R.attr.progressBarStyle;
        }
        throw new JSApplicationIllegalArgumentException("Unknown ProgressBar style: " + str);
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public C1419b createShadowNodeInstance() {
        return new C1419b();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.react.uimanager.ViewManager
    public C1418a createViewInstance(C1278N c1278n) {
        return new C1418a(c1278n);
    }

    @Override // com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    public String getName() {
        return REACT_CLASS;
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public Class<C1419b> getShadowNodeClass() {
        return C1419b.class;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
    public void onAfterUpdateTransaction(C1418a c1418a) {
        c1418a.m6043a();
    }

    @InterfaceC1294a(name = PROP_ANIMATING)
    public void setAnimating(C1418a c1418a, boolean z) {
        c1418a.m6047a(z);
    }

    @InterfaceC1294a(customType = "Color", name = "color")
    public void setColor(C1418a c1418a, Integer num) {
        c1418a.m6045a(num);
    }

    @InterfaceC1294a(name = PROP_INDETERMINATE)
    public void setIndeterminate(C1418a c1418a, boolean z) {
        c1418a.m6048b(z);
    }

    @InterfaceC1294a(name = PROP_PROGRESS)
    public void setProgress(C1418a c1418a, double d2) {
        c1418a.m6044a(d2);
    }

    @InterfaceC1294a(name = PROP_STYLE)
    public void setStyle(C1418a c1418a, String str) {
        c1418a.m6046a(str);
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public void updateExtraData(C1418a c1418a, Object obj) {
    }
}
