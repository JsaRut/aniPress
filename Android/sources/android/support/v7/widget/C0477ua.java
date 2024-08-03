package android.support.v7.widget;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import java.lang.ref.WeakReference;

/* renamed from: android.support.v7.widget.ua */
/* loaded from: classes.dex */
class C0477ua extends C0433X {

    /* renamed from: b */
    private final WeakReference<Context> f2506b;

    public C0477ua(Context context, Resources resources) {
        super(resources);
        this.f2506b = new WeakReference<>(context);
    }

    @Override // android.support.v7.widget.C0433X, android.content.res.Resources
    public Drawable getDrawable(int i) {
        Drawable drawable = super.getDrawable(i);
        Context context = this.f2506b.get();
        if (drawable != null && context != null) {
            C0464o.m2506a();
            C0464o.m2512a(context, i, drawable);
        }
        return drawable;
    }
}
