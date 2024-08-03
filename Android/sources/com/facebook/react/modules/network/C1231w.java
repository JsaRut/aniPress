package com.facebook.react.modules.network;

import okhttp3.MediaType;
import okhttp3.ResponseBody;
import p275e.C2732t;
import p275e.InterfaceC2709D;
import p275e.InterfaceC2721i;

/* renamed from: com.facebook.react.modules.network.w */
/* loaded from: classes.dex */
public class C1231w extends ResponseBody {

    /* renamed from: a */
    private final ResponseBody f4650a;

    /* renamed from: b */
    private final InterfaceC1227s f4651b;

    /* renamed from: c */
    private InterfaceC2721i f4652c;

    /* renamed from: d */
    private long f4653d = 0;

    public C1231w(ResponseBody responseBody, InterfaceC1227s interfaceC1227s) {
        this.f4650a = responseBody;
        this.f4651b = interfaceC1227s;
    }

    /* renamed from: b */
    private InterfaceC2709D m5438b(InterfaceC2709D interfaceC2709D) {
        return new C1230v(this, interfaceC2709D);
    }

    @Override // okhttp3.ResponseBody
    public long contentLength() {
        return this.f4650a.contentLength();
    }

    @Override // okhttp3.ResponseBody
    public MediaType contentType() {
        return this.f4650a.contentType();
    }

    /* renamed from: m */
    public long m5441m() {
        return this.f4653d;
    }

    @Override // okhttp3.ResponseBody
    public InterfaceC2721i source() {
        if (this.f4652c == null) {
            this.f4652c = C2732t.m11745a(m5438b(this.f4650a.source()));
        }
        return this.f4652c;
    }
}
