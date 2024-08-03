package p139d.p143b.p169g.p170a.p171a.p172a.p173a;

import android.graphics.drawable.Animatable;
import com.facebook.common.time.InterfaceC0986b;
import p139d.p143b.p169g.p170a.p171a.p172a.C1760g;
import p139d.p143b.p169g.p170a.p171a.p172a.C1761h;
import p139d.p143b.p169g.p175c.C1778f;
import p139d.p143b.p184i.p196j.InterfaceC1921e;

/* renamed from: d.b.g.a.a.a.a.a */
/* loaded from: classes.dex */
public class C1752a extends C1778f<InterfaceC1921e> {

    /* renamed from: b */
    private final InterfaceC0986b f6332b;

    /* renamed from: c */
    private final C1761h f6333c;

    /* renamed from: d */
    private final C1760g f6334d;

    public C1752a(InterfaceC0986b interfaceC0986b, C1761h c1761h, C1760g c1760g) {
        this.f6332b = interfaceC0986b;
        this.f6333c = c1761h;
        this.f6334d = c1760g;
    }

    @Override // p139d.p143b.p169g.p175c.C1778f, p139d.p143b.p169g.p175c.InterfaceC1779g
    /* renamed from: a */
    public void mo7170a(String str) {
        super.mo7170a(str);
        int m7184a = this.f6333c.m7184a();
        if (m7184a == 3 || m7184a == 5) {
            return;
        }
        this.f6333c.m7186a(this.f6332b.now());
        this.f6333c.m7190a(str);
        this.f6333c.m7191a(true);
        this.f6334d.m7181a(this.f6333c, 4);
    }

    @Override // p139d.p143b.p169g.p175c.C1778f, p139d.p143b.p169g.p175c.InterfaceC1779g
    /* renamed from: a */
    public void mo7173a(String str, InterfaceC1921e interfaceC1921e) {
        this.f6333c.m7200d(this.f6332b.now());
        this.f6333c.m7190a(str);
        this.f6333c.m7187a(interfaceC1921e);
        this.f6334d.m7181a(this.f6333c, 2);
    }

    @Override // p139d.p143b.p169g.p175c.C1778f, p139d.p143b.p169g.p175c.InterfaceC1779g
    /* renamed from: a */
    public void mo6002a(String str, InterfaceC1921e interfaceC1921e, Animatable animatable) {
        this.f6333c.m7198c(this.f6332b.now());
        this.f6333c.m7190a(str);
        this.f6333c.m7187a(interfaceC1921e);
        this.f6333c.m7199c(true);
        this.f6334d.m7181a(this.f6333c, 3);
    }

    @Override // p139d.p143b.p169g.p175c.C1778f, p139d.p143b.p169g.p175c.InterfaceC1779g
    /* renamed from: a */
    public void mo6003a(String str, Throwable th) {
        this.f6333c.m7194b(this.f6332b.now());
        this.f6333c.m7190a(str);
        this.f6333c.m7199c(false);
        this.f6334d.m7181a(this.f6333c, 5);
    }

    @Override // p139d.p143b.p169g.p175c.C1778f, p139d.p143b.p169g.p175c.InterfaceC1779g
    /* renamed from: b */
    public void mo6004b(String str, Object obj) {
        this.f6333c.m7201e(this.f6332b.now());
        this.f6333c.m7190a(str);
        this.f6333c.m7189a(obj);
        this.f6334d.m7181a(this.f6333c, 0);
    }
}
