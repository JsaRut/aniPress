package com.facebook.soloader;

import android.annotation.TargetApi;
import android.os.Trace;

/* JADX INFO: Access modifiers changed from: package-private */
@InterfaceC1536d
@TargetApi(18)
/* loaded from: classes.dex */
public class Api18TraceUtils {
    Api18TraceUtils() {
    }

    /* renamed from: a */
    public static void m6380a() {
        Trace.endSection();
    }

    /* renamed from: a */
    public static void m6381a(String str) {
        Trace.beginSection(str);
    }
}
