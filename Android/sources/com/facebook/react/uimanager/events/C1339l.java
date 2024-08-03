package com.facebook.react.uimanager.events;

import android.util.SparseIntArray;

/* renamed from: com.facebook.react.uimanager.events.l */
/* loaded from: classes.dex */
public class C1339l {

    /* renamed from: a */
    private final SparseIntArray f4900a = new SparseIntArray();

    /* renamed from: a */
    public void m5768a(long j) {
        this.f4900a.put((int) j, 0);
    }

    /* renamed from: b */
    public short m5769b(long j) {
        int i = this.f4900a.get((int) j, -1);
        if (i != -1) {
            return (short) (65535 & i);
        }
        throw new RuntimeException("Tried to get non-existent cookie");
    }

    /* renamed from: c */
    public boolean m5770c(long j) {
        return this.f4900a.get((int) j, -1) != -1;
    }

    /* renamed from: d */
    public void m5771d(long j) {
        int i = (int) j;
        int i2 = this.f4900a.get(i, -1);
        if (i2 == -1) {
            throw new RuntimeException("Tried to increment non-existent cookie");
        }
        this.f4900a.put(i, i2 + 1);
    }

    /* renamed from: e */
    public void m5772e(long j) {
        this.f4900a.delete((int) j);
    }
}
