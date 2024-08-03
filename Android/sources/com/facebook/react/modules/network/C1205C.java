package com.facebook.react.modules.network;

import java.net.InetAddress;
import java.net.Socket;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;

/* renamed from: com.facebook.react.modules.network.C */
/* loaded from: classes.dex */
public class C1205C extends SSLSocketFactory {

    /* renamed from: a */
    private SSLSocketFactory f4605a;

    public C1205C() {
        SSLContext sSLContext = SSLContext.getInstance("TLS");
        sSLContext.init(null, null, null);
        this.f4605a = sSLContext.getSocketFactory();
    }

    /* renamed from: a */
    private Socket m5398a(Socket socket) {
        if (socket != null && (socket instanceof SSLSocket)) {
            ((SSLSocket) socket).setEnabledProtocols(new String[]{"TLSv1", "TLSv1.1", "TLSv1.2"});
        }
        return socket;
    }

    @Override // javax.net.SocketFactory
    public Socket createSocket(String str, int i) {
        Socket createSocket = this.f4605a.createSocket(str, i);
        m5398a(createSocket);
        return createSocket;
    }

    @Override // javax.net.SocketFactory
    public Socket createSocket(String str, int i, InetAddress inetAddress, int i2) {
        Socket createSocket = this.f4605a.createSocket(str, i, inetAddress, i2);
        m5398a(createSocket);
        return createSocket;
    }

    @Override // javax.net.SocketFactory
    public Socket createSocket(InetAddress inetAddress, int i) {
        Socket createSocket = this.f4605a.createSocket(inetAddress, i);
        m5398a(createSocket);
        return createSocket;
    }

    @Override // javax.net.SocketFactory
    public Socket createSocket(InetAddress inetAddress, int i, InetAddress inetAddress2, int i2) {
        Socket createSocket = this.f4605a.createSocket(inetAddress, i, inetAddress2, i2);
        m5398a(createSocket);
        return createSocket;
    }

    @Override // javax.net.ssl.SSLSocketFactory
    public Socket createSocket(Socket socket, String str, int i, boolean z) {
        Socket createSocket = this.f4605a.createSocket(socket, str, i, z);
        m5398a(createSocket);
        return createSocket;
    }

    @Override // javax.net.ssl.SSLSocketFactory
    public String[] getDefaultCipherSuites() {
        return this.f4605a.getDefaultCipherSuites();
    }

    @Override // javax.net.ssl.SSLSocketFactory
    public String[] getSupportedCipherSuites() {
        return this.f4605a.getSupportedCipherSuites();
    }
}
