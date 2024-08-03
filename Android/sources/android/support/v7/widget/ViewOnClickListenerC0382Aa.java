package android.support.v7.widget;

import android.R;
import android.support.v7.view.menu.C0355a;
import android.view.View;
import android.view.Window;

/* renamed from: android.support.v7.widget.Aa */
/* loaded from: classes.dex */
public class ViewOnClickListenerC0382Aa implements View.OnClickListener {

    /* renamed from: a */
    final C0355a f1903a;

    /* renamed from: b */
    final /* synthetic */ C0393Ca f1904b;

    public ViewOnClickListenerC0382Aa(C0393Ca c0393Ca) {
        this.f1904b = c0393Ca;
        this.f1903a = new C0355a(this.f1904b.f1997a.getContext(), 0, R.id.home, 0, 0, this.f1904b.f2005i);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        C0393Ca c0393Ca = this.f1904b;
        Window.Callback callback = c0393Ca.f2008l;
        if (callback == null || !c0393Ca.f2009m) {
            return;
        }
        callback.onMenuItemSelected(0, this.f1903a);
    }
}
