package com.facebook.react.modules.blob;

import android.net.Uri;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.modules.network.NetworkingModule;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.facebook.react.modules.blob.b */
/* loaded from: classes.dex */
public class C1145b implements NetworkingModule.InterfaceC1208c {

    /* renamed from: a */
    final /* synthetic */ BlobModule f4451a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C1145b(BlobModule blobModule) {
        this.f4451a = blobModule;
    }

    @Override // com.facebook.react.modules.network.NetworkingModule.InterfaceC1208c
    /* renamed from: a */
    public WritableMap mo5254a(Uri uri) {
        byte[] bytesFromUri;
        String mimeTypeFromUri;
        String nameFromUri;
        long lastModifiedFromUri;
        bytesFromUri = this.f4451a.getBytesFromUri(uri);
        WritableMap createMap = Arguments.createMap();
        createMap.putString("blobId", this.f4451a.store(bytesFromUri));
        createMap.putInt("offset", 0);
        createMap.putInt("size", bytesFromUri.length);
        mimeTypeFromUri = this.f4451a.getMimeTypeFromUri(uri);
        createMap.putString("type", mimeTypeFromUri);
        nameFromUri = this.f4451a.getNameFromUri(uri);
        createMap.putString("name", nameFromUri);
        lastModifiedFromUri = this.f4451a.getLastModifiedFromUri(uri);
        createMap.putDouble("lastModified", lastModifiedFromUri);
        return createMap;
    }

    @Override // com.facebook.react.modules.network.NetworkingModule.InterfaceC1208c
    /* renamed from: a */
    public boolean mo5255a(Uri uri, String str) {
        String scheme = uri.getScheme();
        return !("http".equals(scheme) || "https".equals(scheme)) && "blob".equals(str);
    }
}
