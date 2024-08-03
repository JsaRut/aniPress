package android.support.v7.widget;

import android.view.KeyEvent;
import android.view.View;

/* renamed from: android.support.v7.widget.ha */
/* loaded from: classes.dex */
public class ViewOnKeyListenerC0451ha implements View.OnKeyListener {

    /* renamed from: a */
    final /* synthetic */ SearchView f2375a;

    public ViewOnKeyListenerC0451ha(SearchView searchView) {
        this.f2375a = searchView;
    }

    @Override // android.view.View.OnKeyListener
    public boolean onKey(View view, int i, KeyEvent keyEvent) {
        SearchView searchView = this.f2375a;
        if (searchView.f2157ga == null) {
            return false;
        }
        if (searchView.f2167q.isPopupShowing() && this.f2375a.f2167q.getListSelection() != -1) {
            return this.f2375a.m2333a(view, i, keyEvent);
        }
        if (this.f2375a.f2167q.m2344a() || !keyEvent.hasNoModifiers() || keyEvent.getAction() != 1 || i != 66) {
            return false;
        }
        view.cancelLongPress();
        SearchView searchView2 = this.f2375a;
        searchView2.m2329a(0, (String) null, searchView2.f2167q.getText().toString());
        return true;
    }
}
