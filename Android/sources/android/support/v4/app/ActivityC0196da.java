package android.support.v4.app;

import android.app.Activity;
import android.arch.lifecycle.AbstractC0144d;
import android.arch.lifecycle.C0148h;
import android.arch.lifecycle.FragmentC0156p;
import android.arch.lifecycle.InterfaceC0146f;
import android.os.Bundle;
import android.support.v4.util.C0269o;
import android.view.KeyEvent;
import android.view.View;
import p000a.p005b.p009c.p019h.C0092g;

/* renamed from: android.support.v4.app.da */
/* loaded from: classes.dex */
public class ActivityC0196da extends Activity implements InterfaceC0146f, C0092g.a {

    /* renamed from: a */
    private C0269o<Class<? extends Object>, Object> f751a = new C0269o<>();

    /* renamed from: b */
    private C0148h f752b = new C0148h(this);

    @Override // android.arch.lifecycle.InterfaceC0146f
    /* renamed from: a */
    public AbstractC0144d mo714a() {
        return this.f752b;
    }

    @Override // p000a.p005b.p009c.p019h.C0092g.a
    /* renamed from: a */
    public boolean mo436a(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        View decorView = getWindow().getDecorView();
        if (decorView == null || !C0092g.m435a(decorView, keyEvent)) {
            return C0092g.m431a(this, decorView, this, keyEvent);
        }
        return true;
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
        View decorView = getWindow().getDecorView();
        if (decorView == null || !C0092g.m435a(decorView, keyEvent)) {
            return super.dispatchKeyShortcutEvent(keyEvent);
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        FragmentC0156p.m738a(this);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        this.f752b.m727a(AbstractC0144d.b.CREATED);
        super.onSaveInstanceState(bundle);
    }
}
