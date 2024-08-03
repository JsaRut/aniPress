package android.support.v7.view.menu;

import android.content.DialogInterface;
import android.os.IBinder;
import android.support.v7.app.DialogInterfaceC0333l;
import android.support.v7.view.menu.InterfaceC0376v;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import p000a.p005b.p022d.p023a.C0118g;

/* renamed from: android.support.v7.view.menu.m */
/* loaded from: classes.dex */
class DialogInterfaceOnKeyListenerC0367m implements DialogInterface.OnKeyListener, DialogInterface.OnClickListener, DialogInterface.OnDismissListener, InterfaceC0376v.a {

    /* renamed from: a */
    private C0366l f1839a;

    /* renamed from: b */
    private DialogInterfaceC0333l f1840b;

    /* renamed from: c */
    C0364j f1841c;

    /* renamed from: d */
    private InterfaceC0376v.a f1842d;

    public DialogInterfaceOnKeyListenerC0367m(C0366l c0366l) {
        this.f1839a = c0366l;
    }

    /* renamed from: a */
    public void m2046a() {
        DialogInterfaceC0333l dialogInterfaceC0333l = this.f1840b;
        if (dialogInterfaceC0333l != null) {
            dialogInterfaceC0333l.dismiss();
        }
    }

    /* renamed from: a */
    public void m2047a(IBinder iBinder) {
        C0366l c0366l = this.f1839a;
        DialogInterfaceC0333l.a aVar = new DialogInterfaceC0333l.a(c0366l.m2034e());
        this.f1841c = new C0364j(aVar.m1819b(), C0118g.abc_list_menu_item_layout);
        this.f1841c.mo1932a(this);
        this.f1839a.m2016a(this.f1841c);
        aVar.m1814a(this.f1841c.m1994b(), this);
        View m2039i = c0366l.m2039i();
        if (m2039i != null) {
            aVar.m1813a(m2039i);
        } else {
            aVar.m1812a(c0366l.m2037g());
            aVar.m1820b(c0366l.m2038h());
        }
        aVar.m1811a(this);
        this.f1840b = aVar.m1818a();
        this.f1840b.setOnDismissListener(this);
        WindowManager.LayoutParams attributes = this.f1840b.getWindow().getAttributes();
        attributes.type = 1003;
        if (iBinder != null) {
            attributes.token = iBinder;
        }
        attributes.flags |= 131072;
        this.f1840b.show();
    }

    @Override // android.support.v7.view.menu.InterfaceC0376v.a
    /* renamed from: a */
    public void mo1906a(C0366l c0366l, boolean z) {
        if (z || c0366l == this.f1839a) {
            m2046a();
        }
        InterfaceC0376v.a aVar = this.f1842d;
        if (aVar != null) {
            aVar.mo1906a(c0366l, z);
        }
    }

    @Override // android.support.v7.view.menu.InterfaceC0376v.a
    /* renamed from: a */
    public boolean mo1907a(C0366l c0366l) {
        InterfaceC0376v.a aVar = this.f1842d;
        if (aVar != null) {
            return aVar.mo1907a(c0366l);
        }
        return false;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(DialogInterface dialogInterface, int i) {
        this.f1839a.m2021a((C0370p) this.f1841c.m1994b().getItem(i), 0);
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public void onDismiss(DialogInterface dialogInterface) {
        this.f1841c.mo1931a(this.f1839a, true);
    }

    @Override // android.content.DialogInterface.OnKeyListener
    public boolean onKey(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
        Window window;
        View decorView;
        KeyEvent.DispatcherState keyDispatcherState;
        View decorView2;
        KeyEvent.DispatcherState keyDispatcherState2;
        if (i == 82 || i == 4) {
            if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                Window window2 = this.f1840b.getWindow();
                if (window2 != null && (decorView2 = window2.getDecorView()) != null && (keyDispatcherState2 = decorView2.getKeyDispatcherState()) != null) {
                    keyDispatcherState2.startTracking(keyEvent, this);
                    return true;
                }
            } else if (keyEvent.getAction() == 1 && !keyEvent.isCanceled() && (window = this.f1840b.getWindow()) != null && (decorView = window.getDecorView()) != null && (keyDispatcherState = decorView.getKeyDispatcherState()) != null && keyDispatcherState.isTracking(keyEvent)) {
                this.f1839a.m2020a(true);
                dialogInterface.dismiss();
                return true;
            }
        }
        return this.f1839a.performShortcut(i, keyEvent, 0);
    }
}
