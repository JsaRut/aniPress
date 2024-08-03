package p139d.p143b.p184i.p194h;

import java.io.IOException;
import p139d.p143b.p148c.p152d.C1683b;
import p139d.p143b.p148c.p152d.C1691j;
import p139d.p143b.p148c.p152d.C1699r;
import p139d.p143b.p148c.p155g.C1709f;
import p139d.p143b.p148c.p155g.InterfaceC1704a;
import p139d.p143b.p148c.p159k.C1726d;
import p139d.p143b.p184i.p196j.C1920d;

/* renamed from: d.b.i.h.g */
/* loaded from: classes.dex */
public class C1913g {

    /* renamed from: a */
    private int f7055a;

    /* renamed from: b */
    private int f7056b;

    /* renamed from: c */
    private int f7057c;

    /* renamed from: d */
    private int f7058d;

    /* renamed from: e */
    private int f7059e;

    /* renamed from: f */
    private int f7060f;

    /* renamed from: g */
    private boolean f7061g;

    /* renamed from: h */
    private final InterfaceC1704a f7062h;

    public C1913g(InterfaceC1704a interfaceC1704a) {
        C1691j.m6971a(interfaceC1704a);
        this.f7062h = interfaceC1704a;
        this.f7057c = 0;
        this.f7056b = 0;
        this.f7058d = 0;
        this.f7060f = 0;
        this.f7059e = 0;
        this.f7055a = 0;
    }

    /* renamed from: a */
    private static boolean m7882a(int i) {
        if (i == 1) {
            return false;
        }
        return ((i >= 208 && i <= 215) || i == 217 || i == 216) ? false : true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:58:0x0083, code lost:            if (r9.f7055a == 6) goto L69;     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0087, code lost:            if (r9.f7059e == r0) goto L70;     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0089, code lost:            return true;     */
    /* JADX WARN: Code restructure failed: missing block: B:62:?, code lost:            return false;     */
    /* JADX WARN: Code restructure failed: missing block: B:63:?, code lost:            return false;     */
    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private boolean m7883a(java.io.InputStream r10) {
        /*
            r9 = this;
            int r0 = r9.f7059e
        L2:
            int r1 = r9.f7055a     // Catch: java.io.IOException -> L8b
            r2 = 0
            r3 = 1
            r4 = 6
            if (r1 == r4) goto L81
            int r1 = r10.read()     // Catch: java.io.IOException -> L8b
            r5 = -1
            if (r1 == r5) goto L81
            int r5 = r9.f7057c     // Catch: java.io.IOException -> L8b
            int r5 = r5 + r3
            r9.f7057c = r5     // Catch: java.io.IOException -> L8b
            boolean r5 = r9.f7061g     // Catch: java.io.IOException -> L8b
            if (r5 == 0) goto L1e
            r9.f7055a = r4     // Catch: java.io.IOException -> L8b
            r9.f7061g = r2     // Catch: java.io.IOException -> L8b
            return r2
        L1e:
            int r5 = r9.f7055a     // Catch: java.io.IOException -> L8b
            r6 = 255(0xff, float:3.57E-43)
            if (r5 == 0) goto L7b
            r7 = 2
            if (r5 == r3) goto L76
            r4 = 3
            if (r5 == r7) goto L73
            r8 = 4
            if (r5 == r4) goto L4b
            r3 = 5
            if (r5 == r8) goto L48
            if (r5 == r3) goto L36
            p139d.p143b.p148c.p152d.C1691j.m6978b(r2)     // Catch: java.io.IOException -> L8b
            goto L7e
        L36:
            int r2 = r9.f7056b     // Catch: java.io.IOException -> L8b
            int r2 = r2 << 8
            int r2 = r2 + r1
            int r2 = r2 - r7
            long r3 = (long) r2     // Catch: java.io.IOException -> L8b
            p139d.p143b.p148c.p159k.C1726d.m7077a(r10, r3)     // Catch: java.io.IOException -> L8b
            int r3 = r9.f7057c     // Catch: java.io.IOException -> L8b
            int r3 = r3 + r2
            r9.f7057c = r3     // Catch: java.io.IOException -> L8b
        L45:
            r9.f7055a = r7     // Catch: java.io.IOException -> L8b
            goto L7e
        L48:
            r9.f7055a = r3     // Catch: java.io.IOException -> L8b
            goto L7e
        L4b:
            if (r1 != r6) goto L50
        L4d:
            r9.f7055a = r4     // Catch: java.io.IOException -> L8b
            goto L7e
        L50:
            if (r1 != 0) goto L53
            goto L45
        L53:
            r2 = 217(0xd9, float:3.04E-43)
            if (r1 != r2) goto L60
            r9.f7061g = r3     // Catch: java.io.IOException -> L8b
            int r2 = r9.f7057c     // Catch: java.io.IOException -> L8b
            int r2 = r2 - r7
            r9.m7884b(r2)     // Catch: java.io.IOException -> L8b
            goto L45
        L60:
            r2 = 218(0xda, float:3.05E-43)
            if (r1 != r2) goto L6a
            int r2 = r9.f7057c     // Catch: java.io.IOException -> L8b
            int r2 = r2 - r7
            r9.m7884b(r2)     // Catch: java.io.IOException -> L8b
        L6a:
            boolean r2 = m7882a(r1)     // Catch: java.io.IOException -> L8b
            if (r2 == 0) goto L45
            r9.f7055a = r8     // Catch: java.io.IOException -> L8b
            goto L7e
        L73:
            if (r1 != r6) goto L7e
            goto L4d
        L76:
            r2 = 216(0xd8, float:3.03E-43)
            if (r1 != r2) goto L4d
            goto L45
        L7b:
            if (r1 != r6) goto L4d
            goto L48
        L7e:
            r9.f7056b = r1     // Catch: java.io.IOException -> L8b
            goto L2
        L81:
            int r10 = r9.f7055a
            if (r10 == r4) goto L8a
            int r10 = r9.f7059e
            if (r10 == r0) goto L8a
            r2 = 1
        L8a:
            return r2
        L8b:
            r10 = move-exception
            p139d.p143b.p148c.p152d.C1699r.m6984a(r10)
            r10 = 0
            throw r10
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p139d.p143b.p184i.p194h.C1913g.m7883a(java.io.InputStream):boolean");
    }

    /* renamed from: b */
    private void m7884b(int i) {
        if (this.f7058d > 0) {
            this.f7060f = i;
        }
        int i2 = this.f7058d;
        this.f7058d = i2 + 1;
        this.f7059e = i2;
    }

    /* renamed from: a */
    public int m7885a() {
        return this.f7060f;
    }

    /* renamed from: a */
    public boolean m7886a(C1920d c1920d) {
        if (this.f7055a == 6 || c1920d.m7925v() <= this.f7057c) {
            return false;
        }
        C1709f c1709f = new C1709f(c1920d.m7922s(), this.f7062h.get(16384), this.f7062h);
        try {
            try {
                C1726d.m7077a(c1709f, this.f7057c);
                return m7883a(c1709f);
            } catch (IOException e2) {
                C1699r.m6984a(e2);
                throw null;
            }
        } finally {
            C1683b.m6954a(c1709f);
        }
    }

    /* renamed from: b */
    public int m7887b() {
        return this.f7059e;
    }

    /* renamed from: c */
    public boolean m7888c() {
        return this.f7061g;
    }
}
