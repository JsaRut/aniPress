package p139d.p143b.p169g.p182i;

import android.net.Uri;
import p139d.p143b.p148c.p152d.InterfaceC1694m;
import p139d.p143b.p148c.p159k.C1728f;
import p139d.p143b.p169g.p175c.AbstractC1777e;
import p139d.p143b.p169g.p181h.InterfaceC1818d;
import p139d.p143b.p184i.p201o.C2023c;

/* renamed from: d.b.g.i.f */
/* loaded from: classes.dex */
public class C1824f extends C1822d {

    /* renamed from: g */
    private static InterfaceC1694m<? extends AbstractC1777e> f6726g;

    /* renamed from: h */
    private AbstractC1777e f6727h;

    /* renamed from: a */
    public static void m7505a(InterfaceC1694m<? extends AbstractC1777e> interfaceC1694m) {
        f6726g = interfaceC1694m;
    }

    /* renamed from: a */
    public void m7506a(int i, Object obj) {
        m7507a(C1728f.m7079a(i), obj);
    }

    /* renamed from: a */
    public void m7507a(Uri uri, Object obj) {
        AbstractC1777e abstractC1777e = this.f6727h;
        abstractC1777e.m7304a(obj);
        InterfaceC1818d mo7240a = abstractC1777e.mo7240a(uri);
        mo7240a.mo7303a(getController());
        setController(mo7240a.build());
    }

    /* renamed from: a */
    public void m7508a(String str, Object obj) {
        m7507a(str != null ? Uri.parse(str) : null, obj);
    }

    protected AbstractC1777e getControllerBuilder() {
        return this.f6727h;
    }

    public void setActualImageResource(int i) {
        m7506a(i, (Object) null);
    }

    public void setImageRequest(C2023c c2023c) {
        AbstractC1777e abstractC1777e = this.f6727h;
        abstractC1777e.m7307b((AbstractC1777e) c2023c);
        abstractC1777e.mo7303a(getController());
        setController(abstractC1777e.build());
    }

    @Override // p139d.p143b.p169g.p182i.C1821c, android.widget.ImageView
    public void setImageResource(int i) {
        super.setImageResource(i);
    }

    @Override // p139d.p143b.p169g.p182i.C1821c, android.widget.ImageView
    public void setImageURI(Uri uri) {
        m7507a(uri, (Object) null);
    }

    public void setImageURI(String str) {
        m7508a(str, (Object) null);
    }
}
