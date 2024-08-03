package p139d.p225c.p226a.p227a.p250j.p255d;

import android.net.Uri;
import android.os.SystemClock;
import java.io.IOException;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.List;
import p139d.p225c.p226a.p227a.C2676s;
import p139d.p225c.p226a.p227a.p250j.C2411L;
import p139d.p225c.p226a.p227a.p250j.p252b.AbstractC2419b;
import p139d.p225c.p226a.p227a.p250j.p252b.AbstractC2421d;
import p139d.p225c.p226a.p227a.p250j.p252b.AbstractC2427j;
import p139d.p225c.p226a.p227a.p250j.p252b.AbstractC2429l;
import p139d.p225c.p226a.p227a.p250j.p252b.InterfaceC2431n;
import p139d.p225c.p226a.p227a.p250j.p255d.p256a.C2465d;
import p139d.p225c.p226a.p227a.p250j.p255d.p256a.C2466e;
import p139d.p225c.p226a.p227a.p250j.p255d.p256a.InterfaceC2470i;
import p139d.p225c.p226a.p227a.p268l.AbstractC2569c;
import p139d.p225c.p226a.p227a.p268l.InterfaceC2577k;
import p139d.p225c.p226a.p227a.p269m.C2600n;
import p139d.p225c.p226a.p227a.p269m.InterfaceC2586E;
import p139d.p225c.p226a.p227a.p269m.InterfaceC2597k;
import p139d.p225c.p226a.p227a.p270n.C2622I;

/* renamed from: d.c.a.a.j.d.f */
/* loaded from: classes.dex */
public class C2475f {

    /* renamed from: a */
    private final InterfaceC2477h f9911a;

    /* renamed from: b */
    private final InterfaceC2597k f9912b;

    /* renamed from: c */
    private final InterfaceC2597k f9913c;

    /* renamed from: d */
    private final C2485p f9914d;

    /* renamed from: e */
    private final C2465d.a[] f9915e;

    /* renamed from: f */
    private final InterfaceC2470i f9916f;

    /* renamed from: g */
    private final C2411L f9917g;

    /* renamed from: h */
    private final List<C2676s> f9918h;

    /* renamed from: i */
    private boolean f9919i;

    /* renamed from: j */
    private byte[] f9920j;

    /* renamed from: k */
    private IOException f9921k;

    /* renamed from: l */
    private C2465d.a f9922l;

    /* renamed from: m */
    private boolean f9923m;

    /* renamed from: n */
    private Uri f9924n;

    /* renamed from: o */
    private byte[] f9925o;

    /* renamed from: p */
    private String f9926p;

    /* renamed from: q */
    private byte[] f9927q;

    /* renamed from: r */
    private InterfaceC2577k f9928r;

    /* renamed from: s */
    private long f9929s = -9223372036854775807L;

    /* renamed from: t */
    private boolean f9930t;

    /* renamed from: d.c.a.a.j.d.f$a */
    /* loaded from: classes.dex */
    public static final class a extends AbstractC2427j {

        /* renamed from: k */
        public final String f9931k;

        /* renamed from: l */
        private byte[] f9932l;

        public a(InterfaceC2597k interfaceC2597k, C2600n c2600n, C2676s c2676s, int i, Object obj, byte[] bArr, String str) {
            super(interfaceC2597k, c2600n, 3, c2676s, i, obj, bArr);
            this.f9931k = str;
        }

        @Override // p139d.p225c.p226a.p227a.p250j.p252b.AbstractC2427j
        /* renamed from: a */
        protected void mo10035a(byte[] bArr, int i) {
            this.f9932l = Arrays.copyOf(bArr, i);
        }

        /* renamed from: h */
        public byte[] m10325h() {
            return this.f9932l;
        }
    }

    /* renamed from: d.c.a.a.j.d.f$b */
    /* loaded from: classes.dex */
    public static final class b {

        /* renamed from: a */
        public AbstractC2421d f9933a;

        /* renamed from: b */
        public boolean f9934b;

        /* renamed from: c */
        public C2465d.a f9935c;

        public b() {
            m10326a();
        }

        /* renamed from: a */
        public void m10326a() {
            this.f9933a = null;
            this.f9934b = false;
            this.f9935c = null;
        }
    }

    /* renamed from: d.c.a.a.j.d.f$c */
    /* loaded from: classes.dex */
    public static final class c extends AbstractC2419b {

        /* renamed from: d */
        private final C2466e f9936d;

