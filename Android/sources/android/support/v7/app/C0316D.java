package android.support.v7.app;

/* renamed from: android.support.v7.app.D */
/* loaded from: classes.dex */
class C0316D {

    /* renamed from: a */
    private static C0316D f1490a;

    /* renamed from: b */
    public long f1491b;

    /* renamed from: c */
    public long f1492c;

    /* renamed from: d */
    public int f1493d;

    C0316D() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static C0316D m1757a() {
        if (f1490a == null) {
            f1490a = new C0316D();
        }
        return f1490a;
    }

    /* renamed from: a */
    public void m1758a(long j, double d2, double d3) {
        float f = ((float) (j - 946728000000L)) / 8.64E7f;
        double d4 = (0.01720197f * f) + 6.24006f;
        double sin = Math.sin(d4) * 0.03341960161924362d;
        Double.isNaN(d4);
        double sin2 = sin + d4 + (Math.sin(2.0f * r4) * 3.4906598739326E-4d) + (Math.sin(r4 * 3.0f) * 5.236000106378924E-6d) + 1.796593063d + 3.141592653589793d;
        double d5 = (-d3) / 360.0d;
        double d6 = f - 9.0E-4f;
        Double.isNaN(d6);
        double round = ((float) Math.round(d6 - d5)) + 9.0E-4f;
        Double.isNaN(round);
        double sin3 = round + d5 + (Math.sin(d4) * 0.0053d) + (Math.sin(2.0d * sin2) * (-0.0069d));
        double asin = Math.asin(Math.sin(sin2) * Math.sin(0.4092797040939331d));
        double d7 = 0.01745329238474369d * d2;
        double sin4 = (Math.sin(-0.10471975803375244d) - (Math.sin(d7) * Math.sin(asin))) / (Math.cos(d7) * Math.cos(asin));
        if (sin4 >= 1.0d) {
            this.f1493d = 1;
        } else {
            if (sin4 > -1.0d) {
                double acos = (float) (Math.acos(sin4) / 6.283185307179586d);
                Double.isNaN(acos);
                this.f1491b = Math.round((sin3 + acos) * 8.64E7d) + 946728000000L;
                Double.isNaN(acos);
                this.f1492c = Math.round((sin3 - acos) * 8.64E7d) + 946728000000L;
                if (this.f1492c >= j || this.f1491b <= j) {
                    this.f1493d = 1;
                    return;
                } else {
                    this.f1493d = 0;
                    return;
                }
            }
            this.f1493d = 0;
        }
        this.f1491b = -1L;
        this.f1492c = -1L;
    }
}
