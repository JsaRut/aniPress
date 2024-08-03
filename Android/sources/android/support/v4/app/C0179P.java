package android.support.v4.app;

import android.transition.Transition;
import android.view.View;
import java.util.ArrayList;

/* renamed from: android.support.v4.app.P */
/* loaded from: classes.dex */
class C0179P implements Transition.TransitionListener {

    /* renamed from: a */
    final /* synthetic */ Object f696a;

    /* renamed from: b */
    final /* synthetic */ ArrayList f697b;

    /* renamed from: c */
    final /* synthetic */ Object f698c;

    /* renamed from: d */
    final /* synthetic */ ArrayList f699d;

    /* renamed from: e */
    final /* synthetic */ Object f700e;

    /* renamed from: f */
    final /* synthetic */ ArrayList f701f;

    /* renamed from: g */
    final /* synthetic */ C0181S f702g;

    public C0179P(C0181S c0181s, Object obj, ArrayList arrayList, Object obj2, ArrayList arrayList2, Object obj3, ArrayList arrayList3) {
        this.f702g = c0181s;
        this.f696a = obj;
        this.f697b = arrayList;
        this.f698c = obj2;
        this.f699d = arrayList2;
        this.f700e = obj3;
        this.f701f = arrayList3;
    }

    @Override // android.transition.Transition.TransitionListener
    public void onTransitionCancel(Transition transition) {
    }

    @Override // android.transition.Transition.TransitionListener
    public void onTransitionEnd(Transition transition) {
    }

    @Override // android.transition.Transition.TransitionListener
    public void onTransitionPause(Transition transition) {
    }

    @Override // android.transition.Transition.TransitionListener
    public void onTransitionResume(Transition transition) {
    }

    @Override // android.transition.Transition.TransitionListener
    public void onTransitionStart(Transition transition) {
        Object obj = this.f696a;
        if (obj != null) {
            this.f702g.mo817a(obj, this.f697b, (ArrayList<View>) null);
        }
        Object obj2 = this.f698c;
        if (obj2 != null) {
            this.f702g.mo817a(obj2, this.f699d, (ArrayList<View>) null);
        }
        Object obj3 = this.f700e;
        if (obj3 != null) {
            this.f702g.mo817a(obj3, this.f701f, (ArrayList<View>) null);
        }
    }
}
