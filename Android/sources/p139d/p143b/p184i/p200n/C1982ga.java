package p139d.p143b.p184i.p200n;

import android.net.Uri;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Map;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicBoolean;
import p030b.C0502k;
import p030b.InterfaceC0497f;
import p139d.p143b.p145b.p146a.InterfaceC1648d;
import p139d.p143b.p148c.p152d.C1687f;
import p139d.p143b.p148c.p153e.C1700a;
import p139d.p143b.p148c.p155g.AbstractC1713j;
import p139d.p143b.p148c.p155g.InterfaceC1704a;
import p139d.p143b.p148c.p155g.InterfaceC1710g;
import p139d.p143b.p148c.p155g.InterfaceC1711h;
import p139d.p143b.p148c.p156h.C1716b;
import p139d.p143b.p183h.C1827c;
import p139d.p143b.p184i.p190d.C1862l;
import p139d.p143b.p184i.p190d.InterfaceC1863m;
import p139d.p143b.p184i.p196j.C1920d;
import p139d.p143b.p184i.p201o.C2023c;

/* renamed from: d.b.i.n.ga */
/* loaded from: classes.dex */
public class C1982ga implements InterfaceC1996na<C1920d> {

    /* renamed from: a */
    private final C1862l f7232a;

    /* renamed from: b */
    private final InterfaceC1863m f7233b;

    /* renamed from: c */
    private final InterfaceC1711h f7234c;

    /* renamed from: d */
    private final InterfaceC1704a f7235d;

    /* renamed from: e */
    private final InterfaceC1996na<C1920d> f7236e;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: d.b.i.n.ga$a */
    /* loaded from: classes.dex */
    public static class a extends AbstractC2005s<C1920d, C1920d> {

        /* renamed from: c */
        private final C1862l f7237c;

        /* renamed from: d */
        private final InterfaceC1648d f7238d;

        /* renamed from: e */
        private final InterfaceC1711h f7239e;

        /* renamed from: f */
        private final InterfaceC1704a f7240f;

        /* renamed from: g */
        private final C1920d f7241g;

        private a(InterfaceC1995n<C1920d> interfaceC1995n, C1862l c1862l, InterfaceC1648d interfaceC1648d, InterfaceC1711h interfaceC1711h, InterfaceC1704a interfaceC1704a, C1920d c1920d) {
            super(interfaceC1995n);
            this.f7237c = c1862l;
            this.f7238d = interfaceC1648d;
            this.f7239e = interfaceC1711h;
            this.f7240f = interfaceC1704a;
            this.f7241g = c1920d;
        }

        /* synthetic */ a(InterfaceC1995n interfaceC1995n, C1862l c1862l, InterfaceC1648d interfaceC1648d, InterfaceC1711h interfaceC1711h, InterfaceC1704a interfaceC1704a, C1920d c1920d, C1978ea c1978ea) {
            this(interfaceC1995n, c1862l, interfaceC1648d, interfaceC1711h, interfaceC1704a, c1920d);
        }

        /* renamed from: a */
        private AbstractC1713j m8126a(C1920d c1920d, C1920d c1920d2) {
            AbstractC1713j mo5040a = this.f7239e.mo5040a(c1920d2.m7925v() + c1920d2.m7918o().f6844b);
            m8128a(c1920d.m7922s(), mo5040a, c1920d2.m7918o().f6844b);
            m8128a(c1920d2.m7922s(), mo5040a, c1920d2.m7925v());
            return mo5040a;
        }

        /* renamed from: a */
        private void m8127a(AbstractC1713j abstractC1713j) {
            C1920d c1920d;
            Throwable th;
            C1716b m7043a = C1716b.m7043a(abstractC1713j.mo5043m());
            try {
                c1920d = new C1920d((C1716b<InterfaceC1710g>) m7043a);
            } catch (Throwable th2) {
                c1920d = null;
                th = th2;
            }
            try {
                c1920d.m7928y();
                m8188c().mo8085a(c1920d, 1);
                C1920d.m7902b(c1920d);
                C1716b.m7045b(m7043a);
            } catch (Throwable th3) {
                th = th3;
                C1920d.m7902b(c1920d);
                C1716b.m7045b(m7043a);
                throw th;
            }
        }

        /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
        /* renamed from: a */
        private void m8128a(InputStream inputStream, OutputStream outputStream, int i) {
            byte[] bArr = this.f7240f.get(16384);
            int i2 = i;
            while (i2 > 0) {
                try {
                    int read = inputStream.read(bArr, 0, Math.min(16384, i2));
                    if (read < 0) {
                        break;
                    } else if (read > 0) {
                        outputStream.write(bArr, 0, read);
                        i2 -= read;
                    }
                } finally {
                    this.f7240f.mo4987a(bArr);
                }
            }
            if (i2 > 0) {
                throw new IOException(String.format(null, "Failed to read %d bytes - finished %d short", Integer.valueOf(i), Integer.valueOf(i2)));
            }
        }

