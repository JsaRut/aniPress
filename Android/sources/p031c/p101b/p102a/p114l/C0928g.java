package p031c.p101b.p102a.p114l;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import java.nio.ByteBuffer;
import java.util.regex.Pattern;
import org.json.JSONObject;
import p000a.p005b.p022d.p023a.C0121j;
import p031c.p032a.p092s.C0830f;
import p031c.p032a.p092s.C0831g;
import p031c.p101b.p102a.C0869a;
import p031c.p101b.p102a.p103a.C0877h;
import p031c.p101b.p102a.p104b.C0883f;
import p031c.p101b.p102a.p105c.C0891c;
import p031c.p101b.p102a.p106d.C0897b;
import p031c.p101b.p102a.p106d.C0899d;
import p031c.p101b.p102a.p107e.C0900a;
import p031c.p101b.p102a.p107e.C0901b;
import p031c.p101b.p102a.p107e.C0902c;
import p031c.p101b.p102a.p109g.C0904a;
import p031c.p101b.p102a.p110h.C0906b;
import p031c.p101b.p102a.p110h.C0907c;
import p031c.p101b.p102a.p111i.C0910a;
import p031c.p101b.p102a.p111i.C0912c;
import p031c.p101b.p102a.p111i.C0913d;
import p031c.p101b.p102a.p111i.C0915f;
import p031c.p101b.p102a.p112j.C0916a;
import p031c.p101b.p102a.p112j.C0917b;
import p031c.p101b.p102a.p113k.C0919a;
import p031c.p101b.p102a.p115m.C0938a;

/* renamed from: c.b.a.l.g */
/* loaded from: classes.dex */
public class C0928g extends AbstractC0927f {

    /* renamed from: a */
    private Boolean f3947a;

    /* renamed from: b */
    private Context f3948b;

    /* renamed from: a */
    private static JSONObject m4666a(ByteBuffer byteBuffer) {
        try {
            byteBuffer.getLong();
            byte[] bArr = new byte[byteBuffer.getShort()];
            byteBuffer.get(bArr);
            String str = new String(bArr, "UTF-8");
            C0923b.m4642a("JPushActionImpl", "parseBundle2Json content: " + str);
            return new JSONObject(str);
        } catch (Exception e2) {
            C0923b.m4653i("JPushActionImpl", "parseBundle2Json exception:" + e2.getMessage());
            return null;
        }
    }

    /* renamed from: a */
    private static void m4667a(Context context, int i, long j) {
        if (i != 10) {
            switch (i) {
                case 26:
                    C0931j.m4678a().m4682a(context, j, C0883f.a.f3723c);
                    return;
                case 27:
                    C0919a.m4607a().m4613b(context, j);
                    return;
                case 28:
                case C0121j.AppCompatTheme_actionModeWebSearchDrawable /* 29 */:
                    break;
                default:
                    return;
            }
        }
        C0916a.m4566a(context, C0917b.m4582a().m4587a(j), C0883f.a.f3723c, j);
    }

    /* renamed from: a */
    private static void m4668a(Context context, Bundle bundle) {
        if (bundle == null) {
            C0923b.m4653i("JPushActionImpl", "[setMaxNotificationNum] bundle is bull");
            return;
        }
        int i = bundle.getInt("num");
        C0923b.m4644b("JPushActionImpl", "action:setMaxNotificationNum :" + i);
        int m4530b = C0907c.m4530b();
        C0923b.m4651g("JPushActionImpl", "number in queue: " + m4530b);
        if (i < m4530b) {
            int i2 = m4530b - i;
            C0923b.m4651g("JPushActionImpl", "decreaseNotification:" + i2);
            C0906b.m4510b(context, i2);
        }
        C0902c.m4452b(context, i);
    }

    /* renamed from: a */
    private static void m4669a(Context context, C0912c c0912c) {
        String str;
        C0923b.m4644b("JPushActionImpl", "action:handleMsg:" + c0912c);
        int m4541a = c0912c.m4541a();
        if (m4541a == 3) {
            C0913d c0913d = new C0913d(c0912c);
            if (C0902c.m4458c(context)) {
                C0923b.m4642a("JPushActionImpl", "JPush was stoped");
                if (c0913d.m4546f() != 20) {
                    return;
                }
            }
            C0897b.m4420a(context, c0913d);
            return;
        }
        if (m4541a != 10) {
            switch (m4541a) {
                case 25:
                    JSONObject m4666a = m4666a(c0912c.m4543c());
                    if (m4666a != null) {
                        if (m4666a.optInt("cmd") != 56) {
                            str = "Unknown command for ctrl";
                            break;
                        } else {
                            C0877h.m4292a(context).m4299a(m4666a);
                            return;
                        }
                    } else {
                        return;
                    }
                case 26:
                    C0910a c0910a = new C0910a(c0912c);
                    C0931j.m4678a().m4682a(context, c0910a.m4544d(), c0910a.m4535f());
                    return;
                case 27:
                    C0910a c0910a2 = new C0910a(c0912c);
                    if (c0910a2.m4535f() == 0) {
                        C0919a.m4607a().m4610a(context, c0912c.m4544d());
                        return;
                    } else {
                        C0919a.m4607a().m4611a(context, c0912c.m4544d(), c0910a2.m4535f());
                        return;
                    }
                case 28:
                case C0121j.AppCompatTheme_actionModeWebSearchDrawable /* 29 */:
                    break;
                default:
                    str = "Unknown command for parsing inbound.";
                    break;
            }
            C0923b.m4653i("JPushActionImpl", str);
            return;
        }
        C0916a.m4560a(context, new C0915f(c0912c).m4558f(), c0912c.m4541a() == 28 ? 1 : 2, c0912c.m4544d());
    }

