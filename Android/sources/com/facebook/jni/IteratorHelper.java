package com.facebook.jni;

import java.util.Iterator;
import p139d.p143b.p206l.p207a.InterfaceC2039a;

@InterfaceC2039a
/* loaded from: classes.dex */
public class IteratorHelper {

    /* renamed from: a */
    private final Iterator f4199a;

    @InterfaceC2039a
    private Object mElement;

    @InterfaceC2039a
    public IteratorHelper(Iterable iterable) {
        this.f4199a = iterable.iterator();
    }

    @InterfaceC2039a
    public IteratorHelper(Iterator it) {
        this.f4199a = it;
    }

    @InterfaceC2039a
    boolean hasNext() {
        if (this.f4199a.hasNext()) {
            this.mElement = this.f4199a.next();
            return true;
        }
        this.mElement = null;
        return false;
    }
}
