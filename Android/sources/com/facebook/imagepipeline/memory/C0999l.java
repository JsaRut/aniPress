package com.facebook.imagepipeline.memory;

import p139d.p143b.p148c.p152d.C1691j;
import p139d.p143b.p148c.p155g.InterfaceC1706c;
import p139d.p143b.p148c.p156h.C1716b;
import p139d.p143b.p148c.p156h.InterfaceC1718d;

/* renamed from: com.facebook.imagepipeline.memory.l */
/* loaded from: classes.dex */
public class C0999l {

    /* renamed from: a */
    private final InterfaceC1718d<byte[]> f4152a;

    /* renamed from: b */
    final a f4153b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.facebook.imagepipeline.memory.l$a */
    /* loaded from: classes.dex */
    public static class a extends C1000m {
        public a(InterfaceC1706c interfaceC1706c, C1010w c1010w, InterfaceC1011x interfaceC1011x) {
            super(interfaceC1706c, c1010w, interfaceC1011x);
        }

        @Override // com.facebook.imagepipeline.memory.AbstractC0988a
        /* renamed from: f */
        C0993f<byte[]> mo4997f(int i) {
            mo4996e(i);
            return new C1006s(i, this.f4125c.f4194g, 0);
        }
    }

    public C0999l(InterfaceC1706c interfaceC1706c, C1010w c1010w) {
        C1691j.m6974a(c1010w.f4194g > 0);
        this.f4153b = new a(interfaceC1706c, c1010w, C1005r.m5044c());
        this.f4152a = new C0998k(this);
    }

    /* renamed from: a */
    public C1716b<byte[]> m5027a(int i) {
        return C1716b.m7044a(this.f4153b.get(i), this.f4152a);
    }

    /* renamed from: a */
    public void m5028a(byte[] bArr) {
        this.f4153b.mo4987a((a) bArr);
    }
}
