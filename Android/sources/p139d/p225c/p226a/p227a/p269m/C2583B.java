package p139d.p225c.p226a.p227a.p269m;

import android.net.Uri;
import java.io.Closeable;
import java.io.InputStream;
import java.util.List;
import java.util.Map;
import p139d.p225c.p226a.p227a.p269m.C2612z;
import p139d.p225c.p226a.p227a.p270n.C2622I;
import p139d.p225c.p226a.p227a.p270n.C2628e;

/* renamed from: d.c.a.a.m.B */
/* loaded from: classes.dex */
public final class C2583B<T> implements C2612z.d {

    /* renamed from: a */
    public final C2600n f10736a;

    /* renamed from: b */
    public final int f10737b;

    /* renamed from: c */
    private final C2585D f10738c;

    /* renamed from: d */
    private final a<? extends T> f10739d;

    /* renamed from: e */
    private volatile T f10740e;

    /* renamed from: d.c.a.a.m.B$a */
    /* loaded from: classes.dex */
    public interface a<T> {
        /* renamed from: a */
        T mo10065a(Uri uri, InputStream inputStream);
    }

    public C2583B(InterfaceC2597k interfaceC2597k, Uri uri, int i, a<? extends T> aVar) {
        this(interfaceC2597k, new C2600n(uri, 3), i, aVar);
    }

    public C2583B(InterfaceC2597k interfaceC2597k, C2600n c2600n, int i, a<? extends T> aVar) {
        this.f10738c = new C2585D(interfaceC2597k);
        this.f10736a = c2600n;
        this.f10737b = i;
        this.f10739d = aVar;
    }

    @Override // p139d.p225c.p226a.p227a.p269m.C2612z.d
    /* renamed from: a */
    public final void mo9973a() {
        this.f10738c.m10904e();
        C2599m c2599m = new C2599m(this.f10738c, this.f10736a);
        try {
            c2599m.m10925m();
            Uri uri = this.f10738c.getUri();
            C2628e.m11110a(uri);
            this.f10740e = this.f10739d.mo10065a(uri, c2599m);
        } finally {
            C2622I.m11061a((Closeable) c2599m);
        }
    }

    @Override // p139d.p225c.p226a.p227a.p269m.C2612z.d
    /* renamed from: b */
    public final void mo9974b() {
    }

    /* renamed from: c */
    public long m10896c() {
        return this.f10738c.m10901b();
    }

    /* renamed from: d */
    public Map<String, List<String>> m10897d() {
        return this.f10738c.m10903d();
    }

    /* renamed from: e */
    public final T m10898e() {
        return this.f10740e;
    }

    /* renamed from: f */
    public Uri m10899f() {
        return this.f10738c.m10902c();
    }
}
