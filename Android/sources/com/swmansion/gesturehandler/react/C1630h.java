package com.swmansion.gesturehandler.react;

import android.util.SparseArray;
import android.view.View;
import java.util.ArrayList;
import p139d.p273d.p274a.C2686c;
import p139d.p273d.p274a.InterfaceC2690g;

/* renamed from: com.swmansion.gesturehandler.react.h */
/* loaded from: classes.dex */
public class C1630h implements InterfaceC2690g {

    /* renamed from: a */
    private final SparseArray<C2686c> f6061a = new SparseArray<>();

    /* renamed from: b */
    private final SparseArray<Integer> f6062b = new SparseArray<>();

    /* renamed from: c */
    private final SparseArray<ArrayList<C2686c>> f6063c = new SparseArray<>();

    /* renamed from: a */
    private synchronized void m6776a(int i, C2686c c2686c) {
        if (this.f6062b.get(c2686c.m11538l()) != null) {
            throw new IllegalStateException("Handler " + c2686c + " already attached");
        }
        this.f6062b.put(c2686c.m11538l(), Integer.valueOf(i));
        ArrayList<C2686c> arrayList = this.f6063c.get(i);
        if (arrayList == null) {
            ArrayList<C2686c> arrayList2 = new ArrayList<>(1);
            arrayList2.add(c2686c);
            this.f6063c.put(i, arrayList2);
        } else {
            arrayList.add(c2686c);
        }
    }

    /* renamed from: b */
    private synchronized void m6777b(C2686c c2686c) {
        Integer num = this.f6062b.get(c2686c.m11538l());
        if (num != null) {
            this.f6062b.remove(c2686c.m11538l());
            ArrayList<C2686c> arrayList = this.f6063c.get(num.intValue());
            if (arrayList != null) {
                arrayList.remove(c2686c);
                if (arrayList.size() == 0) {
                    this.f6063c.remove(num.intValue());
                }
            }
        }
        if (c2686c.m11539m() != null) {
            c2686c.m11525c();
        }
    }

    @Override // p139d.p273d.p274a.InterfaceC2690g
    /* renamed from: a */
    public synchronized ArrayList<C2686c> mo6778a(View view) {
        return m6784c(view.getId());
    }

    /* renamed from: a */
    public synchronized void m6779a() {
        this.f6061a.clear();
        this.f6062b.clear();
        this.f6063c.clear();
    }

    /* renamed from: a */
    public synchronized void m6780a(int i) {
        C2686c c2686c = this.f6061a.get(i);
        if (c2686c != null) {
            m6777b(c2686c);
            this.f6061a.remove(i);
        }
    }

    /* renamed from: a */
    public synchronized void m6781a(C2686c c2686c) {
        this.f6061a.put(c2686c.m11538l(), c2686c);
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* renamed from: a */
    public synchronized boolean m6782a(int i, int i2) {
        boolean z;
        C2686c c2686c = this.f6061a.get(i);
        if (c2686c != null) {
            m6777b(c2686c);
            m6776a(i2, c2686c);
            z = true;
        } else {
            z = false;
        }
        return z;
    }

    /* renamed from: b */
    public synchronized C2686c m6783b(int i) {
        return this.f6061a.get(i);
    }

    /* renamed from: c */
    public synchronized ArrayList<C2686c> m6784c(int i) {
        return this.f6063c.get(i);
    }
}
