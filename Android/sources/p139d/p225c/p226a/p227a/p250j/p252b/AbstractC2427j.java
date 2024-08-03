package p139d.p225c.p226a.p227a.p250j.p252b;

import java.util.Arrays;
import p139d.p225c.p226a.p227a.C2676s;
import p139d.p225c.p226a.p227a.p269m.C2600n;
import p139d.p225c.p226a.p227a.p269m.InterfaceC2597k;
import p139d.p225c.p226a.p227a.p270n.C2622I;

/* renamed from: d.c.a.a.j.b.j */
/* loaded from: classes.dex */
public abstract class AbstractC2427j extends AbstractC2421d {

    /* renamed from: i */
    private byte[] f9571i;

    /* renamed from: j */
    private volatile boolean f9572j;

    public AbstractC2427j(InterfaceC2597k interfaceC2597k, C2600n c2600n, int i, C2676s c2676s, int i2, Object obj, byte[] bArr) {
        super(interfaceC2597k, c2600n, i, c2676s, i2, obj, -9223372036854775807L, -9223372036854775807L);
        this.f9571i = bArr;
    }

    /* renamed from: a */
    private void m10034a(int i) {
        byte[] copyOf;
        byte[] bArr = this.f9571i;
        if (bArr == null) {
            copyOf = new byte[16384];
        } else if (bArr.length >= i + 16384) {
            return;
        } else {
            copyOf = Arrays.copyOf(bArr, bArr.length + 16384);
        }
        this.f9571i = copyOf;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // p139d.p225c.p226a.p227a.p269m.C2612z.d
    /* renamed from: a */
    public final void mo9973a() {
        try {
            this.f9518h.mo9121a(this.f9511a);
            int i = 0;
            int i2 = 0;
            while (i != -1 && !this.f9572j) {
                m10034a(i2);
                i = this.f9518h.read(this.f9571i, i2, 16384);
                if (i != -1) {
                    i2 += i;
                }
            }
            if (!this.f9572j) {
                mo10035a(this.f9571i, i2);
            }
        } finally {
            C2622I.m11060a((InterfaceC2597k) this.f9518h);
        }
    }

    /* renamed from: a */
    protected abstract void mo10035a(byte[] bArr, int i);

    @Override // p139d.p225c.p226a.p227a.p269m.C2612z.d
    /* renamed from: b */
    public final void mo9974b() {
        this.f9572j = true;
    }

    /* renamed from: g */
    public byte[] m10036g() {
        return this.f9571i;
    }
}
