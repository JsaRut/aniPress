package p139d.p143b.p184i.p194h;

import android.graphics.Bitmap;
import java.util.Map;
import p139d.p143b.p148c.p156h.C1716b;
import p139d.p143b.p183h.C1827c;
import p139d.p143b.p183h.C1828d;
import p139d.p143b.p184i.p191e.C1878b;
import p139d.p143b.p184i.p196j.AbstractC1918b;
import p139d.p143b.p184i.p196j.C1919c;
import p139d.p143b.p184i.p196j.C1920d;
import p139d.p143b.p184i.p196j.C1922f;
import p139d.p143b.p184i.p196j.InterfaceC1923g;
import p139d.p143b.p184i.p198l.InterfaceC1931e;

/* renamed from: d.b.i.h.c */
/* loaded from: classes.dex */
public class C1909c implements InterfaceC1910d {

    /* renamed from: a */
    private final InterfaceC1910d f7050a;

    /* renamed from: b */
    private final InterfaceC1910d f7051b;

    /* renamed from: c */
    private final InterfaceC1931e f7052c;

    /* renamed from: d */
    private final InterfaceC1910d f7053d;

    /* renamed from: e */
    private final Map<C1827c, InterfaceC1910d> f7054e;

    public C1909c(InterfaceC1910d interfaceC1910d, InterfaceC1910d interfaceC1910d2, InterfaceC1931e interfaceC1931e) {
        this(interfaceC1910d, interfaceC1910d2, interfaceC1931e, null);
    }

    public C1909c(InterfaceC1910d interfaceC1910d, InterfaceC1910d interfaceC1910d2, InterfaceC1931e interfaceC1931e, Map<C1827c, InterfaceC1910d> map) {
        this.f7053d = new C1908b(this);
        this.f7050a = interfaceC1910d;
        this.f7051b = interfaceC1910d2;
        this.f7052c = interfaceC1931e;
        this.f7054e = map;
    }

    @Override // p139d.p143b.p184i.p194h.InterfaceC1910d
    /* renamed from: a */
    public AbstractC1918b mo7874a(C1920d c1920d, int i, InterfaceC1923g interfaceC1923g, C1878b c1878b) {
        InterfaceC1910d interfaceC1910d;
        InterfaceC1910d interfaceC1910d2 = c1878b.f6853h;
        if (interfaceC1910d2 != null) {
            return interfaceC1910d2.mo7874a(c1920d, i, interfaceC1923g, c1878b);
        }
        C1827c m7921r = c1920d.m7921r();
        if (m7921r == null || m7921r == C1827c.f6749a) {
            m7921r = C1828d.m7524c(c1920d.m7922s());
            c1920d.m7906a(m7921r);
        }
        Map<C1827c, InterfaceC1910d> map = this.f7054e;
        return (map == null || (interfaceC1910d = map.get(m7921r)) == null) ? this.f7053d.mo7874a(c1920d, i, interfaceC1923g, c1878b) : interfaceC1910d.mo7874a(c1920d, i, interfaceC1923g, c1878b);
    }

    /* renamed from: a */
    public C1919c m7875a(C1920d c1920d, C1878b c1878b) {
        C1716b<Bitmap> mo7936a = this.f7052c.mo7936a(c1920d, c1878b.f6852g, null);
        try {
            return new C1919c(mo7936a, C1922f.f7079a, c1920d.m7923t(), c1920d.m7919p());
        } finally {
            mo7936a.close();
        }
    }

    /* renamed from: b */
    public AbstractC1918b m7876b(C1920d c1920d, int i, InterfaceC1923g interfaceC1923g, C1878b c1878b) {
        return this.f7051b.mo7874a(c1920d, i, interfaceC1923g, c1878b);
    }

    /* renamed from: c */
    public AbstractC1918b m7877c(C1920d c1920d, int i, InterfaceC1923g interfaceC1923g, C1878b c1878b) {
        InterfaceC1910d interfaceC1910d;
        return (c1878b.f6851f || (interfaceC1910d = this.f7050a) == null) ? m7875a(c1920d, c1878b) : interfaceC1910d.mo7874a(c1920d, i, interfaceC1923g, c1878b);
    }

    /* renamed from: d */
    public C1919c m7878d(C1920d c1920d, int i, InterfaceC1923g interfaceC1923g, C1878b c1878b) {
        C1716b<Bitmap> mo7937a = this.f7052c.mo7937a(c1920d, c1878b.f6852g, null, i);
        try {
            return new C1919c(mo7937a, interfaceC1923g, c1920d.m7923t(), c1920d.m7919p());
        } finally {
            mo7937a.close();
        }
    }
}
