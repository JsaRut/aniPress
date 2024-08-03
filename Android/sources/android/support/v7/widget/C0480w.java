package android.support.v7.widget;

import android.R;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Shader;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ClipDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.graphics.drawable.shapes.Shape;
import android.support.v4.graphics.drawable.InterfaceC0222c;
import android.util.AttributeSet;
import android.widget.ProgressBar;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: android.support.v7.widget.w */
/* loaded from: classes.dex */
public class C0480w {

    /* renamed from: a */
    private static final int[] f2512a = {R.attr.indeterminateDrawable, R.attr.progressDrawable};

    /* renamed from: b */
    private final ProgressBar f2513b;

    /* renamed from: c */
    private Bitmap f2514c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0480w(ProgressBar progressBar) {
        this.f2513b = progressBar;
    }

    /* renamed from: a */
    private Drawable m2590a(Drawable drawable) {
        if (!(drawable instanceof AnimationDrawable)) {
            return drawable;
        }
        AnimationDrawable animationDrawable = (AnimationDrawable) drawable;
        int numberOfFrames = animationDrawable.getNumberOfFrames();
        AnimationDrawable animationDrawable2 = new AnimationDrawable();
        animationDrawable2.setOneShot(animationDrawable.isOneShot());
        for (int i = 0; i < numberOfFrames; i++) {
            Drawable m2591a = m2591a(animationDrawable.getFrame(i), true);
            m2591a.setLevel(10000);
            animationDrawable2.addFrame(m2591a, animationDrawable.getDuration(i));
        }
        animationDrawable2.setLevel(10000);
        return animationDrawable2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: a */
    private Drawable m2591a(Drawable drawable, boolean z) {
        if (drawable instanceof InterfaceC0222c) {
            InterfaceC0222c interfaceC0222c = (InterfaceC0222c) drawable;
            Drawable mo1210a = interfaceC0222c.mo1210a();
            if (mo1210a == null) {
                return drawable;
            }
            interfaceC0222c.mo1211a(m2591a(mo1210a, z));
            return drawable;
        }
        if (!(drawable instanceof LayerDrawable)) {
            if (!(drawable instanceof BitmapDrawable)) {
                return drawable;
            }
            BitmapDrawable bitmapDrawable = (BitmapDrawable) drawable;
            Bitmap bitmap = bitmapDrawable.getBitmap();
            if (this.f2514c == null) {
                this.f2514c = bitmap;
            }
            ShapeDrawable shapeDrawable = new ShapeDrawable(m2592b());
            shapeDrawable.getPaint().setShader(new BitmapShader(bitmap, Shader.TileMode.REPEAT, Shader.TileMode.CLAMP));
            shapeDrawable.getPaint().setColorFilter(bitmapDrawable.getPaint().getColorFilter());
            return z ? new ClipDrawable(shapeDrawable, 3, 1) : shapeDrawable;
        }
        LayerDrawable layerDrawable = (LayerDrawable) drawable;
        int numberOfLayers = layerDrawable.getNumberOfLayers();
        Drawable[] drawableArr = new Drawable[numberOfLayers];
        for (int i = 0; i < numberOfLayers; i++) {
            int id = layerDrawable.getId(i);
            drawableArr[i] = m2591a(layerDrawable.getDrawable(i), id == 16908301 || id == 16908303);
        }
        LayerDrawable layerDrawable2 = new LayerDrawable(drawableArr);
        for (int i2 = 0; i2 < numberOfLayers; i2++) {
            layerDrawable2.setId(i2, layerDrawable.getId(i2));
        }
        return layerDrawable2;
    }

    /* renamed from: b */
    private Shape m2592b() {
        return new RoundRectShape(new float[]{5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f}, null, null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public Bitmap m2593a() {
        return this.f2514c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo2099a(AttributeSet attributeSet, int i) {
        C0479va m2571a = C0479va.m2571a(this.f2513b.getContext(), attributeSet, f2512a, i, 0);
        Drawable m2581c = m2571a.m2581c(0);
        if (m2581c != null) {
            this.f2513b.setIndeterminateDrawable(m2590a(m2581c));
        }
        Drawable m2581c2 = m2571a.m2581c(1);
        if (m2581c2 != null) {
            this.f2513b.setProgressDrawable(m2591a(m2581c2, false));
        }
        m2571a.m2576a();
    }
}
