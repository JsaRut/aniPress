package android.support.v7.view.menu;

import android.os.SystemClock;
import android.support.v7.widget.InterfaceC0430V;
import android.view.MenuItem;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: android.support.v7.view.menu.h */
/* loaded from: classes.dex */
public class C0362h implements InterfaceC0430V {

    /* renamed from: a */
    final /* synthetic */ ViewOnKeyListenerC0363i f1764a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0362h(ViewOnKeyListenerC0363i viewOnKeyListenerC0363i) {
        this.f1764a = viewOnKeyListenerC0363i;
    }

    @Override // android.support.v7.widget.InterfaceC0430V
    /* renamed from: a */
    public void mo1982a(C0366l c0366l, MenuItem menuItem) {
        this.f1764a.f1773h.removeCallbacksAndMessages(null);
        int size = this.f1764a.f1775j.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                i = -1;
                break;
            } else if (c0366l == this.f1764a.f1775j.get(i).f1793b) {
                break;
            } else {
                i++;
            }
        }
        if (i == -1) {
            return;
        }
        int i2 = i + 1;
        this.f1764a.f1773h.postAtTime(new RunnableC0361g(this, i2 < this.f1764a.f1775j.size() ? this.f1764a.f1775j.get(i2) : null, menuItem, c0366l), c0366l, SystemClock.uptimeMillis() + 200);
    }

    @Override // android.support.v7.widget.InterfaceC0430V
    /* renamed from: b */
    public void mo1983b(C0366l c0366l, MenuItem menuItem) {
        this.f1764a.f1773h.removeCallbacksAndMessages(c0366l);
    }
}
