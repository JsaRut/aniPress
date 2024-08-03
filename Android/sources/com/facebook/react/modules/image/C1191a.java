package com.facebook.react.modules.image;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.WritableMap;
import p139d.p143b.p148c.p156h.C1716b;
import p139d.p143b.p161d.AbstractC1735d;
import p139d.p143b.p161d.InterfaceC1736e;
import p139d.p143b.p184i.p196j.AbstractC1918b;

/* renamed from: com.facebook.react.modules.image.a */
/* loaded from: classes.dex */
class C1191a extends AbstractC1735d<C1716b<AbstractC1918b>> {

    /* renamed from: a */
    final /* synthetic */ Promise f4574a;

    /* renamed from: b */
    final /* synthetic */ ImageLoaderModule f4575b;

    public C1191a(ImageLoaderModule imageLoaderModule, Promise promise) {
        this.f4575b = imageLoaderModule;
        this.f4574a = promise;
    }

    @Override // p139d.p143b.p161d.AbstractC1735d
    /* renamed from: e */
    protected void mo5357e(InterfaceC1736e<C1716b<AbstractC1918b>> interfaceC1736e) {
        this.f4574a.reject("E_GET_SIZE_FAILURE", interfaceC1736e.mo7118c());
    }

    @Override // p139d.p143b.p161d.AbstractC1735d
    /* renamed from: f */
    protected void mo5358f(InterfaceC1736e<C1716b<AbstractC1918b>> interfaceC1736e) {
        if (interfaceC1736e.mo7117b()) {
            C1716b<AbstractC1918b> result = interfaceC1736e.getResult();
            try {
                if (result == null) {
                    this.f4574a.reject("E_GET_SIZE_FAILURE");
                    return;
                }
                try {
                    AbstractC1918b m7048n = result.m7048n();
                    WritableMap createMap = Arguments.createMap();
                    createMap.putInt("width", m7048n.mo6293n());
                    createMap.putInt("height", m7048n.mo6292m());
                    this.f4574a.resolve(createMap);
                } catch (Exception e2) {
                    this.f4574a.reject("E_GET_SIZE_FAILURE", e2);
                }
            } finally {
                C1716b.m7045b(result);
            }
        }
    }
}
