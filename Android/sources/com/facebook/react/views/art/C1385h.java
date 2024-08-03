package com.facebook.react.views.art;

import com.facebook.react.bridge.ReadableArray;

/* renamed from: com.facebook.react.views.art.h */
/* loaded from: classes.dex */
class C1385h {
    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static int m5977a(ReadableArray readableArray, float[] fArr) {
        int length = readableArray.size() > fArr.length ? fArr.length : readableArray.size();
        for (int i = 0; i < length; i++) {
            fArr[i] = (float) readableArray.getDouble(i);
        }
        return readableArray.size();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static float[] m5978a(ReadableArray readableArray) {
        if (readableArray == null) {
            return null;
        }
        float[] fArr = new float[readableArray.size()];
        m5977a(readableArray, fArr);
        return fArr;
    }
}
