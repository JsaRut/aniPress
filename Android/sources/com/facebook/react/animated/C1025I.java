package com.facebook.react.animated;

import com.facebook.react.bridge.JSApplicationIllegalArgumentException;
import com.facebook.react.bridge.JavaOnlyMap;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableMapKeySetIterator;
import com.facebook.react.uimanager.C1271G;
import com.facebook.react.uimanager.C1284U;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.facebook.react.animated.I */
/* loaded from: classes.dex */
public class C1025I extends AbstractC1036b {

    /* renamed from: e */
    private int f4233e = -1;

    /* renamed from: f */
    private final C1024H f4234f;

    /* renamed from: g */
    private final C1284U f4235g;

    /* renamed from: h */
    private final Map<String, Integer> f4236h;

    /* renamed from: i */
    private final JavaOnlyMap f4237i;

    /* renamed from: j */
    private final C1271G f4238j;

    public C1025I(ReadableMap readableMap, C1024H c1024h, C1284U c1284u) {
        ReadableMap map = readableMap.getMap("props");
        ReadableMapKeySetIterator keySetIterator = map.keySetIterator();
        this.f4236h = new HashMap();
        while (keySetIterator.hasNextKey()) {
            String nextKey = keySetIterator.nextKey();
            this.f4236h.put(nextKey, Integer.valueOf(map.getInt(nextKey)));
        }
        this.f4237i = new JavaOnlyMap();
        this.f4238j = new C1271G(this.f4237i);
        this.f4234f = c1024h;
        this.f4235g = c1284u;
    }

    /* renamed from: a */
    public void m5131a(int i) {
        if (this.f4233e == -1) {
            this.f4233e = i;
            return;
        }
        throw new JSApplicationIllegalArgumentException("Animated node " + this.f4282d + " is already attached to a view");
    }

    /* renamed from: b */
    public void m5132b() {
        ReadableMapKeySetIterator keySetIterator = this.f4237i.keySetIterator();
        while (keySetIterator.hasNextKey()) {
            this.f4237i.putNull(keySetIterator.nextKey());
        }
        this.f4235g.m5629a(this.f4233e, this.f4238j);
    }

    /* renamed from: b */
    public void m5133b(int i) {
        if (this.f4233e != i) {
            throw new JSApplicationIllegalArgumentException("Attempting to disconnect view that has not been connected with the given animated node");
        }
        this.f4233e = -1;
    }

    /* renamed from: c */
    public final void m5134c() {
        if (this.f4233e == -1) {
            return;
        }
        for (Map.Entry<String, Integer> entry : this.f4236h.entrySet()) {
            AbstractC1036b m5126d = this.f4234f.m5126d(entry.getValue().intValue());
            if (m5126d == null) {
                throw new IllegalArgumentException("Mapped property node does not exists");
            }
            if (m5126d instanceof C1028L) {
                ((C1028L) m5126d).m5141a(this.f4237i);
            } else {
                if (!(m5126d instanceof C1034Q)) {
                    throw new IllegalArgumentException("Unsupported type of node used in property node " + m5126d.getClass());
                }
                this.f4237i.putDouble(entry.getKey(), ((C1034Q) m5126d).m5147d());
            }
        }
        this.f4235g.m5629a(this.f4233e, this.f4238j);
    }
}
