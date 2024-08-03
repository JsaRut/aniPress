package com.facebook.react.uimanager.events;

/* renamed from: com.facebook.react.uimanager.events.n */
/* loaded from: classes.dex */
public enum EnumC1341n {
    START,
    END,
    MOVE,
    CANCEL;

    /* renamed from: a */
    public static String m5773a(EnumC1341n enumC1341n) {
        int i = C1340m.f4901a[enumC1341n.ordinal()];
        if (i == 1) {
            return "topTouchStart";
        }
        if (i == 2) {
            return "topTouchEnd";
        }
        if (i == 3) {
            return "topTouchMove";
        }
        if (i == 4) {
            return "topTouchCancel";
        }
        throw new IllegalArgumentException("Unexpected type " + enumC1341n);
    }
}
