package android.support.v7.widget;

import android.view.View;

/* renamed from: android.support.v7.widget.ea */
/* loaded from: classes.dex */
public class ViewOnFocusChangeListenerC0445ea implements View.OnFocusChangeListener {

    /* renamed from: a */
    final /* synthetic */ SearchView f2340a;

    public ViewOnFocusChangeListenerC0445ea(SearchView searchView) {
        this.f2340a = searchView;
    }

    @Override // android.view.View.OnFocusChangeListener
    public void onFocusChange(View view, boolean z) {
        SearchView searchView = this.f2340a;
        View.OnFocusChangeListener onFocusChangeListener = searchView.f2141N;
        if (onFocusChangeListener != null) {
            onFocusChangeListener.onFocusChange(searchView, z);
        }
    }
}
