package com.facebook.react.modules.websocket;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.modules.websocket.WebSocketModule;
import java.util.Map;
import okhttp3.Response;
import okhttp3.WebSocket;
import okhttp3.WebSocketListener;
import p275e.C2722j;

/* renamed from: com.facebook.react.modules.websocket.a */
/* loaded from: classes.dex */
class C1264a extends WebSocketListener {

    /* renamed from: a */
    final /* synthetic */ int f4730a;

    /* renamed from: b */
    final /* synthetic */ WebSocketModule f4731b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C1264a(WebSocketModule webSocketModule, int i) {
        this.f4731b = webSocketModule;
        this.f4730a = i;
    }

    @Override // okhttp3.WebSocketListener
    public void onClosed(WebSocket webSocket, int i, String str) {
        WritableMap createMap = Arguments.createMap();
        createMap.putInt("id", this.f4730a);
        createMap.putInt("code", i);
        createMap.putString("reason", str);
        this.f4731b.sendEvent("websocketClosed", createMap);
    }

    @Override // okhttp3.WebSocketListener
    public void onClosing(WebSocket webSocket, int i, String str) {
        webSocket.close(i, str);
    }

    @Override // okhttp3.WebSocketListener
    public void onFailure(WebSocket webSocket, Throwable th, Response response) {
        this.f4731b.notifyWebSocketFailed(this.f4730a, th.getMessage());
    }

    @Override // okhttp3.WebSocketListener
    public void onMessage(WebSocket webSocket, C2722j c2722j) {
        Map map;
        WritableMap createMap = Arguments.createMap();
        createMap.putInt("id", this.f4730a);
        createMap.putString("type", "binary");
        map = this.f4731b.mContentHandlers;
        WebSocketModule.InterfaceC1263a interfaceC1263a = (WebSocketModule.InterfaceC1263a) map.get(Integer.valueOf(this.f4730a));
        if (interfaceC1263a != null) {
            interfaceC1263a.mo5252a(c2722j, createMap);
        } else {
            createMap.putString("data", c2722j.mo11649b());
        }
        this.f4731b.sendEvent("websocketMessage", createMap);
    }

    @Override // okhttp3.WebSocketListener
    public void onMessage(WebSocket webSocket, String str) {
        Map map;
        WritableMap createMap = Arguments.createMap();
        createMap.putInt("id", this.f4730a);
        createMap.putString("type", "text");
        map = this.f4731b.mContentHandlers;
        WebSocketModule.InterfaceC1263a interfaceC1263a = (WebSocketModule.InterfaceC1263a) map.get(Integer.valueOf(this.f4730a));
        if (interfaceC1263a != null) {
            interfaceC1263a.mo5253a(str, createMap);
        } else {
            createMap.putString("data", str);
        }
        this.f4731b.sendEvent("websocketMessage", createMap);
    }

    @Override // okhttp3.WebSocketListener
    public void onOpen(WebSocket webSocket, Response response) {
        Map map;
        map = this.f4731b.mWebSocketConnections;
        map.put(Integer.valueOf(this.f4730a), webSocket);
        WritableMap createMap = Arguments.createMap();
        createMap.putInt("id", this.f4730a);
        this.f4731b.sendEvent("websocketOpen", createMap);
    }
}
