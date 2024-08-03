package android.support.v7.app;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import p000a.p005b.p009c.p019h.C0092g;
import p000a.p005b.p022d.p023a.C0112a;
import p000a.p005b.p022d.p029e.AbstractC0131b;

/* renamed from: android.support.v7.app.B */
/* loaded from: classes.dex */
public class DialogC0314B extends Dialog implements InterfaceC0335n {

    /* renamed from: a */
    private AbstractC0336o f1480a;

    /* renamed from: b */
    private final C0092g.a f1481b;

    public DialogC0314B(Context context, int i) {
        super(context, m1745a(context, i));
        this.f1481b = new C0309A(this);
        m1747a().mo1836a((Bundle) null);
        m1747a().mo1840a();
    }

    /* renamed from: a */
    private static int m1745a(Context context, int i) {
        if (i != 0) {
            return i;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(C0112a.dialogTheme, typedValue, true);
        return typedValue.resourceId;
    }

    @Override // android.support.v7.app.InterfaceC0335n
    /* renamed from: a */
    public AbstractC0131b mo1746a(AbstractC0131b.a aVar) {
        return null;
    }

    /* renamed from: a */
    public AbstractC0336o m1747a() {
        if (this.f1480a == null) {
            this.f1480a = AbstractC0336o.m1832a(this, this);
        }
        return this.f1480a;
    }

    @Override // android.support.v7.app.InterfaceC0335n
    /* renamed from: a */
    public void mo1748a(AbstractC0131b abstractC0131b) {
    }

    /* renamed from: a */
    public boolean m1749a(int i) {
        return m1747a().mo1843b(i);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public boolean m1750a(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.app.Dialog
    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        m1747a().mo1838a(view, layoutParams);
    }

    @Override // android.support.v7.app.InterfaceC0335n
    /* renamed from: b */
    public void mo1751b(AbstractC0131b abstractC0131b) {
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return C0092g.m431a(this.f1481b, getWindow().getDecorView(), this, keyEvent);
    }

    @Override // android.app.Dialog
    public <T extends View> T findViewById(int i) {
        return (T) m1747a().mo1834a(i);
    }

    @Override // android.app.Dialog
    public void invalidateOptionsMenu() {
        m1747a().mo1849f();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.app.Dialog
    public void onCreate(Bundle bundle) {
        m1747a().mo1848e();
        super.onCreate(bundle);
        m1747a().mo1836a(bundle);
    }

    @Override // android.app.Dialog
    protected void onStop() {
        super.onStop();
        m1747a().mo1853j();
    }

    @Override // android.app.Dialog
    public void setContentView(int i) {
        m1747a().mo1845c(i);
    }

    @Override // android.app.Dialog
    public void setContentView(View view) {
        m1747a().mo1837a(view);
    }

    @Override // android.app.Dialog
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        m1747a().mo1842b(view, layoutParams);
    }

    @Override // android.app.Dialog
    public void setTitle(int i) {
        super.setTitle(i);
        m1747a().mo1839a(getContext().getString(i));
    }

    @Override // android.app.Dialog
    public void setTitle(CharSequence charSequence) {
        super.setTitle(charSequence);
        m1747a().mo1839a(charSequence);
    }
}
