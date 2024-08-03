package p031c.p101b.p102a.p114l;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import cn.jpush.android.service.AbstractC0959f;
import java.util.Locale;
import p031c.p101b.p102a.p104b.C0880c;
import p031c.p101b.p102a.p104b.C0881d;
import p031c.p101b.p102a.p104b.C0884g;
import p031c.p101b.p102a.p106d.C0897b;
import p031c.p101b.p102a.p110h.C0906b;
import p031c.p101b.p102a.p112j.C0918c;

/* renamed from: c.b.a.l.e */
/* loaded from: classes.dex */
public class C0926e {

    /* renamed from: a */
    private static C0926e f3941a;

    /* renamed from: b */
    private Handler f3942b;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: c.b.a.l.e$a */
    /* loaded from: classes.dex */
    public class a implements Runnable {

        /* renamed from: a */
        private Context f3943a;

        /* renamed from: b */
        private AbstractC0959f f3944b;

        /* renamed from: c */
        private Intent f3945c;

        public a(Context context, AbstractC0959f abstractC0959f, Intent intent) {
            this.f3943a = context;
            this.f3944b = abstractC0959f;
            this.f3945c = intent;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                if (this.f3945c == null) {
                    C0923b.m4653i("JMessageReceiverHelper", "intent was null");
                    return;
                }
                String action = this.f3945c.getAction();
                C0923b.m4642a("JMessageReceiverHelper", "do receiver action :" + action);
                if (action == null) {
                    C0923b.m4653i("JMessageReceiverHelper", "unsupport action type");
                    return;
                }
                if (action.equals("cn.jpush.android.intent.RECEIVE_MESSAGE")) {
                    int intExtra = this.f3945c.getIntExtra("message_type", -1);
                    C0884g m4599a = (1 == intExtra || 2 == intExtra) ? C0918c.m4592a().m4599a(this.f3943a, this.f3945c) : null;
                    C0923b.m4642a("JMessageReceiverHelper", "messageType:" + intExtra + ",jPushMessage:" + m4599a);
                    if (m4599a == null) {
                        C0923b.m4653i("JMessageReceiverHelper", "parse tagalias message failed");
                        return;
                    }
                    if (intExtra == 1) {
                        if (m4599a.m4365h()) {
                            this.f3944b.mo4781b(this.f3943a, m4599a);
                            return;
                        } else {
                            this.f3944b.mo4785d(this.f3943a, m4599a);
                            return;
                        }
                    }
                    if (intExtra == 2) {
                        this.f3944b.mo4778a(this.f3943a, m4599a);
                        return;
                    } else {
                        C0923b.m4653i("JMessageReceiverHelper", "unsupport message type");
                        return;
                    }
                }
                if (action.equals("mobile_result")) {
                    this.f3944b.mo4783c(this.f3943a, C0931j.m4678a().m4679a(this.f3943a, this.f3945c));
                    return;
                }
                if (action.equals("custom_msg")) {
                    this.f3944b.mo4777a(this.f3943a, C0897b.m4416a(this.f3945c));
                    return;
                }
                if (action.equals("cmd_msg")) {
                    C0926e.m4663a(this.f3944b, this.f3943a, this.f3945c);
                    return;
                }
                if (action.equals("cn.jpush.android.intent.NOTIFICATION_ARRIVED")) {
                    this.f3944b.mo4782b(this.f3943a, C0906b.m4516c(this.f3943a, this.f3945c));
                    return;
                }
                if (action.equals("cn.jpush.android.intent.NOTIFICATION_OPENED")) {
                    this.f3944b.mo4786d(this.f3943a, C0906b.m4516c(this.f3943a, this.f3945c));
                    return;
                }
                if (action.equals("cn.jpush.android.intent.NOTIFICATION_DISMISS")) {
                    this.f3944b.mo4784c(this.f3943a, C0906b.m4516c(this.f3943a, this.f3945c));
                    return;
                }
                if (!"cn.jpush.android.intent.NOTIFICATION_CLICK_ACTION_PROXY".equals(this.f3945c.getAction())) {
                    C0923b.m4653i("JMessageReceiverHelper", "unsupport action type");
                    return;
                }
                Intent intent = new Intent("cn.jpush.android.intent.NOTIFICATION_CLICK_ACTION");
                if (this.f3945c.getExtras() != null) {
                    intent.putExtras(this.f3945c.getExtras());
                }
                this.f3944b.m4794a(this.f3943a, intent);
            } catch (Throwable th) {
                C0923b.m4654j("JMessageReceiverHelper", "MessageReceiver run failed:" + th.getMessage());
            }
        }
    }

    private C0926e() {
        try {
            HandlerThread handlerThread = new HandlerThread("MessageReceiver");
            handlerThread.start();
            this.f3942b = new Handler(handlerThread.getLooper());
        } catch (Throwable th) {
            C0923b.m4653i("JMessageReceiverHelper", "create handler failed,error:" + th);
            this.f3942b = new Handler();
        }
    }

    /* renamed from: a */
    public static C0926e m4659a() {
        if (f3941a == null) {
            synchronized (C0926e.class) {
                if (f3941a == null) {
                    f3941a = new C0926e();
                }
            }
        }
        return f3941a;
    }

    /* renamed from: a */
    public static void m4660a(Context context, Intent intent) {
        C0923b.m4649e("JMessageReceiverHelper", "Click notification action with extra: " + intent.getExtras().getString("cn.jpush.android.NOTIFIACATION_ACTION_EXTRA"));
        try {
            Intent intent2 = new Intent("cn.jpush.android.intent.NOTIFICATION_CLICK_ACTION");
            intent2.putExtras(intent.getExtras());
            intent2.addCategory(context.getPackageName());
            intent2.setPackage(context.getPackageName());
            context.sendBroadcast(intent2, context.getPackageName() + ".permission.JPUSH_MESSAGE");
        } catch (Throwable th) {
            C0923b.m4654j("JMessageReceiverHelper", "Click notification sendBroadcast :" + th.getMessage());
        }
    }

    /* renamed from: a */
    public static void m4661a(Context context, C0881d c0881d) {
        if (context == null || c0881d == null) {
            C0923b.m4644b("JMessageReceiverHelper", "Send custom message to app failed, param is invalid!");
            return;
        }
        C0923b.m4644b("JMessageReceiverHelper", "not found user push message,use old action to user");
        Intent intent = new Intent("cn.jpush.android.intent.MESSAGE_RECEIVED");
        intent.putExtra("cn.jpush.android.APPKEY", c0881d.f3715f);
        intent.putExtra("cn.jpush.android.MESSAGE", c0881d.f3712c);
        intent.putExtra("cn.jpush.android.CONTENT_TYPE", c0881d.f3713d);
        intent.putExtra("cn.jpush.android.TITLE", c0881d.f3714e);
        intent.putExtra("cn.jpush.android.EXTRA", c0881d.f3711b);
        intent.putExtra("cn.jpush.android.MSG_ID", c0881d.f3710a);
        intent.addCategory(c0881d.f3716g);
        intent.setPackage(context.getPackageName());
        context.sendBroadcast(intent, String.format(Locale.ENGLISH, "%s.permission.JPUSH_MESSAGE", c0881d.f3716g));
        C0923b.m4649e("JMessageReceiverHelper", "Send broadcast to app: " + String.format(Locale.ENGLISH, "%s.permission.JPUSH_MESSAGE", c0881d.f3716g));
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x00a7 A[Catch: Throwable -> 0x011d, TryCatch #0 {Throwable -> 0x011d, blocks: (B:8:0x0017, B:10:0x0054, B:11:0x005b, B:13:0x0063, B:14:0x006a, B:16:0x006f, B:18:0x0077, B:19:0x007b, B:20:0x00a3, B:22:0x00a7, B:23:0x00bd, B:25:0x00c5, B:26:0x00cc, B:28:0x00d4, B:29:0x00db, B:31:0x00e3, B:32:0x00ea, B:34:0x00f2, B:35:0x00f9, B:39:0x007f, B:41:0x0084, B:43:0x008c, B:44:0x0091, B:46:0x0096, B:48:0x009e), top: B:7:0x0017 }] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00c5 A[Catch: Throwable -> 0x011d, TryCatch #0 {Throwable -> 0x011d, blocks: (B:8:0x0017, B:10:0x0054, B:11:0x005b, B:13:0x0063, B:14:0x006a, B:16:0x006f, B:18:0x0077, B:19:0x007b, B:20:0x00a3, B:22:0x00a7, B:23:0x00bd, B:25:0x00c5, B:26:0x00cc, B:28:0x00d4, B:29:0x00db, B:31:0x00e3, B:32:0x00ea, B:34:0x00f2, B:35:0x00f9, B:39:0x007f, B:41:0x0084, B:43:0x008c, B:44:0x0091, B:46:0x0096, B:48:0x009e), top: B:7:0x0017 }] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00d4 A[Catch: Throwable -> 0x011d, TryCatch #0 {Throwable -> 0x011d, blocks: (B:8:0x0017, B:10:0x0054, B:11:0x005b, B:13:0x0063, B:14:0x006a, B:16:0x006f, B:18:0x0077, B:19:0x007b, B:20:0x00a3, B:22:0x00a7, B:23:0x00bd, B:25:0x00c5, B:26:0x00cc, B:28:0x00d4, B:29:0x00db, B:31:0x00e3, B:32:0x00ea, B:34:0x00f2, B:35:0x00f9, B:39:0x007f, B:41:0x0084, B:43:0x008c, B:44:0x0091, B:46:0x0096, B:48:0x009e), top: B:7:0x0017 }] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00e3 A[Catch: Throwable -> 0x011d, TryCatch #0 {Throwable -> 0x011d, blocks: (B:8:0x0017, B:10:0x0054, B:11:0x005b, B:13:0x0063, B:14:0x006a, B:16:0x006f, B:18:0x0077, B:19:0x007b, B:20:0x00a3, B:22:0x00a7, B:23:0x00bd, B:25:0x00c5, B:26:0x00cc, B:28:0x00d4, B:29:0x00db, B:31:0x00e3, B:32:0x00ea, B:34:0x00f2, B:35:0x00f9, B:39:0x007f, B:41:0x0084, B:43:0x008c, B:44:0x0091, B:46:0x0096, B:48:0x009e), top: B:7:0x0017 }] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00f2 A[Catch: Throwable -> 0x011d, TryCatch #0 {Throwable -> 0x011d, blocks: (B:8:0x0017, B:10:0x0054, B:11:0x005b, B:13:0x0063, B:14:0x006a, B:16:0x006f, B:18:0x0077, B:19:0x007b, B:20:0x00a3, B:22:0x00a7, B:23:0x00bd, B:25:0x00c5, B:26:0x00cc, B:28:0x00d4, B:29:0x00db, B:31:0x00e3, B:32:0x00ea, B:34:0x00f2, B:35:0x00f9, B:39:0x007f, B:41:0x0084, B:43:0x008c, B:44:0x0091, B:46:0x0096, B:48:0x009e), top: B:7:0x0017 }] */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void m4662a(android.content.Context r7, p031c.p101b.p102a.p104b.C0886i r8, java.lang.String r9) {
        /*
            Method dump skipped, instructions count: 337
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p031c.p101b.p102a.p114l.C0926e.m4662a(android.content.Context, c.b.a.b.i, java.lang.String):void");
    }

    /* renamed from: a */
    public static void m4663a(AbstractC0959f abstractC0959f, Context context, Intent intent) {
        try {
            int intExtra = intent.getIntExtra("code", -2);
            int intExtra2 = intent.getIntExtra("cmd", -2);
            String stringExtra = intent.getStringExtra("message");
            Bundle extras = intent.getExtras();
            if (intExtra2 == -1) {
                abstractC0959f.mo4780a(context, false);
            } else if (intExtra2 == 0) {
                if (intExtra == 0) {
                    abstractC0959f.mo4779a(context, stringExtra);
                } else {
                    abstractC0959f.mo4776a(context, new C0880c(intExtra2, intExtra, stringExtra, extras));
                }
            } else if (intExtra2 == 1) {
                abstractC0959f.mo4780a(context, true);
            }
        } catch (Throwable th) {
            C0923b.m4646c("JMessageReceiverHelper", "callCmdMessage failed:" + th.getMessage());
        }
    }

    /* renamed from: a */
    public void m4664a(Context context, AbstractC0959f abstractC0959f, Intent intent) {
        this.f3942b.post(new a(context, abstractC0959f, intent));
    }
}
