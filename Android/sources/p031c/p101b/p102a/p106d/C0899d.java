package p031c.p101b.p102a.p106d;

import android.content.Context;
import android.text.TextUtils;
import java.io.Serializable;
import java.util.ArrayList;
import org.json.JSONObject;
import p031c.p101b.p102a.p104b.C0886i;
import p031c.p101b.p102a.p114l.C0923b;
import p031c.p101b.p102a.p114l.C0930i;
import p031c.p101b.p102a.p115m.C0938a;
import p031c.p101b.p102a.p115m.C0943f;

/* renamed from: c.b.a.d.d */
/* loaded from: classes.dex */
public class C0899d implements Serializable {

    /* renamed from: A */
    public String f3807A;

    /* renamed from: B */
    public String f3808B;

    /* renamed from: E */
    public String f3811E;

    /* renamed from: F */
    public String f3812F;

    /* renamed from: G */
    public String f3813G;

    /* renamed from: H */
    public String f3814H;

    /* renamed from: I */
    public int f3815I;

    /* renamed from: J */
    public String f3816J;

    /* renamed from: K */
    public String f3817K;

    /* renamed from: L */
    public int f3818L;

    /* renamed from: N */
    public String f3820N;

    /* renamed from: O */
    public String f3821O;

    /* renamed from: P */
    public String f3822P;

    /* renamed from: Q */
    public int f3823Q;

    /* renamed from: S */
    public int f3825S;

    /* renamed from: X */
    public String f3830X;

    /* renamed from: Y */
    public long f3831Y;

    /* renamed from: Z */
    public String f3832Z;

    /* renamed from: a */
    public String f3833a;

    /* renamed from: aa */
    public boolean f3834aa;

    /* renamed from: b */
    public String f3835b;

    /* renamed from: ba */
    public long f3836ba;

    /* renamed from: c */
    public String f3837c;

    /* renamed from: d */
    public int f3839d;

    /* renamed from: e */
    public int f3841e;

    /* renamed from: ea */
    public String f3842ea;

    /* renamed from: f */
    public String f3843f;

    /* renamed from: fa */
    public String f3844fa;

    /* renamed from: g */
    public String f3845g;

    /* renamed from: h */
    public int f3846h;

    /* renamed from: i */
    public boolean f3847i;

    /* renamed from: j */
    public int f3848j;

    /* renamed from: l */
    public String f3850l;

    /* renamed from: m */
    public String f3851m;

    /* renamed from: n */
    public String f3852n;

    /* renamed from: o */
    public String f3853o;

    /* renamed from: p */
    public int f3854p;

    /* renamed from: q */
    public boolean f3855q;

    /* renamed from: r */
    public int f3856r;

    /* renamed from: s */
    public String f3857s;

    /* renamed from: t */
    public String f3858t;

    /* renamed from: u */
    public String f3859u;

    /* renamed from: v */
    public int f3860v;

    /* renamed from: w */
    public String f3861w;

    /* renamed from: x */
    public String f3862x;

    /* renamed from: y */
    public String f3863y;

    /* renamed from: z */
    public int f3864z;

    /* renamed from: k */
    public int f3849k = 0;

    /* renamed from: C */
    public int f3809C = -1;

    /* renamed from: D */
    public String f3810D = "";

    /* renamed from: M */
    public boolean f3819M = false;

    /* renamed from: R */
    public int f3824R = 0;

    /* renamed from: T */
    public ArrayList<String> f3826T = new ArrayList<>();

    /* renamed from: U */
    public String f3827U = "";

    /* renamed from: V */
    public String f3828V = "";

    /* renamed from: W */
    public byte f3829W = 0;

    /* renamed from: ca */
    public double f3838ca = 200.0d;

    /* renamed from: da */
    public double f3840da = 200.0d;

