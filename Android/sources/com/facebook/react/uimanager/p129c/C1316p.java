package com.facebook.react.uimanager.p129c;

import android.view.View;
import android.view.animation.Animation;
import android.view.animation.Transformation;

/* renamed from: com.facebook.react.uimanager.c.p */
/* loaded from: classes.dex */
class C1316p extends Animation {

    /* renamed from: a */
    private final View f4845a;

    /* renamed from: b */
    private final float f4846b;

    /* renamed from: c */
    private final float f4847c;

    /* renamed from: com.facebook.react.uimanager.c.p$a */
    /* loaded from: classes.dex */
    static class a implements Animation.AnimationListener {

        /* renamed from: a */
        private final View f4848a;

        /* renamed from: b */
        private boolean f4849b = false;

        public a(View view) {
            this.f4848a = view;
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
            if (this.f4849b) {
                this.f4848a.setLayerType(0, null);
            }
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationRepeat(Animation animation) {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationStart(Animation animation) {
            if (this.f4848a.hasOverlappingRendering() && this.f4848a.getLayerType() == 0) {
                this.f4849b = true;
                this.f4848a.setLayerType(2, null);
            }
        }
    }

    public C1316p(View view, float f, float f2) {
        this.f4845a = view;
        this.f4846b = f;
        this.f4847c = f2 - f;
        setAnimationListener(new a(view));
    }

    @Override // android.view.animation.Animation
    protected void applyTransformation(float f, Transformation transformation) {
        this.f4845a.setAlpha(this.f4846b + (this.f4847c * f));
    }

    @Override // android.view.animation.Animation
    public boolean willChangeBounds() {
        return false;
    }
}
