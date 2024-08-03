package com.facebook.react.views.scroll;

/* renamed from: com.facebook.react.views.scroll.l */
/* loaded from: classes.dex */
public enum EnumC1431l {
    BEGIN_DRAG,
    END_DRAG,
    SCROLL,
    MOMENTUM_BEGIN,
    MOMENTUM_END;

    /* renamed from: a */
    public static String m6105a(EnumC1431l enumC1431l) {
        int i = C1430k.f5285a[enumC1431l.ordinal()];
        if (i == 1) {
            return "topScrollBeginDrag";
        }
        if (i == 2) {
            return "topScrollEndDrag";
        }
        if (i == 3) {
            return "topScroll";
        }
        if (i == 4) {
            return "topMomentumScrollBegin";
        }
        if (i == 5) {
            return "topMomentumScrollEnd";
        }
        throw new IllegalArgumentException("Unsupported ScrollEventType: " + enumC1431l);
    }
}
