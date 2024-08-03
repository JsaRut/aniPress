package p031c.p032a.p063g;

import android.content.Context;
import java.security.SecureRandom;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import p031c.p032a.p062f.C0617b;
import p031c.p032a.p062f.C0618c;

/* renamed from: c.a.g.e */
/* loaded from: classes.dex */
public final class C0623e {

    /* renamed from: a */
    private static final Comparator<C0622d> f2918a = new C0624f();

    /* renamed from: a */
    public static LinkedHashSet<C0626h> m3208a(Context context, LinkedHashSet<C0626h> linkedHashSet, long j) {
        if ((linkedHashSet != null ? linkedHashSet.size() : 0) == 0) {
            return new LinkedHashSet<>();
        }
        LinkedList linkedList = new LinkedList();
        Iterator<C0626h> it = linkedHashSet.iterator();
        boolean z = true;
        while (it.hasNext()) {
            C0626h next = it.next();
            if (next.m3221a()) {
                C0617b<String> m3167f = C0617b.m3167f(next.toString());
                C0622d m3206a = C0622d.m3206a((String) C0618c.m3190a(context, m3167f));
                if (m3206a == null) {
                    m3206a = new C0622d(next);
                }
                if (z) {
                    m3206a.f2917e = 1;
                    z = false;
                }
                if (j > 0) {
                    m3206a.f2915c = j;
                    m3167f.m3188a((C0617b<String>) m3206a.m3207a());
                    C0618c.m3193a(context, (C0617b<?>[]) new C0617b[]{m3167f});
                }
                linkedList.add(m3206a);
            }
        }
        LinkedList m3209a = m3209a(linkedList, f2918a);
        LinkedHashSet<C0626h> linkedHashSet2 = new LinkedHashSet<>();
        Iterator it2 = m3209a.iterator();
        while (it2.hasNext()) {
            Iterator it3 = ((LinkedList) it2.next()).iterator();
            while (it3.hasNext()) {
                linkedHashSet2.add(((C0622d) it3.next()).f2913a);
            }
        }
        return linkedHashSet2;
    }

    /* renamed from: a */
    private static <T> LinkedList<LinkedList<T>> m3209a(Collection<T> collection, Comparator<T> comparator) {
        int size = collection.size();
        if (size == 0) {
            return new LinkedList<>();
        }
        LinkedList<LinkedList<T>> linkedList = new LinkedList<>();
        if (size == 1) {
            linkedList.add(new LinkedList<>(collection));
            return linkedList;
        }
        SecureRandom secureRandom = new SecureRandom();
        for (T t : collection) {
            boolean z = false;
            for (int i = 0; i < linkedList.size(); i++) {
                LinkedList<T> linkedList2 = linkedList.get(i);
                int compare = comparator.compare(t, linkedList2.getFirst());
                if (compare == 0) {
                    linkedList2.add(secureRandom.nextInt(linkedList2.size() + 1), t);
                } else if (compare < 0) {
                    LinkedList<T> linkedList3 = new LinkedList<>();
                    linkedList3.add(t);
                    linkedList.add(i, linkedList3);
                }
                z = true;
            }
            if (!z) {
                LinkedList<T> linkedList4 = new LinkedList<>();
                linkedList4.add(t);
                linkedList.add(linkedList4);
            }
        }
        return linkedList;
    }

    /* renamed from: a */
    public static void m3210a(Context context, C0626h c0626h, int i, long j) {
        if (c0626h != null) {
            C0617b<String> m3167f = C0617b.m3167f(c0626h.toString());
            C0622d m3206a = C0622d.m3206a((String) C0618c.m3190a(context, m3167f));
            if (m3206a == null) {
                m3206a = new C0622d(c0626h);
            }
            m3206a.f2916d = j;
            m3206a.f2914b = i;
            m3167f.m3188a((C0617b<String>) m3206a.m3207a());
            C0618c.m3193a(context, (C0617b<?>[]) new C0617b[]{m3167f});
        }
    }
}
