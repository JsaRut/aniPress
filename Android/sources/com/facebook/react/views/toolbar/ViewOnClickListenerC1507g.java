package com.facebook.react.views.toolbar;

import android.view.View;
import com.facebook.react.uimanager.events.C1333f;
import com.facebook.react.views.toolbar.p133a.C1501a;

/* renamed from: com.facebook.react.views.toolbar.g */
/* loaded from: classes.dex */
public class ViewOnClickListenerC1507g implements View.OnClickListener {

    /* renamed from: a */
    final /* synthetic */ C1333f f5557a;

    /* renamed from: b */
    final /* synthetic */ C1506f f5558b;

    /* renamed from: c */
    final /* synthetic */ ReactToolbarManager f5559c;

    public ViewOnClickListenerC1507g(ReactToolbarManager reactToolbarManager, C1333f c1333f, C1506f c1506f) {
        this.f5559c = reactToolbarManager;
        this.f5557a = c1333f;
        this.f5558b = c1506f;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        this.f5557a.m5753a(new C1501a(this.f5558b.getId(), -1));
    }
}
