package p139d.p143b.p148c.p149a;

/* renamed from: d.b.c.a.c */
/* loaded from: classes.dex */
public class C1672c implements InterfaceC1671b {

    /* renamed from: a */
    private static C1672c f6202a;

    private C1672c() {
    }

    /* renamed from: a */
    public static synchronized C1672c m6935a() {
        C1672c c1672c;
        synchronized (C1672c.class) {
            if (f6202a == null) {
                f6202a = new C1672c();
            }
            c1672c = f6202a;
        }
        return c1672c;
    }

    @Override // p139d.p143b.p148c.p149a.InterfaceC1671b
    /* renamed from: a */
    public void mo6934a(InterfaceC1670a interfaceC1670a) {
    }
}
