package com.facebook.react.modules.location;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;

/* renamed from: com.facebook.react.modules.location.d */
/* loaded from: classes.dex */
public class C1200d {

    /* renamed from: a */
    public static int f4600a = 1;

    /* renamed from: b */
    public static int f4601b = 2;

    /* renamed from: c */
    public static int f4602c = 3;

    /* renamed from: a */
    public static WritableMap m5380a(int i, String str) {
        WritableMap createMap = Arguments.createMap();
        createMap.putInt("code", i);
        if (str != null) {
            createMap.putString("message", str);
        }
        createMap.putInt("PERMISSION_DENIED", f4600a);
        createMap.putInt("POSITION_UNAVAILABLE", f4601b);
        createMap.putInt("TIMEOUT", f4602c);
        return createMap;
    }
}
