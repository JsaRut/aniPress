package p139d.p143b.p208m;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActivityC0334m;
import android.view.KeyEvent;
import com.facebook.react.modules.core.InterfaceC1164c;
import com.facebook.react.modules.core.InterfaceC1166e;
import com.facebook.react.modules.core.InterfaceC1167f;

/* renamed from: d.b.m.q */
/* loaded from: classes.dex */
public abstract class AbstractActivityC2126q extends ActivityC0334m implements InterfaceC1164c, InterfaceC1166e {

    /* renamed from: q */
    private final C2128s f7606q = mo6708m();

    @Override // com.facebook.react.modules.core.InterfaceC1166e
    /* renamed from: a */
    public void mo5286a(String[] strArr, int i, InterfaceC1167f interfaceC1167f) {
        this.f7606q.m8483a(strArr, i, interfaceC1167f);
    }

    @Override // com.facebook.react.modules.core.InterfaceC1164c
    /* renamed from: b */
    public void mo5285b() {
        super.onBackPressed();
    }

    /* renamed from: m */
    protected C2128s mo6708m() {
        return new C2128s(this, mo6709n());
    }

    /* renamed from: n */
    protected String mo6709n() {
        return null;
    }

    @Override // android.support.v4.app.ActivityC0208o, android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        this.f7606q.m8479a(i, i2, intent);
    }

    @Override // android.support.v4.app.ActivityC0208o, android.app.Activity
    public void onBackPressed() {
        if (this.f7606q.m8492f()) {
            return;
        }
        super.onBackPressed();
    }

    @Override // android.support.v7.app.ActivityC0334m, android.support.v4.app.ActivityC0208o, android.support.v4.app.ActivityC0196da, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f7606q.m8481a(bundle);
    }

    @Override // android.support.v7.app.ActivityC0334m, android.support.v4.app.ActivityC0208o, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        this.f7606q.m8493g();
    }

    @Override // android.support.v7.app.ActivityC0334m, android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        return this.f7606q.m8484a(i, keyEvent) || super.onKeyDown(i, keyEvent);
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyLongPress(int i, KeyEvent keyEvent) {
        return this.f7606q.m8487b(i, keyEvent) || super.onKeyLongPress(i, keyEvent);
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyUp(int i, KeyEvent keyEvent) {
        return this.f7606q.m8489c(i, keyEvent) || super.onKeyUp(i, keyEvent);
    }

    @Override // android.support.v4.app.ActivityC0208o, android.app.Activity
    public void onNewIntent(Intent intent) {
        if (this.f7606q.m8485a(intent)) {
            return;
        }
        super.onNewIntent(intent);
    }

    @Override // android.support.v4.app.ActivityC0208o, android.app.Activity
    public void onPause() {
        super.onPause();
        this.f7606q.m8494h();
    }

    @Override // android.support.v4.app.ActivityC0208o, android.app.Activity, android.support.v4.app.C0191b.a
    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        this.f7606q.m8480a(i, strArr, iArr);
    }

    @Override // android.support.v4.app.ActivityC0208o, android.app.Activity
    public void onResume() {
        super.onResume();
        this.f7606q.m8495i();
    }
}
