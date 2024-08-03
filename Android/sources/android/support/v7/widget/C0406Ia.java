package android.support.v7.widget;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Build;
import java.lang.ref.WeakReference;

/* renamed from: android.support.v7.widget.Ia */
/* loaded from: classes.dex */
public class C0406Ia extends Resources {

    /* renamed from: a */
    private static boolean f2065a = false;

    /* renamed from: b */
    private final WeakReference<Context> f2066b;

    public C0406Ia(Context context, Resources resources) {
        super(resources.getAssets(), resources.getDisplayMetrics(), resources.getConfiguration());
        this.f2066b = new WeakReference<>(context);
    }

    /* renamed from: a */
    public static boolean m2229a() {
        return f2065a;
    }

    /* renamed from: b */
    public static boolean m2230b() {
        return m2229a() && Build.VERSION.SDK_INT <= 20;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public final Drawable m2231a(int i) {
        return super.getDrawable(i);
    }

    @Override // android.content.res.Resources
    public Drawable getDrawable(int i) {
        Context context = this.f2066b.get();
        return context != null ? C0464o.m2506a().m2527a(context, this, i) : super.getDrawable(i);
    }
}
