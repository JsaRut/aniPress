package android.support.v7.widget;

import android.util.Property;

/* renamed from: android.support.v7.widget.oa */
/* loaded from: classes.dex */
class C0465oa extends Property<C0467pa, Float> {
    public C0465oa(Class cls, String str) {
        super(cls, str);
    }

    @Override // android.util.Property
    /* renamed from: a */
    public Float get(C0467pa c0467pa) {
        return Float.valueOf(c0467pa.f2476z);
    }

    @Override // android.util.Property
    /* renamed from: a */
    public void set(C0467pa c0467pa, Float f) {
        c0467pa.setThumbPosition(f.floatValue());
    }
}
