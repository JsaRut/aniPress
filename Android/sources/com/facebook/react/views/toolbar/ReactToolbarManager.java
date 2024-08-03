package com.facebook.react.views.toolbar;

import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.common.C1104f;
import com.facebook.react.uimanager.C1278N;
import com.facebook.react.uimanager.C1374w;
import com.facebook.react.uimanager.UIManagerModule;
import com.facebook.react.uimanager.ViewGroupManager;
import com.facebook.react.uimanager.events.C1333f;
import com.facebook.react.uimanager.p127a.InterfaceC1294a;
import java.util.Map;
import p000a.p005b.p009c.p019h.C0107v;

/* loaded from: classes.dex */
public class ReactToolbarManager extends ViewGroupManager<C1506f> {
    private static final int COMMAND_DISMISS_POPUP_MENUS = 1;
    private static final String REACT_CLASS = "ToolbarAndroid";

    private static int[] getDefaultColors(Context context) {
        TypedArray typedArray;
        TypedArray typedArray2;
        TypedArray typedArray3;
        int resourceId;
        Resources.Theme theme = context.getTheme();
        TypedArray typedArray4 = null;
        try {
            typedArray2 = theme.obtainStyledAttributes(new int[]{getIdentifier(context, "toolbarStyle")});
            try {
                TypedArray obtainStyledAttributes = theme.obtainStyledAttributes(typedArray2.getResourceId(0, 0), new int[]{getIdentifier(context, "titleTextAppearance"), getIdentifier(context, "subtitleTextAppearance")});
                try {
                    int resourceId2 = obtainStyledAttributes.getResourceId(0, 0);
                    resourceId = obtainStyledAttributes.getResourceId(1, 0);
                    typedArray3 = theme.obtainStyledAttributes(resourceId2, new int[]{R.attr.textColor});
                } catch (Throwable th) {
                    th = th;
                    typedArray3 = null;
                    typedArray4 = obtainStyledAttributes;
                    typedArray = null;
                }
                try {
                    typedArray4 = theme.obtainStyledAttributes(resourceId, new int[]{R.attr.textColor});
                    int[] iArr = {typedArray3.getColor(0, -16777216), typedArray4.getColor(0, -16777216)};
                    recycleQuietly(typedArray2);
                    recycleQuietly(obtainStyledAttributes);
                    recycleQuietly(typedArray3);
                    recycleQuietly(typedArray4);
                    return iArr;
                } catch (Throwable th2) {
                    th = th2;
                    TypedArray typedArray5 = typedArray4;
                    typedArray4 = obtainStyledAttributes;
                    typedArray = typedArray5;
                    recycleQuietly(typedArray2);
                    recycleQuietly(typedArray4);
                    recycleQuietly(typedArray3);
                    recycleQuietly(typedArray);
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
                typedArray = null;
                typedArray3 = null;
            }
        } catch (Throwable th4) {
            th = th4;
            typedArray = null;
            typedArray2 = null;
            typedArray3 = null;
        }
    }

    private int[] getDefaultContentInsets(Context context) {
        TypedArray typedArray;
        Resources.Theme theme = context.getTheme();
        TypedArray typedArray2 = null;
        try {
            typedArray = theme.obtainStyledAttributes(new int[]{getIdentifier(context, "toolbarStyle")});
        } catch (Throwable th) {
            th = th;
            typedArray = null;
        }
        try {
            typedArray2 = theme.obtainStyledAttributes(typedArray.getResourceId(0, 0), new int[]{getIdentifier(context, "contentInsetStart"), getIdentifier(context, "contentInsetEnd")});
            int[] iArr = {typedArray2.getDimensionPixelSize(0, 0), typedArray2.getDimensionPixelSize(1, 0)};
            recycleQuietly(typedArray);
            recycleQuietly(typedArray2);
            return iArr;
        } catch (Throwable th2) {
            th = th2;
            recycleQuietly(typedArray);
            recycleQuietly(typedArray2);
            throw th;
        }
    }

    private static int getIdentifier(Context context, String str) {
        return context.getResources().getIdentifier(str, "attr", context.getPackageName());
    }

    private static void recycleQuietly(TypedArray typedArray) {
        if (typedArray != null) {
            typedArray.recycle();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.react.uimanager.ViewManager
    public void addEventEmitters(C1278N c1278n, C1506f c1506f) {
        C1333f eventDispatcher = ((UIManagerModule) c1278n.getNativeModule(UIManagerModule.class)).getEventDispatcher();
        c1506f.setNavigationOnClickListener(new ViewOnClickListenerC1507g(this, eventDispatcher, c1506f));
        c1506f.setOnMenuItemClickListener(new C1508h(this, eventDispatcher, c1506f));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.react.uimanager.ViewManager
    public C1506f createViewInstance(C1278N c1278n) {
        return new C1506f(c1278n);
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public Map<String, Integer> getCommandsMap() {
        return C1104f.m5176a("dismissPopupMenus", 1);
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public Map<String, Object> getExportedViewConstants() {
        return C1104f.m5176a("ShowAsAction", C1104f.m5178a("never", 0, "always", 2, "ifRoom", 1));
    }

    @Override // com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    public String getName() {
        return REACT_CLASS;
    }

    @Override // com.facebook.react.uimanager.ViewGroupManager
    public boolean needsCustomLayoutForChildren() {
        return true;
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public void receiveCommand(C1506f c1506f, int i, ReadableArray readableArray) {
        if (i != 1) {
            throw new IllegalArgumentException(String.format("Unsupported command %d received by %s.", Integer.valueOf(i), ReactToolbarManager.class.getSimpleName()));
        }
        c1506f.m2378d();
    }

    @InterfaceC1294a(name = "nativeActions")
    public void setActions(C1506f c1506f, ReadableArray readableArray) {
        c1506f.setActions(readableArray);
    }

    @InterfaceC1294a(defaultFloat = Float.NaN, name = "contentInsetEnd")
    public void setContentInsetEnd(C1506f c1506f, float f) {
        c1506f.m2372a(c1506f.getContentInsetStart(), Float.isNaN(f) ? getDefaultContentInsets(c1506f.getContext())[1] : Math.round(C1374w.m5959b(f)));
    }

    @InterfaceC1294a(defaultFloat = Float.NaN, name = "contentInsetStart")
    public void setContentInsetStart(C1506f c1506f, float f) {
        c1506f.m2372a(Float.isNaN(f) ? getDefaultContentInsets(c1506f.getContext())[0] : Math.round(C1374w.m5959b(f)), c1506f.getContentInsetEnd());
    }

    @InterfaceC1294a(name = "logo")
    public void setLogo(C1506f c1506f, ReadableMap readableMap) {
        c1506f.setLogoSource(readableMap);
    }

    @InterfaceC1294a(name = "navIcon")
    public void setNavIcon(C1506f c1506f, ReadableMap readableMap) {
        c1506f.setNavIconSource(readableMap);
    }

    @InterfaceC1294a(name = "overflowIcon")
    public void setOverflowIcon(C1506f c1506f, ReadableMap readableMap) {
        c1506f.setOverflowIconSource(readableMap);
    }

    @InterfaceC1294a(name = "rtl")
    public void setRtl(C1506f c1506f, boolean z) {
        C0107v.m514e(c1506f, z ? 1 : 0);
    }

    @InterfaceC1294a(name = "subtitle")
    public void setSubtitle(C1506f c1506f, String str) {
        c1506f.setSubtitle(str);
    }

    @InterfaceC1294a(customType = "Color", name = "subtitleColor")
    public void setSubtitleColor(C1506f c1506f, Integer num) {
        c1506f.setSubtitleTextColor(num != null ? num.intValue() : getDefaultColors(c1506f.getContext())[1]);
    }

    @InterfaceC1294a(name = "title")
    public void setTitle(C1506f c1506f, String str) {
        c1506f.setTitle(str);
    }

    @InterfaceC1294a(customType = "Color", name = "titleColor")
    public void setTitleColor(C1506f c1506f, Integer num) {
        c1506f.setTitleTextColor(num != null ? num.intValue() : getDefaultColors(c1506f.getContext())[0]);
    }
}
