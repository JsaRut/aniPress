package android.support.v4.app;

import android.graphics.Rect;
import android.os.Build;
import android.support.v4.util.C0256b;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import p000a.p005b.p009c.p019h.C0107v;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: android.support.v4.app.M */
/* loaded from: classes.dex */
public class C0176M {

    /* renamed from: a */
    private static final int[] f682a = {0, 3, 0, 1, 5, 4, 7, 6, 9, 8};

    /* renamed from: b */
    private static final AbstractC0185W f683b;

    /* renamed from: c */
    private static final AbstractC0185W f684c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: android.support.v4.app.M$a */
    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a */
        public ComponentCallbacksC0205l f685a;

        /* renamed from: b */
        public boolean f686b;

        /* renamed from: c */
        public C0195d f687c;

        /* renamed from: d */
        public ComponentCallbacksC0205l f688d;

        /* renamed from: e */
        public boolean f689e;

        /* renamed from: f */
        public C0195d f690f;

        a() {
        }
    }

    static {
        f683b = Build.VERSION.SDK_INT >= 21 ? new C0181S() : null;
        f684c = m781a();
    }

    /* renamed from: a */
    private static a m780a(a aVar, SparseArray<a> sparseArray, int i) {
        if (aVar != null) {
            return aVar;
        }
        a aVar2 = new a();
        sparseArray.put(i, aVar2);
        return aVar2;
    }

    /* renamed from: a */
    private static AbstractC0185W m781a() {
        try {
            return (AbstractC0185W) Class.forName("android.support.transition.FragmentTransitionSupport").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: a */
    private static AbstractC0185W m782a(ComponentCallbacksC0205l componentCallbacksC0205l, ComponentCallbacksC0205l componentCallbacksC0205l2) {
        ArrayList arrayList = new ArrayList();
        if (componentCallbacksC0205l != null) {
            Object m994n = componentCallbacksC0205l.m994n();
            if (m994n != null) {
                arrayList.add(m994n);
            }
            Object m1002v = componentCallbacksC0205l.m1002v();
            if (m1002v != null) {
                arrayList.add(m1002v);
            }
            Object m1004x = componentCallbacksC0205l.m1004x();
            if (m1004x != null) {
                arrayList.add(m1004x);
            }
        }
        if (componentCallbacksC0205l2 != null) {
            Object m990l = componentCallbacksC0205l2.m990l();
            if (m990l != null) {
                arrayList.add(m990l);
            }
            Object m1000t = componentCallbacksC0205l2.m1000t();
            if (m1000t != null) {
                arrayList.add(m1000t);
            }
            Object m1003w = componentCallbacksC0205l2.m1003w();
            if (m1003w != null) {
                arrayList.add(m1003w);
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        AbstractC0185W abstractC0185W = f683b;
        if (abstractC0185W != null && m803a(abstractC0185W, arrayList)) {
            return f683b;
        }
        AbstractC0185W abstractC0185W2 = f684c;
        if (abstractC0185W2 != null && m803a(abstractC0185W2, arrayList)) {
            return f684c;
        }
        if (f683b == null && f684c == null) {
            return null;
        }
        throw new IllegalArgumentException("Invalid Transition types");
    }

    /* renamed from: a */
    private static C0256b<String, String> m783a(int i, ArrayList<C0195d> arrayList, ArrayList<Boolean> arrayList2, int i2, int i3) {
        ArrayList<String> arrayList3;
        ArrayList<String> arrayList4;
        C0256b<String, String> c0256b = new C0256b<>();
        for (int i4 = i3 - 1; i4 >= i2; i4--) {
            C0195d c0195d = arrayList.get(i4);
            if (c0195d.m870b(i)) {
                boolean booleanValue = arrayList2.get(i4).booleanValue();
                ArrayList<String> arrayList5 = c0195d.f741r;
                if (arrayList5 != null) {
                    int size = arrayList5.size();
                    if (booleanValue) {
                        arrayList3 = c0195d.f741r;
                        arrayList4 = c0195d.f742s;
                    } else {
                        ArrayList<String> arrayList6 = c0195d.f741r;
                        arrayList3 = c0195d.f742s;
                        arrayList4 = arrayList6;
                    }
                    for (int i5 = 0; i5 < size; i5++) {
                        String str = arrayList4.get(i5);
                        String str2 = arrayList3.get(i5);
                        String remove = c0256b.remove(str2);
                        if (remove != null) {
                            c0256b.put(str, remove);
                        } else {
                            c0256b.put(str, str2);
                        }
                    }
                }
            }
        }
        return c0256b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static C0256b<String, View> m784a(AbstractC0185W abstractC0185W, C0256b<String, String> c0256b, Object obj, a aVar) {
        AbstractC0192ba m992m;
        ArrayList<String> arrayList;
        String m790a;
        ComponentCallbacksC0205l componentCallbacksC0205l = aVar.f685a;
        View m908A = componentCallbacksC0205l.m908A();
        if (c0256b.isEmpty() || obj == null || m908A == null) {
            c0256b.clear();
            return null;
        }
        C0256b<String, View> c0256b2 = new C0256b<>();
        abstractC0185W.m836a((Map<String, View>) c0256b2, m908A);
        C0195d c0195d = aVar.f687c;
        if (aVar.f686b) {
            m992m = componentCallbacksC0205l.m995o();
            arrayList = c0195d.f741r;
        } else {
            m992m = componentCallbacksC0205l.m992m();
            arrayList = c0195d.f742s;
        }
        if (arrayList != null) {
            c0256b2.m1338a((Collection<?>) arrayList);
            c0256b2.m1338a((Collection<?>) c0256b.values());
        }
        if (m992m != null) {
            m992m.m853a(arrayList, c0256b2);
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                String str = arrayList.get(size);
                View view = c0256b2.get(str);
                if (view == null) {
                    String m790a2 = m790a(c0256b, str);
                    if (m790a2 != null) {
                        c0256b.remove(m790a2);
                    }
                } else if (!str.equals(C0107v.m524l(view)) && (m790a = m790a(c0256b, str)) != null) {
                    c0256b.put(m790a, C0107v.m524l(view));
                }
            }
        } else {
            m800a(c0256b, c0256b2);
        }
        return c0256b2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static View m785a(C0256b<String, View> c0256b, a aVar, Object obj, boolean z) {
        ArrayList<String> arrayList;
        C0195d c0195d = aVar.f687c;
        if (obj == null || c0256b == null || (arrayList = c0195d.f741r) == null || arrayList.isEmpty()) {
            return null;
        }
        return c0256b.get((z ? c0195d.f741r : c0195d.f742s).get(0));
    }

    /* renamed from: a */
    private static Object m786a(AbstractC0185W abstractC0185W, ComponentCallbacksC0205l componentCallbacksC0205l, ComponentCallbacksC0205l componentCallbacksC0205l2, boolean z) {
        if (componentCallbacksC0205l == null || componentCallbacksC0205l2 == null) {
            return null;
        }
        return abstractC0185W.mo824c(abstractC0185W.mo819b(z ? componentCallbacksC0205l2.m1004x() : componentCallbacksC0205l.m1003w()));
    }

    /* renamed from: a */
    private static Object m787a(AbstractC0185W abstractC0185W, ComponentCallbacksC0205l componentCallbacksC0205l, boolean z) {
        if (componentCallbacksC0205l == null) {
            return null;
        }
        return abstractC0185W.mo819b(z ? componentCallbacksC0205l.m1000t() : componentCallbacksC0205l.m990l());
    }

    /* renamed from: a */
    private static Object m788a(AbstractC0185W abstractC0185W, ViewGroup viewGroup, View view, C0256b<String, String> c0256b, a aVar, ArrayList<View> arrayList, ArrayList<View> arrayList2, Object obj, Object obj2) {
        Object m786a;
        C0256b<String, String> c0256b2;
        Object obj3;
        Rect rect;
        ComponentCallbacksC0205l componentCallbacksC0205l = aVar.f685a;
        ComponentCallbacksC0205l componentCallbacksC0205l2 = aVar.f688d;
        if (componentCallbacksC0205l == null || componentCallbacksC0205l2 == null) {
            return null;
        }
        boolean z = aVar.f686b;
        if (c0256b.isEmpty()) {
            c0256b2 = c0256b;
            m786a = null;
        } else {
            m786a = m786a(abstractC0185W, componentCallbacksC0205l, componentCallbacksC0205l2, z);
            c0256b2 = c0256b;
        }
        C0256b<String, View> m804b = m804b(abstractC0185W, c0256b2, m786a, aVar);
        if (c0256b.isEmpty()) {
            obj3 = null;
        } else {
            arrayList.addAll(m804b.values());
            obj3 = m786a;
        }
        if (obj == null && obj2 == null && obj3 == null) {
            return null;
        }
        m797a(componentCallbacksC0205l, componentCallbacksC0205l2, z, m804b, true);
        if (obj3 != null) {
            rect = new Rect();
            abstractC0185W.mo822b(obj3, view, arrayList);
            m794a(abstractC0185W, obj3, obj2, m804b, aVar.f689e, aVar.f690f);
            if (obj != null) {
                abstractC0185W.mo812a(obj, rect);
            }
        } else {
            rect = null;
        }
        ViewTreeObserverOnPreDrawListenerC0190aa.m844a(viewGroup, new RunnableC0173L(abstractC0185W, c0256b, obj3, aVar, arrayList2, view, componentCallbacksC0205l, componentCallbacksC0205l2, z, arrayList, obj, rect));
        return obj3;
    }

    /* renamed from: a */
    private static Object m789a(AbstractC0185W abstractC0185W, Object obj, Object obj2, Object obj3, ComponentCallbacksC0205l componentCallbacksC0205l, boolean z) {
        return (obj == null || obj2 == null || componentCallbacksC0205l == null) ? true : z ? componentCallbacksC0205l.m977f() : componentCallbacksC0205l.m974e() ? abstractC0185W.mo820b(obj2, obj, obj3) : abstractC0185W.mo810a(obj2, obj, obj3);
    }

    /* renamed from: a */
    private static String m790a(C0256b<String, String> c0256b, String str) {
        int size = c0256b.size();
        for (int i = 0; i < size; i++) {
            if (str.equals(c0256b.m1397d(i))) {
                return c0256b.m1395b(i);
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static ArrayList<View> m791a(AbstractC0185W abstractC0185W, Object obj, ComponentCallbacksC0205l componentCallbacksC0205l, ArrayList<View> arrayList, View view) {
        if (obj == null) {
            return null;
        }
        ArrayList<View> arrayList2 = new ArrayList<>();
        View m908A = componentCallbacksC0205l.m908A();
        if (m908A != null) {
            abstractC0185W.m835a(arrayList2, m908A);
        }
        if (arrayList != null) {
            arrayList2.removeAll(arrayList);
        }
        if (arrayList2.isEmpty()) {
            return arrayList2;
        }
        arrayList2.add(view);
        abstractC0185W.mo816a(obj, arrayList2);
        return arrayList2;
    }

    /* renamed from: a */
    private static void m792a(AbstractC0185W abstractC0185W, ViewGroup viewGroup, ComponentCallbacksC0205l componentCallbacksC0205l, View view, ArrayList<View> arrayList, Object obj, ArrayList<View> arrayList2, Object obj2, ArrayList<View> arrayList3) {
        ViewTreeObserverOnPreDrawListenerC0190aa.m844a(viewGroup, new RunnableC0171J(obj, abstractC0185W, view, componentCallbacksC0205l, arrayList, arrayList2, arrayList3, obj2));
    }

    /* renamed from: a */
    private static void m793a(AbstractC0185W abstractC0185W, Object obj, ComponentCallbacksC0205l componentCallbacksC0205l, ArrayList<View> arrayList) {
        if (componentCallbacksC0205l != null && obj != null && componentCallbacksC0205l.f817m && componentCallbacksC0205l.f785C && componentCallbacksC0205l.f799Q) {
            componentCallbacksC0205l.m976f(true);
            abstractC0185W.mo814a(obj, componentCallbacksC0205l.m908A(), arrayList);
            ViewTreeObserverOnPreDrawListenerC0190aa.m844a(componentCallbacksC0205l.f792J, new RunnableC0170I(arrayList));
        }
    }

    /* renamed from: a */
    private static void m794a(AbstractC0185W abstractC0185W, Object obj, Object obj2, C0256b<String, View> c0256b, boolean z, C0195d c0195d) {
        ArrayList<String> arrayList = c0195d.f741r;
        if (arrayList == null || arrayList.isEmpty()) {
            return;
        }
        View view = c0256b.get((z ? c0195d.f742s : c0195d.f741r).get(0));
        abstractC0185W.mo825c(obj, view);
        if (obj2 != null) {
            abstractC0185W.mo825c(obj2, view);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x0092, code lost:            if (r10.f785C == false) goto L70;     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0041, code lost:            if (r10.f817m != false) goto L70;     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0094, code lost:            r1 = true;     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x0076, code lost:            r1 = true;     */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00b0 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00d5 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00e7 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:56:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void m795a(android.support.v4.app.C0195d r16, android.support.v4.app.C0195d.a r17, android.util.SparseArray<android.support.v4.app.C0176M.a> r18, boolean r19, boolean r20) {
        /*
            Method dump skipped, instructions count: 242
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v4.app.C0176M.m795a(android.support.v4.app.d, android.support.v4.app.d$a, android.util.SparseArray, boolean, boolean):void");
    }

    /* renamed from: a */
    public static void m796a(C0195d c0195d, SparseArray<a> sparseArray, boolean z) {
        int size = c0195d.f725b.size();
        for (int i = 0; i < size; i++) {
            m795a(c0195d, c0195d.f725b.get(i), sparseArray, false, z);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static void m797a(ComponentCallbacksC0205l componentCallbacksC0205l, ComponentCallbacksC0205l componentCallbacksC0205l2, boolean z, C0256b<String, View> c0256b, boolean z2) {
        AbstractC0192ba m992m = z ? componentCallbacksC0205l2.m992m() : componentCallbacksC0205l.m992m();
        if (m992m != null) {
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            int size = c0256b == null ? 0 : c0256b.size();
            for (int i = 0; i < size; i++) {
                arrayList2.add(c0256b.m1395b(i));
                arrayList.add(c0256b.m1397d(i));
            }
            if (z2) {
                m992m.m854b(arrayList2, arrayList, null);
            } else {
                m992m.m852a(arrayList2, arrayList, null);
            }
        }
    }

    /* renamed from: a */
    private static void m798a(LayoutInflaterFactory2C0219z layoutInflaterFactory2C0219z, int i, a aVar, View view, C0256b<String, String> c0256b) {
        ComponentCallbacksC0205l componentCallbacksC0205l;
        ComponentCallbacksC0205l componentCallbacksC0205l2;
        AbstractC0185W m782a;
        Object obj;
        ViewGroup viewGroup = layoutInflaterFactory2C0219z.f916t.mo904a() ? (ViewGroup) layoutInflaterFactory2C0219z.f916t.mo903a(i) : null;
        if (viewGroup == null || (m782a = m782a((componentCallbacksC0205l2 = aVar.f688d), (componentCallbacksC0205l = aVar.f685a))) == null) {
            return;
        }
        boolean z = aVar.f686b;
        boolean z2 = aVar.f689e;
        Object m787a = m787a(m782a, componentCallbacksC0205l, z);
        Object m805b = m805b(m782a, componentCallbacksC0205l2, z2);
        ArrayList arrayList = new ArrayList();
        ArrayList<View> arrayList2 = new ArrayList<>();
        Object m788a = m788a(m782a, viewGroup, view, c0256b, aVar, (ArrayList<View>) arrayList, arrayList2, m787a, m805b);
        if (m787a == null && m788a == null) {
            obj = m805b;
            if (obj == null) {
                return;
            }
        } else {
            obj = m805b;
        }
        ArrayList<View> m791a = m791a(m782a, obj, componentCallbacksC0205l2, (ArrayList<View>) arrayList, view);
        Object obj2 = (m791a == null || m791a.isEmpty()) ? null : obj;
        m782a.mo813a(m787a, view);
        Object m789a = m789a(m782a, m787a, obj2, m788a, componentCallbacksC0205l, aVar.f686b);
        if (m789a != null) {
            ArrayList<View> arrayList3 = new ArrayList<>();
            m782a.mo815a(m789a, m787a, arrayList3, obj2, m791a, m788a, arrayList2);
            m792a(m782a, viewGroup, componentCallbacksC0205l, view, arrayList2, m787a, arrayList3, obj2, m791a);
            m782a.m833a((View) viewGroup, arrayList2, (Map<String, String>) c0256b);
            m782a.mo811a(viewGroup, m789a);
            m782a.m834a(viewGroup, arrayList2, (Map<String, String>) c0256b);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static void m799a(LayoutInflaterFactory2C0219z layoutInflaterFactory2C0219z, ArrayList<C0195d> arrayList, ArrayList<Boolean> arrayList2, int i, int i2, boolean z) {
        if (layoutInflaterFactory2C0219z.f914r < 1) {
            return;
        }
        SparseArray sparseArray = new SparseArray();
        for (int i3 = i; i3 < i2; i3++) {
            C0195d c0195d = arrayList.get(i3);
            if (arrayList2.get(i3).booleanValue()) {
                m807b(c0195d, (SparseArray<a>) sparseArray, z);
            } else {
                m796a(c0195d, (SparseArray<a>) sparseArray, z);
            }
        }
        if (sparseArray.size() != 0) {
            View view = new View(layoutInflaterFactory2C0219z.f915s.m1053c());
            int size = sparseArray.size();
            for (int i4 = 0; i4 < size; i4++) {
                int keyAt = sparseArray.keyAt(i4);
                C0256b<String, String> m783a = m783a(keyAt, arrayList, arrayList2, i, i2);
                a aVar = (a) sparseArray.valueAt(i4);
                if (z) {
                    m808b(layoutInflaterFactory2C0219z, keyAt, aVar, view, m783a);
                } else {
                    m798a(layoutInflaterFactory2C0219z, keyAt, aVar, view, m783a);
                }
            }
        }
    }

    /* renamed from: a */
    private static void m800a(C0256b<String, String> c0256b, C0256b<String, View> c0256b2) {
        for (int size = c0256b.size() - 1; size >= 0; size--) {
            if (!c0256b2.containsKey(c0256b.m1397d(size))) {
                c0256b.m1396c(size);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static void m801a(ArrayList<View> arrayList, int i) {
        if (arrayList == null) {
            return;
        }
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            arrayList.get(size).setVisibility(i);
        }
    }

    /* renamed from: a */
    private static void m802a(ArrayList<View> arrayList, C0256b<String, View> c0256b, Collection<String> collection) {
        for (int size = c0256b.size() - 1; size >= 0; size--) {
            View m1397d = c0256b.m1397d(size);
            if (collection.contains(C0107v.m524l(m1397d))) {
                arrayList.add(m1397d);
            }
        }
    }

    /* renamed from: a */
    private static boolean m803a(AbstractC0185W abstractC0185W, List<Object> list) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            if (!abstractC0185W.mo818a(list.get(i))) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: b */
    private static C0256b<String, View> m804b(AbstractC0185W abstractC0185W, C0256b<String, String> c0256b, Object obj, a aVar) {
        AbstractC0192ba m995o;
        ArrayList<String> arrayList;
        if (c0256b.isEmpty() || obj == null) {
            c0256b.clear();
            return null;
        }
        ComponentCallbacksC0205l componentCallbacksC0205l = aVar.f688d;
        C0256b<String, View> c0256b2 = new C0256b<>();
        abstractC0185W.m836a((Map<String, View>) c0256b2, componentCallbacksC0205l.m908A());
        C0195d c0195d = aVar.f690f;
        if (aVar.f689e) {
            m995o = componentCallbacksC0205l.m992m();
            arrayList = c0195d.f742s;
        } else {
            m995o = componentCallbacksC0205l.m995o();
            arrayList = c0195d.f741r;
        }
        c0256b2.m1338a((Collection<?>) arrayList);
        if (m995o != null) {
            m995o.m853a(arrayList, c0256b2);
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                String str = arrayList.get(size);
                View view = c0256b2.get(str);
                if (view == null) {
                    c0256b.remove(str);
                } else if (!str.equals(C0107v.m524l(view))) {
                    c0256b.put(C0107v.m524l(view), c0256b.remove(str));
                }
            }
        } else {
            c0256b.m1338a((Collection<?>) c0256b2.keySet());
        }
        return c0256b2;
    }

    /* renamed from: b */
    private static Object m805b(AbstractC0185W abstractC0185W, ComponentCallbacksC0205l componentCallbacksC0205l, boolean z) {
        if (componentCallbacksC0205l == null) {
            return null;
        }
        return abstractC0185W.mo819b(z ? componentCallbacksC0205l.m1002v() : componentCallbacksC0205l.m994n());
    }

    /* renamed from: b */
    private static Object m806b(AbstractC0185W abstractC0185W, ViewGroup viewGroup, View view, C0256b<String, String> c0256b, a aVar, ArrayList<View> arrayList, ArrayList<View> arrayList2, Object obj, Object obj2) {
        Object obj3;
        View view2;
        Rect rect;
        ComponentCallbacksC0205l componentCallbacksC0205l = aVar.f685a;
        ComponentCallbacksC0205l componentCallbacksC0205l2 = aVar.f688d;
        if (componentCallbacksC0205l != null) {
            componentCallbacksC0205l.m908A().setVisibility(0);
        }
        if (componentCallbacksC0205l == null || componentCallbacksC0205l2 == null) {
            return null;
        }
        boolean z = aVar.f686b;
        Object m786a = c0256b.isEmpty() ? null : m786a(abstractC0185W, componentCallbacksC0205l, componentCallbacksC0205l2, z);
        C0256b<String, View> m804b = m804b(abstractC0185W, c0256b, m786a, aVar);
        C0256b<String, View> m784a = m784a(abstractC0185W, c0256b, m786a, aVar);
        if (c0256b.isEmpty()) {
            if (m804b != null) {
                m804b.clear();
            }
            if (m784a != null) {
                m784a.clear();
            }
            obj3 = null;
        } else {
            m802a(arrayList, m804b, c0256b.keySet());
            m802a(arrayList2, m784a, c0256b.values());
            obj3 = m786a;
        }
        if (obj == null && obj2 == null && obj3 == null) {
            return null;
        }
        m797a(componentCallbacksC0205l, componentCallbacksC0205l2, z, m804b, true);
        if (obj3 != null) {
            arrayList2.add(view);
            abstractC0185W.mo822b(obj3, view, arrayList);
            m794a(abstractC0185W, obj3, obj2, m804b, aVar.f689e, aVar.f690f);
            Rect rect2 = new Rect();
            View m785a = m785a(m784a, aVar, obj, z);
            if (m785a != null) {
                abstractC0185W.mo812a(obj, rect2);
            }
            rect = rect2;
            view2 = m785a;
        } else {
            view2 = null;
            rect = null;
        }
        ViewTreeObserverOnPreDrawListenerC0190aa.m844a(viewGroup, new RunnableC0172K(componentCallbacksC0205l, componentCallbacksC0205l2, z, m784a, view2, abstractC0185W, rect));
        return obj3;
    }

    /* renamed from: b */
    public static void m807b(C0195d c0195d, SparseArray<a> sparseArray, boolean z) {
        if (c0195d.f724a.f916t.mo904a()) {
            for (int size = c0195d.f725b.size() - 1; size >= 0; size--) {
                m795a(c0195d, c0195d.f725b.get(size), sparseArray, true, z);
            }
        }
    }

    /* renamed from: b */
    private static void m808b(LayoutInflaterFactory2C0219z layoutInflaterFactory2C0219z, int i, a aVar, View view, C0256b<String, String> c0256b) {
        ComponentCallbacksC0205l componentCallbacksC0205l;
        ComponentCallbacksC0205l componentCallbacksC0205l2;
        AbstractC0185W m782a;
        Object obj;
        ViewGroup viewGroup = layoutInflaterFactory2C0219z.f916t.mo904a() ? (ViewGroup) layoutInflaterFactory2C0219z.f916t.mo903a(i) : null;
        if (viewGroup == null || (m782a = m782a((componentCallbacksC0205l2 = aVar.f688d), (componentCallbacksC0205l = aVar.f685a))) == null) {
            return;
        }
        boolean z = aVar.f686b;
        boolean z2 = aVar.f689e;
        ArrayList<View> arrayList = new ArrayList<>();
        ArrayList<View> arrayList2 = new ArrayList<>();
        Object m787a = m787a(m782a, componentCallbacksC0205l, z);
        Object m805b = m805b(m782a, componentCallbacksC0205l2, z2);
        Object m806b = m806b(m782a, viewGroup, view, c0256b, aVar, arrayList2, arrayList, m787a, m805b);
        if (m787a == null && m806b == null) {
            obj = m805b;
            if (obj == null) {
                return;
            }
        } else {
            obj = m805b;
        }
        ArrayList<View> m791a = m791a(m782a, obj, componentCallbacksC0205l2, arrayList2, view);
        ArrayList<View> m791a2 = m791a(m782a, m787a, componentCallbacksC0205l, arrayList, view);
        m801a(m791a2, 4);
        Object m789a = m789a(m782a, m787a, obj, m806b, componentCallbacksC0205l, z);
        if (m789a != null) {
            m793a(m782a, obj, componentCallbacksC0205l2, m791a);
            ArrayList<String> m830a = m782a.m830a(arrayList);
            m782a.mo815a(m789a, m787a, m791a2, obj, m791a, m806b, arrayList);
            m782a.mo811a(viewGroup, m789a);
            m782a.m832a(viewGroup, arrayList2, arrayList, m830a, c0256b);
            m801a(m791a2, 0);
            m782a.mo823b(m806b, arrayList2, arrayList);
        }
    }
}
