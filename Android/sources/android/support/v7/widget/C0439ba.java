package android.support.v7.widget;

import android.text.Editable;
import android.text.TextWatcher;

/* renamed from: android.support.v7.widget.ba */
/* loaded from: classes.dex */
public class C0439ba implements TextWatcher {

    /* renamed from: a */
    final /* synthetic */ SearchView f2333a;

    public C0439ba(SearchView searchView) {
        this.f2333a = searchView;
    }

    @Override // android.text.TextWatcher
    public void afterTextChanged(Editable editable) {
    }

    @Override // android.text.TextWatcher
    public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override // android.text.TextWatcher
    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        this.f2333a.m2335b(charSequence);
    }
}
