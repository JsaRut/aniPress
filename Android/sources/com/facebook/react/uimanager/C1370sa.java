package com.facebook.react.uimanager;

import com.facebook.react.common.C1098a;
import com.facebook.yoga.YogaNode;

/* renamed from: com.facebook.react.uimanager.sa */
/* loaded from: classes.dex */
public class C1370sa {

    /* renamed from: a */
    private static final Object f5075a = new Object();

    /* renamed from: b */
    private static C1098a<YogaNode> f5076b;

    /* renamed from: a */
    public static C1098a<YogaNode> m5936a() {
        C1098a<YogaNode> c1098a;
        C1098a<YogaNode> c1098a2 = f5076b;
        if (c1098a2 != null) {
            return c1098a2;
        }
        synchronized (f5075a) {
            if (f5076b == null) {
                f5076b = new C1098a<>(1024);
            }
            c1098a = f5076b;
        }
        return c1098a;
    }
}
