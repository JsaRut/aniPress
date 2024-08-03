package android.support.v7.widget;

import android.database.Cursor;
import android.support.v4.widget.AbstractC0290h;

/* renamed from: android.support.v7.widget.da */
/* loaded from: classes.dex */
public class RunnableC0443da implements Runnable {

    /* renamed from: a */
    final /* synthetic */ SearchView f2338a;

    public RunnableC0443da(SearchView searchView) {
        this.f2338a = searchView;
    }

    @Override // java.lang.Runnable
    public void run() {
        AbstractC0290h abstractC0290h = this.f2338a.f2146S;
        if (abstractC0290h == null || !(abstractC0290h instanceof ViewOnClickListenerC0463na)) {
            return;
        }
        abstractC0290h.mo1622a((Cursor) null);
    }
}
