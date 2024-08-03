package p139d.p225c.p226a.p227a.p269m;

import android.net.Uri;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import p139d.p225c.p226a.p227a.p270n.C2628e;

/* renamed from: d.c.a.a.m.D */
/* loaded from: classes.dex */
public final class C2585D implements InterfaceC2597k {

    /* renamed from: a */
    private final InterfaceC2597k f10747a;

    /* renamed from: b */
    private long f10748b;

    /* renamed from: c */
    private Uri f10749c;

    /* renamed from: d */
    private Map<String, List<String>> f10750d;

    public C2585D(InterfaceC2597k interfaceC2597k) {
        C2628e.m11110a(interfaceC2597k);
        this.f10747a = interfaceC2597k;
        this.f10749c = Uri.EMPTY;
        this.f10750d = Collections.emptyMap();
    }

    @Override // p139d.p225c.p226a.p227a.p269m.InterfaceC2597k
    /* renamed from: a */
    public long mo9121a(C2600n c2600n) {
        this.f10749c = c2600n.f10782a;
        this.f10750d = Collections.emptyMap();
        long mo9121a = this.f10747a.mo9121a(c2600n);
        Uri uri = getUri();
        C2628e.m11110a(uri);
        this.f10749c = uri;
        this.f10750d = mo9122a();
        return mo9121a;
    }

    @Override // p139d.p225c.p226a.p227a.p269m.InterfaceC2597k
    /* renamed from: a */
    public Map<String, List<String>> mo9122a() {
        return this.f10747a.mo9122a();
    }

    @Override // p139d.p225c.p226a.p227a.p269m.InterfaceC2597k
    /* renamed from: a */
    public void mo10300a(InterfaceC2586E interfaceC2586E) {
        this.f10747a.mo10300a(interfaceC2586E);
    }

    /* renamed from: b */
    public long m10901b() {
        return this.f10748b;
    }

    /* renamed from: c */
    public Uri m10902c() {
        return this.f10749c;
    }

    @Override // p139d.p225c.p226a.p227a.p269m.InterfaceC2597k
    public void close() {
        this.f10747a.close();
    }

    /* renamed from: d */
    public Map<String, List<String>> m10903d() {
        return this.f10750d;
    }

    /* renamed from: e */
    public void m10904e() {
        this.f10748b = 0L;
    }

    @Override // p139d.p225c.p226a.p227a.p269m.InterfaceC2597k
    public Uri getUri() {
        return this.f10747a.getUri();
    }

    @Override // p139d.p225c.p226a.p227a.p269m.InterfaceC2597k
    public int read(byte[] bArr, int i, int i2) {
        int read = this.f10747a.read(bArr, i, i2);
        if (read != -1) {
            this.f10748b += read;
        }
        return read;
    }
}
