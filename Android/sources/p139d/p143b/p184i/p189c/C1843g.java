package p139d.p143b.p184i.p189c;

import android.graphics.Bitmap;
import p139d.p143b.p148c.p156h.InterfaceC1718d;

/* renamed from: d.b.i.c.g */
/* loaded from: classes.dex */
public class C1843g implements InterfaceC1718d<Bitmap> {

    /* renamed from: a */
    private static C1843g f6779a;

    private C1843g() {
    }

    /* renamed from: a */
    public static C1843g m7550a() {
        if (f6779a == null) {
            f6779a = new C1843g();
        }
        return f6779a;
    }

    @Override // p139d.p143b.p148c.p156h.InterfaceC1718d
    /* renamed from: a, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public void mo4987a(Bitmap bitmap) {
        bitmap.recycle();
    }
}
