package com.facebook.react.uimanager.p129c;

import android.util.SparseArray;
import android.view.animation.Animation;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.facebook.react.uimanager.c.f */
/* loaded from: classes.dex */
public class AnimationAnimationListenerC1306f implements Animation.AnimationListener {

    /* renamed from: a */
    final /* synthetic */ int f4831a;

    /* renamed from: b */
    final /* synthetic */ C1308h f4832b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public AnimationAnimationListenerC1306f(C1308h c1308h, int i) {
        this.f4832b = c1308h;
        this.f4831a = i;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public void onAnimationEnd(Animation animation) {
        SparseArray sparseArray;
        sparseArray = this.f4832b.f4838d;
        sparseArray.remove(this.f4831a);
    }

    @Override // android.view.animation.Animation.AnimationListener
    public void onAnimationRepeat(Animation animation) {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.animation.Animation.AnimationListener
    public void onAnimationStart(Animation animation) {
        SparseArray sparseArray;
        sparseArray = this.f4832b.f4838d;
        sparseArray.put(this.f4831a, (InterfaceC1314n) animation);
    }
}
