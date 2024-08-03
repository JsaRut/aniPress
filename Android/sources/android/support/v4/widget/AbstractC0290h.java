package android.support.v4.widget;

import android.content.Context;
import android.database.ContentObserver;
import android.database.Cursor;
import android.database.DataSetObserver;
import android.os.Handler;
import android.support.v4.widget.C0291i;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Filter;
import android.widget.Filterable;

/* renamed from: android.support.v4.widget.h */
/* loaded from: classes.dex */
public abstract class AbstractC0290h extends BaseAdapter implements Filterable, C0291i.a {

    /* renamed from: a */
    protected boolean f1295a;

    /* renamed from: b */
    protected boolean f1296b;

    /* renamed from: c */
    protected Cursor f1297c;

    /* renamed from: d */
    protected Context f1298d;

    /* renamed from: e */
    protected int f1299e;

    /* renamed from: f */
    protected a f1300f;

    /* renamed from: g */
    protected DataSetObserver f1301g;

    /* renamed from: h */
    protected C0291i f1302h;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: android.support.v4.widget.h$a */
    /* loaded from: classes.dex */
    public class a extends ContentObserver {
        a() {
            super(new Handler());
        }

        @Override // android.database.ContentObserver
        public boolean deliverSelfNotifications() {
            return true;
        }

        @Override // android.database.ContentObserver
        public void onChange(boolean z) {
            AbstractC0290h.this.m1626b();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: android.support.v4.widget.h$b */
    /* loaded from: classes.dex */
    public class b extends DataSetObserver {
        b() {
        }

        @Override // android.database.DataSetObserver
        public void onChanged() {
            AbstractC0290h abstractC0290h = AbstractC0290h.this;
            abstractC0290h.f1295a = true;
            abstractC0290h.notifyDataSetChanged();
        }

        @Override // android.database.DataSetObserver
        public void onInvalidated() {
            AbstractC0290h abstractC0290h = AbstractC0290h.this;
            abstractC0290h.f1295a = false;
            abstractC0290h.notifyDataSetInvalidated();
        }
    }

    public AbstractC0290h(Context context, Cursor cursor, boolean z) {
        m1621a(context, cursor, z ? 1 : 2);
    }

    @Override // android.support.v4.widget.C0291i.a
    /* renamed from: a */
    public Cursor mo1619a() {
        return this.f1297c;
    }

    /* renamed from: a */
    public abstract View mo1620a(Context context, Cursor cursor, ViewGroup viewGroup);

    /* renamed from: a */
    void m1621a(Context context, Cursor cursor, int i) {
        b bVar;
        if ((i & 1) == 1) {
            i |= 2;
            this.f1296b = true;
        } else {
            this.f1296b = false;
        }
        boolean z = cursor != null;
        this.f1297c = cursor;
        this.f1295a = z;
        this.f1298d = context;
        this.f1299e = z ? cursor.getColumnIndexOrThrow("_id") : -1;
        if ((i & 2) == 2) {
            this.f1300f = new a();
            bVar = new b();
        } else {
            bVar = null;
            this.f1300f = null;
        }
        this.f1301g = bVar;
        if (z) {
            a aVar = this.f1300f;
            if (aVar != null) {
                cursor.registerContentObserver(aVar);
            }
            DataSetObserver dataSetObserver = this.f1301g;
            if (dataSetObserver != null) {
                cursor.registerDataSetObserver(dataSetObserver);
            }
        }
    }

    @Override // android.support.v4.widget.C0291i.a
    /* renamed from: a */
    public void mo1622a(Cursor cursor) {
        Cursor m1624b = m1624b(cursor);
        if (m1624b != null) {
            m1624b.close();
        }
    }

    /* renamed from: a */
    public abstract void mo1623a(View view, Context context, Cursor cursor);

    /* renamed from: b */
    public Cursor m1624b(Cursor cursor) {
        Cursor cursor2 = this.f1297c;
        if (cursor == cursor2) {
            return null;
        }
        if (cursor2 != null) {
            a aVar = this.f1300f;
            if (aVar != null) {
                cursor2.unregisterContentObserver(aVar);
            }
            DataSetObserver dataSetObserver = this.f1301g;
            if (dataSetObserver != null) {
                cursor2.unregisterDataSetObserver(dataSetObserver);
            }
        }
        this.f1297c = cursor;
        if (cursor != null) {
            a aVar2 = this.f1300f;
            if (aVar2 != null) {
                cursor.registerContentObserver(aVar2);
            }
            DataSetObserver dataSetObserver2 = this.f1301g;
            if (dataSetObserver2 != null) {
                cursor.registerDataSetObserver(dataSetObserver2);
            }
            this.f1299e = cursor.getColumnIndexOrThrow("_id");
            this.f1295a = true;
            notifyDataSetChanged();
        } else {
            this.f1299e = -1;
            this.f1295a = false;
            notifyDataSetInvalidated();
        }
        return cursor2;
    }

    /* renamed from: b */
    public abstract View mo1625b(Context context, Cursor cursor, ViewGroup viewGroup);

    /* renamed from: b */
    protected void m1626b() {
        Cursor cursor;
        if (!this.f1296b || (cursor = this.f1297c) == null || cursor.isClosed()) {
            return;
        }
        this.f1295a = this.f1297c.requery();
    }

    @Override // android.support.v4.widget.C0291i.a
    public abstract CharSequence convertToString(Cursor cursor);

    @Override // android.widget.Adapter
    public int getCount() {
        Cursor cursor;
        if (!this.f1295a || (cursor = this.f1297c) == null) {
            return 0;
        }
        return cursor.getCount();
    }

    @Override // android.widget.BaseAdapter, android.widget.SpinnerAdapter
    public View getDropDownView(int i, View view, ViewGroup viewGroup) {
        if (!this.f1295a) {
            return null;
        }
        this.f1297c.moveToPosition(i);
        if (view == null) {
            view = mo1620a(this.f1298d, this.f1297c, viewGroup);
        }
        mo1623a(view, this.f1298d, this.f1297c);
        return view;
    }

    @Override // android.widget.Filterable
    public Filter getFilter() {
        if (this.f1302h == null) {
            this.f1302h = new C0291i(this);
        }
        return this.f1302h;
    }

    @Override // android.widget.Adapter
    public Object getItem(int i) {
        Cursor cursor;
        if (!this.f1295a || (cursor = this.f1297c) == null) {
            return null;
        }
        cursor.moveToPosition(i);
        return this.f1297c;
    }

    @Override // android.widget.Adapter
    public long getItemId(int i) {
        Cursor cursor;
        if (this.f1295a && (cursor = this.f1297c) != null && cursor.moveToPosition(i)) {
            return this.f1297c.getLong(this.f1299e);
        }
        return 0L;
    }

    @Override // android.widget.Adapter
    public View getView(int i, View view, ViewGroup viewGroup) {
        if (!this.f1295a) {
            throw new IllegalStateException("this should only be called when the cursor is valid");
        }
        if (this.f1297c.moveToPosition(i)) {
            if (view == null) {
                view = mo1625b(this.f1298d, this.f1297c, viewGroup);
            }
            mo1623a(view, this.f1298d, this.f1297c);
            return view;
        }
        throw new IllegalStateException("couldn't move cursor to position " + i);
    }
}
