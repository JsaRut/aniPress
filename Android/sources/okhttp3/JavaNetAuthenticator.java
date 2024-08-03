package okhttp3;

import java.net.Authenticator;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.PasswordAuthentication;
import java.net.Proxy;
import java.net.URL;
import java.util.List;
import okhttp3.internal.annotations.EverythingIsNonNull;

@EverythingIsNonNull
/* loaded from: classes.dex */
public final class JavaNetAuthenticator implements Authenticator {
    private InetAddress getConnectToInetAddress(Proxy proxy, HttpUrl httpUrl) {
        return (proxy == null || proxy.type() == Proxy.Type.DIRECT) ? InetAddress.getByName(httpUrl.host()) : ((InetSocketAddress) proxy.address()).getAddress();
    }

    @Override // okhttp3.Authenticator
    public Request authenticate(Route route, Response response) {
        String host;
        InetAddress connectToInetAddress;
        int port;
        String scheme;
        String realm;
        String scheme2;
        URL url;
        Authenticator.RequestorType requestorType;
        List<Challenge> challenges = response.challenges();
        Request request = response.request();
        HttpUrl url2 = request.url();
        boolean z = response.code() == 407;
        Proxy proxy = route.proxy();
        int size = challenges.size();
        for (int i = 0; i < size; i++) {
            Challenge challenge = challenges.get(i);
            if ("Basic".equalsIgnoreCase(challenge.scheme())) {
                if (z) {
                    InetSocketAddress inetSocketAddress = (InetSocketAddress) proxy.address();
                    host = inetSocketAddress.getHostName();
                    connectToInetAddress = getConnectToInetAddress(proxy, url2);
                    port = inetSocketAddress.getPort();
                    scheme = url2.scheme();
                    realm = challenge.realm();
                    scheme2 = challenge.scheme();
                    url = url2.url();
                    requestorType = Authenticator.RequestorType.PROXY;
                } else {
                    host = url2.host();
                    connectToInetAddress = getConnectToInetAddress(proxy, url2);
                    port = url2.port();
                    scheme = url2.scheme();
                    realm = challenge.realm();
                    scheme2 = challenge.scheme();
                    url = url2.url();
                    requestorType = Authenticator.RequestorType.SERVER;
                }
                PasswordAuthentication requestPasswordAuthentication = java.net.Authenticator.requestPasswordAuthentication(host, connectToInetAddress, port, scheme, realm, scheme2, url, requestorType);
                if (requestPasswordAuthentication != null) {
                    return request.newBuilder().header(z ? "Proxy-Authorization" : "Authorization", Credentials.basic(requestPasswordAuthentication.getUserName(), new String(requestPasswordAuthentication.getPassword()), challenge.charset())).build();
                }
            }
        }
        return null;
    }
}
