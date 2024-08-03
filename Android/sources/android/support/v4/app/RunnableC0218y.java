package android.support.v4.app;

import android.support.v4.app.LayoutInflaterFactory2C0219z;

/* renamed from: android.support.v4.app.y */
/* loaded from: classes.dex */
class RunnableC0218y implements Runnable {

    /* renamed from: a */
    final /* synthetic */ LayoutInflaterFactory2C0219z.a f886a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC0218y(LayoutInflaterFactory2C0219z.a aVar) {
        this.f886a = aVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f886a.f923b.setLayerType(0, null);
    }
}
