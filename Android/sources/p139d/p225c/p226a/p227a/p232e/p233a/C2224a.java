package p139d.p225c.p226a.p227a.p232e.p233a;

import android.net.Uri;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import okhttp3.CacheControl;
import okhttp3.Call;
import okhttp3.HttpUrl;
import okhttp3.MediaType;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import okhttp3.ResponseBody;
import p139d.p225c.p226a.p227a.C2674q;
import p139d.p225c.p226a.p227a.p269m.AbstractC2593g;
import p139d.p225c.p226a.p227a.p269m.C2598l;
import p139d.p225c.p226a.p227a.p269m.C2600n;
import p139d.p225c.p226a.p227a.p269m.InterfaceC2609w;
import p139d.p225c.p226a.p227a.p270n.C2622I;
import p139d.p225c.p226a.p227a.p270n.C2628e;
import p139d.p225c.p226a.p227a.p270n.InterfaceC2646w;

/* renamed from: d.c.a.a.e.a.a */
/* loaded from: classes.dex */
public class C2224a extends AbstractC2593g implements InterfaceC2609w {

    /* renamed from: e */
    private static final byte[] f8119e;

    /* renamed from: f */
    private final Call.Factory f8120f;

    /* renamed from: g */
    private final InterfaceC2609w.f f8121g;

    /* renamed from: h */
    private final String f8122h;

    /* renamed from: i */
    private final InterfaceC2646w<String> f8123i;

    /* renamed from: j */
    private final CacheControl f8124j;

    /* renamed from: k */
    private final InterfaceC2609w.f f8125k;

    /* renamed from: l */
    private C2600n f8126l;

    /* renamed from: m */
    private Response f8127m;

    /* renamed from: n */
    private InputStream f8128n;

    /* renamed from: o */
    private boolean f8129o;

    /* renamed from: p */
    private long f8130p;

    /* renamed from: q */
    private long f8131q;

    /* renamed from: r */
    private long f8132r;

    /* renamed from: s */
    private long f8133s;

    static {
        C2674q.m11418a("goog.exo.okhttp");
        f8119e = new byte[4096];
    }

    public C2224a(Call.Factory factory, String str, InterfaceC2646w<String> interfaceC2646w, CacheControl cacheControl, InterfaceC2609w.f fVar) {
        super(true);
        C2628e.m11110a(factory);
        this.f8120f = factory;
        this.f8122h = str;
        this.f8123i = interfaceC2646w;
        this.f8124j = cacheControl;
        this.f8125k = fVar;
        this.f8121g = new InterfaceC2609w.f();
    }

    /* renamed from: a */
    private int m9117a(byte[] bArr, int i, int i2) {
        if (i2 == 0) {
            return 0;
        }
        long j = this.f8131q;
        if (j != -1) {
            long j2 = j - this.f8133s;
            if (j2 == 0) {
                return -1;
            }
            i2 = (int) Math.min(i2, j2);
        }
        InputStream inputStream = this.f8128n;
        C2622I.m11050a(inputStream);
        int read = inputStream.read(bArr, i, i2);
        if (read == -1) {
            if (this.f8131q == -1) {
                return -1;
            }
            throw new EOFException();
        }
        this.f8133s += read;
        m10918a(read);
        return read;
    }

