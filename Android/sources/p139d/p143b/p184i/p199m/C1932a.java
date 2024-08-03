package p139d.p143b.p184i.p199m;

import android.graphics.Bitmap;
import com.facebook.imagepipeline.nativecode.NativeBlurFilter;
import p139d.p143b.p145b.p146a.C1653i;
import p139d.p143b.p145b.p146a.InterfaceC1648d;
import p139d.p143b.p148c.p152d.C1691j;
import p139d.p143b.p184i.p201o.AbstractC2021a;

/* renamed from: d.b.i.m.a */
/* loaded from: classes.dex */
public class C1932a extends AbstractC2021a {

    /* renamed from: b */
    private final int f7092b;

    /* renamed from: c */
    private final int f7093c;

    /* renamed from: d */
    private InterfaceC1648d f7094d;

    public C1932a(int i) {
        this(3, i);
    }

    public C1932a(int i, int i2) {
        C1691j.m6974a(i > 0);
        C1691j.m6974a(i2 > 0);
        this.f7092b = i;
        this.f7093c = i2;
    }

    @Override // p139d.p143b.p184i.p201o.AbstractC2021a, p139d.p143b.p184i.p201o.InterfaceC2025e
    /* renamed from: a */
    public InterfaceC1648d mo5999a() {
        if (this.f7094d == null) {
            this.f7094d = new C1653i(String.format(null, "i%dr%d", Integer.valueOf(this.f7092b), Integer.valueOf(this.f7093c)));
        }
        return this.f7094d;
    }

    @Override // p139d.p143b.p184i.p201o.AbstractC2021a
    /* renamed from: a */
    public void mo7949a(Bitmap bitmap) {
        NativeBlurFilter.m5084a(bitmap, this.f7092b, this.f7093c);
    }
}
