package p139d.p143b.p203j;

import java.io.IOException;
import java.io.InputStream;

/* renamed from: d.b.j.d */
/* loaded from: classes.dex */
class C2034d {
    /* renamed from: a */
    public static int m8301a(InputStream inputStream, int i, boolean z) {
        int i2;
        int i3 = 0;
        for (int i4 = 0; i4 < i; i4++) {
            int read = inputStream.read();
            if (read == -1) {
                throw new IOException("no more bytes");
            }
            if (z) {
                i2 = (read & 255) << (i4 * 8);
            } else {
                i3 <<= 8;
                i2 = read & 255;
            }
            i3 |= i2;
        }
        return i3;
    }
}
