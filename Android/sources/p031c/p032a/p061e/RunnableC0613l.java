package p031c.p032a.p061e;

import android.content.Context;
import java.util.Set;
import org.json.JSONArray;
import p031c.p032a.p060d.C0601d;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: c.a.e.l */
/* loaded from: classes.dex */
public final class RunnableC0613l implements Runnable {

    /* renamed from: a */
    final /* synthetic */ Object f2883a;

    /* renamed from: b */
    final /* synthetic */ Context f2884b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC0613l(Object obj, Context context) {
        this.f2883a = obj;
        this.f2884b = context;
    }

    @Override // java.lang.Runnable
    public final void run() {
        JSONArray m3143c;
        Set m3142c;
        try {
            m3143c = C0612k.m3143c(this.f2883a);
            if (m3143c != null) {
                m3142c = C0612k.m3142c(m3143c);
                C0612k.m3136a(this.f2884b, m3143c, m3142c);
            } else {
                C0601d.m3072b("ReportUtils", "data" + this.f2883a + " is empty");
            }
        } catch (Throwable unused) {
        }
    }
}
