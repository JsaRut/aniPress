package p275e;

import java.io.OutputStream;

/* renamed from: e.e */
/* loaded from: classes.dex */
class C2717e extends OutputStream {

    /* renamed from: a */
    final /* synthetic */ C2719g f11386a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C2717e(C2719g c2719g) {
        this.f11386a = c2719g;
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public void flush() {
    }

    public String toString() {
        return this.f11386a + ".outputStream()";
    }

    @Override // java.io.OutputStream
    public void write(int i) {
        this.f11386a.writeByte((int) ((byte) i));
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr, int i, int i2) {
        this.f11386a.write(bArr, i, i2);
    }
}
