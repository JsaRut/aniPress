package com.p122BV.LinearGradient;

import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.uimanager.ViewManager;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import p139d.p143b.p208m.InterfaceC2051K;

/* renamed from: com.BV.LinearGradient.a */
/* loaded from: classes.dex */
public class C0972a implements InterfaceC2051K {
    @Override // p139d.p143b.p208m.InterfaceC2051K
    /* renamed from: a */
    public List<ViewManager> mo4767a(ReactApplicationContext reactApplicationContext) {
        return Arrays.asList(new LinearGradientManager());
    }

    @Override // p139d.p143b.p208m.InterfaceC2051K
    /* renamed from: b */
    public List<NativeModule> mo4768b(ReactApplicationContext reactApplicationContext) {
        return Collections.emptyList();
    }
}
