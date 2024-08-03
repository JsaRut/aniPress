package android.support.v7.view.menu;

import android.support.v7.view.menu.ViewOnKeyListenerC0363i;
import android.view.MenuItem;

/* renamed from: android.support.v7.view.menu.g */
/* loaded from: classes.dex */
class RunnableC0361g implements Runnable {

    /* renamed from: a */
    final /* synthetic */ ViewOnKeyListenerC0363i.a f1760a;

    /* renamed from: b */
    final /* synthetic */ MenuItem f1761b;

    /* renamed from: c */
    final /* synthetic */ C0366l f1762c;

    /* renamed from: d */
    final /* synthetic */ C0362h f1763d;

    public RunnableC0361g(C0362h c0362h, ViewOnKeyListenerC0363i.a aVar, MenuItem menuItem, C0366l c0366l) {
        this.f1763d = c0362h;
        this.f1760a = aVar;
        this.f1761b = menuItem;
        this.f1762c = c0366l;
    }

    @Override // java.lang.Runnable
    public void run() {
        ViewOnKeyListenerC0363i.a aVar = this.f1760a;
        if (aVar != null) {
            this.f1763d.f1764a.f1767B = true;
            aVar.f1793b.m2020a(false);
            this.f1763d.f1764a.f1767B = false;
        }
        if (this.f1761b.isEnabled() && this.f1761b.hasSubMenu()) {
            this.f1762c.m2021a(this.f1761b, 4);
        }
    }
}
