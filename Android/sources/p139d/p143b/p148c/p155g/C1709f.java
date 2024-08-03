package p139d.p143b.p148c.p155g;

import java.io.IOException;
import java.io.InputStream;
import p139d.p143b.p148c.p152d.C1691j;
import p139d.p143b.p148c.p153e.C1700a;
import p139d.p143b.p148c.p156h.InterfaceC1718d;

/* renamed from: d.b.c.g.f */
/* loaded from: classes.dex */
public class C1709f extends InputStream {

    /* renamed from: a */
    private final InputStream f6227a;

    /* renamed from: b */
    private final byte[] f6228b;

    /* renamed from: c */
    private final InterfaceC1718d<byte[]> f6229c;

    /* renamed from: d */
    private int f6230d;

    /* renamed from: e */
    private int f6231e;

    /* renamed from: f */
    private boolean f6232f;

    public C1709f(InputStream inputStream, byte[] bArr, InterfaceC1718d<byte[]> interfaceC1718d) {
        C1691j.m6971a(inputStream);
        this.f6227a = inputStream;
        C1691j.m6971a(bArr);
        this.f6228b = bArr;
        C1691j.m6971a(interfaceC1718d);
        this.f6229c = interfaceC1718d;
        this.f6230d = 0;
        this.f6231e = 0;
        this.f6232f = false;
    }

    /* renamed from: m */
    private boolean m7039m() {
        if (this.f6231e < this.f6230d) {
            return true;
        }
        int read = this.f6227a.read(this.f6228b);
        if (read <= 0) {
            return false;
        }
        this.f6230d = read;
        this.f6231e = 0;
        return true;
    }

    /* renamed from: n */
    private void m7040n() {
        if (this.f6232f) {
            throw new IOException("stream already closed");
        }
    }

    @Override // java.io.InputStream
    public int available() {
        C1691j.m6978b(this.f6231e <= this.f6230d);
        m7040n();
        return (this.f6230d - this.f6231e) + this.f6227a.available();
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        if (this.f6232f) {
            return;
        }
        this.f6232f = true;
        this.f6229c.mo4987a(this.f6228b);
        super.close();
    }

    protected void finalize() {
        if (!this.f6232f) {
            C1700a.m7006b("PooledByteInputStream", "Finalized without closing");
            close();
        }
        super.finalize();
    }

    @Override // java.io.InputStream
    public int read() {
        C1691j.m6978b(this.f6231e <= this.f6230d);
        m7040n();
        if (!m7039m()) {
            return -1;
        }
        byte[] bArr = this.f6228b;
        int i = this.f6231e;
        this.f6231e = i + 1;
        return bArr[i] & 255;
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i, int i2) {
        C1691j.m6978b(this.f6231e <= this.f6230d);
        m7040n();
        if (!m7039m()) {
            return -1;
        }
        int min = Math.min(this.f6230d - this.f6231e, i2);
        System.arraycopy(this.f6228b, this.f6231e, bArr, i, min);
        this.f6231e += min;
        return min;
    }

    @Override // java.io.InputStream
    public long skip(long j) {
        C1691j.m6978b(this.f6231e <= this.f6230d);
        m7040n();
        int i = this.f6230d;
        int i2 = this.f6231e;
        long j2 = i - i2;
        if (j2 >= j) {
            this.f6231e = (int) (i2 + j);
            return j;
        }
        this.f6231e = i;
        return j2 + this.f6227a.skip(j - j2);
    }
}
