package com.facebook.imagepipeline.memory;

import android.util.SparseIntArray;
import p139d.p143b.p148c.p152d.C1691j;

/* renamed from: com.facebook.imagepipeline.memory.w */
/* loaded from: classes.dex */
public class C1010w {

    /* renamed from: a */
    public final int f4188a;

    /* renamed from: b */
    public final int f4189b;

    /* renamed from: c */
    public final SparseIntArray f4190c;

    /* renamed from: d */
    public final int f4191d;

    /* renamed from: e */
    public final int f4192e;

    /* renamed from: f */
    public boolean f4193f;

    /* renamed from: g */
    public final int f4194g;

    public C1010w(int i, int i2, SparseIntArray sparseIntArray) {
        this(i, i2, sparseIntArray, 0, Integer.MAX_VALUE, -1);
    }

    public C1010w(int i, int i2, SparseIntArray sparseIntArray, int i3, int i4, int i5) {
        C1691j.m6978b(i >= 0 && i2 >= i);
        this.f4189b = i;
        this.f4188a = i2;
        this.f4190c = sparseIntArray;
        this.f4191d = i3;
        this.f4192e = i4;
        this.f4194g = i5;
    }
}
