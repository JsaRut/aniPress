package p031c.p032a.p063g;

import android.os.SystemClock;
import android.text.TextUtils;
import java.net.InetAddress;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;
import java.util.concurrent.TimeUnit;
import p031c.p032a.p062f.C0616a;
import p031c.p032a.p062f.C0617b;
import p031c.p032a.p062f.C0618c;
import p031c.p032a.p064h.C0653m;
import p031c.p032a.p065i.C0663f;
import p031c.p032a.p066j.C0675a;
import p031c.p032a.p067k.C0676a;
import p031c.p032a.p091r.C0822k;
import p031c.p032a.p092s.C0831g;

/* renamed from: c.a.g.k */
/* loaded from: classes.dex */
public final class C0629k {

    /* renamed from: b */
    private C0630l f2932b;

    /* renamed from: c */
    private RunnableC0627i f2933c;

    /* renamed from: f */
    private CallableC0635q f2936f;

    /* renamed from: a */
    private LinkedHashSet<C0626h> f2931a = new LinkedHashSet<>();

    /* renamed from: d */
    private C0636r f2934d = new C0636r(5, 2000, null);

    /* renamed from: e */
    private C0625g f2935e = new C0625g();

    public C0629k(C0630l c0630l) {
        this.f2932b = c0630l;
    }

    /* renamed from: a */
    private void m3231a() {
        C0626h m3216a = C0626h.m3216a((String) C0618c.m3190a(this.f2932b.f2939c, C0617b.m3158b(true)));
        C0675a.m3469c("SisConn", "connect: use last good v4 address=" + m3216a);
        if (m3234a(m3216a)) {
            return;
        }
        C0626h m3216a2 = C0626h.m3216a((String) C0618c.m3190a(this.f2932b.f2939c, C0617b.m3158b(false)));
        C0675a.m3469c("SisConn", "connect: use last good v6 address=" + m3216a2);
        if (m3234a(m3216a2)) {
            return;
        }
        LinkedHashSet<C0626h> m3235b = m3235b();
        if (m3235b != null) {
            m3235b.removeAll(this.f2931a);
        }
        LinkedList m4012a = C0822k.m4012a(m3235b);
        C0675a.m3469c("SisConn", "connect: use defaultConn=" + m4012a);
        Iterator it = m4012a.iterator();
        while (it.hasNext()) {
            if (m3234a((C0626h) it.next())) {
                return;
            }
        }
        LinkedHashSet<C0626h> m3361a = C0653m.m3358a().m3361a(C0616a.m3149b(this.f2932b.f2939c), 10000L);
        m4012a.clear();
        if (m3361a != null) {
            m3361a.removeAll(this.f2931a);
            m4012a = C0822k.m4012a(m3361a);
        }
        C0675a.m3469c("SisConn", "connect: use srv address" + m4012a);
        Iterator it2 = m4012a.iterator();
        while (it2.hasNext() && !m3234a((C0626h) it2.next())) {
        }
    }

    /* renamed from: a */
    private void m3232a(LinkedHashSet<C0626h> linkedHashSet) {
        linkedHashSet.removeAll(this.f2931a);
        if (linkedHashSet.isEmpty()) {
            return;
        }
        LinkedHashSet<C0626h> m3208a = C0623e.m3208a(this.f2932b.f2939c, linkedHashSet, 0L);
        C0675a.m3469c("SisConn", "connect: last good sis info" + m3208a);
        Iterator<C0626h> it = m3208a.iterator();
        while (it.hasNext() && !m3234a(it.next())) {
        }
    }

