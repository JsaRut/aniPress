package android.support.v4.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RadialGradient;
import android.graphics.Shader;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.os.Build;
import android.view.animation.Animation;
import android.widget.ImageView;
import p000a.p005b.p009c.p019h.C0107v;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: android.support.v4.widget.c */
/* loaded from: classes.dex */
public class C0285c extends ImageView {

    /* renamed from: a */
    private Animation.AnimationListener f1254a;

    /* renamed from: b */
    int f1255b;

    /* renamed from: android.support.v4.widget.c$a */
    /* loaded from: classes.dex */
    private class a extends OvalShape {

        /* renamed from: a */
        private RadialGradient f1256a;

        /* renamed from: b */
        private Paint f1257b = new Paint();

        a(int i) {
            C0285c.this.f1255b = i;
            m1574a((int) rect().width());
        }

        /* renamed from: a */
        private void m1574a(int i) {
            float f = i / 2;
            this.f1256a = new RadialGradient(f, f, C0285c.this.f1255b, new int[]{1023410176, 0}, (float[]) null, Shader.TileMode.CLAMP);
            this.f1257b.setShader(this.f1256a);
        }

        @Override // android.graphics.drawable.shapes.OvalShape, android.graphics.drawable.shapes.RectShape, android.graphics.drawable.shapes.Shape
        public void draw(Canvas canvas, Paint paint) {
            float width = C0285c.this.getWidth() / 2;
            float height = C0285c.this.getHeight() / 2;
            canvas.drawCircle(width, height, width, this.f1257b);
            canvas.drawCircle(width, height, r0 - C0285c.this.f1255b, paint);
        }

        @Override // android.graphics.drawable.shapes.RectShape, android.graphics.drawable.shapes.Shape
        protected void onResize(float f, float f2) {
            super.onResize(f, f2);
            m1574a((int) f);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0285c(Context context, int i) {
        super(context);
        ShapeDrawable shapeDrawable;
        float f = getContext().getResources().getDisplayMetrics().density;
        int i2 = (int) (1.75f * f);
        int i3 = (int) (0.0f * f);
        this.f1255b = (int) (3.5f * f);
        if (m1572a()) {
            shapeDrawable = new ShapeDrawable(new OvalShape());
            C0107v.m493a(this, f * 4.0f);
        } else {
            ShapeDrawable shapeDrawable2 = new ShapeDrawable(new a(this.f1255b));
            setLayerType(1, shapeDrawable2.getPaint());
            shapeDrawable2.getPaint().setShadowLayer(this.f1255b, i3, i2, 503316480);
            int i4 = this.f1255b;
            setPadding(i4, i4, i4, i4);
            shapeDrawable = shapeDrawable2;
        }
        shapeDrawable.getPaint().setColor(i);
        C0107v.m500a(this, shapeDrawable);
    }

    /* renamed from: a */
    private boolean m1572a() {
        return Build.VERSION.SDK_INT >= 21;
    }

    /* renamed from: a */
    public void m1573a(Animation.AnimationListener animationListener) {
        this.f1254a = animationListener;
    }

    @Override // android.view.View
    public void onAnimationEnd() {
        super.onAnimationEnd();
        Animation.AnimationListener animationListener = this.f1254a;
        if (animationListener != null) {
            animationListener.onAnimationEnd(getAnimation());
        }
    }

    @Override // android.view.View
    public void onAnimationStart() {
        super.onAnimationStart();
        Animation.AnimationListener animationListener = this.f1254a;
        if (animationListener != null) {
            animationListener.onAnimationStart(getAnimation());
        }
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (m1572a()) {
            return;
        }
        setMeasuredDimension(getMeasuredWidth() + (this.f1255b * 2), getMeasuredHeight() + (this.f1255b * 2));
    }

    @Override // android.view.View
    public void setBackgroundColor(int i) {
        if (getBackground() instanceof ShapeDrawable) {
            ((ShapeDrawable) getBackground()).getPaint().setColor(i);
        }
    }
}
