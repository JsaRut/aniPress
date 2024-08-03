package com.facebook.react.animated;

import com.facebook.react.bridge.JSApplicationCausedNativeException;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;

/* renamed from: com.facebook.react.animated.M */
/* loaded from: classes.dex */
public class C1029M extends C1034Q {

    /* renamed from: h */
    private final C1024H f4259h;

    /* renamed from: i */
    private final int[] f4260i;

    public C1029M(ReadableMap readableMap, C1024H c1024h) {
        this.f4259h = c1024h;
        ReadableArray array = readableMap.getArray("input");
        this.f4260i = new int[array.size()];
        int i = 0;
        while (true) {
            int[] iArr = this.f4260i;
            if (i >= iArr.length) {
                return;
            }
            iArr[i] = array.getInt(i);
            i++;
        }
    }

    @Override // com.facebook.react.animated.AbstractC1036b
    /* renamed from: a */
    public void mo5142a() {
        int i = 0;
        while (true) {
            int[] iArr = this.f4260i;
            if (i >= iArr.length) {
                return;
            }
            AbstractC1036b m5126d = this.f4259h.m5126d(iArr[i]);
            if (m5126d == null || !(m5126d instanceof C1034Q)) {
                break;
            }
            C1034Q c1034q = (C1034Q) m5126d;
            double m5147d = c1034q.m5147d();
            if (i != 0) {
                m5147d = this.f4274e - c1034q.m5147d();
            }
            this.f4274e = m5147d;
            i++;
        }
        throw new JSApplicationCausedNativeException("Illegal node ID set as an input for Animated.subtract node");
    }
}
