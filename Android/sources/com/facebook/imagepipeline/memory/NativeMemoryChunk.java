package com.facebook.imagepipeline.memory;

import android.util.Log;
import com.facebook.imagepipeline.nativecode.C1012a;
import java.io.Closeable;
import p139d.p143b.p148c.p152d.C1691j;
import p139d.p143b.p148c.p152d.InterfaceC1685d;

@InterfaceC1685d
/* loaded from: classes.dex */
public class NativeMemoryChunk implements Closeable {

    /* renamed from: a */
    private final long f4120a;

    /* renamed from: b */
    private final int f4121b;

    /* renamed from: c */
    private boolean f4122c;

    static {
        C1012a.m5085a();
    }

    public NativeMemoryChunk() {
        this.f4121b = 0;
        this.f4120a = 0L;
        this.f4122c = true;
    }

    public NativeMemoryChunk(int i) {
        C1691j.m6974a(i > 0);
        this.f4121b = i;
        this.f4120a = nativeAllocate(this.f4121b);
        this.f4122c = false;
    }

    /* renamed from: a */
    private int m4971a(int i, int i2) {
        return Math.min(Math.max(0, this.f4121b - i), i2);
    }

    /* renamed from: a */
    private void m4972a(int i, int i2, int i3, int i4) {
        C1691j.m6974a(i4 >= 0);
        C1691j.m6974a(i >= 0);
        C1691j.m6974a(i3 >= 0);
        C1691j.m6974a(i + i4 <= this.f4121b);
        C1691j.m6974a(i3 + i4 <= i2);
    }

    /* renamed from: b */
    private void m4973b(int i, NativeMemoryChunk nativeMemoryChunk, int i2, int i3) {
        C1691j.m6978b(!isClosed());
        C1691j.m6978b(!nativeMemoryChunk.isClosed());
        m4972a(i, nativeMemoryChunk.f4121b, i2, i3);
        nativeMemcpy(nativeMemoryChunk.f4120a + i2, this.f4120a + i, i3);
    }

    @InterfaceC1685d
    private static native long nativeAllocate(int i);

    @InterfaceC1685d
    private static native void nativeCopyFromByteArray(long j, byte[] bArr, int i, int i2);

    @InterfaceC1685d
    private static native void nativeCopyToByteArray(long j, byte[] bArr, int i, int i2);

    @InterfaceC1685d
    private static native void nativeFree(long j);

    @InterfaceC1685d
    private static native void nativeMemcpy(long j, long j2, int i);

    @InterfaceC1685d
    private static native byte nativeReadByte(long j);

    /* renamed from: a */
    public synchronized byte m4974a(int i) {
        boolean z = true;
        C1691j.m6978b(!isClosed());
        C1691j.m6974a(i >= 0);
        if (i >= this.f4121b) {
            z = false;
        }
        C1691j.m6974a(z);
        return nativeReadByte(this.f4120a + i);
    }

    /* renamed from: a */
    public synchronized int m4975a(int i, byte[] bArr, int i2, int i3) {
        int m4971a;
        C1691j.m6971a(bArr);
        C1691j.m6978b(!isClosed());
        m4971a = m4971a(i, i3);
        m4972a(i, bArr.length, i2, m4971a);
        nativeCopyToByteArray(this.f4120a + i, bArr, i2, m4971a);
        return m4971a;
    }

    /* renamed from: a */
    public void m4976a(int i, NativeMemoryChunk nativeMemoryChunk, int i2, int i3) {
        C1691j.m6971a(nativeMemoryChunk);
        if (nativeMemoryChunk.f4120a == this.f4120a) {
            Log.w("NativeMemoryChunk", "Copying from NativeMemoryChunk " + Integer.toHexString(System.identityHashCode(this)) + " to NativeMemoryChunk " + Integer.toHexString(System.identityHashCode(nativeMemoryChunk)) + " which share the same address " + Long.toHexString(this.f4120a));
            C1691j.m6974a(false);
        }
        if (nativeMemoryChunk.f4120a < this.f4120a) {
            synchronized (nativeMemoryChunk) {
                synchronized (this) {
                    m4973b(i, nativeMemoryChunk, i2, i3);
                }
            }
        } else {
            synchronized (this) {
                synchronized (nativeMemoryChunk) {
                    m4973b(i, nativeMemoryChunk, i2, i3);
                }
            }
        }
    }

    /* renamed from: b */
    public synchronized int m4977b(int i, byte[] bArr, int i2, int i3) {
        int m4971a;
        C1691j.m6971a(bArr);
        C1691j.m6978b(!isClosed());
        m4971a = m4971a(i, i3);
        m4972a(i, bArr.length, i2, m4971a);
        nativeCopyFromByteArray(this.f4120a + i, bArr, i2, m4971a);
        return m4971a;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() {
        if (!this.f4122c) {
            this.f4122c = true;
            nativeFree(this.f4120a);
        }
    }

    protected void finalize() {
        if (isClosed()) {
            return;
        }
        Log.w("NativeMemoryChunk", "finalize: Chunk " + Integer.toHexString(System.identityHashCode(this)) + " still active. Underlying address = " + Long.toHexString(this.f4120a));
        try {
            close();
        } finally {
            super.finalize();
        }
    }

    public synchronized boolean isClosed() {
        return this.f4122c;
    }

    /* renamed from: m */
    public int m4978m() {
        return this.f4121b;
    }
}
