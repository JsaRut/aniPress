package android.arch.lifecycle;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: android.arch.lifecycle.k */
/* loaded from: classes.dex */
public class RunnableC0151k implements Runnable {

    /* renamed from: a */
    final /* synthetic */ LiveData f608a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC0151k(LiveData liveData) {
        this.f608a = liveData;
    }

    @Override // java.lang.Runnable
    public void run() {
        Object obj;
        Object obj2;
        Object obj3;
        obj = this.f608a.f563b;
        synchronized (obj) {
            obj2 = this.f608a.f567f;
            LiveData liveData = this.f608a;
            obj3 = LiveData.f562a;
            liveData.f567f = obj3;
        }
        this.f608a.mo694a((LiveData) obj2);
    }
}
