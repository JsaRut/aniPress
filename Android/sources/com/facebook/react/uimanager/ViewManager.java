package com.facebook.react.uimanager;

import android.view.View;
import com.facebook.react.bridge.BaseJavaModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableNativeMap;
import com.facebook.react.uimanager.InterfaceC1269E;
import com.facebook.yoga.YogaMeasureMode;
import java.util.Map;
import p139d.p143b.p208m.p217g.C2106a;
import p139d.p143b.p208m.p217g.InterfaceC2109d;

/* loaded from: classes.dex */
public abstract class ViewManager<T extends View, C extends InterfaceC1269E> extends BaseJavaModule {
    protected void addEventEmitters(C1278N c1278n, T t) {
    }

    public C createShadowNodeInstance() {
        throw new RuntimeException("ViewManager subclasses must implement createShadowNodeInstance()");
    }

    public C createShadowNodeInstance(ReactApplicationContext reactApplicationContext) {
        return createShadowNodeInstance();
    }

    public final T createView(C1278N c1278n, C2106a c2106a) {
        T createViewInstance = createViewInstance(c1278n);
        addEventEmitters(c1278n, createViewInstance);
        if (createViewInstance instanceof InterfaceC2109d) {
            ((InterfaceC2109d) createViewInstance).setOnInterceptTouchEventListener(c2106a);
        }
        return createViewInstance;
    }

    protected abstract T createViewInstance(C1278N c1278n);

    public Map<String, Integer> getCommandsMap() {
        return null;
    }

    public Map<String, Object> getExportedCustomBubblingEventTypeConstants() {
        return null;
    }

    public Map<String, Object> getExportedCustomDirectEventTypeConstants() {
        return null;
    }

    public Map<String, Object> getExportedViewConstants() {
        return null;
    }

    @Override // com.facebook.react.bridge.NativeModule
    public abstract String getName();

    public Map<String, String> getNativeProps() {
        return C1360na.m5857a((Class<? extends ViewManager>) getClass(), (Class<? extends InterfaceC1269E>) getShadowNodeClass());
    }

    public abstract Class<? extends C> getShadowNodeClass();

    public long measure(ReactContext reactContext, ReadableNativeMap readableNativeMap, ReadableNativeMap readableNativeMap2, float f, YogaMeasureMode yogaMeasureMode, float f2, YogaMeasureMode yogaMeasureMode2) {
        return 0L;
    }

    public void onAfterUpdateTransaction(T t) {
    }

    public void onDropViewInstance(T t) {
    }

    public void receiveCommand(T t, int i, ReadableArray readableArray) {
    }

    public abstract void updateExtraData(T t, Object obj);

    public Object updateLocalData(T t, C1271G c1271g, C1271G c1271g2) {
        return null;
    }

    public final void updateProperties(T t, C1271G c1271g) {
        C1360na.m5860a(this, t, c1271g);
        onAfterUpdateTransaction(t);
    }
}
