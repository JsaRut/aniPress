package p139d.p143b.p184i.p201o;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import com.facebook.imagepipeline.nativecode.Bitmaps;
import p139d.p143b.p145b.p146a.InterfaceC1648d;
import p139d.p143b.p148c.p156h.C1716b;
import p139d.p143b.p184i.p189c.AbstractC1842f;

/* renamed from: d.b.i.o.a */
/* loaded from: classes.dex */
public abstract class AbstractC2021a implements InterfaceC2025e {

    /* renamed from: a */
    public static final Bitmap.Config f7361a = Bitmap.Config.ARGB_8888;

    /* renamed from: b */
    private static void m8233b(Bitmap bitmap, Bitmap bitmap2) {
        if (bitmap.getConfig() == bitmap2.getConfig()) {
            Bitmaps.m5079a(bitmap, bitmap2);
        } else {
            new Canvas(bitmap).drawBitmap(bitmap2, 0.0f, 0.0f, (Paint) null);
        }
    }

    @Override // p139d.p143b.p184i.p201o.InterfaceC2025e
    /* renamed from: a */
    public InterfaceC1648d mo5999a() {
        return null;
    }

    @Override // p139d.p143b.p184i.p201o.InterfaceC2025e
    /* renamed from: a */
    public C1716b<Bitmap> mo6000a(Bitmap bitmap, AbstractC1842f abstractC1842f) {
        Bitmap.Config config = bitmap.getConfig();
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        if (config == null) {
            config = f7361a;
        }
        C1716b<Bitmap> mo7544b = abstractC1842f.mo7544b(width, height, config);
        try {
            mo6022a(mo7544b.m7048n(), bitmap);
            return C1716b.m7042a((C1716b) mo7544b);
        } finally {
            C1716b.m7045b(mo7544b);
        }
    }

    /* renamed from: a */
    public void mo7949a(Bitmap bitmap) {
    }

    /* renamed from: a */
    public void mo6022a(Bitmap bitmap, Bitmap bitmap2) {
        m8233b(bitmap, bitmap2);
        mo7949a(bitmap);
    }

    @Override // p139d.p143b.p184i.p201o.InterfaceC2025e
    public String getName() {
        return "Unknown postprocessor";
    }
}
