package com.facebook.react.views.image;

import android.graphics.drawable.Animatable;
import com.facebook.react.uimanager.events.C1333f;
import p139d.p143b.p169g.p175c.C1778f;
import p139d.p143b.p184i.p196j.InterfaceC1921e;
import p139d.p143b.p208m.p222j.p224b.C2116a;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.facebook.react.views.image.f */
/* loaded from: classes.dex */
public class C1400f extends C1778f<InterfaceC1921e> {

    /* renamed from: b */
    final /* synthetic */ C1333f f5128b;

    /* renamed from: c */
    final /* synthetic */ C1401g f5129c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C1400f(C1401g c1401g, C1333f c1333f) {
        this.f5129c = c1401g;
        this.f5128b = c1333f;
    }

    @Override // p139d.p143b.p169g.p175c.C1778f, p139d.p143b.p169g.p175c.InterfaceC1779g
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public void mo6002a(String str, InterfaceC1921e interfaceC1921e, Animatable animatable) {
        C2116a c2116a;
        if (interfaceC1921e != null) {
            C1333f c1333f = this.f5128b;
            int id = this.f5129c.getId();
            c2116a = this.f5129c.f5147m;
            c1333f.m5753a(new C1396b(id, 2, c2116a.m8461b(), interfaceC1921e.mo6293n(), interfaceC1921e.mo6292m()));
            this.f5128b.m5753a(new C1396b(this.f5129c.getId(), 3));
        }
    }

    @Override // p139d.p143b.p169g.p175c.C1778f, p139d.p143b.p169g.p175c.InterfaceC1779g
    /* renamed from: a */
    public void mo6003a(String str, Throwable th) {
        this.f5128b.m5753a(new C1396b(this.f5129c.getId(), 1, true, th.getMessage()));
    }

    @Override // p139d.p143b.p169g.p175c.C1778f, p139d.p143b.p169g.p175c.InterfaceC1779g
    /* renamed from: b */
    public void mo6004b(String str, Object obj) {
        this.f5128b.m5753a(new C1396b(this.f5129c.getId(), 4));
    }
}
