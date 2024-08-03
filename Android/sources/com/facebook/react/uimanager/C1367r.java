package com.facebook.react.uimanager;

import com.facebook.react.bridge.Callback;
import p139d.p143b.p204k.p205a.C2038a;
import p139d.p143b.p208m.p209a.C2065d;
import p139d.p143b.p208m.p209a.InterfaceC2063b;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.facebook.react.uimanager.r */
/* loaded from: classes.dex */
public class C1367r implements InterfaceC2063b {

    /* renamed from: a */
    final /* synthetic */ int f5055a;

    /* renamed from: b */
    final /* synthetic */ Callback f5056b;

    /* renamed from: c */
    final /* synthetic */ C1369s f5057c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C1367r(C1369s c1369s, int i, Callback callback) {
        this.f5057c = c1369s;
        this.f5055a = i;
        this.f5056b = callback;
    }

    @Override // p139d.p143b.p208m.p209a.InterfaceC2063b
    public void onCancel() {
        C2065d c2065d;
        c2065d = this.f5057c.f5063b;
        C2038a.m8319a(c2065d.m8434b(this.f5055a), "Animation was already removed somehow!");
        Callback callback = this.f5056b;
        if (callback != null) {
            callback.invoke(false);
        }
    }
}
