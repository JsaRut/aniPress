package p031c.p032a.p072p.p073a.p089h;

import android.view.View;
import android.view.WindowManager;

/* renamed from: c.a.p.a.h.j */
/* loaded from: classes.dex */
public final class C0799j extends View {

    /* renamed from: a */
    private int f3496a;

    /* renamed from: b */
    private WindowManager f3497b;

    /* renamed from: c */
    private int f3498c;

    /* renamed from: d */
    private int f3499d;

    /* renamed from: e */
    private int f3500e;

    /* renamed from: f */
    private int f3501f;

    /* renamed from: g */
    private int f3502g;

    /* renamed from: h */
    private final float f3503h;

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0022, code lost:            if (r3 >= 24) goto L4;     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public C0799j(android.content.Context r3) {
        /*
            r2 = this;
            r2.<init>(r3)
            r3 = 2005(0x7d5, float:2.81E-42)
            r2.f3496a = r3
            r3 = 1066779279(0x3f95c28f, float:1.17)
            r2.f3503h = r3
            int r3 = android.os.Build.VERSION.SDK_INT
            r0 = 2002(0x7d2, float:2.805E-42)
            r1 = 19
            if (r3 >= r1) goto L17
        L14:
            r2.f3496a = r0
            goto L25
        L17:
            r1 = 25
            if (r3 <= r1) goto L20
            r3 = 2038(0x7f6, float:2.856E-42)
            r2.f3496a = r3
            goto L25
        L20:
            r1 = 24
            if (r3 < r1) goto L25
            goto L14
        L25:
            android.content.Context r3 = r2.getContext()
            android.content.Context r3 = r3.getApplicationContext()
            java.lang.String r0 = "window"
            java.lang.Object r3 = r3.getSystemService(r0)
            android.view.WindowManager r3 = (android.view.WindowManager) r3
            r2.f3497b = r3
            android.content.Context r3 = r2.getContext()
            r0 = 1117782016(0x42a00000, float:80.0)
            int r3 = p031c.p032a.p072p.p073a.p080f.C0770h.m3841b(r3, r0)
            r2.f3502g = r3
            android.content.Context r3 = r2.getContext()
            r1 = 1123024896(0x42f00000, float:120.0)
            int r3 = p031c.p032a.p072p.p073a.p080f.C0770h.m3841b(r3, r1)
            r2.f3498c = r3
            android.content.Context r3 = r2.getContext()
            int r3 = p031c.p032a.p072p.p073a.p080f.C0770h.m3841b(r3, r0)
            r2.f3499d = r3
            android.content.Context r3 = r2.getContext()
            r0 = 1098907648(0x41800000, float:16.0)
            int r3 = p031c.p032a.p072p.p073a.p080f.C0770h.m3841b(r3, r0)
            r2.f3501f = r3
            android.content.Context r3 = r2.getContext()
            r0 = 1099956224(0x41900000, float:18.0)
            int r3 = p031c.p032a.p072p.p073a.p080f.C0770h.m3841b(r3, r0)
            r2.f3500e = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p031c.p032a.p072p.p073a.p089h.C0799j.<init>(android.content.Context):void");
    }

    /* renamed from: a */
    public final void m3910a() {
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams(0, 0, this.f3496a, 312, -3);
        layoutParams.gravity = 51;
        layoutParams.setTitle("CircleMagnifierWindow:" + getContext().getPackageName());
        setVisibility(8);
        this.f3497b.addView(this, layoutParams);
    }
}
