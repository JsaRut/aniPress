package com.facebook.react.modules.storage;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;

/* renamed from: com.facebook.react.modules.storage.b */
/* loaded from: classes.dex */
public class C1245b {
    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static WritableMap m5450a(String str) {
        return m5451a(str, "Database Error");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static WritableMap m5451a(String str, String str2) {
        WritableMap createMap = Arguments.createMap();
        createMap.putString("message", str2);
        if (str != null) {
            createMap.putString("key", str);
        }
        return createMap;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public static WritableMap m5452b(String str) {
        return m5451a(str, "Invalid key");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public static WritableMap m5453c(String str) {
        return m5451a(str, "Invalid Value");
    }
}
