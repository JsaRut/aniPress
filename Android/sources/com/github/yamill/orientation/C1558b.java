package com.github.yamill.orientation;

import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.uimanager.ViewManager;
import java.util.Arrays;
import java.util.List;
import p139d.p143b.p208m.InterfaceC2051K;

/* renamed from: com.github.yamill.orientation.b */
/* loaded from: classes.dex */
public class C1558b implements InterfaceC2051K {
    @Override // p139d.p143b.p208m.InterfaceC2051K
    /* renamed from: a */
    public List<ViewManager> mo4767a(ReactApplicationContext reactApplicationContext) {
        return Arrays.asList(new ViewManager[0]);
    }

    @Override // p139d.p143b.p208m.InterfaceC2051K
    /* renamed from: b */
    public List<NativeModule> mo4768b(ReactApplicationContext reactApplicationContext) {
        return Arrays.asList(new OrientationModule(reactApplicationContext));
    }
}
