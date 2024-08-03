package p139d.p143b.p169g.p176d.p177a;

import android.graphics.drawable.Animatable;
import p139d.p143b.p169g.p175c.C1778f;

/* renamed from: d.b.g.d.a.a */
/* loaded from: classes.dex */
public class C1783a extends C1778f {

    /* renamed from: b */
    private long f6527b = -1;

    /* renamed from: c */
    private long f6528c = -1;

    /* renamed from: d */
    private InterfaceC1784b f6529d;

    public C1783a(InterfaceC1784b interfaceC1784b) {
        this.f6529d = interfaceC1784b;
    }

    @Override // p139d.p143b.p169g.p175c.C1778f, p139d.p143b.p169g.p175c.InterfaceC1779g
    /* renamed from: a */
    public void mo6002a(String str, Object obj, Animatable animatable) {
        this.f6528c = System.currentTimeMillis();
        InterfaceC1784b interfaceC1784b = this.f6529d;
        if (interfaceC1784b != null) {
            interfaceC1784b.mo7332a(this.f6528c - this.f6527b);
        }
    }

    @Override // p139d.p143b.p169g.p175c.C1778f, p139d.p143b.p169g.p175c.InterfaceC1779g
    /* renamed from: b */
    public void mo6004b(String str, Object obj) {
        this.f6527b = System.currentTimeMillis();
    }
}
