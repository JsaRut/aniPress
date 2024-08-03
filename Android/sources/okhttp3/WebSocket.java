package okhttp3;

import p275e.C2722j;

/* loaded from: classes.dex */
public interface WebSocket {

    /* loaded from: classes.dex */
    public interface Factory {
        WebSocket newWebSocket(Request request, WebSocketListener webSocketListener);
    }

    void cancel();

    boolean close(int i, String str);

    long queueSize();

    Request request();

    boolean send(C2722j c2722j);

    boolean send(String str);
}
