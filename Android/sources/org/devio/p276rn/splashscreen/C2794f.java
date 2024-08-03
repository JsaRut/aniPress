package org.devio.p276rn.splashscreen;

import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.uimanager.ViewManager;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import p139d.p143b.p208m.InterfaceC2051K;

/* renamed from: org.devio.rn.splashscreen.f */
/* loaded from: classes.dex */
public class C2794f implements InterfaceC2051K {
    @Override // p139d.p143b.p208m.InterfaceC2051K
    /* renamed from: a */
    public List<ViewManager> mo4767a(ReactApplicationContext reactApplicationContext) {
        return Collections.emptyList();
    }

    @Override // p139d.p143b.p208m.InterfaceC2051K
    /* renamed from: b */
    public List<NativeModule> mo4768b(ReactApplicationContext reactApplicationContext) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new SplashScreenModule(reactApplicationContext));
        return arrayList;
    }
}
