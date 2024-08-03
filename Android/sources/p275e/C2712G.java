package p275e;

import java.nio.charset.Charset;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: e.G */
/* loaded from: classes.dex */
public final class C2712G {

    /* renamed from: a */
    public static final Charset f11379a = Charset.forName("UTF-8");

    /* renamed from: a */
    public static int m11659a(int i) {
        return ((i & 255) << 24) | (((-16777216) & i) >>> 24) | ((16711680 & i) >>> 8) | ((65280 & i) << 8);
    }

    /* renamed from: a */
    public static short m11660a(short s) {
        int i = s & 65535;
        return (short) (((i & 255) << 8) | ((65280 & i) >>> 8));
    }

    /* renamed from: a */
    public static void m11661a(long j, long j2, long j3) {
        if ((j2 | j3) < 0 || j2 > j || j - j2 < j3) {
            throw new ArrayIndexOutOfBoundsException(String.format("size=%s offset=%s byteCount=%s", Long.valueOf(j), Long.valueOf(j2), Long.valueOf(j3)));
        }
    }

    /* renamed from: a */
    public static void m11662a(Throwable th) {
        m11664b(th);
        throw null;
    }

    /* renamed from: a */
    public static boolean m11663a(byte[] bArr, int i, byte[] bArr2, int i2, int i3) {
        for (int i4 = 0; i4 < i3; i4++) {
            if (bArr[i4 + i] != bArr2[i4 + i2]) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: b */
    private static <T extends Throwable> void m11664b(Throwable th) {
        throw th;
    }
}
