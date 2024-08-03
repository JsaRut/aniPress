package p139d.p225c.p226a.p227a.p245h.p246a;

import java.nio.ByteBuffer;
import java.util.Arrays;
import p139d.p225c.p226a.p227a.p245h.C2353b;
import p139d.p225c.p226a.p227a.p245h.C2394f;
import p139d.p225c.p226a.p227a.p245h.InterfaceC2379c;
import p139d.p225c.p226a.p227a.p270n.C2622I;
import p139d.p225c.p226a.p227a.p270n.C2628e;
import p139d.p225c.p226a.p227a.p270n.C2644u;

/* renamed from: d.c.a.a.h.a.c */
/* loaded from: classes.dex */
public final class C2351c implements InterfaceC2379c {
    @Override // p139d.p225c.p226a.p227a.p245h.InterfaceC2379c
    /* renamed from: a */
    public C2353b mo9806a(C2394f c2394f) {
        ByteBuffer byteBuffer = c2394f.f8040c;
        byte[] array = byteBuffer.array();
        int limit = byteBuffer.limit();
        C2644u c2644u = new C2644u(array, limit);
        String m11235q = c2644u.m11235q();
        C2628e.m11110a(m11235q);
        String str = m11235q;
        String m11235q2 = c2644u.m11235q();
        C2628e.m11110a(m11235q2);
        String str2 = m11235q2;
        long m11240v = c2644u.m11240v();
        return new C2353b(new C2350b(str, str2, C2622I.m11085c(c2644u.m11240v(), 1000L, m11240v), c2644u.m11240v(), Arrays.copyOfRange(array, c2644u.m11217c(), limit), C2622I.m11085c(c2644u.m11240v(), 1000000L, m11240v)));
    }
}
