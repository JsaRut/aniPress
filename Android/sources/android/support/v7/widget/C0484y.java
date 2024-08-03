package android.support.v7.widget;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RatingBar;
import p000a.p005b.p022d.p023a.C0112a;

/* renamed from: android.support.v7.widget.y */
/* loaded from: classes.dex */
public class C0484y extends RatingBar {

    /* renamed from: a */
    private final C0480w f2519a;

    public C0484y(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C0112a.ratingBarStyle);
    }

    public C0484y(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f2519a = new C0480w(this);
        this.f2519a.mo2099a(attributeSet, i);
    }

    @Override // android.widget.RatingBar, android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    protected synchronized void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        Bitmap m2593a = this.f2519a.m2593a();
        if (m2593a != null) {
            setMeasuredDimension(View.resolveSizeAndState(m2593a.getWidth() * getNumStars(), i, 0), getMeasuredHeight());
        }
    }
}