        /* renamed from: e */
        private final long f9937e;

        public c(C2466e c2466e, long j, int i) {
            super(i, c2466e.f9850o.size() - 1);
            this.f9936d = c2466e;
            this.f9937e = j;
        }
    }

    /* renamed from: d.c.a.a.j.d.f$d */
    /* loaded from: classes.dex */
    public static final class d extends AbstractC2569c {

        /* renamed from: g */
        private int f9938g;

        public d(C2411L c2411l, int[] iArr) {
            super(c2411l, iArr);
            this.f9938g = mo10814a(c2411l.m9976a(0));
        }

        /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
        @Override // p139d.p225c.p226a.p227a.p268l.AbstractC2569c, p139d.p225c.p226a.p227a.p268l.InterfaceC2577k
        /* renamed from: a */
        public void mo10327a(long j, long j2, long j3, List<? extends AbstractC2429l> list, InterfaceC2431n[] interfaceC2431nArr) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            if (m10820b(this.f9938g, elapsedRealtime)) {
                for (int i = this.f10654b - 1; i >= 0; i--) {
                    if (!m10820b(i, elapsedRealtime)) {
                        this.f9938g = i;
                        return;
                    }
                }
                throw new IllegalStateException();
            }
        }

        @Override // p139d.p225c.p226a.p227a.p268l.InterfaceC2577k
        /* renamed from: b */
        public int mo10328b() {
            return this.f9938g;
        }

        @Override // p139d.p225c.p226a.p227a.p268l.InterfaceC2577k
        /* renamed from: g */
        public int mo10329g() {
            return 0;
        }

