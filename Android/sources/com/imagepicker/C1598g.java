package com.imagepicker;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.WritableMap;

/* renamed from: com.imagepicker.g */
/* loaded from: classes.dex */
public class C1598g {

    /* renamed from: a */
    private WritableMap f6011a = Arguments.createMap();

    /* renamed from: a */
    public void m6699a() {
        this.f6011a = Arguments.createMap();
    }

    /* renamed from: a */
    public void m6700a(Callback callback) {
        m6699a();
        this.f6011a.putBoolean("didCancel", true);
        m6706b(callback);
    }

    /* renamed from: a */
    public void m6701a(Callback callback, String str) {
        m6699a();
        this.f6011a.putString("customButton", str);
        m6706b(callback);
    }

    /* renamed from: a */
    public void m6702a(String str, double d2) {
        this.f6011a.putDouble(str, d2);
    }

    /* renamed from: a */
    public void m6703a(String str, int i) {
        this.f6011a.putInt(str, i);
    }

    /* renamed from: a */
    public void m6704a(String str, String str2) {
        this.f6011a.putString(str, str2);
    }

    /* renamed from: a */
    public void m6705a(String str, boolean z) {
        this.f6011a.putBoolean(str, z);
    }

    /* renamed from: b */
    public void m6706b(Callback callback) {
        callback.invoke(this.f6011a);
    }

    /* renamed from: b */
    public void m6707b(Callback callback, String str) {
        m6699a();
        this.f6011a.putString("error", str);
        m6706b(callback);
    }
}
