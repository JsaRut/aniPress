package com.facebook.react.views.scroll;

import android.os.SystemClock;

/* renamed from: com.facebook.react.views.scroll.b */
/* loaded from: classes.dex */
public class C1421b {

    /* renamed from: a */
    private int f5209a = Integer.MIN_VALUE;

    /* renamed from: b */
    private int f5210b = Integer.MIN_VALUE;

    /* renamed from: c */
    private float f5211c = 0.0f;

    /* renamed from: d */
    private float f5212d = 0.0f;

    /* renamed from: e */
    private long f5213e = -11;

    /* renamed from: a */
    public float m6053a() {
        return this.f5211c;
    }

    /* renamed from: a */
    public boolean m6054a(int i, int i2) {
        long uptimeMillis = SystemClock.uptimeMillis();
        boolean z = (uptimeMillis - this.f5213e <= 10 && this.f5209a == i && this.f5210b == i2) ? false : true;
        long j = this.f5213e;
        if (uptimeMillis - j != 0) {
            this.f5211c = (i - this.f5209a) / ((float) (uptimeMillis - j));
            this.f5212d = (i2 - this.f5210b) / ((float) (uptimeMillis - j));
        }
        this.f5213e = uptimeMillis;
        this.f5209a = i;
        this.f5210b = i2;
        return z;
    }

    /* renamed from: b */
    public float m6055b() {
        return this.f5212d;
    }
}
