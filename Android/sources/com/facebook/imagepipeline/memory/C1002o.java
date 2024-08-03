package com.facebook.imagepipeline.memory;

import p139d.p143b.p148c.p152d.C1691j;
import p139d.p143b.p148c.p155g.InterfaceC1710g;
import p139d.p143b.p148c.p156h.C1716b;

/* renamed from: com.facebook.imagepipeline.memory.o */
/* loaded from: classes.dex */
public class C1002o implements InterfaceC1710g {

    /* renamed from: a */
    private final int f4156a;

    /* renamed from: b */
    C1716b<NativeMemoryChunk> f4157b;

    public C1002o(C1716b<NativeMemoryChunk> c1716b, int i) {
        C1691j.m6971a(c1716b);
        C1691j.m6974a(i >= 0 && i <= c1716b.m7048n().m4978m());
        this.f4157b = c1716b.m11778clone();
        this.f4156a = i;
    }

    @Override // p139d.p143b.p148c.p155g.InterfaceC1710g
    /* renamed from: a */
    public synchronized byte mo5032a(int i) {
        m5034a();
        boolean z = true;
        C1691j.m6974a(i >= 0);
        if (i >= this.f4156a) {
            z = false;
        }
        C1691j.m6974a(z);
        return this.f4157b.m7048n().m4974a(i);
    }

    @Override // p139d.p143b.p148c.p155g.InterfaceC1710g
    /* renamed from: a */
    public synchronized int mo5033a(int i, byte[] bArr, int i2, int i3) {
        m5034a();
        C1691j.m6974a(i + i3 <= this.f4156a);
        return this.f4157b.m7048n().m4975a(i, bArr, i2, i3);
    }

    /* renamed from: a */
    synchronized void m5034a() {
        if (isClosed()) {
            throw new InterfaceC1710g.a();
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() {
        C1716b.m7045b(this.f4157b);
        this.f4157b = null;
    }

    @Override // p139d.p143b.p148c.p155g.InterfaceC1710g
    public synchronized boolean isClosed() {
        return !C1716b.m7046c(this.f4157b);
    }

    @Override // p139d.p143b.p148c.p155g.InterfaceC1710g
    public synchronized int size() {
        m5034a();
        return this.f4156a;
    }
}
