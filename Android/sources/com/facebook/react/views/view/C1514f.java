package com.facebook.react.views.view;

import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.view.View;
import p000a.p005b.p009c.p019h.C0107v;

/* renamed from: com.facebook.react.views.view.f */
/* loaded from: classes.dex */
public class C1514f {

    /* renamed from: a */
    private C1513e f5604a;

    /* renamed from: b */
    private View f5605b;

    public C1514f(View view) {
        this.f5605b = view;
    }

    /* renamed from: a */
    private C1513e m6328a() {
        Drawable layerDrawable;
        View view;
        if (this.f5604a == null) {
            this.f5604a = new C1513e(this.f5605b.getContext());
            Drawable background = this.f5605b.getBackground();
            C0107v.m500a(this.f5605b, (Drawable) null);
            if (background == null) {
                view = this.f5605b;
                layerDrawable = this.f5604a;
            } else {
                layerDrawable = new LayerDrawable(new Drawable[]{this.f5604a, background});
                view = this.f5605b;
            }
            C0107v.m500a(view, layerDrawable);
        }
        return this.f5604a;
    }

    /* renamed from: a */
    public void m6329a(float f) {
        m6328a().m6314a(f);
    }

    /* renamed from: a */
    public void m6330a(float f, int i) {
        m6328a().m6320b(f, i);
    }

    /* renamed from: a */
    public void m6331a(int i) {
        if (i == 0 && this.f5604a == null) {
            return;
        }
        m6328a().m6321b(i);
    }

    /* renamed from: a */
    public void m6332a(int i, float f) {
        m6328a().m6315a(i, f);
    }

    /* renamed from: a */
    public void m6333a(int i, float f, float f2) {
        m6328a().m6316a(i, f, f2);
    }

    /* renamed from: a */
    public void m6334a(String str) {
        m6328a().m6317a(str);
    }
}
