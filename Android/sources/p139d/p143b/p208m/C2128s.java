package p139d.p143b.p208m;

import android.annotation.TargetApi;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import com.facebook.react.bridge.Callback;
import com.facebook.react.devsupport.C1118d;
import com.facebook.react.modules.core.InterfaceC1164c;
import com.facebook.react.modules.core.InterfaceC1167f;
import p139d.p143b.p204k.p205a.C2038a;

/* renamed from: d.b.m.s */
/* loaded from: classes.dex */
public class C2128s {

    /* renamed from: a */
    private final Activity f7611a;

    /* renamed from: b */
    private final String f7612b;

    /* renamed from: c */
    private C2056P f7613c;

    /* renamed from: d */
    private C1118d f7614d;

    /* renamed from: e */
    private InterfaceC1167f f7615e;

    /* renamed from: f */
    private Callback f7616f;

    public C2128s(AbstractActivityC2126q abstractActivityC2126q, String str) {
        this.f7611a = abstractActivityC2126q;
        this.f7612b = str;
    }

    /* renamed from: a */
    protected C2056P mo6713a() {
        return new C2056P(m8486b());
    }

    /* renamed from: a */
    public void m8479a(int i, int i2, Intent intent) {
        if (m8491e().m8396l()) {
            m8491e().m8393h().m8355a(m8490d(), i, i2, intent);
        }
    }

    /* renamed from: a */
    public void m8480a(int i, String[] strArr, int[] iArr) {
        this.f7616f = new C2127r(this, i, strArr, iArr);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: a */
    public void m8481a(Bundle bundle) {
        String str = this.f7612b;
        if (str != null) {
            m8482a(str);
        }
        this.f7614d = new C1118d();
    }

    /* renamed from: a */
    protected void m8482a(String str) {
        if (this.f7613c != null) {
            throw new IllegalStateException("Cannot loadApp while app is already running.");
        }
        this.f7613c = mo6713a();
        this.f7613c.mo6761a(m8491e().m8393h(), str, m8488c());
        m8490d().setContentView(this.f7613c);
    }

    @TargetApi(23)
    /* renamed from: a */
    public void m8483a(String[] strArr, int i, InterfaceC1167f interfaceC1167f) {
        this.f7615e = interfaceC1167f;
        m8490d().requestPermissions(strArr, i);
    }

    /* renamed from: a */
    public boolean m8484a(int i, KeyEvent keyEvent) {
        if (!m8491e().m8396l() || !m8491e().mo6716k() || i != 90) {
            return false;
        }
        keyEvent.startTracking();
        return true;
    }

    /* renamed from: a */
    public boolean m8485a(Intent intent) {
        if (!m8491e().m8396l()) {
            return false;
        }
        m8491e().m8393h().m8357a(intent);
        return true;
    }

    /* renamed from: b */
    protected Context m8486b() {
        Activity activity = this.f7611a;
        C2038a.m8318a(activity);
        return activity;
    }

    /* renamed from: b */
    public boolean m8487b(int i, KeyEvent keyEvent) {
        if (!m8491e().m8396l() || !m8491e().mo6716k() || i != 90) {
            return false;
        }
        m8491e().m8393h().m8370j();
        return true;
    }

    /* renamed from: c */
    protected Bundle m8488c() {
        return null;
    }

    /* renamed from: c */
    public boolean m8489c(int i, KeyEvent keyEvent) {
        if (!m8491e().m8396l() || !m8491e().mo6716k()) {
            return false;
        }
        if (i == 82) {
            m8491e().m8393h().m8370j();
            return true;
        }
        C1118d c1118d = this.f7614d;
        C2038a.m8318a(c1118d);
        if (!c1118d.m5215a(i, m8490d().getCurrentFocus())) {
            return false;
        }
        m8491e().m8393h().m8364d().mo5208d();
        return true;
    }

    /* renamed from: d */
    protected Activity m8490d() {
        return (Activity) m8486b();
    }

    /* renamed from: e */
    protected AbstractC2050J m8491e() {
        return ((InterfaceC2130u) m8490d().getApplication()).mo6712a();
    }

    /* renamed from: f */
    public boolean m8492f() {
        if (!m8491e().m8396l()) {
            return false;
        }
        m8491e().m8393h().m8367g();
        return true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: g */
    public void m8493g() {
        C2056P c2056p = this.f7613c;
        if (c2056p != null) {
            c2056p.m8412c();
            this.f7613c = null;
        }
        if (m8491e().m8396l()) {
            m8491e().m8393h().m8354a(m8490d());
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: h */
    public void m8494h() {
        if (m8491e().m8396l()) {
            m8491e().m8393h().m8360b(m8490d());
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: i */
    public void m8495i() {
        if (m8491e().m8396l()) {
            m8491e().m8393h().m8356a(m8490d(), (InterfaceC1164c) m8490d());
        }
        Callback callback = this.f7616f;
        if (callback != null) {
            callback.invoke(new Object[0]);
            this.f7616f = null;
        }
    }
}
