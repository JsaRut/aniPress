package p139d.p143b.p148c.p152d;

import java.io.FilterOutputStream;
import java.io.OutputStream;

/* renamed from: d.b.c.d.c */
/* loaded from: classes.dex */
public class C1684c extends FilterOutputStream {

    /* renamed from: a */
    private long f6210a;

    public C1684c(OutputStream outputStream) {
        super(outputStream);
        this.f6210a = 0L;
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        ((FilterOutputStream) this).out.close();
    }

    public long getCount() {
        return this.f6210a;
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public void write(int i) {
        ((FilterOutputStream) this).out.write(i);
        this.f6210a++;
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public void write(byte[] bArr, int i, int i2) {
        ((FilterOutputStream) this).out.write(bArr, i, i2);
        this.f6210a += i2;
    }
}
