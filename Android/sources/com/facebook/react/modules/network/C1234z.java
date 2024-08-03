package com.facebook.react.modules.network;

import java.io.IOException;
import java.io.InputStream;
import okhttp3.MediaType;
import okhttp3.RequestBody;
import okhttp3.internal.Util;
import p275e.C2732t;
import p275e.InterfaceC2709D;
import p275e.InterfaceC2720h;

/* renamed from: com.facebook.react.modules.network.z */
/* loaded from: classes.dex */
class C1234z extends RequestBody {

    /* renamed from: a */
    final /* synthetic */ MediaType f4657a;

    /* renamed from: b */
    final /* synthetic */ InputStream f4658b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C1234z(MediaType mediaType, InputStream inputStream) {
        this.f4657a = mediaType;
        this.f4658b = inputStream;
    }

    @Override // okhttp3.RequestBody
    public long contentLength() {
        try {
            return this.f4658b.available();
        } catch (IOException unused) {
            return 0L;
        }
    }

    @Override // okhttp3.RequestBody
    public MediaType contentType() {
        return this.f4657a;
    }

    @Override // okhttp3.RequestBody
    public void writeTo(InterfaceC2720h interfaceC2720h) {
        InterfaceC2709D interfaceC2709D = null;
        try {
            interfaceC2709D = C2732t.m11742a(this.f4658b);
            interfaceC2720h.mo11671a(interfaceC2709D);
        } finally {
            Util.closeQuietly(interfaceC2709D);
        }
    }
}
