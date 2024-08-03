package android.support.v7.view.menu;

import android.content.Context;
import android.support.v7.view.menu.MenuItemC0371q;
import android.view.ActionProvider;
import android.view.MenuItem;
import android.view.View;
import p000a.p005b.p009c.p013c.p014a.InterfaceMenuItemC0047b;
import p000a.p005b.p009c.p019h.AbstractC0090e;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: android.support.v7.view.menu.r */
/* loaded from: classes.dex */
public class C0372r extends MenuItemC0371q {

    /* renamed from: android.support.v7.view.menu.r$a */
    /* loaded from: classes.dex */
    class a extends MenuItemC0371q.a implements ActionProvider.VisibilityListener {

        /* renamed from: f */
        AbstractC0090e.b f1881f;

        public a(Context context, ActionProvider actionProvider) {
            super(context, actionProvider);
        }

        @Override // p000a.p005b.p009c.p019h.AbstractC0090e
        /* renamed from: a */
        public View mo419a(MenuItem menuItem) {
            return this.f1876d.onCreateActionView(menuItem);
        }

        @Override // p000a.p005b.p009c.p019h.AbstractC0090e
        /* renamed from: a */
        public void mo421a(AbstractC0090e.b bVar) {
            this.f1881f = bVar;
            this.f1876d.setVisibilityListener(bVar != null ? this : null);
        }

        @Override // p000a.p005b.p009c.p019h.AbstractC0090e
        /* renamed from: b */
        public boolean mo424b() {
            return this.f1876d.isVisible();
        }

        @Override // p000a.p005b.p009c.p019h.AbstractC0090e
        /* renamed from: e */
        public boolean mo427e() {
            return this.f1876d.overridesItemVisibility();
        }

        @Override // android.view.ActionProvider.VisibilityListener
        public void onActionProviderVisibilityChanged(boolean z) {
            AbstractC0090e.b bVar = this.f1881f;
            if (bVar != null) {
                bVar.onActionProviderVisibilityChanged(z);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0372r(Context context, InterfaceMenuItemC0047b interfaceMenuItemC0047b) {
        super(context, interfaceMenuItemC0047b);
    }

    @Override // android.support.v7.view.menu.MenuItemC0371q
    /* renamed from: a */
    MenuItemC0371q.a mo2071a(ActionProvider actionProvider) {
        return new a(this.f1754b, actionProvider);
    }
}
