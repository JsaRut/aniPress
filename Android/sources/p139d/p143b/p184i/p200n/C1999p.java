package p139d.p143b.p184i.p200n;

import android.graphics.Bitmap;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executor;
import p139d.p143b.p148c.p152d.C1687f;
import p139d.p143b.p148c.p152d.C1691j;
import p139d.p143b.p148c.p155g.InterfaceC1704a;
import p139d.p143b.p148c.p156h.C1716b;
import p139d.p143b.p148c.p159k.C1723a;
import p139d.p143b.p148c.p159k.C1728f;
import p139d.p143b.p183h.C1826b;
import p139d.p143b.p184i.p191e.C1878b;
import p139d.p143b.p184i.p194h.C1913g;
import p139d.p143b.p184i.p194h.InterfaceC1910d;
import p139d.p143b.p184i.p194h.InterfaceC1912f;
import p139d.p143b.p184i.p196j.AbstractC1918b;
import p139d.p143b.p184i.p196j.C1919c;
import p139d.p143b.p184i.p196j.C1920d;
import p139d.p143b.p184i.p196j.C1922f;
import p139d.p143b.p184i.p196j.InterfaceC1923g;

/* renamed from: d.b.i.n.p */
/* loaded from: classes.dex */
public class C1999p implements InterfaceC1996na<C1716b<AbstractC1918b>> {

    /* renamed from: a */
    private final InterfaceC1704a f7287a;

    /* renamed from: b */
    private final Executor f7288b;

    /* renamed from: c */
    private final InterfaceC1910d f7289c;

    /* renamed from: d */
    private final InterfaceC1912f f7290d;

    /* renamed from: e */
    private final InterfaceC1996na<C1920d> f7291e;

    /* renamed from: f */
    private final boolean f7292f;

    /* renamed from: g */
    private final boolean f7293g;

    /* renamed from: h */
    private final boolean f7294h;

    /* renamed from: d.b.i.n.p$a */
    /* loaded from: classes.dex */
    private class a extends c {
        public a(InterfaceC1995n<C1716b<AbstractC1918b>> interfaceC1995n, InterfaceC1998oa interfaceC1998oa, boolean z) {
            super(interfaceC1995n, interfaceC1998oa, z);
        }

        @Override // p139d.p143b.p184i.p200n.C1999p.c
        /* renamed from: a */
        protected int mo8173a(C1920d c1920d) {
            return c1920d.m7925v();
        }

        @Override // p139d.p143b.p184i.p200n.C1999p.c
        /* renamed from: b */
        protected synchronized boolean mo8174b(C1920d c1920d, int i) {
            if (AbstractC1973c.m8079b(i)) {
                return false;
            }
            return super.mo8174b(c1920d, i);
        }

        @Override // p139d.p143b.p184i.p200n.C1999p.c
        /* renamed from: d */
        protected InterfaceC1923g mo8175d() {
            return C1922f.m7929a(0, false, false);
        }
    }

    /* renamed from: d.b.i.n.p$b */
    /* loaded from: classes.dex */
    private class b extends c {

        /* renamed from: j */
        private final C1913g f7296j;

        /* renamed from: k */
        private final InterfaceC1912f f7297k;

        /* renamed from: l */
        private int f7298l;

        public b(InterfaceC1995n<C1716b<AbstractC1918b>> interfaceC1995n, InterfaceC1998oa interfaceC1998oa, C1913g c1913g, InterfaceC1912f interfaceC1912f, boolean z) {
            super(interfaceC1995n, interfaceC1998oa, z);
            C1691j.m6971a(c1913g);
            this.f7296j = c1913g;
            C1691j.m6971a(interfaceC1912f);
            this.f7297k = interfaceC1912f;
            this.f7298l = 0;
        }

        @Override // p139d.p143b.p184i.p200n.C1999p.c
        /* renamed from: a */
        protected int mo8173a(C1920d c1920d) {
            return this.f7296j.m7885a();
        }

