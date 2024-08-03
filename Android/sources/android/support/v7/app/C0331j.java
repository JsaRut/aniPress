package android.support.v7.app;

import android.support.v7.app.AlertController;
import android.view.View;
import android.widget.AdapterView;

/* renamed from: android.support.v7.app.j */
/* loaded from: classes.dex */
public class C0331j implements AdapterView.OnItemClickListener {

    /* renamed from: a */
    final /* synthetic */ AlertController f1566a;

    /* renamed from: b */
    final /* synthetic */ AlertController.C0310a f1567b;

    public C0331j(AlertController.C0310a c0310a, AlertController alertController) {
        this.f1567b = c0310a;
        this.f1566a = alertController;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
        this.f1567b.f1467x.onClick(this.f1566a.f1401b, i);
        if (this.f1567b.f1435H) {
            return;
        }
        this.f1566a.f1401b.dismiss();
    }
}
