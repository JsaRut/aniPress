package p031c.p101b.p102a.p104b;

import android.R;
import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.Icon;
import android.os.Build;
import android.text.TextUtils;
import android.widget.RemoteViews;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;
import org.json.JSONObject;
import p031c.p101b.p102a.p110h.C0905a;
import p031c.p101b.p102a.p110h.C0906b;
import p031c.p101b.p102a.p110h.C0908d;
import p031c.p101b.p102a.p114l.C0923b;

/* renamed from: c.b.a.b.e */
/* loaded from: classes.dex */
public class C0882e implements InterfaceC0887j {

    /* renamed from: a */
    protected Context f3717a;

    /* renamed from: b */
    private C0886i f3718b;

    /* renamed from: a */
    Notification mo4300a(Notification.Builder builder) {
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x014e  */
    @Override // p031c.p101b.p102a.p104b.InterfaceC0887j
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public android.app.Notification mo4305a(android.content.Context r4, p031c.p101b.p102a.p104b.C0886i r5) {
        /*
            Method dump skipped, instructions count: 346
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p031c.p101b.p102a.p104b.C0882e.mo4305a(android.content.Context, c.b.a.b.i):android.app.Notification");
    }

    /* renamed from: a */
    public Notification m4306a(Map<String, String> map) {
        Notification.Builder builder;
        int i;
        Context context = this.f3717a;
        if (context == null) {
            C0923b.m4653i("DefaultPushNotificationBuilder", "Can't find valid context when build notification.");
            return null;
        }
        String charSequence = context.getApplicationInfo().loadLabel(this.f3717a.getPackageManager()).toString();
        if (map.containsKey("cn.jpush.android.MSG_ID")) {
            map.get("cn.jpush.android.MSG_ID");
        }
        String str = map.containsKey("cn.jpush.android.ALERT") ? map.get("cn.jpush.android.ALERT") : "";
        if (TextUtils.isEmpty(str)) {
            C0923b.m4654j("DefaultPushNotificationBuilder", "No notification content to show. Give up.");
            return null;
        }
        if (map.containsKey("cn.jpush.android.NOTIFICATION_SMALL_ICON")) {
            map.get("cn.jpush.android.NOTIFICATION_SMALL_ICON");
        }
        String str2 = map.containsKey("cn.jpush.android.NOTIFICATION_LARGE_ICON") ? map.get("cn.jpush.android.NOTIFICATION_LARGE_ICON") : "";
        if (map.containsKey("cn.jpush.android.NOTIFICATION_CONTENT_TITLE")) {
            charSequence = map.get("cn.jpush.android.NOTIFICATION_CONTENT_TITLE");
        }
        String str3 = map.containsKey("cn.jpush.android.BIG_TEXT") ? map.get("cn.jpush.android.BIG_TEXT") : "";
        String str4 = map.containsKey("cn.jpush.android.INBOX") ? map.get("cn.jpush.android.INBOX") : "";
        int parseInt = map.containsKey("cn.jpush.android.NOTI_PRIORITY") ? Integer.parseInt(map.get("cn.jpush.android.NOTI_PRIORITY")) : 0;
        String str5 = map.containsKey("cn.jpush.android.NOTI_CATEGORY") ? map.get("cn.jpush.android.NOTI_CATEGORY") : "";
        String str6 = map.containsKey("cn.jpush.android.BIG_PIC_PATH") ? map.get("cn.jpush.android.BIG_PIC_PATH") : "";
        int parseInt2 = map.containsKey("cn.jpush.android.ALERT_TYPE") ? Integer.parseInt(map.get("cn.jpush.android.ALERT_TYPE")) : -1;
        int i2 = (parseInt2 < -1 || parseInt2 > 7) ? -1 : parseInt2;
        RemoteViews m4307a = m4307a(str, charSequence);
        if (Build.VERSION.SDK_INT < 11) {
            Notification notification = new Notification(C0908d.m4532a(this.f3717a), str, System.currentTimeMillis());
            mo4302a(notification);
            notification.defaults = i2;
            if (m4307a != null) {
                notification.contentView = m4307a;
            } else {
                C0906b.m4498a(notification, this.f3717a, charSequence, str, (PendingIntent) null);
            }
            return notification;
        }
        Notification.Builder builder2 = new Notification.Builder(this.f3717a);
        builder2.setContentTitle(charSequence).setContentText(str).setTicker(str);
        int m4532a = C0908d.m4532a(this.f3717a);
        if (m4532a != 0) {
            C0923b.m4644b("DefaultPushNotificationBuilder", "setSmallIcon with resId:" + m4532a);
        } else {
            C0923b.m4654j("DefaultPushNotificationBuilder", "not found small icon in your app,will setSmallIcon with android.R.color.transparent ");
            m4532a = R.color.transparent;
        }
        builder2.setSmallIcon(m4532a);
        Object m4496a = C0906b.m4496a(this.f3717a, str2);
        if (Build.VERSION.SDK_INT >= 23) {
            if (m4496a instanceof Icon) {
                builder2.setLargeIcon((Icon) m4496a);
            }
        } else if (m4496a instanceof Bitmap) {
            builder2.setLargeIcon((Bitmap) m4496a);
        }
        int i3 = 1;
        if (Build.VERSION.SDK_INT >= 17) {
            builder2.setShowWhen(true);
        }
        Context context2 = this.f3717a;
        C0886i c0886i = this.f3718b;
        int i4 = i2;
        String str7 = str6;
        C0905a.m4486a(context2, builder2, c0886i != null ? c0886i.f3773u : "", "", parseInt, i4);
        if (Build.VERSION.SDK_INT >= 16) {
            if (m4307a == null) {
                if (TextUtils.isEmpty(str3)) {
                    builder = builder2;
                } else {
                    Notification.BigTextStyle bigTextStyle = new Notification.BigTextStyle();
                    bigTextStyle.bigText(str3);
                    builder = builder2;
                    builder.setStyle(bigTextStyle);
                }
                if (!TextUtils.isEmpty(str4)) {
                    Notification.InboxStyle inboxStyle = new Notification.InboxStyle();
                    try {
                        TreeMap treeMap = new TreeMap();
                        JSONObject jSONObject = new JSONObject(str4);
                        Iterator<String> keys = jSONObject.keys();
                        while (keys.hasNext()) {
                            String next = keys.next();
                            treeMap.put(next, jSONObject.optString(next));
                        }
                        Iterator it = treeMap.values().iterator();
                        while (it.hasNext()) {
                            inboxStyle.addLine((String) it.next());
                        }
                        inboxStyle.setSummaryText(" + " + jSONObject.length() + " new messages");
                    } catch (Throwable th) {
                        C0923b.m4648d("DefaultPushNotificationBuilder", "Set inbox style error: " + th.getMessage());
                    }
                    builder.setStyle(inboxStyle);
                }
                if (!TextUtils.isEmpty(str7)) {
                    C0923b.m4649e("DefaultPushNotificationBuilder", "Set notification BPS with picture path:" + str7);
                    try {
                        Notification.BigPictureStyle bigPictureStyle = new Notification.BigPictureStyle();
                        bigPictureStyle.bigPicture(BitmapFactory.decodeFile(str7));
                        builder.setStyle(bigPictureStyle);
                    } catch (Throwable unused) {
                        C0923b.m4654j("DefaultPushNotificationBuilder", "Create big picture style failed.");
                    }
                }
            } else {
                builder = builder2;
            }
            if (parseInt != 0) {
                if (parseInt != 1) {
                    if (parseInt == 2) {
                        i = 2;
                    } else if (parseInt == -1) {
                        builder.setPriority(-1);
                    } else if (parseInt == -2) {
                        i = -2;
                    } else {
                        i3 = 0;
                    }
                    builder.setPriority(i);
                }
                builder.setPriority(i3);
            }
            if (!TextUtils.isEmpty(str5) && Build.VERSION.SDK_INT >= 21) {
                builder.setCategory(str5);
            }
        } else {
            builder = builder2;
        }
        if (m4307a != null) {
            builder.setContent(m4307a);
        } else {
            C0923b.m4649e("DefaultPushNotificationBuilder", " Use default notification view! ");
        }
        builder.setDefaults(i4);
        return mo4300a(builder);
    }

    /* renamed from: a */
    RemoteViews m4307a(String str, String str2) {
        return null;
    }

    /* renamed from: a */
    void mo4302a(Notification notification) {
        throw null;
    }
}
