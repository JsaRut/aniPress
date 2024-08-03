package cn.jiguang.plugins.push;

import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.uimanager.ViewManager;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import p139d.p143b.p208m.InterfaceC2051K;

/* renamed from: cn.jiguang.plugins.push.b */
/* loaded from: classes.dex */
public class C0952b implements InterfaceC2051K {
    @Override // p139d.p143b.p208m.InterfaceC2051K
    /* renamed from: a */
    public List<ViewManager> mo4767a(ReactApplicationContext reactApplicationContext) {
        return Collections.emptyList();
    }

    @Override // p139d.p143b.p208m.InterfaceC2051K
    /* renamed from: b */
    public List<NativeModule> mo4768b(ReactApplicationContext reactApplicationContext) {
        return Arrays.asList(new JPushModule(reactApplicationContext));
    }
}
