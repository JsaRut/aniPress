package p031c.p032a.p063g;

import android.content.Context;
import android.os.SystemClock;
import android.text.TextUtils;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.Inet4Address;
import java.net.InetAddress;
import java.util.Set;
import java.util.concurrent.Callable;
import org.json.JSONObject;
import p031c.p032a.p048P.p049a.C0557c;
import p031c.p032a.p062f.C0616a;
import p031c.p032a.p062f.C0617b;
import p031c.p032a.p062f.C0618c;
import p031c.p032a.p065i.C0663f;
import p031c.p032a.p066j.C0675a;
import p031c.p032a.p091r.C0820i;

/* renamed from: c.a.g.q */
/* loaded from: classes.dex */
public final class CallableC0635q implements Callable<C0632n> {

    /* renamed from: a */
    private final C0630l f2974a;

    /* renamed from: b */
    private final C0636r f2975b;

    /* renamed from: c */
    private final C0625g f2976c;

    /* renamed from: d */
    private Set<String> f2977d;

    /* renamed from: e */
    private C0626h f2978e;

    public CallableC0635q(C0630l c0630l, C0626h c0626h, Set<String> set) {
        this.f2974a = c0630l;
        this.f2975b = null;
        this.f2976c = null;
        this.f2978e = c0626h;
        this.f2977d = set;
    }

