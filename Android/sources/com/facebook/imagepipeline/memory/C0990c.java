package com.facebook.imagepipeline.memory;

import android.graphics.Bitmap;
import p139d.p143b.p148c.p152d.C1691j;
import p139d.p143b.p148c.p156h.InterfaceC1718d;
import p139d.p143b.p203j.C2032b;

/* renamed from: com.facebook.imagepipeline.memory.c */
/* loaded from: classes.dex */
public class C0990c {

    /* renamed from: a */
    private int f4135a;

    /* renamed from: b */
    private long f4136b;

    /* renamed from: c */
    private final int f4137c;

    /* renamed from: d */
    private final int f4138d;

    /* renamed from: e */
    private final InterfaceC1718d<Bitmap> f4139e;

    public C0990c(int i, int i2) {
        C1691j.m6974a(i > 0);
        C1691j.m6974a(i2 > 0);
        this.f4137c = i;
        this.f4138d = i2;
        this.f4139e = new C0989b(this);
    }

    /* renamed from: a */
    public synchronized int m5001a() {
        return this.f4135a;
    }

    /* renamed from: a */
    public synchronized void m5002a(Bitmap bitmap) {
        int m8294a = C2032b.m8294a(bitmap);
        C1691j.m6975a(this.f4135a > 0, "No bitmaps registered.");
        long j = m8294a;
        C1691j.m6976a(j <= this.f4136b, "Bitmap size bigger than the total registered size: %d, %d", Integer.valueOf(m8294a), Long.valueOf(this.f4136b));
        this.f4136b -= j;
        this.f4135a--;
    }

    /* renamed from: b */
    public synchronized int m5003b() {
        return this.f4137c;
    }

    /* renamed from: b */
    public synchronized boolean m5004b(Bitmap bitmap) {
        int m8294a = C2032b.m8294a(bitmap);
        if (this.f4135a < this.f4137c) {
            long j = m8294a;
            if (this.f4136b + j <= this.f4138d) {
                this.f4135a++;
                this.f4136b += j;
                return true;
            }
        }
        return false;
    }

    /* renamed from: c */
    public synchronized int m5005c() {
        return this.f4138d;
    }

    /* renamed from: d */
    public InterfaceC1718d<Bitmap> m5006d() {
        return this.f4139e;
    }

    /* renamed from: e */
    public synchronized long m5007e() {
        return this.f4136b;
    }
}
