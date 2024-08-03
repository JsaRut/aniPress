package com.facebook.react.animated;

import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;

/* renamed from: com.facebook.react.animated.h */
/* loaded from: classes.dex */
class C1042h extends AbstractC1038d {

    /* renamed from: e */
    private long f4301e;

    /* renamed from: f */
    private double[] f4302f;

    /* renamed from: g */
    private double f4303g;

    /* renamed from: h */
    private double f4304h;

    /* renamed from: i */
    private int f4305i;

    /* renamed from: j */
    private int f4306j;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C1042h(ReadableMap readableMap) {
        mo5140a(readableMap);
    }

    @Override // com.facebook.react.animated.AbstractC1038d
    /* renamed from: a */
    public void mo5139a(long j) {
        double d2;
        if (this.f4301e < 0) {
            this.f4301e = j;
            if (this.f4306j == 1) {
                this.f4304h = this.f4284b.f4274e;
            }
        }
        double d3 = (j - this.f4301e) / 1000000;
        Double.isNaN(d3);
        int round = (int) Math.round(d3 / 16.666666666666668d);
        if (round < 0) {
            throw new IllegalStateException("Calculated frame index should never be lower than 0");
        }
        if (this.f4283a) {
            return;
        }
        double[] dArr = this.f4302f;
        if (round >= dArr.length - 1) {
            d2 = this.f4303g;
            int i = this.f4305i;
            if (i == -1 || this.f4306j < i) {
                this.f4301e = -1L;
                this.f4306j++;
            } else {
                this.f4283a = true;
            }
        } else {
            double d4 = this.f4304h;
            d2 = d4 + (dArr[round] * (this.f4303g - d4));
        }
        this.f4284b.f4274e = d2;
    }

    @Override // com.facebook.react.animated.AbstractC1038d
    /* renamed from: a */
    public void mo5140a(ReadableMap readableMap) {
        ReadableArray array = readableMap.getArray("frames");
        int size = array.size();
        double[] dArr = this.f4302f;
        if (dArr == null || dArr.length != size) {
            this.f4302f = new double[size];
        }
        for (int i = 0; i < size; i++) {
            this.f4302f[i] = array.getDouble(i);
        }
        this.f4303g = readableMap.hasKey("toValue") ? readableMap.getDouble("toValue") : 0.0d;
        this.f4305i = readableMap.hasKey("iterations") ? readableMap.getInt("iterations") : 1;
        this.f4306j = 1;
        this.f4283a = this.f4305i == 0;
        this.f4301e = -1L;
    }
}
