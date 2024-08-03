package com.facebook.imagepipeline.memory;

import android.graphics.Bitmap;
import p139d.p143b.p148c.p156h.InterfaceC1718d;

/* renamed from: com.facebook.imagepipeline.memory.b */
/* loaded from: classes.dex */
public class C0989b implements InterfaceC1718d<Bitmap> {

    /* renamed from: a */
    final /* synthetic */ C0990c f4134a;

    public C0989b(C0990c c0990c) {
        this.f4134a = c0990c;
    }

    @Override // p139d.p143b.p148c.p156h.InterfaceC1718d
    /* renamed from: a */
    public void mo4987a(Bitmap bitmap) {
        try {
            this.f4134a.m5002a(bitmap);
        } finally {
            bitmap.recycle();
        }
    }
}
