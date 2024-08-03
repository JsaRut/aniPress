package android.support.v4.app;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import p000a.p005b.p009c.p019h.C0107v;
import p000a.p005b.p009c.p019h.C0109x;

/* renamed from: android.support.v4.app.W */
/* loaded from: classes.dex */
public abstract class AbstractC0185W {
    /* renamed from: a */
    public static String m826a(Map<String, String> map, String str) {
        for (Map.Entry<String, String> entry : map.entrySet()) {
            if (str.equals(entry.getValue())) {
                return entry.getKey();
            }
        }
        return null;
    }

    /* renamed from: a */
    public static void m827a(List<View> list, View view) {
        int size = list.size();
        if (m829a(list, view, size)) {
            return;
        }
        list.add(view);
        for (int i = size; i < list.size(); i++) {
            View view2 = list.get(i);
            if (view2 instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view2;
                int childCount = viewGroup.getChildCount();
                for (int i2 = 0; i2 < childCount; i2++) {
                    View childAt = viewGroup.getChildAt(i2);
                    if (!m829a(list, childAt, size)) {
                        list.add(childAt);
                    }
                }
            }
        }
    }

    /* renamed from: a */
    public static boolean m828a(List list) {
        return list == null || list.isEmpty();
    }

    /* renamed from: a */
    private static boolean m829a(List<View> list, View view, int i) {
        for (int i2 = 0; i2 < i; i2++) {
            if (list.get(i2) == view) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    public abstract Object mo810a(Object obj, Object obj2, Object obj3);

    /* renamed from: a */
    public ArrayList<String> m830a(ArrayList<View> arrayList) {
        ArrayList<String> arrayList2 = new ArrayList<>();
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            View view = arrayList.get(i);
            arrayList2.add(C0107v.m524l(view));
            C0107v.m503a(view, (String) null);
        }
        return arrayList2;
    }

    /* renamed from: a */
    public void m831a(View view, Rect rect) {
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        rect.set(iArr[0], iArr[1], iArr[0] + view.getWidth(), iArr[1] + view.getHeight());
    }

    /* renamed from: a */
    public void m832a(View view, ArrayList<View> arrayList, ArrayList<View> arrayList2, ArrayList<String> arrayList3, Map<String, String> map) {
        int size = arrayList2.size();
        ArrayList arrayList4 = new ArrayList();
        for (int i = 0; i < size; i++) {
            View view2 = arrayList.get(i);
            String m524l = C0107v.m524l(view2);
            arrayList4.add(m524l);
            if (m524l != null) {
                C0107v.m503a(view2, (String) null);
                String str = map.get(m524l);
                int i2 = 0;
                while (true) {
                    if (i2 >= size) {
                        break;
                    }
                    if (str.equals(arrayList3.get(i2))) {
                        C0107v.m503a(arrayList2.get(i2), m524l);
                        break;
                    }
                    i2++;
                }
            }
        }
        ViewTreeObserverOnPreDrawListenerC0190aa.m844a(view, new RunnableC0182T(this, size, arrayList2, arrayList3, arrayList, arrayList4));
    }

    /* renamed from: a */
    public void m833a(View view, ArrayList<View> arrayList, Map<String, String> map) {
        ViewTreeObserverOnPreDrawListenerC0190aa.m844a(view, new RunnableC0183U(this, arrayList, map));
    }

    /* renamed from: a */
    public abstract void mo811a(ViewGroup viewGroup, Object obj);

    /* renamed from: a */
    public void m834a(ViewGroup viewGroup, ArrayList<View> arrayList, Map<String, String> map) {
        ViewTreeObserverOnPreDrawListenerC0190aa.m844a(viewGroup, new RunnableC0184V(this, arrayList, map));
    }

    /* renamed from: a */
    public abstract void mo812a(Object obj, Rect rect);

    /* renamed from: a */
    public abstract void mo813a(Object obj, View view);

    /* renamed from: a */
    public abstract void mo814a(Object obj, View view, ArrayList<View> arrayList);

    /* renamed from: a */
    public abstract void mo815a(Object obj, Object obj2, ArrayList<View> arrayList, Object obj3, ArrayList<View> arrayList2, Object obj4, ArrayList<View> arrayList3);

    /* renamed from: a */
    public abstract void mo816a(Object obj, ArrayList<View> arrayList);

    /* renamed from: a */
    public abstract void mo817a(Object obj, ArrayList<View> arrayList, ArrayList<View> arrayList2);

    /* renamed from: a */
    public void m835a(ArrayList<View> arrayList, View view) {
        if (view.getVisibility() == 0) {
            boolean z = view instanceof ViewGroup;
            View view2 = view;
            if (z) {
                ViewGroup viewGroup = (ViewGroup) view;
                boolean m545a = C0109x.m545a(viewGroup);
                view2 = viewGroup;
                if (!m545a) {
                    int childCount = viewGroup.getChildCount();
                    for (int i = 0; i < childCount; i++) {
                        m835a(arrayList, viewGroup.getChildAt(i));
                    }
                    return;
                }
            }
            arrayList.add(view2);
        }
    }

    /* renamed from: a */
    public void m836a(Map<String, View> map, View view) {
        if (view.getVisibility() == 0) {
            String m524l = C0107v.m524l(view);
            if (m524l != null) {
                map.put(m524l, view);
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                int childCount = viewGroup.getChildCount();
                for (int i = 0; i < childCount; i++) {
                    m836a(map, viewGroup.getChildAt(i));
                }
            }
        }
    }

    /* renamed from: a */
    public abstract boolean mo818a(Object obj);

    /* renamed from: b */
    public abstract Object mo819b(Object obj);

    /* renamed from: b */
    public abstract Object mo820b(Object obj, Object obj2, Object obj3);

    /* renamed from: b */
    public abstract void mo821b(Object obj, View view);

    /* renamed from: b */
    public abstract void mo822b(Object obj, View view, ArrayList<View> arrayList);

    /* renamed from: b */
    public abstract void mo823b(Object obj, ArrayList<View> arrayList, ArrayList<View> arrayList2);

    /* renamed from: c */
    public abstract Object mo824c(Object obj);

    /* renamed from: c */
    public abstract void mo825c(Object obj, View view);
}
