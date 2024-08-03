package android.support.v7.app;

import android.content.Context;
import android.support.v7.app.AlertController;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;

/* renamed from: android.support.v7.app.h */
/* loaded from: classes.dex */
public class C0329h extends ArrayAdapter<CharSequence> {

    /* renamed from: a */
    final /* synthetic */ AlertController.RecycleListView f1559a;

    /* renamed from: b */
    final /* synthetic */ AlertController.C0310a f1560b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0329h(AlertController.C0310a c0310a, Context context, int i, int i2, CharSequence[] charSequenceArr, AlertController.RecycleListView recycleListView) {
        super(context, i, i2, charSequenceArr);
        this.f1560b = c0310a;
        this.f1559a = recycleListView;
    }

    @Override // android.widget.ArrayAdapter, android.widget.Adapter
    public View getView(int i, View view, ViewGroup viewGroup) {
        View view2 = super.getView(i, view, viewGroup);
        boolean[] zArr = this.f1560b.f1433F;
        if (zArr != null && zArr[i]) {
            this.f1559a.setItemChecked(i, true);
        }
        return view2;
    }
}
