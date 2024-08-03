package p139d.p143b.p184i.p202p;

/* renamed from: d.b.i.p.c */
/* loaded from: classes.dex */
public class C2030c {

    /* renamed from: a */
    public static final a f7401a = new b();

    /* renamed from: b */
    private static volatile c f7402b = null;

    /* renamed from: d.b.i.p.c$a */
    /* loaded from: classes.dex */
    public interface a {
    }

    /* renamed from: d.b.i.p.c$b */
    /* loaded from: classes.dex */
    private static final class b implements a {
        private b() {
        }
    }

    /* renamed from: d.b.i.p.c$c */
    /* loaded from: classes.dex */
    public interface c {
        /* renamed from: a */
        void mo8287a();

        /* renamed from: a */
        void mo8288a(String str);
    }

    private C2030c() {
    }

    /* renamed from: a */
    public static void m8289a() {
        m8291b().mo8287a();
    }

    /* renamed from: a */
    public static void m8290a(String str) {
        m8291b().mo8288a(str);
    }

    /* renamed from: b */
    private static c m8291b() {
        if (f7402b == null) {
            synchronized (C2030c.class) {
                if (f7402b == null) {
                    f7402b = new C2028a();
                }
            }
        }
        return f7402b;
    }
}
