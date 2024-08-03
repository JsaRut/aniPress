package p031c.p032a.p055V;

import android.content.Context;
import org.json.JSONObject;
import p031c.p032a.p033A.C0511f;
import p031c.p032a.p066j.C0675a;

/* renamed from: c.a.V.d */
/* loaded from: classes.dex */
public final class RunnableC0577d implements Runnable {

    /* renamed from: a */
    private Context f2768a;

    /* renamed from: b */
    private JSONObject f2769b;

    /* renamed from: c */
    final /* synthetic */ C0574a f2770c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC0577d(C0574a c0574a, Context context, JSONObject jSONObject) {
        this.f2770c = c0574a;
        this.f2768a = context;
        this.f2769b = jSONObject;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            long m2701d = C0511f.m2701d(this.f2768a, "JWakecmd");
            long currentTimeMillis = System.currentTimeMillis();
            if (this.f2769b == null && currentTimeMillis - m2701d < 3600000) {
                C0675a.m3475g("JWake", "is not cmd wake time");
                return;
            }
            C0574a.m2968a(this.f2770c, this.f2768a, this.f2769b);
        } catch (Throwable th) {
            C0675a.m3475g("JWake", "WakeAction failed:" + th.getMessage());
        }
    }
}
