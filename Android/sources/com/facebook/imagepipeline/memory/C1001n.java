package com.facebook.imagepipeline.memory;

import android.util.SparseIntArray;
import com.facebook.imagepipeline.memory.AbstractC0988a;
import p139d.p143b.p148c.p152d.C1691j;
import p139d.p143b.p148c.p155g.InterfaceC1706c;

/* renamed from: com.facebook.imagepipeline.memory.n */
/* loaded from: classes.dex */
public class C1001n extends AbstractC0988a<NativeMemoryChunk> {

    /* renamed from: j */
    private final int[] f4155j;

    public C1001n(InterfaceC1706c interfaceC1706c, C1010w c1010w, InterfaceC1011x interfaceC1011x) {
        super(interfaceC1706c, c1010w, interfaceC1011x);
        SparseIntArray sparseIntArray = c1010w.f4190c;
        this.f4155j = new int[sparseIntArray.size()];
        int i = 0;
        while (true) {
            int[] iArr = this.f4155j;
            if (i >= iArr.length) {
                m4986a();
                return;
            } else {
                iArr[i] = sparseIntArray.keyAt(i);
                i++;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.facebook.imagepipeline.memory.AbstractC0988a
    /* renamed from: a */
    public NativeMemoryChunk mo4985a(int i) {
        return new NativeMemoryChunk(i);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.imagepipeline.memory.AbstractC0988a
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public void mo4988b(NativeMemoryChunk nativeMemoryChunk) {
        C1691j.m6971a(nativeMemoryChunk);
        nativeMemoryChunk.close();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.imagepipeline.memory.AbstractC0988a
    /* renamed from: b, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public int mo4991c(NativeMemoryChunk nativeMemoryChunk) {
        C1691j.m6971a(nativeMemoryChunk);
        return nativeMemoryChunk.m4978m();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.imagepipeline.memory.AbstractC0988a
    /* renamed from: c, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public boolean mo4995d(NativeMemoryChunk nativeMemoryChunk) {
        C1691j.m6971a(nativeMemoryChunk);
        return !nativeMemoryChunk.isClosed();
    }

    /* renamed from: d */
    public int m5031d() {
        return this.f4155j[0];
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // com.facebook.imagepipeline.memory.AbstractC0988a
    /* renamed from: d */
    protected int mo4994d(int i) {
        if (i <= 0) {
            throw new AbstractC0988a.b(Integer.valueOf(i));
        }
        for (int i2 : this.f4155j) {
            if (i2 >= i) {
                return i2;
            }
        }
        return i;
    }

    @Override // com.facebook.imagepipeline.memory.AbstractC0988a
    /* renamed from: e */
    protected int mo4996e(int i) {
        return i;
    }
}
