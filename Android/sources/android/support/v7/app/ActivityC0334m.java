package android.support.v7.app;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.support.v4.app.ActivityC0208o;
import android.support.v4.app.C0188Z;
import android.support.v4.app.C0191b;
import android.support.v4.app.C0198ea;
import android.support.v7.widget.C0406Ia;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import p000a.p005b.p022d.p029e.AbstractC0131b;

/* renamed from: android.support.v7.app.m */
/* loaded from: classes.dex */
public class ActivityC0334m extends ActivityC0208o implements InterfaceC0335n, C0198ea.a, InterfaceC0323b {

    /* renamed from: n */
    private AbstractC0336o f1574n;

    /* renamed from: o */
    private int f1575o = 0;

    /* renamed from: p */
    private Resources f1576p;

    /* renamed from: a */
    private boolean m1822a(int i, KeyEvent keyEvent) {
        Window window;
        return (Build.VERSION.SDK_INT >= 26 || keyEvent.isCtrlPressed() || KeyEvent.metaStateHasNoModifiers(keyEvent.getMetaState()) || keyEvent.getRepeatCount() != 0 || KeyEvent.isModifierKey(keyEvent.getKeyCode()) || (window = getWindow()) == null || window.getDecorView() == null || !window.getDecorView().dispatchKeyShortcutEvent(keyEvent)) ? false : true;
    }

    @Override // android.support.v7.app.InterfaceC0335n
    /* renamed from: a */
    public AbstractC0131b mo1746a(AbstractC0131b.a aVar) {
        return null;
    }

    @Override // android.support.v7.app.InterfaceC0335n
    /* renamed from: a */
    public void mo1748a(AbstractC0131b abstractC0131b) {
    }

    /* renamed from: a */
    public void m1823a(Intent intent) {
        C0188Z.m840a(this, intent);
    }

    /* renamed from: a */
    public void m1824a(C0198ea c0198ea) {
        c0198ea.m877a((Activity) this);
    }

