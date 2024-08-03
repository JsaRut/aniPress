package com.facebook.react.views.scroll;

import p000a.p005b.p009c.p019h.C0107v;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.facebook.react.views.scroll.f */
/* loaded from: classes.dex */
public class RunnableC1425f implements Runnable {

    /* renamed from: a */
    private boolean f5243a = false;

    /* renamed from: b */
    final /* synthetic */ ViewGroupOnHierarchyChangeListenerC1426g f5244b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC1425f(ViewGroupOnHierarchyChangeListenerC1426g viewGroupOnHierarchyChangeListenerC1426g) {
        this.f5244b = viewGroupOnHierarchyChangeListenerC1426g;
    }

    @Override // java.lang.Runnable
    public void run() {
        boolean z;
        boolean z2;
        boolean z3;
        z = this.f5244b.f5251g;
        if (z) {
            this.f5244b.f5251g = false;
        } else {
            z2 = this.f5244b.f5255k;
            if (!z2 || this.f5243a) {
                z3 = this.f5244b.f5259o;
                if (z3) {
                    C1428i.m6100b(this.f5244b);
                }
                this.f5244b.f5256l = null;
                this.f5244b.m6082c();
                return;
            }
            this.f5243a = true;
            this.f5244b.m6075a(0);
        }
        C0107v.m502a(this.f5244b, this, 20L);
    }
}
