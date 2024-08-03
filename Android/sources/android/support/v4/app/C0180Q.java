package android.support.v4.app;

import android.graphics.Rect;
import android.transition.Transition;

/* renamed from: android.support.v4.app.Q */
/* loaded from: classes.dex */
class C0180Q extends Transition.EpicenterCallback {

    /* renamed from: a */
    final /* synthetic */ Rect f703a;

    /* renamed from: b */
    final /* synthetic */ C0181S f704b;

    public C0180Q(C0181S c0181s, Rect rect) {
        this.f704b = c0181s;
        this.f703a = rect;
    }

    @Override // android.transition.Transition.EpicenterCallback
    public Rect onGetEpicenter(Transition transition) {
        Rect rect = this.f703a;
        if (rect == null || rect.isEmpty()) {
            return null;
        }
        return this.f703a;
    }
}
