package com.facebook.react.modules.blob;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.modules.network.NetworkingModule;
import okhttp3.ResponseBody;

/* renamed from: com.facebook.react.modules.blob.d */
/* loaded from: classes.dex */
public class C1147d implements NetworkingModule.InterfaceC1207b {

    /* renamed from: a */
    final /* synthetic */ BlobModule f4453a;

    public C1147d(BlobModule blobModule) {
        this.f4453a = blobModule;
    }

    @Override // com.facebook.react.modules.network.NetworkingModule.InterfaceC1207b
    /* renamed from: a */
    public WritableMap mo5258a(ResponseBody responseBody) {
        byte[] bytes = responseBody.bytes();
        WritableMap createMap = Arguments.createMap();
        createMap.putString("blobId", this.f4453a.store(bytes));
        createMap.putInt("offset", 0);
        createMap.putInt("size", bytes.length);
        return createMap;
    }

    @Override // com.facebook.react.modules.network.NetworkingModule.InterfaceC1207b
    /* renamed from: a */
    public boolean mo5259a(String str) {
        return "blob".equals(str);
    }
}
