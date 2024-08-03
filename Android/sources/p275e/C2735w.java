package p275e;

import java.io.OutputStream;
import java.nio.ByteBuffer;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: e.w */
/* loaded from: classes.dex */
public final class C2735w implements InterfaceC2720h {

    /* renamed from: a */
    public final C2719g f11430a = new C2719g();

    /* renamed from: b */
    public final InterfaceC2708C f11431b;

    /* renamed from: c */
    boolean f11432c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C2735w(InterfaceC2708C interfaceC2708C) {
        if (interfaceC2708C == null) {
            throw new NullPointerException("sink == null");
        }
        this.f11431b = interfaceC2708C;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // p275e.InterfaceC2720h
    /* renamed from: a */
    public long mo11671a(InterfaceC2709D interfaceC2709D) {
        if (interfaceC2709D == null) {
            throw new IllegalArgumentException("source == null");
        }
        long j = 0;
        while (true) {
            long read = interfaceC2709D.read(this.f11430a, 8192L);
            if (read == -1) {
                return j;
            }
            j += read;
            mo11697e();
        }
    }

    @Override // p275e.InterfaceC2720h
    /* renamed from: a */
    public C2719g mo11674a() {
        return this.f11430a;
    }

    @Override // p275e.InterfaceC2720h
    /* renamed from: a */
    public InterfaceC2720h mo11676a(C2722j c2722j) {
        if (this.f11432c) {
            throw new IllegalStateException("closed");
        }
        this.f11430a.mo11676a(c2722j);
        mo11697e();
        return this;
    }

    @Override // p275e.InterfaceC2720h
    /* renamed from: a */
    public InterfaceC2720h mo11677a(String str) {
        if (this.f11432c) {
            throw new IllegalStateException("closed");
        }
        this.f11430a.mo11677a(str);
        mo11697e();
        return this;
    }

    @Override // p275e.InterfaceC2720h
    /* renamed from: b */
    public InterfaceC2720h mo11689b() {
        if (this.f11432c) {
            throw new IllegalStateException("closed");
        }
        long size = this.f11430a.size();
        if (size > 0) {
            this.f11431b.write(this.f11430a, size);
        }
        return this;
    }

    @Override // p275e.InterfaceC2720h
    /* renamed from: c */
    public InterfaceC2720h mo11693c(long j) {
        if (this.f11432c) {
            throw new IllegalStateException("closed");
        }
        this.f11430a.mo11693c(j);
        mo11697e();
        return this;
    }

    @Override // p275e.InterfaceC2708C, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        if (this.f11432c) {
            return;
        }
        try {
            if (this.f11430a.f11390c > 0) {
                this.f11431b.write(this.f11430a, this.f11430a.f11390c);
            }
            th = null;
        } catch (Throwable th) {
            th = th;
        }
        try {
            this.f11431b.close();
        } catch (Throwable th2) {
            if (th == null) {
                th = th2;
            }
        }
        this.f11432c = true;
        if (th == null) {
            return;
        }
        C2712G.m11662a(th);
        throw null;
    }

    @Override // p275e.InterfaceC2720h
    /* renamed from: e */
    public InterfaceC2720h mo11697e() {
        if (this.f11432c) {
            throw new IllegalStateException("closed");
        }
        long m11713n = this.f11430a.m11713n();
        if (m11713n > 0) {
            this.f11431b.write(this.f11430a, m11713n);
        }
        return this;
    }

    @Override // p275e.InterfaceC2720h, p275e.InterfaceC2708C, java.io.Flushable
    public void flush() {
        if (this.f11432c) {
            throw new IllegalStateException("closed");
        }
        C2719g c2719g = this.f11430a;
        long j = c2719g.f11390c;
        if (j > 0) {
            this.f11431b.write(c2719g, j);
        }
        this.f11431b.flush();
    }

    @Override // p275e.InterfaceC2720h
    /* renamed from: g */
    public InterfaceC2720h mo11701g(long j) {
        if (this.f11432c) {
            throw new IllegalStateException("closed");
        }
        this.f11430a.mo11701g(j);
        mo11697e();
        return this;
    }

    @Override // java.nio.channels.Channel
    public boolean isOpen() {
        return !this.f11432c;
    }

    @Override // p275e.InterfaceC2720h
    /* renamed from: j */
    public OutputStream mo11707j() {
        return new C2734v(this);
    }

    @Override // p275e.InterfaceC2708C
    public C2711F timeout() {
        return this.f11431b.timeout();
    }

    public String toString() {
        return "buffer(" + this.f11431b + ")";
    }

    @Override // java.nio.channels.WritableByteChannel
    public int write(ByteBuffer byteBuffer) {
        if (this.f11432c) {
            throw new IllegalStateException("closed");
        }
        int write = this.f11430a.write(byteBuffer);
        mo11697e();
        return write;
    }

    @Override // p275e.InterfaceC2720h
    public InterfaceC2720h write(byte[] bArr) {
        if (this.f11432c) {
            throw new IllegalStateException("closed");
        }
        this.f11430a.write(bArr);
        mo11697e();
        return this;
    }

    @Override // p275e.InterfaceC2720h
    public InterfaceC2720h write(byte[] bArr, int i, int i2) {
        if (this.f11432c) {
            throw new IllegalStateException("closed");
        }
        this.f11430a.write(bArr, i, i2);
        mo11697e();
        return this;
    }

    @Override // p275e.InterfaceC2708C
    public void write(C2719g c2719g, long j) {
        if (this.f11432c) {
            throw new IllegalStateException("closed");
        }
        this.f11430a.write(c2719g, j);
        mo11697e();
    }

    @Override // p275e.InterfaceC2720h
    public InterfaceC2720h writeByte(int i) {
        if (this.f11432c) {
            throw new IllegalStateException("closed");
        }
        this.f11430a.writeByte(i);
        mo11697e();
        return this;
    }

    @Override // p275e.InterfaceC2720h
    public InterfaceC2720h writeInt(int i) {
        if (this.f11432c) {
            throw new IllegalStateException("closed");
        }
        this.f11430a.writeInt(i);
        mo11697e();
        return this;
    }

    @Override // p275e.InterfaceC2720h
    public InterfaceC2720h writeShort(int i) {
        if (this.f11432c) {
            throw new IllegalStateException("closed");
        }
        this.f11430a.writeShort(i);
        mo11697e();
        return this;
    }
}
