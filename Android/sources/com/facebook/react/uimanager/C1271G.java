package com.facebook.react.uimanager;

import com.facebook.react.bridge.Dynamic;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;

/* renamed from: com.facebook.react.uimanager.G */
/* loaded from: classes.dex */
public class C1271G {

    /* renamed from: a */
    final ReadableMap f4754a;

    public C1271G(ReadableMap readableMap) {
        this.f4754a = readableMap;
    }

    /* renamed from: a */
    public double m5570a(String str, double d2) {
        return this.f4754a.isNull(str) ? d2 : this.f4754a.getDouble(str);
    }

    /* renamed from: a */
    public float m5571a(String str, float f) {
        return this.f4754a.isNull(str) ? f : (float) this.f4754a.getDouble(str);
    }

    /* renamed from: a */
    public int m5572a(String str, int i) {
        return this.f4754a.isNull(str) ? i : this.f4754a.getInt(str);
    }

    /* renamed from: a */
    public ReadableArray m5573a(String str) {
        return this.f4754a.getArray(str);
    }

    /* renamed from: a */
    public boolean m5574a(String str, boolean z) {
        return this.f4754a.isNull(str) ? z : this.f4754a.getBoolean(str);
    }

    /* renamed from: b */
    public Dynamic m5575b(String str) {
        return this.f4754a.getDynamic(str);
    }

    /* renamed from: c */
    public ReadableMap m5576c(String str) {
        return this.f4754a.getMap(str);
    }

    /* renamed from: d */
    public String m5577d(String str) {
        return this.f4754a.getString(str);
    }

    /* renamed from: e */
    public boolean m5578e(String str) {
        return this.f4754a.hasKey(str);
    }

    /* renamed from: f */
    public boolean m5579f(String str) {
        return this.f4754a.isNull(str);
    }

    public String toString() {
        return "{ " + C1271G.class.getSimpleName() + ": " + this.f4754a.toString() + " }";
    }
}
