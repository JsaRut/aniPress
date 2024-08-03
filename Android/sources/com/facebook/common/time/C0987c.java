package com.facebook.common.time;

/* renamed from: com.facebook.common.time.c */
/* loaded from: classes.dex */
public class C0987c implements InterfaceC0985a {

    /* renamed from: a */
    private static final C0987c f4119a = new C0987c();

    private C0987c() {
    }

    /* renamed from: a */
    public static C0987c m4970a() {
        return f4119a;
    }

    @Override // com.facebook.common.time.InterfaceC0985a
    public long now() {
        return System.currentTimeMillis();
    }
}
