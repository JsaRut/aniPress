package com.facebook.yoga;

import p139d.p143b.p206l.p207a.InterfaceC2039a;

@InterfaceC2039a
/* loaded from: classes.dex */
public enum YogaUnit {
    UNDEFINED(0),
    POINT(1),
    PERCENT(2),
    AUTO(3);


    /* renamed from: f */
    private final int f5813f;

    YogaUnit(int i) {
        this.f5813f = i;
    }

    /* renamed from: a */
    public static YogaUnit m6541a(int i) {
        if (i == 0) {
            return UNDEFINED;
        }
        if (i == 1) {
            return POINT;
        }
        if (i == 2) {
            return PERCENT;
        }
        if (i == 3) {
            return AUTO;
        }
        throw new IllegalArgumentException("Unknown enum value: " + i);
    }

    /* renamed from: b */
    public int m6542b() {
        return this.f5813f;
    }
}
