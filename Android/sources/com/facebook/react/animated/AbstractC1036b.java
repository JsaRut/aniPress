package com.facebook.react.animated;

import java.util.ArrayList;
import java.util.List;
import p139d.p143b.p204k.p205a.C2038a;

/* renamed from: com.facebook.react.animated.b */
/* loaded from: classes.dex */
abstract class AbstractC1036b {

    /* renamed from: a */
    List<AbstractC1036b> f4279a;

    /* renamed from: b */
    int f4280b = 0;

    /* renamed from: c */
    int f4281c = 0;

    /* renamed from: d */
    int f4282d = -1;

    /* renamed from: a */
    public void mo5142a() {
    }

    /* renamed from: a */
    public final void m5149a(AbstractC1036b abstractC1036b) {
        if (this.f4279a == null) {
            this.f4279a = new ArrayList(1);
        }
        List<AbstractC1036b> list = this.f4279a;
        C2038a.m8318a(list);
        list.add(abstractC1036b);
        abstractC1036b.mo5150b(this);
    }

    /* renamed from: b */
    public void mo5150b(AbstractC1036b abstractC1036b) {
    }

    /* renamed from: c */
    public void mo5151c(AbstractC1036b abstractC1036b) {
    }

    /* renamed from: d */
    public final void m5152d(AbstractC1036b abstractC1036b) {
        if (this.f4279a == null) {
            return;
        }
        abstractC1036b.mo5151c(this);
        this.f4279a.remove(abstractC1036b);
    }
}
