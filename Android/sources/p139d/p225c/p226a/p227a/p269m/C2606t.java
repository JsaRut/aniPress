package p139d.p225c.p226a.p227a.p269m;

import java.io.IOException;
import p139d.p225c.p226a.p227a.C2683z;
import p139d.p225c.p226a.p227a.p269m.InterfaceC2609w;

/* renamed from: d.c.a.a.m.t */
/* loaded from: classes.dex */
public class C2606t implements InterfaceC2610x {

    /* renamed from: a */
    private final int f10832a;

    public C2606t() {
        this(-1);
    }

    public C2606t(int i) {
        this.f10832a = i;
    }

    @Override // p139d.p225c.p226a.p227a.p269m.InterfaceC2610x
    /* renamed from: a */
    public int mo10948a(int i) {
        int i2 = this.f10832a;
        return i2 == -1 ? i == 7 ? 6 : 3 : i2;
    }

    @Override // p139d.p225c.p226a.p227a.p269m.InterfaceC2610x
    /* renamed from: a */
    public long mo10949a(int i, long j, IOException iOException, int i2) {
        if (iOException instanceof C2683z) {
            return -9223372036854775807L;
        }
        return Math.min((i2 - 1) * 1000, 5000);
    }

    @Override // p139d.p225c.p226a.p227a.p269m.InterfaceC2610x
    /* renamed from: b */
    public long mo10950b(int i, long j, IOException iOException, int i2) {
        if (!(iOException instanceof InterfaceC2609w.e)) {
            return -9223372036854775807L;
        }
        int i3 = ((InterfaceC2609w.e) iOException).f10842c;
        return (i3 == 404 || i3 == 410) ? 60000L : -9223372036854775807L;
    }
}
