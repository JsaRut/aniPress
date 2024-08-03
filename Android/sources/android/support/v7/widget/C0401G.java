package android.support.v7.widget;

import android.graphics.Typeface;
import java.lang.ref.WeakReference;
import p000a.p005b.p009c.p010a.p011a.C0030h;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: android.support.v7.widget.G */
/* loaded from: classes.dex */
public class C0401G extends C0030h.a {

    /* renamed from: a */
    final /* synthetic */ WeakReference f2031a;

    /* renamed from: b */
    final /* synthetic */ C0403H f2032b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0401G(C0403H c0403h, WeakReference weakReference) {
        this.f2032b = c0403h;
        this.f2031a = weakReference;
    }

    @Override // p000a.p005b.p009c.p010a.p011a.C0030h.a
    /* renamed from: a */
    public void mo139a(int i) {
    }

    @Override // p000a.p005b.p009c.p010a.p011a.C0030h.a
    /* renamed from: a */
    public void mo141a(Typeface typeface) {
        this.f2032b.m2212a(this.f2031a, typeface);
    }
}
