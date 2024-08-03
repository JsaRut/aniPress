package com.facebook.react.animated;

import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;

/* renamed from: com.facebook.react.animated.a */
/* loaded from: classes.dex */
public class C1035a extends C1034Q {

    /* renamed from: h */
    private final C1024H f4277h;

    /* renamed from: i */
    private final int[] f4278i;

    public C1035a(ReadableMap readableMap, C1024H c1024h) {
        this.f4277h = c1024h;
        ReadableArray array = readableMap.getArray("input");
        this.f4278i = new int[array.size()];
        int i = 0;
        while (true) {
            int[] iArr = this.f4278i;
            if (i >= iArr.length) {
                return;
            }
            iArr[i] = array.getInt(i);
            i++;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x002d, code lost:            throw new com.facebook.react.bridge.JSApplicationCausedNativeException("Illegal node ID set as an input for Animated.Add node");     */
    @Override // com.facebook.react.animated.AbstractC1036b
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void mo5142a() {
        /*
            r6 = this;
            r0 = 0
            r6.f4274e = r0
            r0 = 0
        L5:
            int[] r1 = r6.f4278i
            int r2 = r1.length
            if (r0 >= r2) goto L2e
            com.facebook.react.animated.H r2 = r6.f4277h
            r1 = r1[r0]
            com.facebook.react.animated.b r1 = r2.m5126d(r1)
            if (r1 == 0) goto L26
            boolean r2 = r1 instanceof com.facebook.react.animated.C1034Q
            if (r2 == 0) goto L26
            double r2 = r6.f4274e
            com.facebook.react.animated.Q r1 = (com.facebook.react.animated.C1034Q) r1
            double r4 = r1.m5147d()
            double r2 = r2 + r4
            r6.f4274e = r2
            int r0 = r0 + 1
            goto L5
        L26:
            com.facebook.react.bridge.JSApplicationCausedNativeException r0 = new com.facebook.react.bridge.JSApplicationCausedNativeException
            java.lang.String r1 = "Illegal node ID set as an input for Animated.Add node"
            r0.<init>(r1)
            throw r0
        L2e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.react.animated.C1035a.mo5142a():void");
    }
}
