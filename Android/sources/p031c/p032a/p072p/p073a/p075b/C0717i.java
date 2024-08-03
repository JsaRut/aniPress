package p031c.p032a.p072p.p073a.p075b;

import android.content.Context;
import android.os.Bundle;
import java.util.concurrent.atomic.AtomicBoolean;
import p031c.p032a.p072p.p073a.C0707b;
import p031c.p032a.p072p.p073a.C0721c;
import p031c.p032a.p072p.p073a.C0727d;
import p031c.p032a.p072p.p073a.p074a.C0691a;
import p031c.p032a.p072p.p073a.p074a.C0694d;
import p031c.p032a.p072p.p073a.p074a.C0697g;
import p031c.p032a.p072p.p073a.p074a.C0700j;
import p031c.p032a.p072p.p073a.p080f.p081a.C0732b;
import p031c.p032a.p092s.C0830f;
import p031c.p032a.p092s.EnumC0837m;
import p031c.p032a.p092s.InterfaceC0826b;

/* renamed from: c.a.p.a.b.i */
/* loaded from: classes.dex */
public final class C0717i {

    /* renamed from: a */
    private static AtomicBoolean f3251a = new AtomicBoolean(false);

    static {
        C0830f.m4058a(EnumC0837m.JANALYTICS.name(), (Class<? extends InterfaceC0826b>) C0721c.class);
    }

    private C0717i() {
    }

    /* renamed from: a */
    public static void m3644a(Context context) {
        if (f3251a.get()) {
            return;
        }
        if (context == null) {
            C0732b.m3726i("JAnalyticsInterface", "context is null");
            return;
        }
        C0732b.m3720c("JAnalyticsInterface", "JAnalyticsInterface init...version:2.0.0 ,buildId:30");
        C0830f.m4047a(context, 4098, (Bundle) null);
        if (!C0707b.m3616b(context)) {
            C0732b.m3720c("JAnalyticsInterface", "JAnalytics init failed");
        } else {
            f3251a.set(true);
            C0732b.m3720c("JAnalyticsInterface", "JAnalytics init succeed");
        }
    }

    /* renamed from: a */
    public static void m3645a(Context context, int i) {
        if (context != null) {
            m3644a(context);
        }
        C0697g.m3577a(4369, i);
    }

    /* renamed from: a */
    public static void m3646a(Context context, C0708a c0708a, InterfaceC0710b interfaceC0710b) {
        if (context != null) {
            m3644a(context);
        }
        C0691a.m3563a(c0708a, interfaceC0710b);
    }

    /* renamed from: a */
    public static void m3647a(Context context, AbstractC0716h abstractC0716h) {
        m3644a(context);
        if (abstractC0716h == null) {
            C0732b.m3724g("JAnalyticsInterface", " NULL Event");
        } else {
            if (abstractC0716h.mo3637b()) {
                C0694d.m3569b().m3571a(context, abstractC0716h);
                return;
            }
            C0732b.m3724g("JAnalyticsInterface", "invalide Event :" + abstractC0716h.toString());
        }
    }

    /* renamed from: a */
    public static void m3648a(Context context, String str) {
        m3644a(context);
        C0700j.m3585b().m3597b(context, str);
    }

    /* renamed from: a */
    public static void m3649a(boolean z) {
        C0830f.m4060a(z);
        C0727d.f3300a = z;
    }

    /* renamed from: b */
    public static void m3650b(Context context) {
        C0830f.m4063b(context);
    }

    /* renamed from: b */
    public static void m3651b(Context context, String str) {
        m3644a(context);
        C0700j.m3585b().m3596a(context, str);
    }

    /* renamed from: c */
    public static void m3652c(Context context) {
        C0830f.m4068d(context);
    }

    /* renamed from: c */
    public static void m3653c(Context context, String str) {
        Bundle bundle = new Bundle();
        bundle.putString("arg1", str);
        C0830f.m4047a(context, 4096, bundle);
    }
}
