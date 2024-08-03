package com.facebook.react.modules.blob;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.modules.websocket.WebSocketModule;
import p275e.C2722j;

/* renamed from: com.facebook.react.modules.blob.a */
/* loaded from: classes.dex */
public class C1144a implements WebSocketModule.InterfaceC1263a {

    /* renamed from: a */
    final /* synthetic */ BlobModule f4450a;

    public C1144a(BlobModule blobModule) {
        this.f4450a = blobModule;
    }

    @Override // com.facebook.react.modules.websocket.WebSocketModule.InterfaceC1263a
    /* renamed from: a */
    public void mo5252a(C2722j c2722j, WritableMap writableMap) {
        byte[] mo11657j = c2722j.mo11657j();
        WritableMap createMap = Arguments.createMap();
        createMap.putString("blobId", this.f4450a.store(mo11657j));
        createMap.putInt("offset", 0);
        createMap.putInt("size", mo11657j.length);
        writableMap.putMap("data", createMap);
        writableMap.putString("type", "blob");
    }

    @Override // com.facebook.react.modules.websocket.WebSocketModule.InterfaceC1263a
    /* renamed from: a */
    public void mo5253a(String str, WritableMap writableMap) {
        writableMap.putString("data", str);
    }
}
