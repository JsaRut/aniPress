package com.facebook.imagepipeline.memory;

import android.annotation.TargetApi;
import android.graphics.Bitmap;
import p139d.p143b.p148c.p152d.C1691j;
import p139d.p143b.p148c.p155g.InterfaceC1706c;

@TargetApi(21)
/* renamed from: com.facebook.imagepipeline.memory.e */
/* loaded from: classes.dex */
public class C0992e extends AbstractC0988a<Bitmap> {
    public C0992e(InterfaceC1706c interfaceC1706c, C1010w c1010w, InterfaceC1011x interfaceC1011x) {
        super(interfaceC1706c, c1010w, interfaceC1011x);
        m4986a();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.facebook.imagepipeline.memory.AbstractC0988a
    /* renamed from: a */
    public Bitmap mo4985a(int i) {
        double d2 = i;
        Double.isNaN(d2);
        return Bitmap.createBitmap(1, (int) Math.ceil(d2 / 2.0d), Bitmap.Config.RGB_565);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.imagepipeline.memory.AbstractC0988a
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public void mo4988b(Bitmap bitmap) {
        C1691j.m6971a(bitmap);
        bitmap.recycle();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.imagepipeline.memory.AbstractC0988a
    /* renamed from: b, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public int mo4991c(Bitmap bitmap) {
        C1691j.m6971a(bitmap);
        return bitmap.getAllocationByteCount();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.imagepipeline.memory.AbstractC0988a
    /* renamed from: c, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public boolean mo4995d(Bitmap bitmap) {
        C1691j.m6971a(bitmap);
        return !bitmap.isRecycled() && bitmap.isMutable();
    }

    @Override // com.facebook.imagepipeline.memory.AbstractC0988a
    /* renamed from: d */
    protected int mo4994d(int i) {
        return i;
    }

    @Override // com.facebook.imagepipeline.memory.AbstractC0988a
    /* renamed from: e */
    protected int mo4996e(int i) {
        return i;
    }
}
