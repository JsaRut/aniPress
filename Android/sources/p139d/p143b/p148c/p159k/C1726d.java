package p139d.p143b.p148c.p159k;

import java.io.InputStream;
import p139d.p143b.p148c.p152d.C1691j;

/* renamed from: d.b.c.k.d */
/* loaded from: classes.dex */
public class C1726d {
    /* renamed from: a */
    public static long m7077a(InputStream inputStream, long j) {
        C1691j.m6971a(inputStream);
        C1691j.m6974a(j >= 0);
        long j2 = j;
        while (j2 > 0) {
            long skip = inputStream.skip(j2);
            if (skip <= 0) {
                if (inputStream.read() == -1) {
                    return j - j2;
                }
                skip = 1;
            }
            j2 -= skip;
        }
        return j;
    }
}
