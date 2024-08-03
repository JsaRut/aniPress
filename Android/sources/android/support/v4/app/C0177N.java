package android.support.v4.app;

import android.graphics.Rect;
import android.transition.Transition;

/* renamed from: android.support.v4.app.N */
/* loaded from: classes.dex */
class C0177N extends Transition.EpicenterCallback {

    /* renamed from: a */
    final /* synthetic */ Rect f691a;

    /* renamed from: b */
    final /* synthetic */ C0181S f692b;

    public C0177N(C0181S c0181s, Rect rect) {
        this.f692b = c0181s;
        this.f691a = rect;
    }

    @Override // android.transition.Transition.EpicenterCallback
    public Rect onGetEpicenter(Transition transition) {
        return this.f691a;
    }
}
