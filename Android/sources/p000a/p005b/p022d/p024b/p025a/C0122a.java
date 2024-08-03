package p000a.p005b.p022d.p024b.p025a;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.support.v7.widget.C0464o;
import android.util.Log;
import android.util.SparseArray;
import android.util.TypedValue;
import java.util.WeakHashMap;
import p000a.p005b.p009c.p010a.C0022a;
import p000a.p005b.p009c.p010a.p011a.C0023a;

/* renamed from: a.b.d.b.a.a */
/* loaded from: classes.dex */
public final class C0122a {

    /* renamed from: a */
    private static final ThreadLocal<TypedValue> f414a = new ThreadLocal<>();

    /* renamed from: b */
    private static final WeakHashMap<Context, SparseArray<a>> f415b = new WeakHashMap<>(0);

    /* renamed from: c */
    private static final Object f416c = new Object();

    /* renamed from: a.b.d.b.a.a$a */
    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a */
        final ColorStateList f417a;

        /* renamed from: b */
        final Configuration f418b;

        a(ColorStateList colorStateList, Configuration configuration) {
            this.f417a = colorStateList;
            this.f418b = configuration;
        }
    }

    /* renamed from: a */
    public static ColorStateList m547a(Context context, int i) {
        if (Build.VERSION.SDK_INT >= 23) {
            return context.getColorStateList(i);
        }
        ColorStateList m551c = m551c(context, i);
        if (m551c != null) {
            return m551c;
        }
        ColorStateList m552d = m552d(context, i);
        if (m552d == null) {
            return C0022a.m90b(context, i);
        }
        m549a(context, i, m552d);
        return m552d;
    }

    /* renamed from: a */
    private static TypedValue m548a() {
        TypedValue typedValue = f414a.get();
        if (typedValue != null) {
            return typedValue;
        }
        TypedValue typedValue2 = new TypedValue();
        f414a.set(typedValue2);
        return typedValue2;
    }

    /* renamed from: a */
    private static void m549a(Context context, int i, ColorStateList colorStateList) {
        synchronized (f416c) {
            SparseArray<a> sparseArray = f415b.get(context);
            if (sparseArray == null) {
                sparseArray = new SparseArray<>();
                f415b.put(context, sparseArray);
            }
            sparseArray.append(i, new a(colorStateList, context.getResources().getConfiguration()));
        }
    }

    /* renamed from: b */
    public static Drawable m550b(Context context, int i) {
        return C0464o.m2506a().m2525a(context, i);
    }

    /* renamed from: c */
    private static ColorStateList m551c(Context context, int i) {
        a aVar;
        synchronized (f416c) {
            SparseArray<a> sparseArray = f415b.get(context);
            if (sparseArray != null && sparseArray.size() > 0 && (aVar = sparseArray.get(i)) != null) {
                if (aVar.f418b.equals(context.getResources().getConfiguration())) {
                    return aVar.f417a;
                }
                sparseArray.remove(i);
            }
            return null;
        }
    }

    /* renamed from: d */
    private static ColorStateList m552d(Context context, int i) {
        if (m553e(context, i)) {
            return null;
        }
        Resources resources = context.getResources();
        try {
            return C0023a.m94a(resources, resources.getXml(i), context.getTheme());
        } catch (Exception e2) {
            Log.e("AppCompatResources", "Failed to inflate ColorStateList, leaving it to the framework", e2);
            return null;
        }
    }

    /* renamed from: e */
    private static boolean m553e(Context context, int i) {
        Resources resources = context.getResources();
        TypedValue m548a = m548a();
        resources.getValue(i, m548a, true);
        int i2 = m548a.type;
        return i2 >= 28 && i2 <= 31;
    }
}
