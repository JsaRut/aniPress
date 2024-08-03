package p139d.p225c.p226a.p227a.p234f.p240f;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import p139d.p225c.p226a.p227a.C2676s;
import p139d.p225c.p226a.p227a.p231d.C2213m;
import p139d.p225c.p226a.p227a.p234f.p240f.AbstractC2283k;
import p139d.p225c.p226a.p227a.p270n.C2622I;
import p139d.p225c.p226a.p227a.p270n.C2644u;

/* renamed from: d.c.a.a.f.f.i */
/* loaded from: classes.dex */
final class C2281i extends AbstractC2283k {

    /* renamed from: n */
    private static final int f8741n = C2622I.m11078b("Opus");

    /* renamed from: o */
    private static final byte[] f8742o = {79, 112, 117, 115, 72, 101, 97, 100};

    /* renamed from: p */
    private boolean f8743p;

    /* renamed from: a */
    private long m9468a(byte[] bArr) {
        int i = bArr[0] & 255;
        int i2 = i & 3;
        int i3 = 2;
        if (i2 == 0) {
            i3 = 1;
        } else if (i2 != 1 && i2 != 2) {
            i3 = bArr[1] & 63;
        }
        int i4 = i >> 3;
        return i3 * (i4 >= 16 ? 2500 << r1 : i4 >= 12 ? 10000 << (r1 & 1) : (i4 & 3) == 3 ? 60000 : 10000 << r1);
    }

    /* renamed from: a */
    private void m9469a(List<byte[]> list, int i) {
        list.add(ByteBuffer.allocate(8).order(ByteOrder.nativeOrder()).putLong((i * 1000000000) / 48000).array());
    }

    /* renamed from: b */
    public static boolean m9470b(C2644u c2644u) {
        int m11208a = c2644u.m11208a();
        byte[] bArr = f8742o;
        if (m11208a < bArr.length) {
            return false;
        }
        byte[] bArr2 = new byte[bArr.length];
        c2644u.m11214a(bArr2, 0, bArr.length);
        return Arrays.equals(bArr2, f8742o);
    }

    @Override // p139d.p225c.p226a.p227a.p234f.p240f.AbstractC2283k
    /* renamed from: a */
    protected long mo9452a(C2644u c2644u) {
        return m9477b(m9468a(c2644u.f11004a));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p139d.p225c.p226a.p227a.p234f.p240f.AbstractC2283k
    /* renamed from: a */
    public void mo9453a(boolean z) {
        super.mo9453a(z);
        if (z) {
            this.f8743p = false;
        }
    }

    @Override // p139d.p225c.p226a.p227a.p234f.p240f.AbstractC2283k
    /* renamed from: a */
    protected boolean mo9454a(C2644u c2644u, long j, AbstractC2283k.a aVar) {
        if (this.f8743p) {
            boolean z = c2644u.m11226h() == f8741n;
            c2644u.m11222e(0);
            return z;
        }
        byte[] copyOf = Arrays.copyOf(c2644u.f11004a, c2644u.m11219d());
        int i = copyOf[9] & 255;
        int i2 = ((copyOf[11] & 255) << 8) | (copyOf[10] & 255);
        ArrayList arrayList = new ArrayList(3);
        arrayList.add(copyOf);
        m9469a(arrayList, i2);
        m9469a(arrayList, 3840);
        aVar.f8757a = C2676s.m11426a((String) null, "audio/opus", (String) null, -1, -1, i, 48000, arrayList, (C2213m) null, 0, (String) null);
        this.f8743p = true;
        return true;
    }
}
