package com.facebook.react.views.image;

import android.graphics.PorterDuff;
import com.facebook.react.bridge.JSApplicationIllegalArgumentException;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.common.C1104f;
import com.facebook.react.uimanager.C1278N;
import com.facebook.react.uimanager.C1374w;
import com.facebook.react.uimanager.SimpleViewManager;
import com.facebook.react.uimanager.p127a.InterfaceC1294a;
import com.facebook.react.uimanager.p127a.InterfaceC1295b;
import com.facebook.yoga.C1553a;
import java.util.Map;
import p139d.p143b.p169g.p170a.p171a.C1763c;
import p139d.p143b.p169g.p175c.AbstractC1777e;
import p139d.p143b.p208m.p212d.p213a.InterfaceC2073a;

@InterfaceC2073a(name = ReactImageManager.REACT_CLASS)
/* loaded from: classes.dex */
public class ReactImageManager extends SimpleViewManager<C1401g> {
    public static final String REACT_CLASS = "RCTImageView";
    private final Object mCallerContext;
    private AbstractC1777e mDraweeControllerBuilder;
    private InterfaceC1395a mGlobalImageLoadListener;

    public ReactImageManager() {
        this.mDraweeControllerBuilder = null;
        this.mCallerContext = null;
    }

    public ReactImageManager(AbstractC1777e abstractC1777e, InterfaceC1395a interfaceC1395a, Object obj) {
        this.mDraweeControllerBuilder = abstractC1777e;
        this.mGlobalImageLoadListener = interfaceC1395a;
        this.mCallerContext = obj;
    }

    public ReactImageManager(AbstractC1777e abstractC1777e, Object obj) {
        this(abstractC1777e, null, obj);
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public C1401g createViewInstance(C1278N c1278n) {
        return new C1401g(c1278n, getDraweeControllerBuilder(), this.mGlobalImageLoadListener, getCallerContext());
    }

    public Object getCallerContext() {
        return this.mCallerContext;
    }

    public AbstractC1777e getDraweeControllerBuilder() {
        if (this.mDraweeControllerBuilder == null) {
            this.mDraweeControllerBuilder = C1763c.m7212c();
        }
        return this.mDraweeControllerBuilder;
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public Map getExportedCustomDirectEventTypeConstants() {
        return C1104f.m5179a(C1396b.m5993b(4), C1104f.m5176a("registrationName", "onLoadStart"), C1396b.m5993b(2), C1104f.m5176a("registrationName", "onLoad"), C1396b.m5993b(1), C1104f.m5176a("registrationName", "onError"), C1396b.m5993b(3), C1104f.m5176a("registrationName", "onLoadEnd"));
    }

    @Override // com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    public String getName() {
        return REACT_CLASS;
    }

    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
    public void onAfterUpdateTransaction(C1401g c1401g) {
        super.onAfterUpdateTransaction((ReactImageManager) c1401g);
        c1401g.m6021i();
    }

    @InterfaceC1294a(name = "blurRadius")
    public void setBlurRadius(C1401g c1401g, float f) {
        c1401g.setBlurRadius(f);
    }

    @InterfaceC1294a(customType = "Color", name = "borderColor")
    public void setBorderColor(C1401g c1401g, Integer num) {
        c1401g.setBorderColor(num == null ? 0 : num.intValue());
    }

    @InterfaceC1295b(defaultFloat = Float.NaN, names = {"borderRadius", "borderTopLeftRadius", "borderTopRightRadius", "borderBottomRightRadius", "borderBottomLeftRadius"})
    public void setBorderRadius(C1401g c1401g, int i, float f) {
        if (!C1553a.m6544a(f)) {
            f = C1374w.m5959b(f);
        }
        if (i == 0) {
            c1401g.setBorderRadius(f);
        } else {
            c1401g.m6020a(f, i - 1);
        }
    }

    @InterfaceC1294a(name = "borderWidth")
    public void setBorderWidth(C1401g c1401g, float f) {
        c1401g.setBorderWidth(f);
    }

    @InterfaceC1294a(name = "defaultSrc")
    public void setDefaultSource(C1401g c1401g, String str) {
        c1401g.setDefaultSource(str);
    }

    @InterfaceC1294a(name = "fadeDuration")
    public void setFadeDuration(C1401g c1401g, int i) {
        c1401g.setFadeDuration(i);
    }

    @InterfaceC1294a(name = "headers")
    public void setHeaders(C1401g c1401g, ReadableMap readableMap) {
        c1401g.setHeaders(readableMap);
    }

    @InterfaceC1294a(name = "shouldNotifyLoadEvents")
    public void setLoadHandlersRegistered(C1401g c1401g, boolean z) {
        c1401g.setShouldNotifyLoadEvents(z);
    }

    @InterfaceC1294a(name = "loadingIndicatorSrc")
    public void setLoadingIndicatorSource(C1401g c1401g, String str) {
        c1401g.setLoadingIndicatorSource(str);
    }

    @InterfaceC1294a(customType = "Color", name = "overlayColor")
    public void setOverlayColor(C1401g c1401g, Integer num) {
        c1401g.setOverlayColor(num == null ? 0 : num.intValue());
    }

    @InterfaceC1294a(name = "progressiveRenderingEnabled")
    public void setProgressiveRenderingEnabled(C1401g c1401g, boolean z) {
        c1401g.setProgressiveRenderingEnabled(z);
    }

    @InterfaceC1294a(name = "resizeMethod")
    public void setResizeMethod(C1401g c1401g, String str) {
        EnumC1397c enumC1397c;
        if (str == null || "auto".equals(str)) {
            enumC1397c = EnumC1397c.AUTO;
        } else if ("resize".equals(str)) {
            enumC1397c = EnumC1397c.RESIZE;
        } else {
            if (!"scale".equals(str)) {
                throw new JSApplicationIllegalArgumentException("Invalid resize method: '" + str + "'");
            }
            enumC1397c = EnumC1397c.SCALE;
        }
        c1401g.setResizeMethod(enumC1397c);
    }

    @InterfaceC1294a(name = "resizeMode")
    public void setResizeMode(C1401g c1401g, String str) {
        c1401g.setScaleType(C1398d.m5995a(str));
        c1401g.setTileMode(C1398d.m5996b(str));
    }

    @InterfaceC1294a(name = "src")
    public void setSource(C1401g c1401g, ReadableArray readableArray) {
        c1401g.setSource(readableArray);
    }

    @InterfaceC1294a(customType = "Color", name = "tintColor")
    public void setTintColor(C1401g c1401g, Integer num) {
        if (num == null) {
            c1401g.clearColorFilter();
        } else {
            c1401g.setColorFilter(num.intValue(), PorterDuff.Mode.SRC_IN);
        }
    }
}