        @Override // p139d.p143b.p184i.p200n.C1999p.c
        /* renamed from: b */
        protected synchronized boolean mo8174b(C1920d c1920d, int i) {
            boolean mo8174b = super.mo8174b(c1920d, i);
            if ((AbstractC1973c.m8079b(i) || AbstractC1973c.m8080b(i, 8)) && !AbstractC1973c.m8080b(i, 4) && C1920d.m7904e(c1920d) && c1920d.m7921r() == C1826b.f6739a) {
                if (!this.f7296j.m7886a(c1920d)) {
                    return false;
                }
                int m7887b = this.f7296j.m7887b();
                if (m7887b <= this.f7298l) {
                    return false;
                }
                if (m7887b < this.f7297k.mo7881b(this.f7298l) && !this.f7296j.m7888c()) {
                    return false;
                }
                this.f7298l = m7887b;
            }
            return mo8174b;
        }

        @Override // p139d.p143b.p184i.p200n.C1999p.c
        /* renamed from: d */
        protected InterfaceC1923g mo8175d() {
            return this.f7297k.mo7880a(this.f7296j.m7887b());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: d.b.i.n.p$c */
    /* loaded from: classes.dex */
    public abstract class c extends AbstractC2005s<C1920d, C1716b<AbstractC1918b>> {

        /* renamed from: c */
        private final String f7300c;

        /* renamed from: d */
        private final InterfaceC1998oa f7301d;

        /* renamed from: e */
        private final InterfaceC2002qa f7302e;

        /* renamed from: f */
        private final C1878b f7303f;

        /* renamed from: g */
        private boolean f7304g;

        /* renamed from: h */
        private final C1949I f7305h;

        public c(InterfaceC1995n<C1716b<AbstractC1918b>> interfaceC1995n, InterfaceC1998oa interfaceC1998oa, boolean z) {
            super(interfaceC1995n);
            this.f7300c = "ProgressiveDecoder";
            this.f7301d = interfaceC1998oa;
            this.f7302e = interfaceC1998oa.mo8111e();
            this.f7303f = interfaceC1998oa.mo8109c().m8237c();
            this.f7304g = false;
            this.f7305h = new C1949I(C1999p.this.f7288b, new C2001q(this, C1999p.this, interfaceC1998oa), this.f7303f.f6847b);
            this.f7301d.mo8106a(new C2003r(this, C1999p.this, z));
        }

        /* renamed from: a */
        private Map<String, String> m8177a(AbstractC1918b abstractC1918b, long j, InterfaceC1923g interfaceC1923g, boolean z, String str, String str2, String str3, String str4) {
            String str5;
            HashMap hashMap;
            if (!this.f7302e.mo5343a(this.f7301d.getId())) {
                return null;
            }
            String valueOf = String.valueOf(j);
            String valueOf2 = String.valueOf(interfaceC1923g.mo7931b());
            String valueOf3 = String.valueOf(z);
            if (abstractC1918b instanceof C1919c) {
                Bitmap m7899t = ((C1919c) abstractC1918b).m7899t();
                String str6 = m7899t.getWidth() + "x" + m7899t.getHeight();
                hashMap = new HashMap(8);
                hashMap.put("bitmapSize", str6);
                hashMap.put("queueTime", valueOf);
                hashMap.put("hasGoodQuality", valueOf2);
                hashMap.put("isFinal", valueOf3);
                hashMap.put("encodedImageSize", str2);
                hashMap.put("imageFormat", str);
                hashMap.put("requestedImageSize", str3);
                str5 = str4;
            } else {
                str5 = str4;
                hashMap = new HashMap(7);
                hashMap.put("queueTime", valueOf);
                hashMap.put("hasGoodQuality", valueOf2);
                hashMap.put("isFinal", valueOf3);
                hashMap.put("encodedImageSize", str2);
                hashMap.put("imageFormat", str);
                hashMap.put("requestedImageSize", str3);
            }
            hashMap.put("sampleSize", str5);
            return C1687f.m6956a(hashMap);
        }

        /* renamed from: a */
        private void m8178a(AbstractC1918b abstractC1918b, int i) {
            C1716b<AbstractC1918b> m7043a = C1716b.m7043a(abstractC1918b);
            try {
                m8181b(AbstractC1973c.m8077a(i));
                m8188c().mo8085a(m7043a, i);
            } finally {
                C1716b.m7045b(m7043a);
            }
        }

        /* renamed from: b */
        private void m8181b(boolean z) {
            synchronized (this) {
                if (z) {
                    if (!this.f7304g) {
                        m8188c().mo8083a(1.0f);
                        this.f7304g = true;
                        this.f7305h.m7990a();
                    }
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Removed duplicated region for block: B:41:0x00dd  */
        /* renamed from: c */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void m8182c(p139d.p143b.p184i.p196j.C1920d r19, int r20) {
            /*
                Method dump skipped, instructions count: 334
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: p139d.p143b.p184i.p200n.C1999p.c.m8182c(d.b.i.j.d, int):void");
        }

        /* renamed from: c */
        private void m8184c(Throwable th) {
            m8181b(true);
            m8188c().mo8086a(th);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: e */
        public void m8185e() {
            m8181b(true);
            m8188c().mo8082a();
        }

        /* renamed from: f */
        private synchronized boolean m8186f() {
            return this.f7304g;
        }

        /* renamed from: a */
        protected abstract int mo8173a(C1920d c1920d);

        @Override // p139d.p143b.p184i.p200n.AbstractC1973c
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void mo7860b(C1920d c1920d, int i) {
            boolean m8077a = AbstractC1973c.m8077a(i);
            if (m8077a && !C1920d.m7904e(c1920d)) {
                m8184c(new C1723a("Encoded image is not valid."));
                return;
            }
            if (mo8174b(c1920d, i)) {
                boolean m8080b = AbstractC1973c.m8080b(i, 4);
                if (m8077a || m8080b || this.f7301d.mo8112f()) {
                    this.f7305h.m7993c();
                }
            }
        }

        @Override // p139d.p143b.p184i.p200n.AbstractC2005s, p139d.p143b.p184i.p200n.AbstractC1973c
        /* renamed from: b */
        public void mo7858b() {
            m8185e();
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // p139d.p143b.p184i.p200n.AbstractC2005s, p139d.p143b.p184i.p200n.AbstractC1973c
        /* renamed from: b */
        public void mo7859b(float f) {
            super.mo7859b(f * 0.99f);
        }

        @Override // p139d.p143b.p184i.p200n.AbstractC2005s, p139d.p143b.p184i.p200n.AbstractC1973c
        /* renamed from: b */
        public void mo7861b(Throwable th) {
            m8184c(th);
        }

        /* renamed from: b */
        protected boolean mo8174b(C1920d c1920d, int i) {
            return this.f7305h.m7991a(c1920d, i);
        }

        /* renamed from: d */
        protected abstract InterfaceC1923g mo8175d();
    }

    public C1999p(InterfaceC1704a interfaceC1704a, Executor executor, InterfaceC1910d interfaceC1910d, InterfaceC1912f interfaceC1912f, boolean z, boolean z2, boolean z3, InterfaceC1996na<C1920d> interfaceC1996na) {
        C1691j.m6971a(interfaceC1704a);
        this.f7287a = interfaceC1704a;
        C1691j.m6971a(executor);
        this.f7288b = executor;
        C1691j.m6971a(interfaceC1910d);
        this.f7289c = interfaceC1910d;
        C1691j.m6971a(interfaceC1912f);
        this.f7290d = interfaceC1912f;
        this.f7292f = z;
        this.f7293g = z2;
        C1691j.m6971a(interfaceC1996na);
        this.f7291e = interfaceC1996na;
        this.f7294h = z3;
    }

    @Override // p139d.p143b.p184i.p200n.InterfaceC1996na
    /* renamed from: a */
    public void mo7950a(InterfaceC1995n<C1716b<AbstractC1918b>> interfaceC1995n, InterfaceC1998oa interfaceC1998oa) {
        this.f7291e.mo7950a(!C1728f.m7089i(interfaceC1998oa.mo8109c().m8249o()) ? new a(interfaceC1995n, interfaceC1998oa, this.f7294h) : new b(interfaceC1995n, interfaceC1998oa, new C1913g(this.f7287a), this.f7290d, this.f7294h), interfaceC1998oa);
    }
}
