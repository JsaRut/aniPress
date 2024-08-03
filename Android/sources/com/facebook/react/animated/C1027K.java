package com.facebook.react.animated;

import com.facebook.react.bridge.ReadableMap;

/* renamed from: com.facebook.react.animated.K */
/* loaded from: classes.dex */
class C1027K extends AbstractC1038d {

    /* renamed from: e */
    private long f4239e;

    /* renamed from: f */
    private boolean f4240f;

    /* renamed from: g */
    private double f4241g;

    /* renamed from: h */
    private double f4242h;

    /* renamed from: i */
    private double f4243i;

    /* renamed from: j */
    private double f4244j;

    /* renamed from: k */
    private boolean f4245k;

    /* renamed from: l */
    private final a f4246l = new a();

    /* renamed from: m */
    private double f4247m;

    /* renamed from: n */
    private double f4248n;

    /* renamed from: o */
    private double f4249o;

    /* renamed from: p */
    private double f4250p;

    /* renamed from: q */
    private double f4251q;

    /* renamed from: r */
    private int f4252r;

    /* renamed from: s */
    private int f4253s;

    /* renamed from: t */
    private double f4254t;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.facebook.react.animated.K$a */
    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a */
        double f4255a;

        /* renamed from: b */
        double f4256b;

        private a() {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C1027K(ReadableMap readableMap) {
        this.f4246l.f4256b = readableMap.getDouble("initialVelocity");
        mo5140a(readableMap);
    }

    /* renamed from: a */
    private double m5135a(a aVar) {
        return Math.abs(this.f4248n - aVar.f4255a);
    }

    /* renamed from: a */
    private void m5136a(double d2) {
        double d3;
        double d4;
        if (m5137a()) {
            return;
        }
        this.f4251q += d2 <= 0.064d ? d2 : 0.064d;
        double d5 = this.f4242h;
        double d6 = this.f4243i;
        double d7 = this.f4241g;
        double d8 = -this.f4244j;
        double sqrt = d5 / (Math.sqrt(d7 * d6) * 2.0d);
        double sqrt2 = Math.sqrt(d7 / d6);
        double sqrt3 = Math.sqrt(1.0d - (sqrt * sqrt)) * sqrt2;
        double d9 = this.f4248n - this.f4247m;
        double d10 = this.f4251q;
        if (sqrt < 1.0d) {
            double exp = Math.exp((-sqrt) * sqrt2 * d10);
            double d11 = sqrt * sqrt2;
            double d12 = d8 + (d11 * d9);
            double d13 = d10 * sqrt3;
            double sin = this.f4248n - ((((d12 / sqrt3) * Math.sin(d13)) + (Math.cos(d13) * d9)) * exp);
            d4 = ((d11 * exp) * (((Math.sin(d13) * d12) / sqrt3) + (Math.cos(d13) * d9))) - (((Math.cos(d13) * d12) - ((sqrt3 * d9) * Math.sin(d13))) * exp);
            d3 = sin;
        } else {
            double exp2 = Math.exp((-sqrt2) * d10);
            d3 = this.f4248n - (((((sqrt2 * d9) + d8) * d10) + d9) * exp2);
            d4 = exp2 * ((d8 * ((d10 * sqrt2) - 1.0d)) + (d10 * d9 * sqrt2 * sqrt2));
        }
        a aVar = this.f4246l;
        aVar.f4255a = d3;
        aVar.f4256b = d4;
        if (m5137a() || (this.f4245k && m5138b())) {
            if (this.f4241g > 0.0d) {
                double d14 = this.f4248n;
                this.f4247m = d14;
                this.f4246l.f4255a = d14;
            } else {
                this.f4248n = this.f4246l.f4255a;
                this.f4247m = this.f4248n;
            }
            this.f4246l.f4256b = 0.0d;
        }
    }

    /* renamed from: a */
    private boolean m5137a() {
        return Math.abs(this.f4246l.f4256b) <= this.f4249o && (m5135a(this.f4246l) <= this.f4250p || this.f4241g == 0.0d);
    }

    /* renamed from: b */
    private boolean m5138b() {
        if (this.f4241g > 0.0d) {
            double d2 = this.f4247m;
            double d3 = this.f4248n;
            if (d2 >= d3 || this.f4246l.f4255a <= d3) {
                double d4 = this.f4247m;
                double d5 = this.f4248n;
                if (d4 <= d5 || this.f4246l.f4255a >= d5) {
                }
            }
            return true;
        }
        return false;
    }

    @Override // com.facebook.react.animated.AbstractC1038d
    /* renamed from: a */
    public void mo5139a(long j) {
        long j2 = j / 1000000;
        if (!this.f4240f) {
            if (this.f4253s == 0) {
                this.f4254t = this.f4284b.f4274e;
                this.f4253s = 1;
            }
            a aVar = this.f4246l;
            double d2 = this.f4284b.f4274e;
            aVar.f4255a = d2;
            this.f4247m = d2;
            this.f4239e = j2;
            this.f4251q = 0.0d;
            this.f4240f = true;
        }
        double d3 = j2 - this.f4239e;
        Double.isNaN(d3);
        m5136a(d3 / 1000.0d);
        this.f4239e = j2;
        this.f4284b.f4274e = this.f4246l.f4255a;
        if (m5137a()) {
            int i = this.f4252r;
            if (i != -1 && this.f4253s >= i) {
                this.f4283a = true;
                return;
            }
            this.f4240f = false;
            this.f4284b.f4274e = this.f4254t;
            this.f4253s++;
        }
    }

    @Override // com.facebook.react.animated.AbstractC1038d
    /* renamed from: a */
    public void mo5140a(ReadableMap readableMap) {
        this.f4241g = readableMap.getDouble("stiffness");
        this.f4242h = readableMap.getDouble("damping");
        this.f4243i = readableMap.getDouble("mass");
        this.f4244j = this.f4246l.f4256b;
        this.f4248n = readableMap.getDouble("toValue");
        this.f4249o = readableMap.getDouble("restSpeedThreshold");
        this.f4250p = readableMap.getDouble("restDisplacementThreshold");
        this.f4245k = readableMap.getBoolean("overshootClamping");
        this.f4252r = readableMap.hasKey("iterations") ? readableMap.getInt("iterations") : 1;
        this.f4283a = this.f4252r == 0;
        this.f4253s = 0;
        this.f4251q = 0.0d;
        this.f4240f = false;
    }
}