    /* renamed from: a */
    private boolean m4670a(Context context) {
        Boolean bool = this.f3947a;
        if (bool != null) {
            return bool.booleanValue();
        }
        if (context == null) {
            C0923b.m4654j("JPushActionImpl", "context is null");
            return false;
        }
        this.f3948b = context.getApplicationContext();
        this.f3947a = Boolean.valueOf(C0938a.m4729g(context));
        if (C0869a.m4247e(context)) {
            C0877h.m4292a(context).m4294a();
        }
        return this.f3947a.booleanValue();
    }

    /* renamed from: b */
    private static void m4671b(Context context, Bundle bundle) {
        if (bundle == null) {
            C0923b.m4653i("JPushActionImpl", "[setSilenceTime] bundle is bull");
            return;
        }
        String string = bundle.getString("time");
        C0923b.m4644b("JPushActionImpl", "action:setSilenceTime pushTime:" + string);
        C0902c.m4457c(context, string);
    }

    /* renamed from: c */
    private static void m4672c(Context context, Bundle bundle) {
        if (bundle == null) {
            C0923b.m4653i("JPushActionImpl", "[setPushTime] bundle is bull");
            return;
        }
        C0902c.m4450a(context, true);
        String string = bundle.getString("time");
        if (!Pattern.compile("([0-6]{0,7})_((([0-9]|1[0-9]|2[0-3])\\^([0-9]|1[0-9]|2[0-3]))|(([0-9]|1[0-9]|2[0-3])\\^([0-9]|1[0-9]|2[0-3])-)+(([0-9]|1[0-9]|2[0-3])\\^([0-9]|1[0-9]|2[0-3])))").matcher(string).matches()) {
            C0923b.m4648d("JPushActionImpl", "Invalid time format - " + string);
            return;
        }
        String m4462f = C0902c.m4462f(context);
        if (string.equals(m4462f)) {
            C0923b.m4644b("JPushActionImpl", "Already SetPushTime, give up - " + m4462f);
            return;
        }
        C0923b.m4644b("JPushActionImpl", "action:setPushTime pushTime:" + string);
        C0902c.m4454b(context, string);
    }

