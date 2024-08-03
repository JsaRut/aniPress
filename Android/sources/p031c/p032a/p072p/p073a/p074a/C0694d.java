package p031c.p032a.p072p.p073a.p074a;

import android.content.Context;
import android.os.SystemClock;
import org.json.JSONArray;
import p031c.p032a.p072p.p073a.p075b.AbstractC0716h;
import p031c.p032a.p072p.p073a.p075b.C0712d;
import p031c.p032a.p072p.p073a.p077c.C0723b;
import p031c.p032a.p072p.p073a.p080f.p081a.C0732b;
import p031c.p032a.p072p.p073a.p080f.p082b.C0734a;
import p031c.p032a.p092s.C0830f;

/* renamed from: c.a.p.a.a.d */
/* loaded from: classes.dex */
public final class C0694d extends AbstractC0692b {

    /* renamed from: a */
    private static C0694d f3196a;

    /* renamed from: b */
    private Context f3197b;

    private C0694d() {
    }

    /* renamed from: b */
    public static C0694d m3569b() {
        if (f3196a == null) {
            f3196a = new C0694d();
        }
        return f3196a;
    }

    @Override // p031c.p032a.p072p.p073a.p074a.AbstractC0692b
    /* renamed from: a */
    public final Object mo3566a() {
        C0734a.m3728a(this.f3197b);
        JSONArray m3565a = AbstractC0692b.m3565a(C0734a.m3736c(this.f3197b, "keyevent"));
        C0734a.m3728a(this.f3197b);
        C0734a.m3735b(this.f3197b, "keyevent");
        return m3565a;
    }

    /* renamed from: a */
    public final void m3570a(Context context) {
        this.f3197b = context.getApplicationContext();
        C0705o.m3605b().m3608a(this);
    }

    /* renamed from: a */
    public final void m3571a(Context context, AbstractC0716h abstractC0716h) {
        if (context == null) {
            C0732b.m3723f("EventManager", "onEvent context is null");
            return;
        }
        this.f3197b = context.getApplicationContext();
        C0723b c0723b = new C0723b();
        if (abstractC0716h instanceof C0712d) {
            c0723b.m3662a(1);
        }
        abstractC0716h.m3638a(C0830f.m4065c());
        c0723b.m3663a(abstractC0716h);
        C0830f.m4059a("ANALYTICS", new RunnableC0695e(this, c0723b, SystemClock.uptimeMillis()), new int[0]);
    }
}
