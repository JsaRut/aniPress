package com.facebook.react.views.toolbar;

import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import com.facebook.react.uimanager.events.C1333f;
import com.facebook.react.views.toolbar.p133a.C1501a;

/* renamed from: com.facebook.react.views.toolbar.h */
/* loaded from: classes.dex */
public class C1508h implements Toolbar.InterfaceC0427c {

    /* renamed from: a */
    final /* synthetic */ C1333f f5560a;

    /* renamed from: b */
    final /* synthetic */ C1506f f5561b;

    /* renamed from: c */
    final /* synthetic */ ReactToolbarManager f5562c;

    public C1508h(ReactToolbarManager reactToolbarManager, C1333f c1333f, C1506f c1506f) {
        this.f5562c = reactToolbarManager;
        this.f5560a = c1333f;
        this.f5561b = c1506f;
    }

    @Override // android.support.v7.widget.Toolbar.InterfaceC0427c
    public boolean onMenuItemClick(MenuItem menuItem) {
        this.f5560a.m5753a(new C1501a(this.f5561b.getId(), menuItem.getOrder()));
        return true;
    }
}
