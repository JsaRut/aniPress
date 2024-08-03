package p139d.p225c.p226a.p227a.p250j;

import java.io.EOFException;
import java.nio.ByteBuffer;
import p139d.p225c.p226a.p227a.C2676s;
import p139d.p225c.p226a.p227a.C2677t;
import p139d.p225c.p226a.p227a.p230c.C2193c;
import p139d.p225c.p226a.p227a.p230c.C2196f;
import p139d.p225c.p226a.p227a.p234f.InterfaceC2289h;
import p139d.p225c.p226a.p227a.p234f.InterfaceC2337q;
import p139d.p225c.p226a.p227a.p250j.C2402C;
import p139d.p225c.p226a.p227a.p269m.C2589c;
import p139d.p225c.p226a.p227a.p269m.InterfaceC2590d;
import p139d.p225c.p226a.p227a.p270n.C2644u;

/* renamed from: d.c.a.a.j.D */
/* loaded from: classes.dex */
public class C2403D implements InterfaceC2337q {

    /* renamed from: a */
    private final InterfaceC2590d f9420a;

    /* renamed from: b */
    private final int f9421b;

    /* renamed from: c */
    private final C2402C f9422c = new C2402C();

    /* renamed from: d */
    private final C2402C.a f9423d = new C2402C.a();

    /* renamed from: e */
    private final C2644u f9424e = new C2644u(32);

    /* renamed from: f */
    private a f9425f;

    /* renamed from: g */
    private a f9426g;

    /* renamed from: h */
    private a f9427h;

    /* renamed from: i */
    private C2676s f9428i;

    /* renamed from: j */
    private boolean f9429j;

    /* renamed from: k */
    private C2676s f9430k;

    /* renamed from: l */
    private long f9431l;

    /* renamed from: m */
    private long f9432m;

    /* renamed from: n */
    private boolean f9433n;

    /* renamed from: o */
    private b f9434o;

    /* renamed from: d.c.a.a.j.D$a */
    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a */
        public final long f9435a;

        /* renamed from: b */
        public final long f9436b;

        /* renamed from: c */
        public boolean f9437c;

        /* renamed from: d */
        public C2589c f9438d;

        /* renamed from: e */
        public a f9439e;

        public a(long j, int i) {
            this.f9435a = j;
            this.f9436b = j + i;
        }

        /* renamed from: a */
        public int m9956a(long j) {
            return ((int) (j - this.f9435a)) + this.f9438d.f10756b;
        }

        /* renamed from: a */
        public a m9957a() {
            this.f9438d = null;
            a aVar = this.f9439e;
            this.f9439e = null;
            return aVar;
        }

