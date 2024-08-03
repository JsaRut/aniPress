package com.facebook.react.fabric.mounting.mountitems;

import com.facebook.react.fabric.p125a.C1124b;
import com.facebook.systrace.C1550a;
import p139d.p143b.p206l.p207a.InterfaceC2039a;

@InterfaceC2039a
/* loaded from: classes.dex */
public class BatchMountItem implements InterfaceC1133e {

    /* renamed from: a */
    private final InterfaceC1133e[] f4410a;

    /* renamed from: b */
    private final int f4411b;

    public BatchMountItem(InterfaceC1133e[] interfaceC1133eArr, int i) {
        if (interfaceC1133eArr == null) {
            throw new NullPointerException();
        }
        if (i >= 0 && i <= interfaceC1133eArr.length) {
            this.f4410a = interfaceC1133eArr;
            this.f4411b = i;
            return;
        }
        throw new IllegalArgumentException("Invalid size received by parameter size: " + i + " items.size = " + interfaceC1133eArr.length);
    }

    @Override // com.facebook.react.fabric.mounting.mountitems.InterfaceC1133e
    /* renamed from: a */
    public void mo5243a(C1124b c1124b) {
        C1550a.m6454a(0L, "FabricUIManager::mountViews (" + this.f4411b + " items)");
        for (int i = 0; i < this.f4411b; i++) {
            this.f4410a[i].mo5243a(c1124b);
        }
        C1550a.m6453a(0L);
    }
}
