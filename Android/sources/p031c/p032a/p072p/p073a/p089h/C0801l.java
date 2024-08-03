package p031c.p032a.p072p.p073a.p089h;

import android.content.Context;
import android.view.WindowManager;
import android.widget.FrameLayout;

/* renamed from: c.a.p.a.h.l */
/* loaded from: classes.dex */
public final class C0801l extends FrameLayout {

    /* renamed from: a */
    private int f3504a;

    /* renamed from: b */
    private int f3505b;

    /* renamed from: c */
    private int f3506c;

    public C0801l(Context context) {
        super(context);
    }

    /* renamed from: a */
    public final void m3911a() {
        if (getParent() != null) {
            setVisibility(0);
            return;
        }
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams(this.f3505b, this.f3506c, this.f3504a, C0804o.f3508a, -3);
        layoutParams.gravity = 51;
        layoutParams.setTitle("TagsWindow:" + getContext().getPackageName());
        ((WindowManager) getContext().getApplicationContext().getSystemService("window")).addView(this, layoutParams);
    }

    /* renamed from: a */
    public final void m3912a(int i) {
        this.f3504a = i;
    }

    /* renamed from: a */
    public final void m3913a(int i, int i2) {
        this.f3505b = i;
        this.f3506c = i2;
    }
}
