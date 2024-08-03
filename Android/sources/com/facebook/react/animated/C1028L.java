package com.facebook.react.animated;

import com.facebook.react.bridge.JavaOnlyMap;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableMapKeySetIterator;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.facebook.react.animated.L */
/* loaded from: classes.dex */
public class C1028L extends AbstractC1036b {

    /* renamed from: e */
    private final C1024H f4257e;

    /* renamed from: f */
    private final Map<String, Integer> f4258f;

    public C1028L(ReadableMap readableMap, C1024H c1024h) {
        ReadableMap map = readableMap.getMap("style");
        ReadableMapKeySetIterator keySetIterator = map.keySetIterator();
        this.f4258f = new HashMap();
        while (keySetIterator.hasNextKey()) {
            String nextKey = keySetIterator.nextKey();
            this.f4258f.put(nextKey, Integer.valueOf(map.getInt(nextKey)));
        }
        this.f4257e = c1024h;
    }

    /* renamed from: a */
    public void m5141a(JavaOnlyMap javaOnlyMap) {
        for (Map.Entry<String, Integer> entry : this.f4258f.entrySet()) {
            AbstractC1036b m5126d = this.f4257e.m5126d(entry.getValue().intValue());
            if (m5126d == null) {
                throw new IllegalArgumentException("Mapped style node does not exists");
            }
            if (m5126d instanceof C1033P) {
                ((C1033P) m5126d).m5143a(javaOnlyMap);
            } else {
                if (!(m5126d instanceof C1034Q)) {
                    throw new IllegalArgumentException("Unsupported type of node used in property node " + m5126d.getClass());
                }
                javaOnlyMap.putDouble(entry.getKey(), ((C1034Q) m5126d).m5147d());
            }
        }
    }
}
