package android.support.v7.app;

import android.R;
import android.content.Context;
import android.database.Cursor;
import android.support.v7.app.AlertController;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckedTextView;
import android.widget.CursorAdapter;

/* renamed from: android.support.v7.app.i */
/* loaded from: classes.dex */
public class C0330i extends CursorAdapter {

    /* renamed from: a */
    private final int f1561a;

    /* renamed from: b */
    private final int f1562b;

    /* renamed from: c */
    final /* synthetic */ AlertController.RecycleListView f1563c;

    /* renamed from: d */
    final /* synthetic */ AlertController f1564d;

    /* renamed from: e */
    final /* synthetic */ AlertController.C0310a f1565e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0330i(AlertController.C0310a c0310a, Context context, Cursor cursor, boolean z, AlertController.RecycleListView recycleListView, AlertController alertController) {
        super(context, cursor, z);
        this.f1565e = c0310a;
        this.f1563c = recycleListView;
        this.f1564d = alertController;
        Cursor cursor2 = getCursor();
        this.f1561a = cursor2.getColumnIndexOrThrow(this.f1565e.f1439L);
        this.f1562b = cursor2.getColumnIndexOrThrow(this.f1565e.f1440M);
    }

    @Override // android.widget.CursorAdapter
    public void bindView(View view, Context context, Cursor cursor) {
        ((CheckedTextView) view.findViewById(R.id.text1)).setText(cursor.getString(this.f1561a));
        this.f1563c.setItemChecked(cursor.getPosition(), cursor.getInt(this.f1562b) == 1);
    }

    @Override // android.widget.CursorAdapter
    public View newView(Context context, Cursor cursor, ViewGroup viewGroup) {
        return this.f1565e.f1445b.inflate(this.f1564d.f1393M, viewGroup, false);
    }
}
