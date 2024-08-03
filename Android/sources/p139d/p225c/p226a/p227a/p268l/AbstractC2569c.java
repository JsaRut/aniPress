package p139d.p225c.p226a.p227a.p268l;

import android.os.SystemClock;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import p139d.p225c.p226a.p227a.C2676s;
import p139d.p225c.p226a.p227a.p250j.C2411L;
import p139d.p225c.p226a.p227a.p250j.p252b.AbstractC2429l;
import p139d.p225c.p226a.p227a.p250j.p252b.InterfaceC2431n;
import p139d.p225c.p226a.p227a.p270n.C2622I;
import p139d.p225c.p226a.p227a.p270n.C2628e;

/* renamed from: d.c.a.a.l.c */
/* loaded from: classes.dex */
public abstract class AbstractC2569c implements InterfaceC2577k {

    /* renamed from: a */
    protected final C2411L f10653a;

    /* renamed from: b */
    protected final int f10654b;

    /* renamed from: c */
    protected final int[] f10655c;

    /* renamed from: d */
    private final C2676s[] f10656d;

    /* renamed from: e */
    private final long[] f10657e;

    /* renamed from: f */
    private int f10658f;

    /* renamed from: d.c.a.a.l.c$a */
    /* loaded from: classes.dex */
    private static final class a implements Comparator<C2676s> {
        private a() {
        }

        @Override // java.util.Comparator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(C2676s c2676s, C2676s c2676s2) {
            return c2676s2.f11178c - c2676s.f11178c;
        }
    }

    public AbstractC2569c(C2411L c2411l, int... iArr) {
        int i = 0;
        C2628e.m11113b(iArr.length > 0);
        C2628e.m11110a(c2411l);
        this.f10653a = c2411l;
        this.f10654b = iArr.length;
        this.f10656d = new C2676s[this.f10654b];
        for (int i2 = 0; i2 < iArr.length; i2++) {
            this.f10656d[i2] = c2411l.m9976a(iArr[i2]);
        }
        Arrays.sort(this.f10656d, new a());
        this.f10655c = new int[this.f10654b];
        while (true) {
            int i3 = this.f10654b;
            if (i >= i3) {
                this.f10657e = new long[i3];
                return;
            } else {
                this.f10655c[i] = c2411l.m9975a(this.f10656d[i]);
                i++;
            }
        }
    }

    @Override // p139d.p225c.p226a.p227a.p268l.InterfaceC2577k
    /* renamed from: a */
    public int mo10810a(long j, List<? extends AbstractC2429l> list) {
        return list.size();
    }

    @Override // p139d.p225c.p226a.p227a.p268l.InterfaceC2577k
    /* renamed from: a */
    public final int mo10814a(C2676s c2676s) {
        for (int i = 0; i < this.f10654b; i++) {
            if (this.f10656d[i] == c2676s) {
                return i;
            }
        }
        return -1;
    }

    @Override // p139d.p225c.p226a.p227a.p268l.InterfaceC2577k
    /* renamed from: a */
    public final C2411L mo10815a() {
        return this.f10653a;
    }

    @Override // p139d.p225c.p226a.p227a.p268l.InterfaceC2577k
    /* renamed from: a */
    public final C2676s mo10816a(int i) {
        return this.f10656d[i];
    }

    @Override // p139d.p225c.p226a.p227a.p268l.InterfaceC2577k
    /* renamed from: a */
    public void mo10811a(float f) {
    }

    @Override // p139d.p225c.p226a.p227a.p268l.InterfaceC2577k
    @Deprecated
    /* renamed from: a */
    public /* synthetic */ void mo10817a(long j, long j2, long j3) {
        C2576j.m10885a(this, j, j2, j3);
    }

    @Override // p139d.p225c.p226a.p227a.p268l.InterfaceC2577k
    /* renamed from: a */
    public /* synthetic */ void mo10327a(long j, long j2, long j3, List<? extends AbstractC2429l> list, InterfaceC2431n[] interfaceC2431nArr) {
        C2576j.m10886a(this, j, j2, j3, list, interfaceC2431nArr);
    }

    @Override // p139d.p225c.p226a.p227a.p268l.InterfaceC2577k
    /* renamed from: a */
    public final boolean mo10818a(int i, long j) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        boolean m10820b = m10820b(i, elapsedRealtime);
        int i2 = 0;
        while (i2 < this.f10654b && !m10820b) {
            m10820b = (i2 == i || m10820b(i2, elapsedRealtime)) ? false : true;
            i2++;
        }
        if (!m10820b) {
            return false;
        }
        long[] jArr = this.f10657e;
        jArr[i] = Math.max(jArr[i], C2622I.m11045a(elapsedRealtime, j, Long.MAX_VALUE));
        return true;
    }

    @Override // p139d.p225c.p226a.p227a.p268l.InterfaceC2577k
    /* renamed from: b */
    public final int mo10819b(int i) {
        return this.f10655c[i];
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: b */
    public final boolean m10820b(int i, long j) {
        return this.f10657e[i] > j;
    }

    @Override // p139d.p225c.p226a.p227a.p268l.InterfaceC2577k
    /* renamed from: c */
    public final int mo10821c(int i) {
        for (int i2 = 0; i2 < this.f10654b; i2++) {
            if (this.f10655c[i2] == i) {
                return i2;
            }
        }
        return -1;
    }

    @Override // p139d.p225c.p226a.p227a.p268l.InterfaceC2577k
    /* renamed from: c */
    public void mo10812c() {
    }

    @Override // p139d.p225c.p226a.p227a.p268l.InterfaceC2577k
    /* renamed from: d */
    public final int mo10822d() {
        return this.f10655c[mo10328b()];
    }

    @Override // p139d.p225c.p226a.p227a.p268l.InterfaceC2577k
    /* renamed from: e */
    public void mo10823e() {
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AbstractC2569c abstractC2569c = (AbstractC2569c) obj;
        return this.f10653a == abstractC2569c.f10653a && Arrays.equals(this.f10655c, abstractC2569c.f10655c);
    }

    @Override // p139d.p225c.p226a.p227a.p268l.InterfaceC2577k
    /* renamed from: f */
    public final C2676s mo10824f() {
        return this.f10656d[mo10328b()];
    }

    public int hashCode() {
        if (this.f10658f == 0) {
            this.f10658f = (System.identityHashCode(this.f10653a) * 31) + Arrays.hashCode(this.f10655c);
        }
        return this.f10658f;
    }

    @Override // p139d.p225c.p226a.p227a.p268l.InterfaceC2577k
    public final int length() {
        return this.f10655c.length;
    }
}
