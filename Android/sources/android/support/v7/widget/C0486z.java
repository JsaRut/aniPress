package android.support.v7.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.widget.SeekBar;
import p000a.p005b.p022d.p023a.C0112a;

/* renamed from: android.support.v7.widget.z */
/* loaded from: classes.dex */
public class C0486z extends SeekBar {

    /* renamed from: a */
    private final C0381A f2521a;

    public C0486z(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C0112a.seekBarStyle);
    }

    public C0486z(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f2521a = new C0381A(this);
        this.f2521a.mo2099a(attributeSet, i);
    }

    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        this.f2521a.m2100b();
    }

    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        this.f2521a.m2101c();
    }

    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    protected synchronized void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        this.f2521a.m2097a(canvas);
    }
}
