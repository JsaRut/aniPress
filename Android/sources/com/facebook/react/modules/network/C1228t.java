package com.facebook.react.modules.network;

import java.io.OutputStream;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.facebook.react.modules.network.t */
/* loaded from: classes.dex */
public class C1228t extends C1210b {

    /* renamed from: b */
    final /* synthetic */ C1229u f4645b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1228t(C1229u c1229u, OutputStream outputStream) {
        super(outputStream);
        this.f4645b = c1229u;
    }

    /* renamed from: m */
    private void m5433m() {
        InterfaceC1227s interfaceC1227s;
        long count = getCount();
        long contentLength = this.f4645b.contentLength();
        interfaceC1227s = this.f4645b.f4647b;
        interfaceC1227s.mo5423a(count, contentLength, count == contentLength);
    }

    @Override // com.facebook.react.modules.network.C1210b, java.io.FilterOutputStream, java.io.OutputStream
    public void write(int i) {
        super.write(i);
        m5433m();
    }

    @Override // com.facebook.react.modules.network.C1210b, java.io.FilterOutputStream, java.io.OutputStream
    public void write(byte[] bArr, int i, int i2) {
        super.write(bArr, i, i2);
        m5433m();
    }
}
