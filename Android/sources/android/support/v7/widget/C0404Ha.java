package android.support.v7.widget;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Resources;
import android.graphics.Rect;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.TextView;
import p000a.p005b.p022d.p023a.C0115d;
import p000a.p005b.p022d.p023a.C0117f;
import p000a.p005b.p022d.p023a.C0118g;
import p000a.p005b.p022d.p023a.C0120i;

/* renamed from: android.support.v7.widget.Ha */
/* loaded from: classes.dex */
class C0404Ha {

    /* renamed from: a */
    private final Context f2055a;

    /* renamed from: b */
    private final View f2056b;

    /* renamed from: c */
    private final TextView f2057c;

    /* renamed from: d */
    private final WindowManager.LayoutParams f2058d = new WindowManager.LayoutParams();

    /* renamed from: e */
    private final Rect f2059e = new Rect();

    /* renamed from: f */
    private final int[] f2060f = new int[2];

    /* renamed from: g */
    private final int[] f2061g = new int[2];

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0404Ha(Context context) {
        this.f2055a = context;
        this.f2056b = LayoutInflater.from(this.f2055a).inflate(C0118g.abc_tooltip, (ViewGroup) null);
        this.f2057c = (TextView) this.f2056b.findViewById(C0117f.message);
        this.f2058d.setTitle(C0404Ha.class.getSimpleName());
        this.f2058d.packageName = this.f2055a.getPackageName();
        WindowManager.LayoutParams layoutParams = this.f2058d;
        layoutParams.type = 1002;
        layoutParams.width = -2;
        layoutParams.height = -2;
        layoutParams.format = -3;
        layoutParams.windowAnimations = C0120i.Animation_AppCompat_Tooltip;
        layoutParams.flags = 24;
    }

    /* renamed from: a */
    private static View m2223a(View view) {
        View rootView = view.getRootView();
        ViewGroup.LayoutParams layoutParams = rootView.getLayoutParams();
        if ((layoutParams instanceof WindowManager.LayoutParams) && ((WindowManager.LayoutParams) layoutParams).type == 2) {
            return rootView;
        }
        for (Context context = view.getContext(); context instanceof ContextWrapper; context = ((ContextWrapper) context).getBaseContext()) {
            if (context instanceof Activity) {
                return ((Activity) context).getWindow().getDecorView();
            }
        }
        return rootView;
    }

    /* renamed from: a */
    private void m2224a(View view, int i, int i2, boolean z, WindowManager.LayoutParams layoutParams) {
        int height;
        int i3;
        layoutParams.token = view.getApplicationWindowToken();
        int dimensionPixelOffset = this.f2055a.getResources().getDimensionPixelOffset(C0115d.tooltip_precise_anchor_threshold);
        if (view.getWidth() < dimensionPixelOffset) {
            i = view.getWidth() / 2;
        }
        if (view.getHeight() >= dimensionPixelOffset) {
            int dimensionPixelOffset2 = this.f2055a.getResources().getDimensionPixelOffset(C0115d.tooltip_precise_anchor_extra_offset);
            height = i2 + dimensionPixelOffset2;
            i3 = i2 - dimensionPixelOffset2;
        } else {
            height = view.getHeight();
            i3 = 0;
        }
        layoutParams.gravity = 49;
        int dimensionPixelOffset3 = this.f2055a.getResources().getDimensionPixelOffset(z ? C0115d.tooltip_y_offset_touch : C0115d.tooltip_y_offset_non_touch);
        View m2223a = m2223a(view);
        if (m2223a == null) {
            Log.e("TooltipPopup", "Cannot find app view");
            return;
        }
        m2223a.getWindowVisibleDisplayFrame(this.f2059e);
        Rect rect = this.f2059e;
        if (rect.left < 0 && rect.top < 0) {
            Resources resources = this.f2055a.getResources();
            int identifier = resources.getIdentifier("status_bar_height", "dimen", "android");
            int dimensionPixelSize = identifier != 0 ? resources.getDimensionPixelSize(identifier) : 0;
            DisplayMetrics displayMetrics = resources.getDisplayMetrics();
            this.f2059e.set(0, dimensionPixelSize, displayMetrics.widthPixels, displayMetrics.heightPixels);
        }
        m2223a.getLocationOnScreen(this.f2061g);
        view.getLocationOnScreen(this.f2060f);
        int[] iArr = this.f2060f;
        int i4 = iArr[0];
        int[] iArr2 = this.f2061g;
        iArr[0] = i4 - iArr2[0];
        iArr[1] = iArr[1] - iArr2[1];
        layoutParams.x = (iArr[0] + i) - (m2223a.getWidth() / 2);
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        this.f2056b.measure(makeMeasureSpec, makeMeasureSpec);
        int measuredHeight = this.f2056b.getMeasuredHeight();
        int[] iArr3 = this.f2060f;
        int i5 = ((iArr3[1] + i3) - dimensionPixelOffset3) - measuredHeight;
        int i6 = iArr3[1] + height + dimensionPixelOffset3;
        if (!z ? measuredHeight + i6 <= this.f2059e.height() : i5 < 0) {
            layoutParams.y = i5;
        } else {
            layoutParams.y = i6;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public void m2225a() {
        if (m2227b()) {
            ((WindowManager) this.f2055a.getSystemService("window")).removeView(this.f2056b);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public void m2226a(View view, int i, int i2, boolean z, CharSequence charSequence) {
        if (m2227b()) {
            m2225a();
        }
        this.f2057c.setText(charSequence);
        m2224a(view, i, i2, z, this.f2058d);
        ((WindowManager) this.f2055a.getSystemService("window")).addView(this.f2056b, this.f2058d);
    }

    /* renamed from: b */
    boolean m2227b() {
        return this.f2056b.getParent() != null;
    }
}
