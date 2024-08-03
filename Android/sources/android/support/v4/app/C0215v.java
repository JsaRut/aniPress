package android.support.v4.app;

import android.support.v4.app.LayoutInflaterFactory2C0219z;
import android.view.ViewGroup;
import android.view.animation.Animation;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: android.support.v4.app.v */
/* loaded from: classes.dex */
public class C0215v extends LayoutInflaterFactory2C0219z.b {

    /* renamed from: b */
    final /* synthetic */ ViewGroup f875b;

    /* renamed from: c */
    final /* synthetic */ ComponentCallbacksC0205l f876c;

    /* renamed from: d */
    final /* synthetic */ LayoutInflaterFactory2C0219z f877d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0215v(LayoutInflaterFactory2C0219z layoutInflaterFactory2C0219z, Animation.AnimationListener animationListener, ViewGroup viewGroup, ComponentCallbacksC0205l componentCallbacksC0205l) {
        super(animationListener);
        this.f877d = layoutInflaterFactory2C0219z;
        this.f875b = viewGroup;
        this.f876c = componentCallbacksC0205l;
    }

    @Override // android.support.v4.app.LayoutInflaterFactory2C0219z.b, android.view.animation.Animation.AnimationListener
    public void onAnimationEnd(Animation animation) {
        super.onAnimationEnd(animation);
        this.f875b.post(new RunnableC0214u(this));
    }
}
