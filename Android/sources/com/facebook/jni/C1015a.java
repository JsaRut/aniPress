package com.facebook.jni;

import com.facebook.jni.C1016b;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.facebook.jni.a */
/* loaded from: classes.dex */
public class C1015a extends Thread {
    /* JADX INFO: Access modifiers changed from: package-private */
    public C1015a(String str) {
        super(str);
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public void run() {
        while (true) {
            try {
                C1016b.a aVar = (C1016b.a) C1016b.f4202c.remove();
                aVar.mo5091a();
                if (aVar.f4205b == null) {
                    C1016b.f4201b.m5102a();
                }
                C1016b.b.m5100c(aVar);
            } catch (InterruptedException unused) {
            }
        }
    }
}
