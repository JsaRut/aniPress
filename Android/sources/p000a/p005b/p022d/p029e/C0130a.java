package p000a.p005b.p022d.p029e;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.os.Build;
import android.view.ViewConfiguration;
import p000a.p005b.p022d.p023a.C0112a;
import p000a.p005b.p022d.p023a.C0113b;
import p000a.p005b.p022d.p023a.C0115d;
import p000a.p005b.p022d.p023a.C0121j;

/* renamed from: a.b.d.e.a */
/* loaded from: classes.dex */
public class C0130a {

    /* renamed from: a */
    private Context f488a;

    private C0130a(Context context) {
        this.f488a = context;
    }

    /* renamed from: a */
    public static C0130a m617a(Context context) {
        return new C0130a(context);
    }

    /* renamed from: a */
    public boolean m618a() {
        return this.f488a.getApplicationInfo().targetSdkVersion < 14;
    }

    /* renamed from: b */
    public int m619b() {
        return this.f488a.getResources().getDisplayMetrics().widthPixels / 2;
    }

    /* renamed from: c */
    public int m620c() {
        Configuration configuration = this.f488a.getResources().getConfiguration();
        int i = configuration.screenWidthDp;
        int i2 = configuration.screenHeightDp;
        if (configuration.smallestScreenWidthDp > 600 || i > 600) {
            return 5;
        }
        if (i > 960 && i2 > 720) {
            return 5;
        }
        if (i > 720 && i2 > 960) {
            return 5;
        }
        if (i >= 500) {
            return 4;
        }
        if (i > 640 && i2 > 480) {
            return 4;
        }
        if (i <= 480 || i2 <= 640) {
            return i >= 360 ? 3 : 2;
        }
        return 4;
    }

    /* renamed from: d */
    public int m621d() {
        return this.f488a.getResources().getDimensionPixelSize(C0115d.abc_action_bar_stacked_tab_max_width);
    }

    /* renamed from: e */
    public int m622e() {
        TypedArray obtainStyledAttributes = this.f488a.obtainStyledAttributes(null, C0121j.ActionBar, C0112a.actionBarStyle, 0);
        int layoutDimension = obtainStyledAttributes.getLayoutDimension(C0121j.ActionBar_height, 0);
        Resources resources = this.f488a.getResources();
        if (!m623f()) {
            layoutDimension = Math.min(layoutDimension, resources.getDimensionPixelSize(C0115d.abc_action_bar_stacked_max_height));
        }
        obtainStyledAttributes.recycle();
        return layoutDimension;
    }

    /* renamed from: f */
    public boolean m623f() {
        return this.f488a.getResources().getBoolean(C0113b.abc_action_bar_embed_tabs);
    }

    /* renamed from: g */
    public boolean m624g() {
        if (Build.VERSION.SDK_INT >= 19) {
            return true;
        }
        return !ViewConfiguration.get(this.f488a).hasPermanentMenuKey();
    }
}