    @Override // p031c.p101b.p102a.p114l.AbstractC0927f
    /* renamed from: a */
    public Object mo4665a(Context context, String str, Object obj) {
        String str2;
        int i;
        String str3;
        int i2;
        String str4;
        Bundle bundle;
        Object[] objArr;
        C0923b.m4642a("JPushActionImpl", "handleAction:" + str);
        try {
        } catch (Throwable th) {
            C0923b.m4646c("JPushActionImpl", "handleAction failed:" + th.getMessage());
        }
        if (!m4670a(context)) {
            return null;
        }
        if (context == null) {
            context = this.f3948b;
        }
        Context context2 = context;
        if (TextUtils.isEmpty(str)) {
            C0923b.m4653i("JPushActionImpl", "action is empty");
            return null;
        }
        Bundle bundle2 = obj instanceof Bundle ? (Bundle) obj : null;
        if (str.equals("init")) {
            C0900a<Integer> m4432a = C0900a.m4432a();
            m4432a.m4436a((C0900a<Integer>) 334);
            C0901b.m4440a(context2, (C0900a<?>[]) new C0900a[]{m4432a});
        } else {
            if (str.equals("resume")) {
                C0902c.m4446a(context2, 0);
                str3 = "JPUSH";
                i2 = 1;
                str4 = null;
                bundle = null;
                objArr = new Object[0];
            } else if (str.equals("stop")) {
                C0923b.m4644b("JPushActionImpl", "The service is stopped, it will give up all the actions until you call resumePush method to resume the service");
                C0902c.m4446a(context2, 1);
                str3 = "JPUSH";
                i2 = 0;
                str4 = null;
                bundle = null;
                objArr = new Object[0];
            } else if (str.equals("clear_all_notify")) {
                C0906b.m4499a(context2);
            } else if (str.equals("disable_push")) {
                C0902c.m4450a(context2, false);
            } else if (str.equals("geo_interval")) {
                if (bundle2 != null) {
                    long j = bundle2.getLong("interval", -1L);
                    if (j != -1) {
                        C0877h.m4292a(context2).m4296a(j);
                    }
                }
            } else if (str.equals("max_num")) {
                m4668a(context2, bundle2);
            } else if (str.equals("set_mobile")) {
                C0931j.m4678a().m4683a(context2, bundle2);
            } else if (str.equals("pushtime")) {
                m4672c(context2, bundle2);
            } else if (str.equals("silenceTime")) {
                m4671b(context2, bundle2);
            } else if (str.equals("geo_fence_max_num")) {
                if (bundle2 != null && (i = bundle2.getInt("num", -1)) > 0) {
                    C0877h.m4292a(context2).m4295a(i);
                }
            } else if (str.equals("delete_geo_fence")) {
                if (bundle2 != null) {
                    String string = bundle2.getString("id");
                    if (!TextUtils.isEmpty(string)) {
                        C0877h.m4292a(context2).m4298a(string);
                    }
                }
            } else if (str.equals("msg")) {
                if (obj instanceof C0912c) {
                    m4669a(context2, (C0912c) obj);
                }
            } else if (str.equals("msg_time_out")) {
                if (bundle2 != null) {
                    m4667a(context2, bundle2.getInt("cmd", -1), bundle2.getLong("rid", -1L));
                }
            } else if (str.equals("tagalis")) {
                C0916a.m4570a(context2, bundle2);
            } else if (str.equals("add_local_notify")) {
                if (bundle2 != null) {
                    C0891c.m4377a(context2).m4384a(context2, (C0904a) bundle2.getSerializable("local_notify"));
                }
            } else if (str.equals("rm_local_notify")) {
                if (bundle2 != null) {
                    C0891c.m4377a(context2).m4383a(context2, bundle2.getLong("local_notify_ID"));
                }
            } else if (str.equals("clear_local_notify")) {
                C0891c.m4377a(context2).m4385b(context2);
            } else {
                if (str.equals("show_local_notify")) {
                    if (C0902c.m4458c(context2)) {
                        C0923b.m4644b("JPushActionImpl", "push has stoped");
                    } else if (bundle2 != null) {
                        String string2 = bundle2.getString("local_notify_msg");
                        if (TextUtils.isEmpty(string2)) {
                            str2 = "local message is empty";
                        } else {
                            C0899d m4427a = C0899d.m4427a(string2, context2.getPackageName(), C0922a.m4630a(context2), 0L);
                            m4427a.m4430a(context2);
                            C0906b.m4502a(context2, m4427a);
                        }
                    }
                } else if (str.equals("set_custom_notify")) {
                    if (bundle2 != null) {
                        int i3 = bundle2.getInt("buidler_id", -1);
                        String string3 = bundle2.getString("buidler_string");
                        C0923b.m4642a("JPushActionImpl", "builderId:" + i3 + ",buildString:" + string3);
                        if (i3 >= 0 && !TextUtils.isEmpty(string3)) {
                            C0902c.m4449a(context2, i3 + "", string3);
                        }
                    }
                } else if ("third_push_upload_regid".equals(str)) {
                    if (bundle2 != null) {
                        C0919a.m4607a().m4612a(context2, bundle2);
                    }
                } else if ("intent.plugin.platform.ON_MESSAGING".equals(str)) {
                    String string4 = bundle2.getString("appId");
                    String string5 = bundle2.getString("senderId");
                    String string6 = bundle2.getString("JMessageExtra");
                    byte b2 = bundle2.getByte("platform");
                    C0923b.m4642a("JPushActionImpl", "appId:" + string4 + ",senderId:" + string5 + ",JMessageExtra:" + string6);
                    if (TextUtils.isEmpty(string6)) {
                        return null;
                    }
                    C0897b.m4418a(context2, 2, string6, TextUtils.isEmpty(string4) ? context2.getPackageName() : string4, TextUtils.isEmpty(string5) ? C0830f.m4048a() : string5, 0L, b2);
                } else if ("change_foreground".equals(str) && bundle2 != null) {
                    boolean z = bundle2.getBoolean("foreground");
                    if (C0869a.f3652g == -1 && z) {
                        C0923b.m4642a("JPushActionImpl", "first in foreground");
                        C0877h.m4292a(context2).m4294a();
                    }
                    C0869a.f3652g = z ? 0 : 1;
                    str2 = "change foregroud:" + C0869a.f3652g;
                }
                C0923b.m4642a("JPushActionImpl", str2);
            }
            C0831g.m4072a(context2, str3, i2, str4, bundle, objArr);
        }
        return null;
    }
}
