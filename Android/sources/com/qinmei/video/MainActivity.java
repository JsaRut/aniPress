package com.qinmei.video;

import android.app.Activity;
import android.os.Bundle;
import org.devio.p276rn.splashscreen.C2793e;
import p031c.p032a.p072p.p073a.p075b.C0717i;
import p139d.p143b.p208m.AbstractActivityC2126q;
import p139d.p143b.p208m.C2128s;

/* loaded from: classes.dex */
public class MainActivity extends AbstractActivityC2126q {
    @Override // p139d.p143b.p208m.AbstractActivityC2126q
    /* renamed from: m */
    protected C2128s mo6708m() {
        return new C1599a(this, this, mo6709n());
    }

    @Override // p139d.p143b.p208m.AbstractActivityC2126q
    /* renamed from: n */
    protected String mo6709n() {
        return "Qinmei";
    }

    @Override // p139d.p143b.p208m.AbstractActivityC2126q, android.support.v7.app.ActivityC0334m, android.support.v4.app.ActivityC0208o, android.support.v4.app.ActivityC0196da, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (isTaskRoot()) {
            C2793e.m11773a((Activity) this, true);
        } else {
            finish();
        }
    }

    @Override // p139d.p143b.p208m.AbstractActivityC2126q, android.support.v7.app.ActivityC0334m, android.support.v4.app.ActivityC0208o, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        C0717i.m3648a(this, MainActivity.class.getCanonicalName());
    }

    @Override // p139d.p143b.p208m.AbstractActivityC2126q, android.support.v4.app.ActivityC0208o, android.app.Activity
    public void onPause() {
        super.onPause();
    }

    @Override // p139d.p143b.p208m.AbstractActivityC2126q, android.support.v4.app.ActivityC0208o, android.app.Activity
    public void onResume() {
        super.onResume();
        C0717i.m3651b(this, MainActivity.class.getCanonicalName());
    }
}
