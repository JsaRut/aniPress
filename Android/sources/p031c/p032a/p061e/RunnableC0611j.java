package p031c.p032a.p061e;

import android.content.Context;
import android.text.TextUtils;
import java.util.Iterator;
import java.util.LinkedHashSet;
import p031c.p032a.p060d.C0601d;
import p031c.p032a.p091r.C0812a;

/* renamed from: c.a.e.j */
/* loaded from: classes.dex */
final class RunnableC0611j implements Runnable {

    /* renamed from: a */
    private final Context f2878a;

    private RunnableC0611j(Context context) {
        this.f2878a = context;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ RunnableC0611j(Context context, byte b2) {
        this(context);
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            String m3112a = C0610i.m3112a(this.f2878a);
            LinkedHashSet m3116b = C0610i.m3116b(this.f2878a);
            m3116b.addAll(C0610i.m3113a());
            C0601d.m3072b("ReportSis", "sis urls=" + m3116b.toString() + " post json=" + m3112a);
            if (!C0812a.m3947c(this.f2878a)) {
                C0601d.m3077f("ReportSis", "give up sis, because network is not connected");
                return;
            }
            Iterator it = m3116b.iterator();
            while (it.hasNext()) {
                String str = (String) it.next();
                if (!TextUtils.isEmpty(str) && C0610i.m3115a(this.f2878a, str, m3112a)) {
                    return;
                }
            }
        } catch (Throwable unused) {
        }
    }
}
