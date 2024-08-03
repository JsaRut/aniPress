package okhttp3.internal.huc;

import okhttp3.Request;
import p275e.C2719g;
import p275e.InterfaceC2720h;

/* loaded from: classes.dex */
final class BufferedRequestBody extends OutputStreamRequestBody {
    final C2719g buffer = new C2719g();
    long contentLength = -1;

    /* JADX INFO: Access modifiers changed from: package-private */
    public BufferedRequestBody(long j) {
        initOutputStream(this.buffer, j);
    }

    @Override // okhttp3.internal.huc.OutputStreamRequestBody, okhttp3.RequestBody
    public long contentLength() {
        return this.contentLength;
    }

    @Override // okhttp3.internal.huc.OutputStreamRequestBody
    public Request prepareToSendRequest(Request request) {
        if (request.header("Content-Length") != null) {
            return request;
        }
        outputStream().close();
        this.contentLength = this.buffer.size();
        return request.newBuilder().removeHeader("Transfer-Encoding").header("Content-Length", Long.toString(this.buffer.size())).build();
    }

    @Override // okhttp3.RequestBody
    public void writeTo(InterfaceC2720h interfaceC2720h) {
        this.buffer.m11675a(interfaceC2720h.mo11674a(), 0L, this.buffer.size());
    }
}
