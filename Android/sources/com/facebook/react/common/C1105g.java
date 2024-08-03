package com.facebook.react.common;

import p139d.p143b.p204k.p205a.C2038a;

/* renamed from: com.facebook.react.common.g */
/* loaded from: classes.dex */
public class C1105g {

    /* renamed from: a */
    private Thread f4373a = null;

    /* renamed from: a */
    public void m5190a() {
        Thread currentThread = Thread.currentThread();
        if (this.f4373a == null) {
            this.f4373a = currentThread;
        }
        C2038a.m8320a(this.f4373a == currentThread);
    }
}
