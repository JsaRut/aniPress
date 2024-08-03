package com.facebook.react.modules.network;

/* renamed from: com.facebook.react.modules.network.l */
/* loaded from: classes.dex */
class C1220l implements InterfaceC1227s {

    /* renamed from: a */
    long f4626a = System.nanoTime();

    /* renamed from: b */
    final /* synthetic */ C1221m f4627b;

    public C1220l(C1221m c1221m) {
        this.f4627b = c1221m;
    }

    @Override // com.facebook.react.modules.network.InterfaceC1227s
    /* renamed from: a */
    public void mo5423a(long j, long j2, boolean z) {
        boolean shouldDispatch;
        long nanoTime = System.nanoTime();
        if (!z) {
            shouldDispatch = NetworkingModule.shouldDispatch(nanoTime, this.f4626a);
            if (!shouldDispatch) {
                return;
            }
        }
        if (this.f4627b.f4628a.equals("text")) {
            return;
        }
        C1221m c1221m = this.f4627b;
        C1204B.m5392a(c1221m.f4629b, c1221m.f4630c, j, j2);
        this.f4626a = nanoTime;
    }
}
