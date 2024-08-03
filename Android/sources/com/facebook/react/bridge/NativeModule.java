package com.facebook.react.bridge;

import p139d.p143b.p206l.p207a.InterfaceC2039a;

@InterfaceC2039a
/* loaded from: classes.dex */
public interface NativeModule {

    /* loaded from: classes.dex */
    public interface NativeMethod {
        String getType();

        void invoke(JSInstance jSInstance, ReadableArray readableArray);
    }

    boolean canOverrideExistingModule();

    String getName();

    void initialize();

    void onCatalystInstanceDestroy();
}
