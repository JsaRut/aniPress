package com.facebook.yoga;

import p139d.p143b.p206l.p207a.InterfaceC2039a;

@InterfaceC2039a
/* loaded from: classes.dex */
public class YogaValue {

    /* renamed from: a */
    static final YogaValue f5814a = new YogaValue(Float.NaN, YogaUnit.UNDEFINED);

    /* renamed from: b */
    static final YogaValue f5815b = new YogaValue(0.0f, YogaUnit.POINT);

    /* renamed from: c */
    static final YogaValue f5816c = new YogaValue(Float.NaN, YogaUnit.AUTO);

    /* renamed from: d */
    public final float f5817d;

    /* renamed from: e */
    public final YogaUnit f5818e;

    @InterfaceC2039a
    YogaValue(float f, int i) {
        this(f, YogaUnit.m6541a(i));
    }

    public YogaValue(float f, YogaUnit yogaUnit) {
        this.f5817d = f;
        this.f5818e = yogaUnit;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof YogaValue)) {
            return false;
        }
        YogaValue yogaValue = (YogaValue) obj;
        YogaUnit yogaUnit = this.f5818e;
        if (yogaUnit == yogaValue.f5818e) {
            return yogaUnit == YogaUnit.UNDEFINED || yogaUnit == YogaUnit.AUTO || Float.compare(this.f5817d, yogaValue.f5817d) == 0;
        }
        return false;
    }

    public int hashCode() {
        return Float.floatToIntBits(this.f5817d) + this.f5818e.m6542b();
    }

    public String toString() {
        int i = C1556d.f5825a[this.f5818e.ordinal()];
        if (i == 1) {
            return "undefined";
        }
        if (i == 2) {
            return Float.toString(this.f5817d);
        }
        if (i != 3) {
            if (i == 4) {
                return "auto";
            }
            throw new IllegalStateException();
        }
        return this.f5817d + "%";
    }
}
