package p139d.p225c.p226a.p227a.p250j;

/* renamed from: d.c.a.a.j.q */
/* loaded from: classes.dex */
public class C2507q implements InterfaceC2405F {

    /* renamed from: a */
    protected final InterfaceC2405F[] f10203a;

    public C2507q(InterfaceC2405F[] interfaceC2405FArr) {
        this.f10203a = interfaceC2405FArr;
    }

    @Override // p139d.p225c.p226a.p227a.p250j.InterfaceC2405F
    /* renamed from: b */
    public final long mo9880b() {
        long j = Long.MAX_VALUE;
        for (InterfaceC2405F interfaceC2405F : this.f10203a) {
            long mo9880b = interfaceC2405F.mo9880b();
            if (mo9880b != Long.MIN_VALUE) {
                j = Math.min(j, mo9880b);
            }
        }
        if (j == Long.MAX_VALUE) {
            return Long.MIN_VALUE;
        }
        return j;
    }

    @Override // p139d.p225c.p226a.p227a.p250j.InterfaceC2405F
    /* renamed from: b */
    public boolean mo9882b(long j) {
        boolean z;
        boolean z2 = false;
        do {
            long mo9880b = mo9880b();
            if (mo9880b == Long.MIN_VALUE) {
                break;
            }
            z = false;
            for (InterfaceC2405F interfaceC2405F : this.f10203a) {
                long mo9880b2 = interfaceC2405F.mo9880b();
                boolean z3 = mo9880b2 != Long.MIN_VALUE && mo9880b2 <= j;
                if (mo9880b2 == mo9880b || z3) {
                    z |= interfaceC2405F.mo9882b(j);
                }
            }
            z2 |= z;
        } while (z);
        return z2;
    }

    @Override // p139d.p225c.p226a.p227a.p250j.InterfaceC2405F
    /* renamed from: c */
    public final void mo9883c(long j) {
        for (InterfaceC2405F interfaceC2405F : this.f10203a) {
            interfaceC2405F.mo9883c(j);
        }
    }

    @Override // p139d.p225c.p226a.p227a.p250j.InterfaceC2405F
    /* renamed from: g */
    public final long mo9887g() {
        long j = Long.MAX_VALUE;
        for (InterfaceC2405F interfaceC2405F : this.f10203a) {
            long mo9887g = interfaceC2405F.mo9887g();
            if (mo9887g != Long.MIN_VALUE) {
                j = Math.min(j, mo9887g);
            }
        }
        if (j == Long.MAX_VALUE) {
            return Long.MIN_VALUE;
        }
        return j;
    }
}
