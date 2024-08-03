package com.facebook.react.animated;

import com.facebook.react.bridge.JSApplicationCausedNativeException;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;

/* renamed from: com.facebook.react.animated.g */
/* loaded from: classes.dex */
public class C1041g extends C1034Q {

    /* renamed from: h */
    private final C1024H f4299h;

    /* renamed from: i */
    private final int[] f4300i;

    public C1041g(ReadableMap readableMap, C1024H c1024h) {
        this.f4299h = c1024h;
        ReadableArray array = readableMap.getArray("input");
        this.f4300i = new int[array.size()];
        int i = 0;
        while (true) {
            int[] iArr = this.f4300i;
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
            int[] iArr = this.f4300i;
            if (i >= iArr.length) {
                return;
            }
            AbstractC1036b m5126d = this.f4299h.m5126d(iArr[i]);
            if (m5126d == null || !(m5126d instanceof C1034Q)) {
                break;
            }
            double m5147d = ((C1034Q) m5126d).m5147d();
            if (i == 0) {
                this.f4274e = m5147d;
            } else {
                if (m5147d == 0.0d) {
                    throw new JSApplicationCausedNativeException("Detected a division by zero in Animated.divide node");
                }
                this.f4274e /= m5147d;
            }
            i++;
        }
        throw new JSApplicationCausedNativeException("Illegal node ID set as an input for Animated.divide node");
    }
}
