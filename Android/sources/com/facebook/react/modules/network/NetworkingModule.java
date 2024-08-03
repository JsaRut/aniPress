package com.facebook.react.modules.network;

import android.net.Uri;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.common.C1106h;
import com.facebook.react.modules.core.DeviceEventManagerModule;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import okhttp3.CookieJar;
import okhttp3.Headers;
import okhttp3.JavaNetCookieJar;
import okhttp3.MediaType;
import okhttp3.MultipartBody;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.ResponseBody;
import p139d.p143b.p148c.p153e.C1700a;
import p139d.p143b.p208m.p212d.p213a.InterfaceC2073a;
import p275e.C2722j;

@InterfaceC2073a(name = NetworkingModule.NAME)
/* loaded from: classes.dex */
public final class NetworkingModule extends ReactContextBaseJavaModule {
    private static final int CHUNK_TIMEOUT_NS = 100000000;
    private static final String CONTENT_ENCODING_HEADER_NAME = "content-encoding";
    private static final String CONTENT_TYPE_HEADER_NAME = "content-type";
    private static final int MAX_CHUNK_SIZE_BETWEEN_FLUSHES = 8192;
    protected static final String NAME = "Networking";
    private static final String REQUEST_BODY_KEY_BASE64 = "base64";
    private static final String REQUEST_BODY_KEY_FORMDATA = "formData";
    private static final String REQUEST_BODY_KEY_STRING = "string";
    private static final String REQUEST_BODY_KEY_URI = "uri";
    private static final String TAG = "NetworkingModule";
    private static final String USER_AGENT_HEADER_NAME = "user-agent";
    private final OkHttpClient mClient;
    private final C1217i mCookieHandler;
    private final InterfaceC1209a mCookieJarContainer;
    private final String mDefaultUserAgent;
    private final List<InterfaceC1206a> mRequestBodyHandlers;
    private final Set<Integer> mRequestIds;
    private final List<InterfaceC1207b> mResponseHandlers;
    private boolean mShuttingDown;
    private final List<InterfaceC1208c> mUriHandlers;

    /* renamed from: com.facebook.react.modules.network.NetworkingModule$a */
    /* loaded from: classes.dex */
    public interface InterfaceC1206a {
        /* renamed from: a */
        RequestBody mo5256a(ReadableMap readableMap, String str);

        /* renamed from: a */
        boolean mo5257a(ReadableMap readableMap);
    }

    /* renamed from: com.facebook.react.modules.network.NetworkingModule$b */
    /* loaded from: classes.dex */
    public interface InterfaceC1207b {
        /* renamed from: a */
        WritableMap mo5258a(ResponseBody responseBody);

        /* renamed from: a */
        boolean mo5259a(String str);
    }

    /* renamed from: com.facebook.react.modules.network.NetworkingModule$c */
    /* loaded from: classes.dex */
    public interface InterfaceC1208c {
        /* renamed from: a */
        WritableMap mo5254a(Uri uri);

        /* renamed from: a */
        boolean mo5255a(Uri uri, String str);
    }

    public NetworkingModule(ReactApplicationContext reactApplicationContext) {
        this(reactApplicationContext, null, C1226r.m5429a(reactApplicationContext), null);
    }

    public NetworkingModule(ReactApplicationContext reactApplicationContext, String str) {
        this(reactApplicationContext, str, C1226r.m5429a(reactApplicationContext), null);
    }

    NetworkingModule(ReactApplicationContext reactApplicationContext, String str, OkHttpClient okHttpClient) {
        this(reactApplicationContext, str, okHttpClient, null);
    }

    NetworkingModule(ReactApplicationContext reactApplicationContext, String str, OkHttpClient okHttpClient, List<InterfaceC1219k> list) {
        super(reactApplicationContext);
        this.mRequestBodyHandlers = new ArrayList();
        this.mUriHandlers = new ArrayList();
        this.mResponseHandlers = new ArrayList();
        if (list != null) {
            OkHttpClient.Builder newBuilder = okHttpClient.newBuilder();
            Iterator<InterfaceC1219k> it = list.iterator();
            while (it.hasNext()) {
                newBuilder.addNetworkInterceptor(it.next().create());
            }
            okHttpClient = newBuilder.build();
        }
        this.mClient = okHttpClient;
        this.mCookieHandler = new C1217i(reactApplicationContext);
        this.mCookieJarContainer = (InterfaceC1209a) this.mClient.cookieJar();
        this.mShuttingDown = false;
        this.mDefaultUserAgent = str;
        this.mRequestIds = new HashSet();
    }

    public NetworkingModule(ReactApplicationContext reactApplicationContext, List<InterfaceC1219k> list) {
        this(reactApplicationContext, null, C1226r.m5429a(reactApplicationContext), list);
    }

