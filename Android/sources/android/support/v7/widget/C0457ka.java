package android.support.v7.widget;

import android.view.View;
import android.widget.AdapterView;

/* renamed from: android.support.v7.widget.ka */
/* loaded from: classes.dex */
public class C0457ka implements AdapterView.OnItemSelectedListener {

    /* renamed from: a */
    final /* synthetic */ SearchView f2389a;

    public C0457ka(SearchView searchView) {
        this.f2389a = searchView;
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long j) {
        this.f2389a.m2338d(i);
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public void onNothingSelected(AdapterView<?> adapterView) {
    }
}
