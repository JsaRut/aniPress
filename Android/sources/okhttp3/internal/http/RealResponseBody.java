package okhttp3.internal.http;

import okhttp3.MediaType;
import okhttp3.ResponseBody;
import p275e.InterfaceC2721i;

/* loaded from: classes.dex */
public final class RealResponseBody extends ResponseBody {
    private final long contentLength;
    private final String contentTypeString;
    private final InterfaceC2721i source;

    public RealResponseBody(String str, long j, InterfaceC2721i interfaceC2721i) {
        this.contentTypeString = str;
        this.contentLength = j;
        this.source = interfaceC2721i;
    }

    @Override // okhttp3.ResponseBody
    public long contentLength() {
        return this.contentLength;
    }

    @Override // okhttp3.ResponseBody
    public MediaType contentType() {
        String str = this.contentTypeString;
        if (str != null) {
            return MediaType.parse(str);
        }
        return null;
    }

    @Override // okhttp3.ResponseBody
    public InterfaceC2721i source() {
        return this.source;
    }
}
