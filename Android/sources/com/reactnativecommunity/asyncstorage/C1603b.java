package com.reactnativecommunity.asyncstorage;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;

/* renamed from: com.reactnativecommunity.asyncstorage.b */
/* loaded from: classes.dex */
public class C1603b {
    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static WritableMap m6724a(String str) {
        return m6725a(str, "Database Error");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static WritableMap m6725a(String str, String str2) {
        WritableMap createMap = Arguments.createMap();
        createMap.putString("message", str2);
        if (str != null) {
            createMap.putString("key", str);
        }
        return createMap;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public static WritableMap m6726b(String str) {
        return m6725a(str, "Invalid key");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public static WritableMap m6727c(String str) {
        return m6725a(str, "Invalid Value");
    }
}
