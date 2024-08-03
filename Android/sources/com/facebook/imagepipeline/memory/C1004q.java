package com.facebook.imagepipeline.memory;

import p139d.p143b.p148c.p152d.C1691j;
import p139d.p143b.p148c.p155g.AbstractC1713j;
import p139d.p143b.p148c.p156h.C1716b;

/* renamed from: com.facebook.imagepipeline.memory.q */
/* loaded from: classes.dex */
public class C1004q extends AbstractC1713j {

    /* renamed from: a */
    private final C1001n f4160a;

    /* renamed from: b */
    private C1716b<NativeMemoryChunk> f4161b;

    /* renamed from: c */
    private int f4162c;

    /* renamed from: com.facebook.imagepipeline.memory.q$a */
    /* loaded from: classes.dex */
    public static class a extends RuntimeException {
        public a() {
            super("OutputStream no longer valid");
        }
    }

    public C1004q(C1001n c1001n) {
        this(c1001n, c1001n.m5031d());
    }

    public C1004q(C1001n c1001n, int i) {
        C1691j.m6974a(i > 0);
        C1691j.m6971a(c1001n);
        this.f4160a = c1001n;
        this.f4162c = 0;
        this.f4161b = C1716b.m7044a(this.f4160a.get(i), this.f4160a);
    }

    /* renamed from: n */
    private void m5041n() {
        if (!C1716b.m7046c(this.f4161b)) {
            throw new a();
        }
    }

    /* renamed from: b */
    void m5042b(int i) {
        m5041n();
        if (i <= this.f4161b.m7048n().m4978m()) {
            return;
        }
        NativeMemoryChunk nativeMemoryChunk = this.f4160a.get(i);
        this.f4161b.m7048n().m4976a(0, nativeMemoryChunk, 0, this.f4162c);
        this.f4161b.close();
        this.f4161b = C1716b.m7044a(nativeMemoryChunk, this.f4160a);
    }

    @Override // p139d.p143b.p148c.p155g.AbstractC1713j, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        C1716b.m7045b(this.f4161b);
        this.f4161b = null;
        this.f4162c = -1;
        super.close();
    }

    @Override // p139d.p143b.p148c.p155g.AbstractC1713j
    /* renamed from: m */
    public C1002o mo5043m() {
        m5041n();
        return new C1002o(this.f4161b, this.f4162c);
    }

    @Override // p139d.p143b.p148c.p155g.AbstractC1713j
    public int size() {
        return this.f4162c;
    }

    @Override // java.io.OutputStream
    public void write(int i) {
        write(new byte[]{(byte) i});
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr, int i, int i2) {
        if (i >= 0 && i2 >= 0 && i + i2 <= bArr.length) {
            m5041n();
            m5042b(this.f4162c + i2);
            this.f4161b.m7048n().m4977b(this.f4162c, bArr, i, i2);
            this.f4162c += i2;
            return;
        }
        throw new ArrayIndexOutOfBoundsException("length=" + bArr.length + "; regionStart=" + i + "; regionLength=" + i2);
    }
}
