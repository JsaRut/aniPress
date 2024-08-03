package com.facebook.imagepipeline.memory;

import android.util.SparseIntArray;

/* renamed from: com.facebook.imagepipeline.memory.g */
/* loaded from: classes.dex */
public class C0994g {

    /* renamed from: a */
    private static final SparseIntArray f4149a = new SparseIntArray(0);

    /* renamed from: a */
    public static C1010w m5019a() {
        return new C1010w(0, m5020b(), f4149a);
    }

    /* renamed from: b */
    private static int m5020b() {
        int min = (int) Math.min(Runtime.getRuntime().maxMemory(), 2147483647L);
        return min > 16777216 ? (min / 4) * 3 : min / 2;
    }
}
