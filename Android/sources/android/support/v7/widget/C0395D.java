package android.support.v7.widget;

import android.support.v7.widget.C0392C;
import android.view.View;
import android.widget.AdapterView;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: android.support.v7.widget.D */
/* loaded from: classes.dex */
public class C0395D implements AdapterView.OnItemClickListener {

    /* renamed from: a */
    final /* synthetic */ C0392C f2022a;

    /* renamed from: b */
    final /* synthetic */ C0392C.b f2023b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0395D(C0392C.b bVar, C0392C c0392c) {
        this.f2023b = bVar;
        this.f2022a = c0392c;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
        C0392C.this.setSelection(i);
        if (C0392C.this.getOnItemClickListener() != null) {
            C0392C.b bVar = this.f2023b;
            C0392C.this.performItemClick(view, i, bVar.f1994L.getItemId(i));
        }
        this.f2023b.dismiss();
    }
}
