package p139d.p143b.p169g.p170a.p171a.p172a;

import p139d.p143b.p184i.p197k.C1924a;

/* renamed from: d.b.g.a.a.a.c */
/* loaded from: classes.dex */
public class C1756c extends C1924a {

    /* renamed from: a */
    private String f6339a;

    /* renamed from: b */
    private final InterfaceC1755b f6340b;

    public C1756c(String str, InterfaceC1755b interfaceC1755b) {
        this.f6340b = interfaceC1755b;
        m7175c(str);
    }

    @Override // p139d.p143b.p184i.p197k.C1924a, p139d.p143b.p184i.p200n.InterfaceC2002qa
    /* renamed from: a */
    public void mo7174a(String str, String str2, boolean z) {
        InterfaceC1755b interfaceC1755b = this.f6340b;
        if (interfaceC1755b != null) {
            interfaceC1755b.mo7168a(this.f6339a, C1757d.m7176a(str2), z);
        }
    }

    /* renamed from: c */
    public void m7175c(String str) {
        this.f6339a = str;
    }
}
