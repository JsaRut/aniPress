package p031c.p032a.p061e;

import android.content.Context;
import java.io.File;
import java.util.concurrent.atomic.AtomicBoolean;
import p031c.p032a.p060d.C0601d;
import p031c.p032a.p096v.C0849e;
import p031c.p032a.p096v.C0850f;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: c.a.e.f */
/* loaded from: classes.dex */
public final class RunnableC0607f implements Runnable {

    /* renamed from: a */
    final /* synthetic */ Context f2872a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC0607f(Context context) {
        this.f2872a = context;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // java.lang.Runnable
    public final void run() {
        AtomicBoolean atomicBoolean;
        AtomicBoolean atomicBoolean2;
        String m3110e;
        try {
            try {
                atomicBoolean2 = C0605d.f2871d;
                atomicBoolean2.set(true);
                m3110e = C0605d.m3110e(this.f2872a);
                File[] m4139a = C0849e.m4139a(m3110e, C0850f.f3599b);
                if (m4139a != null) {
                    for (File file : m4139a) {
                        C0605d.m3098a(this.f2872a, file);
                    }
                } else {
                    C0601d.m3072b("ReportHistory", "no history, no report");
                }
            } catch (Throwable th) {
                C0601d.m3079h("ReportHistory", "run upload exception=" + th);
            }
        } finally {
            atomicBoolean = C0605d.f2871d;
            atomicBoolean.set(false);
        }
    }
}