    private synchronized void addRequest(int i) {
        this.mRequestIds.add(Integer.valueOf(i));
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    private synchronized void cancelAllRequests() {
        Iterator<Integer> it = this.mRequestIds.iterator();
        while (it.hasNext()) {
            cancelRequest(it.next().intValue());
        }
        this.mRequestIds.clear();
    }

    private void cancelRequest(int i) {
        new AsyncTaskC1224p(this, getReactApplicationContext(), i).execute(new Void[0]);
    }

    private MultipartBody.Builder constructMultipartBody(ReadableArray readableArray, String str, int i) {
        String str2;
        MediaType mediaType;
        RequestBody m5387a;
        DeviceEventManagerModule.RCTDeviceEventEmitter eventEmitter = getEventEmitter();
        MultipartBody.Builder builder = new MultipartBody.Builder();
        builder.setType(MediaType.parse(str));
        int size = readableArray.size();
        for (int i2 = 0; i2 < size; i2++) {
            ReadableMap map = readableArray.getMap(i2);
            Headers extractHeaders = extractHeaders(map.getArray("headers"), null);
            if (extractHeaders == null) {
                str2 = "Missing or invalid header format for FormData part.";
            } else {
                String str3 = extractHeaders.get(CONTENT_TYPE_HEADER_NAME);
                if (str3 != null) {
                    mediaType = MediaType.parse(str3);
                    extractHeaders = extractHeaders.newBuilder().removeAll(CONTENT_TYPE_HEADER_NAME).build();
                } else {
                    mediaType = null;
                }
                if (map.hasKey(REQUEST_BODY_KEY_STRING)) {
                    m5387a = RequestBody.create(mediaType, map.getString(REQUEST_BODY_KEY_STRING));
                } else if (!map.hasKey(REQUEST_BODY_KEY_URI)) {
                    C1204B.m5396a(eventEmitter, i, "Unrecognized FormData part.", (Throwable) null);
                } else if (mediaType == null) {
                    str2 = "Binary FormData part needs a content-type header.";
                } else {
                    String string = map.getString(REQUEST_BODY_KEY_URI);
                    InputStream m5385a = C1203A.m5385a(getReactApplicationContext(), string);
                    if (m5385a == null) {
                        str2 = "Could not retrieve file for uri " + string;
                    } else {
                        m5387a = C1203A.m5387a(mediaType, m5385a);
                    }
                }
                builder.addPart(extractHeaders, m5387a);
            }
            C1204B.m5396a(eventEmitter, i, str2, (Throwable) null);
            return null;
        }
        return builder;
    }

    private Headers extractHeaders(ReadableArray readableArray, ReadableMap readableMap) {
        String str;
        if (readableArray == null) {
            return null;
        }
        Headers.Builder builder = new Headers.Builder();
        int size = readableArray.size();
        boolean z = false;
        for (int i = 0; i < size; i++) {
            ReadableArray array = readableArray.getArray(i);
            if (array != null && array.size() == 2) {
                String m5421a = C1218j.m5421a(array.getString(0));
                String m5422b = C1218j.m5422b(array.getString(1));
                if (m5421a != null && m5422b != null) {
                    builder.add(m5421a, m5422b);
                }
            }
            return null;
        }
        if (builder.get(USER_AGENT_HEADER_NAME) == null && (str = this.mDefaultUserAgent) != null) {
            builder.add(USER_AGENT_HEADER_NAME, str);
        }
        if (readableMap != null && readableMap.hasKey(REQUEST_BODY_KEY_STRING)) {
            z = true;
        }
        if (!z) {
            builder.removeAll(CONTENT_ENCODING_HEADER_NAME);
        }
        return builder.build();
    }

    private DeviceEventManagerModule.RCTDeviceEventEmitter getEventEmitter() {
        return (DeviceEventManagerModule.RCTDeviceEventEmitter) getReactApplicationContext().getJSModule(DeviceEventManagerModule.RCTDeviceEventEmitter.class);
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    public void readWithProgress(DeviceEventManagerModule.RCTDeviceEventEmitter rCTDeviceEventEmitter, int i, ResponseBody responseBody) {
        long j;
        long j2 = -1;
        try {
            C1231w c1231w = (C1231w) responseBody;
            j = c1231w.m5441m();
            try {
                j2 = c1231w.contentLength();
            } catch (ClassCastException unused) {
            }
        } catch (ClassCastException unused2) {
            j = -1;
        }
        C1232x c1232x = new C1232x(responseBody.contentType() == null ? C1106h.f4374a : responseBody.contentType().charset(C1106h.f4374a));
        InputStream byteStream = responseBody.byteStream();
        try {
            byte[] bArr = new byte[MAX_CHUNK_SIZE_BETWEEN_FLUSHES];
            while (true) {
                int read = byteStream.read(bArr);
                if (read == -1) {
                    return;
                } else {
                    C1204B.m5395a(rCTDeviceEventEmitter, i, c1232x.m5442a(bArr, read), j, j2);
                }
            }
        } finally {
            byteStream.close();
        }
    }

    public synchronized void removeRequest(int i) {
        this.mRequestIds.remove(Integer.valueOf(i));
    }

    public static boolean shouldDispatch(long j, long j2) {
        return j2 + 100000000 < j;
    }

    public static WritableMap translateHeaders(Headers headers) {
        WritableMap createMap = Arguments.createMap();
        for (int i = 0; i < headers.size(); i++) {
            String name = headers.name(i);
            createMap.putString(name, createMap.hasKey(name) ? createMap.getString(name) + ", " + headers.value(i) : headers.value(i));
        }
        return createMap;
    }

    private RequestBody wrapRequestBodyWithProgressEmitter(RequestBody requestBody, DeviceEventManagerModule.RCTDeviceEventEmitter rCTDeviceEventEmitter, int i) {
        if (requestBody == null) {
            return null;
        }
        return C1203A.m5383a(requestBody, new C1223o(this, rCTDeviceEventEmitter, i));
    }

    @ReactMethod
    public void abortRequest(int i) {
        cancelRequest(i);
        removeRequest(i);
    }

    public void addRequestBodyHandler(InterfaceC1206a interfaceC1206a) {
        this.mRequestBodyHandlers.add(interfaceC1206a);
    }

    public void addResponseHandler(InterfaceC1207b interfaceC1207b) {
        this.mResponseHandlers.add(interfaceC1207b);
    }

    public void addUriHandler(InterfaceC1208c interfaceC1208c) {
        this.mUriHandlers.add(interfaceC1208c);
    }

    @ReactMethod
    public void clearCookies(Callback callback) {
        this.mCookieHandler.m5415a(callback);
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return NAME;
    }

    @Override // com.facebook.react.bridge.BaseJavaModule, com.facebook.react.bridge.NativeModule
    public void initialize() {
        this.mCookieJarContainer.mo5400a(new JavaNetCookieJar(this.mCookieHandler));
    }

    @Override // com.facebook.react.bridge.BaseJavaModule, com.facebook.react.bridge.NativeModule
    public void onCatalystInstanceDestroy() {
        this.mShuttingDown = true;
        cancelAllRequests();
        this.mCookieHandler.m5416b();
        this.mCookieJarContainer.mo5399a();
        this.mRequestBodyHandlers.clear();
        this.mResponseHandlers.clear();
        this.mUriHandlers.clear();
    }

    public void removeRequestBodyHandler(InterfaceC1206a interfaceC1206a) {
        this.mRequestBodyHandlers.remove(interfaceC1206a);
    }

    public void removeResponseHandler(InterfaceC1207b interfaceC1207b) {
        this.mResponseHandlers.remove(interfaceC1207b);
    }

    public void removeUriHandler(InterfaceC1208c interfaceC1208c) {
        this.mUriHandlers.remove(interfaceC1208c);
    }

    @ReactMethod
    public void sendRequest(String str, String str2, int i, ReadableArray readableArray, ReadableMap readableMap, String str3, boolean z, int i2, boolean z2) {
        try {
            sendRequestInternal(str, str2, i, readableArray, readableMap, str3, z, i2, z2);
        } catch (Throwable th) {
            C1700a.m6998a(TAG, "Failed to send url request: " + str2, th);
            C1204B.m5396a(getEventEmitter(), i, th.getMessage(), th);
        }
    }

    public void sendRequestInternal(String str, String str2, int i, ReadableArray readableArray, ReadableMap readableMap, String str3, boolean z, int i2, boolean z2) {
        InterfaceC1206a interfaceC1206a;
        RequestBody m5386a;
        DeviceEventManagerModule.RCTDeviceEventEmitter eventEmitter = getEventEmitter();
        try {
            Uri parse = Uri.parse(str2);
            for (InterfaceC1208c interfaceC1208c : this.mUriHandlers) {
                if (interfaceC1208c.mo5255a(parse, str3)) {
                    C1204B.m5393a(eventEmitter, i, interfaceC1208c.mo5254a(parse));
                    C1204B.m5390a(eventEmitter, i);
                    return;
                }
            }
            try {
                Request.Builder url = new Request.Builder().url(str2);
                if (i != 0) {
                    url.tag(Integer.valueOf(i));
                }
                OkHttpClient.Builder newBuilder = this.mClient.newBuilder();
                if (!z2) {
                    newBuilder.cookieJar(CookieJar.NO_COOKIES);
                }
                if (z) {
                    newBuilder.addNetworkInterceptor(new C1221m(this, str3, eventEmitter, i));
                }
                if (i2 != this.mClient.connectTimeoutMillis()) {
                    newBuilder.connectTimeout(i2, TimeUnit.MILLISECONDS);
                }
                OkHttpClient build = newBuilder.build();
                Headers extractHeaders = extractHeaders(readableArray, readableMap);
                if (extractHeaders == null) {
                    C1204B.m5396a(eventEmitter, i, "Unrecognized headers format", (Throwable) null);
                    return;
                }
                String str4 = extractHeaders.get(CONTENT_TYPE_HEADER_NAME);
                String str5 = extractHeaders.get(CONTENT_ENCODING_HEADER_NAME);
                url.headers(extractHeaders);
                if (readableMap != null) {
                    Iterator<InterfaceC1206a> it = this.mRequestBodyHandlers.iterator();
                    while (it.hasNext()) {
                        interfaceC1206a = it.next();
                        if (interfaceC1206a.mo5257a(readableMap)) {
                            break;
                        }
                    }
                }
                interfaceC1206a = null;
                if (readableMap != null && !str.toLowerCase().equals("get") && !str.toLowerCase().equals("head")) {
                    if (interfaceC1206a != null) {
                        m5386a = interfaceC1206a.mo5256a(readableMap, str4);
                    } else if (readableMap.hasKey(REQUEST_BODY_KEY_STRING)) {
                        if (str4 == null) {
                            C1204B.m5396a(eventEmitter, i, "Payload is set but no content-type header specified", (Throwable) null);
                            return;
                        }
                        String string = readableMap.getString(REQUEST_BODY_KEY_STRING);
                        MediaType parse2 = MediaType.parse(str4);
                        if (C1203A.m5389b(str5)) {
                            m5386a = C1203A.m5388a(parse2, string);
                            if (m5386a == null) {
                                C1204B.m5396a(eventEmitter, i, "Failed to gzip request body", (Throwable) null);
                                return;
                            }
                        } else {
                            m5386a = RequestBody.create(parse2, string.getBytes(parse2 == null ? C1106h.f4374a : parse2.charset(C1106h.f4374a)));
                        }
                    } else if (readableMap.hasKey(REQUEST_BODY_KEY_BASE64)) {
                        if (str4 == null) {
                            C1204B.m5396a(eventEmitter, i, "Payload is set but no content-type header specified", (Throwable) null);
                            return;
                        }
                        m5386a = RequestBody.create(MediaType.parse(str4), C2722j.m11721a(readableMap.getString(REQUEST_BODY_KEY_BASE64)));
                    } else if (readableMap.hasKey(REQUEST_BODY_KEY_URI)) {
                        if (str4 == null) {
                            C1204B.m5396a(eventEmitter, i, "Payload is set but no content-type header specified", (Throwable) null);
                            return;
                        }
                        String string2 = readableMap.getString(REQUEST_BODY_KEY_URI);
                        InputStream m5385a = C1203A.m5385a(getReactApplicationContext(), string2);
                        if (m5385a == null) {
                            C1204B.m5396a(eventEmitter, i, "Could not retrieve file for uri " + string2, (Throwable) null);
                            return;
                        }
                        m5386a = C1203A.m5387a(MediaType.parse(str4), m5385a);
                    } else if (readableMap.hasKey(REQUEST_BODY_KEY_FORMDATA)) {
                        if (str4 == null) {
                            str4 = "multipart/form-data";
                        }
                        MultipartBody.Builder constructMultipartBody = constructMultipartBody(readableMap.getArray(REQUEST_BODY_KEY_FORMDATA), str4, i);
                        if (constructMultipartBody == null) {
                            return;
                        } else {
                            m5386a = constructMultipartBody.build();
                        }
                    }
                    url.method(str, wrapRequestBodyWithProgressEmitter(m5386a, eventEmitter, i));
                    addRequest(i);
                    build.newCall(url.build()).enqueue(new C1222n(this, i, eventEmitter, str3, z));
                }
                m5386a = C1203A.m5386a(str);
                url.method(str, wrapRequestBodyWithProgressEmitter(m5386a, eventEmitter, i));
                addRequest(i);
                build.newCall(url.build()).enqueue(new C1222n(this, i, eventEmitter, str3, z));
            } catch (Exception e2) {
                C1204B.m5396a(eventEmitter, i, e2.getMessage(), (Throwable) null);
            }
        } catch (IOException e3) {
            C1204B.m5396a(eventEmitter, i, e3.getMessage(), e3);
        }
    }
}
