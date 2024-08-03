package com.facebook.imagepipeline.memory;

import android.util.SparseIntArray;

/* renamed from: com.facebook.imagepipeline.memory.i */
/* loaded from: classes.dex */
public class C0996i {

    /* renamed from: a */
    public static final int f4150a = Runtime.getRuntime().availableProcessors();

    /* renamed from: a */
    public static SparseIntArray m5022a(int i, int i2, int i3) {
        SparseIntArray sparseIntArray = new SparseIntArray();
        while (i <= i2) {
            sparseIntArray.put(i, i3);
            i *= 2;
        }
        return sparseIntArray;
    }

    /* renamed from: a */
    public static C1010w m5023a() {
        int i = f4150a;
        return new C1010w(4194304, i * 4194304, m5022a(131072, 4194304, i), 131072, 4194304, f4150a);
    }
}
