package com.facebook.react.animated;

import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.JSApplicationCausedNativeException;
import com.facebook.react.bridge.ReadableMap;

/* renamed from: com.facebook.react.animated.d */
/* loaded from: classes.dex */
abstract class AbstractC1038d {

    /* renamed from: a */
    boolean f4283a = false;

    /* renamed from: b */
    C1034Q f4284b;

    /* renamed from: c */
    Callback f4285c;

    /* renamed from: d */
    int f4286d;

    /* renamed from: a */
    public abstract void mo5139a(long j);

    /* renamed from: a */
    public void mo5140a(ReadableMap readableMap) {
        throw new JSApplicationCausedNativeException("Animation config for " + getClass().getSimpleName() + " cannot be reset");
    }
}
