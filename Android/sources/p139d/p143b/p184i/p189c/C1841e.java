package p139d.p143b.p184i.p189c;

import android.annotation.TargetApi;
import android.graphics.Bitmap;
import p139d.p143b.p148c.p153e.C1700a;
import p139d.p143b.p148c.p155g.InterfaceC1710g;
import p139d.p143b.p148c.p156h.C1716b;
import p139d.p143b.p183h.C1826b;
import p139d.p143b.p184i.p196j.C1920d;
import p139d.p143b.p184i.p198l.InterfaceC1931e;

@TargetApi(11)
/* renamed from: d.b.i.c.e */
/* loaded from: classes.dex */
public class C1841e extends AbstractC1842f {

    /* renamed from: a */
    private static final String f6775a = "e";

    /* renamed from: b */
    private final C1838b f6776b;

    /* renamed from: c */
    private final InterfaceC1931e f6777c;

    /* renamed from: d */
    private boolean f6778d;

    public C1841e(C1838b c1838b, InterfaceC1931e interfaceC1931e) {
        this.f6776b = c1838b;
        this.f6777c = interfaceC1931e;
    }

    /* renamed from: c */
    private static C1716b<Bitmap> m7546c(int i, int i2, Bitmap.Config config) {
        return C1716b.m7044a(Bitmap.createBitmap(i, i2, config), C1843g.m7550a());
    }

    @Override // p139d.p143b.p184i.p189c.AbstractC1842f
    @TargetApi(12)
    /* renamed from: b */
    public C1716b<Bitmap> mo7544b(int i, int i2, Bitmap.Config config) {
        if (this.f6778d) {
            return m7546c(i, i2, config);
        }
        C1716b<InterfaceC1710g> m7545a = this.f6776b.m7545a((short) i, (short) i2);
        try {
            C1920d c1920d = new C1920d(m7545a);
            c1920d.m7906a(C1826b.f6739a);
            try {
                C1716b<Bitmap> mo7937a = this.f6777c.mo7937a(c1920d, config, null, m7545a.m7048n().size());
                if (mo7937a.m7048n().isMutable()) {
                    mo7937a.m7048n().setHasAlpha(true);
                    mo7937a.m7048n().eraseColor(0);
                    return mo7937a;
                }
                C1716b.m7045b(mo7937a);
                this.f6778d = true;
                C1700a.m7017e(f6775a, "Immutable bitmap returned by decoder");
                return m7546c(i, i2, config);
            } finally {
                C1920d.m7902b(c1920d);
            }
        } finally {
            m7545a.close();
        }
    }
}
