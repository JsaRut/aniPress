package com.facebook.react.common;

import android.support.v4.util.InterfaceC0266l;

/* renamed from: com.facebook.react.common.a */
/* loaded from: classes.dex */
public class C1098a<T> implements InterfaceC0266l<T> {

    /* renamed from: a */
    private final Object[] f4364a;

    /* renamed from: b */
    private int f4365b = 0;

    public C1098a(int i) {
        this.f4364a = new Object[i];
    }

    /* renamed from: a */
    public synchronized T m5162a() {
        if (this.f4365b == 0) {
            return null;
        }
        this.f4365b--;
        int i = this.f4365b;
        T t = (T) this.f4364a[i];
        this.f4364a[i] = null;
        return t;
    }

    /* renamed from: a */
    public synchronized boolean m5163a(T t) {
        if (this.f4365b == this.f4364a.length) {
            return false;
        }
        this.f4364a[this.f4365b] = t;
        this.f4365b++;
        return true;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* renamed from: b */
    public synchronized void m5164b() {
        for (int i = 0; i < this.f4365b; i++) {
            this.f4364a[i] = null;
        }
        this.f4365b = 0;
    }
}
