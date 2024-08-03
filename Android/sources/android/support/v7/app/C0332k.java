package android.support.v7.app;

import android.support.v7.app.AlertController;
import android.view.View;
import android.widget.AdapterView;

/* renamed from: android.support.v7.app.k */
/* loaded from: classes.dex */
public class C0332k implements AdapterView.OnItemClickListener {

    /* renamed from: a */
    final /* synthetic */ AlertController.RecycleListView f1568a;

    /* renamed from: b */
    final /* synthetic */ AlertController f1569b;

    /* renamed from: c */
    final /* synthetic */ AlertController.C0310a f1570c;

    public C0332k(AlertController.C0310a c0310a, AlertController.RecycleListView recycleListView, AlertController alertController) {
        this.f1570c = c0310a;
        this.f1568a = recycleListView;
        this.f1569b = alertController;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
        boolean[] zArr = this.f1570c.f1433F;
        if (zArr != null) {
            zArr[i] = this.f1568a.isItemChecked(i);
        }
        this.f1570c.f1437J.onClick(this.f1569b.f1401b, i, this.f1568a.isItemChecked(i));
    }
}
