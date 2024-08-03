package com.facebook.imagepipeline.memory;

import p139d.p143b.p148c.p152d.C1691j;
import p139d.p143b.p148c.p155g.C1714k;
import p139d.p143b.p148c.p155g.InterfaceC1704a;
import p139d.p143b.p148c.p155g.InterfaceC1711h;

/* renamed from: com.facebook.imagepipeline.memory.v */
/* loaded from: classes.dex */
public class C1009v {

    /* renamed from: a */
    private final C1008u f4181a;

    /* renamed from: b */
    private C0992e f4182b;

    /* renamed from: c */
    private C0999l f4183c;

    /* renamed from: d */
    private C1001n f4184d;

    /* renamed from: e */
    private InterfaceC1711h f4185e;

    /* renamed from: f */
    private C1714k f4186f;

    /* renamed from: g */
    private InterfaceC1704a f4187g;

    public C1009v(C1008u c1008u) {
        C1691j.m6971a(c1008u);
        this.f4181a = c1008u;
    }

    /* renamed from: a */
    public C0992e m5070a() {
        if (this.f4182b == null) {
            this.f4182b = new C0992e(this.f4181a.m5056d(), this.f4181a.m5053a(), this.f4181a.m5054b());
        }
        return this.f4182b;
    }

    /* renamed from: b */
    public C0999l m5071b() {
        if (this.f4183c == null) {
            this.f4183c = new C0999l(this.f4181a.m5056d(), this.f4181a.m5055c());
        }
        return this.f4183c;
    }

    /* renamed from: c */
    public int m5072c() {
        return this.f4181a.m5055c().f4194g;
    }

    /* renamed from: d */
    public C1001n m5073d() {
        if (this.f4184d == null) {
            this.f4184d = new C1001n(this.f4181a.m5056d(), this.f4181a.m5057e(), this.f4181a.m5058f());
        }
        return this.f4184d;
    }

    /* renamed from: e */
    public InterfaceC1711h m5074e() {
        if (this.f4185e == null) {
            this.f4185e = new C1003p(m5073d(), m5075f());
        }
        return this.f4185e;
    }

    /* renamed from: f */
    public C1714k m5075f() {
        if (this.f4186f == null) {
            this.f4186f = new C1714k(m5076g());
        }
        return this.f4186f;
    }

    /* renamed from: g */
    public InterfaceC1704a m5076g() {
        if (this.f4187g == null) {
            this.f4187g = new C1000m(this.f4181a.m5056d(), this.f4181a.m5059g(), this.f4181a.m5060h());
        }
        return this.f4187g;
    }
}
