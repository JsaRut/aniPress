package p031c.p032a.p090q;

import android.content.Context;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.util.SparseArray;
import p031c.p032a.p066j.C0675a;

/* renamed from: c.a.q.b */
/* loaded from: classes.dex */
public final class C0809b {

    /* renamed from: a */
    private static volatile C0809b f3519a;

    /* renamed from: b */
    private static final Object f3520b = new Object();

    /* renamed from: c */
    private boolean f3521c = false;

    /* renamed from: d */
    private SparseArray<AbstractC0808a> f3522d = new SparseArray<>();

    /* renamed from: e */
    private Handler f3523e;

    /* renamed from: f */
    private HandlerThread f3524f;

    private C0809b() {
    }

    /* renamed from: a */
    public static C0809b m3924a() {
        if (f3519a == null) {
            synchronized (f3520b) {
                if (f3519a == null) {
                    f3519a = new C0809b();
                }
            }
        }
        return f3519a;
    }

    /* renamed from: a */
    public final void m3925a(int i, long j, AbstractC0808a abstractC0808a) {
        if (this.f3523e == null) {
            return;
        }
        abstractC0808a.f3517a = j;
        abstractC0808a.f3518b = 1;
        this.f3522d.put(8000, abstractC0808a);
        if (this.f3523e.hasMessages(8000)) {
            C0675a.m3475g("TaskHandlerManager_xxx", "registerFixedAction,same action in handler,will replace");
            this.f3523e.removeMessages(8000);
        }
        this.f3523e.sendEmptyMessageDelayed(8000, j);
    }

    /* renamed from: a */
    public final synchronized void m3926a(Context context) {
        if (this.f3521c) {
            return;
        }
        if (context == null) {
            C0675a.m3469c("TaskHandlerManager_xxx", "init context is null");
            return;
        }
        C0675a.m3469c("TaskHandlerManager_xxx", "init task manager...");
        try {
            if (this.f3524f == null || !this.f3524f.isAlive()) {
                this.f3524f = new HandlerThreadC0810c(this, "TaskHandlerManager_xxx");
                this.f3524f.start();
            }
            this.f3523e = new HandlerC0811d(this, this.f3524f.getLooper() == null ? Looper.getMainLooper() : this.f3524f.getLooper());
        } catch (Exception unused) {
            this.f3523e = new HandlerC0811d(this, Looper.getMainLooper());
        }
        this.f3521c = true;
    }

    /* renamed from: a */
    public final boolean m3927a(int i) {
        Handler handler = this.f3523e;
        if (handler == null) {
            return false;
        }
        return handler.hasMessages(1011);
    }

    /* renamed from: b */
    public final void m3928b(int i) {
        if (this.f3523e == null) {
            return;
        }
        this.f3522d.remove(i);
        this.f3523e.removeMessages(i);
    }

    /* renamed from: b */
    public final void m3929b(int i, long j, AbstractC0808a abstractC0808a) {
        if (this.f3523e == null) {
            return;
        }
        abstractC0808a.f3518b = 2;
        this.f3522d.put(i, abstractC0808a);
        if (this.f3523e.hasMessages(i)) {
            C0675a.m3469c("TaskHandlerManager_xxx", "sendMsg,replace:" + i);
            this.f3523e.removeMessages(i);
        } else {
            C0675a.m3469c("TaskHandlerManager_xxx", "sendMsg,action=" + i);
        }
        this.f3523e.sendEmptyMessageDelayed(i, j);
    }
}
