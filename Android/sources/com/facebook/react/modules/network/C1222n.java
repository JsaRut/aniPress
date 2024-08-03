package com.facebook.react.modules.network;

import android.util.Base64;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.modules.core.DeviceEventManagerModule;
import com.facebook.react.modules.network.NetworkingModule;
import java.io.IOException;
import java.util.List;
import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.MediaType;
import okhttp3.Response;
import okhttp3.ResponseBody;
import p275e.C2726n;
import p275e.C2732t;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.facebook.react.modules.network.n */
/* loaded from: classes.dex */
public class C1222n implements Callback {

    /* renamed from: a */
    final /* synthetic */ int f4632a;

    /* renamed from: b */
    final /* synthetic */ DeviceEventManagerModule.RCTDeviceEventEmitter f4633b;

    /* renamed from: c */
    final /* synthetic */ String f4634c;

    /* renamed from: d */
    final /* synthetic */ boolean f4635d;

    /* renamed from: e */
    final /* synthetic */ NetworkingModule f4636e;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C1222n(NetworkingModule networkingModule, int i, DeviceEventManagerModule.RCTDeviceEventEmitter rCTDeviceEventEmitter, String str, boolean z) {
        this.f4636e = networkingModule;
        this.f4632a = i;
        this.f4633b = rCTDeviceEventEmitter;
        this.f4634c = str;
        this.f4635d = z;
    }

    @Override // okhttp3.Callback
    public void onFailure(Call call, IOException iOException) {
        boolean z;
        String str;
        z = this.f4636e.mShuttingDown;
        if (z) {
            return;
        }
        this.f4636e.removeRequest(this.f4632a);
        if (iOException.getMessage() != null) {
            str = iOException.getMessage();
        } else {
            str = "Error while executing request: " + iOException.getClass().getSimpleName();
        }
        C1204B.m5396a(this.f4633b, this.f4632a, str, iOException);
    }

    @Override // okhttp3.Callback
    public void onResponse(Call call, Response response) {
        boolean z;
        WritableMap translateHeaders;
        List<NetworkingModule.InterfaceC1207b> list;
        z = this.f4636e.mShuttingDown;
        if (z) {
            return;
        }
        this.f4636e.removeRequest(this.f4632a);
        DeviceEventManagerModule.RCTDeviceEventEmitter rCTDeviceEventEmitter = this.f4633b;
        int i = this.f4632a;
        int code = response.code();
        translateHeaders = NetworkingModule.translateHeaders(response.headers());
        C1204B.m5391a(rCTDeviceEventEmitter, i, code, translateHeaders, response.request().url().toString());
        try {
            ResponseBody body = response.body();
            if ("gzip".equalsIgnoreCase(response.header("Content-Encoding")) && body != null) {
                C2726n c2726n = new C2726n(body.source());
                String header = response.header("Content-Type");
                body = ResponseBody.create(header != null ? MediaType.parse(header) : null, -1L, C2732t.m11745a(c2726n));
            }
            list = this.f4636e.mResponseHandlers;
            for (NetworkingModule.InterfaceC1207b interfaceC1207b : list) {
                if (interfaceC1207b.mo5259a(this.f4634c)) {
                    C1204B.m5393a(this.f4633b, this.f4632a, interfaceC1207b.mo5258a(body));
                    C1204B.m5390a(this.f4633b, this.f4632a);
                    return;
                }
            }
            if (this.f4635d && this.f4634c.equals("text")) {
                this.f4636e.readWithProgress(this.f4633b, this.f4632a, body);
                C1204B.m5390a(this.f4633b, this.f4632a);
                return;
            }
            String str = "";
            if (this.f4634c.equals("text")) {
                try {
                    str = body.string();
                } catch (IOException e2) {
                    if (!response.request().method().equalsIgnoreCase("HEAD")) {
                        C1204B.m5396a(this.f4633b, this.f4632a, e2.getMessage(), e2);
                    }
                }
            } else if (this.f4634c.equals("base64")) {
                str = Base64.encodeToString(body.bytes(), 2);
            }
            C1204B.m5394a(this.f4633b, this.f4632a, str);
            C1204B.m5390a(this.f4633b, this.f4632a);
        } catch (IOException e3) {
            C1204B.m5396a(this.f4633b, this.f4632a, e3.getMessage(), e3);
        }
    }
}
