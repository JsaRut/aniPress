package com.google.android.exoplayer2.p135ui;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.widget.FrameLayout;

/* loaded from: classes.dex */
public final class AspectRatioFrameLayout extends FrameLayout {

    /* renamed from: a */
    private final RunnableC1560b f5828a;

    /* renamed from: b */
    private InterfaceC1559a f5829b;

    /* renamed from: c */
    private float f5830c;

    /* renamed from: d */
    private int f5831d;

    /* renamed from: com.google.android.exoplayer2.ui.AspectRatioFrameLayout$a */
    /* loaded from: classes.dex */
    public interface InterfaceC1559a {
        /* renamed from: a */
        void m6548a(float f, float f2, boolean z);
    }

    /* renamed from: com.google.android.exoplayer2.ui.AspectRatioFrameLayout$b */
    /* loaded from: classes.dex */
    private final class RunnableC1560b implements Runnable {

        /* renamed from: a */
        private float f5832a;

        /* renamed from: b */
        private float f5833b;

        /* renamed from: c */
        private boolean f5834c;

        /* renamed from: d */
        private boolean f5835d;

        private RunnableC1560b() {
        }

        /* renamed from: a */
        public void m6549a(float f, float f2, boolean z) {
            this.f5832a = f;
            this.f5833b = f2;
            this.f5834c = z;
            if (this.f5835d) {
                return;
            }
            this.f5835d = true;
            AspectRatioFrameLayout.this.post(this);
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f5835d = false;
            if (AspectRatioFrameLayout.this.f5829b == null) {
                return;
            }
            AspectRatioFrameLayout.this.f5829b.m6548a(this.f5832a, this.f5833b, this.f5834c);
        }
    }

    public AspectRatioFrameLayout(Context context) {
        this(context, null);
    }

    public AspectRatioFrameLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f5831d = 0;
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, C1573l.AspectRatioFrameLayout, 0, 0);
            try {
                this.f5831d = obtainStyledAttributes.getInt(C1573l.AspectRatioFrameLayout_resize_mode, 0);
            } finally {
                obtainStyledAttributes.recycle();
            }
        }
        this.f5828a = new RunnableC1560b();
    }

    public int getResizeMode() {
        return this.f5831d;
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0041, code lost:            if (r4 > 0.0f) goto L19;     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0050, code lost:            if (r4 > 0.0f) goto L20;     */
    @Override // android.widget.FrameLayout, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected void onMeasure(int r9, int r10) {
        /*
            r8 = this;
            super.onMeasure(r9, r10)
            float r9 = r8.f5830c
            r10 = 0
            int r9 = (r9 > r10 ? 1 : (r9 == r10 ? 0 : -1))
            if (r9 > 0) goto Lb
            return
        Lb:
            int r9 = r8.getMeasuredWidth()
            int r0 = r8.getMeasuredHeight()
            float r1 = (float) r9
            float r2 = (float) r0
            float r3 = r1 / r2
            float r4 = r8.f5830c
            float r4 = r4 / r3
            r5 = 1065353216(0x3f800000, float:1.0)
            float r4 = r4 - r5
            float r5 = java.lang.Math.abs(r4)
            r6 = 1008981770(0x3c23d70a, float:0.01)
            int r5 = (r5 > r6 ? 1 : (r5 == r6 ? 0 : -1))
            if (r5 > 0) goto L31
            com.google.android.exoplayer2.ui.AspectRatioFrameLayout$b r9 = r8.f5828a
            float r10 = r8.f5830c
            r0 = 0
            r9.m6549a(r10, r3, r0)
            return
        L31:
            int r5 = r8.f5831d
            r6 = 1
            if (r5 == 0) goto L4e
            if (r5 == r6) goto L49
            r7 = 2
            if (r5 == r7) goto L43
            r7 = 4
            if (r5 == r7) goto L3f
            goto L53
        L3f:
            int r10 = (r4 > r10 ? 1 : (r4 == r10 ? 0 : -1))
            if (r10 <= 0) goto L49
        L43:
            float r9 = r8.f5830c
            float r2 = r2 * r9
            int r9 = (int) r2
            goto L53
        L49:
            float r10 = r8.f5830c
            float r1 = r1 / r10
            int r0 = (int) r1
            goto L53
        L4e:
            int r10 = (r4 > r10 ? 1 : (r4 == r10 ? 0 : -1))
            if (r10 <= 0) goto L43
            goto L49
        L53:
            com.google.android.exoplayer2.ui.AspectRatioFrameLayout$b r10 = r8.f5828a
            float r1 = r8.f5830c
            r10.m6549a(r1, r3, r6)
            r10 = 1073741824(0x40000000, float:2.0)
            int r9 = android.view.View.MeasureSpec.makeMeasureSpec(r9, r10)
            int r10 = android.view.View.MeasureSpec.makeMeasureSpec(r0, r10)
            super.onMeasure(r9, r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.p135ui.AspectRatioFrameLayout.onMeasure(int, int):void");
    }

    public void setAspectRatio(float f) {
        if (this.f5830c != f) {
            this.f5830c = f;
            requestLayout();
        }
    }

    public void setAspectRatioListener(InterfaceC1559a interfaceC1559a) {
        this.f5829b = interfaceC1559a;
    }

    public void setResizeMode(int i) {
        if (this.f5831d != i) {
            this.f5831d = i;
            requestLayout();
        }
    }
}
