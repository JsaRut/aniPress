package com.facebook.react.uimanager.events;

import com.facebook.react.common.C1107i;
import com.facebook.react.uimanager.events.AbstractC1330c;

/* renamed from: com.facebook.react.uimanager.events.c */
/* loaded from: classes.dex */
public abstract class AbstractC1330c<T extends AbstractC1330c> {

    /* renamed from: a */
    private static int f4865a;

    /* renamed from: b */
    private boolean f4866b;

    /* renamed from: c */
    private int f4867c;

    /* renamed from: d */
    private long f4868d;

    /* renamed from: e */
    private int f4869e;

    /* JADX INFO: Access modifiers changed from: protected */
    public AbstractC1330c() {
        int i = f4865a;
        f4865a = i + 1;
        this.f4869e = i;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public AbstractC1330c(int i) {
        int i2 = f4865a;
        f4865a = i2 + 1;
        this.f4869e = i2;
        m5717a(i);
    }

    /* renamed from: a */
    public T m5716a(T t) {
        return m5721e() >= t.m5721e() ? this : t;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: a */
    public void m5717a(int i) {
        this.f4867c = i;
        this.f4868d = C1107i.m5193c();
        this.f4866b = true;
    }

    /* renamed from: a */
    public abstract void mo5714a(RCTEventEmitter rCTEventEmitter);

    /* renamed from: a */
    public boolean mo5718a() {
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public final void m5719b() {
        this.f4866b = false;
        mo5725i();
    }

    /* renamed from: c */
    public short mo5720c() {
        return (short) 0;
    }

    /* renamed from: d */
    public abstract String mo5715d();

    /* renamed from: e */
    public final long m5721e() {
        return this.f4868d;
    }

    /* renamed from: f */
    public int m5722f() {
        return this.f4869e;
    }

    /* renamed from: g */
    public final int m5723g() {
        return this.f4867c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: h */
    public boolean m5724h() {
        return this.f4866b;
    }

    /* renamed from: i */
    public void mo5725i() {
    }
}
