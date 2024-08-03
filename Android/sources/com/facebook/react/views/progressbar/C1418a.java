package com.facebook.react.views.progressbar;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ProgressBar;
import com.facebook.react.bridge.JSApplicationIllegalArgumentException;

/* renamed from: com.facebook.react.views.progressbar.a */
/* loaded from: classes.dex */
public class C1418a extends FrameLayout {

    /* renamed from: a */
    private Integer f5200a;

    /* renamed from: b */
    private boolean f5201b;

    /* renamed from: c */
    private boolean f5202c;

    /* renamed from: d */
    private double f5203d;

    /* renamed from: e */
    private ProgressBar f5204e;

    public C1418a(Context context) {
        super(context);
        this.f5201b = true;
        this.f5202c = true;
    }

    /* renamed from: a */
    private void m6042a(ProgressBar progressBar) {
        Drawable indeterminateDrawable = progressBar.isIndeterminate() ? progressBar.getIndeterminateDrawable() : progressBar.getProgressDrawable();
        if (indeterminateDrawable == null) {
            return;
        }
        Integer num = this.f5200a;
        if (num != null) {
            indeterminateDrawable.setColorFilter(num.intValue(), PorterDuff.Mode.SRC_IN);
        } else {
            indeterminateDrawable.clearColorFilter();
        }
    }

    /* renamed from: a */
    public void m6043a() {
        ProgressBar progressBar;
        int i;
        ProgressBar progressBar2 = this.f5204e;
        if (progressBar2 == null) {
            throw new JSApplicationIllegalArgumentException("setStyle() not called");
        }
        progressBar2.setIndeterminate(this.f5201b);
        m6042a(this.f5204e);
        this.f5204e.setProgress((int) (this.f5203d * 1000.0d));
        if (this.f5202c) {
            progressBar = this.f5204e;
            i = 0;
        } else {
            progressBar = this.f5204e;
            i = 8;
        }
        progressBar.setVisibility(i);
    }

    /* renamed from: a */
    public void m6044a(double d2) {
        this.f5203d = d2;
    }

    /* renamed from: a */
    public void m6045a(Integer num) {
        this.f5200a = num;
    }

    /* renamed from: a */
    public void m6046a(String str) {
        this.f5204e = ReactProgressBarViewManager.createProgressBar(getContext(), ReactProgressBarViewManager.getStyleFromString(str));
        this.f5204e.setMax(1000);
        removeAllViews();
        addView(this.f5204e, new ViewGroup.LayoutParams(-1, -1));
    }

    /* renamed from: a */
    public void m6047a(boolean z) {
        this.f5202c = z;
    }

    /* renamed from: b */
    public void m6048b(boolean z) {
        this.f5201b = z;
    }
}
