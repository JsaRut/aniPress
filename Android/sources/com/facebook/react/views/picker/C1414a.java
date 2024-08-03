package com.facebook.react.views.picker;

import android.view.View;
import android.widget.AdapterView;
import com.facebook.react.views.picker.C1417c;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.facebook.react.views.picker.a */
/* loaded from: classes.dex */
public class C1414a implements AdapterView.OnItemSelectedListener {

    /* renamed from: a */
    final /* synthetic */ C1417c f5191a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C1414a(C1417c c1417c) {
        this.f5191a = c1417c;
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long j) {
        C1417c.a aVar;
        C1417c.a aVar2;
        aVar = this.f5191a.f5196l;
        if (aVar != null) {
            aVar2 = this.f5191a.f5196l;
            aVar2.mo6036a(i);
        }
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public void onNothingSelected(AdapterView<?> adapterView) {
        C1417c.a aVar;
        C1417c.a aVar2;
        aVar = this.f5191a.f5196l;
        if (aVar != null) {
            aVar2 = this.f5191a.f5196l;
            aVar2.mo6036a(-1);
        }
    }
}
