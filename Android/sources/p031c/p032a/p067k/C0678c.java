package p031c.p032a.p067k;

import android.content.Context;
import android.text.TextUtils;
import java.net.Inet6Address;
import java.net.InetAddress;
import java.net.NetworkInterface;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map;
import p031c.p032a.p048P.p049a.C0557c;
import p031c.p032a.p062f.C0617b;
import p031c.p032a.p062f.C0618c;
import p031c.p032a.p066j.C0675a;
import p031c.p032a.p091r.C0812a;
import p031c.p032a.p091r.C0819h;
import p031c.p032a.p091r.C0820i;

/* renamed from: c.a.k.c */
/* loaded from: classes.dex */
public class C0678c {

    /* renamed from: a */
    private static int f3133a;

    /* renamed from: b */
    private static C0678c f3134b;

    /* renamed from: c */
    private final Map<String, Integer> f3135c = new HashMap();

    private C0678c() {
    }

    /* renamed from: a */
    private static int m3484a(boolean z) {
        try {
            Enumeration<NetworkInterface> networkInterfaces = NetworkInterface.getNetworkInterfaces();
            boolean z2 = false;
            while (networkInterfaces.hasMoreElements()) {
                NetworkInterface nextElement = networkInterfaces.nextElement();
                if (!C0819h.m3991a(nextElement.getName(), "dummy")) {
                    boolean m3991a = C0819h.m3991a(nextElement.getName(), "wlan");
                    if (!z || m3991a) {
                        Enumeration<InetAddress> inetAddresses = nextElement.getInetAddresses();
                        while (inetAddresses.hasMoreElements()) {
                            InetAddress nextElement2 = inetAddresses.nextElement();
                            if (!nextElement2.isLoopbackAddress() && m3487a(nextElement2)) {
                                if (m3991a) {
                                    return 3;
                                }
                                z2 = true;
                            }
                        }
                    }
                }
            }
            return z2 ? 0 : 1;
        } catch (Exception unused) {
            C0675a.m3475g("IpvxHelper", "checkIpvxSupport:");
            return 0;
        }
    }

    /* renamed from: a */
    public static C0678c m3485a() {
        if (f3134b == null) {
            synchronized (C0678c.class) {
                if (f3134b == null) {
                    f3134b = new C0678c();
                }
            }
        }
        return f3134b;
    }

    /* renamed from: a */
    public static void m3486a(int i) {
        if (i > 3 || i < 0) {
            return;
        }
        f3133a = i;
    }

    /* renamed from: a */
    private static boolean m3487a(InetAddress inetAddress) {
        try {
            if (inetAddress instanceof Inet6Address) {
                if (!inetAddress.getHostAddress().substring(0, 4).equalsIgnoreCase("fe80")) {
                    return true;
                }
            }
        } catch (Throwable unused) {
        }
        return false;
    }

    /* renamed from: b */
    public static int m3488b(int i) {
        int i2 = f3133a;
        if (i2 == 2 || i2 == 1) {
            return f3133a;
        }
        if (i == 1) {
            return 1;
        }
        if (i != 2) {
            return i2;
        }
        return 2;
    }

    /* renamed from: a */
    public final int m3489a(Context context) {
        int i;
        int i2 = 0;
        try {
            String m4005c = C0820i.m4005c(context);
            String str = "";
            boolean equals = "wifi".equals(m4005c);
            if (equals && C0557c.m2924r(context)) {
                str = C0812a.m3957j(context);
            }
            boolean z = !TextUtils.isEmpty(str);
            if (!equals || z) {
                Integer num = this.f3135c.get(m4005c + str);
                if (num != null && num.intValue() != 0) {
                    C0675a.m3469c("IpvxHelper", "net=" + m4005c + " " + str + " get cache support=" + num);
                    return num.intValue();
                }
            }
            if (z) {
                i = ((Integer) C0618c.m3190a(context, C0617b.m3169g(str))).intValue();
                try {
                    C0675a.m3469c("IpvxHelper", "net=" + m4005c + " " + str + " get wifi history support=" + i);
                } catch (Throwable th) {
                    th = th;
                    i2 = i;
                    C0675a.m3475g("IpvxHelper", "getPreferVx e:" + th);
                    return i2;
                }
            } else {
                i = 0;
            }
            if (i == 0) {
                i = m3484a(equals);
                C0675a.m3469c("IpvxHelper", "net=" + m4005c + " " + str + " get networkinterface support=" + i);
                if (z) {
                    C0617b<Integer> m3169g = C0617b.m3169g(str);
                    m3169g.m3188a((C0617b<Integer>) Integer.valueOf(i));
                    C0618c.m3193a(context, (C0617b<?>[]) new C0617b[]{m3169g});
                }
            }
            i2 = i;
            if (!equals || z) {
                this.f3135c.put(m4005c + str, Integer.valueOf(i2));
            }
        } catch (Throwable th2) {
            th = th2;
        }
        return i2;
    }

    /* renamed from: a */
    public final void m3490a(Context context, int i) {
        String m4005c = C0820i.m4005c(context);
        boolean equals = "wifi".equals(m4005c);
        String m3957j = (equals && C0557c.m2924r(context)) ? C0812a.m3957j(context) : "";
        boolean z = !TextUtils.isEmpty(m3957j);
        if (!equals || z) {
            this.f3135c.put(m4005c + m3957j, Integer.valueOf(i));
        }
        if (z) {
            C0617b<Integer> m3169g = C0617b.m3169g(m3957j);
            m3169g.m3188a((C0617b<Integer>) Integer.valueOf(i));
            C0618c.m3193a(context, (C0617b<?>[]) new C0617b[]{m3169g});
        }
    }
}
