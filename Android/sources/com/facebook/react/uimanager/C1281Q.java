package com.facebook.react.uimanager;

import com.facebook.react.bridge.JSApplicationIllegalArgumentException;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableType;

/* renamed from: com.facebook.react.uimanager.Q */
/* loaded from: classes.dex */
public class C1281Q {

    /* renamed from: a */
    private static ThreadLocal<double[]> f4769a = new C1280P();

    /* renamed from: a */
    private static double m5605a(ReadableMap readableMap, String str) {
        double d2;
        boolean z = true;
        if (readableMap.getType(str) == ReadableType.String) {
            String string = readableMap.getString(str);
            if (string.endsWith("rad")) {
                string = string.substring(0, string.length() - 3);
            } else if (string.endsWith("deg")) {
                string = string.substring(0, string.length() - 3);
                z = false;
            }
            d2 = Float.parseFloat(string);
        } else {
            d2 = readableMap.getDouble(str);
        }
        return z ? d2 : C1361o.m5866a(d2);
    }

    /* renamed from: a */
    public static void m5606a(ReadableArray readableArray, double[] dArr) {
        double d2;
        double[] dArr2 = f4769a.get();
        C1361o.m5880c(dArr);
        int size = readableArray.size();
        for (int i = 0; i < size; i++) {
            ReadableMap map = readableArray.getMap(i);
            String nextKey = map.keySetIterator().nextKey();
            C1361o.m5880c(dArr2);
            if ("matrix".equals(nextKey)) {
                ReadableArray array = map.getArray(nextKey);
                for (int i2 = 0; i2 < 16; i2++) {
                    dArr2[i2] = array.getDouble(i2);
                }
            } else if ("perspective".equals(nextKey)) {
                C1361o.m5868a(dArr2, map.getDouble(nextKey));
            } else if ("rotateX".equals(nextKey)) {
                C1361o.m5877b(dArr2, m5605a(map, nextKey));
            } else if ("rotateY".equals(nextKey)) {
                C1361o.m5881c(dArr2, m5605a(map, nextKey));
            } else if ("rotate".equals(nextKey) || "rotateZ".equals(nextKey)) {
                C1361o.m5883d(dArr2, m5605a(map, nextKey));
            } else {
                if ("scale".equals(nextKey)) {
                    d2 = map.getDouble(nextKey);
                    C1361o.m5886e(dArr2, d2);
                } else if ("scaleX".equals(nextKey)) {
                    C1361o.m5886e(dArr2, map.getDouble(nextKey));
                } else if ("scaleY".equals(nextKey)) {
                    d2 = map.getDouble(nextKey);
                } else if ("translate".equals(nextKey)) {
                    ReadableArray array2 = map.getArray(nextKey);
                    C1361o.m5870a(dArr2, array2.getDouble(0), array2.getDouble(1), array2.size() > 2 ? array2.getDouble(2) : 0.0d);
                } else if ("translateX".equals(nextKey)) {
                    C1361o.m5869a(dArr2, map.getDouble(nextKey), 0.0d);
                } else if ("translateY".equals(nextKey)) {
                    C1361o.m5869a(dArr2, 0.0d, map.getDouble(nextKey));
                } else if ("skewX".equals(nextKey)) {
                    C1361o.m5888g(dArr2, m5605a(map, nextKey));
                } else {
                    if (!"skewY".equals(nextKey)) {
                        throw new JSApplicationIllegalArgumentException("Unsupported transform type: " + nextKey);
                    }
                    C1361o.m5889h(dArr2, m5605a(map, nextKey));
                }
                C1361o.m5887f(dArr2, d2);
            }
            C1361o.m5872a(dArr, dArr, dArr2);
        }
    }
}
