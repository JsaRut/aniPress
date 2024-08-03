package com.facebook.react.modules.fresco;

import android.net.Uri;
import android.os.SystemClock;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableMapKeySetIterator;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executor;
import okhttp3.CacheControl;
import okhttp3.Headers;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import p139d.p143b.p184i.p187b.p188a.C1836e;
import p139d.p143b.p184i.p200n.InterfaceC1976da;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.facebook.react.modules.fresco.b */
/* loaded from: classes.dex */
public class C1188b extends C1836e {

    /* renamed from: c */
    private final OkHttpClient f4568c;

    /* renamed from: d */
    private final Executor f4569d;

    public C1188b(OkHttpClient okHttpClient) {
        super(okHttpClient);
        this.f4568c = okHttpClient;
        this.f4569d = okHttpClient.dispatcher().executorService();
    }

    /* renamed from: a */
    private Map<String, String> m5333a(ReadableMap readableMap) {
        if (readableMap == null) {
            return null;
        }
        ReadableMapKeySetIterator keySetIterator = readableMap.keySetIterator();
        HashMap hashMap = new HashMap();
        while (keySetIterator.hasNextKey()) {
            String nextKey = keySetIterator.nextKey();
            hashMap.put(nextKey, readableMap.getString(nextKey));
        }
        return hashMap;
    }

    @Override // p139d.p143b.p184i.p187b.p188a.C1836e, p139d.p143b.p184i.p200n.InterfaceC1976da
    /* renamed from: a */
    public void mo5335a(C1836e.a aVar, InterfaceC1976da.a aVar2) {
        aVar.f6766f = SystemClock.elapsedRealtime();
        Uri m7962h = aVar.m7962h();
        Map<String, String> m5333a = aVar.m7956b().mo8109c() instanceof C1187a ? m5333a(((C1187a) aVar.m7956b().mo8109c()).m5332s()) : null;
        if (m5333a == null) {
            m5333a = Collections.emptyMap();
        }
        m7540a(aVar, aVar2, new Request.Builder().cacheControl(new CacheControl.Builder().noStore().build()).url(m7962h.toString()).headers(Headers.m11767of(m5333a)).get().build());
    }
}
