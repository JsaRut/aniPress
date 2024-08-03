package com.facebook.react.animated;

import com.facebook.react.bridge.ReactContext;
import com.facebook.react.modules.core.C1170i;
import com.facebook.react.uimanager.AbstractC1351j;
import p139d.p143b.p204k.p205a.C2038a;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.facebook.react.animated.v */
/* loaded from: classes.dex */
public class C1056v extends AbstractC1351j {

    /* renamed from: c */
    final /* synthetic */ NativeAnimatedModule f4346c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1056v(NativeAnimatedModule nativeAnimatedModule, ReactContext reactContext) {
        super(reactContext);
        this.f4346c = nativeAnimatedModule;
    }

    @Override // com.facebook.react.uimanager.AbstractC1351j
    /* renamed from: b */
    protected void mo5158b(long j) {
        C1024H nodesManager;
        C1170i c1170i;
        AbstractC1351j abstractC1351j;
        nodesManager = this.f4346c.getNodesManager();
        if (nodesManager.m5120a()) {
            nodesManager.m5118a(j);
        }
        c1170i = this.f4346c.mReactChoreographer;
        C2038a.m8318a(c1170i);
        C1170i.a aVar = C1170i.a.NATIVE_ANIMATED_MODULE;
        abstractC1351j = this.f4346c.mAnimatedFrameCallback;
        c1170i.m5296a(aVar, abstractC1351j);
    }
}
