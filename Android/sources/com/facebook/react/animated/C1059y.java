package com.facebook.react.animated;

import com.facebook.react.animated.NativeAnimatedModule;
import com.facebook.react.uimanager.C1369s;
import com.facebook.react.uimanager.InterfaceC1282S;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: com.facebook.react.animated.y */
/* loaded from: classes.dex */
class C1059y implements InterfaceC1282S {

    /* renamed from: a */
    final /* synthetic */ ArrayList f4355a;

    /* renamed from: b */
    final /* synthetic */ NativeAnimatedModule f4356b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C1059y(NativeAnimatedModule nativeAnimatedModule, ArrayList arrayList) {
        this.f4356b = nativeAnimatedModule;
        this.f4355a = arrayList;
    }

    @Override // com.facebook.react.uimanager.InterfaceC1282S
    /* renamed from: a */
    public void mo5159a(C1369s c1369s) {
        C1024H nodesManager;
        nodesManager = this.f4356b.getNodesManager();
        Iterator it = this.f4355a.iterator();
        while (it.hasNext()) {
            ((NativeAnimatedModule.InterfaceC1031a) it.next()).mo5104a(nodesManager);
        }
    }
}
