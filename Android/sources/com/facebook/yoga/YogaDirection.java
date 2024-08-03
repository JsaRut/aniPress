package com.facebook.yoga;

import p139d.p143b.p206l.p207a.InterfaceC2039a;

@InterfaceC2039a
/* loaded from: classes.dex */
public enum YogaDirection {
    INHERIT(0),
    LTR(1),
    RTL(2);


    /* renamed from: e */
    private final int f5737e;

    YogaDirection(int i) {
        this.f5737e = i;
    }

    /* renamed from: a */
    public static YogaDirection m6474a(int i) {
        if (i == 0) {
            return INHERIT;
        }
        if (i == 1) {
            return LTR;
        }
        if (i == 2) {
            return RTL;
        }
        throw new IllegalArgumentException("Unknown enum value: " + i);
    }

    /* renamed from: b */
    public int m6475b() {
        return this.f5737e;
    }
}
