package p139d.p225c.p226a.p227a.p259k.p260a;

import android.text.Layout;
import p139d.p225c.p226a.p227a.p259k.C2527b;

/* renamed from: d.c.a.a.k.a.b */
/* loaded from: classes.dex */
final class C2520b extends C2527b implements Comparable<C2520b> {

    /* renamed from: o */
    public final int f10332o;

    public C2520b(CharSequence charSequence, Layout.Alignment alignment, float f, int i, int i2, float f2, int i3, float f3, boolean z, int i4, int i5) {
        super(charSequence, alignment, f, i, i2, f2, i3, f3, z, i4);
        this.f10332o = i5;
    }

    @Override // java.lang.Comparable
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compareTo(C2520b c2520b) {
        int i = c2520b.f10332o;
        int i2 = this.f10332o;
        if (i < i2) {
            return -1;
        }
        return i > i2 ? 1 : 0;
    }
}
