package p139d.p143b.p184i.p200n;

import java.util.Map;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicBoolean;
import p030b.C0502k;
import p030b.InterfaceC0497f;
import p139d.p143b.p145b.p146a.InterfaceC1648d;
import p139d.p143b.p148c.p152d.C1687f;
import p139d.p143b.p184i.p190d.C1862l;
import p139d.p143b.p184i.p190d.InterfaceC1863m;
import p139d.p143b.p184i.p196j.C1920d;
import p139d.p143b.p184i.p201o.C2023c;

/* renamed from: d.b.i.n.v */
/* loaded from: classes.dex */
public class C2011v implements InterfaceC1996na<C1920d> {

    /* renamed from: a */
    private final C1862l f7337a;

    /* renamed from: b */
    private final C1862l f7338b;

    /* renamed from: c */
    private final InterfaceC1863m f7339c;

    /* renamed from: d */
    private final InterfaceC1996na<C1920d> f7340d;

    public C2011v(C1862l c1862l, C1862l c1862l2, InterfaceC1863m interfaceC1863m, InterfaceC1996na<C1920d> interfaceC1996na) {
        this.f7337a = c1862l;
        this.f7338b = c1862l2;
        this.f7339c = interfaceC1863m;
        this.f7340d = interfaceC1996na;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static Map<String, String> m8218a(InterfaceC2002qa interfaceC2002qa, String str, boolean z, int i) {
        if (interfaceC2002qa.mo5343a(str)) {
            return z ? C1687f.m6958a("cached_value_found", String.valueOf(z), "encodedImageSize", String.valueOf(i)) : C1687f.m6957a("cached_value_found", String.valueOf(z));
        }
        return null;
    }

    /* renamed from: a */
    private void m8219a(AtomicBoolean atomicBoolean, InterfaceC1998oa interfaceC1998oa) {
        interfaceC1998oa.mo8106a(new C2009u(this, atomicBoolean));
    }

    /* renamed from: b */
    private void m8221b(InterfaceC1995n<C1920d> interfaceC1995n, InterfaceC1998oa interfaceC1998oa) {
        if (interfaceC1998oa.mo8113g().m8254b() >= C2023c.b.DISK_CACHE.m8254b()) {
            interfaceC1995n.mo8085a(null, 1);
        } else {
            this.f7340d.mo7950a(interfaceC1995n, interfaceC1998oa);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b */
    public static boolean m8222b(C0502k<?> c0502k) {
        return c0502k.m2650d() || (c0502k.m2652f() && (c0502k.m2646a() instanceof CancellationException));
    }

    /* renamed from: c */
    private InterfaceC0497f<C1920d, Void> m8223c(InterfaceC1995n<C1920d> interfaceC1995n, InterfaceC1998oa interfaceC1998oa) {
        return new C2007t(this, interfaceC1998oa.mo8111e(), interfaceC1998oa.getId(), interfaceC1995n, interfaceC1998oa);
    }

    @Override // p139d.p143b.p184i.p200n.InterfaceC1996na
    /* renamed from: a */
    public void mo7950a(InterfaceC1995n<C1920d> interfaceC1995n, InterfaceC1998oa interfaceC1998oa) {
        C2023c mo8109c = interfaceC1998oa.mo8109c();
        if (!mo8109c.m8251q()) {
            m8221b(interfaceC1995n, interfaceC1998oa);
            return;
        }
        interfaceC1998oa.mo8111e().mo5339a(interfaceC1998oa.getId(), "DiskCacheProducer");
        InterfaceC1648d mo7603c = this.f7339c.mo7603c(mo8109c, interfaceC1998oa.mo8103a());
        C1862l c1862l = mo8109c.m8236b() == C2023c.a.SMALL ? this.f7338b : this.f7337a;
        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        c1862l.m7594a(mo7603c, atomicBoolean).m2644a((InterfaceC0497f<C1920d, TContinuationResult>) m8223c(interfaceC1995n, interfaceC1998oa));
        m8219a(atomicBoolean, interfaceC1998oa);
    }
}
