package p139d.p225c.p226a.p227a.p271o;

import java.util.ArrayList;
import java.util.List;
import p139d.p225c.p226a.p227a.C2683z;
import p139d.p225c.p226a.p227a.p270n.C2630g;
import p139d.p225c.p226a.p227a.p270n.C2642s;
import p139d.p225c.p226a.p227a.p270n.C2644u;

/* renamed from: d.c.a.a.o.h */
/* loaded from: classes.dex */
public final class C2660h {

    /* renamed from: a */
    public final List<byte[]> f11037a;

    /* renamed from: b */
    public final int f11038b;

    /* renamed from: c */
    public final int f11039c;

    /* renamed from: d */
    public final int f11040d;

    /* renamed from: e */
    public final float f11041e;

    private C2660h(List<byte[]> list, int i, int i2, int i3, float f) {
        this.f11037a = list;
        this.f11038b = i;
        this.f11039c = i2;
        this.f11040d = i3;
        this.f11041e = f;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* renamed from: a */
    public static C2660h m11265a(C2644u c2644u) {
        int i;
        int i2;
        float f;
        try {
            c2644u.m11224f(4);
            int m11238t = (c2644u.m11238t() & 3) + 1;
            if (m11238t == 3) {
                throw new IllegalStateException();
            }
            ArrayList arrayList = new ArrayList();
            int m11238t2 = c2644u.m11238t() & 31;
            for (int i3 = 0; i3 < m11238t2; i3++) {
                arrayList.add(m11266b(c2644u));
            }
            int m11238t3 = c2644u.m11238t();
            for (int i4 = 0; i4 < m11238t3; i4++) {
                arrayList.add(m11266b(c2644u));
            }
            if (m11238t2 > 0) {
                C2642s.b m11186b = C2642s.m11186b((byte[]) arrayList.get(0), m11238t, ((byte[]) arrayList.get(0)).length);
                int i5 = m11186b.f10991e;
                int i6 = m11186b.f10992f;
                f = m11186b.f10993g;
                i = i5;
                i2 = i6;
            } else {
                i = -1;
                i2 = -1;
                f = 1.0f;
            }
            return new C2660h(arrayList, m11238t, i, i2, f);
        } catch (ArrayIndexOutOfBoundsException e2) {
            throw new C2683z("Error parsing AVC config", e2);
        }
    }

    /* renamed from: b */
    private static byte[] m11266b(C2644u c2644u) {
        int m11244z = c2644u.m11244z();
        int m11217c = c2644u.m11217c();
        c2644u.m11224f(m11244z);
        return C2630g.m11122a(c2644u.f11004a, m11217c, m11244z);
    }
}
