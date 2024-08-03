package p139d.p143b.p184i.p187b.p188a;

import android.os.SystemClock;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executor;
import okhttp3.CacheControl;
import okhttp3.Call;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import p139d.p143b.p184i.p191e.C1877a;
import p139d.p143b.p184i.p196j.C1920d;
import p139d.p143b.p184i.p200n.AbstractC1975d;
import p139d.p143b.p184i.p200n.C1935B;
import p139d.p143b.p184i.p200n.InterfaceC1976da;
import p139d.p143b.p184i.p200n.InterfaceC1995n;
import p139d.p143b.p184i.p200n.InterfaceC1998oa;

/* renamed from: d.b.i.b.a.e */
/* loaded from: classes.dex */
public class C1836e extends AbstractC1975d<a> {

    /* renamed from: a */
    private final Call.Factory f6764a;

    /* renamed from: b */
    private Executor f6765b;

    /* renamed from: d.b.i.b.a.e$a */
    /* loaded from: classes.dex */
    public static class a extends C1935B {

        /* renamed from: f */
        public long f6766f;

        /* renamed from: g */
        public long f6767g;

        /* renamed from: h */
        public long f6768h;

        public a(InterfaceC1995n<C1920d> interfaceC1995n, InterfaceC1998oa interfaceC1998oa) {
            super(interfaceC1995n, interfaceC1998oa);
        }
    }

    public C1836e(Call.Factory factory, Executor executor) {
        this.f6764a = factory;
        this.f6765b = executor;
    }

    public C1836e(OkHttpClient okHttpClient) {
        this(okHttpClient, okHttpClient.dispatcher().executorService());
    }

    /* renamed from: a */
    public void m7537a(Call call, Exception exc, InterfaceC1976da.a aVar) {
        if (call.isCanceled()) {
            aVar.mo8073a();
        } else {
            aVar.mo8075a(exc);
        }
    }

    @Override // p139d.p143b.p184i.p200n.InterfaceC1976da
    /* renamed from: a */
    public a mo7538a(InterfaceC1995n<C1920d> interfaceC1995n, InterfaceC1998oa interfaceC1998oa) {
        return new a(interfaceC1995n, interfaceC1998oa);
    }

    @Override // p139d.p143b.p184i.p200n.InterfaceC1976da
    /* renamed from: a */
    public /* bridge */ /* synthetic */ C1935B mo7538a(InterfaceC1995n interfaceC1995n, InterfaceC1998oa interfaceC1998oa) {
        return mo7538a((InterfaceC1995n<C1920d>) interfaceC1995n, interfaceC1998oa);
    }

    @Override // p139d.p143b.p184i.p200n.AbstractC1975d, p139d.p143b.p184i.p200n.InterfaceC1976da
    /* renamed from: a */
    public Map<String, String> mo7542b(a aVar, int i) {
        HashMap hashMap = new HashMap(4);
        hashMap.put("queue_time", Long.toString(aVar.f6767g - aVar.f6766f));
        hashMap.put("fetch_time", Long.toString(aVar.f6768h - aVar.f6767g));
        hashMap.put("total_time", Long.toString(aVar.f6768h - aVar.f6766f));
        hashMap.put("image_size", Integer.toString(i));
        return hashMap;
    }

    @Override // p139d.p143b.p184i.p200n.InterfaceC1976da
    /* renamed from: a */
    public void mo5335a(a aVar, InterfaceC1976da.a aVar2) {
        aVar.f6766f = SystemClock.elapsedRealtime();
        try {
            Request.Builder builder = new Request.Builder().cacheControl(new CacheControl.Builder().noStore().build()).url(aVar.m7962h().toString()).get();
            C1877a m8235a = aVar.m7956b().mo8109c().m8235a();
            if (m8235a != null) {
                builder.addHeader("Range", m8235a.m7647a());
            }
            m7540a(aVar, aVar2, builder.build());
        } catch (Exception e2) {
            aVar2.mo8075a(e2);
        }
    }

    /* renamed from: a */
    public void m7540a(a aVar, InterfaceC1976da.a aVar2, Request request) {
        Call newCall = this.f6764a.newCall(request);
        aVar.m7956b().mo8106a(new C1834c(this, newCall));
        newCall.enqueue(new C1835d(this, aVar, aVar2));
    }

    @Override // p139d.p143b.p184i.p200n.AbstractC1975d, p139d.p143b.p184i.p200n.InterfaceC1976da
    /* renamed from: b */
    public void mo7541a(a aVar, int i) {
        aVar.f6768h = SystemClock.elapsedRealtime();
    }
}
