package com.facebook.react.modules.blob;

import android.content.res.Resources;
import android.database.Cursor;
import android.net.Uri;
import android.webkit.MimeTypeMap;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.common.C1104f;
import com.facebook.react.modules.network.NetworkingModule;
import com.facebook.react.modules.websocket.WebSocketModule;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.UUID;
import p139d.p143b.p208m.p212d.p213a.InterfaceC2073a;
import p275e.C2722j;

@InterfaceC2073a(name = BlobModule.NAME)
/* loaded from: classes.dex */
public class BlobModule extends ReactContextBaseJavaModule {
    protected static final String NAME = "BlobModule";
    private final Map<String, byte[]> mBlobs;
    private final NetworkingModule.InterfaceC1206a mNetworkingRequestBodyHandler;
    private final NetworkingModule.InterfaceC1207b mNetworkingResponseHandler;
    private final NetworkingModule.InterfaceC1208c mNetworkingUriHandler;
    private final WebSocketModule.InterfaceC1263a mWebSocketContentHandler;

    public BlobModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        this.mBlobs = new HashMap();
        this.mWebSocketContentHandler = new C1144a(this);
        this.mNetworkingUriHandler = new C1145b(this);
        this.mNetworkingRequestBodyHandler = new C1146c(this);
        this.mNetworkingResponseHandler = new C1147d(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    public byte[] getBytesFromUri(Uri uri) {
        InputStream openInputStream = getReactApplicationContext().getContentResolver().openInputStream(uri);
        if (openInputStream == null) {
            throw new FileNotFoundException("File not found for " + uri);
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[1024];
        while (true) {
            int read = openInputStream.read(bArr);
            if (read == -1) {
                return byteArrayOutputStream.toByteArray();
            }
            byteArrayOutputStream.write(bArr, 0, read);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public long getLastModifiedFromUri(Uri uri) {
        if ("file".equals(uri.getScheme())) {
            return new File(uri.toString()).lastModified();
        }
        return 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String getMimeTypeFromUri(Uri uri) {
        String fileExtensionFromUrl;
        String type = getReactApplicationContext().getContentResolver().getType(uri);
        if (type == null && (fileExtensionFromUrl = MimeTypeMap.getFileExtensionFromUrl(uri.getPath())) != null) {
            type = MimeTypeMap.getSingleton().getMimeTypeFromExtension(fileExtensionFromUrl);
        }
        return type == null ? "" : type;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String getNameFromUri(Uri uri) {
        if ("file".equals(uri.getScheme())) {
            return uri.getLastPathSegment();
        }
        Cursor query = getReactApplicationContext().getContentResolver().query(uri, new String[]{"_display_name"}, null, null, null);
        if (query != null) {
            try {
                if (query.moveToFirst()) {
                    return query.getString(0);
                }
            } finally {
                query.close();
            }
        }
        return uri.getLastPathSegment();
    }

    private WebSocketModule getWebSocketModule() {
        return (WebSocketModule) getReactApplicationContext().getNativeModule(WebSocketModule.class);
    }

    @ReactMethod
    public void addNetworkingHandler() {
        NetworkingModule networkingModule = (NetworkingModule) getReactApplicationContext().getNativeModule(NetworkingModule.class);
        networkingModule.addUriHandler(this.mNetworkingUriHandler);
        networkingModule.addRequestBodyHandler(this.mNetworkingRequestBodyHandler);
        networkingModule.addResponseHandler(this.mNetworkingResponseHandler);
    }

    @ReactMethod
    public void addWebSocketHandler(int i) {
        getWebSocketModule().setContentHandler(i, this.mWebSocketContentHandler);
    }

    @ReactMethod
    public void createFromParts(ReadableArray readableArray, String str) {
        byte[] resolve;
        ArrayList arrayList = new ArrayList(readableArray.size());
        int i = 0;
        for (int i2 = 0; i2 < readableArray.size(); i2++) {
            ReadableMap map = readableArray.getMap(i2);
            String string = map.getString("type");
            char c2 = 65535;
            int hashCode = string.hashCode();
            if (hashCode != -891985903) {
                if (hashCode == 3026845 && string.equals("blob")) {
                    c2 = 0;
                }
            } else if (string.equals("string")) {
                c2 = 1;
            }
            if (c2 == 0) {
                ReadableMap map2 = map.getMap("data");
                i += map2.getInt("size");
                resolve = resolve(map2);
            } else {
                if (c2 != 1) {
                    throw new IllegalArgumentException("Invalid type for blob: " + map.getString("type"));
                }
                resolve = map.getString("data").getBytes(Charset.forName("UTF-8"));
                i += resolve.length;
            }
            arrayList.add(i2, resolve);
        }
        ByteBuffer allocate = ByteBuffer.allocate(i);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            allocate.put((byte[]) it.next());
        }
        store(allocate.array(), str);
    }

    @Override // com.facebook.react.bridge.BaseJavaModule
    public Map<String, Object> getConstants() {
        Resources resources = getReactApplicationContext().getResources();
        int identifier = resources.getIdentifier("blob_provider_authority", "string", getReactApplicationContext().getPackageName());
        if (identifier == 0) {
            return null;
        }
        return C1104f.m5177a("BLOB_URI_SCHEME", "content", "BLOB_URI_HOST", resources.getString(identifier));
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return NAME;
    }

    @ReactMethod
    public void release(String str) {
        remove(str);
    }

    public void remove(String str) {
        this.mBlobs.remove(str);
    }

    @ReactMethod
    public void removeWebSocketHandler(int i) {
        getWebSocketModule().setContentHandler(i, null);
    }

    public byte[] resolve(Uri uri) {
        String lastPathSegment = uri.getLastPathSegment();
        String queryParameter = uri.getQueryParameter("offset");
        int parseInt = queryParameter != null ? Integer.parseInt(queryParameter, 10) : 0;
        String queryParameter2 = uri.getQueryParameter("size");
        return resolve(lastPathSegment, parseInt, queryParameter2 != null ? Integer.parseInt(queryParameter2, 10) : -1);
    }

    public byte[] resolve(ReadableMap readableMap) {
        return resolve(readableMap.getString("blobId"), readableMap.getInt("offset"), readableMap.getInt("size"));
    }

    public byte[] resolve(String str, int i, int i2) {
        byte[] bArr = this.mBlobs.get(str);
        if (bArr == null) {
            return null;
        }
        if (i2 == -1) {
            i2 = bArr.length - i;
        }
        return (i > 0 || i2 != bArr.length) ? Arrays.copyOfRange(bArr, i, i2 + i) : bArr;
    }

    @ReactMethod
    public void sendOverSocket(ReadableMap readableMap, int i) {
        byte[] resolve = resolve(readableMap.getString("blobId"), readableMap.getInt("offset"), readableMap.getInt("size"));
        if (resolve != null) {
            getWebSocketModule().sendBinary(C2722j.m11723a(resolve), i);
        } else {
            getWebSocketModule().sendBinary((C2722j) null, i);
        }
    }

    public String store(byte[] bArr) {
        String uuid = UUID.randomUUID().toString();
        store(bArr, uuid);
        return uuid;
    }

    public void store(byte[] bArr, String str) {
        this.mBlobs.put(str, bArr);
    }
}
