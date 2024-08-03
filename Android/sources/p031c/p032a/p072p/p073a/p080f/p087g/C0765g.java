package p031c.p032a.p072p.p073a.p080f.p087g;

import android.view.View;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* renamed from: c.a.p.a.f.g.g */
/* loaded from: classes.dex */
public final class C0765g {

    /* renamed from: a */
    static Object f3383a = null;

    /* renamed from: b */
    static Field f3384b = null;

    /* renamed from: c */
    static Class f3385c = null;

    /* renamed from: d */
    static Class f3386d = null;

    /* renamed from: e */
    private static Class f3387e = null;

    /* renamed from: f */
    private static Method f3388f = null;

    /* renamed from: g */
    private static Class f3389g = null;

    /* renamed from: h */
    private static Method f3390h = null;

    /* renamed from: i */
    private static boolean f3391i = false;

    /* renamed from: j */
    static boolean f3392j = false;

    /* renamed from: k */
    static boolean f3393k = false;

    /* JADX WARN: Can't wrap try/catch for region: R(18:3|(1:5)(1:70)|6|(6:7|8|(1:10)(2:64|(1:66)(1:67))|11|(1:13)(2:61|(1:63))|14)|15|(4:16|17|18|19)|20|(4:21|22|23|24)|25|(2:26|27)|(9:29|30|31|32|33|(2:35|36)(2:42|43)|37|38|39)(2:50|51)|49|32|33|(0)(0)|37|38|39) */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0119, code lost:            r0 = move-exception;     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x011a, code lost:            p031c.p032a.p072p.p073a.p080f.p081a.C0732b.m3718b("RootViewUtils", "init popDecorViewClass error:" + r0.getMessage());     */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0112  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void m3810a() {
        /*
            Method dump skipped, instructions count: 306
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p031c.p032a.p072p.p073a.p080f.p087g.C0765g.m3810a():void");
    }

    /* renamed from: a */
    public static boolean m3811a(View view) {
        Class<?> cls = view.getClass();
        return cls == f3385c || cls == f3386d;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x003c A[SYNTHETIC] */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static android.view.View[] m3812a(android.view.View[] r7, boolean r8) {
        /*
            if (r7 == 0) goto L4b
            int r8 = r7.length
            if (r8 != 0) goto L6
            goto L4b
        L6:
            c.a.p.a.f.a r8 = p031c.p032a.p072p.p073a.p080f.C0730a.m3703a()
            int r8 = r8.m3713d()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            int r1 = r7.length
            r2 = 0
            r3 = 0
        L16:
            if (r3 >= r1) goto L3f
            r4 = r7[r3]
            if (r4 == 0) goto L3c
            int r5 = r4.hashCode()
            if (r5 != r8) goto L26
            r0.add(r2, r4)
            goto L3c
        L26:
            if (r4 == 0) goto L35
            android.view.ViewGroup$LayoutParams r5 = r4.getLayoutParams()
            boolean r6 = r5 instanceof android.view.WindowManager.LayoutParams
            if (r6 == 0) goto L35
            android.view.WindowManager$LayoutParams r5 = (android.view.WindowManager.LayoutParams) r5
            int r5 = r5.type
            goto L36
        L35:
            r5 = -1
        L36:
            r6 = 1
            if (r5 == r6) goto L3c
            r0.add(r4)
        L3c:
            int r3 = r3 + 1
            goto L16
        L3f:
            int r7 = r0.size()
            android.view.View[] r7 = new android.view.View[r7]
            java.lang.Object[] r7 = r0.toArray(r7)
            android.view.View[] r7 = (android.view.View[]) r7
        L4b:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: p031c.p032a.p072p.p073a.p080f.p087g.C0765g.m3812a(android.view.View[], boolean):android.view.View[]");
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0040  */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static android.view.View[] m3813b() {
        /*
            r0 = 0
            android.view.View[] r1 = new android.view.View[r0]
            java.lang.Object r2 = p031c.p032a.p072p.p073a.p080f.p087g.C0765g.f3383a
            r3 = 1
            if (r2 != 0) goto L1f
            c.a.p.a.f.a r2 = p031c.p032a.p072p.p073a.p080f.C0730a.m3703a()
            android.app.Activity r2 = r2.m3711c()
            if (r2 == 0) goto L1e
            android.view.View[] r1 = new android.view.View[r3]
            android.view.Window r2 = r2.getWindow()
            android.view.View r2 = r2.getDecorView()
            r1[r0] = r2
        L1e:
            return r1
        L1f:
            r0 = 0
            boolean r4 = p031c.p032a.p072p.p073a.p080f.p087g.C0765g.f3392j     // Catch: java.lang.Exception -> L42
            if (r4 == 0) goto L33
            java.lang.reflect.Field r0 = p031c.p032a.p072p.p073a.p080f.p087g.C0765g.f3384b     // Catch: java.lang.Exception -> L42
            java.lang.Object r0 = r0.get(r2)     // Catch: java.lang.Exception -> L42
            java.util.ArrayList r0 = (java.util.ArrayList) r0     // Catch: java.lang.Exception -> L42
            java.lang.Object[] r0 = r0.toArray(r1)     // Catch: java.lang.Exception -> L42
        L30:
            android.view.View[] r0 = (android.view.View[]) r0     // Catch: java.lang.Exception -> L42
            goto L3e
        L33:
            boolean r4 = p031c.p032a.p072p.p073a.p080f.p087g.C0765g.f3393k     // Catch: java.lang.Exception -> L42
            if (r4 == 0) goto L3e
            java.lang.reflect.Field r0 = p031c.p032a.p072p.p073a.p080f.p087g.C0765g.f3384b     // Catch: java.lang.Exception -> L42
            java.lang.Object r0 = r0.get(r2)     // Catch: java.lang.Exception -> L42
            goto L30
        L3e:
            if (r0 == 0) goto L5a
            r1 = r0
            goto L5a
        L42:
            r0 = move-exception
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r4 = "getWindowViews error:"
            r2.<init>(r4)
            java.lang.String r0 = r0.getMessage()
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            java.lang.String r2 = "RootViewUtils"
            p031c.p032a.p072p.p073a.p080f.p081a.C0732b.m3718b(r2, r0)
        L5a:
            android.view.View[] r0 = m3812a(r1, r3)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p031c.p032a.p072p.p073a.p080f.p087g.C0765g.m3813b():android.view.View[]");
    }
}