    /* renamed from: a */
    private void m3233a(LinkedHashSet<C0626h> linkedHashSet, long j) {
        InetAddress[] m3482a;
        this.f2935e.m3214a();
        this.f2934d.m3266b();
        linkedHashSet.removeAll(this.f2931a);
        LinkedHashSet<C0626h> m3208a = C0623e.m3208a(this.f2932b.f2939c, linkedHashSet, System.currentTimeMillis());
        C0675a.m3469c("SisConn", "connect: new sis info=" + m3208a);
        if (m3208a.isEmpty()) {
            return;
        }
        Iterator<C0626h> it = m3208a.iterator();
        while (it.hasNext()) {
            C0626h next = it.next();
            if (SystemClock.uptimeMillis() >= j || m3234a(next)) {
                return;
            }
        }
        C0675a.m3469c("SisConn", "after connect use new sis, wait connect Result");
        long uptimeMillis = j - SystemClock.uptimeMillis();
        if (uptimeMillis > 0 && this.f2934d.m3262a(uptimeMillis) == null && this.f2936f == null) {
            HashSet hashSet = new HashSet();
            Iterator<C0626h> it2 = m3208a.iterator();
            while (it2.hasNext()) {
                C0626h next2 = it2.next();
                if (this.f2931a.contains(next2)) {
                    hashSet.add(next2.f2922a);
                }
            }
            int m3242a = this.f2932b.m3242a();
            C0626h m3216a = C0626h.m3216a((String) C0618c.m3190a(this.f2932b.f2939c, C0617b.m3155a(m3242a == 1 || m3242a == 0)));
            if (m3216a == null || (m3482a = C0676a.m3479a().m3482a(this.f2932b.f2939c, m3216a.f2922a, 3000L, false)) == null || m3482a.length <= 0) {
                return;
            }
            m3216a.f2924c = m3482a[0];
            long uptimeMillis2 = j - SystemClock.uptimeMillis();
            if (uptimeMillis2 < 10) {
                return;
            }
            this.f2936f = new CallableC0635q(this.f2932b, m3216a, hashSet);
            C0675a.m3469c("SisConn", "second sis, addr=" + m3216a + ", failIps=" + hashSet);
            FutureTask futureTask = new FutureTask(this.f2936f);
            try {
                C0831g.m4072a(null, null, 11, "ASYNC", null, futureTask);
                C0632n c0632n = (C0632n) futureTask.get(uptimeMillis2, TimeUnit.MILLISECONDS);
                LinkedHashSet<C0626h> linkedHashSet2 = c0632n != null ? c0632n.f2945a : null;
                if (linkedHashSet2 == null || linkedHashSet2.isEmpty()) {
                    return;
                }
                this.f2932b.m3245a(c0632n.f2951g);
                m3233a(linkedHashSet2, j);
            } catch (Throwable th) {
                C0675a.m3475g("SisConn", "second sis e:" + th);
            }
        }
    }

    /* renamed from: a */
    private boolean m3234a(C0626h c0626h) {
        InetAddress[] m3482a;
        C0663f c0663f;
        if (!this.f2933c.f2926b) {
            if (this.f2934d.m3265a()) {
                return true;
            }
            if (c0626h != null && c0626h.m3221a() && !this.f2931a.contains(c0626h) && (m3482a = C0676a.m3479a().m3482a(this.f2932b.f2939c, c0626h.f2922a, 3000L, false)) != null && m3482a.length != 0) {
                Iterator it = C0822k.m4012a(Arrays.asList(m3482a)).iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    InetAddress inetAddress = (InetAddress) it.next();
                    if (!this.f2933c.f2926b) {
                        if (!this.f2934d.m3265a()) {
                            C0626h c0626h2 = new C0626h(inetAddress, c0626h.f2923b);
                            if (!this.f2931a.contains(c0626h2) && this.f2935e.m3215a(c0626h2)) {
                                this.f2931a.add(c0626h2);
                                C0636r c0636r = this.f2934d;
                                c0636r.m3264a((Callable<?>) new CallableC0620b(this.f2932b, c0636r, this.f2935e, this.f2933c));
                                break;
                            }
                        } else {
                            return true;
                        }
                    } else {
                        c0663f = new C0663f(-991, null);
                        break;
                    }
                }
                this.f2931a.add(c0626h);
            }
            return false;
        }
        c0663f = new C0663f(-991, null);
        this.f2934d.m3263a(c0663f);
        return true;
    }

    /* renamed from: b */
    private LinkedHashSet<C0626h> m3235b() {
        InetAddress[] m3482a;
        try {
            String m3146a = C0616a.m3146a(this.f2932b.f2939c);
            C0675a.m3469c("SisConn", "load Default Conn, from host=" + m3146a);
            if (!TextUtils.isEmpty(m3146a) && (m3482a = C0676a.m3479a().m3482a(this.f2932b.f2939c, m3146a, 3000L, false)) != null && m3482a.length != 0) {
                LinkedList m4012a = C0822k.m4012a(Arrays.asList(m3482a));
                if (m4012a.isEmpty()) {
                    return null;
                }
                String hostAddress = ((InetAddress) m4012a.get(0)).getHostAddress();
                LinkedHashSet<C0626h> linkedHashSet = new LinkedHashSet<>();
                linkedHashSet.add(new C0626h(hostAddress, 7000));
                linkedHashSet.add(new C0626h(hostAddress, 7002));
                linkedHashSet.add(new C0626h(hostAddress, 7003));
                linkedHashSet.add(new C0626h(hostAddress, 7004));
                linkedHashSet.add(new C0626h(hostAddress, 7005));
                linkedHashSet.add(new C0626h(hostAddress, 7006));
                linkedHashSet.add(new C0626h(hostAddress, 7007));
                linkedHashSet.add(new C0626h(hostAddress, 7008));
                linkedHashSet.add(new C0626h(hostAddress, 7009));
                return linkedHashSet;
            }
        } catch (Throwable unused) {
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00a0  */
    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final p031c.p032a.p071o.AbstractC0688a m3236a(p031c.p032a.p063g.RunnableC0627i r14) {
        /*
            Method dump skipped, instructions count: 264
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p031c.p032a.p063g.C0629k.m3236a(c.a.g.i):c.a.o.a");
    }
}
