package com.facebook.react.animated;

import com.facebook.react.animated.NativeAnimatedModule;
import com.facebook.react.uimanager.C1369s;
import com.facebook.react.uimanager.InterfaceC1282S;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: com.facebook.react.animated.z */
/* loaded from: classes.dex */
class C1060z implements InterfaceC1282S {

    /* renamed from: a */
    final /* synthetic */ ArrayList f4357a;

    /* renamed from: b */
    final /* synthetic */ NativeAnimatedModule f4358b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C1060z(NativeAnimatedModule nativeAnimatedModule, ArrayList arrayList) {
        this.f4358b = nativeAnimatedModule;
        this.f4357a = arrayList;
    }

    @Override // com.facebook.react.uimanager.InterfaceC1282S
    /* renamed from: a */
    public void mo5159a(C1369s c1369s) {
        C1024H nodesManager;
        nodesManager = this.f4358b.getNodesManager();
        Iterator it = this.f4357a.iterator();
        while (it.hasNext()) {
            ((NativeAnimatedModule.InterfaceC1031a) it.next()).mo5104a(nodesManager);
        }
    }
}
