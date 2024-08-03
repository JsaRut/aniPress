package android.support.v4.util;

import java.util.Map;

/* renamed from: android.support.v4.util.a */
/* loaded from: classes.dex */
public class C0255a<K, V> extends AbstractC0264j<K, V> {

    /* renamed from: d */
    final /* synthetic */ C0256b f1061d;

    public C0255a(C0256b c0256b) {
        this.f1061d = c0256b;
    }

    @Override // android.support.v4.util.AbstractC0264j
    /* renamed from: a */
    protected int mo1328a(Object obj) {
        return this.f1061d.m1390a(obj);
    }

    @Override // android.support.v4.util.AbstractC0264j
    /* renamed from: a */
    protected Object mo1329a(int i, int i2) {
        return this.f1061d.f1113f[(i << 1) + i2];
    }

    @Override // android.support.v4.util.AbstractC0264j
    /* renamed from: a */
    protected V mo1330a(int i, V v) {
        return this.f1061d.m1392a(i, (int) v);
    }

    @Override // android.support.v4.util.AbstractC0264j
    /* renamed from: a */
    protected void mo1331a() {
        this.f1061d.clear();
    }

    @Override // android.support.v4.util.AbstractC0264j
    /* renamed from: a */
    protected void mo1332a(int i) {
        this.f1061d.m1396c(i);
    }

    @Override // android.support.v4.util.AbstractC0264j
    /* renamed from: a */
    protected void mo1333a(K k, V v) {
        this.f1061d.put(k, v);
    }

    @Override // android.support.v4.util.AbstractC0264j
    /* renamed from: b */
    protected int mo1334b(Object obj) {
        return this.f1061d.m1394b(obj);
    }

    @Override // android.support.v4.util.AbstractC0264j
    /* renamed from: b */
    protected Map<K, V> mo1335b() {
        return this.f1061d;
    }

    @Override // android.support.v4.util.AbstractC0264j
    /* renamed from: c */
    protected int mo1336c() {
        return this.f1061d.f1114g;
    }
}
