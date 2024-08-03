package p275e;

import java.io.IOException;
import java.io.OutputStream;

/* renamed from: e.v */
/* loaded from: classes.dex */
class C2734v extends OutputStream {

    /* renamed from: a */
    final /* synthetic */ C2735w f11429a;

    public C2734v(C2735w c2735w) {
        this.f11429a = c2735w;
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f11429a.close();
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public void flush() {
        C2735w c2735w = this.f11429a;
        if (c2735w.f11432c) {
            return;
        }
        c2735w.flush();
    }

    public String toString() {
        return this.f11429a + ".outputStream()";
    }

    @Override // java.io.OutputStream
    public void write(int i) {
        C2735w c2735w = this.f11429a;
        if (c2735w.f11432c) {
            throw new IOException("closed");
        }
        c2735w.f11430a.writeByte((int) ((byte) i));
        this.f11429a.mo11697e();
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr, int i, int i2) {
        C2735w c2735w = this.f11429a;
        if (c2735w.f11432c) {
            throw new IOException("closed");
        }
        c2735w.f11430a.write(bArr, i, i2);
        this.f11429a.mo11697e();
    }
}