    /* renamed from: a */
    public static C0899d m4426a(Context context, String str, String str2) {
        String str3;
        C0899d c0899d = new C0899d();
        byte b2 = 0;
        try {
            JSONObject jSONObject = new JSONObject(str);
            c0899d.f3837c = jSONObject.optString("_jmsgid_");
            if (c0899d.f3837c.isEmpty()) {
                c0899d.f3837c = jSONObject.optString("msg_id");
            }
            c0899d.f3829W = (byte) jSONObject.optInt("rom_type");
            int optInt = jSONObject.optInt("show_type", -1);
            JSONObject optJSONObject = jSONObject.optJSONObject("m_content");
            if (optJSONObject != null) {
                c0899d.f3859u = optJSONObject.optString("n_content");
                c0899d.f3857s = optJSONObject.optString("n_title");
                c0899d.f3808B = optJSONObject.optString("n_extras");
                c0899d.f3810D = optJSONObject.optString("n_channel_id");
                c0899d.f3856r = optJSONObject.optInt("n_flag", 1);
                JSONObject optJSONObject2 = optJSONObject.optJSONObject("rich_content");
                if (optJSONObject2 != null) {
                    c0899d.f3819M = true;
                    c0899d.m4428a(optJSONObject2);
                    c0899d.f3846h = 3;
                } else {
                    c0899d.f3846h = 4;
                    c0899d.f3824R = -1;
                }
            } else {
                c0899d.f3859u = jSONObject.optString("n_content");
                c0899d.f3857s = jSONObject.optString("n_title");
                c0899d.f3808B = jSONObject.optString("n_extras");
                c0899d.f3810D = jSONObject.optString("n_channel_id");
                c0899d.f3829W = (byte) jSONObject.optInt("rom_type");
            }
            if (optInt != -1) {
                c0899d.f3846h = optInt;
            }
            c0899d.f3854p = 0;
            c0899d.f3855q = true;
            c0899d.f3833a = context.getPackageName();
            return c0899d;
        } catch (Throwable th) {
            C0923b.m4646c("PushEntity", "parseContent error:" + th);
            if (TextUtils.isEmpty(c0899d.f3837c)) {
                str3 = "NO MSGID";
            } else {
                str3 = c0899d.f3837c;
                b2 = c0899d.f3829W;
            }
            C0930i.m4676a(str3, str2, b2, 996, context);
            return null;
        }
    }

    /* renamed from: a */
    public static C0899d m4427a(String str, String str2, String str3, long j) {
        C0899d c0899d;
        JSONObject jSONObject;
        try {
            jSONObject = new JSONObject(str);
            c0899d = new C0899d();
        } catch (Throwable th) {
            th = th;
            c0899d = null;
        }
        try {
            String optString = jSONObject.optString("msg_id", "");
            if (TextUtils.isEmpty(optString)) {
                optString = jSONObject.optString("ad_id", "");
            }
            if (TextUtils.isEmpty(optString)) {
                optString = jSONObject.optString("_jmsgid_", "");
            }
            if (TextUtils.isEmpty(optString)) {
                optString = j + "";
            }
            C0923b.m4642a("PushEntity", "preParseOriginalMsgMessage msgId = " + optString);
            c0899d.f3837c = optString;
            c0899d.f3833a = str2;
            c0899d.f3835b = str3;
            boolean z = true;
            if (jSONObject.optInt("n_only", 0) != 1) {
                z = false;
            }
            int optInt = z ? jSONObject.optInt("n_builder_id", 0) : 0;
            c0899d.f3847i = z;
            c0899d.f3848j = optInt;
            c0899d.f3845g = str;
            c0899d.f3846h = jSONObject.optInt("show_type", 3);
            c0899d.f3849k = jSONObject.optInt("notificaion_type", 0);
            c0899d.f3843f = jSONObject.optString("override_msg_id", "");
            c0899d.f3850l = jSONObject.optString("message", "");
            c0899d.f3851m = jSONObject.optString("content_type", "");
            c0899d.f3852n = jSONObject.optString("title", "");
            c0899d.f3853o = jSONObject.optString("extras", "");
        } catch (Throwable th2) {
            th = th2;
            C0923b.m4653i("PushEntity", "processMessage failed:" + th.getMessage());
            return c0899d;
        }
        return c0899d;
    }

    /* renamed from: a */
    private void m4428a(JSONObject jSONObject) {
        this.f3819M = true;
        this.f3820N = jSONObject.optString("e_url", "").trim();
        this.f3821O = jSONObject.optString("e_title", "").trim();
        if (!TextUtils.isEmpty(this.f3820N) && !C0938a.m4718a(this.f3820N)) {
            this.f3820N = "http://" + this.f3820N;
            C0923b.m4649e("PushEntity", "Add http to non-prefix url: " + this.f3820N);
        }
        this.f3824R = jSONObject.optInt("e_rich_type", 0);
        this.f3823Q = jSONObject.optInt("e_jump_mode", 0);
        this.f3825S = jSONObject.optInt("e_show", 0);
        int i = this.f3824R;
        if (3 == i || 2 == i || 1 == i) {
            this.f3826T = C0943f.m4754a(jSONObject.optJSONArray("e_eres"));
        }
        this.f3827U = jSONObject.optString("from_num", "");
        this.f3828V = jSONObject.optString("to_num", "");
    }

    /* renamed from: a */
    public C0896a m4429a() {
        return new C0896a(this);
    }

