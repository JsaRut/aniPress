package p139d.p143b.p169g.p170a.p171a;

import android.content.res.Resources;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import p139d.p143b.p169g.p178e.C1795k;
import p139d.p143b.p184i.p195i.InterfaceC1916a;
import p139d.p143b.p184i.p196j.AbstractC1918b;
import p139d.p143b.p184i.p196j.C1919c;

/* renamed from: d.b.g.a.a.a */
/* loaded from: classes.dex */
public class C1750a implements InterfaceC1916a {

    /* renamed from: a */
    private final Resources f6329a;

    /* renamed from: b */
    private final InterfaceC1916a f6330b;

    public C1750a(Resources resources, InterfaceC1916a interfaceC1916a) {
        this.f6329a = resources;
        this.f6330b = interfaceC1916a;
    }

    /* renamed from: a */
    private static boolean m7163a(C1919c c1919c) {
        return (c1919c.m7897r() == 1 || c1919c.m7897r() == 0) ? false : true;
    }

    /* renamed from: b */
    private static boolean m7164b(C1919c c1919c) {
        return (c1919c.m7898s() == 0 || c1919c.m7898s() == -1) ? false : true;
    }

    @Override // p139d.p143b.p184i.p195i.InterfaceC1916a
    /* renamed from: a */
    public boolean mo7165a(AbstractC1918b abstractC1918b) {
        return true;
    }

    @Override // p139d.p143b.p184i.p195i.InterfaceC1916a
    /* renamed from: b */
    public Drawable mo7166b(AbstractC1918b abstractC1918b) {
        if (abstractC1918b instanceof C1919c) {
            C1919c c1919c = (C1919c) abstractC1918b;
            BitmapDrawable bitmapDrawable = new BitmapDrawable(this.f6329a, c1919c.m7899t());
            return (m7164b(c1919c) || m7163a(c1919c)) ? new C1795k(bitmapDrawable, c1919c.m7898s(), c1919c.m7897r()) : bitmapDrawable;
        }
        InterfaceC1916a interfaceC1916a = this.f6330b;
        if (interfaceC1916a == null || !interfaceC1916a.mo7165a(abstractC1918b)) {
            return null;
        }
        return this.f6330b.mo7166b(abstractC1918b);
    }
}
