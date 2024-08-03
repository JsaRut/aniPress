package p139d.p143b.p148c.p152d;

import java.io.InputStream;
import java.io.OutputStream;

/* renamed from: d.b.c.d.a */
/* loaded from: classes.dex */
public final class C1682a {
    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* renamed from: a */
    public static int m6951a(InputStream inputStream, byte[] bArr, int i, int i2) {
        C1691j.m6971a(inputStream);
        C1691j.m6971a(bArr);
        if (i2 < 0) {
            throw new IndexOutOfBoundsException("len is negative");
        }
        int i3 = 0;
        while (i3 < i2) {
            int read = inputStream.read(bArr, i + i3, i2 - i3);
            if (read == -1) {
                break;
            }
            i3 += read;
        }
        return i3;
    }

    /* renamed from: a */
    public static long m6952a(InputStream inputStream, OutputStream outputStream) {
        C1691j.m6971a(inputStream);
        C1691j.m6971a(outputStream);
        byte[] bArr = new byte[4096];
        long j = 0;
        while (true) {
            int read = inputStream.read(bArr);
            if (read == -1) {
                return j;
            }
            outputStream.write(bArr, 0, read);
            j += read;
        }
    }
}
