package com.facebook.react.devsupport;

import android.content.Context;
import com.facebook.react.devsupport.p124a.InterfaceC1113a;
import com.facebook.react.devsupport.p124a.InterfaceC1114b;
import java.util.Map;

/* renamed from: com.facebook.react.devsupport.a */
/* loaded from: classes.dex */
public class C1112a {
    /* renamed from: a */
    public static InterfaceC1114b m5198a(Context context, InterfaceC1119e interfaceC1119e, String str, boolean z, InterfaceC1120f interfaceC1120f, InterfaceC1113a interfaceC1113a, int i, Map<String, Object> map) {
        if (!z) {
            return new C1116b();
        }
        try {
            return (InterfaceC1114b) Class.forName("com.facebook.react.devsupport.DevSupportManagerImpl").getConstructor(Context.class, InterfaceC1119e.class, String.class, Boolean.TYPE, InterfaceC1120f.class, InterfaceC1113a.class, Integer.TYPE, Map.class).newInstance(context, interfaceC1119e, str, true, interfaceC1120f, interfaceC1113a, Integer.valueOf(i), map);
        } catch (Exception e2) {
            throw new RuntimeException("Requested enabled DevSupportManager, but DevSupportManagerImpl class was not found or could not be created", e2);
        }
    }
}
