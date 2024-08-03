package p139d.p143b.p169g.p182i;

import android.view.View;
import android.view.ViewGroup;

/* renamed from: d.b.g.i.a */
/* loaded from: classes.dex */
public class C1819a {

    /* renamed from: d.b.g.i.a$a */
    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a */
        public int f6710a;

        /* renamed from: b */
        public int f6711b;
    }

    /* renamed from: a */
    public static void m7477a(a aVar, float f, ViewGroup.LayoutParams layoutParams, int i, int i2) {
        if (f <= 0.0f || layoutParams == null) {
            return;
        }
        if (m7478a(layoutParams.height)) {
            aVar.f6711b = View.MeasureSpec.makeMeasureSpec(View.resolveSize((int) (((View.MeasureSpec.getSize(aVar.f6710a) - i) / f) + i2), aVar.f6711b), 1073741824);
        } else if (m7478a(layoutParams.width)) {
            aVar.f6710a = View.MeasureSpec.makeMeasureSpec(View.resolveSize((int) (((View.MeasureSpec.getSize(aVar.f6711b) - i2) * f) + i), aVar.f6710a), 1073741824);
        }
    }

    /* renamed from: a */
    private static boolean m7478a(int i) {
        return i == 0 || i == -2;
    }
}
