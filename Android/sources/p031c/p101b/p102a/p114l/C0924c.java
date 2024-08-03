package p031c.p101b.p102a.p114l;

import android.content.Context;
import p031c.p032a.p092s.C0831g;

/* renamed from: c.b.a.l.c */
/* loaded from: classes.dex */
public class C0924c {

    /* renamed from: a */
    private static final Object f3933a = new Object();

    /* renamed from: b */
    private static volatile C0924c f3934b;

    /* renamed from: c */
    private AbstractC0927f f3935c;

    /* renamed from: c.b.a.l.c$a */
    /* loaded from: classes.dex */
    class a implements Runnable {

        /* renamed from: a */
        private Context f3936a;

        /* renamed from: b */
        private String f3937b;

        /* renamed from: c */
        private Object f3938c;

        public a(Context context, String str, Object obj) {
            this.f3936a = context;
            this.f3937b = str;
            this.f3938c = obj;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (C0924c.this.f3935c == null) {
                C0924c.this.f3935c = new C0928g();
            }
            C0924c.this.f3935c.mo4665a(this.f3936a, this.f3937b, this.f3938c);
        }
    }

    private C0924c() {
        C0831g.m4072a(null, "JPUSH", 13, "ActionHelper", null, new Object[0]);
    }

    /* renamed from: a */
    public static C0924c m4655a() {
        if (f3934b == null) {
            synchronized (f3933a) {
                if (f3934b == null) {
                    f3934b = new C0924c();
                }
            }
        }
        return f3934b;
    }

    /* renamed from: a */
    public void m4658a(Context context, String str, Object obj) {
        C0923b.m4644b("ActionHelper", "doAction:" + str);
        C0831g.m4072a(context, "JPUSH", 11, "ActionHelper", null, new a(context, str, obj));
    }
}
