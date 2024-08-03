package com.facebook.imagepipeline.memory;

import android.util.SparseIntArray;
import com.facebook.imagepipeline.memory.AbstractC0988a;
import p139d.p143b.p148c.p152d.C1691j;
import p139d.p143b.p148c.p155g.InterfaceC1704a;
import p139d.p143b.p148c.p155g.InterfaceC1706c;

/* renamed from: com.facebook.imagepipeline.memory.m */
/* loaded from: classes.dex */
public class C1000m extends AbstractC0988a<byte[]> implements InterfaceC1704a {

    /* renamed from: j */
    private final int[] f4154j;

    public C1000m(InterfaceC1706c interfaceC1706c, C1010w c1010w, InterfaceC1011x interfaceC1011x) {
        super(interfaceC1706c, c1010w, interfaceC1011x);
        SparseIntArray sparseIntArray = c1010w.f4190c;
        this.f4154j = new int[sparseIntArray.size()];
        for (int i = 0; i < sparseIntArray.size(); i++) {
            this.f4154j[i] = sparseIntArray.keyAt(i);
        }
        m4986a();
    }

    @Override // com.facebook.imagepipeline.memory.AbstractC0988a
    /* renamed from: a */
    public void mo4988b(byte[] bArr) {
        C1691j.m6971a(bArr);
    }

    @Override // com.facebook.imagepipeline.memory.AbstractC0988a
    /* renamed from: a */
    public byte[] mo4985a(int i) {
        return new byte[i];
    }

    @Override // com.facebook.imagepipeline.memory.AbstractC0988a
    /* renamed from: b */
    public int mo4991c(byte[] bArr) {
        C1691j.m6971a(bArr);
        return bArr.length;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // com.facebook.imagepipeline.memory.AbstractC0988a
    /* renamed from: d */
    protected int mo4994d(int i) {
        if (i <= 0) {
            throw new AbstractC0988a.b(Integer.valueOf(i));
        }
        for (int i2 : this.f4154j) {
            if (i2 >= i) {
                return i2;
            }
        }
        return i;
    }

    @Override // com.facebook.imagepipeline.memory.AbstractC0988a
    /* renamed from: e */
    public int mo4996e(int i) {
        return i;
    }
}
