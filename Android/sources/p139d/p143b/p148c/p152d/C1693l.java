package p139d.p143b.p148c.p152d;

import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;

/* renamed from: d.b.c.d.l */
/* loaded from: classes.dex */
public final class C1693l {
    /* renamed from: a */
    public static <E> Set<E> m6980a(Map<E, Boolean> map) {
        return Collections.newSetFromMap(map);
    }

    /* renamed from: a */
    public static <E> CopyOnWriteArraySet<E> m6981a() {
        return new CopyOnWriteArraySet<>();
    }

    /* renamed from: b */
    public static <E> Set<E> m6982b() {
        return m6980a(new IdentityHashMap());
    }
}
