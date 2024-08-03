package com.facebook.react.modules.blob;

import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.modules.network.NetworkingModule;
import okhttp3.MediaType;
import okhttp3.RequestBody;

/* renamed from: com.facebook.react.modules.blob.c */
/* loaded from: classes.dex */
public class C1146c implements NetworkingModule.InterfaceC1206a {

    /* renamed from: a */
    final /* synthetic */ BlobModule f4452a;

    public C1146c(BlobModule blobModule) {
        this.f4452a = blobModule;
    }

    @Override // com.facebook.react.modules.network.NetworkingModule.InterfaceC1206a
    /* renamed from: a */
    public RequestBody mo5256a(ReadableMap readableMap, String str) {
        if (readableMap.hasKey("type") && !readableMap.getString("type").isEmpty()) {
            str = readableMap.getString("type");
        }
        if (str == null) {
            str = "application/octet-stream";
        }
        ReadableMap map = readableMap.getMap("blob");
        return RequestBody.create(MediaType.parse(str), this.f4452a.resolve(map.getString("blobId"), map.getInt("offset"), map.getInt("size")));
    }

    @Override // com.facebook.react.modules.network.NetworkingModule.InterfaceC1206a
    /* renamed from: a */
    public boolean mo5257a(ReadableMap readableMap) {
        return readableMap.hasKey("blob");
    }
}
