package p031c.p101b.p102a.p106d;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import java.io.LineNumberReader;
import java.io.StringReader;
import java.util.Locale;
import org.json.JSONObject;
import p031c.p101b.p102a.C0869a;
import p031c.p101b.p102a.p103a.C0874e;
import p031c.p101b.p102a.p103a.C0877h;
import p031c.p101b.p102a.p104b.C0881d;
import p031c.p101b.p102a.p107e.C0902c;
import p031c.p101b.p102a.p110h.C0906b;
import p031c.p101b.p102a.p111i.C0911b;
import p031c.p101b.p102a.p111i.C0913d;
import p031c.p101b.p102a.p112j.C0916a;
import p031c.p101b.p102a.p114l.C0922a;
import p031c.p101b.p102a.p114l.C0923b;
import p031c.p101b.p102a.p114l.C0930i;

/* renamed from: c.b.a.d.b */
/* loaded from: classes.dex */
public class C0897b {
    /* renamed from: a */
    private static C0874e m4415a(C0899d c0899d) {
        try {
            C0874e m4276a = C0874e.m4276a(new JSONObject(c0899d.f3845g).optJSONObject("geofence"));
            if (m4276a == null) {
                return null;
            }
            m4276a.f3686t = c0899d;
            return m4276a;
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: a */
    public static C0881d m4416a(Intent intent) {
        C0881d c0881d;
        String stringExtra;
        JSONObject jSONObject;
        try {
            String stringExtra2 = intent.getStringExtra("data");
            stringExtra = intent.getStringExtra("msgid");
            jSONObject = new JSONObject(stringExtra2);
            c0881d = new C0881d();
        } catch (Throwable th) {
            th = th;
            c0881d = null;
        }
        try {
            c0881d.f3710a = stringExtra;
            c0881d.f3716g = intent.getStringExtra("appId");
            c0881d.f3715f = intent.getStringExtra("senderId");
            c0881d.f3712c = jSONObject.optString("message", "");
            c0881d.f3713d = jSONObject.optString("content_type", "");
            c0881d.f3714e = jSONObject.optString("title", "");
            c0881d.f3711b = jSONObject.optString("extras", "");
        } catch (Throwable th2) {
            th = th2;
            C0923b.m4653i("MessageHelper", "processMessage failed:" + th.getMessage());
            return c0881d;
        }
        return c0881d;
    }

    /* renamed from: a */
    private static void m4417a(Context context, int i, long j, long j2) {
        C0922a.m4635a(context, "JPUSH", 4, 2, j2, C0911b.m4536a(0, (byte) i, j));
    }

    /* renamed from: a */
    public static void m4418a(Context context, int i, String str, String str2, String str3, long j, byte b2) {
        if (!str2.equals(context.getPackageName())) {
            C0923b.m4646c("MessageHelper", "msg appId is not mine pkgname,appid:" + str2 + ",pkgname:" + context.getPackageName());
            return;
        }
        C0923b.m4642a("MessageHelper", "action:receivedPushMessage msgId = " + j);
        C0899d m4427a = C0899d.m4427a(str, str2, str3, j);
        if (m4427a == null || C0898c.m4424a(context, m4427a.m4429a())) {
            return;
        }
        m4427a.f3829W = b2;
        C0874e m4415a = m4415a(m4427a);
        if (m4415a == null || TextUtils.isEmpty(m4415a.f3667a)) {
            m4419a(context, m4427a);
        } else {
            C0877h.m4292a(context).m4297a(m4415a);
        }
    }

    /* renamed from: a */
    public static void m4419a(Context context, C0899d c0899d) {
        C0923b.m4642a("MessageHelper", "processBasicEntity type:" + c0899d.f3841e);
        c0899d.f3841e = c0899d.f3847i ? c0899d.f3846h == 4 ? 3 : 1 : 2;
        if ((c0899d.f3841e & 2) != 0) {
            C0923b.m4642a("MessageHelper", "processBasicEntity user-defined message.");
            if (TextUtils.isEmpty(c0899d.f3850l) && TextUtils.isEmpty(c0899d.f3853o)) {
                C0923b.m4654j("MessageHelper", "no message or extra send to user");
            } else {
                m4421b(context, c0899d);
            }
        }
        if ((c0899d.f3841e & 1) != 0) {
            C0923b.m4642a("MessageHelper", "processBasicEntity notification");
            if (C0902c.m4458c(context)) {
                C0923b.m4649e("MessageHelper", "Service is stoped, give up all the message");
                return;
            }
            c0899d.m4430a(context);
            if (C0906b.m4512b(context)) {
                C0906b.m4502a(context, c0899d);
            } else {
                C0930i.m4674a(c0899d.f3837c, 986, context);
                C0923b.m4650f("MessageHelper", "push is invalidPushTime，Intercept the message");
            }
        }
    }

    /* renamed from: a */
    public static void m4420a(Context context, C0913d c0913d) {
        m4417a(context, c0913d.m4546f(), c0913d.m4547g(), c0913d.m4542b());
        long m4547g = c0913d.m4547g();
        int m4546f = c0913d.m4546f();
        String m4548h = c0913d.m4548h();
        C0923b.m4642a("MessageHelper", "msgType = " + m4546f + ", msgId = " + m4547g);
        StringBuilder sb = new StringBuilder();
        sb.append("msgContent: \n");
        sb.append(m4548h);
        C0923b.m4651g("MessageHelper", sb.toString());
        C0923b.m4642a("MessageHelper", "msgContent size:" + m4548h.getBytes().length);
        LineNumberReader lineNumberReader = new LineNumberReader(new StringReader(m4548h));
        try {
            String readLine = lineNumberReader.readLine();
            String readLine2 = lineNumberReader.readLine();
            if (readLine == null) {
                C0923b.m4646c("MessageHelper", "NO appId");
                return;
            }
            if (readLine2 == null) {
                C0923b.m4646c("MessageHelper", "NO senderId");
                return;
            }
            int length = readLine.length() + readLine2.length() + 2;
            if (m4548h.length() <= length + 1) {
                C0923b.m4642a("MessageHelper", "No msgContent");
                return;
            }
            String substring = m4548h.substring(length);
            if (!readLine2.equals(C0922a.m4630a(context))) {
                C0923b.m4646c("MessageHelper", "msg senderId is not mine appkey,senderId:" + readLine2 + ",appkey:" + C0922a.m4630a(context));
                return;
            }
            C0923b.m4651g("MessageHelper", "Message Fields - appId:" + readLine + ", senderId:" + readLine2 + ", msgContent:" + substring);
            if (m4546f != 0 && m4546f != 2) {
                if (m4546f == 20) {
                    C0916a.m4560a(context, substring, 0, -1L);
                    return;
                } else if (m4546f != 100 && m4546f != 101) {
                    C0923b.m4654j("MessageHelper", "unkown msg type");
                    return;
                }
            }
            m4418a(context, m4546f, substring, readLine, readLine2, m4547g, (byte) 0);
        } catch (Throwable th) {
            C0923b.m4643a("MessageHelper", "Parse msgContent failed", th);
        }
    }

    /* renamed from: b */
    public static void m4421b(Context context, C0899d c0899d) {
        try {
            String m4243b = C0869a.m4243b(context);
            if (TextUtils.isEmpty(m4243b)) {
                C0923b.m4644b("MessageHelper", "not found user push message,use old action to user");
                Intent intent = new Intent("cn.jpush.android.intent.MESSAGE_RECEIVED");
                intent.putExtra("cn.jpush.android.APPKEY", c0899d.f3835b);
                intent.putExtra("cn.jpush.android.MESSAGE", c0899d.f3850l);
                intent.putExtra("cn.jpush.android.CONTENT_TYPE", c0899d.f3851m);
                intent.putExtra("cn.jpush.android.TITLE", c0899d.f3852n);
                intent.putExtra("cn.jpush.android.EXTRA", c0899d.f3853o);
                intent.putExtra("cn.jpush.android.MSG_ID", c0899d.f3837c);
                intent.addCategory(c0899d.f3833a);
                intent.setPackage(context.getPackageName());
                context.sendBroadcast(intent, String.format(Locale.ENGLISH, "%s.permission.JPUSH_MESSAGE", c0899d.f3833a));
                C0923b.m4649e("MessageHelper", "Send broadcast to app: " + String.format(Locale.ENGLISH, "%s.permission.JPUSH_MESSAGE", c0899d.f3833a));
            } else {
                Intent intent2 = new Intent(context, Class.forName(m4243b));
                intent2.setAction("custom_msg");
                intent2.putExtra("data", c0899d.f3845g);
                intent2.putExtra("msgid", c0899d.f3837c);
                intent2.putExtra("appId", c0899d.f3833a);
                intent2.putExtra("senderId", c0899d.f3835b);
                if (!C0869a.m4241a(context) || C0869a.m4237a() == null) {
                    context.sendBroadcast(intent2);
                } else {
                    C0869a.m4237a().mo4777a(context, m4416a(intent2));
                }
            }
            if (c0899d.f3829W != 0) {
                C0930i.m4676a(c0899d.f3837c, "", c0899d.f3829W, 1018, context);
            } else {
                C0930i.m4674a(c0899d.f3837c, 1018, context);
            }
        } catch (Throwable th) {
            C0923b.m4646c("MessageHelper", "sendBroadcastToApp error:" + th.getMessage());
        }
    }
}
