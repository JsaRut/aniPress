package p139d.p143b.p148c.p158j;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: d.b.c.j.a */
/* loaded from: classes.dex */
public class C1721a extends FilterInputStream {

    /* renamed from: a */
    private int f6261a;

    /* renamed from: b */
    private int f6262b;

    public C1721a(InputStream inputStream, int i) {
        super(inputStream);
        if (inputStream == null) {
            throw new NullPointerException();
        }
        if (i < 0) {
            throw new IllegalArgumentException("limit must be >= 0");
        }
        this.f6261a = i;
        this.f6262b = -1;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int available() {
        return Math.min(((FilterInputStream) this).in.available(), this.f6261a);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public void mark(int i) {
        if (((FilterInputStream) this).in.markSupported()) {
            ((FilterInputStream) this).in.mark(i);
            this.f6262b = this.f6261a;
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read() {
        if (this.f6261a == 0) {
            return -1;
        }
        int read = ((FilterInputStream) this).in.read();
        if (read != -1) {
            this.f6261a--;
        }
        return read;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read(byte[] bArr, int i, int i2) {
        int i3 = this.f6261a;
        if (i3 == 0) {
            return -1;
        }
        int read = ((FilterInputStream) this).in.read(bArr, i, Math.min(i2, i3));
        if (read > 0) {
            this.f6261a -= read;
        }
        return read;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public void reset() {
        if (!((FilterInputStream) this).in.markSupported()) {
            throw new IOException("mark is not supported");
        }
        if (this.f6262b == -1) {
            throw new IOException("mark not set");
        }
        ((FilterInputStream) this).in.reset();
        this.f6261a = this.f6262b;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public long skip(long j) {
        long skip = ((FilterInputStream) this).in.skip(Math.min(j, this.f6261a));
        this.f6261a = (int) (this.f6261a - skip);
        return skip;
    }
}
