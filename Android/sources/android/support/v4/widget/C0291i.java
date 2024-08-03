package android.support.v4.widget;

import android.database.Cursor;
import android.widget.Filter;

/* renamed from: android.support.v4.widget.i */
/* loaded from: classes.dex */
class C0291i extends Filter {

    /* renamed from: a */
    a f1305a;

    /* renamed from: android.support.v4.widget.i$a */
    /* loaded from: classes.dex */
    interface a {
        /* renamed from: a */
        Cursor mo1619a();

        /* renamed from: a */
        Cursor mo1627a(CharSequence charSequence);

        /* renamed from: a */
        void mo1622a(Cursor cursor);

        CharSequence convertToString(Cursor cursor);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0291i(a aVar) {
        this.f1305a = aVar;
    }

    @Override // android.widget.Filter
    public CharSequence convertResultToString(Object obj) {
        return this.f1305a.convertToString((Cursor) obj);
    }

    @Override // android.widget.Filter
    protected Filter.FilterResults performFiltering(CharSequence charSequence) {
        Cursor mo1627a = this.f1305a.mo1627a(charSequence);
        Filter.FilterResults filterResults = new Filter.FilterResults();
        if (mo1627a != null) {
            filterResults.count = mo1627a.getCount();
        } else {
            filterResults.count = 0;
            mo1627a = null;
        }
        filterResults.values = mo1627a;
        return filterResults;
    }

    @Override // android.widget.Filter
    protected void publishResults(CharSequence charSequence, Filter.FilterResults filterResults) {
        Cursor mo1619a = this.f1305a.mo1619a();
        Object obj = filterResults.values;
        if (obj == null || obj == mo1619a) {
            return;
        }
        this.f1305a.mo1622a((Cursor) obj);
    }
}
