package com.facebook.react.views.modal;

import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Point;
import android.view.Display;
import android.view.WindowManager;
import p139d.p143b.p204k.p205a.C2038a;

/* renamed from: com.facebook.react.views.modal.a */
/* loaded from: classes.dex */
class C1403a {

    /* renamed from: a */
    private static final Point f5164a = new Point();

    /* renamed from: b */
    private static final Point f5165b = new Point();

    /* renamed from: c */
    private static final Point f5166c = new Point();

    /* renamed from: a */
    public static Point m6025a(Context context) {
        WindowManager windowManager = (WindowManager) context.getSystemService("window");
        C2038a.m8318a(windowManager);
        Display defaultDisplay = windowManager.getDefaultDisplay();
        defaultDisplay.getCurrentSizeRange(f5164a, f5165b);
        defaultDisplay.getSize(f5166c);
        int i = 0;
        boolean z = context.getTheme().obtainStyledAttributes(new int[]{R.attr.windowFullscreen}).getBoolean(0, false);
        Resources resources = context.getResources();
        int identifier = resources.getIdentifier("status_bar_height", "dimen", "android");
        if (z && identifier > 0) {
            i = (int) resources.getDimension(identifier);
        }
        Point point = f5166c;
        return point.x < point.y ? new Point(f5164a.x, f5165b.y + i) : new Point(f5165b.x, f5164a.y + i);
    }
}
