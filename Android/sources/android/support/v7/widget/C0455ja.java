package android.support.v7.widget;

import android.view.View;
import android.widget.AdapterView;

/* renamed from: android.support.v7.widget.ja */
/* loaded from: classes.dex */
public class C0455ja implements AdapterView.OnItemClickListener {

    /* renamed from: a */
    final /* synthetic */ SearchView f2386a;

    public C0455ja(SearchView searchView) {
        this.f2386a = searchView;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
        this.f2386a.m2332a(i, 0, (String) null);
    }
}
