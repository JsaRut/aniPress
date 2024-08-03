package com.facebook.react.views.scroll;

import p000a.p005b.p009c.p019h.C0107v;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.facebook.react.views.scroll.d */
/* loaded from: classes.dex */
public class RunnableC1423d implements Runnable {

    /* renamed from: a */
    private boolean f5216a = false;

    /* renamed from: b */
    final /* synthetic */ C1424e f5217b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC1423d(C1424e c1424e) {
        this.f5217b = c1424e;
    }

    @Override // java.lang.Runnable
    public void run() {
        boolean z;
        boolean z2;
        boolean z3;
        z = this.f5217b.f5224g;
        if (z) {
            this.f5217b.f5224g = false;
        } else {
            z2 = this.f5217b.f5228k;
            if (!z2 || this.f5216a) {
                z3 = this.f5217b.f5232o;
                if (z3) {
                    C1428i.m6100b(this.f5217b);
                }
                this.f5217b.f5229l = null;
                this.f5217b.m6064c();
                return;
            }
            this.f5216a = true;
            this.f5217b.m6057a(0);
        }
        C0107v.m502a(this.f5217b, this, 20L);
    }
}
