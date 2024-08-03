package p031c.p032a.p063g;

import java.net.Inet4Address;
import java.net.Inet6Address;
import java.net.InetAddress;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import p031c.p032a.p066j.C0675a;

/* renamed from: c.a.g.g */
/* loaded from: classes.dex */
public final class C0625g {

    /* renamed from: a */
    private LinkedHashSet<C0626h> f2919a = new LinkedHashSet<>();

    /* renamed from: b */
    private LinkedHashSet<C0626h> f2920b = new LinkedHashSet<>();

    /* renamed from: c */
    private List<Boolean> f2921c = new ArrayList();

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0053, code lost:            if (r2 != false) goto L30;     */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private p031c.p032a.p063g.C0626h m3211a(boolean r7, boolean r8) {
        /*
            r6 = this;
            if (r7 == 0) goto L5
            java.util.LinkedHashSet<c.a.g.h> r0 = r6.f2920b
            goto L7
        L5:
            java.util.LinkedHashSet<c.a.g.h> r0 = r6.f2919a
        L7:
            if (r8 == 0) goto Lb
            r8 = 0
            goto L12
        Lb:
            if (r7 == 0) goto L10
            java.util.LinkedHashSet<c.a.g.h> r8 = r6.f2919a
            goto L12
        L10:
            java.util.LinkedHashSet<c.a.g.h> r8 = r6.f2920b
        L12:
            if (r8 == 0) goto L5c
            boolean r1 = r8.isEmpty()
            if (r1 == 0) goto L1b
            goto L5c
        L1b:
            if (r0 == 0) goto L55
            boolean r1 = r0.isEmpty()
            if (r1 == 0) goto L24
            goto L55
        L24:
            java.util.List<java.lang.Boolean> r1 = r6.f2921c
            int r1 = r1.size()
            r2 = 0
            r3 = 1
            r4 = 2
            if (r1 >= r4) goto L30
            goto L53
        L30:
            java.util.List<java.lang.Boolean> r1 = r6.f2921c
            int r1 = r1.size()
            int r1 = r1 - r3
        L37:
            java.util.List<java.lang.Boolean> r5 = r6.f2921c
            int r5 = r5.size()
            int r5 = r5 - r4
            if (r1 < r5) goto L52
            java.util.List<java.lang.Boolean> r5 = r6.f2921c
            java.lang.Object r5 = r5.get(r1)
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            boolean r5 = r5.booleanValue()
            if (r5 == r7) goto L4f
            goto L53
        L4f:
            int r1 = r1 + (-1)
            goto L37
        L52:
            r2 = 1
        L53:
            if (r2 == 0) goto L5c
        L55:
            java.lang.Object r7 = m3212a(r8)
        L59:
            c.a.g.h r7 = (p031c.p032a.p063g.C0626h) r7
            return r7
        L5c:
            java.lang.Object r7 = m3212a(r0)
            goto L59
        */
        throw new UnsupportedOperationException("Method not decompiled: p031c.p032a.p063g.C0625g.m3211a(boolean, boolean):c.a.g.h");
    }

    /* renamed from: a */
    private static <T> T m3212a(Collection<T> collection) {
        if (collection == null || collection.isEmpty()) {
            return null;
        }
        Iterator<T> it = collection.iterator();
        if (!it.hasNext()) {
            return null;
        }
        T next = it.next();
        collection.remove(next);
        return next;
    }

    /* renamed from: a */
    public final C0626h m3213a(int i) {
        C0675a.m3469c("IpPool", "current ipv4List=" + this.f2919a + " ipv6List=" + this.f2920b);
        C0626h m3211a = i != 0 ? i != 1 ? i != 2 ? i != 3 ? null : m3211a(true, false) : m3211a(true, true) : m3211a(false, true) : m3211a(false, false);
        C0675a.m3469c("IpPool", "get ipPort=" + m3211a);
        if (m3211a != null) {
            InetAddress inetAddress = m3211a.f2924c;
            if (inetAddress instanceof Inet4Address) {
                this.f2921c.add(false);
            } else if (inetAddress instanceof Inet6Address) {
                this.f2921c.add(true);
            }
        }
        return m3211a;
    }

    /* renamed from: a */
    public final void m3214a() {
        try {
            this.f2919a.clear();
            this.f2920b.clear();
        } catch (Throwable unused) {
        }
    }

    /* renamed from: a */
    public final boolean m3215a(C0626h c0626h) {
        LinkedHashSet<C0626h> linkedHashSet;
        if (!c0626h.m3221a()) {
            return false;
        }
        InetAddress inetAddress = c0626h.f2924c;
        if (inetAddress instanceof Inet4Address) {
            linkedHashSet = this.f2919a;
        } else {
            if (!(inetAddress instanceof Inet6Address)) {
                return false;
            }
            linkedHashSet = this.f2920b;
        }
        return linkedHashSet.add(c0626h);
    }
}
