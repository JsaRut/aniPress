package p139d.p143b.p184i.p187b.p188a;

import android.os.SystemClock;
import java.io.IOException;
import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.Response;
import okhttp3.ResponseBody;
import p139d.p143b.p184i.p187b.p188a.C1836e;
import p139d.p143b.p184i.p191e.C1877a;
import p139d.p143b.p184i.p200n.InterfaceC1976da;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: d.b.i.b.a.d */
/* loaded from: classes.dex */
public class C1835d implements Callback {

    /* renamed from: a */
    final /* synthetic */ C1836e.a f6761a;

    /* renamed from: b */
    final /* synthetic */ InterfaceC1976da.a f6762b;

    /* renamed from: c */
    final /* synthetic */ C1836e f6763c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C1835d(C1836e c1836e, C1836e.a aVar, InterfaceC1976da.a aVar2) {
        this.f6763c = c1836e;
        this.f6761a = aVar;
        this.f6762b = aVar2;
    }

    @Override // okhttp3.Callback
    public void onFailure(Call call, IOException iOException) {
        this.f6763c.m7537a(call, iOException, this.f6762b);
    }

    @Override // okhttp3.Callback
    public void onResponse(Call call, Response response) {
        this.f6761a.f6767g = SystemClock.elapsedRealtime();
        ResponseBody body = response.body();
        try {
            try {
            } catch (Exception e2) {
                this.f6763c.m7537a(call, e2, this.f6762b);
            }
            if (!response.isSuccessful()) {
                this.f6763c.m7537a(call, new IOException("Unexpected HTTP code " + response), this.f6762b);
                return;
            }
            C1877a m7644a = C1877a.m7644a(response.header("Content-Range"));
            if (m7644a != null && (m7644a.f6844b != 0 || m7644a.f6845c != Integer.MAX_VALUE)) {
                this.f6761a.m7955a(m7644a);
                this.f6761a.m7953a(8);
            }
            long contentLength = body.contentLength();
            if (contentLength < 0) {
                contentLength = 0;
            }
            this.f6762b.mo8074a(body.byteStream(), (int) contentLength);
        } finally {
            body.close();
        }
    }
}
