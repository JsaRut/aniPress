package cn.jpush.android.service;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import p031c.p101b.p102a.p110h.C0906b;
import p031c.p101b.p102a.p114l.C0923b;

/* loaded from: classes.dex */
public class JNotifyActivity extends Activity {
    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* renamed from: a */
    private void m4787a(Intent intent) {
        try {
            if (intent == null) {
                return;
            }
            try {
                C0906b.m4501a(getApplicationContext(), intent);
            } catch (Throwable th) {
                C0923b.m4642a("JNotifyActivity", "handle intent failed:" + th.getMessage());
            }
        } finally {
            finish();
        }
    }

    @Override // android.app.Activity
    protected final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        m4787a(getIntent());
    }

    @Override // android.app.Activity
    protected final void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        m4787a(intent);
    }
}
