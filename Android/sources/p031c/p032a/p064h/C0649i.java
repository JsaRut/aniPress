package p031c.p032a.p064h;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* renamed from: c.a.h.i */
/* loaded from: classes.dex */
public final class C0649i implements Serializable {

    /* renamed from: a */
    private List f3028a;

    /* renamed from: b */
    private short f3029b;

    /* renamed from: c */
    private short f3030c;

    public C0649i() {
        this.f3028a = new ArrayList(1);
        this.f3029b = (short) 0;
        this.f3030c = (short) 0;
    }

    public C0649i(AbstractC0650j abstractC0650j) {
        this();
        m3327b(abstractC0650j);
    }

    /* renamed from: a */
    private static String m3325a(Iterator it) {
        StringBuffer stringBuffer = new StringBuffer();
        while (it.hasNext()) {
            AbstractC0650j abstractC0650j = (AbstractC0650j) it.next();
            stringBuffer.append("[");
            stringBuffer.append(abstractC0650j.mo3336a());
            stringBuffer.append("]");
            if (it.hasNext()) {
                stringBuffer.append(" ");
            }
        }
        return stringBuffer.toString();
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* renamed from: a */
    private synchronized Iterator m3326a(boolean z, boolean z2) {
        int i;
        List subList;
        int size = this.f3028a.size();
        int i2 = z ? size - this.f3029b : this.f3029b;
        if (i2 == 0) {
            return Collections.EMPTY_LIST.iterator();
        }
        if (!z) {
            i = size - this.f3029b;
        } else if (z2) {
            if (this.f3030c >= i2) {
                this.f3030c = (short) 0;
            }
            i = this.f3030c;
            this.f3030c = (short) (i + 1);
        } else {
            i = 0;
        }
        ArrayList arrayList = new ArrayList(i2);
        if (z) {
            arrayList.addAll(this.f3028a.subList(i, i2));
            if (i != 0) {
                subList = this.f3028a.subList(0, i);
            }
            return arrayList.iterator();
        }
        subList = this.f3028a.subList(i, size);
        arrayList.addAll(subList);
        return arrayList.iterator();
    }

    /* renamed from: b */
    private void m3327b(AbstractC0650j abstractC0650j) {
        if (this.f3029b == 0) {
            this.f3028a.add(abstractC0650j);
        } else {
            List list = this.f3028a;
            list.add(list.size() - this.f3029b, abstractC0650j);
        }
    }

    /* renamed from: c */
    private synchronized long m3328c() {
        return m3331b().m3346f();
    }

    /* renamed from: a */
    public final synchronized Iterator m3329a() {
        return m3326a(true, true);
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* renamed from: a */
    public final synchronized void m3330a(AbstractC0650j abstractC0650j) {
        if (this.f3028a.size() == 0) {
            m3327b(abstractC0650j);
            return;
        }
        AbstractC0650j m3331b = m3331b();
        if (!abstractC0650j.m3341a(m3331b)) {
            throw new IllegalArgumentException("record does not match rrset");
        }
        if (abstractC0650j.m3346f() != m3331b.m3346f()) {
            if (abstractC0650j.m3346f() > m3331b.m3346f()) {
                abstractC0650j = abstractC0650j.m3347g();
                abstractC0650j.m3337a(m3331b.m3346f());
            } else {
                for (int i = 0; i < this.f3028a.size(); i++) {
                    AbstractC0650j m3347g = ((AbstractC0650j) this.f3028a.get(i)).m3347g();
                    m3347g.m3337a(abstractC0650j.m3346f());
                    this.f3028a.set(i, m3347g);
                }
            }
        }
        if (!this.f3028a.contains(abstractC0650j)) {
            m3327b(abstractC0650j);
        }
    }

    /* renamed from: b */
    public final synchronized AbstractC0650j m3331b() {
        if (this.f3028a.size() == 0) {
            throw new IllegalStateException("rrset is empty");
        }
        return (AbstractC0650j) this.f3028a.get(0);
    }

    public final String toString() {
        if (this.f3028a.size() == 0) {
            return "{empty}";
        }
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("{ ");
        stringBuffer.append(m3331b().m3342b() + " ");
        stringBuffer.append(m3328c() + " ");
        stringBuffer.append(m3325a(m3326a(true, false)));
        if (this.f3029b > 0) {
            stringBuffer.append(" sigs: ");
            stringBuffer.append(m3325a(m3326a(false, false)));
        }
        stringBuffer.append(" }");
        return stringBuffer.toString();
    }
}
