package cn.jiguang.plugins.push.receiver;

import android.content.Context;
import cn.jiguang.plugins.push.JPushModule;
import cn.jiguang.plugins.push.p119a.C0951a;
import cn.jiguang.plugins.push.p120b.C0953a;
import cn.jpush.android.service.AbstractC0959f;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;
import p031c.p101b.p102a.p104b.C0880c;
import p031c.p101b.p102a.p104b.C0881d;
import p031c.p101b.p102a.p104b.C0884g;
import p031c.p101b.p102a.p104b.C0886i;

/* loaded from: classes.dex */
public class JPushModuleReceiver extends AbstractC0959f {
    @Override // cn.jpush.android.service.AbstractC0959f
    /* renamed from: a */
    public void mo4776a(Context context, C0880c c0880c) {
        C0951a.m4763a("onCommandResult:" + c0880c.toString());
        WritableMap createMap = Arguments.createMap();
        createMap.putInt("command", c0880c.f3706a);
        createMap.putString("commandExtra", c0880c.f3709d.toString());
        createMap.putString("commandMessage", c0880c.f3708c);
        createMap.putInt("commandResult", c0880c.f3707b);
        C0953a.m4775b("CommandEvent", createMap);
    }

    @Override // cn.jpush.android.service.AbstractC0959f
    /* renamed from: a */
    public void mo4777a(Context context, C0881d c0881d) {
        C0951a.m4763a("onMessage:" + c0881d.toString());
        C0953a.m4775b("CustomMessageEvent", C0953a.m4770a(c0881d));
    }

    @Override // cn.jpush.android.service.AbstractC0959f
    /* renamed from: a */
    public void mo4778a(Context context, C0884g c0884g) {
        C0951a.m4763a("onAliasOperatorResult:" + c0884g.toString());
        C0953a.m4775b("TagAliasEvent", C0953a.m4769a(3, c0884g));
    }

    @Override // cn.jpush.android.service.AbstractC0959f
    /* renamed from: a */
    public void mo4779a(Context context, String str) {
        C0951a.m4763a("onRegister:" + str);
    }

    @Override // cn.jpush.android.service.AbstractC0959f
    /* renamed from: a */
    public void mo4780a(Context context, boolean z) {
        C0951a.m4763a("onConnected state:" + z);
        WritableMap createMap = Arguments.createMap();
        createMap.putBoolean("connectEnable", z);
        C0953a.m4775b("ConnectEvent", createMap);
    }

    @Override // cn.jpush.android.service.AbstractC0959f
    /* renamed from: b */
    public void mo4781b(Context context, C0884g c0884g) {
        C0951a.m4763a("onCheckTagOperatorResult:" + c0884g.toString());
        C0953a.m4775b("TagAliasEvent", C0953a.m4769a(2, c0884g));
    }

    @Override // cn.jpush.android.service.AbstractC0959f
    /* renamed from: b */
    public void mo4782b(Context context, C0886i c0886i) {
        C0951a.m4763a("onNotifyMessageArrived:" + c0886i.toString());
        C0953a.m4775b("NotificationEvent", C0953a.m4772a("notificationArrived", c0886i));
    }

    @Override // cn.jpush.android.service.AbstractC0959f
    /* renamed from: c */
    public void mo4783c(Context context, C0884g c0884g) {
        C0951a.m4763a("onMobileNumberOperatorResult:" + c0884g.toString());
        WritableMap createMap = Arguments.createMap();
        createMap.putInt("code", c0884g.m4361d());
        createMap.putInt("sequence", c0884g.m4362e());
        C0953a.m4775b("MobileNumberEvent", createMap);
    }

    @Override // cn.jpush.android.service.AbstractC0959f
    /* renamed from: c */
    public void mo4784c(Context context, C0886i c0886i) {
        C0951a.m4763a("onNotifyMessageDismiss:" + c0886i.toString());
        C0953a.m4775b("NotificationEvent", C0953a.m4772a("notificationDismissed", c0886i));
    }

    @Override // cn.jpush.android.service.AbstractC0959f
    /* renamed from: d */
    public void mo4785d(Context context, C0884g c0884g) {
        C0951a.m4763a("onTagOperatorResult:" + c0884g.toString());
        C0953a.m4775b("TagAliasEvent", C0953a.m4769a(1, c0884g));
    }

    @Override // cn.jpush.android.service.AbstractC0959f
    /* renamed from: d */
    public void mo4786d(Context context, C0886i c0886i) {
        C0951a.m4763a("onNotifyMessageOpened:" + c0886i.toString());
        if (JPushModule.reactContext == null) {
            super.mo4786d(context, c0886i);
            return;
        }
        if (!JPushModule.isAppForeground) {
            C0953a.m4773a(context);
        }
        C0953a.m4775b("NotificationEvent", C0953a.m4772a("notificationOpened", c0886i));
    }
}
