package p031c.p032a.p072p.p073a.p089h;

import android.app.Activity;
import android.view.View;
import org.json.JSONObject;

/* renamed from: c.a.p.a.h.f */
/* loaded from: classes.dex */
public final class RunnableC0795f implements Runnable {

    /* renamed from: a */
    final /* synthetic */ JSONObject f3469a;

    /* renamed from: b */
    final /* synthetic */ View f3470b;

    /* renamed from: c */
    final /* synthetic */ Activity f3471c;

    public RunnableC0795f(JSONObject jSONObject, View view, Activity activity) {
        this.f3469a = jSONObject;
        this.f3470b = view;
        this.f3471c = activity;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f3470b.post(new RunnableC0796g(this, this.f3469a.toString()));
    }
}
