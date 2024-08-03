package p139d.p225c.p226a.p227a.p271o.p272a;

import java.nio.ByteBuffer;
import p139d.p225c.p226a.p227a.AbstractC2190c;
import p139d.p225c.p226a.p227a.C2676s;
import p139d.p225c.p226a.p227a.C2677t;
import p139d.p225c.p226a.p227a.p230c.C2196f;
import p139d.p225c.p226a.p227a.p270n.C2622I;
import p139d.p225c.p226a.p227a.p270n.C2644u;

/* renamed from: d.c.a.a.o.a.b */
/* loaded from: classes.dex */
public class C2653b extends AbstractC2190c {

    /* renamed from: j */
    private final C2677t f11013j;

    /* renamed from: k */
    private final C2196f f11014k;

    /* renamed from: l */
    private final C2644u f11015l;

    /* renamed from: m */
    private long f11016m;

    /* renamed from: n */
    private InterfaceC2652a f11017n;

    /* renamed from: o */
    private long f11018o;

    public C2653b() {
        super(5);
        this.f11013j = new C2677t();
        this.f11014k = new C2196f(1);
        this.f11015l = new C2644u();
    }

    /* renamed from: a */
    private float[] m11263a(ByteBuffer byteBuffer) {
        if (byteBuffer.remaining() != 16) {
            return null;
        }
        this.f11015l.m11213a(byteBuffer.array(), byteBuffer.limit());
        this.f11015l.m11222e(byteBuffer.arrayOffset() + 4);
        float[] fArr = new float[3];
        for (int i = 0; i < 3; i++) {
            fArr[i] = Float.intBitsToFloat(this.f11015l.m11229k());
        }
        return fArr;
    }

    /* renamed from: v */
    private void m11264v() {
        this.f11018o = 0L;
        InterfaceC2652a interfaceC2652a = this.f11017n;
        if (interfaceC2652a != null) {
            interfaceC2652a.m11261a();
        }
    }

    @Override // p139d.p225c.p226a.p227a.InterfaceC2144I
    /* renamed from: a */
    public int mo8576a(C2676s c2676s) {
        return "application/x-camera-motion".equals(c2676s.f11182g) ? 4 : 0;
    }

    @Override // p139d.p225c.p226a.p227a.AbstractC2190c, p139d.p225c.p226a.p227a.C2141F.b
    /* renamed from: a */
    public void mo8558a(int i, Object obj) {
        if (i == 7) {
            this.f11017n = (InterfaceC2652a) obj;
        } else {
            super.mo8558a(i, obj);
        }
    }

    @Override // p139d.p225c.p226a.p227a.InterfaceC2143H
    /* renamed from: a */
    public void mo8562a(long j, long j2) {
        float[] m11263a;
        while (!mo8569g() && this.f11018o < 100000 + j) {
            this.f11014k.mo9006b();
            if (m9000a(this.f11013j, this.f11014k, false) != -4 || this.f11014k.m9010d()) {
                return;
            }
            this.f11014k.m9027f();
            C2196f c2196f = this.f11014k;
            this.f11018o = c2196f.f8041d;
            if (this.f11017n != null && (m11263a = m11263a(c2196f.f8040c)) != null) {
                InterfaceC2652a interfaceC2652a = this.f11017n;
                C2622I.m11050a(interfaceC2652a);
                interfaceC2652a.m11262a(this.f11018o - this.f11016m, m11263a);
            }
        }
    }

    @Override // p139d.p225c.p226a.p227a.AbstractC2190c
    /* renamed from: a */
    protected void mo8779a(long j, boolean z) {
        m11264v();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p139d.p225c.p226a.p227a.AbstractC2190c
    /* renamed from: a */
    public void mo8785a(C2676s[] c2676sArr, long j) {
        this.f11016m = j;
    }

    @Override // p139d.p225c.p226a.p227a.InterfaceC2143H
    /* renamed from: c */
    public boolean mo8565c() {
        return true;
    }

    @Override // p139d.p225c.p226a.p227a.InterfaceC2143H
    /* renamed from: d */
    public boolean mo8566d() {
        return mo8569g();
    }

    @Override // p139d.p225c.p226a.p227a.AbstractC2190c
    /* renamed from: s */
    protected void mo8791s() {
        m11264v();
    }
}
