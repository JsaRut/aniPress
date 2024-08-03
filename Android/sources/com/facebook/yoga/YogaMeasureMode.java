package com.facebook.yoga;

import p139d.p143b.p206l.p207a.InterfaceC2039a;

@InterfaceC2039a
/* loaded from: classes.dex */
public enum YogaMeasureMode {
    UNDEFINED(0),
    EXACTLY(1),
    AT_MOST(2);


    /* renamed from: e */
    private final int f5782e;

    YogaMeasureMode(int i) {
        this.f5782e = i;
    }

    /* renamed from: a */
    public static YogaMeasureMode m6481a(int i) {
        if (i == 0) {
            return UNDEFINED;
        }
        if (i == 1) {
            return EXACTLY;
        }
        if (i == 2) {
            return AT_MOST;
        }
        throw new IllegalArgumentException("Unknown enum value: " + i);
    }
}
