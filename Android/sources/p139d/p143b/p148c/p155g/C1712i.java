package p139d.p143b.p148c.p155g;

import java.io.InputStream;
import p139d.p143b.p148c.p152d.C1691j;

/* renamed from: d.b.c.g.i */
/* loaded from: classes.dex */
public class C1712i extends InputStream {

    /* renamed from: a */
    final InterfaceC1710g f6233a;

    /* renamed from: b */
    int f6234b;

    /* renamed from: c */
    int f6235c;

    public C1712i(InterfaceC1710g interfaceC1710g) {
        C1691j.m6974a(!interfaceC1710g.isClosed());
        C1691j.m6971a(interfaceC1710g);
        this.f6233a = interfaceC1710g;
        this.f6234b = 0;
        this.f6235c = 0;
    }

    @Override // java.io.InputStream
    public int available() {
        return this.f6233a.size() - this.f6234b;
    }

    @Override // java.io.InputStream
    public void mark(int i) {
        this.f6235c = this.f6234b;
    }

    @Override // java.io.InputStream
    public boolean markSupported() {
        return true;
    }

    @Override // java.io.InputStream
    public int read() {
        if (available() <= 0) {
            return -1;
        }
        InterfaceC1710g interfaceC1710g = this.f6233a;
        int i = this.f6234b;
        this.f6234b = i + 1;
        return interfaceC1710g.mo5032a(i) & 255;
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr) {
        return read(bArr, 0, bArr.length);
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i, int i2) {
        if (i < 0 || i2 < 0 || i + i2 > bArr.length) {
            throw new ArrayIndexOutOfBoundsException("length=" + bArr.length + "; regionStart=" + i + "; regionLength=" + i2);
        }
        int available = available();
        if (available <= 0) {
            return -1;
        }
        if (i2 <= 0) {
            return 0;
        }
        int min = Math.min(available, i2);
        this.f6233a.mo5033a(this.f6234b, bArr, i, min);
        this.f6234b += min;
        return min;
    }

    @Override // java.io.InputStream
    public void reset() {
        this.f6234b = this.f6235c;
    }

    @Override // java.io.InputStream
    public long skip(long j) {
        C1691j.m6974a(j >= 0);
        int min = Math.min((int) j, available());
        this.f6234b += min;
        return min;
    }
}
