package com.facebook.react.animated;

import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;

/* renamed from: com.facebook.react.animated.i */
/* loaded from: classes.dex */
class C1043i extends C1034Q {

    /* renamed from: h */
    private final double[] f4307h;

    /* renamed from: i */
    private final double[] f4308i;

    /* renamed from: j */
    private final String f4309j;

    /* renamed from: k */
    private final String f4310k;

    /* renamed from: l */
    private C1034Q f4311l;

    public C1043i(ReadableMap readableMap) {
        this.f4307h = m5157a(readableMap.getArray("inputRange"));
        this.f4308i = m5157a(readableMap.getArray("outputRange"));
        this.f4309j = readableMap.getString("extrapolateLeft");
        this.f4310k = readableMap.getString("extrapolateRight");
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0065 A[RETURN] */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static double m5154a(double r15, double r17, double r19, double r21, double r23, java.lang.String r25, java.lang.String r26) {
        /*
            r0 = r25
            r1 = r26
            r2 = 0
            java.lang.String r3 = "Invalid extrapolation type "
            java.lang.String r4 = "clamp"
            java.lang.String r5 = "identity"
            java.lang.String r6 = "extend"
            r7 = 94742715(0x5a5a8bb, float:1.5578507E-35)
            r8 = -135761730(0xfffffffff7e870be, float:-9.428903E33)
            r9 = -1289044198(0xffffffffb32abf1a, float:-3.9755015E-8)
            r10 = -1
            r11 = 2
            r12 = 1
            int r13 = (r15 > r17 ? 1 : (r15 == r17 ? 0 : -1))
            if (r13 >= 0) goto L66
            int r13 = r25.hashCode()
            if (r13 == r9) goto L38
            if (r13 == r8) goto L30
            if (r13 == r7) goto L28
            goto L40
        L28:
            boolean r13 = r0.equals(r4)
            if (r13 == 0) goto L40
            r13 = 1
            goto L41
        L30:
            boolean r13 = r0.equals(r5)
            if (r13 == 0) goto L40
            r13 = 0
            goto L41
        L38:
            boolean r13 = r0.equals(r6)
            if (r13 == 0) goto L40
            r13 = 2
            goto L41
        L40:
            r13 = -1
        L41:
            if (r13 == 0) goto L65
            if (r13 == r12) goto L62
            if (r13 != r11) goto L48
            goto L66
        L48:
            com.facebook.react.bridge.JSApplicationIllegalArgumentException r1 = new com.facebook.react.bridge.JSApplicationIllegalArgumentException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r3)
            r2.append(r0)
            java.lang.String r0 = "for left extrapolation"
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            r1.<init>(r0)
            throw r1
        L62:
            r13 = r17
            goto L67
        L65:
            return r15
        L66:
            r13 = r15
        L67:
            int r0 = (r13 > r19 ? 1 : (r13 == r19 ? 0 : -1))
            if (r0 <= 0) goto Lb2
            int r0 = r26.hashCode()
            if (r0 == r9) goto L86
            if (r0 == r8) goto L7e
            if (r0 == r7) goto L76
            goto L8d
        L76:
            boolean r0 = r1.equals(r4)
            if (r0 == 0) goto L8d
            r10 = 1
            goto L8d
        L7e:
            boolean r0 = r1.equals(r5)
            if (r0 == 0) goto L8d
            r10 = 0
            goto L8d
        L86:
            boolean r0 = r1.equals(r6)
            if (r0 == 0) goto L8d
            r10 = 2
        L8d:
            if (r10 == 0) goto Lb1
            if (r10 == r12) goto Lae
            if (r10 != r11) goto L94
            goto Lb2
        L94:
            com.facebook.react.bridge.JSApplicationIllegalArgumentException r0 = new com.facebook.react.bridge.JSApplicationIllegalArgumentException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r3)
            r2.append(r1)
            java.lang.String r1 = "for right extrapolation"
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            r0.<init>(r1)
            throw r0
        Lae:
            r13 = r19
            goto Lb2
        Lb1:
            return r13
        Lb2:
            double r0 = r23 - r21
            double r13 = r13 - r17
            double r0 = r0 * r13
            double r2 = r19 - r17
            double r0 = r0 / r2
            double r0 = r21 + r0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.react.animated.C1043i.m5154a(double, double, double, double, double, java.lang.String, java.lang.String):double");
    }

    /* renamed from: a */
    static double m5155a(double d2, double[] dArr, double[] dArr2, String str, String str2) {
        int m5156a = m5156a(d2, dArr);
        int i = m5156a + 1;
        return m5154a(d2, dArr[m5156a], dArr[i], dArr2[m5156a], dArr2[i], str, str2);
    }

    /* renamed from: a */
    private static int m5156a(double d2, double[] dArr) {
        int i = 1;
        while (i < dArr.length - 1 && dArr[i] < d2) {
            i++;
        }
        return i - 1;
    }

    /* renamed from: a */
    private static double[] m5157a(ReadableArray readableArray) {
        double[] dArr = new double[readableArray.size()];
        for (int i = 0; i < dArr.length; i++) {
            dArr[i] = readableArray.getDouble(i);
        }
        return dArr;
    }

    @Override // com.facebook.react.animated.AbstractC1036b
    /* renamed from: a */
    public void mo5142a() {
        C1034Q c1034q = this.f4311l;
        if (c1034q == null) {
            return;
        }
        this.f4274e = m5155a(c1034q.m5147d(), this.f4307h, this.f4308i, this.f4309j, this.f4310k);
    }

    @Override // com.facebook.react.animated.AbstractC1036b
    /* renamed from: b */
    public void mo5150b(AbstractC1036b abstractC1036b) {
        if (this.f4311l != null) {
            throw new IllegalStateException("Parent already attached");
        }
        if (!(abstractC1036b instanceof C1034Q)) {
            throw new IllegalArgumentException("Parent is of an invalid type");
        }
        this.f4311l = (C1034Q) abstractC1036b;
    }

    @Override // com.facebook.react.animated.AbstractC1036b
    /* renamed from: c */
    public void mo5151c(AbstractC1036b abstractC1036b) {
        if (abstractC1036b != this.f4311l) {
            throw new IllegalArgumentException("Invalid parent node provided");
        }
        this.f4311l = null;
    }
}
