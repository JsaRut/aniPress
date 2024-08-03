package com.facebook.react.views.view;

import android.annotation.TargetApi;
import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import com.facebook.react.bridge.JSApplicationIllegalArgumentException;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.common.C1104f;
import com.facebook.react.uimanager.C1278N;
import com.facebook.react.uimanager.C1374w;
import com.facebook.react.uimanager.EnumC1375x;
import com.facebook.react.uimanager.ViewGroupManager;
import com.facebook.react.uimanager.p127a.InterfaceC1294a;
import com.facebook.react.uimanager.p127a.InterfaceC1295b;
import com.facebook.yoga.C1553a;
import java.util.Locale;
import java.util.Map;
import p139d.p143b.p208m.p212d.p213a.InterfaceC2073a;

@InterfaceC2073a(name = ReactViewManager.REACT_CLASS)
/* loaded from: classes.dex */
public class ReactViewManager extends ViewGroupManager<C1516h> {
    private static final int CMD_HOTSPOT_UPDATE = 1;
    private static final int CMD_SET_PRESSED = 2;
    public static final String REACT_CLASS = "RCTView";
    private static final int[] SPACING_TYPES = {8, 0, 2, 1, 3, 4, 5};

    @Override // com.facebook.react.uimanager.ViewGroupManager
    public void addView(C1516h c1516h, View view, int i) {
        if (c1516h.getRemoveClippedSubviews()) {
            c1516h.m6348a(view, i);
        } else {
            c1516h.addView(view, i);
        }
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public C1516h createViewInstance(C1278N c1278n) {
        return new C1516h(c1278n);
    }

    @Override // com.facebook.react.uimanager.ViewGroupManager
    public View getChildAt(C1516h c1516h, int i) {
        return c1516h.getRemoveClippedSubviews() ? c1516h.m6350b(i) : c1516h.getChildAt(i);
    }

    @Override // com.facebook.react.uimanager.ViewGroupManager
    public int getChildCount(C1516h c1516h) {
        return c1516h.getRemoveClippedSubviews() ? c1516h.getAllChildrenCount() : c1516h.getChildCount();
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public Map<String, Integer> getCommandsMap() {
        return C1104f.m5177a("hotspotUpdate", 1, "setPressed", 2);
    }

    @Override // com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    public String getName() {
        return REACT_CLASS;
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public void receiveCommand(C1516h c1516h, int i, ReadableArray readableArray) {
        if (i != 1) {
            if (i != 2) {
                return;
            }
            if (readableArray == null || readableArray.size() != 1) {
                throw new JSApplicationIllegalArgumentException("Illegal number of arguments for 'setPressed' command");
            }
            c1516h.setPressed(readableArray.getBoolean(0));
            return;
        }
        if (readableArray == null || readableArray.size() != 2) {
            throw new JSApplicationIllegalArgumentException("Illegal number of arguments for 'updateHotspot' command");
        }
        if (Build.VERSION.SDK_INT >= 21) {
            c1516h.drawableHotspotChanged(C1374w.m5956a(readableArray.getDouble(0)), C1374w.m5956a(readableArray.getDouble(1)));
        }
    }

    @Override // com.facebook.react.uimanager.ViewGroupManager
    public void removeAllViews(C1516h c1516h) {
        if (c1516h.getRemoveClippedSubviews()) {
            c1516h.m6351c();
        } else {
            c1516h.removeAllViews();
        }
    }

    @Override // com.facebook.react.uimanager.ViewGroupManager
    public void removeViewAt(C1516h c1516h, int i) {
        if (!c1516h.getRemoveClippedSubviews()) {
            c1516h.removeViewAt(i);
            return;
        }
        View childAt = getChildAt(c1516h, i);
        if (childAt.getParent() != null) {
            c1516h.removeView(childAt);
        }
        c1516h.m6347a(childAt);
    }

    @InterfaceC1294a(name = "accessible")
    public void setAccessible(C1516h c1516h, boolean z) {
        c1516h.setFocusable(z);
    }

    @InterfaceC1294a(name = "backfaceVisibility")
    public void setBackfaceVisibility(C1516h c1516h, String str) {
        c1516h.setBackfaceVisibility(str);
    }

    @InterfaceC1295b(customType = "Color", names = {"borderColor", "borderLeftColor", "borderRightColor", "borderTopColor", "borderBottomColor", "borderStartColor", "borderEndColor"})
    public void setBorderColor(C1516h c1516h, int i, Integer num) {
        c1516h.m6346a(SPACING_TYPES[i], num == null ? Float.NaN : num.intValue() & 16777215, num != null ? num.intValue() >>> 24 : Float.NaN);
    }

    @InterfaceC1295b(defaultFloat = Float.NaN, names = {"borderRadius", "borderTopLeftRadius", "borderTopRightRadius", "borderBottomRightRadius", "borderBottomLeftRadius", "borderTopStartRadius", "borderTopEndRadius", "borderBottomStartRadius", "borderBottomEndRadius"})
    public void setBorderRadius(C1516h c1516h, int i, float f) {
        if (!C1553a.m6544a(f) && f < 0.0f) {
            f = Float.NaN;
        }
        if (!C1553a.m6544a(f)) {
            f = C1374w.m5959b(f);
        }
        if (i == 0) {
            c1516h.setBorderRadius(f);
        } else {
            c1516h.m6344a(f, i - 1);
        }
    }

    @InterfaceC1294a(name = "borderStyle")
    public void setBorderStyle(C1516h c1516h, String str) {
        c1516h.setBorderStyle(str);
    }

    @InterfaceC1295b(defaultFloat = Float.NaN, names = {"borderWidth", "borderLeftWidth", "borderRightWidth", "borderTopWidth", "borderBottomWidth", "borderStartWidth", "borderEndWidth"})
    public void setBorderWidth(C1516h c1516h, int i, float f) {
        if (!C1553a.m6544a(f) && f < 0.0f) {
            f = Float.NaN;
        }
        if (!C1553a.m6544a(f)) {
            f = C1374w.m5959b(f);
        }
        c1516h.m6345a(SPACING_TYPES[i], f);
    }

    @InterfaceC1294a(name = "collapsable")
    public void setCollapsable(C1516h c1516h, boolean z) {
    }

    @InterfaceC1294a(name = "hitSlop")
    public void setHitSlop(C1516h c1516h, ReadableMap readableMap) {
        if (readableMap == null) {
            c1516h.setHitSlopRect(null);
        } else {
            c1516h.setHitSlopRect(new Rect(readableMap.hasKey("left") ? (int) C1374w.m5956a(readableMap.getDouble("left")) : 0, readableMap.hasKey("top") ? (int) C1374w.m5956a(readableMap.getDouble("top")) : 0, readableMap.hasKey("right") ? (int) C1374w.m5956a(readableMap.getDouble("right")) : 0, readableMap.hasKey("bottom") ? (int) C1374w.m5956a(readableMap.getDouble("bottom")) : 0));
        }
    }

    @InterfaceC1294a(name = "nativeBackgroundAndroid")
    public void setNativeBackground(C1516h c1516h, ReadableMap readableMap) {
        c1516h.setTranslucentBackgroundDrawable(readableMap == null ? null : C1511c.m6297a(c1516h.getContext(), readableMap));
    }

    @InterfaceC1294a(name = "nativeForegroundAndroid")
    @TargetApi(23)
    public void setNativeForeground(C1516h c1516h, ReadableMap readableMap) {
        c1516h.setForeground(readableMap == null ? null : C1511c.m6297a(c1516h.getContext(), readableMap));
    }

    @InterfaceC1294a(name = "needsOffscreenAlphaCompositing")
    public void setNeedsOffscreenAlphaCompositing(C1516h c1516h, boolean z) {
        c1516h.setNeedsOffscreenAlphaCompositing(z);
    }

    @Override // com.facebook.react.uimanager.BaseViewManager
    public void setOpacity(C1516h c1516h, float f) {
        c1516h.setOpacityIfPossible(f);
    }

    @InterfaceC1294a(name = "overflow")
    public void setOverflow(C1516h c1516h, String str) {
        c1516h.setOverflow(str);
    }

    @InterfaceC1294a(name = "pointerEvents")
    public void setPointerEvents(C1516h c1516h, String str) {
        c1516h.setPointerEvents(str == null ? EnumC1375x.AUTO : EnumC1375x.valueOf(str.toUpperCase(Locale.US).replace("-", "_")));
    }

    @InterfaceC1294a(name = "removeClippedSubviews")
    public void setRemoveClippedSubviews(C1516h c1516h, boolean z) {
        c1516h.setRemoveClippedSubviews(z);
    }

    @InterfaceC1294a(name = "hasTVPreferredFocus")
    public void setTVPreferredFocus(C1516h c1516h, boolean z) {
        if (z) {
            c1516h.setFocusable(true);
            c1516h.setFocusableInTouchMode(true);
            c1516h.requestFocus();
        }
    }

    @Override // com.facebook.react.uimanager.BaseViewManager
    public void setTransform(C1516h c1516h, ReadableArray readableArray) {
        super.setTransform((ReactViewManager) c1516h, readableArray);
        c1516h.m6352d();
    }
}
