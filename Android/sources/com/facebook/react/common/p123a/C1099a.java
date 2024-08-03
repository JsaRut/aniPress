package com.facebook.react.common.p123a;

import okhttp3.Call;
import okhttp3.OkHttpClient;

/* renamed from: com.facebook.react.common.a.a */
/* loaded from: classes.dex */
public class C1099a {
    /* renamed from: a */
    public static void m5165a(OkHttpClient okHttpClient, Object obj) {
        for (Call call : okHttpClient.dispatcher().queuedCalls()) {
            if (obj.equals(call.request().tag())) {
                call.cancel();
                return;
            }
        }
        for (Call call2 : okHttpClient.dispatcher().runningCalls()) {
            if (obj.equals(call2.request().tag())) {
                call2.cancel();
                return;
            }
        }
    }
}
