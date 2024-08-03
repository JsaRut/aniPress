package p139d.p143b.p184i.p200n;

import android.net.Uri;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.util.Locale;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import p139d.p143b.p148c.p159k.C1728f;
import p139d.p143b.p184i.p196j.C1920d;
import p139d.p143b.p184i.p200n.InterfaceC1976da;

/* renamed from: d.b.i.n.E */
/* loaded from: classes.dex */
public class C1941E extends AbstractC1975d<C1935B> {

    /* renamed from: a */
    private int f7119a;

    /* renamed from: b */
    private final ExecutorService f7120b;

    public C1941E(int i) {
        this(Executors.newFixedThreadPool(3));
        this.f7119a = i;
    }

    C1941E(ExecutorService executorService) {
        this.f7120b = executorService;
    }

    /* renamed from: a */
    private static String m7967a(String str, Object... objArr) {
        return String.format(Locale.getDefault(), str, objArr);
    }

    /* renamed from: a */
    static HttpURLConnection m7968a(Uri uri) {
        return (HttpURLConnection) C1728f.m7091k(uri).openConnection();
    }

    /* renamed from: a */
    private HttpURLConnection m7969a(Uri uri, int i) {
        Object[] objArr;
        String str;
        HttpURLConnection m7968a = m7968a(uri);
        m7968a.setConnectTimeout(this.f7119a);
        int responseCode = m7968a.getResponseCode();
        if (m7971b(responseCode)) {
            return m7968a;
        }
        if (!m7970a(responseCode)) {
            m7968a.disconnect();
            throw new IOException(String.format("Image URL %s returned HTTP code %d", uri.toString(), Integer.valueOf(responseCode)));
        }
        String headerField = m7968a.getHeaderField("Location");
        m7968a.disconnect();
        Uri parse = headerField == null ? null : Uri.parse(headerField);
        String scheme = uri.getScheme();
        if (i > 0 && parse != null && !parse.getScheme().equals(scheme)) {
            return m7969a(parse, i - 1);
        }
        if (i == 0) {
            objArr = new Object[]{uri.toString()};
            str = "URL %s follows too many redirects";
        } else {
            objArr = new Object[]{uri.toString(), Integer.valueOf(responseCode)};
            str = "URL %s returned %d without a valid redirect";
        }
        throw new IOException(m7967a(str, objArr));
    }

    /* renamed from: a */
    private static boolean m7970a(int i) {
        if (i == 307 || i == 308) {
            return true;
        }
        switch (i) {
            case 300:
            case 301:
            case 302:
            case 303:
                return true;
            default:
                return false;
        }
    }

    /* renamed from: b */
    private static boolean m7971b(int i) {
        return i >= 200 && i < 300;
    }

    @Override // p139d.p143b.p184i.p200n.InterfaceC1976da
    /* renamed from: a */
    public C1935B mo7538a(InterfaceC1995n<C1920d> interfaceC1995n, InterfaceC1998oa interfaceC1998oa) {
        return new C1935B(interfaceC1995n, interfaceC1998oa);
    }

    @Override // p139d.p143b.p184i.p200n.InterfaceC1976da
    /* renamed from: a */
    public void mo5335a(C1935B c1935b, InterfaceC1976da.a aVar) {
        c1935b.m7956b().mo8106a(new C1939D(this, this.f7120b.submit(new RunnableC1937C(this, c1935b, aVar)), aVar));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:33:? A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0039 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void m7972b(p139d.p143b.p184i.p200n.C1935B r3, p139d.p143b.p184i.p200n.InterfaceC1976da.a r4) {
        /*
            r2 = this;
            r0 = 0
            android.net.Uri r3 = r3.m7962h()     // Catch: java.lang.Throwable -> L21 java.io.IOException -> L24
            r1 = 5
            java.net.HttpURLConnection r3 = r2.m7969a(r3, r1)     // Catch: java.lang.Throwable -> L21 java.io.IOException -> L24
            if (r3 == 0) goto L17
            java.io.InputStream r0 = r3.getInputStream()     // Catch: java.io.IOException -> L15 java.lang.Throwable -> L36
            r1 = -1
            r4.mo8074a(r0, r1)     // Catch: java.io.IOException -> L15 java.lang.Throwable -> L36
            goto L17
        L15:
            r1 = move-exception
            goto L26
        L17:
            if (r0 == 0) goto L1e
            r0.close()     // Catch: java.io.IOException -> L1d
            goto L1e
        L1d:
        L1e:
            if (r3 == 0) goto L35
            goto L32
        L21:
            r4 = move-exception
            r3 = r0
            goto L37
        L24:
            r1 = move-exception
            r3 = r0
        L26:
            r4.mo8075a(r1)     // Catch: java.lang.Throwable -> L36
            if (r0 == 0) goto L30
            r0.close()     // Catch: java.io.IOException -> L2f
            goto L30
        L2f:
        L30:
            if (r3 == 0) goto L35
        L32:
            r3.disconnect()
        L35:
            return
        L36:
            r4 = move-exception
        L37:
            if (r0 == 0) goto L3e
            r0.close()     // Catch: java.io.IOException -> L3d
            goto L3e
        L3d:
        L3e:
            if (r3 == 0) goto L43
            r3.disconnect()
        L43:
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: p139d.p143b.p184i.p200n.C1941E.m7972b(d.b.i.n.B, d.b.i.n.da$a):void");
    }
}
