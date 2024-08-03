package p139d.p143b.p208m;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.devsupport.p124a.InterfaceC1114b;

/* renamed from: d.b.m.A */
/* loaded from: classes.dex */
class RunnableC2041A implements Runnable {

    /* renamed from: a */
    final /* synthetic */ ReactApplicationContext f7409a;

    /* renamed from: b */
    final /* synthetic */ RunnableC2042B f7410b;

    public RunnableC2041A(RunnableC2042B runnableC2042B, ReactApplicationContext reactApplicationContext) {
        this.f7410b = runnableC2042B;
        this.f7409a = reactApplicationContext;
    }

    @Override // java.lang.Runnable
    public void run() {
        InterfaceC1114b interfaceC1114b;
        try {
            this.f7410b.f7412b.m8340b(this.f7409a);
        } catch (Exception e2) {
            interfaceC1114b = this.f7410b.f7412b.f7429i;
            interfaceC1114b.handleException(e2);
        }
    }
}
