package p139d.p143b.p184i.p200n;

import com.facebook.imagepipeline.nativecode.C1014c;
import java.io.InputStream;
import java.util.concurrent.Executor;
import p139d.p143b.p148c.p152d.C1691j;
import p139d.p143b.p148c.p155g.AbstractC1713j;
import p139d.p143b.p148c.p155g.InterfaceC1711h;
import p139d.p143b.p148c.p159k.EnumC1727e;
import p139d.p143b.p183h.C1826b;
import p139d.p143b.p183h.C1827c;
import p139d.p143b.p183h.C1828d;
import p139d.p143b.p184i.p196j.C1920d;

/* renamed from: d.b.i.n.Ka */
/* loaded from: classes.dex */
public class C1954Ka implements InterfaceC1996na<C1920d> {

    /* renamed from: a */
    private final Executor f7158a;

    /* renamed from: b */
    private final InterfaceC1711h f7159b;

    /* renamed from: c */
    private final InterfaceC1996na<C1920d> f7160c;

    /* renamed from: d.b.i.n.Ka$a */
    /* loaded from: classes.dex */
    private class a extends AbstractC2005s<C1920d, C1920d> {

        /* renamed from: c */
        private final InterfaceC1998oa f7161c;

        /* renamed from: d */
        private EnumC1727e f7162d;

        public a(InterfaceC1995n<C1920d> interfaceC1995n, InterfaceC1998oa interfaceC1998oa) {
            super(interfaceC1995n);
            this.f7161c = interfaceC1998oa;
            this.f7162d = EnumC1727e.UNSET;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // p139d.p143b.p184i.p200n.AbstractC1973c
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void mo7860b(C1920d c1920d, int i) {
            if (this.f7162d == EnumC1727e.UNSET && c1920d != null) {
                this.f7162d = C1954Ka.m8012b(c1920d);
            }
            if (this.f7162d == EnumC1727e.NO) {
                m8188c().mo8085a(c1920d, i);
                return;
            }
            if (AbstractC1973c.m8077a(i)) {
                if (this.f7162d != EnumC1727e.YES || c1920d == null) {
                    m8188c().mo8085a(c1920d, i);
                } else {
                    C1954Ka.this.m8010a(c1920d, m8188c(), this.f7161c);
                }
            }
        }
    }

    public C1954Ka(Executor executor, InterfaceC1711h interfaceC1711h, InterfaceC1996na<C1920d> interfaceC1996na) {
        C1691j.m6971a(executor);
        this.f7158a = executor;
        C1691j.m6971a(interfaceC1711h);
        this.f7159b = interfaceC1711h;
        C1691j.m6971a(interfaceC1996na);
        this.f7160c = interfaceC1996na;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public void m8010a(C1920d c1920d, InterfaceC1995n<C1920d> interfaceC1995n, InterfaceC1998oa interfaceC1998oa) {
        C1691j.m6971a(c1920d);
        this.f7158a.execute(new C1952Ja(this, interfaceC1995n, interfaceC1998oa.mo8111e(), "WebpTranscodeProducer", interfaceC1998oa.getId(), C1920d.m7901a(c1920d)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b */
    public static EnumC1727e m8012b(C1920d c1920d) {
        C1691j.m6971a(c1920d);
        C1827c m7524c = C1828d.m7524c(c1920d.m7922s());
        if (!C1826b.m7517a(m7524c)) {
            return m7524c == C1827c.f6749a ? EnumC1727e.UNSET : EnumC1727e.NO;
        }
        return C1014c.m5089a() == null ? EnumC1727e.NO : EnumC1727e.m7078a(!r0.m5088a(m7524c));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b */
    public static void m8013b(C1920d c1920d, AbstractC1713j abstractC1713j) {
        C1827c c1827c;
        InputStream m7922s = c1920d.m7922s();
        C1827c m7524c = C1828d.m7524c(m7922s);
        if (m7524c == C1826b.f6743e || m7524c == C1826b.f6745g) {
            C1014c.m5089a().m5087a(m7922s, abstractC1713j, 80);
            c1827c = C1826b.f6739a;
        } else {
            if (m7524c != C1826b.f6744f && m7524c != C1826b.f6746h) {
                throw new IllegalArgumentException("Wrong image format");
            }
            C1014c.m5089a().m5086a(m7922s, abstractC1713j);
            c1827c = C1826b.f6740b;
        }
        c1920d.m7906a(c1827c);
    }

    @Override // p139d.p143b.p184i.p200n.InterfaceC1996na
    /* renamed from: a */
    public void mo7950a(InterfaceC1995n<C1920d> interfaceC1995n, InterfaceC1998oa interfaceC1998oa) {
        this.f7160c.mo7950a(new a(interfaceC1995n, interfaceC1998oa), interfaceC1998oa);
    }
}
