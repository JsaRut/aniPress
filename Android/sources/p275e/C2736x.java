package p275e;

import java.io.IOException;
import java.io.InputStream;

/* renamed from: e.x */
/* loaded from: classes.dex */
class C2736x extends InputStream {

    /* renamed from: a */
    final /* synthetic */ C2737y f11433a;

    public C2736x(C2737y c2737y) {
        this.f11433a = c2737y;
    }

    @Override // java.io.InputStream
    public int available() {
        C2737y c2737y = this.f11433a;
        if (c2737y.f11436c) {
            throw new IOException("closed");
        }
        return (int) Math.min(c2737y.f11434a.f11390c, 2147483647L);
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f11433a.close();
    }

    @Override // java.io.InputStream
    public int read() {
        C2737y c2737y = this.f11433a;
        if (c2737y.f11436c) {
            throw new IOException("closed");
        }
        C2719g c2719g = c2737y.f11434a;
        if (c2719g.f11390c == 0 && c2737y.f11435b.read(c2719g, 8192L) == -1) {
            return -1;
        }
        return this.f11433a.f11434a.readByte() & 255;
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i, int i2) {
        if (this.f11433a.f11436c) {
            throw new IOException("closed");
        }
        C2712G.m11661a(bArr.length, i, i2);
        C2737y c2737y = this.f11433a;
        C2719g c2719g = c2737y.f11434a;
        if (c2719g.f11390c == 0 && c2737y.f11435b.read(c2719g, 8192L) == -1) {
            return -1;
        }
        return this.f11433a.f11434a.m11668a(bArr, i, i2);
    }

    public String toString() {
        return this.f11433a + ".inputStream()";
    }
}