        @Override // p139d.p225c.p226a.p227a.p268l.InterfaceC2577k
        /* renamed from: h */
        public Object mo10330h() {
            return null;
        }
    }

    public C2475f(InterfaceC2477h interfaceC2477h, InterfaceC2470i interfaceC2470i, C2465d.a[] aVarArr, InterfaceC2476g interfaceC2476g, InterfaceC2586E interfaceC2586E, C2485p c2485p, List<C2676s> list) {
        this.f9911a = interfaceC2477h;
        this.f9916f = interfaceC2470i;
        this.f9915e = aVarArr;
        this.f9914d = c2485p;
        this.f9918h = list;
        C2676s[] c2676sArr = new C2676s[aVarArr.length];
        int[] iArr = new int[aVarArr.length];
        for (int i = 0; i < aVarArr.length; i++) {
            c2676sArr[i] = aVarArr[i].f9838b;
            iArr[i] = i;
        }
        this.f9912b = interfaceC2476g.mo10302a(1);
        if (interfaceC2586E != null) {
            this.f9912b.mo10300a(interfaceC2586E);
        }
        this.f9913c = interfaceC2476g.mo10302a(3);
        this.f9917g = new C2411L(c2676sArr);
        this.f9928r = new d(this.f9917g, iArr);
    }

    /* renamed from: a */
    private long m10308a(long j) {
        if (this.f9929s != -9223372036854775807L) {
            return this.f9929s - j;
        }
        return -9223372036854775807L;
    }

    /* renamed from: a */
    private long m10309a(C2479j c2479j, boolean z, C2466e c2466e, long j, long j2) {
        long m11040a;
        long j3;
        if (c2479j != null && !z) {
            return c2479j.mo10032g();
        }
        long j4 = c2466e.f9851p + j;
        if (c2479j != null && !this.f9923m) {
            j2 = c2479j.f9516f;
        }
        if (c2466e.f9847l || j2 < j4) {
            m11040a = C2622I.m11040a((List<? extends Comparable<? super Long>>) c2466e.f9850o, Long.valueOf(j2 - j), true, !this.f9916f.mo10256b() || c2479j == null);
            j3 = c2466e.f9844i;
        } else {
            m11040a = c2466e.f9844i;
            j3 = c2466e.f9850o.size();
        }
        return m11040a + j3;
    }

    /* renamed from: a */
    private a m10310a(Uri uri, String str, int i, int i2, Object obj) {
        return new a(this.f9913c, new C2600n(uri, 0L, -1L, null, 1), this.f9915e[i].f9838b, i2, obj, this.f9920j, str);
    }

    /* renamed from: a */
    private void m10311a(Uri uri, String str, byte[] bArr) {
        byte[] byteArray = new BigInteger(C2622I.m11098j(str).startsWith("0x") ? str.substring(2) : str, 16).toByteArray();
        byte[] bArr2 = new byte[16];
        int length = byteArray.length > 16 ? byteArray.length - 16 : 0;
        System.arraycopy(byteArray, length, bArr2, (bArr2.length - byteArray.length) + length, byteArray.length - length);
        this.f9924n = uri;
        this.f9925o = bArr;
        this.f9926p = str;
        this.f9927q = bArr2;
    }

    /* renamed from: a */
    private void m10312a(C2466e c2466e) {
        this.f9929s = c2466e.f9847l ? -9223372036854775807L : c2466e.m10277b() - this.f9916f.mo10250a();
    }

    /* renamed from: e */
    private void m10313e() {
        this.f9924n = null;
        this.f9925o = null;
        this.f9926p = null;
        this.f9927q = null;
    }

    /* renamed from: a */
    public C2411L m10314a() {
        return this.f9917g;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0071  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void m10315a(long r40, long r42, java.util.List<p139d.p225c.p226a.p227a.p250j.p255d.C2479j> r44, p139d.p225c.p226a.p227a.p250j.p255d.C2475f.b r45) {
        /*
            Method dump skipped, instructions count: 478
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p139d.p225c.p226a.p227a.p250j.p255d.C2475f.m10315a(long, long, java.util.List, d.c.a.a.j.d.f$b):void");
    }

    /* renamed from: a */
    public void m10316a(AbstractC2421d abstractC2421d) {
        if (abstractC2421d instanceof a) {
            a aVar = (a) abstractC2421d;
            this.f9920j = aVar.m10036g();
            m10311a(aVar.f9511a.f10782a, aVar.f9931k, aVar.m10325h());
        }
    }

    /* renamed from: a */
    public void m10317a(InterfaceC2577k interfaceC2577k) {
        this.f9928r = interfaceC2577k;
    }

    /* renamed from: a */
    public void m10318a(boolean z) {
        this.f9919i = z;
    }

    /* renamed from: a */
    public boolean m10319a(AbstractC2421d abstractC2421d, long j) {
        InterfaceC2577k interfaceC2577k = this.f9928r;
        return interfaceC2577k.mo10818a(interfaceC2577k.mo10821c(this.f9917g.m9975a(abstractC2421d.f9513c)), j);
    }

    /* renamed from: a */
    public boolean m10320a(C2465d.a aVar, long j) {
        int mo10821c;
        int m9975a = this.f9917g.m9975a(aVar.f9838b);
        if (m9975a == -1 || (mo10821c = this.f9928r.mo10821c(m9975a)) == -1) {
            return true;
        }
        this.f9930t = (this.f9922l == aVar) | this.f9930t;
        return j == -9223372036854775807L || this.f9928r.mo10818a(mo10821c, j);
    }

    /* renamed from: a */
    public InterfaceC2431n[] m10321a(C2479j c2479j, long j) {
        int m9975a = c2479j == null ? -1 : this.f9917g.m9975a(c2479j.f9513c);
        InterfaceC2431n[] interfaceC2431nArr = new InterfaceC2431n[this.f9928r.length()];
        for (int i = 0; i < interfaceC2431nArr.length; i++) {
            int mo10819b = this.f9928r.mo10819b(i);
            C2465d.a aVar = this.f9915e[mo10819b];
            if (this.f9916f.mo10257b(aVar)) {
                C2466e mo10251a = this.f9916f.mo10251a(aVar, false);
                long mo10250a = mo10251a.f9841f - this.f9916f.mo10250a();
                long m10309a = m10309a(c2479j, mo10819b != m9975a, mo10251a, mo10250a, j);
                long j2 = mo10251a.f9844i;
                if (m10309a < j2) {
                    interfaceC2431nArr[i] = InterfaceC2431n.f9578a;
                } else {
                    interfaceC2431nArr[i] = new c(mo10251a, mo10250a, (int) (m10309a - j2));
                }
            } else {
                interfaceC2431nArr[i] = InterfaceC2431n.f9578a;
            }
        }
        return interfaceC2431nArr;
    }

    /* renamed from: b */
    public InterfaceC2577k m10322b() {
        return this.f9928r;
    }

    /* renamed from: c */
    public void m10323c() {
        IOException iOException = this.f9921k;
        if (iOException != null) {
            throw iOException;
        }
        C2465d.a aVar = this.f9922l;
        if (aVar == null || !this.f9930t) {
            return;
        }
        this.f9916f.mo10259c(aVar);
    }

    /* renamed from: d */
    public void m10324d() {
        this.f9921k = null;
    }
}
