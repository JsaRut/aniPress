package com.facebook.react.animated;

import com.facebook.react.bridge.ReadableMap;

/* renamed from: com.facebook.react.animated.e */
/* loaded from: classes.dex */
public class C1039e extends AbstractC1038d {

    /* renamed from: e */
    private final double f4287e;

    /* renamed from: f */
    private double f4288f;

    /* renamed from: g */
    private long f4289g;

    /* renamed from: h */
    private double f4290h;

    /* renamed from: i */
    private double f4291i;

    /* renamed from: j */
    private int f4292j;

    /* renamed from: k */
    private int f4293k;

    public C1039e(ReadableMap readableMap) {
        this.f4287e = readableMap.getDouble("velocity");
        mo5140a(readableMap);
    }

    @Override // com.facebook.react.animated.AbstractC1038d
    /* renamed from: a */
    public void mo5139a(long j) {
        long j2 = j / 1000000;
        if (this.f4289g == -1) {
            this.f4289g = j2 - 16;
            double d2 = this.f4290h;
            if (d2 == this.f4291i) {
                this.f4290h = this.f4284b.f4274e;
            } else {
                this.f4284b.f4274e = d2;
            }
            this.f4291i = this.f4284b.f4274e;
        }
        double d3 = this.f4290h;
        double d4 = this.f4287e;
        double d5 = this.f4288f;
        double d6 = j2 - this.f4289g;
        Double.isNaN(d6);
        double exp = d3 + ((d4 / (1.0d - d5)) * (1.0d - Math.exp((-(1.0d - d5)) * d6)));
        if (Math.abs(this.f4291i - exp) < 0.1d) {
            int i = this.f4292j;
            if (i != -1 && this.f4293k >= i) {
                this.f4283a = true;
                return;
            } else {
                this.f4289g = -1L;
                this.f4293k++;
            }
        }
        this.f4291i = exp;
        this.f4284b.f4274e = exp;
    }

    @Override // com.facebook.react.animated.AbstractC1038d
    /* renamed from: a */
    public void mo5140a(ReadableMap readableMap) {
        this.f4288f = readableMap.getDouble("deceleration");
        this.f4292j = readableMap.hasKey("iterations") ? readableMap.getInt("iterations") : 1;
        this.f4293k = 1;
        this.f4283a = this.f4292j == 0;
        this.f4289g = -1L;
        this.f4290h = 0.0d;
        this.f4291i = 0.0d;
    }
}
