package com.facebook.react.uimanager;

import java.util.Comparator;

/* renamed from: com.facebook.react.uimanager.ja */
/* loaded from: classes.dex */
public class C1352ja {

    /* renamed from: a */
    public static Comparator<C1352ja> f5008a = new C1350ia();

    /* renamed from: b */
    public final int f5009b;

    /* renamed from: c */
    public final int f5010c;

    public C1352ja(int i, int i2) {
        this.f5009b = i;
        this.f5010c = i2;
    }

    public boolean equals(Object obj) {
        if (obj == null || obj.getClass() != C1352ja.class) {
            return false;
        }
        C1352ja c1352ja = (C1352ja) obj;
        return this.f5010c == c1352ja.f5010c && this.f5009b == c1352ja.f5009b;
    }

    public String toString() {
        return "[" + this.f5009b + ", " + this.f5010c + "]";
    }
}
