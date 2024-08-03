package android.support.v4.widget;

import android.content.Context;
import android.database.Cursor;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/* renamed from: android.support.v4.widget.t */
/* loaded from: classes.dex */
public abstract class AbstractC0302t extends AbstractC0290h {

    /* renamed from: i */
    private int f1369i;

    /* renamed from: j */
    private int f1370j;

    /* renamed from: k */
    private LayoutInflater f1371k;

    @Deprecated
    public AbstractC0302t(Context context, int i, Cursor cursor, boolean z) {
        super(context, cursor, z);
        this.f1370j = i;
        this.f1369i = i;
        this.f1371k = (LayoutInflater) context.getSystemService("layout_inflater");
    }

    @Override // android.support.v4.widget.AbstractC0290h
    /* renamed from: a */
    public View mo1620a(Context context, Cursor cursor, ViewGroup viewGroup) {
        return this.f1371k.inflate(this.f1370j, viewGroup, false);
    }

    @Override // android.support.v4.widget.AbstractC0290h
    /* renamed from: b */
    public View mo1625b(Context context, Cursor cursor, ViewGroup viewGroup) {
        return this.f1371k.inflate(this.f1369i, viewGroup, false);
    }
}
