package p139d.p143b.p184i.p189c;

import android.graphics.Bitmap;
import p139d.p143b.p148c.p156h.C1716b;

/* renamed from: d.b.i.c.f */
/* loaded from: classes.dex */
public abstract class AbstractC1842f {
    /* renamed from: a */
    public C1716b<Bitmap> m7547a(int i, int i2) {
        return m7548a(i, i2, Bitmap.Config.ARGB_8888);
    }

    /* renamed from: a */
    public C1716b<Bitmap> m7548a(int i, int i2, Bitmap.Config config) {
        return m7549a(i, i2, config, null);
    }

    /* renamed from: a */
    public C1716b<Bitmap> m7549a(int i, int i2, Bitmap.Config config, Object obj) {
        return mo7544b(i, i2, config);
    }

    /* renamed from: b */
    public abstract C1716b<Bitmap> mo7544b(int i, int i2, Bitmap.Config config);
}
