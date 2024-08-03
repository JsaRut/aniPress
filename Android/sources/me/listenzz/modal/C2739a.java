package me.listenzz.modal;

import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Point;
import android.os.Build;
import android.view.Display;
import android.view.WindowManager;
import p139d.p143b.p204k.p205a.C2038a;

/* renamed from: me.listenzz.modal.a */
/* loaded from: classes.dex */
public class C2739a {

    /* renamed from: a */
    private static final Point f11444a = new Point();

    /* renamed from: b */
    private static final Point f11445b = new Point();

    /* renamed from: c */
    private static final Point f11446c = new Point();

    /* renamed from: a */
    public static Point m11762a(Context context) {
        WindowManager windowManager = (WindowManager) context.getSystemService("window");
        C2038a.m8318a(windowManager);
        Display defaultDisplay = windowManager.getDefaultDisplay();
        defaultDisplay.getCurrentSizeRange(f11444a, f11445b);
        defaultDisplay.getSize(f11446c);
        int i = 0;
        boolean z = context.getTheme().obtainStyledAttributes(new int[]{R.attr.windowFullscreen}).getBoolean(0, false);
        Resources resources = context.getResources();
        int identifier = resources.getIdentifier("status_bar_height", "dimen", "android");
        if ((z || Build.VERSION.SDK_INT >= 21) && identifier > 0) {
            i = (int) resources.getDimension(identifier);
        }
        Point point = f11446c;
        return point.x < point.y ? new Point(f11444a.x, f11445b.y + i) : new Point(f11445b.x, f11444a.y + i);
    }
}
