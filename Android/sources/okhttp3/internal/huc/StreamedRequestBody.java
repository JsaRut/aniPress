package okhttp3.internal.huc;

import okhttp3.internal.http.UnrepeatableRequestBody;
import p275e.C2719g;
import p275e.C2732t;
import p275e.C2733u;
import p275e.InterfaceC2720h;

/* loaded from: classes.dex */
final class StreamedRequestBody extends OutputStreamRequestBody implements UnrepeatableRequestBody {
    private final C2733u pipe = new C2733u(8192);

    /* JADX INFO: Access modifiers changed from: package-private */
    public StreamedRequestBody(long j) {
        initOutputStream(C2732t.m11744a(this.pipe.m11751a()), j);
    }

    @Override // okhttp3.RequestBody
    public void writeTo(InterfaceC2720h interfaceC2720h) {
        C2719g c2719g = new C2719g();
        while (this.pipe.m11752b().read(c2719g, 8192L) != -1) {
            interfaceC2720h.write(c2719g, c2719g.size());
        }
    }
}
