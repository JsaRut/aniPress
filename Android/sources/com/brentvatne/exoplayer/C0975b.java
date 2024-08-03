package com.brentvatne.exoplayer;

import android.content.Context;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.modules.network.C1217i;
import com.facebook.react.modules.network.C1226r;
import com.facebook.react.modules.network.InterfaceC1209a;
import java.util.Map;
import okhttp3.JavaNetCookieJar;
import okhttp3.OkHttpClient;
import p139d.p225c.p226a.p227a.p232e.p233a.C2225b;
import p139d.p225c.p226a.p227a.p269m.C2603q;
import p139d.p225c.p226a.p227a.p269m.C2605s;
import p139d.p225c.p226a.p227a.p269m.InterfaceC2597k;
import p139d.p225c.p226a.p227a.p269m.InterfaceC2609w;
import p139d.p225c.p226a.p227a.p270n.C2622I;

/* renamed from: com.brentvatne.exoplayer.b */
/* loaded from: classes.dex */
public class C0975b {

    /* renamed from: a */
    private static InterfaceC2597k.a f4047a;

    /* renamed from: b */
    private static String f4048b;

    /* renamed from: a */
    public static InterfaceC2597k.a m4830a(ReactContext reactContext, C2603q c2603q, Map<String, String> map) {
        if (f4047a == null || (map != null && !map.isEmpty())) {
            f4047a = m4832b(reactContext, c2603q, map);
        }
        return f4047a;
    }

    /* renamed from: a */
    public static String m4831a(ReactContext reactContext) {
        if (f4048b == null) {
            f4048b = C2622I.m11052a((Context) reactContext, "ReactNativeVideo");
        }
        return f4048b;
    }

    /* renamed from: b */
    private static InterfaceC2597k.a m4832b(ReactContext reactContext, C2603q c2603q, Map<String, String> map) {
        return new C2605s(reactContext, c2603q, m4833c(reactContext, c2603q, map));
    }

    /* renamed from: c */
    private static InterfaceC2609w.b m4833c(ReactContext reactContext, C2603q c2603q, Map<String, String> map) {
        OkHttpClient m5432c = C1226r.m5432c();
        ((InterfaceC1209a) m5432c.cookieJar()).mo5400a(new JavaNetCookieJar(new C1217i(reactContext)));
        C2225b c2225b = new C2225b(m5432c, m4831a(reactContext), c2603q);
        if (map != null) {
            c2225b.m10952b().m10954a(map);
        }
        return c2225b;
    }
}
