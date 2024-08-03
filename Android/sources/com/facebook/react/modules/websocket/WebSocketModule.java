package com.facebook.react.modules.websocket;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableMapKeySetIterator;
import com.facebook.react.bridge.ReadableType;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.modules.core.DeviceEventManagerModule;
import com.facebook.react.modules.network.C1217i;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeUnit;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.WebSocket;
import p139d.p143b.p148c.p153e.C1700a;
import p139d.p143b.p208m.p212d.p213a.InterfaceC2073a;
import p275e.C2722j;

@InterfaceC2073a(hasConstants = false, name = WebSocketModule.NAME)
/* loaded from: classes.dex */
public final class WebSocketModule extends ReactContextBaseJavaModule {
    public static final String NAME = "WebSocketModule";
    private final Map<Integer, InterfaceC1263a> mContentHandlers;
    private C1217i mCookieHandler;
    private ReactContext mReactContext;
    private final Map<Integer, WebSocket> mWebSocketConnections;

    /* renamed from: com.facebook.react.modules.websocket.WebSocketModule$a */
    /* loaded from: classes.dex */
    public interface InterfaceC1263a {
        /* renamed from: a */
        void mo5252a(C2722j c2722j, WritableMap writableMap);

        /* renamed from: a */
        void mo5253a(String str, WritableMap writableMap);
    }

