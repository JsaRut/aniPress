package android.support.v7.widget;

import android.support.v7.view.menu.InterfaceC0380z;
import android.support.v7.widget.C0392C;
import android.view.View;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: android.support.v7.widget.B */
/* loaded from: classes.dex */
public class C0390B extends AbstractViewOnTouchListenerC0415P {

    /* renamed from: j */
    final /* synthetic */ C0392C.b f1974j;

    /* renamed from: k */
    final /* synthetic */ C0392C f1975k;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0390B(C0392C c0392c, View view, C0392C.b bVar) {
        super(view);
        this.f1975k = c0392c;
        this.f1974j = bVar;
    }

    @Override // android.support.v7.widget.AbstractViewOnTouchListenerC0415P
    /* renamed from: a */
    public InterfaceC0380z mo1925a() {
        return this.f1974j;
    }

    @Override // android.support.v7.widget.AbstractViewOnTouchListenerC0415P
    /* renamed from: b */
    public boolean mo1926b() {
        if (this.f1975k.f1988g.mo1940b()) {
            return true;
        }
        this.f1975k.f1988g.mo1941c();
        return true;
    }
}
