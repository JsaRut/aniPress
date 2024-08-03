package com.facebook.react.uimanager;

import android.util.SparseArray;
import android.util.SparseBooleanArray;
import com.facebook.react.common.C1105g;

/* renamed from: com.facebook.react.uimanager.L */
/* loaded from: classes.dex */
public class C1276L {

    /* renamed from: a */
    private final SparseArray<InterfaceC1269E> f4756a = new SparseArray<>();

    /* renamed from: b */
    private final SparseBooleanArray f4757b = new SparseBooleanArray();

    /* renamed from: c */
    private final C1105g f4758c = new C1105g();

    /* renamed from: a */
    public int m5586a() {
        this.f4758c.m5190a();
        return this.f4757b.size();
    }

    /* renamed from: a */
    public InterfaceC1269E m5587a(int i) {
        this.f4758c.m5190a();
        return this.f4756a.get(i);
    }

    /* renamed from: a */
    public void m5588a(InterfaceC1269E interfaceC1269E) {
        this.f4758c.m5190a();
        this.f4756a.put(interfaceC1269E.mo5504g(), interfaceC1269E);
    }

    /* renamed from: b */
    public int m5589b(int i) {
        this.f4758c.m5190a();
        return this.f4757b.keyAt(i);
    }

    /* renamed from: b */
    public void m5590b(InterfaceC1269E interfaceC1269E) {
        this.f4758c.m5190a();
        int mo5504g = interfaceC1269E.mo5504g();
        this.f4756a.put(mo5504g, interfaceC1269E);
        this.f4757b.put(mo5504g, true);
    }

    /* renamed from: c */
    public boolean m5591c(int i) {
        this.f4758c.m5190a();
        return this.f4757b.get(i);
    }

    /* renamed from: d */
    public void m5592d(int i) {
        this.f4758c.m5190a();
        if (!this.f4757b.get(i)) {
            this.f4756a.remove(i);
            return;
        }
        throw new C1353k("Trying to remove root node " + i + " without using removeRootNode!");
    }

    /* renamed from: e */
    public void m5593e(int i) {
        this.f4758c.m5190a();
        if (i == -1) {
            return;
        }
        if (this.f4757b.get(i)) {
            this.f4756a.remove(i);
            this.f4757b.delete(i);
        } else {
            throw new C1353k("View with tag " + i + " is not registered as a root view");
        }
    }
}
