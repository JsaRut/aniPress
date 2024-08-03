package com.facebook.react.uimanager.p129c;

/* renamed from: com.facebook.react.uimanager.c.k */
/* loaded from: classes.dex */
enum EnumC1311k {
    CREATE,
    UPDATE,
    DELETE;

    /* renamed from: a */
    public static String m5695a(EnumC1311k enumC1311k) {
        int i = C1310j.f4840a[enumC1311k.ordinal()];
        if (i == 1) {
            return "create";
        }
        if (i == 2) {
            return "update";
        }
        if (i == 3) {
            return "delete";
        }
        throw new IllegalArgumentException("Unsupported LayoutAnimationType: " + enumC1311k);
    }
}
