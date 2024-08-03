package p031c.p032a.p072p.p073a.p088g;

import android.graphics.Rect;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;
import p031c.p032a.p072p.p073a.p075b.p076a.C0709a;
import p031c.p032a.p072p.p073a.p080f.C0758g;
import p031c.p032a.p072p.p073a.p080f.C0770h;
import p031c.p032a.p072p.p073a.p080f.p081a.C0732b;
import p031c.p032a.p072p.p073a.p080f.p087g.C0769k;
import p031c.p032a.p072p.p073a.p089h.C0804o;

/* renamed from: c.a.p.a.g.f */
/* loaded from: classes.dex */
public final class C0778f {

    /* renamed from: a */
    private final Map<String, Map<String, C0774b>> f3428a = new HashMap();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static C0778f m3864a(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            JSONArray jSONArray = new JSONObject(str).getJSONArray("track_list");
            C0778f c0778f = new C0778f();
            for (int i = 0; i < jSONArray.length(); i++) {
                c0778f.m3865a(new C0774b((JSONObject) jSONArray.get(i)));
            }
            return c0778f;
        } catch (Throwable th) {
            C0732b.m3723f("FilterList", "parseFromJSONStr e:" + th);
            return null;
        }
    }

    /* renamed from: a */
    private void m3865a(C0774b c0774b) {
        if (TextUtils.isEmpty(c0774b.f3418a) || TextUtils.isEmpty(c0774b.f3422e)) {
            C0732b.m3725h("FilterList", "illegal argument viewPath=" + c0774b.f3418a + " eventId=" + c0774b.f3418a);
            return;
        }
        Map<String, C0774b> map = this.f3428a.get(c0774b.f3418a);
        if (map == null) {
            map = new HashMap<>();
            this.f3428a.put(c0774b.f3418a, map);
        }
        map.put(c0774b.f3422e, c0774b);
    }

    /* renamed from: a */
    public final List<C0774b> m3866a(String str, String str2, String str3, boolean z) {
        Map<String, C0774b> map = this.f3428a.get(str);
        if (map == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (C0774b c0774b : map.values()) {
            if (c0774b.m3851a(str2, str3, z)) {
                arrayList.add(c0774b);
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    public final void m3867a(View view, String str, String str2) {
        if (C0789q.m3898b()) {
            C0788p m3789a = C0758g.m3789a(view);
            String str3 = str + "/" + m3789a.f3454a;
            if (m3789a.f3458e) {
                if (!TextUtils.isEmpty(str2)) {
                    str2 = str2 + ",";
                }
                str2 = str2 + m3789a.f3455b;
            }
            String m3842b = C0770h.m3842b(view);
            boolean isEmpty = TextUtils.isEmpty(str2);
            List<C0774b> m3866a = m3866a(str3, str2, m3842b, isEmpty);
            if (m3866a != null && !m3866a.isEmpty()) {
                C0732b.m3718b("FilterList", "xxx_bindListener path=" + str3 + " pos=" + str2);
                if (view.getTag(-16769021) == null) {
                    ViewTreeObserverOnScrollChangedListenerC0787o viewTreeObserverOnScrollChangedListenerC0787o = new ViewTreeObserverOnScrollChangedListenerC0787o(view, m3866a);
                    view.getViewTreeObserver().addOnScrollChangedListener(viewTreeObserverOnScrollChangedListenerC0787o);
                    view.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserverOnGlobalLayoutListenerC0786n(view, viewTreeObserverOnScrollChangedListenerC0787o));
                    C0732b.m3718b("FilterList", "xxx_bindListener bindViewBrowse done, path:" + C0758g.m3795b(view));
                    view.setTag(-16769021, true);
                }
            }
            if (!isEmpty) {
                m3866a = m3866a(str3, str2, m3842b, true);
            }
            if (m3866a != null && !m3866a.isEmpty()) {
                if (view.getGlobalVisibleRect(new Rect())) {
                    C0709a.m3634b(view);
                } else {
                    C0709a.m3631a(view);
                }
                C0804o.m3921d();
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                for (int i = 0; i < viewGroup.getChildCount(); i++) {
                    m3867a(viewGroup.getChildAt(i), str3, str2);
                }
                if (C0770h.m3840a((Object) viewGroup) || C0769k.m3828b(viewGroup)) {
                    viewGroup.setOnHierarchyChangeListener(new ViewGroupOnHierarchyChangeListenerC0779g());
                }
            }
        }
    }

    /* renamed from: a */
    public final void m3868a(List<C0774b> list) {
        Iterator<C0774b> it = list.iterator();
        while (it.hasNext()) {
            m3865a(it.next());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public final boolean m3869a() {
        return this.f3428a.isEmpty();
    }

    /* renamed from: b */
    public final JSONObject m3870b() {
        JSONObject jSONObject = new JSONObject();
        try {
            JSONArray jSONArray = new JSONArray();
            for (Map<String, C0774b> map : this.f3428a.values()) {
                if (map != null) {
                    Iterator<C0774b> it = map.values().iterator();
                    while (it.hasNext()) {
                        jSONArray.put(it.next().mo3850a(null));
                    }
                }
            }
            jSONObject.put("track_list", jSONArray);
        } catch (Throwable th) {
            C0732b.m3725h("FilterList", "json error:" + th.getMessage());
        }
        return jSONObject;
    }
}
