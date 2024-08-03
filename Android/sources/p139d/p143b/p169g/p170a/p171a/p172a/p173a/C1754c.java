package p139d.p143b.p169g.p170a.p171a.p172a.p173a;

import com.facebook.common.time.InterfaceC0986b;
import p139d.p143b.p169g.p170a.p171a.p172a.C1761h;
import p139d.p143b.p184i.p197k.C1924a;
import p139d.p143b.p184i.p201o.C2023c;

/* renamed from: d.b.g.a.a.a.a.c */
/* loaded from: classes.dex */
public class C1754c extends C1924a {

    /* renamed from: a */
    private final InterfaceC0986b f6337a;

    /* renamed from: b */
    private final C1761h f6338b;

    public C1754c(InterfaceC0986b interfaceC0986b, C1761h c1761h) {
        this.f6337a = interfaceC0986b;
        this.f6338b = c1761h;
    }

    @Override // p139d.p143b.p184i.p197k.C1924a, p139d.p143b.p184i.p197k.InterfaceC1926c
    /* renamed from: a */
    public void mo5336a(C2023c c2023c, Object obj, String str, boolean z) {
        this.f6338b.m7203g(this.f6337a.now());
        this.f6338b.m7188a(c2023c);
        this.f6338b.m7189a(obj);
        this.f6338b.m7195b(str);
        this.f6338b.m7196b(z);
    }

    @Override // p139d.p143b.p184i.p197k.C1924a, p139d.p143b.p184i.p197k.InterfaceC1926c
    /* renamed from: a */
    public void mo5337a(C2023c c2023c, String str, Throwable th, boolean z) {
        this.f6338b.m7202f(this.f6337a.now());
        this.f6338b.m7188a(c2023c);
        this.f6338b.m7195b(str);
        this.f6338b.m7196b(z);
        this.f6338b.m7199c(false);
    }

    @Override // p139d.p143b.p184i.p197k.C1924a, p139d.p143b.p184i.p197k.InterfaceC1926c
    /* renamed from: a */
    public void mo5338a(C2023c c2023c, String str, boolean z) {
        this.f6338b.m7202f(this.f6337a.now());
        this.f6338b.m7188a(c2023c);
        this.f6338b.m7195b(str);
        this.f6338b.m7196b(z);
        this.f6338b.m7199c(true);
    }

    @Override // p139d.p143b.p184i.p197k.C1924a, p139d.p143b.p184i.p197k.InterfaceC1926c
    /* renamed from: b */
    public void mo5344b(String str) {
        this.f6338b.m7202f(this.f6337a.now());
        this.f6338b.m7195b(str);
        this.f6338b.m7191a(true);
    }
}