    public CallableC0635q(C0630l c0630l, C0636r c0636r, C0625g c0625g) {
        this.f2974a = c0630l;
        this.f2975b = c0636r;
        this.f2976c = c0625g;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // java.util.concurrent.Callable
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public C0632n call() {
        try {
            if (this.f2976c == null) {
                return m3255a(this.f2978e);
            }
            return m3255a(this.f2976c.m3213a(this.f2974a.m3242a()));
        } catch (Throwable th) {
            C0675a.m3475g("SisTask", "run e:" + th);
            return null;
        }
    }

    /* renamed from: a */
    private C0632n m3255a(C0626h c0626h) {
        if (c0626h != null && c0626h.f2924c != null) {
            try {
                DatagramSocket datagramSocket = new DatagramSocket();
                if (!TextUtils.isEmpty(C0616a.f2899i)) {
                    c0626h.f2924c = InetAddress.getByName(C0616a.f2899i);
                }
                if (C0616a.f2900j > 0) {
                    c0626h.f2923b = C0616a.f2900j;
                }
                C0675a.m3469c("SisTask", "send sis:" + c0626h.f2924c + " port:" + c0626h.f2923b);
                Object[] m3256a = m3256a(datagramSocket, c0626h.f2924c, c0626h.f2923b);
                if (m3256a[0] instanceof C0632n) {
                    boolean z = c0626h.f2924c instanceof Inet4Address;
                    this.f2974a.m3246a(z);
                    Context context = this.f2974a.f2939c;
                    C0617b<String> m3155a = C0617b.m3155a(z);
                    m3155a.m3188a((C0617b<String>) c0626h.toString());
                    C0618c.m3193a(context, (C0617b<?>[]) new C0617b[]{m3155a});
                    if (this.f2975b != null) {
                        this.f2975b.m3263a(m3256a[0]);
                    }
                    return (C0632n) m3256a[0];
                }
                int intValue = ((Integer) m3256a[0]).intValue();
                long longValue = ((Long) m3256a[1]).longValue();
                C0675a.m3475g("SisTask", "sis failed(" + intValue + "):" + c0626h.f2924c + " port:" + c0626h.f2923b);
                this.f2974a.m3244a(1, c0626h.f2924c.getHostAddress(), c0626h.f2923b, C0557c.m2916j(this.f2974a.f2939c), longValue, intValue);
            } catch (Throwable th) {
                C0675a.m3475g("SisTask", "sis e:" + th);
            }
        }
        return null;
    }

    /* renamed from: a */
    private Object[] m3256a(DatagramSocket datagramSocket, InetAddress inetAddress, int i) {
        Object[] objArr = new Object[2];
        objArr[1] = 0;
        try {
            byte[] m3247a = this.f2974a.m3247a(this.f2977d);
            DatagramPacket datagramPacket = new DatagramPacket(m3247a, m3247a.length, inetAddress, i);
            long uptimeMillis = SystemClock.uptimeMillis();
            try {
                byte[] m3200a = C0621c.m3200a(datagramSocket, datagramPacket);
                objArr[1] = Long.valueOf(SystemClock.uptimeMillis() - uptimeMillis);
                try {
                    C0632n c0632n = new C0632n(new String(C0621c.m3201a(m3200a)));
                    if (c0632n.m3249a()) {
                        objArr[0] = 6;
                        return objArr;
                    }
                    Context context = this.f2974a.f2939c;
                    if (!c0632n.m3249a()) {
                        String m3217a = C0626h.m3217a(c0632n.f2945a);
                        String m3217a2 = C0626h.m3217a(c0632n.f2946b);
                        String m4005c = C0820i.m4005c(context);
                        C0675a.m3469c("SisTask", "updateSisInfo ips=" + m3217a + " sslIps=" + m3217a2 + " net=" + m4005c);
                        C0617b[] c0617bArr = new C0617b[8];
                        C0617b<String> m3178p = C0617b.m3178p();
                        m3178p.m3188a((C0617b<String>) m3217a);
                        c0617bArr[0] = m3178p;
                        C0617b<String> m3179q = C0617b.m3179q();
                        m3179q.m3188a((C0617b<String>) m3217a2);
                        c0617bArr[1] = m3179q;
                        C0617b<String> m3161c = C0617b.m3161c(false);
                        m3161c.m3188a((C0617b<String>) C0626h.m3217a(c0632n.f2947c));
                        c0617bArr[2] = m3161c;
                        C0617b<String> m3161c2 = C0617b.m3161c(true);
                        m3161c2.m3188a((C0617b<String>) C0626h.m3217a(c0632n.f2948d));
                        c0617bArr[3] = m3161c2;
                        C0617b<String> m3183u = C0617b.m3183u();
                        m3183u.m3188a((C0617b<String>) C0626h.m3217a(c0632n.f2949e));
                        c0617bArr[4] = m3183u;
                        C0617b<String> m3186x = C0617b.m3186x();
                        JSONObject jSONObject = c0632n.f2950f;
                        m3186x.m3188a((C0617b<String>) (jSONObject != null ? jSONObject.toString() : null));
                        c0617bArr[5] = m3186x;
                        C0617b<Boolean> m3180r = C0617b.m3180r();
                        m3180r.m3188a((C0617b<Boolean>) Boolean.valueOf(c0632n.f2952h));
                        c0617bArr[6] = m3180r;
                        C0617b<Long> m3181s = C0617b.m3181s();
                        m3181s.m3188a((C0617b<Long>) Long.valueOf(SystemClock.elapsedRealtime()));
                        c0617bArr[7] = m3181s;
                        C0618c.m3193a(context, (C0617b<?>[]) c0617bArr);
                        C0617b<String> m3173k = C0617b.m3173k();
                        m3173k.m3188a((C0617b<String>) m4005c);
                        C0618c.m3193a(context, (C0617b<?>[]) new C0617b[]{m3173k});
                    }
                    c0632n.f2951g = new C0626h(inetAddress, i);
                    objArr[0] = c0632n;
                    return objArr;
                } catch (C0663f e2) {
                    objArr[0] = Integer.valueOf(e2.f3069a);
                    return objArr;
                }
            } catch (Exception unused) {
                objArr[0] = 3;
                objArr[1] = Long.valueOf(SystemClock.uptimeMillis() - uptimeMillis);
                return objArr;
            }
        } catch (C0663f e3) {
            objArr[0] = Integer.valueOf(e3.f3069a);
            return objArr;
        }
    }
}
