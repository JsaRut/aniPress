package p139d.p225c.p226a.p227a.p269m;

import android.net.Uri;
import android.util.Base64;
import java.net.URLDecoder;
import p139d.p225c.p226a.p227a.C2683z;
import p139d.p225c.p226a.p227a.p270n.C2622I;

/* renamed from: d.c.a.a.m.i */
/* loaded from: classes.dex */
public final class C2595i extends AbstractC2593g {

    /* renamed from: e */
    private C2600n f10772e;

    /* renamed from: f */
    private int f10773f;

    /* renamed from: g */
    private byte[] f10774g;

    public C2595i() {
        super(false);
    }

    @Override // p139d.p225c.p226a.p227a.p269m.InterfaceC2597k
    /* renamed from: a */
    public long mo9121a(C2600n c2600n) {
        m10920b(c2600n);
        this.f10772e = c2600n;
        Uri uri = c2600n.f10782a;
        String scheme = uri.getScheme();
        if (!"data".equals(scheme)) {
            throw new C2683z("Unsupported scheme: " + scheme);
        }
        String[] m11073a = C2622I.m11073a(uri.getSchemeSpecificPart(), ",");
        if (m11073a.length != 2) {
            throw new C2683z("Unexpected URI format: " + uri);
        }
        String str = m11073a[1];
        if (m11073a[0].contains(";base64")) {
            try {
                this.f10774g = Base64.decode(str, 0);
            } catch (IllegalArgumentException e2) {
                throw new C2683z("Error while parsing Base64 encoded string: " + str, e2);
            }
        } else {
            this.f10774g = C2622I.m11086c(URLDecoder.decode(str, "US-ASCII"));
        }
        m10921c(c2600n);
        return this.f10774g.length;
    }

    @Override // p139d.p225c.p226a.p227a.p269m.InterfaceC2597k
    public void close() {
        if (this.f10774g != null) {
            this.f10774g = null;
            m10919b();
        }
        this.f10772e = null;
    }

    @Override // p139d.p225c.p226a.p227a.p269m.InterfaceC2597k
    public Uri getUri() {
        C2600n c2600n = this.f10772e;
        if (c2600n != null) {
            return c2600n.f10782a;
        }
        return null;
    }

    @Override // p139d.p225c.p226a.p227a.p269m.InterfaceC2597k
    public int read(byte[] bArr, int i, int i2) {
        if (i2 == 0) {
            return 0;
        }
        int length = this.f10774g.length - this.f10773f;
        if (length == 0) {
            return -1;
        }
        int min = Math.min(i2, length);
        System.arraycopy(this.f10774g, this.f10773f, bArr, i, min);
        this.f10773f += min;
        m10918a(min);
        return min;
    }
}