    public WebSocketModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        this.mWebSocketConnections = new ConcurrentHashMap();
        this.mContentHandlers = new ConcurrentHashMap();
        this.mReactContext = reactApplicationContext;
        this.mCookieHandler = new C1217i(reactApplicationContext);
    }

    private String getCookie(String str) {
        try {
            List<String> list = this.mCookieHandler.get(new URI(getDefaultOrigin(str)), new HashMap()).get("Cookie");
            if (list != null && !list.isEmpty()) {
                return list.get(0);
            }
            return null;
        } catch (IOException | URISyntaxException unused) {
            throw new IllegalArgumentException("Unable to get cookie from " + str);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0089 A[Catch: URISyntaxException -> 0x0097, TRY_LEAVE, TryCatch #0 {URISyntaxException -> 0x0097, blocks: (B:2:0x0000, B:5:0x0015, B:6:0x0020, B:7:0x0063, B:9:0x006d, B:10:0x0084, B:14:0x0089, B:15:0x0025, B:18:0x0033, B:19:0x003f, B:21:0x0049, B:23:0x0053), top: B:1:0x0000 }] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x006d A[Catch: URISyntaxException -> 0x0097, TryCatch #0 {URISyntaxException -> 0x0097, blocks: (B:2:0x0000, B:5:0x0015, B:6:0x0020, B:7:0x0063, B:9:0x006d, B:10:0x0084, B:14:0x0089, B:15:0x0025, B:18:0x0033, B:19:0x003f, B:21:0x0049, B:23:0x0053), top: B:1:0x0000 }] */
    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.lang.String getDefaultOrigin(java.lang.String r7) {
        /*
            java.lang.String r0 = ""
            java.net.URI r1 = new java.net.URI     // Catch: java.net.URISyntaxException -> L97
            r1.<init>(r7)     // Catch: java.net.URISyntaxException -> L97
            java.lang.String r2 = r1.getScheme()     // Catch: java.net.URISyntaxException -> L97
            java.lang.String r3 = "wss"
            boolean r2 = r2.equals(r3)     // Catch: java.net.URISyntaxException -> L97
            java.lang.String r3 = "https"
            if (r2 == 0) goto L25
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.net.URISyntaxException -> L97
            r2.<init>()     // Catch: java.net.URISyntaxException -> L97
            r2.append(r0)     // Catch: java.net.URISyntaxException -> L97
            r2.append(r3)     // Catch: java.net.URISyntaxException -> L97
        L20:
            java.lang.String r0 = r2.toString()     // Catch: java.net.URISyntaxException -> L97
            goto L63
        L25:
            java.lang.String r2 = r1.getScheme()     // Catch: java.net.URISyntaxException -> L97
            java.lang.String r4 = "ws"
            boolean r2 = r2.equals(r4)     // Catch: java.net.URISyntaxException -> L97
            java.lang.String r4 = "http"
            if (r2 == 0) goto L3f
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.net.URISyntaxException -> L97
            r2.<init>()     // Catch: java.net.URISyntaxException -> L97
            r2.append(r0)     // Catch: java.net.URISyntaxException -> L97
            r2.append(r4)     // Catch: java.net.URISyntaxException -> L97
            goto L20
        L3f:
            java.lang.String r2 = r1.getScheme()     // Catch: java.net.URISyntaxException -> L97
            boolean r2 = r2.equals(r4)     // Catch: java.net.URISyntaxException -> L97
            if (r2 != 0) goto L53
            java.lang.String r2 = r1.getScheme()     // Catch: java.net.URISyntaxException -> L97
            boolean r2 = r2.equals(r3)     // Catch: java.net.URISyntaxException -> L97
            if (r2 == 0) goto L63
        L53:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.net.URISyntaxException -> L97
            r2.<init>()     // Catch: java.net.URISyntaxException -> L97
            r2.append(r0)     // Catch: java.net.URISyntaxException -> L97
            java.lang.String r0 = r1.getScheme()     // Catch: java.net.URISyntaxException -> L97
            r2.append(r0)     // Catch: java.net.URISyntaxException -> L97
            goto L20
        L63:
            int r2 = r1.getPort()     // Catch: java.net.URISyntaxException -> L97
            r3 = -1
            r4 = 1
            r5 = 0
            r6 = 2
            if (r2 == r3) goto L89
            java.lang.String r2 = "%s://%s:%s"
            r3 = 3
            java.lang.Object[] r3 = new java.lang.Object[r3]     // Catch: java.net.URISyntaxException -> L97
            r3[r5] = r0     // Catch: java.net.URISyntaxException -> L97
            java.lang.String r0 = r1.getHost()     // Catch: java.net.URISyntaxException -> L97
            r3[r4] = r0     // Catch: java.net.URISyntaxException -> L97
            int r0 = r1.getPort()     // Catch: java.net.URISyntaxException -> L97
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch: java.net.URISyntaxException -> L97
            r3[r6] = r0     // Catch: java.net.URISyntaxException -> L97
        L84:
            java.lang.String r7 = java.lang.String.format(r2, r3)     // Catch: java.net.URISyntaxException -> L97
            goto L96
        L89:
            java.lang.String r2 = "%s://%s"
            java.lang.Object[] r3 = new java.lang.Object[r6]     // Catch: java.net.URISyntaxException -> L97
            r3[r5] = r0     // Catch: java.net.URISyntaxException -> L97
            java.lang.String r0 = r1.getHost()     // Catch: java.net.URISyntaxException -> L97
            r3[r4] = r0     // Catch: java.net.URISyntaxException -> L97
            goto L84
        L96:
            return r7
        L97:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Unable to set "
            r1.append(r2)
            r1.append(r7)
            java.lang.String r7 = " as default origin header"
            r1.append(r7)
            java.lang.String r7 = r1.toString()
            r0.<init>(r7)
            throw r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.react.modules.websocket.WebSocketModule.getDefaultOrigin(java.lang.String):java.lang.String");
    }

    public void notifyWebSocketFailed(int i, String str) {
        WritableMap createMap = Arguments.createMap();
        createMap.putInt("id", i);
        createMap.putString("message", str);
        sendEvent("websocketFailed", createMap);
    }

    public void sendEvent(String str, WritableMap writableMap) {
        ((DeviceEventManagerModule.RCTDeviceEventEmitter) this.mReactContext.getJSModule(DeviceEventManagerModule.RCTDeviceEventEmitter.class)).emit(str, writableMap);
    }

    @ReactMethod
    public void close(int i, String str, int i2) {
        WebSocket webSocket = this.mWebSocketConnections.get(Integer.valueOf(i2));
        if (webSocket == null) {
            return;
        }
        try {
            webSocket.close(i, str);
            this.mWebSocketConnections.remove(Integer.valueOf(i2));
            this.mContentHandlers.remove(Integer.valueOf(i2));
        } catch (Exception e2) {
            C1700a.m6998a("ReactNative", "Could not close WebSocket connection for id " + i2, e2);
        }
    }

    @ReactMethod
    public void connect(String str, ReadableArray readableArray, ReadableMap readableMap, int i) {
        OkHttpClient build = new OkHttpClient.Builder().connectTimeout(10L, TimeUnit.SECONDS).writeTimeout(10L, TimeUnit.SECONDS).readTimeout(0L, TimeUnit.MINUTES).build();
        Request.Builder url = new Request.Builder().tag(Integer.valueOf(i)).url(str);
        String cookie = getCookie(str);
        if (cookie != null) {
            url.addHeader("Cookie", cookie);
        }
        if (readableMap != null && readableMap.hasKey("headers") && readableMap.getType("headers").equals(ReadableType.Map)) {
            ReadableMap map = readableMap.getMap("headers");
            ReadableMapKeySetIterator keySetIterator = map.keySetIterator();
            if (!map.hasKey("origin")) {
                url.addHeader("origin", getDefaultOrigin(str));
            }
            while (keySetIterator.hasNextKey()) {
                String nextKey = keySetIterator.nextKey();
                if (ReadableType.String.equals(map.getType(nextKey))) {
                    url.addHeader(nextKey, map.getString(nextKey));
                } else {
                    C1700a.m7015d("ReactNative", "Ignoring: requested " + nextKey + ", value not a string");
                }
            }
        } else {
            url.addHeader("origin", getDefaultOrigin(str));
        }
        if (readableArray != null && readableArray.size() > 0) {
            StringBuilder sb = new StringBuilder("");
            for (int i2 = 0; i2 < readableArray.size(); i2++) {
                String trim = readableArray.getString(i2).trim();
                if (!trim.isEmpty() && !trim.contains(",")) {
                    sb.append(trim);
                    sb.append(",");
                }
            }
            if (sb.length() > 0) {
                sb.replace(sb.length() - 1, sb.length(), "");
                url.addHeader("Sec-WebSocket-Protocol", sb.toString());
            }
        }
        build.newWebSocket(url.build(), new C1264a(this, i));
        build.dispatcher().executorService().shutdown();
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return NAME;
    }

    @ReactMethod
    public void ping(int i) {
        WebSocket webSocket = this.mWebSocketConnections.get(Integer.valueOf(i));
        if (webSocket != null) {
            try {
                webSocket.send(C2722j.f11399b);
                return;
            } catch (Exception e2) {
                notifyWebSocketFailed(i, e2.getMessage());
                return;
            }
        }
        WritableMap createMap = Arguments.createMap();
        createMap.putInt("id", i);
        createMap.putString("message", "client is null");
        sendEvent("websocketFailed", createMap);
        WritableMap createMap2 = Arguments.createMap();
        createMap2.putInt("id", i);
        createMap2.putInt("code", 0);
        createMap2.putString("reason", "client is null");
        sendEvent("websocketClosed", createMap2);
        this.mWebSocketConnections.remove(Integer.valueOf(i));
        this.mContentHandlers.remove(Integer.valueOf(i));
    }

    @ReactMethod
    public void send(String str, int i) {
        WebSocket webSocket = this.mWebSocketConnections.get(Integer.valueOf(i));
        if (webSocket != null) {
            try {
                webSocket.send(str);
                return;
            } catch (Exception e2) {
                notifyWebSocketFailed(i, e2.getMessage());
                return;
            }
        }
        WritableMap createMap = Arguments.createMap();
        createMap.putInt("id", i);
        createMap.putString("message", "client is null");
        sendEvent("websocketFailed", createMap);
        WritableMap createMap2 = Arguments.createMap();
        createMap2.putInt("id", i);
        createMap2.putInt("code", 0);
        createMap2.putString("reason", "client is null");
        sendEvent("websocketClosed", createMap2);
        this.mWebSocketConnections.remove(Integer.valueOf(i));
        this.mContentHandlers.remove(Integer.valueOf(i));
    }

    public void sendBinary(C2722j c2722j, int i) {
        WebSocket webSocket = this.mWebSocketConnections.get(Integer.valueOf(i));
        if (webSocket != null) {
            try {
                webSocket.send(c2722j);
                return;
            } catch (Exception e2) {
                notifyWebSocketFailed(i, e2.getMessage());
                return;
            }
        }
        WritableMap createMap = Arguments.createMap();
        createMap.putInt("id", i);
        createMap.putString("message", "client is null");
        sendEvent("websocketFailed", createMap);
        WritableMap createMap2 = Arguments.createMap();
        createMap2.putInt("id", i);
        createMap2.putInt("code", 0);
        createMap2.putString("reason", "client is null");
        sendEvent("websocketClosed", createMap2);
        this.mWebSocketConnections.remove(Integer.valueOf(i));
        this.mContentHandlers.remove(Integer.valueOf(i));
    }

    @ReactMethod
    public void sendBinary(String str, int i) {
        WebSocket webSocket = this.mWebSocketConnections.get(Integer.valueOf(i));
        if (webSocket != null) {
            try {
                webSocket.send(C2722j.m11721a(str));
                return;
            } catch (Exception e2) {
                notifyWebSocketFailed(i, e2.getMessage());
                return;
            }
        }
        WritableMap createMap = Arguments.createMap();
        createMap.putInt("id", i);
        createMap.putString("message", "client is null");
        sendEvent("websocketFailed", createMap);
        WritableMap createMap2 = Arguments.createMap();
        createMap2.putInt("id", i);
        createMap2.putInt("code", 0);
        createMap2.putString("reason", "client is null");
        sendEvent("websocketClosed", createMap2);
        this.mWebSocketConnections.remove(Integer.valueOf(i));
        this.mContentHandlers.remove(Integer.valueOf(i));
    }

    public void setContentHandler(int i, InterfaceC1263a interfaceC1263a) {
        if (interfaceC1263a != null) {
            this.mContentHandlers.put(Integer.valueOf(i), interfaceC1263a);
        } else {
            this.mContentHandlers.remove(Integer.valueOf(i));
        }
    }
}
