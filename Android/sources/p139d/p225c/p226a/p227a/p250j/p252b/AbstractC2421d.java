package p139d.p225c.p226a.p227a.p250j.p252b;

import android.net.Uri;
import java.util.List;
import java.util.Map;
import p139d.p225c.p226a.p227a.C2676s;
import p139d.p225c.p226a.p227a.p269m.C2585D;
import p139d.p225c.p226a.p227a.p269m.C2600n;
import p139d.p225c.p226a.p227a.p269m.C2612z;
import p139d.p225c.p226a.p227a.p269m.InterfaceC2597k;
import p139d.p225c.p226a.p227a.p270n.C2628e;

/* renamed from: d.c.a.a.j.b.d */
/* loaded from: classes.dex */
public abstract class AbstractC2421d implements C2612z.d {

    /* renamed from: a */
    public final C2600n f9511a;

    /* renamed from: b */
    public final int f9512b;

    /* renamed from: c */
    public final C2676s f9513c;

    /* renamed from: d */
    public final int f9514d;

    /* renamed from: e */
    public final Object f9515e;

    /* renamed from: f */
    public final long f9516f;

    /* renamed from: g */
    public final long f9517g;

    /* renamed from: h */
    protected final C2585D f9518h;

    public AbstractC2421d(InterfaceC2597k interfaceC2597k, C2600n c2600n, int i, C2676s c2676s, int i2, Object obj, long j, long j2) {
        this.f9518h = new C2585D(interfaceC2597k);
        C2628e.m11110a(c2600n);
        this.f9511a = c2600n;
        this.f9512b = i;
        this.f9513c = c2676s;
        this.f9514d = i2;
        this.f9515e = obj;
        this.f9516f = j;
        this.f9517g = j2;
    }

    /* renamed from: c */
    public final long m9992c() {
        return this.f9518h.m10901b();
    }

    /* renamed from: d */
    public final long m9993d() {
        return this.f9517g - this.f9516f;
    }

    /* renamed from: e */
    public final Map<String, List<String>> m9994e() {
        return this.f9518h.m10903d();
    }

    /* renamed from: f */
    public final Uri m9995f() {
        return this.f9518h.m10902c();
    }
}
