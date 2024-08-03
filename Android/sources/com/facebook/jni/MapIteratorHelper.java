package com.facebook.jni;

import java.util.Iterator;
import java.util.Map;
import p139d.p143b.p206l.p207a.InterfaceC2039a;

@InterfaceC2039a
/* loaded from: classes.dex */
public class MapIteratorHelper {

    @InterfaceC2039a
    private final Iterator<Map.Entry> mIterator;

    @InterfaceC2039a
    private Object mKey;

    @InterfaceC2039a
    private Object mValue;

    @InterfaceC2039a
    public MapIteratorHelper(Map map) {
        this.mIterator = map.entrySet().iterator();
    }

    @InterfaceC2039a
    boolean hasNext() {
        if (!this.mIterator.hasNext()) {
            this.mKey = null;
            this.mValue = null;
            return false;
        }
        Map.Entry next = this.mIterator.next();
        this.mKey = next.getKey();
        this.mValue = next.getValue();
        return true;
    }
}