    @Override // android.app.Activity
    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        m1827i().mo1838a(view, layoutParams);
    }

    @Override // android.support.v7.app.InterfaceC0335n
    /* renamed from: b */
    public void mo1751b(AbstractC0131b abstractC0131b) {
    }

    /* renamed from: b */
    public void m1825b(C0198ea c0198ea) {
    }

    /* renamed from: b */
    public boolean m1826b(Intent intent) {
        return C0188Z.m843b(this, intent);
    }

    @Override // android.app.Activity
    public void closeOptionsMenu() {
        AbstractC0322a m1828j = m1828j();
        if (getWindow().hasFeature(0)) {
            if (m1828j == null || !m1828j.m1801e()) {
                super.closeOptionsMenu();
            }
        }
    }

    @Override // android.support.v4.app.C0198ea.a
    /* renamed from: d */
    public Intent mo882d() {
        return C0188Z.m838a(this);
    }

    @Override // android.support.v4.app.ActivityC0196da, android.app.Activity, android.view.Window.Callback
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        int keyCode = keyEvent.getKeyCode();
        AbstractC0322a m1828j = m1828j();
        if (keyCode == 82 && m1828j != null && m1828j.m1800a(keyEvent)) {
            return true;
        }
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.app.Activity
    public <T extends View> T findViewById(int i) {
        return (T) m1827i().mo1834a(i);
    }

    @Override // android.app.Activity
    public MenuInflater getMenuInflater() {
        return m1827i().mo1844c();
    }

    @Override // android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public Resources getResources() {
        if (this.f1576p == null && C0406Ia.m2230b()) {
            this.f1576p = new C0406Ia(this, super.getResources());
        }
        Resources resources = this.f1576p;
        return resources == null ? super.getResources() : resources;
    }

    @Override // android.support.v4.app.ActivityC0208o
    /* renamed from: h */
    public void mo1018h() {
        m1827i().mo1849f();
    }

    /* renamed from: i */
    public AbstractC0336o m1827i() {
        if (this.f1574n == null) {
            this.f1574n = AbstractC0336o.m1831a(this, this);
        }
        return this.f1574n;
    }

    @Override // android.app.Activity
    public void invalidateOptionsMenu() {
        m1827i().mo1849f();
    }

    /* renamed from: j */
    public AbstractC0322a m1828j() {
        return m1827i().mo1847d();
    }

    @Deprecated
    /* renamed from: k */
    public void m1829k() {
    }

    /* renamed from: l */
    public boolean m1830l() {
        Intent mo882d = mo882d();
        if (mo882d == null) {
            return false;
        }
        if (!m1826b(mo882d)) {
            m1823a(mo882d);
            return true;
        }
        C0198ea m876a = C0198ea.m876a((Context) this);
        m1824a(m876a);
        m1825b(m876a);
        m876a.m880a();
        try {
            C0191b.m847a((Activity) this);
            return true;
        } catch (IllegalStateException unused) {
            finish();
            return true;
        }
    }

    @Override // android.support.v4.app.ActivityC0208o, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        m1827i().mo1835a(configuration);
        if (this.f1576p != null) {
            this.f1576p.updateConfiguration(configuration, super.getResources().getDisplayMetrics());
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onContentChanged() {
        m1829k();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.support.v4.app.ActivityC0208o, android.support.v4.app.ActivityC0196da, android.app.Activity
    public void onCreate(Bundle bundle) {
        int i;
        AbstractC0336o m1827i = m1827i();
        m1827i.mo1848e();
        m1827i.mo1836a(bundle);
        if (m1827i.mo1840a() && (i = this.f1575o) != 0) {
            if (Build.VERSION.SDK_INT >= 23) {
                onApplyThemeResource(getTheme(), this.f1575o, false);
            } else {
                setTheme(i);
            }
        }
        super.onCreate(bundle);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.support.v4.app.ActivityC0208o, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        m1827i().mo1850g();
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (m1822a(i, keyEvent)) {
            return true;
        }
        return super.onKeyDown(i, keyEvent);
    }

    @Override // android.support.v4.app.ActivityC0208o, android.app.Activity, android.view.Window.Callback
    public final boolean onMenuItemSelected(int i, MenuItem menuItem) {
        if (super.onMenuItemSelected(i, menuItem)) {
            return true;
        }
        AbstractC0322a m1828j = m1828j();
        if (menuItem.getItemId() != 16908332 || m1828j == null || (m1828j.mo1791g() & 4) == 0) {
            return false;
        }
        return m1830l();
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onMenuOpened(int i, Menu menu) {
        return super.onMenuOpened(i, menu);
    }

    @Override // android.support.v4.app.ActivityC0208o, android.app.Activity, android.view.Window.Callback
    public void onPanelClosed(int i, Menu menu) {
        super.onPanelClosed(i, menu);
    }

    @Override // android.app.Activity
    protected void onPostCreate(Bundle bundle) {
        super.onPostCreate(bundle);
        m1827i().mo1841b(bundle);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.support.v4.app.ActivityC0208o, android.app.Activity
    public void onPostResume() {
        super.onPostResume();
        m1827i().mo1851h();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.support.v4.app.ActivityC0208o, android.support.v4.app.ActivityC0196da, android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        m1827i().mo1846c(bundle);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.support.v4.app.ActivityC0208o, android.app.Activity
    public void onStart() {
        super.onStart();
        m1827i().mo1852i();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.support.v4.app.ActivityC0208o, android.app.Activity
    public void onStop() {
        super.onStop();
        m1827i().mo1853j();
    }

    @Override // android.app.Activity
    protected void onTitleChanged(CharSequence charSequence, int i) {
        super.onTitleChanged(charSequence, i);
        m1827i().mo1839a(charSequence);
    }

    @Override // android.app.Activity
    public void openOptionsMenu() {
        AbstractC0322a m1828j = m1828j();
        if (getWindow().hasFeature(0)) {
            if (m1828j == null || !m1828j.m1804k()) {
                super.openOptionsMenu();
            }
        }
    }

    @Override // android.app.Activity
    public void setContentView(int i) {
        m1827i().mo1845c(i);
    }

    @Override // android.app.Activity
    public void setContentView(View view) {
        m1827i().mo1837a(view);
    }

    @Override // android.app.Activity
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        m1827i().mo1842b(view, layoutParams);
    }

    @Override // android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public void setTheme(int i) {
        super.setTheme(i);
        this.f1575o = i;
    }
}
