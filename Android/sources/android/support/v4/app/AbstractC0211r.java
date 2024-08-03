package android.support.v4.app;

import android.app.Activity;
import android.content.Context;
import android.os.Handler;
import android.support.v4.util.C0268n;
import android.view.LayoutInflater;
import java.io.FileDescriptor;
import java.io.PrintWriter;

/* renamed from: android.support.v4.app.r */
/* loaded from: classes.dex */
public abstract class AbstractC0211r<E> extends AbstractC0209p {

    /* renamed from: a */
    private final Activity f868a;

    /* renamed from: b */
    private final Context f869b;

    /* renamed from: c */
    private final Handler f870c;

    /* renamed from: d */
    private final int f871d;

    /* renamed from: e */
    final LayoutInflaterFactory2C0219z f872e;

    AbstractC0211r(Activity activity, Context context, Handler handler, int i) {
        this.f872e = new LayoutInflaterFactory2C0219z();
        this.f868a = activity;
        C0268n.m1385a(context, "context == null");
        this.f869b = context;
        C0268n.m1385a(handler, "handler == null");
        this.f870c = handler;
        this.f871d = i;
    }

    public AbstractC0211r(ActivityC0208o activityC0208o) {
        this(activityC0208o, activityC0208o, activityC0208o.f852c, 0);
    }

    /* renamed from: a */
    public abstract void mo1019a(ComponentCallbacksC0205l componentCallbacksC0205l);

    /* renamed from: a */
    public abstract void mo1020a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr);

    /* renamed from: b */
    public Activity m1052b() {
        return this.f868a;
    }

    /* renamed from: b */
    public abstract boolean mo1021b(ComponentCallbacksC0205l componentCallbacksC0205l);

    /* renamed from: c */
    public Context m1053c() {
        return this.f869b;
    }

    /* renamed from: d */
    public LayoutInflaterFactory2C0219z m1054d() {
        return this.f872e;
    }

    /* renamed from: e */
    public Handler m1055e() {
        return this.f870c;
    }

    /* renamed from: f */
    public abstract LayoutInflater mo1022f();

    /* renamed from: g */
    public abstract int mo1023g();

    /* renamed from: h */
    public abstract boolean mo1024h();

    /* renamed from: i */
    public abstract void mo1025i();
}
