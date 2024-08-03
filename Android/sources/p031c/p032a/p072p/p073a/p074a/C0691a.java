package p031c.p032a.p072p.p073a.p074a;

import android.content.Context;
import android.os.SystemClock;
import android.text.TextUtils;
import org.json.JSONObject;
import p031c.p032a.p072p.p073a.C0707b;
import p031c.p032a.p072p.p073a.p075b.C0708a;
import p031c.p032a.p072p.p073a.p075b.InterfaceC0710b;
import p031c.p032a.p072p.p073a.p080f.p081a.C0732b;
import p031c.p032a.p072p.p073a.p080f.p084d.C0745b;
import p031c.p032a.p072p.p073a.p080f.p087g.C0767i;
import p031c.p032a.p092s.C0830f;

/* renamed from: c.a.p.a.a.a */
/* loaded from: classes.dex */
public final class C0691a {
    /* renamed from: a */
    public static void m3563a(C0708a c0708a, InterfaceC0710b interfaceC0710b) {
        int i;
        String str;
        Context m3613a = C0707b.m3613a(null);
        if (m3613a == null) {
            i = 1005;
            str = "failed, please call JAnalyticsInterface.init(context) first";
        } else if (TextUtils.isEmpty(c0708a.m3619a())) {
            i = 1001;
            str = "account_id can not be empty";
        } else {
            JSONObject jSONObject = new JSONObject();
            C0745b m3618a = c0708a.m3618a(jSONObject);
            if (m3618a != null) {
                i = m3618a.m3769a();
                str = m3618a.m3770b();
            } else if (C0767i.m3819a(SystemClock.uptimeMillis())) {
                i = 1003;
                str = "operation is too busy, please try it later";
            } else {
                C0830f.m4064b(c0708a.m3619a());
                C0696f.m3575a(m3613a, c0708a.m3619a());
                C0830f.m4054a(m3613a, C0830f.m4050a(jSONObject, "identify_account"), true);
                i = 0;
                str = "identify account succeed";
            }
        }
        m3564a(interfaceC0710b, i, str);
    }

    /* renamed from: a */
    private static void m3564a(InterfaceC0710b interfaceC0710b, int i, String str) {
        if (interfaceC0710b != null) {
            if (i == 0) {
                C0732b.m3722e("JAnalyticsInterface", str);
            } else {
                C0732b.m3724g("JAnalyticsInterface", "code(" + i + "):" + str);
            }
            interfaceC0710b.mo3636a(i, str);
        }
    }
}
