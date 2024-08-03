package com.facebook.imagepipeline.memory;

import java.util.LinkedList;
import java.util.Queue;
import p139d.p143b.p148c.p152d.C1691j;
import p139d.p143b.p148c.p153e.C1700a;

/* renamed from: com.facebook.imagepipeline.memory.f */
/* loaded from: classes.dex */
class C0993f<V> {

    /* renamed from: a */
    public final int f4144a;

    /* renamed from: b */
    public final int f4145b;

    /* renamed from: c */
    final Queue f4146c;

    /* renamed from: d */
    private final boolean f4147d;

    /* renamed from: e */
    private int f4148e;

    public C0993f(int i, int i2, int i3, boolean z) {
        C1691j.m6978b(i > 0);
        C1691j.m6978b(i2 >= 0);
        C1691j.m6978b(i3 >= 0);
        this.f4144a = i;
        this.f4145b = i2;
        this.f4146c = new LinkedList();
        this.f4148e = i3;
        this.f4147d = z;
    }

    /* renamed from: a */
    public void m5011a() {
        C1691j.m6978b(this.f4148e > 0);
        this.f4148e--;
    }

    /* renamed from: a */
    void mo5012a(V v) {
        this.f4146c.add(v);
    }

    /* renamed from: b */
    public V m5013b() {
        V mo5018f = mo5018f();
        if (mo5018f != null) {
            this.f4148e++;
        }
        return mo5018f;
    }

    /* renamed from: b */
    public void m5014b(V v) {
        int i;
        C1691j.m6971a(v);
        if (this.f4147d) {
            C1691j.m6978b(this.f4148e > 0);
            i = this.f4148e;
        } else {
            i = this.f4148e;
            if (i <= 0) {
                C1700a.m6999a("BUCKET", "Tried to release value %s from an empty bucket!", v);
                return;
            }
        }
        this.f4148e = i - 1;
        mo5012a(v);
    }

    /* renamed from: c */
    int m5015c() {
        return this.f4146c.size();
    }

    /* renamed from: d */
    public void m5016d() {
        this.f4148e++;
    }

    /* renamed from: e */
    public boolean m5017e() {
        return this.f4148e + m5015c() > this.f4145b;
    }

    /* renamed from: f */
    public V mo5018f() {
        return (V) this.f4146c.poll();
    }
}
