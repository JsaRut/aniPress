package p139d.p225c.p226a.p227a.p234f;

import java.lang.reflect.Constructor;
import p139d.p225c.p226a.p227a.p234f.p235a.C2229b;
import p139d.p225c.p226a.p227a.p234f.p236b.C2233c;
import p139d.p225c.p226a.p227a.p234f.p237c.C2244g;
import p139d.p225c.p226a.p227a.p234f.p238d.C2252e;
import p139d.p225c.p226a.p227a.p234f.p239e.C2263h;
import p139d.p225c.p226a.p227a.p234f.p239e.C2265j;
import p139d.p225c.p226a.p227a.p234f.p240f.C2277e;
import p139d.p225c.p226a.p227a.p234f.p242h.C2295F;
import p139d.p225c.p226a.p227a.p234f.p242h.C2303e;
import p139d.p225c.p226a.p227a.p234f.p242h.C2305g;
import p139d.p225c.p226a.p227a.p234f.p242h.C2323y;
import p139d.p225c.p226a.p227a.p234f.p243i.C2327b;

/* renamed from: d.c.a.a.f.e */
/* loaded from: classes.dex */
public final class C2255e implements InterfaceC2330j {

    /* renamed from: a */
    private static final Constructor<? extends InterfaceC2287g> f8390a;

    /* renamed from: b */
    private boolean f8391b;

    /* renamed from: c */
    private int f8392c;

    /* renamed from: d */
    private int f8393d;

    /* renamed from: e */
    private int f8394e;

    /* renamed from: f */
    private int f8395f;

    /* renamed from: g */
    private int f8396g;

    /* renamed from: h */
    private int f8397h;

    /* renamed from: i */
    private int f8398i = 1;

    /* renamed from: j */
    private int f8399j;

    static {
        Constructor<? extends InterfaceC2287g> constructor;
        try {
            constructor = Class.forName("com.google.android.exoplayer2.ext.flac.FlacExtractor").asSubclass(InterfaceC2287g.class).getConstructor(new Class[0]);
        } catch (ClassNotFoundException unused) {
            constructor = null;
        } catch (Exception e2) {
            throw new RuntimeException("Error instantiating FLAC extension", e2);
        }
        f8390a = constructor;
    }

    @Override // p139d.p225c.p226a.p227a.p234f.InterfaceC2330j
    /* renamed from: a */
    public synchronized InterfaceC2287g[] mo9142a() {
        InterfaceC2287g[] interfaceC2287gArr;
        interfaceC2287gArr = new InterfaceC2287g[f8390a == null ? 12 : 13];
        interfaceC2287gArr[0] = new C2244g(this.f8394e);
        int i = 1;
        interfaceC2287gArr[1] = new C2263h(this.f8396g);
        interfaceC2287gArr[2] = new C2265j(this.f8395f);
        interfaceC2287gArr[3] = new C2252e(this.f8397h | (this.f8391b ? 1 : 0));
        interfaceC2287gArr[4] = new C2305g(0L, this.f8392c | (this.f8391b ? 1 : 0));
        interfaceC2287gArr[5] = new C2303e();
        interfaceC2287gArr[6] = new C2295F(this.f8398i, this.f8399j);
        interfaceC2287gArr[7] = new C2233c();
        interfaceC2287gArr[8] = new C2277e();
        interfaceC2287gArr[9] = new C2323y();
        interfaceC2287gArr[10] = new C2327b();
        int i2 = this.f8393d;
        if (!this.f8391b) {
            i = 0;
        }
        interfaceC2287gArr[11] = new C2229b(i | i2);
        if (f8390a != null) {
            try {
                interfaceC2287gArr[12] = f8390a.newInstance(new Object[0]);
            } catch (Exception e2) {
                throw new IllegalStateException("Unexpected error creating FLAC extractor", e2);
            }
        }
        return interfaceC2287gArr;
    }
}
