package com.imagepicker;

import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.uimanager.ViewManager;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import p139d.p143b.p208m.InterfaceC2051K;

/* renamed from: com.imagepicker.d */
/* loaded from: classes.dex */
public class C1595d implements InterfaceC2051K {

    /* renamed from: a */
    public static final int f6009a = C1597f.DefaultExplainingPermissionsTheme;

    /* renamed from: b */
    private final int f6010b = f6009a;

    @Override // p139d.p143b.p208m.InterfaceC2051K
    /* renamed from: a */
    public List<ViewManager> mo4767a(ReactApplicationContext reactApplicationContext) {
        return Collections.emptyList();
    }

    @Override // p139d.p143b.p208m.InterfaceC2051K
    /* renamed from: b */
    public List<NativeModule> mo4768b(ReactApplicationContext reactApplicationContext) {
        return Arrays.asList(new ImagePickerModule(reactApplicationContext, this.f6010b));
    }
}
