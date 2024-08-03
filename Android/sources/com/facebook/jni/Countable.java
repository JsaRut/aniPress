package com.facebook.jni;

import com.facebook.soloader.SoLoader;
import p139d.p143b.p206l.p207a.InterfaceC2039a;

@InterfaceC2039a
/* loaded from: classes.dex */
public class Countable {

    @InterfaceC2039a
    private long mInstance = 0;

    static {
        SoLoader.m6388a("fb");
    }

    public native void dispose();

    protected void finalize() {
        dispose();
        super.finalize();
    }
}
