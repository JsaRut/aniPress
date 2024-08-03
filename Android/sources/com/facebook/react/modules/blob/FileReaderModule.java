package com.facebook.react.modules.blob;

import android.util.Base64;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableMap;
import p139d.p143b.p208m.p212d.p213a.InterfaceC2073a;

@InterfaceC2073a(name = FileReaderModule.NAME)
/* loaded from: classes.dex */
public class FileReaderModule extends ReactContextBaseJavaModule {
    private static final String ERROR_INVALID_BLOB = "ERROR_INVALID_BLOB";
    protected static final String NAME = "FileReaderModule";

    public FileReaderModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }

    private BlobModule getBlobModule() {
        return (BlobModule) getReactApplicationContext().getNativeModule(BlobModule.class);
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return NAME;
    }

    @ReactMethod
    public void readAsDataURL(ReadableMap readableMap, Promise promise) {
        byte[] resolve = getBlobModule().resolve(readableMap.getString("blobId"), readableMap.getInt("offset"), readableMap.getInt("size"));
        if (resolve == null) {
            promise.reject(ERROR_INVALID_BLOB, "The specified blob is invalid");
            return;
        }
        try {
            StringBuilder sb = new StringBuilder();
            sb.append("data:");
            sb.append((!readableMap.hasKey("type") || readableMap.getString("type").isEmpty()) ? "application/octet-stream" : readableMap.getString("type"));
            sb.append(";base64,");
            sb.append(Base64.encodeToString(resolve, 2));
            promise.resolve(sb.toString());
        } catch (Exception e2) {
            promise.reject(e2);
        }
    }

    @ReactMethod
    public void readAsText(ReadableMap readableMap, String str, Promise promise) {
        byte[] resolve = getBlobModule().resolve(readableMap.getString("blobId"), readableMap.getInt("offset"), readableMap.getInt("size"));
        if (resolve == null) {
            promise.reject(ERROR_INVALID_BLOB, "The specified blob is invalid");
            return;
        }
        try {
            promise.resolve(new String(resolve, str));
        } catch (Exception e2) {
            promise.reject(e2);
        }
    }
}
