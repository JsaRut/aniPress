package p031c.p032a.p064h;

import android.content.Context;
import android.text.TextUtils;
import android.util.Pair;
import java.io.IOException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Map;
import p031c.p032a.p062f.C0617b;
import p031c.p032a.p062f.C0618c;
import p031c.p032a.p063g.C0626h;
import p031c.p032a.p066j.C0675a;
import p031c.p032a.p067k.C0676a;

/* renamed from: c.a.h.m */
/* loaded from: classes.dex */
public final class C0653m {

    /* renamed from: a */
    private static volatile C0653m f3040a;

    /* renamed from: b */
    private static final Object f3041b = new Object();

    /* renamed from: c */
    private long f3042c = 86400000;

    /* renamed from: d */
    private long f3043d = 1800000;

    /* renamed from: e */
    private final Map<String, Pair<LinkedHashSet<C0626h>, Long>> f3044e = new HashMap();

    private C0653m() {
    }

    /* renamed from: a */
    public static C0653m m3358a() {
        if (f3040a == null) {
            synchronized (f3041b) {
                if (f3040a == null) {
                    f3040a = new C0653m();
                }
            }
        }
        return f3040a;
    }

    /* renamed from: a */
    public static LinkedHashSet<C0626h> m3359a(String str) {
        String[] m3357a;
        C0646f c0646f;
        AbstractC0650j m3299a;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            byte[] m3301b = C0646f.m3298a(AbstractC0650j.m3333a(C0648h.m3309a(C0648h.m3310a(str), C0648h.f3020c), 33, 1)).m3301b(65535);
            C0675a.m3469c("SRVLoader", "srv host:" + str);
            LinkedHashSet<C0626h> linkedHashSet = new LinkedHashSet<>();
            try {
                m3357a = C0652l.m3351b().m3357a();
            } catch (Throwable th) {
                C0675a.m3476h("SRVLoader", "Get default ports error with Exception:" + th);
            }
            if (m3357a != null && m3357a.length != 0) {
                LinkedHashSet<InetAddress> linkedHashSet2 = new LinkedHashSet();
                C0676a m3479a = C0676a.m3479a();
                int length = m3357a.length;
                int i = 0;
                while (i < length) {
                    int i2 = i;
                    InetAddress[] m3482a = m3479a.m3482a(null, m3357a[i], 3000L, false);
                    InetAddress inetAddress = (m3482a == null || m3482a.length <= 0) ? null : m3482a[0];
                    if (inetAddress != null) {
                        linkedHashSet2.add(inetAddress);
                    }
                    i = i2 + 1;
                }
                for (InetAddress inetAddress2 : linkedHashSet2) {
                    try {
                        c0646f = new C0646f(C0657q.m3368a(null, new InetSocketAddress(inetAddress2, 53), m3301b, System.currentTimeMillis() + 1000));
                        m3299a = c0646f.m3299a();
                    } catch (IOException e2) {
                        C0675a.m3475g("SRVLoader", "tcp send to " + inetAddress2.getHostAddress() + " err:" + e2);
                    }
                    if (m3299a == null) {
                        break;
                    }
                    for (C0649i c0649i : c0646f.m3300a(1)) {
                        if (c0649i.m3331b().m3345e() == m3299a.m3345e() && c0649i.m3331b().m3344d() == m3299a.m3343c() && c0649i.m3331b().m3342b().equals(m3299a.m3342b())) {
                            Iterator m3329a = c0649i.m3329a();
                            while (m3329a.hasNext()) {
                                C0655o c0655o = (C0655o) m3329a.next();
                                if (c0655o.m3362h() > 0) {
                                    String c0648h = c0655o.m3363i().toString();
                                    if (!TextUtils.isEmpty(c0648h)) {
                                        if (c0648h.endsWith(".")) {
                                            c0648h = c0648h.substring(0, c0648h.length() - 1);
                                        }
                                        C0626h c0626h = new C0626h(c0648h, c0655o.m3362h());
                                        if (c0626h.m3221a()) {
                                            linkedHashSet.add(c0626h);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                return linkedHashSet;
            }
            return linkedHashSet;
        } catch (IOException e3) {
            C0675a.m3475g("SRVLoader", "can't srv, create query:" + e3);
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static /* synthetic */ void m3360a(C0653m c0653m, String str, Pair pair) {
        Object obj = pair.first;
        if (obj == null || ((LinkedHashSet) obj).size() <= 0 || pair.second == null) {
            return;
        }
        c0653m.f3044e.put(str, pair);
        StringBuilder sb = new StringBuilder();
        Iterator it = ((LinkedHashSet) pair.first).iterator();
        while (it.hasNext()) {
            sb.append(((C0626h) it.next()).toString());
            sb.append(",");
        }
        sb.deleteCharAt(sb.length() - 1);
        C0617b<String> m3163d = C0617b.m3163d(str);
        m3163d.m3188a((C0617b<String>) sb.toString());
        C0617b m3165e = C0617b.m3165e(str);
        m3165e.m3188a((C0617b) pair.second);
        C0618c.m3193a((Context) null, (C0617b<?>[]) new C0617b[]{m3163d, m3165e});
    }

    /* JADX WARN: Can't wrap try/catch for region: R(13:5|(1:66)(1:11)|(1:13)(1:65)|14|(4:16|(2:18|(4:20|(3:22|(2:26|27)|28)|31|32))(1:63)|33|(8:35|(1:37)|38|(4:40|(1:61)(1:44)|45|(1:47))(1:62)|48|49|50|(2:56|57)(2:54|55)))|64|(0)(0)|48|49|50|(1:52)|56|57) */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x00e8, code lost:            r0 = move-exception;     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x00e9, code lost:            p031c.p032a.p066j.C0675a.m3475g("SRVLoader", "run futureTask e:" + r0);        r4 = null;     */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00ce  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.util.LinkedHashSet<p031c.p032a.p063g.C0626h> m3361a(java.lang.String r19, long r20) {
        /*
            Method dump skipped, instructions count: 295
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p031c.p032a.p064h.C0653m.m3361a(java.lang.String, long):java.util.LinkedHashSet");
    }
}
