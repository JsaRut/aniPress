package com.facebook.react.uimanager;

import com.facebook.react.common.C1104f;
import com.facebook.react.uimanager.UIManagerModule;
import com.facebook.systrace.C1552c;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import p139d.p143b.p208m.p210b.C2067a;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.facebook.react.uimanager.da */
/* loaded from: classes.dex */
public class C1325da {
    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static Map<String, Object> m5709a() {
        return C1104f.m5177a("bubblingEventTypes", C1319ca.m5699a(), "directEventTypes", C1319ca.m5701c());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static Map<String, Object> m5710a(UIManagerModule.InterfaceC1287c interfaceC1287c) {
        Map<String, Object> m5700b = C1319ca.m5700b();
        if (!C2067a.f7511a) {
            m5700b.put("ViewManagerNames", interfaceC1287c.mo5670a());
        }
        m5700b.put("LazyViewManagersEnabled", true);
        return m5700b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static Map<String, Object> m5711a(ViewManager viewManager, Map map, Map map2, Map map3, Map map4) {
        HashMap m5182b = C1104f.m5182b();
        Map<String, Object> exportedCustomBubblingEventTypeConstants = viewManager.getExportedCustomBubblingEventTypeConstants();
        if (exportedCustomBubblingEventTypeConstants != null) {
            m5713a(map3, exportedCustomBubblingEventTypeConstants);
            m5713a(exportedCustomBubblingEventTypeConstants, map);
            m5182b.put("bubblingEventTypes", exportedCustomBubblingEventTypeConstants);
        } else if (map != null) {
            m5182b.put("bubblingEventTypes", map);
        }
        Map<String, Object> exportedCustomDirectEventTypeConstants = viewManager.getExportedCustomDirectEventTypeConstants();
        if (exportedCustomDirectEventTypeConstants != null) {
            m5713a(map4, exportedCustomDirectEventTypeConstants);
            m5713a(exportedCustomDirectEventTypeConstants, map2);
            m5182b.put("directEventTypes", exportedCustomDirectEventTypeConstants);
        } else if (map2 != null) {
            m5182b.put("directEventTypes", map2);
        }
        Map<String, Object> exportedViewConstants = viewManager.getExportedViewConstants();
        if (exportedViewConstants != null) {
            m5182b.put("Constants", exportedViewConstants);
        }
        Map<String, Integer> commandsMap = viewManager.getCommandsMap();
        if (commandsMap != null) {
            m5182b.put("Commands", commandsMap);
        }
        Map<String, String> nativeProps = viewManager.getNativeProps();
        if (!nativeProps.isEmpty()) {
            m5182b.put("NativeProps", nativeProps);
        }
        return m5182b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static Map<String, Object> m5712a(List<ViewManager> list, Map<String, Object> map, Map<String, Object> map2) {
        Map<String, Object> m5700b = C1319ca.m5700b();
        Map<? extends String, ? extends Object> m5699a = C1319ca.m5699a();
        Map<? extends String, ? extends Object> m5701c = C1319ca.m5701c();
        if (map != null) {
            map.putAll(m5699a);
        }
        if (map2 != null) {
            map2.putAll(m5701c);
        }
        for (ViewManager viewManager : list) {
            String name = viewManager.getName();
            C1552c.a m6467a = C1552c.m6467a(0L, "UIManagerModuleConstantsHelper.createConstants");
            m6467a.mo6469a("ViewManager", name);
            m6467a.mo6469a("Lazy", (Object) false);
            m6467a.mo6470a();
            try {
                Map<String, Object> m5711a = m5711a(viewManager, null, null, map, map2);
                if (!m5711a.isEmpty()) {
                    m5700b.put(name, m5711a);
                }
            } finally {
                C1552c.m6466a(0L);
            }
        }
        m5700b.put("genericBubblingEventTypes", m5699a);
        m5700b.put("genericDirectEventTypes", m5701c);
        return m5700b;
    }

    /* renamed from: a */
    private static void m5713a(Map map, Map map2) {
        if (map == null || map2 == null || map2.isEmpty()) {
            return;
        }
        for (Object obj : map2.keySet()) {
            Object obj2 = map2.get(obj);
            Object obj3 = map.get(obj);
            if (obj3 != null && (obj2 instanceof Map) && (obj3 instanceof Map)) {
                m5713a((Map) obj3, (Map) obj2);
            } else {
                map.put(obj, obj2);
            }
        }
    }
}
