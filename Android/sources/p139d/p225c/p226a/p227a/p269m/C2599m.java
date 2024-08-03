package p139d.p225c.p226a.p227a.p269m;

import java.io.InputStream;
import p139d.p225c.p226a.p227a.p270n.C2628e;

/* renamed from: d.c.a.a.m.m */
/* loaded from: classes.dex */
public final class C2599m extends InputStream {

    /* renamed from: a */
    private final InterfaceC2597k f10776a;

    /* renamed from: b */
    private final C2600n f10777b;

    /* renamed from: f */
    private long f10781f;

    /* renamed from: d */
    private boolean f10779d = false;

    /* renamed from: e */
    private boolean f10780e = false;

    /* renamed from: c */
    private final byte[] f10778c = new byte[1];

    public C2599m(InterfaceC2597k interfaceC2597k, C2600n c2600n) {
        this.f10776a = interfaceC2597k;
        this.f10777b = c2600n;
    }

    /* renamed from: n */
    private void m10924n() {
        if (this.f10779d) {
            return;
        }
        this.f10776a.mo9121a(this.f10777b);
        this.f10779d = true;
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        if (this.f10780e) {
            return;
        }
        this.f10776a.close();
        this.f10780e = true;
    }

    /* renamed from: m */
    public void m10925m() {
        m10924n();
    }

    @Override // java.io.InputStream
    public int read() {
        if (read(this.f10778c) == -1) {
            return -1;
        }
        return this.f10778c[0] & 255;
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr) {
        return read(bArr, 0, bArr.length);
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i, int i2) {
        C2628e.m11113b(!this.f10780e);
        m10924n();
        int read = this.f10776a.read(bArr, i, i2);
        if (read == -1) {
            return -1;
        }
        this.f10781f += read;
        return read;
    }
}
