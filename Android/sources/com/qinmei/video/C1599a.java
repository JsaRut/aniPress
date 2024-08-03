package com.qinmei.video;

import com.swmansion.gesturehandler.react.C1623a;
import p139d.p143b.p208m.AbstractActivityC2126q;
import p139d.p143b.p208m.C2056P;
import p139d.p143b.p208m.C2128s;

/* renamed from: com.qinmei.video.a */
/* loaded from: classes.dex */
class C1599a extends C2128s {

    /* renamed from: g */
    final /* synthetic */ MainActivity f6015g;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1599a(MainActivity mainActivity, AbstractActivityC2126q abstractActivityC2126q, String str) {
        super(abstractActivityC2126q, str);
        this.f6015g = mainActivity;
    }

    @Override // p139d.p143b.p208m.C2128s
    /* renamed from: a */
    protected C2056P mo6713a() {
        return new C1623a(this.f6015g);
    }
}
