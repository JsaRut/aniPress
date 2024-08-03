package com.facebook.react.modules.network;

import android.webkit.ValueCallback;
import com.facebook.react.bridge.Callback;
import com.facebook.react.modules.network.C1217i;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.facebook.react.modules.network.d */
/* loaded from: classes.dex */
public class C1212d implements ValueCallback<Boolean> {

    /* renamed from: a */
    final /* synthetic */ Callback f4609a;

    /* renamed from: b */
    final /* synthetic */ C1217i f4610b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C1212d(C1217i c1217i, Callback callback) {
        this.f4610b = c1217i;
        this.f4609a = callback;
    }

    @Override // android.webkit.ValueCallback
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public void onReceiveValue(Boolean bool) {
        C1217i.a aVar;
        aVar = this.f4610b.f4621b;
        aVar.m5419a();
        this.f4609a.invoke(bool);
    }
}
