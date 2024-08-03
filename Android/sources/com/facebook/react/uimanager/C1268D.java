package com.facebook.react.uimanager;

/* renamed from: com.facebook.react.uimanager.D */
/* loaded from: classes.dex */
public class C1268D {

    /* renamed from: a */
    private static int f4732a = 1;

    /* renamed from: a */
    public static synchronized int m5474a() {
        int i;
        synchronized (C1268D.class) {
            i = f4732a;
            f4732a += 10;
        }
        return i;
    }
}
