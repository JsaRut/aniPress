package com.facebook.react.modules.network;

import java.io.FilterOutputStream;
import java.io.OutputStream;

/* renamed from: com.facebook.react.modules.network.b */
/* loaded from: classes.dex */
public class C1210b extends FilterOutputStream {

    /* renamed from: a */
    private long f4606a;

    public C1210b(OutputStream outputStream) {
        super(outputStream);
        this.f4606a = 0L;
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        ((FilterOutputStream) this).out.close();
    }

    public long getCount() {
        return this.f4606a;
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public void write(int i) {
        ((FilterOutputStream) this).out.write(i);
        this.f4606a++;
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public void write(byte[] bArr, int i, int i2) {
        ((FilterOutputStream) this).out.write(bArr, i, i2);
        this.f4606a += i2;
    }
}
