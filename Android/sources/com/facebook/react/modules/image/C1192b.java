package com.facebook.react.modules.image;

import com.facebook.react.bridge.Promise;
import p139d.p143b.p161d.AbstractC1735d;
import p139d.p143b.p161d.InterfaceC1736e;

/* renamed from: com.facebook.react.modules.image.b */
/* loaded from: classes.dex */
class C1192b extends AbstractC1735d<Void> {

    /* renamed from: a */
    final /* synthetic */ int f4576a;

    /* renamed from: b */
    final /* synthetic */ Promise f4577b;

    /* renamed from: c */
    final /* synthetic */ ImageLoaderModule f4578c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C1192b(ImageLoaderModule imageLoaderModule, int i, Promise promise) {
        this.f4578c = imageLoaderModule;
        this.f4576a = i;
        this.f4577b = promise;
    }

    @Override // p139d.p143b.p161d.AbstractC1735d
    /* renamed from: e */
    protected void mo5357e(InterfaceC1736e<Void> interfaceC1736e) {
        try {
            this.f4578c.removeRequest(this.f4576a);
            this.f4577b.reject("E_PREFETCH_FAILURE", interfaceC1736e.mo7118c());
        } finally {
            interfaceC1736e.close();
        }
    }

    @Override // p139d.p143b.p161d.AbstractC1735d
    /* renamed from: f */
    protected void mo5358f(InterfaceC1736e<Void> interfaceC1736e) {
        if (interfaceC1736e.mo7117b()) {
            try {
                this.f4578c.removeRequest(this.f4576a);
                this.f4577b.resolve(true);
            } finally {
                interfaceC1736e.close();
            }
        }
    }
}
