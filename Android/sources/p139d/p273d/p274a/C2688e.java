package p139d.p273d.p274a;

import java.util.Comparator;

/* renamed from: d.d.a.e */
/* loaded from: classes.dex */
class C2688e implements Comparator<C2686c> {
    @Override // java.util.Comparator
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compare(C2686c c2686c, C2686c c2686c2) {
        if ((c2686c.f11272x && c2686c2.f11272x) || (c2686c.f11273y && c2686c2.f11273y)) {
            return Integer.signum(c2686c2.f11271w - c2686c.f11271w);
        }
        if (c2686c.f11272x) {
            return -1;
        }
        if (c2686c2.f11272x) {
            return 1;
        }
        if (c2686c.f11273y) {
            return -1;
        }
        return c2686c2.f11273y ? 1 : 0;
    }
}
