package android.support.v4.app;

import android.graphics.Rect;
import android.transition.Transition;
import android.transition.TransitionManager;
import android.transition.TransitionSet;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: android.support.v4.app.S */
/* loaded from: classes.dex */
public class C0181S extends AbstractC0185W {
    /* renamed from: a */
    private static boolean m809a(Transition transition) {
        return (AbstractC0185W.m828a((List) transition.getTargetIds()) && AbstractC0185W.m828a((List) transition.getTargetNames()) && AbstractC0185W.m828a((List) transition.getTargetTypes())) ? false : true;
    }

    @Override // android.support.v4.app.AbstractC0185W
    /* renamed from: a */
    public Object mo810a(Object obj, Object obj2, Object obj3) {
        Transition transition = (Transition) obj;
        Transition transition2 = (Transition) obj2;
        Transition transition3 = (Transition) obj3;
        if (transition != null && transition2 != null) {
            transition = new TransitionSet().addTransition(transition).addTransition(transition2).setOrdering(1);
        } else if (transition == null) {
            transition = transition2 != null ? transition2 : null;
        }
        if (transition3 == null) {
            return transition;
        }
        TransitionSet transitionSet = new TransitionSet();
        if (transition != null) {
            transitionSet.addTransition(transition);
        }
        transitionSet.addTransition(transition3);
        return transitionSet;
    }

    @Override // android.support.v4.app.AbstractC0185W
    /* renamed from: a */
    public void mo811a(ViewGroup viewGroup, Object obj) {
        TransitionManager.beginDelayedTransition(viewGroup, (Transition) obj);
    }

    @Override // android.support.v4.app.AbstractC0185W
    /* renamed from: a */
    public void mo812a(Object obj, Rect rect) {
        if (obj != null) {
            ((Transition) obj).setEpicenterCallback(new C0180Q(this, rect));
        }
    }

    @Override // android.support.v4.app.AbstractC0185W
    /* renamed from: a */
    public void mo813a(Object obj, View view) {
        if (obj != null) {
            ((Transition) obj).addTarget(view);
        }
    }

    @Override // android.support.v4.app.AbstractC0185W
    /* renamed from: a */
    public void mo814a(Object obj, View view, ArrayList<View> arrayList) {
        ((Transition) obj).addListener(new C0178O(this, view, arrayList));
    }

    @Override // android.support.v4.app.AbstractC0185W
    /* renamed from: a */
    public void mo815a(Object obj, Object obj2, ArrayList<View> arrayList, Object obj3, ArrayList<View> arrayList2, Object obj4, ArrayList<View> arrayList3) {
        ((Transition) obj).addListener(new C0179P(this, obj2, arrayList, obj3, arrayList2, obj4, arrayList3));
    }

    @Override // android.support.v4.app.AbstractC0185W
    /* renamed from: a */
    public void mo816a(Object obj, ArrayList<View> arrayList) {
        Transition transition = (Transition) obj;
        if (transition == null) {
            return;
        }
        int i = 0;
        if (transition instanceof TransitionSet) {
            TransitionSet transitionSet = (TransitionSet) transition;
            int transitionCount = transitionSet.getTransitionCount();
            while (i < transitionCount) {
                mo816a(transitionSet.getTransitionAt(i), arrayList);
                i++;
            }
            return;
        }
        if (m809a(transition) || !AbstractC0185W.m828a((List) transition.getTargets())) {
            return;
        }
        int size = arrayList.size();
        while (i < size) {
            transition.addTarget(arrayList.get(i));
            i++;
        }
    }

    @Override // android.support.v4.app.AbstractC0185W
    /* renamed from: a */
    public void mo817a(Object obj, ArrayList<View> arrayList, ArrayList<View> arrayList2) {
        List<View> targets;
        Transition transition = (Transition) obj;
        int i = 0;
        if (transition instanceof TransitionSet) {
            TransitionSet transitionSet = (TransitionSet) transition;
            int transitionCount = transitionSet.getTransitionCount();
            while (i < transitionCount) {
                mo817a((Object) transitionSet.getTransitionAt(i), arrayList, arrayList2);
                i++;
            }
            return;
        }
        if (m809a(transition) || (targets = transition.getTargets()) == null || targets.size() != arrayList.size() || !targets.containsAll(arrayList)) {
            return;
        }
        int size = arrayList2 == null ? 0 : arrayList2.size();
        while (i < size) {
            transition.addTarget(arrayList2.get(i));
            i++;
        }
        for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
            transition.removeTarget(arrayList.get(size2));
        }
    }

    @Override // android.support.v4.app.AbstractC0185W
    /* renamed from: a */
    public boolean mo818a(Object obj) {
        return obj instanceof Transition;
    }

    @Override // android.support.v4.app.AbstractC0185W
    /* renamed from: b */
    public Object mo819b(Object obj) {
        if (obj != null) {
            return ((Transition) obj).clone();
        }
        return null;
    }

    @Override // android.support.v4.app.AbstractC0185W
    /* renamed from: b */
    public Object mo820b(Object obj, Object obj2, Object obj3) {
        TransitionSet transitionSet = new TransitionSet();
        if (obj != null) {
            transitionSet.addTransition((Transition) obj);
        }
        if (obj2 != null) {
            transitionSet.addTransition((Transition) obj2);
        }
        if (obj3 != null) {
            transitionSet.addTransition((Transition) obj3);
        }
        return transitionSet;
    }

    @Override // android.support.v4.app.AbstractC0185W
    /* renamed from: b */
    public void mo821b(Object obj, View view) {
        if (obj != null) {
            ((Transition) obj).removeTarget(view);
        }
    }

    @Override // android.support.v4.app.AbstractC0185W
    /* renamed from: b */
    public void mo822b(Object obj, View view, ArrayList<View> arrayList) {
        TransitionSet transitionSet = (TransitionSet) obj;
        List<View> targets = transitionSet.getTargets();
        targets.clear();
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            AbstractC0185W.m827a(targets, arrayList.get(i));
        }
        targets.add(view);
        arrayList.add(view);
        mo816a(transitionSet, arrayList);
    }

    @Override // android.support.v4.app.AbstractC0185W
    /* renamed from: b */
    public void mo823b(Object obj, ArrayList<View> arrayList, ArrayList<View> arrayList2) {
        TransitionSet transitionSet = (TransitionSet) obj;
        if (transitionSet != null) {
            transitionSet.getTargets().clear();
            transitionSet.getTargets().addAll(arrayList2);
            mo817a((Object) transitionSet, arrayList, arrayList2);
        }
    }

    @Override // android.support.v4.app.AbstractC0185W
    /* renamed from: c */
    public Object mo824c(Object obj) {
        if (obj == null) {
            return null;
        }
        TransitionSet transitionSet = new TransitionSet();
        transitionSet.addTransition((Transition) obj);
        return transitionSet;
    }

    @Override // android.support.v4.app.AbstractC0185W
    /* renamed from: c */
    public void mo825c(Object obj, View view) {
        if (view != null) {
            Rect rect = new Rect();
            m831a(view, rect);
            ((Transition) obj).setEpicenterCallback(new C0177N(this, rect));
        }
    }
}
