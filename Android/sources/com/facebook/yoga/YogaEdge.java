package com.facebook.yoga;

import p139d.p143b.p206l.p207a.InterfaceC2039a;

@InterfaceC2039a
/* loaded from: classes.dex */
public enum YogaEdge {
    LEFT(0),
    TOP(1),
    RIGHT(2),
    BOTTOM(3),
    START(4),
    END(5),
    HORIZONTAL(6),
    VERTICAL(7),
    ALL(8);


    /* renamed from: k */
    private final int f5752k;

    YogaEdge(int i) {
        this.f5752k = i;
    }

    /* renamed from: a */
    public static YogaEdge m6477a(int i) {
        switch (i) {
            case 0:
                return LEFT;
            case 1:
                return TOP;
            case 2:
                return RIGHT;
            case 3:
                return BOTTOM;
            case 4:
                return START;
            case 5:
                return END;
            case 6:
                return HORIZONTAL;
            case 7:
                return VERTICAL;
            case 8:
                return ALL;
            default:
                throw new IllegalArgumentException("Unknown enum value: " + i);
        }
    }

    /* renamed from: b */
    public int m6478b() {
        return this.f5752k;
    }
}
