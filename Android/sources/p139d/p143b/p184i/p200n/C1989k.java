package p139d.p143b.p184i.p200n;

import android.graphics.Bitmap;
import p139d.p143b.p148c.p152d.C1691j;
import p139d.p143b.p148c.p156h.C1716b;
import p139d.p143b.p184i.p196j.AbstractC1918b;
import p139d.p143b.p184i.p196j.C1919c;

/* renamed from: d.b.i.n.k */
/* loaded from: classes.dex */
public class C1989k implements InterfaceC1996na<C1716b<AbstractC1918b>> {

    /* renamed from: a */
    private final InterfaceC1996na<C1716b<AbstractC1918b>> f7258a;

    /* renamed from: b */
    private final int f7259b;

    /* renamed from: c */
    private final int f7260c;

    /* renamed from: d */
    private final boolean f7261d;

    /* renamed from: d.b.i.n.k$a */
    /* loaded from: classes.dex */
    private static class a extends AbstractC2005s<C1716b<AbstractC1918b>, C1716b<AbstractC1918b>> {

        /* renamed from: c */
        private final int f7262c;

        /* renamed from: d */
        private final int f7263d;

        a(InterfaceC1995n<C1716b<AbstractC1918b>> interfaceC1995n, int i, int i2) {
            super(interfaceC1995n);
            this.f7262c = i;
            this.f7263d = i2;
        }

        /* renamed from: a */
        private void m8134a(C1716b<AbstractC1918b> c1716b) {
            AbstractC1918b m7048n;
            Bitmap m7899t;
            int rowBytes;
            if (c1716b == null || !c1716b.m7050p() || (m7048n = c1716b.m7048n()) == null || m7048n.isClosed() || !(m7048n instanceof C1919c) || (m7899t = ((C1919c) m7048n).m7899t()) == null || (rowBytes = m7899t.getRowBytes() * m7899t.getHeight()) < this.f7262c || rowBytes > this.f7263d) {
                return;
            }
            m7899t.prepareToDraw();
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // p139d.p143b.p184i.p200n.AbstractC1973c
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void mo7860b(C1716b<AbstractC1918b> c1716b, int i) {
            m8134a(c1716b);
            m8188c().mo8085a(c1716b, i);
        }
    }

    public C1989k(InterfaceC1996na<C1716b<AbstractC1918b>> interfaceC1996na, int i, int i2, boolean z) {
        C1691j.m6974a(i <= i2);
        C1691j.m6971a(interfaceC1996na);
        this.f7258a = interfaceC1996na;
        this.f7259b = i;
        this.f7260c = i2;
        this.f7261d = z;
    }

    @Override // p139d.p143b.p184i.p200n.InterfaceC1996na
    /* renamed from: a */
    public void mo7950a(InterfaceC1995n<C1716b<AbstractC1918b>> interfaceC1995n, InterfaceC1998oa interfaceC1998oa) {
        if (!interfaceC1998oa.mo8110d() || this.f7261d) {
            this.f7258a.mo7950a(new a(interfaceC1995n, this.f7259b, this.f7260c), interfaceC1998oa);
        } else {
            this.f7258a.mo7950a(interfaceC1995n, interfaceC1998oa);
        }
    }
}