        /* renamed from: a */
        public void m9958a(C2589c c2589c, a aVar) {
            this.f9438d = c2589c;
            this.f9439e = aVar;
            this.f9437c = true;
        }
    }

    /* renamed from: d.c.a.a.j.D$b */
    /* loaded from: classes.dex */
    public interface b {
        /* renamed from: a */
        void mo9959a(C2676s c2676s);
    }

    public C2403D(InterfaceC2590d interfaceC2590d) {
        this.f9420a = interfaceC2590d;
        this.f9421b = interfaceC2590d.mo10913c();
        this.f9425f = new a(0L, this.f9421b);
        a aVar = this.f9425f;
        this.f9426g = aVar;
        this.f9427h = aVar;
    }

    /* renamed from: a */
    private static C2676s m9924a(C2676s c2676s, long j) {
        if (c2676s == null) {
            return null;
        }
        if (j == 0) {
            return c2676s;
        }
        long j2 = c2676s.f11186k;
        return j2 != Long.MAX_VALUE ? c2676s.m11439a(j2 + j) : c2676s;
    }

    /* renamed from: a */
    private void m9925a(long j, ByteBuffer byteBuffer, int i) {
        m9929b(j);
        while (i > 0) {
            int min = Math.min(i, (int) (this.f9426g.f9436b - j));
            a aVar = this.f9426g;
            byteBuffer.put(aVar.f9438d.f10755a, aVar.m9956a(j), min);
            i -= min;
            j += min;
            a aVar2 = this.f9426g;
            if (j == aVar2.f9436b) {
                this.f9426g = aVar2.f9439e;
            }
        }
    }

    /* renamed from: a */
    private void m9926a(long j, byte[] bArr, int i) {
        m9929b(j);
        long j2 = j;
        int i2 = i;
        while (i2 > 0) {
            int min = Math.min(i2, (int) (this.f9426g.f9436b - j2));
            a aVar = this.f9426g;
            System.arraycopy(aVar.f9438d.f10755a, aVar.m9956a(j2), bArr, i - i2, min);
            i2 -= min;
            j2 += min;
            a aVar2 = this.f9426g;
            if (j2 == aVar2.f9436b) {
                this.f9426g = aVar2.f9439e;
            }
        }
    }

    /* renamed from: a */
    private void m9927a(C2196f c2196f, C2402C.a aVar) {
        int i;
        long j = aVar.f9418b;
        this.f9424e.m11218c(1);
        m9926a(j, this.f9424e.f11004a, 1);
        long j2 = j + 1;
        byte b2 = this.f9424e.f11004a[0];
        boolean z = (b2 & 128) != 0;
        int i2 = b2 & Byte.MAX_VALUE;
        C2193c c2193c = c2196f.f8039b;
        if (c2193c.f8018a == null) {
            c2193c.f8018a = new byte[16];
        }
        m9926a(j2, c2196f.f8039b.f8018a, i2);
        long j3 = j2 + i2;
        if (z) {
            this.f9424e.m11218c(2);
            m9926a(j3, this.f9424e.f11004a, 2);
            j3 += 2;
            i = this.f9424e.m11244z();
        } else {
            i = 1;
        }
        int[] iArr = c2196f.f8039b.f8021d;
        if (iArr == null || iArr.length < i) {
            iArr = new int[i];
        }
        int[] iArr2 = iArr;
        int[] iArr3 = c2196f.f8039b.f8022e;
        if (iArr3 == null || iArr3.length < i) {
            iArr3 = new int[i];
        }
        int[] iArr4 = iArr3;
        if (z) {
            int i3 = i * 6;
            this.f9424e.m11218c(i3);
            m9926a(j3, this.f9424e.f11004a, i3);
            j3 += i3;
            this.f9424e.m11222e(0);
            for (int i4 = 0; i4 < i; i4++) {
                iArr2[i4] = this.f9424e.m11244z();
                iArr4[i4] = this.f9424e.m11242x();
            }
        } else {
            iArr2[0] = 0;
            iArr4[0] = aVar.f9417a - ((int) (j3 - aVar.f9418b));
        }
        InterfaceC2337q.a aVar2 = aVar.f9419c;
        C2193c c2193c2 = c2196f.f8039b;
        c2193c2.m9017a(i, iArr2, iArr4, aVar2.f9174b, c2193c2.f8018a, aVar2.f9173a, aVar2.f9175c, aVar2.f9176d);
        long j4 = aVar.f9418b;
        int i5 = (int) (j3 - j4);
        aVar.f9418b = j4 + i5;
        aVar.f9417a -= i5;
    }

    /* renamed from: a */
    private void m9928a(a aVar) {
        if (aVar.f9437c) {
            a aVar2 = this.f9427h;
            boolean z = aVar2.f9437c;
            C2589c[] c2589cArr = new C2589c[(z ? 1 : 0) + (((int) (aVar2.f9435a - aVar.f9435a)) / this.f9421b)];
            for (int i = 0; i < c2589cArr.length; i++) {
                c2589cArr[i] = aVar.f9438d;
                aVar = aVar.m9957a();
            }
            this.f9420a.mo10911a(c2589cArr);
        }
    }

    /* renamed from: b */
    private void m9929b(long j) {
        while (true) {
            a aVar = this.f9426g;
            if (j < aVar.f9436b) {
                return;
            } else {
                this.f9426g = aVar.f9439e;
            }
        }
    }

    /* renamed from: c */
    private void m9930c(long j) {
        a aVar;
        if (j == -1) {
            return;
        }
        while (true) {
            aVar = this.f9425f;
            if (j < aVar.f9436b) {
                break;
            }
            this.f9420a.mo10910a(aVar.f9438d);
            this.f9425f = this.f9425f.m9957a();
        }
        if (this.f9426g.f9435a < aVar.f9435a) {
            this.f9426g = aVar;
        }
    }

    /* renamed from: d */
    private void m9931d(int i) {
        this.f9432m += i;
        long j = this.f9432m;
        a aVar = this.f9427h;
        if (j == aVar.f9436b) {
            this.f9427h = aVar.f9439e;
        }
    }

    /* renamed from: e */
    private int m9932e(int i) {
        a aVar = this.f9427h;
        if (!aVar.f9437c) {
            aVar.m9958a(this.f9420a.mo10909a(), new a(this.f9427h.f9436b, this.f9421b));
        }
        return Math.min(i, (int) (this.f9427h.f9436b - this.f9432m));
    }

    /* renamed from: a */
    public int m9933a() {
        return this.f9422c.m9901a();
    }

    /* renamed from: a */
    public int m9934a(long j, boolean z, boolean z2) {
        return this.f9422c.m9902a(j, z, z2);
    }

    @Override // p139d.p225c.p226a.p227a.p234f.InterfaceC2337q
    /* renamed from: a */
    public int mo9430a(InterfaceC2289h interfaceC2289h, int i, boolean z) {
        int m9932e = m9932e(i);
        a aVar = this.f9427h;
        int read = interfaceC2289h.read(aVar.f9438d.f10755a, aVar.m9956a(this.f9432m), m9932e);
        if (read != -1) {
            m9931d(read);
            return read;
        }
        if (z) {
            return -1;
        }
        throw new EOFException();
    }

    /* renamed from: a */
    public int m9935a(C2677t c2677t, C2196f c2196f, boolean z, boolean z2, long j) {
        int m9903a = this.f9422c.m9903a(c2677t, c2196f, z, z2, this.f9428i, this.f9423d);
        if (m9903a == -5) {
            this.f9428i = c2677t.f11202a;
            return -5;
        }
        if (m9903a != -4) {
            if (m9903a == -3) {
                return -3;
            }
            throw new IllegalStateException();
        }
        if (!c2196f.m9010d()) {
            if (c2196f.f8041d < j) {
                c2196f.m9007b(Integer.MIN_VALUE);
            }
            if (c2196f.m9029g()) {
                m9927a(c2196f, this.f9423d);
            }
            c2196f.m9028f(this.f9423d.f9417a);
            C2402C.a aVar = this.f9423d;
            m9925a(aVar.f9418b, c2196f.f8040c, aVar.f9417a);
        }
        return -4;
    }

    /* renamed from: a */
    public void m9936a(int i) {
        this.f9432m = this.f9422c.m9904a(i);
        long j = this.f9432m;
        if (j != 0) {
            a aVar = this.f9425f;
            if (j != aVar.f9435a) {
                while (this.f9432m > aVar.f9436b) {
                    aVar = aVar.f9439e;
                }
                a aVar2 = aVar.f9439e;
                m9928a(aVar2);
                aVar.f9439e = new a(aVar.f9436b, this.f9421b);
                this.f9427h = this.f9432m == aVar.f9436b ? aVar.f9439e : aVar;
                if (this.f9426g == aVar2) {
                    this.f9426g = aVar.f9439e;
                    return;
                }
                return;
            }
        }
        m9928a(this.f9425f);
        this.f9425f = new a(this.f9432m, this.f9421b);
        a aVar3 = this.f9425f;
        this.f9426g = aVar3;
        this.f9427h = aVar3;
    }

    /* renamed from: a */
    public void m9937a(long j) {
        if (this.f9431l != j) {
            this.f9431l = j;
            this.f9429j = true;
        }
    }

    @Override // p139d.p225c.p226a.p227a.p234f.InterfaceC2337q
    /* renamed from: a */
    public void mo9431a(long j, int i, int i2, int i3, InterfaceC2337q.a aVar) {
        if (this.f9429j) {
            mo9433a(this.f9430k);
        }
        long j2 = j + this.f9431l;
        if (this.f9433n) {
            if ((i & 1) == 0 || !this.f9422c.m9907a(j2)) {
                return;
            } else {
                this.f9433n = false;
            }
        }
        this.f9422c.m9905a(j2, i, (this.f9432m - i2) - i3, i2, aVar);
    }

    /* renamed from: a */
    public void m9938a(b bVar) {
        this.f9434o = bVar;
    }

    @Override // p139d.p225c.p226a.p227a.p234f.InterfaceC2337q
    /* renamed from: a */
    public void mo9432a(C2644u c2644u, int i) {
        while (i > 0) {
            int m9932e = m9932e(i);
            a aVar = this.f9427h;
            c2644u.m11214a(aVar.f9438d.f10755a, aVar.m9956a(this.f9432m), m9932e);
            i -= m9932e;
            m9931d(m9932e);
        }
    }

    @Override // p139d.p225c.p226a.p227a.p234f.InterfaceC2337q
    /* renamed from: a */
    public void mo9433a(C2676s c2676s) {
        C2676s m9924a = m9924a(c2676s, this.f9431l);
        boolean m9908a = this.f9422c.m9908a(m9924a);
        this.f9430k = c2676s;
        this.f9429j = false;
        b bVar = this.f9434o;
        if (bVar == null || !m9908a) {
            return;
        }
        bVar.mo9959a(m9924a);
    }

    /* renamed from: a */
    public void m9939a(boolean z) {
        this.f9422c.m9906a(z);
        m9928a(this.f9425f);
        this.f9425f = new a(0L, this.f9421b);
        a aVar = this.f9425f;
        this.f9426g = aVar;
        this.f9427h = aVar;
        this.f9432m = 0L;
        this.f9420a.mo10912b();
    }

    /* renamed from: b */
    public void m9940b() {
        m9930c(this.f9422c.m9909b());
    }

    /* renamed from: b */
    public void m9941b(long j, boolean z, boolean z2) {
        m9930c(this.f9422c.m9910b(j, z, z2));
    }

    /* renamed from: b */
    public boolean m9942b(int i) {
        return this.f9422c.m9912b(i);
    }

    /* renamed from: c */
    public void m9943c() {
        m9930c(this.f9422c.m9913c());
    }

    /* renamed from: c */
    public void m9944c(int i) {
        this.f9422c.m9914c(i);
    }

    /* renamed from: d */
    public int m9945d() {
        return this.f9422c.m9915d();
    }

    /* renamed from: e */
    public long m9946e() {
        return this.f9422c.m9916e();
    }

    /* renamed from: f */
    public long m9947f() {
        return this.f9422c.m9917f();
    }

    /* renamed from: g */
    public int m9948g() {
        return this.f9422c.m9918g();
    }

    /* renamed from: h */
    public C2676s m9949h() {
        return this.f9422c.m9919h();
    }

    /* renamed from: i */
    public int m9950i() {
        return this.f9422c.m9920i();
    }

    /* renamed from: j */
    public boolean m9951j() {
        return this.f9422c.m9921j();
    }

    /* renamed from: k */
    public int m9952k() {
        return this.f9422c.m9922k();
    }

    /* renamed from: l */
    public void m9953l() {
        m9939a(false);
    }

    /* renamed from: m */
    public void m9954m() {
        this.f9422c.m9923l();
        this.f9426g = this.f9425f;
    }

    /* renamed from: n */
    public void m9955n() {
        this.f9433n = true;
    }
}
