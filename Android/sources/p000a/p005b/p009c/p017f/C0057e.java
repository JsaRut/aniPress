package p000a.p005b.p009c.p017f;

import java.util.Comparator;

/* renamed from: a.b.c.f.e */
/* loaded from: classes.dex */
class C0057e implements Comparator<byte[]> {
    @Override // java.util.Comparator
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compare(byte[] bArr, byte[] bArr2) {
        int i;
        int i2;
        if (bArr.length == bArr2.length) {
            for (int i3 = 0; i3 < bArr.length; i3++) {
                if (bArr[i3] != bArr2[i3]) {
                    i = bArr[i3];
                    i2 = bArr2[i3];
                }
            }
            return 0;
        }
        i = bArr.length;
        i2 = bArr2.length;
        return i - i2;
    }
}
