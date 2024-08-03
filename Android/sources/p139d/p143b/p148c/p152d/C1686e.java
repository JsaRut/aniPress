package p139d.p143b.p148c.p152d;

import java.util.ArrayList;
import java.util.Collections;

/* renamed from: d.b.c.d.e */
/* loaded from: classes.dex */
public class C1686e<E> extends ArrayList<E> {
    private C1686e(int i) {
        super(i);
    }

    /* renamed from: a */
    public static <E> C1686e<E> m6955a(E... eArr) {
        C1686e<E> c1686e = new C1686e<>(eArr.length);
        Collections.addAll(c1686e, eArr);
        return c1686e;
    }
}
