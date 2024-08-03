package com.facebook.react.animated;

import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;

/* renamed from: com.facebook.react.animated.k */
/* loaded from: classes.dex */
public class C1045k extends C1034Q {

    /* renamed from: h */
    private final C1024H f4315h;

    /* renamed from: i */
    private final int[] f4316i;

    public C1045k(ReadableMap readableMap, C1024H c1024h) {
        this.f4315h = c1024h;
        ReadableArray array = readableMap.getArray("input");
        this.f4316i = new int[array.size()];
        int i = 0;
        while (true) {
            int[] iArr = this.f4316i;
            if (i >= iArr.length) {
                return;
            }
            iArr[i] = array.getInt(i);
            i++;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x002e, code lost:            throw new com.facebook.react.bridge.JSApplicationCausedNativeException("Illegal node ID set as an input for Animated.multiply node");     */
    @Override // com.facebook.react.animated.AbstractC1036b
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void mo5142a() {
        /*
            r6 = this;
            r0 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            r6.f4274e = r0
            r0 = 0
        L5:
            int[] r1 = r6.f4316i
            int r2 = r1.length
            if (r0 >= r2) goto L2f
            com.facebook.react.animated.H r2 = r6.f4315h
            r1 = r1[r0]
            com.facebook.react.animated.b r1 = r2.m5126d(r1)
            if (r1 == 0) goto L27
            boolean r2 = r1 instanceof com.facebook.react.animated.C1034Q
            if (r2 == 0) goto L27
            double r2 = r6.f4274e
            com.facebook.react.animated.Q r1 = (com.facebook.react.animated.C1034Q) r1
            double r4 = r1.m5147d()
            double r2 = r2 * r4
            r6.f4274e = r2
            int r0 = r0 + 1
            goto L5
        L27:
            com.facebook.react.bridge.JSApplicationCausedNativeException r0 = new com.facebook.react.bridge.JSApplicationCausedNativeException
            java.lang.String r1 = "Illegal node ID set as an input for Animated.multiply node"
            r0.<init>(r1)
            throw r0
        L2f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.react.animated.C1045k.mo5142a():void");
    }
}
