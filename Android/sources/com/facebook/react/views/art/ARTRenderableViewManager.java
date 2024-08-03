package com.facebook.react.views.art;

import android.view.View;
import com.facebook.react.uimanager.C1278N;
import com.facebook.react.uimanager.InterfaceC1269E;
import com.facebook.react.uimanager.ViewManager;

/* loaded from: classes.dex */
public class ARTRenderableViewManager extends ViewManager<View, InterfaceC1269E> {
    public static final String CLASS_GROUP = "ARTGroup";
    public static final String CLASS_SHAPE = "ARTShape";
    public static final String CLASS_TEXT = "ARTText";
    private final String mClassName;

    /* JADX INFO: Access modifiers changed from: package-private */
    public ARTRenderableViewManager(String str) {
        this.mClassName = str;
    }

    public static ARTRenderableViewManager createARTGroupViewManager() {
        return new ARTGroupViewManager();
    }

    public static ARTRenderableViewManager createARTShapeViewManager() {
        return new ARTShapeViewManager();
    }

    public static ARTRenderableViewManager createARTTextViewManager() {
        return new ARTTextViewManager();
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public InterfaceC1269E createShadowNodeInstance() {
        if (CLASS_GROUP.equals(this.mClassName)) {
            return new C1378a();
        }
        if (CLASS_SHAPE.equals(this.mClassName)) {
            return new C1379b();
        }
        if (CLASS_TEXT.equals(this.mClassName)) {
            return new C1383f();
        }
        throw new IllegalStateException("Unexpected type " + this.mClassName);
    }

    @Override // com.facebook.react.uimanager.ViewManager
    protected View createViewInstance(C1278N c1278n) {
        throw new IllegalStateException("ARTShape does not map into a native view");
    }

    @Override // com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    public String getName() {
        return this.mClassName;
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public Class<? extends InterfaceC1269E> getShadowNodeClass() {
        if (CLASS_GROUP.equals(this.mClassName)) {
            return C1378a.class;
        }
        if (CLASS_SHAPE.equals(this.mClassName)) {
            return C1379b.class;
        }
        if (CLASS_TEXT.equals(this.mClassName)) {
            return C1383f.class;
        }
        throw new IllegalStateException("Unexpected type " + this.mClassName);
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public void updateExtraData(View view, Object obj) {
        throw new IllegalStateException("ARTShape does not map into a native view");
    }
}
