package com.facebook.react.uimanager;

import com.facebook.react.common.C1104f;
import com.facebook.react.uimanager.UIManagerModule;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: com.facebook.react.uimanager.oa */
/* loaded from: classes.dex */
public final class C1362oa {

    /* renamed from: a */
    private final Map<String, ViewManager> f5035a;

    /* renamed from: b */
    private final UIManagerModule.InterfaceC1287c f5036b;

    public C1362oa(UIManagerModule.InterfaceC1287c interfaceC1287c) {
        this.f5035a = C1104f.m5182b();
        this.f5036b = interfaceC1287c;
    }

    public C1362oa(List<ViewManager> list) {
        HashMap m5182b = C1104f.m5182b();
        for (ViewManager viewManager : list) {
            m5182b.put(viewManager.getName(), viewManager);
        }
        this.f5035a = m5182b;
        this.f5036b = null;
    }

    /* renamed from: a */
    public ViewManager m5891a(String str) {
        ViewManager mo5669a;
        ViewManager viewManager = this.f5035a.get(str);
        if (viewManager != null) {
            return viewManager;
        }
        UIManagerModule.InterfaceC1287c interfaceC1287c = this.f5036b;
        if (interfaceC1287c != null && (mo5669a = interfaceC1287c.mo5669a(str)) != null) {
            this.f5035a.put(str, mo5669a);
            return mo5669a;
        }
        throw new C1353k("No ViewManager defined for class " + str);
    }
}
