package p031c.p032a.p064h;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;

/* renamed from: c.a.h.f */
/* loaded from: classes.dex */
public final class C0646f implements Cloneable {

    /* renamed from: a */
    private static AbstractC0650j[] f3005a = new AbstractC0650j[0];

    /* renamed from: b */
    private static C0649i[] f3006b = new C0649i[0];

    /* renamed from: c */
    private C0645e f3007c;

    /* renamed from: d */
    private List[] f3008d;

    /* renamed from: e */
    private int f3009e;

    public C0646f() {
        this(new C0645e());
    }

    private C0646f(C0643c c0643c) {
        this(new C0645e(c0643c));
        for (int i = 0; i < 4; i++) {
            try {
                int m3297b = this.f3007c.m3297b(i);
                if (m3297b > 0) {
                    this.f3008d[i] = new ArrayList(m3297b);
                }
                for (int i2 = 0; i2 < m3297b; i2++) {
                    this.f3008d[i].add(AbstractC0650j.m3332a(c0643c, i));
                }
            } catch (IOException e2) {
                throw e2;
            }
        }
        this.f3009e = c0643c.m3270a();
    }

    private C0646f(C0645e c0645e) {
        this.f3008d = new List[4];
        this.f3007c = c0645e;
    }

    public C0646f(byte[] bArr) {
        this(new C0643c(bArr));
    }

    /* renamed from: a */
    public static C0646f m3298a(AbstractC0650j abstractC0650j) {
        C0646f c0646f = new C0646f();
        List[] listArr = c0646f.f3008d;
        if (listArr[0] == null) {
            listArr[0] = new LinkedList();
        }
        c0646f.f3007c.m3295a(0);
        c0646f.f3008d[0].add(abstractC0650j);
        return c0646f;
    }

    /* renamed from: a */
    public final AbstractC0650j m3299a() {
        List list = this.f3008d[0];
        if (list == null || list.size() == 0) {
            return null;
        }
        return (AbstractC0650j) list.get(0);
    }

    /* renamed from: a */
    public final C0649i[] m3300a(int i) {
        AbstractC0650j[] abstractC0650jArr;
        boolean z;
        if (this.f3008d[1] == null) {
            return f3006b;
        }
        LinkedList linkedList = new LinkedList();
        List[] listArr = this.f3008d;
        if (listArr[1] == null) {
            abstractC0650jArr = f3005a;
        } else {
            List list = listArr[1];
            abstractC0650jArr = (AbstractC0650j[]) list.toArray(new AbstractC0650j[list.size()]);
        }
        HashSet hashSet = new HashSet();
        for (int i2 = 0; i2 < abstractC0650jArr.length; i2++) {
            C0648h m3342b = abstractC0650jArr[i2].m3342b();
            if (hashSet.contains(m3342b)) {
                for (int size = linkedList.size() - 1; size >= 0; size--) {
                    C0649i c0649i = (C0649i) linkedList.get(size);
                    if (c0649i.m3331b().m3344d() == abstractC0650jArr[i2].m3344d() && c0649i.m3331b().m3345e() == abstractC0650jArr[i2].m3345e() && c0649i.m3331b().m3342b().equals(m3342b)) {
                        c0649i.m3330a(abstractC0650jArr[i2]);
                        z = false;
                        break;
                    }
                }
            }
            z = true;
            if (z) {
                linkedList.add(new C0649i(abstractC0650jArr[i2]));
                hashSet.add(m3342b);
            }
        }
        return (C0649i[]) linkedList.toArray(new C0649i[linkedList.size()]);
    }

    /* renamed from: b */
    public final byte[] m3301b(int i) {
        C0644d c0644d = new C0644d();
        this.f3007c.m3296a(c0644d);
        C0641a c0641a = new C0641a();
        this.f3007c.m3294a();
        for (int i2 = 0; i2 < 4; i2++) {
            List[] listArr = this.f3008d;
            if (listArr[i2] != null) {
                int size = listArr[i2].size();
                AbstractC0650j abstractC0650j = null;
                int m3283a = c0644d.m3283a();
                int i3 = 0;
                while (true) {
                    if (i3 < size) {
                        AbstractC0650j abstractC0650j2 = (AbstractC0650j) this.f3008d[i2].get(i3);
                        if (i2 != 3) {
                            if (abstractC0650j != null) {
                                if (!(abstractC0650j2.m3344d() == abstractC0650j.m3344d() && abstractC0650j2.m3345e() == abstractC0650j.m3345e() && abstractC0650j2.m3342b().equals(abstractC0650j.m3342b()))) {
                                    m3283a = c0644d.m3283a();
                                }
                            }
                            abstractC0650j2.m3339a(c0644d, c0641a);
                            if (c0644d.m3283a() > 65535) {
                                c0644d.m3284a(m3283a);
                                break;
                            }
                            abstractC0650j = abstractC0650j2;
                        }
                        i3++;
                    }
                }
            }
        }
        this.f3009e = c0644d.m3283a();
        return c0644d.m3290b();
    }

    public final Object clone() {
        C0646f c0646f = new C0646f();
        int i = 0;
        while (true) {
            List[] listArr = this.f3008d;
            if (i >= listArr.length) {
                c0646f.f3007c = (C0645e) this.f3007c.clone();
                c0646f.f3009e = this.f3009e;
                return c0646f;
            }
            if (listArr[i] != null) {
                c0646f.f3008d[i] = new LinkedList(listArr[i]);
            }
            i++;
        }
    }
}
