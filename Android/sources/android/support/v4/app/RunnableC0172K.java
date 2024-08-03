package android.support.v4.app;

import android.graphics.Rect;
import android.support.v4.util.C0256b;
import android.view.View;

/* renamed from: android.support.v4.app.K */
/* loaded from: classes.dex */
public class RunnableC0172K implements Runnable {

    /* renamed from: a */
    final /* synthetic */ ComponentCallbacksC0205l f651a;

    /* renamed from: b */
    final /* synthetic */ ComponentCallbacksC0205l f652b;

    /* renamed from: c */
    final /* synthetic */ boolean f653c;

    /* renamed from: d */
    final /* synthetic */ C0256b f654d;

    /* renamed from: e */
    final /* synthetic */ View f655e;

    /* renamed from: f */
    final /* synthetic */ AbstractC0185W f656f;

    /* renamed from: g */
    final /* synthetic */ Rect f657g;

    public RunnableC0172K(ComponentCallbacksC0205l componentCallbacksC0205l, ComponentCallbacksC0205l componentCallbacksC0205l2, boolean z, C0256b c0256b, View view, AbstractC0185W abstractC0185W, Rect rect) {
        this.f651a = componentCallbacksC0205l;
        this.f652b = componentCallbacksC0205l2;
        this.f653c = z;
        this.f654d = c0256b;
        this.f655e = view;
        this.f656f = abstractC0185W;
        this.f657g = rect;
    }

    @Override // java.lang.Runnable
    public void run() {
        C0176M.m797a(this.f651a, this.f652b, this.f653c, (C0256b<String, View>) this.f654d, false);
        View view = this.f655e;
        if (view != null) {
            this.f656f.m831a(view, this.f657g);
        }
    }
}
