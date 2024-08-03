package cn.jpush.android.service;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import java.util.HashMap;
import java.util.Map;
import p031c.p032a.p057a.C0583a;
import p031c.p032a.p059c.C0596g;
import p031c.p032a.p060d.C0601d;
import p031c.p032a.p096v.C0845a;
import p031c.p032a.p099y.AbstractBinderC0864b;
import p031c.p032a.p099y.InterfaceC0863a;

/* renamed from: cn.jpush.android.service.c */
/* loaded from: classes.dex */
public class BinderC0956c extends AbstractBinderC0864b {

    /* renamed from: a */
    private static boolean f3996a = false;

    /* renamed from: b */
    private static final Map<String, InterfaceC0863a> f3997b = new HashMap();

    /* renamed from: a */
    public static InterfaceC0863a m4788a(String str) {
        return f3997b.get(str);
    }

    /* renamed from: a */
    public static boolean m4789a() {
        return f3996a;
    }

    /* renamed from: b */
    public static void m4790b() {
        f3996a = true;
    }

    /* renamed from: b */
    public static void m4791b(InterfaceC0863a interfaceC0863a, String str) {
        if (interfaceC0863a != m4788a(str)) {
            f3997b.put(str, interfaceC0863a);
            C0601d.m3072b("DataShare", str + "'s aidl created");
            try {
                Context m2978a = C0583a.m2978a(null);
                if (m2978a != null) {
                    String m4118a = C0845a.m4118a(m2978a);
                    if (m2978a.getPackageName().equals(m4118a)) {
                        interfaceC0863a.mo4196a(new BinderC0956c(), m4118a);
                    }
                }
            } catch (RemoteException e2) {
                C0601d.m3079h("DataShare", "bind failed=" + e2);
            }
        }
        f3996a = false;
    }

    @Override // p031c.p032a.p099y.InterfaceC0863a
    /* renamed from: a */
    public Bundle mo4194a(String str, String str2, Bundle bundle) {
        try {
            C0596g.m3055a();
            return C0596g.m3057b(C0583a.f2794a, str, str2, bundle);
        } catch (Throwable th) {
            C0601d.m3078g("DataShare", "onAction error:" + th);
            return null;
        }
    }

    @Override // p031c.p032a.p099y.InterfaceC0863a
    /* renamed from: a */
    public IBinder mo4195a(String str, String str2) {
        return null;
    }

    @Override // p031c.p032a.p099y.InterfaceC0863a
    /* renamed from: a */
    public String mo4196a(InterfaceC0863a interfaceC0863a, String str) {
        f3997b.put(str, interfaceC0863a);
        C0601d.m3072b("DataShare", str + "'s aidl bound");
        return C0845a.m4118a(null);
    }

    @Override // p031c.p032a.p099y.InterfaceC0863a
    /* renamed from: b */
    public void mo4197b(String str, String str2, Bundle bundle) {
        try {
            C0596g.m3055a();
            C0596g.m3057b(C0583a.f2794a, str, str2, bundle);
        } catch (Throwable th) {
            C0601d.m3078g("DataShare", "onAction error:" + th);
        }
    }
}
