package cn.jpush.android.service;

import android.app.Notification;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import p031c.p101b.p102a.p104b.C0880c;
import p031c.p101b.p102a.p104b.C0881d;
import p031c.p101b.p102a.p104b.C0884g;
import p031c.p101b.p102a.p104b.C0886i;
import p031c.p101b.p102a.p114l.C0926e;

/* renamed from: cn.jpush.android.service.f */
/* loaded from: classes.dex */
public abstract class AbstractC0959f extends BroadcastReceiver {
    /* renamed from: a */
    public Notification m4793a(Context context, C0886i c0886i) {
        return null;
    }

    /* renamed from: a */
    public void m4794a(Context context, Intent intent) {
        C0926e.m4660a(context, intent);
    }

    /* renamed from: a */
    public void mo4776a(Context context, C0880c c0880c) {
    }

    /* renamed from: a */
    public void mo4777a(Context context, C0881d c0881d) {
        C0926e.m4661a(context, c0881d);
    }

    /* renamed from: a */
    public void mo4778a(Context context, C0884g c0884g) {
    }

    /* renamed from: a */
    public void mo4779a(Context context, String str) {
    }

    /* renamed from: a */
    public void mo4780a(Context context, boolean z) {
    }

    /* renamed from: b */
    public void mo4781b(Context context, C0884g c0884g) {
    }

    /* renamed from: b */
    public void mo4782b(Context context, C0886i c0886i) {
        C0926e.m4662a(context, c0886i, "cn.jpush.android.intent.NOTIFICATION_RECEIVED");
    }

    /* renamed from: c */
    public void mo4783c(Context context, C0884g c0884g) {
    }

    /* renamed from: c */
    public void mo4784c(Context context, C0886i c0886i) {
    }

    /* renamed from: d */
    public void mo4785d(Context context, C0884g c0884g) {
    }

    /* renamed from: d */
    public void mo4786d(Context context, C0886i c0886i) {
        C0926e.m4662a(context, c0886i, "cn.jpush.android.intent.NOTIFICATION_OPENED");
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        C0926e.m4659a().m4664a(context.getApplicationContext(), this, intent);
    }
}
