package cn.jpush.reactnativejanalytics;

import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.uimanager.ViewManager;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import p031c.p032a.p072p.p073a.p075b.C0717i;
import p139d.p143b.p208m.InterfaceC2051K;

/* renamed from: cn.jpush.reactnativejanalytics.b */
/* loaded from: classes.dex */
public class C0970b implements InterfaceC2051K {
    public C0970b(boolean z, boolean z2) {
        C0971c.f4031b = z;
        C0971c.f4030a = z2;
        C0717i.m3649a(!z2);
    }

    @Override // p139d.p143b.p208m.InterfaceC2051K
    /* renamed from: a */
    public List<ViewManager> mo4767a(ReactApplicationContext reactApplicationContext) {
        return Collections.emptyList();
    }

    @Override // p139d.p143b.p208m.InterfaceC2051K
    /* renamed from: b */
    public List<NativeModule> mo4768b(ReactApplicationContext reactApplicationContext) {
        return Arrays.asList(new JAnalyticsModule(reactApplicationContext));
    }
}
