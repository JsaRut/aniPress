package android.support.v4.util;

import java.util.Map;

/* renamed from: android.support.v4.util.c */
/* loaded from: classes.dex */
public class C0257c<E> extends AbstractC0264j<E, E> {

    /* renamed from: d */
    final /* synthetic */ C0258d f1063d;

    public C0257c(C0258d c0258d) {
        this.f1063d = c0258d;
    }

    @Override // android.support.v4.util.AbstractC0264j
    /* renamed from: a */
    protected int mo1328a(Object obj) {
        return this.f1063d.indexOf(obj);
    }

    @Override // android.support.v4.util.AbstractC0264j
    /* renamed from: a */
    protected Object mo1329a(int i, int i2) {
        return this.f1063d.f1071h[i];
    }

    @Override // android.support.v4.util.AbstractC0264j
    /* renamed from: a */
    protected E mo1330a(int i, E e2) {
        throw new UnsupportedOperationException("not a map");
    }

    @Override // android.support.v4.util.AbstractC0264j
    /* renamed from: a */
    protected void mo1331a() {
        this.f1063d.clear();
    }

    @Override // android.support.v4.util.AbstractC0264j
    /* renamed from: a */
    protected void mo1332a(int i) {
        this.f1063d.m1345b(i);
    }

    @Override // android.support.v4.util.AbstractC0264j
    /* renamed from: a */
    protected void mo1333a(E e2, E e3) {
        this.f1063d.add(e2);
    }

    @Override // android.support.v4.util.AbstractC0264j
    /* renamed from: b */
    protected int mo1334b(Object obj) {
        return this.f1063d.indexOf(obj);
    }

    @Override // android.support.v4.util.AbstractC0264j
    /* renamed from: b */
    protected Map<E, E> mo1335b() {
        throw new UnsupportedOperationException("not a map");
    }

    @Override // android.support.v4.util.AbstractC0264j
    /* renamed from: c */
    protected int mo1336c() {
        return this.f1063d.f1072i;
    }
}
