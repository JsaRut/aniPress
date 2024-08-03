package p139d.p143b.p184i.p200n;

import android.net.Uri;
import p139d.p143b.p184i.p191e.C1877a;
import p139d.p143b.p184i.p196j.C1920d;

/* renamed from: d.b.i.n.B */
/* loaded from: classes.dex */
public class C1935B {

    /* renamed from: a */
    private final InterfaceC1995n<C1920d> f7103a;

    /* renamed from: b */
    private final InterfaceC1998oa f7104b;

    /* renamed from: c */
    private long f7105c = 0;

    /* renamed from: d */
    private int f7106d;

    /* renamed from: e */
    private C1877a f7107e;

    public C1935B(InterfaceC1995n<C1920d> interfaceC1995n, InterfaceC1998oa interfaceC1998oa) {
        this.f7103a = interfaceC1995n;
        this.f7104b = interfaceC1998oa;
    }

    /* renamed from: a */
    public InterfaceC1995n<C1920d> m7952a() {
        return this.f7103a;
    }

    /* renamed from: a */
    public void m7953a(int i) {
        this.f7106d = i;
    }

    /* renamed from: a */
    public void m7954a(long j) {
        this.f7105c = j;
    }

    /* renamed from: a */
    public void m7955a(C1877a c1877a) {
        this.f7107e = c1877a;
    }

    /* renamed from: b */
    public InterfaceC1998oa m7956b() {
        return this.f7104b;
    }

    /* renamed from: c */
    public String m7957c() {
        return this.f7104b.getId();
    }

    /* renamed from: d */
    public long m7958d() {
        return this.f7105c;
    }

    /* renamed from: e */
    public InterfaceC2002qa m7959e() {
        return this.f7104b.mo8111e();
    }

    /* renamed from: f */
    public int m7960f() {
        return this.f7106d;
    }

    /* renamed from: g */
    public C1877a m7961g() {
        return this.f7107e;
    }

    /* renamed from: h */
    public Uri m7962h() {
        return this.f7104b.mo8109c().m8249o();
    }
}
