package com.facebook.react.uimanager;

import android.widget.ImageView;
import com.facebook.react.common.C1104f;
import com.facebook.react.uimanager.events.EnumC1341n;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.facebook.react.uimanager.ca */
/* loaded from: classes.dex */
class C1319ca {
    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static Map m5699a() {
        C1104f.a m5175a = C1104f.m5175a();
        m5175a.m5184a("topChange", C1104f.m5176a("phasedRegistrationNames", C1104f.m5177a("bubbled", "onChange", "captured", "onChangeCapture")));
        m5175a.m5184a("topSelect", C1104f.m5176a("phasedRegistrationNames", C1104f.m5177a("bubbled", "onSelect", "captured", "onSelectCapture")));
        m5175a.m5184a(EnumC1341n.m5773a(EnumC1341n.START), C1104f.m5176a("phasedRegistrationNames", C1104f.m5177a("bubbled", "onTouchStart", "captured", "onTouchStartCapture")));
        m5175a.m5184a(EnumC1341n.m5773a(EnumC1341n.MOVE), C1104f.m5176a("phasedRegistrationNames", C1104f.m5177a("bubbled", "onTouchMove", "captured", "onTouchMoveCapture")));
        m5175a.m5184a(EnumC1341n.m5773a(EnumC1341n.END), C1104f.m5176a("phasedRegistrationNames", C1104f.m5177a("bubbled", "onTouchEnd", "captured", "onTouchEndCapture")));
        m5175a.m5184a(EnumC1341n.m5773a(EnumC1341n.CANCEL), C1104f.m5176a("phasedRegistrationNames", C1104f.m5177a("bubbled", "onTouchCancel", "captured", "onTouchCancelCapture")));
        return m5175a.m5185a();
    }

    /* renamed from: b */
    public static Map<String, Object> m5700b() {
        HashMap m5182b = C1104f.m5182b();
        m5182b.put("UIView", C1104f.m5176a("ContentMode", C1104f.m5178a("ScaleAspectFit", Integer.valueOf(ImageView.ScaleType.FIT_CENTER.ordinal()), "ScaleAspectFill", Integer.valueOf(ImageView.ScaleType.CENTER_CROP.ordinal()), "ScaleAspectCenter", Integer.valueOf(ImageView.ScaleType.CENTER_INSIDE.ordinal()))));
        m5182b.put("StyleConstants", C1104f.m5176a("PointerEventsValues", C1104f.m5179a("none", Integer.valueOf(EnumC1375x.NONE.ordinal()), "boxNone", Integer.valueOf(EnumC1375x.BOX_NONE.ordinal()), "boxOnly", Integer.valueOf(EnumC1375x.BOX_ONLY.ordinal()), "unspecified", Integer.valueOf(EnumC1375x.AUTO.ordinal()))));
        m5182b.put("PopupMenu", C1104f.m5177a("dismissed", "dismissed", "itemSelected", "itemSelected"));
        m5182b.put("AccessibilityEventTypes", C1104f.m5178a("typeWindowStateChanged", 32, "typeViewFocused", 8, "typeViewClicked", 1));
        return m5182b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public static Map m5701c() {
        C1104f.a m5175a = C1104f.m5175a();
        m5175a.m5184a("topContentSizeChange", C1104f.m5176a("registrationName", "onContentSizeChange"));
        m5175a.m5184a("topLayout", C1104f.m5176a("registrationName", "onLayout"));
        m5175a.m5184a("topLoadingError", C1104f.m5176a("registrationName", "onLoadingError"));
        m5175a.m5184a("topLoadingFinish", C1104f.m5176a("registrationName", "onLoadingFinish"));
        m5175a.m5184a("topLoadingStart", C1104f.m5176a("registrationName", "onLoadingStart"));
        m5175a.m5184a("topSelectionChange", C1104f.m5176a("registrationName", "onSelectionChange"));
        m5175a.m5184a("topMessage", C1104f.m5176a("registrationName", "onMessage"));
        m5175a.m5184a("topScrollBeginDrag", C1104f.m5176a("registrationName", "onScrollBeginDrag"));
        m5175a.m5184a("topScrollEndDrag", C1104f.m5176a("registrationName", "onScrollEndDrag"));
        m5175a.m5184a("topScroll", C1104f.m5176a("registrationName", "onScroll"));
        m5175a.m5184a("topMomentumScrollBegin", C1104f.m5176a("registrationName", "onMomentumScrollBegin"));
        m5175a.m5184a("topMomentumScrollEnd", C1104f.m5176a("registrationName", "onMomentumScrollEnd"));
        return m5175a.m5185a();
    }
}
