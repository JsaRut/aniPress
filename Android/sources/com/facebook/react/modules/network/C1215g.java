package com.facebook.react.modules.network;

import android.os.Handler;
import android.os.Message;
import com.facebook.react.modules.network.C1217i;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.facebook.react.modules.network.g */
/* loaded from: classes.dex */
public class C1215g implements Handler.Callback {

    /* renamed from: a */
    final /* synthetic */ C1217i f4617a;

    /* renamed from: b */
    final /* synthetic */ C1217i.a f4618b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C1215g(C1217i.a aVar, C1217i c1217i) {
        this.f4618b = aVar;
        this.f4617a = c1217i;
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(Message message) {
        if (message.what != 1) {
            return false;
        }
        this.f4618b.m5420b();
        return true;
    }
}
