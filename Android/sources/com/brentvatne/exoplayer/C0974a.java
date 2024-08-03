package com.brentvatne.exoplayer;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;

/* renamed from: com.brentvatne.exoplayer.a */
/* loaded from: classes.dex */
public final class C0974a extends FrameLayout {

    /* renamed from: a */
    private float f4045a;

    /* renamed from: b */
    private int f4046b;

    public C0974a(Context context) {
        this(context, null);
    }

    public C0974a(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f4046b = 0;
    }

    public float getAspectRatio() {
        return this.f4045a;
    }

    public int getResizeMode() {
        return this.f4046b;
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0039, code lost:            if (r4 > 0.0f) goto L24;     */
    @Override // android.widget.FrameLayout, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected void onMeasure(int r7, int r8) {
        /*
            r6 = this;
            super.onMeasure(r7, r8)
            float r7 = r6.f4045a
            r8 = 0
            int r7 = (r7 > r8 ? 1 : (r7 == r8 ? 0 : -1))
            if (r7 != 0) goto Lb
            return
        Lb:
            int r7 = r6.getMeasuredWidth()
            int r0 = r6.getMeasuredHeight()
            float r1 = (float) r7
            float r2 = (float) r0
            float r3 = r1 / r2
            float r4 = r6.f4045a
            float r4 = r4 / r3
            r3 = 1065353216(0x3f800000, float:1.0)
            float r4 = r4 - r3
            float r3 = java.lang.Math.abs(r4)
            r5 = 1008981770(0x3c23d70a, float:0.01)
            int r3 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r3 > 0) goto L29
            return
        L29:
            int r3 = r6.f4046b
            r5 = 1
            if (r3 == r5) goto L54
            r5 = 2
            if (r3 == r5) goto L4e
            r5 = 3
            if (r3 == r5) goto L58
            r5 = 4
            if (r3 == r5) goto L3c
            int r8 = (r4 > r8 ? 1 : (r4 == r8 ? 0 : -1))
            if (r8 <= 0) goto L4e
            goto L54
        L3c:
            float r8 = r6.f4045a
            float r8 = r8 * r2
            int r8 = (int) r8
            if (r8 >= r7) goto L4c
            float r7 = (float) r8
            float r1 = r1 / r7
            float r7 = r7 * r1
            int r7 = (int) r7
            float r2 = r2 * r1
            int r0 = (int) r2
            goto L58
        L4c:
            r7 = r8
            goto L58
        L4e:
            float r7 = r6.f4045a
            float r2 = r2 * r7
            int r7 = (int) r2
            goto L58
        L54:
            float r8 = r6.f4045a
            float r1 = r1 / r8
            int r0 = (int) r1
        L58:
            r8 = 1073741824(0x40000000, float:2.0)
            int r7 = android.view.View.MeasureSpec.makeMeasureSpec(r7, r8)
            int r8 = android.view.View.MeasureSpec.makeMeasureSpec(r0, r8)
            super.onMeasure(r7, r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.brentvatne.exoplayer.C0974a.onMeasure(int, int):void");
    }

    public void setAspectRatio(float f) {
        if (this.f4045a != f) {
            this.f4045a = f;
            requestLayout();
        }
    }

    public void setResizeMode(int i) {
        if (this.f4046b != i) {
            this.f4046b = i;
            requestLayout();
        }
    }
}
