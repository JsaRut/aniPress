package cn.jpush.reactnativejanalytics;

import android.util.Log;
import com.facebook.react.bridge.Callback;
import p031c.p032a.p072p.p073a.p075b.InterfaceC0710b;

/* renamed from: cn.jpush.reactnativejanalytics.a */
/* loaded from: classes.dex */
class C0969a implements InterfaceC0710b {

    /* renamed from: a */
    final /* synthetic */ Callback f4027a;

    /* renamed from: b */
    final /* synthetic */ Callback f4028b;

    /* renamed from: c */
    final /* synthetic */ JAnalyticsModule f4029c;

    public C0969a(JAnalyticsModule jAnalyticsModule, Callback callback, Callback callback2) {
        this.f4029c = jAnalyticsModule;
        this.f4027a = callback;
        this.f4028b = callback2;
    }

    @Override // p031c.p032a.p072p.p073a.p075b.InterfaceC0710b
    /* renamed from: a */
    public void mo3636a(int i, String str) {
        if (i == 0) {
            this.f4027a.invoke(new Object[0]);
            return;
        }
        Log.i(JAnalyticsModule.class.getSimpleName(), "Identify account error code " + i + " :" + str);
        this.f4028b.invoke(str);
    }
}
