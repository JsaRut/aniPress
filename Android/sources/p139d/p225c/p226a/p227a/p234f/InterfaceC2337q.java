package p139d.p225c.p226a.p227a.p234f;

import java.util.Arrays;
import p139d.p225c.p226a.p227a.C2676s;
import p139d.p225c.p226a.p227a.p270n.C2644u;

/* renamed from: d.c.a.a.f.q */
/* loaded from: classes.dex */
public interface InterfaceC2337q {

    /* renamed from: d.c.a.a.f.q$a */
    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a */
        public final int f9173a;

        /* renamed from: b */
        public final byte[] f9174b;

        /* renamed from: c */
        public final int f9175c;

        /* renamed from: d */
        public final int f9176d;

        public a(int i, byte[] bArr, int i2, int i3) {
            this.f9173a = i;
            this.f9174b = bArr;
            this.f9175c = i2;
            this.f9176d = i3;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || a.class != obj.getClass()) {
                return false;
            }
            a aVar = (a) obj;
            return this.f9173a == aVar.f9173a && this.f9175c == aVar.f9175c && this.f9176d == aVar.f9176d && Arrays.equals(this.f9174b, aVar.f9174b);
        }

        public int hashCode() {
            return (((((this.f9173a * 31) + Arrays.hashCode(this.f9174b)) * 31) + this.f9175c) * 31) + this.f9176d;
        }
    }

    /* renamed from: a */
    int mo9430a(InterfaceC2289h interfaceC2289h, int i, boolean z);

    /* renamed from: a */
    void mo9431a(long j, int i, int i2, int i3, a aVar);

    /* renamed from: a */
    void mo9432a(C2644u c2644u, int i);

    /* renamed from: a */
    void mo9433a(C2676s c2676s);
}
