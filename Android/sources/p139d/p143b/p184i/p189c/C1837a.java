package p139d.p143b.p184i.p189c;

import android.annotation.TargetApi;
import android.graphics.Bitmap;
import com.facebook.imagepipeline.memory.C0992e;
import com.facebook.imagepipeline.nativecode.Bitmaps;
import p139d.p143b.p148c.p156h.C1716b;
import p139d.p143b.p203j.C2032b;

@TargetApi(21)
/* renamed from: d.b.i.c.a */
/* loaded from: classes.dex */
public class C1837a extends AbstractC1842f {

    /* renamed from: a */
    private final C0992e f6769a;

    public C1837a(C0992e c0992e) {
        this.f6769a = c0992e;
    }

    @Override // p139d.p143b.p184i.p189c.AbstractC1842f
    /* renamed from: b */
    public C1716b<Bitmap> mo7544b(int i, int i2, Bitmap.Config config) {
        Bitmap bitmap = this.f6769a.get(C2032b.m8292a(i, i2, config));
        Bitmaps.m5078a(bitmap, i, i2, config);
        return C1716b.m7044a(bitmap, this.f6769a);
    }
}
