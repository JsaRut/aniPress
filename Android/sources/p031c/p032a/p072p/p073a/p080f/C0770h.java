package p031c.p032a.p072p.p073a.p080f;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Bitmap;
import android.os.Build;
import android.support.v13.app.FragmentPagerAdapter;
import android.support.v13.app.FragmentStatePagerAdapter;
import android.support.v4.app.AbstractC0165D;
import android.support.v4.app.AbstractC0168G;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.webkit.WebView;
import android.widget.AdapterView;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.SeekBar;
import android.widget.Spinner;
import android.widget.TabWidget;
import android.widget.TextView;
import java.io.File;
import java.util.ArrayList;
import p000a.p005b.p009c.p019h.C0069C;
import p031c.p032a.p072p.p073a.C0707b;
import p031c.p032a.p072p.p073a.p080f.p081a.C0732b;
import p031c.p032a.p072p.p073a.p080f.p087g.C0765g;
import p031c.p032a.p072p.p073a.p080f.p087g.C0769k;
import p031c.p032a.p072p.p073a.p089h.C0804o;

/* renamed from: c.a.p.a.f.h */
/* loaded from: classes.dex */
public final class C0770h {

    /* renamed from: a */
    private static Class<?> f3415a;

    static {
        try {
            f3415a = Class.forName("android.view.View$1");
            if (!View.OnClickListener.class.isAssignableFrom(f3415a)) {
                f3415a = null;
            }
        } catch (ClassNotFoundException unused) {
        }
        if (f3415a == null) {
            try {
                f3415a = Class.forName("android.view.View$DeclaredOnClickListener");
                if (View.OnClickListener.class.isAssignableFrom(f3415a)) {
                    return;
                }
                f3415a = null;
            } catch (ClassNotFoundException unused2) {
            }
        }
    }

    /* renamed from: a */
    public static int m3833a(C0069C c0069c, View view) {
        int i;
        try {
            FragmentPagerAdapter adapter = c0069c.getAdapter();
            i = 0;
            if (adapter instanceof AbstractC0168G) {
                AbstractC0168G abstractC0168G = (AbstractC0168G) adapter;
                while (i < abstractC0168G.mo475a()) {
                    if (abstractC0168G.mo484a(view, abstractC0168G.m762b(i))) {
                        break;
                    }
                    i++;
                }
                i = -1;
            } else if (adapter instanceof AbstractC0165D) {
                AbstractC0165D abstractC0165D = (AbstractC0165D) adapter;
                while (i < abstractC0165D.mo475a()) {
                    if (abstractC0165D.mo484a(view, abstractC0165D.m759b(i))) {
                        break;
                    }
                    i++;
                }
                i = -1;
            } else {
                if (Build.VERSION.SDK_INT >= 13) {
                    if (C0769k.m3831e(adapter)) {
                        FragmentPagerAdapter fragmentPagerAdapter = adapter;
                        while (i < fragmentPagerAdapter.getCount()) {
                            if (fragmentPagerAdapter.isViewFromObject(view, fragmentPagerAdapter.getItem(i))) {
                                break;
                            }
                            i++;
                        }
                    } else if (C0769k.m3832f(adapter)) {
                        FragmentStatePagerAdapter fragmentStatePagerAdapter = (FragmentStatePagerAdapter) adapter;
                        while (i < fragmentStatePagerAdapter.getCount()) {
                            if (fragmentStatePagerAdapter.isViewFromObject(view, fragmentStatePagerAdapter.getItem(i))) {
                                break;
                            }
                            i++;
                        }
                    }
                }
                i = -1;
            }
            if (i == -1) {
                try {
                    i = adapter.mo476a(view);
                } catch (Throwable unused) {
                }
            }
        } catch (Throwable unused2) {
            i = -1;
        }
        return i == -1 ? c0069c.getCurrentItem() : i;
    }

