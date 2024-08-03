package android.support.v7.widget;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.os.Build;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

/* renamed from: android.support.v7.widget.sa */
/* loaded from: classes.dex */
public class C0473sa extends ContextWrapper {

    /* renamed from: a */
    private static final Object f2493a = new Object();

    /* renamed from: b */
    private static ArrayList<WeakReference<C0473sa>> f2494b;

    /* renamed from: c */
    private final Resources f2495c;

    /* renamed from: d */
    private final Resources.Theme f2496d;

    private C0473sa(Context context) {
        super(context);
        if (!C0406Ia.m2230b()) {
            this.f2495c = new C0477ua(this, context.getResources());
            this.f2496d = null;
        } else {
            this.f2495c = new C0406Ia(this, context.getResources());
            this.f2496d = this.f2495c.newTheme();
            this.f2496d.setTo(context.getTheme());
        }
    }

    /* renamed from: a */
    public static Context m2564a(Context context) {
        if (!m2565b(context)) {
            return context;
        }
        synchronized (f2493a) {
            if (f2494b == null) {
                f2494b = new ArrayList<>();
            } else {
                for (int size = f2494b.size() - 1; size >= 0; size--) {
                    WeakReference<C0473sa> weakReference = f2494b.get(size);
                    if (weakReference == null || weakReference.get() == null) {
                        f2494b.remove(size);
                    }
                }
                for (int size2 = f2494b.size() - 1; size2 >= 0; size2--) {
                    WeakReference<C0473sa> weakReference2 = f2494b.get(size2);
                    C0473sa c0473sa = weakReference2 != null ? weakReference2.get() : null;
                    if (c0473sa != null && c0473sa.getBaseContext() == context) {
                        return c0473sa;
                    }
                }
            }
            C0473sa c0473sa2 = new C0473sa(context);
            f2494b.add(new WeakReference<>(c0473sa2));
            return c0473sa2;
        }
    }

    /* renamed from: b */
    private static boolean m2565b(Context context) {
        if ((context instanceof C0473sa) || (context.getResources() instanceof C0477ua) || (context.getResources() instanceof C0406Ia)) {
            return false;
        }
        return Build.VERSION.SDK_INT < 21 || C0406Ia.m2230b();
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public AssetManager getAssets() {
        return this.f2495c.getAssets();
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public Resources getResources() {
        return this.f2495c;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public Resources.Theme getTheme() {
        Resources.Theme theme = this.f2496d;
        return theme == null ? super.getTheme() : theme;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public void setTheme(int i) {
        Resources.Theme theme = this.f2496d;
        if (theme == null) {
            super.setTheme(i);
        } else {
            theme.applyStyle(i, true);
        }
    }
}
