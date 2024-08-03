package p139d.p143b.p184i.p190d;

import android.net.Uri;
import p139d.p143b.p145b.p146a.C1653i;
import p139d.p143b.p145b.p146a.InterfaceC1648d;
import p139d.p143b.p184i.p201o.C2023c;
import p139d.p143b.p184i.p201o.InterfaceC2025e;

/* renamed from: d.b.i.d.s */
/* loaded from: classes.dex */
public class C1869s implements InterfaceC1863m {

    /* renamed from: a */
    private static C1869s f6839a;

    protected C1869s() {
    }

    /* renamed from: a */
    public static synchronized C1869s m7638a() {
        C1869s c1869s;
        synchronized (C1869s.class) {
            if (f6839a == null) {
                f6839a = new C1869s();
            }
            c1869s = f6839a;
        }
        return c1869s;
    }

    /* renamed from: a */
    protected Uri m7639a(Uri uri) {
        return uri;
    }

    @Override // p139d.p143b.p184i.p190d.InterfaceC1863m
    /* renamed from: a */
    public InterfaceC1648d mo7600a(C2023c c2023c, Uri uri, Object obj) {
        m7639a(uri);
        return new C1653i(uri.toString());
    }

    @Override // p139d.p143b.p184i.p190d.InterfaceC1863m
    /* renamed from: a */
    public InterfaceC1648d mo7601a(C2023c c2023c, Object obj) {
        Uri m8249o = c2023c.m8249o();
        m7639a(m8249o);
        return new C1855e(m8249o.toString(), c2023c.m8246l(), c2023c.m8247m(), c2023c.m8237c(), null, null, obj);
    }

    @Override // p139d.p143b.p184i.p190d.InterfaceC1863m
    /* renamed from: b */
    public InterfaceC1648d mo7602b(C2023c c2023c, Object obj) {
        InterfaceC1648d interfaceC1648d;
        String str;
        InterfaceC2025e m8240f = c2023c.m8240f();
        if (m8240f != null) {
            InterfaceC1648d mo5999a = m8240f.mo5999a();
            str = m8240f.getClass().getName();
            interfaceC1648d = mo5999a;
        } else {
            interfaceC1648d = null;
            str = null;
        }
        Uri m8249o = c2023c.m8249o();
        m7639a(m8249o);
        return new C1855e(m8249o.toString(), c2023c.m8246l(), c2023c.m8247m(), c2023c.m8237c(), interfaceC1648d, str, obj);
    }

    @Override // p139d.p143b.p184i.p190d.InterfaceC1863m
    /* renamed from: c */
    public InterfaceC1648d mo7603c(C2023c c2023c, Object obj) {
        return mo7600a(c2023c, c2023c.m8249o(), obj);
    }
}
