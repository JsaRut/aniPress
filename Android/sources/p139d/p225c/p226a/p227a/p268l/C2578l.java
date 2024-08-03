package p139d.p225c.p226a.p227a.p268l;

import java.util.Arrays;

/* renamed from: d.c.a.a.l.l */
/* loaded from: classes.dex */
public final class C2578l {

    /* renamed from: a */
    public final int f10726a;

    /* renamed from: b */
    private final InterfaceC2577k[] f10727b;

    /* renamed from: c */
    private int f10728c;

    public C2578l(InterfaceC2577k... interfaceC2577kArr) {
        this.f10727b = interfaceC2577kArr;
        this.f10726a = interfaceC2577kArr.length;
    }

    /* renamed from: a */
    public InterfaceC2577k m10887a(int i) {
        return this.f10727b[i];
    }

    /* renamed from: a */
    public InterfaceC2577k[] m10888a() {
        return (InterfaceC2577k[]) this.f10727b.clone();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C2578l.class != obj.getClass()) {
            return false;
        }
        return Arrays.equals(this.f10727b, ((C2578l) obj).f10727b);
    }

    public int hashCode() {
        if (this.f10728c == 0) {
            this.f10728c = 527 + Arrays.hashCode(this.f10727b);
        }
        return this.f10728c;
    }
}
