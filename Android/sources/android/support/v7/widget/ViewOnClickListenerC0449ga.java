package android.support.v7.widget;

import android.view.View;

/* renamed from: android.support.v7.widget.ga */
/* loaded from: classes.dex */
class ViewOnClickListenerC0449ga implements View.OnClickListener {

    /* renamed from: a */
    final /* synthetic */ SearchView f2372a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public ViewOnClickListenerC0449ga(SearchView searchView) {
        this.f2372a = searchView;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        SearchView searchView = this.f2372a;
        if (view == searchView.f2172u) {
            searchView.m2339e();
            return;
        }
        if (view == searchView.f2174w) {
            searchView.m2337d();
            return;
        }
        if (view == searchView.f2173v) {
            searchView.m2340f();
        } else if (view == searchView.f2175x) {
            searchView.m2342h();
        } else if (view == searchView.f2167q) {
            searchView.m2334b();
        }
    }
}
