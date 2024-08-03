package p031c.p032a.p063g;

import android.content.Context;
import android.os.SystemClock;
import android.text.TextUtils;
import java.net.Inet4Address;
import java.net.InetAddress;
import java.util.concurrent.Callable;
import p031c.p032a.p048P.p049a.C0557c;
import p031c.p032a.p062f.C0616a;
import p031c.p032a.p062f.C0617b;
import p031c.p032a.p062f.C0618c;
import p031c.p032a.p065i.C0663f;
import p031c.p032a.p066j.C0675a;
import p031c.p032a.p071o.AbstractC0688a;
import p031c.p032a.p071o.C0689b;
import p031c.p032a.p091r.C0819h;
import p031c.p032a.p091r.C0822k;

/* renamed from: c.a.g.b */
/* loaded from: classes.dex */
public final class CallableC0620b implements Callable<AbstractC0688a> {

    /* renamed from: a */
    private final C0630l f2909a;

    /* renamed from: b */
    private final C0636r f2910b;

    /* renamed from: c */
    private final C0625g f2911c;

    /* renamed from: d */
    private final RunnableC0627i f2912d;

    public CallableC0620b(C0630l c0630l, C0636r c0636r, C0625g c0625g, RunnableC0627i runnableC0627i) {
        this.f2910b = c0636r;
        this.f2909a = c0630l;
        this.f2911c = c0625g;
        this.f2912d = runnableC0627i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // java.util.concurrent.Callable
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public AbstractC0688a call() {
        boolean z;
        try {
            if (this.f2911c != null) {
                C0626h m3213a = this.f2911c.m3213a(this.f2909a.m3242a());
                if (this.f2910b.m3265a()) {
                    return null;
                }
                if (this.f2912d != null && !this.f2912d.f2926b) {
                    if (m3213a == null) {
                        return null;
                    }
                    if (!TextUtils.isEmpty(C0616a.f2901k)) {
                        m3213a.f2922a = C0616a.f2901k;
                        m3213a.f2924c = InetAddress.getByName(C0616a.f2901k);
                    }
                    if (C0616a.f2902l > 0) {
                        m3213a.f2923b = C0616a.f2902l;
                    }
                    C0675a.m3471d("ConnTask", "Open connection with ip=" + m3213a.f2924c + ", port:" + m3213a.f2923b);
                    long uptimeMillis = SystemClock.uptimeMillis();
                    C0689b c0689b = new C0689b(8128, 20);
                    int mo3554a = c0689b.mo3554a(m3213a.f2922a, m3213a.f2923b);
                    if (this.f2910b.m3265a()) {
                        C0822k.m4013a(c0689b);
                        return null;
                    }
                    if (this.f2912d.f2926b) {
                        this.f2910b.m3263a(new C0663f(-991, null));
                        C0822k.m4013a(c0689b);
                        return null;
                    }
                    if (mo3554a != 0) {
                        long uptimeMillis2 = SystemClock.uptimeMillis() - uptimeMillis;
                        this.f2909a.m3244a(2, m3213a.f2922a, m3213a.f2923b, C0557c.m2916j(this.f2909a.f2939c), uptimeMillis2, mo3554a);
                        C0675a.m3473e("ConnTask", "Failed(" + mo3554a + ") to open connection - ip:" + m3213a.f2924c + ", port:" + m3213a.f2923b + ", cost:" + uptimeMillis2);
                        C0623e.m3210a(this.f2909a.f2939c, m3213a, -1, uptimeMillis2);
                        C0822k.m4013a(c0689b);
                        return null;
                    }
                    if (!(m3213a.f2924c instanceof Inet4Address) && !C0819h.m3996f(m3213a.f2922a)) {
                        z = false;
                        Context context = this.f2909a.f2939c;
                        C0617b<String> m3158b = C0617b.m3158b(z);
                        m3158b.m3188a((C0617b<String>) m3213a.toString());
                        C0618c.m3193a(context, (C0617b<?>[]) new C0617b[]{m3158b});
                        C0675a.m3474f("ConnTask", "Succeed to open connection - ip:" + m3213a.f2924c + ", port:" + m3213a.f2923b);
                        this.f2910b.m3263a(c0689b);
                        C0623e.m3210a(this.f2909a.f2939c, m3213a, 1, 0L);
                        return c0689b;
                    }
                    z = true;
                    Context context2 = this.f2909a.f2939c;
                    C0617b<String> m3158b2 = C0617b.m3158b(z);
                    m3158b2.m3188a((C0617b<String>) m3213a.toString());
                    C0618c.m3193a(context2, (C0617b<?>[]) new C0617b[]{m3158b2});
                    C0675a.m3474f("ConnTask", "Succeed to open connection - ip:" + m3213a.f2924c + ", port:" + m3213a.f2923b);
                    this.f2910b.m3263a(c0689b);
                    C0623e.m3210a(this.f2909a.f2939c, m3213a, 1, 0L);
                    return c0689b;
                }
                this.f2910b.m3263a(new C0663f(-991, null));
                return null;
            }
        } catch (Throwable th) {
            C0675a.m3475g("ConnTask", "run e:" + th);
        }
        return null;
    }
}
