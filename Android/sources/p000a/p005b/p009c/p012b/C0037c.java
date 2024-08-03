package p000a.p005b.p009c.p012b;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.Build;
import android.os.CancellationSignal;
import android.os.Handler;
import android.support.v4.util.C0263i;
import p000a.p005b.p009c.p010a.p011a.C0025c;
import p000a.p005b.p009c.p010a.p011a.C0030h;
import p000a.p005b.p009c.p017f.C0058f;

/* renamed from: a.b.c.b.c */
/* loaded from: classes.dex */
public class C0037c {

    /* renamed from: a */
    private static final C0044j f153a;

    /* renamed from: b */
    private static final C0263i<String, Typeface> f154b;

    static {
        int i = Build.VERSION.SDK_INT;
        f153a = i >= 28 ? new C0041g() : i >= 26 ? new C0040f() : (i < 24 || !C0039e.m197a()) ? Build.VERSION.SDK_INT >= 21 ? new C0038d() : new C0044j() : new C0039e();
        f154b = new C0263i<>(16);
    }

    /* renamed from: a */
    public static Typeface m189a(Context context, C0025c.a aVar, Resources resources, int i, int i2, C0030h.a aVar2, Handler handler, boolean z) {
        Typeface mo200a;
        if (aVar instanceof C0025c.d) {
            C0025c.d dVar = (C0025c.d) aVar;
            boolean z2 = false;
            if (!z ? aVar2 == null : dVar.m125a() == 0) {
                z2 = true;
            }
            mo200a = C0058f.m246a(context, dVar.m126b(), aVar2, handler, z2, z ? dVar.m127c() : -1, i2);
        } else {
            mo200a = f153a.mo200a(context, (C0025c.b) aVar, resources, i2);
            if (aVar2 != null) {
                if (mo200a != null) {
                    aVar2.m142a(mo200a, handler);
                } else {
                    aVar2.m140a(-3, handler);
                }
            }
        }
        if (mo200a != null) {
            f154b.m1367a(m193b(resources, i, i2), mo200a);
        }
        return mo200a;
    }

    /* renamed from: a */
    public static Typeface m190a(Context context, Resources resources, int i, String str, int i2) {
        Typeface mo207a = f153a.mo207a(context, resources, i, str, i2);
        if (mo207a != null) {
            f154b.m1367a(m193b(resources, i, i2), mo207a);
        }
        return mo207a;
    }

    /* renamed from: a */
    public static Typeface m191a(Context context, CancellationSignal cancellationSignal, C0058f.b[] bVarArr, int i) {
        return f153a.mo195a(context, cancellationSignal, bVarArr, i);
    }

    /* renamed from: a */
    public static Typeface m192a(Resources resources, int i, int i2) {
        return f154b.m1371b(m193b(resources, i, i2));
    }

    /* renamed from: b */
    private static String m193b(Resources resources, int i, int i2) {
        return resources.getResourcePackageName(i) + "-" + i + "-" + i2;
    }
}
