package com.facebook.imagepipeline.memory;

import java.util.LinkedList;
import p139d.p143b.p148c.p156h.C1717c;

/* renamed from: com.facebook.imagepipeline.memory.s */
/* loaded from: classes.dex */
class C1006s<V> extends C0993f<V> {

    /* renamed from: f */
    private LinkedList<C1717c<V>> f4164f;

    public C1006s(int i, int i2, int i3) {
        super(i, i2, i3, false);
        this.f4164f = new LinkedList<>();
    }

    @Override // com.facebook.imagepipeline.memory.C0993f
    /* renamed from: a */
    void mo5012a(V v) {
        C1717c<V> poll = this.f4164f.poll();
        if (poll == null) {
            poll = new C1717c<>();
        }
        poll.m7052a(v);
        this.f4146c.add(poll);
    }

    @Override // com.facebook.imagepipeline.memory.C0993f
    /* renamed from: f */
    public V mo5018f() {
        C1717c<V> c1717c = (C1717c) this.f4146c.poll();
        V m7053b = c1717c.m7053b();
        c1717c.m7051a();
        this.f4164f.add(c1717c);
        return m7053b;
    }
}
