package p139d.p225c.p226a.p227a.p234f.p237c;

import p139d.p225c.p226a.p227a.p234f.InterfaceC2289h;
import p139d.p225c.p226a.p227a.p270n.C2644u;

/* renamed from: d.c.a.a.f.c.h */
/* loaded from: classes.dex */
final class C2245h {

    /* renamed from: a */
    private final C2644u f8343a = new C2644u(8);

    /* renamed from: b */
    private int f8344b;

    /* renamed from: b */
    private long m9261b(InterfaceC2289h interfaceC2289h) {
        int i = 0;
        interfaceC2289h.mo9276a(this.f8343a.f11004a, 0, 1);
        int i2 = this.f8343a.f11004a[0] & 255;
        if (i2 == 0) {
            return Long.MIN_VALUE;
        }
        int i3 = 128;
        int i4 = 0;
        while ((i2 & i3) == 0) {
            i3 >>= 1;
            i4++;
        }
        int i5 = i2 & (i3 ^ (-1));
        interfaceC2289h.mo9276a(this.f8343a.f11004a, 1, i4);
        while (i < i4) {
            i++;
            i5 = (this.f8343a.f11004a[i] & 255) + (i5 << 8);
        }
        this.f8344b += i4 + 1;
        return i5;
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x009a, code lost:            return false;     */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean m9262a(p139d.p225c.p226a.p227a.p234f.InterfaceC2289h r18) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            long r2 = r18.getLength()
            r4 = 1024(0x400, double:5.06E-321)
            r6 = -1
            int r8 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r8 == 0) goto L16
            int r8 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r8 <= 0) goto L15
            goto L16
        L15:
            r4 = r2
        L16:
            int r5 = (int) r4
            d.c.a.a.n.u r4 = r0.f8343a
            byte[] r4 = r4.f11004a
            r8 = 4
            r9 = 0
            r1.mo9276a(r4, r9, r8)
            d.c.a.a.n.u r4 = r0.f8343a
            long r10 = r4.m11240v()
            r0.f8344b = r8
        L28:
            r12 = 440786851(0x1a45dfa3, double:2.1777764E-315)
            r4 = 1
            int r8 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r8 == 0) goto L50
            int r8 = r0.f8344b
            int r8 = r8 + r4
            r0.f8344b = r8
            if (r8 != r5) goto L38
            return r9
        L38:
            d.c.a.a.n.u r8 = r0.f8343a
            byte[] r8 = r8.f11004a
            r1.mo9276a(r8, r9, r4)
            r4 = 8
            long r10 = r10 << r4
            r12 = -256(0xffffffffffffff00, double:NaN)
            long r10 = r10 & r12
            d.c.a.a.n.u r4 = r0.f8343a
            byte[] r4 = r4.f11004a
            r4 = r4[r9]
            r4 = r4 & 255(0xff, float:3.57E-43)
            long r12 = (long) r4
            long r10 = r10 | r12
            goto L28
        L50:
            long r10 = r17.m9261b(r18)
            int r5 = r0.f8344b
            long r12 = (long) r5
            r14 = -9223372036854775808
            int r5 = (r10 > r14 ? 1 : (r10 == r14 ? 0 : -1))
            if (r5 == 0) goto La3
            int r5 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r5 == 0) goto L68
            long r5 = r12 + r10
            int r7 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            if (r7 < 0) goto L68
            goto La3
        L68:
            int r2 = r0.f8344b
            long r5 = (long) r2
            long r7 = r12 + r10
            int r3 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r3 >= 0) goto L9b
            long r2 = r17.m9261b(r18)
            int r5 = (r2 > r14 ? 1 : (r2 == r14 ? 0 : -1))
            if (r5 != 0) goto L7a
            return r9
        L7a:
            long r2 = r17.m9261b(r18)
            r5 = 0
            int r7 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            if (r7 < 0) goto L9a
            r7 = 2147483647(0x7fffffff, double:1.060997895E-314)
            int r16 = (r2 > r7 ? 1 : (r2 == r7 ? 0 : -1))
            if (r16 <= 0) goto L8c
            goto L9a
        L8c:
            int r7 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            if (r7 == 0) goto L68
            int r3 = (int) r2
            r1.mo9275a(r3)
            int r2 = r0.f8344b
            int r2 = r2 + r3
            r0.f8344b = r2
            goto L68
        L9a:
            return r9
        L9b:
            long r1 = (long) r2
            int r3 = (r1 > r7 ? 1 : (r1 == r7 ? 0 : -1))
            if (r3 != 0) goto La1
            goto La2
        La1:
            r4 = 0
        La2:
            return r4
        La3:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: p139d.p225c.p226a.p227a.p234f.p237c.C2245h.m9262a(d.c.a.a.f.h):boolean");
    }
}
