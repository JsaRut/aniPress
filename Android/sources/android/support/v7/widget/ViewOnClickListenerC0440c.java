package android.support.v7.widget;

import android.view.View;
import p000a.p005b.p022d.p029e.AbstractC0131b;

/* renamed from: android.support.v7.widget.c */
/* loaded from: classes.dex */
public class ViewOnClickListenerC0440c implements View.OnClickListener {

    /* renamed from: a */
    final /* synthetic */ AbstractC0131b f2334a;

    /* renamed from: b */
    final /* synthetic */ ActionBarContextView f2335b;

    public ViewOnClickListenerC0440c(ActionBarContextView actionBarContextView, AbstractC0131b abstractC0131b) {
        this.f2335b = actionBarContextView;
        this.f2334a = abstractC0131b;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        this.f2334a.mo625a();
    }
}
