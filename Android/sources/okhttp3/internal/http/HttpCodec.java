package okhttp3.internal.http;

import okhttp3.Request;
import okhttp3.Response;
import okhttp3.ResponseBody;
import p275e.InterfaceC2708C;

/* loaded from: classes.dex */
public interface HttpCodec {
    public static final int DISCARD_STREAM_TIMEOUT_MILLIS = 100;

    void cancel();

    InterfaceC2708C createRequestBody(Request request, long j);

    void finishRequest();

    void flushRequest();

    ResponseBody openResponseBody(Response response);

    Response.Builder readResponseHeaders(boolean z);

    void writeRequestHeaders(Request request);
}
