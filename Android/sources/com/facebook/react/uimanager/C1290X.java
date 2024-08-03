package com.facebook.react.uimanager;

import com.facebook.react.uimanager.UIManagerModule;
import java.util.Map;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.facebook.react.uimanager.X */
/* loaded from: classes.dex */
public class C1290X implements UIManagerModule.InterfaceC1285a {

    /* renamed from: a */
    final /* synthetic */ UIManagerModule f4784a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C1290X(UIManagerModule uIManagerModule) {
        this.f4784a = uIManagerModule;
    }

    @Override // com.facebook.react.uimanager.UIManagerModule.InterfaceC1285a
    /* renamed from: a */
    public String mo5668a(String str) {
        Map map;
        map = this.f4784a.mCustomDirectEvents;
        Map map2 = (Map) map.get(str);
        return map2 != null ? (String) map2.get("registrationName") : str;
    }
}