    /* renamed from: a */
    public void m4430a(Context context) {
        try {
            JSONObject optJSONObject = new JSONObject(this.f3845g).optJSONObject("m_content");
            int optInt = optJSONObject.optInt("ad_t", 0);
            this.f3854p = optInt;
            if (optInt != 0) {
                return;
            }
            this.f3855q = optJSONObject.optInt("full_screen", 0) >= 1;
            this.f3856r = optJSONObject.optInt("n_flag", 1);
            this.f3857s = optJSONObject.optString("n_title", "");
            this.f3858t = optJSONObject.optString("n_app_name", "");
            this.f3859u = optJSONObject.optString("n_content", "");
            this.f3860v = optJSONObject.optInt("n_style", 0);
            this.f3861w = optJSONObject.optString("n_big_text", "");
            this.f3862x = optJSONObject.optString("n_big_pic_path", "");
            this.f3863y = optJSONObject.optString("n_inbox", "");
            this.f3808B = optJSONObject.optString("n_extras", "");
            this.f3864z = optJSONObject.optInt("n_priority", 0);
            this.f3807A = optJSONObject.optString("n_category", "");
            this.f3809C = optJSONObject.optInt("n_alert_type", -1);
            this.f3810D = optJSONObject.optString("n_channel_id");
            this.f3812F = optJSONObject.optString("n_small_icon", "");
            this.f3813G = optJSONObject.optString("n_large_icon", "");
            this.f3811E = optJSONObject.optString("n_source", "");
            JSONObject optJSONObject2 = optJSONObject.optJSONObject("n_intent");
            if (optJSONObject2 != null) {
                this.f3814H = optJSONObject2.optString("n_url", "");
                this.f3815I = optJSONObject2.optInt("n_fail_handle_type", 0);
                this.f3816J = optJSONObject2.optString("n_fail_handle_url", "");
                this.f3817K = optJSONObject2.optString("n_package_name", "");
                this.f3818L = optJSONObject2.optInt("n_builder_id", 0);
            }
            if (TextUtils.isEmpty(this.f3857s)) {
                C0923b.m4644b("PushEntity", "Not found notificaiton title for developer mode. Use the application name.");
                this.f3857s = C0938a.m4719b(context);
            }
            JSONObject optJSONObject3 = optJSONObject.optJSONObject("ad_content");
            if (optJSONObject.isNull("ad_content") || optJSONObject3 == null) {
                return;
            }
            m4428a(optJSONObject3);
        } catch (Throwable th) {
            C0923b.m4654j("PushEntity", "parse notification failed:" + th.getMessage());
        }
    }

    /* renamed from: b */
    public C0886i m4431b() {
        C0886i c0886i = new C0886i();
        c0886i.f3753a = this.f3835b;
        c0886i.f3754b = this.f3837c;
        c0886i.f3756d = this.f3809C;
        c0886i.f3764l = this.f3862x;
        c0886i.f3763k = this.f3861w;
        c0886i.f3762j = this.f3848j;
        c0886i.f3767o = this.f3807A;
        c0886i.f3755c = this.f3859u;
        c0886i.f3760h = this.f3808B;
        c0886i.f3768p = this.f3839d;
        c0886i.f3765m = this.f3863y;
        c0886i.f3759g = this.f3813G;
        c0886i.f3766n = this.f3864z;
        c0886i.f3758f = this.f3812F;
        c0886i.f3761i = this.f3860v;
        c0886i.f3757e = this.f3857s;
        c0886i.f3771s = this.f3833a;
        c0886i.f3772t = this.f3849k;
        c0886i.f3769q = this.f3844fa;
        c0886i.f3773u = this.f3810D;
        return c0886i;
    }

    public String toString() {
        return "PushEntity{appId='" + this.f3833a + "', senderId='" + this.f3835b + "', messageId='" + this.f3837c + "', messageType=" + this.f3841e + ", overrideMessageId='" + this.f3843f + "', originalMessage='" + this.f3845g + "', messageVersion=" + this.f3846h + ", notificationOnly=" + this.f3847i + ", notificationBuilderId=" + this.f3848j + ", notificationType=" + this.f3849k + ", message='" + this.f3850l + "', contentType='" + this.f3851m + "', title='" + this.f3852n + "', extras='" + this.f3853o + "', type=" + this.f3854p + ", isFullScreen=" + this.f3855q + ", notificationRemoveMode=" + this.f3856r + ", notificationTitle='" + this.f3857s + "', notificationContent='" + this.f3859u + "', notificationStyle=" + this.f3860v + ", notificationBigText='" + this.f3861w + "', notificationBigPicPath='" + this.f3862x + "', notificationInbox='" + this.f3863y + "', notificationPriority=" + this.f3864z + ", notificationCategory='" + this.f3807A + "', notificationExtra='" + this.f3808B + "', notificationAlertType=" + this.f3809C + ", source='" + this.f3811E + "', smallIcon='" + this.f3812F + "', largeIcon='" + this.f3813G + "', deeplink='" + this.f3814H + "', deeplinkBuilderId=" + this.f3818L + ", failedAction=" + this.f3815I + ", failedLink='" + this.f3816J + "', targetPkgName='" + this.f3817K + "', isRichPush=" + this.f3819M + ", showUrl='" + this.f3820N + "', showTitle='" + this.f3821O + "', jumpMode=" + this.f3823Q + ", richType=" + this.f3824R + ", showMode=" + this.f3825S + ", showResourceList=" + this.f3826T + ", fromNum='" + this.f3827U + "', toNum='" + this.f3828V + "', platform=" + ((int) this.f3829W) + '}';
    }
}