    /* renamed from: a */
    public static int m3834a(Context context, float f) {
        try {
            return (int) ((context.getResources().getDisplayMetrics().scaledDensity * 18.0f) + 0.5f);
        } catch (Throwable unused) {
            return 18;
        }
    }

    /* renamed from: a */
    public static String m3835a(View view, String str) {
        Bitmap drawingCache;
        String str2 = null;
        try {
            C0804o.m3921d();
            view.setDrawingCacheEnabled(true);
            drawingCache = view.getDrawingCache();
        } catch (Throwable unused) {
        }
        if (drawingCache == null || drawingCache.isRecycled()) {
            view.setDrawingCacheEnabled(false);
            C0804o.m3921d();
            return null;
        }
        try {
            str2 = C0752e.m3775a(drawingCache, C0707b.m3613a(view.getContext()).getFilesDir().getAbsolutePath() + File.separator + "bury_view_image" + File.separator + str);
        } catch (Exception e2) {
            C0732b.m3723f("ViewUtil", "save Image error:" + e2.getMessage());
        }
        view.setDrawingCacheEnabled(false);
        C0804o.m3921d();
        return str2;
    }

    /* renamed from: a */
    public static String m3836a(String str) {
        return (str == null || TextUtils.isEmpty(str)) ? "" : str.length() > 256 ? str.substring(0, 256) : str;
    }

    /* renamed from: a */
    public static boolean m3837a(View view) {
        return (view instanceof TextView) || (view instanceof RatingBar) || (view instanceof SeekBar) || (view instanceof ImageView);
    }

    /* renamed from: a */
    public static boolean m3838a(View view, View view2) {
        if (view2 == view) {
            return false;
        }
        do {
            Object parent = view2.getParent();
            if (!(parent instanceof View)) {
                return false;
            }
            view2 = (View) parent;
        } while (view2 != view);
        return true;
    }

    /* renamed from: a */
    public static boolean m3839a(View view, boolean z) {
        ViewParent parent = view.getParent();
        if (parent == null) {
            return false;
        }
        if (view.isClickable() || m3840a(parent)) {
            return true;
        }
        if (z) {
            return false;
        }
        return !(view instanceof ViewGroup) || (view instanceof WebView) || (view instanceof Spinner);
    }

    /* renamed from: a */
    public static boolean m3840a(Object obj) {
        return (obj instanceof AdapterView) || C0769k.m3826a(obj) || (obj instanceof TabWidget);
    }

    /* renamed from: b */
    public static int m3841b(Context context, float f) {
        try {
            return (int) ((f * context.getResources().getDisplayMetrics().density) + 0.5f);
        } catch (Throwable unused) {
            return (int) f;
        }
    }

    /* renamed from: b */
    public static String m3842b(View view) {
        CharSequence hint = view instanceof EditText ? ((EditText) view).getHint() : view instanceof TextView ? ((TextView) view).getText() : view instanceof RatingBar ? String.valueOf(((RatingBar) view).getRating()) : view instanceof SeekBar ? String.valueOf(((SeekBar) view).getProgress()) : view instanceof ImageView ? view.getContentDescription() : null;
        return TextUtils.isEmpty(hint) ? "" : m3836a(hint.toString());
    }

    /* renamed from: c */
    public static ArrayList<View> m3843c(View view) {
        ArrayList<View> arrayList = new ArrayList<>();
        arrayList.add(view);
        for (ViewParent parent = view.getParent(); parent instanceof View; parent = parent.getParent()) {
            View view2 = (View) parent;
            arrayList.add(view2);
            if (C0765g.m3811a(view2)) {
                break;
            }
        }
        return arrayList;
    }

    /* renamed from: d */
    public static Activity m3844d(View view) {
        if (view == null) {
            return null;
        }
        Context context = view.getContext();
        if (context instanceof Activity) {
            return (Activity) context;
        }
        if (context instanceof ContextWrapper) {
            Context baseContext = ((ContextWrapper) context).getBaseContext();
            if (baseContext instanceof Activity) {
                return (Activity) baseContext;
            }
        }
        return null;
    }
}
