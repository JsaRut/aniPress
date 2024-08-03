package p139d.p225c.p226a.p227a.p250j;

import android.net.Uri;
import android.os.Handler;
import java.io.IOException;
import p139d.p225c.p226a.p227a.InterfaceC2517k;
import p139d.p225c.p226a.p227a.p234f.InterfaceC2330j;
import p139d.p225c.p226a.p227a.p250j.C2512v;
import p139d.p225c.p226a.p227a.p250j.InterfaceC2515y;
import p139d.p225c.p226a.p227a.p250j.InterfaceC2516z;
import p139d.p225c.p226a.p227a.p269m.C2606t;
import p139d.p225c.p226a.p227a.p269m.InterfaceC2586E;
import p139d.p225c.p226a.p227a.p269m.InterfaceC2590d;
import p139d.p225c.p226a.p227a.p269m.InterfaceC2597k;
import p139d.p225c.p226a.p227a.p269m.InterfaceC2610x;
import p139d.p225c.p226a.p227a.p270n.C2628e;

/* renamed from: d.c.a.a.j.w */
/* loaded from: classes.dex */
public final class C2513w extends AbstractC2503m implements C2512v.c {

    /* renamed from: f */
    private final Uri f10260f;

    /* renamed from: g */
    private final InterfaceC2597k.a f10261g;

    /* renamed from: h */
    private final InterfaceC2330j f10262h;

    /* renamed from: i */
    private final InterfaceC2610x f10263i;

    /* renamed from: j */
    private final String f10264j;

    /* renamed from: k */
    private final int f10265k;

    /* renamed from: l */
    private final Object f10266l;

    /* renamed from: m */
    private long f10267m;

    /* renamed from: n */
    private boolean f10268n;

    /* renamed from: o */
    private InterfaceC2586E f10269o;

    @Deprecated
    /* renamed from: d.c.a.a.j.w$a */
    /* loaded from: classes.dex */
    public interface a {
        /* renamed from: a */
        void m10484a(IOException iOException);
    }

    @Deprecated
    /* renamed from: d.c.a.a.j.w$b */
    /* loaded from: classes.dex */
    private static final class b extends AbstractC2510t {

        /* renamed from: a */
        private final a f10270a;

        public b(a aVar) {
            C2628e.m11110a(aVar);
            this.f10270a = aVar;
        }

        @Override // p139d.p225c.p226a.p227a.p250j.InterfaceC2516z
        /* renamed from: a */
        public void mo8686a(int i, InterfaceC2515y.a aVar, InterfaceC2516z.b bVar, InterfaceC2516z.c cVar, IOException iOException, boolean z) {
            this.f10270a.m10484a(iOException);
        }
    }

    @Deprecated
    public C2513w(Uri uri, InterfaceC2597k.a aVar, InterfaceC2330j interfaceC2330j, Handler handler, a aVar2) {
        this(uri, aVar, interfaceC2330j, handler, aVar2, null);
    }

    @Deprecated
    public C2513w(Uri uri, InterfaceC2597k.a aVar, InterfaceC2330j interfaceC2330j, Handler handler, a aVar2, String str) {
        this(uri, aVar, interfaceC2330j, handler, aVar2, str, 1048576);
    }

    @Deprecated
    public C2513w(Uri uri, InterfaceC2597k.a aVar, InterfaceC2330j interfaceC2330j, Handler handler, a aVar2, String str, int i) {
        this(uri, aVar, interfaceC2330j, new C2606t(), str, i, (Object) null);
        if (aVar2 == null || handler == null) {
            return;
        }
        mo10433a(handler, new b(aVar2));
    }

    private C2513w(Uri uri, InterfaceC2597k.a aVar, InterfaceC2330j interfaceC2330j, InterfaceC2610x interfaceC2610x, String str, int i, Object obj) {
        this.f10260f = uri;
        this.f10261g = aVar;
        this.f10262h = interfaceC2330j;
        this.f10263i = interfaceC2610x;
        this.f10264j = str;
        this.f10265k = i;
        this.f10267m = -9223372036854775807L;
        this.f10266l = obj;
    }

    /* renamed from: b */
    private void m10483b(long j, boolean z) {
        this.f10267m = j;
        this.f10268n = z;
        m10434a(new C2406G(this.f10267m, this.f10268n, false, this.f10266l), (Object) null);
    }

    @Override // p139d.p225c.p226a.p227a.p250j.InterfaceC2515y
    /* renamed from: a */
    public InterfaceC2514x mo9889a(InterfaceC2515y.a aVar, InterfaceC2590d interfaceC2590d) {
        InterfaceC2597k mo10923a = this.f10261g.mo10923a();
        InterfaceC2586E interfaceC2586E = this.f10269o;
        if (interfaceC2586E != null) {
            mo10923a.mo10300a(interfaceC2586E);
        }
        return new C2512v(this.f10260f, mo10923a, this.f10262h.mo9142a(), this.f10263i, m10431a(aVar), this, interfaceC2590d, this.f10264j, this.f10265k);
    }

    @Override // p139d.p225c.p226a.p227a.p250j.InterfaceC2515y
    /* renamed from: a */
    public void mo9891a() {
    }

    @Override // p139d.p225c.p226a.p227a.p250j.C2512v.c
    /* renamed from: a */
    public void mo10481a(long j, boolean z) {
        if (j == -9223372036854775807L) {
            j = this.f10267m;
        }
        if (this.f10267m == j && this.f10268n == z) {
            return;
        }
        m10483b(j, z);
    }

    @Override // p139d.p225c.p226a.p227a.p250j.InterfaceC2515y
    /* renamed from: a */
    public void mo9892a(InterfaceC2514x interfaceC2514x) {
        ((C2512v) interfaceC2514x).m10472j();
    }

    @Override // p139d.p225c.p226a.p227a.p250j.AbstractC2503m
    /* renamed from: a */
    public void mo9893a(InterfaceC2517k interfaceC2517k, boolean z, InterfaceC2586E interfaceC2586E) {
        this.f10269o = interfaceC2586E;
        m10483b(this.f10267m, false);
    }

    @Override // p139d.p225c.p226a.p227a.p250j.AbstractC2503m
    /* renamed from: b */
    public void mo9895b() {
    }
}
