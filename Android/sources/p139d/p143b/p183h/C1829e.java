package p139d.p143b.p183h;

import java.io.UnsupportedEncodingException;
import p139d.p143b.p148c.p152d.C1691j;

/* renamed from: d.b.h.e */
/* loaded from: classes.dex */
public class C1829e {
    /* JADX WARN: Code restructure failed: missing block: B:10:0x0016, code lost:            if (r1 > r9) goto L28;     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x001a, code lost:            if (r8[r1] == r2) goto L29;     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x001d, code lost:            if (r1 > r9) goto L26;     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x001f, code lost:            r3 = r1 + 1;        r5 = (r3 + r11) - 1;     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0024, code lost:            if (r3 >= r5) goto L31;     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x002a, code lost:            if (r8[r3] != r10[r4]) goto L32;     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x002c, code lost:            r3 = r3 + 1;        r4 = r4 + 1;     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0031, code lost:            if (r3 != r5) goto L27;     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0033, code lost:            return r1;     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0034, code lost:            r1 = r1 + 1;     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0013, code lost:            if (r8[r1] != r2) goto L9;     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0015, code lost:            r1 = r1 + 1;     */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int m7526a(byte[] r8, int r9, byte[] r10, int r11) {
        /*
            p139d.p143b.p148c.p152d.C1691j.m6971a(r8)
            p139d.p143b.p148c.p152d.C1691j.m6971a(r10)
            r0 = -1
            if (r11 <= r9) goto La
            return r0
        La:
            r1 = 0
            r2 = r10[r1]
            int r9 = r9 - r11
        Le:
            if (r1 > r9) goto L37
            r3 = r8[r1]
            r4 = 1
            if (r3 == r2) goto L1d
        L15:
            int r1 = r1 + r4
            if (r1 > r9) goto L1d
            r3 = r8[r1]
            if (r3 == r2) goto L1d
            goto L15
        L1d:
            if (r1 > r9) goto L34
            int r3 = r1 + 1
            int r5 = r3 + r11
            int r5 = r5 - r4
        L24:
            if (r3 >= r5) goto L31
            r6 = r8[r3]
            r7 = r10[r4]
            if (r6 != r7) goto L31
            int r3 = r3 + 1
            int r4 = r4 + 1
            goto L24
        L31:
            if (r3 != r5) goto L34
            return r1
        L34:
            int r1 = r1 + 1
            goto Le
        L37:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p139d.p143b.p183h.C1829e.m7526a(byte[], int, byte[], int):int");
    }

    /* renamed from: a */
    public static boolean m7527a(byte[] bArr, byte[] bArr2) {
        C1691j.m6971a(bArr);
        C1691j.m6971a(bArr2);
        if (bArr2.length > bArr.length) {
            return false;
        }
        for (int i = 0; i < bArr2.length; i++) {
            if (bArr[i] != bArr2[i]) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: a */
    public static byte[] m7528a(String str) {
        C1691j.m6971a(str);
        try {
            return str.getBytes("ASCII");
        } catch (UnsupportedEncodingException e2) {
            throw new RuntimeException("ASCII not found!", e2);
        }
    }
}
