package com.facebook.react.uimanager;

import android.view.View;
import android.view.ViewGroup;
import com.facebook.react.uimanager.p129c.InterfaceC1309i;

/* renamed from: com.facebook.react.uimanager.q */
/* loaded from: classes.dex */
public class C1365q implements InterfaceC1309i {

    /* renamed from: a */
    final /* synthetic */ ViewGroupManager f5037a;

    /* renamed from: b */
    final /* synthetic */ ViewGroup f5038b;

    /* renamed from: c */
    final /* synthetic */ View f5039c;

    /* renamed from: d */
    final /* synthetic */ C1369s f5040d;

    public C1365q(C1369s c1369s, ViewGroupManager viewGroupManager, ViewGroup viewGroup, View view) {
        this.f5040d = c1369s;
        this.f5037a = viewGroupManager;
        this.f5038b = viewGroup;
        this.f5039c = view;
    }

    @Override // com.facebook.react.uimanager.p129c.InterfaceC1309i
    /* renamed from: a */
    public void mo5694a() {
        this.f5037a.removeView(this.f5038b, this.f5039c);
        this.f5040d.m5926a(this.f5039c);
    }
}
