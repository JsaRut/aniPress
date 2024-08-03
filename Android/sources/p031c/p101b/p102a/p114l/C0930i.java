package p031c.p101b.p102a.p114l;

import android.content.Context;
import android.text.TextUtils;
import org.json.JSONException;
import org.json.JSONObject;
import p031c.p032a.p092s.C0831g;

/* renamed from: c.b.a.l.i */
/* loaded from: classes.dex */
public class C0930i {
    /* renamed from: a */
    public static void m4673a(Context context, JSONObject jSONObject) {
        if (context == null) {
            throw new IllegalArgumentException("NULL context");
        }
        if (jSONObject == null || jSONObject.length() <= 0) {
            return;
        }
        C0923b.m4642a("JPushReportHelper", "action:reportOperation - content:" + jSONObject.toString());
        C0831g.m4072a(context, "JPUSH", 14, null, null, jSONObject);
    }

    /* renamed from: a */
    public static void m4674a(String str, int i, Context context) {
        m4675a(str, i, null, context);
    }

    /* renamed from: a */
    public static void m4675a(String str, int i, String str2, Context context) {
        if (context == null) {
            C0923b.m4642a("JPushReportHelper", "context did not init, return");
            return;
        }
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("action:reportActionResult - messageId: " + str + ", code: " + i + "-" + C0935n.m4699a(i));
        if (!TextUtils.isEmpty(str2)) {
            stringBuffer.append(" report content: " + str2);
        }
        C0923b.m4642a("JPushReportHelper", stringBuffer.toString());
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("msg_id", str);
            jSONObject.put("result", i);
            if (!TextUtils.isEmpty(str2)) {
                jSONObject.put("data", str2);
            }
            JSONObject m4631a = C0922a.m4631a(context, jSONObject, "msg_status");
            m4631a.put("type", "msg_status");
            m4673a(context, m4631a);
        } catch (JSONException unused) {
        }
    }

    /* renamed from: a */
    public static void m4676a(String str, String str2, byte b2, int i, Context context) {
        if (context == null) {
            C0923b.m4642a("JPushReportHelper", "context did not init, return");
            return;
        }
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("action:reportThirdSDKMsgActionResult - messageId: " + str + ", code: " + i);
        C0923b.m4642a("JPushReportHelper", stringBuffer.toString());
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("msg_id", str);
            jSONObject.put("tmsg_id", str2);
            jSONObject.put("result", i);
            jSONObject.put("sdk_type", (int) b2);
            JSONObject m4631a = C0922a.m4631a(context, jSONObject, "third_msg_status");
            m4631a.put("type", "third_msg_status");
            m4673a(context, m4631a);
        } catch (JSONException unused) {
        }
    }
}
