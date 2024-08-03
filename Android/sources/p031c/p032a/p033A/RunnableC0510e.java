package p031c.p032a.p033A;

import android.content.Context;
import org.json.JSONObject;

/* renamed from: c.a.A.e */
/* loaded from: classes.dex */
public final class RunnableC0510e implements Runnable {

    /* renamed from: a */
    private Context f2580a;

    /* renamed from: b */
    private String f2581b;

    /* renamed from: c */
    private JSONObject f2582c;

    /* renamed from: d */
    final /* synthetic */ AbstractC0506a f2583d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC0510e(AbstractC0506a abstractC0506a, Context context, String str, JSONObject jSONObject) {
        this.f2583d = abstractC0506a;
        this.f2580a = context;
        this.f2581b = str;
        this.f2582c = jSONObject;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            AbstractC0506a.m2665a(this.f2583d, this.f2580a, this.f2581b, this.f2582c);
        } catch (Throwable unused) {
        }
    }
}
