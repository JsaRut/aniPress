package android.support.v7.widget;

import android.support.v7.view.menu.InterfaceC0380z;
import android.support.v7.widget.C0448g;
import android.view.View;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: android.support.v7.widget.h */
/* loaded from: classes.dex */
public class C0450h extends AbstractViewOnTouchListenerC0415P {

    /* renamed from: j */
    final /* synthetic */ C0448g f2373j;

    /* renamed from: k */
    final /* synthetic */ C0448g.d f2374k;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0450h(C0448g.d dVar, View view, C0448g c0448g) {
        super(view);
        this.f2374k = dVar;
        this.f2373j = c0448g;
    }

    @Override // android.support.v7.widget.AbstractViewOnTouchListenerC0415P
    /* renamed from: a */
    public InterfaceC0380z mo1925a() {
        C0448g.e eVar = C0448g.this.f2363z;
        if (eVar == null) {
            return null;
        }
        return eVar.m2088b();
    }

    @Override // android.support.v7.widget.AbstractViewOnTouchListenerC0415P
    /* renamed from: b */
    public boolean mo1926b() {
        C0448g.this.m2462i();
        return true;
    }

    @Override // android.support.v7.widget.AbstractViewOnTouchListenerC0415P
    /* renamed from: c */
    public boolean mo2287c() {
        C0448g c0448g = C0448g.this;
        if (c0448g.f2344B != null) {
            return false;
        }
        c0448g.m2458e();
        return true;
    }
}
