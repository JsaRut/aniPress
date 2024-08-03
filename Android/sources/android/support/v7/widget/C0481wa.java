package android.support.v7.widget;

import android.support.v7.widget.ActionMenuView;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: android.support.v7.widget.wa */
/* loaded from: classes.dex */
public class C0481wa implements ActionMenuView.InterfaceC0389e {

    /* renamed from: a */
    final /* synthetic */ Toolbar f2515a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0481wa(Toolbar toolbar) {
        this.f2515a = toolbar;
    }

    @Override // android.support.v7.widget.ActionMenuView.InterfaceC0389e
    public boolean onMenuItemClick(MenuItem menuItem) {
        Toolbar.InterfaceC0427c interfaceC0427c = this.f2515a.f2199G;
        if (interfaceC0427c != null) {
            return interfaceC0427c.onMenuItemClick(menuItem);
        }
        return false;
    }
}
