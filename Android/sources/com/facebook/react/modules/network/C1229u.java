package com.facebook.react.modules.network;

import okhttp3.MediaType;
import okhttp3.RequestBody;
import p275e.C2732t;
import p275e.InterfaceC2708C;
import p275e.InterfaceC2720h;

/* renamed from: com.facebook.react.modules.network.u */
/* loaded from: classes.dex */
public class C1229u extends RequestBody {

    /* renamed from: a */
    private final RequestBody f4646a;

    /* renamed from: b */
    private final InterfaceC1227s f4647b;

    /* renamed from: c */
    private long f4648c = 0;

    public C1229u(RequestBody requestBody, InterfaceC1227s interfaceC1227s) {
        this.f4646a = requestBody;
        this.f4647b = interfaceC1227s;
    }

    /* renamed from: a */
    private InterfaceC2708C m5435a(InterfaceC2720h interfaceC2720h) {
        return C2732t.m11739a(new C1228t(this, interfaceC2720h.mo11707j()));
    }

    @Override // okhttp3.RequestBody
    public long contentLength() {
        if (this.f4648c == 0) {
            this.f4648c = this.f4646a.contentLength();
        }
        return this.f4648c;
    }

    @Override // okhttp3.RequestBody
    public MediaType contentType() {
        return this.f4646a.contentType();
    }

    @Override // okhttp3.RequestBody
    public void writeTo(InterfaceC2720h interfaceC2720h) {
        InterfaceC2720h m11744a = C2732t.m11744a(m5435a(interfaceC2720h));
        contentLength();
        this.f4646a.writeTo(m11744a);
        m11744a.flush();
    }
}
