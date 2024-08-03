package p139d.p143b.p148c.p158j;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: d.b.c.j.b */
/* loaded from: classes.dex */
public class C1722b extends FilterInputStream {

    /* renamed from: a */
    private final byte[] f6263a;

    /* renamed from: b */
    private int f6264b;

    /* renamed from: c */
    private int f6265c;

    public C1722b(InputStream inputStream, byte[] bArr) {
        super(inputStream);
        if (inputStream == null) {
            throw new NullPointerException();
        }
        if (bArr == null) {
            throw new NullPointerException();
        }
        this.f6263a = bArr;
    }

    /* renamed from: m */
    private int m7071m() {
        int i = this.f6264b;
        byte[] bArr = this.f6263a;
        if (i >= bArr.length) {
            return -1;
        }
        this.f6264b = i + 1;
        return bArr[i] & 255;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public void mark(int i) {
        if (((FilterInputStream) this).in.markSupported()) {
            super.mark(i);
            this.f6265c = this.f6264b;
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read() {
        int read = ((FilterInputStream) this).in.read();
        return read != -1 ? read : m7071m();
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read(byte[] bArr) {
        return read(bArr, 0, bArr.length);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read(byte[] bArr, int i, int i2) {
        int read = ((FilterInputStream) this).in.read(bArr, i, i2);
        if (read != -1) {
            return read;
        }
        int i3 = 0;
        if (i2 == 0) {
            return 0;
        }
        while (i3 < i2) {
            int m7071m = m7071m();
            if (m7071m == -1) {
                break;
            }
            bArr[i + i3] = (byte) m7071m;
            i3++;
        }
        if (i3 > 0) {
            return i3;
        }
        return -1;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public void reset() {
        if (!((FilterInputStream) this).in.markSupported()) {
            throw new IOException("mark is not supported");
        }
        ((FilterInputStream) this).in.reset();
        this.f6264b = this.f6265c;
    }
}
