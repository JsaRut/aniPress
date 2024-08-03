package com.facebook.react.views.text;

import android.graphics.drawable.Drawable;
import android.text.Spannable;
import android.text.style.ReplacementSpan;
import android.widget.TextView;

/* renamed from: com.facebook.react.views.text.z */
/* loaded from: classes.dex */
public abstract class AbstractC1475z extends ReplacementSpan implements InterfaceC1462m {
    /* renamed from: a */
    public static void m6238a(Spannable spannable, TextView textView) {
        for (AbstractC1475z abstractC1475z : (AbstractC1475z[]) spannable.getSpans(0, spannable.length(), AbstractC1475z.class)) {
            abstractC1475z.mo6153c();
            abstractC1475z.mo6151a(textView);
        }
    }

    /* renamed from: a */
    public abstract Drawable mo6150a();

    /* renamed from: a */
    public abstract void mo6151a(TextView textView);

    /* renamed from: b */
    public abstract int mo6152b();

    /* renamed from: c */
    public abstract void mo6153c();

    /* renamed from: d */
    public abstract void mo6154d();

    /* renamed from: e */
    public abstract void mo6155e();

    /* renamed from: f */
    public abstract void mo6156f();
}