        @Override // p139d.p143b.p184i.p200n.AbstractC1973c
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void mo7860b(C1920d c1920d, int i) {
            if (AbstractC1973c.m8079b(i)) {
                return;
            }
            if (this.f7241g != null) {
                try {
                    if (c1920d.m7918o() != null) {
                        try {
                            m8127a(m8126a(this.f7241g, c1920d));
                        } catch (IOException e2) {
                            C1700a.m6998a("PartialDiskCacheProducer", "Error while merging image data", e2);
                            m8188c().mo8086a(e2);
                        }
                        this.f7237c.m7599c(this.f7238d);
                        return;
                    }
                } finally {
                    c1920d.close();
                    this.f7241g.close();
                }
            }
            if (AbstractC1973c.m8080b(i, 8) && AbstractC1973c.m8077a(i) && c1920d.m7921r() != C1827c.f6749a) {
                this.f7237c.m7595a(this.f7238d, c1920d);
            }
            m8188c().mo8085a(c1920d, i);
        }
    }

    public C1982ga(C1862l c1862l, InterfaceC1863m interfaceC1863m, InterfaceC1711h interfaceC1711h, InterfaceC1704a interfaceC1704a, InterfaceC1996na<C1920d> interfaceC1996na) {
        this.f7232a = c1862l;
        this.f7233b = interfaceC1863m;
        this.f7234c = interfaceC1711h;
        this.f7235d = interfaceC1704a;
        this.f7236e = interfaceC1996na;
    }

    /* renamed from: a */
    private static Uri m8118a(C2023c c2023c) {
        return c2023c.m8249o().buildUpon().appendQueryParameter("fresco_partial", "true").build();
    }

    /* renamed from: a */
    private InterfaceC0497f<C1920d, Void> m8119a(InterfaceC1995n<C1920d> interfaceC1995n, InterfaceC1998oa interfaceC1998oa, InterfaceC1648d interfaceC1648d) {
        return new C1978ea(this, interfaceC1998oa.mo8111e(), interfaceC1998oa.getId(), interfaceC1995n, interfaceC1998oa, interfaceC1648d);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static Map<String, String> m8120a(InterfaceC2002qa interfaceC2002qa, String str, boolean z, int i) {
        if (interfaceC2002qa.mo5343a(str)) {
            return z ? C1687f.m6958a("cached_value_found", String.valueOf(z), "encodedImageSize", String.valueOf(i)) : C1687f.m6957a("cached_value_found", String.valueOf(z));
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public void m8122a(InterfaceC1995n<C1920d> interfaceC1995n, InterfaceC1998oa interfaceC1998oa, InterfaceC1648d interfaceC1648d, C1920d c1920d) {
        this.f7236e.mo7950a(new a(interfaceC1995n, this.f7232a, interfaceC1648d, this.f7234c, this.f7235d, c1920d, null), interfaceC1998oa);
    }

    /* renamed from: a */
    private void m8123a(AtomicBoolean atomicBoolean, InterfaceC1998oa interfaceC1998oa) {
        interfaceC1998oa.mo8106a(new C1980fa(this, atomicBoolean));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b */
    public static boolean m8125b(C0502k<?> c0502k) {
        return c0502k.m2650d() || (c0502k.m2652f() && (c0502k.m2646a() instanceof CancellationException));
    }

    @Override // p139d.p143b.p184i.p200n.InterfaceC1996na
    /* renamed from: a */
    public void mo7950a(InterfaceC1995n<C1920d> interfaceC1995n, InterfaceC1998oa interfaceC1998oa) {
        C2023c mo8109c = interfaceC1998oa.mo8109c();
        if (!mo8109c.m8251q()) {
            this.f7236e.mo7950a(interfaceC1995n, interfaceC1998oa);
            return;
        }
        interfaceC1998oa.mo8111e().mo5339a(interfaceC1998oa.getId(), "PartialDiskCacheProducer");
        InterfaceC1648d mo7600a = this.f7233b.mo7600a(mo8109c, m8118a(mo8109c), interfaceC1998oa.mo8103a());
        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        this.f7232a.m7594a(mo7600a, atomicBoolean).m2644a((InterfaceC0497f<C1920d, TContinuationResult>) m8119a(interfaceC1995n, interfaceC1998oa, mo7600a));
        m8123a(atomicBoolean, interfaceC1998oa);
    }
}
