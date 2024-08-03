package p000a.p005b.p009c.p017f;

import android.os.Handler;
import java.util.concurrent.Callable;
import p000a.p005b.p009c.p017f.C0063k;

/* renamed from: a.b.c.f.i */
/* loaded from: classes.dex */
public class RunnableC0061i implements Runnable {

    /* renamed from: a */
    final /* synthetic */ Callable f206a;

    /* renamed from: b */
    final /* synthetic */ Handler f207b;

    /* renamed from: c */
    final /* synthetic */ C0063k.a f208c;

    /* renamed from: d */
    final /* synthetic */ C0063k f209d;

    public RunnableC0061i(C0063k c0063k, Callable callable, Handler handler, C0063k.a aVar) {
        this.f209d = c0063k;
        this.f206a = callable;
        this.f207b = handler;
        this.f208c = aVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        Object obj;
        try {
            obj = this.f206a.call();
        } catch (Exception unused) {
            obj = null;
        }
        this.f207b.post(new RunnableC0060h(this, obj));
    }
}
