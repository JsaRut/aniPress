package com.facebook.react.uimanager.p130d;

import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import p139d.p143b.p208m.C2122m;

/* renamed from: com.facebook.react.uimanager.d.a */
/* loaded from: classes.dex */
public class C1324a {

    /* renamed from: a */
    private static final List<b> f4861a = new ArrayList();

    /* renamed from: b */
    private static final Map<a, Set<String>> f4862b = new HashMap();

    /* renamed from: com.facebook.react.uimanager.d.a$a */
    /* loaded from: classes.dex */
    public interface a {
        /* renamed from: a */
        void m5706a(View view, String str);
    }

    /* renamed from: com.facebook.react.uimanager.d.a$b */
    /* loaded from: classes.dex */
    public interface b {
        /* renamed from: a */
        String m5707a();

        /* renamed from: a */
        void m5708a(View view);
    }

    /* renamed from: a */
    public static void m5704a(View view) {
        String m5705b = m5705b(view);
        if (m5705b == null) {
            return;
        }
        Iterator<b> it = f4861a.iterator();
        while (it.hasNext()) {
            b next = it.next();
            if (m5705b != null && m5705b.equals(next.m5707a())) {
                next.m5708a(view);
                it.remove();
            }
        }
        for (Map.Entry<a, Set<String>> entry : f4862b.entrySet()) {
            Set<String> value = entry.getValue();
            if (value != null && value.contains(m5705b)) {
                entry.getKey().m5706a(view, m5705b);
            }
        }
    }

    /* renamed from: b */
    private static String m5705b(View view) {
        Object tag = view.getTag(C2122m.view_tag_native_id);
        if (tag instanceof String) {
            return (String) tag;
        }
        return null;
    }
}
