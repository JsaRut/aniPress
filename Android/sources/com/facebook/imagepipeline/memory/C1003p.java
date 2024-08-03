package com.facebook.imagepipeline.memory;

import java.io.IOException;
import java.io.InputStream;
import p139d.p143b.p148c.p152d.C1699r;
import p139d.p143b.p148c.p155g.C1714k;
import p139d.p143b.p148c.p155g.InterfaceC1711h;

/* renamed from: com.facebook.imagepipeline.memory.p */
/* loaded from: classes.dex */
public class C1003p implements InterfaceC1711h {

    /* renamed from: a */
    private final C1714k f4158a;

    /* renamed from: b */
    private final C1001n f4159b;

    public C1003p(C1001n c1001n, C1714k c1714k) {
        this.f4159b = c1001n;
        this.f4158a = c1714k;
    }

    @Override // p139d.p143b.p148c.p155g.InterfaceC1711h
    /* renamed from: a */
    public C1002o mo5035a(InputStream inputStream) {
        C1004q c1004q = new C1004q(this.f4159b);
        try {
            return m5037a(inputStream, c1004q);
        } finally {
            c1004q.close();
        }
    }

    @Override // p139d.p143b.p148c.p155g.InterfaceC1711h
    /* renamed from: a */
    public C1002o mo5036a(InputStream inputStream, int i) {
        C1004q c1004q = new C1004q(this.f4159b, i);
        try {
            return m5037a(inputStream, c1004q);
        } finally {
            c1004q.close();
        }
    }

    /* renamed from: a */
    C1002o m5037a(InputStream inputStream, C1004q c1004q) {
        this.f4158a.m7041a(inputStream, c1004q);
        return c1004q.mo5043m();
    }

    @Override // p139d.p143b.p148c.p155g.InterfaceC1711h
    /* renamed from: a */
    public C1002o mo5038a(byte[] bArr) {
        C1004q c1004q = new C1004q(this.f4159b, bArr.length);
        try {
            try {
                c1004q.write(bArr, 0, bArr.length);
                return c1004q.mo5043m();
            } catch (IOException e2) {
                C1699r.m6984a(e2);
                throw null;
            }
        } finally {
            c1004q.close();
        }
    }

    @Override // p139d.p143b.p148c.p155g.InterfaceC1711h
    /* renamed from: a */
    public C1004q mo5039a() {
        return new C1004q(this.f4159b);
    }

    @Override // p139d.p143b.p148c.p155g.InterfaceC1711h
    /* renamed from: a */
    public C1004q mo5040a(int i) {
        return new C1004q(this.f4159b, i);
    }
}
