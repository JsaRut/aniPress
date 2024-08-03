package p031c.p032a.p063g;

import android.content.Context;
import android.os.Bundle;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Set;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import org.json.JSONArray;
import p031c.p032a.p048P.p049a.C0557c;
import p031c.p032a.p062f.C0617b;
import p031c.p032a.p062f.C0618c;
import p031c.p032a.p065i.C0661d;
import p031c.p032a.p065i.C0663f;
import p031c.p032a.p066j.C0675a;
import p031c.p032a.p067k.C0678c;
import p031c.p032a.p091r.C0820i;
import p031c.p032a.p091r.C0822k;

/* renamed from: c.a.g.l */
/* loaded from: classes.dex */
public class C0630l {

    /* renamed from: a */
    private static C0630l f2937a;

    /* renamed from: b */
    private int f2938b = 0;

    /* renamed from: c */
    Context f2939c;

    /* renamed from: d */
    public final LinkedList<C0633o> f2940d;

    /* renamed from: e */
    private byte[] f2941e;

    /* renamed from: f */
    private int f2942f;

    private C0630l(Context context) {
        this.f2939c = context;
        this.f2940d = C0633o.m3251a((String) C0618c.m3190a(context, C0617b.m3174l()));
    }

    /* renamed from: a */
    public static C0630l m3237a(Context context) {
        if (f2937a == null) {
            synchronized (C0630l.class) {
                if (f2937a == null) {
                    f2937a = new C0630l(context);
                }
            }
        }
        return f2937a;
    }

    /* renamed from: a */
    private C0634p m3238a(int i) {
        double d2;
        long j;
        double d3;
        String m2915i = C0557c.m2915i(this.f2939c);
        long m2911e = C0557c.m2911e(this.f2939c);
        String m4004b = C0820i.m4004b(this.f2939c);
        long currentTimeMillis = System.currentTimeMillis();
        Object m3386a = C0661d.m3386a(this.f2939c, "get_loc_info", null);
        double d4 = 200.0d;
        if (m3386a instanceof Bundle) {
            try {
                Bundle bundle = (Bundle) m3386a;
                d2 = bundle.getDouble("lat");
                try {
                    d4 = bundle.getDouble("lot");
                    currentTimeMillis = bundle.getLong("time");
                } catch (Throwable unused) {
                }
            } catch (Throwable unused2) {
                d2 = 200.0d;
            }
            j = currentTimeMillis;
            double d5 = d4;
            d4 = d2;
            d3 = d5;
        } else {
            j = currentTimeMillis;
            d3 = 200.0d;
        }
        return new C0634p(i, m2915i, "2.1.2", m2911e, m4004b, d4, d3, j);
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* renamed from: a */
    private synchronized void m3239a(C0633o c0633o) {
        this.f2940d.add(c0633o);
        C0675a.m3469c("SisConnContext", "addSisReportInfo:" + c0633o.m3252a().toString());
        while (this.f2940d.size() > 30) {
            this.f2940d.removeFirst();
        }
        JSONArray jSONArray = new JSONArray();
        Iterator<C0633o> it = this.f2940d.iterator();
        while (it.hasNext()) {
            jSONArray.put(it.next().m3252a());
        }
        Context context = this.f2939c;
        C0617b<String> m3174l = C0617b.m3174l();
        m3174l.m3188a((C0617b<String>) jSONArray.toString());
        C0618c.m3193a(context, (C0617b<?>[]) new C0617b[]{m3174l});
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public static boolean m3241a(InetAddress inetAddress, int i, DatagramSocket datagramSocket, byte[] bArr) {
        try {
            byte[] m3201a = C0621c.m3201a(C0621c.m3200a(datagramSocket, new DatagramPacket(bArr, bArr.length, inetAddress, i)));
            if (m3201a == null || m3201a.length == 0) {
                throw new Exception("byte could not be empty");
            }
            return ((short) (m3201a.length == 1 ? m3201a[0] : ((short) (m3201a[1] & 255)) | ((short) ((m3201a[0] & 255) << 8)))) == 0;
        } catch (Throwable th) {
            C0675a.m3477i("SisConnContext", "report failed : " + th);
            return false;
        }
    }

    /* renamed from: a */
    public final int m3242a() {
        if (this.f2938b == 0) {
            this.f2938b = C0678c.m3485a().m3489a(this.f2939c);
        }
        C0678c.m3485a();
        int m3488b = C0678c.m3488b(this.f2938b);
        C0675a.m3469c("SisConnContext", "ipvsupport=" + this.f2938b + ", prefer=" + m3488b);
        return m3488b;
    }

    /* renamed from: a */
    public final C0632n m3243a(long j) {
        FutureTask futureTask = new FutureTask(new CallableC0628j(this));
        this.f2938b = 0;
        C0557c.m2899a(futureTask);
        try {
            return (C0632n) futureTask.get(j, TimeUnit.MILLISECONDS);
        } catch (InterruptedException | ExecutionException | TimeoutException unused) {
            return null;
        }
    }

    /* renamed from: a */
    public final void m3244a(int i, String str, int i2, long j, long j2, int i3) {
        if (C0626h.m3219a(str, i2)) {
            C0633o c0633o = new C0633o();
            c0633o.f2953a = C0557c.m2915i(this.f2939c);
            c0633o.f2954b = i;
            c0633o.f2955c = new C0626h(str, i2);
            c0633o.f2957e = j;
            c0633o.f2958f = j2;
            c0633o.f2963k = i3;
            c0633o.f2959g = C0820i.m4002a(this.f2939c);
            c0633o.f2956d = C0557c.m2911e(this.f2939c);
            c0633o.f2960h = 200.0d;
            c0633o.f2961i = 200.0d;
            c0633o.f2962j = System.currentTimeMillis();
            Object m3386a = C0661d.m3386a(this.f2939c, "get_loc_info", null);
            if (m3386a instanceof Bundle) {
                try {
                    Bundle bundle = (Bundle) m3386a;
                    c0633o.f2960h = bundle.getDouble("lat");
                    c0633o.f2961i = bundle.getDouble("lot");
                    c0633o.f2962j = bundle.getLong("time");
                } catch (Throwable unused) {
                }
            }
            m3239a(c0633o);
        }
    }

    /* renamed from: a */
    public final void m3245a(C0626h c0626h) {
        if (((Boolean) C0618c.m3190a(this.f2939c, C0617b.m3180r())).booleanValue()) {
            if (C0822k.m4014a(((Long) C0618c.m3190a(this.f2939c, C0617b.m3182t())).longValue(), 3600000L)) {
                C0557c.m2899a(new RunnableC0631m(this, c0626h));
            } else {
                C0675a.m3469c("SisConnContext", "sis report: not yet");
            }
        }
    }

    /* renamed from: a */
    public final void m3246a(boolean z) {
        this.f2938b = (z ? 1 : 2) | this.f2938b;
        C0678c.m3485a().m3490a(this.f2939c, this.f2938b);
    }

    /* renamed from: a */
    public final byte[] m3247a(Set<String> set) {
        int m4002a = C0820i.m4002a(this.f2939c);
        if (this.f2941e == null || m4002a != this.f2942f) {
            this.f2942f = m4002a;
            try {
                this.f2941e = C0621c.m3199a("UG", m3238a(m4002a).m3253a(set).toString());
            } catch (Exception e2) {
                throw new C0663f(2, "Failed to package data - " + e2);
            }
        }
        return this.f2941e;
    }
}
