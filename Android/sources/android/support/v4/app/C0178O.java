package android.support.v4.app;

import android.transition.Transition;
import android.view.View;
import java.util.ArrayList;

/* renamed from: android.support.v4.app.O */
/* loaded from: classes.dex */
class C0178O implements Transition.TransitionListener {

    /* renamed from: a */
    final /* synthetic */ View f693a;

    /* renamed from: b */
    final /* synthetic */ ArrayList f694b;

    /* renamed from: c */
    final /* synthetic */ C0181S f695c;

    public C0178O(C0181S c0181s, View view, ArrayList arrayList) {
        this.f695c = c0181s;
        this.f693a = view;
        this.f694b = arrayList;
    }

    @Override // android.transition.Transition.TransitionListener
    public void onTransitionCancel(Transition transition) {
    }

    @Override // android.transition.Transition.TransitionListener
    public void onTransitionEnd(Transition transition) {
        transition.removeListener(this);
        this.f693a.setVisibility(8);
        int size = this.f694b.size();
        for (int i = 0; i < size; i++) {
            ((View) this.f694b.get(i)).setVisibility(0);
        }
    }

    @Override // android.transition.Transition.TransitionListener
    public void onTransitionPause(Transition transition) {
    }

    @Override // android.transition.Transition.TransitionListener
    public void onTransitionResume(Transition transition) {
    }

    @Override // android.transition.Transition.TransitionListener
    public void onTransitionStart(Transition transition) {
    }
}
