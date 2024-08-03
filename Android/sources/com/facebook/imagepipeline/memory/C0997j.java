package com.facebook.imagepipeline.memory;

import android.util.SparseIntArray;

/* renamed from: com.facebook.imagepipeline.memory.j */
/* loaded from: classes.dex */
public class C0997j {
    /* renamed from: a */
    public static C1010w m5024a() {
        SparseIntArray sparseIntArray = new SparseIntArray();
        sparseIntArray.put(1024, 5);
        sparseIntArray.put(2048, 5);
        sparseIntArray.put(4096, 5);
        sparseIntArray.put(8192, 5);
        sparseIntArray.put(16384, 5);
        sparseIntArray.put(32768, 5);
        sparseIntArray.put(65536, 5);
        sparseIntArray.put(131072, 5);
        sparseIntArray.put(262144, 2);
        sparseIntArray.put(524288, 2);
        sparseIntArray.put(1048576, 2);
        return new C1010w(m5026c(), m5025b(), sparseIntArray);
    }

    /* renamed from: b */
    private static int m5025b() {
        int min = (int) Math.min(Runtime.getRuntime().maxMemory(), 2147483647L);
        return min < 16777216 ? min / 2 : (min / 4) * 3;
    }

    /* renamed from: c */
    private static int m5026c() {
        int min = (int) Math.min(Runtime.getRuntime().maxMemory(), 2147483647L);
        if (min < 16777216) {
            return 3145728;
        }
        return min < 33554432 ? 6291456 : 12582912;
    }
}
