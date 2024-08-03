package p139d.p140a.p141a;

import com.brentvatne.exoplayer.ReactExoplayerViewManager;
import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.uimanager.ViewManager;
import java.util.Collections;
import java.util.List;
import p139d.p143b.p208m.InterfaceC2051K;

/* renamed from: d.a.a.c */
/* loaded from: classes.dex */
public class C1639c implements InterfaceC2051K {
    @Override // p139d.p143b.p208m.InterfaceC2051K
    /* renamed from: a */
    public List<ViewManager> mo4767a(ReactApplicationContext reactApplicationContext) {
        return Collections.singletonList(new ReactExoplayerViewManager());
    }

    @Override // p139d.p143b.p208m.InterfaceC2051K
    /* renamed from: b */
    public List<NativeModule> mo4768b(ReactApplicationContext reactApplicationContext) {
        return Collections.emptyList();
    }
}
