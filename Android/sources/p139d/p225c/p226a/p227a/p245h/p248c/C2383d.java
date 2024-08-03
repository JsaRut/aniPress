package p139d.p225c.p226a.p227a.p245h.p248c;

import java.nio.ByteBuffer;
import p139d.p225c.p226a.p227a.p245h.C2353b;
import p139d.p225c.p226a.p227a.p245h.C2394f;
import p139d.p225c.p226a.p227a.p245h.InterfaceC2379c;
import p139d.p225c.p226a.p227a.p270n.C2619F;
import p139d.p225c.p226a.p227a.p270n.C2643t;
import p139d.p225c.p226a.p227a.p270n.C2644u;

/* renamed from: d.c.a.a.h.c.d */
/* loaded from: classes.dex */
public final class C2383d implements InterfaceC2379c {

    /* renamed from: a */
    private final C2644u f9328a = new C2644u();

    /* renamed from: b */
    private final C2643t f9329b = new C2643t();

    /* renamed from: c */
    private C2619F f9330c;

    @Override // p139d.p225c.p226a.p227a.p245h.InterfaceC2379c
    /* renamed from: a */
    public C2353b mo9806a(C2394f c2394f) {
        C2619F c2619f = this.f9330c;
        if (c2619f == null || c2394f.f9364f != c2619f.m11023c()) {
            this.f9330c = new C2619F(c2394f.f8041d);
            this.f9330c.m11020a(c2394f.f8041d - c2394f.f9364f);
        }
        ByteBuffer byteBuffer = c2394f.f8040c;
        byte[] array = byteBuffer.array();
        int limit = byteBuffer.limit();
        this.f9328a.m11213a(array, limit);
        this.f9329b.m11195a(array, limit);
        this.f9329b.m11201c(39);
        long m11191a = (this.f9329b.m11191a(1) << 32) | this.f9329b.m11191a(32);
        this.f9329b.m11201c(20);
        int m11191a2 = this.f9329b.m11191a(12);
        int m11191a3 = this.f9329b.m11191a(8);
        C2353b.a aVar = null;
        this.f9328a.m11224f(14);
        if (m11191a3 == 0) {
            aVar = new C2387h();
        } else if (m11191a3 == 255) {
            aVar = C2381b.m9840a(this.f9328a, m11191a2, m11191a);
        } else if (m11191a3 == 4) {
            aVar = C2389j.m9844a(this.f9328a);
        } else if (m11191a3 == 5) {
            aVar = C2385f.m9841a(this.f9328a, m11191a, this.f9330c);
        } else if (m11191a3 == 6) {
            aVar = C2391l.m9856a(this.f9328a, m11191a, this.f9330c);
        }
        return aVar == null ? new C2353b(new C2353b.a[0]) : new C2353b(aVar);
    }
}