    /* renamed from: c */
    private void m9118c() {
        Response response = this.f8127m;
        if (response != null) {
            ResponseBody body = response.body();
            C2628e.m11110a(body);
            body.close();
            this.f8127m = null;
        }
        this.f8128n = null;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* renamed from: d */
    private Request m9119d(C2600n c2600n) {
        long j = c2600n.f10787f;
        long j2 = c2600n.f10788g;
        boolean m10930b = c2600n.m10930b(1);
        HttpUrl parse = HttpUrl.parse(c2600n.f10782a.toString());
        if (parse == null) {
            throw new InterfaceC2609w.c("Malformed URL", c2600n, 1);
        }
        Request.Builder url = new Request.Builder().url(parse);
        CacheControl cacheControl = this.f8124j;
        if (cacheControl != null) {
            url.cacheControl(cacheControl);
        }
        InterfaceC2609w.f fVar = this.f8125k;
        if (fVar != null) {
            for (Map.Entry<String, String> entry : fVar.m10953a().entrySet()) {
                url.header(entry.getKey(), entry.getValue());
            }
        }
        for (Map.Entry<String, String> entry2 : this.f8121g.m10953a().entrySet()) {
            url.header(entry2.getKey(), entry2.getValue());
        }
        if (j != 0 || j2 != -1) {
            String str = "bytes=" + j + "-";
            if (j2 != -1) {
                str = str + ((j + j2) - 1);
            }
            url.addHeader("Range", str);
        }
        String str2 = this.f8122h;
        if (str2 != null) {
            url.addHeader("User-Agent", str2);
        }
        if (!m10930b) {
            url.addHeader("Accept-Encoding", "identity");
        }
        byte[] bArr = c2600n.f10784c;
        RequestBody requestBody = null;
        if (bArr == null) {
            if (c2600n.f10783b == 2) {
                bArr = C2622I.f10921f;
            }
            url.method(c2600n.m10929a(), requestBody);
            return url.build();
        }
        requestBody = RequestBody.create((MediaType) null, bArr);
        url.method(c2600n.m10929a(), requestBody);
        return url.build();
    }

    /* renamed from: d */
    private void m9120d() {
        if (this.f8132r == this.f8130p) {
            return;
        }
        while (true) {
            long j = this.f8132r;
            long j2 = this.f8130p;
            if (j == j2) {
                return;
            }
            int min = (int) Math.min(j2 - j, f8119e.length);
            InputStream inputStream = this.f8128n;
            C2622I.m11050a(inputStream);
            int read = inputStream.read(f8119e, 0, min);
            if (Thread.currentThread().isInterrupted()) {
                throw new InterruptedIOException();
            }
            if (read == -1) {
                throw new EOFException();
            }
            this.f8132r += read;
            m10918a(read);
        }
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // p139d.p225c.p226a.p227a.p269m.InterfaceC2597k
    /* renamed from: a */
    public long mo9121a(C2600n c2600n) {
        this.f8126l = c2600n;
        long j = 0;
        this.f8133s = 0L;
        this.f8132r = 0L;
        m10920b(c2600n);
        try {
            this.f8127m = this.f8120f.newCall(m9119d(c2600n)).execute();
            Response response = this.f8127m;
            ResponseBody body = response.body();
            C2628e.m11110a(body);
            ResponseBody responseBody = body;
            this.f8128n = responseBody.byteStream();
            int code = response.code();
            if (!response.isSuccessful()) {
                Map<String, List<String>> multimap = response.headers().toMultimap();
                m9118c();
                InterfaceC2609w.e eVar = new InterfaceC2609w.e(code, response.message(), multimap, c2600n);
                if (code != 416) {
                    throw eVar;
                }
                eVar.initCause(new C2598l(0));
                throw eVar;
            }
            MediaType contentType = responseBody.contentType();
            String mediaType = contentType != null ? contentType.toString() : "";
            InterfaceC2646w<String> interfaceC2646w = this.f8123i;
            if (interfaceC2646w != null && !interfaceC2646w.evaluate(mediaType)) {
                m9118c();
                throw new InterfaceC2609w.d(mediaType, c2600n);
            }
            if (code == 200) {
                long j2 = c2600n.f10787f;
                if (j2 != 0) {
                    j = j2;
                }
            }
            this.f8130p = j;
            long j3 = c2600n.f10788g;
            if (j3 == -1) {
                long contentLength = responseBody.contentLength();
                j3 = contentLength != -1 ? contentLength - this.f8130p : -1L;
            }
            this.f8131q = j3;
            this.f8129o = true;
            m10921c(c2600n);
            return this.f8131q;
        } catch (IOException e2) {
            throw new InterfaceC2609w.c("Unable to connect to " + c2600n.f10782a, e2, c2600n, 1);
        }
    }

    @Override // p139d.p225c.p226a.p227a.p269m.AbstractC2593g, p139d.p225c.p226a.p227a.p269m.InterfaceC2597k
    /* renamed from: a */
    public Map<String, List<String>> mo9122a() {
        Response response = this.f8127m;
        return response == null ? Collections.emptyMap() : response.headers().toMultimap();
    }

    @Override // p139d.p225c.p226a.p227a.p269m.InterfaceC2597k
    public void close() {
        if (this.f8129o) {
            this.f8129o = false;
            m10919b();
            m9118c();
        }
    }

    @Override // p139d.p225c.p226a.p227a.p269m.InterfaceC2597k
    public Uri getUri() {
        Response response = this.f8127m;
        if (response == null) {
            return null;
        }
        return Uri.parse(response.request().url().toString());
    }

    @Override // p139d.p225c.p226a.p227a.p269m.InterfaceC2597k
    public int read(byte[] bArr, int i, int i2) {
        try {
            m9120d();
            return m9117a(bArr, i, i2);
        } catch (IOException e2) {
            C2600n c2600n = this.f8126l;
            C2628e.m11110a(c2600n);
            throw new InterfaceC2609w.c(e2, c2600n, 2);
        }
    }
}
