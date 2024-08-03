package p031c.p032a.p072p.p073a.p074a;

import android.content.Context;
import android.os.Bundle;
import java.util.concurrent.ConcurrentHashMap;
import p031c.p032a.p072p.p073a.p080f.p081a.C0732b;
import p031c.p032a.p072p.p073a.p080f.p087g.C0766h;
import p031c.p032a.p092s.C0830f;
import p031c.p032a.p092s.EnumC0837m;
import p031c.p032a.p092s.p093a.C0825b;

/* renamed from: c.a.p.a.a.f */
/* loaded from: classes.dex */
public final class C0696f {

    /* renamed from: a */
    private static final ConcurrentHashMap<Long, String> f3201a = new ConcurrentHashMap<>();

    /* renamed from: a */
    public static void m3572a(long j) {
        String remove = f3201a.remove(Long.valueOf(j));
        if (remove != null) {
            C0732b.m3718b("JAnalyticsActionHelper", "tcp report time out, accountId=" + remove + " rid=" + j);
        }
    }

    /* renamed from: a */
    public static void m3573a(long j, int i) {
        String remove = f3201a.remove(Long.valueOf(j));
        if (remove != null) {
            StringBuilder sb = new StringBuilder("tcp report ");
            sb.append(i == 0 ? "succeed" : "failed");
            sb.append(", accountId=");
            sb.append(remove);
            sb.append(" rid=");
            sb.append(j);
            C0732b.m3718b("JAnalyticsActionHelper", sb.toString());
        }
    }

    /* renamed from: a */
    public static void m3574a(Context context, Bundle bundle) {
        String str;
        if (context == null || bundle == null) {
            str = "onJAnalyticsAction but context or bundle is null";
        } else {
            try {
                String string = bundle.getString("action");
                C0732b.m3718b("JAnalyticsActionHelper", "onJAnalyticsAction bundle=" + bundle.toString());
                if ("intent.TCP_ACCOUNT_ID".equals(string)) {
                    String string2 = bundle.getString("account_id");
                    long m4069e = C0830f.m4069e();
                    int m4067d = C0830f.m4067d();
                    long m4062b = C0830f.m4062b();
                    C0825b c0825b = new C0825b(8192);
                    c0825b.m4037a(0);
                    c0825b.m4042b(0);
                    c0825b.m4042b(26);
                    c0825b.m4043b(m4062b);
                    c0825b.m4039a(m4067d);
                    c0825b.m4043b(m4069e);
                    c0825b.m4042b(8);
                    c0825b.m4042b(1);
                    c0825b.m4040a(C0766h.m3818d(string2));
                    c0825b.m4038a(c0825b.m4036a(), 0);
                    byte[] m4044b = c0825b.m4044b();
                    f3201a.put(Long.valueOf(m4062b), string2);
                    C0830f.m4051a(context, EnumC0837m.JANALYTICS.name(), 20000, m4044b);
                    C0732b.m3718b("JAnalyticsActionHelper", "tcp report accountId=" + string2 + " rid=" + m4062b + " operator=1 property=8");
                    return;
                }
                return;
            } catch (Exception e2) {
                str = "onJAnalyticsAction exception" + e2.getMessage();
            }
        }
        C0732b.m3723f("JAnalyticsActionHelper", str);
    }

    /* renamed from: a */
    public static void m3575a(Context context, String str) {
        if (!C0830f.m4070f()) {
            C0732b.m3718b("JAnalyticsActionHelper", "tcp is disconnected, give up report accountId=" + str);
        } else {
            Bundle bundle = new Bundle();
            bundle.putString("action", "intent.TCP_ACCOUNT_ID");
            bundle.putString("account_id", str);
            C0830f.m4053a(context, EnumC0837m.JANALYTICS.name(), bundle);
        }
    }
}
