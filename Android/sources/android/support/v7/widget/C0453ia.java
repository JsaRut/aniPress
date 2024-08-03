package android.support.v7.widget;

import android.view.KeyEvent;
import android.widget.TextView;

/* renamed from: android.support.v7.widget.ia */
/* loaded from: classes.dex */
public class C0453ia implements TextView.OnEditorActionListener {

    /* renamed from: a */
    final /* synthetic */ SearchView f2379a;

    public C0453ia(SearchView searchView) {
        this.f2379a = searchView;
    }

    @Override // android.widget.TextView.OnEditorActionListener
    public boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
        this.f2379a.m2340f();
        return true;
    }
}
