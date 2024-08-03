package com.qinmei.video;

import android.app.Application;
import android.content.Context;
import cn.jiguang.plugins.push.JPushModule;
import com.facebook.soloader.SoLoader;
import p031c.p032a.p072p.p073a.p075b.C0717i;
import p139d.p143b.p208m.AbstractC2050J;
import p139d.p143b.p208m.InterfaceC2130u;

/* loaded from: classes.dex */
public class MainApplication extends Application implements InterfaceC2130u {

    /* renamed from: a */
    private static boolean f6012a = true;

    /* renamed from: b */
    private static boolean f6013b = true;

    /* renamed from: c */
    private final AbstractC2050J f6014c = new C1600b(this, this);

    @Override // p139d.p143b.p208m.InterfaceC2130u
    /* renamed from: a */
    public AbstractC2050J mo6712a() {
        return this.f6014c;
    }

    @Override // android.app.Application
    public void onCreate() {
        super.onCreate();
        SoLoader.m6385a((Context) this, false);
        C0717i.m3649a(true);
        C0717i.m3644a(this);
        C0717i.m3650b(this);
        JPushModule.registerActivityLifecycle(this);
    }
}
