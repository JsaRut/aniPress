package com.facebook.react.modules.network;

import okhttp3.ResponseBody;
import p275e.AbstractC2724l;
import p275e.C2719g;
import p275e.InterfaceC2709D;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.facebook.react.modules.network.v */
/* loaded from: classes.dex */
public class C1230v extends AbstractC2724l {

    /* renamed from: a */
    final /* synthetic */ C1231w f4649a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1230v(C1231w c1231w, InterfaceC2709D interfaceC2709D) {
        super(interfaceC2709D);
        this.f4649a = c1231w;
    }

    @Override // p275e.AbstractC2724l, p275e.InterfaceC2709D
    public long read(C2719g c2719g, long j) {
        long j2;
        InterfaceC1227s interfaceC1227s;
        long j3;
        ResponseBody responseBody;
        long read = super.read(c2719g, j);
        C1231w c1231w = this.f4649a;
        j2 = c1231w.f4653d;
        c1231w.f4653d = j2 + (read != -1 ? read : 0L);
        interfaceC1227s = this.f4649a.f4651b;
        j3 = this.f4649a.f4653d;
        responseBody = this.f4649a.f4650a;
        interfaceC1227s.mo5423a(j3, responseBody.contentLength(), read == -1);
        return read;
    }
}
