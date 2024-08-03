package com.facebook.react.modules.network;

import android.content.Context;
import android.os.Build;
import java.io.File;
import java.security.Provider;
import java.security.Security;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;
import okhttp3.Cache;
import okhttp3.ConnectionSpec;
import okhttp3.OkHttpClient;
import okhttp3.TlsVersion;
import p139d.p143b.p148c.p153e.C1700a;

/* renamed from: com.facebook.react.modules.network.r */
/* loaded from: classes.dex */
public class C1226r {

    /* renamed from: a */
    private static OkHttpClient f4643a;

    /* renamed from: b */
    private static InterfaceC1225q f4644b;

    /* renamed from: a */
    public static OkHttpClient.Builder m5426a(Context context, int i) {
        OkHttpClient.Builder m5430b = m5430b();
        return i == 0 ? m5430b : m5430b.cache(new Cache(new File(context.getCacheDir(), "http-cache"), i));
    }

    /* renamed from: a */
    public static OkHttpClient.Builder m5427a(OkHttpClient.Builder builder) {
        if (Build.VERSION.SDK_INT <= 19) {
            try {
                builder.sslSocketFactory(new C1205C());
                ConnectionSpec build = new ConnectionSpec.Builder(ConnectionSpec.MODERN_TLS).tlsVersions(TlsVersion.TLS_1_2).build();
                ArrayList arrayList = new ArrayList();
                arrayList.add(build);
                arrayList.add(ConnectionSpec.COMPATIBLE_TLS);
                arrayList.add(ConnectionSpec.CLEARTEXT);
                builder.connectionSpecs(arrayList);
            } catch (Exception e2) {
                C1700a.m6998a("OkHttpClientProvider", "Error while enabling TLS 1.2", e2);
            }
        }
        return builder;
    }

    /* renamed from: a */
    public static OkHttpClient m5428a() {
        InterfaceC1225q interfaceC1225q = f4644b;
        return interfaceC1225q != null ? interfaceC1225q.m5425a() : m5430b().build();
    }

    /* renamed from: a */
    public static OkHttpClient m5429a(Context context) {
        InterfaceC1225q interfaceC1225q = f4644b;
        return interfaceC1225q != null ? interfaceC1225q.m5425a() : m5431b(context).build();
    }

    /* renamed from: b */
    public static OkHttpClient.Builder m5430b() {
        OkHttpClient.Builder cookieJar = new OkHttpClient.Builder().connectTimeout(0L, TimeUnit.MILLISECONDS).readTimeout(0L, TimeUnit.MILLISECONDS).writeTimeout(0L, TimeUnit.MILLISECONDS).cookieJar(new C1233y());
        try {
            Security.insertProviderAt((Provider) Class.forName("org.conscrypt.OpenSSLProvider").newInstance(), 1);
            return cookieJar;
        } catch (Exception unused) {
            m5427a(cookieJar);
            return cookieJar;
        }
    }

    /* renamed from: b */
    public static OkHttpClient.Builder m5431b(Context context) {
        return m5426a(context, 10485760);
    }

    /* renamed from: c */
    public static OkHttpClient m5432c() {
        if (f4643a == null) {
            f4643a = m5428a();
        }
        return f4643a;
    }
}
