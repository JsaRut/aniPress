package com.facebook.react.views.swiperefresh;

import android.support.v4.widget.C0273C;
import com.facebook.react.uimanager.C1278N;
import com.facebook.react.uimanager.UIManagerModule;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.facebook.react.views.swiperefresh.c */
/* loaded from: classes.dex */
public class C1440c implements C0273C.b {

    /* renamed from: a */
    final /* synthetic */ C1278N f5313a;

    /* renamed from: b */
    final /* synthetic */ C1438a f5314b;

    /* renamed from: c */
    final /* synthetic */ SwipeRefreshLayoutManager f5315c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C1440c(SwipeRefreshLayoutManager swipeRefreshLayoutManager, C1278N c1278n, C1438a c1438a) {
        this.f5315c = swipeRefreshLayoutManager;
        this.f5313a = c1278n;
        this.f5314b = c1438a;
    }

    @Override // android.support.v4.widget.C0273C.b
    /* renamed from: a */
    public void mo1430a() {
        ((UIManagerModule) this.f5313a.getNativeModule(UIManagerModule.class)).getEventDispatcher().m5753a(new C1439b(this.f5314b.getId()));
    }
}
