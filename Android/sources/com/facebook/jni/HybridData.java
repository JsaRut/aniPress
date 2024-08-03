package com.facebook.jni;

import com.facebook.jni.C1016b;
import com.facebook.soloader.SoLoader;
import p139d.p143b.p206l.p207a.InterfaceC2039a;

@InterfaceC2039a
/* loaded from: classes.dex */
public class HybridData {

    @InterfaceC2039a
    private Destructor mDestructor = new Destructor(this);

    /* loaded from: classes.dex */
    public static class Destructor extends C1016b.a {

        @InterfaceC2039a
        private long mNativePointer;

        Destructor(Object obj) {
            super(obj);
        }

        static native void deleteNative(long j);

        @Override // com.facebook.jni.C1016b.a
        /* renamed from: a */
        public void mo5091a() {
            deleteNative(this.mNativePointer);
            this.mNativePointer = 0L;
        }
    }

    static {
        SoLoader.m6388a("fb");
    }

    /* renamed from: a */
    public synchronized void m5090a() {
        this.mDestructor.mo5091a();
    }
}
