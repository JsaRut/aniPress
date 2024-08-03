package p275e;

import java.io.InputStream;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: e.f */
/* loaded from: classes.dex */
public class C2718f extends InputStream {

    /* renamed from: a */
    final /* synthetic */ C2719g f11387a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C2718f(C2719g c2719g) {
        this.f11387a = c2719g;
    }

    @Override // java.io.InputStream
    public int available() {
        return (int) Math.min(this.f11387a.f11390c, 2147483647L);
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
    }

    @Override // java.io.InputStream
    public int read() {
        C2719g c2719g = this.f11387a;
        if (c2719g.f11390c > 0) {
            return c2719g.readByte() & 255;
        }
        return -1;
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i, int i2) {
        return this.f11387a.m11668a(bArr, i, i2);
    }

    public String toString() {
        return this.f11387a + ".inputStream()";
    }
}
