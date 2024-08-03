package cn.jpush.android.p121ui;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: cn.jpush.android.ui.c */
/* loaded from: classes.dex */
public class RunnableC0965c implements Runnable {

    /* renamed from: a */
    final /* synthetic */ PushActivity f4019a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC0965c(PushActivity pushActivity) {
        this.f4019a = pushActivity;
    }

    @Override // java.lang.Runnable
    public void run() {
        FullScreenView fullScreenView;
        FullScreenView fullScreenView2;
        fullScreenView = this.f4019a.f4014d;
        if (fullScreenView != null) {
            fullScreenView2 = this.f4019a.f4014d;
            fullScreenView2.m4807d();
        }
    }
}
