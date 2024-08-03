package p031c.p032a.p061e;

import android.content.Context;
import java.io.File;
import java.util.Set;
import org.json.JSONObject;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: c.a.e.m */
/* loaded from: classes.dex */
public final class RunnableC0614m implements Runnable {

    /* renamed from: a */
    final /* synthetic */ Context f2885a;

    /* renamed from: b */
    final /* synthetic */ Set f2886b;

    /* renamed from: c */
    final /* synthetic */ JSONObject f2887c;

    /* renamed from: d */
    final /* synthetic */ File f2888d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC0614m(Context context, Set set, JSONObject jSONObject, File file) {
        this.f2885a = context;
        this.f2886b = set;
        this.f2887c = jSONObject;
        this.f2888d = file;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            C0612k.m3120a(this.f2885a, this.f2886b, this.f2887c, this.f2888d, null);
        } catch (Throwable unused) {
        }
    }
}
